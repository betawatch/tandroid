package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class zu0 extends FrameLayout implements org.telegram.messenger.cs {
    public final lt E;
    public boolean F;
    public int G;
    public int H;
    public ValueAnimator I;
    public float J;
    public boolean K;
    public final org.telegram.ui.s51 a;
    public final k9 b;
    public final RadialProgressView c;
    public final yh.l d;
    public final s70 e;
    public final gi.d f;
    public boolean h;
    public final org.telegram.ui.ActionBar.e6 n;
    public int r;
    public final View s;
    public int w;
    public final int x;
    public boolean y;

    public zu0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i3, boolean z10) {
        if (this.w != i3) {
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.w = i3;
            float L = (-(i3 >> 1)) + (i3 > 0 ? org.telegram.messenger.g0.L(20.0f) : 0);
            RadialProgressView radialProgressView = this.c;
            org.telegram.ui.s51 s51Var = this.a;
            if (!z10) {
                s51Var.setTranslationY(L);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(L);
                    return;
                }
                return;
            }
            ViewPropertyAnimator translationY = s51Var.animate().translationY(L);
            xq xqVar = xq.f;
            translationY.setInterpolator(xqVar).setDuration(250L);
            if (radialProgressView != null) {
                radialProgressView.animate().translationY(L).setInterpolator(xqVar).setDuration(250L);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i3;
        int i10 = this.r;
        k9 k9Var = this.b;
        if (i10 != 0) {
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.x;
                if (i10 == 16) {
                    document = org.telegram.messenger.li.b0(i11).T("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.li.b0(i11).p0("tg_placeholders_android");
                    if (p02 == null) {
                        p02 = org.telegram.messenger.li.b0(i11).n0("tg_placeholders_android");
                    }
                    if (p02 != null && (i3 = this.r) >= 0 && i3 < p02.documents.size()) {
                        document2 = p02.documents.get(this.r);
                    }
                    obj = p02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.lc.e(3)) {
                    str = t4.c.q(str, "_firstframe");
                }
                if (document == null) {
                    org.telegram.messenger.li.b0(i11).c1("tg_placeholders_android", false, obj == null);
                    k9Var.getImageReceiver().f();
                    return;
                }
                org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, this.H, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                k9Var.k(org.telegram.messenger.ac.b(document), str, "tgs", d, obj);
                int i12 = this.r;
                if (i12 == 9 || i12 == 0) {
                    k9Var.getImageReceiver().W(1);
                    return;
                } else {
                    k9Var.getImageReceiver().W(2);
                    return;
                }
            }
        }
        k9Var.setImageDrawable(new ch0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
    }

    public final void d(int i3, boolean z10) {
        boolean z11 = i3 == 0;
        if (this.K != z11) {
            this.K = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J, z11 ? 1.0f : 0.0f);
                this.I = ofFloat;
                ofFloat.setDuration(480L);
                this.I.setInterpolator(xq.h);
                this.I.addUpdateListener(new y50(this, 23));
                this.I.start();
            } else {
                this.J = z11 ? 1.0f : 0.0f;
                a();
            }
        }
        int visibility = getVisibility();
        k9 k9Var = this.b;
        RadialProgressView radialProgressView = this.c;
        org.telegram.ui.s51 s51Var = this.a;
        View view = this.s;
        if (visibility != i3 && i3 == 0) {
            if (this.h) {
                s51Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                s51Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new yu0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                k9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i3);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.G = 0;
        s51Var.setAlpha(0.0f);
        s51Var.setScaleX(0.8f);
        s51Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new yu0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        k9Var.getImageReceiver().Q0();
        k9Var.getImageReceiver().f();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() != 0) {
                return;
            }
            RadialProgressView radialProgressView = this.c;
            View view = this.s;
            org.telegram.ui.s51 s51Var = this.a;
            if (z11) {
                if (z10) {
                    s51Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.E.run();
                    return;
                }
                s51Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new yu0(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.b.getImageReceiver().P0(false);
                return;
            }
            if (!z10) {
                s51Var.animate().cancel();
                s51Var.setAlpha(1.0f);
                s51Var.setScaleX(1.0f);
                s51Var.setScaleY(1.0f);
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.setVisibility(8);
                    return;
                } else {
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                    return;
                }
            }
            s51Var.animate().cancel();
            s51Var.setAlpha(0.0f);
            s51Var.setScaleX(0.8f);
            s51Var.setScaleY(0.8f);
            if (view != null) {
                view.animate().setListener(null).cancel();
                view.setAlpha(1.0f);
                view.setVisibility(0);
            } else {
                radialProgressView.setAlpha(1.0f);
                radialProgressView.setScaleX(1.0f);
                radialProgressView.setScaleY(1.0f);
            }
        }
    }

    public float getVisibilityFactor() {
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        org.telegram.messenger.hs.f(this.x).c(this, org.telegram.messenger.hs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.x).n(this, org.telegram.messenger.hs.y0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i3, i10, i11, i12);
        if ((this.F || this.y) && (i13 = this.G) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.G - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.s51 s51Var = this.a;
            s51Var.setTranslationY(s51Var.getTranslationY() + measuredHeight);
            if (!this.y) {
                s51Var.animate().translationY(0.0f).setInterpolator(xq.f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(xq.f).setDuration(250L);
                }
            }
        }
        this.G = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.F = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.y = z10;
        if (z10) {
            return;
        }
        this.a.setTranslationY(0.0f);
        RadialProgressView radialProgressView = this.c;
        if (radialProgressView != null) {
            radialProgressView.setTranslationY(0.0f);
        }
    }

    public void setStickerType(int i3) {
        if (this.r != i3) {
            this.r = i3;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i3 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                i3++;
            }
        }
        if (i3 > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i11 = 0;
            int i12 = -1;
            for (int i13 = 0; i13 < charSequence.length(); i13++) {
                if (Character.isWhitespace(charSequence.charAt(i13))) {
                    int abs = Math.abs(length - i13);
                    if (i12 == -1 || abs < i11) {
                        i12 = i13;
                        i11 = abs;
                    }
                }
            }
            if (i12 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i12)) + "\n" + ((Object) charSequence.subSequence(i12 + 1, charSequence.length()));
            }
        }
        this.e.setText(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        d(i3, true);
    }

    public zu0(Context context, View view, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.x = org.telegram.messenger.h10.t0;
        this.E = new lt(this, 14);
        this.H = org.telegram.ui.ActionBar.k6.c7;
        this.n = e6Var;
        this.s = view;
        this.r = i3;
        org.telegram.ui.s51 s51Var = new org.telegram.ui.s51(16, context, this);
        this.a = s51Var;
        s51Var.setOrientation(1);
        k9 k9Var = new k9(context);
        this.b = k9Var;
        k9Var.setOnClickListener(new ga0(this, 15));
        yh.l lVar = new yh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        lVar.setTag(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.r6.V(lVar, i10, e6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        s70 s70Var = new s70(context, null);
        this.e = s70Var;
        int i11 = org.telegram.ui.ActionBar.k6.y6;
        s70Var.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.r6.V(s70Var, i11, e6Var);
        org.telegram.ui.ActionBar.r6.H(s70Var, org.telegram.ui.ActionBar.k6.J6, e6Var);
        s70Var.setTextSize(1, 14.0f);
        s70Var.setGravity(17);
        gi.d h = org.telegram.messenger.k5.h(24, context, e6Var, true);
        this.f = h;
        h.setVisibility(8);
        s51Var.addView(k9Var, b8.mf.r(org.telegram.messenger.hs.C1, org.telegram.messenger.hs.C1, 1));
        s51Var.addView(lVar, b8.mf.t(-2, -2, 1, 0, 12, 0, 0));
        s51Var.addView(s70Var, b8.mf.t(-2, -2, 1, 0, 8, 0, 0));
        s51Var.addView(h, b8.mf.t(-1, 48, 1, 28, 16, 28, 0));
        addView(s51Var, b8.mf.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
            this.c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, b8.mf.e(-2, -2, 17));
        }
    }
}
