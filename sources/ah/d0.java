package ah;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.a2;
import bi.a7;
import bi.da;
import bi.e3;
import bi.h6;
import bi.k2;
import bi.k5;
import bi.x8;
import bi.y8;
import di.a9;
import di.b4;
import di.ba;
import di.f4;
import di.fa;
import di.p7;
import di.q7;
import di.t6;
import di.u4;
import di.u6;
import di.y2;
import java.util.ArrayList;
import ji.w4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f0 f0Var = g0Var.b;
                if (f0Var != null) {
                    f0Var.setAlpha(floatValue);
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
                e3 e3Var = (e3) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e3Var.c.setAlpha(floatValue2);
                e3Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue2));
                e3Var.invalidate();
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
                a2 a2Var = (a2) this.b;
                a2Var.getClass();
                a2Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 8:
                k2 k2Var = (k2) this.b;
                k2Var.getClass();
                k2Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.invalidate();
                break;
            case 9:
                k5 k5Var = (k5) this.b;
                k5Var.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = k5Var.c;
                textViewArr[0].setAlpha(floatValue5);
                float f7 = 1.0f - floatValue5;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue5 * AndroidUtilities.dp(4.0f));
                break;
            case 10:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                n01 n01Var = profileStoriesView.h;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue6;
                n01Var.R = floatValue6;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 11:
                h6 h6Var = (h6) this.b;
                h6Var.r = ((Float) h6Var.w.getAnimatedValue()).floatValue();
                h6Var.invalidate();
                break;
            case 12:
                a7 a7Var = (a7) this.b;
                a7Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a7Var.e.setTranslationY(((-a7Var.d) + a7Var.getMeasuredHeight()) - a7Var.v);
                break;
            case 13:
                y8 y8Var = (y8) this.b;
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = y8Var.a;
                x8 x8Var = (x8) arrayList.get(y8Var.d);
                x8Var.n = floatValue7;
                x8Var.invalidate();
                int i10 = y8Var.c;
                if (i10 != -1) {
                    x8 x8Var2 = (x8) arrayList.get(i10);
                    x8Var2.n = 1.0f - floatValue7;
                    x8Var2.invalidate();
                    break;
                }
                break;
            case 14:
                da daVar = (da) this.b;
                daVar.getClass();
                daVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                daVar.invalidate();
                daVar.requestLayout();
                daVar.J.requestLayout();
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
                y2 y2Var = (y2) this.b;
                y2Var.getClass();
                y2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y2Var.i();
                break;
            case 19:
                ((b4) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 20:
                f4 f4Var = (f4) this.b;
                f4Var.getClass();
                f4Var.o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                f4Var.invalidate();
                break;
            case 21:
                ((u4) this.b).invalidate();
                break;
            case 22:
                u6 u6Var = (u6) this.b;
                u6Var.getClass();
                u6Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u6Var.e();
                break;
            case 23:
                t6 t6Var = (t6) this.b;
                t6Var.getClass();
                t6Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t6Var.invalidate();
                break;
            case 24:
                q7 q7Var = (q7) this.b;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q7Var.E = floatValue8;
                p7 p7Var = q7Var.a;
                p7Var.setScaleX(1.0f - floatValue8);
                p7Var.setScaleY(1.0f - q7Var.E);
                q7Var.invalidate();
                break;
            case 25:
                a9 a9Var = (a9) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a9Var.r = floatValue9;
                Utilities.Callback callback = a9Var.x;
                if (callback != null) {
                    callback.run(Float.valueOf(Utilities.clamp(floatValue9, 1.0f, -1.0f)));
                }
                a9Var.a.invalidate();
                break;
            case 26:
                ((ba) this.b).x.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 27:
                fa faVar = (fa) this.b;
                faVar.getClass();
                faVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 28:
                jg.h hVar = (jg.h) this.b;
                hVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.g.a.invalidate();
                break;
            default:
                w4 w4Var = (w4) this.b;
                w4Var.getClass();
                w4Var.a0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w4Var.requestLayout();
                w4Var.invalidate();
                break;
        }
    }
}
