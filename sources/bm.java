// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bm extends CharacterStyle {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ylb c;

    public bm(boolean z, int i, ylb ylbVar) {
        this.a = z;
        this.b = i;
        this.c = ylbVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(gm.o());
        }
        textPaint.setColor(cmb.v0(this.b, this.c));
    }
}
