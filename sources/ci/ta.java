package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ta extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public ta(org.telegram.ui.ActionBar.t2[] t2VarArr, Context context, boolean z10) {
        this.a = t2VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        sf.c.t(this.b, bd.M0(this.c ? 2131744937 : 2131744934, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
