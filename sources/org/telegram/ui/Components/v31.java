package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
            sf.c.t(view.getContext(), url);
            return;
        }
        sf.c.q(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i3 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        ty0 ty0Var = this.b;
        if (ty0Var != null) {
            ty0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i3 == color && !this.a);
    }

    public v31(String str, int i3) {
        this(str, (ty0) null);
        this.a = true;
    }

    public v31(String str, ty0 ty0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = ty0Var;
    }
}
