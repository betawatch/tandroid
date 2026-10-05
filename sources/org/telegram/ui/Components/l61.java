package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public class l61 extends URLSpan {
    public final boolean a;
    public final n11 b;
    public TLObject c;
    public String d;

    public l61(String str) {
        this(str, (n11) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            nf.f.s(view.getContext(), url);
            return;
        }
        nf.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        n11 n11Var = this.b;
        if (n11Var != null) {
            n11Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public l61(String str, int i10) {
        this(str, (n11) null);
        this.a = true;
    }

    public l61(String str, n11 n11Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = n11Var;
    }
}
