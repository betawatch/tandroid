package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class dw0 extends FrameLayout implements org.telegram.messenger.us {
    public final ew D;
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final org.telegram.ui.u71 a;
    public final g9 b;
    public final RadialProgressView c;
    public final nh.p d;
    public final p80 e;
    public final vh.d f;
    public boolean h;
    public final org.telegram.ui.ActionBar.p6 n;
    public int r;
    public final View s;
    public int w;
    public final int x;
    public boolean y;

    public dw0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i10, boolean z10) {
        if (this.w != i10) {
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.w = i10;
            float L = (-(i10 >> 1)) + (i10 > 0 ? org.telegram.messenger.i0.L(20.0f) : 0);
            RadialProgressView radialProgressView = this.c;
            org.telegram.ui.u71 u71Var = this.a;
            if (!z10) {
                u71Var.setTranslationY(L);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(L);
                    return;
                }
                return;
            }
            ViewPropertyAnimator translationY = u71Var.animate().translationY(L);
            gr grVar = gr.f;
            translationY.setInterpolator(grVar).setDuration(250L);
            if (radialProgressView != null) {
                radialProgressView.animate().translationY(L).setInterpolator(grVar).setDuration(250L);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i10;
        int i11 = this.r;
        g9 g9Var = this.b;
        if (i11 != 0) {
            if (i11 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i12 = this.x;
                if (i11 == 16) {
                    document = org.telegram.messenger.ui.b0(i12).T("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i12).p0("tg_placeholders_android");
                    if (p02 == null) {
                        p02 = org.telegram.messenger.ui.b0(i12).n0("tg_placeholders_android");
                    }
                    if (p02 != null && (i10 = this.r) >= 0 && i10 < p02.documents.size()) {
                        document2 = p02.documents.get(this.r);
                    }
                    obj = p02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.sc.e(3)) {
                    str = sc.e.A(str, "_firstframe");
                }
                if (document == null) {
                    org.telegram.messenger.ui.b0(i12).c1("tg_placeholders_android", false, obj == null);
                    g9Var.getImageReceiver().f();
                    return;
                }
                org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, this.G, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                g9Var.k(org.telegram.messenger.ic.b(document), str, "tgs", d, obj);
                int i13 = this.r;
                if (i13 == 9 || i13 == 0) {
                    g9Var.getImageReceiver().W(1);
                    return;
                } else {
                    g9Var.getImageReceiver().W(2);
                    return;
                }
            }
        }
        g9Var.setImageDrawable(new bi0(R.raw.utyan_empty, org.telegram.messenger.i0.L(130.0f), org.telegram.messenger.i0.L(130.0f)));
    }

    public final void d(int i10, boolean z10) {
        boolean z11 = i10 == 0;
        if (this.J != z11) {
            this.J = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z11 ? 1.0f : 0.0f);
                this.H = ofFloat;
                ofFloat.setDuration(480L);
                this.H.setInterpolator(gr.h);
                this.H.addUpdateListener(new r60(this, 23));
                this.H.start();
            } else {
                this.I = z11 ? 1.0f : 0.0f;
                a();
            }
        }
        int visibility = getVisibility();
        g9 g9Var = this.b;
        RadialProgressView radialProgressView = this.c;
        org.telegram.ui.u71 u71Var = this.a;
        View view = this.s;
        if (visibility != i10 && i10 == 0) {
            if (this.h) {
                u71Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                u71Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new cw0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                g9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.F = 0;
        u71Var.setAlpha(0.0f);
        u71Var.setScaleX(0.8f);
        u71Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new cw0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        g9Var.getImageReceiver().Q0();
        g9Var.getImageReceiver().f();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
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
            org.telegram.ui.u71 u71Var = this.a;
            if (z11) {
                if (z10) {
                    u71Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.D.run();
                    return;
                }
                u71Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new cw0(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.b.getImageReceiver().P0(false);
                return;
            }
            if (!z10) {
                u71Var.animate().cancel();
                u71Var.setAlpha(1.0f);
                u71Var.setScaleX(1.0f);
                u71Var.setScaleY(1.0f);
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
            u71Var.animate().cancel();
            u71Var.setAlpha(0.0f);
            u71Var.setScaleX(0.8f);
            u71Var.setScaleY(0.8f);
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
        return this.I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        org.telegram.messenger.zs.f(this.x).c(this, org.telegram.messenger.zs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.x).n(this, org.telegram.messenger.zs.y0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if ((this.E || this.y) && (i14 = this.F) > 0 && i14 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.u71 u71Var = this.a;
            u71Var.setTranslationY(u71Var.getTranslationY() + measuredHeight);
            if (!this.y) {
                u71Var.animate().translationY(0.0f).setInterpolator(gr.f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(gr.f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.E = z10;
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

    public void setStickerType(int i10) {
        if (this.r != i10) {
            this.r = i10;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (Character.isWhitespace(charSequence.charAt(i11))) {
                i10++;
            }
        }
        if (i10 > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i12 = 0;
            int i13 = -1;
            for (int i14 = 0; i14 < charSequence.length(); i14++) {
                if (Character.isWhitespace(charSequence.charAt(i14))) {
                    int abs = Math.abs(length - i14);
                    if (i13 == -1 || abs < i12) {
                        i13 = i14;
                        i12 = abs;
                    }
                }
            }
            if (i13 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i13)) + "\n" + ((Object) charSequence.subSequence(i13 + 1, charSequence.length()));
            }
        }
        this.e.setText(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        d(i10, true);
    }

    public dw0(Context context, View view, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.x = org.telegram.messenger.d20.s0;
        this.D = new ew(this, 13);
        this.G = org.telegram.ui.ActionBar.t6.c7;
        this.n = p6Var;
        this.s = view;
        this.r = i10;
        org.telegram.ui.u71 u71Var = new org.telegram.ui.u71(this, context, 11);
        this.a = u71Var;
        u71Var.setOrientation(1);
        g9 g9Var = new g9(context);
        this.b = g9Var;
        g9Var.setOnClickListener(new db0(this, 15));
        nh.p pVar = new nh.p(context);
        this.d = pVar;
        pVar.setTypeface(org.telegram.messenger.i0.o());
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        pVar.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.a7.V(pVar, i11, p6Var);
        pVar.setTextSize(1, 20.0f);
        pVar.setGravity(17);
        p80 p80Var = new p80(context, null);
        this.e = p80Var;
        int i12 = org.telegram.ui.ActionBar.t6.y6;
        p80Var.setTag(Integer.valueOf(i12));
        org.telegram.ui.ActionBar.a7.V(p80Var, i12, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.J6, p6Var);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setGravity(17);
        vh.d i13 = org.telegram.messenger.z20.i(24, context, p6Var, true);
        this.f = i13;
        i13.setVisibility(8);
        u71Var.addView(g9Var, w7.b6.r(org.telegram.messenger.zs.C1, org.telegram.messenger.zs.C1, 1));
        u71Var.addView(pVar, w7.b6.t(-2, -2, 1, 0, 12, 0, 0));
        u71Var.addView(p80Var, w7.b6.t(-2, -2, 1, 0, 8, 0, 0));
        u71Var.addView(i13, w7.b6.t(-1, 48, 1, 28, 16, 28, 0));
        addView(u71Var, w7.b6.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, p6Var);
            this.c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, w7.b6.e(-2, -2, 17));
        }
    }
}
