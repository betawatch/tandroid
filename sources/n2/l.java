package n2;

import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.View;
import e9.i0;
import og.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.hs;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements m, d9.e, g2.g, k0, c2, dw0, Utilities.Callback2Return, gh.i, il0, qv0, rv0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 g(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // og.k0
    public Typeface a() {
        switch (this.a) {
            case 5:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM);
            case 6:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM_ITALIC);
            case 7:
                return Typeface.create("serif", 1);
            case 8:
                return AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf");
            case 9:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO);
            default:
                return AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_MERRIWEATHER_BOLD);
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return i0.v(e9.q.w(qVar.Y.b, new u2.c(2)));
    }

    @Override // org.telegram.ui.Components.rv0
    public void b(Object obj, float f7) {
        hs hsVar = (hs) obj;
        switch (this.a) {
            case 23:
                hsVar.b = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 24:
            case 26:
            default:
                hsVar.e = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 25:
                hsVar.c = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 27:
                hsVar.d = f7;
                if (hsVar.getParent() != null) {
                    ((View) hsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // gh.i
    public void e(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void f(d2 d2Var, int i10) {
        switch (this.a) {
            case 12:
                d2Var.dismiss();
                break;
            case 17:
                d2Var.dismiss();
                break;
            default:
                d2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public float get(Object obj) {
        hs hsVar = (hs) obj;
        switch (this.a) {
            case 22:
                return hsVar.b;
            case 23:
            case 25:
            default:
                return hsVar.e;
            case 24:
                return hsVar.c;
            case 26:
                return hsVar.d;
        }
    }

    @Override // org.telegram.ui.Components.dw0
    public void h(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 15:
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

    @Override // org.telegram.ui.Components.dw0
    public /* synthetic */ void l() {
    }

    @Override // n2.m
    public void release() {
    }
}
