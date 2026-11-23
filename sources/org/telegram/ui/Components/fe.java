package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class fe extends ah {
    public final /* synthetic */ ChatActivityEnterView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.ah, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.G2;
        float[] fArr = chatActivityEnterView.H6;
        float[] fArr2 = chatActivityEnterView.G6;
        int i7 = ChatActivityEnterView.s7;
        if (!chatActivityEnterView.o0()) {
            super.onDraw(canvas);
            if (getTag() == null || chatActivityEnterView.f2 == null || chatActivityEnterView.X0 || this.x || org.telegram.messenger.si.d0(chatActivityEnterView.R).v0[0].isEmpty() || paint == null) {
                return;
            }
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
            return;
        }
        if (chatActivityEnterView.F6 == null) {
            oh0 oh0Var = new oh0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            chatActivityEnterView.F6 = oh0Var;
            oh0Var.J(true);
            chatActivityEnterView.F6.p0 = false;
            int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Vf);
            oh0 oh0Var2 = chatActivityEnterView.F6;
            oh0Var2.a0 = true;
            oh0Var2.Q(G0, "Cup Grey");
            chatActivityEnterView.F6.Q(G0, "Box_Grey 2");
            chatActivityEnterView.F6.Q(G0, "Box Grey");
            chatActivityEnterView.F6.o();
            chatActivityEnterView.F6.R(this);
            chatActivityEnterView.F6.T(true, 0.0f);
        }
        oh0 oh0Var3 = chatActivityEnterView.F6;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float scaleX = getScaleX() != 0.0f ? getScaleX() : 1.0f;
        float scaleY = getScaleY() != 0.0f ? getScaleY() : 1.0f;
        if (ChatActivityEnterView.h(chatActivityEnterView, chatActivityEnterView.b2, fArr2) && ChatActivityEnterView.h(chatActivityEnterView, this, fArr)) {
            width = com.google.android.gms.internal.vision.e2.A(fArr2[0], fArr[0], scaleX, width);
        }
        float L = org.telegram.messenger.g0.L(14.0f) / scaleX;
        float L2 = org.telegram.messenger.g0.L(14.0f) / scaleY;
        oh0Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
        oh0Var3.draw(canvas);
    }
}
