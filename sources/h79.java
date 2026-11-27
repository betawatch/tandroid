// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class h79 extends vic {
    public final wka W;
    public boolean a0;
    public View b0;
    public View c0;

    public h79(Context context, vnb vnbVar, wka wkaVar) {
        super(context, vnbVar);
        this.W = wkaVar;
        setClipChildren(false);
        setClipToPadding(false);
    }

    @Override // vic
    public final void B(int i) {
        wka wkaVar = this.W;
        wkaVar.g("PAGER_TAB_END");
        wkaVar.s();
    }

    @Override // vic
    public final boolean C(MotionEvent motionEvent) {
        boolean z = this.I;
        boolean C = super.C(motionEvent);
        if (z && !this.I && motionEvent != null && motionEvent.getActionMasked() == 2) {
            View[] viewPages = getViewPages();
            View view = viewPages[0];
            View view2 = viewPages[1];
            if (view != null && view2 != null && view.getTranslationX() == 0.0f && view.getMeasuredWidth() > 0 && Math.abs(view2.getTranslationX()) >= view.getMeasuredWidth()) {
                this.b0 = view;
                this.c0 = view2;
                wka wkaVar = this.W;
                wkaVar.g("PAGER_DRAG_ABORTED");
                wkaVar.s();
            }
        }
        return C;
    }

    @Override // vic
    public final void G(View view, float f) {
        if (view.getTranslationX() == f) {
            return;
        }
        super.G(view, f);
        invalidate();
    }

    public final void M(View view) {
        this.b0 = null;
        this.c0 = null;
        wka wkaVar = this.W;
        wkaVar.f("PAGE_BOUND", view, 0, 0, true);
        if (wkaVar.P == null) {
            return;
        }
        if (wkaVar.e0) {
            wkaVar.i("page_bound");
        }
        RecyclerView h = wkaVar.P.h(view);
        wkaVar.b(h);
        wkaVar.P.o(h);
        wkaVar.s();
    }

    public final void N(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getActionMasked() != 0) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        wka wkaVar = this.W;
        boolean o = wkaVar.o(x, y);
        this.a0 = o;
        wkaVar.g(o ? "PAGER_DOWN_COMMON" : "PAGER_DOWN_PAGE");
    }

    @Override // vic
    public final boolean c(MotionEvent motionEvent) {
        return !this.a0 && this.W.c();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int save = canvas.save();
        float x = view.getX();
        wka wkaVar = this.W;
        canvas.clipRect(x, -wkaVar.getTopBleed(), view.getX() + view.getWidth(), wkaVar.getBottomBleed() + getHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        return drawChild;
    }

    @Override // vic
    public float getAvailableTranslationX() {
        return Math.max(1, getMeasuredWidth());
    }

    @Override // vic, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        N(motionEvent);
        return !this.a0 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // vic, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wka wkaVar = this.W;
        if (motionEvent == null) {
            wkaVar.g("PAGER_CANCEL_NULL");
            this.a0 = false;
            return C(null);
        }
        N(motionEvent);
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            wkaVar.g(motionEvent.getActionMasked() == 1 ? "PAGER_UP" : "PAGER_CANCEL");
        }
        return !this.a0 && C(motionEvent);
    }

    @Override // vic
    public final void v() {
        wka wkaVar = this.W;
        wkaVar.g("PAGER_SCROLL_END");
        wkaVar.s();
    }

    @Override // vic
    public final void w() {
        this.b0 = null;
        this.c0 = null;
    }

    @Override // vic
    public final void x(boolean z) {
        this.W.s();
    }
}
