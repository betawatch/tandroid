package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.wz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.ActionBar.z5 {
    public static final /* synthetic */ int M = 0;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final org.telegram.ui.ActionBar.e6 L;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.l5 f;
    public StaticLayout h;
    public final int n;
    public org.telegram.ui.Components.l5 r;
    public StaticLayout s;
    public final ImageView w;
    public zi x;
    public boolean y;

    public w(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.e = org.telegram.messenger.g0.L(9.0f);
        this.n = org.telegram.messenger.g0.L(29.0f);
        int i10 = h10.t0;
        this.E = i10;
        setWillNotDraw(false);
        this.L = e6Var;
        this.J = i3;
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.m6, e6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, e6Var);
        addView(imageView, mf.d(42, 42.0f, (bd.a0 ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new ai.t(11));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.I = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.k6.We, org.telegram.ui.ActionBar.k6.Xe, org.telegram.ui.ActionBar.k6.id, org.telegram.ui.ActionBar.k6.jd);
        this.F = org.telegram.messenger.z5.q(i10).k();
        setFocusable(true);
        if (i3 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i3 = this.G;
        if (i3 == 1) {
            return 1;
        }
        if (i3 == 2) {
            return 2;
        }
        return i3 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i3 = this.H;
        if (i3 < 0) {
            return 4;
        }
        return i3 == 0 ? 2 : 3;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        b(true, z10);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.I.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z10;
        int i3 = this.G;
        int i10 = this.E;
        RadialProgress2 radialProgress2 = this.I;
        if (i3 == 0) {
            if (this.H == 0) {
                org.telegram.messenger.w7.G(i10).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController B = MediaController.B();
            zi ziVar = this.x;
            int indexOf = B.S0.indexOf(ziVar);
            if (indexOf == -1) {
                z10 = B.S(ziVar);
            } else {
                B.T(indexOf);
                z10 = true;
            }
            if (z10) {
                if (this.b == 2 && this.H != 1) {
                    this.H = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.G = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (MediaController.B().R(this.x, true)) {
                this.G = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i3 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).X(this.x.F0(), this.x, 1, 0);
            this.G = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i3 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.x.F0());
            this.G = 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r1.exists() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10, boolean z11) {
        File file;
        String S0 = this.x.S0();
        if (!TextUtils.isEmpty(this.x.k.attachPath)) {
            file = new File(this.x.k.attachPath);
        }
        file = null;
        int i3 = this.E;
        if (file == null) {
            org.telegram.messenger.w7.G(i3);
            file = org.telegram.messenger.w7.I(this.x.F0());
        }
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!az.B0 || ((int) zi.B0(this.x.k)) == 0) {
            this.H = -1;
        } else {
            this.b = exists ? 1 : 2;
            exists = true;
        }
        int i10 = this.b;
        RadialProgress2 radialProgress2 = this.I;
        if (i10 == 0) {
            if (exists) {
                org.telegram.messenger.z5.q(i3).v(this);
                boolean I = MediaController.B().I(this.x);
                if (!I || (I && MediaController.B().H())) {
                    this.G = 0;
                } else {
                    this.G = 1;
                }
                radialProgress2.p(z11, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            org.telegram.messenger.z5.q(i3).a(S0, null, this);
            if (org.telegram.messenger.w7.G(i3).T(S0)) {
                this.G = 4;
                Float w10 = zb.D().w(S0);
                if (w10 != null) {
                    radialProgress2.p(z11, w10.floatValue());
                } else {
                    radialProgress2.p(z11, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            } else {
                this.G = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            }
            invalidate();
            return;
        }
        radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(this.x.Q3() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We, this.L));
        boolean I2 = MediaController.B().I(this.x);
        if (!I2 || (I2 && MediaController.B().H())) {
            this.G = 0;
        } else {
            this.G = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.b == 1) {
            org.telegram.messenger.z5.q(i3).v(this);
            this.H = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        org.telegram.messenger.z5.q(i3).a(S0, this.x, this);
        if (!org.telegram.messenger.w7.G(i3).T(S0)) {
            this.H = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.H = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float w11 = zb.D().w(S0);
        if (w11 != null) {
            radialProgress2.p(z11, w11.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
    }

    public zi getMessageObject() {
        return this.x;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.F;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.I.p(true, Math.min(1.0f, j10 / j11));
        if (this.b != 0) {
            if (this.H != 1) {
                b(false, true);
            }
        } else if (this.G != 4) {
            b(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.e();
        this.f = org.telegram.ui.Components.p5.update(0, this, this.f, this.h);
        this.r = org.telegram.ui.Components.p5.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        org.telegram.messenger.z5.q(this.E).v(this);
        org.telegram.ui.Components.p5.release(this, this.f);
        org.telegram.ui.Components.p5.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint W0;
        StaticLayout staticLayout = this.h;
        int i3 = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(bd.a0 ? 16.0f : org.telegram.messenger.g0.C) + ((bd.a0 && imageView.getVisibility() == 0) ? org.telegram.messenger.g0.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        org.telegram.ui.ActionBar.e6 e6Var = this.L;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.k6.g3.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var));
            canvas.save();
            int L = org.telegram.messenger.g0.L(bd.a0 ? 16.0f : org.telegram.messenger.g0.C);
            if (bd.a0 && imageView.getVisibility() == 0) {
                i3 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L + i3, this.n);
            this.s.draw(canvas);
            org.telegram.ui.Components.p5.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wd, e6Var);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (W0 = org.telegram.ui.ActionBar.k6.W0("paintDivider", e6Var)) == null) {
            return;
        }
        if (bd.a0) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
        } else {
            canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.J3()) {
            accessibilityNodeInfo.setText(bd.a0("AccDescrMusicInfo", null, 2131754832, this.x.x1(true), this.x.z1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.e6 e6Var = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.z1(true).replace('\n', ' '), org.telegram.ui.ActionBar.k6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.k6.f3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.x.Y1, e6Var);
            StaticLayout staticLayout = new StaticLayout(x12 == null ? ellipsize : x12, org.telegram.ui.ActionBar.k6.f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = org.telegram.ui.Components.p5.update(0, this, this.f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.x.x1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(wz.d(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.k6.g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.x.Y1, e6Var);
            StaticLayout staticLayout2 = new StaticLayout(x13 == null ? ellipsize2 : x13, org.telegram.ui.ActionBar.k6.g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = org.telegram.ui.Components.p5.update(0, this, this.r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        int z10 = bd.a0 ? org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(52.0f)) : org.telegram.messenger.g0.L(8.0f);
        int L = org.telegram.messenger.g0.L(4.0f) + z10;
        this.c = L;
        int L2 = org.telegram.messenger.g0.L(6.0f);
        this.d = L2;
        this.I.r(L, L2, org.telegram.messenger.g0.L(48.0f) + z10, org.telegram.messenger.g0.L(50.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int L;
        int L2;
        int i3;
        if (this.x == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int L3 = org.telegram.messenger.g0.L(36.0f);
        boolean z10 = true;
        boolean z11 = this.H >= 0 && x10 >= (L2 = this.c + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L3 && y9 >= (i3 = this.d + L) && y9 <= i3 + L3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.I;
        if (action == 0) {
            if (z11) {
                this.a = true;
                radialProgress2.o(true, true);
                invalidate();
                if (motionEvent.getAction() == 3) {
                    return z10;
                }
                this.a = false;
                return false;
            }
        } else if (this.a) {
            if (motionEvent.getAction() == 1) {
                this.a = false;
                playSoundEffect(0);
                int i10 = this.H;
                int i11 = this.E;
                if (i10 == 0) {
                    this.H = 1;
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.w7.G(i11).X(this.x.F0(), this.x, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i10 == 1) {
                    if (MediaController.B().I(this.x)) {
                        MediaController.B().q(true, true, false, false);
                    }
                    this.H = 0;
                    org.telegram.messenger.w7.G(i11).f(this.x.F0());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.a = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !z11) {
                this.a = false;
                invalidate();
            }
            radialProgress2.o(this.a, true);
        }
        z10 = false;
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        zi ziVar;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 == null || (ziVar = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.k6.w0(ziVar.Q3() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We, this.L));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
