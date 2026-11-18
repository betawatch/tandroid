package hi;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class r9 extends CharacterStyle {
    public final /* synthetic */ int a;

    public /* synthetic */ r9(int i7) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.T2.getColor());
                break;
            case 2:
                textPaint.setColor(org.telegram.ui.ActionBar.n6.o2.linkColor);
                break;
        }
    }

    private final void a(TextPaint textPaint) {
    }
}
