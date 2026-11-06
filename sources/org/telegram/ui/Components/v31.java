package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class v31 extends URLSpan {
    public final boolean a;
    public final ty0 b;
    public TLObject c;
    public String d;

    public v31(String str) {
        this(str, (ty0) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            vf.c.t(view.getContext(), url);
            return;
        }
        vf.c.q(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i7 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.b;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i7 == color && !this.a);
    }

    public v31(String str, int i7) {
        this(str, (ty0) null);
        this.a = true;
    }

    public v31(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = ty0Var;
    }
}
