package bg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import gh.a4;
import gh.b4;
import gh.ca;
import gh.da;
import gh.gb;
import gh.i4;
import gh.k5;
import gh.p5;
import ih.d8;
import ih.e4;
import ih.o5;
import ih.w4;
import ih.y6;
import ih.z6;
import java.util.ArrayList;
import kh.u3;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a4 a4Var;
        boolean z10;
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                cVar.getClass();
                cVar.b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                cVar.invalidate();
                break;
            case 1:
                fg.m mVar = (fg.m) this.b;
                mVar.getClass();
                mVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                k5 k5Var = (k5) this.b;
                k5Var.U0.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.T1();
                break;
            case 3:
                ((i4) this.b).h.invalidate();
                break;
            case 4:
                b4 b4Var = (b4) this.b;
                b4Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.A = floatValue;
                if (floatValue >= 0.8f && (a4Var = b4Var.D) != null && (z10 = a4Var.l) && z10) {
                    a4Var.l = false;
                    a4Var.b();
                }
                b4Var.invalidate();
                break;
            case 5:
                View view = (View) this.b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                break;
            case 6:
                p5 p5Var = (p5) this.b;
                p5Var.getClass();
                p5Var.y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p5Var.invalidate();
                break;
            case 7:
                da daVar = (da) this.b;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ca caVar = daVar.c;
                caVar.setScaleX(floatValue2);
                caVar.setScaleY(floatValue2);
                break;
            case 8:
                gb gbVar = (gb) this.b;
                gbVar.getClass();
                gbVar.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gbVar.invalidate();
                break;
            case 9:
                hg.v vVar = (hg.v) this.b;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg.u uVar = vVar.b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue3);
                    break;
                }
                break;
            case 10:
                ih.a aVar = (ih.a) this.b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                break;
            case 11:
                ih.q qVar = (ih.q) this.b;
                qVar.K.e = AndroidUtilities.lerp(0.0f, 1.0f - qVar.U.W, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                qVar.invalidate();
                break;
            case 12:
                ((ih.w0) this.b).invalidate();
                break;
            case 13:
                ih.h2 h2Var = (ih.h2) this.b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h2Var.c.setAlpha(floatValue4);
                h2Var.a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue4));
                h2Var.invalidate();
                break;
            case 14:
                ih.p0 p0Var = (ih.p0) this.b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = p0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(p0Var.f, 1.0f, floatValue5) * 255.0f));
                    p0Var.h.invalidate();
                    break;
                }
                break;
            case 15:
                ag.e eVar = (ag.e) this.b;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ih.p0 p0Var2 = (ih.p0) eVar.b;
                Drawable drawable2 = p0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, p0Var2.f, floatValue6) * 255.0f));
                    p0Var2.h.invalidate();
                    break;
                }
                break;
            case 16:
                ih.k1 k1Var = (ih.k1) this.b;
                k1Var.getClass();
                k1Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                ih.s1 s1Var = (ih.s1) this.b;
                s1Var.getClass();
                s1Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.invalidate();
                break;
            case 18:
                e4 e4Var = (e4) this.b;
                e4Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = e4Var.c;
                textViewArr[0].setAlpha(floatValue7);
                float f10 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue7 * AndroidUtilities.dp(4.0f));
                break;
            case 19:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.b;
                iz0 iz0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.C = floatValue8;
                iz0Var.N = floatValue8;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 20:
                w4 w4Var = (w4) this.b;
                w4Var.r = ((Float) w4Var.w.getAnimatedValue()).floatValue();
                w4Var.invalidate();
                break;
            case 21:
                o5 o5Var = (o5) this.b;
                o5Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.e.setTranslationY(((-o5Var.d) + o5Var.getMeasuredHeight()) - o5Var.v);
                break;
            case 22:
                z6 z6Var = (z6) this.b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = z6Var.a;
                y6 y6Var = (y6) arrayList.get(z6Var.d);
                y6Var.n = floatValue9;
                y6Var.invalidate();
                int i9 = z6Var.c;
                if (i9 != -1) {
                    y6 y6Var2 = (y6) arrayList.get(i9);
                    y6Var2.n = 1.0f - floatValue9;
                    y6Var2.invalidate();
                    break;
                }
                break;
            case 23:
                d8 d8Var = (d8) this.b;
                d8Var.getClass();
                d8Var.C = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d8Var.invalidate();
                d8Var.requestLayout();
                d8Var.F.requestLayout();
                break;
            case 24:
                jh.u uVar2 = (jh.u) this.b;
                uVar2.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uVar2.r.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(42.0f), 0, uVar2.w));
                uVar2.n.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(42.0f), uVar2.w));
                break;
            case 25:
                kh.m mVar2 = (kh.m) this.b;
                mVar2.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kh.g gVar = mVar2.f;
                gVar.getEditText().setTranslationX(AndroidUtilities.lerp(mVar2.getEditTextLeft() + AndroidUtilities.dp(-26.0f), AndroidUtilities.dp(2.0f), mVar2.k0));
                FrameLayout frameLayout = mVar2.s;
                frameLayout.setTranslationX(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), AndroidUtilities.dp(2.0f), mVar2.k0));
                frameLayout.setTranslationY(AndroidUtilities.lerp(-AndroidUtilities.dp(8.0f), 0, mVar2.k0));
                gVar.getEmojiButton().setAlpha(mVar2.k0);
                mVar2.r.setAlpha((float) Math.pow(mVar2.k0, 16.0d));
                mVar2.u(mVar2.k0);
                kh.i iVar = mVar2.I;
                if (iVar != null) {
                    iVar.setAlpha((float) Math.pow(mVar2.k0, 4.0d));
                }
                gVar.getEditText().invalidate();
                mVar2.invalidate();
                break;
            case 26:
                kh.z zVar = (kh.z) this.b;
                zVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zVar.a.invalidate();
                break;
            case 27:
                kh.s2 s2Var = (kh.s2) this.b;
                s2Var.getClass();
                s2Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.i();
                break;
            case 28:
                ((u3) this.b).b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                x3 x3Var = (x3) this.b;
                x3Var.getClass();
                x3Var.k0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                x3Var.invalidate();
                break;
        }
    }
}
