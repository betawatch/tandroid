// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e6c extends URLSpan {
    public final wkb a;

    public e6c(String str, wkb wkbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = wkbVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        l11.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        wkb wkbVar = this.a;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        }
        textPaint.setUnderlineText(true);
    }
}
