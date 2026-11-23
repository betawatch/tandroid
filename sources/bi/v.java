package bi;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import c8.l9;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.rn;
import org.telegram.ui.Components.tn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.f61;
import org.telegram.ui.kr0;
import org.telegram.ui.lr0;
import org.telegram.ui.mr0;
import org.telegram.ui.nr0;
import org.telegram.ui.pr0;
import org.telegram.ui.up;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                    org.telegram.messenger.a8.g(th2, true);
                    return;
                }
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((i7) obj).g3.O(true);
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((i7) obj).g3.O(true);
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((i7) obj).g3.O(true);
                break;
            case 4:
                ((String[]) this.b)[0] = editable.toString();
                ((i7) obj).g3.O(true);
                break;
            case 5:
                ((String[]) this.b)[0] = editable.toString();
                ((i7) obj).g3.O(true);
                break;
            case 6:
                ((String[]) this.b)[0] = editable.toString();
                ((i7) obj).g3.O(true);
                break;
            case 7:
                ((hi.c) this.b).run();
                hi.k7 k7Var = (hi.k7) obj;
                org.telegram.ui.Cells.l3 l3Var = k7Var.U1;
                if (!k7Var.Y1) {
                    if (!k7Var.Z1 || editable == null) {
                        hi.k7.e1(k7Var, editable != null ? editable.toString() : null);
                        break;
                    } else {
                        String substring = editable.toString().substring(8);
                        k7Var.Y1 = true;
                        l3Var.d.setText(substring);
                        org.telegram.ui.Cells.j3 j3Var = l3Var.d;
                        j3Var.setSelection(0, j3Var.getText().length());
                        k7Var.Y1 = false;
                        k7Var.Z1 = false;
                        hi.k7.e1(k7Var, substring);
                        break;
                    }
                }
                break;
            case 8:
                Runnable[] runnableArr = (Runnable[]) obj;
                if (((TextView) this.b).getAlpha() > 0.0f) {
                    org.telegram.messenger.g0.r(runnableArr[0]);
                    org.telegram.messenger.g0.g3(runnableArr[0]);
                    break;
                }
                break;
            case 9:
                ((String[]) this.b)[0] = editable.toString();
                ((di.j7) obj).run();
                break;
            case 10:
                tn tnVar = (tn) ((org.telegram.ui.l4) obj).e;
                qn qnVar = (qn) this.b;
                if (qnVar.getTag() == null) {
                    v4.f1 K = tnVar.s.K(tnVar.q0);
                    if (K != null && tnVar.y != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        org.telegram.messenger.j6.l(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        tnVar.y.setDirection(1);
                        tnVar.y.setDelegate(qnVar);
                        tnVar.y.setTranslationY(K.a.getY());
                        tnVar.y.e();
                    }
                    tnVar.Q = editable;
                    if (K != null) {
                        tn.Q(tnVar, K.a, tnVar.q0);
                    }
                    tnVar.Y();
                    break;
                }
                break;
            case 11:
                tn tnVar2 = (tn) ((org.telegram.ui.l4) obj).e;
                f61 f61Var = tnVar2.s;
                rn rnVar = (rn) this.b;
                View F = f61Var.F(rnVar);
                v4.f1 T = F != null ? f61Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i10 = b10 - tnVar2.u0;
                    if (i10 >= 0 && i10 < tnVar2.L.length) {
                        if (tnVar2.y != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            org.telegram.messenger.j6.l(editable, rnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - org.telegram.messenger.g0.L(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                tnVar2.y.setDirection(0);
                                tnVar2.y.setTranslationY(y10);
                            } else {
                                tnVar2.y.setDirection(1);
                                tnVar2.y.setTranslationY(view.getY());
                            }
                            tnVar2.y.setDelegate(rnVar);
                            tnVar2.y.e();
                        }
                        tnVar2.L[i10] = editable;
                        tn.Q(tnVar2, rnVar, b10);
                        tnVar2.Y();
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
                        org.telegram.messenger.g0.X3(passcodeActivity.s, false, 0.1f, true, true);
                        break;
                    } else if (!TextUtils.isEmpty(editable) && passcodeActivity.s.getVisibility() != 0) {
                        org.telegram.messenger.g0.X3(passcodeActivity.s, true, 0.1f, true, true);
                        break;
                    }
                }
                break;
            case 14:
                pr0 pr0Var = ((nr0) obj).d;
                kr0 kr0Var = (kr0) this.b;
                if (kr0Var.getTag() == null) {
                    v4.f1 K2 = pr0Var.c.K(pr0Var.j0);
                    if (K2 != null && pr0Var.R != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        org.telegram.messenger.j6.l(editable, kr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var.R.setDirection(1);
                        pr0Var.R.setDelegate(kr0Var);
                        pr0Var.R.setTranslationY(K2.a.getY());
                        pr0Var.R.e();
                    }
                    pr0Var.F = editable;
                    if (K2 != null) {
                        pr0.h0(pr0Var, K2.a, pr0Var.j0);
                    }
                    pr0Var.n0();
                    break;
                }
                break;
            case 15:
                pr0 pr0Var2 = ((nr0) obj).d;
                lr0 lr0Var = (lr0) this.b;
                if (lr0Var.getTag() == null) {
                    v4.f1 K3 = pr0Var2.c.K(pr0Var2.j0);
                    if (K3 != null && pr0Var2.R != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        org.telegram.messenger.j6.l(editable, lr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        pr0Var2.R.setDirection(1);
                        pr0Var2.R.setDelegate(lr0Var);
                        pr0Var2.R.setTranslationY(K3.a.getY());
                        pr0Var2.R.e();
                    }
                    pr0Var2.G = editable;
                    if (K3 != null) {
                        pr0.h0(pr0Var2, K3.a, pr0Var2.k0);
                    }
                    pr0Var2.n0();
                    break;
                }
                break;
            case 16:
                pr0 pr0Var3 = ((nr0) obj).d;
                f61 f61Var2 = pr0Var3.c;
                mr0 mr0Var = (mr0) this.b;
                View F2 = f61Var2.F(mr0Var);
                v4.f1 T2 = F2 != null ? f61Var2.T(F2) : null;
                if (T2 != null) {
                    View view2 = T2.a;
                    int b11 = T2.b() - pr0Var3.o0;
                    if (b11 >= 0 && b11 < pr0Var3.w.length) {
                        if (pr0Var3.R != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            org.telegram.messenger.j6.l(editable, mr0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - org.telegram.messenger.g0.L(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                pr0Var3.R.setDirection(0);
                                pr0Var3.R.setTranslationY(y11);
                            } else {
                                pr0Var3.R.setDirection(1);
                                pr0Var3.R.setTranslationY(view2.getY());
                            }
                            pr0Var3.R.setDelegate(mr0Var);
                            pr0Var3.R.e();
                        }
                        pr0Var3.w[b11] = editable;
                        pr0.h0(pr0Var3, mr0Var, b11);
                        pr0Var3.n0();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.t4 t4Var = (org.telegram.ui.t4) obj;
                sg.q qVar = (sg.q) t4Var.h;
                if (!t4Var.c && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b12 = l9.b(Integer.parseInt(editable.toString()), 0, ls.e4);
                    int i11 = t4Var.b;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(qVar.q1), b12, Color.green(qVar.q1), Color.blue(qVar.q1)) : Color.argb(Color.alpha(qVar.q1), Color.red(qVar.q1), Color.green(qVar.q1), b12) : Color.argb(Color.alpha(qVar.q1), Color.red(qVar.q1), b12, Color.blue(qVar.q1));
                    int i12 = sg.q.u1;
                    qVar.J0(argb, 5);
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
                editText.post(new up(this, editText, (AtomicReference) this.c, 28));
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
                hi.k7 k7Var = (hi.k7) this.c;
                if (!k7Var.Y1) {
                    boolean z10 = false;
                    if (charSequence != null && i7 == 8 && charSequence.subSequence(0, i7).toString().equals("https://") && charSequence.length() >= (i12 = i11 + i7) && charSequence.subSequence(i7, i12).toString().startsWith("https://")) {
                        z10 = true;
                    }
                    k7Var.Z1 = z10;
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
