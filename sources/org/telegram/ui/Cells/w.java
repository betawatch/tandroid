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
import org.telegram.messenger.gc;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.fs;
import org.telegram.ui.a00;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.ActionBar.b6 {
    public static final /* synthetic */ int L = 0;
    public final int D;
    public final int E;
    public int F;
    public int G;
    public final RadialProgress2 H;
    public final int I;
    public final SpannableStringBuilder J;
    public final org.telegram.ui.ActionBar.g6 K;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.n5 f;
    public StaticLayout h;
    public final int n;
    public org.telegram.ui.Components.n5 r;
    public StaticLayout s;
    public final ImageView w;
    public ij x;
    public boolean y;

    public w(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = org.telegram.messenger.g0.L(9.0f);
        this.n = org.telegram.messenger.g0.L(29.0f);
        int i10 = p10.s0;
        this.D = i10;
        setWillNotDraw(false);
        this.K = g6Var;
        this.I = i7;
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.m6, g6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.l6.i6;
        y h02 = org.telegram.ui.ActionBar.l6.h0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var), 1, -1);
        org.telegram.ui.ActionBar.o6 M = org.telegram.ui.ActionBar.s6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.s6.j(imageView, h02, null, M, g6Var);
        addView(imageView, c8.ha.d(42, 42.0f, (id.a0 ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bi.l1(7));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, g6Var);
        this.H = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.l6.We, org.telegram.ui.ActionBar.l6.Xe, org.telegram.ui.ActionBar.l6.id, org.telegram.ui.ActionBar.l6.jd);
        this.E = org.telegram.messenger.z5.q(i10).k();
        setFocusable(true);
        if (i7 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.J = spannableStringBuilder;
            spannableStringBuilder.setSpan(new fs(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i7 = this.F;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i7 = this.G;
        if (i7 < 0) {
            return 4;
        }
        return i7 == 0 ? 2 : 3;
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        b(true, z9);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.H.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z9;
        int i7 = this.F;
        int i10 = this.D;
        RadialProgress2 radialProgress2 = this.H;
        if (i7 == 0) {
            if (this.G == 0) {
                org.telegram.messenger.w7.G(i10).W(this.x.F0(), this.x, 1, 0);
            }
            MediaController B = MediaController.B();
            ij ijVar = this.x;
            int indexOf = B.R0.indexOf(ijVar);
            if (indexOf == -1) {
                z9 = B.S(ijVar);
            } else {
                B.T(indexOf);
                z9 = true;
            }
            if (z9) {
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
        if (i7 == 1) {
            if (MediaController.B().R(this.x, true)) {
                this.F = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).W(this.x.F0(), this.x, 1, 0);
            this.F = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i7 == 4) {
            org.telegram.messenger.w7.G(i10).f(this.x.F0());
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
    public final void b(boolean z9, boolean z10) {
        File file;
        String S0 = this.x.S0();
        if (!TextUtils.isEmpty(this.x.k.attachPath)) {
            file = new File(this.x.k.attachPath);
        }
        file = null;
        int i7 = this.D;
        if (file == null) {
            org.telegram.messenger.w7.G(i7);
            file = org.telegram.messenger.w7.I(this.x.F0());
        }
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!iz.B0 || ((int) ij.B0(this.x.k)) == 0) {
            this.G = -1;
        } else {
            this.b = exists ? 1 : 2;
            exists = true;
        }
        int i10 = this.b;
        RadialProgress2 radialProgress2 = this.H;
        if (i10 == 0) {
            if (exists) {
                org.telegram.messenger.z5.q(i7).v(this);
                boolean I = MediaController.B().I(this.x);
                if (!I || (I && MediaController.B().H())) {
                    this.F = 0;
                } else {
                    this.F = 1;
                }
                radialProgress2.p(z10, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
                invalidate();
                return;
            }
            org.telegram.messenger.z5.q(i7).a(S0, null, this);
            if (org.telegram.messenger.w7.G(i7).S(S0)) {
                this.F = 4;
                Float w10 = gc.D().w(S0);
                if (w10 != null) {
                    radialProgress2.p(z10, w10.floatValue());
                } else {
                    radialProgress2.p(z10, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
            } else {
                this.F = 2;
                radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
            }
            invalidate();
            return;
        }
        radialProgress2.m(org.telegram.ui.ActionBar.l6.w0(this.x.P3() ? org.telegram.ui.ActionBar.l6.Bc : org.telegram.ui.ActionBar.l6.We, this.K));
        boolean I2 = MediaController.B().I(this.x);
        if (!I2 || (I2 && MediaController.B().H())) {
            this.F = 0;
        } else {
            this.F = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z9, z10);
        if (this.b == 1) {
            org.telegram.messenger.z5.q(i7).v(this);
            this.G = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z9, z10);
            return;
        }
        org.telegram.messenger.z5.q(i7).a(S0, this.x, this);
        if (!org.telegram.messenger.w7.G(i7).S(S0)) {
            this.G = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z9, z10);
            return;
        }
        this.G = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z9, z10);
        Float w11 = gc.D().w(S0);
        if (w11 != null) {
            radialProgress2.p(z10, w11.floatValue());
        } else {
            radialProgress2.p(z10, 0.0f);
        }
    }

    public ij getMessageObject() {
        return this.x;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.E;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.H.p(true, Math.min(1.0f, j3 / j10));
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
        this.f = org.telegram.ui.Components.r5.update(0, this, this.f, this.h);
        this.r = org.telegram.ui.Components.r5.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.f();
        org.telegram.messenger.z5.q(this.D).v(this);
        org.telegram.ui.Components.r5.release(this, this.f);
        org.telegram.ui.Components.r5.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint W0;
        StaticLayout staticLayout = this.h;
        int i7 = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(id.a0 ? 16.0f : org.telegram.messenger.g0.C) + ((id.a0 && imageView.getVisibility() == 0) ? org.telegram.messenger.g0.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.l6.g3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z6, g6Var));
            canvas.save();
            int L2 = org.telegram.messenger.g0.L(id.a0 ? 16.0f : org.telegram.messenger.g0.C);
            if (id.a0 && imageView.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L2 + i7, this.n);
            this.s.draw(canvas);
            org.telegram.ui.Components.r5.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Wd, g6Var);
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (W0 = org.telegram.ui.ActionBar.l6.W0("paintDivider", g6Var)) == null) {
            return;
        }
        if (id.a0) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
        } else {
            canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(id.a0("AccDescrMusicInfo", null, 2131754832, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var = this.K;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.y1(true).replace('\n', ' '), org.telegram.ui.ActionBar.l6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.l6.f3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.x.Y1, g6Var);
            StaticLayout staticLayout = new StaticLayout(x12 == null ? ellipsize : x12, org.telegram.ui.ActionBar.l6.f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = org.telegram.ui.Components.r5.update(0, this, this.f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.I == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.J).append(' ').append(a00.d(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.l6.g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.x.Y1, g6Var);
            StaticLayout staticLayout2 = new StaticLayout(x13 == null ? ellipsize2 : x13, org.telegram.ui.ActionBar.l6.g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = org.telegram.ui.Components.r5.update(0, this, this.r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        int z9 = id.a0 ? org.telegram.messenger.k5.z(8.0f, View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(52.0f)) : org.telegram.messenger.g0.L(8.0f);
        int L2 = org.telegram.messenger.g0.L(4.0f) + z9;
        this.c = L2;
        int L3 = org.telegram.messenger.g0.L(6.0f);
        this.d = L3;
        this.H.r(L2, L3, org.telegram.messenger.g0.L(48.0f) + z9, org.telegram.messenger.g0.L(50.0f));
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
        int i7;
        if (this.x == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int L4 = org.telegram.messenger.g0.L(36.0f);
        boolean z9 = true;
        boolean z10 = this.G >= 0 && x10 >= (L3 = this.c + (L2 = org.telegram.messenger.g0.L(27.0f))) && x10 <= L3 + L4 && y10 >= (i7 = this.d + L2) && y10 <= i7 + L4;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.H;
        if (action == 0) {
            if (z10) {
                this.a = true;
                radialProgress2.o(true, true);
                invalidate();
                if (motionEvent.getAction() == 3) {
                    return z9;
                }
                this.a = false;
                return false;
            }
        } else if (this.a) {
            if (motionEvent.getAction() == 1) {
                this.a = false;
                playSoundEffect(0);
                int i10 = this.G;
                int i11 = this.D;
                if (i10 == 0) {
                    this.G = 1;
                    radialProgress2.p(false, 0.0f);
                    org.telegram.messenger.w7.G(i11).W(this.x.F0(), this.x, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i10 == 1) {
                    if (MediaController.B().I(this.x)) {
                        MediaController.B().q(true, true, false, false);
                    }
                    this.G = 0;
                    org.telegram.messenger.w7.G(i11).f(this.x.F0());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.a = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !z10) {
                this.a = false;
                invalidate();
            }
            radialProgress2.o(this.a, true);
        }
        z9 = false;
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        ij ijVar;
        try {
            RadialProgress2 radialProgress2 = this.H;
            if (radialProgress2 == null || (ijVar = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.l6.w0(ijVar.P3() ? org.telegram.ui.ActionBar.l6.Bc : org.telegram.ui.ActionBar.l6.We, this.K));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
