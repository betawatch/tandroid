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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bo implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public Object c;

    public /* synthetic */ bo(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        s4.e1 T;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                go goVar = ((eo) obj).d;
                ao aoVar = (ao) this.c;
                if (aoVar.getTag() == null) {
                    s4.e1 K = goVar.s.K(goVar.p0);
                    if (K != null && goVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, aoVar.getEditField().getPaint().getFontMetricsInt(), false);
                        goVar.x.setDirection(1);
                        goVar.x.setDelegate(aoVar);
                        goVar.x.setTranslationY(K.a.getY());
                        goVar.x.e();
                    }
                    goVar.P = editable;
                    if (K != null) {
                        go.O(goVar, K.a, goVar.p0);
                    }
                    goVar.W();
                    break;
                }
                break;
            case 1:
                go goVar2 = ((eo) obj).d;
                org.telegram.ui.bb1 bb1Var = goVar2.s;
                co coVar = (co) this.c;
                View F = bb1Var.F(coVar);
                T = F != null ? bb1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i11 = b10 - goVar2.t0;
                    if (i11 >= 0 && i11 < goVar2.K.length) {
                        if (goVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, coVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                goVar2.x.setDirection(0);
                                goVar2.x.setTranslationY(y3);
                            } else {
                                goVar2.x.setDirection(1);
                                goVar2.x.setTranslationY(view.getY());
                            }
                            goVar2.x.setDelegate(coVar);
                            goVar2.x.e();
                        }
                        goVar2.K[i11] = editable;
                        go.O(goVar2, coVar, b10);
                        goVar2.W();
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
                org.telegram.ui.ov0 ov0Var = ((org.telegram.ui.mv0) obj).d;
                org.telegram.ui.jv0 jv0Var = (org.telegram.ui.jv0) this.c;
                if (jv0Var.getTag() == null) {
                    s4.e1 K2 = ov0Var.c.K(ov0Var.i0);
                    if (K2 != null && ov0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, jv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        ov0Var.Q.setDirection(1);
                        ov0Var.Q.setDelegate(jv0Var);
                        ov0Var.Q.setTranslationY(K2.a.getY());
                        ov0Var.Q.e();
                    }
                    ov0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.ov0.d0(ov0Var, K2.a, ov0Var.i0);
                    }
                    ov0Var.j0();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ov0 ov0Var2 = ((org.telegram.ui.mv0) obj).d;
                org.telegram.ui.kv0 kv0Var = (org.telegram.ui.kv0) this.c;
                if (kv0Var.getTag() == null) {
                    s4.e1 K3 = ov0Var2.c.K(ov0Var2.i0);
                    if (K3 != null && ov0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, kv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        ov0Var2.Q.setDirection(1);
                        ov0Var2.Q.setDelegate(kv0Var);
                        ov0Var2.Q.setTranslationY(K3.a.getY());
                        ov0Var2.Q.e();
                    }
                    ov0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.ov0.d0(ov0Var2, K3.a, ov0Var2.j0);
                    }
                    ov0Var2.j0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.ov0 ov0Var3 = ((org.telegram.ui.mv0) obj).d;
                org.telegram.ui.bb1 bb1Var2 = ov0Var3.c;
                org.telegram.ui.lv0 lv0Var = (org.telegram.ui.lv0) this.c;
                View F2 = bb1Var2.F(lv0Var);
                T = F2 != null ? bb1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - ov0Var3.n0;
                    if (b11 >= 0 && b11 < ov0Var3.v.length) {
                        if (ov0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, lv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                ov0Var3.Q.setDirection(0);
                                ov0Var3.Q.setTranslationY(y10);
                            } else {
                                ov0Var3.Q.setDirection(1);
                                ov0Var3.Q.setTranslationY(view2.getY());
                            }
                            ov0Var3.Q.setDelegate(lv0Var);
                            ov0Var3.Q.e();
                        }
                        ov0Var3.v[b11] = editable;
                        org.telegram.ui.ov0.d0(ov0Var3, lv0Var, b11);
                        ov0Var3.j0();
                        break;
                    }
                }
                break;
            case 7:
                rg.w wVar = (rg.w) obj;
                rg.y yVar = wVar.f;
                if (!wVar.e && ((String) this.c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.c).toString(), editable.toString())) {
                    int b12 = a8.ee.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = wVar.d;
                    int argb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(yVar.f), b12, Color.green(yVar.f), Color.blue(yVar.f)) : Color.argb(Color.alpha(yVar.f), Color.red(yVar.f), Color.green(yVar.f), b12) : Color.argb(Color.alpha(yVar.f), Color.red(yVar.f), b12, Color.blue(yVar.f));
                    int i13 = rg.y.s;
                    yVar.m(argb, 5);
                    break;
                }
                break;
            case 8:
                ((String[]) this.c)[0] = editable.toString();
                ((zh.g3) obj).g3.O(true);
                break;
            case 9:
                ((String[]) this.c)[0] = editable.toString();
                ((zh.e3) obj).g3.O(true);
                break;
            case 10:
                ((String[]) this.c)[0] = editable.toString();
                ((zh.f3) obj).g3.O(true);
                break;
            case 11:
                ((String[]) this.c)[0] = editable.toString();
                ((zh.b4) obj).g3.O(true);
                break;
            case 12:
                ((String[]) this.c)[0] = editable.toString();
                ((zh.c4) obj).g3.O(true);
                break;
            default:
                ((String[]) this.c)[0] = editable.toString();
                ((zh.d4) obj).g3.O(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                EditText editText = (EditText) this.c;
                editText.post(new org.telegram.ui.pq(this, editText, (AtomicReference) this.b, 28));
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

    public /* synthetic */ bo(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public bo(rg.w wVar) {
        this.a = 7;
        this.b = wVar;
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
