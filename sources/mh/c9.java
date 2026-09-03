package mh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c9 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public c9(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, boolean z4) {
        this.a = h3VarArr;
        this.b = context;
        this.c = z4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        af.g.s(this.b, LocaleController.getString(this.c ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
