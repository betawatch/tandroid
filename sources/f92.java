// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
