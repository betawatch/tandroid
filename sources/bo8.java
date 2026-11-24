// default package

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class bo8 extends URLSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ ko8 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo8(ko8 ko8Var, String str, String str2) {
        super(str);
        this.b = ko8Var;
        this.a = str2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        d01.t(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
