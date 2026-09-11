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
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class pn implements TextWatcher {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public Object c;

    public /* synthetic */ pn(int i10, Object obj, Object obj2) {
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
                tn tnVar = ((rn) obj).d;
                on onVar = (on) this.c;
                if (onVar.getTag() == null) {
                    s4.c1 K = tnVar.s.K(tnVar.p0);
                    if (K != null && tnVar.x != null) {
                        for (ImageSpan imageSpan : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan);
                        }
                        Emoji.replaceEmoji(editable, onVar.getEditField().getPaint().getFontMetricsInt(), false);
                        tnVar.x.setDirection(1);
                        tnVar.x.setDelegate(onVar);
                        tnVar.x.setTranslationY(K.a.getY());
                        tnVar.x.e();
                    }
                    tnVar.P = editable;
                    if (K != null) {
                        tn.L(tnVar, K.a, tnVar.p0);
                    }
                    tnVar.T();
                    break;
                }
                break;
            case 1:
                tn tnVar2 = ((rn) obj).d;
                ec1 ec1Var = tnVar2.s;
                qn qnVar = (qn) this.c;
                View F = ec1Var.F(qnVar);
                T = F != null ? ec1Var.T(F) : null;
                if (T != null) {
                    View view = T.a;
                    int b10 = T.b();
                    int i11 = b10 - tnVar2.t0;
                    if (i11 >= 0 && i11 < tnVar2.K.length) {
                        if (tnVar2.x != null) {
                            for (ImageSpan imageSpan2 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan2);
                            }
                            Emoji.replaceEmoji(editable, qnVar.getEditField().getPaint().getFontMetricsInt(), false);
                            float y3 = (view.getY() - AndroidUtilities.dp(166.0f)) + view.getMeasuredHeight();
                            if (y3 > 0.0f) {
                                tnVar2.x.setDirection(0);
                                tnVar2.x.setTranslationY(y3);
                            } else {
                                tnVar2.x.setDirection(1);
                                tnVar2.x.setTranslationY(view.getY());
                            }
                            tnVar2.x.setDelegate(qnVar);
                            tnVar2.x.e();
                        }
                        tnVar2.K[i11] = editable;
                        tn.L(tnVar2, qnVar, b10);
                        tnVar2.T();
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
                org.telegram.ui.zv0 zv0Var = ((org.telegram.ui.xv0) obj).d;
                org.telegram.ui.uv0 uv0Var = (org.telegram.ui.uv0) this.c;
                if (uv0Var.getTag() == null) {
                    s4.c1 K2 = zv0Var.c.K(zv0Var.i0);
                    if (K2 != null && zv0Var.Q != null) {
                        for (ImageSpan imageSpan3 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan3);
                        }
                        Emoji.replaceEmoji(editable, uv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zv0Var.Q.setDirection(1);
                        zv0Var.Q.setDelegate(uv0Var);
                        zv0Var.Q.setTranslationY(K2.a.getY());
                        zv0Var.Q.e();
                    }
                    zv0Var.E = editable;
                    if (K2 != null) {
                        org.telegram.ui.zv0.c0(zv0Var, K2.a, zv0Var.i0);
                    }
                    zv0Var.i0();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.zv0 zv0Var2 = ((org.telegram.ui.xv0) obj).d;
                org.telegram.ui.vv0 vv0Var = (org.telegram.ui.vv0) this.c;
                if (vv0Var.getTag() == null) {
                    s4.c1 K3 = zv0Var2.c.K(zv0Var2.i0);
                    if (K3 != null && zv0Var2.Q != null) {
                        for (ImageSpan imageSpan4 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                            editable.removeSpan(imageSpan4);
                        }
                        Emoji.replaceEmoji(editable, vv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                        zv0Var2.Q.setDirection(1);
                        zv0Var2.Q.setDelegate(vv0Var);
                        zv0Var2.Q.setTranslationY(K3.a.getY());
                        zv0Var2.Q.e();
                    }
                    zv0Var2.F = editable;
                    if (K3 != null) {
                        org.telegram.ui.zv0.c0(zv0Var2, K3.a, zv0Var2.j0);
                    }
                    zv0Var2.i0();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.zv0 zv0Var3 = ((org.telegram.ui.xv0) obj).d;
                ec1 ec1Var2 = zv0Var3.c;
                org.telegram.ui.wv0 wv0Var = (org.telegram.ui.wv0) this.c;
                View F2 = ec1Var2.F(wv0Var);
                T = F2 != null ? ec1Var2.T(F2) : null;
                if (T != null) {
                    View view2 = T.a;
                    int b11 = T.b() - zv0Var3.n0;
                    if (b11 >= 0 && b11 < zv0Var3.v.length) {
                        if (zv0Var3.Q != null) {
                            for (ImageSpan imageSpan5 : (ImageSpan[]) editable.getSpans(0, editable.length(), ImageSpan.class)) {
                                editable.removeSpan(imageSpan5);
                            }
                            Emoji.replaceEmoji(editable, wv0Var.getEditField().getPaint().getFontMetricsInt(), false);
                            float y10 = (view2.getY() - AndroidUtilities.dp(166.0f)) + view2.getMeasuredHeight();
                            if (y10 > 0.0f) {
                                zv0Var3.Q.setDirection(0);
                                zv0Var3.Q.setTranslationY(y10);
                            } else {
                                zv0Var3.Q.setDirection(1);
                                zv0Var3.Q.setTranslationY(view2.getY());
                            }
                            zv0Var3.Q.setDelegate(wv0Var);
                            zv0Var3.Q.e();
                        }
                        zv0Var3.v[b11] = editable;
                        org.telegram.ui.zv0.c0(zv0Var3, wv0Var, b11);
                        zv0Var3.i0();
                        break;
                    }
                }
                break;
            case 7:
                qg.v vVar = (qg.v) obj;
                qg.x xVar = vVar.f;
                if (!vVar.e && ((String) this.c) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.c).toString(), editable.toString())) {
                    int b12 = w7.p.b(Integer.parseInt(editable.toString()), 0, 255);
                    int i12 = vVar.d;
                    int argb = i12 != 1 ? i12 != 2 ? Color.argb(Color.alpha(xVar.f), b12, Color.green(xVar.f), Color.blue(xVar.f)) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), Color.green(xVar.f), b12) : Color.argb(Color.alpha(xVar.f), Color.red(xVar.f), b12, Color.blue(xVar.f));
                    int i13 = qg.x.s;
                    xVar.m(argb, 5);
                    break;
                }
                break;
            case 8:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.f3) obj).Y2.N(true);
                break;
            case 9:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.d3) obj).Y2.N(true);
                break;
            case 10:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.e3) obj).Y2.N(true);
                break;
            case 11:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.a4) obj).Y2.N(true);
                break;
            case 12:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.b4) obj).Y2.N(true);
                break;
            default:
                ((String[]) this.c)[0] = editable.toString();
                ((yh.c4) obj).Y2.N(true);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                EditText editText = (EditText) this.c;
                editText.post(new org.telegram.ui.yq(this, editText, (AtomicReference) this.b, 25));
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

    public /* synthetic */ pn(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public pn(qg.v vVar) {
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
