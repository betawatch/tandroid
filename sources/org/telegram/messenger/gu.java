package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class gu extends xt implements x5 {
    public final TLRPC.Document X;
    public final RadialProgress2 Y;
    public final ImageReceiver Z;
    public final Paint a0;
    public final TextPaint b0;
    public final TextPaint c0;
    public StaticLayout d0;
    public StaticLayout e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final int i0;
    public final RectF j0;
    public final boolean k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public int o0;
    public final int p0;

    public gu(cv cvVar, Rect rect, int i3, TL_iv.pageBlockDocument pageblockdocument) {
        super(cvVar, rect, i3);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Z = imageReceiver;
        this.a0 = new Paint(1);
        this.b0 = new TextPaint(1);
        this.c0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.f0 = L;
        int L2 = g0.L(9.0f);
        int L3 = g0.L(42.0f);
        this.h0 = L3;
        this.i0 = g0.L(14.0f);
        this.j0 = new RectF();
        this.o0 = -1;
        TLRPC.Document s6 = cvVar.s(pageblockdocument.document_id);
        this.X = s6;
        int L4 = g0.L(10.0f) + cvVar.S;
        this.g0 = L4;
        boolean X2 = zi.X2(s6);
        this.k0 = X2;
        this.p0 = z5.q(cvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.Y = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = X2 ? ((g0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = X2 ? g0.L(10.0f) + ((g0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(g0.L(6.0f));
        imageReceiver.A1 = true;
        if (X2) {
            TLRPC.PhotoSize w10 = w7.w(s6.thumbs, hs.r5, false, null, true);
            imageReceiver.y0(L4, g0.L(10.0f), g0.L(86.0f), g0.L(86.0f));
            imageReceiver.q0(w10 != null ? ac.c(w10, s6) : null, "86_86", zb.m(s6.thumbs), null, cvVar.b, 1);
        }
        k0();
        l0(false);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        l0(true);
    }

    @Override // org.telegram.messenger.xt
    public final int I() {
        Rect rect = this.b;
        return g0.L(this.k0 ? 106.0f : 60.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.xt
    public final int J() {
        int i3;
        int i10;
        boolean z10 = this.k0;
        cv cvVar = this.a;
        if (z10) {
            i10 = g0.L(86.0f) + (this.g0 - cvVar.S);
        } else {
            StaticLayout staticLayout = this.e0;
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                i3 = 0;
            } else {
                StaticLayout staticLayout2 = this.e0;
                i3 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            }
            i10 = (this.f0 - cvVar.S) + this.h0 + this.i0 + i3;
        }
        Rect rect = this.b;
        return rect.left + i10 + rect.right;
    }

    @Override // org.telegram.messenger.xt
    public final int K() {
        TLRPC.Document document = this.X;
        int min = Math.min(this.c, Math.max(g0.L(220.0f), g0.L(48.0f) + (this.k0 ? g0.L(107.0f) : this.f0 + this.h0 + this.i0) + ((int) Math.ceil(Math.max(this.b0.measureText(document == null ? "" : w7.B(document)), this.c0.measureText(document != null ? g0.i0(document.size, false, false) : ""))))));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.Y.p(true, 1.0f);
        l0(true);
    }

    @Override // org.telegram.messenger.xt
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Z;
        if (view != null) {
            this.Y.n(view);
            imageReceiver.H0(this.W);
        }
        imageReceiver.P();
        l0(false);
    }

    @Override // org.telegram.messenger.xt
    public final void V() {
        this.Z.R();
        z5.q(this.a.a).v(this);
    }

    @Override // org.telegram.messenger.xt
    public final void W(Canvas canvas) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        Drawable drawable;
        TLRPC.Document document = this.X;
        if (document == null) {
            return;
        }
        if (this.o0 != i0()) {
            k0();
        }
        canvas.save();
        cv cvVar = this.a;
        canvas.translate(-cvVar.S, 0.0f);
        boolean z10 = this.k0;
        int i3 = this.g0;
        if (z10 && !this.Z.h(canvas, null)) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.wc : org.telegram.ui.ActionBar.k6.ue, cvVar.D);
            Paint paint = this.a0;
            paint.setColor(w02);
            canvas.drawRoundRect(i3, g0.L(10.0f), g0.L(86.0f) + i3, g0.L(96.0f), g0.L(6.0f), g0.L(6.0f), paint);
        }
        this.Y.draw(canvas);
        this.b0.setColor(org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.tc : org.telegram.ui.ActionBar.k6.re, cvVar.D));
        this.c0.setColor(org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.gc : org.telegram.ui.ActionBar.k6.be, cvVar.D));
        int L = z10 ? g0.L(97.0f) + i3 : this.f0 + this.h0 + this.i0;
        int L2 = g0.L(11.0f);
        int L3 = g0.L(2.0f) + this.d0.getHeight() + L2;
        canvas.save();
        float f10 = L;
        canvas.translate(f10, L2);
        this.d0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, L3);
        this.e0.draw(canvas);
        canvas.restore();
        RectF rectF = this.j0;
        if (document == null || (q1Var = cvVar.E) == null || (l1Var = cvVar.F) == null || !l1Var.b0(q1Var)) {
            rectF.setEmpty();
        } else {
            if (cvVar.E()) {
                org.telegram.ui.ActionBar.e6 e6Var = cvVar.D;
                drawable = e6Var != null ? e6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.k6.c4;
            }
            int L4 = (this.o0 + this.b.right) - g0.L(32.0f);
            int L5 = g0.L(7.0f);
            drawable.setBounds(L4, L5, drawable.getIntrinsicWidth() + L4, drawable.getIntrinsicHeight() + L5);
            drawable.draw(canvas);
            rectF.set(L4 - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L4, g0.L(54.0f));
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    @Override // org.telegram.messenger.xt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        float x10 = motionEvent.getX();
        cv cvVar = this.a;
        int i3 = cvVar.S;
        int i10 = cvVar.a;
        float f10 = x10 + i3;
        float y9 = motionEvent.getY();
        boolean contains = this.j0.contains(f10, y9);
        if (motionEvent.getActionMasked() == 0 && contains) {
            this.n0 = true;
            return true;
        }
        boolean z11 = this.n0;
        TLRPC.Document document = this.X;
        if (z11) {
            if (motionEvent.getActionMasked() == 2 && !contains) {
                this.n0 = false;
                return true;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                boolean z12 = motionEvent.getActionMasked() == 1 && contains;
                this.n0 = false;
                if (z12 && document != null && document != null && (q1Var = cvVar.E) != null && (l1Var = cvVar.F) != null && l1Var.b0(q1Var)) {
                    View view = this.W;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    cvVar.F.K(cvVar.E, document, F());
                }
                return true;
            }
        }
        boolean z13 = this.k0;
        if (f10 >= (z13 ? this.g0 : this.f0) && f10 <= this.o0 - g0.L(12.0f) && y9 >= g0.L(10.0f)) {
            if (y9 <= g0.L(z13 ? 96.0f : 53.0f)) {
                z10 = true;
                if (motionEvent.getActionMasked() != 0 && z10) {
                    this.m0 = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.m0) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.m0 = false;
                    }
                    return this.m0;
                }
                this.m0 = false;
                if (z10) {
                    View view2 = this.W;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                    }
                    int i11 = this.l0;
                    if (i11 == 0) {
                        View view3 = this.W;
                        Activity activity = null;
                        Context context = view3 == null ? null : view3.getContext();
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
                        Activity activity2 = activity;
                        File j02 = j0();
                        if (activity2 != null && j02 != null) {
                            g0.t2(j02, w7.B(document), document.mime_type, activity2, cvVar.D, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.Y;
                        if (i11 == 1 && document != null) {
                            w7.G(i10).X(document, cvVar.b, 1, 1);
                            this.l0 = 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (i11 == 2 && document != null) {
                            w7.G(i10).f(document);
                            this.l0 = 1;
                            radialProgress2.setIcon(2, false, true);
                        }
                    }
                    View view4 = this.W;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
                return true;
            }
        }
        z10 = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        return this.m0;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.p0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.Y.p(true, j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11));
        if (this.l0 != 2) {
            l0(true);
        }
    }

    public final int i0() {
        cv cvVar = this.a;
        int i3 = cvVar.C;
        int i10 = this.c;
        if (i3 > 0) {
            Rect rect = this.b;
            i10 = Math.min(i10, Math.max(0, (i3 - rect.left) - rect.right));
        }
        return i10 + cvVar.S + cvVar.T;
    }

    public final File j0() {
        TLRPC.Document document = this.X;
        if (document == null) {
            return null;
        }
        cv cvVar = this.a;
        w7.G(cvVar.a);
        File K = w7.K(document, null, false, true);
        if (K != null && K.exists()) {
            return K;
        }
        w7.G(cvVar.a);
        return w7.K(document, null, true, true);
    }

    public final void k0() {
        int i3;
        int i10;
        this.o0 = i0();
        if (this.k0) {
            i3 = g0.L(97.0f);
            i10 = this.g0;
        } else {
            i3 = this.f0 + this.h0;
            i10 = this.i0;
        }
        int d = k2.p1.d(48.0f, this.o0 - (i3 + i10), g0.L(40.0f));
        cv cvVar = this.a;
        float L = g0.L(cvVar.M - 1);
        TextPaint textPaint = this.b0;
        textPaint.setTextSize(L);
        textPaint.setTypeface(g0.o());
        this.c0.setTextSize(g0.L(cvVar.M - 3));
        TLRPC.Document document = this.X;
        CharSequence ellipsize = TextUtils.ellipsize(document == null ? "" : w7.B(document), textPaint, d, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.d0 = new StaticLayout(ellipsize, this.b0, d, alignment, 1.0f, 0.0f, false);
        this.e0 = new StaticLayout(document != null ? g0.i0(document.size, false, false) : "", this.c0, d, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z10) {
        cv cvVar = this.a;
        RadialProgress2 radialProgress2 = this.Y;
        boolean z11 = this.k0;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.k6.Ze, org.telegram.ui.ActionBar.k6.af, org.telegram.ui.ActionBar.k6.bf, org.telegram.ui.ActionBar.k6.cf);
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vd, cvVar.D);
        } else {
            radialProgress2.g(cvVar.E() ? org.telegram.ui.ActionBar.k6.Bc : org.telegram.ui.ActionBar.k6.We, cvVar.E() ? org.telegram.ui.ActionBar.k6.Cc : org.telegram.ui.ActionBar.k6.Xe, cvVar.E() ? org.telegram.ui.ActionBar.k6.Db : org.telegram.ui.ActionBar.k6.id, cvVar.E() ? org.telegram.ui.ActionBar.k6.Eb : org.telegram.ui.ActionBar.k6.jd);
            radialProgress2.d = org.telegram.ui.ActionBar.k6.w0(cvVar.E() ? org.telegram.ui.ActionBar.k6.rc : org.telegram.ui.ActionBar.k6.pe, cvVar.D);
        }
        String r5 = w7.r(null, this.X);
        File j02 = j0();
        if (j02 != null && j02.exists()) {
            z5.q(cvVar.a).v(this);
            this.l0 = 0;
            radialProgress2.setIcon(z11 ? 4 : 5, false, z10);
        } else if (TextUtils.isEmpty(r5)) {
            radialProgress2.setIcon(4, false, z10);
        } else {
            z5.q(cvVar.a).a(r5, null, this);
            if (w7.G(cvVar.a).T(r5)) {
                this.l0 = 2;
                Float w10 = zb.D().w(r5);
                radialProgress2.p(z10, w10 != null ? w10.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z10);
            } else {
                this.l0 = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            }
        }
        View view = this.W;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
