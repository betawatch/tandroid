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
import di.b4;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nk;
import org.telegram.ui.Components.pg;
import org.telegram.ui.nq;
import p4.s0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((FirebaseMessaging) ((com.google.firebase.messaging.s) this.b).d).b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
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
                com.google.firebase.messaging.s sVar = (com.google.firebase.messaging.s) this.b;
                if (sVar != null && sVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) this.b;
                    ((FirebaseMessaging) sVar2.d).getClass();
                    FirebaseMessaging.b(sVar2, 0L);
                    ((FirebaseMessaging) ((com.google.firebase.messaging.s) this.b).d).b.unregisterReceiver(this);
                    this.b = null;
                    return;
                }
                return;
            case 2:
                ((Executor) ((e2.w) this.b).c).execute(new b4(27, this, context));
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
                k2.f fVar = (k2.f) this.b;
                if (isInitialStickyBroadcast()) {
                    return;
                }
                fVar.b(k2.b.b(context, intent, fVar.j, fVar.i, fVar.a()));
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
                pg pgVar = new pg(this, 23);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((nk) this.b).r.postDelayed(pgVar, 1000L);
                    return;
                } else {
                    pgVar.run();
                    return;
                }
            case 9:
                AndroidUtilities.runOnUIThread(new nq(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", 20));
                return;
            case 10:
                ((s0) this.b).c();
                return;
            default:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((sf.b) this.b).c.get(stringExtra);
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

    public /* synthetic */ g(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
