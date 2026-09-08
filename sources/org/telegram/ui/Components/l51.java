package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class l51 extends URLSpan {
    public final boolean a;
    public final n01 b;
    public TLObject c;
    public String d;

    public l51(String str) {
        this(str, (n01) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            of.f.s(view.getContext(), url);
            return;
        }
        of.f.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        n01 n01Var = this.b;
        if (n01Var != null) {
            n01Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public l51(String str, int i10) {
        this(str, (n01) null);
        this.a = true;
    }

    public l51(String str, n01 n01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = n01Var;
    }
}
