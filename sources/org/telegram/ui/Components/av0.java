package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public class av0 extends FrameLayout implements org.telegram.messenger.ls {
    public final dt D;
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final org.telegram.ui.c61 a;
    public final l9 b;
    public final RadialProgressView c;
    public final xh.l d;
    public final w70 e;
    public final fi.d f;
    public boolean h;
    public final org.telegram.ui.ActionBar.f6 n;
    public int r;
    public final View s;
    public int w;
    public final int x;
    public boolean y;

    public av0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i7, boolean z9) {
        if (this.w != i7) {
            if (getVisibility() != 0) {
                z9 = false;
            }
            this.w = i7;
            float L = (-(i7 >> 1)) + (i7 > 0 ? org.telegram.messenger.g0.L(20.0f) : 0);
            RadialProgressView radialProgressView = this.c;
            org.telegram.ui.c61 c61Var = this.a;
            if (!z9) {
                c61Var.setTranslationY(L);
                if (radialProgressView != null) {
                    radialProgressView.setTranslationY(L);
                    return;
                }
                return;
            }
            ViewPropertyAnimator translationY = c61Var.animate().translationY(L);
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
        int i7;
        int i10 = this.r;
        l9 l9Var = this.b;
        if (i10 != 0) {
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.x;
                if (i10 == 16) {
                    document = org.telegram.messenger.ui.b0(i11).T("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i11).p0("tg_placeholders_android");
                    if (p02 == null) {
                        p02 = org.telegram.messenger.ui.b0(i11).n0("tg_placeholders_android");
                    }
                    if (p02 != null && (i7 = this.r) >= 0 && i7 < p02.documents.size()) {
                        document2 = p02.documents.get(this.r);
                    }
                    obj = p02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.rc.e(3)) {
                    str = rf.b.q(str, "_firstframe");
                }
                if (document == null) {
                    org.telegram.messenger.ui.b0(i11).c1("tg_placeholders_android", false, obj == null);
                    l9Var.getImageReceiver().f();
                    return;
                }
                org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, this.G, 0.2f, false);
                if (d != null) {
                    d.e = 512;
                    d.f = 512;
                }
                l9Var.k(org.telegram.messenger.hc.b(document), str, "tgs", d, obj);
                int i12 = this.r;
                if (i12 == 9 || i12 == 0) {
                    l9Var.getImageReceiver().W(1);
                    return;
                } else {
                    l9Var.getImageReceiver().W(2);
                    return;
                }
            }
        }
        l9Var.setImageDrawable(new zg0(R.raw.utyan_empty, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
    }

    public final void d(int i7, boolean z9) {
        boolean z10 = i7 == 0;
        if (this.J != z10) {
            this.J = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.I, z10 ? 1.0f : 0.0f);
                this.H = ofFloat;
                ofFloat.setDuration(480L);
                this.H.setInterpolator(xq.h);
                this.H.addUpdateListener(new c60(this, 22));
                this.H.start();
            } else {
                this.I = z10 ? 1.0f : 0.0f;
                a();
            }
        }
        int visibility = getVisibility();
        l9 l9Var = this.b;
        RadialProgressView radialProgressView = this.c;
        org.telegram.ui.c61 c61Var = this.a;
        View view = this.s;
        if (visibility != i7 && i7 == 0) {
            if (this.h) {
                c61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                c61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new zu0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                l9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i7);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.F = 0;
        c61Var.setAlpha(0.0f);
        c61Var.setScaleX(0.8f);
        c61Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new zu0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        l9Var.getImageReceiver().Q0();
        l9Var.getImageReceiver().f();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z9, boolean z10) {
        if (this.h != z9) {
            this.h = z9;
            if (getVisibility() != 0) {
                return;
            }
            RadialProgressView radialProgressView = this.c;
            View view = this.s;
            org.telegram.ui.c61 c61Var = this.a;
            if (z10) {
                if (z9) {
                    c61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                    this.D.run();
                    return;
                }
                c61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new zu0(this, 2)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                this.b.getImageReceiver().P0(false);
                return;
            }
            if (!z9) {
                c61Var.animate().cancel();
                c61Var.setAlpha(1.0f);
                c61Var.setScaleX(1.0f);
                c61Var.setScaleY(1.0f);
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
            c61Var.animate().cancel();
            c61Var.setAlpha(0.0f);
            c61Var.setScaleX(0.8f);
            c61Var.setScaleY(0.8f);
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
        org.telegram.messenger.qs.f(this.x).c(this, org.telegram.messenger.qs.y0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.x).n(this, org.telegram.messenger.qs.y0);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        if ((this.E || this.y) && (i13 = this.F) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.c61 c61Var = this.a;
            c61Var.setTranslationY(c61Var.getTranslationY() + measuredHeight);
            if (!this.y) {
                c61Var.animate().translationY(0.0f).setInterpolator(xq.f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(xq.f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z9) {
        this.E = z9;
    }

    public void setPreventMoving(boolean z9) {
        this.y = z9;
        if (z9) {
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

    public av0(Context context, View view, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = org.telegram.messenger.p10.s0;
        int i10 = 15;
        this.D = new dt(this, i10);
        this.G = org.telegram.ui.ActionBar.k6.c7;
        this.n = f6Var;
        this.s = view;
        this.r = i7;
        org.telegram.ui.c61 c61Var = new org.telegram.ui.c61(i10, context, this);
        this.a = c61Var;
        c61Var.setOrientation(1);
        l9 l9Var = new l9(context);
        this.b = l9Var;
        l9Var.setOnClickListener(new la0(this, 14));
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        lVar.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.r6.V(lVar, i11, f6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        w70 w70Var = new w70(context, null);
        this.e = w70Var;
        int i12 = org.telegram.ui.ActionBar.k6.y6;
        w70Var.setTag(Integer.valueOf(i12));
        org.telegram.ui.ActionBar.r6.V(w70Var, i12, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var, org.telegram.ui.ActionBar.k6.J6, f6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(17);
        fi.d h = org.telegram.messenger.k5.h(24, context, f6Var, true);
        this.f = h;
        h.setVisibility(8);
        c61Var.addView(l9Var, c8.ha.r(org.telegram.messenger.qs.C1, org.telegram.messenger.qs.C1, 1));
        c61Var.addView(lVar, c8.ha.t(-2, -2, 1, 0, 12, 0, 0));
        c61Var.addView(w70Var, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        c61Var.addView(h, c8.ha.t(-1, 48, 1, 28, 16, 28, 0));
        addView(c61Var, c8.ha.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
            this.c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, c8.ha.e(-2, -2, 17));
        }
    }
}
