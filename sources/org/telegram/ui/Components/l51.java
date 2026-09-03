package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class l51 extends URLSpan {
    public final boolean a;
    public final s01 b;
    public TLObject c;
    public String d;

    public l51(String str) {
        this(str, (s01) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            af.g.s(view.getContext(), url);
            return;
        }
        af.g.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i10 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        s01 s01Var = this.b;
        if (s01Var != null) {
            s01Var.a(textPaint);
        }
        textPaint.setUnderlineText(i10 == color && !this.a);
    }

    public l51(String str, int i10) {
        this(str, (s01) null);
        this.a = true;
    }

    public l51(String str, s01 s01Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = s01Var;
    }
}
