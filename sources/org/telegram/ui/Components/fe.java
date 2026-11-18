package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class fe extends yg {
    public final /* synthetic */ ChatActivityEnterView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override // org.telegram.ui.Components.yg, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.E2;
        float[] fArr = chatActivityEnterView.F6;
        float[] fArr2 = chatActivityEnterView.E6;
        int i7 = ChatActivityEnterView.n7;
        if (!chatActivityEnterView.m0()) {
            super.onDraw(canvas);
            if (getTag() == null || chatActivityEnterView.d2 == null || chatActivityEnterView.X0 || this.x || org.telegram.messenger.ri.d0(chatActivityEnterView.R).v0[0].isEmpty() || paint == null) {
                return;
            }
            canvas.drawCircle(org.telegram.messenger.g0.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f), paint);
            return;
        }
        if (chatActivityEnterView.D6 == null) {
            mh0 mh0Var = new mh0(R.raw.chat_audio_record_delete_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), false, null);
            chatActivityEnterView.D6 = mh0Var;
            mh0Var.J(true);
            chatActivityEnterView.D6.p0 = false;
            int C0 = chatActivityEnterView.C0(org.telegram.ui.ActionBar.n6.Vf);
            mh0 mh0Var2 = chatActivityEnterView.D6;
            mh0Var2.a0 = true;
            mh0Var2.Q(C0, "Cup Grey");
            chatActivityEnterView.D6.Q(C0, "Box_Grey 2");
            chatActivityEnterView.D6.Q(C0, "Box Grey");
            chatActivityEnterView.D6.o();
            chatActivityEnterView.D6.R(this);
            chatActivityEnterView.D6.T(true, 0.0f);
        }
        mh0 mh0Var3 = chatActivityEnterView.D6;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float scaleX = getScaleX() != 0.0f ? getScaleX() : 1.0f;
        float scaleY = getScaleY() != 0.0f ? getScaleY() : 1.0f;
        if (ChatActivityEnterView.h(chatActivityEnterView, chatActivityEnterView.Z1, fArr2) && ChatActivityEnterView.h(chatActivityEnterView, this, fArr)) {
            width = com.google.android.gms.internal.vision.e2.A(fArr2[0], fArr[0], scaleX, width);
        }
        float L = org.telegram.messenger.g0.L(14.0f) / scaleX;
        float L2 = org.telegram.messenger.g0.L(14.0f) / scaleY;
        mh0Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
        mh0Var3.draw(canvas);
    }
}
