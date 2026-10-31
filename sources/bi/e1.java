package bi;

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
import org.telegram.messenger.b8;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e1 extends c0 implements org.telegram.ui.ActionBar.k6, j9, o0, org.telegram.messenger.z5 {
    public final RadialProgress2 D;
    public final ImageReceiver E;
    public final n0 F;
    public final int G;
    public final int H;
    public final int I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public StaticLayout Q;
    public StaticLayout R;
    public y3 S;
    public jj T;
    public TLRPC.Document U;
    public int V;
    public boolean W;
    public int a0;
    public final int n;
    public final org.telegram.ui.ActionBar.p6 r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public e1(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = org.telegram.messenger.i0.L(10.0f);
        this.H = L;
        int L2 = org.telegram.messenger.i0.L(44.0f);
        this.I = L2;
        this.J = org.telegram.messenger.i0.L(16.0f);
        this.K = org.telegram.messenger.i0.L(16.0f);
        this.V = -1;
        this.a0 = a7.b;
        this.n = i10;
        this.r = p6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.i0.L(66.0f));
        this.G = org.telegram.messenger.b6.q(i10).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, p6Var);
        this.D = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.i0.L(24.0f));
        int i11 = this.J;
        radialProgress2.r(i11, L, i11 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.z1 = true;
        imageReceiver.J0(org.telegram.messenger.i0.L(6.0f));
        n0 n0Var = new n0(context, p6Var, new a4.l(this, 6));
        this.F = n0Var;
        addView(n0Var.a, w7.b6.e(-2, -2, 51));
        updateColors();
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        m(true);
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.D.p(true, 1.0f);
        m(true);
    }

    @Override // bi.o0
    public final boolean a(int i10, int i11) {
        return this.F.f(i10, i11);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ig));
    }

    @Override // bi.o0
    public final void b() {
        this.F.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.F.c(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11 = this.a0;
        int i12 = a7.b;
        if (i11 != i12) {
            this.a0 = i12;
            try {
                RadialProgress2 radialProgress2 = this.D;
                org.telegram.ui.ActionBar.p6 p6Var = this.r;
                if (radialProgress2 != null && (i10 = this.V) >= 0) {
                    radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
                }
                if (this.W && (getBackground() instanceof h2)) {
                    ((h2) getBackground()).a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var));
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override // bi.c0
    public final void e(int i10) {
        int L = org.telegram.messenger.i0.L(16.0f);
        if (this.M) {
            i10 = 0;
        }
        int i11 = L + i10;
        this.K = i11;
        if (this.L) {
            i11 += org.telegram.messenger.i0.L(21.0f);
        }
        this.J = i11;
        int L2 = this.L ? org.telegram.messenger.i0.L(31.0f) : this.H;
        int i12 = this.J;
        int i13 = this.I;
        this.D.r(i12, L2, i12 + i13, i13 + L2);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        w wVar;
        a aVar = this.a;
        String str2 = (aVar == null || (wVar = aVar.g) == null) ? null : wVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z10 = k() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean W2 = jj.W2(document);
        this.L = z10 || W2;
        int L = org.telegram.messenger.i0.L(16.0f) + (this.M ? 0 : this.c);
        this.K = L;
        if (this.L) {
            L += org.telegram.messenger.i0.L(21.0f);
        }
        this.J = L;
        int L2 = this.L ? org.telegram.messenger.i0.L(31.0f) : this.H;
        int i10 = this.J;
        int i11 = this.I;
        this.D.r(i10, L2, i10 + i11, i11 + L2);
        ImageReceiver imageReceiver = this.E;
        if (z10) {
            imageReceiver.y0(this.K, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(86.0f), org.telegram.messenger.i0.L(86.0f));
            imageReceiver.q0(ic.g(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!W2) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w9 = b8.w(document.thumbs, zs.r5, false, null, true);
        y3 y3Var = this.S;
        jj jjVar = y3Var == null ? null : y3Var.a.p3;
        imageReceiver.y0(this.K, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(86.0f), org.telegram.messenger.i0.L(86.0f));
        ic c10 = w9 != null ? ic.c(w9, document) : null;
        BitmapDrawable m10 = hc.m(document.thumbs);
        if (jjVar == null) {
            jjVar = this.T;
        }
        imageReceiver.q0(c10, "86_86", m10, null, jjVar, 1);
    }

    @Override // bi.o0
    public n1 getCaptionEditText() {
        return this.F.a;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.G;
    }

    @Override // bi.o0
    public a getRow() {
        return this.a;
    }

    @Override // org.telegram.ui.Cells.j9
    public final void h(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.D.p(true, j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11));
    }

    public final TLRPC.Document j() {
        w wVar;
        a aVar = this.a;
        if (aVar == null || (wVar = aVar.g) == null) {
            return null;
        }
        return wVar.h;
    }

    public final boolean k() {
        w wVar;
        a aVar = this.a;
        return (aVar == null || (wVar = aVar.g) == null || !wVar.a()) ? false : true;
    }

    public final void l() {
        int i10;
        float f7;
        w wVar;
        TLRPC.Document j10 = j();
        if (j10 == null) {
            return;
        }
        if (this.L) {
            i10 = this.K;
            f7 = 97.0f;
        } else {
            i10 = this.J;
            f7 = 54.0f;
        }
        int max = Math.max(org.telegram.messenger.i0.L(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.i0.q.x) - (org.telegram.messenger.i0.L(f7) + i10)) - org.telegram.messenger.i0.L(16.0f)) - (this.M ? this.c : 0));
        float L = org.telegram.messenger.i0.L(15.0f);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        float L2 = org.telegram.messenger.i0.L(13.0f);
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(L2);
        String B = b8.B(j10);
        if (TextUtils.isEmpty(B) && (wVar = this.a.g) != null && !TextUtils.isEmpty(wVar.e)) {
            B = new File(this.a.g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j11 = j10.size;
        if (j11 <= 0) {
            w wVar2 = this.a.g;
            j11 = (wVar2 == null || TextUtils.isEmpty(wVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.R = new StaticLayout(org.telegram.messenger.i0.i0(j11, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z10) {
        File K;
        w wVar;
        boolean z11 = this.L;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        RadialProgress2 radialProgress2 = this.D;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
            int i10 = org.telegram.ui.ActionBar.t6.Vd;
            this.V = i10;
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        } else {
            radialProgress2.g(org.telegram.ui.ActionBar.t6.We, org.telegram.ui.ActionBar.t6.Xe, org.telegram.ui.ActionBar.t6.id, org.telegram.ui.ActionBar.t6.jd);
            int i11 = org.telegram.ui.ActionBar.t6.pe;
            this.V = i11;
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
        }
        boolean k10 = k();
        int i12 = this.n;
        if (k10) {
            org.telegram.messenger.b6.q(i12).v(this);
            radialProgress2.p(z10, this.a.g.f);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String r10 = b8.r(null, j());
        a aVar = this.a;
        if (aVar != null && (wVar = aVar.g) != null && !TextUtils.isEmpty(wVar.e)) {
            K = new File(this.a.g.e);
        }
        if (j() == null) {
            K = null;
        } else {
            b8.G(i12);
            K = b8.K(j(), null, false, true);
            if (K == null || !K.exists()) {
                b8.G(i12);
                K = b8.K(j(), null, true, true);
            }
        }
        if (K != null && K.exists()) {
            org.telegram.messenger.b6.q(i12).v(this);
            this.P = 0;
            radialProgress2.setIcon(this.L ? 4 : 5, false, z10);
        } else {
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.messenger.b6.q(i12).a(r10, null, this);
            if (!b8.G(i12).T(r10)) {
                this.P = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            } else {
                this.P = 2;
                Float w9 = hc.D().w(r10);
                radialProgress2.p(z10, w9 != null ? w9.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
        this.D.n(this);
        this.E.P();
        m(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N = false;
        this.E.R();
        org.telegram.messenger.b6.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        k9 textSelectionHelper;
        if (j() == null) {
            return;
        }
        boolean z10 = this.L;
        org.telegram.ui.ActionBar.p6 p6Var = this.r;
        if (z10 && !this.E.h(canvas, null)) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ue, p6Var);
            Paint paint = this.w;
            paint.setColor(w02);
            canvas.drawRoundRect(this.K, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(86.0f) + this.K, org.telegram.messenger.i0.L(96.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
        }
        this.D.draw(canvas);
        if (this.L) {
            i10 = this.K;
            f7 = 97.0f;
        } else {
            i10 = this.J;
            f7 = 54.0f;
        }
        int L = org.telegram.messenger.i0.L(f7) + i10;
        this.x.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.re, p6Var));
        int L2 = org.telegram.messenger.i0.L(12.0f);
        if (this.Q != null) {
            canvas.save();
            canvas.translate(L, L2);
            this.Q.draw(canvas);
            canvas.restore();
        }
        this.y.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.be, p6Var));
        StaticLayout staticLayout = this.Q;
        int L3 = org.telegram.messenger.i0.L(2.0f) + L2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.R != null) {
            canvas.save();
            canvas.translate(L, L3);
            this.R.draw(canvas);
            canvas.restore();
        }
        if (this.S == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.S.a.getTextSelectionHelper()) == null || !textSelectionHelper.x()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
            return;
        }
        canvas.drawRoundRect(org.telegram.messenger.i0.L(8.0f) + (this.M ? 0 : this.c), org.telegram.messenger.i0.L(2.0f), (getWidth() - (this.M ? this.c : 0)) - org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(this.L ? 104.0f : 64.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), this.s);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = this.M;
        this.F.g(z11 ? 0 : this.c, z11 ? this.c : 0, i12 - i10, org.telegram.messenger.i0.L(this.L ? 106.0f : 66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        boolean z10 = this.M;
        setMeasuredDimension(size, org.telegram.messenger.i0.L(this.L ? 106.0f : 66.0f) + this.F.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        jj jjVar;
        if (motionEvent.getX() >= this.K && motionEvent.getX() <= getWidth() - org.telegram.messenger.i0.L(12.0f) && motionEvent.getY() >= org.telegram.messenger.i0.L(10.0f)) {
            if (motionEvent.getY() <= org.telegram.messenger.i0.L(this.L ? 96.0f : 54.0f)) {
                objArr = true;
                if (motionEvent.getActionMasked() != 0 && objArr == true) {
                    this.O = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.O) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.O = false;
                    }
                    if (this.O && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    this.O = false;
                    if (objArr != false) {
                        playSoundEffect(0);
                        if (k()) {
                            y3 y3Var = this.S;
                            if (y3Var != null) {
                                a aVar = this.a;
                                d4 d4Var = y3Var.a;
                                l5 l5Var = (l5) d4Var.g4.remove(aVar.g);
                                if (l5Var != null) {
                                    l5Var.b();
                                }
                                o2 o2Var = d4Var.Q3;
                                if (o2Var != null) {
                                    o2Var.d();
                                }
                                d4Var.s3.remove(aVar);
                                d4Var.f3.O(true);
                                o2 o2Var2 = d4Var.Q3;
                                if (o2Var2 != null) {
                                    o2Var2.h();
                                }
                                d4Var.o3.onContentChanged();
                            }
                        } else {
                            int i10 = this.P;
                            Activity activity = null;
                            if (i10 == 0) {
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
                                if (activity != null && (jjVar = this.T) != null) {
                                    org.telegram.messenger.i0.u2(jjVar, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.D;
                                int i11 = this.n;
                                if (i10 == 1 && j() != null) {
                                    y3 y3Var2 = this.S;
                                    jj jjVar2 = y3Var2 != null ? y3Var2.a.p3 : null;
                                    b8 G = b8.G(i11);
                                    TLRPC.Document j10 = j();
                                    if (jjVar2 == null) {
                                        jjVar2 = this.T;
                                    }
                                    G.X(j10, jjVar2, 1, 1);
                                    this.P = 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.P == 2 && j() != null) {
                                    b8.G(i11).f(j());
                                    this.P = 1;
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
        if (this.O) {
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        this.s.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.ig, this.r));
        n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.a();
        }
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
