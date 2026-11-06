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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class re0 extends org.telegram.ui.Cells.z implements im0, org.telegram.messenger.x5, org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f;
    public org.telegram.messenger.ij h;
    public int n;
    public TextPaint r;
    public jm0 s;
    public bg0 w;
    public int x;
    public int y;

    @Override // org.telegram.messenger.x5
    public final void C(boolean z9) {
        v();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        v();
    }

    @Override // org.telegram.ui.Components.im0
    public final void a(float f10) {
        org.telegram.messenger.ij ijVar = this.h;
        if (ijVar == null) {
            return;
        }
        ijVar.b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.ij getMessageObject() {
        return this.h;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.K;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j3, long j10) {
        this.w.a(Math.min(1.0f, j3 / j10));
        if (this.D != 3) {
            v();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.z5.q(this.n).v(this);
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
        org.telegram.ui.ActionBar.k6.q3.p((int) getY(), i10, i7);
        org.telegram.ui.ActionBar.t4 t4Var = org.telegram.ui.ActionBar.k6.q3;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (t4Var != null) {
            t4Var.setBounds(0, 0, measuredWidth2, measuredHeight);
        }
        org.telegram.ui.ActionBar.k6.q3.draw(canvas);
        if (this.h == null) {
            return;
        }
        canvas.save();
        int i11 = this.D;
        if (i11 == 0 || i11 == 1) {
            canvas.translate(this.x, this.y);
            this.s.b(canvas);
        } else {
            canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.x, this.y);
            bg0 bg0Var = this.w;
            float f10 = bg0Var.e / 2;
            float f11 = bg0Var.f / 2.0f;
            canvas.drawRect(0.0f, f10 - f11, bg0Var.d, f11 + f10, bg0Var.a);
            float f12 = bg0Var.e / 2;
            canvas.drawRect(0.0f, f12 - f11, bg0Var.c * bg0Var.d, f11 + f12, bg0Var.b);
        }
        canvas.restore();
        int i12 = this.D;
        this.r.setColor(-6182221);
        Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i12][this.G];
        int L = org.telegram.messenger.g0.L(36.0f);
        org.telegram.ui.Cells.z.s(((L - drawable.getIntrinsicWidth()) / 2) + this.E, ((L - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.I, org.telegram.messenger.g0.L(18.0f));
        this.H.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        bg0 bg0Var = this.w;
        if (this.h == null) {
            return;
        }
        this.x = org.telegram.messenger.g0.L(54.0f);
        this.E = org.telegram.messenger.g0.L(10.0f);
        this.I = (getMeasuredWidth() - this.J) - org.telegram.messenger.g0.L(16.0f);
        this.s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.J, org.telegram.messenger.g0.L(30.0f));
        bg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.J;
        bg0Var.e = org.telegram.messenger.g0.L(30.0f);
        this.y = org.telegram.messenger.g0.L(13.0f);
        this.F = org.telegram.messenger.g0.L(10.0f);
        w();
        if (z9 || !this.f) {
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
            if (x10 >= this.E && x10 <= r5 + L) {
                if (y10 >= this.F && y10 <= r0 + L) {
                    this.G = 1;
                    invalidate();
                    e10 = true;
                }
            }
        } else if (this.G == 1) {
            if (motionEvent.getAction() == 1) {
                this.G = 0;
                playSoundEffect(0);
                int i7 = this.D;
                if (i7 == 0) {
                    boolean S = MediaController.B().S(this.h);
                    if (!this.h.O3()) {
                        TLRPC.Message message = this.h.k;
                        if (message.media_unread && message.peer_id.channel_id == 0) {
                            org.telegram.messenger.qp.s1(this.n).r3(this.h);
                            this.h.k.media_unread = false;
                        }
                    }
                    if (S) {
                        this.D = 1;
                        invalidate();
                    }
                } else if (i7 == 1) {
                    if (MediaController.B().R(this.h, true)) {
                        this.D = 0;
                        invalidate();
                    }
                } else if (i7 == 2) {
                    org.telegram.messenger.w7.G(this.n).X(this.h.F0(), this.h, 1, 0);
                    this.D = 4;
                    invalidate();
                } else if (i7 == 3) {
                    org.telegram.messenger.w7.G(this.n).f(this.h.F0());
                    this.D = 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.G = 0;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                if (x10 >= this.E && x10 <= r3 + L) {
                    if (y10 >= this.F) {
                    }
                }
                this.G = 0;
                invalidate();
            }
        }
        return !e10 ? super.onTouchEvent(motionEvent) : e10;
    }

    public void setMessageObject(org.telegram.messenger.ij ijVar) {
        if (this.h != ijVar) {
            this.n = ijVar.I1;
            jm0 jm0Var = this.s;
            int i7 = org.telegram.ui.ActionBar.k6.ie;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.k6.le;
            jm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ke, false));
            bg0 bg0Var = this.w;
            bg0Var.a.setColor(-2497813);
            bg0Var.b.setColor(-7944712);
            this.h = ijVar;
            this.f = false;
            requestLayout();
        }
        v();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            jm0 jm0Var = this.s;
            if (jm0Var == null || this.h == null) {
                return;
            }
            int i7 = org.telegram.ui.ActionBar.k6.ie;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
            int i10 = org.telegram.ui.ActionBar.k6.le;
            jm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ke, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        bg0 bg0Var = this.w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.n);
        if (org.telegram.messenger.w7.N(this.h.k, false, true).exists()) {
            org.telegram.messenger.z5.q(this.n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (!I || (I && MediaController.B().H())) {
                this.D = 0;
            } else {
                this.D = 1;
            }
            bg0Var.a(0.0f);
        } else {
            org.telegram.messenger.z5.q(this.n).a(S0, null, this);
            if (org.telegram.messenger.w7.G(this.n).T(S0)) {
                this.D = 3;
                Float w10 = org.telegram.messenger.gc.D().w(S0);
                if (w10 != null) {
                    bg0Var.a(w10.floatValue());
                } else {
                    bg0Var.a(0.0f);
                }
            } else {
                this.D = 2;
                bg0Var.a(0.0f);
            }
        }
        w();
    }

    public final void w() {
        int i7;
        TextPaint textPaint = this.r;
        org.telegram.messenger.ij ijVar = this.h;
        if (ijVar == null) {
            return;
        }
        jm0 jm0Var = this.s;
        if (!jm0Var.e) {
            jm0Var.h(ijVar.b0);
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
            i7 = this.h.g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i7, true, false);
        this.J = (int) Math.ceil(textPaint.measureText(g02));
        this.H = new StaticLayout(g02, textPaint, this.J, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.im0
    public final /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j3, long j10) {
    }
}
