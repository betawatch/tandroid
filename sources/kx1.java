// default package

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kx1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kx1(yp5 yp5Var, jf8 jf8Var, u11 u11Var, float f) {
        this.c = yp5Var;
        this.d = jf8Var;
        this.e = u11Var;
        this.b = f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                wz1 wz1Var = (wz1) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i = ChatActivityEnterView.z7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.K5 = floatValue;
                float interpolation = d53.g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f2 = chatActivityEnterView.L5;
                float i2 = Utilities.i((floatValue - f2) / Math.max(60.0f, chatActivityEnterView.M5 - f2), 1.0f, 0.0f);
                wz1Var.w = interpolation;
                wz1Var.x = i2;
                wz1Var.invalidate();
                double radians = Math.toRadians(wz1Var.e());
                chatActivityEnterView.E5.R = ((float) Math.sin(radians)) * f;
                chatActivityEnterView.E5.S = (1.0f - ((float) Math.cos(radians))) * f;
                float f3 = chatActivityEnterView.N5;
                if (floatValue >= f3) {
                    float min = Math.min(1.0f, (floatValue - f3) / 260.0f);
                    wz1Var.y = min;
                    wz1Var.invalidate();
                    chatActivityEnterView.s(min);
                }
                recordCircle.invalidate();
                break;
            default:
                u11 u11Var = (u11) obj;
                e99 e99Var = ((yp5) obj3).a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f08 f08Var = new f08(new jf8[]{(jf8) obj2});
                u11Var.getClass();
                f08Var.c = u11Var instanceof q11 ? -1 : e99Var.getCurrentColor();
                f08Var.d = floatValue2 * f;
                f08Var.e = u11Var;
                hw7 painting = e99Var.getPainting();
                if (painting.L == null) {
                    boolean z = true;
                    painting.f.f(new hy6(painting, f08Var, z, z, null, (byte) 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kx1(ChatActivityEnterView chatActivityEnterView, wz1 wz1Var, float f, ChatActivityEnterView.RecordCircle recordCircle) {
        this.c = chatActivityEnterView;
        this.d = wz1Var;
        this.b = f;
        this.e = recordCircle;
    }
}
