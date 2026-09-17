package org.telegram.ui.Components;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class vc extends ClickableSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ vc(int i10, Runnable runnable) {
        this.a = i10;
        this.b = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                Runnable runnable2 = this.b;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            default:
                Runnable runnable3 = this.b;
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
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
            case 1:
                textPaint.setUnderlineText(false);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            default:
                textPaint.setUnderlineText(false);
                break;
        }
    }
}
