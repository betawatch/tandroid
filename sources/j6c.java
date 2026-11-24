// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j6c extends g6c {
    public final int e;
    public final wkb f;

    public j6c(String str, int i, wkb wkbVar) {
        super(str, (wkb) null);
        this.e = i;
        this.f = wkbVar;
    }

    @Override // g6c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i == 3) {
            textPaint.setColor(cmb.w0(null, cmb.I6, false));
        } else if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(cmb.w0(null, cmb.Xc, false));
        } else {
            textPaint.setColor(cmb.w0(null, cmb.Wc, false));
        }
        wkb wkbVar = this.f;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
