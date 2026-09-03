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
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hk;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class h extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h() {
        this.a = 3;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((com.google.firebase.messaging.t) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
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
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((bf.c) this.b).c.get(stringExtra);
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
            case 2:
                ((a1) this.b).d();
                return;
            case 3:
                com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.b;
                if (tVar != null && tVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) this.b;
                    ((FirebaseMessaging) tVar2.d).getClass();
                    FirebaseMessaging.b(tVar2, 0L);
                    ((FirebaseMessaging) ((com.google.firebase.messaging.t) this.b).d).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
            case 4:
                ((f2.v) this.b).k();
                return;
            case 5:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 6:
                h5.u uVar = (h5.u) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                int i10 = 0;
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            i10 = type != 9 ? 8 : 7;
                                        }
                                        i10 = 5;
                                    }
                                }
                                i10 = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
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
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    i10 = 2;
                                    break;
                                case 20:
                                    if (h5.d0.a >= 29) {
                                        i10 = 9;
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            i10 = 1;
                        }
                    } catch (SecurityException unused2) {
                    }
                }
                if (h5.d0.a < 31 || i10 != 5) {
                    h5.u.b(uVar, i10);
                    return;
                } else {
                    h5.t.a(context, uVar);
                    return;
                }
            case 7:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                a1.a((a1) this.b, l3.g.b(context, intent));
                return;
            default:
                fg fgVar = new fg(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((hk) this.b).r.postDelayed(fgVar, 1000L);
                    return;
                } else {
                    fgVar.run();
                    return;
                }
        }
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
