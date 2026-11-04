package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.v10;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.wo;
import org.telegram.ui.wz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class f7 extends FrameLayout implements org.telegram.messenger.x5, cs, org.telegram.ui.ActionBar.z5 {
    public int E;
    public org.telegram.ui.Components.l5 F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public org.telegram.ui.Components.l5 K;
    public float L;
    public float M;
    public StaticLayout N;
    public zi O;
    public boolean P;
    public final int Q;
    public final int R;
    public int S;
    public int T;
    public final RadialProgress2 U;
    public final int V;
    public StaticLayout W;
    public final SpannableStringBuilder a;
    public int a0;
    public final wo b;
    public final TextPaint b0;
    public boolean c;
    public final TextPaint c0;
    public boolean d;
    public final org.telegram.ui.ActionBar.e6 d0;
    public boolean e;
    public boolean e0;
    public int f;
    public float f0;
    public boolean g0;
    public int h;
    public float h0;
    public final TextPaint i0;
    public v10 j0;
    public float k0;
    public iz l0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public org.telegram.ui.Components.l5 y;

    public f7(Context context) {
        this(0, context, null);
    }

    private int getIconForCurrentState() {
        int i3 = this.S;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        return i3 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i3 = this.T;
        if (i3 < 0) {
            return 4;
        }
        return i3 == 0 ? 2 : 3;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        g(true, z10);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.U.p(true, 1.0f);
        g(false, true);
    }

    public void a() {
        int i3 = this.S;
        int i10 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i3 == 0) {
            if (this.T == 0) {
                this.O.P = true;
                org.telegram.messenger.w7.G(i10).X(this.O.F0(), this.O, 1, 0);
            }
            if (d(this.O)) {
                if (this.f == 2 && this.T != 1) {
                    this.T = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.S = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (MediaController.B().R(this.O, true)) {
                this.S = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i3 == 2) {
            radialProgress2.p(false, 0.0f);
            this.O.P = true;
            org.telegram.messenger.w7.G(i10).X(this.O.F0(), this.O, 1, 0);
            this.S = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i3 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.O.F0());
            this.S = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.e6 e6Var = this.d0;
        if (this.V == 1) {
            this.b0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, e6Var));
        }
        StaticLayout staticLayout2 = this.W;
        int i3 = this.r;
        int i10 = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(bd.a0 ? 24.0f : org.telegram.messenger.g0.C) + (bd.a0 ? 0 : this.a0), i3);
            this.W.draw(canvas);
            canvas.restore();
        }
        if (this.s != null) {
            int alpha = org.telegram.ui.ActionBar.k6.f3.getAlpha();
            float f10 = this.h0;
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f3.setAlpha((int) (alpha * f10));
            }
            canvas.save();
            int L = org.telegram.messenger.g0.L(bd.a0 ? 24.0f : org.telegram.messenger.g0.C);
            if (bd.a0 && (staticLayout = this.W) != null) {
                i10 = staticLayout.getWidth() + org.telegram.messenger.g0.L(bd.a0 ? 12.0f : 4.0f);
            }
            canvas.translate(((L + i10) + (bd.a0 ? this.s.getWidth() - this.x : 0.0f)) - this.w, i3);
            this.s.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.f3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.c0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            canvas.save();
            canvas.translate((org.telegram.messenger.g0.L(bd.a0 ? 24.0f : org.telegram.messenger.g0.C) + (bd.a0 ? this.N.getWidth() - this.M : 0.0f)) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            org.telegram.ui.ActionBar.k6.g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var));
            int alpha2 = org.telegram.ui.ActionBar.k6.g3.getAlpha();
            float f11 = this.h0;
            if (f11 != 1.0f) {
                org.telegram.ui.ActionBar.k6.g3.setAlpha((int) (alpha2 * f11));
            }
            canvas.save();
            canvas.translate((org.telegram.messenger.g0.L(bd.a0 ? 24.0f : org.telegram.messenger.g0.C) + (bd.a0 ? this.I.getWidth() - this.H : 0.0f)) - this.G, this.E);
            this.I.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                org.telegram.ui.ActionBar.k6.g3.setAlpha(alpha2);
            }
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(this.d ? org.telegram.ui.ActionBar.k6.Xd : org.telegram.ui.ActionBar.k6.Wd, e6Var);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = w02;
        radialProgress2.H = this.h0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (bd.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.g0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.g0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.e0;
        if (z10 || this.f0 != 0.0f) {
            if (z10) {
                float f10 = this.f0;
                if (f10 != 1.0f) {
                    this.f0 = f10 + 0.10666667f;
                    invalidate();
                    this.f0 = Utilities.i(this.f0, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f11 = this.f0;
                    canvas.scale(f11, f11, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.k6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f12 = this.f0;
                if (f12 != 0.0f) {
                    this.f0 = f12 - 0.10666667f;
                    invalidate();
                }
            }
            this.f0 = Utilities.i(this.f0, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.g0.L(12.0f)) - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f112 = this.f0;
            canvas.scale(f112, f112, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.k6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.k6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.k6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public boolean d(zi ziVar) {
        v10 v10Var = this.j0;
        return v10Var != null && ((Boolean) v10Var.a(ziVar)).booleanValue();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        g(false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.g0;
        if (z10) {
            float f10 = this.h0;
            if (f10 != 1.0f) {
                this.h0 = f10 + 0.10666667f;
                invalidate();
                this.h0 = Utilities.i(this.h0, 1.0f, 0.0f);
                if (this.k0 != 1.0f || this.l0 == null) {
                    b(canvas);
                    c(canvas);
                    super.dispatchDraw(canvas);
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.k0) * 255.0f), 31);
                this.l0.setViewType(4);
                this.l0.updateColors();
                this.l0.f();
                this.l0.draw(canvas);
                canvas.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.k0 * 255.0f), 31);
                b(canvas);
                super.dispatchDraw(canvas);
                c(canvas);
                canvas.restore();
                return;
            }
        }
        if (!z10) {
            float f11 = this.h0;
            if (f11 != 0.0f) {
                this.h0 = f11 - 0.10666667f;
                invalidate();
            }
        }
        this.h0 = Utilities.i(this.h0, 1.0f, 0.0f);
        if (this.k0 != 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        wo woVar = this.b;
        if (woVar.getVisibility() != 0) {
            woVar.setVisibility(0);
        }
        woVar.a(z10, z11);
    }

    public final void f(zi ziVar, boolean z10) {
        this.c = z10;
        this.O = ziVar;
        TLRPC.Document F0 = ziVar.F0();
        TLRPC.PhotoSize w10 = F0 != null ? org.telegram.messenger.w7.w(F0.thumbs, 360, false, null, false) : null;
        boolean z11 = w10 instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (z11 || (w10 instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w10, F0, ziVar);
        } else {
            Bitmap bitmap = ziVar.H1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.v0(bitmap);
            } else {
                String u02 = ziVar.u0(true);
                if (TextUtils.isEmpty(u02)) {
                    radialProgress2.i(null, null, null);
                } else {
                    radialProgress2.h(u02);
                }
            }
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z10, boolean z11) {
        String S0 = this.O.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        zi ziVar = this.O;
        boolean z12 = ziVar.w0 || ziVar.x0;
        if (az.B0 && ziVar.J3() && ((int) zi.B0(this.O.k)) != 0) {
            this.f = z12 ? 1 : 2;
            z12 = true;
        } else {
            this.f = 0;
            this.T = -1;
        }
        int i3 = this.f;
        int i10 = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (i3 == 0) {
            if (z12) {
                org.telegram.messenger.z5.q(i10).v(this);
                boolean I = MediaController.B().I(this.O);
                if (!I || (I && MediaController.B().H())) {
                    this.S = 0;
                } else {
                    this.S = 1;
                }
                radialProgress2.p(z11, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            org.telegram.messenger.z5.q(i10).a(S0, this.O, this);
            if (org.telegram.messenger.w7.G(i10).T(S0)) {
                this.S = 4;
                Float w10 = zb.D().w(S0);
                if (w10 != null) {
                    radialProgress2.p(z11, w10.floatValue());
                } else {
                    radialProgress2.p(z11, 0.0f);
                }
            } else {
                this.S = 2;
                radialProgress2.p(z11, 0.0f);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
            return;
        }
        radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(this.O.Q3() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We, this.d0));
        boolean I2 = MediaController.B().I(this.O);
        if (!I2 || (I2 && MediaController.B().H())) {
            this.S = 0;
        } else {
            this.S = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.f == 1) {
            org.telegram.messenger.z5.q(i10).v(this);
            this.T = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        org.telegram.messenger.z5.q(i10).a(S0, this.O, this);
        if (!org.telegram.messenger.w7.G(i10).T(S0)) {
            this.T = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.T = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float w11 = zb.D().w(S0);
        if (w11 != null) {
            radialProgress2.p(z11, w11.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
    }

    public zi getMessage() {
        return this.O;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.R;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.U.p(true, Math.min(1.0f, j10 / j11));
        if (this.f != 0) {
            if (this.T != 1) {
                g(false, true);
            }
        } else if (this.S != 4) {
            g(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.U.e();
        g(false, false);
        int i3 = this.Q;
        hs.f(i3).c(this, hs.f2);
        hs.f(i3).c(this, hs.g2);
        hs.f(i3).c(this, hs.h2);
        this.y = org.telegram.ui.Components.p5.update(0, this, this.y, this.s);
        this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
        this.K = org.telegram.ui.Components.p5.update(0, this, this.K, this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = this.Q;
        org.telegram.messenger.z5.q(i3).v(this);
        this.U.f();
        hs.f(i3).n(this, hs.f2);
        hs.f(i3).n(this, hs.g2);
        hs.f(i3).n(this, hs.h2);
        org.telegram.ui.Components.p5.release(this, this.y);
        org.telegram.ui.Components.p5.release(this, this.F);
        org.telegram.ui.Components.p5.release(this, this.K);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.J3()) {
            accessibilityNodeInfo.setText(bd.a0("AccDescrMusicInfo", null, 2131754832, this.O.x1(true), this.O.z1(true)));
        } else if (this.s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.b.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? bd.M0(2131754929, "AccActionPlay") : bd.M0(2131754941, "AccActionCancelDownload") : bd.M0(2131754938, "AccActionDownload") : bd.M0(2131754930, "AccActionPause")));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|(1:3)(1:107)|4|(36:98|99|(2:101|(1:103))|104|7|8|9|(1:11)|12|(1:14)(1:94)|15|(1:17)(1:93)|18|(1:20)(1:92)|21|22|(5:24|(1:26)(1:39)|27|(5:29|(1:31)(1:37)|32|(1:34)(1:36)|35)|38)|(17:80|81|(2:83|(1:85))|86|(1:88)(1:90)|89|52|(1:54)(1:78)|55|(1:57)(1:77)|58|59|(1:61)|62|(1:64)(1:72)|65|(2:67|68)(2:70|71))|41|(1:43)|(1:45)|(1:47)(1:79)|48|(1:50)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0))|6|7|8|9|(0)|12|(0)(0)|15|(0)(0)|18|(0)(0)|21|22|(0)|(0)|41|(0)|(0)|(0)(0)|48|(0)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00d6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf A[Catch: Exception -> 0x00d6, TryCatch #2 {Exception -> 0x00d6, blocks: (B:9:0x0094, B:12:0x009f, B:15:0x00a6, B:17:0x00cf, B:18:0x00d9, B:20:0x00e3, B:21:0x00eb, B:94:0x00a4), top: B:8:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e3 A[Catch: Exception -> 0x00d6, TryCatch #2 {Exception -> 0x00d6, blocks: (B:9:0x0094, B:12:0x009f, B:15:0x00a6, B:17:0x00cf, B:18:0x00d9, B:20:0x00e3, B:21:0x00eb, B:94:0x00a4), top: B:8:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0204 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:81:0x01a5, B:83:0x01af, B:86:0x01bb, B:89:0x01cb, B:52:0x027a, B:54:0x0282, B:55:0x028a, B:57:0x0294, B:58:0x029c, B:90:0x01c9, B:41:0x01ed, B:45:0x0204, B:48:0x0226, B:50:0x0232, B:51:0x024d, B:79:0x0224), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0232 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:81:0x01a5, B:83:0x01af, B:86:0x01bb, B:89:0x01cb, B:52:0x027a, B:54:0x0282, B:55:0x028a, B:57:0x0294, B:58:0x029c, B:90:0x01c9, B:41:0x01ed, B:45:0x0204, B:48:0x0226, B:50:0x0232, B:51:0x024d, B:79:0x0224), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0282 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:81:0x01a5, B:83:0x01af, B:86:0x01bb, B:89:0x01cb, B:52:0x027a, B:54:0x0282, B:55:0x028a, B:57:0x0294, B:58:0x029c, B:90:0x01c9, B:41:0x01ed, B:45:0x0204, B:48:0x0226, B:50:0x0232, B:51:0x024d, B:79:0x0224), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0294 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:81:0x01a5, B:83:0x01af, B:86:0x01bb, B:89:0x01cb, B:52:0x027a, B:54:0x0282, B:55:0x028a, B:57:0x0294, B:58:0x029c, B:90:0x01c9, B:41:0x01ed, B:45:0x0204, B:48:0x0226, B:50:0x0232, B:51:0x024d, B:79:0x0224), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224 A[Catch: Exception -> 0x01b8, TryCatch #1 {Exception -> 0x01b8, blocks: (B:81:0x01a5, B:83:0x01af, B:86:0x01bb, B:89:0x01cb, B:52:0x027a, B:54:0x0282, B:55:0x028a, B:57:0x0294, B:58:0x029c, B:90:0x01c9, B:41:0x01ed, B:45:0x0204, B:48:0x0226, B:50:0x0232, B:51:0x024d, B:79:0x0224), top: B:80:0x01a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a4 A[Catch: Exception -> 0x00d6, TryCatch #2 {Exception -> 0x00d6, blocks: (B:9:0x0094, B:12:0x009f, B:15:0x00a6, B:17:0x00cf, B:18:0x00d9, B:20:0x00e3, B:21:0x00eb, B:94:0x00a4), top: B:8:0x0094 }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        int i11;
        float f10;
        CharSequence d;
        CharSequence x12;
        CharSequence x13;
        TextPaint textPaint;
        this.I = null;
        this.s = null;
        this.N = null;
        int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(28.0f);
        TextPaint textPaint2 = this.b0;
        int i12 = this.V;
        if (i12 == 1) {
            String e12 = bd.e1(this.O.k.date);
            int ceil = (int) Math.ceil(textPaint2.measureText(e12));
            this.W = q1.H1(e12, textPaint2, ceil, ceil, 0, 1);
            this.a0 = org.telegram.messenger.g0.L(20.0f) + ((size - ceil) - org.telegram.messenger.g0.L(8.0f));
            i11 = org.telegram.messenger.g0.L(12.0f) + ceil;
        } else {
            i11 = 0;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.d0;
        if (i12 == 1) {
            try {
                if (!zi.S4(this.O.k)) {
                    if (this.O.i4()) {
                    }
                }
                d = wz.d(this.O, true, 1, null);
                f10 = 4.0f;
                x13 = org.telegram.messenger.g0.x1(d, this.O.Y1, e6Var);
                if (x13 != null) {
                    d = x13;
                }
                textPaint = this.i0;
                if (textPaint != null) {
                    textPaint = org.telegram.ui.ActionBar.k6.f3;
                }
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i11, TextUtils.TruncateAt.END), textPaint, (org.telegram.messenger.g0.L(4.0f) + size) - i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.s = staticLayout;
                this.w = staticLayout.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
                this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
                this.y = org.telegram.ui.Components.p5.update(0, this, this.y, this.s);
            } catch (Exception e10) {
                e = e10;
                f10 = 4.0f;
                org.telegram.messenger.a8.g(e, true);
                String str = "";
                if (this.O.s2()) {
                }
                if (i12 == 1) {
                }
                CharSequence replace = this.O.x1(true).replace('\n', ' ');
                x12 = org.telegram.messenger.g0.x1(replace, this.O.Y1, e6Var);
                if (x12 != null) {
                }
                if (i12 == 1) {
                }
                if (i12 == 1) {
                }
                if (this.O.L0() > 0.0d) {
                }
                this.I = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace, textPaint2, size - textPaint2.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint2, size + org.telegram.messenger.g0.L(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.G = this.I.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(56.0f) + (this.N != null ? org.telegram.messenger.g0.L(18.0f) : 0) + (this.c ? 1 : 0));
                if (bd.a0) {
                }
                int L = org.telegram.messenger.g0.L(f10) + r0;
                this.h = L;
                int L2 = org.telegram.messenger.g0.L(6.0f);
                this.n = L2;
                this.U.r(L, L2, org.telegram.messenger.g0.L(48.0f) + r0, org.telegram.messenger.g0.L(50.0f));
                measureChildWithMargins(this.b, i3, 0, i10, 0);
                if (this.N == null) {
                }
            }
            String str2 = "";
            if (this.O.s2()) {
                CharSequence x14 = org.telegram.messenger.g0.x1(TextUtils.isEmpty(this.O.k.message) ? "" : org.telegram.messenger.i6.m(this.O.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0), this.O.Y1, e6Var);
                if (x14 != null) {
                    String str3 = (String) this.O.Y1.get(0);
                    TextPaint textPaint3 = this.c0;
                    StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.g0.Q(x14, str3, size, textPaint3), textPaint3, size, TextUtils.TruncateAt.END), textPaint3, org.telegram.messenger.g0.L(f10) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.N = staticLayout2;
                    this.L = staticLayout2.getLineCount() > 0 ? this.N.getLineLeft(0) : 0.0f;
                    this.M = this.N.getLineCount() > 0 ? this.N.getLineWidth(0) : 0.0f;
                }
                this.K = org.telegram.ui.Components.p5.update(0, this, this.K, this.N);
            }
            if (i12 == 1) {
                try {
                    if (!zi.S4(this.O.k)) {
                        if (this.O.i4()) {
                        }
                    }
                    String g02 = org.telegram.messenger.g0.g0((int) this.O.L0(), false, false);
                    if (i12 != 1) {
                        textPaint2 = org.telegram.ui.ActionBar.k6.g3;
                    }
                    this.I = new StaticLayout(TextUtils.ellipsize(g02, textPaint2, size, TextUtils.TruncateAt.END), textPaint2, size + org.telegram.messenger.g0.L(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.G = this.I.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                    this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                    this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(56.0f) + (this.N != null ? org.telegram.messenger.g0.L(18.0f) : 0) + (this.c ? 1 : 0));
                int z10 = bd.a0 ? org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(52.0f)) : org.telegram.messenger.g0.L(8.0f);
                int L3 = org.telegram.messenger.g0.L(f10) + z10;
                this.h = L3;
                int L22 = org.telegram.messenger.g0.L(6.0f);
                this.n = L22;
                this.U.r(L3, L22, org.telegram.messenger.g0.L(48.0f) + z10, org.telegram.messenger.g0.L(50.0f));
                measureChildWithMargins(this.b, i3, 0, i10, 0);
                if (this.N == null) {
                    this.E = org.telegram.messenger.g0.L(29.0f);
                    return;
                } else {
                    this.J = org.telegram.messenger.g0.L(29.0f);
                    this.E = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(29.0f);
                    return;
                }
            }
            CharSequence replace2 = this.O.x1(true).replace('\n', ' ');
            x12 = org.telegram.messenger.g0.x1(replace2, this.O.Y1, e6Var);
            if (x12 != null) {
                replace2 = x12;
            }
            if (i12 == 1) {
                replace2 = new SpannableStringBuilder(replace2).append(' ').append((CharSequence) this.a).append(' ').append(wz.d(this.O, true, 1, null));
            }
            if (i12 == 1) {
                textPaint2 = org.telegram.ui.ActionBar.k6.g3;
            }
            if (this.O.L0() > 0.0d) {
                str2 = " • " + bd.R((int) Math.ceil(this.O.L0()));
            }
            this.I = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace2, textPaint2, size - textPaint2.measureText(str2), TextUtils.TruncateAt.END)).append((CharSequence) str2), textPaint2, size + org.telegram.messenger.g0.L(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.G = this.I.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
            this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
            this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
            setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(56.0f) + (this.N != null ? org.telegram.messenger.g0.L(18.0f) : 0) + (this.c ? 1 : 0));
            if (bd.a0) {
            }
            int L32 = org.telegram.messenger.g0.L(f10) + z10;
            this.h = L32;
            int L222 = org.telegram.messenger.g0.L(6.0f);
            this.n = L222;
            this.U.r(L32, L222, org.telegram.messenger.g0.L(48.0f) + z10, org.telegram.messenger.g0.L(50.0f));
            measureChildWithMargins(this.b, i3, 0, i10, 0);
            if (this.N == null) {
            }
        }
        d = this.O.z1(true).replace('\n', ' ');
        f10 = 4.0f;
        x13 = org.telegram.messenger.g0.x1(d, this.O.Y1, e6Var);
        if (x13 != null) {
        }
        textPaint = this.i0;
        if (textPaint != null) {
        }
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i11, TextUtils.TruncateAt.END), textPaint, (org.telegram.messenger.g0.L(4.0f) + size) - i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.s = staticLayout3;
        this.w = staticLayout3.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
        this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
        this.y = org.telegram.ui.Components.p5.update(0, this, this.y, this.s);
        String str22 = "";
        if (this.O.s2()) {
        }
        if (i12 == 1) {
        }
        CharSequence replace22 = this.O.x1(true).replace('\n', ' ');
        x12 = org.telegram.messenger.g0.x1(replace22, this.O.Y1, e6Var);
        if (x12 != null) {
        }
        if (i12 == 1) {
        }
        if (i12 == 1) {
        }
        if (this.O.L0() > 0.0d) {
        }
        this.I = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace22, textPaint2, size - textPaint2.measureText(str22), TextUtils.TruncateAt.END)).append((CharSequence) str22), textPaint2, size + org.telegram.messenger.g0.L(f10), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.G = this.I.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
        this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
        this.F = org.telegram.ui.Components.p5.update(0, this, this.F, this.I);
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(56.0f) + (this.N != null ? org.telegram.messenger.g0.L(18.0f) : 0) + (this.c ? 1 : 0));
        if (bd.a0) {
        }
        int L322 = org.telegram.messenger.g0.L(f10) + z10;
        this.h = L322;
        int L2222 = org.telegram.messenger.g0.L(6.0f);
        this.n = L2222;
        this.U.r(L322, L2222, org.telegram.messenger.g0.L(48.0f) + z10, org.telegram.messenger.g0.L(50.0f));
        measureChildWithMargins(this.b, i3, 0, i10, 0);
        if (this.N == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int L;
        int L2;
        int i3;
        if (this.O == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int L3 = org.telegram.messenger.g0.L(36.0f);
        boolean z11 = this.T >= 0 && x10 >= (L2 = this.h + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L3 && y9 >= (i3 = this.n + L) && y9 <= i3 + L3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.U;
        if (action == 0) {
            if (z11) {
                this.e = true;
                radialProgress2.o(true, true);
                invalidate();
            } else if (this.P && radialProgress2.a.contains(x10, y9)) {
                requestDisallowInterceptTouchEvent(true);
                this.d = true;
                radialProgress2.o(true, false);
                invalidate();
            }
            z10 = true;
            radialProgress2.o(this.e, true);
            boolean z12 = !z10 || this.d;
            if (motionEvent.getAction() == 3) {
                return z12;
            }
            this.e = false;
            this.d = false;
            radialProgress2.o(false, false);
            radialProgress2.o(this.e, true);
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.e) {
                this.e = false;
                playSoundEffect(0);
                int i10 = this.T;
                int i11 = this.Q;
                if (i10 == 0) {
                    this.T = 1;
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.w7.G(i11).X(this.O.F0(), this.O, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i10 == 1) {
                    if (MediaController.B().I(this.O)) {
                        MediaController.B().q(true, true, false, false);
                    }
                    this.T = 0;
                    org.telegram.messenger.w7.G(i11).f(this.O.F0());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (this.d) {
                this.d = false;
                playSoundEffect(0);
                a();
                invalidate();
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (motionEvent.getAction() == 3) {
            requestDisallowInterceptTouchEvent(false);
            this.e = false;
            this.d = false;
            invalidate();
        } else if (motionEvent.getAction() == 2 && !z11 && this.e) {
            this.e = false;
            invalidate();
        }
        z10 = false;
        radialProgress2.o(this.e, true);
        if (z10) {
        }
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (i3 != 16) {
            return super.performAccessibilityAction(i3, bundle);
        }
        a();
        return true;
    }

    public void setCheckForButtonPress(boolean z10) {
        this.P = z10;
    }

    public void setEnterAnimationAlpha(float f10) {
        if (this.k0 != f10) {
            this.k0 = f10;
            invalidate();
        }
    }

    public void setGlobalGradientView(iz izVar) {
        this.l0 = izVar;
    }

    public void setNeedPlayMessageListener(v10 v10Var) {
        this.j0 = v10Var;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        zi ziVar;
        try {
            TextPaint textPaint = this.i0;
            org.telegram.ui.ActionBar.e6 e6Var = this.d0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f != 0 && (ziVar = this.O) != null) {
                radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(ziVar.Q3() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We, e6Var));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public f7(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.r = org.telegram.messenger.g0.L(9.0f);
        this.E = org.telegram.messenger.g0.L(29.0f);
        this.J = org.telegram.messenger.g0.L(29.0f);
        int i10 = h10.t0;
        this.Q = i10;
        this.g0 = true;
        this.h0 = 0.0f;
        this.k0 = 1.0f;
        this.d0 = e6Var;
        this.V = i3;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.U = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.id, org.telegram.ui.ActionBar.k6.jd);
        this.R = org.telegram.messenger.z5.q(i10).k();
        setWillNotDraw(false);
        wo woVar = new wo(22, context, e6Var);
        this.b = woVar;
        woVar.setVisibility(4);
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        boolean z10 = bd.a0;
        addView(woVar, mf.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i3 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.g0.L(13.0f));
        if (e6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.i0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.g0.o());
            textPaint3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
