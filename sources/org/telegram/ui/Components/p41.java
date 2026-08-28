package org.telegram.ui.Components;

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class p41 extends URLSpan {
    public final boolean a;
    public final vz0 b;
    public TLObject c;
    public String d;

    public p41(String str) {
        this(str, (vz0) null);
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            ve.e.s(view.getContext(), url);
            return;
        }
        ve.e.p(view.getContext(), Uri.parse("https://t.me/" + url.substring(1)), true, true);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i9 = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vz0 vz0Var = this.b;
        if (vz0Var != null) {
            vz0Var.a(textPaint);
        }
        textPaint.setUnderlineText(i9 == color && !this.a);
    }

    public p41(String str, int i9) {
        this(str, (vz0) null);
        this.a = true;
    }

    public p41(String str, vz0 vz0Var) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = vz0Var;
    }
}
