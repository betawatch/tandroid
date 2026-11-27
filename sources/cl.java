// default package

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cl extends CharacterStyle {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ vnb c;

    public cl(boolean z, int i, vnb vnbVar) {
        this.a = z;
        this.b = i;
        this.c = vnbVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        if (this.a) {
            textPaint.setTypeface(hl.o());
        }
        textPaint.setColor(aob.v0(this.b, this.c));
    }
}
