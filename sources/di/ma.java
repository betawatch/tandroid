package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ma extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public ma(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, boolean z10) {
        this.a = w2VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        vf.c.t(this.b, hd.N0(this.c ? 2131744684 : 2131744681, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
