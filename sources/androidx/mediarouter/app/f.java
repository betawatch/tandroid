package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.z5;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vf;
import org.telegram.ui.pp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
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
                ((g.p) this.b).k();
                return;
            case 2:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    return;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 3:
                ((Executor) ((g2.x) this.b).c).execute(new g2.c(2, this, context));
                return;
            case 4:
                m2.e eVar = (m2.e) this.b;
                if (isInitialStickyBroadcast()) {
                    return;
                }
                eVar.b(m2.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                return;
            case 5:
                o4.b bVar = (o4.b) this.b;
                bVar.c.execute(new o4.a(bVar, 2));
                return;
            case 6:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((p4.f) ((p4.u) ((o4.o0) this.b).n.b).a).a.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 7:
                ((z5) this.b).g();
                return;
            case 8:
                if (r2.a) {
                    a8.b("file system changed");
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 11);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    org.telegram.messenger.g0.i3(aVar, 1000L);
                    return;
                } else {
                    aVar.run();
                    return;
                }
            case 9:
                t0.d.post(new org.telegram.messenger.a(this, 13));
                return;
            case 10:
                vf vfVar = new vf(this, 23);
                if ("android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ((uj) this.b).r.postDelayed(vfVar, 1000L);
                    return;
                } else {
                    vfVar.run();
                    return;
                }
            case 11:
                org.telegram.messenger.g0.h3(new pp(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", 20));
                return;
            case 12:
                ((ne.h) this.b).o();
                return;
            default:
                if ("PIP_CUSTOM_EVENT".equals(intent.getAction())) {
                    String stringExtra = intent.getStringExtra("source_id");
                    intent.getIntExtra("action_id", -1);
                    ArrayList arrayList = (ArrayList) ((uf.b) this.b).c.get(stringExtra);
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        throw a1.g.m(it);
                    }
                    return;
                }
                return;
        }
    }
}
