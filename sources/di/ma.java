package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ma extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public ma(org.telegram.ui.ActionBar.x2[] x2VarArr, Context context, boolean z10) {
        this.a = x2VarArr;
        this.b = context;
        this.c = z10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        vf.c.t(this.b, gd.M0(this.c ? 2131744692 : 2131744689, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
