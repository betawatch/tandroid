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
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.r20;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.zz;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class k7 extends FrameLayout implements org.telegram.messenger.z5, us, org.telegram.ui.ActionBar.k6 {
    public int D;
    public org.telegram.ui.Components.k5 E;
    public float F;
    public float G;
    public StaticLayout H;
    public int I;
    public org.telegram.ui.Components.k5 J;
    public float K;
    public float L;
    public StaticLayout M;
    public jj N;
    public boolean O;
    public final int P;
    public final int Q;
    public int R;
    public int S;
    public final RadialProgress2 T;
    public final int U;
    public StaticLayout V;
    public int W;
    public final SpannableStringBuilder a;
    public final TextPaint a0;
    public final ep b;
    public final TextPaint b0;
    public boolean c;
    public final org.telegram.ui.ActionBar.p6 c0;
    public boolean d;
    public boolean d0;
    public boolean e;
    public float e0;
    public int f;
    public boolean f0;
    public float g0;
    public int h;
    public final TextPaint h0;
    public r20 i0;
    public float j0;
    public zz k0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public org.telegram.ui.Components.k5 y;

    public k7(Context context) {
        this(0, context, null);
    }

    private int getIconForCurrentState() {
        int i10 = this.R;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.S;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        g(true, z10);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.T.p(true, 1.0f);
        g(false, true);
    }

    public void a() {
        int i10 = this.R;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (this.S == 0) {
                this.N.P = true;
                org.telegram.messenger.b8.G(i11).X(this.N.F0(), this.N, 1, 0);
            }
            if (d(this.N)) {
                if (this.f == 2 && this.S != 1) {
                    this.S = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.R = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.B().R(this.N, true)) {
                this.R = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.p(false, 0.0f);
            this.N.P = true;
            org.telegram.messenger.b8.G(i11).X(this.N.F0(), this.N, 1, 0);
            this.R = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            org.telegram.messenger.b8.G(i11).f(this.N.F0());
            this.R = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.p6 p6Var = this.c0;
        if (this.U == 1) {
            this.a0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A6, p6Var));
        }
        StaticLayout staticLayout2 = this.V;
        int i10 = this.r;
        int i11 = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(cd.X ? 24.0f : org.telegram.messenger.i0.C) + (cd.X ? 0 : this.W), i10);
            this.V.draw(canvas);
            canvas.restore();
        }
        if (this.s != null) {
            int alpha = org.telegram.ui.ActionBar.t6.f3.getAlpha();
            float f7 = this.g0;
            if (f7 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f3.setAlpha((int) (alpha * f7));
            }
            canvas.save();
            int L = org.telegram.messenger.i0.L(cd.X ? 24.0f : org.telegram.messenger.i0.C);
            if (cd.X && (staticLayout = this.V) != null) {
                i11 = staticLayout.getWidth() + org.telegram.messenger.i0.L(cd.X ? 12.0f : 4.0f);
            }
            canvas.translate(((L + i11) + (cd.X ? this.s.getWidth() - this.x : 0.0f)) - this.w, i10);
            this.s.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.g0 != 1.0f) {
                org.telegram.ui.ActionBar.t6.f3.setAlpha(alpha);
            }
        }
        if (this.M != null) {
            this.b0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            canvas.save();
            canvas.translate((org.telegram.messenger.i0.L(cd.X ? 24.0f : org.telegram.messenger.i0.C) + (cd.X ? this.M.getWidth() - this.L : 0.0f)) - this.K, this.I);
            this.M.draw(canvas);
            canvas.restore();
        }
        if (this.H != null) {
            org.telegram.ui.ActionBar.t6.g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
            int alpha2 = org.telegram.ui.ActionBar.t6.g3.getAlpha();
            float f10 = this.g0;
            if (f10 != 1.0f) {
                org.telegram.ui.ActionBar.t6.g3.setAlpha((int) (alpha2 * f10));
            }
            canvas.save();
            canvas.translate((org.telegram.messenger.i0.L(cd.X ? 24.0f : org.telegram.messenger.i0.C) + (cd.X ? this.H.getWidth() - this.G : 0.0f)) - this.F, this.D);
            this.H.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.H, this.E, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.g0 != 1.0f) {
                org.telegram.ui.ActionBar.t6.g3.setAlpha(alpha2);
            }
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(this.d ? org.telegram.ui.ActionBar.t6.Xd : org.telegram.ui.ActionBar.t6.Wd, p6Var);
        RadialProgress2 radialProgress2 = this.T;
        radialProgress2.d = w02;
        radialProgress2.H = this.g0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (cd.X) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - org.telegram.messenger.i0.L(72.0f)) - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            } else {
                canvas.drawLine(org.telegram.messenger.i0.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z10 = this.d0;
        if (z10 || this.e0 != 0.0f) {
            if (z10) {
                float f7 = this.e0;
                if (f7 != 1.0f) {
                    this.e0 = f7 + 0.10666667f;
                    invalidate();
                    this.e0 = Utilities.i(this.e0, 1.0f, 0.0f);
                    int measuredWidth = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
                    int measuredHeight = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
                    canvas.save();
                    float f10 = this.e0;
                    canvas.scale(f10, f10, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight);
                    Drawable drawable = org.telegram.ui.ActionBar.t6.Z0;
                    drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight);
                    org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f11 = this.e0;
                if (f11 != 0.0f) {
                    this.e0 = f11 - 0.10666667f;
                    invalidate();
                }
            }
            this.e0 = Utilities.i(this.e0, 1.0f, 0.0f);
            int measuredWidth2 = (getMeasuredWidth() - org.telegram.messenger.i0.L(12.0f)) - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth();
            int measuredHeight2 = (getMeasuredHeight() - org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight()) >> 1;
            canvas.save();
            float f102 = this.e0;
            canvas.scale(f102, f102, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicWidth() / 2.0f) + measuredWidth2, (org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() / 2.0f) + measuredHeight2);
            Drawable drawable2 = org.telegram.ui.ActionBar.t6.Z0;
            drawable2.setBounds(measuredWidth2, measuredHeight2, drawable2.getIntrinsicWidth() + measuredWidth2, org.telegram.ui.ActionBar.t6.Z0.getIntrinsicHeight() + measuredHeight2);
            org.telegram.ui.ActionBar.t6.Z0.draw(canvas);
            canvas.restore();
        }
    }

    public boolean d(jj jjVar) {
        r20 r20Var = this.i0;
        return r20Var != null && ((Boolean) r20Var.a(jjVar)).booleanValue();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        g(false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z10 = this.f0;
        if (z10) {
            float f7 = this.g0;
            if (f7 != 1.0f) {
                this.g0 = f7 + 0.10666667f;
                invalidate();
                this.g0 = Utilities.i(this.g0, 1.0f, 0.0f);
                if (this.j0 != 1.0f || this.k0 == null) {
                    b(canvas);
                    c(canvas);
                    super.dispatchDraw(canvas);
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) ((1.0f - this.j0) * 255.0f), 31);
                this.k0.setViewType(4);
                this.k0.updateColors();
                this.k0.f();
                this.k0.draw(canvas);
                canvas.restore();
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (this.j0 * 255.0f), 31);
                b(canvas);
                super.dispatchDraw(canvas);
                c(canvas);
                canvas.restore();
                return;
            }
        }
        if (!z10) {
            float f10 = this.g0;
            if (f10 != 0.0f) {
                this.g0 = f10 - 0.10666667f;
                invalidate();
            }
        }
        this.g0 = Utilities.i(this.g0, 1.0f, 0.0f);
        if (this.j0 != 1.0f) {
        }
        b(canvas);
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        ep epVar = this.b;
        if (epVar.getVisibility() != 0) {
            epVar.setVisibility(0);
        }
        epVar.a(z10, z11);
    }

    public final void f(jj jjVar, boolean z10) {
        this.c = z10;
        this.N = jjVar;
        TLRPC.Document F0 = jjVar.F0();
        TLRPC.PhotoSize w9 = F0 != null ? org.telegram.messenger.b8.w(F0.thumbs, 360, false, null, false) : null;
        boolean z11 = w9 instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.T;
        if (z11 || (w9 instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w9, F0, jjVar);
        } else {
            Bitmap bitmap = jjVar.H1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.v0(bitmap);
            } else {
                String u02 = jjVar.u0(true);
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
        String S0 = this.N.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        jj jjVar = this.N;
        boolean z12 = jjVar.w0 || jjVar.x0;
        if (tz.B0 && jjVar.I3() && ((int) jj.B0(this.N.k)) != 0) {
            this.f = z12 ? 1 : 2;
            z12 = true;
        } else {
            this.f = 0;
            this.S = -1;
        }
        int i10 = this.f;
        int i11 = this.P;
        RadialProgress2 radialProgress2 = this.T;
        if (i10 == 0) {
            if (z12) {
                org.telegram.messenger.b6.q(i11).v(this);
                boolean I = MediaController.B().I(this.N);
                if (!I || (I && MediaController.B().H())) {
                    this.R = 0;
                } else {
                    this.R = 1;
                }
                radialProgress2.p(z11, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            org.telegram.messenger.b6.q(i11).a(S0, this.N, this);
            if (org.telegram.messenger.b8.G(i11).T(S0)) {
                this.R = 4;
                Float w9 = hc.D().w(S0);
                if (w9 != null) {
                    radialProgress2.p(z11, w9.floatValue());
                } else {
                    radialProgress2.p(z11, 0.0f);
                }
            } else {
                this.R = 2;
                radialProgress2.p(z11, 0.0f);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            invalidate();
            return;
        }
        radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(this.N.P3() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We, this.c0));
        boolean I2 = MediaController.B().I(this.N);
        if (!I2 || (I2 && MediaController.B().H())) {
            this.R = 0;
        } else {
            this.R = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.f == 1) {
            org.telegram.messenger.b6.q(i11).v(this);
            this.S = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        org.telegram.messenger.b6.q(i11).a(S0, this.N, this);
        if (!org.telegram.messenger.b8.G(i11).T(S0)) {
            this.S = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.S = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float w10 = hc.D().w(S0);
        if (w10 != null) {
            radialProgress2.p(z11, w10.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
    }

    public jj getMessage() {
        return this.N;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.Q;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.T.p(true, Math.min(1.0f, j10 / j11));
        if (this.f != 0) {
            if (this.S != 1) {
                g(false, true);
            }
        } else if (this.R != 4) {
            g(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T.e();
        g(false, false);
        int i10 = this.P;
        zs.f(i10).c(this, zs.f2);
        zs.f(i10).c(this, zs.g2);
        zs.f(i10).c(this, zs.h2);
        this.y = org.telegram.ui.Components.o5.update(0, this, this.y, this.s);
        this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
        this.J = org.telegram.ui.Components.o5.update(0, this, this.J, this.M);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.P;
        org.telegram.messenger.b6.q(i10).v(this);
        this.T.f();
        zs.f(i10).n(this, zs.f2);
        zs.f(i10).n(this, zs.g2);
        zs.f(i10).n(this, zs.h2);
        org.telegram.ui.Components.o5.release(this, this.y);
        org.telegram.ui.Components.o5.release(this, this.E);
        org.telegram.ui.Components.o5.release(this, this.J);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.N.I3()) {
            accessibilityNodeInfo.setText(cd.a0("AccDescrMusicInfo", null, 2131754832, this.N.x1(true), this.N.z1(true)));
        } else if (this.s != null && this.H != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.H.getText()));
        }
        if (this.b.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? cd.L0(2131754929, "AccActionPlay") : cd.L0(2131754941, "AccActionCancelDownload") : cd.L0(2131754938, "AccActionDownload") : cd.L0(2131754930, "AccActionPause")));
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
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        CharSequence d;
        CharSequence x12;
        CharSequence x13;
        TextPaint textPaint;
        this.H = null;
        this.s = null;
        this.M = null;
        int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C)) - org.telegram.messenger.i0.L(28.0f);
        TextPaint textPaint2 = this.a0;
        int i13 = this.U;
        if (i13 == 1) {
            String a12 = cd.a1(this.N.k.date);
            int ceil = (int) Math.ceil(textPaint2.measureText(a12));
            this.V = q1.F1(a12, textPaint2, ceil, ceil, 0, 1);
            this.W = org.telegram.messenger.i0.L(20.0f) + ((size - ceil) - org.telegram.messenger.i0.L(8.0f));
            i12 = org.telegram.messenger.i0.L(12.0f) + ceil;
        } else {
            i12 = 0;
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.c0;
        if (i13 == 1) {
            try {
                if (!jj.R4(this.N.k)) {
                    if (this.N.h4()) {
                    }
                }
                d = z00.d(this.N, true, 1, null);
                f7 = 4.0f;
                x13 = org.telegram.messenger.i0.x1(d, this.N.Y1, p6Var);
                if (x13 != null) {
                    d = x13;
                }
                textPaint = this.h0;
                if (textPaint != null) {
                    textPaint = org.telegram.ui.ActionBar.t6.f3;
                }
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i12, TextUtils.TruncateAt.END), textPaint, (org.telegram.messenger.i0.L(4.0f) + size) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.s = staticLayout;
                this.w = staticLayout.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
                this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
                this.y = org.telegram.ui.Components.o5.update(0, this, this.y, this.s);
            } catch (Exception e) {
                e = e;
                f7 = 4.0f;
                org.telegram.messenger.f8.g(e, true);
                String str = "";
                if (this.N.s2()) {
                }
                if (i13 == 1) {
                }
                CharSequence replace = this.N.x1(true).replace('\n', ' ');
                x12 = org.telegram.messenger.i0.x1(replace, this.N.Y1, p6Var);
                if (x12 != null) {
                }
                if (i13 == 1) {
                }
                if (i13 == 1) {
                }
                if (this.N.L0() > 0.0d) {
                }
                this.H = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace, textPaint2, size - textPaint2.measureText(str), TextUtils.TruncateAt.END)).append((CharSequence) str), textPaint2, size + org.telegram.messenger.i0.L(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
                this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
                this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(56.0f) + (this.M != null ? org.telegram.messenger.i0.L(18.0f) : 0) + (this.c ? 1 : 0));
                if (cd.X) {
                }
                int L = org.telegram.messenger.i0.L(f7) + r0;
                this.h = L;
                int L2 = org.telegram.messenger.i0.L(6.0f);
                this.n = L2;
                this.T.r(L, L2, org.telegram.messenger.i0.L(48.0f) + r0, org.telegram.messenger.i0.L(50.0f));
                measureChildWithMargins(this.b, i10, 0, i11, 0);
                if (this.M == null) {
                }
            }
            String str2 = "";
            if (this.N.s2()) {
                CharSequence x14 = org.telegram.messenger.i0.x1(TextUtils.isEmpty(this.N.k.message) ? "" : org.telegram.messenger.k6.m(this.N.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false, null, 0), this.N.Y1, p6Var);
                if (x14 != null) {
                    String str3 = (String) this.N.Y1.get(0);
                    TextPaint textPaint3 = this.b0;
                    StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(org.telegram.messenger.i0.Q(x14, str3, size, textPaint3), textPaint3, size, TextUtils.TruncateAt.END), textPaint3, org.telegram.messenger.i0.L(f7) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.M = staticLayout2;
                    this.K = staticLayout2.getLineCount() > 0 ? this.M.getLineLeft(0) : 0.0f;
                    this.L = this.M.getLineCount() > 0 ? this.M.getLineWidth(0) : 0.0f;
                }
                this.J = org.telegram.ui.Components.o5.update(0, this, this.J, this.M);
            }
            if (i13 == 1) {
                try {
                    if (!jj.R4(this.N.k)) {
                        if (this.N.h4()) {
                        }
                    }
                    String g02 = org.telegram.messenger.i0.g0((int) this.N.L0(), false, false);
                    if (i13 != 1) {
                        textPaint2 = org.telegram.ui.ActionBar.t6.g3;
                    }
                    this.H = new StaticLayout(TextUtils.ellipsize(g02, textPaint2, size, TextUtils.TruncateAt.END), textPaint2, size + org.telegram.messenger.i0.L(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
                    this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
                    this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(56.0f) + (this.M != null ? org.telegram.messenger.i0.L(18.0f) : 0) + (this.c ? 1 : 0));
                int z10 = cd.X ? org.telegram.messenger.m5.z(8.0f, View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(52.0f)) : org.telegram.messenger.i0.L(8.0f);
                int L3 = org.telegram.messenger.i0.L(f7) + z10;
                this.h = L3;
                int L22 = org.telegram.messenger.i0.L(6.0f);
                this.n = L22;
                this.T.r(L3, L22, org.telegram.messenger.i0.L(48.0f) + z10, org.telegram.messenger.i0.L(50.0f));
                measureChildWithMargins(this.b, i10, 0, i11, 0);
                if (this.M == null) {
                    this.D = org.telegram.messenger.i0.L(29.0f);
                    return;
                } else {
                    this.I = org.telegram.messenger.i0.L(29.0f);
                    this.D = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(29.0f);
                    return;
                }
            }
            CharSequence replace2 = this.N.x1(true).replace('\n', ' ');
            x12 = org.telegram.messenger.i0.x1(replace2, this.N.Y1, p6Var);
            if (x12 != null) {
                replace2 = x12;
            }
            if (i13 == 1) {
                replace2 = new SpannableStringBuilder(replace2).append(' ').append((CharSequence) this.a).append(' ').append(z00.d(this.N, true, 1, null));
            }
            if (i13 == 1) {
                textPaint2 = org.telegram.ui.ActionBar.t6.g3;
            }
            if (this.N.L0() > 0.0d) {
                str2 = " • " + cd.R((int) Math.ceil(this.N.L0()));
            }
            this.H = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace2, textPaint2, size - textPaint2.measureText(str2), TextUtils.TruncateAt.END)).append((CharSequence) str2), textPaint2, size + org.telegram.messenger.i0.L(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
            this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
            this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
            setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(56.0f) + (this.M != null ? org.telegram.messenger.i0.L(18.0f) : 0) + (this.c ? 1 : 0));
            if (cd.X) {
            }
            int L32 = org.telegram.messenger.i0.L(f7) + z10;
            this.h = L32;
            int L222 = org.telegram.messenger.i0.L(6.0f);
            this.n = L222;
            this.T.r(L32, L222, org.telegram.messenger.i0.L(48.0f) + z10, org.telegram.messenger.i0.L(50.0f));
            measureChildWithMargins(this.b, i10, 0, i11, 0);
            if (this.M == null) {
            }
        }
        d = this.N.z1(true).replace('\n', ' ');
        f7 = 4.0f;
        x13 = org.telegram.messenger.i0.x1(d, this.N.Y1, p6Var);
        if (x13 != null) {
        }
        textPaint = this.h0;
        if (textPaint != null) {
        }
        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(d, textPaint, size - i12, TextUtils.TruncateAt.END), textPaint, (org.telegram.messenger.i0.L(4.0f) + size) - i12, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.s = staticLayout3;
        this.w = staticLayout3.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
        this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
        this.y = org.telegram.ui.Components.o5.update(0, this, this.y, this.s);
        String str22 = "";
        if (this.N.s2()) {
        }
        if (i13 == 1) {
        }
        CharSequence replace22 = this.N.x1(true).replace('\n', ' ');
        x12 = org.telegram.messenger.i0.x1(replace22, this.N.Y1, p6Var);
        if (x12 != null) {
        }
        if (i13 == 1) {
        }
        if (i13 == 1) {
        }
        if (this.N.L0() > 0.0d) {
        }
        this.H = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace22, textPaint2, size - textPaint2.measureText(str22), TextUtils.TruncateAt.END)).append((CharSequence) str22), textPaint2, size + org.telegram.messenger.i0.L(f7), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.F = this.H.getLineCount() > 0 ? this.H.getLineLeft(0) : 0.0f;
        this.G = this.H.getLineCount() > 0 ? this.H.getLineWidth(0) : 0.0f;
        this.E = org.telegram.ui.Components.o5.update(0, this, this.E, this.H);
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(56.0f) + (this.M != null ? org.telegram.messenger.i0.L(18.0f) : 0) + (this.c ? 1 : 0));
        if (cd.X) {
        }
        int L322 = org.telegram.messenger.i0.L(f7) + z10;
        this.h = L322;
        int L2222 = org.telegram.messenger.i0.L(6.0f);
        this.n = L2222;
        this.T.r(L322, L2222, org.telegram.messenger.i0.L(48.0f) + z10, org.telegram.messenger.i0.L(50.0f));
        measureChildWithMargins(this.b, i10, 0, i11, 0);
        if (this.M == null) {
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
        int i10;
        if (this.N == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int L3 = org.telegram.messenger.i0.L(36.0f);
        boolean z11 = this.S >= 0 && x10 >= (L2 = this.h + (L = org.telegram.messenger.i0.L(27.0f))) && x10 <= L2 + L3 && y3 >= (i10 = this.n + L) && y3 <= i10 + L3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.T;
        if (action == 0) {
            if (z11) {
                this.e = true;
                radialProgress2.o(true, true);
                invalidate();
            } else if (this.O && radialProgress2.a.contains(x10, y3)) {
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
                int i11 = this.S;
                int i12 = this.P;
                if (i11 == 0) {
                    this.S = 1;
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.b8.G(i12).X(this.N.F0(), this.N, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.B().I(this.N)) {
                        MediaController.B().q(true, true, false, false);
                    }
                    this.S = 0;
                    org.telegram.messenger.b8.G(i12).f(this.N.F0());
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
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.performAccessibilityAction(i10, bundle);
        }
        a();
        return true;
    }

    public void setCheckForButtonPress(boolean z10) {
        this.O = z10;
    }

    public void setEnterAnimationAlpha(float f7) {
        if (this.j0 != f7) {
            this.j0 = f7;
            invalidate();
        }
    }

    public void setGlobalGradientView(zz zzVar) {
        this.k0 = zzVar;
    }

    public void setNeedPlayMessageListener(r20 r20Var) {
        this.i0 = r20Var;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        jj jjVar;
        try {
            TextPaint textPaint = this.h0;
            org.telegram.ui.ActionBar.p6 p6Var = this.c0;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            }
            RadialProgress2 radialProgress2 = this.T;
            if (radialProgress2 != null && this.f != 0 && (jjVar = this.N) != null) {
                radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(jjVar.P3() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We, p6Var));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public k7(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.r = org.telegram.messenger.i0.L(9.0f);
        this.D = org.telegram.messenger.i0.L(29.0f);
        this.I = org.telegram.messenger.i0.L(29.0f);
        int i11 = d20.s0;
        this.P = i11;
        this.f0 = true;
        this.g0 = 0.0f;
        this.j0 = 1.0f;
        this.c0 = p6Var;
        this.U = i10;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.T = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.id, org.telegram.ui.ActionBar.t6.jd);
        this.Q = org.telegram.messenger.b6.q(i11).k();
        setWillNotDraw(false);
        ep epVar = new ep(22, context, p6Var);
        this.b = epVar;
        epVar.setVisibility(4);
        epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        boolean z10 = cd.X;
        addView(epVar, w7.b6.d(24, 24.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 38.1f, 32.1f, z10 ? 6.0f : 0.0f, 0.0f));
        if (i10 == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.a0 = textPaint;
            textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.b0 = textPaint2;
        textPaint2.setTextSize(org.telegram.messenger.i0.L(13.0f));
        if (p6Var != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.h0 = textPaint3;
            textPaint3.setTypeface(org.telegram.messenger.i0.o());
            textPaint3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            textPaint3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
