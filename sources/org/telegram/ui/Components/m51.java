package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class m51 extends URLSpan {
    public final boolean a;
    public final o01 b;
    public TLObject c;
    public String d;

    public m51(String str) {
        this(str, (o01) null);
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
        o01 o01Var = this.b;
        if (o01Var != null) {
            o01Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public m51(String str, int i10) {
        this(str, (o01) null);
        this.a = true;
    }

    public m51(String str, o01 o01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = o01Var;
    }
}
