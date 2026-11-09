package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        vf.c.t(this.b, org.telegram.messenger.id.M0(this.c ? 2131744927 : 2131744924, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
