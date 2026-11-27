// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class c8c extends f8c {
    public static boolean h = true;
    public final int e;
    public final rmb f;

    public c8c(String str, int i, rmb rmbVar) {
        super(str, (rmb) null);
        this.e = i;
        this.f = rmbVar;
    }

    @Override // f8c, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        int i = this.e;
        if (i == 2) {
            textPaint.setColor(-1);
        } else {
            boolean z = h;
            if (i == 1) {
                textPaint.setColor(aob.w0(null, z ? aob.Yc : aob.Wc, false));
            } else {
                textPaint.setColor(aob.w0(null, z ? aob.Xc : aob.Vc, false));
            }
        }
        rmb rmbVar = this.f;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        } else {
            textPaint.setUnderlineText(false);
        }
    }
}
