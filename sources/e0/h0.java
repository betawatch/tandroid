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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h0 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public h0(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(g0 g0Var) {
        boolean z9;
        ArrayDeque arrayDeque = g0Var.d;
        ComponentName componentName = g0Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (g0Var.b) {
            z9 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            g0Var.b = bindService;
            if (bindService) {
                g0Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z9 = g0Var.b;
        }
        if (!z9 || g0Var.c == null) {
            b(g0Var);
            return;
        }
        while (true) {
            e0 e0Var = (e0) arrayDeque.peek();
            if (e0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + e0Var);
                }
                e0Var.a(g0Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e10) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(g0Var);
    }

    public final void b(g0 g0Var) {
        ComponentName componentName = g0Var.a;
        ArrayDeque arrayDeque = g0Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = g0Var.e;
        int i10 = i7 + 1;
        g0Var.e = i10;
        if (i10 <= 6) {
            int i11 = (1 << i7) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + g0Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        b.c cVar = null;
        if (i7 == 0) {
            e0 e0Var = (e0) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (i0.c) {
                if (string != null) {
                    try {
                        if (!string.equals(i0.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            i0.e = hashSet2;
                            i0.d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = i0.e;
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
                        this.c.put(componentName2, new g0(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        g0 g0Var = (g0) entry.getValue();
                        if (g0Var.b) {
                            this.a.unbindService(this);
                            g0Var.b = false;
                        }
                        g0Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (g0 g0Var2 : this.c.values()) {
                g0Var2.d.add(e0Var);
                a(g0Var2);
            }
        } else if (i7 == 1) {
            f0 f0Var = (f0) message.obj;
            ComponentName componentName3 = f0Var.a;
            IBinder iBinder = f0Var.b;
            g0 g0Var3 = (g0) this.c.get(componentName3);
            if (g0Var3 != null) {
                int i10 = b.b.a;
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
                g0Var3.c = cVar;
                g0Var3.e = 0;
                a(g0Var3);
                return true;
            }
        } else if (i7 == 2) {
            g0 g0Var4 = (g0) this.c.get((ComponentName) message.obj);
            if (g0Var4 != null) {
                if (g0Var4.b) {
                    this.a.unbindService(this);
                    g0Var4.b = false;
                }
                g0Var4.c = null;
                return true;
            }
        } else {
            if (i7 != 3) {
                return false;
            }
            g0 g0Var5 = (g0) this.c.get((ComponentName) message.obj);
            if (g0Var5 != null) {
                a(g0Var5);
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
        this.b.obtainMessage(1, new f0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
