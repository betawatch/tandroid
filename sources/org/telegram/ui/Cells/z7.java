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
import org.telegram.messenger.ej;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.rz;
import org.telegram.messenger.ui;
import org.telegram.messenger.zy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class z7 extends FrameLayout implements ls, rg.c {
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
    public final org.telegram.ui.ActionBar.f6 M;
    public final y7 a;
    public final ug.z0 b;
    public TLRPC.Document c;
    public zy d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public z7(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.n = 1.0f;
        this.E = p10.s0;
        this.H = 1.0f;
        this.M = f6Var;
        this.F = z9;
        y7 y7Var = new y7(this, f6Var);
        this.a = y7Var;
        y7Var.R0 = true;
        y7Var.z1 = true;
        y7Var.E0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
        ug.z0 z0Var = new ug.z0(1, context, null);
        this.b = z0Var;
        z0Var.setImageReceiver(y7Var);
        z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        z0Var.setImageReceiver(y7Var);
        addView(z0Var, c8.ha.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.k6.q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N2, null, f6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.ha.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z9) {
        ImageView imageView = this.J;
        if (z9) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(xq.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z9;
        boolean z10 = this.r;
        float f10 = this.H;
        y7 y7Var = this.a;
        if (z10 || (((z9 = this.w) && this.x != 0.8f) || (!z9 && this.x != 1.0f))) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.s;
            this.s = currentTimeMillis;
            if (this.r) {
                long j10 = this.y + j3;
                this.y = j10;
                if (j10 > 1050) {
                    this.y = 1050L;
                }
                float interpolation = (N.getInterpolation(this.y / 150.0f) * 0.5f) + 0.5f;
                this.n = interpolation;
                if (interpolation >= 1.0f) {
                    this.r = false;
                    this.n = 1.0f;
                }
                y7Var.setAlpha(this.n * f10);
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
        y7Var.y0(measuredWidth - f15, measuredHeight - f15, f14, f14);
        y7Var.setAlpha(this.n * f10);
        if (this.x == 1.0f) {
            y7Var.h(canvas, null);
            return;
        }
        canvas.save();
        float f16 = this.x;
        canvas.scale(f16, f16, measuredWidth, measuredHeight);
        y7Var.h(canvas, null);
        canvas.restore();
    }

    public final void c(boolean z9) {
        ImageView imageView = this.J;
        if (!z9) {
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
    public final void d(TLRPC.Document document, zy zyVar, Object obj, String str, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        int[] iArr;
        TextView textView;
        int i7;
        this.f = str;
        this.G = ij.Y3(document);
        this.L = false;
        y7 y7Var = this.a;
        y7Var.o1 = null;
        this.K = 0;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i10 = org.telegram.ui.ActionBar.k6.q5;
        org.telegram.ui.ActionBar.r6.C(this.J, org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), org.telegram.ui.ActionBar.r6.N(i10), null);
        if (z10) {
            c(false);
        } else {
            a(false);
        }
        if (this.G) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
            ug.z0 z0Var = this.b;
            z0Var.setColor(x02);
            z0Var.H = true;
            z0Var.I = false;
            z0Var.invalidate();
        }
        TextView textView2 = this.h;
        if (zyVar != null) {
            this.d = zyVar;
            if (zyVar.c) {
                i7 = 4;
                iArr = null;
                textView = textView2;
                y7Var.r0(hc.g(zyVar.a), "80_80", null, null, org.telegram.messenger.t5.b(org.telegram.ui.ActionBar.k6.i5), 0L, zyVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i7 = 4;
                y7Var.r0(null, null, null, null, org.telegram.messenger.t5.b(org.telegram.ui.ActionBar.k6.i5), 0L, zyVar.e ? "tgs" : null, 0, 1);
            }
            if (str != null) {
                TextView textView3 = textView;
                textView3.setText(org.telegram.messenger.i6.m(str, textView.getPaint().getFontMetricsInt(), false, iArr, 0));
                textView3.setVisibility(0);
            } else {
                textView.setVisibility(i7);
            }
        } else if (document != null) {
            this.c = document;
            this.e = obj;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            boolean z13 = this.F;
            int i11 = z13 ? org.telegram.ui.ActionBar.k6.c7 : org.telegram.ui.ActionBar.k6.a7;
            float f10 = z13 ? 0.2f : 1.0f;
            org.telegram.ui.ActionBar.f6 f6Var = this.M;
            rz f11 = org.telegram.messenger.t5.f(document, i11, f10, f6Var);
            String str2 = z13 ? "66_66_pcache_compress" : "66_66";
            if (ij.D4(document)) {
                y7Var.o1 = org.telegram.ui.ActionBar.k6.o0(f6Var);
            }
            if (ij.p(document)) {
                if (z13) {
                    z12 = true;
                    this.L = true;
                } else {
                    z12 = true;
                }
                if (f11 != null) {
                    y7Var.u0(hc.b(document), str2, hc.c(w10, document), null, null, null, f11, 0L, null, this.e, 1);
                    z11 = z12;
                } else if (w10 != null) {
                    z11 = z12;
                    y7Var.t0(hc.b(document), str2, hc.c(w10, document), null, null, this.e, 1);
                } else {
                    z11 = z12;
                    y7Var.q0(hc.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z11 = true;
                if (f11 != null) {
                    if (w10 != null) {
                        y7Var.q0(hc.c(w10, document), str2, f11, "webp", this.e, 1);
                    } else {
                        y7Var.q0(hc.b(document), str2, f11, "webp", this.e, 1);
                    }
                } else if (w10 != null) {
                    y7Var.q0(hc.c(w10, document), str2, null, "webp", this.e, 1);
                } else {
                    y7Var.q0(hc.b(document), str2, null, "webp", this.e, 1);
                }
            }
            if (str != null) {
                textView2.setText(org.telegram.messenger.i6.m(str, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else if (z9) {
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
                String str4 = (String) ui.b0(this.E).c0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(org.telegram.messenger.i6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            y7Var.setAlpha(this.n * this.H);
            if (this.L) {
                y7Var.H0(this);
                return;
            } else {
                y7Var.J0 = z11;
                y7Var.H0((View) getParent());
                return;
            }
        }
        z11 = true;
        e(false);
        y7Var.setAlpha(this.n * this.H);
        if (this.L) {
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f5) {
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

    public final void e(boolean z9) {
        if (this.G) {
            this.I = true;
        } else {
            this.I = false;
        }
        ug.z0 z0Var = this.b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z0Var.getLayoutParams();
        if (p10.i(this.E).q()) {
            int L = org.telegram.messenger.g0.L(16.0f);
            layoutParams.width = L;
            layoutParams.height = L;
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            layoutParams.rightMargin = org.telegram.messenger.g0.L(8.0f);
            z0Var.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
        } else {
            int L2 = org.telegram.messenger.g0.L(24.0f);
            layoutParams.width = L2;
            layoutParams.height = L2;
            layoutParams.gravity = 81;
            layoutParams.rightMargin = 0;
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(8.0f);
            z0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        }
        z0Var.setLocked(!p10.i(r4).q());
        org.telegram.messenger.g0.Z3(z0Var, this.I, 0.9f, true, z9);
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

    public ej getSendAnimationData() {
        y7 y7Var = this.a;
        if (!y7Var.L()) {
            return null;
        }
        ej ejVar = new ej();
        getLocationInWindow(new int[2]);
        ejVar.a = y7Var.r() + r2[0];
        ejVar.b = y7Var.s() + r2[1];
        ejVar.c = y7Var.M0;
        return ejVar;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public zy getStickerPath() {
        zy zyVar = this.d;
        if (zyVar == null || !zyVar.c) {
            return null;
        }
        return zyVar;
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
        boolean z9 = this.L;
        y7 y7Var = this.a;
        if (z9) {
            y7Var.J0 = true;
            y7Var.H0((View) getParent());
        } else {
            y7Var.H0(this);
        }
        y7Var.P();
        qs.f(this.E).c(this, qs.f5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        qs.f(this.E).n(this, qs.f5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String M0 = hd.M0(2131753936, null);
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
                        textView.setText(org.telegram.messenger.i6.m(str2, textView.getPaint().getFontMetricsInt(), false, null, 0));
                        M0 = f1.n(documentAttribute.alt, " ", M0, new StringBuilder());
                    }
                } else {
                    i7++;
                }
            }
        }
        accessibilityNodeInfo.setContentDescription(M0);
        accessibilityNodeInfo.setEnabled(true);
    }

    public void setRecent(boolean z9) {
        this.D = z9;
    }

    public void setScaled(boolean z9) {
        this.w = z9;
        this.s = System.currentTimeMillis();
        invalidate();
    }

    public void setSticker(zy zyVar) {
        String str = zyVar.b;
        d(null, zyVar, null, str, str != null, false);
    }
}
