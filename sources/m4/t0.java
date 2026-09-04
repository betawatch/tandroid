package m4;

import android.graphics.RectF;
import android.view.ActionMode;
import android.view.View;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.gv0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.gs;
import v7.l8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements e1, n2.l, d9.e, a2, rv0, Utilities.Callback2Return, ih.i, yk0, fv0, gv0, LanguageDetector.ExceptionCallback {
    public final /* synthetic */ int a;

    public /* synthetic */ t0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ActionMode.Callback2 d(Object obj) {
        return (ActionMode.Callback2) obj;
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new t0.a(4)));
    }

    @Override // org.telegram.ui.Components.gv0
    public void b(Object obj, float f7) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 22:
                gsVar.b = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 23:
            case 25:
            default:
                gsVar.e = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 24:
                gsVar.c = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 26:
                gsVar.d = f7;
                if (gsVar.getParent() != null) {
                    ((View) gsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 11:
                b2Var.dismiss();
                break;
            case 16:
                b2Var.dismiss();
                break;
            default:
                b2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fv0
    public float get(Object obj) {
        gs gsVar = (gs) obj;
        switch (this.a) {
            case 21:
                return gsVar.b;
            case 22:
            case 24:
            default:
                return gsVar.e;
            case 23:
                return gsVar.c;
            case 25:
                return gsVar.d;
        }
    }

    @Override // m4.e1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 0:
                a0Var.getClass();
                throw new ClassCastException();
            case 1:
                a0Var.getClass();
                throw new ClassCastException();
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 3:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                ob.a aVar = a0Var.e;
                a0Var.s(rVar);
                aVar.getClass();
                return l8.b(new p1(-6));
        }
    }

    @Override // org.telegram.ui.Components.rv0
    public void i(int i10) {
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

    @Override // ih.i
    public void k(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        FileLog.e(exc);
    }

    public /* synthetic */ t0(Object obj, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (this.a) {
            case 14:
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

    public /* synthetic */ t0(String str, int i10, int i11, n nVar) {
        this.a = 0;
    }

    public /* synthetic */ t0(String str, n nVar, int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.rv0
    public /* synthetic */ void l() {
    }

    @Override // n2.l
    public void release() {
    }
}
