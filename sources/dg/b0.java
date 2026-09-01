package dg;

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
import lh.k5;
import lh.l4;
import lh.l5;
import lh.m4;
import lh.m5;
import lh.n4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.sn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.cv0;
import org.telegram.ui.dv0;
import org.telegram.ui.ev0;
import org.telegram.ui.fv0;
import org.telegram.ui.hv0;
import org.telegram.ui.kb1;
import org.telegram.ui.sq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b0 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f2.m1 T;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                c0 c0Var = (c0) obj;
                e0 e0Var = c0Var.f;
                if (!c0Var.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b10 = k7.o.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = c0Var.d;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(e0Var.f), b10, Color.green(e0Var.f), Color.blue(e0Var.f)) : Color.argb(Color.alpha(e0Var.f), Color.red(e0Var.f), Color.green(e0Var.f), b10) : Color.argb(Color.alpha(e0Var.f), Color.red(e0Var.f), b10, Color.blue(e0Var.f));
                    int i12 = e0.s;
                    e0Var.m(argb, 5);
                    break;
                }
                break;
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((n4) obj).V2.N(true);
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((l4) obj).V2.N(true);
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((m4) obj).V2.N(true);
                break;
            case 4:
                ((String[]) this.b)[0] = editable.toString();
                ((k5) obj).V2.N(true);
                break;
            case 5:
                ((String[]) this.b)[0] = editable.toString();
                ((l5) obj).V2.N(true);
                break;
            case 6:
                ((String[]) this.b)[0] = editable.toString();
                ((m5) obj).V2.N(true);
                break;
            case 7:
                sn snVar = ((qn) obj).d;
                on onVar = (on) this.b;
                if (onVar.getTag() == null) {
                    f2.m1 K = snVar.s.K(snVar.m0);
                    if (K != null && snVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
                        snVar.x.setDirection(1);
                        snVar.x.setDelegate(onVar);
                        snVar.x.setTranslationY(K.a.getY());
                        snVar.x.e();
                    }
                    snVar.M = editable;
                    if (K != null) {
                        sn.K(snVar, K.a, snVar.m0);
                    }
                    snVar.T();
                    break;
                }
                break;
            case 8:
                sn snVar2 = ((qn) obj).d;
                kb1 kb1Var = snVar2.s;
                pn pnVar = (pn) this.b;
                View F = kb1Var.F(pnVar);
                T = F != null ? kb1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b11 = T.b();
                    int i13 = b11 - snVar2.q0;
                    if (i13 >= 0 && i13 < snVar2.H.length) {
                        if (snVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, pnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                snVar2.x.setDirection(0);
                                snVar2.x.setTranslationY(y10);
                            } else {
                                snVar2.x.setDirection(1);
                                snVar2.x.setTranslationY(view.getY());
                            }
                            snVar2.x.setDelegate(pnVar);
                            snVar2.x.e();
                        }
                        snVar2.H[i13] = editable;
                        sn.K(snVar2, pnVar, b11);
                        snVar2.T();
                        break;
                    }
                }
                break;
            case 9:
                break;
            case 10:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.x == 1 && passcodeActivity.B == 0) {
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
            case 11:
                hv0 hv0Var = ((fv0) obj).d;
                cv0 cv0Var = (cv0) this.b;
                if (cv0Var.getTag() == null) {
                    f2.m1 K2 = hv0Var.c.K(hv0Var.f0);
                    if (K2 != null && hv0Var.N != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, cv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        hv0Var.N.setDirection(1);
                        hv0Var.N.setDelegate(cv0Var);
                        hv0Var.N.setTranslationY(K2.a.getY());
                        hv0Var.N.e();
                    }
                    hv0Var.B = editable;
                    if (K2 != null) {
                        hv0.c0(hv0Var, K2.a, hv0Var.f0);
                    }
                    hv0Var.i0();
                    break;
                }
                break;
            case 12:
                hv0 hv0Var2 = ((fv0) obj).d;
                dv0 dv0Var = (dv0) this.b;
                if (dv0Var.getTag() == null) {
                    f2.m1 K3 = hv0Var2.c.K(hv0Var2.f0);
                    if (K3 != null && hv0Var2.N != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, dv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        hv0Var2.N.setDirection(1);
                        hv0Var2.N.setDelegate(dv0Var);
                        hv0Var2.N.setTranslationY(K3.a.getY());
                        hv0Var2.N.e();
                    }
                    hv0Var2.C = editable;
                    if (K3 != null) {
                        hv0.c0(hv0Var2, K3.a, hv0Var2.g0);
                    }
                    hv0Var2.i0();
                    break;
                }
                break;
            default:
                hv0 hv0Var3 = ((fv0) obj).d;
                kb1 kb1Var2 = hv0Var3.c;
                ev0 ev0Var = (ev0) this.b;
                View F2 = kb1Var2.F(ev0Var);
                T = F2 != null ? kb1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b12 = T.b() - hv0Var3.k0;
                    if (b12 >= 0 && b12 < hv0Var3.v.length) {
                        if (hv0Var3.N != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, ev0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y11 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y11 > 0.0f) {
                                hv0Var3.N.setDirection(0);
                                hv0Var3.N.setTranslationY(y11);
                            } else {
                                hv0Var3.N.setDirection(1);
                                hv0Var3.N.setTranslationY(view2.getY());
                            }
                            hv0Var3.N.setDelegate(ev0Var);
                            hv0Var3.N.e();
                        }
                        hv0Var3.v[b12] = editable;
                        hv0.c0(hv0Var3, ev0Var, b12);
                        hv0Var3.i0();
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                this.b = charSequence.toString();
                break;
            case 9:
                EditText editText = (EditText) this.b;
                editText.post(new sq(this, editText, (AtomicReference) this.c, 25));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public /* synthetic */ b0(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public b0(c0 c0Var) {
        this.a = 0;
        this.c = c0Var;
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
