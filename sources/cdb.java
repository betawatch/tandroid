// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cdb extends r59 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ fdb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdb(fdb fdbVar, Context context) {
        super(context, null);
        this.h3 = fdbVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bdb bdbVar = this.h3.d;
        if (bdbVar != null) {
            bdbVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fx2 previewDelegate;
        hx2 e = hx2.e();
        fdb fdbVar = this.h3;
        cdb cdbVar = fdbVar.e;
        previewDelegate = fdbVar.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, cdbVar, previewDelegate, this.o2);
    }
}
