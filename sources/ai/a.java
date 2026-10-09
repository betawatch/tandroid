package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l01;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                cVar.getClass();
                cVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                break;
            case 1:
                a0 a0Var = (a0) this.b;
                a0Var.O.e = AndroidUtilities.lerp(0.0f, 1.0f - a0Var.b0.d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                a0Var.invalidate();
                break;
            case 2:
                ((o1) this.b).invalidate();
                break;
            case 3:
                s3 s3Var = (s3) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s3Var.c.setAlpha(floatValue);
                s3Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                s3Var.invalidate();
                break;
            case 4:
                h1 h1Var = (h1) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = h1Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(h1Var.f, 1.0f, floatValue2) * 255.0f));
                    h1Var.h.invalidate();
                    break;
                }
                break;
            case 5:
                b bVar = (b) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h1 h1Var2 = (h1) bVar.b;
                Drawable drawable2 = h1Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, h1Var2.f, floatValue3) * 255.0f));
                    h1Var2.h.invalidate();
                    break;
                }
                break;
            case 6:
                n2 n2Var = (n2) this.b;
                n2Var.getClass();
                n2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                x2 x2Var = (x2) this.b;
                x2Var.getClass();
                x2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.invalidate();
                break;
            case 8:
                b6 b6Var = (b6) this.b;
                b6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = b6Var.c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                break;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                l01 l01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                l01Var.R = floatValue5;
                l01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 10:
                z6 z6Var = (z6) this.b;
                z6Var.r = ((Float) z6Var.w.getAnimatedValue()).floatValue();
                z6Var.invalidate();
                break;
            case 11:
                t7 t7Var = (t7) this.b;
                t7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t7Var.e.setTranslationY(((-t7Var.d) + t7Var.getMeasuredHeight()) - t7Var.v);
                break;
            case 12:
                q9 q9Var = (q9) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = q9Var.a;
                p9 p9Var = (p9) arrayList.get(q9Var.d);
                p9Var.n = floatValue6;
                p9Var.invalidate();
                int i10 = q9Var.c;
                if (i10 != -1) {
                    p9 p9Var2 = (p9) arrayList.get(i10);
                    p9Var2.n = 1.0f - floatValue6;
                    p9Var2.invalidate();
                    break;
                }
                break;
            case 13:
                xa xaVar = (xa) this.b;
                xaVar.getClass();
                xaVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xaVar.invalidate();
                xaVar.requestLayout();
                xaVar.J.requestLayout();
                break;
            case 14:
                bi.z zVar = (bi.z) this.b;
                zVar.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, zVar.w));
                zVar.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), zVar.w));
                break;
            case 15:
                ci.m mVar = (ci.m) this.b;
                mVar.o0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ci.g gVar = mVar.f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                FrameLayout frameLayout = mVar.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar.o0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar.o0));
                gVar.getEmojiButton().setAlpha(mVar.o0);
                mVar.r.setAlpha((float) Math.pow(mVar.o0, 16.0d));
                mVar.u(mVar.o0);
                ci.i iVar = mVar.M;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar.o0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar.invalidate();
                break;
            case 16:
                ci.y yVar = (ci.y) this.b;
                yVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yVar.a.invalidate();
                break;
            case 17:
                ci.w2 w2Var = (ci.w2) this.b;
                w2Var.getClass();
                w2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.i();
                break;
            case 18:
                ((ci.z3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                ci.d4 d4Var = (ci.d4) this.b;
                d4Var.getClass();
                d4Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                d4Var.invalidate();
                break;
            case 20:
                ((ci.s4) this.b).invalidate();
                break;
            case 21:
                ci.u6 u6Var = (ci.u6) this.b;
                u6Var.getClass();
                u6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                break;
            case 22:
                ci.t6 t6Var = (ci.t6) this.b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                break;
            case 23:
                ci.o7 o7Var = (ci.o7) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o7Var.E = floatValue7;
                ci.n7 n7Var = o7Var.a;
                n7Var.setScaleX(1.0f - floatValue7);
                n7Var.setScaleY(1.0f - o7Var.E);
                o7Var.invalidate();
                break;
            case 24:
                ci.x8 x8Var = (ci.x8) this.b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x8Var.r = floatValue8;
                Utilities.Callback callback = x8Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue8, 1.0f, -1.0f)));
                }
                x8Var.a.invalidate();
                break;
            case 25:
                ((ci.y9) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 26:
                ci.ca caVar = (ci.ca) this.b;
                caVar.getClass();
                caVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 27:
                ig.h hVar = (ig.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            case 28:
                ii.w4 w4Var = (ii.w4) this.b;
                w4Var.getClass();
                w4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.requestLayout();
                w4Var.invalidate();
                break;
            default:
                ji.n nVar = (ji.n) this.b;
                zn znVar = nVar.F;
                if (znVar == null) {
                    nVar.G.invalidate();
                    break;
                } else {
                    znVar.w9();
                    if (znVar.J8 != null) {
                        znVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
