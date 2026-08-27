package gh;

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
import org.telegram.ui.Components.en;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.in;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.lq;
import org.telegram.ui.ta1;
import org.telegram.ui.tu0;
import org.telegram.ui.uu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wu0;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n4 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f2.o1 T;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((String[]) this.b)[0] = editable.toString();
                ((u4) obj).U2.N(true);
                break;
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((s4) obj).U2.N(true);
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((t4) obj).U2.N(true);
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((r5) obj).U2.N(true);
                break;
            case 4:
                ((String[]) this.b)[0] = editable.toString();
                ((s5) obj).U2.N(true);
                break;
            case 5:
                ((String[]) this.b)[0] = editable.toString();
                ((t5) obj).U2.N(true);
                break;
            case 6:
                in inVar = ((gn) obj).d;
                en enVar = (en) this.b;
                if (enVar.getTag() == null) {
                    f2.o1 K = inVar.s.K(inVar.l0);
                    if (K != null && inVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, enVar.getEditField().getPaint().getFontMetricsInt(), false);
                        inVar.x.setDirection(1);
                        inVar.x.setDelegate(enVar);
                        inVar.x.setTranslationY(K.a.getY());
                        inVar.x.e();
                    }
                    inVar.L = editable;
                    if (K != null) {
                        in.L(inVar, K.a, inVar.l0);
                    }
                    inVar.T();
                    break;
                }
                break;
            case 7:
                in inVar2 = ((gn) obj).d;
                ta1 ta1Var = inVar2.s;
                fn fnVar = (fn) this.b;
                View F = ta1Var.F(fnVar);
                T = F != null ? ta1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i11 = b10 - inVar2.p0;
                    if (i11 >= 0 && i11 < inVar2.G.length) {
                        if (inVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, fnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                inVar2.x.setDirection(0);
                                inVar2.x.setTranslationY(y10);
                            } else {
                                inVar2.x.setDirection(1);
                                inVar2.x.setTranslationY(view.getY());
                            }
                            inVar2.x.setDelegate(fnVar);
                            inVar2.x.e();
                        }
                        inVar2.G[i11] = editable;
                        in.L(inVar2, fnVar, b10);
                        inVar2.T();
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
                yu0 yu0Var = ((wu0) obj).d;
                tu0 tu0Var = (tu0) this.b;
                if (tu0Var.getTag() == null) {
                    f2.o1 K2 = yu0Var.c.K(yu0Var.e0);
                    if (K2 != null && yu0Var.M != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, tu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        yu0Var.M.setDirection(1);
                        yu0Var.M.setDelegate(tu0Var);
                        yu0Var.M.setTranslationY(K2.a.getY());
                        yu0Var.M.e();
                    }
                    yu0Var.A = editable;
                    if (K2 != null) {
                        yu0.c0(yu0Var, K2.a, yu0Var.e0);
                    }
                    yu0Var.i0();
                    break;
                }
                break;
            case 11:
                yu0 yu0Var2 = ((wu0) obj).d;
                uu0 uu0Var = (uu0) this.b;
                if (uu0Var.getTag() == null) {
                    f2.o1 K3 = yu0Var2.c.K(yu0Var2.e0);
                    if (K3 != null && yu0Var2.M != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, uu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        yu0Var2.M.setDirection(1);
                        yu0Var2.M.setDelegate(uu0Var);
                        yu0Var2.M.setTranslationY(K3.a.getY());
                        yu0Var2.M.e();
                    }
                    yu0Var2.B = editable;
                    if (K3 != null) {
                        yu0.c0(yu0Var2, K3.a, yu0Var2.f0);
                    }
                    yu0Var2.i0();
                    break;
                }
                break;
            case 12:
                yu0 yu0Var3 = ((wu0) obj).d;
                ta1 ta1Var2 = yu0Var3.c;
                vu0 vu0Var = (vu0) this.b;
                View F2 = ta1Var2.F(vu0Var);
                T = F2 != null ? ta1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - yu0Var3.j0;
                    if (b11 >= 0 && b11 < yu0Var3.v.length) {
                        if (yu0Var3.M != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, vu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                yu0Var3.M.setDirection(0);
                                yu0Var3.M.setTranslationY(y11);
                            } else {
                                yu0Var3.M.setDirection(1);
                                yu0Var3.M.setTranslationY(view2.getY());
                            }
                            yu0Var3.M.setDelegate(vu0Var);
                            yu0Var3.M.e();
                        }
                        yu0Var3.v[b11] = editable;
                        yu0.c0(yu0Var3, vu0Var, b11);
                        yu0Var3.i0();
                        break;
                    }
                }
                break;
            default:
                yf.v vVar = (yf.v) obj;
                yf.x xVar = vVar.f;
                if (!vVar.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b12 = h7.n.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    int argb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(xVar.f), b12, Color.green(xVar.f), Color.blue(xVar.f)) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), Color.green(xVar.f), b12) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), b12, Color.blue(xVar.f));
                    int i13 = yf.x.s;
                    xVar.m(argb, 5);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
                editText.post(new lq(this, editText, (AtomicReference) this.c, 25));
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
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public /* synthetic */ n4(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public n4(yf.v vVar) {
        this.a = 13;
        this.c = vVar;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void e(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void f(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void g(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void h(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void i(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void j(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void k(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void l(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void m(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void n(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void o(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void p(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void q(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void r(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void s(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void t(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void u(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void v(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void w(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void x(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void y(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void z(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
