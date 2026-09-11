package e0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class m0 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public m0(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(l0 l0Var) {
        boolean z10;
        ArrayDeque arrayDeque = l0Var.d;
        ComponentName componentName = l0Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (l0Var.b) {
            z10 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            l0Var.b = bindService;
            if (bindService) {
                l0Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z10 = l0Var.b;
        }
        if (!z10 || l0Var.c == null) {
            b(l0Var);
            return;
        }
        while (true) {
            j0 j0Var = (j0) arrayDeque.peek();
            if (j0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + j0Var);
                }
                j0Var.a(l0Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e7) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e7);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(l0Var);
    }

    public final void b(l0 l0Var) {
        ComponentName componentName = l0Var.a;
        ArrayDeque arrayDeque = l0Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = l0Var.e;
        int i11 = i10 + 1;
        l0Var.e = i11;
        if (i11 <= 6) {
            int i12 = (1 << i10) * MediaDataController.MAX_STYLE_RUNS_COUNT;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + l0Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        b.c cVar = null;
        if (i10 == 0) {
            j0 j0Var = (j0) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (n0.c) {
                if (string != null) {
                    try {
                        if (!string.equals(n0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            n0.e = hashSet2;
                            n0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = n0.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.c.put(componentName2, new l0(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        l0 l0Var = (l0) entry.getValue();
                        if (l0Var.b) {
                            this.a.unbindService(this);
                            l0Var.b = false;
                        }
                        l0Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (l0 l0Var2 : this.c.values()) {
                l0Var2.d.add(j0Var);
                a(l0Var2);
            }
        } else if (i10 == 1) {
            k0 k0Var = (k0) message.obj;
            ComponentName componentName3 = k0Var.a;
            IBinder iBinder = k0Var.b;
            l0 l0Var3 = (l0) this.c.get(componentName3);
            if (l0Var3 != null) {
                int i11 = b.b.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(b.c.g);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof b.c)) {
                        b.a aVar = new b.a();
                        aVar.a = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (b.c) queryLocalInterface;
                    }
                }
                l0Var3.c = cVar;
                l0Var3.e = 0;
                a(l0Var3);
                return true;
            }
        } else if (i10 == 2) {
            l0 l0Var4 = (l0) this.c.get((ComponentName) message.obj);
            if (l0Var4 != null) {
                if (l0Var4.b) {
                    this.a.unbindService(this);
                    l0Var4.b = false;
                }
                l0Var4.c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            l0 l0Var5 = (l0) this.c.get((ComponentName) message.obj);
            if (l0Var5 != null) {
                a(l0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.b.obtainMessage(1, new k0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
