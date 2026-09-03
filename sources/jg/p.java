package jg;

import android.content.Context;
import fg.p2;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p extends p2 {
    public final /* synthetic */ s n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Context context) {
        super(context);
        this.n = sVar;
    }

    @Override // fg.p2, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.b.setPaused(false);
    }

    @Override // fg.p2, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.b.setPaused(true);
    }

    @Override // fg.p2, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
