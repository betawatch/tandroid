// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o82 extends ClickableSpan {
    public final /* synthetic */ byte a;

    public /* synthetic */ o82(byte b) {
        this.a = b;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d01.t(view.getContext(), "https://t.me/BotFather");
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
