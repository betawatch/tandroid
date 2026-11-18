package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cr0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final r1.f n;
    public final r1.g r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        r1.f fVar = new r1.f(0.0f);
        this.n = fVar;
        r1.g gVar = new r1.g(fVar);
        gVar.m = org.telegram.ui.Cells.c0.p(0.0f, 750.0f, 1.0f);
        gVar.b(new ab0(this, 3));
        this.r = gVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.s;
        photoViewer.o3.setAlpha(f10);
        photoViewer.p3.setAlpha(f10);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
            }
            photoViewer.r3.setAlpha(f10);
            return;
        }
        photoViewer.o3.setPivotX(r1.getWidth());
        photoViewer.o3.setPivotY(r1.getHeight());
        float f11 = 1.0f - f10;
        float f12 = 1.0f - (0.1f * f11);
        photoViewer.o3.setScaleX(f12);
        photoViewer.o3.setScaleY(f12);
        org.telegram.ui.Components.h61 h61Var = photoViewer.q3;
        if (h61Var.y != f11) {
            h61Var.y = f11;
            h61Var.v.invalidate();
        }
    }

    public final void b(float f10) {
        if (this.a != f10) {
            this.a = f10;
            a(f10);
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
                org.telegram.ui.Components.h61 h61Var = photoViewer.q3;
                if (h61Var.y != 0.0f) {
                    h61Var.y = 0.0f;
                    h61Var.v.invalidate();
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        PhotoViewer photoViewer = this.s;
        float S = photoViewer.G2 != null ? r3.S() / photoViewer.G2.U() : 0.0f;
        if (photoViewer.W2) {
            photoViewer.q3.h(false, S);
        }
        photoViewer.S7.setProgress(S);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.o3.getLayoutParams();
        if (this.e > this.f) {
            if (photoViewer.p3.getVisibility() != 0) {
                photoViewer.p3.setVisibility(0);
            }
            i11 = org.telegram.messenger.g0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(47.0f);
        } else {
            if (photoViewer.p3.getVisibility() != 4) {
                photoViewer.p3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.g0.L(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i7, i10);
        org.telegram.ui.Components.f61 f61Var = photoViewer.G2;
        long j3 = 0;
        if (f61Var != null) {
            long U = f61Var.U();
            if (U != -9223372036854775807L) {
                j3 = U;
            }
        } else {
            dq0 dq0Var = photoViewer.g0;
            if (dq0Var != null && dq0Var.y) {
                j3 = dq0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j3 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        r1.g gVar = this.r;
        gVar.d();
        int i12 = this.h;
        r1.f fVar = this.n;
        if (i12 != 0) {
            float f10 = ceil;
            if (fVar.a != f10) {
                gVar.m.i = f10;
                gVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.h61 h61Var = photoViewer.q3;
        int measuredWidth = ((getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - ceil) - i11;
        int measuredHeight = getMeasuredHeight();
        h61Var.h = measuredWidth;
        h61Var.i = measuredHeight;
        View view = h61Var.v;
        if (view != null) {
            view.invalidate();
        }
        fVar.a = ceil;
        this.h = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.q3.e(motionEvent.getX() - org.telegram.messenger.g0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
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
