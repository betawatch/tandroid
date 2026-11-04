package ci;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ua extends ClickableSpan {
    public final /* synthetic */ n9 a;

    public ua(n9 n9Var) {
        this.a = n9Var;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
