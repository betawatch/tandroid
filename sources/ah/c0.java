package ah;

import ai.ad;
import ai.bd;
import ai.e6;
import ai.je;
import ai.l7;
import ai.q7;
import ai.w5;
import ai.x5;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.b6;
import ci.i5;
import ci.k7;
import ci.l4;
import ci.m2;
import ci.o1;
import ci.q8;
import ci.w1;
import ei.k6;
import ei.s2;
import ei.u3;
import ei.x3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.sz0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        w5 w5Var;
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
                l7 l7Var = (l7) this.b;
                l7Var.b1.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l7Var.n2();
                break;
            case 2:
                ((e6) this.b).h.invalidate();
                break;
            case 3:
                x5 x5Var = (x5) this.b;
                x5Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x5Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (w5Var = x5Var.H) != null && (z10 = w5Var.l) && z10) {
                    w5Var.l = false;
                    w5Var.b();
                }
                x5Var.invalidate();
                break;
            case 4:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 5:
                q7 q7Var = (q7) this.b;
                q7Var.getClass();
                q7Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.invalidate();
                break;
            case 6:
                bd bdVar = (bd) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ad adVar = bdVar.c;
                adVar.setScaleX(floatValue3);
                adVar.setScaleY(floatValue3);
                break;
            case 7:
                je jeVar = (je) this.b;
                jeVar.getClass();
                jeVar.c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jeVar.invalidate();
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
                m2 m2Var = (m2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m2Var.c.setAlpha(floatValue4);
                m2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                m2Var.invalidate();
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
                o1 o1Var = (o1) this.b;
                o1Var.getClass();
                o1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                w1 w1Var = (w1) this.b;
                w1Var.getClass();
                w1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w1Var.invalidate();
                break;
            case 16:
                l4 l4Var = (l4) this.b;
                l4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = l4Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                break;
            case 17:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                sz0 sz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                sz0Var.R = floatValue8;
                sz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 18:
                i5 i5Var = (i5) this.b;
                i5Var.r = ((Float) i5Var.w.getAnimatedValue()).floatValue();
                i5Var.invalidate();
                break;
            case 19:
                b6 b6Var = (b6) this.b;
                b6Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b6Var.e.setTranslationY(((-b6Var.d) + b6Var.getMeasuredHeight()) - b6Var.v);
                break;
            case 20:
                ci.l7 l7Var2 = (ci.l7) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = l7Var2.a;
                k7 k7Var = (k7) arrayList.get(l7Var2.d);
                k7Var.n = floatValue9;
                k7Var.invalidate();
                int i10 = l7Var2.c;
                if (i10 != -1) {
                    k7 k7Var2 = (k7) arrayList.get(i10);
                    k7Var2.n = 1.0f - floatValue9;
                    k7Var2.invalidate();
                    break;
                }
                break;
            case 21:
                q8 q8Var = (q8) this.b;
                q8Var.getClass();
                q8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8Var.invalidate();
                q8Var.requestLayout();
                q8Var.J.requestLayout();
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
                ((ei.l4) this.b).invalidate();
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
