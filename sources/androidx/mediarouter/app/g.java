package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import com.google.firebase.messaging.FirebaseMessaging;
import di.b7;
import di.g7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import ji.u4;
import org.telegram.ui.Components.ok;
import org.telegram.ui.Components.pg;
import p4.s0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        ((FirebaseMessaging) ((com.google.firebase.messaging.u) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
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
                com.google.firebase.messaging.u uVar = (com.google.firebase.messaging.u) this.b;
                if (uVar != null && uVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.u uVar2 = (com.google.firebase.messaging.u) this.b;
                    ((FirebaseMessaging) uVar2.d).getClass();
                    FirebaseMessaging.b(uVar2, 0L);
                    ((FirebaseMessaging) ((com.google.firebase.messaging.u) this.b).d).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
            case 2:
                ((Executor) ((e2.u) this.b).c).execute(new b7(19, this, context));
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
                g7 g7Var = (g7) this.b;
                g7Var.a(k2.b.b(context, intent, (b2.e) g7Var.j, (u4) g7Var.i));
                return;
            case 6:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((n4.j) ((k2.g0) ((m4.k0) this.b).k.c).b).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 7:
                pg pgVar = new pg(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((ok) this.b).r.postDelayed(pgVar, 1000L);
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
                    ArrayList arrayList = (ArrayList) ((qf.c) this.b).c.get(stringExtra);
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

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
