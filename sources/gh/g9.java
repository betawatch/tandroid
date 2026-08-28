package gh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g9 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.f3[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public g9(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.a = f3VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        ve.e.s(this.b, LocaleController.getString(this.c ? R.string.StarsTransactionTONFromFragmentLink : R.string.StarsTransactionUnknownLink));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
