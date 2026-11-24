// default package

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class abb extends o39 {
    public boolean f3;
    public boolean g3;
    public final /* synthetic */ dbb h3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abb(dbb dbbVar, Context context) {
        super(context, null);
        this.h3 = dbbVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m0(int i) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        zab zabVar = this.h3.d;
        if (zabVar != null) {
            zabVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vv2 previewDelegate;
        xv2 e = xv2.e();
        dbb dbbVar = this.h3;
        abb abbVar = dbbVar.e;
        previewDelegate = dbbVar.getPreviewDelegate();
        return super.onInterceptTouchEvent(motionEvent) || e.g(motionEvent, abbVar, previewDelegate, this.o2);
    }
}
