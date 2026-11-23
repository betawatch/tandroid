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
import org.telegram.messenger.bj;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.kz;
import org.telegram.messenger.ri;
import org.telegram.messenger.sy;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class z7 extends FrameLayout implements fs, rg.c {
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
    public final org.telegram.ui.ActionBar.i6 N;
    public final y7 a;
    public final ug.b1 b;
    public TLRPC.Document c;
    public sy d;
    public Object e;
    public String f;
    public final TextView h;
    public float n;
    public boolean r;
    public long s;
    public boolean w;
    public float x;
    public long y;

    public z7(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.n = 1.0f;
        this.F = i10.t0;
        this.I = 1.0f;
        this.N = i6Var;
        this.G = z10;
        y7 y7Var = new y7(this, i6Var);
        this.a = y7Var;
        y7Var.S0 = true;
        y7Var.A1 = true;
        y7Var.F0(1);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setTextSize(1, 16.0f);
        new Paint(1).setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Fi, false));
        ug.b1 b1Var = new ug.b1(1, context, null);
        this.b = b1Var;
        b1Var.setImageReceiver(y7Var);
        b1Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        b1Var.setImageReceiver(y7Var);
        addView(b1Var, c8.na.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.K = imageView;
        imageView.setImageResource(R.drawable.mini_more_dots);
        imageView.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        int L = org.telegram.messenger.g0.L(12.0f);
        int i7 = org.telegram.ui.ActionBar.n6.q5;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(imageView, d02, M, null, i6Var);
        imageView.setAlpha(0.0f);
        addView(imageView, c8.na.e(-2, -2, 5));
        setFocusable(true);
    }

    public final void a(boolean z10) {
        ImageView imageView = this.K;
        if (z10) {
            imageView.animate().alpha(0.0f).scaleX(0.4f).scaleY(0.4f).setDuration(200L).setInterpolator(kr.f).start();
        } else {
            imageView.setAlpha(0.0f);
        }
    }

    public final void b(Canvas canvas, ViewGroup viewGroup) {
        boolean z10;
        boolean z11 = this.r;
        float f10 = this.I;
        y7 y7Var = this.a;
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
        y7Var.z0(measuredWidth - f15, measuredHeight - f15, f14, f14);
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
            imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(kr.f).start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(TLRPC.Document document, sy syVar, Object obj, String str, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        int[] iArr;
        TextView textView;
        int i7;
        this.f = str;
        this.H = fj.X3(document);
        this.M = false;
        y7 y7Var = this.a;
        y7Var.p1 = null;
        this.L = 0;
        int L = org.telegram.messenger.g0.L(12.0f);
        int i10 = org.telegram.ui.ActionBar.n6.q5;
        org.telegram.ui.ActionBar.u6.B(this.K, org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.x0(null, i10, false)), org.telegram.ui.ActionBar.u6.M(i10), null);
        if (z11) {
            c(false);
        } else {
            a(false);
        }
        if (this.H) {
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.d6, false);
            ug.b1 b1Var = this.b;
            b1Var.setColor(x02);
            b1Var.I = true;
            b1Var.J = false;
            b1Var.invalidate();
        }
        TextView textView2 = this.h;
        if (syVar != null) {
            this.d = syVar;
            if (syVar.c) {
                i7 = 4;
                iArr = null;
                textView = textView2;
                y7Var.s0(fc.g(syVar.a), "80_80", null, null, org.telegram.messenger.u5.b(org.telegram.ui.ActionBar.n6.i5), 0L, syVar.e ? "tgs" : null, 0, 1);
            } else {
                iArr = null;
                textView = textView2;
                i7 = 4;
                y7Var.s0(null, null, null, null, org.telegram.messenger.u5.b(org.telegram.ui.ActionBar.n6.i5), 0L, syVar.e ? "tgs" : null, 0, 1);
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
            int i11 = z14 ? org.telegram.ui.ActionBar.n6.c7 : org.telegram.ui.ActionBar.n6.a7;
            float f10 = z14 ? 0.2f : 1.0f;
            org.telegram.ui.ActionBar.i6 i6Var = this.N;
            kz f11 = org.telegram.messenger.u5.f(document, i11, f10, i6Var);
            String str2 = z14 ? "66_66_pcache_compress" : "66_66";
            if (fj.C4(document)) {
                y7Var.p1 = org.telegram.ui.ActionBar.n6.o0(i6Var);
            }
            if (fj.p(document)) {
                if (z14) {
                    z13 = true;
                    this.M = true;
                } else {
                    z13 = true;
                }
                if (f11 != null) {
                    y7Var.v0(fc.b(document), str2, fc.c(w10, document), null, null, null, f11, 0L, null, this.e, 1);
                    z12 = z13;
                } else if (w10 != null) {
                    z12 = z13;
                    y7Var.u0(fc.b(document), str2, fc.c(w10, document), null, null, this.e, 1);
                } else {
                    z12 = z13;
                    y7Var.r0(fc.b(document), str2, null, null, this.e, 1);
                }
            } else {
                z12 = true;
                if (f11 != null) {
                    if (w10 != null) {
                        y7Var.r0(fc.c(w10, document), str2, f11, "webp", this.e, 1);
                    } else {
                        y7Var.r0(fc.b(document), str2, f11, "webp", this.e, 1);
                    }
                } else if (w10 != null) {
                    y7Var.r0(fc.c(w10, document), str2, null, "webp", this.e, 1);
                } else {
                    y7Var.r0(fc.b(document), str2, null, "webp", this.e, 1);
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
                String str4 = (String) ri.d0(this.F).d0.f(this.c.id);
                if (str4 == null) {
                    str4 = "";
                }
                textView2.setText(org.telegram.messenger.j6.m(str4, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(4);
            }
            e(false);
            y7Var.setAlpha(this.n * this.I);
            if (this.M) {
                y7Var.I0(this);
                return;
            } else {
                y7Var.K0 = z12;
                y7Var.I0((View) getParent());
                return;
            }
        }
        z12 = true;
        e(false);
        y7Var.setAlpha(this.n * this.I);
        if (this.M) {
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.i5) {
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
        if (i10.i(this.F).q()) {
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
        b1Var.setLocked(!i10.i(r4).q());
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

    public bj getSendAnimationData() {
        y7 y7Var = this.a;
        if (!y7Var.M()) {
            return null;
        }
        bj bjVar = new bj();
        getLocationInWindow(new int[2]);
        bjVar.a = y7Var.r() + r2[0];
        bjVar.b = y7Var.s() + r2[1];
        bjVar.c = y7Var.N0;
        return bjVar;
    }

    public TLRPC.Document getSticker() {
        return this.c;
    }

    public sy getStickerPath() {
        sy syVar = this.d;
        if (syVar == null || !syVar.c) {
            return null;
        }
        return syVar;
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
        y7 y7Var = this.a;
        if (z10) {
            y7Var.K0 = true;
            y7Var.I0((View) getParent());
        } else {
            y7Var.I0(this);
        }
        y7Var.Q();
        ks.f(this.F).c(this, ks.i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.S();
        ks.f(this.F).n(this, ks.i5);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String N0 = gd.N0(2131753933, null);
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

    public void setSticker(sy syVar) {
        String str = syVar.b;
        d(null, syVar, null, str, str != null, false);
    }
}
