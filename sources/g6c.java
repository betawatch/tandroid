// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class g6c extends URLSpan {
    public final boolean a;
    public final wkb b;
    public TLObject c;
    public String d;

    public g6c(String str, wkb wkbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = wkbVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            l11.u(view.getContext(), url);
        } else {
            l11.r(view.getContext(), Uri.parse("https://t.me/".concat(url.substring(1))), true, true);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        wkb wkbVar = this.b;
        if (wkbVar != null) {
            wkbVar.a(textPaint);
        }
        textPaint.setUnderlineText(i == color && !this.a);
    }

    public g6c(String str, int i) {
        this(str, (wkb) null);
        this.a = true;
    }

    public g6c(String str) {
        this(str, (wkb) null);
    }
}
