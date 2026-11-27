// default package

import android.text.TextPaint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
