package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import ci.e7;
import ci.y8;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pk;
import p4.s0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g() {
        this.a = 1;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((com.google.firebase.messaging.v) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.a) {
            case 0:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((h) this.b).dismiss();
                    return;
                }
                return;
            case 1:
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
            case 2:
                ((Executor) ((e2.u) this.b).c).execute(new y8(13, this, context));
                return;
            case 3:
                ((g.p) this.b).k();
                return;
            case 4:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 5:
                if (isInitialStickyBroadcast()) {
                    return;
                }
                e7 e7Var = (e7) this.b;
                e7Var.a(k2.b.b(context, intent, (b2.e) e7Var.j, (a6.m) e7Var.i));
                return;
            case 6:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((n4.j) ((k2.u) ((m4.k0) this.b).k.c).b).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 7:
                pg pgVar = new pg(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((pk) this.b).r.postDelayed(pgVar, 1000L);
                    return;
                } else {
                    pgVar.run();
                    return;
                }
            case 8:
                ((s0) this.b).c();
                return;
            default:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((pf.c) this.b).c.get(stringExtra);
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        throw a4.a.k(it);
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
