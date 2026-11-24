// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class go1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ go1(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.X8 = floatValue;
                yv1Var.b9 = floatValue / f;
                View view = yv1Var.fragmentView;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                int i = ChatActivityEnterView.z7;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sy1 sy1Var = chatActivityEnterView.F0;
                if (sy1Var != null) {
                    sy1Var.setAlpha(1.0f - floatValue2);
                }
                ox1 ox1Var = chatActivityEnterView.O4;
                float R1 = gm.R1(1.0f, 0.6f, floatValue2);
                ox1Var.getClass();
                ChatActivityEnterView chatActivityEnterView2 = ox1Var.b;
                chatActivityEnterView2.h = R1;
                chatActivityEnterView2.q2();
                ox1 ox1Var2 = chatActivityEnterView.Q4;
                ox1Var2.getClass();
                ChatActivityEnterView chatActivityEnterView3 = ox1Var2.b;
                chatActivityEnterView3.n = (1.0f - floatValue2) * f;
                chatActivityEnterView3.q2();
                break;
            case 2:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = (ChatActivityEnterView) ((t7) obj).c;
                ox1 ox1Var3 = chatActivityEnterView4.O4;
                float R12 = gm.R1(0.6f, 1.0f, floatValue3);
                ox1Var3.getClass();
                ChatActivityEnterView chatActivityEnterView5 = ox1Var3.b;
                chatActivityEnterView5.h = R12;
                chatActivityEnterView5.q2();
                ox1 ox1Var4 = chatActivityEnterView4.Q4;
                ox1Var4.getClass();
                ChatActivityEnterView chatActivityEnterView6 = ox1Var4.b;
                chatActivityEnterView6.n = f * floatValue3;
                chatActivityEnterView6.q2();
                break;
            case 3:
                ((v72) obj).F.setTranslationY(gm.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                float floatValue4 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    View view2 = (View) arrayList.get(i2);
                    if (view2 != null) {
                        view2.setTranslationY(f * floatValue4);
                    }
                }
                break;
            case 5:
                ((kg8) obj).S.setTranslationY(gm.R1(f, 0.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                break;
            case 6:
                zv8 zv8Var = (zv8) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float R13 = gm.R1(0.0f, f, floatValue5);
                zv8Var.a.setTranslationX(R13);
                zv8Var.b.setTranslationX(R13);
                ImageView imageView = zv8Var.c;
                imageView.setTranslationX(R13);
                jh2 jh2Var = zv8Var.f;
                jh2Var.setTranslationX((jb6.a0 ? gm.L(32.0f) : -gm.L(32.0f)) + R13);
                float f2 = (floatValue5 * 0.5f) + 0.5f;
                jh2Var.setScaleX(f2);
                jh2Var.setScaleY(f2);
                jh2Var.setAlpha(floatValue5);
                float f3 = 1.0f - floatValue5;
                float f4 = (f3 * 0.5f) + 0.5f;
                imageView.setScaleX(f4);
                imageView.setScaleY(f4);
                imageView.setAlpha(f3);
                break;
            case 7:
                mmc mmcVar = (mmc) obj;
                mmcVar.getClass();
                mmcVar.R = ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 240.0f) + f) % 360.0f;
                mmcVar.a.invalidate();
                break;
            default:
                xqc xqcVar = (xqc) obj;
                float floatValue6 = 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xqcVar.c = xqcVar.c();
                xqcVar.d = f * floatValue6;
                xqcVar.s = floatValue6 > 0.0f;
                break;
        }
    }
}
