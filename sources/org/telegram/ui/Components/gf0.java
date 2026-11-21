package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class gf0 extends org.telegram.ui.Cells.z implements xm0, org.telegram.messenger.y5, org.telegram.ui.ActionBar.b6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f;
    public org.telegram.messenger.fj h;
    public int n;
    public TextPaint r;
    public ym0 s;
    public qg0 w;
    public int x;
    public int y;

    @Override // org.telegram.messenger.y5
    public final void C(boolean z10) {
        v();
    }

    @Override // org.telegram.messenger.y5
    public final void N(String str) {
        v();
    }

    @Override // org.telegram.ui.Components.xm0
    public final void a(float f10) {
        org.telegram.messenger.fj fjVar = this.h;
        if (fjVar == null) {
            return;
        }
        fjVar.b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.fj getMessageObject() {
        return this.h;
    }

    @Override // org.telegram.messenger.y5
    public int getObserverTag() {
        return this.L;
    }

    @Override // org.telegram.messenger.y5
    public final void i(long j3, long j10) {
        this.w.a(Math.min(1.0f, j3 / j10));
        if (this.E != 3) {
            v();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.a6.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h == null) {
            return;
        }
        if (!this.f) {
            requestLayout();
            return;
        }
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.y;
        int i10 = point.x;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            int measuredWidth = view.getMeasuredWidth();
            i7 = view.getMeasuredHeight();
            i10 = measuredWidth;
        }
        org.telegram.ui.ActionBar.m6.q3.o((int) getY(), i10, i7);
        org.telegram.ui.ActionBar.u4 u4Var = org.telegram.ui.ActionBar.m6.q3;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (u4Var != null) {
            u4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
        }
        org.telegram.ui.ActionBar.m6.q3.draw(canvas);
        if (this.h == null) {
            return;
        }
        canvas.save();
        int i11 = this.E;
        if (i11 == 0 || i11 == 1) {
            canvas.translate(this.x, this.y);
            this.s.b(canvas);
        } else {
            canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.x, this.y);
            qg0 qg0Var = this.w;
            float f10 = qg0Var.e / 2;
            float f11 = qg0Var.f / 2.0f;
            canvas.drawRect(0.0f, f10 - f11, qg0Var.d, f11 + f10, qg0Var.a);
            float f12 = qg0Var.e / 2;
            canvas.drawRect(0.0f, f12 - f11, qg0Var.c * qg0Var.d, f11 + f12, qg0Var.b);
        }
        canvas.restore();
        int i12 = this.E;
        this.r.setColor(-6182221);
        Drawable drawable = org.telegram.ui.ActionBar.m6.U4[i12][this.H];
        int L = org.telegram.messenger.g0.L(36.0f);
        org.telegram.ui.Cells.z.s(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.J, org.telegram.messenger.g0.L(18.0f));
        this.I.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        qg0 qg0Var = this.w;
        if (this.h == null) {
            return;
        }
        this.x = org.telegram.messenger.g0.L(54.0f);
        this.F = org.telegram.messenger.g0.L(10.0f);
        this.J = (getMeasuredWidth() - this.K) - org.telegram.messenger.g0.L(16.0f);
        this.s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.K, org.telegram.messenger.g0.L(30.0f));
        qg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.K;
        qg0Var.e = org.telegram.messenger.g0.L(30.0f);
        this.y = org.telegram.messenger.g0.L(13.0f);
        this.G = org.telegram.messenger.g0.L(10.0f);
        w();
        if (z10 || !this.f) {
            this.f = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(56.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        if (r1 <= (r0 + r4)) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        boolean e10 = this.s.e(motionEvent.getX() - this.x, motionEvent.getY() - this.y, motionEvent.getAction());
        if (e10) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return e10;
        }
        int L = org.telegram.messenger.g0.L(36.0f);
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.F && x10 <= r5 + L) {
                if (y10 >= this.G && y10 <= r0 + L) {
                    this.H = 1;
                    invalidate();
                    e10 = true;
                }
            }
        } else if (this.H == 1) {
            if (motionEvent.getAction() == 1) {
                this.H = 0;
                playSoundEffect(0);
                int i7 = this.E;
                if (i7 == 0) {
                    boolean S = MediaController.B().S(this.h);
                    if (!this.h.N3()) {
                        TLRPC.Message message = this.h.k;
                        if (message.media_unread && message.peer_id.channel_id == 0) {
                            org.telegram.messenger.mp.u1(this.n).y3(this.h);
                            this.h.k.media_unread = false;
                        }
                    }
                    if (S) {
                        this.E = 1;
                        invalidate();
                    }
                } else if (i7 == 1) {
                    if (MediaController.B().R(this.h, true)) {
                        this.E = 0;
                        invalidate();
                    }
                } else if (i7 == 2) {
                    org.telegram.messenger.w7.G(this.n).W(this.h.F0(), this.h, 1, 0);
                    this.E = 4;
                    invalidate();
                } else if (i7 == 3) {
                    org.telegram.messenger.w7.G(this.n).f(this.h.F0());
                    this.E = 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.H = 0;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                if (x10 >= this.F && x10 <= r3 + L) {
                    if (y10 >= this.G) {
                    }
                }
                this.H = 0;
                invalidate();
            }
        }
        return !e10 ? super.onTouchEvent(motionEvent) : e10;
    }

    public void setMessageObject(org.telegram.messenger.fj fjVar) {
        if (this.h != fjVar) {
            this.n = fjVar.K1;
            ym0 ym0Var = this.s;
            int i7 = org.telegram.ui.ActionBar.m6.le;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.m6.oe;
            ym0Var.g(x02, x03, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ne, false));
            qg0 qg0Var = this.w;
            qg0Var.a.setColor(-2497813);
            qg0Var.b.setColor(-7944712);
            this.h = fjVar;
            this.f = false;
            requestLayout();
        }
        v();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            ym0 ym0Var = this.s;
            if (ym0Var == null || this.h == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.m6.le;
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.m6.oe;
            ym0Var.g(x02, x03, org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ne, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        qg0 qg0Var = this.w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.n);
        if (org.telegram.messenger.w7.M(this.h.k, false, true).exists()) {
            org.telegram.messenger.a6.q(this.n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (!I || (I && MediaController.B().H())) {
                this.E = 0;
            } else {
                this.E = 1;
            }
            qg0Var.a(0.0f);
        } else {
            org.telegram.messenger.a6.q(this.n).a(S0, null, this);
            if (org.telegram.messenger.w7.G(this.n).S(S0)) {
                this.E = 3;
                Float w10 = org.telegram.messenger.ec.D().w(S0);
                if (w10 != null) {
                    qg0Var.a(w10.floatValue());
                } else {
                    qg0Var.a(0.0f);
                }
            } else {
                this.E = 2;
                qg0Var.a(0.0f);
            }
        }
        w();
    }

    public final void w() {
        int i7;
        TextPaint textPaint = this.r;
        org.telegram.messenger.fj fjVar = this.h;
        if (fjVar == null) {
            return;
        }
        ym0 ym0Var = this.s;
        if (!ym0Var.e) {
            ym0Var.h(fjVar.b0);
        }
        if (!MediaController.B().I(this.h)) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.h.F0().attributes.size()) {
                    i7 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i7 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i7 = this.h.i0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g02));
        this.I = new StaticLayout(g02, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.xm0
    public final /* synthetic */ void g(float f10) {
    }

    @Override // org.telegram.messenger.y5
    public final void o(long j3, long j10) {
    }
}
