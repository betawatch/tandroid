// default package

import android.app.Activity;
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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j30 extends FrameLayout implements cr3, vlb {
    public final int E;
    public final int F;
    public byte G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final ylb L;
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public final int e;
    public cn f;
    public StaticLayout h;
    public final int n;
    public cn r;
    public StaticLayout s;
    public final ImageView w;
    public k47 x;
    public boolean y;

    public j30(int i, ylb ylbVar, Activity activity) {
        super(activity);
        this.e = gm.L(9.0f);
        this.n = gm.L(29.0f);
        int i2 = z8c.t0;
        this.E = i2;
        setWillNotDraw(false);
        this.L = ylbVar;
        this.J = i;
        ImageView imageView = new ImageView(activity);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        int i3 = cmb.h6;
        byte b = 1;
        fg0 f0 = cmb.f0(cmb.v0(i3, ylbVar), 1, -1);
        wmb M = anb.M(i3);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        addView(imageView, qoe.d(42, 42.0f, (jb6.a0 ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new x10(b));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.I = radialProgress2;
        radialProgress2.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
        this.F = er3.q(i2).k();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new gq3(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        byte b = this.G;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        return b == 4 ? 3 : 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.H;
        if (i < 0) {
            return 4;
        }
        return i == 0 ? 2 : 3;
    }

    @Override // cr3
    public final void A(boolean z) {
        b(true, z);
    }

    @Override // cr3
    public final void N(String str) {
        this.I.o(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z;
        byte b = this.G;
        int i = this.E;
        RadialProgress2 radialProgress2 = this.I;
        if (b == 0) {
            if (this.H == 0) {
                bc4.G(i).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController w = MediaController.w();
            k47 k47Var = this.x;
            int indexOf = w.S0.indexOf(k47Var);
            if (indexOf == -1) {
                z = w.R(k47Var);
            } else {
                w.S(indexOf);
                z = true;
            }
            if (z) {
                if (this.b == 2 && this.H != 1) {
                    this.H = 1;
                    radialProgress2.o(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.G = (byte) 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 1) {
            if (MediaController.w().Q(this.x, true)) {
                this.G = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 2) {
            radialProgress2.o(false, 0.0f);
            bc4.G(i).X(this.x.F0(), this.x, 1, 0);
            this.G = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (b == 4) {
            bc4.G(i).f(this.x.F0());
            this.G = (byte) 2;
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
    public final void b(boolean z, boolean z2) {
        File file;
        String S0 = this.x.S0();
        if (!TextUtils.isEmpty(this.x.k.attachPath)) {
            file = new File(this.x.k.attachPath);
        }
        file = null;
        int i = this.E;
        if (file == null) {
            bc4.G(i);
            file = bc4.I(this.x.F0());
        }
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!gda.x0 || ((int) k47.B0(this.x.k)) == 0) {
            this.H = -1;
        } else {
            this.b = exists ? (byte) 1 : (byte) 2;
            exists = true;
        }
        byte b = this.b;
        RadialProgress2 radialProgress2 = this.I;
        if (b == 0) {
            if (exists) {
                er3.q(i).v(this);
                boolean D = MediaController.w().D(this.x);
                if (!D || (D && MediaController.w().C())) {
                    this.G = (byte) 0;
                } else {
                    this.G = (byte) 1;
                }
                radialProgress2.o(z2, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
                invalidate();
                return;
            }
            er3.q(i).a(S0, null, this);
            if (bc4.G(i).S(S0)) {
                this.G = (byte) 4;
                Float s = fn5.z().s(S0);
                if (s != null) {
                    radialProgress2.o(z2, s.floatValue());
                } else {
                    radialProgress2.o(z2, 0.0f);
                }
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            } else {
                this.G = (byte) 2;
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
            }
            invalidate();
            return;
        }
        radialProgress2.l(cmb.v0(this.x.O3() ? cmb.Dc : cmb.Ye, this.L));
        boolean D2 = MediaController.w().D(this.x);
        if (!D2 || (D2 && MediaController.w().C())) {
            this.G = (byte) 0;
        } else {
            this.G = (byte) 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.b == 1) {
            er3.q(i).v(this);
            this.H = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        er3.q(i).a(S0, this.x, this);
        if (!bc4.G(i).S(S0)) {
            this.H = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.H = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z, z2);
        Float s2 = fn5.z().s(S0);
        if (s2 != null) {
            radialProgress2.o(z2, s2.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
    }

    public k47 getMessageObject() {
        return this.x;
    }

    @Override // cr3
    public int getObserverTag() {
        return this.F;
    }

    @Override // cr3
    public final void i(long j, long j2) {
        this.I.o(true, Math.min(1.0f, j / j2));
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
        this.f = gn.update(0, this, this.f, this.h);
        this.r = gn.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        er3.q(this.E).v(this);
        gn.release(this, this.f);
        gn.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint U0;
        StaticLayout staticLayout = this.h;
        int i = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(gm.L(jb6.a0 ? 16.0f : gm.C) + ((jb6.a0 && imageView.getVisibility() == 0) ? gm.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        ylb ylbVar = this.L;
        if (staticLayout2 != null) {
            cmb.f3.setColor(cmb.v0(cmb.y6, ylbVar));
            canvas.save();
            int L = gm.L(jb6.a0 ? 16.0f : gm.C);
            if (jb6.a0 && imageView.getVisibility() == 0) {
                i = gm.L(32.0f);
            }
            canvas.translate(L + i, this.n);
            this.s.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v0 = cmb.v0(cmb.Yd, ylbVar);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = v0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (U0 = cmb.U0("paintDivider", ylbVar)) == null) {
            return;
        }
        if (jb6.a0) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(gm.C), getHeight(), U0);
        } else {
            canvas.drawRect(gm.L(gm.C), getHeight() - 1, getWidth(), getHeight(), U0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(jb6.a0("AccDescrMusicInfo", null, 2131754831, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ylb ylbVar = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i) - gm.L(gm.C)) - gm.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.y1(true).replace('\n', ' '), cmb.e3, Math.min((int) Math.ceil(cmb.e3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence v1 = gm.v1(ellipsize, this.x.a2, ylbVar);
            StaticLayout staticLayout = new StaticLayout(v1 == null ? ellipsize : v1, cmb.e3, size + gm.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = gn.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(ch4.c(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, cmb.f3, size, TextUtils.TruncateAt.END);
            CharSequence v12 = gm.v1(ellipsize2, this.x.a2, ylbVar);
            StaticLayout staticLayout2 = new StaticLayout(v12 == null ? ellipsize2 : v12, cmb.f3, size + gm.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = gn.update(0, this, this.r, staticLayout2);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
        int y = jb6.a0 ? kt6.y(8.0f, View.MeasureSpec.getSize(i), gm.L(52.0f)) : gm.L(8.0f);
        int L = gm.L(4.0f) + y;
        this.c = L;
        int L2 = gm.L(6.0f);
        this.d = L2;
        this.I.p(L, L2, gm.L(48.0f) + y, gm.L(50.0f));
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
        int i;
        if (this.x == null) {
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int L3 = gm.L(36.0f);
        boolean z = true;
        boolean z2 = this.H >= 0 && x >= (L2 = this.c + (L = gm.L(27.0f))) && x <= L2 + L3 && y >= (i = this.d + L) && y <= i + L3;
        int action = motionEvent.getAction();
        RadialProgress2 radialProgress2 = this.I;
        if (action == 0) {
            if (z2) {
                this.a = true;
                radialProgress2.n(true, true);
                invalidate();
                if (motionEvent.getAction() == 3) {
                    return z;
                }
                this.a = false;
                return false;
            }
        } else if (this.a) {
            if (motionEvent.getAction() == 1) {
                this.a = false;
                playSoundEffect(0);
                int i2 = this.H;
                int i3 = this.E;
                if (i2 == 0) {
                    this.H = 1;
                    radialProgress2.o(false, 0.0f);
                    bc4.G(i3).X(this.x.F0(), this.x, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.w().D(this.x)) {
                        MediaController.w().l(true, true, false, false);
                    }
                    this.H = 0;
                    bc4.G(i3).f(this.x.F0());
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.a = false;
                invalidate();
            } else if (motionEvent.getAction() == 2 && !z2) {
                this.a = false;
                invalidate();
            }
            radialProgress2.n(this.a, true);
        }
        z = false;
        if (motionEvent.getAction() == 3) {
        }
    }

    @Override // vlb
    public final void updateColors() {
        k47 k47Var;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 == null || (k47Var = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.l(cmb.v0(k47Var.O3() ? cmb.Dc : cmb.Ye, this.L));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // cr3
    public final void l(long j, long j2) {
    }
}
