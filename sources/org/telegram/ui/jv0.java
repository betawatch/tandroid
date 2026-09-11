package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class jv0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final o1.j n;
    public final o1.k r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        o1.j jVar = new o1.j(0.0f);
        this.n = jVar;
        o1.k kVar = new o1.k(jVar);
        kVar.u = org.telegram.ui.Cells.p6.l(0.0f, 750.0f, 1.0f);
        kVar.b(new td0(this, 3));
        this.r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.s;
        photoViewer.o3.setAlpha(f7);
        photoViewer.p3.setAlpha(f7);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
            }
            photoViewer.r3.setAlpha(f7);
            return;
        }
        photoViewer.o3.setPivotX(r1.getWidth());
        photoViewer.o3.setPivotY(r1.getHeight());
        float f10 = 1.0f - f7;
        float f11 = 1.0f - (0.1f * f10);
        photoViewer.o3.setScaleX(f11);
        photoViewer.o3.setScaleY(f11);
        org.telegram.ui.Components.i71 i71Var = photoViewer.q3;
        if (i71Var.y != f10) {
            i71Var.y = f10;
            i71Var.v.invalidate();
        }
    }

    public final void b(float f7) {
        if (this.a != f7) {
            this.a = f7;
            a(f7);
        }
    }

    public final void c(boolean z10) {
        if (this.b != z10) {
            this.b = z10;
            PhotoViewer photoViewer = this.s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.r3.setAlpha(1.0f);
            } else {
                photoViewer.o3.setScaleX(1.0f);
                photoViewer.o3.setScaleY(1.0f);
                org.telegram.ui.Components.i71 i71Var = photoViewer.q3;
                if (i71Var.y != 0.0f) {
                    i71Var.y = 0.0f;
                    i71Var.v.invalidate();
                }
            }
            a(this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.a = 0.0f;
        this.h = 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        PhotoViewer photoViewer = this.s;
        float n10 = photoViewer.F2 != null ? r3.n() / photoViewer.F2.p() : 0.0f;
        if (photoViewer.W2) {
            photoViewer.q3.h(n10, false);
        }
        photoViewer.R7.setProgress(n10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.o3.getLayoutParams();
        if (this.e > this.f) {
            if (photoViewer.p3.getVisibility() != 0) {
                photoViewer.p3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.p3.getVisibility() != 4) {
                photoViewer.p3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.g71 g71Var = photoViewer.F2;
        long j3 = 0;
        if (g71Var != null) {
            long p5 = g71Var.p();
            if (p5 != -9223372036854775807L) {
                j3 = p5;
            }
        } else {
            hu0 hu0Var = photoViewer.f0;
            if (hu0Var != null && hu0Var.x) {
                j3 = hu0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j3 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        o1.k kVar = this.r;
        kVar.c();
        int i13 = this.h;
        o1.j jVar = this.n;
        if (i13 != 0) {
            float f7 = ceil;
            if (jVar.a != f7) {
                kVar.u.i = f7;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.i71 i71Var = photoViewer.q3;
        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        int measuredHeight = getMeasuredHeight();
        i71Var.h = measuredWidth;
        i71Var.i = measuredHeight;
        View view = i71Var.v;
        if (view != null) {
            view.invalidate();
        }
        jVar.a = ceil;
        this.h = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.q3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.r3.invalidate();
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
