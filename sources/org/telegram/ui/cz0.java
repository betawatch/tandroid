package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class cz0 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final q1.f f;
    public final q1.g h;
    public final r0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        q1.f fVar = new q1.f(0.0f);
        this.f = fVar;
        q1.g gVar = new q1.g(fVar);
        gVar.m = org.telegram.ui.Cells.f1.s(0.0f, 750.0f, 1.0f);
        gVar.b(new wa0(this, 5));
        this.h = gVar;
        this.n = new r0("progress", 7);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        SecretMediaViewer secretMediaViewer = this.r;
        secretMediaViewer.P.h(false, secretMediaViewer.E != null ? r3.S() / secretMediaViewer.E.U() : 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r12 == (-9223372036854775807L)) goto L6;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        long j10;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.R.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        this.d = false;
        super.onMeasure(i3, i10);
        bp0 bp0Var = secretMediaViewer.E;
        if (bp0Var != null) {
            j10 = bp0Var.U();
        }
        j10 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.R.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        q1.g gVar = this.h;
        gVar.d();
        int i11 = this.e;
        q1.f fVar = this.f;
        if (i11 != 0) {
            float f10 = ceil;
            if (fVar.a != f10) {
                gVar.m.i = f10;
                gVar.h();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.o51 o51Var = secretMediaViewer.P;
        int z10 = org.telegram.messenger.k5.z(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        o51Var.h = z10;
        o51Var.i = measuredHeight;
        View view = o51Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.a = ceil;
        this.e = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.P.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.Q.invalidate();
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }
}
