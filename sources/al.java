// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class al extends ClickableSpan {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wjb c;
    public final /* synthetic */ Runnable d;

    public al(boolean z, int i, wjb wjbVar, Runnable runnable) {
        this.a = z;
        this.b = i;
        this.c = wjbVar;
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
            textPaint.setTypeface(gl.o());
        }
        textPaint.setColor(bkb.v0(this.b, this.c));
    }
}
