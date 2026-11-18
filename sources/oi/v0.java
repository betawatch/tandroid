package oi;

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
import c8.ma;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.ec;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class v0 extends x implements org.telegram.ui.ActionBar.c6, i9, i0, org.telegram.messenger.y5 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final h0 G;
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
    public n3 T;
    public fj U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final i6 r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public v0(int i7, Context context, i6 i6Var) {
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
        this.b0 = u6.b;
        this.n = i7;
        this.r = i6Var;
        setWillNotDraw(false);
        setMinimumHeight(org.telegram.messenger.g0.L(66.0f));
        this.H = org.telegram.messenger.a6.q(i7).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, i6Var);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(org.telegram.messenger.g0.L(24.0f));
        int i10 = this.K;
        radialProgress2.r(i10, L, i10 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        h0 h0Var = new h0(context, i6Var, new hi.u5(this, 19));
        this.G = h0Var;
        addView(h0Var.a, ma.e(-2, -2, 51));
        updateColors();
    }

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        m(true);
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        this.E.p(true, 1.0f);
        m(true);
    }

    @Override // oi.i0
    public final boolean a(int i7, int i10) {
        return this.G.f(i7, i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.lg));
    }

    @Override // oi.i0
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
        int i7;
        int i10 = this.b0;
        int i11 = u6.b;
        if (i10 != i11) {
            this.b0 = i11;
            try {
                RadialProgress2 radialProgress2 = this.E;
                i6 i6Var = this.r;
                if (radialProgress2 != null && (i7 = this.W) >= 0) {
                    radialProgress2.d = n6.w0(i7, i6Var);
                }
                if (this.a0 && (getBackground() instanceof w1)) {
                    ((w1) getBackground()).a(n6.w0(n6.d6, i6Var));
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        super.draw(canvas);
    }

    @Override // oi.x
    public final void e(int i7) {
        int L = org.telegram.messenger.g0.L(16.0f);
        if (this.N) {
            i7 = 0;
        }
        int i10 = L + i7;
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
        r rVar;
        a aVar = this.a;
        String str2 = (aVar == null || (rVar = aVar.g) == null) ? null : rVar.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z10 = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean W2 = fj.W2(document);
        this.M = z10 || W2;
        int L = org.telegram.messenger.g0.L(16.0f) + (this.N ? 0 : this.c);
        this.L = L;
        if (this.M) {
            L += org.telegram.messenger.g0.L(21.0f);
        }
        this.K = L;
        int L2 = this.M ? org.telegram.messenger.g0.L(31.0f) : this.I;
        int i7 = this.K;
        int i10 = this.J;
        this.E.r(i7, L2, i7 + i10, i10 + L2);
        ImageReceiver imageReceiver = this.F;
        if (z10) {
            imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
            imageReceiver.q0(fc.g(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!W2) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w10 = w7.w(document.thumbs, ks.r5, false, null, true);
        n3 n3Var = this.T;
        fj fjVar = n3Var == null ? null : n3Var.a.q3;
        imageReceiver.y0(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f), org.telegram.messenger.g0.L(86.0f));
        fc c10 = w10 != null ? fc.c(w10, document) : null;
        BitmapDrawable m10 = ec.m(document.thumbs);
        if (fjVar == null) {
            fjVar = this.U;
        }
        imageReceiver.q0(c10, "86_86", m10, null, fjVar, 1);
    }

    @Override // oi.i0
    public e1 getCaptionEditText() {
        return this.G.a;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.H;
    }

    @Override // oi.i0
    public a getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        r rVar;
        a aVar = this.a;
        if (aVar == null || (rVar = aVar.g) == null) {
            return null;
        }
        return rVar.h;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.E.p(true, j10 <= 0 ? 0.0f : Math.min(1.0f, j3 / j10));
    }

    public final boolean j() {
        r rVar;
        a aVar = this.a;
        return (aVar == null || (rVar = aVar.g) == null || !rVar.a()) ? false : true;
    }

    @Override // org.telegram.ui.Cells.i9
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void l() {
        int i7;
        float f10;
        r rVar;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i7 = this.L;
            f10 = 97.0f;
        } else {
            i7 = this.K;
            f10 = 54.0f;
        }
        int max = Math.max(org.telegram.messenger.g0.L(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.g0.q.x) - (org.telegram.messenger.g0.L(f10) + i7)) - org.telegram.messenger.g0.L(16.0f)) - (this.N ? this.c : 0));
        float L = org.telegram.messenger.g0.L(15.0f);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(L);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        float L2 = org.telegram.messenger.g0.L(13.0f);
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(L2);
        String B = w7.B(h);
        if (TextUtils.isEmpty(B) && (rVar = this.a.g) != null && !TextUtils.isEmpty(rVar.e)) {
            B = new File(this.a.g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j3 = h.size;
        if (j3 <= 0) {
            r rVar2 = this.a.g;
            j3 = (rVar2 == null || TextUtils.isEmpty(rVar2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.S = new StaticLayout(org.telegram.messenger.g0.i0(j3, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6.exists() != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z10) {
        File J;
        r rVar;
        boolean z11 = this.M;
        i6 i6Var = this.r;
        RadialProgress2 radialProgress2 = this.E;
        if (z11) {
            radialProgress2.g(n6.cf, n6.df, n6.ef, n6.ff);
            int i7 = n6.Yd;
            this.W = i7;
            radialProgress2.d = n6.w0(i7, i6Var);
        } else {
            radialProgress2.g(n6.Ze, n6.af, n6.ld, n6.md);
            int i10 = n6.se;
            this.W = i10;
            radialProgress2.d = n6.w0(i10, i6Var);
        }
        boolean j3 = j();
        int i11 = this.n;
        if (j3) {
            org.telegram.messenger.a6.q(i11).v(this);
            radialProgress2.p(z10, this.a.g.f);
            radialProgress2.setIcon(3, false, z10);
            return;
        }
        String r10 = w7.r(null, h());
        a aVar = this.a;
        if (aVar != null && (rVar = aVar.g) != null && !TextUtils.isEmpty(rVar.e)) {
            J = new File(this.a.g.e);
        }
        if (h() == null) {
            J = null;
        } else {
            w7.G(i11);
            J = w7.J(h(), null, false, true);
            if (J == null || !J.exists()) {
                w7.G(i11);
                J = w7.J(h(), null, true, true);
            }
        }
        if (J != null && J.exists()) {
            org.telegram.messenger.a6.q(i11).v(this);
            this.Q = 0;
            radialProgress2.setIcon(this.M ? 4 : 5, false, z10);
        } else {
            if (TextUtils.isEmpty(r10)) {
                return;
            }
            org.telegram.messenger.a6.q(i11).a(r10, null, this);
            if (!w7.G(i11).S(r10)) {
                this.Q = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            } else {
                this.Q = 2;
                Float w10 = ec.D().w(r10);
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
        org.telegram.messenger.a6.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        j9 textSelectionHelper;
        if (h() == null) {
            return;
        }
        boolean z10 = this.M;
        i6 i6Var = this.r;
        if (z10 && !this.F.h(canvas, null)) {
            int w02 = n6.w0(n6.xe, i6Var);
            Paint paint = this.w;
            paint.setColor(w02);
            canvas.drawRoundRect(this.L, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(86.0f) + this.L, org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.E.draw(canvas);
        if (this.M) {
            i7 = this.L;
            f10 = 97.0f;
        } else {
            i7 = this.K;
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10) + i7;
        this.x.setColor(n6.w0(n6.ue, i6Var));
        int L2 = org.telegram.messenger.g0.L(12.0f);
        if (this.R != null) {
            canvas.save();
            canvas.translate(L, L2);
            this.R.draw(canvas);
            canvas.restore();
        }
        this.y.setColor(n6.w0(n6.ee, i6Var));
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        boolean z11 = this.N;
        this.G.g(z11 ? 0 : this.c, z11 ? this.c : 0, i11 - i7, org.telegram.messenger.g0.L(this.M ? 106.0f : 66.0f));
        l();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
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
        fj fjVar;
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
                            n3 n3Var = this.T;
                            if (n3Var != null) {
                                a aVar = this.a;
                                s3 s3Var = n3Var.a;
                                x4 x4Var = (x4) s3Var.h4.remove(aVar.g);
                                if (x4Var != null) {
                                    x4Var.b();
                                }
                                e2 e2Var = s3Var.R3;
                                if (e2Var != null) {
                                    e2Var.d();
                                }
                                s3Var.t3.remove(aVar);
                                s3Var.g3.O(true);
                                e2 e2Var2 = s3Var.R3;
                                if (e2Var2 != null) {
                                    e2Var2.h();
                                }
                                s3Var.p3.onContentChanged();
                            }
                        } else {
                            int i7 = this.Q;
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
                                if (activity != null && (fjVar = this.U) != null) {
                                    org.telegram.messenger.g0.u2(fjVar, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.E;
                                int i10 = this.n;
                                if (i7 == 1 && h() != null) {
                                    n3 n3Var2 = this.T;
                                    fj fjVar2 = n3Var2 != null ? n3Var2.a.q3 : null;
                                    w7 G = w7.G(i10);
                                    TLRPC.Document h = h();
                                    if (fjVar2 == null) {
                                        fjVar2 = this.U;
                                    }
                                    G.W(h, fjVar2, 1, 1);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.s.setColor(n6.w0(n6.lg, this.r));
        h0 h0Var = this.G;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
