package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wd(ChatActivityEnterView chatActivityEnterView, sg sgVar, float f10, ChatActivityEnterView.RecordCircle recordCircle) {
        this.c = chatActivityEnterView;
        this.d = sgVar;
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
                sg sgVar = (sg) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i10 = ChatActivityEnterView.s7;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.L5 = floatValue;
                float interpolation = kr.g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f11 = chatActivityEnterView.M5;
                float i11 = Utilities.i((floatValue - f11) / Math.max(60.0f, chatActivityEnterView.N5 - f11), 1.0f, 0.0f);
                sgVar.w = interpolation;
                sgVar.x = i11;
                sgVar.invalidate();
                double radians = Math.toRadians(sgVar.g());
                chatActivityEnterView.F5.R = ((float) Math.sin(radians)) * f10;
                chatActivityEnterView.F5.S = (1.0f - ((float) Math.cos(radians))) * f10;
                float f12 = chatActivityEnterView.O5;
                if (floatValue >= f12) {
                    float min = Math.min(1.0f, (floatValue - f12) / 260.0f);
                    sgVar.y = min;
                    sgVar.invalidate();
                    chatActivityEnterView.u(min);
                }
                recordCircle.invalidate();
                break;
            default:
                sg.h hVar = (sg.h) obj;
                sg.t0 t0Var = ((sg.v) obj3).a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.i0 i0Var = new sg.i0(new sg.l0[]{(sg.l0) obj2});
                hVar.getClass();
                i0Var.c = hVar instanceof sg.d ? -1 : t0Var.getCurrentColor();
                i0Var.d = floatValue2 * f10;
                i0Var.e = hVar;
                sg.h0 painting = t0Var.getPainting();
                if (painting.L == null) {
                    boolean z10 = true;
                    painting.f.f(new fi.q5(painting, i0Var, z10, z10, null, 5));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ wd(sg.v vVar, sg.l0 l0Var, sg.h hVar, float f10) {
        this.c = vVar;
        this.d = l0Var;
        this.e = hVar;
        this.b = f10;
    }
}
