package org.telegram.messenger;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class w extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ w(int i7, Runnable runnable) {
        this.a = i7;
        this.b = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 2:
                this.b.run();
                break;
            case 3:
                Runnable runnable3 = this.b;
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
            case 4:
                Runnable runnable4 = this.b;
                if (runnable4 != null) {
                    runnable4.run();
                    break;
                }
                break;
            default:
                Runnable runnable5 = this.b;
                if (runnable5 != null) {
                    runnable5.run();
                    break;
                }
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setUnderlineText(false);
                textPaint.setColor(textPaint.linkColor);
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 3:
                textPaint.setUnderlineText(false);
                break;
            case 4:
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setUnderlineText(false);
                break;
        }
    }
}
