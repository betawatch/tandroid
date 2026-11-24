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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class j20 extends FrameLayout implements sp3, tjb {
    public final int E;
    public final int F;
    public byte G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final wjb L;
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public final int e;
    public cm f;
    public StaticLayout h;
    public final int n;
    public cm r;
    public StaticLayout s;
    public final ImageView w;
    public k27 x;
    public boolean y;

    public j20(int i, wjb wjbVar, Activity activity) {
        super(activity);
        this.e = gl.L(9.0f);
        this.n = gl.L(29.0f);
        int i2 = y6c.t0;
        this.E = i2;
        setWillNotDraw(false);
        this.L = wjbVar;
        this.J = i;
        ImageView imageView = new ImageView(activity);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
        int i3 = bkb.h6;
        byte b = 1;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
        vkb M = zkb.M(i3);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        addView(imageView, nme.d(42, 42.0f, (k96.a0 ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new x00(b));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.I = radialProgress2;
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        this.F = up3.q(i2).k();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new wo3(), 0, 1, 0);
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

    @Override // sp3
    public final void B(boolean z) {
        b(true, z);
    }

    @Override // sp3
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
                ba4.G(i).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController w = MediaController.w();
            k27 k27Var = this.x;
            int indexOf = w.S0.indexOf(k27Var);
            if (indexOf == -1) {
                z = w.R(k27Var);
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
            ba4.G(i).X(this.x.F0(), this.x, 1, 0);
            this.G = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (b == 4) {
            ba4.G(i).f(this.x.F0());
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
            ba4.G(i);
            file = ba4.I(this.x.F0());
        }
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!gba.x0 || ((int) k27.B0(this.x.k)) == 0) {
            this.H = -1;
        } else {
            this.b = exists ? (byte) 1 : (byte) 2;
            exists = true;
        }
        byte b = this.b;
        RadialProgress2 radialProgress2 = this.I;
        if (b == 0) {
            if (exists) {
                up3.q(i).v(this);
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
            up3.q(i).a(S0, null, this);
            if (ba4.G(i).S(S0)) {
                this.G = (byte) 4;
                Float s = fl5.z().s(S0);
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
        radialProgress2.l(bkb.v0(this.x.O3() ? bkb.Dc : bkb.Ye, this.L));
        boolean D2 = MediaController.w().D(this.x);
        if (!D2 || (D2 && MediaController.w().C())) {
            this.G = (byte) 0;
        } else {
            this.G = (byte) 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.b == 1) {
            up3.q(i).v(this);
            this.H = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        up3.q(i).a(S0, this.x, this);
        if (!ba4.G(i).S(S0)) {
            this.H = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.H = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z, z2);
        Float s2 = fl5.z().s(S0);
        if (s2 != null) {
            radialProgress2.o(z2, s2.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
    }

    public k27 getMessageObject() {
        return this.x;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.F;
    }

    @Override // sp3
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
        this.f = gm.update(0, this, this.f, this.h);
        this.r = gm.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        up3.q(this.E).v(this);
        gm.release(this, this.f);
        gm.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint U0;
        StaticLayout staticLayout = this.h;
        int i = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(gl.L(k96.a0 ? 16.0f : gl.C) + ((k96.a0 && imageView.getVisibility() == 0) ? gl.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        wjb wjbVar = this.L;
        if (staticLayout2 != null) {
            bkb.f3.setColor(bkb.v0(bkb.y6, wjbVar));
            canvas.save();
            int L = gl.L(k96.a0 ? 16.0f : gl.C);
            if (k96.a0 && imageView.getVisibility() == 0) {
                i = gl.L(32.0f);
            }
            canvas.translate(L + i, this.n);
            this.s.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v0 = bkb.v0(bkb.Yd, wjbVar);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = v0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (U0 = bkb.U0("paintDivider", wjbVar)) == null) {
            return;
        }
        if (k96.a0) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(gl.C), getHeight(), U0);
        } else {
            canvas.drawRect(gl.L(gl.C), getHeight() - 1, getWidth(), getHeight(), U0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(k96.a0("AccDescrMusicInfo", null, 2131754831, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        wjb wjbVar = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i) - gl.L(gl.C)) - gl.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.y1(true).replace('\n', ' '), bkb.e3, Math.min((int) Math.ceil(bkb.e3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence v1 = gl.v1(ellipsize, this.x.a2, wjbVar);
            StaticLayout staticLayout = new StaticLayout(v1 == null ? ellipsize : v1, bkb.e3, size + gl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = gm.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(af4.c(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, bkb.f3, size, TextUtils.TruncateAt.END);
            CharSequence v12 = gl.v1(ellipsize2, this.x.a2, wjbVar);
            StaticLayout staticLayout2 = new StaticLayout(v12 == null ? ellipsize2 : v12, bkb.f3, size + gl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = gm.update(0, this, this.r, staticLayout2);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
        int x = k96.a0 ? ls6.x(8.0f, View.MeasureSpec.getSize(i), gl.L(52.0f)) : gl.L(8.0f);
        int L = gl.L(4.0f) + x;
        this.c = L;
        int L2 = gl.L(6.0f);
        this.d = L2;
        this.I.p(L, L2, gl.L(48.0f) + x, gl.L(50.0f));
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
        int L3 = gl.L(36.0f);
        boolean z = true;
        boolean z2 = this.H >= 0 && x >= (L2 = this.c + (L = gl.L(27.0f))) && x <= L2 + L3 && y >= (i = this.d + L) && y <= i + L3;
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
                    ba4.G(i3).X(this.x.F0(), this.x, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.w().D(this.x)) {
                        MediaController.w().l(true, true, false, false);
                    }
                    this.H = 0;
                    ba4.G(i3).f(this.x.F0());
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

    @Override // tjb
    public final void updateColors() {
        k27 k27Var;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 == null || (k27Var = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.l(bkb.v0(k27Var.O3() ? bkb.Dc : bkb.Ye, this.L));
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
}
