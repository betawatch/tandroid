// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class i6c extends URLSpan {
    public final wkb a;
    public boolean b;

    public i6c(String str, wkb wkbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = wkbVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        l11.r(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wkb wkbVar = this.a;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
