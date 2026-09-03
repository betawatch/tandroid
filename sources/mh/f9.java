package mh;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f9 extends ClickableSpan {
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] a;
    public final /* synthetic */ long b;

    public f9(org.telegram.ui.ActionBar.h3[] h3VarArr, long j10) {
        this.a = h3VarArr;
        this.b = j10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a[0].dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            U.presentFragment(xn.R9(this.b));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
