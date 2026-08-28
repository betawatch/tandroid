package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class iu0 extends FrameLayout {
    public float a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int h;
    public final gb.a n;
    public final o1.j r;
    public final /* synthetic */ PhotoViewer s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.s = photoViewer;
        this.a = 1.0f;
        this.c = true;
        gb.a aVar = new gb.a(0.0f);
        this.n = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.u = org.telegram.ui.Cells.j2.i(0.0f, 750.0f, 1.0f);
        jVar.b(new ad0(this, 3));
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
        org.telegram.ui.Components.m61 m61Var = photoViewer.m3;
        if (m61Var.y != f11) {
            m61Var.y = f11;
            m61Var.v.invalidate();
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
                org.telegram.ui.Components.m61 m61Var = photoViewer.m3;
                if (m61Var.y != 0.0f) {
                    m61Var.y = 0.0f;
                    m61Var.v.invalidate();
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        PhotoViewer photoViewer = this.s;
        float o6 = photoViewer.B2 != null ? r3.o() / photoViewer.B2.q() : 0.0f;
        if (photoViewer.S2) {
            photoViewer.m3.h(o6, false);
        }
        photoViewer.N7.setProgress(o6);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        this.d = true;
        PhotoViewer photoViewer = this.s;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.k3.getLayoutParams();
        if (this.e > this.f) {
            if (photoViewer.l3.getVisibility() != 0) {
                photoViewer.l3.setVisibility(0);
            }
            i11 = AndroidUtilities.dp(48.0f);
            layoutParams.rightMargin = AndroidUtilities.dp(47.0f);
        } else {
            if (photoViewer.l3.getVisibility() != 4) {
                photoViewer.l3.setVisibility(4);
            }
            layoutParams.rightMargin = AndroidUtilities.dp(12.0f);
            i11 = 0;
        }
        this.d = false;
        super.onMeasure(i9, i10);
        org.telegram.ui.Components.k61 k61Var = photoViewer.B2;
        long j10 = 0;
        if (k61Var != null) {
            long q10 = k61Var.q();
            if (q10 != -9223372036854775807L) {
                j10 = q10;
            }
        } else {
            gt0 gt0Var = photoViewer.b0;
            if (gt0Var != null && gt0Var.x) {
                j10 = gt0Var.getVideoDuration();
            }
        }
        int ceil = (int) Math.ceil(photoViewer.k3.getPaint().measureText(String.format(Locale.ROOT, "%1$s / %1$s", (j10 / 1000) / 60 > 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Long.valueOf(r8 / 60), Long.valueOf(r8 % 60), Long.valueOf(r6 % 60)) : String.format(Locale.ROOT, "%02d:%02d", Long.valueOf(r8), Long.valueOf(r6 % 60)))));
        o1.j jVar = this.r;
        jVar.c();
        int i12 = this.h;
        gb.a aVar = this.n;
        if (i12 != 0) {
            float f10 = ceil;
            if (aVar.a != f10) {
                jVar.u.i = f10;
                jVar.f();
                this.h = ceil;
            }
        }
        org.telegram.ui.Components.m61 m61Var = photoViewer.m3;
        int measuredWidth = ((getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - ceil) - i11;
        int measuredHeight = getMeasuredHeight();
        m61Var.h = measuredWidth;
        m61Var.i = measuredHeight;
        View view = m61Var.v;
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
