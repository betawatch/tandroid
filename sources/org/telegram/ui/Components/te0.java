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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class te0 extends org.telegram.ui.Cells.z implements lm0, org.telegram.messenger.x5, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public int H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f;
    public org.telegram.messenger.zi h;
    public int n;
    public TextPaint r;
    public mm0 s;
    public eg0 w;
    public int x;
    public int y;

    @Override // org.telegram.messenger.x5
    public final void C(boolean z10) {
        v();
    }

    @Override // org.telegram.messenger.x5
    public final void M(String str) {
        v();
    }

    @Override // org.telegram.ui.Components.lm0
    public final void c(float f10) {
        org.telegram.messenger.zi ziVar = this.h;
        if (ziVar == null) {
            return;
        }
        ziVar.b0 = f10;
        MediaController.B().i0(this.h, f10);
    }

    public final org.telegram.messenger.zi getMessageObject() {
        return this.h;
    }

    @Override // org.telegram.messenger.x5
    public int getObserverTag() {
        return this.L;
    }

    @Override // org.telegram.messenger.x5
    public final void i(long j10, long j11) {
        this.w.a(Math.min(1.0f, j10 / j11));
        if (this.E != 3) {
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
        int i3 = point.y;
        int i10 = point.x;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            int measuredWidth = view.getMeasuredWidth();
            i3 = view.getMeasuredHeight();
            i10 = measuredWidth;
        }
        org.telegram.ui.ActionBar.k6.q3.p((int) getY(), i10, i3);
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
        int i11 = this.E;
        if (i11 == 0 || i11 == 1) {
            canvas.translate(this.x, this.y);
            this.s.b(canvas);
        } else {
            canvas.translate(org.telegram.messenger.g0.L(12.0f) + this.x, this.y);
            eg0 eg0Var = this.w;
            float f10 = eg0Var.e / 2;
            float f11 = eg0Var.f / 2.0f;
            canvas.drawRect(0.0f, f10 - f11, eg0Var.d, f11 + f10, eg0Var.a);
            float f12 = eg0Var.e / 2;
            canvas.drawRect(0.0f, f12 - f11, eg0Var.c * eg0Var.d, f11 + f12, eg0Var.b);
        }
        canvas.restore();
        int i12 = this.E;
        this.r.setColor(-6182221);
        Drawable drawable = org.telegram.ui.ActionBar.k6.U4[i12][this.H];
        int L = org.telegram.messenger.g0.L(36.0f);
        org.telegram.ui.Cells.z.s(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
        drawable.draw(canvas);
        canvas.save();
        canvas.translate(this.J, org.telegram.messenger.g0.L(18.0f));
        this.I.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        eg0 eg0Var = this.w;
        if (this.h == null) {
            return;
        }
        this.x = org.telegram.messenger.g0.L(54.0f);
        this.F = org.telegram.messenger.g0.L(10.0f);
        this.J = (getMeasuredWidth() - this.K) - org.telegram.messenger.g0.L(16.0f);
        this.s.i((getMeasuredWidth() - org.telegram.messenger.g0.L(70.0f)) - this.K, org.telegram.messenger.g0.L(30.0f));
        eg0Var.d = (getMeasuredWidth() - org.telegram.messenger.g0.L(94.0f)) - this.K;
        eg0Var.e = org.telegram.messenger.g0.L(30.0f);
        this.y = org.telegram.messenger.g0.L(13.0f);
        this.G = org.telegram.messenger.g0.L(10.0f);
        w();
        if (z10 || !this.f) {
            this.f = true;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(56.0f));
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
        float y9 = motionEvent.getY();
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
                if (y9 >= this.G && y9 <= r0 + L) {
                    this.H = 1;
                    invalidate();
                    e10 = true;
                }
            }
        } else if (this.H == 1) {
            if (motionEvent.getAction() == 1) {
                this.H = 0;
                playSoundEffect(0);
                int i3 = this.E;
                if (i3 == 0) {
                    boolean S = MediaController.B().S(this.h);
                    if (!this.h.O3()) {
                        TLRPC.Message message = this.h.k;
                        if (message.media_unread && message.peer_id.channel_id == 0) {
                            org.telegram.messenger.hp.s1(this.n).r3(this.h);
                            this.h.k.media_unread = false;
                        }
                    }
                    if (S) {
                        this.E = 1;
                        invalidate();
                    }
                } else if (i3 == 1) {
                    if (MediaController.B().R(this.h, true)) {
                        this.E = 0;
                        invalidate();
                    }
                } else if (i3 == 2) {
                    org.telegram.messenger.w7.G(this.n).X(this.h.F0(), this.h, 1, 0);
                    this.E = 4;
                    invalidate();
                } else if (i3 == 3) {
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
                    if (y9 >= this.G) {
                    }
                }
                this.H = 0;
                invalidate();
            }
        }
        return !e10 ? super.onTouchEvent(motionEvent) : e10;
    }

    public void setMessageObject(org.telegram.messenger.zi ziVar) {
        if (this.h != ziVar) {
            this.n = ziVar.I1;
            mm0 mm0Var = this.s;
            int i3 = org.telegram.ui.ActionBar.k6.ie;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int i10 = org.telegram.ui.ActionBar.k6.le;
            mm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ke, false));
            eg0 eg0Var = this.w;
            eg0Var.a.setColor(-2497813);
            eg0Var.b.setColor(-7944712);
            this.h = ziVar;
            this.f = false;
            requestLayout();
        }
        v();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            mm0 mm0Var = this.s;
            if (mm0Var == null || this.h == null) {
                return;
            }
            int i3 = org.telegram.ui.ActionBar.k6.ie;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
            int i10 = org.telegram.ui.ActionBar.k6.le;
            mm0Var.g(x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ke, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        eg0 eg0Var = this.w;
        String S0 = this.h.S0();
        org.telegram.messenger.w7.G(this.n);
        if (org.telegram.messenger.w7.N(this.h.k, false, true).exists()) {
            org.telegram.messenger.z5.q(this.n).v(this);
            boolean I = MediaController.B().I(this.h);
            if (!I || (I && MediaController.B().H())) {
                this.E = 0;
            } else {
                this.E = 1;
            }
            eg0Var.a(0.0f);
        } else {
            org.telegram.messenger.z5.q(this.n).a(S0, null, this);
            if (org.telegram.messenger.w7.G(this.n).T(S0)) {
                this.E = 3;
                Float w10 = org.telegram.messenger.zb.D().w(S0);
                if (w10 != null) {
                    eg0Var.a(w10.floatValue());
                } else {
                    eg0Var.a(0.0f);
                }
            } else {
                this.E = 2;
                eg0Var.a(0.0f);
            }
        }
        w();
    }

    public final void w() {
        int i3;
        TextPaint textPaint = this.r;
        org.telegram.messenger.zi ziVar = this.h;
        if (ziVar == null) {
            return;
        }
        mm0 mm0Var = this.s;
        if (!mm0Var.e) {
            mm0Var.h(ziVar.b0);
        }
        if (!MediaController.B().I(this.h)) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.h.F0().attributes.size()) {
                    i3 = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i3 = (int) documentAttribute.duration;
                    break;
                }
                i10++;
            }
        } else {
            i3 = this.h.g0;
        }
        String g02 = org.telegram.messenger.g0.g0(i3, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g02));
        this.I = new StaticLayout(g02, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // org.telegram.ui.Components.lm0
    public final /* synthetic */ void d(float f10) {
    }

    @Override // org.telegram.messenger.x5
    public final void o(long j10, long j11) {
    }
}
