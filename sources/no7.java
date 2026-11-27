// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class no7 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public no7(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(mo7 mo7Var) {
        boolean z;
        ArrayDeque arrayDeque = mo7Var.d;
        ComponentName componentName = mo7Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (mo7Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean bindService = context.bindService(component, this, 33);
            mo7Var.b = bindService;
            if (bindService) {
                mo7Var.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = mo7Var.b;
        }
        if (!z || mo7Var.c == null) {
            b(mo7Var);
            return;
        }
        while (true) {
            ko7 ko7Var = (ko7) arrayDeque.peek();
            if (ko7Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + ko7Var);
                }
                ko7Var.a(mo7Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(mo7Var);
    }

    public final void b(mo7 mo7Var) {
        ComponentName componentName = mo7Var.a;
        ArrayDeque arrayDeque = mo7Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = mo7Var.e;
        int i2 = i + 1;
        mo7Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + mo7Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        zk5 zk5Var = null;
        if (i == 0) {
            ko7 ko7Var = (ko7) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (oo7.c) {
                if (string != null) {
                    if (!string.equals(oo7.d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        oo7.e = hashSet2;
                        oo7.d = string;
                    }
                }
                hashSet = oo7.e;
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
                        this.c.put(componentName2, new mo7(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        mo7 mo7Var = (mo7) entry.getValue();
                        if (mo7Var.b) {
                            this.a.unbindService(this);
                            mo7Var.b = false;
                        }
                        mo7Var.c = null;
                        it2.remove();
                    }
                }
            }
            for (mo7 mo7Var2 : this.c.values()) {
                mo7Var2.d.add(ko7Var);
                a(mo7Var2);
            }
        } else if (i == 1) {
            lo7 lo7Var = (lo7) message.obj;
            ComponentName componentName3 = lo7Var.a;
            IBinder iBinder = lo7Var.b;
            mo7 mo7Var3 = (mo7) this.c.get(componentName3);
            if (mo7Var3 != null) {
                int i2 = yk5.a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(zk5.g);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof zk5)) {
                        xk5 xk5Var = new xk5();
                        xk5Var.a = iBinder;
                        zk5Var = xk5Var;
                    } else {
                        zk5Var = (zk5) queryLocalInterface;
                    }
                }
                mo7Var3.c = zk5Var;
                mo7Var3.e = 0;
                a(mo7Var3);
                return true;
            }
        } else if (i == 2) {
            mo7 mo7Var4 = (mo7) this.c.get((ComponentName) message.obj);
            if (mo7Var4 != null) {
                if (mo7Var4.b) {
                    this.a.unbindService(this);
                    mo7Var4.b = false;
                }
                mo7Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            mo7 mo7Var5 = (mo7) this.c.get((ComponentName) message.obj);
            if (mo7Var5 != null) {
                a(mo7Var5);
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
        this.b.obtainMessage(1, new lo7(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
