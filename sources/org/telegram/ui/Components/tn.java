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
import org.telegram.ui.xb1;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class tn implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public Object c;

    public /* synthetic */ tn(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        s4.c1 T;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                xn xnVar = ((vn) obj).d;
                sn snVar = (sn) this.c;
                if (snVar.getTag() == null) {
                    s4.c1 K = xnVar.s.K(xnVar.p0);
                    if (K != null && xnVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, snVar.getEditField().getPaint().getFontMetricsInt(), false);
                        xnVar.x.setDirection(1);
                        xnVar.x.setDelegate(snVar);
                        xnVar.x.setTranslationY(K.a.getY());
                        xnVar.x.e();
                    }
                    xnVar.P = editable;
                    if (K != null) {
                        xn.J(xnVar, K.a, xnVar.p0);
                    }
                    xnVar.R();
                    break;
                }
                break;
            case 1:
                xn xnVar2 = ((vn) obj).d;
                xb1 xb1Var = xnVar2.s;
                un unVar = (un) this.c;
                View F = xb1Var.F(unVar);
                T = F != null ? xb1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i11 = b10 - xnVar2.t0;
                    if (i11 >= 0 && i11 < xnVar2.K.length) {
                        if (xnVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, unVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                xnVar2.x.setDirection(0);
                                xnVar2.x.setTranslationY(y3);
                            } else {
                                xnVar2.x.setDirection(1);
                                xnVar2.x.setTranslationY(view.getY());
                            }
                            xnVar2.x.setDelegate(unVar);
                            xnVar2.x.e();
                        }
                        xnVar2.K[i11] = editable;
                        xn.J(xnVar2, unVar, b10);
                        xnVar2.R();
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
                org.telegram.ui.uv0 uv0Var = ((org.telegram.ui.sv0) obj).d;
                org.telegram.ui.pv0 pv0Var = (org.telegram.ui.pv0) this.c;
                if (pv0Var.getTag() == null) {
                    s4.c1 K2 = uv0Var.c.K(uv0Var.i0);
                    if (K2 != null && uv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, pv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        uv0Var.Q.setDirection(1);
                        uv0Var.Q.setDelegate(pv0Var);
                        uv0Var.Q.setTranslationY(K2.a.getY());
                        uv0Var.Q.e();
                    }
                    uv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.uv0.c0(uv0Var, K2.a, uv0Var.i0);
                    }
                    uv0Var.i0();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.uv0 uv0Var2 = ((org.telegram.ui.sv0) obj).d;
                org.telegram.ui.qv0 qv0Var = (org.telegram.ui.qv0) this.c;
                if (qv0Var.getTag() == null) {
                    s4.c1 K3 = uv0Var2.c.K(uv0Var2.i0);
                    if (K3 != null && uv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, qv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        uv0Var2.Q.setDirection(1);
                        uv0Var2.Q.setDelegate(qv0Var);
                        uv0Var2.Q.setTranslationY(K3.a.getY());
                        uv0Var2.Q.e();
                    }
                    uv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.uv0.c0(uv0Var2, K3.a, uv0Var2.j0);
                    }
                    uv0Var2.i0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.uv0 uv0Var3 = ((org.telegram.ui.sv0) obj).d;
                xb1 xb1Var2 = uv0Var3.c;
                org.telegram.ui.rv0 rv0Var = (org.telegram.ui.rv0) this.c;
                View F2 = xb1Var2.F(rv0Var);
                T = F2 != null ? xb1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - uv0Var3.n0;
                    if (b11 >= 0 && b11 < uv0Var3.v.length) {
                        if (uv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, rv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                uv0Var3.Q.setDirection(0);
                                uv0Var3.Q.setTranslationY(y10);
                            } else {
                                uv0Var3.Q.setDirection(1);
                                uv0Var3.Q.setTranslationY(view2.getY());
                            }
                            uv0Var3.Q.setDelegate(rv0Var);
                            uv0Var3.Q.e();
                        }
                        uv0Var3.v[b11] = editable;
                        org.telegram.ui.uv0.c0(uv0Var3, rv0Var, b11);
                        uv0Var3.i0();
                        break;
                    }
                }
                break;
            case 7:
                pg.v vVar = (pg.v) obj;
                pg.x xVar = vVar.f;
                if (!vVar.e && ((String) this.c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.c).toString(), editable.toString())) {
                    int b12 = w7.q.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    int argb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(xVar.f), b12, Color.green(xVar.f), Color.blue(xVar.f)) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), Color.green(xVar.f), b12) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), b12, Color.blue(xVar.f));
                    int i13 = pg.x.s;
                    xVar.m(argb, 5);
                    break;
                }
                break;
            case 8:
                ((String[]) this.c)[0] = editable.toString();
                ((xh.h3) obj).f3.N(true);
                break;
            case 9:
                ((String[]) this.c)[0] = editable.toString();
                ((xh.f3) obj).f3.N(true);
                break;
            case 10:
                ((String[]) this.c)[0] = editable.toString();
                ((xh.g3) obj).f3.N(true);
                break;
            case 11:
                ((String[]) this.c)[0] = editable.toString();
                ((xh.c4) obj).f3.N(true);
                break;
            case 12:
                ((String[]) this.c)[0] = editable.toString();
                ((xh.d4) obj).f3.N(true);
                break;
            default:
                ((String[]) this.c)[0] = editable.toString();
                ((xh.e4) obj).f3.N(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                EditText editText = (EditText) this.c;
                editText.post(new org.telegram.ui.uq(this, editText, (AtomicReference) this.b, 25));
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

    public /* synthetic */ tn(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public tn(pg.v vVar) {
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
