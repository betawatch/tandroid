// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                h0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h0Var.requestLayout();
                break;
            case 1:
                w7 w7Var = (w7) obj;
                w7Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w7Var.invalidate();
                break;
            case 2:
                a8 a8Var = (a8) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a8Var.setTextColor(bm2.f(floatValue, -1, -9194260));
                a8Var.setIconColor(bm2.f(floatValue, -1, -9194260));
                break;
            case 3:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < itemsCount) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                    if (!(childAt instanceof j8)) {
                        float s = gl.s(floatValue2, actionBarPopupWindow$ActionBarPopupWindowLayout.w ? (itemsCount - 1) - i : i, itemsCount, 4.0f);
                        childAt.setTranslationY((1.0f - s) * gl.L(-6.0f));
                        childAt.setAlpha(s * (childAt.isEnabled() ? 1.0f : 0.5f));
                    }
                    i++;
                }
                break;
            case 4:
                gb gbVar = (gb) obj;
                if (!gbVar.e) {
                    float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (gbVar.r) {
                        floatValue3 = 1.0f - floatValue3;
                    }
                    float A = (int) tb4.A(1.0f, floatValue3, gbVar.q, gbVar.p * floatValue3);
                    if (!(gbVar instanceof y72)) {
                        gbVar.a.setTranslationY(A);
                    }
                    gbVar.e(-A, floatValue3, gbVar.s);
                    break;
                }
                break;
            case 5:
                gn gnVar = (gn) obj;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gnVar.q = floatValue4;
                s33 s33Var = gnVar.x;
                if (s33Var != null) {
                    floatValue4 = s33Var.getInterpolation(floatValue4);
                }
                gnVar.r = floatValue4;
                gnVar.invalidateSelf();
                Runnable runnable = gnVar.c0;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 6:
                ((nr) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                cw cwVar = (cw) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cwVar.d.setTextColor(bm2.f(floatValue5, -16777216, -1));
                cwVar.e.setTextColor(bm2.f(floatValue5, -16777216, -1));
                cwVar.f.setTextColor(bm2.f(floatValue5, -16777216, -1));
                break;
            case 8:
                xx xxVar = (xx) obj;
                xxVar.a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                xxVar.invalidate();
                break;
            case 9:
                i20 i20Var = (i20) obj;
                i20Var.C1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                i20Var.F1.setCustomPaddingRight(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 10:
                ((mb0) obj).n0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 11:
                qb0 qb0Var = (qb0) obj;
                float S1 = gl.S1(valueAnimator.getAnimatedFraction(), qb0Var.n);
                int i2 = (int) (255.0f * S1);
                qb0Var.f.setAlpha(i2);
                qb0Var.h.setAlpha(i2);
                qb0Var.r.setAlpha((int) (66.0f * S1));
                qb0Var.s.setAlpha((int) (85.0f * S1));
                qb0Var.w.setAlpha(i2);
                qb0Var.H = S1;
                qb0Var.invalidate();
                break;
            case 12:
                gc0 gc0Var = (gc0) obj;
                gc0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gc0Var.d();
                break;
            case 13:
                ch0 ch0Var = (ch0) obj;
                ch0Var.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ch0Var.invalidateSelf();
                break;
            case 14:
                wl0 wl0Var = (wl0) obj;
                wl0Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wl0Var.b.invalidate();
                break;
            case 15:
                mm0 mm0Var = (mm0) obj;
                mm0Var.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mm0Var.invalidate();
                break;
            case 16:
                wo0 wo0Var = (wo0) obj;
                wo0Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wo0Var.a.run();
                break;
            case 17:
                kr0 kr0Var = (kr0) obj;
                kr0Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kr0Var.r.setTranslationY(gl.U1(kr0Var.x, -gl.L(42.0f), 0));
                kr0Var.n.setTranslationY(gl.U1(kr0Var.x, 0, gl.L(42.0f)));
                break;
            case 18:
                ml mlVar = (ml) obj;
                ((kb0) mlVar.L1).a.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                mlVar.invalidate();
                break;
            case 19:
                qx0 qx0Var = (qx0) obj;
                qx0Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = qx0Var.J.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                qx0Var.invalidate();
                break;
            case 20:
                xx0 xx0Var = (xx0) obj;
                xx0Var.i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xx0Var.b.invalidate();
                break;
            case 21:
                n41 n41Var = (n41) obj;
                n41Var.j = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n41Var.b();
                break;
            case 22:
                b81 b81Var = (b81) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                while (i < b81Var.b.getChildCount()) {
                    y71 y71Var = (y71) b81Var.b.getChildAt(i);
                    int i3 = y71.E;
                    y71Var.b(floatValue6);
                    i++;
                }
                break;
            case 23:
                ((CameraView) obj).lambda$showTexture$6(valueAnimator);
                break;
            case 24:
                ib1 ib1Var = (ib1) obj;
                ib1Var.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cb1 cb1Var = ib1Var.f;
                cb1Var.getEditText().setTranslationX(gl.U1(ib1Var.o0, ib1Var.getEditTextLeft() + gl.L(-26.0f), gl.L(2.0f)));
                FrameLayout frameLayout = ib1Var.s;
                frameLayout.setTranslationX(gl.U1(ib1Var.o0, -gl.L(8.0f), gl.L(2.0f)));
                frameLayout.setTranslationY(gl.U1(ib1Var.o0, -gl.L(8.0f), 0));
                cb1Var.getEmojiButton().setAlpha(ib1Var.o0);
                ib1Var.r.setAlpha((float) Math.pow(ib1Var.o0, 16.0d));
                ib1Var.u(ib1Var.o0);
                eb1 eb1Var = ib1Var.N;
                if (eb1Var != null) {
                    eb1Var.setAlpha((float) Math.pow(ib1Var.o0, 4.0d));
                }
                cb1Var.getEditText().invalidate();
                ib1Var.invalidate();
                break;
            case 25:
                yh1 yh1Var = (yh1) obj;
                yh1Var.b.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                yh1Var.b.invalidateSelf();
                break;
            case 26:
                jk1 jk1Var = (jk1) obj;
                jk1Var.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jk1Var.g.a.invalidate();
                break;
            case 27:
                ((m33) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                sr1 sr1Var = (sr1) obj;
                sr1Var.setBubbleOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
                sr1Var.invalidate();
                break;
            default:
                ((ky1) obj).g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
