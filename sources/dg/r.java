package dg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import zf.w1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r extends w1 {
    public final /* synthetic */ u n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, Context context) {
        super(context);
        this.n = uVar;
    }

    @Override // zf.w1, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n.b.setPaused(false);
    }

    @Override // zf.w1, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.b.setPaused(true);
    }

    @Override // zf.w1, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
    }
}
