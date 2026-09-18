package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import ei.k3;
import ei.k4;
import ei.p4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d9.e, dh.d, hv0, iv0, GenericProvider {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager a(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher c(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return ShortcutManager.class;
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return Integer.valueOf(((b) obj).r);
    }

    @Override // org.telegram.ui.Components.iv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 18:
                k3 k3Var = (k3) obj;
                k3Var.b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.E();
                k3Var.C();
                break;
            case 19:
            default:
                ((p4) obj).setSwipeOffsetY(f7);
                break;
            case 20:
                ((k4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // dh.d
    public int g(f6 f6Var, boolean z10) {
        switch (this.a) {
            case 1:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Sd, f6Var));
            case 2:
                if (!LiteMode.isEnabled(256)) {
                    return j6.w0(null, j6.G8, false);
                }
                return j6.l1(z10 ? 0.85f : 0.825f, j6.w0(null, j6.G8, false));
            case 3:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Zk, f6Var));
            case 4:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.Fi, f6Var));
            case 5:
                return 855638016;
            case 6:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.8f, j6.v0(j6.a7, f6Var), j6.v0(j6.d6, f6Var));
            case 7:
                return TLObject.FLAG_30;
            case 8:
                return j6.l1(0.075f, -16777216);
            case 9:
                return j6.l1(0.88f, j6.v0(j6.d6, f6Var));
            case 10:
                return j6.l1(z10 ? 0.85f : 0.825f, j6.w0(null, j6.G8, false));
            case 11:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var), j6.v0(j6.Yk, f6Var));
            case 12:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
            case 13:
                return j6.l1(0.78f, j6.v0(j6.h5, f6Var));
            case 14:
                return j6.l1(0.7f, j6.v0(j6.d6, f6Var));
            case 15:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, j6.v0(j6.d6, f6Var));
        }
    }

    @Override // org.telegram.ui.Components.hv0
    public float get(Object obj) {
        switch (this.a) {
            case 17:
                return ((k3) obj).b;
            case 18:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 19:
                return ((k4) obj).c;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        jv0 jv0Var = p4.b0;
        return Boolean.FALSE;
    }
}
