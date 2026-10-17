package ah;

import ai.d6;
import ai.he;
import ai.k7;
import ai.p7;
import ai.v5;
import ai.w5;
import ai.yc;
import ai.zc;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.c6;
import ci.j5;
import ci.l7;
import ci.m4;
import ci.m7;
import ci.n2;
import ci.p1;
import ci.r8;
import ci.x1;
import ei.k6;
import ei.l4;
import ei.s2;
import ei.u3;
import ei.x3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.qz0;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        v5 v5Var;
        boolean z10;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e0 e0Var = f0Var.b;
                if (e0Var != null) {
                    e0Var.setAlpha(floatValue);
                    break;
                }
                break;
            case 1:
                k7 k7Var = (k7) this.b;
                k7Var.b1.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k7Var.g2();
                break;
            case 2:
                ((d6) this.b).h.invalidate();
                break;
            case 3:
                w5 w5Var = (w5) this.b;
                w5Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (v5Var = w5Var.H) != null && (z10 = v5Var.l) && z10) {
                    v5Var.l = false;
                    v5Var.b();
                }
                w5Var.invalidate();
                break;
            case 4:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 5:
                p7 p7Var = (p7) this.b;
                p7Var.getClass();
                p7Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p7Var.invalidate();
                break;
            case 6:
                zc zcVar = (zc) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc ycVar = zcVar.c;
                ycVar.setScaleX(floatValue3);
                ycVar.setScaleY(floatValue3);
                break;
            case 7:
                he heVar = (he) this.b;
                heVar.getClass();
                heVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                heVar.invalidate();
                break;
            case 8:
                ci.a aVar = (ci.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 9:
                ci.q qVar = (ci.q) this.b;
                qVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                break;
            case 10:
                ((ci.x0) this.b).invalidate();
                break;
            case 11:
                n2 n2Var = (n2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n2Var.c.setAlpha(floatValue4);
                n2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                n2Var.invalidate();
                break;
            case 12:
                ci.q0 q0Var = (ci.q0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = q0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(q0Var.f, 1.0f, floatValue5) * 255.0f));
                    q0Var.h.invalidate();
                    break;
                }
                break;
            case 13:
                b bVar = (b) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.q0 q0Var2 = (ci.q0) bVar.b;
                Drawable drawable2 = q0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, q0Var2.f, floatValue6) * 255.0f));
                    q0Var2.h.invalidate();
                    break;
                }
                break;
            case 14:
                p1 p1Var = (p1) this.b;
                p1Var.getClass();
                p1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                x1 x1Var = (x1) this.b;
                x1Var.getClass();
                x1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x1Var.invalidate();
                break;
            case 16:
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
            case 17:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                qz0 qz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                qz0Var.R = floatValue8;
                qz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 18:
                j5 j5Var = (j5) this.b;
                j5Var.r = ((Float) j5Var.w.getAnimatedValue()).floatValue();
                j5Var.invalidate();
                break;
            case 19:
                c6 c6Var = (c6) this.b;
                c6Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c6Var.e.setTranslationY(((-c6Var.d) + c6Var.getMeasuredHeight()) - c6Var.v);
                break;
            case 20:
                m7 m7Var = (m7) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = m7Var.a;
                l7 l7Var = (l7) arrayList.get(m7Var.d);
                l7Var.n = floatValue9;
                l7Var.invalidate();
                int i10 = m7Var.c;
                if (i10 != -1) {
                    l7 l7Var2 = (l7) arrayList.get(i10);
                    l7Var2.n = 1.0f - floatValue9;
                    l7Var2.invalidate();
                    break;
                }
                break;
            case 21:
                r8 r8Var = (r8) this.b;
                r8Var.getClass();
                r8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r8Var.invalidate();
                r8Var.requestLayout();
                r8Var.J.requestLayout();
                break;
            case 22:
                di.v vVar = (di.v) this.b;
                vVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, vVar.w));
                vVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), vVar.w));
                break;
            case 23:
                ei.m mVar = (ei.m) this.b;
                mVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ei.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.o0));
                gVar.getEmojiButton().setAlpha(mVar.o0);
                mVar.r.setAlpha((float) Math.pow(mVar.o0, 16.0d));
                mVar.u(mVar.o0);
                ei.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            case 24:
                ei.y yVar = (ei.y) this.b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.a.invalidate();
                break;
            case 25:
                s2 s2Var = (s2) this.b;
                s2Var.getClass();
                s2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.i();
                break;
            case 26:
                ((u3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 27:
                x3 x3Var = (x3) this.b;
                x3Var.getClass();
                x3Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x3Var.invalidate();
                break;
            case 28:
                ((l4) this.b).invalidate();
                break;
            default:
                k6 k6Var = (k6) this.b;
                k6Var.getClass();
                k6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k6Var.e();
                break;
        }
    }
}
