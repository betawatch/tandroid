package gh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n3 extends ClickableSpan {
    public final /* synthetic */ int a;

    public /* synthetic */ n3(int i9) {
        this.a = i9;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                break;
            default:
                ve.e.s(view.getContext(), "https://t.me/BotFather");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                break;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }
}
