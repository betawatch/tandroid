package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class n51 extends URLSpan {
    public final boolean a;
    public final p01 b;
    public TLObject c;
    public String d;

    public n51(String str) {
        this(str, (p01) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            nf.f.s(view.getContext(), url);
            return;
        }
        nf.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        p01 p01Var = this.b;
        if (p01Var != null) {
            p01Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public n51(String str, int i10) {
        this(str, (p01) null);
        this.a = true;
    }

    public n51(String str, p01 p01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = p01Var;
    }
}
