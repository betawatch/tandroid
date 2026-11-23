package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class nv0 extends FrameLayout implements org.telegram.messenger.gs {
    public final ik E;
    public boolean F;
    public int G;
    public int H;
    public ValueAnimator I;
    public float J;
    public boolean K;
    public final org.telegram.ui.d61 a;
    public final q9 b;
    public final RadialProgressView c;
    public final xh.l d;
    public final m80 e;
    public final hi.e f;
    public boolean h;
    public final org.telegram.ui.ActionBar.h6 n;
    public int r;
    public final View s;
    public int w;
    public final int x;
    public boolean y;

    public nv0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i7, boolean z10) {
        if (this.w != i7) {
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.w = i7;
            float L = (-(i7 >> 1)) + (i7 > 0 ? org.telegram.messenger.g0.L(20.0f) : 0);
            RadialProgressView radialProgressView = this.c;
            org.telegram.ui.d61 d61Var = this.a;
            if (!z10) {
                d61Var.setTranslationY(L);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(L);
                    return;
                }
                return;
            }
            ViewPropertyAnimator translationY = d61Var.animate().translationY(L);
            nr nrVar = nr.f;
            translationY.setInterpolator(nrVar).setDuration(250L);
            if (radialProgressView != null) {
                radialProgressView.animate().translationY(L).setInterpolator(nrVar).setDuration(250L);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i7;
        int i10 = this.r;
        q9 q9Var = this.b;
        if (i10 != 0) {
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.x;
                if (i10 == 16) {
                    document = org.telegram.messenger.si.d0(i11).V("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.si.d0(i11).r0("tg_placeholders_android");
                    if (r02 == null) {
                        r02 = org.telegram.messenger.si.d0(i11).p0("tg_placeholders_android");
                    }
                    if (r02 != null && (i7 = this.r) >= 0 && i7 < r02.documents.size()) {
                        document2 = r02.documents.get(this.r);
                    }
                    obj = r02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.qc.e(3)) {
                    str = p5.c.v(str, "_firstframe");
                }
                if (document == null) {
                    org.telegram.messenger.si.d0(i11).f1("tg_placeholders_android", false, obj == null);
                    q9Var.getImageReceiver().f();
                    return;
                }
                org.telegram.messenger.mz d = org.telegram.messenger.u5.d(document.thumbs, this.H, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                q9Var.k(org.telegram.messenger.gc.b(document), str, "tgs", d, obj);
                int i12 = this.r;
                if (i12 == 9 || i12 == 0) {
                    q9Var.getImageReceiver().W(1);
                    return;
                } else {
                    q9Var.getImageReceiver().W(2);
                    return;
                }
            }
        }
        q9Var.setImageDrawable(new oh0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
    }

    public final void d(int i7, boolean z10) {
        boolean z11 = i7 == 0;
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
                this.I.setInterpolator(nr.h);
                this.I.addUpdateListener(new h60(this, 24));
                this.I.start();
            } else {
                this.J = z11 ? 1.0f : 0.0f;
                a();
            }
        }
        int visibility = getVisibility();
        q9 q9Var = this.b;
        RadialProgressView radialProgressView = this.c;
        org.telegram.ui.d61 d61Var = this.a;
        View view = this.s;
        if (visibility != i7 && i7 == 0) {
            if (this.h) {
                d61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                d61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new mv0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                q9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i7);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.G = 0;
        d61Var.setAlpha(0.0f);
        d61Var.setScaleX(0.8f);
        d61Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new mv0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        q9Var.getImageReceiver().Q0();
        q9Var.getImageReceiver().f();
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
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
            org.telegram.ui.d61 d61Var = this.a;
            if (z11) {
                if (z10) {
                    d61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.E.run();
                    return;
                }
                d61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new mv0(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.b.getImageReceiver().P0(false);
                return;
            }
            if (!z10) {
                d61Var.animate().cancel();
                d61Var.setAlpha(1.0f);
                d61Var.setScaleX(1.0f);
                d61Var.setScaleY(1.0f);
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
            d61Var.animate().cancel();
            d61Var.setAlpha(0.0f);
            d61Var.setScaleX(0.8f);
            d61Var.setScaleY(0.8f);
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
        org.telegram.messenger.ls.f(this.x).c(this, org.telegram.messenger.ls.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ls.f(this.x).n(this, org.telegram.messenger.ls.y0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if ((this.F || this.y) && (i13 = this.G) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.G - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.d61 d61Var = this.a;
            d61Var.setTranslationY(d61Var.getTranslationY() + measuredHeight);
            if (!this.y) {
                d61Var.animate().translationY(0.0f).setInterpolator(nr.f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(nr.f).setDuration(250L);
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

    public void setStickerType(int i7) {
        if (this.r != i7) {
            this.r = i7;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                i7++;
            }
        }
        if (i7 > 4 && charSequence.length() > 20) {
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
    public void setVisibility(int i7) {
        d(i7, true);
    }

    public nv0(Context context, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.x = org.telegram.messenger.k10.t0;
        this.E = new ik(this, 18);
        this.H = org.telegram.ui.ActionBar.m6.c7;
        this.n = h6Var;
        this.s = view;
        this.r = i7;
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(16, context, this);
        this.a = d61Var;
        d61Var.setOrientation(1);
        q9 q9Var = new q9(context);
        this.b = q9Var;
        q9Var.setOnClickListener(new j70(this, 17));
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        lVar.setTag(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.t6.U(lVar, i10, h6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        m80 m80Var = new m80(context, null);
        this.e = m80Var;
        int i11 = org.telegram.ui.ActionBar.m6.y6;
        m80Var.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.t6.U(m80Var, i11, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setGravity(17);
        hi.e g10 = org.telegram.messenger.o10.g(24, context, h6Var, true);
        this.f = g10;
        g10.setVisibility(8);
        d61Var.addView(q9Var, c8.ma.r(org.telegram.messenger.ls.C1, org.telegram.messenger.ls.C1, 1));
        d61Var.addView(lVar, c8.ma.t(-2, -2, 1, 0, 12, 0, 0));
        d61Var.addView(m80Var, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
        d61Var.addView(g10, c8.ma.t(-1, 48, 1, 28, 16, 28, 0));
        addView(d61Var, c8.ma.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
            this.c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, c8.ma.e(-2, -2, 17));
        }
    }
}
