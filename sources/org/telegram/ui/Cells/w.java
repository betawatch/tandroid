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
import org.telegram.messenger.bz;
import org.telegram.messenger.ec;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.ss;
import org.telegram.ui.c00;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class w extends FrameLayout implements org.telegram.messenger.y5, org.telegram.ui.ActionBar.c6 {
    public static final /* synthetic */ int M = 0;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final org.telegram.ui.ActionBar.i6 L;
    public boolean a;
    public int b;
    public int c;
    public int d;
    public final int e;
    public org.telegram.ui.Components.t5 f;
    public StaticLayout h;
    public final int n;
    public org.telegram.ui.Components.t5 r;
    public StaticLayout s;
    public final ImageView w;
    public fj x;
    public boolean y;

    public w(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.e = org.telegram.messenger.g0.L(9.0f);
        this.n = org.telegram.messenger.g0.L(29.0f);
        int i10 = j10.t0;
        this.E = i10;
        setWillNotDraw(false);
        this.L = i6Var;
        this.J = i7;
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.m6, i6Var, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 1, -1);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M2, i6Var);
        addView(imageView, c8.ma.d(42, 42.0f, (gd.a0 ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new bi.o(12));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, i6Var);
        this.I = radialProgress2;
        radialProgress2.g(org.telegram.ui.ActionBar.n6.Ze, org.telegram.ui.ActionBar.n6.af, org.telegram.ui.ActionBar.n6.ld, org.telegram.ui.ActionBar.n6.md);
        this.F = org.telegram.messenger.a6.q(i10).k();
        setFocusable(true);
        if (i7 == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new ss(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        int i7 = this.G;
        if (i7 == 1) {
            return 1;
        }
        if (i7 == 2) {
            return 2;
        }
        return i7 == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i7 = this.H;
        if (i7 < 0) {
            return 4;
        }
        return i7 == 0 ? 2 : 3;
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        b(true, z10);
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.I.p(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z10;
        int i7 = this.G;
        int i10 = this.E;
        RadialProgress2 radialProgress2 = this.I;
        if (i7 == 0) {
            if (this.H == 0) {
                org.telegram.messenger.w7.G(i10).W(this.x.F0(), this.x, 1, 0);
            }
            MediaController B = MediaController.B();
            fj fjVar = this.x;
            int indexOf = B.S0.indexOf(fjVar);
            if (indexOf == -1) {
                z10 = B.S(fjVar);
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
        if (i7 == 1) {
            if (MediaController.B().R(this.x, true)) {
                this.G = 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (i7 == 2) {
            radialProgress2.p(false, 0.0f);
            org.telegram.messenger.w7.G(i10).W(this.x.F0(), this.x, 1, 0);
            this.G = 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (i7 == 4) {
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
        int i7 = this.E;
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
        if (!bz.B0 || ((int) fj.B0(this.x.k)) == 0) {
            this.H = -1;
        } else {
            this.b = exists ? 1 : 2;
            exists = true;
        }
        int i10 = this.b;
        RadialProgress2 radialProgress2 = this.I;
        if (i10 == 0) {
            if (exists) {
                org.telegram.messenger.a6.q(i7).v(this);
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
            org.telegram.messenger.a6.q(i7).a(S0, null, this);
            if (org.telegram.messenger.w7.G(i7).S(S0)) {
                this.G = 4;
                Float w10 = ec.D().w(S0);
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
        radialProgress2.m(org.telegram.ui.ActionBar.n6.w0(this.x.P3() ? org.telegram.ui.ActionBar.n6.Ec : org.telegram.ui.ActionBar.n6.Ze, this.L));
        boolean I2 = MediaController.B().I(this.x);
        if (!I2 || (I2 && MediaController.B().H())) {
            this.G = 0;
        } else {
            this.G = 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z10, z11);
        if (this.b == 1) {
            org.telegram.messenger.a6.q(i7).v(this);
            this.H = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        org.telegram.messenger.a6.q(i7).a(S0, this.x, this);
        if (!org.telegram.messenger.w7.G(i7).S(S0)) {
            this.H = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
            return;
        }
        this.H = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z10, z11);
        Float w11 = ec.D().w(S0);
        if (w11 != null) {
            radialProgress2.p(z11, w11.floatValue());
        } else {
            radialProgress2.p(z11, 0.0f);
        }
    }

    public fj getMessageObject() {
        return this.x;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.F;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.I.p(true, Math.min(1.0f, j3 / j10));
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
        this.f = org.telegram.ui.Components.x5.update(0, this, this.f, this.h);
        this.r = org.telegram.ui.Components.x5.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        org.telegram.messenger.a6.q(this.E).v(this);
        org.telegram.ui.Components.x5.release(this, this.f);
        org.telegram.ui.Components.x5.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint W0;
        StaticLayout staticLayout = this.h;
        int i7 = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(gd.a0 ? 16.0f : org.telegram.messenger.g0.C) + ((gd.a0 && imageView.getVisibility() == 0) ? org.telegram.messenger.g0.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        org.telegram.ui.ActionBar.i6 i6Var = this.L;
        if (staticLayout2 != null) {
            org.telegram.ui.ActionBar.n6.g3.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var));
            canvas.save();
            int L = org.telegram.messenger.g0.L(gd.a0 ? 16.0f : org.telegram.messenger.g0.C);
            if (gd.a0 && imageView.getVisibility() == 0) {
                i7 = org.telegram.messenger.g0.L(32.0f);
            }
            canvas.translate(L + i7, this.n);
            this.s.draw(canvas);
            org.telegram.ui.Components.x5.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Zd, i6Var);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = w02;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", i6Var)) == null) {
            return;
        }
        if (gd.a0) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight(), W0);
        } else {
            canvas.drawRect(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getHeight() - 1, getWidth(), getHeight(), W0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(gd.a0("AccDescrMusicInfo", null, 2131754832, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.i6 i6Var = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C)) - org.telegram.messenger.g0.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.y1(true).replace('\n', ' '), org.telegram.ui.ActionBar.n6.f3, Math.min((int) Math.ceil(org.telegram.ui.ActionBar.n6.f3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence x12 = org.telegram.messenger.g0.x1(ellipsize, this.x.a2, i6Var);
            StaticLayout staticLayout = new StaticLayout(x12 == null ? ellipsize : x12, org.telegram.ui.ActionBar.n6.f3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = org.telegram.ui.Components.x5.update(0, this, this.f, staticLayout);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(c00.d(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, org.telegram.ui.ActionBar.n6.g3, size, TextUtils.TruncateAt.END);
            CharSequence x13 = org.telegram.messenger.g0.x1(ellipsize2, this.x.a2, i6Var);
            StaticLayout staticLayout2 = new StaticLayout(x13 == null ? ellipsize2 : x13, org.telegram.ui.ActionBar.n6.g3, size + org.telegram.messenger.g0.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = org.telegram.ui.Components.x5.update(0, this, this.r, staticLayout2);
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), TLObject.FLAG_30));
        int z10 = gd.a0 ? org.telegram.messenger.f3.z(8.0f, View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(52.0f)) : org.telegram.messenger.g0.L(8.0f);
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
        int i7;
        if (this.x == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int L3 = org.telegram.messenger.g0.L(36.0f);
        boolean z10 = true;
        boolean z11 = this.H >= 0 && x10 >= (L2 = this.c + (L = org.telegram.messenger.g0.L(27.0f))) && x10 <= L2 + L3 && y10 >= (i7 = this.d + L) && y10 <= i7 + L3;
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
                    org.telegram.messenger.w7.G(i11).W(this.x.F0(), this.x, 3, 0);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        fj fjVar;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 == null || (fjVar = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.m(org.telegram.ui.ActionBar.n6.w0(fjVar.P3() ? org.telegram.ui.ActionBar.n6.Ec : org.telegram.ui.ActionBar.n6.Ze, this.L));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
