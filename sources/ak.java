// default package

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.media.AudioDeviceInfo;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ak extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent a;
        byte b = 11;
        byte b2 = 2;
        switch (this.a) {
            case 0:
                bk bkVar = (bk) this.b;
                bkVar.c.execute(new zj(bkVar, (byte) 2));
                break;
            case 1:
                ((zo) this.b).k();
                break;
            case 2:
                vz vzVar = (vz) this.b;
                if (!isInitialStickyBroadcast()) {
                    vzVar.k(sz.b(context, intent, (oz) vzVar.w, (AudioDeviceInfo) vzVar.s, vzVar.j()));
                    break;
                }
                break;
            case 3:
                go1 go1Var = new go1(this, (byte) 21);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    go1Var.run();
                    break;
                } else {
                    ((u32) this.b).r.postDelayed(go1Var, 1000L);
                    break;
                }
            case 4:
                ((lq3) this.b).g();
                break;
            case 5:
                if (f11.a) {
                    cc4.b("file system changed");
                }
                ea5 ea5Var = new ea5(this, b);
                if (!"android.intent.action.MEDIA_UNMOUNTED".equals(intent.getAction())) {
                    ea5Var.run();
                    break;
                } else {
                    hl.d3(ea5Var, 1000L);
                    break;
                }
            case 6:
                hl.c3(new ls5(this, intent.getStringExtra("mode") != null ? intent.getStringExtra("mode") : "toggle", intent.getStringExtra("style") != null ? intent.getStringExtra("style") : "reveal", b));
                break;
            case 7:
                a.d.post(new z96(this, b2));
                break;
            case 8:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((ou6) this.b).dismiss();
                    break;
                }
                break;
            case 9:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (a = rhe.a(intent)) != null) {
                    ((xo6) ((kj4) ((qy6) this.b).p.c).b).a.dispatchMediaButtonEvent(a);
                    break;
                }
                break;
            case 10:
                ((Executor) ((yv2) this.b).b).execute(new t87(this, context, (byte) 27));
                break;
            case 11:
                ((ye3) this.b).c();
                break;
            case 12:
                try {
                    ((IntentSender) this.b).sendIntent(context, 0, null, null, null);
                    break;
                } catch (IntentSender.SendIntentException unused) {
                    return;
                }
            default:
                if ("org.telegram.utils.pip.ACTION".equals(intent.getAction())) {
                    ygb ygbVar = (ygb) this.b;
                    me8 me8Var = ygbVar.f;
                    if (me8Var == null) {
                        me8Var = ygbVar.e;
                    }
                    if (me8Var != null) {
                        me8Var.a.G0(intent.getIntExtra("action_id", -1));
                        break;
                    }
                }
                break;
        }
    }
}
