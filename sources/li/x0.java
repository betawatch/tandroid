package li;

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
import c8.ha;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class x0 extends y implements org.telegram.ui.ActionBar.a6, h9, k0, org.telegram.messenger.x5 {
    public final RadialProgress2 D;
    public final ImageReceiver E;
    public final j0 F;
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
    public o3 S;
    public ij T;
    public TLRPC.Document U;
    public int V;
    public boolean W;
    public int a0;
    public final int n;
    public final f6 r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public x0(int i7, Context context, f6 f6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.H = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.I = L2;
        this.J = org.telegram.messenger.g0.L(16.0f);
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.V = -1;
        this.a0 = r6.b;
        this.n = i7;
        this.r = f6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        this.G = org.telegram.messenger.z5.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, f6Var);
        this.D = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.J;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.z1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        j0 j0Var = new j0(context, f6Var, new g6.d0(this, 12));
        this.F = j0Var;
        addView(j0Var.a, ha.e(-2, -2, 51));
        updateColors();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        m(true);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.D.p(true, 1.0f);
        m(true);
    }

    @Override // li.k0
    public final boolean a(int i7, int i10) {
        return this.F.f(i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // li.k0
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
        int i7;
        int i10 = this.a0;
        int i11 = r6.b;
        if (i10 != i11) {
            this.a0 = i11;
            try {
                RadialProgress2 radialProgress2 = this.D;
                f6 f6Var = this.r;
                if (radialProgress2 != null && (i7 = this.V) >= 0) {
                    radialProgress2.d = k6.w0(i7, f6Var);
                }
                if (this.W && (getBackground() instanceof y1)) {
                    ((y1) getBackground()).a(k6.w0(k6.d6, f6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.draw(canvas);
    }

    @Override // li.y
    public final void e(int i7) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.M) {
            i7 = 0;
        }
        int i10 = L + i7;
        this.K = i10;
        if (this.L) {
            i10 += org.telegram.messenger.g0.L(21.0f);
        }
        this.J = i10;
        int L2 = this.L ? org.telegram.messenger.g0.L(31.0f) : this.H;
        int i11 = this.J;
        int i12 = this.I;
        this.D.r(i11, L2, i11 + i12, i12 + L2);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        s sVar;
        a aVar = this.a;
        String str2 = (aVar == null || (sVar = aVar.g) == null) ? null : sVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z9 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean X2 = ij.X2(document);
        this.L = z9 || X2;
        int L = org.telegram.messenger.g0.L(16.0f) + (this.M ? 0 : this.c);
        this.K = L;
        if (this.L) {
            L += org.telegram.messenger.g0.L(21.0f);
        }
        this.J = L;
        int L2 = this.L ? org.telegram.messenger.g0.L(31.0f) : this.H;
        int i7 = this.J;
        int i10 = this.I;
        this.D.r(i7, L2, i7 + i10, i10 + L2);
        ImageReceiver imageReceiver = this.E;
        if (z9) {
            imageReceiver.y0(this.K, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            imageReceiver.q0(hc.g(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!X2) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, qs.r5, false, null, true);
        o3 o3Var = this.S;
        ij ijVar = o3Var == null ? null : o3Var.a.p3;
        imageReceiver.y0(this.K, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
        hc c10 = w10 != null ? hc.c(w10, document) : null;
        BitmapDrawable m10 = gc.m(document.thumbs);
        if (ijVar == null) {
            ijVar = this.T;
        }
        imageReceiver.q0(c10, "86_86", m10, null, ijVar, 1);
    }

    @Override // li.k0
    public g1 getCaptionEditText() {
        return this.F.a;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.G;
    }

    @Override // li.k0
    public a getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        s sVar;
        a aVar = this.a;
        if (aVar == null || (sVar = aVar.g) == null) {
            return null;
        }
        return sVar.h;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.D.p(true, j10 <= 0 ? 0.0f : Math.min(1.0f, j3 / j10));
    }

    public final boolean j() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.a()) ? false : true;
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        this.F.e(arrayList);
    }

    public final void l() {
        int i7;
        float f10;
        s sVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.L) {
            i7 = this.K;
            f10 = 97.0f;
        } else {
            i7 = this.J;
            f10 = 54.0f;
        }
        int max = Math.max(org.telegram.messenger.g0.L(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x) - (org.telegram.messenger.g0.L(f10) + i7)) - org.telegram.messenger.g0.L(16.0f)) - (this.M ? this.c : 0));
        float L = org.telegram.messenger.g0.L(15.0f);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        float L2 = org.telegram.messenger.g0.L(13.0f);
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(L2);
        String B = w7.B(h);
        if (TextUtils.isEmpty(B) && (sVar = this.a.g) != null && !TextUtils.isEmpty(sVar.e)) {
            B = new File(this.a.g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j3 = h.size;
        if (j3 <= 0) {
            s sVar2 = this.a.g;
            j3 = (sVar2 == null || TextUtils.isEmpty(sVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.R = new StaticLayout(org.telegram.messenger.g0.i0(j3, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z9) {
        File K;
        s sVar;
        boolean z10 = this.L;
        f6 f6Var = this.r;
        RadialProgress2 radialProgress2 = this.D;
        if (z10) {
            radialProgress2.g(k6.Ze, k6.af, k6.bf, k6.cf);
            int i7 = k6.Vd;
            this.V = i7;
            radialProgress2.d = k6.w0(i7, f6Var);
        } else {
            radialProgress2.g(k6.We, k6.Xe, k6.id, k6.jd);
            int i10 = k6.pe;
            this.V = i10;
            radialProgress2.d = k6.w0(i10, f6Var);
        }
        boolean j3 = j();
        int i11 = this.n;
        if (j3) {
            org.telegram.messenger.z5.q(i11).v(this);
            radialProgress2.p(z9, this.a.g.f);
            radialProgress2.setIcon(3, false, z9);
            return;
        }
        String r10 = w7.r(null, h());
        a aVar = this.a;
        if (aVar != null && (sVar = aVar.g) != null && !TextUtils.isEmpty(sVar.e)) {
            K = new File(this.a.g.e);
        }
        if (h() == null) {
            K = null;
        } else {
            w7.G(i11);
            K = w7.K(h(), null, false, true);
            if (K == null || !K.exists()) {
                w7.G(i11);
                K = w7.K(h(), null, true, true);
            }
        }
        if (K != null && K.exists()) {
            org.telegram.messenger.z5.q(i11).v(this);
            this.P = 0;
            radialProgress2.setIcon(this.L ? 4 : 5, false, z9);
        } else {
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.messenger.z5.q(i11).a(r10, null, this);
            if (!w7.G(i11).T(r10)) {
                this.P = 1;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(2, false, z9);
            } else {
                this.P = 2;
                Float w10 = gc.D().w(r10);
                radialProgress2.p(z9, w10 != null ? w10.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z9);
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
        org.telegram.messenger.z5.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        i9 textSelectionHelper;
        if (h() == null) {
            return;
        }
        boolean z9 = this.L;
        f6 f6Var = this.r;
        if (z9 && !this.E.h(canvas, null)) {
            int w02 = k6.w0(k6.ue, f6Var);
            Paint paint = this.w;
            paint.setColor(w02);
            canvas.drawRoundRect(this.K, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f) + this.K, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.D.draw(canvas);
        if (this.L) {
            i7 = this.K;
            f10 = 97.0f;
        } else {
            i7 = this.J;
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i7;
        this.x.setColor(k6.w0(k6.re, f6Var));
        int L2 = org.telegram.messenger.g0.L(12.0f);
        if (this.Q != null) {
            canvas.save();
            canvas.translate(L, L2);
            this.Q.draw(canvas);
            canvas.restore();
        }
        this.y.setColor(k6.w0(k6.be, f6Var));
        StaticLayout staticLayout = this.Q;
        int L3 = org.telegram.messenger.g0.L(2.0f) + L2 + (staticLayout == null ? 0 : staticLayout.getHeight());
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
        canvas.drawRoundRect(org.telegram.messenger.g0.L(8.0f) + (this.M ? 0 : this.c), org.telegram.messenger.g0.L(2.0f), (getWidth() - (this.M ? this.c : 0)) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.L ? 104.0f : 64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.s);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        boolean z10 = this.M;
        this.F.g(z10 ? 0 : this.c, z10 ? this.c : 0, i11 - i7, org.telegram.messenger.g0.L(this.L ? 106.0f : 66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        boolean z9 = this.M;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(this.L ? 106.0f : 66.0f) + this.F.h(z9 ? 0 : this.c, z9 ? this.c : 0, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        ij ijVar;
        if (motionEvent.getX() >= this.K && motionEvent.getX() <= getWidth() - org.telegram.messenger.g0.L(12.0f) && motionEvent.getY() >= org.telegram.messenger.g0.L(10.0f)) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(this.L ? 96.0f : 54.0f)) {
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
                        if (j()) {
                            o3 o3Var = this.S;
                            if (o3Var != null) {
                                a aVar = this.a;
                                t3 t3Var = o3Var.a;
                                y4 y4Var = (y4) t3Var.g4.remove(aVar.g);
                                if (y4Var != null) {
                                    y4Var.b();
                                }
                                f2 f2Var = t3Var.Q3;
                                if (f2Var != null) {
                                    f2Var.d();
                                }
                                t3Var.s3.remove(aVar);
                                t3Var.f3.O(true);
                                f2 f2Var2 = t3Var.Q3;
                                if (f2Var2 != null) {
                                    f2Var2.h();
                                }
                                t3Var.o3.onContentChanged();
                            }
                        } else {
                            int i7 = this.P;
                            Activity activity = null;
                            if (i7 == 0) {
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
                                if (activity != null && (ijVar = this.T) != null) {
                                    org.telegram.messenger.g0.u2(ijVar, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.D;
                                int i10 = this.n;
                                if (i7 == 1 && h() != null) {
                                    o3 o3Var2 = this.S;
                                    ij ijVar2 = o3Var2 != null ? o3Var2.a.p3 : null;
                                    w7 G = w7.G(i10);
                                    TLRPC.Document h = h();
                                    if (ijVar2 == null) {
                                        ijVar2 = this.T;
                                    }
                                    G.X(h, ijVar2, 1, 1);
                                    this.P = 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.P == 2 && h() != null) {
                                    w7.G(i10).f(h());
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        this.s.setColor(k6.w0(k6.ig, this.r));
        j0 j0Var = this.F;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
