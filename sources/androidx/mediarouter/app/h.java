package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import c2.a1;
import com.google.firebase.messaging.FirebaseMessaging;
import fh.o1;
import h3.m2;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fk;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h() {
        this.a = 2;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((com.google.firebase.messaging.v) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((i) this.b).dismiss();
                    return;
                }
                return;
            case 1:
                ((a1) this.b).c();
                return;
            case 2:
                com.google.firebase.messaging.v vVar = (com.google.firebase.messaging.v) this.b;
                if (vVar != null && vVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.v vVar2 = (com.google.firebase.messaging.v) this.b;
                    ((FirebaseMessaging) vVar2.d).getClass();
                    FirebaseMessaging.b(vVar2, 0L);
                    ((FirebaseMessaging) ((com.google.firebase.messaging.v) this.b).d).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
            case 3:
                d5.w wVar = (d5.w) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i9 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i9 = type != 9 ? 8 : 7;
                                        }
                                        i9 = 5;
                                    }
                                }
                                i9 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i9 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i9 = 4;
                                    break;
                                case 13:
                                    i9 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i9 = 6;
                                    break;
                                case 18:
                                    i9 = 2;
                                    break;
                                case 20:
                                    if (d5.f0.a >= 29) {
                                        i9 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i9 = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (d5.f0.a < 31 || i9 != 5) {
                    d5.w.a(wVar, i9);
                    return;
                } else {
                    d5.v.a(context, wVar);
                    return;
                }
            case 4:
                ((f2.x) this.b).k();
                return;
            case 5:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused2) {
                    return;
                }
            case 6:
                m2 m2Var = (m2) this.b;
                m2Var.b.post(new o1(m2Var, 25));
                return;
            case 7:
                fg fgVar = new fg(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((fk) this.b).r.postDelayed(fgVar, 1000L);
                    return;
                } else {
                    fgVar.run();
                    return;
                }
            default:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((xe.b) this.b).c.get(stringExtra);
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }
}
