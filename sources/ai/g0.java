package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.h7;
import bi.m7;
import bi.qc;
import bi.r5;
import bi.rc;
import bi.s5;
import bi.yd;
import bi.z5;
import di.b6;
import di.i5;
import di.k7;
import di.l7;
import di.m2;
import di.m4;
import di.o8;
import fi.q2;
import fi.s3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.yz0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        r5 r5Var;
        boolean z10;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.b;
                o0Var.getClass();
                o0Var.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.invalidate();
                break;
            case 1:
                ((z0) this.b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                bh.x xVar = (bh.x) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh.w wVar = xVar.b;
                if (wVar != null) {
                    wVar.setAlpha(floatValue);
                    break;
                }
                break;
            case 3:
                h7 h7Var = (h7) this.b;
                h7Var.b1.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h7Var.n2();
                break;
            case 4:
                ((z5) this.b).h.invalidate();
                break;
            case 5:
                s5 s5Var = (s5) this.b;
                s5Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s5Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (r5Var = s5Var.H) != null && (z10 = r5Var.l) && z10) {
                    r5Var.l = false;
                    r5Var.b();
                }
                s5Var.invalidate();
                break;
            case 6:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 7:
                m7 m7Var = (m7) this.b;
                m7Var.getClass();
                m7Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m7Var.invalidate();
                break;
            case 8:
                rc rcVar = (rc) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc qcVar = rcVar.c;
                qcVar.setScaleX(floatValue3);
                qcVar.setScaleY(floatValue3);
                break;
            case 9:
                yd ydVar = (yd) this.b;
                ydVar.getClass();
                ydVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ydVar.invalidate();
                break;
            case 10:
                di.a aVar = (di.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 11:
                di.q qVar = (di.q) this.b;
                qVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                break;
            case 12:
                ((di.x0) this.b).invalidate();
                break;
            case 13:
                m2 m2Var = (m2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.c.setAlpha(floatValue4);
                m2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                m2Var.invalidate();
                break;
            case 14:
                di.q0 q0Var = (di.q0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = q0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(q0Var.f, 1.0f, floatValue5) * 255.0f));
                    q0Var.h.invalidate();
                    break;
                }
                break;
            case 15:
                bh.b bVar = (bh.b) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di.q0 q0Var2 = (di.q0) bVar.b;
                Drawable drawable2 = q0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, q0Var2.f, floatValue6) * 255.0f));
                    q0Var2.h.invalidate();
                    break;
                }
                break;
            case 16:
                di.o1 o1Var = (di.o1) this.b;
                o1Var.getClass();
                o1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                di.w1 w1Var = (di.w1) this.b;
                w1Var.getClass();
                w1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.invalidate();
                break;
            case 18:
                m4 m4Var = (m4) this.b;
                m4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = m4Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                break;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                yz0 yz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                yz0Var.R = floatValue8;
                yz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 20:
                i5 i5Var = (i5) this.b;
                i5Var.r = ((Float) i5Var.w.getAnimatedValue()).floatValue();
                i5Var.invalidate();
                break;
            case 21:
                b6 b6Var = (b6) this.b;
                b6Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e.setTranslationY(((-b6Var.d) + b6Var.getMeasuredHeight()) - b6Var.v);
                break;
            case 22:
                l7 l7Var = (l7) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = l7Var.a;
                k7 k7Var = (k7) arrayList.get(l7Var.d);
                k7Var.n = floatValue9;
                k7Var.invalidate();
                int i10 = l7Var.c;
                if (i10 != -1) {
                    k7 k7Var2 = (k7) arrayList.get(i10);
                    k7Var2.n = 1.0f - floatValue9;
                    k7Var2.invalidate();
                    break;
                }
                break;
            case 23:
                o8 o8Var = (o8) this.b;
                o8Var.getClass();
                o8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                o8Var.requestLayout();
                o8Var.J.requestLayout();
                break;
            case 24:
                ei.v vVar = (ei.v) this.b;
                vVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.w));
                vVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.w));
                break;
            case 25:
                fi.m mVar = (fi.m) this.b;
                mVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fi.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.o0));
                gVar.getEmojiButton().setAlpha(mVar.o0);
                mVar.r.setAlpha((float) Math.pow(mVar.o0, 16.0d));
                mVar.u(mVar.o0);
                fi.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            case 26:
                fi.y yVar = (fi.y) this.b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.a.invalidate();
                break;
            case 27:
                q2 q2Var = (q2) this.b;
                q2Var.getClass();
                q2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.i();
                break;
            default:
                ((s3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
