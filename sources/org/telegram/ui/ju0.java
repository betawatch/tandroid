package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ju0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final hb.a n;
    public final o1.j r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        hb.a aVar = new hb.a(0.0f);
        this.n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.u = org.telegram.ui.Cells.pa.k(0.0f, 750.0f, 1.0f);
        jVar.b(new ed0(this, 3));
        this.r = jVar;
        setWillNotDraw(false);
    }

    public final void a(float f10) {
        PhotoViewer photoViewer = this.s;
        photoViewer.k3.setAlpha(f10);
        photoViewer.l3.setAlpha(f10);
        if (!this.b) {
            if (this.c) {
                setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
            }
            photoViewer.n3.setAlpha(f10);
            return;
        }
        photoViewer.k3.setPivotX(r1.getWidth());
        photoViewer.k3.setPivotY(r1.getHeight());
        float f11 = 1.0f - f10;
        float f12 = 1.0f - (0.1f * f11);
        photoViewer.k3.setScaleX(f12);
        photoViewer.k3.setScaleY(f12);
        org.telegram.ui.Components.o61 o61Var = photoViewer.m3;
        if (o61Var.y != f11) {
            o61Var.y = f11;
            o61Var.v.invalidate();
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
                photoViewer.n3.setAlpha(1.0f);
            } else {
                photoViewer.k3.setScaleX(1.0f);
                photoViewer.k3.setScaleY(1.0f);
                org.telegram.ui.Components.o61 o61Var = photoViewer.m3;
                if (o61Var.y != 0.0f) {
                    o61Var.y = 0.0f;
                    o61Var.v.invalidate();
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
        org.telegram.ui.Components.m61 m61Var = photoViewer.B2;
        long j10 = 0;
        if (m61Var != null) {
            long q6 = m61Var.q();
            if (q6 != -9223372036854775807L) {
                j10 = q6;
            }
        } else {
            ht0 ht0Var = photoViewer.b0;
            if (ht0Var != null && ht0Var.x) {
                j10 = ht0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.k3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        o1.j jVar = this.r;
        jVar.c();
        int i13 = this.h;
        hb.a aVar = this.n;
        if (i13 != 0) {
            float f10 = ceil;
            if (aVar.a != f10) {
                jVar.u.i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.o61 o61Var = photoViewer.m3;
        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i12;
        int measuredHeight = getMeasuredHeight();
        o61Var.h = measuredWidth;
        o61Var.i = measuredHeight;
        View view = o61Var.v;
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
