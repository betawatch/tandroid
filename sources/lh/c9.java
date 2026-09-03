package lh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class c9 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public c9(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, boolean z4) {
        this.a = g3VarArr;
        this.b = context;
        this.c = z4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        ze.d.s(this.b, LocaleController.getString(this.c ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
