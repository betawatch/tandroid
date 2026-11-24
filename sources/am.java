// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class am extends ClickableSpan {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ylb c;
    public final /* synthetic */ Runnable d;

    public am(boolean z, int i, ylb ylbVar, Runnable runnable) {
        this.a = z;
        this.b = i;
        this.c = ylbVar;
        this.d = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.d.run();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(gm.o());
        }
        textPaint.setColor(cmb.v0(this.b, this.c));
    }
}
