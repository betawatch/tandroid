// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ee5 extends FrameLayout implements tjb {
    public final lm E;
    public boolean F;
    public final lm G;
    public long H;
    public int I;
    public mh8 J;
    public Drawable K;
    public final be0 a;
    public final wb b;
    public final pb0 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final kx2 s;
    public final wf2 w;
    public final boolean x;
    public boolean y;

    public ee5(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.c = new pb0((wjb) null);
        this.h = y6c.t0;
        s33 s33Var = s33.h;
        this.E = new lm(this, 0L, 350L, s33Var);
        this.G = new lm(this, 0L, 350L, s33Var);
        this.I = bkb.c6;
        this.x = z;
        be0 be0Var = new be0(context);
        this.a = be0Var;
        be0Var.setRoundRadius(gl.L(27.0f));
        addView(be0Var, nme.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 21);
        this.b = wbVar;
        kk7.i(wbVar);
        zkb.X(wbVar, bkb.F6, wjbVar);
        wbVar.setTextSize(1, 12.0f);
        wbVar.setMaxLines(1);
        wbVar.setGravity(49);
        wbVar.setLines(1);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(wbVar, nme.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        kx2 kx2Var = new kx2(context, wjbVar);
        this.s = kx2Var;
        addView(kx2Var, nme.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i = bkb.V8;
        int i2 = bkb.T8;
        jx2 jx2Var = kx2Var.a;
        jx2Var.v = i;
        jx2Var.w = i2;
        kx2Var.setGravity(5);
        if (z) {
            wf2 wf2Var = new wf2(21, wjbVar, context);
            this.w = wf2Var;
            wf2Var.b(bkb.A5, bkb.g5, bkb.B5);
            wf2Var.setDrawUnchecked(false);
            wf2Var.setDrawBackgroundAsArc(4);
            wf2Var.setProgressDelegate(new ry4((Object) this, (byte) 8));
            addView(wf2Var, nme.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            wf2Var.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j, boolean z, CharSequence charSequence) {
        if (this.f != j) {
            this.r = false;
            invalidate();
        }
        this.f = j;
        boolean D = cf3.D(j);
        be0 be0Var = this.a;
        int i = this.h;
        pb0 pb0Var = this.c;
        wb wbVar = this.b;
        if (D) {
            TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(j));
            this.e = V1;
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (V1 != null) {
                wbVar.setText(l7c.k(V1, true));
            } else {
                wbVar.setText("");
            }
            pb0Var.q(this.e);
            be0Var.f(this.e, pb0Var);
        } else {
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-j));
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (K0 != null) {
                wbVar.setText(K0.title);
            } else {
                wbVar.setText("");
            }
            pb0Var.p(K0);
            this.e = null;
            be0Var.f(K0, pb0Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i) {
        int i2;
        int i3 = na7.q5;
        int i4 = i & 4;
        int i5 = this.h;
        if (i4 != 0 && this.e != null) {
            this.e = na7.q1(i5).V1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i != 0 && (i & 256) == 0 && (i & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(i5).R.f(this.f);
        kx2 kx2Var = this.s;
        if (dialog == null || (i2 = dialog.unread_count) == 0) {
            this.d = 0;
            kx2Var.a.c(0, this.r);
        } else if (this.d != i2) {
            this.d = i2;
            kx2Var.a.c(i2, this.r);
        }
    }

    public final void c(boolean z) {
        TL_account.RequirementToContact I2 = (!this.y || this.e == null) ? null : na7.q1(this.h).I2(this.e.id);
        boolean z2 = I2 instanceof TL_account.requirementToContactPremium;
        if (this.F == z2 && this.H == cf3.j(I2)) {
            return;
        }
        this.F = z2;
        this.H = cf3.j(I2);
        if (!z) {
            this.E.f(this.F, true);
            this.G.f(this.H > 0, true);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        float d;
        mh8 mh8Var;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.a) {
            if (!this.F && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || na7.q1(i).a0.containsKey(Long.valueOf(this.e.id))) {
                    z = true;
                    if (!this.r) {
                        this.n = z ? 1.0f : 0.0f;
                    }
                    float f = this.n;
                    if (z) {
                        if (f != 0.0f) {
                            float f2 = f - 0.10666667f;
                            this.n = f2;
                            if (f2 < 0.0f) {
                                this.n = 0.0f;
                            }
                            invalidate();
                        }
                    } else if (f != 1.0f) {
                        float f3 = f + 0.10666667f;
                        this.n = f3;
                        if (f3 > 1.0f) {
                            this.n = 1.0f;
                        }
                        invalidate();
                    }
                    d = this.E.d(this.F);
                    if (d <= 0.0f) {
                        float height = (view.getHeight() / 2.0f) + view.getY() + gl.L(18.0f);
                        float width = (view.getWidth() / 2.0f) + view.getX() + gl.L(18.0f);
                        canvas.save();
                        bkb.s0.setColor(bkb.w0(null, this.I, false));
                        canvas.drawCircle(width, height, gl.L(11.33f) * d, bkb.s0);
                        mh8 mh8Var2 = this.J;
                        if (mh8Var2 == null) {
                            mh8 mh8Var3 = new mh8(bkb.Bk, bkb.Ck, -1, -1, null);
                            this.J = mh8Var3;
                            mh8Var = mh8Var3;
                        } else {
                            mh8Var = mh8Var2;
                        }
                        mh8Var.d((int) (width - gl.L(10.0f)), 0.0f, (int) (height - gl.L(10.0f)), (int) (gl.L(10.0f) + width), 0.0f, (int) (gl.L(10.0f) + height));
                        canvas.drawCircle(width, height, gl.L(10.0f) * d, this.J.f);
                        if (this.K == null) {
                            Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                            this.K = mutate;
                            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        }
                        this.K.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.K.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.K.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
                        this.K.setAlpha((int) (d * 255.0f));
                        this.K.draw(canvas);
                        canvas.restore();
                    } else if (this.n != 0.0f) {
                        int L = gl.L(53.0f);
                        int L2 = gl.L(59.0f);
                        canvas.save();
                        float f4 = this.n;
                        float f5 = L2;
                        float f6 = L;
                        canvas.scale(f4, f4, f5, f6);
                        bkb.s0.setColor(bkb.w0(null, this.I, false));
                        canvas.drawCircle(f5, f6, gl.L(7.0f), bkb.s0);
                        bkb.s0.setColor(bkb.w0(null, bkb.S8, false));
                        canvas.drawCircle(f5, f6, gl.L(5.0f), bkb.s0);
                        canvas.restore();
                    }
                    this.r = true;
                }
            }
            z = false;
            if (!this.r) {
            }
            float f7 = this.n;
            if (z) {
            }
            d = this.E.d(this.F);
            if (d <= 0.0f) {
            }
            this.r = true;
        }
        return drawChild;
    }

    public long getDialogId() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.x) {
            be0 be0Var = this.a;
            int measuredWidth = (be0Var.getMeasuredWidth() / 2) + be0Var.getLeft();
            int measuredHeight = (be0Var.getMeasuredHeight() / 2) + be0Var.getTop();
            bkb.n0.setColor(bkb.w0(null, bkb.A5, false));
            bkb.n0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gl.L(28.0f), bkb.n0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(86.0f), TLObject.FLAG_30));
        this.s.a.D = gl.L(13.0f);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            kx2 kx2Var = this.s;
            if (kx2Var != null) {
                kx2Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
