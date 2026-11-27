// default package

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class es1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ es1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a aVar;
        d79 d79Var;
        wa waVar;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                aVar = ((e) ((fs1) obj).d).actionBar;
                aVar.invalidate();
                break;
            case 1:
                s42 s42Var = (s42) obj;
                y10 y10Var = s42Var.b.U2;
                r3 = y10Var != null ? y10Var.getAlpha() : 0.0f;
                if (r3 != s42Var.A0) {
                    s42Var.A0 = r3;
                    s42Var.g0();
                    break;
                }
                break;
            case 2:
                Field field = EditTextBoldCursor.F1;
                cl4 cl4Var = ((EditTextBoldCursor) obj).Z0;
                if (cl4Var != null) {
                    cl4Var.c();
                    break;
                }
                break;
            case 3:
                ((bu5) obj).invalidate();
                break;
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.U3();
                profileActivity.V3();
                break;
            case 5:
                wka wkaVar = (wka) obj;
                if (wkaVar.a && wkaVar.b > 0) {
                    wkaVar.f("PRE_DRAW_BEFORE", null, 0, 0, true);
                }
                wkaVar.s();
                if (wkaVar.h0 && (d79Var = wkaVar.F) != null && !d79Var.e0()) {
                    float p = wkaVar.p();
                    if (!Float.isInfinite(p)) {
                        wkaVar.h0 = false;
                        wkaVar.u(wkaVar.F, Math.round(p - wkaVar.V));
                        wkaVar.C();
                    }
                }
                if (wkaVar.a && wkaVar.b > 0) {
                    wkaVar.f("PRE_DRAW_AFTER", null, 0, 0, true);
                    wkaVar.b--;
                    wkaVar.c++;
                    break;
                }
                break;
            case 6:
                ((w1b) obj).s0();
                break;
            case 7:
                uqc uqcVar = (uqc) ((iy9) obj).c;
                if (uqcVar.G) {
                    uqcVar.W0();
                    break;
                }
                break;
            case 8:
                jqc jqcVar = (jqc) obj;
                uqc uqcVar2 = jqcVar.e;
                if (uqcVar2.a0 != null && (waVar = uqcVar2.a) != null) {
                    boolean z = uqcVar2.r0 && !waVar.canScrollVertically(1);
                    if (uqcVar2.c0 != z) {
                        uqcVar2.c0 = z;
                        uqcVar2.a0.animate().cancel();
                        p66 p66Var = uqcVar2.a0;
                        if (z) {
                            p66Var.setVisibility(0);
                            uqcVar2.a0.animate().alpha(1.0f).setDuration(180L).setInterpolator(k43.g).start();
                        } else {
                            p66Var.setAlpha(0.0f);
                            uqcVar2.a0.setVisibility(4);
                        }
                    }
                }
                uqcVar2.e1();
                View m = uqcVar2.a.f3.m(uqcVar2.h);
                if (m != null) {
                    r3 = m.getY();
                    i = m.getHeight();
                }
                if (m != jqcVar.a || r3 != jqcVar.b || i != jqcVar.c) {
                    jqcVar.a = m;
                    jqcVar.b = r3;
                    jqcVar.c = i;
                    uqcVar2.X0();
                    break;
                }
                break;
            case 9:
                wsc wscVar = (wsc) obj;
                frc frcVar = wscVar.c;
                float cardRotationX = frcVar.getCardRotationX();
                float cardRotationY = frcVar.getCardRotationY();
                if (cardRotationX != wscVar.b0 || cardRotationY != wscVar.c0) {
                    wscVar.b0 = cardRotationX;
                    wscVar.c0 = cardRotationY;
                    wscVar.M.invalidate();
                    break;
                }
                break;
            default:
                euc eucVar = (euc) ((g7) obj).c;
                g7 g7Var = eucVar.x;
                if (g7Var != null && eucVar.a0 != null && g7Var.getHeight() > 0 && eucVar.a0.getHeight() > 0) {
                    float paddingTop = eucVar.fragmentView.getPaddingTop();
                    if (eucVar.w.getVisibility() == 0) {
                        paddingTop = Math.max(paddingTop, (eucVar.w.getScaleY() * (eucVar.w.getContentBottom() - eucVar.w.getPivotY())) + eucVar.w.getPivotY() + eucVar.w.getY());
                    }
                    float max = Math.max(0.0f, Math.min(eucVar.fragmentView.getHeight() - eucVar.fragmentView.getPaddingBottom(), eucVar.a0.getY()) - paddingTop);
                    float min = Math.min(1.0f, Math.max(0.0f, max - (Math.min(hl.L(12.0f), max / 4.0f) * 2.0f)) / eucVar.x.getHeight());
                    eucVar.x.setPivotX(r5.getWidth() / 2.0f);
                    eucVar.x.setPivotY(r5.getHeight() / 2.0f);
                    eucVar.x.setScaleX(min);
                    eucVar.x.setScaleY(min);
                    eucVar.x.setTranslationY((((max / 2.0f) + paddingTop) - r3.getTop()) - (eucVar.x.getHeight() / 2.0f));
                }
                if (eucVar.b0 != null || eucVar.c0 < 1.0f) {
                    eucVar.G0();
                    break;
                }
                break;
        }
        return true;
    }
}
