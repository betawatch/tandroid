package og;

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
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.wn;
import org.telegram.ui.Components.xn;
import org.telegram.ui.Components.zn;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.bw0;
import org.telegram.ui.ic1;
import org.telegram.ui.wv0;
import org.telegram.ui.xv0;
import org.telegram.ui.yv0;
import org.telegram.ui.zq;
import org.telegram.ui.zv0;
import wh.b4;
import wh.c4;
import wh.d3;
import wh.d4;
import wh.e3;
import wh.f3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class x implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        s4.c1 T;
        int i10 = this.a;
        Object obj = this.c;
        switch (i10) {
            case 0:
                y yVar = (y) obj;
                a0 a0Var = yVar.f;
                if (!yVar.e && ((String) this.b) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.b).toString(), editable.toString())) {
                    int b10 = w7.q.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i11 = yVar.d;
                    int argb = i11 != 1 ? i11 != 2 ? Color.argb(Color.alpha(a0Var.f), b10, Color.green(a0Var.f), Color.blue(a0Var.f)) : Color.argb(Color.alpha(a0Var.f), Color.red(a0Var.f), Color.green(a0Var.f), b10) : Color.argb(Color.alpha(a0Var.f), Color.red(a0Var.f), b10, Color.blue(a0Var.f));
                    int i12 = a0.s;
                    a0Var.m(argb, 5);
                    break;
                }
                break;
            case 1:
                zn znVar = ((xn) obj).d;
                vn vnVar = (vn) this.b;
                if (vnVar.getTag() == null) {
                    s4.c1 K = znVar.s.K(znVar.p0);
                    if (K != null && znVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, vnVar.getEditField().getPaint().getFontMetricsInt(), false);
                        znVar.x.setDirection(1);
                        znVar.x.setDelegate(vnVar);
                        znVar.x.setTranslationY(K.a.getY());
                        znVar.x.e();
                    }
                    znVar.P = editable;
                    if (K != null) {
                        zn.L(znVar, K.a, znVar.p0);
                    }
                    znVar.T();
                    break;
                }
                break;
            case 2:
                zn znVar2 = ((xn) obj).d;
                ic1 ic1Var = znVar2.s;
                wn wnVar = (wn) this.b;
                View F = ic1Var.F(wnVar);
                T = F != null ? ic1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b11 = T.b();
                    int i13 = b11 - znVar2.t0;
                    if (i13 >= 0 && i13 < znVar2.K.length) {
                        if (znVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, wnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                znVar2.x.setDirection(0);
                                znVar2.x.setTranslationY(y3);
                            } else {
                                znVar2.x.setDirection(1);
                                znVar2.x.setTranslationY(view.getY());
                            }
                            znVar2.x.setDelegate(wnVar);
                            znVar2.x.e();
                        }
                        znVar2.K[i13] = editable;
                        zn.L(znVar2, wnVar, b11);
                        znVar2.T();
                        break;
                    }
                }
                break;
            case 3:
                break;
            case 4:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (passcodeActivity.x == 1 && passcodeActivity.E == 0) {
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
            case 5:
                bw0 bw0Var = ((zv0) obj).d;
                wv0 wv0Var = (wv0) this.b;
                if (wv0Var.getTag() == null) {
                    s4.c1 K2 = bw0Var.c.K(bw0Var.i0);
                    if (K2 != null && bw0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, wv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        bw0Var.Q.setDirection(1);
                        bw0Var.Q.setDelegate(wv0Var);
                        bw0Var.Q.setTranslationY(K2.a.getY());
                        bw0Var.Q.e();
                    }
                    bw0Var.E = editable;
                    if (K2 != null) {
                        bw0.c0(bw0Var, K2.a, bw0Var.i0);
                    }
                    bw0Var.i0();
                    break;
                }
                break;
            case 6:
                bw0 bw0Var2 = ((zv0) obj).d;
                xv0 xv0Var = (xv0) this.b;
                if (xv0Var.getTag() == null) {
                    s4.c1 K3 = bw0Var2.c.K(bw0Var2.i0);
                    if (K3 != null && bw0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, xv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        bw0Var2.Q.setDirection(1);
                        bw0Var2.Q.setDelegate(xv0Var);
                        bw0Var2.Q.setTranslationY(K3.a.getY());
                        bw0Var2.Q.e();
                    }
                    bw0Var2.F = editable;
                    if (K3 != null) {
                        bw0.c0(bw0Var2, K3.a, bw0Var2.j0);
                    }
                    bw0Var2.i0();
                    break;
                }
                break;
            case 7:
                bw0 bw0Var3 = ((zv0) obj).d;
                ic1 ic1Var2 = bw0Var3.c;
                yv0 yv0Var = (yv0) this.b;
                View F2 = ic1Var2.F(yv0Var);
                T = F2 != null ? ic1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b12 = T.b() - bw0Var3.n0;
                    if (b12 >= 0 && b12 < bw0Var3.v.length) {
                        if (bw0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, yv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                bw0Var3.Q.setDirection(0);
                                bw0Var3.Q.setTranslationY(y10);
                            } else {
                                bw0Var3.Q.setDirection(1);
                                bw0Var3.Q.setTranslationY(view2.getY());
                            }
                            bw0Var3.Q.setDelegate(yv0Var);
                            bw0Var3.Q.e();
                        }
                        bw0Var3.v[b12] = editable;
                        bw0.c0(bw0Var3, yv0Var, b12);
                        bw0Var3.i0();
                        break;
                    }
                }
                break;
            case 8:
                ((String[]) this.b)[0] = editable.toString();
                ((f3) obj).Y2.N(true);
                break;
            case 9:
                ((String[]) this.b)[0] = editable.toString();
                ((d3) obj).Y2.N(true);
                break;
            case 10:
                ((String[]) this.b)[0] = editable.toString();
                ((e3) obj).Y2.N(true);
                break;
            case 11:
                ((String[]) this.b)[0] = editable.toString();
                ((b4) obj).Y2.N(true);
                break;
            case 12:
                ((String[]) this.b)[0] = editable.toString();
                ((c4) obj).Y2.N(true);
                break;
            default:
                ((String[]) this.b)[0] = editable.toString();
                ((d4) obj).Y2.N(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                this.b = charSequence.toString();
                break;
            case 3:
                EditText editText = (EditText) this.b;
                editText.post(new zq(this, editText, (AtomicReference) this.c, 25));
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.a;
    }

    public /* synthetic */ x(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public x(y yVar) {
        this.a = 0;
        this.c = yVar;
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
