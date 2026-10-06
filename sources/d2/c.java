package d2;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import ei.l3;
import ei.l4;
import ei.q4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.fw0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements d9.e, dh.d, dw0, ew0, GenericProvider {
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

    @Override // org.telegram.ui.Components.ew0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 18:
                l3 l3Var = (l3) obj;
                l3Var.b = f7;
                l3Var.e.invalidate();
                l3Var.W.setAlpha(f7);
                l3Var.E();
                l3Var.C();
                break;
            case 19:
            default:
                ((q4) obj).setSwipeOffsetY(f7);
                break;
            case 20:
                ((l4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public float get(Object obj) {
        switch (this.a) {
            case 17:
                return ((l3) obj).b;
            case 18:
            default:
                return ((q4) obj).getSwipeOffsetY();
            case 19:
                return ((l4) obj).c;
        }
    }

    @Override // dh.d
    public int h(d6 d6Var, boolean z10) {
        switch (this.a) {
            case 1:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, d6Var), i6.v0(i6.Sd, d6Var));
            case 2:
                if (!LiteMode.isEnabled(256)) {
                    return i6.w0(null, i6.G8, false);
                }
                return i6.l1(z10 ? 0.85f : 0.825f, i6.w0(null, i6.G8, false));
            case 3:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, d6Var), i6.v0(i6.Zk, d6Var));
            case 4:
                return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.Fi, d6Var));
            case 5:
                return 855638016;
            case 6:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.8f, i6.v0(i6.a7, d6Var), i6.v0(i6.d6, d6Var));
            case 7:
                return TLObject.FLAG_30;
            case 8:
                return i6.l1(0.075f, -16777216);
            case 9:
                return i6.l1(0.88f, i6.v0(i6.d6, d6Var));
            case 10:
                return i6.l1(z10 ? 0.85f : 0.825f, i6.w0(null, i6.G8, false));
            case 11:
                return eh.b.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, d6Var), i6.v0(i6.Yk, d6Var));
            case 12:
                return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, d6Var));
            case 13:
                return i6.l1(0.78f, i6.v0(i6.h5, d6Var));
            case 14:
                return i6.l1(0.7f, i6.v0(i6.d6, d6Var));
            case 15:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return i6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, i6.v0(i6.d6, d6Var));
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        fw0 fw0Var = q4.b0;
        return Boolean.FALSE;
    }
}
