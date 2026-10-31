package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class e51 extends URLSpan {
    public final boolean a;
    public final yz0 b;
    public TLObject c;
    public String d;

    public e51(String str) {
        this(str, (yz0) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            gf.f.r(view.getContext(), url);
            return;
        }
        gf.f.o(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        yz0 yz0Var = this.b;
        if (yz0Var != null) {
            yz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public e51(String str, int i10) {
        this(str, (yz0) null);
        this.a = true;
    }

    public e51(String str, yz0 yz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = yz0Var;
    }
}
