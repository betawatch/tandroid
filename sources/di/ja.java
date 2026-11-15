package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ja extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public ja(org.telegram.ui.ActionBar.u2[] u2VarArr, Context context, boolean z10) {
        this.a = u2VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        vf.c.t(this.b, hd.M0(this.c ? 2131744927 : 2131744924, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
