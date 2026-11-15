package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ md(ChatActivityEnterView chatActivityEnterView, ig igVar, float f10, ChatActivityEnterView.RecordCircle recordCircle) {
        this.c = chatActivityEnterView;
        this.d = igVar;
        this.b = f10;
        this.e = recordCircle;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.a;
        float f10 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                ig igVar = (ig) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.D5 = floatValue;
                float interpolation = er.g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f11 = chatActivityEnterView.E5;
                float i11 = Utilities.i((floatValue - f11) / Math.max(60.0f, chatActivityEnterView.F5 - f11), 1.0f, 0.0f);
                igVar.w = interpolation;
                igVar.x = i11;
                igVar.invalidate();
                double radians = Math.toRadians(igVar.f());
                chatActivityEnterView.x5.R = ((float) Math.sin(radians)) * f10;
                chatActivityEnterView.x5.S = (1.0f - ((float) Math.cos(radians))) * f10;
                float f12 = chatActivityEnterView.G5;
                if (floatValue >= f12) {
                    float min = Math.min(1.0f, (floatValue - f12) / 260.0f);
                    igVar.y = min;
                    igVar.invalidate();
                    chatActivityEnterView.s(min);
                }
                recordCircle.invalidate();
                break;
            default:
                sg.h hVar = (sg.h) obj;
                sg.u0 u0Var = ((sg.v) obj3).a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.j0 j0Var = new sg.j0(new sg.m0[]{(sg.m0) obj2});
                hVar.getClass();
                j0Var.c = hVar instanceof sg.d ? -1 : u0Var.getCurrentColor();
                j0Var.d = floatValue2 * f10;
                j0Var.e = hVar;
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    boolean z10 = true;
                    painting.f.f(new fi.r5(painting, j0Var, z10, z10, null, 5));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ md(sg.v vVar, sg.m0 m0Var, sg.h hVar, float f10) {
        this.c = vVar;
        this.d = m0Var;
        this.e = hVar;
        this.b = f10;
    }
}
