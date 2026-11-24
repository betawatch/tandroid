// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ew1 extends qy1 {
    public final /* synthetic */ ChatActivityEnterView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew1(ChatActivityEnterView chatActivityEnterView, Activity activity) {
        super(activity);
        this.G = chatActivityEnterView;
    }

    @Override // qy1, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.G;
        Paint paint = chatActivityEnterView.G2;
        float[] fArr = chatActivityEnterView.G6;
        float[] fArr2 = chatActivityEnterView.F6;
        int i = ChatActivityEnterView.r7;
        if (!chatActivityEnterView.n0()) {
            super.onDraw(canvas);
            if (getTag() == null || chatActivityEnterView.f2 == null || chatActivityEnterView.X0 || this.x || hq6.d0(chatActivityEnterView.R).v0[0].isEmpty() || paint == null) {
                return;
            }
            canvas.drawCircle(gl.L(9.0f) + (getWidth() / 2), (getHeight() / 2) - gl.L(8.0f), gl.L(5.0f), paint);
            return;
        }
        if (chatActivityEnterView.E6 == null) {
            oy8 oy8Var = new oy8(R.raw.chat_audio_record_delete_outline, gl.L(28.0f), gl.L(28.0f), false, null);
            chatActivityEnterView.E6 = oy8Var;
            oy8Var.E(true);
            chatActivityEnterView.E6.p0 = false;
            int F0 = chatActivityEnterView.F0(bkb.Uf);
            oy8 oy8Var2 = chatActivityEnterView.E6;
            oy8Var2.a0 = true;
            oy8Var2.L(F0, "Cup Grey");
            chatActivityEnterView.E6.L(F0, "Box_Grey 2");
            chatActivityEnterView.E6.L(F0, "Box Grey");
            chatActivityEnterView.E6.j();
            chatActivityEnterView.E6.M(this);
            chatActivityEnterView.E6.O(true, 0.0f);
        }
        oy8 oy8Var3 = chatActivityEnterView.E6;
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float scaleX = getScaleX() != 0.0f ? getScaleX() : 1.0f;
        float scaleY = getScaleY() != 0.0f ? getScaleY() : 1.0f;
        if (chatActivityEnterView.h0(chatActivityEnterView.b2, fArr2) && chatActivityEnterView.h0(this, fArr)) {
            width = oo1.z(fArr2[0], fArr[0], scaleX, width);
        }
        float L = gl.L(14.0f) / scaleX;
        float L2 = gl.L(14.0f) / scaleY;
        oy8Var3.setBounds(Math.round(width - L), Math.round(height - L2), Math.round(width + L), Math.round(height + L2));
        oy8Var3.draw(canvas);
    }
}
