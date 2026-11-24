// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nwa extends ClickableSpan {
    public final /* synthetic */ my0[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public nwa(my0[] my0VarArr, Context context, boolean z) {
        this.a = my0VarArr;
        this.b = context;
        this.c = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        l11.u(this.b, jb6.M0(this.c ? 2131744616 : 2131744613, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
