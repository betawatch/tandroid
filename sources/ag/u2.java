package ag;

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
import org.telegram.messenger.f8;
import org.telegram.messenger.k6;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.at0;
import org.telegram.ui.ny;
import org.telegram.ui.qq;
import org.telegram.ui.vs0;
import org.telegram.ui.w71;
import org.telegram.ui.ws0;
import org.telegram.ui.xs0;
import org.telegram.ui.ys0;
import vh.t5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u2 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    org.telegram.messenger.i0.r(runnableArr[0]);
                    org.telegram.messenger.i0.g3(runnableArr[0]);
                    break;
                }
                break;
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((bi.n) obj).run();
                break;
            case 2:
                ig.s sVar = (ig.s) obj;
                ig.u uVar = (ig.u) sVar.h;
                if (!sVar.b && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b10 = w7.u.b(Integer.parseInt(editable.toString()), 0, zs.e4);
                    int i11 = sVar.c;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(uVar.m1), b10, Color.green(uVar.m1), Color.blue(uVar.m1)) : Color.argb(Color.alpha(uVar.m1), Color.red(uVar.m1), Color.green(uVar.m1), b10) : Color.argb(Color.alpha(uVar.m1), Color.red(uVar.m1), b10, Color.blue(uVar.m1));
                    int i12 = ig.u.q1;
                    uVar.I0(argb, 5);
                    break;
                }
                break;
            case 3:
                jn jnVar = (jn) ((fg.j) obj).e;
                gn gnVar = (gn) this.b;
                if (gnVar.getTag() == null) {
                    s4.c1 K = jnVar.s.K(jnVar.p0);
                    if (K != null && jnVar.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        k6.l(editable, gnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        jnVar.y.setDirection(1);
                        jnVar.y.setDelegate(gnVar);
                        jnVar.y.setTranslationY(K.a.getY());
                        jnVar.y.e();
                    }
                    jnVar.P = editable;
                    if (K != null) {
                        jn.O(jnVar, K.a, jnVar.p0);
                    }
                    jnVar.W();
                    break;
                }
                break;
            case 4:
                jn jnVar2 = (jn) ((fg.j) obj).e;
                w71 w71Var = jnVar2.s;
                hn hnVar = (hn) this.b;
                View F = w71Var.F(hnVar);
                s4.c1 T = F != null ? w71Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b11 = T.b();
                    int i13 = b11 - jnVar2.t0;
                    if (i13 >= 0 && i13 < jnVar2.K.length) {
                        if (jnVar2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            k6.l(editable, hnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - org.telegram.messenger.i0.L(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                jnVar2.y.setDirection(0);
                                jnVar2.y.setTranslationY(y3);
                            } else {
                                jnVar2.y.setDirection(1);
                                jnVar2.y.setTranslationY(view.getY());
                            }
                            jnVar2.y.setDelegate(hnVar);
                            jnVar2.y.e();
                        }
                        jnVar2.K[i13] = editable;
                        jn.O(jnVar2, hnVar, b11);
                        jnVar2.W();
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
                        org.telegram.messenger.i0.Y3(passcodeActivity.s, false, 0.1f, true, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        org.telegram.messenger.i0.Y3(passcodeActivity.s, true, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 7:
                at0 at0Var = ((ys0) obj).d;
                vs0 vs0Var = (vs0) this.b;
                if (vs0Var.getTag() == null) {
                    s4.c1 K2 = at0Var.c.K(at0Var.i0);
                    if (K2 != null && at0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        k6.l(editable, vs0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        at0Var.Q.setDirection(1);
                        at0Var.Q.setDelegate(vs0Var);
                        at0Var.Q.setTranslationY(K2.a.getY());
                        at0Var.Q.e();
                    }
                    at0Var.E = editable;
                    if (K2 != null) {
                        at0.g0(at0Var, K2.a, at0Var.i0);
                    }
                    at0Var.m0();
                    break;
                }
                break;
            case 8:
                at0 at0Var2 = ((ys0) obj).d;
                ws0 ws0Var = (ws0) this.b;
                if (ws0Var.getTag() == null) {
                    s4.c1 K3 = at0Var2.c.K(at0Var2.i0);
                    if (K3 != null && at0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        k6.l(editable, ws0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        at0Var2.Q.setDirection(1);
                        at0Var2.Q.setDelegate(ws0Var);
                        at0Var2.Q.setTranslationY(K3.a.getY());
                        at0Var2.Q.e();
                    }
                    at0Var2.F = editable;
                    if (K3 != null) {
                        at0.g0(at0Var2, K3.a, at0Var2.j0);
                    }
                    at0Var2.m0();
                    break;
                }
                break;
            case 9:
                at0 at0Var3 = ((ys0) obj).d;
                w71 w71Var2 = at0Var3.c;
                xs0 xs0Var = (xs0) this.b;
                View F2 = w71Var2.F(xs0Var);
                s4.c1 T2 = F2 != null ? w71Var2.T(F2) : null;
                if (T2 != null) {
                    View view2 = T2.a;
                    int b12 = T2.b() - at0Var3.n0;
                    if (b12 >= 0 && b12 < at0Var3.w.length) {
                        if (at0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            k6.l(editable, xs0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - org.telegram.messenger.i0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                at0Var3.Q.setDirection(0);
                                at0Var3.Q.setTranslationY(y10);
                            } else {
                                at0Var3.Q.setDirection(1);
                                at0Var3.Q.setTranslationY(view2.getY());
                            }
                            at0Var3.Q.setDelegate(xs0Var);
                            at0Var3.Q.e();
                        }
                        at0Var3.w[b12] = editable;
                        at0.g0(at0Var3, xs0Var, b12);
                        at0Var3.m0();
                        break;
                    }
                }
                break;
            case 10:
                View[] viewArr = (View[]) this.b;
                try {
                    boolean z10 = ((long) Integer.parseInt(editable.toString())) >= ((ph.m) obj).d2.e();
                    viewArr[0].animate().alpha(z10 ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr[0].setEnabled(z10);
                    viewArr[0].setClickable(z10);
                    break;
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    return;
                }
            case 11:
                ((String[]) this.b)[0] = editable.toString();
                ((ny) obj).f3.O(true);
                break;
            case 12:
                ((String[]) this.b)[0] = editable.toString();
                ((ny) obj).f3.O(true);
                break;
            case 13:
                ((String[]) this.b)[0] = editable.toString();
                ((ny) obj).f3.O(true);
                break;
            case 14:
                ((String[]) this.b)[0] = editable.toString();
                ((ny) obj).f3.O(true);
                break;
            case 15:
                ((String[]) this.b)[0] = editable.toString();
                ((ny) obj).f3.O(true);
                break;
            case 16:
                ((String[]) this.b)[0] = editable.toString();
                ((ny) obj).f3.O(true);
                break;
            default:
                ((vh.d1) this.b).run();
                t5 t5Var = (t5) obj;
                org.telegram.ui.Cells.m3 m3Var = t5Var.Q1;
                if (!t5Var.U1) {
                    if (!t5Var.V1 || editable == null) {
                        t5.d1(t5Var, editable != null ? editable.toString() : null);
                        break;
                    } else {
                        String substring = editable.toString().substring(8);
                        t5Var.U1 = true;
                        m3Var.d.setText(substring);
                        org.telegram.ui.Cells.k3 k3Var = m3Var.d;
                        k3Var.setSelection(0, k3Var.getText().length());
                        t5Var.U1 = false;
                        t5Var.V1 = false;
                        t5.d1(t5Var, substring);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                this.b = charSequence.toString();
                break;
            case 5:
                EditText editText = (EditText) this.b;
                editText.post(new qq(this, editText, (AtomicReference) this.c, 28));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13;
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            default:
                t5 t5Var = (t5) this.c;
                if (!t5Var.U1) {
                    boolean z10 = false;
                    if (charSequence != null && i10 == 8 && charSequence.subSequence(0, i10).toString().equals("https://") && charSequence.length() >= (i13 = i12 + i10) && charSequence.subSequence(i10, i13).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    t5Var.V1 = z10;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u2(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public u2(ig.s sVar) {
        this.a = 2;
        this.c = sVar;
    }

    private final void a(Editable editable) {
    }

    private final void A(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void B(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void C(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void D(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void E(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void F(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void G(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void H(int i10, int i11, int i12, CharSequence charSequence) {
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
