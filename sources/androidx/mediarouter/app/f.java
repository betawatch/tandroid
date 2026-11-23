package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.view.KeyEvent;
import fi.l4;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.s2;
import org.telegram.messenger.t0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.ng;
import org.telegram.ui.up;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class f extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.a) {
            case 0:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((g) this.b).dismiss();
                    break;
                }
                break;
            case 1:
                ((g.p) this.b).k();
                break;
            case 2:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    break;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            case 3:
                ((Executor) ((h2.w) this.b).c).execute(new l4(25, this, context));
                break;
            case 4:
                n2.e eVar = (n2.e) this.b;
                if (!isInitialStickyBroadcast()) {
                    eVar.b(n2.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                    break;
                }
                break;
            case 5:
                ((a6) this.b).g();
                break;
            case 6:
                if (s2.a) {
                    a8.b("file system changed");
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 12);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    aVar.run();
                    break;
                } else {
                    org.telegram.messenger.g0.h3(aVar, 1000L);
                    break;
                }
            case 7:
                t0.d.post(new org.telegram.messenger.a(this, 14));
                break;
            case 8:
                ng ngVar = new ng(this, 25);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ngVar.run();
                    break;
                } else {
                    ((kk) this.b).r.postDelayed(ngVar, 1000L);
                    break;
                }
            case 9:
                org.telegram.messenger.g0.g3(new up(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", 20));
                break;
            case 10:
                p4.b bVar = (p4.b) this.b;
                bVar.c.execute(new p4.a(bVar, 2));
                break;
            case 11:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((q4.f) ((q4.u) ((p4.n0) this.b).n.c).a).a.dispatchMediaButtonEvent(keyEvent);
                    break;
                }
                break;
            case 12:
                ((qe.h) this.b).o();
                break;
            default:
                if ("org.telegram.utils.pip.ACTION".equals(intent.getAction())) {
                    wi.p pVar = (wi.p) this.b;
                    wi.n nVar = pVar.f;
                    if (nVar == null) {
                        nVar = pVar.e;
                    }
                    if (nVar != null) {
                        nVar.a.D2(intent.getIntExtra("action_id", -1));
                        break;
                    }
                }
                break;
        }
    }
}
