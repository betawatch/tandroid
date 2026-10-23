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
import org.telegram.ui.sa1;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ao implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public Object c;

    public /* synthetic */ ao(int i10, Object obj, Object obj2) {
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
                fo foVar = ((co) obj).d;
                zn znVar = (zn) this.c;
                if (znVar.getTag() == null) {
                    s4.b1 K = foVar.s.K(foVar.p0);
                    if (K != null && foVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, znVar.getEditField().getPaint().getFontMetricsInt(), false);
                        foVar.x.setDirection(1);
                        foVar.x.setDelegate(znVar);
                        foVar.x.setTranslationY(K.a.getY());
                        foVar.x.e();
                    }
                    foVar.P = editable;
                    if (K != null) {
                        fo.O(foVar, K.a, foVar.p0);
                    }
                    foVar.W();
                    break;
                }
                break;
            case 1:
                fo foVar2 = ((co) obj).d;
                sa1 sa1Var = foVar2.s;
                bo boVar = (bo) this.c;
                View F = sa1Var.F(boVar);
                T = F != null ? sa1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i11 = b10 - foVar2.t0;
                    if (i11 >= 0 && i11 < foVar2.K.length) {
                        if (foVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, boVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                foVar2.x.setDirection(0);
                                foVar2.x.setTranslationY(y3);
                            } else {
                                foVar2.x.setDirection(1);
                                foVar2.x.setTranslationY(view.getY());
                            }
                            foVar2.x.setDelegate(boVar);
                            foVar2.x.e();
                        }
                        foVar2.K[i11] = editable;
                        fo.O(foVar2, boVar, b10);
                        foVar2.W();
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
                org.telegram.ui.fv0 fv0Var = ((org.telegram.ui.dv0) obj).d;
                org.telegram.ui.av0 av0Var = (org.telegram.ui.av0) this.c;
                if (av0Var.getTag() == null) {
                    s4.b1 K2 = fv0Var.c.K(fv0Var.i0);
                    if (K2 != null && fv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, av0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fv0Var.Q.setDirection(1);
                        fv0Var.Q.setDelegate(av0Var);
                        fv0Var.Q.setTranslationY(K2.a.getY());
                        fv0Var.Q.e();
                    }
                    fv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.fv0.c0(fv0Var, K2.a, fv0Var.i0);
                    }
                    fv0Var.i0();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.fv0 fv0Var2 = ((org.telegram.ui.dv0) obj).d;
                org.telegram.ui.bv0 bv0Var = (org.telegram.ui.bv0) this.c;
                if (bv0Var.getTag() == null) {
                    s4.b1 K3 = fv0Var2.c.K(fv0Var2.i0);
                    if (K3 != null && fv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, bv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        fv0Var2.Q.setDirection(1);
                        fv0Var2.Q.setDelegate(bv0Var);
                        fv0Var2.Q.setTranslationY(K3.a.getY());
                        fv0Var2.Q.e();
                    }
                    fv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.fv0.c0(fv0Var2, K3.a, fv0Var2.j0);
                    }
                    fv0Var2.i0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.fv0 fv0Var3 = ((org.telegram.ui.dv0) obj).d;
                sa1 sa1Var2 = fv0Var3.c;
                org.telegram.ui.cv0 cv0Var = (org.telegram.ui.cv0) this.c;
                View F2 = sa1Var2.F(cv0Var);
                T = F2 != null ? sa1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - fv0Var3.n0;
                    if (b11 >= 0 && b11 < fv0Var3.v.length) {
                        if (fv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, cv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                fv0Var3.Q.setDirection(0);
                                fv0Var3.Q.setTranslationY(y10);
                            } else {
                                fv0Var3.Q.setDirection(1);
                                fv0Var3.Q.setTranslationY(view2.getY());
                            }
                            fv0Var3.Q.setDelegate(cv0Var);
                            fv0Var3.Q.e();
                        }
                        fv0Var3.v[b11] = editable;
                        org.telegram.ui.fv0.c0(fv0Var3, cv0Var, b11);
                        fv0Var3.i0();
                        break;
                    }
                }
                break;
            case 7:
                qg.w wVar = (qg.w) obj;
                qg.y yVar = wVar.f;
                if (!wVar.e && ((String) this.c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.c).toString(), editable.toString())) {
                    int b12 = w7.r.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = wVar.d;
                    int argb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(yVar.f), b12, Color.green(yVar.f), Color.blue(yVar.f)) : Color.argb(Color.alpha(yVar.f), Color.red(yVar.f), Color.green(yVar.f), b12) : Color.argb(Color.alpha(yVar.f), Color.red(yVar.f), b12, Color.blue(yVar.f));
                    int i13 = qg.y.s;
                    yVar.n(argb, 5);
                    break;
                }
                break;
            case 8:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.e3) obj).W2.N(true);
                break;
            case 9:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.c3) obj).W2.N(true);
                break;
            case 10:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.d3) obj).W2.N(true);
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
                editText.post(new org.telegram.ui.jq(this, editText, (AtomicReference) this.b, 26));
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

    public /* synthetic */ ao(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public ao(qg.w wVar) {
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
