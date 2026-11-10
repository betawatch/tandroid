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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class ou extends fu implements x5 {
    public final TLRPC.Document W;
    public final RadialProgress2 X;
    public final ImageReceiver Y;
    public final Paint Z;
    public final TextPaint a0;
    public final TextPaint b0;
    public StaticLayout c0;
    public StaticLayout d0;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final RectF i0;
    public final boolean j0;
    public int k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public final int o0;

    public ou(kv kvVar, Rect rect, int i7, TL_iv.pageBlockDocument pageblockdocument) {
        super(kvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.Z = new Paint(1);
        this.a0 = new TextPaint(1);
        this.b0 = new TextPaint(1);
        int L = g0.L(16.0f);
        this.e0 = L;
        int L2 = g0.L(9.0f);
        int L3 = g0.L(42.0f);
        this.g0 = L3;
        this.h0 = g0.L(14.0f);
        this.i0 = new RectF();
        this.n0 = -1;
        TLRPC.Document s5 = kvVar.s(pageblockdocument.document_id);
        this.W = s5;
        int L4 = g0.L(10.0f) + kvVar.S;
        this.f0 = L4;
        boolean W2 = ij.W2(s5);
        this.j0 = W2;
        this.o0 = z5.q(kvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.X = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = W2 ? ((g0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = W2 ? g0.L(10.0f) + ((g0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(g0.L(6.0f));
        imageReceiver.z1 = true;
        if (W2) {
            TLRPC.PhotoSize w10 = w7.w(s5.thumbs, qs.r5, false, null, true);
            imageReceiver.y0(L4, g0.L(10.0f), g0.L(86.0f), g0.L(86.0f));
            imageReceiver.q0(w10 != null ? hc.c(w10, s5) : null, "86_86", gc.m(s5.thumbs), null, kvVar.b, 1);
        }
        k0();
        l0(false);
    }

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        l0(true);
    }

    @Override // org.telegram.messenger.fu
    public final int I() {
        Rect rect = this.b;
        return g0.L(this.j0 ? 106.0f : 60.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.fu
    public final int J() {
        int i7;
        int i10;
        boolean z9 = this.j0;
        kv kvVar = this.a;
        if (z9) {
            i10 = g0.L(86.0f) + (this.f0 - kvVar.S);
        } else {
            StaticLayout staticLayout = this.d0;
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                i7 = 0;
            } else {
                StaticLayout staticLayout2 = this.d0;
                i7 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            }
            i10 = (this.e0 - kvVar.S) + this.g0 + this.h0 + i7;
        }
        Rect rect = this.b;
        return rect.left + i10 + rect.right;
    }

    @Override // org.telegram.messenger.fu
    public final int K() {
        TLRPC.Document document = this.W;
        int min = Math.min(this.c, Math.max(g0.L(220.0f), g0.L(48.0f) + (this.j0 ? g0.L(107.0f) : this.e0 + this.g0 + this.h0) + ((int) Math.ceil(Math.max(this.a0.measureText(document == null ? "" : w7.B(document)), this.b0.measureText(document != null ? g0.i0(document.size, false, false) : ""))))));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        this.X.p(true, 1.0f);
        l0(true);
    }

    @Override // org.telegram.messenger.fu
    public final void T() {
        View view = this.V;
        ImageReceiver imageReceiver = this.Y;
        if (view != null) {
            this.X.n(view);
            imageReceiver.H0(this.V);
        }
        imageReceiver.P();
        l0(false);
    }

    @Override // org.telegram.messenger.fu
    public final void V() {
        this.Y.R();
        z5.q(this.a.a).v(this);
    }

    @Override // org.telegram.messenger.fu
    public final void W(Canvas canvas) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        Drawable drawable;
        TLRPC.Document document = this.W;
        if (document == null) {
            return;
        }
        if (this.n0 != i0()) {
            k0();
        }
        canvas.save();
        kv kvVar = this.a;
        canvas.translate(-kvVar.S, 0.0f);
        boolean z9 = this.j0;
        int i7 = this.f0;
        if (z9 && !this.Y.h(canvas, null)) {
            int w02 = org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.wc : org.telegram.ui.ActionBar.m6.ue, kvVar.D);
            Paint paint = this.Z;
            paint.setColor(w02);
            canvas.drawRoundRect(i7, g0.L(10.0f), g0.L(86.0f) + i7, g0.L(96.0f), g0.L(6.0f), g0.L(6.0f), paint);
        }
        this.X.draw(canvas);
        this.a0.setColor(org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.tc : org.telegram.ui.ActionBar.m6.re, kvVar.D));
        this.b0.setColor(org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.gc : org.telegram.ui.ActionBar.m6.be, kvVar.D));
        int L = z9 ? g0.L(97.0f) + i7 : this.e0 + this.g0 + this.h0;
        int L2 = g0.L(11.0f);
        int L3 = g0.L(2.0f) + this.c0.getHeight() + L2;
        canvas.save();
        float f10 = L;
        canvas.translate(f10, L2);
        this.c0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f10, L3);
        this.d0.draw(canvas);
        canvas.restore();
        RectF rectF = this.i0;
        if (document == null || (q1Var = kvVar.E) == null || (l1Var = kvVar.F) == null || !l1Var.a0(q1Var)) {
            rectF.setEmpty();
        } else {
            if (kvVar.E()) {
                org.telegram.ui.ActionBar.h6 h6Var = kvVar.D;
                drawable = h6Var != null ? h6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.m6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.m6.c4;
            }
            int L4 = (this.n0 + this.b.right) - g0.L(32.0f);
            int L5 = g0.L(7.0f);
            drawable.setBounds(L4, L5, drawable.getIntrinsicWidth() + L4, drawable.getIntrinsicHeight() + L5);
            drawable.draw(canvas);
            rectF.set(L4 - g0.L(8.0f), 0.0f, g0.L(8.0f) + drawable.getIntrinsicWidth() + L4, g0.L(54.0f));
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    @Override // org.telegram.messenger.fu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Y(MotionEvent motionEvent) {
        boolean z9;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        float x10 = motionEvent.getX();
        kv kvVar = this.a;
        int i7 = kvVar.S;
        int i10 = kvVar.a;
        float f10 = x10 + i7;
        float y10 = motionEvent.getY();
        boolean contains = this.i0.contains(f10, y10);
        if (motionEvent.getActionMasked() == 0 && contains) {
            this.m0 = true;
            return true;
        }
        boolean z10 = this.m0;
        TLRPC.Document document = this.W;
        if (z10) {
            if (motionEvent.getActionMasked() == 2 && !contains) {
                this.m0 = false;
                return true;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                boolean z11 = motionEvent.getActionMasked() == 1 && contains;
                this.m0 = false;
                if (z11 && document != null && document != null && (q1Var = kvVar.E) != null && (l1Var = kvVar.F) != null && l1Var.a0(q1Var)) {
                    View view = this.V;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    kvVar.F.K(kvVar.E, document, F());
                }
                return true;
            }
        }
        boolean z12 = this.j0;
        if (f10 >= (z12 ? this.f0 : this.e0) && f10 <= this.n0 - g0.L(12.0f) && y10 >= g0.L(10.0f)) {
            if (y10 <= g0.L(z12 ? 96.0f : 53.0f)) {
                z9 = true;
                if (motionEvent.getActionMasked() != 0 && z9) {
                    this.l0 = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.l0) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.l0 = false;
                    }
                    return this.l0;
                }
                this.l0 = false;
                if (z9) {
                    View view2 = this.V;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                    }
                    int i11 = this.k0;
                    if (i11 == 0) {
                        View view3 = this.V;
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
                            g0.t2(j02, w7.B(document), document.mime_type, activity2, kvVar.D, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.X;
                        if (i11 == 1 && document != null) {
                            w7.G(i10).W(document, kvVar.b, 1, 1);
                            this.k0 = 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (i11 == 2 && document != null) {
                            w7.G(i10).f(document);
                            this.k0 = 1;
                            radialProgress2.setIcon(2, false, true);
                        }
                    }
                    View view4 = this.V;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
                return true;
            }
        }
        z9 = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        return this.l0;
    }

    @Override // org.telegram.messenger.x5
    public final int getObserverTag() {
        return this.o0;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.X.p(true, j10 <= 0 ? 0.0f : Math.min(1.0f, j3 / j10));
        if (this.k0 != 2) {
            l0(true);
        }
    }

    public final int i0() {
        kv kvVar = this.a;
        int i7 = kvVar.C;
        int i10 = this.c;
        if (i7 > 0) {
            Rect rect = this.b;
            i10 = Math.min(i10, Math.max(0, (i7 - rect.left) - rect.right));
        }
        return i10 + kvVar.S + kvVar.T;
    }

    public final File j0() {
        TLRPC.Document document = this.W;
        if (document == null) {
            return null;
        }
        kv kvVar = this.a;
        w7.G(kvVar.a);
        File J = w7.J(document, null, false, true);
        if (J != null && J.exists()) {
            return J;
        }
        w7.G(kvVar.a);
        return w7.J(document, null, true, true);
    }

    public final void k0() {
        int i7;
        int i10;
        this.n0 = i0();
        if (this.j0) {
            i7 = g0.L(97.0f);
            i10 = this.f0;
        } else {
            i7 = this.e0 + this.g0;
            i10 = this.h0;
        }
        int e10 = jg.g.e(48.0f, this.n0 - (i7 + i10), g0.L(40.0f));
        kv kvVar = this.a;
        float L = g0.L(kvVar.M - 1);
        TextPaint textPaint = this.a0;
        textPaint.setTextSize(L);
        textPaint.setTypeface(g0.o());
        this.b0.setTextSize(g0.L(kvVar.M - 3));
        TLRPC.Document document = this.W;
        CharSequence ellipsize = TextUtils.ellipsize(document == null ? "" : w7.B(document), textPaint, e10, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = new StaticLayout(ellipsize, this.a0, e10, alignment, 1.0f, 0.0f, false);
        this.d0 = new StaticLayout(document != null ? g0.i0(document.size, false, false) : "", this.b0, e10, alignment, 1.0f, 0.0f, false);
    }

    public final void l0(boolean z9) {
        kv kvVar = this.a;
        RadialProgress2 radialProgress2 = this.X;
        boolean z10 = this.j0;
        if (z10) {
            radialProgress2.g(org.telegram.ui.ActionBar.m6.Ze, org.telegram.ui.ActionBar.m6.af, org.telegram.ui.ActionBar.m6.bf, org.telegram.ui.ActionBar.m6.cf);
            radialProgress2.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vd, kvVar.D);
        } else {
            radialProgress2.g(kvVar.E() ? org.telegram.ui.ActionBar.m6.Bc : org.telegram.ui.ActionBar.m6.We, kvVar.E() ? org.telegram.ui.ActionBar.m6.Cc : org.telegram.ui.ActionBar.m6.Xe, kvVar.E() ? org.telegram.ui.ActionBar.m6.Db : org.telegram.ui.ActionBar.m6.id, kvVar.E() ? org.telegram.ui.ActionBar.m6.Eb : org.telegram.ui.ActionBar.m6.jd);
            radialProgress2.d = org.telegram.ui.ActionBar.m6.w0(kvVar.E() ? org.telegram.ui.ActionBar.m6.rc : org.telegram.ui.ActionBar.m6.pe, kvVar.D);
        }
        String r10 = w7.r(null, this.W);
        File j02 = j0();
        if (j02 != null && j02.exists()) {
            z5.q(kvVar.a).v(this);
            this.k0 = 0;
            radialProgress2.setIcon(z10 ? 4 : 5, false, z9);
        } else if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, z9);
        } else {
            z5.q(kvVar.a).a(r10, null, this);
            if (w7.G(kvVar.a).S(r10)) {
                this.k0 = 2;
                Float w10 = gc.D().w(r10);
                radialProgress2.p(z9, w10 != null ? w10.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z9);
            } else {
                this.k0 = 1;
                radialProgress2.p(z9, 0.0f);
                radialProgress2.setIcon(2, false, z9);
            }
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
