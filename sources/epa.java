// default package

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class epa extends ClickableSpan {
    public final /* synthetic */ long a;
    public final /* synthetic */ vqa b;

    public epa(vqa vqaVar, long j) {
        this.b = vqaVar;
        this.a = j;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.b.Y1(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
