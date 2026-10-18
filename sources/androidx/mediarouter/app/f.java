package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import ci.u7;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pg;
import p4.s0;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

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
                    ((g) this.b).dismiss();
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
                ((Executor) ((e2.w) this.b).c).execute(new u7(18, this, context));
                return;
            case 3:
                ((g.o) this.b).k();
                return;
            case 4:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 5:
                k2.e eVar = (k2.e) this.b;
                if (isInitialStickyBroadcast()) {
                    return;
                }
                eVar.b(k2.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                return;
            case 6:
                m4.b bVar = (m4.b) this.b;
                bVar.c.execute(new m4.a(bVar, 2));
                return;
            case 7:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((n4.f) ((n4.w) ((m4.p0) this.b).m.c).a).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 8:
                pg pgVar = new pg(this, 22);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((nk) this.b).r.postDelayed(pgVar, 1000L);
                    return;
                } else {
                    pgVar.run();
                    return;
                }
            case 9:
                ((s0) this.b).c();
                return;
            default:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((rf.b) this.b).c.get(stringExtra);
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        throw a1.g.j(it);
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
