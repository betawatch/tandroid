// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jua extends ClickableSpan {
    public final /* synthetic */ fx0[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public jua(fx0[] fx0VarArr, Context context, boolean z) {
        this.a = fx0VarArr;
        this.b = context;
        this.c = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        d01.t(this.b, k96.M0(this.c ? 2131744690 : 2131744687, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
