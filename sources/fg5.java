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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class fg5 extends FrameLayout implements snb {
    public final mm E;
    public boolean F;
    public final mm G;
    public long H;
    public int I;
    public al8 J;
    public Drawable K;
    public final de0 a;
    public final xb b;
    public final rb0 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final ey2 s;
    public final og2 w;
    public final boolean x;
    public boolean y;

    public fg5(vnb vnbVar, Context context, boolean z) {
        super(context);
        this.c = new rb0((vnb) null);
        this.h = yac.t0;
        k43 k43Var = k43.h;
        this.E = new mm(this, 0L, 350L, k43Var);
        this.G = new mm(this, 0L, 350L, k43Var);
        this.I = aob.d6;
        this.x = z;
        de0 de0Var = new de0(context);
        this.a = de0Var;
        de0Var.setRoundRadius(hl.L(27.0f));
        addView(de0Var, tre.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        xb xbVar = new xb(context, (byte) 21);
        this.b = xbVar;
        jn7.i(xbVar);
        yob.X(xbVar, aob.G6, vnbVar);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(1);
        xbVar.setGravity(49);
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, tre.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        ey2 ey2Var = new ey2(context, vnbVar);
        this.s = ey2Var;
        addView(ey2Var, tre.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i = aob.W8;
        int i2 = aob.U8;
        dy2 dy2Var = ey2Var.a;
        dy2Var.v = i;
        dy2Var.w = i2;
        ey2Var.setGravity(5);
        if (z) {
            og2 og2Var = new og2(21, vnbVar, context);
            this.w = og2Var;
            og2Var.b(aob.B5, aob.h5, aob.C5);
            og2Var.setDrawUnchecked(false);
            og2Var.setDrawBackgroundAsArc(4);
            og2Var.setProgressDelegate(new e05((Object) this, (byte) 10));
            addView(og2Var, tre.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            og2Var.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j, boolean z, CharSequence charSequence) {
        if (this.f != j) {
            this.r = false;
            invalidate();
        }
        this.f = j;
        boolean D = wf3.D(j);
        de0 de0Var = this.a;
        int i = this.h;
        rb0 rb0Var = this.c;
        xb xbVar = this.b;
        if (D) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            this.e = X1;
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (X1 != null) {
                xbVar.setText(lbc.k(X1, true));
            } else {
                xbVar.setText("");
            }
            rb0Var.q(this.e);
            de0Var.f(this.e, rb0Var);
        } else {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (M0 != null) {
                xbVar.setText(M0.title);
            } else {
                xbVar.setText("");
            }
            rb0Var.p(M0);
            this.e = null;
            de0Var.f(M0, rb0Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i) {
        int i2;
        int i3 = uc7.r5;
        int i4 = i & 4;
        int i5 = this.h;
        if (i4 != 0 && this.e != null) {
            this.e = uc7.s1(i5).X1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i != 0 && (i & 256) == 0 && (i & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(i5).R.f(this.f);
        ey2 ey2Var = this.s;
        if (dialog == null || (i2 = dialog.unread_count) == 0) {
            this.d = 0;
            ey2Var.a.c(0, this.r);
        } else if (this.d != i2) {
            this.d = i2;
            ey2Var.a.c(i2, this.r);
        }
    }

    public final void c(boolean z) {
        TL_account.RequirementToContact P2 = (!this.y || this.e == null) ? null : uc7.s1(this.h).P2(this.e.id);
        boolean z2 = P2 instanceof TL_account.requirementToContactPremium;
        if (this.F == z2 && this.H == wf3.j(P2)) {
            return;
        }
        this.F = z2;
        this.H = wf3.j(P2);
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
        al8 al8Var;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.a) {
            if (!this.F && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || uc7.s1(i).a0.containsKey(Long.valueOf(this.e.id))) {
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
                        float height = (view.getHeight() / 2.0f) + view.getY() + hl.L(18.0f);
                        float width = (view.getWidth() / 2.0f) + view.getX() + hl.L(18.0f);
                        canvas.save();
                        aob.s0.setColor(aob.w0(null, this.I, false));
                        canvas.drawCircle(width, height, hl.L(11.33f) * d, aob.s0);
                        al8 al8Var2 = this.J;
                        if (al8Var2 == null) {
                            al8 al8Var3 = new al8(aob.Ck, aob.Dk, -1, -1, null);
                            this.J = al8Var3;
                            al8Var = al8Var3;
                        } else {
                            al8Var = al8Var2;
                        }
                        al8Var.d((int) (width - hl.L(10.0f)), 0.0f, (int) (height - hl.L(10.0f)), (int) (hl.L(10.0f) + width), 0.0f, (int) (hl.L(10.0f) + height));
                        canvas.drawCircle(width, height, hl.L(10.0f) * d, this.J.f);
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
                        int L = hl.L(53.0f);
                        int L2 = hl.L(59.0f);
                        canvas.save();
                        float f4 = this.n;
                        float f5 = L2;
                        float f6 = L;
                        canvas.scale(f4, f4, f5, f6);
                        aob.s0.setColor(aob.w0(null, this.I, false));
                        canvas.drawCircle(f5, f6, hl.L(7.0f), aob.s0);
                        aob.s0.setColor(aob.w0(null, aob.T8, false));
                        canvas.drawCircle(f5, f6, hl.L(5.0f), aob.s0);
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
            de0 de0Var = this.a;
            int measuredWidth = (de0Var.getMeasuredWidth() / 2) + de0Var.getLeft();
            int measuredHeight = (de0Var.getMeasuredHeight() / 2) + de0Var.getTop();
            aob.n0.setColor(aob.w0(null, aob.B5, false));
            aob.n0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, hl.L(28.0f), aob.n0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), TLObject.FLAG_30));
        this.s.a.D = hl.L(13.0f);
    }

    @Override // snb
    public final void updateColors() {
        try {
            ey2 ey2Var = this.s;
            if (ey2Var != null) {
                ey2Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
