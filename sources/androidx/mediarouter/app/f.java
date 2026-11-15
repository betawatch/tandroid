package androidx.mediarouter.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.view.KeyEvent;
import fi.f6;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a8;
import org.telegram.messenger.r2;
import org.telegram.messenger.t0;
import org.telegram.messenger.z5;
import org.telegram.ui.Components.dg;
import org.telegram.ui.Components.dk;
import org.telegram.ui.tp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                ((Executor) ((h2.w) this.b).c).execute(new f6(21, this, context));
                break;
            case 4:
                n2.e eVar = (n2.e) this.b;
                if (!isInitialStickyBroadcast()) {
                    eVar.b(n2.b.b(context, intent, eVar.j, eVar.i, eVar.a()));
                    break;
                }
                break;
            case 5:
                ((z5) this.b).g();
                break;
            case 6:
                if (r2.a) {
                    a8.b("file system changed");
                }
                org.telegram.messenger.a aVar = new org.telegram.messenger.a(this, 12);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    aVar.run();
                    break;
                } else {
                    org.telegram.messenger.g0.i3(aVar, 1000L);
                    break;
                }
            case 7:
                t0.d.post(new org.telegram.messenger.a(this, 14));
                break;
            case 8:
                dg dgVar = new dg(this, 25);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    dgVar.run();
                    break;
                } else {
                    ((dk) this.b).r.postDelayed(dgVar, 1000L);
                    break;
                }
            case 9:
                org.telegram.messenger.g0.h3(new tp(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", 20));
                break;
            case 10:
                p4.b bVar = (p4.b) this.b;
                bVar.c.execute(new p4.a(bVar, 2));
                break;
            case 11:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((q4.f) ((q4.u) ((p4.m0) this.b).n.c).a).a.dispatchMediaButtonEvent(keyEvent);
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
                        nVar.a.u0(intent.getIntExtra("action_id", -1));
                        break;
                    }
                }
                break;
        }
    }
}
