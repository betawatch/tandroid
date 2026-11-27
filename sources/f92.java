// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class f92 extends ClickableSpan {
    public final /* synthetic */ byte a;

    public /* synthetic */ f92(byte b) {
        this.a = b;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                m01.u(view.getContext(), "https://t.me/BotFather");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                break;
        }
    }

    private final void a(View view) {
    }
}
