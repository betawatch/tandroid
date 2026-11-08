package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class b41 extends URLSpan {
    public final boolean a;
    public final uy0 b;
    public TLObject c;
    public String d;

    public b41(String str) {
        this(str, (uy0) null);
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
        uy0 uy0Var = this.b;
        if (uy0Var != null) {
            uy0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i7 == color && !this.a);
    }

    public b41(String str, int i7) {
        this(str, (uy0) null);
        this.a = true;
    }

    public b41(String str, uy0 uy0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = uy0Var;
    }
}
