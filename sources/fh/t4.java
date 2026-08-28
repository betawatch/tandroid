package fh;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.jq;
import org.telegram.ui.su0;
import org.telegram.ui.tu0;
import org.telegram.ui.uu0;
import org.telegram.ui.va1;
import org.telegram.ui.vu0;
import org.telegram.ui.xu0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t4 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t4(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f2.q1 T;
        int i9 = this.a;
        Object obj = this.c;
        switch (i9) {
            case 0:
                ((String[]) this.b)[0] = editable.toString();
                ((b5) obj).U2.N(true);
                break;
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((z4) obj).U2.N(true);
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((a5) obj).U2.N(true);
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((z5) obj).U2.N(true);
                break;
            case 4:
                ((String[]) this.b)[0] = editable.toString();
                ((a6) obj).U2.N(true);
                break;
            case 5:
                ((String[]) this.b)[0] = editable.toString();
                ((b6) obj).U2.N(true);
                break;
            case 6:
                jn jnVar = ((hn) obj).d;
                fn fnVar = (fn) this.b;
                if (fnVar.getTag() == null) {
                    f2.q1 K = jnVar.s.K(jnVar.l0);
                    if (K != null && jnVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, fnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        jnVar.x.setDirection(1);
                        jnVar.x.setDelegate(fnVar);
                        jnVar.x.setTranslationY(K.a.getY());
                        jnVar.x.e();
                    }
                    jnVar.L = editable;
                    if (K != null) {
                        jn.K(jnVar, K.a, jnVar.l0);
                    }
                    jnVar.S();
                    break;
                }
                break;
            case 7:
                jn jnVar2 = ((hn) obj).d;
                va1 va1Var = jnVar2.s;
                gn gnVar = (gn) this.b;
                View F = va1Var.F(gnVar);
                T = F != null ? va1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i10 = b10 - jnVar2.p0;
                    if (i10 >= 0 && i10 < jnVar2.G.length) {
                        if (jnVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, gnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                jnVar2.x.setDirection(0);
                                jnVar2.x.setTranslationY(y10);
                            } else {
                                jnVar2.x.setDirection(1);
                                jnVar2.x.setTranslationY(view.getY());
                            }
                            jnVar2.x.setDelegate(gnVar);
                            jnVar2.x.e();
                        }
                        jnVar2.G[i10] = editable;
                        jn.K(jnVar2, gnVar, b10);
                        jnVar2.S();
                        break;
                    }
                }
                break;
            case 8:
                break;
            case 9:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.x == 1 && passcodeActivity.A == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.b).get()) {
                            passcodeActivity.s.callOnClick();
                        }
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.s, false, 0.1f, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.s, true, 0.1f, true);
                        break;
                    }
                }
                break;
            case 10:
                xu0 xu0Var = ((vu0) obj).d;
                su0 su0Var = (su0) this.b;
                if (su0Var.getTag() == null) {
                    f2.q1 K2 = xu0Var.c.K(xu0Var.e0);
                    if (K2 != null && xu0Var.M != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, su0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        xu0Var.M.setDirection(1);
                        xu0Var.M.setDelegate(su0Var);
                        xu0Var.M.setTranslationY(K2.a.getY());
                        xu0Var.M.e();
                    }
                    xu0Var.A = editable;
                    if (K2 != null) {
                        xu0.b0(xu0Var, K2.a, xu0Var.e0);
                    }
                    xu0Var.h0();
                    break;
                }
                break;
            case 11:
                xu0 xu0Var2 = ((vu0) obj).d;
                tu0 tu0Var = (tu0) this.b;
                if (tu0Var.getTag() == null) {
                    f2.q1 K3 = xu0Var2.c.K(xu0Var2.e0);
                    if (K3 != null && xu0Var2.M != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, tu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        xu0Var2.M.setDirection(1);
                        xu0Var2.M.setDelegate(tu0Var);
                        xu0Var2.M.setTranslationY(K3.a.getY());
                        xu0Var2.M.e();
                    }
                    xu0Var2.B = editable;
                    if (K3 != null) {
                        xu0.b0(xu0Var2, K3.a, xu0Var2.f0);
                    }
                    xu0Var2.h0();
                    break;
                }
                break;
            case 12:
                xu0 xu0Var3 = ((vu0) obj).d;
                va1 va1Var2 = xu0Var3.c;
                uu0 uu0Var = (uu0) this.b;
                View F2 = va1Var2.F(uu0Var);
                T = F2 != null ? va1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - xu0Var3.j0;
                    if (b11 >= 0 && b11 < xu0Var3.v.length) {
                        if (xu0Var3.M != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, uu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                xu0Var3.M.setDirection(0);
                                xu0Var3.M.setTranslationY(y11);
                            } else {
                                xu0Var3.M.setDirection(1);
                                xu0Var3.M.setTranslationY(view2.getY());
                            }
                            xu0Var3.M.setDelegate(uu0Var);
                            xu0Var3.M.e();
                        }
                        xu0Var3.v[b11] = editable;
                        xu0.b0(xu0Var3, uu0Var, b11);
                        xu0Var3.h0();
                        break;
                    }
                }
                break;
            default:
                xf.v vVar = (xf.v) obj;
                xf.x xVar = vVar.f;
                if (!vVar.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b12 = g7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = vVar.d;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(xVar.f), b12, Color.green(xVar.f), Color.blue(xVar.f)) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), Color.green(xVar.f), b12) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), b12, Color.blue(xVar.f));
                    int i12 = xf.x.s;
                    xVar.m(argb, 5);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                break;
            case 8:
                EditText editText = (EditText) this.b;
                editText.post(new jq(this, editText, (AtomicReference) this.c, 25));
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                break;
            default:
                this.b = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.a;
    }

    public /* synthetic */ t4(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = obj2;
    }

    public t4(xf.v vVar) {
        this.a = 13;
        this.c = vVar;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
