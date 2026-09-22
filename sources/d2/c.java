package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
import ei.k3;
import ei.k4;
import ei.p4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.iv0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d9.e, dh.d, gv0, hv0, GenericProvider, q9.d {
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

    @Override // q9.d
    public Object G(cf.c cVar) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return Integer.valueOf(((b) obj).r);
    }

    @Override // org.telegram.ui.Components.hv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 17:
                k3 k3Var = (k3) obj;
                k3Var.b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.E();
                k3Var.C();
                break;
            case 18:
            default:
                ((p4) obj).setSwipeOffsetY(f7);
                break;
            case 19:
                ((k4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // dh.d
    public int g(e6 e6Var, boolean z10) {
        switch (this.a) {
            case 1:
                return eh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, e6Var), i6.v0(i6.Sd, e6Var));
            case 2:
                if (!LiteMode.isEnabled(256)) {
                    return i6.w0(null, i6.G8, false);
                }
                return i6.l1(z10 ? 0.85f : 0.825f, i6.w0(null, i6.G8, false));
            case 3:
                return eh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, e6Var), i6.v0(i6.Zk, e6Var));
            case 4:
                return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.Fi, e6Var));
            case 5:
                return 855638016;
            case 6:
                return TLObject.FLAG_30;
            case 7:
                return i6.l1(0.075f, -16777216);
            case 8:
                return i6.l1(0.88f, i6.v0(i6.d6, e6Var));
            case 9:
                return i6.l1(z10 ? 0.85f : 0.825f, i6.w0(null, i6.G8, false));
            case 10:
                return eh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, e6Var), i6.v0(i6.Yk, e6Var));
            case 11:
                return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, e6Var));
            case 12:
                return i6.l1(0.78f, i6.v0(i6.h5, e6Var));
            case 13:
                return i6.l1(0.7f, i6.v0(i6.d6, e6Var));
            case 14:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, e6Var));
        }
    }

    @Override // org.telegram.ui.Components.gv0
    public float get(Object obj) {
        switch (this.a) {
            case 16:
                return ((k3) obj).b;
            case 17:
            default:
                return ((p4) obj).getSwipeOffsetY();
            case 18:
                return ((k4) obj).c;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        iv0 iv0Var = p4.b0;
        return Boolean.FALSE;
    }
}
