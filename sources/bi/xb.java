package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class xb extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public xb(org.telegram.ui.ActionBar.w2[] w2VarArr, Context context, boolean z9) {
        this.a = w2VarArr;
        this.b = context;
        this.c = z9;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        vf.c.t(this.b, org.telegram.messenger.id.M0(this.c ? 2131744927 : 2131744924, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
