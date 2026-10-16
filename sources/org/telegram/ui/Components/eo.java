package org.telegram.ui.Components;

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
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.kc1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class eo implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public Object c;

    public /* synthetic */ eo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        s4.b1 T;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                io ioVar = ((go) obj).d;
                co coVar = (co) this.c;
                if (coVar.getTag() == null) {
                    s4.b1 K = ioVar.s.K(ioVar.p0);
                    if (K != null && ioVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, coVar.getEditField().getPaint().getFontMetricsInt(), false);
                        ioVar.x.setDirection(1);
                        ioVar.x.setDelegate(coVar);
                        ioVar.x.setTranslationY(K.a.getY());
                        ioVar.x.e();
                    }
                    ioVar.P = editable;
                    if (K != null) {
                        io.O(ioVar, K.a, ioVar.p0);
                    }
                    ioVar.W();
                    break;
                }
                break;
            case 1:
                io ioVar2 = ((go) obj).d;
                kc1 kc1Var = ioVar2.s;
                fo foVar = (fo) this.c;
                View F = kc1Var.F(foVar);
                T = F != null ? kc1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i11 = b10 - ioVar2.t0;
                    if (i11 >= 0 && i11 < ioVar2.K.length) {
                        if (ioVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, foVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                ioVar2.x.setDirection(0);
                                ioVar2.x.setTranslationY(y3);
                            } else {
                                ioVar2.x.setDirection(1);
                                ioVar2.x.setTranslationY(view.getY());
                            }
                            ioVar2.x.setDelegate(foVar);
                            ioVar2.x.e();
                        }
                        ioVar2.K[i11] = editable;
                        io.O(ioVar2, foVar, b10);
                        ioVar2.W();
                        break;
                    }
                }
                break;
            case 2:
                break;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.x == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.c).get()) {
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
            case 4:
                org.telegram.ui.fw0 fw0Var = ((org.telegram.ui.dw0) obj).d;
                org.telegram.ui.aw0 aw0Var = (org.telegram.ui.aw0) this.c;
                if (aw0Var.getTag() == null) {
                    s4.b1 K2 = fw0Var.c.K(fw0Var.i0);
                    if (K2 != null && fw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, aw0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fw0Var.Q.setDirection(1);
                        fw0Var.Q.setDelegate(aw0Var);
                        fw0Var.Q.setTranslationY(K2.a.getY());
                        fw0Var.Q.e();
                    }
                    fw0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.fw0.c0(fw0Var, K2.a, fw0Var.i0);
                    }
                    fw0Var.i0();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.fw0 fw0Var2 = ((org.telegram.ui.dw0) obj).d;
                org.telegram.ui.bw0 bw0Var = (org.telegram.ui.bw0) this.c;
                if (bw0Var.getTag() == null) {
                    s4.b1 K3 = fw0Var2.c.K(fw0Var2.i0);
                    if (K3 != null && fw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, bw0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fw0Var2.Q.setDirection(1);
                        fw0Var2.Q.setDelegate(bw0Var);
                        fw0Var2.Q.setTranslationY(K3.a.getY());
                        fw0Var2.Q.e();
                    }
                    fw0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.fw0.c0(fw0Var2, K3.a, fw0Var2.j0);
                    }
                    fw0Var2.i0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.fw0 fw0Var3 = ((org.telegram.ui.dw0) obj).d;
                kc1 kc1Var2 = fw0Var3.c;
                org.telegram.ui.cw0 cw0Var = (org.telegram.ui.cw0) this.c;
                View F2 = kc1Var2.F(cw0Var);
                T = F2 != null ? kc1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - fw0Var3.n0;
                    if (b11 >= 0 && b11 < fw0Var3.v.length) {
                        if (fw0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, cw0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                fw0Var3.Q.setDirection(0);
                                fw0Var3.Q.setTranslationY(y10);
                            } else {
                                fw0Var3.Q.setDirection(1);
                                fw0Var3.Q.setTranslationY(view2.getY());
                            }
                            fw0Var3.Q.setDelegate(cw0Var);
                            fw0Var3.Q.e();
                        }
                        fw0Var3.v[b11] = editable;
                        org.telegram.ui.fw0.c0(fw0Var3, cw0Var, b11);
                        fw0Var3.i0();
                        break;
                    }
                }
                break;
            case 7:
                qg.v vVar = (qg.v) obj;
                qg.x xVar = vVar.f;
                if (!vVar.e && ((String) this.c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.c).toString(), editable.toString())) {
                    int b12 = w7.r.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    int argb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(xVar.f), b12, Color.green(xVar.f), Color.blue(xVar.f)) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), Color.green(xVar.f), b12) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), b12, Color.blue(xVar.f));
                    int i13 = qg.x.s;
                    xVar.n(argb, 5);
                    break;
                }
                break;
            case 8:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.f3) obj).W2.N(true);
                break;
            case 9:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.d3) obj).W2.N(true);
                break;
            case 10:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.e3) obj).W2.N(true);
                break;
            case 11:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.a4) obj).W2.N(true);
                break;
            case 12:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.b4) obj).W2.N(true);
                break;
            default:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.c4) obj).W2.N(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                EditText editText = (EditText) this.c;
                editText.post(new org.telegram.ui.br(this, editText, (AtomicReference) this.b, 25));
                break;
            case 7:
                this.c = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public /* synthetic */ eo(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public eo(qg.v vVar) {
        this.a = 7;
        this.b = vVar;
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
