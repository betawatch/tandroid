// default package

import android.net.Uri;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class g4c extends URLSpan {
    public final boolean a;
    public final vib b;
    public TLObject c;
    public String d;

    public g4c(String str, vib vibVar) {
        super(str != null ? str.replace((char) 8238, ' ') : str);
        this.a = false;
        this.b = vibVar;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        String url = getURL();
        if (!url.startsWith("@")) {
            d01.t(view.getContext(), url);
        } else {
            d01.q(view.getContext(), Uri.parse("https://t.me/".concat(url.substring(1))), true, true);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i = textPaint.linkColor;
        int color = textPaint.getColor();
        super.updateDrawState(textPaint);
        vib vibVar = this.b;
        if (vibVar != null) {
            vibVar.a(textPaint);
        }
        textPaint.setUnderlineText(i == color && !this.a);
    }

    public g4c(String str, int i) {
        this(str, (vib) null);
        this.a = true;
    }

    public g4c(String str) {
        this(str, (vib) null);
    }
}
