package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ms0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final o1.i n;
    public final o1.j r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ms0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        o1.i iVar = new o1.i(0.0f);
        this.n = iVar;
        o1.j jVar = new o1.j(iVar);
        jVar.m = org.telegram.ui.Cells.f1.p(0.0f, 750.0f, 1.0f);
        jVar.b(new jc0(this, 3));
        this.r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f7) {
        PhotoViewer photoViewer = this.s;
        photoViewer.o3.setAlpha(f7);
        photoViewer.p3.setAlpha(f7);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f7) * org.telegram.messenger.i0.N(24.0f));
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
        org.telegram.ui.Components.w61 w61Var = photoViewer.q3;
        if (w61Var.y != f10) {
            w61Var.y = f10;
            w61Var.v.invalidate();
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
                org.telegram.ui.Components.w61 w61Var = photoViewer.q3;
                if (w61Var.y != 0.0f) {
                    w61Var.y = 0.0f;
                    w61Var.v.invalidate();
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
        float S = photoViewer.F2 != null ? r3.S() / photoViewer.F2.U() : 0.0f;
        if (photoViewer.W2) {
            photoViewer.q3.h(false, S);
        }
        photoViewer.S7.setProgress(S);
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
            i12 = org.telegram.messenger.i0.L(48.0f);
            layoutParams.rightMargin = org.telegram.messenger.i0.L(47.0f);
        } else {
            if (photoViewer.p3.getVisibility() != 4) {
                photoViewer.p3.setVisibility(4);
            }
            layoutParams.rightMargin = org.telegram.messenger.i0.L(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
        long j10 = 0;
        if (u61Var != null) {
            long U = u61Var.U();
            if (U != -9223372036854775807L) {
                j10 = U;
            }
        } else {
            mr0 mr0Var = photoViewer.f0;
            if (mr0Var != null && mr0Var.y) {
                j10 = mr0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.o3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        o1.j jVar = this.r;
        jVar.d();
        int i13 = this.h;
        o1.i iVar = this.n;
        if (i13 != 0) {
            float f7 = ceil;
            if (iVar.a != f7) {
                jVar.m.i = f7;
                jVar.h();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.w61 w61Var = photoViewer.q3;
        int measuredWidth = ((getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - ceil) - i12;
        int measuredHeight = getMeasuredHeight();
        w61Var.h = measuredWidth;
        w61Var.i = measuredHeight;
        View view = w61Var.v;
        if (view != null) {
            view.invalidate();
        }
        iVar.a = ceil;
        this.h = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.q3.e(motionEvent.getX() - org.telegram.messenger.i0.L(2.0f), motionEvent.getY(), motionEvent.getAction())) {
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
