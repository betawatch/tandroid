package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class lz0 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final r1.f f;
    public final r1.g h;
    public final q0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        r1.f fVar = new r1.f(0.0f);
        this.f = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.m = org.telegram.ui.Cells.f1.o(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 5));
        this.h = gVar;
        this.n = new q0("progress", 7);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
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
    public final void onMeasure(int i7, int i10) {
        long j3;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.Q.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(12.0f);
        this.d = false;
        super.onMeasure(i7, i10);
        kp0 kp0Var = secretMediaViewer.D;
        if (kp0Var != null) {
            j3 = kp0Var.U();
        }
        j3 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.Q.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j3 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        r1.g gVar = this.h;
        gVar.d();
        int i11 = this.e;
        r1.f fVar = this.f;
        if (i11 != 0) {
            float f10 = ceil;
            if (fVar.a != f10) {
                gVar.m.i = f10;
                gVar.h();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.v51 v51Var = secretMediaViewer.O;
        int z9 = org.telegram.messenger.k5.z(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        v51Var.h = z9;
        v51Var.i = measuredHeight;
        View view = v51Var.v;
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
        if (secretMediaViewer.O.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
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
