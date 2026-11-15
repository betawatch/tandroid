package hi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class q9 extends CharacterStyle {
    public final /* synthetic */ int a;

    public /* synthetic */ q9(int i7) {
        this.a = i7;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setAlpha(128);
                break;
            case 1:
                textPaint.setTextSize(textPaint.getTextSize() * 0.8f);
                textPaint.setColor(org.telegram.ui.ActionBar.j6.T2.getColor());
                break;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.j6.o2.linkColor);
                break;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
