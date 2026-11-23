package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cj;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.mz;
import org.telegram.messenger.si;
import org.telegram.messenger.ty;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class a8 extends FrameLayout implements gs, rg.c {
    public static final AccelerateInterpolator O = new AccelerateInterpolator(0.5f);
    public boolean E;
    public final int F;
    public final boolean G;
    public boolean H;
    public final float I;
    public boolean J;
    public final ImageView K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.h6 N;
    public final z7 a;
    public final ug.b1 b;
    public TLRPC.Document c;
    public ty d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public a8(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        this.n = 1.0f;
        this.F = k10.t0;
        this.I = 1.0f;
        this.N = h6Var;
        this.G = z10;
        z7 z7Var = new z7(this, h6Var);
        this.a = z7Var;
        z7Var.S0 = true;
        z7Var.A1 = true;
        z7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Fi, false));
        ug.b1 b1Var = new ug.b1(1, context, null);
        this.b = b1Var;
        b1Var.setImageReceiver(z7Var);
        b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        b1Var.setImageReceiver(z7Var);
        addView(b1Var, c8.ma.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.m6.q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(imageView, d02, M, null, h6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ma.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(nr.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.r;
        float f10 = this.I;
        z7 z7Var = this.a;
        if (z11 || (((z10 = this.w) && this.x != 0.8f) || (!z10 && this.x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.s;
            this.s = currentTimeMillis;
            if (this.r) {
                long j10 = this.y + j3;
                this.y = j10;
                if (j10 > 1050) {
                    this.y = 1050L;
                }
                float interpolation = (O.getInterpolation(this.y / 150.0f) * 0.5f) + 0.5f;
                this.n = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = false;
                    this.n = 1.0f;
                }
                z7Var.setAlpha(this.n * f10);
            } else {
                if (this.w) {
                    float f11 = this.x;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (j3 / 400.0f);
                        this.x = f12;
                        if (f12 < 0.8f) {
                            this.x = 0.8f;
                        }
                    }
                }
                float f13 = (j3 / 400.0f) + this.x;
                this.x = f13;
                if (f13 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(org.telegram.messenger.g0.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f14 = min;
        float f15 = f14 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        z7Var.y0(measuredWidth - f15, measuredHeight - f15, f14, f14);
        z7Var.setAlpha(this.n * f10);
        if (this.x == 1.0f) {
            z7Var.h(canvas, null);
            return;
        }
        canvas.save();
        float f16 = this.x;
        canvas.scale(f16, f16, measuredWidth, measuredHeight);
        z7Var.h(canvas, null);
        canvas.restore();
    }

    public final void c(boolean z10) {
        ImageView imageView = this.K;
        if (!z10) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(nr.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, ty tyVar, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int[] iArr;
        TextView textView;
        int i7;
        this.f = str;
        this.H = gj.X3(document);
        this.M = false;
        z7 z7Var = this.a;
        z7Var.p1 = null;
        this.L = 0;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i10 = org.telegram.ui.ActionBar.m6.q5;
        org.telegram.ui.ActionBar.t6.B(this.K, org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.x0(null, i10, false)), org.telegram.ui.ActionBar.t6.M(i10), null);
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.H) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false);
            ug.b1 b1Var = this.b;
            b1Var.setColor(x02);
            b1Var.I = true;
            b1Var.J = false;
            b1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (tyVar != null) {
            this.d = tyVar;
            if (tyVar.c) {
                i7 = 4;
                iArr = null;
                textView = textView2;
                z7Var.r0(gc.g(tyVar.a), "80_80", null, null, org.telegram.messenger.u5.b(org.telegram.ui.ActionBar.m6.i5), 0L, tyVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i7 = 4;
                z7Var.r0(null, null, null, null, org.telegram.messenger.u5.b(org.telegram.ui.ActionBar.m6.i5), 0L, tyVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(org.telegram.messenger.j6.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i7);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            boolean z14 = this.G;
            int i11 = z14 ? org.telegram.ui.ActionBar.m6.c7 : org.telegram.ui.ActionBar.m6.a7;
            float f10 = z14 ? 0.2f : 1.0f;
            org.telegram.ui.ActionBar.h6 h6Var = this.N;
            mz f11 = org.telegram.messenger.u5.f(document, i11, f10, h6Var);
            String str2 = z14 ? "66_66_pcache_compress" : "66_66";
            if (gj.C4(document)) {
                z7Var.p1 = org.telegram.ui.ActionBar.m6.o0(h6Var);
            }
            if (gj.p(document)) {
                if (z14) {
                    z13 = true;
                    this.M = true;
                } else {
                    z13 = true;
                }
                if (f11 != null) {
                    z7Var.u0(gc.b(document), str2, gc.c(w10, document), null, null, null, f11, 0L, null, this.e, 1);
                    z12 = z13;
                } else if (w10 != null) {
                    z12 = z13;
                    z7Var.t0(gc.b(document), str2, gc.c(w10, document), null, null, this.e, 1);
                } else {
                    z12 = z13;
                    z7Var.q0(gc.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z12 = true;
                if (f11 != null) {
                    if (w10 != null) {
                        z7Var.q0(gc.c(w10, document), str2, f11, "webp", this.e, 1);
                    } else {
                        z7Var.q0(gc.b(document), str2, f11, "webp", this.e, 1);
                    }
                } else if (w10 != null) {
                    z7Var.q0(gc.c(w10, document), str2, null, "webp", this.e, 1);
                } else {
                    z7Var.q0(gc.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(org.telegram.messenger.j6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else if (z10) {
                int i12 = 0;
                while (true) {
                    if (i12 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i12);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str3 = documentAttribute.alt;
                        if (str3 != null && str3.length() > 0) {
                            textView2.setText(org.telegram.messenger.j6.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        i12++;
                    }
                }
                String str4 = (String) si.d0(this.F).d0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(org.telegram.messenger.j6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            z7Var.setAlpha(this.n * this.I);
            if (this.M) {
                z7Var.H0(this);
                return;
            } else {
                z7Var.K0 = z12;
                z7Var.H0((View) getParent());
                return;
            }
        }
        z12 = true;
        e(false);
        z7Var.setAlpha(this.n * this.I);
        if (this.M) {
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.i5) {
            e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.M) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.H) {
            this.J = true;
        } else {
            this.J = false;
        }
        ug.b1 b1Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b1Var.getLayoutParams();
        if (k10.i(this.F).q()) {
            int L = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            b1Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        b1Var.setLocked(!k10.i(r4).q());
        org.telegram.messenger.g0.X3(b1Var, this.J, 0.9f, true, z10);
        invalidate();
    }

    public String getEmoji() {
        return this.f;
    }

    public ImageReceiver getImageView() {
        return this.a;
    }

    public Object getParentObject() {
        return this.e;
    }

    public cj getSendAnimationData() {
        z7 z7Var = this.a;
        if (!z7Var.L()) {
            return null;
        }
        cj cjVar = new cj();
        getLocationInWindow(new int[2]);
        cjVar.a = z7Var.r() + r2[0];
        cjVar.b = z7Var.s() + r2[1];
        cjVar.c = z7Var.N0;
        return cjVar;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public ty getStickerPath() {
        ty tyVar = this.d;
        if (tyVar == null || !tyVar.c) {
            return null;
        }
        return tyVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.M && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.M;
        z7 z7Var = this.a;
        if (z10) {
            z7Var.K0 = true;
            z7Var.H0((View) getParent());
        } else {
            z7Var.H0(this);
        }
        z7Var.P();
        ls.f(this.F).c(this, ls.i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        ls.f(this.F).n(this, ls.i5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String N0 = hd.N0(2131753933, null);
        if (this.c != null) {
            int i7 = 0;
            while (true) {
                if (i7 >= this.c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.c.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.j6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        N0 = p5.c.m(documentAttribute.alt, " ", N0, new StringBuilder());
                    }
                } else {
                    i7++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(N0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.E = z10;
    }

    public void setScaled(boolean z10) {
        this.w = z10;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(ty tyVar) {
        String str = tyVar.b;
        d(null, tyVar, null, str, str != null, false);
    }
}
