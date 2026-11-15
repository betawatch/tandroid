package bi;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import c8.i9;
import di.g7;
import hi.l7;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.jn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.b61;
import org.telegram.ui.ir0;
import org.telegram.ui.jr0;
import org.telegram.ui.kr0;
import org.telegram.ui.lr0;
import org.telegram.ui.nr0;
import org.telegram.ui.tp;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class v implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v(int i7, Object obj, Object obj2) {
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
                View[] viewArr = (View[]) this.b;
                try {
                    boolean z10 = ((long) Integer.parseInt(editable.toString())) >= ((y) obj).h2.e();
                    viewArr[0].animate().alpha(z10 ? 1.0f : 0.6f).setDuration(180L).start();
                    viewArr[0].setEnabled(z10);
                    viewArr[0].setClickable(z10);
                    break;
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    return;
                }
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((y4) obj).g3.O(true);
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((y4) obj).g3.O(true);
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((y4) obj).g3.O(true);
                break;
            case 4:
                ((String[]) this.b)[0] = editable.toString();
                ((y4) obj).g3.O(true);
                break;
            case 5:
                ((String[]) this.b)[0] = editable.toString();
                ((y4) obj).g3.O(true);
                break;
            case 6:
                ((String[]) this.b)[0] = editable.toString();
                ((y4) obj).g3.O(true);
                break;
            case 7:
                ((hi.h4) this.b).run();
                l7 l7Var = (l7) obj;
                org.telegram.ui.Cells.k3 k3Var = l7Var.U1;
                if (!l7Var.Y1) {
                    if (!l7Var.Z1 || editable == null) {
                        l7.d1(l7Var, editable != null ? editable.toString() : null);
                        break;
                    } else {
                        String substring = editable.toString().substring(8);
                        l7Var.Y1 = true;
                        k3Var.d.setText(substring);
                        org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                        i3Var.setSelection(0, i3Var.getText().length());
                        l7Var.Y1 = false;
                        l7Var.Z1 = false;
                        l7.d1(l7Var, substring);
                        break;
                    }
                }
                break;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.h3(runnableArr[0]);
                    break;
                }
                break;
            case 9:
                ((String[]) this.b)[0] = editable.toString();
                ((g7) obj).run();
                break;
            case 10:
                jn jnVar = (jn) ((org.telegram.ui.l4) obj).e;
                gn gnVar = (gn) this.b;
                if (gnVar.getTag() == null) {
                    v4.e1 K = jnVar.s.K(jnVar.q0);
                    if (K != null && jnVar.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.j6.l(editable, gnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        jnVar.y.setDirection(1);
                        jnVar.y.setDelegate(gnVar);
                        jnVar.y.setTranslationY(K.a.getY());
                        jnVar.y.e();
                    }
                    jnVar.Q = editable;
                    if (K != null) {
                        jn.Q(jnVar, K.a, jnVar.q0);
                    }
                    jnVar.Y();
                    break;
                }
                break;
            case 11:
                jn jnVar2 = (jn) ((org.telegram.ui.l4) obj).e;
                b61 b61Var = jnVar2.s;
                hn hnVar = (hn) this.b;
                View F = b61Var.F(hnVar);
                v4.e1 T = F != null ? b61Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i10 = b10 - jnVar2.u0;
                    if (i10 >= 0 && i10 < jnVar2.L.length) {
                        if (jnVar2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.j6.l(editable, hnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                jnVar2.y.setDirection(0);
                                jnVar2.y.setTranslationY(y10);
                            } else {
                                jnVar2.y.setDirection(1);
                                jnVar2.y.setTranslationY(view.getY());
                            }
                            jnVar2.y.setDelegate(hnVar);
                            jnVar2.y.e();
                        }
                        jnVar2.L[i10] = editable;
                        jn.Q(jnVar2, hnVar, b10);
                        jnVar2.Y();
                        break;
                    }
                }
                break;
            case 12:
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.y == 1 && passcodeActivity.F == 0) {
                    if (TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 8) {
                        if (((AtomicBoolean) this.b).get()) {
                            passcodeActivity.s.callOnClick();
                        }
                        org.telegram.messenger.g0.Y3(passcodeActivity.s, false, 0.1f, true, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        org.telegram.messenger.g0.Y3(passcodeActivity.s, true, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 14:
                nr0 nr0Var = ((lr0) obj).d;
                ir0 ir0Var = (ir0) this.b;
                if (ir0Var.getTag() == null) {
                    v4.e1 K2 = nr0Var.c.K(nr0Var.j0);
                    if (K2 != null && nr0Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.j6.l(editable, ir0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        nr0Var.R.setDirection(1);
                        nr0Var.R.setDelegate(ir0Var);
                        nr0Var.R.setTranslationY(K2.a.getY());
                        nr0Var.R.e();
                    }
                    nr0Var.F = editable;
                    if (K2 != null) {
                        nr0.h0(nr0Var, K2.a, nr0Var.j0);
                    }
                    nr0Var.n0();
                    break;
                }
                break;
            case 15:
                nr0 nr0Var2 = ((lr0) obj).d;
                jr0 jr0Var = (jr0) this.b;
                if (jr0Var.getTag() == null) {
                    v4.e1 K3 = nr0Var2.c.K(nr0Var2.j0);
                    if (K3 != null && nr0Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.j6.l(editable, jr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        nr0Var2.R.setDirection(1);
                        nr0Var2.R.setDelegate(jr0Var);
                        nr0Var2.R.setTranslationY(K3.a.getY());
                        nr0Var2.R.e();
                    }
                    nr0Var2.G = editable;
                    if (K3 != null) {
                        nr0.h0(nr0Var2, K3.a, nr0Var2.k0);
                    }
                    nr0Var2.n0();
                    break;
                }
                break;
            case 16:
                nr0 nr0Var3 = ((lr0) obj).d;
                b61 b61Var2 = nr0Var3.c;
                kr0 kr0Var = (kr0) this.b;
                View F2 = b61Var2.F(kr0Var);
                v4.e1 T2 = F2 != null ? b61Var2.T(F2) : null;
                if (T2 != null) {
                    View view2 = T2.a;
                    int b11 = T2.b() - nr0Var3.o0;
                    if (b11 >= 0 && b11 < nr0Var3.w.length) {
                        if (nr0Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.j6.l(editable, kr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                nr0Var3.R.setDirection(0);
                                nr0Var3.R.setTranslationY(y11);
                            } else {
                                nr0Var3.R.setDirection(1);
                                nr0Var3.R.setTranslationY(view2.getY());
                            }
                            nr0Var3.R.setDelegate(kr0Var);
                            nr0Var3.R.e();
                        }
                        nr0Var3.w[b11] = editable;
                        nr0.h0(nr0Var3, kr0Var, b11);
                        nr0Var3.n0();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.c && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b12 = i9.b(Integer.parseInt(editable.toString()), 0, ns.e4);
                    int i11 = t4Var.b;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(qVar.q1), b12, Color.green(qVar.q1), Color.blue(qVar.q1)) : Color.argb(Color.alpha(qVar.q1), Color.red(qVar.q1), Color.green(qVar.q1), b12) : Color.argb(Color.alpha(qVar.q1), Color.red(qVar.q1), b12, Color.blue(qVar.q1));
                    int i12 = sg.q.u1;
                    qVar.I0(argb, 5);
                    break;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
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
                break;
            case 12:
                EditText editText = (EditText) this.b;
                editText.post(new tp(this, editText, (AtomicReference) this.c, 28));
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            default:
                this.b = charSequence.toString();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12;
        switch (this.a) {
            case 7:
                l7 l7Var = (l7) this.c;
                if (!l7Var.Y1) {
                    boolean z10 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    l7Var.Z1 = z10;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    public v(org.telegram.ui.t4 t4Var) {
        this.a = 17;
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
