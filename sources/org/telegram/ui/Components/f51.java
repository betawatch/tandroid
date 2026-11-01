package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class f51 extends URLSpan {
    public final boolean a;
    public final zz0 b;
    public TLObject c;
    public String d;

    public f51(String str) {
        this(str, (zz0) null);
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
        zz0 zz0Var = this.b;
        if (zz0Var != null) {
            zz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public f51(String str, int i10) {
        this(str, (zz0) null);
        this.a = true;
    }

    public f51(String str, zz0 zz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = zz0Var;
    }
}
