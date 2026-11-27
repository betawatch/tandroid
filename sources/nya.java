// default package

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nya extends ClickableSpan {
    public final /* synthetic */ nx0[] a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;

    public nya(nx0[] nx0VarArr, Context context, boolean z) {
        this.a = nx0VarArr;
        this.b = context;
        this.c = z;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        m01.u(this.b, ob6.M0(this.c ? 2131744584 : 2131744581, null));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
