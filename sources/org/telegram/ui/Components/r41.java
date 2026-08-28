package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r41 extends URLSpan {
    public final vz0 a;
    public boolean b;

    public r41(String str, vz0 vz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = vz0Var;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.b && (view.getContext() instanceof LaunchActivity)) {
            ((LaunchActivity) view.getContext()).T0 = true;
        }
        ve.e.p(view.getContext(), Uri.parse(getURL()), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.a;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
            textPaint.setUnderlineText(textPaint.linkColor == color);
        }
    }
}
