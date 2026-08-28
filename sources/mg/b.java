package mg;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import mh.a4;
import mh.c3;
import mh.f4;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.vr;
import pg.g;
import t2.f;
import y8.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements lg.c, nu0, ou0, GenericProvider, d, b2, av0, Utilities.Callback2Return, g, lk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i9) {
        this.a = i9;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 d(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(bVar);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.ui.Components.ou0
    public void b(Object obj, float f10) {
        switch (this.a) {
            case 7:
                c3 c3Var = (c3) obj;
                c3Var.b = f10;
                c3Var.e.invalidate();
                c3Var.S.setAlpha(f10);
                c3Var.E();
                c3Var.C();
                break;
            case 9:
                ((a4) obj).setLoadProgress(f10);
                break;
            case 11:
                ((f4) obj).setSwipeOffsetY(f10);
                break;
            case 27:
                vr vrVar = (vr) obj;
                vrVar.b = f10;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                vr vrVar2 = (vr) obj;
                vrVar2.c = f10;
                if (vrVar2.getParent() != null) {
                    ((View) vrVar2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 16:
                c2Var.dismiss();
                break;
            case 21:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // lg.c
    public int g(b6 b6Var, boolean z10) {
        switch (this.a) {
            case 0:
                return c.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.d6, b6Var), f6.v0(f6.Yk, b6Var));
            case 1:
                return f6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.d6, b6Var));
            case 2:
                return f6.l1(0.78f, f6.v0(f6.h5, b6Var));
            case 3:
                return f6.l1(0.7f, f6.v0(f6.d6, b6Var));
            case 4:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return f6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, f6.v0(f6.d6, b6Var));
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public float get(Object obj) {
        switch (this.a) {
            case 6:
                return ((c3) obj).b;
            case 8:
                return ((a4) obj).c;
            case 10:
                return ((f4) obj).getSwipeOffsetY();
            case 26:
                return ((vr) obj).b;
            default:
                return ((vr) obj).c;
        }
    }

    @Override // org.telegram.ui.Components.av0
    public void h(int i9) {
        if (i9 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i9 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i9 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i9 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // pg.g
    public void i(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        pu0 pu0Var = f4.U;
        return Boolean.FALSE;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 19:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralString("MaximumReactionsValue", num2.intValue(), new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return LocaleController.formatPluralStringComma("Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.ui.Components.av0
    public /* synthetic */ void m() {
    }
}
