package fi;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ym;
import org.telegram.ui.Components.zm;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.e61;
import org.telegram.ui.kr0;
import org.telegram.ui.kx;
import org.telegram.ui.lr0;
import org.telegram.ui.mr0;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import org.telegram.ui.rp;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class h7 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h7(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i7 = this.a;
        Object obj = this.c;
        switch (i7) {
            case 0:
                ((f2.h) this.b).run();
                m7 m7Var = (m7) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.Q1;
                if (!m7Var.U1) {
                    if (!m7Var.V1 || editable == null) {
                        m7.d1(m7Var, editable != null ? editable.toString() : null);
                        break;
                    } else {
                        String substring = editable.toString().substring(8);
                        m7Var.U1 = true;
                        k3Var.d.setText(substring);
                        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                        i3Var.setSelection(0, i3Var.getText().length());
                        m7Var.U1 = false;
                        m7Var.V1 = false;
                        m7.d1(m7Var, substring);
                        break;
                    }
                }
                break;
            case 1:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.h3(runnableArr[0]);
                    break;
                }
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((bi.n8) obj).run();
                break;
            case 3:
                bn bnVar = (bn) ((org.telegram.ui.l4) obj).e;
                ym ymVar = (ym) this.b;
                if (ymVar.getTag() == null) {
                    v4.d1 K = bnVar.s.K(bnVar.p0);
                    if (K != null && bnVar.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.i6.l(editable, ymVar.getEditField().getPaint().getFontMetricsInt(), false);
                        bnVar.y.setDirection(1);
                        bnVar.y.setDelegate(ymVar);
                        bnVar.y.setTranslationY(K.a.getY());
                        bnVar.y.e();
                    }
                    bnVar.P = editable;
                    if (K != null) {
                        bn.P(bnVar, K.a, bnVar.p0);
                    }
                    bnVar.X();
                    break;
                }
                break;
            case 4:
                bn bnVar2 = (bn) ((org.telegram.ui.l4) obj).e;
                e61 e61Var = bnVar2.s;
                zm zmVar = (zm) this.b;
                View F = e61Var.F(zmVar);
                v4.d1 T = F != null ? e61Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i10 = b10 - bnVar2.t0;
                    if (i10 >= 0 && i10 < bnVar2.K.length) {
                        if (bnVar2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.i6.l(editable, zmVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                bnVar2.y.setDirection(0);
                                bnVar2.y.setTranslationY(y10);
                            } else {
                                bnVar2.y.setDirection(1);
                                bnVar2.y.setTranslationY(view.getY());
                            }
                            bnVar2.y.setDelegate(zmVar);
                            bnVar2.y.e();
                        }
                        bnVar2.K[i10] = editable;
                        bn.P(bnVar2, zmVar, b10);
                        bnVar2.X();
                        break;
                    }
                }
                break;
            case 5:
                break;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.y == 1 && passcodeActivity.E == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.b).get()) {
                            passcodeActivity.s.callOnClick();
                        }
                        org.telegram.messenger.g0.Z3(passcodeActivity.s, false, 0.1f, true, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        org.telegram.messenger.g0.Z3(passcodeActivity.s, true, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 7:
                pr0 pr0Var = ((nr0) obj).d;
                kr0 kr0Var = (kr0) this.b;
                if (kr0Var.getTag() == null) {
                    v4.d1 K2 = pr0Var.c.K(pr0Var.i0);
                    if (K2 != null && pr0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.i6.l(editable, kr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var.Q.setDirection(1);
                        pr0Var.Q.setDelegate(kr0Var);
                        pr0Var.Q.setTranslationY(K2.a.getY());
                        pr0Var.Q.e();
                    }
                    pr0Var.E = editable;
                    if (K2 != null) {
                        pr0.h0(pr0Var, K2.a, pr0Var.i0);
                    }
                    pr0Var.n0();
                    break;
                }
                break;
            case 8:
                pr0 pr0Var2 = ((nr0) obj).d;
                lr0 lr0Var = (lr0) this.b;
                if (lr0Var.getTag() == null) {
                    v4.d1 K3 = pr0Var2.c.K(pr0Var2.i0);
                    if (K3 != null && pr0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.i6.l(editable, lr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var2.Q.setDirection(1);
                        pr0Var2.Q.setDelegate(lr0Var);
                        pr0Var2.Q.setTranslationY(K3.a.getY());
                        pr0Var2.Q.e();
                    }
                    pr0Var2.F = editable;
                    if (K3 != null) {
                        pr0.h0(pr0Var2, K3.a, pr0Var2.j0);
                    }
                    pr0Var2.n0();
                    break;
                }
                break;
            case 9:
                pr0 pr0Var3 = ((nr0) obj).d;
                e61 e61Var2 = pr0Var3.c;
                mr0 mr0Var = (mr0) this.b;
                View F2 = e61Var2.F(mr0Var);
                v4.d1 T2 = F2 != null ? e61Var2.T(F2) : null;
                if (T2 != null) {
                    View view2 = T2.a;
                    int b11 = T2.b() - pr0Var3.n0;
                    if (b11 >= 0 && b11 < pr0Var3.w.length) {
                        if (pr0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.i6.l(editable, mr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                pr0Var3.Q.setDirection(0);
                                pr0Var3.Q.setTranslationY(y11);
                            } else {
                                pr0Var3.Q.setDirection(1);
                                pr0Var3.Q.setTranslationY(view2.getY());
                            }
                            pr0Var3.Q.setDelegate(mr0Var);
                            pr0Var3.Q.e();
                        }
                        pr0Var3.w[b11] = editable;
                        pr0.h0(pr0Var3, mr0Var, b11);
                        pr0Var3.n0();
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.c && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b12 = c8.j9.b(Integer.parseInt(editable.toString()), 0, qs.e4);
                    int i11 = t4Var.b;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(qVar.m1), b12, Color.green(qVar.m1), Color.blue(qVar.m1)) : Color.argb(Color.alpha(qVar.m1), Color.red(qVar.m1), Color.green(qVar.m1), b12) : Color.argb(Color.alpha(qVar.m1), Color.red(qVar.m1), b12, Color.blue(qVar.m1));
                    int i12 = sg.q.q1;
                    qVar.I0(argb, 5);
                    break;
                }
                break;
            case 11:
                View[] viewArr = (View[]) this.b;
                try {
                    boolean z9 = ((long) Integer.parseInt(editable.toString())) >= ((zh.l) obj).d2.e();
                    viewArr[0].animate().alpha(z9 ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr[0].setEnabled(z9);
                    viewArr[0].setClickable(z9);
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 12:
                ((String[]) this.b)[0] = editable.toString();
                ((kx) obj).f3.O(true);
                break;
            case 13:
                ((String[]) this.b)[0] = editable.toString();
                ((kx) obj).f3.O(true);
                break;
            case 14:
                ((String[]) this.b)[0] = editable.toString();
                ((kx) obj).f3.O(true);
                break;
            case 15:
                ((String[]) this.b)[0] = editable.toString();
                ((kx) obj).f3.O(true);
                break;
            case 16:
                ((String[]) this.b)[0] = editable.toString();
                ((kx) obj).f3.O(true);
                break;
            default:
                ((String[]) this.b)[0] = editable.toString();
                ((kx) obj).f3.O(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.a) {
            case 5:
                EditText editText = (EditText) this.b;
                editText.post(new rp(this, editText, (AtomicReference) this.c, 28));
                break;
            case 10:
                this.b = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.a) {
            case 0:
                m7 m7Var = (m7) this.c;
                if (!m7Var.U1) {
                    boolean z9 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z9 = true;
                    }
                    m7Var.V1 = z9;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h7(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public h7(org.telegram.ui.t4 t4Var) {
        this.a = 10;
        this.c = t4Var;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void B(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void C(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void D(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void E(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void F(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void G(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void H(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void e(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void f(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void g(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void h(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void i(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void j(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void k(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void l(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void m(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void n(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void o(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void p(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void q(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void r(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void s(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void t(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void u(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void v(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void w(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void x(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void y(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void z(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
