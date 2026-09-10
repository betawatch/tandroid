package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import bi.af;
import bi.h8;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.tk;
import p4.s0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ((Executor) ((e2.u) this.b).c).execute(new af(22, this, context));
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
                h8 h8Var = (h8) this.b;
                h8Var.a(k2.b.b(context, intent, (b2.e) h8Var.j, (a6.i) h8Var.i));
                return;
            case 6:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((n4.j) ((l2.h) ((m4.l0) this.b).k.c).b).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 7:
                rg rgVar = new rg(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((tk) this.b).r.postDelayed(rgVar, 1000L);
                    return;
                } else {
                    rgVar.run();
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
