package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gu0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final ib.a n;
    public final o1.k r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        ib.a aVar = new ib.a(0.0f);
        this.n = aVar;
        o1.k kVar = new o1.k(aVar);
        kVar.u = th.l(0.0f, 750.0f, 1.0f);
        kVar.b(new cd0(this, 3));
        this.r = kVar;
        setWillNotDraw(false);
    }

    public final void a(float f9) {
        PhotoViewer photoViewer = this.s;
        photoViewer.k3.setAlpha(f9);
        photoViewer.l3.setAlpha(f9);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f9) * AndroidUtilities.dpf2(24.0f));
            }
            photoViewer.n3.setAlpha(f9);
            return;
        }
        photoViewer.k3.setPivotX(r1.getWidth());
        photoViewer.k3.setPivotY(r1.getHeight());
        float f10 = 1.0f - f9;
        float f11 = 1.0f - (0.1f * f10);
        photoViewer.k3.setScaleX(f11);
        photoViewer.k3.setScaleY(f11);
        org.telegram.ui.Components.z61 z61Var = photoViewer.m3;
        if (z61Var.y != f10) {
            z61Var.y = f10;
            z61Var.v.invalidate();
        }
    }

    public final void b(float f9) {
        if (this.a != f9) {
            this.a = f9;
            a(f9);
        }
    }

    public final void c(boolean z10) {
        if (this.b != z10) {
            this.b = z10;
            PhotoViewer photoViewer = this.s;
            if (z10) {
                setTranslationY(0.0f);
                photoViewer.n3.setAlpha(1.0f);
            } else {
                photoViewer.k3.setScaleX(1.0f);
                photoViewer.k3.setScaleY(1.0f);
                org.telegram.ui.Components.z61 z61Var = photoViewer.m3;
                if (z61Var.y != 0.0f) {
                    z61Var.y = 0.0f;
                    z61Var.v.invalidate();
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
        float o10 = photoViewer.B2 != null ? r3.o() / photoViewer.B2.q() : 0.0f;
        if (photoViewer.S2) {
            photoViewer.m3.h(o10, false);
        }
        photoViewer.N7.setProgress(o10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.k3.getLayoutParams();
        if (this.e > this.f) {
            if (photoViewer.l3.getVisibility() != 0) {
                photoViewer.l3.setVisibility(0);
            }
            i12 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.l3.getVisibility() != 4) {
                photoViewer.l3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i12 = 0;
        }
        this.d = false;
        super.onMeasure(i10, i11);
        org.telegram.ui.Components.x61 x61Var = photoViewer.B2;
        long j10 = 0;
        if (x61Var != null) {
            long q6 = x61Var.q();
            if (q6 != -9223372036854775807L) {
                j10 = q6;
            }
        } else {
            et0 et0Var = photoViewer.b0;
            if (et0Var != null && et0Var.x) {
                j10 = et0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.k3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        o1.k kVar = this.r;
        kVar.c();
        int i13 = this.h;
        ib.a aVar = this.n;
        if (i13 != 0) {
            float f9 = ceil;
            if (aVar.a != f9) {
                kVar.u.i = f9;
                kVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.z61 z61Var = photoViewer.m3;
        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        int measuredHeight = getMeasuredHeight();
        z61Var.h = measuredWidth;
        z61Var.i = measuredHeight;
        View view = z61Var.v;
        if (view != null) {
            view.invalidate();
        }
        aVar.a = ceil;
        this.h = ceil;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.a < 1.0f) {
            return false;
        }
        PhotoViewer photoViewer = this.s;
        if (photoViewer.m3.e(motionEvent.getX() - AndroidUtilities.dp(2.0f), motionEvent.getY(), motionEvent.getAction())) {
            getParent().requestDisallowInterceptTouchEvent(true);
            photoViewer.n3.invalidate();
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
