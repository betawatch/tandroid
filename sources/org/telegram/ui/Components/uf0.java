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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class uf0 extends org.telegram.ui.Cells.z implements kn0, org.telegram.messenger.z5, org.telegram.ui.ActionBar.k6 {
    public int D;
    public int E;
    public int F;
    public int G;
    public StaticLayout H;
    public int I;
    public int J;
    public int K;
    public boolean f;
    public org.telegram.messenger.kj h;
    public int n;
    public TextPaint r;
    public ln0 s;
    public eh0 w;
    public int x;
    public int y;

    @Override // org.telegram.messenger.z5
    public final void D(boolean z10) {
        x();
    }

    @Override // org.telegram.messenger.z5
    public final void N(String str) {
        x();
    }

    @Override // org.telegram.ui.Components.kn0
    public final void c(float f7) {
        org.telegram.messenger.kj kjVar = this.h;
        if (kjVar == null) {
            return;
        }
        kjVar.b0 = f7;
        MediaController.B().i0(this.h, f7);
    }

    public final org.telegram.messenger.kj getMessageObject() {
        return this.h;
    }

    @Override // org.telegram.messenger.z5
    public int getObserverTag() {
        return this.K;
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
        this.w.a(Math.min(1.0f, j10 / j11));
        if (this.D != 3) {
            x();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.b6.q(this.n).v(this);
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
        Point point = org.telegram.messenger.i0.q;
        int i10 = point.y;
        int i11 = point.x;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            int measuredWidth = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
            i11 = measuredWidth;
        }
        org.telegram.ui.ActionBar.t6.q3.p((int) getY(), i11, i10);
        org.telegram.ui.ActionBar.c5 c5Var = org.telegram.ui.ActionBar.t6.q3;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (c5Var != null) {
            c5Var.setBounds(0, 0, measuredWidth2, measuredHeight);
        }
        org.telegram.ui.ActionBar.t6.q3.draw(canvas);
        if (this.h == null) {
            return;
        }
        canvas.save();
        int i12 = this.D;
        if (i12 == 0 || i12 == 1) {
            canvas.translate(this.x, this.y);
            this.s.b(canvas);
        } else {
            canvas.translate(org.telegram.messenger.i0.L(12.0f) + this.x, this.y);
            eh0 eh0Var = this.w;
            float f7 = eh0Var.e / 2;
            float f10 = eh0Var.f / 2.0f;
            canvas.drawRect(0.0f, f7 - f10, eh0Var.d, f10 + f7, eh0Var.a);
            float f11 = eh0Var.e / 2;
            canvas.drawRect(0.0f, f11 - f10, eh0Var.c * eh0Var.d, f10 + f11, eh0Var.b);
        }
        canvas.restore();
        int i13 = this.D;
        this.r.setColor(-6182221);
        Drawable drawable = org.telegram.ui.ActionBar.t6.U4[i13][this.G];
        int L = org.telegram.messenger.i0.L(36.0f);
        org.telegram.ui.Cells.z.t(((L - drawable.getIntrinsicWidth()) / 2) + this.E, ((L - drawable.getIntrinsicHeight()) / 2) + this.F, drawable);
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.I, org.telegram.messenger.i0.L(18.0f));
        this.H.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        eh0 eh0Var = this.w;
        if (this.h == null) {
            return;
        }
        this.x = org.telegram.messenger.i0.L(54.0f);
        this.E = org.telegram.messenger.i0.L(10.0f);
        this.I = (getMeasuredWidth() - this.J) - org.telegram.messenger.i0.L(16.0f);
        this.s.i((getMeasuredWidth() - org.telegram.messenger.i0.L(70.0f)) - this.J, org.telegram.messenger.i0.L(30.0f));
        eh0Var.d = (getMeasuredWidth() - org.telegram.messenger.i0.L(94.0f)) - this.J;
        eh0Var.e = org.telegram.messenger.i0.L(30.0f);
        this.y = org.telegram.messenger.i0.L(13.0f);
        this.F = org.telegram.messenger.i0.L(10.0f);
        y();
        if (z10 || !this.f) {
            this.f = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(56.0f));
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
        float y3 = motionEvent.getY();
        boolean e = this.s.e(motionEvent.getX() - this.x, motionEvent.getY() - this.y, motionEvent.getAction());
        if (e) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return e;
        }
        int L = org.telegram.messenger.i0.L(36.0f);
        if (motionEvent.getAction() == 0) {
            if (x10 >= this.E && x10 <= r5 + L) {
                if (y3 >= this.F && y3 <= r0 + L) {
                    this.G = 1;
                    invalidate();
                    e = true;
                }
            }
        } else if (this.G == 1) {
            if (motionEvent.getAction() == 1) {
                this.G = 0;
                playSoundEffect(0);
                int i10 = this.D;
                if (i10 == 0) {
                    boolean S = MediaController.B().S(this.h);
                    if (!this.h.N3()) {
                        TLRPC.Message message = this.h.k;
                        if (message.media_unread && message.peer_id.channel_id == 0) {
                            org.telegram.messenger.wp.r1(this.n).o3(this.h);
                            this.h.k.media_unread = false;
                        }
                    }
                    if (S) {
                        this.D = 1;
                        invalidate();
                    }
                } else if (i10 == 1) {
                    if (MediaController.B().R(this.h, true)) {
                        this.D = 0;
                        invalidate();
                    }
                } else if (i10 == 2) {
                    org.telegram.messenger.b8.G(this.n).X(this.h.F0(), this.h, 1, 0);
                    this.D = 4;
                    invalidate();
                } else if (i10 == 3) {
                    org.telegram.messenger.b8.G(this.n).f(this.h.F0());
                    this.D = 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.G = 0;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                if (x10 >= this.E && x10 <= r3 + L) {
                    if (y3 >= this.F) {
                    }
                }
                this.G = 0;
                invalidate();
            }
        }
        return !e ? super.onTouchEvent(motionEvent) : e;
    }

    public void setMessageObject(org.telegram.messenger.kj kjVar) {
        if (this.h != kjVar) {
            this.n = kjVar.I1;
            ln0 ln0Var = this.s;
            int i10 = org.telegram.ui.ActionBar.t6.ie;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.t6.le;
            ln0Var.g(x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ke, false));
            eh0 eh0Var = this.w;
            eh0Var.a.setColor(-2497813);
            eh0Var.b.setColor(-7944712);
            this.h = kjVar;
            this.f = false;
            requestLayout();
        }
        x();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            ln0 ln0Var = this.s;
            if (ln0Var == null || this.h == null) {
                return;
            }
            int i10 = org.telegram.ui.ActionBar.t6.ie;
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
            int i11 = org.telegram.ui.ActionBar.t6.le;
            ln0Var.g(x02, x03, org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ke, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void x() {
        eh0 eh0Var = this.w;
        String S0 = this.h.S0();
        org.telegram.messenger.b8.G(this.n);
        if (org.telegram.messenger.b8.N(this.h.k, false, true).exists()) {
            org.telegram.messenger.b6.q(this.n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (!I || (I && MediaController.B().H())) {
                this.D = 0;
            } else {
                this.D = 1;
            }
            eh0Var.a(0.0f);
        } else {
            org.telegram.messenger.b6.q(this.n).a(S0, null, this);
            if (org.telegram.messenger.b8.G(this.n).T(S0)) {
                this.D = 3;
                Float w9 = org.telegram.messenger.ic.D().w(S0);
                if (w9 != null) {
                    eh0Var.a(w9.floatValue());
                } else {
                    eh0Var.a(0.0f);
                }
            } else {
                this.D = 2;
                eh0Var.a(0.0f);
            }
        }
        y();
    }

    public final void y() {
        int i10;
        TextPaint textPaint = this.r;
        org.telegram.messenger.kj kjVar = this.h;
        if (kjVar == null) {
            return;
        }
        ln0 ln0Var = this.s;
        if (!ln0Var.e) {
            ln0Var.h(kjVar.b0);
        }
        if (!MediaController.B().I(this.h)) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.h.F0().attributes.size()) {
                    i10 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i11);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i10 = (int) documentAttribute.duration;
                    break;
                }
                i11++;
            }
        } else {
            i10 = this.h.g0;
        }
        String g02 = org.telegram.messenger.i0.g0(i10, true, false);
        this.J = (int) Math.ceil(textPaint.measureText(g02));
        this.H = new StaticLayout(g02, textPaint, this.J, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.kn0
    public final /* synthetic */ void d(float f7) {
    }

    @Override // org.telegram.messenger.z5
    public final void o(long j10, long j11) {
    }
}
