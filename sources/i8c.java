// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i8c extends f8c {
    public final int e;
    public final rmb f;

    public i8c(String str, int i, rmb rmbVar) {
        super(str, (rmb) null);
        this.e = i;
        this.f = rmbVar;
    }

    @Override // f8c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i == 3) {
            textPaint.setColor(aob.w0(null, aob.J6, false));
        } else if (i == 2) {
            textPaint.setColor(-1);
        } else if (i == 1) {
            textPaint.setColor(aob.w0(null, aob.Yc, false));
        } else {
            textPaint.setColor(aob.w0(null, aob.Xc, false));
        }
        rmb rmbVar = this.f;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
