package og;

import android.content.Context;
import kg.g2;
import org.telegram.messenger.i0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p extends g2 {
    public final /* synthetic */ s r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, Context context) {
        super(context);
        this.r = sVar;
    }

    @Override // kg.g2, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.b.setPaused(false);
    }

    @Override // kg.g2, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.b.setPaused(true);
    }

    @Override // kg.g2, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.a.b.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - i0.L(52.0f));
    }
}
