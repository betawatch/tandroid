package ah;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a9;
import bi.b2;
import bi.b9;
import bi.e7;
import bi.ga;
import bi.h3;
import bi.k6;
import bi.l2;
import bi.m5;
import di.ba;
import di.d4;
import di.m7;
import di.n7;
import di.r6;
import di.s4;
import di.s6;
import di.w2;
import di.w8;
import di.x9;
import di.z3;
import java.util.ArrayList;
import ji.y4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                bi.a aVar = (bi.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 2:
                bi.u uVar = (bi.u) this.b;
                uVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - uVar.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                uVar.invalidate();
                break;
            case 3:
                ((bi.g1) this.b).invalidate();
                break;
            case 4:
                h3 h3Var = (h3) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h3Var.c.setAlpha(floatValue2);
                h3Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue2));
                h3Var.invalidate();
                break;
            case 5:
                bi.z0 z0Var = (bi.z0) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = z0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(z0Var.f, 1.0f, floatValue3) * 255.0f));
                    z0Var.h.invalidate();
                    break;
                }
                break;
            case 6:
                b bVar = (b) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bi.z0 z0Var2 = (bi.z0) bVar.b;
                Drawable drawable2 = z0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, z0Var2.f, floatValue4) * 255.0f));
                    z0Var2.h.invalidate();
                    break;
                }
                break;
            case 7:
                b2 b2Var = (b2) this.b;
                b2Var.getClass();
                b2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                l2 l2Var = (l2) this.b;
                l2Var.getClass();
                l2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l2Var.invalidate();
                break;
            case 9:
                m5 m5Var = (m5) this.b;
                m5Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = m5Var.c;
                textViewArr[0].setAlpha(floatValue5);
                float f7 = 1.0f - floatValue5;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue5 * AndroidUtilities.dp(4.0f));
                break;
            case 10:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                r01 r01Var = profileStoriesView.h;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue6;
                r01Var.R = floatValue6;
                r01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 11:
                k6 k6Var = (k6) this.b;
                k6Var.r = ((Float) k6Var.w.getAnimatedValue()).floatValue();
                k6Var.invalidate();
                break;
            case 12:
                e7 e7Var = (e7) this.b;
                e7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e7Var.e.setTranslationY(((-e7Var.d) + e7Var.getMeasuredHeight()) - e7Var.v);
                break;
            case 13:
                b9 b9Var = (b9) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = b9Var.a;
                a9 a9Var = (a9) arrayList.get(b9Var.d);
                a9Var.n = floatValue7;
                a9Var.invalidate();
                int i10 = b9Var.c;
                if (i10 != -1) {
                    a9 a9Var2 = (a9) arrayList.get(i10);
                    a9Var2.n = 1.0f - floatValue7;
                    a9Var2.invalidate();
                    break;
                }
                break;
            case 14:
                ga gaVar = (ga) this.b;
                gaVar.getClass();
                gaVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gaVar.invalidate();
                gaVar.requestLayout();
                gaVar.J.requestLayout();
                break;
            case 15:
                ci.y yVar = (ci.y) this.b;
                yVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, yVar.w));
                yVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), yVar.w));
                break;
            case 16:
                di.m mVar = (di.m) this.b;
                mVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                di.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.o0));
                gVar.getEmojiButton().setAlpha(mVar.o0);
                mVar.r.setAlpha((float) Math.pow(mVar.o0, 16.0d));
                mVar.u(mVar.o0);
                di.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            case 17:
                di.y yVar2 = (di.y) this.b;
                yVar2.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar2.a.invalidate();
                break;
            case 18:
                w2 w2Var = (w2) this.b;
                w2Var.getClass();
                w2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.i();
                break;
            case 19:
                ((z3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                d4 d4Var = (d4) this.b;
                d4Var.getClass();
                d4Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d4Var.invalidate();
                break;
            case 21:
                ((s4) this.b).invalidate();
                break;
            case 22:
                s6 s6Var = (s6) this.b;
                s6Var.getClass();
                s6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s6Var.e();
                break;
            case 23:
                r6 r6Var = (r6) this.b;
                r6Var.getClass();
                r6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.invalidate();
                break;
            case 24:
                n7 n7Var = (n7) this.b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n7Var.E = floatValue8;
                m7 m7Var = n7Var.a;
                m7Var.setScaleX(1.0f - floatValue8);
                m7Var.setScaleY(1.0f - n7Var.E);
                n7Var.invalidate();
                break;
            case 25:
                w8 w8Var = (w8) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w8Var.r = floatValue9;
                Utilities.Callback callback = w8Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue9, 1.0f, -1.0f)));
                }
                w8Var.a.invalidate();
                break;
            case 26:
                ((x9) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 27:
                ba baVar = (ba) this.b;
                baVar.getClass();
                baVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                jg.h hVar = (jg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            default:
                y4 y4Var = (y4) this.b;
                y4Var.getClass();
                y4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y4Var.requestLayout();
                y4Var.invalidate();
                break;
        }
    }
}
