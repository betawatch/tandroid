// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class f8c extends URLSpan {
    public final boolean a;
    public final rmb b;
    public TLObject c;
    public String d;

    public f8c(String str, rmb rmbVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = rmbVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            m01.u(view.getContext(), url);
        } else {
            m01.r(view.getContext(), Uri.parse("https://t.me/".concat(url.substring(1))), true, true);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        rmb rmbVar = this.b;
        if (rmbVar != null) {
            rmbVar.a(textPaint);
        }
        textPaint.setUnderlineText(i == color && !this.a);
    }

    public f8c(String str, int i) {
        this(str, (rmb) null);
        this.a = true;
    }

    public f8c(String str) {
        this(str, (rmb) null);
    }
}
