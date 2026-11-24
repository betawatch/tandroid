// default package

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class gc9 extends jb9 implements tjb, eib, tb9, sp3 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final sb9 G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public byte Q;
    public StaticLayout R;
    public StaticLayout S;
    public te9 T;
    public k27 U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final wjb r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public gc9(int i, wjb wjbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = gl.L(10.0f);
        this.I = L;
        int L2 = gl.L(44.0f);
        this.J = L2;
        this.K = gl.L(16.0f);
        this.L = gl.L(16.0f);
        this.W = -1;
        this.b0 = zkb.b;
        this.n = i;
        this.r = wjbVar;
        setWillNotDraw(false);
        setMinimumHeight(gl.L(66.0f));
        this.H = up3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(gl.L(24.0f));
        int i2 = this.K;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.q0(gl.L(6.0f));
        sb9 sb9Var = new sb9(context, wjbVar, new v39(this, (byte) 2));
        this.G = sb9Var;
        addView(sb9Var.a, nme.e(-2, -2, 51));
        updateColors();
    }

    @Override // sp3
    public final void B(boolean z) {
        n(true);
    }

    @Override // sp3
    public final void N(String str) {
        this.E.o(true, 1.0f);
        n(true);
    }

    @Override // tb9
    public final boolean a(int i, int i2) {
        return this.G.f(i, i2);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.kg));
    }

    @Override // tb9
    public final void b() {
        this.G.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.G.c(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2 = this.b0;
        int i3 = zkb.b;
        if (i2 != i3) {
            this.b0 = i3;
            try {
                RadialProgress2 radialProgress2 = this.E;
                wjb wjbVar = this.r;
                if (radialProgress2 != null && (i = this.W) >= 0) {
                    radialProgress2.d = bkb.v0(i, wjbVar);
                }
                if (this.a0 && (getBackground() instanceof ed9)) {
                    ((ed9) getBackground()).a(bkb.v0(bkb.c6, wjbVar));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override // jb9
    public final void e(int i) {
        int L = gl.L(16.0f);
        if (this.N) {
            i = 0;
        }
        int i2 = L + i;
        this.L = i2;
        if (this.M) {
            i2 += gl.L(21.0f);
        }
        this.K = i2;
        int L2 = this.M ? gl.L(31.0f) : this.I;
        int i3 = this.K;
        int i4 = this.J;
        this.E.p(i3, L2, i3 + i4, i4 + L2);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        String str2 = (lk0Var == null || (iy6Var = lk0Var.g) == null) ? null : iy6Var.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean W2 = k27.W2(document);
        this.M = z || W2;
        int L = gl.L(16.0f) + (this.N ? 0 : this.c);
        this.L = L;
        if (this.M) {
            L += gl.L(21.0f);
        }
        this.K = L;
        int L2 = this.M ? gl.L(31.0f) : this.I;
        int i = this.K;
        int i2 = this.J;
        this.E.p(i, L2, i + i2, i2 + L2);
        ImageReceiver imageReceiver = this.F;
        if (z) {
            imageReceiver.i0(this.L, gl.L(10.0f), gl.L(86.0f), gl.L(86.0f));
            imageReceiver.d0(gl5.g(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!W2) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = ba4.w(document.thumbs, kk7.q5, false, null, true);
        te9 te9Var = this.T;
        k27 k27Var = te9Var == null ? null : te9Var.a.q3;
        imageReceiver.i0(this.L, gl.L(10.0f), gl.L(86.0f), gl.L(86.0f));
        gl5 c = w != null ? gl5.c(w, document) : null;
        BitmapDrawable i3 = fl5.i(document.thumbs);
        if (k27Var == null) {
            k27Var = this.U;
        }
        imageReceiver.d0(c, "86_86", i3, null, k27Var, 1);
    }

    @Override // tb9
    public mc9 getCaptionEditText() {
        return this.G.a;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.H;
    }

    @Override // tb9
    public lk0 getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        if (lk0Var == null || (iy6Var = lk0Var.g) == null) {
            return null;
        }
        return iy6Var.h;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.E.o(true, j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2));
    }

    public final boolean j() {
        iy6 iy6Var;
        lk0 lk0Var = this.a;
        return (lk0Var == null || (iy6Var = lk0Var.g) == null || !iy6Var.a()) ? false : true;
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void m() {
        int i;
        float f;
        iy6 iy6Var;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i = this.L;
            f = 97.0f;
        } else {
            i = this.K;
            f = 54.0f;
        }
        int max = Math.max(gl.L(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : gl.q.x) - (gl.L(f) + i)) - gl.L(16.0f)) - (this.N ? this.c : 0));
        float L = gl.L(15.0f);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(L);
        textPaint.setTypeface(gl.o());
        float L2 = gl.L(13.0f);
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(L2);
        String B = ba4.B(h);
        if (TextUtils.isEmpty(B) && (iy6Var = this.a.g) != null && !TextUtils.isEmpty(iy6Var.e)) {
            B = new File(this.a.g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j = h.size;
        if (j <= 0) {
            iy6 iy6Var2 = this.a.g;
            j = (iy6Var2 == null || TextUtils.isEmpty(iy6Var2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.S = new StaticLayout(gl.i0(j, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6.exists() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z) {
        File J;
        iy6 iy6Var;
        boolean z2 = this.M;
        wjb wjbVar = this.r;
        RadialProgress2 radialProgress2 = this.E;
        if (z2) {
            radialProgress2.g(bkb.bf, bkb.cf, bkb.df, bkb.ef);
            int i = bkb.Xd;
            this.W = i;
            radialProgress2.d = bkb.v0(i, wjbVar);
        } else {
            radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
            int i2 = bkb.re;
            this.W = i2;
            radialProgress2.d = bkb.v0(i2, wjbVar);
        }
        boolean j = j();
        int i3 = this.n;
        if (j) {
            up3.q(i3).v(this);
            radialProgress2.o(z, this.a.g.f);
            radialProgress2.setIcon(3, false, z);
            return;
        }
        String r = ba4.r(null, h());
        lk0 lk0Var = this.a;
        if (lk0Var != null && (iy6Var = lk0Var.g) != null && !TextUtils.isEmpty(iy6Var.e)) {
            J = new File(this.a.g.e);
        }
        if (h() == null) {
            J = null;
        } else {
            ba4.G(i3);
            J = ba4.J(h(), null, false, true);
            if (J == null || !J.exists()) {
                ba4.G(i3);
                J = ba4.J(h(), null, true, true);
            }
        }
        if (J != null && J.exists()) {
            up3.q(i3).v(this);
            this.Q = (byte) 0;
            radialProgress2.setIcon(this.M ? 4 : 5, false, z);
        } else {
            if (TextUtils.isEmpty(r)) {
                return;
            }
            up3.q(i3).a(r, null, this);
            if (!ba4.G(i3).S(r)) {
                this.Q = (byte) 1;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(2, false, z);
            } else {
                this.Q = (byte) 2;
                Float s = fl5.z().s(r);
                radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        this.E.m(this);
        this.F.I();
        n(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        this.F.K();
        up3.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        fib textSelectionHelper;
        if (h() != null) {
            boolean z = this.M;
            wjb wjbVar = this.r;
            if (z && !this.F.h(canvas, null)) {
                int v0 = bkb.v0(bkb.we, wjbVar);
                Paint paint = this.w;
                paint.setColor(v0);
                canvas.drawRoundRect(this.L, gl.L(10.0f), gl.L(86.0f) + this.L, gl.L(96.0f), gl.L(6.0f), gl.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i = this.L;
                f = 97.0f;
            } else {
                i = this.K;
                f = 54.0f;
            }
            int L = gl.L(f) + i;
            this.x.setColor(bkb.v0(bkb.te, wjbVar));
            int L2 = gl.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.y.setColor(bkb.v0(bkb.de, wjbVar));
            StaticLayout staticLayout = this.R;
            int L3 = gl.L(2.0f) + L2 + (staticLayout == null ? 0 : staticLayout.getHeight());
            if (this.S != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.S.draw(canvas);
                canvas.restore();
            }
            if (this.T == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.T.a.getTextSelectionHelper()) == null || !textSelectionHelper.w()) {
                return;
            }
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
                return;
            }
            canvas.drawRoundRect(gl.L(8.0f) + (this.N ? 0 : this.c), gl.L(2.0f), (getWidth() - (this.N ? this.c : 0)) - gl.L(8.0f), gl.L(this.M ? 104.0f : 64.0f), gl.L(8.0f), gl.L(8.0f), this.s);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.N;
        int i5 = this.c;
        int i6 = 0;
        if (!z2) {
            i6 = i5;
            i5 = 0;
        }
        this.G.g(i6, i5, i3 - i, gl.L(this.M ? 106.0f : 66.0f));
        m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.N;
        int i3 = this.c;
        int i4 = 0;
        if (!z) {
            i4 = i3;
            i3 = 0;
        }
        setMeasuredDimension(size, gl.L(this.M ? 106.0f : 66.0f) + this.G.h(i4, i3, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        k27 k27Var;
        if (motionEvent.getX() >= this.L && motionEvent.getX() <= getWidth() - gl.L(12.0f) && motionEvent.getY() >= gl.L(10.0f)) {
            if (motionEvent.getY() <= gl.L(this.M ? 96.0f : 54.0f)) {
                objArr = true;
                if (motionEvent.getActionMasked() != 0 && objArr == true) {
                    this.P = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.P) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.P = false;
                    }
                    if (this.P && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    this.P = false;
                    if (objArr != false) {
                        playSoundEffect(0);
                        if (j()) {
                            te9 te9Var = this.T;
                            if (te9Var != null) {
                                lk0 lk0Var = this.a;
                                ye9 ye9Var = te9Var.a;
                                bg9 bg9Var = (bg9) ye9Var.h4.remove(lk0Var.g);
                                if (bg9Var != null) {
                                    bg9Var.b();
                                }
                                ld9 ld9Var = ye9Var.R3;
                                if (ld9Var != null) {
                                    ld9Var.d();
                                }
                                ye9Var.t3.remove(lk0Var);
                                ye9Var.g3.O(true);
                                ld9 ld9Var2 = ye9Var.R3;
                                if (ld9Var2 != null) {
                                    ld9Var2.h();
                                }
                                ye9Var.p3.onContentChanged();
                            }
                        } else {
                            byte b = this.Q;
                            Activity activity = null;
                            if (b == 0) {
                                Context context = getContext();
                                while (true) {
                                    if (context instanceof ContextWrapper) {
                                        if (context instanceof Activity) {
                                            activity = (Activity) context;
                                            break;
                                        }
                                        context = ((ContextWrapper) context).getBaseContext();
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    }
                                }
                                if (activity != null && (k27Var = this.U) != null) {
                                    gl.r2(k27Var, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.E;
                                int i = this.n;
                                if (b == 1 && h() != null) {
                                    te9 te9Var2 = this.T;
                                    k27 k27Var2 = te9Var2 != null ? te9Var2.a.q3 : null;
                                    ba4 G = ba4.G(i);
                                    TLRPC.Document h = h();
                                    if (k27Var2 == null) {
                                        k27Var2 = this.U;
                                    }
                                    G.X(h, k27Var2, 1, 1);
                                    this.Q = (byte) 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.Q == 2 && h() != null) {
                                    ba4.G(i).f(h());
                                    this.Q = (byte) 1;
                                    radialProgress2.setIcon(2, false, true);
                                }
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
                return true;
            }
        }
        objArr = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        if (this.P) {
        }
        return true;
    }

    @Override // tjb
    public final void updateColors() {
        this.s.setColor(bkb.v0(bkb.kg, this.r));
        sb9 sb9Var = this.G;
        if (sb9Var != null) {
            sb9Var.a();
        }
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
