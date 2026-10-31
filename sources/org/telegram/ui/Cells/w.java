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
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.qs;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements org.telegram.messenger.z5, org.telegram.ui.ActionBar.k6 {
    public static final /* synthetic */ int L = 0;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public final RadialProgress2 H;
    public final int I;
    public final SpannableStringBuilder J;
    public final org.telegram.ui.ActionBar.p6 K;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.k5 f;
    public StaticLayout h;
    public final int n;
    public org.telegram.ui.Components.k5 r;
    public StaticLayout s;
    public final ImageView w;
    public jj x;
    public boolean y;

    public w(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.e = org.telegram.messenger.i0.L(9.0f);
        this.n = org.telegram.messenger.i0.L(29.0f);
        int i11 = d20.s0;
        this.D = i11;
        setWillNotDraw(false);
        this.K = p6Var;
        this.I = i10;
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.m6, p6Var, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, p6Var);
        int i13 = 3;
        addView(imageView, w7.b6.d(42, 42.0f, (cd.X ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bh.c(i13));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.H = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.id, org.telegram.ui.ActionBar.t6.jd);
        this.E = org.telegram.messenger.b6.q(i11).k();
        setFocusable(true);
        if (i10 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new qs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i10 = this.F;
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 2;
        }
        return i10 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i10 = this.G;
        if (i10 < 0) {
            return 4;
        }
        return i10 == 0 ? 2 : 3;
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        b(true, z10);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.H.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z10;
        int i10 = this.F;
        int i11 = this.D;
        RadialProgress2 radialProgress2 = this.H;
        if (i10 == 0) {
            if (this.G == 0) {
                org.telegram.messenger.b8.G(i11).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController B = MediaController.B();
            jj jjVar = this.x;
            int indexOf = B.R0.indexOf(jjVar);
            if (indexOf == -1) {
                z10 = B.S(jjVar);
            } else {
                B.T(indexOf);
                z10 = true;
            }
            if (z10) {
                if (this.b == 2 && this.G != 1) {
                    this.G = 1;
                    radialProgress2.p(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.F = 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (MediaController.B().R(this.x, true)) {
                this.F = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i10 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.b8.G(i11).X(this.x.F0(), this.x, 1, 0);
            this.F = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i10 == 4) {
            org.telegram.messenger.b8.G(i11).f(this.x.F0());
            this.F = 2;
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
        int i10 = this.D;
        if (file == null) {
            org.telegram.messenger.b8.G(i10);
            file = org.telegram.messenger.b8.I(this.x.F0());
        }
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!tz.B0 || ((int) jj.B0(this.x.k)) == 0) {
            this.G = -1;
        } else {
            this.b = exists ? 1 : 2;
            exists = true;
        }
        int i11 = this.b;
        RadialProgress2 radialProgress2 = this.H;
        if (i11 == 0) {
            if (exists) {
                org.telegram.messenger.b6.q(i10).v(this);
                boolean I = MediaController.B().I(this.x);
                if (!I || (I && MediaController.B().H())) {
                    this.F = 0;
                } else {
                    this.F = 1;
                }
                radialProgress2.p(z11, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
                invalidate();
                return;
            }
            org.telegram.messenger.b6.q(i10).a(S0, null, this);
            if (org.telegram.messenger.b8.G(i10).T(S0)) {
                this.F = 4;
                Float w9 = hc.D().w(S0);
                if (w9 != null) {
                    radialProgress2.p(z11, w9.floatValue());
                } else {
                    radialProgress2.p(z11, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            } else {
                this.F = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
            }
            invalidate();
            return;
        }
        radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(this.x.P3() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We, this.K));
        boolean I2 = MediaController.B().I(this.x);
        if (!I2 || (I2 && MediaController.B().H())) {
            this.F = 0;
        } else {
            this.F = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.b == 1) {
            org.telegram.messenger.b6.q(i10).v(this);
            this.G = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        org.telegram.messenger.b6.q(i10).a(S0, this.x, this);
        if (!org.telegram.messenger.b8.G(i10).T(S0)) {
            this.G = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.G = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float w10 = hc.D().w(S0);
        if (w10 != null) {
            radialProgress2.p(z11, w10.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
    }

    public jj getMessageObject() {
        return this.x;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.E;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.H.p(true, Math.min(1.0f, j10 / j11));
        if (this.b != 0) {
            if (this.G != 1) {
                b(false, true);
            }
        } else if (this.F != 4) {
            b(false, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H.e();
        this.f = org.telegram.ui.Components.o5.update(0, this, this.f, this.h);
        this.r = org.telegram.ui.Components.o5.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.f();
        org.telegram.messenger.b6.q(this.D).v(this);
        org.telegram.ui.Components.o5.release(this, this.f);
        org.telegram.ui.Components.o5.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint W0;
        StaticLayout staticLayout = this.h;
        int i10 = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.i0.L(cd.X ? 16.0f : org.telegram.messenger.i0.C) + ((cd.X && imageView.getVisibility() == 0) ? org.telegram.messenger.i0.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        org.telegram.ui.ActionBar.p6 p6Var = this.K;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.t6.g3.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
            canvas.save();
            int L2 = org.telegram.messenger.i0.L(cd.X ? 16.0f : org.telegram.messenger.i0.C);
            if (cd.X && imageView.getVisibility() == 0) {
                i10 = org.telegram.messenger.i0.L(32.0f);
            }
            canvas.translate(L2 + i10, this.n);
            this.s.draw(canvas);
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wd, p6Var);
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (W0 = org.telegram.ui.ActionBar.t6.W0("paintDivider", p6Var)) == null) {
            return;
        }
        if (cd.X) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getHeight(), W0);
        } else {
            canvas.drawRect(org.telegram.messenger.i0.L(org.telegram.messenger.i0.C), getHeight() - 1, getWidth(), getHeight(), W0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(cd.a0("AccDescrMusicInfo", null, 2131754832, this.x.x1(true), this.x.z1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.p6 p6Var = this.K;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(org.telegram.messenger.i0.C)) - org.telegram.messenger.i0.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.z1(true).replace('\n', ' '), org.telegram.ui.ActionBar.t6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.t6.f3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.i0.x1(ellipsize, this.x.Y1, p6Var);
            StaticLayout staticLayout = new StaticLayout(x12 == null ? ellipsize : x12, org.telegram.ui.ActionBar.t6.f3, size + org.telegram.messenger.i0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = org.telegram.ui.Components.o5.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            CharSequence replace = this.x.x1(true).replace('\n', ' ');
            if (this.I == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.J).append(' ').append(z00.d(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.t6.g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.i0.x1(ellipsize2, this.x.Y1, p6Var);
            StaticLayout staticLayout2 = new StaticLayout(x13 == null ? ellipsize2 : x13, org.telegram.ui.ActionBar.t6.g3, size + org.telegram.messenger.i0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = org.telegram.ui.Components.o5.update(0, this, this.r, staticLayout2);
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), TLObject.FLAG_30));
        int z10 = cd.X ? org.telegram.messenger.m5.z(8.0f, View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(52.0f)) : org.telegram.messenger.i0.L(8.0f);
        int L2 = org.telegram.messenger.i0.L(4.0f) + z10;
        this.c = L2;
        int L3 = org.telegram.messenger.i0.L(6.0f);
        this.d = L3;
        this.H.r(L2, L3, org.telegram.messenger.i0.L(48.0f) + z10, org.telegram.messenger.i0.L(50.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int L2;
        int L3;
        int i10;
        if (this.x == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int L4 = org.telegram.messenger.i0.L(36.0f);
        boolean z10 = true;
        boolean z11 = this.G >= 0 && x10 >= (L3 = this.c + (L2 = org.telegram.messenger.i0.L(27.0f))) && x10 <= L3 + L4 && y3 >= (i10 = this.d + L2) && y3 <= i10 + L4;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.H;
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
                int i11 = this.G;
                int i12 = this.D;
                if (i11 == 0) {
                    this.G = 1;
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.b8.G(i12).X(this.x.F0(), this.x, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i11 == 1) {
                    if (MediaController.B().I(this.x)) {
                        MediaController.B().q(true, true, false, false);
                    }
                    this.G = 0;
                    org.telegram.messenger.b8.G(i12).f(this.x.F0());
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        jj jjVar;
        try {
            RadialProgress2 radialProgress2 = this.H;
            if (radialProgress2 == null || (jjVar = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.t6.w0(jjVar.P3() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We, this.K));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
