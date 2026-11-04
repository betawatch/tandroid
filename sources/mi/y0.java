package mi;

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
import b8.mf;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.hs;
import org.telegram.messenger.w7;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class y0 extends y implements org.telegram.ui.ActionBar.z5, g9, l0, org.telegram.messenger.x5 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final k0 G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public StaticLayout R;
    public StaticLayout S;
    public o3 T;
    public zi U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final org.telegram.ui.ActionBar.e6 r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public y0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = org.telegram.messenger.g0.L(10.0f);
        this.I = L;
        int L2 = org.telegram.messenger.g0.L(44.0f);
        this.J = L2;
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.L = org.telegram.messenger.g0.L(16.0f);
        this.W = -1;
        this.b0 = r6.b;
        this.n = i3;
        this.r = e6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        this.H = org.telegram.messenger.z5.q(i3).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, e6Var);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.K;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        k0 k0Var = new k0(context, e6Var, new hi.d(this, 13));
        this.G = k0Var;
        addView(k0Var.a, mf.e(-2, -2, 51));
        updateColors();
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        m(true);
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.E.p(true, 1.0f);
        m(true);
    }

    @Override // mi.l0
    public final boolean a(int i3, int i10) {
        return this.G.f(i3, i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.ig));
    }

    @Override // mi.l0
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
        int i3;
        int i10 = this.b0;
        int i11 = r6.b;
        if (i10 != i11) {
            this.b0 = i11;
            try {
                RadialProgress2 radialProgress2 = this.E;
                org.telegram.ui.ActionBar.e6 e6Var = this.r;
                if (radialProgress2 != null && (i3 = this.W) >= 0) {
                    radialProgress2.d = k6.w0(i3, e6Var);
                }
                if (this.a0 && (getBackground() instanceof z1)) {
                    ((z1) getBackground()).a(k6.w0(k6.d6, e6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.draw(canvas);
    }

    @Override // mi.y
    public final void e(int i3) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i3 = 0;
        }
        int i10 = L + i3;
        this.L = i10;
        if (this.M) {
            i10 += org.telegram.messenger.g0.L(21.0f);
        }
        this.K = i10;
        int L2 = this.M ? org.telegram.messenger.g0.L(31.0f) : this.I;
        int i11 = this.K;
        int i12 = this.J;
        this.E.r(i11, L2, i11 + i12, i12 + L2);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        s sVar;
        a aVar = this.a;
        String str2 = (aVar == null || (sVar = aVar.g) == null) ? null : sVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z10 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean X2 = zi.X2(document);
        this.M = z10 || X2;
        int L = org.telegram.messenger.g0.L(16.0f) + (this.N ? 0 : this.c);
        this.L = L;
        if (this.M) {
            L += org.telegram.messenger.g0.L(21.0f);
        }
        this.K = L;
        int L2 = this.M ? org.telegram.messenger.g0.L(31.0f) : this.I;
        int i3 = this.K;
        int i10 = this.J;
        this.E.r(i3, L2, i3 + i10, i10 + L2);
        ImageReceiver imageReceiver = this.F;
        if (z10) {
            imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            imageReceiver.q0(ac.g(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!X2) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, hs.r5, false, null, true);
        o3 o3Var = this.T;
        zi ziVar = o3Var == null ? null : o3Var.a.q3;
        imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
        ac c2 = w10 != null ? ac.c(w10, document) : null;
        BitmapDrawable m10 = zb.m(document.thumbs);
        if (ziVar == null) {
            ziVar = this.U;
        }
        imageReceiver.q0(c2, "86_86", m10, null, ziVar, 1);
    }

    @Override // mi.l0
    public h1 getCaptionEditText() {
        return this.G.a;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.H;
    }

    @Override // mi.l0
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
    public final void i(long j10, long j11) {
        this.E.p(true, j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11));
    }

    public final boolean j() {
        s sVar;
        a aVar = this.a;
        return (aVar == null || (sVar = aVar.g) == null || !sVar.a()) ? false : true;
    }

    @Override // org.telegram.ui.Cells.g9
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void l() {
        int i3;
        float f10;
        s sVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i3 = this.L;
            f10 = 97.0f;
        } else {
            i3 = this.K;
            f10 = 54.0f;
        }
        int max = Math.max(org.telegram.messenger.g0.L(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x) - (org.telegram.messenger.g0.L(f10) + i3)) - org.telegram.messenger.g0.L(16.0f)) - (this.N ? this.c : 0));
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
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j10 = h.size;
        if (j10 <= 0) {
            s sVar2 = this.a.g;
            j10 = (sVar2 == null || TextUtils.isEmpty(sVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.S = new StaticLayout(org.telegram.messenger.g0.i0(j10, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z10) {
        File K;
        s sVar;
        boolean z11 = this.M;
        org.telegram.ui.ActionBar.e6 e6Var = this.r;
        RadialProgress2 radialProgress2 = this.E;
        if (z11) {
            radialProgress2.g(k6.Ze, k6.af, k6.bf, k6.cf);
            int i3 = k6.Vd;
            this.W = i3;
            radialProgress2.d = k6.w0(i3, e6Var);
        } else {
            radialProgress2.g(k6.We, k6.Xe, k6.id, k6.jd);
            int i10 = k6.pe;
            this.W = i10;
            radialProgress2.d = k6.w0(i10, e6Var);
        }
        boolean j10 = j();
        int i11 = this.n;
        if (j10) {
            org.telegram.messenger.z5.q(i11).v(this);
            radialProgress2.p(z10, this.a.g.f);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String r5 = w7.r(null, h());
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
            this.Q = 0;
            radialProgress2.setIcon(this.M ? 4 : 5, false, z10);
        } else {
            if (TextUtils.isEmpty(r5)) {
                return;
            }
            org.telegram.messenger.z5.q(i11).a(r5, null, this);
            if (!w7.G(i11).T(r5)) {
                this.Q = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            } else {
                this.Q = 2;
                Float w10 = zb.D().w(r5);
                radialProgress2.p(z10, w10 != null ? w10.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        this.E.n(this);
        this.F.P();
        m(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        this.F.R();
        org.telegram.messenger.z5.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        h9 textSelectionHelper;
        if (h() == null) {
            return;
        }
        boolean z10 = this.M;
        org.telegram.ui.ActionBar.e6 e6Var = this.r;
        if (z10 && !this.F.h(canvas, null)) {
            int w02 = k6.w0(k6.ue, e6Var);
            Paint paint = this.w;
            paint.setColor(w02);
            canvas.drawRoundRect(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f) + this.L, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.E.draw(canvas);
        if (this.M) {
            i3 = this.L;
            f10 = 97.0f;
        } else {
            i3 = this.K;
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i3;
        this.x.setColor(k6.w0(k6.re, e6Var));
        int L2 = org.telegram.messenger.g0.L(12.0f);
        if (this.R != null) {
            canvas.save();
            canvas.translate(L, L2);
            this.R.draw(canvas);
            canvas.restore();
        }
        this.y.setColor(k6.w0(k6.be, e6Var));
        StaticLayout staticLayout = this.R;
        int L3 = org.telegram.messenger.g0.L(2.0f) + L2 + (staticLayout == null ? 0 : staticLayout.getHeight());
        if (this.S != null) {
            canvas.save();
            canvas.translate(L, L3);
            this.S.draw(canvas);
            canvas.restore();
        }
        if (this.T == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.T.a.getTextSelectionHelper()) == null || !textSelectionHelper.x()) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
            return;
        }
        canvas.drawRoundRect(org.telegram.messenger.g0.L(8.0f) + (this.N ? 0 : this.c), org.telegram.messenger.g0.L(2.0f), (getWidth() - (this.N ? this.c : 0)) - org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(this.M ? 104.0f : 64.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.s);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        boolean z11 = this.N;
        this.G.g(z11 ? 0 : this.c, z11 ? this.c : 0, i11 - i3, org.telegram.messenger.g0.L(this.M ? 106.0f : 66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        boolean z10 = this.N;
        setMeasuredDimension(size, org.telegram.messenger.g0.L(this.M ? 106.0f : 66.0f) + this.G.h(z10 ? 0 : this.c, z10 ? this.c : 0, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0121  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        zi ziVar;
        if (motionEvent.getX() >= this.L && motionEvent.getX() <= getWidth() - org.telegram.messenger.g0.L(12.0f) && motionEvent.getY() >= org.telegram.messenger.g0.L(10.0f)) {
            if (motionEvent.getY() <= org.telegram.messenger.g0.L(this.M ? 96.0f : 54.0f)) {
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
                            o3 o3Var = this.T;
                            if (o3Var != null) {
                                a aVar = this.a;
                                t3 t3Var = o3Var.a;
                                z4 z4Var = (z4) t3Var.h4.remove(aVar.g);
                                if (z4Var != null) {
                                    z4Var.b();
                                }
                                g2 g2Var = t3Var.R3;
                                if (g2Var != null) {
                                    g2Var.d();
                                }
                                t3Var.t3.remove(aVar);
                                t3Var.g3.O(true);
                                g2 g2Var2 = t3Var.R3;
                                if (g2Var2 != null) {
                                    g2Var2.h();
                                }
                                t3Var.p3.onContentChanged();
                            }
                        } else {
                            int i3 = this.Q;
                            Activity activity = null;
                            if (i3 == 0) {
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
                                if (activity != null && (ziVar = this.U) != null) {
                                    org.telegram.messenger.g0.u2(ziVar, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.E;
                                int i10 = this.n;
                                if (i3 == 1 && h() != null) {
                                    o3 o3Var2 = this.T;
                                    zi ziVar2 = o3Var2 != null ? o3Var2.a.q3 : null;
                                    w7 G = w7.G(i10);
                                    TLRPC.Document h = h();
                                    if (ziVar2 == null) {
                                        ziVar2 = this.U;
                                    }
                                    G.X(h, ziVar2, 1, 1);
                                    this.Q = 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.Q == 2 && h() != null) {
                                    w7.G(i10).f(h());
                                    this.Q = 1;
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.s.setColor(k6.w0(k6.ig, this.r));
        k0 k0Var = this.G;
        if (k0Var != null) {
            k0Var.a();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
