// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i4c extends URLSpan {
    public final vib a;
    public boolean b;

    public i4c(String str, vib vibVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = vibVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).X0 = true;
        }
        d01.q(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vib vibVar = this.a;
        if (vibVar != null) {
            vibVar.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
