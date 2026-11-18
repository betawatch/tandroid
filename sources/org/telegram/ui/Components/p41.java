package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class p41 extends URLSpan {
    public final boolean a;
    public final dz0 b;
    public TLObject c;
    public String d;

    public p41(String str) {
        this(str, (dz0) null);
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
        dz0 dz0Var = this.b;
        if (dz0Var != null) {
            dz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i7 == color && !this.a);
    }

    public p41(String str, int i7) {
        this(str, (dz0) null);
        this.a = true;
    }

    public p41(String str, dz0 dz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = dz0Var;
    }
}
