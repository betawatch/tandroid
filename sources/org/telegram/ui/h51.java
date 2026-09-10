package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h51 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final o1.j f;
    public final o1.k h;
    public final t0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        o1.j jVar = new o1.j(0.0f);
        this.f = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.u = org.telegram.ui.Cells.r6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 5));
        this.h = kVar;
        this.n = new t0("progress", 6);
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
        secretMediaViewer.Q.h(secretMediaViewer.y != null ? r3.n() / secretMediaViewer.y.p() : 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002a, code lost:
    
        if (r12 == (-9223372036854775807L)) goto L6;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        long j3;
        this.d = true;
        SecretMediaViewer secretMediaViewer = this.r;
        ((FrameLayout.LayoutParams) secretMediaViewer.S.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        this.d = false;
        super.onMeasure(i10, i11);
        f51 f51Var = secretMediaViewer.y;
        if (f51Var != null) {
            j3 = f51Var.p();
        }
        j3 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.S.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j3 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        o1.k kVar = this.h;
        kVar.c();
        int i12 = this.e;
        o1.j jVar = this.f;
        if (i12 != 0) {
            float f7 = ceil;
            if (jVar.a != f7) {
                kVar.u.i = f7;
                kVar.f();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.v71 v71Var = secretMediaViewer.Q;
        int B = org.telegram.messenger.a2.B(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        v71Var.h = B;
        v71Var.i = measuredHeight;
        View view = v71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.a = ceil;
        this.e = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.Q.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.R.invalidate();
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
