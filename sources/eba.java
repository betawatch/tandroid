// default package

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class eba extends FrameLayout implements sp3, gk7, tjb {
    public int E;
    public cm F;
    public float G;
    public float H;
    public StaticLayout I;
    public int J;
    public cm K;
    public float L;
    public float M;
    public StaticLayout N;
    public k27 O;
    public boolean P;
    public final int Q;
    public final int R;
    public byte S;
    public int T;
    public final RadialProgress2 U;
    public final boolean V;
    public StaticLayout W;
    public final SpannableStringBuilder a;
    public int a0;
    public final wf2 b;
    public final TextPaint b0;
    public boolean c;
    public final TextPaint c0;
    public boolean d;
    public final wjb d0;
    public boolean e;
    public boolean e0;
    public byte f;
    public float f0;
    public boolean g0;
    public int h;
    public float h0;
    public final TextPaint i0;
    public q8c j0;
    public float k0;
    public pi4 l0;
    public int n;
    public final int r;
    public StaticLayout s;
    public float w;
    public float x;
    public cm y;

    /* JADX WARN: Multi-variable type inference failed */
    public eba(int i, wjb wjbVar, Context context) {
        super(context);
        this.r = gl.L(9.0f);
        this.E = gl.L(29.0f);
        this.J = gl.L(29.0f);
        int i2 = y6c.t0;
        this.Q = i2;
        this.g0 = true;
        this.h0 = 0.0f;
        this.k0 = 1.0f;
        this.d0 = wjbVar;
        this.V = i;
        setFocusable(true);
        setImportantForAccessibility(1);
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.U = radialProgress2;
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        this.R = up3.q(i2).k();
        setWillNotDraw(false);
        wf2 wf2Var = new wf2(22, wjbVar, context);
        this.b = wf2Var;
        wf2Var.setVisibility(4);
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        boolean z = k96.a0;
        addView(wf2Var, nme.d(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 38.1f, 32.1f, z ? 6.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint = new TextPaint(1);
            this.b0 = textPaint;
            textPaint.setTextSize(gl.L(13.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.a = spannableStringBuilder;
            spannableStringBuilder.setSpan(new wo3(), 0, 1, 0);
        }
        TextPaint textPaint2 = new TextPaint(1);
        this.c0 = textPaint2;
        textPaint2.setTextSize(gl.L(13.0f));
        if (wjbVar != null) {
            TextPaint textPaint3 = new TextPaint(1);
            this.i0 = textPaint3;
            textPaint3.setTypeface(gl.o());
            textPaint3.setTextSize(gl.L(15.0f));
            textPaint3.setColor(bkb.v0(bkb.F6, wjbVar));
        }
    }

    private int getIconForCurrentState() {
        byte b = this.S;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return b == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.T;
        if (i < 0) {
            return 4;
        }
        return i == 0 ? 2 : 3;
    }

    @Override // sp3
    public final void B(boolean z) {
        g(true, z);
    }

    @Override // sp3
    public final void N(String str) {
        this.U.o(true, 1.0f);
        g(false, true);
    }

    public void a() {
        byte b = this.S;
        int i = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (b == 0) {
            if (this.T == 0) {
                this.O.P = true;
                ba4.G(i).X(this.O.F0(), this.O, 1, 0);
            }
            if (d(this.O)) {
                if (this.f == 2 && this.T != 1) {
                    this.T = 1;
                    radialProgress2.o(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.S = (byte) 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 1) {
            if (MediaController.w().Q(this.O, true)) {
                this.S = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 2) {
            radialProgress2.o(false, 0.0f);
            this.O.P = true;
            ba4.G(i).X(this.O.F0(), this.O, 1, 0);
            this.S = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (b == 4) {
            ba4.G(i).f(this.O.F0());
            this.S = (byte) 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(Canvas canvas) {
        StaticLayout staticLayout;
        wjb wjbVar = this.d0;
        if (this.V) {
            this.b0.setColor(bkb.v0(bkb.z6, wjbVar));
        }
        StaticLayout staticLayout2 = this.W;
        int i = this.r;
        int i2 = 0;
        if (staticLayout2 != null) {
            canvas.save();
            canvas.translate(gl.L(k96.a0 ? 24.0f : gl.C) + (k96.a0 ? 0 : this.a0), i);
            this.W.draw(canvas);
            canvas.restore();
        }
        if (this.s != null) {
            int alpha = bkb.e3.getAlpha();
            float f = this.h0;
            if (f != 1.0f) {
                bkb.e3.setAlpha((int) (alpha * f));
            }
            canvas.save();
            int L = gl.L(k96.a0 ? 24.0f : gl.C);
            if (k96.a0 && (staticLayout = this.W) != null) {
                i2 = staticLayout.getWidth() + gl.L(k96.a0 ? 12.0f : 4.0f);
            }
            canvas.translate(((L + i2) + (k96.a0 ? this.s.getWidth() - this.x : 0.0f)) - this.w, i);
            this.s.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.s, this.y, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                bkb.e3.setAlpha(alpha);
            }
        }
        if (this.N != null) {
            this.c0.setColor(bkb.v0(bkb.F6, wjbVar));
            canvas.save();
            canvas.translate((gl.L(k96.a0 ? 24.0f : gl.C) + (k96.a0 ? this.N.getWidth() - this.M : 0.0f)) - this.L, this.J);
            this.N.draw(canvas);
            canvas.restore();
        }
        if (this.I != null) {
            bkb.f3.setColor(bkb.v0(bkb.y6, wjbVar));
            int alpha2 = bkb.f3.getAlpha();
            float f2 = this.h0;
            if (f2 != 1.0f) {
                bkb.f3.setAlpha((int) (alpha2 * f2));
            }
            canvas.save();
            canvas.translate((gl.L(k96.a0 ? 24.0f : gl.C) + (k96.a0 ? this.I.getWidth() - this.H : 0.0f)) - this.G, this.E);
            this.I.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.I, this.F, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
            if (this.h0 != 1.0f) {
                bkb.f3.setAlpha(alpha2);
            }
        }
        int v0 = bkb.v0(this.d ? bkb.Zd : bkb.Yd, wjbVar);
        RadialProgress2 radialProgress2 = this.U;
        radialProgress2.d = v0;
        radialProgress2.H = this.h0;
        radialProgress2.draw(canvas);
        if (this.c) {
            if (k96.a0) {
                canvas.drawLine(0.0f, getHeight() - 1, (getWidth() - gl.L(72.0f)) - getPaddingRight(), getHeight() - 1, bkb.U0("paintDivider", wjbVar));
            } else {
                canvas.drawLine(gl.L(72.0f), getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, bkb.U0("paintDivider", wjbVar));
            }
        }
    }

    public final void c(Canvas canvas) {
        boolean z = this.e0;
        float f = this.f0;
        if (z) {
            if (f != 1.0f) {
                this.f0 = f + 0.10666667f;
                invalidate();
            }
        } else {
            if (f == 0.0f) {
                return;
            }
            if (f != 0.0f) {
                this.f0 = f - 0.10666667f;
                invalidate();
            }
        }
        this.f0 = Utilities.i(this.f0, 1.0f, 0.0f);
        int measuredWidth = (getMeasuredWidth() - gl.L(12.0f)) - bkb.Y0.getIntrinsicWidth();
        int measuredHeight = (getMeasuredHeight() - bkb.Y0.getIntrinsicHeight()) >> 1;
        canvas.save();
        float f2 = this.f0;
        canvas.scale(f2, f2, (bkb.Y0.getIntrinsicWidth() / 2.0f) + measuredWidth, (bkb.Y0.getIntrinsicHeight() / 2.0f) + measuredHeight);
        Drawable drawable = bkb.Y0;
        drawable.setBounds(measuredWidth, measuredHeight, drawable.getIntrinsicWidth() + measuredWidth, bkb.Y0.getIntrinsicHeight() + measuredHeight);
        bkb.Y0.draw(canvas);
        canvas.restore();
    }

    public boolean d(k27 k27Var) {
        q8c q8cVar = this.j0;
        return q8cVar != null && ((Boolean) q8cVar.a(k27Var)).booleanValue();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        g(false, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z = this.g0;
        if (z) {
            float f = this.h0;
            if (f != 1.0f) {
                this.h0 = f + 0.10666667f;
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
        if (!z) {
            float f2 = this.h0;
            if (f2 != 0.0f) {
                this.h0 = f2 - 0.10666667f;
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

    public final void e(boolean z, boolean z2) {
        wf2 wf2Var = this.b;
        if (wf2Var.getVisibility() != 0) {
            wf2Var.setVisibility(0);
        }
        wf2Var.a(z, z2);
    }

    public final void f(k27 k27Var, boolean z) {
        this.c = z;
        this.O = k27Var;
        TLRPC.Document F0 = k27Var.F0();
        TLRPC.PhotoSize w = F0 != null ? ba4.w(F0.thumbs, 360, false, null, false) : null;
        boolean z2 = w instanceof TLRPC.TL_photoSize;
        RadialProgress2 radialProgress2 = this.U;
        if (z2 || (w instanceof TLRPC.TL_photoSizeProgressive)) {
            radialProgress2.i(w, F0, k27Var);
        } else {
            Bitmap bitmap = k27Var.J1;
            if (bitmap == null) {
                bitmap = null;
            }
            if (bitmap != null) {
                radialProgress2.w.f0(bitmap);
            } else {
                String u0 = k27Var.u0(true);
                if (TextUtils.isEmpty(u0)) {
                    radialProgress2.i(null, null, null);
                } else {
                    radialProgress2.h(u0);
                }
            }
        }
        g(false, false);
        requestLayout();
    }

    public final void g(boolean z, boolean z2) {
        byte b;
        String S0 = this.O.S0();
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        k27 k27Var = this.O;
        boolean z3 = k27Var.y0 || k27Var.z0;
        if (gba.x0 && k27Var.I3() && ((int) k27.B0(this.O.k)) != 0) {
            b = z3 ? (byte) 1 : (byte) 2;
            this.f = b;
            z3 = true;
        } else {
            this.f = (byte) 0;
            this.T = -1;
            b = 0;
        }
        int i = this.Q;
        RadialProgress2 radialProgress2 = this.U;
        if (b == 0) {
            if (z3) {
                up3.q(i).v(this);
                boolean D = MediaController.w().D(this.O);
                if (!D || (D && MediaController.w().C())) {
                    this.S = (byte) 0;
                } else {
                    this.S = (byte) 1;
                }
                radialProgress2.o(z2, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
                invalidate();
                return;
            }
            up3.q(i).a(S0, this.O, this);
            if (ba4.G(i).S(S0)) {
                this.S = (byte) 4;
                Float s = fl5.z().s(S0);
                if (s != null) {
                    radialProgress2.o(z2, s.floatValue());
                } else {
                    radialProgress2.o(z2, 0.0f);
                }
            } else {
                this.S = (byte) 2;
                radialProgress2.o(z2, 0.0f);
            }
            radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            invalidate();
            return;
        }
        radialProgress2.l(bkb.v0(this.O.O3() ? bkb.Dc : bkb.Ye, this.d0));
        boolean D2 = MediaController.w().D(this.O);
        if (!D2 || (D2 && MediaController.w().C())) {
            this.S = (byte) 0;
        } else {
            this.S = (byte) 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.f == 1) {
            up3.q(i).v(this);
            this.T = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        up3.q(i).a(S0, this.O, this);
        if (!ba4.G(i).S(S0)) {
            this.T = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.T = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z, z2);
        Float s2 = fl5.z().s(S0);
        if (s2 != null) {
            radialProgress2.o(z2, s2.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
    }

    public k27 getMessage() {
        return this.O;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.R;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.U.o(true, Math.min(1.0f, j / j2));
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
        int i = this.Q;
        kk7.f(i).b(this, kk7.e2);
        kk7.f(i).b(this, kk7.f2);
        kk7.f(i).b(this, kk7.g2);
        this.y = gm.update(0, this, this.y, this.s);
        this.F = gm.update(0, this, this.F, this.I);
        this.K = gm.update(0, this, this.K, this.N);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.Q;
        up3.q(i).v(this);
        this.U.f();
        kk7.f(i).n(this, kk7.e2);
        kk7.f(i).n(this, kk7.f2);
        kk7.f(i).n(this, kk7.g2);
        gm.release(this, this.y);
        gm.release(this, this.F);
        gm.release(this, this.K);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        if (this.O.I3()) {
            accessibilityNodeInfo.setText(k96.a0("AccDescrMusicInfo", null, 2131754831, this.O.w1(true), this.O.y1(true)));
        } else if (this.s != null && this.I != null) {
            accessibilityNodeInfo.setText(((Object) this.s.getText()) + ", " + ((Object) this.I.getText()));
        }
        if (this.b.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(true);
        }
        int iconForCurrentState = getIconForCurrentState();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, iconForCurrentState != 1 ? iconForCurrentState != 2 ? iconForCurrentState != 3 ? k96.M0(2131754929, "AccActionPlay") : k96.M0(2131754941, "AccActionCancelDownload") : k96.M0(2131754938, "AccActionDownload") : k96.M0(2131754930, "AccActionPause")));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|(1:3)(1:100)|4|(3:92|93|(33:97|7|8|9|(1:11)|12|(1:14)|15|(1:17)(1:89)|18|(1:20)(1:88)|21|22|(5:24|(1:26)(1:39)|27|(5:29|(1:31)(1:37)|32|(1:34)(1:36)|35)|38)|(3:78|79|(14:83|(1:85)|86|52|(1:54)(1:77)|55|(1:57)(1:76)|58|59|(1:61)|62|(1:64)(1:72)|65|(2:67|68)(2:70|71)))|41|(1:43)|(1:45)|(1:47)|48|(1:50)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0)))|6|7|8|9|(0)|12|(0)|15|(0)(0)|18|(0)(0)|21|22|(0)|(0)|41|(0)|(0)|(0)|48|(0)|51|52|(0)(0)|55|(0)(0)|58|59|(0)|62|(0)(0)|65|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00f6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a0 A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:9:0x0091, B:12:0x009c, B:14:0x00a0, B:15:0x00a2, B:17:0x00cb, B:18:0x00d3, B:20:0x00dd, B:21:0x00e5), top: B:8:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:9:0x0091, B:12:0x009c, B:14:0x00a0, B:15:0x00a2, B:17:0x00cb, B:18:0x00d3, B:20:0x00dd, B:21:0x00e5), top: B:8:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dd A[Catch: Exception -> 0x00f6, TryCatch #2 {Exception -> 0x00f6, blocks: (B:9:0x0091, B:12:0x009c, B:14:0x00a0, B:15:0x00a2, B:17:0x00cb, B:18:0x00d3, B:20:0x00dd, B:21:0x00e5), top: B:8:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01fd A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x021c A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022a A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0272 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0284 A[Catch: Exception -> 0x029d, TryCatch #0 {Exception -> 0x029d, blocks: (B:79:0x01a3, B:81:0x01ad, B:83:0x01b5, B:85:0x01c2, B:86:0x01c4, B:52:0x026a, B:54:0x0272, B:55:0x027a, B:57:0x0284, B:58:0x028c, B:41:0x01e6, B:45:0x01fd, B:47:0x021c, B:48:0x021e, B:50:0x022a, B:51:0x023d), top: B:78:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d2  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        CharSequence c;
        StaticLayout staticLayout;
        CharSequence v1;
        CharSequence v12;
        TextPaint textPaint;
        this.I = null;
        this.s = null;
        this.N = null;
        int size = (View.MeasureSpec.getSize(i) - gl.L(gl.C)) - gl.L(28.0f);
        TextPaint textPaint2 = this.b0;
        boolean z = this.V;
        if (z) {
            String e1 = k96.e1(this.O.k.date);
            int ceil = (int) Math.ceil(textPaint2.measureText(e1));
            this.W = gb2.K1(e1, textPaint2, ceil, ceil, 0, 1);
            this.a0 = gl.L(20.0f) + ((size - ceil) - gl.L(8.0f));
            i3 = gl.L(12.0f) + ceil;
        } else {
            i3 = 0;
        }
        wjb wjbVar = this.d0;
        if (z) {
            try {
            } catch (Exception e) {
                e = e;
                f = 4.0f;
                fa4.g(e, true);
                if (this.O.r2()) {
                }
                if (z) {
                }
                CharSequence replace = this.O.w1(true).replace('\n', ' ');
                v1 = gl.v1(replace, this.O.a2, wjbVar);
                if (v1 != null) {
                }
                if (z) {
                }
                if (!z) {
                }
                if (this.O.L0() > 0.0d) {
                }
                staticLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace, textPaint2, size - textPaint2.measureText(r5), TextUtils.TruncateAt.END)).append((CharSequence) r5), textPaint2, size + gl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.I = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                this.F = gm.update(0, this, this.F, this.I);
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(56.0f) + (this.N != null ? gl.L(18.0f) : 0) + (this.c ? 1 : 0));
                if (k96.a0) {
                }
                int L = gl.L(f) + r0;
                this.h = L;
                int L2 = gl.L(6.0f);
                this.n = L2;
                this.U.p(L, L2, gl.L(48.0f) + r0, gl.L(50.0f));
                measureChildWithMargins(this.b, i, 0, i2, 0);
                if (this.N == null) {
                }
            }
            if (k27.Q4(this.O.k) || this.O.g4()) {
                c = af4.c(this.O, true, 1, null);
                f = 4.0f;
                v12 = gl.v1(c, this.O.a2, wjbVar);
                if (v12 != null) {
                    c = v12;
                }
                textPaint = this.i0;
                if (textPaint == null) {
                    textPaint = bkb.e3;
                }
                StaticLayout staticLayout2 = new StaticLayout(TextUtils.ellipsize(c, textPaint, size - i3, TextUtils.TruncateAt.END), textPaint, (gl.L(4.0f) + size) - i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.s = staticLayout2;
                this.w = staticLayout2.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
                this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
                this.y = gm.update(0, this, this.y, this.s);
                if (this.O.r2()) {
                    CharSequence v13 = gl.v1(TextUtils.isEmpty(this.O.k.message) ? "" : vu3.m(this.O.k.message.replace("\n", " ").replaceAll(" +", " ").trim(), bkb.n2.getFontMetricsInt(), false, null, 0), this.O.a2, wjbVar);
                    if (v13 != null) {
                        String str = (String) this.O.a2.get(0);
                        TextPaint textPaint3 = this.c0;
                        StaticLayout staticLayout3 = new StaticLayout(TextUtils.ellipsize(gl.Q(v13, str, size, textPaint3), textPaint3, size, TextUtils.TruncateAt.END), textPaint3, gl.L(f) + size, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.N = staticLayout3;
                        this.L = staticLayout3.getLineCount() > 0 ? this.N.getLineLeft(0) : 0.0f;
                        this.M = this.N.getLineCount() > 0 ? this.N.getLineWidth(0) : 0.0f;
                    }
                    this.K = gm.update(0, this, this.K, this.N);
                }
                if (z) {
                    try {
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    if (k27.Q4(this.O.k) || this.O.g4()) {
                        String g0 = gl.g0((int) this.O.L0(), false, false);
                        if (!z) {
                            textPaint2 = bkb.f3;
                        }
                        staticLayout = new StaticLayout(TextUtils.ellipsize(g0, textPaint2, size, TextUtils.TruncateAt.END), textPaint2, size + gl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                        this.I = staticLayout;
                        this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                        this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                        this.F = gm.update(0, this, this.F, this.I);
                        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(56.0f) + (this.N != null ? gl.L(18.0f) : 0) + (this.c ? 1 : 0));
                        int x = k96.a0 ? ls6.x(8.0f, View.MeasureSpec.getSize(i), gl.L(52.0f)) : gl.L(8.0f);
                        int L3 = gl.L(f) + x;
                        this.h = L3;
                        int L22 = gl.L(6.0f);
                        this.n = L22;
                        this.U.p(L3, L22, gl.L(48.0f) + x, gl.L(50.0f));
                        measureChildWithMargins(this.b, i, 0, i2, 0);
                        if (this.N == null) {
                            this.E = gl.L(29.0f);
                            return;
                        } else {
                            this.J = gl.L(29.0f);
                            this.E = gl.L(18.0f) + gl.L(29.0f);
                            return;
                        }
                    }
                }
                CharSequence replace2 = this.O.w1(true).replace('\n', ' ');
                v1 = gl.v1(replace2, this.O.a2, wjbVar);
                if (v1 != null) {
                    replace2 = v1;
                }
                if (z) {
                    replace2 = new SpannableStringBuilder(replace2).append(' ').append((CharSequence) this.a).append(' ').append(af4.c(this.O, true, 1, null));
                }
                if (!z) {
                    textPaint2 = bkb.f3;
                }
                String concat = this.O.L0() > 0.0d ? " • ".concat(k96.R((int) Math.ceil(this.O.L0()))) : "";
                staticLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace2, textPaint2, size - textPaint2.measureText(concat), TextUtils.TruncateAt.END)).append((CharSequence) concat), textPaint2, size + gl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.I = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
                this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
                this.F = gm.update(0, this, this.F, this.I);
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(56.0f) + (this.N != null ? gl.L(18.0f) : 0) + (this.c ? 1 : 0));
                if (k96.a0) {
                }
                int L32 = gl.L(f) + x;
                this.h = L32;
                int L222 = gl.L(6.0f);
                this.n = L222;
                this.U.p(L32, L222, gl.L(48.0f) + x, gl.L(50.0f));
                measureChildWithMargins(this.b, i, 0, i2, 0);
                if (this.N == null) {
                }
            }
        }
        c = this.O.y1(true).replace('\n', ' ');
        f = 4.0f;
        v12 = gl.v1(c, this.O.a2, wjbVar);
        if (v12 != null) {
        }
        textPaint = this.i0;
        if (textPaint == null) {
        }
        StaticLayout staticLayout22 = new StaticLayout(TextUtils.ellipsize(c, textPaint, size - i3, TextUtils.TruncateAt.END), textPaint, (gl.L(4.0f) + size) - i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.s = staticLayout22;
        this.w = staticLayout22.getLineCount() <= 0 ? this.s.getLineLeft(0) : 0.0f;
        this.x = this.s.getLineCount() <= 0 ? this.s.getLineWidth(0) : 0.0f;
        this.y = gm.update(0, this, this.y, this.s);
        if (this.O.r2()) {
        }
        if (z) {
        }
        CharSequence replace22 = this.O.w1(true).replace('\n', ' ');
        v1 = gl.v1(replace22, this.O.a2, wjbVar);
        if (v1 != null) {
        }
        if (z) {
        }
        if (!z) {
        }
        if (this.O.L0() > 0.0d) {
        }
        staticLayout = new StaticLayout(SpannableStringBuilder.valueOf(TextUtils.ellipsize(replace22, textPaint2, size - textPaint2.measureText(concat), TextUtils.TruncateAt.END)).append((CharSequence) concat), textPaint2, size + gl.L(f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.I = staticLayout;
        this.G = staticLayout.getLineCount() > 0 ? this.I.getLineLeft(0) : 0.0f;
        this.H = this.I.getLineCount() > 0 ? this.I.getLineWidth(0) : 0.0f;
        this.F = gm.update(0, this, this.F, this.I);
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(56.0f) + (this.N != null ? gl.L(18.0f) : 0) + (this.c ? 1 : 0));
        if (k96.a0) {
        }
        int L322 = gl.L(f) + x;
        this.h = L322;
        int L2222 = gl.L(6.0f);
        this.n = L2222;
        this.U.p(L322, L2222, gl.L(48.0f) + x, gl.L(50.0f));
        measureChildWithMargins(this.b, i, 0, i2, 0);
        if (this.N == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0127 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int L;
        int L2;
        int i;
        if (this.O == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int L3 = gl.L(36.0f);
        boolean z2 = this.T >= 0 && x >= (L2 = this.h + (L = gl.L(27.0f))) && x <= L2 + L3 && y >= (i = this.n + L) && y <= i + L3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.U;
        if (action == 0) {
            if (z2) {
                this.e = true;
                radialProgress2.n(true, true);
                invalidate();
            } else if (this.P && radialProgress2.a.contains(x, y)) {
                requestDisallowInterceptTouchEvent(true);
                this.d = true;
                radialProgress2.n(true, false);
                invalidate();
            }
            z = true;
            radialProgress2.n(this.e, true);
            boolean z3 = !z || this.d;
            if (motionEvent.getAction() == 3) {
                return z3;
            }
            this.e = false;
            this.d = false;
            radialProgress2.n(false, false);
            radialProgress2.n(this.e, true);
            return false;
        }
        if (motionEvent.getAction() == 1) {
            if (this.e) {
                this.e = false;
                playSoundEffect(0);
                int i2 = this.T;
                int i3 = this.Q;
                if (i2 == 0) {
                    this.T = 1;
                    radialProgress2.o(false, 0.0f);
                    ba4.G(i3).X(this.O.F0(), this.O, 1, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.w().D(this.O)) {
                        MediaController.w().l(true, true, false, false);
                    }
                    this.T = 0;
                    ba4.G(i3).f(this.O.F0());
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
        } else if (motionEvent.getAction() == 2 && !z2 && this.e) {
            this.e = false;
            invalidate();
        }
        z = false;
        radialProgress2.n(this.e, true);
        if (z) {
        }
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        a();
        return true;
    }

    public void setCheckForButtonPress(boolean z) {
        this.P = z;
    }

    public void setEnterAnimationAlpha(float f) {
        if (this.k0 != f) {
            this.k0 = f;
            invalidate();
        }
    }

    public void setGlobalGradientView(pi4 pi4Var) {
        this.l0 = pi4Var;
    }

    public void setNeedPlayMessageListener(q8c q8cVar) {
        this.j0 = q8cVar;
    }

    @Override // tjb
    public final void updateColors() {
        k27 k27Var;
        try {
            TextPaint textPaint = this.i0;
            wjb wjbVar = this.d0;
            if (textPaint != null) {
                textPaint.setColor(bkb.v0(bkb.F6, wjbVar));
            }
            RadialProgress2 radialProgress2 = this.U;
            if (radialProgress2 != null && this.f != 0 && (k27Var = this.O) != null) {
                radialProgress2.l(bkb.v0(k27Var.O3() ? bkb.Dc : bkb.Ye, wjbVar));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }

    public eba(Context context) {
        this(0, null, context);
    }
}
