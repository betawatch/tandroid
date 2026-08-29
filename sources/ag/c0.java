package ag;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.EditText;
import ih.k5;
import ih.l4;
import ih.l5;
import ih.m4;
import ih.m5;
import ih.n4;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.ln;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.on;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.lq;
import org.telegram.ui.qu0;
import org.telegram.ui.ru0;
import org.telegram.ui.su0;
import org.telegram.ui.tu0;
import org.telegram.ui.vu0;
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c0 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        f2.n1 T;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                d0 d0Var = (d0) obj;
                f0 f0Var = d0Var.f;
                if (!d0Var.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b10 = i7.w.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = d0Var.d;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(f0Var.f), b10, Color.green(f0Var.f), Color.blue(f0Var.f)) : Color.argb(Color.alpha(f0Var.f), Color.red(f0Var.f), Color.green(f0Var.f), b10) : Color.argb(Color.alpha(f0Var.f), Color.red(f0Var.f), b10, Color.blue(f0Var.f));
                    int i12 = f0.s;
                    f0Var.m(argb, 5);
                    break;
                }
                break;
            case 1:
                ((String[]) this.b)[0] = editable.toString();
                ((n4) obj).U2.N(true);
                break;
            case 2:
                ((String[]) this.b)[0] = editable.toString();
                ((l4) obj).U2.N(true);
                break;
            case 3:
                ((String[]) this.b)[0] = editable.toString();
                ((m4) obj).U2.N(true);
                break;
            case 4:
                ((String[]) this.b)[0] = editable.toString();
                ((k5) obj).U2.N(true);
                break;
            case 5:
                ((String[]) this.b)[0] = editable.toString();
                ((l5) obj).U2.N(true);
                break;
            case 6:
                ((String[]) this.b)[0] = editable.toString();
                ((m5) obj).U2.N(true);
                break;
            case 7:
                on onVar = ((mn) obj).d;
                kn knVar = (kn) this.b;
                if (knVar.getTag() == null) {
                    f2.n1 K = onVar.s.K(onVar.l0);
                    if (K != null && onVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, knVar.getEditField().getPaint().getFontMetricsInt(), false);
                        onVar.x.setDirection(1);
                        onVar.x.setDelegate(knVar);
                        onVar.x.setTranslationY(K.a.getY());
                        onVar.x.e();
                    }
                    onVar.L = editable;
                    if (K != null) {
                        on.K(onVar, K.a, onVar.l0);
                    }
                    onVar.T();
                    break;
                }
                break;
            case 8:
                on onVar2 = ((mn) obj).d;
                wa1 wa1Var = onVar2.s;
                ln lnVar = (ln) this.b;
                View F = wa1Var.F(lnVar);
                T = F != null ? wa1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b11 = T.b();
                    int i13 = b11 - onVar2.p0;
                    if (i13 >= 0 && i13 < onVar2.G.length) {
                        if (onVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, lnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y8 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y8 > 0.0f) {
                                onVar2.x.setDirection(0);
                                onVar2.x.setTranslationY(y8);
                            } else {
                                onVar2.x.setDirection(1);
                                onVar2.x.setTranslationY(view.getY());
                            }
                            onVar2.x.setDelegate(lnVar);
                            onVar2.x.e();
                        }
                        onVar2.G[i13] = editable;
                        on.K(onVar2, lnVar, b11);
                        onVar2.T();
                        break;
                    }
                }
                break;
            case 9:
                break;
            case 10:
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
            case 11:
                vu0 vu0Var = ((tu0) obj).d;
                qu0 qu0Var = (qu0) this.b;
                if (qu0Var.getTag() == null) {
                    f2.n1 K2 = vu0Var.c.K(vu0Var.e0);
                    if (K2 != null && vu0Var.M != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, qu0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        vu0Var.M.setDirection(1);
                        vu0Var.M.setDelegate(qu0Var);
                        vu0Var.M.setTranslationY(K2.a.getY());
                        vu0Var.M.e();
                    }
                    vu0Var.A = editable;
                    if (K2 != null) {
                        vu0.c0(vu0Var, K2.a, vu0Var.e0);
                    }
                    vu0Var.i0();
                    break;
                }
                break;
            case 12:
                vu0 vu0Var2 = ((tu0) obj).d;
                ru0 ru0Var = (ru0) this.b;
                if (ru0Var.getTag() == null) {
                    f2.n1 K3 = vu0Var2.c.K(vu0Var2.e0);
                    if (K3 != null && vu0Var2.M != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, ru0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        vu0Var2.M.setDirection(1);
                        vu0Var2.M.setDelegate(ru0Var);
                        vu0Var2.M.setTranslationY(K3.a.getY());
                        vu0Var2.M.e();
                    }
                    vu0Var2.B = editable;
                    if (K3 != null) {
                        vu0.c0(vu0Var2, K3.a, vu0Var2.f0);
                    }
                    vu0Var2.i0();
                    break;
                }
                break;
            default:
                vu0 vu0Var3 = ((tu0) obj).d;
                wa1 wa1Var2 = vu0Var3.c;
                su0 su0Var = (su0) this.b;
                View F2 = wa1Var2.F(su0Var);
                T = F2 != null ? wa1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b12 = T.b() - vu0Var3.j0;
                    if (b12 >= 0 && b12 < vu0Var3.v.length) {
                        if (vu0Var3.M != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, su0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                vu0Var3.M.setDirection(0);
                                vu0Var3.M.setTranslationY(y10);
                            } else {
                                vu0Var3.M.setDirection(1);
                                vu0Var3.M.setTranslationY(view2.getY());
                            }
                            vu0Var3.M.setDelegate(su0Var);
                            vu0Var3.M.e();
                        }
                        vu0Var3.v[b12] = editable;
                        vu0.c0(vu0Var3, su0Var, b12);
                        vu0Var3.i0();
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
                editText.post(new lq(this, editText, (AtomicReference) this.c, 25));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public /* synthetic */ c0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public c0(d0 d0Var) {
        this.a = 0;
        this.c = d0Var;
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
