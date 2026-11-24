// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class if8 extends hf0 implements wu9, sp3, tjb {
    public byte E;
    public int F;
    public int G;
    public boolean H;
    public StaticLayout I;
    public int J;
    public int K;
    public int L;
    public boolean f;
    public k27 h;
    public int n;
    public TextPaint r;
    public xu9 s;
    public ms8 w;
    public int x;
    public int y;

    @Override // sp3
    public final void B(boolean z) {
        x();
    }

    @Override // sp3
    public final void N(String str) {
        x();
    }

    @Override // wu9
    public final void f(float f) {
        k27 k27Var = this.h;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(this.h, f);
    }

    public final k27 getMessageObject() {
        return this.h;
    }

    @Override // sp3
    public int getObserverTag() {
        return this.L;
    }

    @Override // sp3
    public final void i(long j, long j2) {
        this.w.a(Math.min(1.0f, j / j2));
        if (this.E != 3) {
            x();
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        up3.q(this.n).v(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.h != null) {
            if (!this.f) {
                requestLayout();
                return;
            }
            Point point = gl.q;
            int i = point.y;
            int i2 = point.x;
            if (getParent() instanceof View) {
                View view = (View) getParent();
                int measuredWidth = view.getMeasuredWidth();
                i = view.getMeasuredHeight();
                i2 = measuredWidth;
            }
            bkb.p3.o((int) getY(), i2, i);
            m17 m17Var = bkb.p3;
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (m17Var != null) {
                m17Var.setBounds(0, 0, measuredWidth2, measuredHeight);
            }
            bkb.p3.draw(canvas);
            if (this.h == null) {
                return;
            }
            canvas.save();
            byte b = this.E;
            if (b == 0 || b == 1) {
                canvas.translate(this.x, this.y);
                this.s.b(canvas);
            } else {
                canvas.translate(gl.L(12.0f) + this.x, this.y);
                ms8 ms8Var = this.w;
                float f = ms8Var.e / 2;
                float f2 = ms8Var.f / 2.0f;
                canvas.drawRect(0.0f, f - f2, ms8Var.d, f2 + f, ms8Var.a);
                float f3 = ms8Var.e / 2;
                canvas.drawRect(0.0f, f3 - f2, ms8Var.c * ms8Var.d, f2 + f3, ms8Var.b);
            }
            canvas.restore();
            byte b2 = this.E;
            this.r.setColor(-6182221);
            Drawable drawable = bkb.T4[b2][this.H ? 1 : 0];
            int L = gl.L(36.0f);
            hf0.t(((L - drawable.getIntrinsicWidth()) / 2) + this.F, ((L - drawable.getIntrinsicHeight()) / 2) + this.G, drawable);
            drawable.draw(canvas);
            canvas.save();
            canvas.translate(this.J, gl.L(18.0f));
            this.I.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ms8 ms8Var = this.w;
        if (this.h != null) {
            this.x = gl.L(54.0f);
            this.F = gl.L(10.0f);
            this.J = (getMeasuredWidth() - this.K) - gl.L(16.0f);
            this.s.h((getMeasuredWidth() - gl.L(70.0f)) - this.K, gl.L(30.0f));
            ms8Var.d = (getMeasuredWidth() - gl.L(94.0f)) - this.K;
            ms8Var.e = gl.L(30.0f);
            this.y = gl.L(13.0f);
            this.G = gl.L(10.0f);
            y();
            if (z || !this.f) {
                this.f = true;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(56.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0129, code lost:
    
        if (r1 <= (r0 + r4)) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean e = this.s.e(motionEvent.getX() - this.x, motionEvent.getY() - this.y, motionEvent.getAction());
        if (e) {
            if (motionEvent.getAction() == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            invalidate();
            return e;
        }
        int L = gl.L(36.0f);
        if (motionEvent.getAction() == 0) {
            if (x >= this.F && x <= r5 + L) {
                if (y >= this.G && y <= r0 + L) {
                    this.H = true;
                    invalidate();
                    e = true;
                }
            }
        } else if (this.H) {
            if (motionEvent.getAction() == 1) {
                this.H = false;
                playSoundEffect(0);
                byte b = this.E;
                if (b == 0) {
                    boolean R = MediaController.w().R(this.h);
                    if (!this.h.N3()) {
                        TLRPC.Message message = this.h.k;
                        if (message.media_unread && message.peer_id.channel_id == 0) {
                            na7.q1(this.n).t3(this.h);
                            this.h.k.media_unread = false;
                        }
                    }
                    if (R) {
                        this.E = (byte) 1;
                        invalidate();
                    }
                } else if (b == 1) {
                    if (MediaController.w().Q(this.h, true)) {
                        this.E = (byte) 0;
                        invalidate();
                    }
                } else if (b == 2) {
                    ba4.G(this.n).X(this.h.F0(), this.h, 1, 0);
                    this.E = (byte) 4;
                    invalidate();
                } else if (b == 3) {
                    ba4.G(this.n).f(this.h.F0());
                    this.E = (byte) 2;
                    invalidate();
                }
                invalidate();
            } else if (motionEvent.getAction() == 3) {
                this.H = false;
                invalidate();
            } else if (motionEvent.getAction() == 2) {
                if (x >= this.F && x <= r3 + L) {
                    if (y >= this.G) {
                    }
                }
                this.H = false;
                invalidate();
            }
        }
        return !e ? super.onTouchEvent(motionEvent) : e;
    }

    public void setMessageObject(k27 k27Var) {
        if (this.h != k27Var) {
            this.n = k27Var.K1;
            xu9 xu9Var = this.s;
            int i = bkb.ke;
            int w0 = bkb.w0(null, i, false);
            int w02 = bkb.w0(null, i, false);
            int i2 = bkb.ne;
            xu9Var.f(w0, w02, bkb.w0(null, i2, false), bkb.w0(null, i2, false), bkb.w0(null, bkb.me, false));
            ms8 ms8Var = this.w;
            ms8Var.a.setColor(-2497813);
            ms8Var.b.setColor(-7944712);
            this.h = k27Var;
            this.f = false;
            requestLayout();
        }
        x();
    }

    @Override // tjb
    public final void updateColors() {
        try {
            xu9 xu9Var = this.s;
            if (xu9Var == null || this.h == null) {
                return;
            }
            int i = bkb.ke;
            int w0 = bkb.w0(null, i, false);
            int w02 = bkb.w0(null, i, false);
            int i2 = bkb.ne;
            xu9Var.f(w0, w02, bkb.w0(null, i2, false), bkb.w0(null, i2, false), bkb.w0(null, bkb.me, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void x() {
        ms8 ms8Var = this.w;
        String S0 = this.h.S0();
        ba4.G(this.n);
        boolean exists = ba4.M(this.h.k, false, true).exists();
        int i = this.n;
        if (exists) {
            up3.q(i).v(this);
            boolean D = MediaController.w().D(this.h);
            if (!D || (D && MediaController.w().C())) {
                this.E = (byte) 0;
            } else {
                this.E = (byte) 1;
            }
            ms8Var.a(0.0f);
        } else {
            up3.q(i).a(S0, null, this);
            if (ba4.G(this.n).S(S0)) {
                this.E = (byte) 3;
                Float s = fl5.z().s(S0);
                if (s != null) {
                    ms8Var.a(s.floatValue());
                } else {
                    ms8Var.a(0.0f);
                }
            } else {
                this.E = (byte) 2;
                ms8Var.a(0.0f);
            }
        }
        y();
    }

    public final void y() {
        int i;
        TextPaint textPaint = this.r;
        k27 k27Var = this.h;
        if (k27Var == null) {
            return;
        }
        xu9 xu9Var = this.s;
        if (!xu9Var.e) {
            xu9Var.g(k27Var.b0);
        }
        if (!MediaController.w().D(this.h)) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.h.F0().attributes.size()) {
                    i = 0;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = this.h.F0().attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    i = (int) documentAttribute.duration;
                    break;
                }
                i2++;
            }
        } else {
            i = this.h.i0;
        }
        String g0 = gl.g0(i, true, false);
        this.K = (int) Math.ceil(textPaint.measureText(g0));
        this.I = new StaticLayout(g0, textPaint, this.K, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override // wu9
    public final void h(float f) {
    }

    @Override // sp3
    public final void l(long j, long j2) {
    }
}
