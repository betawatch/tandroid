package ai;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d01;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                r3 r3Var = (r3) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r3Var.c.setAlpha(floatValue);
                r3Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue));
                r3Var.invalidate();
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
                m2 m2Var = (m2) this.b;
                m2Var.getClass();
                m2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 7:
                w2 w2Var = (w2) this.b;
                w2Var.getClass();
                w2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2Var.invalidate();
                break;
            case 8:
                a6 a6Var = (a6) this.b;
                a6Var.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = a6Var.c;
                textViewArr[0].setAlpha(floatValue4);
                float f7 = 1.0f - floatValue4;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue4 * AndroidUtilities.dp(4.0f));
                break;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                d01 d01Var = profileStoriesView.h;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue5;
                d01Var.R = floatValue5;
                d01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 10:
                y6 y6Var = (y6) this.b;
                y6Var.r = ((Float) y6Var.w.getAnimatedValue()).floatValue();
                y6Var.invalidate();
                break;
            case 11:
                s7 s7Var = (s7) this.b;
                s7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s7Var.e.setTranslationY(((-s7Var.d) + s7Var.getMeasuredHeight()) - s7Var.v);
                break;
            case 12:
                p9 p9Var = (p9) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = p9Var.a;
                o9 o9Var = (o9) arrayList.get(p9Var.d);
                o9Var.n = floatValue6;
                o9Var.invalidate();
                int i10 = p9Var.c;
                if (i10 != -1) {
                    o9 o9Var2 = (o9) arrayList.get(i10);
                    o9Var2.n = 1.0f - floatValue6;
                    o9Var2.invalidate();
                    break;
                }
                break;
            case 13:
                wa waVar = (wa) this.b;
                waVar.getClass();
                waVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                waVar.invalidate();
                waVar.requestLayout();
                waVar.J.requestLayout();
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
                ci.x2 x2Var = (ci.x2) this.b;
                x2Var.getClass();
                x2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x2Var.i();
                break;
            case 18:
                ((ci.a4) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                ci.e4 e4Var = (ci.e4) this.b;
                e4Var.getClass();
                e4Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                e4Var.invalidate();
                break;
            case 20:
                ((ci.t4) this.b).invalidate();
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
                ii.v4 v4Var = (ii.v4) this.b;
                v4Var.getClass();
                v4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v4Var.requestLayout();
                v4Var.invalidate();
                break;
            default:
                ji.n nVar = (ji.n) this.b;
                wn wnVar = nVar.F;
                if (wnVar == null) {
                    nVar.G.invalidate();
                    break;
                } else {
                    wnVar.r9();
                    if (wnVar.J8 != null) {
                        wnVar.fragmentView.invalidate();
                        break;
                    }
                }
                break;
        }
    }
}
