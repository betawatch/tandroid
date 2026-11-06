package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class xb extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public xb(org.telegram.ui.ActionBar.v2[] v2VarArr, Context context, boolean z9) {
        this.a = v2VarArr;
        this.b = context;
        this.c = z9;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        vf.c.t(this.b, org.telegram.messenger.hd.M0(this.c ? 2131744928 : 2131744925, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
