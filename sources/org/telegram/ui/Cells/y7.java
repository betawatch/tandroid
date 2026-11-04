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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.jz;
import org.telegram.messenger.li;
import org.telegram.messenger.ry;
import org.telegram.messenger.vi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class y7 extends FrameLayout implements cs, sg.c {
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
    public final org.telegram.ui.ActionBar.e6 N;
    public final x7 a;
    public final vg.y0 b;
    public TLRPC.Document c;
    public ry d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public y7(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.n = 1.0f;
        this.F = h10.t0;
        this.I = 1.0f;
        this.N = e6Var;
        this.G = z10;
        x7 x7Var = new x7(this, e6Var);
        this.a = x7Var;
        x7Var.S0 = true;
        x7Var.A1 = true;
        x7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        vg.y0 y0Var = new vg.y0(1, context, null);
        this.b = y0Var;
        y0Var.setImageReceiver(x7Var);
        y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        y0Var.setImageReceiver(x7Var);
        addView(y0Var, mf.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i3 = org.telegram.ui.ActionBar.k6.q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i3, e6Var));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, e6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, mf.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(xq.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.r;
        float f10 = this.I;
        x7 x7Var = this.a;
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
                float interpolation = (O.getInterpolation(this.y / 150.0f) * 0.5f) + 0.5f;
                this.n = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = false;
                    this.n = 1.0f;
                }
                x7Var.setAlpha(this.n * f10);
            } else {
                if (this.w) {
                    float f11 = this.x;
                    if (f11 != 0.8f) {
                        float f12 = f11 - (j10 / 400.0f);
                        this.x = f12;
                        if (f12 < 0.8f) {
                            this.x = 0.8f;
                        }
                    }
                }
                float f13 = (j10 / 400.0f) + this.x;
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
        x7Var.y0(measuredWidth - f15, measuredHeight - f15, f14, f14);
        x7Var.setAlpha(this.n * f10);
        if (this.x == 1.0f) {
            x7Var.h(canvas, null);
            return;
        }
        canvas.save();
        float f16 = this.x;
        canvas.scale(f16, f16, measuredWidth, measuredHeight);
        x7Var.h(canvas, null);
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(xq.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, ry ryVar, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int[] iArr;
        TextView textView;
        int i3;
        this.f = str;
        this.H = zi.Y3(document);
        this.M = false;
        x7 x7Var = this.a;
        x7Var.p1 = null;
        this.L = 0;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i10 = org.telegram.ui.ActionBar.k6.q5;
        org.telegram.ui.ActionBar.r6.C(this.K, org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i10), null);
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.H) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            vg.y0 y0Var = this.b;
            y0Var.setColor(x02);
            y0Var.I = true;
            y0Var.J = false;
            y0Var.invalidate();
        }
        TextView textView2 = this.h;
        if (ryVar != null) {
            this.d = ryVar;
            if (ryVar.c) {
                i3 = 4;
                iArr = null;
                textView = textView2;
                x7Var.r0(ac.g(ryVar.a), "80_80", null, null, org.telegram.messenger.t5.b(org.telegram.ui.ActionBar.k6.i5), 0L, ryVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i3 = 4;
                x7Var.r0(null, null, null, null, org.telegram.messenger.t5.b(org.telegram.ui.ActionBar.k6.i5), 0L, ryVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(org.telegram.messenger.i6.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i3);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            boolean z14 = this.G;
            int i11 = z14 ? org.telegram.ui.ActionBar.k6.c7 : org.telegram.ui.ActionBar.k6.a7;
            float f10 = z14 ? 0.2f : 1.0f;
            org.telegram.ui.ActionBar.e6 e6Var = this.N;
            jz f11 = org.telegram.messenger.t5.f(document, i11, f10, e6Var);
            String str2 = z14 ? "66_66_pcache_compress" : "66_66";
            if (zi.D4(document)) {
                x7Var.p1 = org.telegram.ui.ActionBar.k6.o0(e6Var);
            }
            if (zi.p(document)) {
                if (z14) {
                    z13 = true;
                    this.M = true;
                } else {
                    z13 = true;
                }
                if (f11 != null) {
                    x7Var.u0(ac.b(document), str2, ac.c(w10, document), null, null, null, f11, 0L, null, this.e, 1);
                    z12 = z13;
                } else if (w10 != null) {
                    z12 = z13;
                    x7Var.t0(ac.b(document), str2, ac.c(w10, document), null, null, this.e, 1);
                } else {
                    z12 = z13;
                    x7Var.q0(ac.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z12 = true;
                if (f11 != null) {
                    if (w10 != null) {
                        x7Var.q0(ac.c(w10, document), str2, f11, "webp", this.e, 1);
                    } else {
                        x7Var.q0(ac.b(document), str2, f11, "webp", this.e, 1);
                    }
                } else if (w10 != null) {
                    x7Var.q0(ac.c(w10, document), str2, null, "webp", this.e, 1);
                } else {
                    x7Var.q0(ac.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(org.telegram.messenger.i6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
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
                            textView2.setText(org.telegram.messenger.i6.m(documentAttribute.alt, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                        }
                    } else {
                        i12++;
                    }
                }
                String str4 = (String) li.b0(this.F).d0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(org.telegram.messenger.i6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            x7Var.setAlpha(this.n * this.I);
            if (this.M) {
                x7Var.H0(this);
                return;
            } else {
                x7Var.K0 = z12;
                x7Var.H0((View) getParent());
                return;
            }
        }
        z12 = true;
        e(false);
        x7Var.setAlpha(this.n * this.I);
        if (this.M) {
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f5) {
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
        vg.y0 y0Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y0Var.getLayoutParams();
        if (h10.i(this.F).q()) {
            int L = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            y0Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            y0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        y0Var.setLocked(!h10.i(r4).q());
        org.telegram.messenger.g0.Z3(y0Var, this.J, 0.9f, true, z10);
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

    public vi getSendAnimationData() {
        x7 x7Var = this.a;
        if (!x7Var.L()) {
            return null;
        }
        vi viVar = new vi();
        getLocationInWindow(new int[2]);
        viVar.a = x7Var.r() + r2[0];
        viVar.b = x7Var.s() + r2[1];
        viVar.c = x7Var.N0;
        return viVar;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public ry getStickerPath() {
        ry ryVar = this.d;
        if (ryVar == null || !ryVar.c) {
            return null;
        }
        return ryVar;
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
        x7 x7Var = this.a;
        if (z10) {
            x7Var.K0 = true;
            x7Var.H0((View) getParent());
        } else {
            x7Var.H0(this);
        }
        x7Var.P();
        hs.f(this.F).c(this, hs.f5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        hs.f(this.F).n(this, hs.f5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = bd.M0(2131753936, null);
        if (this.c != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= this.c.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.c.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    String str = documentAttribute.alt;
                    if (str != null && str.length() > 0) {
                        String str2 = documentAttribute.alt;
                        TextView textView = this.h;
                        textView.setText(org.telegram.messenger.i6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = f1.r(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i3++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(M0);
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

    public void setSticker(ry ryVar) {
        String str = ryVar.b;
        d(null, ryVar, null, str, str != null, false);
    }
}
