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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k20 extends FrameLayout implements jq3, snb {
    public final int E;
    public final int F;
    public byte G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final vnb L;
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public final int e;
    public dm f;
    public StaticLayout h;
    public final int n;
    public dm r;
    public StaticLayout s;
    public final ImageView w;
    public r47 x;
    public boolean y;

    public k20(int i, vnb vnbVar, Activity activity) {
        super(activity);
        this.e = hl.L(9.0f);
        this.n = hl.L(29.0f);
        int i2 = yac.t0;
        this.E = i2;
        setWillNotDraw(false);
        this.L = vnbVar;
        this.J = i;
        ImageView imageView = new ImageView(activity);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_ab_other);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
        int i3 = aob.i6;
        byte b = 1;
        hf0 f0 = aob.f0(aob.v0(i3, vnbVar), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        addView(imageView, tre.d(42, 42.0f, (ob6.a0 ? 3 : 5) | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new y00(b));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.I = radialProgress2;
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        this.F = lq3.q(i2).k();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new np3(), 0, 1, 0);
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

    @Override // jq3
    public final void B(boolean z) {
        b(true, z);
    }

    @Override // jq3
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
                xb4.G(i).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController z2 = MediaController.z();
            r47 r47Var = this.x;
            int indexOf = z2.S0.indexOf(r47Var);
            if (indexOf == -1) {
                z = z2.V(r47Var);
            } else {
                z2.W(indexOf);
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
            if (MediaController.z().U(this.x, true)) {
                this.G = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
                return;
            }
            return;
        }
        if (b == 2) {
            radialProgress2.o(false, 0.0f);
            xb4.G(i).X(this.x.F0(), this.x, 1, 0);
            this.G = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
            return;
        }
        if (b == 4) {
            xb4.G(i).f(this.x.F0());
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
            xb4.G(i);
            file = xb4.I(this.x.F0());
        }
        if (TextUtils.isEmpty(S0)) {
            return;
        }
        if (file.exists() && file.length() == 0) {
            file.delete();
        }
        boolean exists = file.exists();
        if (!xea.x0 || ((int) r47.B0(this.x.k)) == 0) {
            this.H = -1;
        } else {
            this.b = exists ? (byte) 1 : (byte) 2;
            exists = true;
        }
        byte b = this.b;
        RadialProgress2 radialProgress2 = this.I;
        if (b == 0) {
            if (exists) {
                lq3.q(i).v(this);
                boolean H = MediaController.z().H(this.x);
                if (!H || (H && MediaController.z().G())) {
                    this.G = (byte) 0;
                } else {
                    this.G = (byte) 1;
                }
                radialProgress2.o(z2, 1.0f);
                radialProgress2.setIcon(getIconForCurrentState(), z, z2);
                invalidate();
                return;
            }
            lq3.q(i).a(S0, null, this);
            if (xb4.G(i).S(S0)) {
                this.G = (byte) 4;
                Float s = in5.z().s(S0);
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
        radialProgress2.l(aob.v0(this.x.O3() ? aob.Ec : aob.Ze, this.L));
        boolean H2 = MediaController.z().H(this.x);
        if (!H2 || (H2 && MediaController.z().G())) {
            this.G = (byte) 0;
        } else {
            this.G = (byte) 1;
        }
        radialProgress2.setIcon(getIconForCurrentState(), z, z2);
        if (this.b == 1) {
            lq3.q(i).v(this);
            this.H = -1;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        lq3.q(i).a(S0, this.x, this);
        if (!xb4.G(i).S(S0)) {
            this.H = 0;
            radialProgress2.k(getMiniIconForCurrentState(), z, z2);
            return;
        }
        this.H = 1;
        radialProgress2.k(getMiniIconForCurrentState(), z, z2);
        Float s2 = in5.z().s(S0);
        if (s2 != null) {
            radialProgress2.o(z2, s2.floatValue());
        } else {
            radialProgress2.o(z2, 0.0f);
        }
    }

    public r47 getMessageObject() {
        return this.x;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.F;
    }

    @Override // jq3
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
        this.f = hm.update(0, this, this.f, this.h);
        this.r = hm.update(0, this, this.r, this.s);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        lq3.q(this.E).v(this);
        hm.release(this, this.f);
        hm.release(this, this.r);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint U0;
        StaticLayout staticLayout = this.h;
        int i = 0;
        ImageView imageView = this.w;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(hl.L(ob6.a0 ? 16.0f : hl.C) + ((ob6.a0 && imageView.getVisibility() == 0) ? hl.L(32.0f) : 0), this.e);
            this.h.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        vnb vnbVar = this.L;
        if (staticLayout2 != null) {
            aob.g3.setColor(aob.v0(aob.z6, vnbVar));
            canvas.save();
            int L = hl.L(ob6.a0 ? 16.0f : hl.C);
            if (ob6.a0 && imageView.getVisibility() == 0) {
                i = hl.L(32.0f);
            }
            canvas.translate(L + i, this.n);
            this.s.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v0 = aob.v0(aob.Zd, vnbVar);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = v0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (!this.y || (U0 = aob.U0("paintDivider", vnbVar)) == null) {
            return;
        }
        if (ob6.a0) {
            canvas.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(hl.C), getHeight(), U0);
        } else {
            canvas.drawRect(hl.L(hl.C), getHeight() - 1, getWidth(), getHeight(), U0);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(ob6.a0("AccDescrMusicInfo", null, 2131754827, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        vnb vnbVar = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i) - hl.L(hl.C)) - hl.L(48.0f);
        try {
            CharSequence ellipsize = TextUtils.ellipsize(this.x.y1(true).replace('\n', ' '), aob.f3, Math.min((int) Math.ceil(aob.f3.measureText(r0)), size), TextUtils.TruncateAt.END);
            CharSequence v1 = hl.v1(ellipsize, this.x.a2, vnbVar);
            StaticLayout staticLayout = new StaticLayout(v1 == null ? ellipsize : v1, aob.f3, size + hl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = hm.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(yg4.c(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, aob.g3, size, TextUtils.TruncateAt.END);
            CharSequence v12 = hl.v1(ellipsize2, this.x.a2, vnbVar);
            StaticLayout staticLayout2 = new StaticLayout(v12 == null ? ellipsize2 : v12, aob.g3, size + hl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = hm.update(0, this, this.r, staticLayout2);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), TLObject.FLAG_30));
        int x = ob6.a0 ? qu6.x(8.0f, View.MeasureSpec.getSize(i), hl.L(52.0f)) : hl.L(8.0f);
        int L = hl.L(4.0f) + x;
        this.c = L;
        int L2 = hl.L(6.0f);
        this.d = L2;
        this.I.p(L, L2, hl.L(48.0f) + x, hl.L(50.0f));
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
        int L3 = hl.L(36.0f);
        boolean z = true;
        boolean z2 = this.H >= 0 && x >= (L2 = this.c + (L = hl.L(27.0f))) && x <= L2 + L3 && y >= (i = this.d + L) && y <= i + L3;
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
                    xb4.G(i3).X(this.x.F0(), this.x, 3, 0);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                    invalidate();
                } else if (i2 == 1) {
                    if (MediaController.z().H(this.x)) {
                        MediaController.z().m(true, true, false, false);
                    }
                    this.H = 0;
                    xb4.G(i3).f(this.x.F0());
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

    @Override // snb
    public final void updateColors() {
        r47 r47Var;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 == null || (r47Var = this.x) == null || this.b == 0) {
                return;
            }
            radialProgress2.l(aob.v0(r47Var.O3() ? aob.Ec : aob.Ze, this.L));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
