package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b11 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final o1.i f;
    public final o1.j h;
    public final s0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b11(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        o1.i iVar = new o1.i(0.0f);
        this.f = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, 1.0f);
        jVar.b(new jc0(this, 5));
        this.h = jVar;
        this.n = new s0("progress", 7);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.r;
        secretMediaViewer.O.h(false, secretMediaViewer.D != null ? r3.S() / secretMediaViewer.D.U() : 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r12 == (-9223372036854775807L)) goto L6;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        long j10;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.Q.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(12.0f);
        this.d = false;
        super.onMeasure(i10, i11);
        uq0 uq0Var = secretMediaViewer.D;
        if (uq0Var != null) {
            j10 = uq0Var.U();
        }
        j10 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.Q.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        o1.j jVar = this.h;
        jVar.d();
        int i12 = this.e;
        o1.i iVar = this.f;
        if (i12 != 0) {
            float f7 = ceil;
            if (iVar.a != f7) {
                jVar.m.i = f7;
                jVar.h();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.w61 w61Var = secretMediaViewer.O;
        int z10 = org.telegram.messenger.m5.z(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        w61Var.h = z10;
        w61Var.i = measuredHeight;
        View view = w61Var.v;
        if (view != null) {
            view.invalidate();
        }
        iVar.a = ceil;
        this.e = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.O.e(motionEvent.getX() - org.telegram.messenger.i0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.P.invalidate();
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
