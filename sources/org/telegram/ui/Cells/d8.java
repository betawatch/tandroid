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
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.fj;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.jz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class d8 extends FrameLayout implements us, hg.d {
    public static final AccelerateInterpolator N = new AccelerateInterpolator(0.5f);
    public boolean D;
    public final int E;
    public final boolean F;
    public boolean G;
    public final float H;
    public boolean I;
    public final ImageView J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.p6 M;
    public final c8 a;
    public final kg.l1 b;
    public TLRPC.Document c;
    public jz d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public d8(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.n = 1.0f;
        this.E = d20.s0;
        this.H = 1.0f;
        this.M = p6Var;
        this.F = z10;
        c8 c8Var = new c8(this, p6Var);
        this.a = c8Var;
        c8Var.R0 = true;
        c8Var.z1 = true;
        c8Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
        kg.l1 l1Var = new kg.l1(1, context, null);
        this.b = l1Var;
        l1Var.setImageReceiver(c8Var);
        l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        l1Var.setImageReceiver(c8Var);
        addView(l1Var, w7.b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f));
        int L = org.telegram.messenger.i0.L(12.0f);
        int i10 = org.telegram.ui.ActionBar.t6.q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(imageView, d02, N2, null, p6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, w7.b6.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.J;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(gr.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.r;
        float f7 = this.H;
        c8 c8Var = this.a;
        if (z11 || (((z10 = this.w) && this.x != 0.8f) || (!z10 && this.x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.s;
            this.s = currentTimeMillis;
            if (this.r) {
                long j11 = this.y + j10;
                this.y = j11;
                if (j11 > 1050) {
                    this.y = 1050L;
                }
                float interpolation = (N.getInterpolation(this.y / 150.0f) * 0.5f) + 0.5f;
                this.n = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = false;
                    this.n = 1.0f;
                }
                c8Var.setAlpha(this.n * f7);
            } else {
                if (this.w) {
                    float f10 = this.x;
                    if (f10 != 0.8f) {
                        float f11 = f10 - (j10 / 400.0f);
                        this.x = f11;
                        if (f11 < 0.8f) {
                            this.x = 0.8f;
                        }
                    }
                }
                float f12 = (j10 / 400.0f) + this.x;
                this.x = f12;
                if (f12 > 1.0f) {
                    this.x = 1.0f;
                }
            }
            viewGroup.invalidate();
        }
        int min = Math.min(org.telegram.messenger.i0.L(66.0f), Math.min(getMeasuredHeight(), getMeasuredWidth()));
        float measuredWidth = getMeasuredWidth() >> 1;
        float f13 = min;
        float f14 = f13 / 2.0f;
        float measuredHeight = getMeasuredHeight() >> 1;
        c8Var.y0(measuredWidth - f14, measuredHeight - f14, f13, f13);
        c8Var.setAlpha(this.n * f7);
        if (this.x == 1.0f) {
            c8Var.h(canvas, null);
            return;
        }
        canvas.save();
        float f15 = this.x;
        canvas.scale(f15, f15, measuredWidth, measuredHeight);
        c8Var.h(canvas, null);
        canvas.restore();
    }

    public final void c(boolean z10) {
        ImageView imageView = this.J;
        if (!z10) {
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
        } else {
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.4f);
            imageView.setScaleY(0.4f);
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(gr.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, jz jzVar, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int[] iArr;
        TextView textView;
        int i10;
        this.f = str;
        this.G = jj.X3(document);
        this.L = false;
        c8 c8Var = this.a;
        c8Var.o1 = null;
        this.K = 0;
        int L = org.telegram.messenger.i0.L(12.0f);
        int i11 = org.telegram.ui.ActionBar.t6.q5;
        org.telegram.ui.ActionBar.a7.C(this.J, org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.x0(null, i11, false)), org.telegram.ui.ActionBar.a7.N(i11), null);
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.G) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
            kg.l1 l1Var = this.b;
            l1Var.setColor(x02);
            l1Var.H = true;
            l1Var.I = false;
            l1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (jzVar != null) {
            this.d = jzVar;
            if (jzVar.c) {
                i10 = 4;
                iArr = null;
                textView = textView2;
                c8Var.r0(ic.g(jzVar.a), "80_80", null, null, org.telegram.messenger.v5.b(org.telegram.ui.ActionBar.t6.i5), 0L, jzVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i10 = 4;
                c8Var.r0(null, null, null, null, org.telegram.messenger.v5.b(org.telegram.ui.ActionBar.t6.i5), 0L, jzVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(org.telegram.messenger.k6.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i10);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            boolean z14 = this.F;
            int i12 = z14 ? org.telegram.ui.ActionBar.t6.c7 : org.telegram.ui.ActionBar.t6.a7;
            float f7 = z14 ? 0.2f : 1.0f;
            org.telegram.ui.ActionBar.p6 p6Var = this.M;
            c00 f10 = org.telegram.messenger.v5.f(document, i12, f7, p6Var);
            String str2 = z14 ? "66_66_pcache_compress" : "66_66";
            if (jj.C4(document)) {
                c8Var.o1 = org.telegram.ui.ActionBar.t6.o0(p6Var);
            }
            if (jj.p(document)) {
                if (z14) {
                    z13 = true;
                    this.L = true;
                } else {
                    z13 = true;
                }
                if (f10 != null) {
                    c8Var.u0(ic.b(document), str2, ic.c(w9, document), null, null, null, f10, 0L, null, this.e, 1);
                    z12 = z13;
                } else if (w9 != null) {
                    z12 = z13;
                    c8Var.t0(ic.b(document), str2, ic.c(w9, document), null, null, this.e, 1);
                } else {
                    z12 = z13;
                    c8Var.q0(ic.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z12 = true;
                if (f10 != null) {
                    if (w9 != null) {
                        c8Var.q0(ic.c(w9, document), str2, f10, "webp", this.e, 1);
                    } else {
                        c8Var.q0(ic.b(document), str2, f10, "webp", this.e, 1);
                    }
                } else if (w9 != null) {
                    c8Var.q0(ic.c(w9, document), str2, null, "webp", this.e, 1);
                } else {
                    c8Var.q0(ic.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(org.telegram.messenger.k6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else if (z10) {
                int i13 = 0;
                while (true) {
                    if (i13 >= document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i13);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        String str3 = documentAttribute.alt;
                        if (str3 != null && str3.length() > 0) {
                            textView2.setText(org.telegram.messenger.k6.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        i13++;
                    }
                }
                String str4 = (String) ui.b0(this.E).c0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(org.telegram.messenger.k6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            c8Var.setAlpha(this.n * this.H);
            if (this.L) {
                c8Var.H0(this);
                return;
            } else {
                c8Var.J0 = z12;
                c8Var.H0((View) getParent());
                return;
            }
        }
        z12 = true;
        e(false);
        c8Var.setAlpha(this.n * this.H);
        if (this.L) {
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f5) {
            e(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!this.L) {
            b(canvas, this);
        }
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10) {
        if (this.G) {
            this.I = true;
        } else {
            this.I = false;
        }
        kg.l1 l1Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l1Var.getLayoutParams();
        if (d20.i(this.E).q()) {
            int L = org.telegram.messenger.i0.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
            l1Var.setPadding(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f));
        } else {
            int L2 = org.telegram.messenger.i0.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.0f);
            l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        }
        l1Var.setLocked(!d20.i(r4).q());
        org.telegram.messenger.i0.Y3(l1Var, this.I, 0.9f, true, z10);
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

    public fj getSendAnimationData() {
        c8 c8Var = this.a;
        if (!c8Var.L()) {
            return null;
        }
        fj fjVar = new fj();
        getLocationInWindow(new int[2]);
        fjVar.a = c8Var.r() + r2[0];
        fjVar.b = c8Var.s() + r2[1];
        fjVar.c = c8Var.M0;
        return fjVar;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public jz getStickerPath() {
        jz jzVar = this.d;
        if (jzVar == null || !jzVar.c) {
            return null;
        }
        return jzVar;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.L && getParent() != null) {
            ((View) getParent()).invalidate();
        }
        this.h.invalidate();
        super.invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.L;
        c8 c8Var = this.a;
        if (z10) {
            c8Var.J0 = true;
            c8Var.H0((View) getParent());
        } else {
            c8Var.H0(this);
        }
        c8Var.P();
        zs.f(this.E).c(this, zs.f5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        zs.f(this.E).n(this, zs.f5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String L0 = cd.L0(2131753936, null);
        if (this.c != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.c.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.k6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        L0 = a1.g.o(documentAttribute.alt, " ", L0, new StringBuilder());
                    }
                } else {
                    i10++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(L0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z10) {
        this.D = z10;
    }

    public void setScaled(boolean z10) {
        this.w = z10;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(jz jzVar) {
        String str = jzVar.b;
        d(null, jzVar, null, str, str != null, false);
    }
}
