package di;

import android.content.pm.ShortcutManager;
import android.window.OnBackInvokedDispatcher;
import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.hv0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class w9 implements Utilities.Callback2Return, eh.d, fv0, gv0, GenericProvider, q9.d {
    public final /* synthetic */ int a;

    public /* synthetic */ w9(int i10) {
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
    public Object D(cf.c cVar) {
        i5.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(cVar);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.ui.Components.gv0
    public void b(Object obj, float f7) {
        switch (this.a) {
            case 18:
                fi.k3 k3Var = (fi.k3) obj;
                k3Var.b = f7;
                k3Var.e.invalidate();
                k3Var.W.setAlpha(f7);
                k3Var.E();
                k3Var.C();
                break;
            case 19:
            default:
                ((fi.q4) obj).setSwipeOffsetY(f7);
                break;
            case 20:
                ((fi.l4) obj).setLoadProgress(f7);
                break;
        }
    }

    @Override // eh.d
    public int f(org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        switch (this.a) {
            case 2:
                return fh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, f6Var));
            case 3:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false);
                }
                return org.telegram.ui.ActionBar.j6.l1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
            case 4:
                return fh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Zk, f6Var));
            case 5:
                return org.telegram.ui.ActionBar.j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var));
            case 6:
                return 855638016;
            case 7:
                return TLObject.FLAG_30;
            case 8:
                return org.telegram.ui.ActionBar.j6.l1(0.075f, -16777216);
            case 9:
                return org.telegram.ui.ActionBar.j6.l1(0.88f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            case 10:
                return org.telegram.ui.ActionBar.j6.l1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G8, false));
            case 11:
                return fh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Yk, f6Var));
            case 12:
                return org.telegram.ui.ActionBar.j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            case 13:
                return org.telegram.ui.ActionBar.j6.l1(0.78f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
            case 14:
                return org.telegram.ui.ActionBar.j6.l1(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            case 15:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return org.telegram.ui.ActionBar.j6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        }
    }

    @Override // org.telegram.ui.Components.fv0
    public float get(Object obj) {
        switch (this.a) {
            case 17:
                return ((fi.k3) obj).b;
            case 18:
            default:
                return ((fi.q4) obj).getSwipeOffsetY();
            case 19:
                return ((fi.l4) obj).c;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        hv0 hv0Var = fi.q4.b0;
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
