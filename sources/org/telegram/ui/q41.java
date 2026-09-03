package org.telegram.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class q41 extends FrameLayout {
    public float a;
    public final boolean b;
    public final boolean c;
    public boolean d;
    public int e;
    public final kb.a f;
    public final o1.j h;
    public final w0 n;
    public final /* synthetic */ SecretMediaViewer r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q41(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.r = secretMediaViewer;
        this.a = 1.0f;
        this.b = true;
        this.c = true;
        kb.a aVar = new kb.a(0.0f);
        this.f = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.u = ai.m(0.0f, 750.0f, 1.0f);
        jVar.b(new nd0(this, 5));
        this.h = jVar;
        this.n = new w0("progress", 6);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f.a = 0.0f;
        this.e = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        SecretMediaViewer secretMediaViewer = this.r;
        secretMediaViewer.N.h(secretMediaViewer.y != null ? r3.n() / secretMediaViewer.y.p() : 0.0f, false);
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
        ((FrameLayout.LayoutParams) secretMediaViewer.P.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        this.d = false;
        super.onMeasure(i10, i11);
        o41 o41Var = secretMediaViewer.y;
        if (o41Var != null) {
            j10 = o41Var.p();
        }
        j10 = 0;
        int ceil = (int) Math.ceil(secretMediaViewer.P.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r5 / 60), Long.valueOf(r5 % 60), Long.valueOf(r12 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r5), Long.valueOf(r12 % 60)))));
        o1.j jVar = this.h;
        jVar.c();
        int i12 = this.e;
        kb.a aVar = this.f;
        if (i12 != 0) {
            float f10 = ceil;
            if (aVar.a != f10) {
                jVar.u.i = f10;
                jVar.f();
                this.e = ceil;
            }
        }
        org.telegram.ui.Components.k71 k71Var = secretMediaViewer.N;
        int B = org.telegram.messenger.y3.B(16.0f, getMeasuredWidth(), ceil);
        int measuredHeight = getMeasuredHeight();
        k71Var.h = B;
        k71Var.i = measuredHeight;
        View view = k71Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.a = ceil;
        this.e = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        SecretMediaViewer secretMediaViewer = this.r;
        if (secretMediaViewer.N.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            secretMediaViewer.O.invalidate();
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
