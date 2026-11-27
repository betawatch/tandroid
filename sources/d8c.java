// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class d8c extends URLSpan {
    public final rmb a;

    public d8c(String str, rmb rmbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = rmbVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        m01.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        rmb rmbVar = this.a;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
