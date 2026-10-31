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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class zu extends qu implements z5 {
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

    public zu(vv vvVar, Rect rect, int i10, TL_iv.pageBlockDocument pageblockdocument) {
        super(vvVar, rect, i10);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.Z = new Paint(1);
        this.a0 = new TextPaint(1);
        this.b0 = new TextPaint(1);
        int L = i0.L(16.0f);
        this.e0 = L;
        int L2 = i0.L(9.0f);
        int L3 = i0.L(42.0f);
        this.g0 = L3;
        this.h0 = i0.L(14.0f);
        this.i0 = new RectF();
        this.n0 = -1;
        TLRPC.Document s10 = vvVar.s(pageblockdocument.document_id);
        this.W = s10;
        int L4 = i0.L(10.0f) + vvVar.S;
        this.f0 = L4;
        boolean W2 = jj.W2(s10);
        this.j0 = W2;
        this.o0 = b6.q(vvVar.a).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.X = radialProgress2;
        radialProgress2.setCircleRadius(L3 / 2);
        L = W2 ? ((i0.L(86.0f) - L3) / 2) + L4 : L;
        L2 = W2 ? i0.L(10.0f) + ((i0.L(86.0f) - L3) / 2) : L2;
        radialProgress2.r(L, L2, L + L3, L3 + L2);
        imageReceiver.J0(i0.L(6.0f));
        imageReceiver.z1 = true;
        if (W2) {
            TLRPC.PhotoSize w9 = b8.w(s10.thumbs, zs.r5, false, null, true);
            imageReceiver.y0(L4, i0.L(10.0f), i0.L(86.0f), i0.L(86.0f));
            imageReceiver.q0(w9 != null ? ic.c(w9, s10) : null, "86_86", hc.m(s10.thumbs), null, vvVar.b, 1);
        }
        j0();
        k0(false);
    }

    @Override // org.telegram.messenger.z5
    public final void C(boolean z10) {
        k0(true);
    }

    @Override // org.telegram.messenger.qu
    public final int H() {
        Rect rect = this.b;
        return i0.L(this.j0 ? 106.0f : 60.0f) + rect.top + rect.bottom;
    }

    @Override // org.telegram.messenger.qu
    public final int I() {
        int i10;
        int i11;
        boolean z10 = this.j0;
        vv vvVar = this.a;
        if (z10) {
            i11 = i0.L(86.0f) + (this.f0 - vvVar.S);
        } else {
            StaticLayout staticLayout = this.d0;
            if (staticLayout == null || staticLayout.getLineCount() <= 0) {
                i10 = 0;
            } else {
                StaticLayout staticLayout2 = this.d0;
                i10 = (int) Math.ceil(staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1));
            }
            i11 = (this.e0 - vvVar.S) + this.g0 + this.h0 + i10;
        }
        Rect rect = this.b;
        return rect.left + i11 + rect.right;
    }

    @Override // org.telegram.messenger.qu
    public final int J() {
        TLRPC.Document document = this.W;
        int min = Math.min(this.c, Math.max(i0.L(220.0f), i0.L(48.0f) + (this.j0 ? i0.L(107.0f) : this.e0 + this.g0 + this.h0) + ((int) Math.ceil(Math.max(this.a0.measureText(document == null ? "" : b8.B(document)), this.b0.measureText(document != null ? i0.i0(document.size, false, false) : ""))))));
        Rect rect = this.b;
        return rect.left + min + rect.right;
    }

    @Override // org.telegram.messenger.z5
    public final void M(String str) {
        this.X.p(true, 1.0f);
        k0(true);
    }

    @Override // org.telegram.messenger.qu
    public final void S() {
        View view = this.V;
        ImageReceiver imageReceiver = this.Y;
        if (view != null) {
            this.X.n(view);
            imageReceiver.H0(this.V);
        }
        imageReceiver.P();
        k0(false);
    }

    @Override // org.telegram.messenger.qu
    public final void U() {
        this.Y.R();
        b6.q(this.a.a).v(this);
    }

    @Override // org.telegram.messenger.qu
    public final void V(Canvas canvas) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        Drawable drawable;
        TLRPC.Document document = this.W;
        if (document == null) {
            return;
        }
        if (this.n0 != h0()) {
            j0();
        }
        canvas.save();
        vv vvVar = this.a;
        canvas.translate(-vvVar.S, 0.0f);
        boolean z10 = this.j0;
        int i10 = this.f0;
        if (z10 && !this.Y.h(canvas, null)) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.wc : org.telegram.ui.ActionBar.t6.ue, vvVar.D);
            Paint paint = this.Z;
            paint.setColor(w02);
            canvas.drawRoundRect(i10, i0.L(10.0f), i0.L(86.0f) + i10, i0.L(96.0f), i0.L(6.0f), i0.L(6.0f), paint);
        }
        this.X.draw(canvas);
        this.a0.setColor(org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.tc : org.telegram.ui.ActionBar.t6.re, vvVar.D));
        this.b0.setColor(org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.gc : org.telegram.ui.ActionBar.t6.be, vvVar.D));
        int L = z10 ? i0.L(97.0f) + i10 : this.e0 + this.g0 + this.h0;
        int L2 = i0.L(11.0f);
        int L3 = i0.L(2.0f) + this.c0.getHeight() + L2;
        canvas.save();
        float f7 = L;
        canvas.translate(f7, L2);
        this.c0.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f7, L3);
        this.d0.draw(canvas);
        canvas.restore();
        RectF rectF = this.i0;
        if (document == null || (q1Var = vvVar.E) == null || (l1Var = vvVar.F) == null || !l1Var.Z(q1Var)) {
            rectF.setEmpty();
        } else {
            if (vvVar.E()) {
                org.telegram.ui.ActionBar.p6 p6Var = vvVar.D;
                drawable = p6Var != null ? p6Var.getDrawable("drawableMsgOutMenu") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.t6.R0("drawableMsgOutMenu");
                }
            } else {
                drawable = org.telegram.ui.ActionBar.t6.c4;
            }
            int L4 = (this.n0 + this.b.right) - i0.L(32.0f);
            int L5 = i0.L(7.0f);
            drawable.setBounds(L4, L5, drawable.getIntrinsicWidth() + L4, drawable.getIntrinsicHeight() + L5);
            drawable.draw(canvas);
            rectF.set(L4 - i0.L(8.0f), 0.0f, i0.L(8.0f) + drawable.getIntrinsicWidth() + L4, i0.L(54.0f));
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x015b  */
    @Override // org.telegram.messenger.qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean X(MotionEvent motionEvent) {
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.ui.Cells.l1 l1Var;
        float x10 = motionEvent.getX();
        vv vvVar = this.a;
        int i10 = vvVar.S;
        int i11 = vvVar.a;
        float f7 = x10 + i10;
        float y3 = motionEvent.getY();
        boolean contains = this.i0.contains(f7, y3);
        if (motionEvent.getActionMasked() == 0 && contains) {
            this.m0 = true;
            return true;
        }
        boolean z11 = this.m0;
        TLRPC.Document document = this.W;
        if (z11) {
            if (motionEvent.getActionMasked() == 2 && !contains) {
                this.m0 = false;
                return true;
            }
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                boolean z12 = motionEvent.getActionMasked() == 1 && contains;
                this.m0 = false;
                if (z12 && document != null && document != null && (q1Var = vvVar.E) != null && (l1Var = vvVar.F) != null && l1Var.Z(q1Var)) {
                    View view = this.V;
                    if (view != null) {
                        view.playSoundEffect(0);
                    }
                    vvVar.E.getTextX();
                    Rect rect = this.b;
                    int i12 = rect.left;
                    int i13 = rect.right;
                    i0.L(32.0f);
                    vvVar.E.getTextY();
                    i0.L(7.0f);
                    vvVar.F.Z0(vvVar.E, document);
                }
                return true;
            }
        }
        boolean z13 = this.j0;
        if (f7 >= (z13 ? this.f0 : this.e0) && f7 <= this.n0 - i0.L(12.0f) && y3 >= i0.L(10.0f)) {
            if (y3 <= i0.L(z13 ? 96.0f : 53.0f)) {
                z10 = true;
                if (motionEvent.getActionMasked() != 0 && z10) {
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
                if (z10) {
                    View view2 = this.V;
                    if (view2 != null) {
                        view2.playSoundEffect(0);
                    }
                    int i14 = this.k0;
                    if (i14 == 0) {
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
                        File i02 = i0();
                        if (activity2 != null && i02 != null) {
                            i0.t2(i02, b8.B(document), document.mime_type, activity2, vvVar.D, false);
                        }
                    } else {
                        RadialProgress2 radialProgress2 = this.X;
                        if (i14 == 1 && document != null) {
                            b8.G(i11).X(document, vvVar.b, 1, 1);
                            this.k0 = 2;
                            radialProgress2.setIcon(3, true, true);
                        } else if (i14 == 2 && document != null) {
                            b8.G(i11).f(document);
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
        z10 = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        return this.l0;
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.o0;
    }

    public final int h0() {
        vv vvVar = this.a;
        int i10 = vvVar.C;
        int i11 = this.c;
        if (i10 > 0) {
            Rect rect = this.b;
            i11 = Math.min(i11, Math.max(0, (i10 - rect.left) - rect.right));
        }
        return i11 + vvVar.S + vvVar.T;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.X.p(true, j11 <= 0 ? 0.0f : Math.min(1.0f, j10 / j11));
        if (this.k0 != 2) {
            k0(true);
        }
    }

    public final File i0() {
        TLRPC.Document document = this.W;
        if (document == null) {
            return null;
        }
        vv vvVar = this.a;
        b8.G(vvVar.a);
        File K = b8.K(document, null, false, true);
        if (K != null && K.exists()) {
            return K;
        }
        b8.G(vvVar.a);
        return b8.K(document, null, true, true);
    }

    public final void j0() {
        int i10;
        int i11;
        this.n0 = h0();
        if (this.j0) {
            i10 = i0.L(97.0f);
            i11 = this.f0;
        } else {
            i10 = this.e0 + this.g0;
            i11 = this.h0;
        }
        int d = i0.a.d(48.0f, this.n0 - (i10 + i11), i0.L(40.0f));
        vv vvVar = this.a;
        float L = i0.L(vvVar.M - 1);
        TextPaint textPaint = this.a0;
        textPaint.setTextSize(L);
        textPaint.setTypeface(i0.o());
        this.b0.setTextSize(i0.L(vvVar.M - 3));
        TLRPC.Document document = this.W;
        CharSequence ellipsize = TextUtils.ellipsize(document == null ? "" : b8.B(document), textPaint, d, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.c0 = new StaticLayout(ellipsize, this.a0, d, alignment, 1.0f, 0.0f, false);
        this.d0 = new StaticLayout(document != null ? i0.i0(document.size, false, false) : "", this.b0, d, alignment, 1.0f, 0.0f, false);
    }

    public final void k0(boolean z10) {
        vv vvVar = this.a;
        RadialProgress2 radialProgress2 = this.X;
        boolean z11 = this.j0;
        if (z11) {
            radialProgress2.g(org.telegram.ui.ActionBar.t6.Ze, org.telegram.ui.ActionBar.t6.af, org.telegram.ui.ActionBar.t6.bf, org.telegram.ui.ActionBar.t6.cf);
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vd, vvVar.D);
        } else {
            radialProgress2.g(vvVar.E() ? org.telegram.ui.ActionBar.t6.Bc : org.telegram.ui.ActionBar.t6.We, vvVar.E() ? org.telegram.ui.ActionBar.t6.Cc : org.telegram.ui.ActionBar.t6.Xe, vvVar.E() ? org.telegram.ui.ActionBar.t6.Db : org.telegram.ui.ActionBar.t6.id, vvVar.E() ? org.telegram.ui.ActionBar.t6.Eb : org.telegram.ui.ActionBar.t6.jd);
            radialProgress2.d = org.telegram.ui.ActionBar.t6.w0(vvVar.E() ? org.telegram.ui.ActionBar.t6.rc : org.telegram.ui.ActionBar.t6.pe, vvVar.D);
        }
        String r10 = b8.r(null, this.W);
        File i02 = i0();
        if (i02 != null && i02.exists()) {
            b6.q(vvVar.a).v(this);
            this.k0 = 0;
            radialProgress2.setIcon(z11 ? 4 : 5, false, z10);
        } else if (TextUtils.isEmpty(r10)) {
            radialProgress2.setIcon(4, false, z10);
        } else {
            b6.q(vvVar.a).a(r10, null, this);
            if (b8.G(vvVar.a).T(r10)) {
                this.k0 = 2;
                Float w9 = hc.D().w(r10);
                radialProgress2.p(z10, w9 != null ? w9.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z10);
            } else {
                this.k0 = 1;
                radialProgress2.p(z10, 0.0f);
                radialProgress2.setIcon(2, false, z10);
            }
        }
        View view = this.V;
        if (view != null) {
            view.invalidate();
        }
    }

    @Override // org.telegram.messenger.z5
    public final void n(long j10, long j11) {
    }
}
