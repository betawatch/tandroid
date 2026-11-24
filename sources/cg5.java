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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cg5 extends FrameLayout implements vlb {
    public final ln E;
    public boolean F;
    public final ln G;
    public long H;
    public int I;
    public nj8 J;
    public Drawable K;
    public final bf0 a;
    public final wb b;
    public final pc0 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final uy2 s;
    public final jh2 w;
    public final boolean x;
    public boolean y;

    public cg5(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.c = new pc0((ylb) null);
        this.h = z8c.t0;
        d53 d53Var = d53.h;
        this.E = new ln(this, 0L, 350L, d53Var);
        this.G = new ln(this, 0L, 350L, d53Var);
        this.I = cmb.c6;
        this.x = z;
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(27.0f));
        addView(bf0Var, qoe.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        wb wbVar = new wb(context, (byte) 21);
        this.b = wbVar;
        nm7.i(wbVar);
        anb.X(wbVar, cmb.F6, ylbVar);
        wbVar.setTextSize(1, 12.0f);
        wbVar.setMaxLines(1);
        wbVar.setGravity(49);
        wbVar.setLines(1);
        wbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(wbVar, qoe.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        uy2 uy2Var = new uy2(context, ylbVar);
        this.s = uy2Var;
        addView(uy2Var, qoe.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i = cmb.V8;
        int i2 = cmb.T8;
        ty2 ty2Var = uy2Var.a;
        ty2Var.v = i;
        ty2Var.w = i2;
        uy2Var.setGravity(5);
        if (z) {
            jh2 jh2Var = new jh2(21, ylbVar, context);
            this.w = jh2Var;
            jh2Var.b(cmb.A5, cmb.g5, cmb.B5);
            jh2Var.setDrawUnchecked(false);
            jh2Var.setDrawBackgroundAsArc(4);
            jh2Var.setProgressDelegate(new wx4((Object) this, (byte) 11));
            addView(jh2Var, qoe.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            jh2Var.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j, boolean z, CharSequence charSequence) {
        if (this.f != j) {
            this.r = false;
            invalidate();
        }
        this.f = j;
        boolean D = pg3.D(j);
        bf0 bf0Var = this.a;
        int i = this.h;
        pc0 pc0Var = this.c;
        wb wbVar = this.b;
        if (D) {
            TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j));
            this.e = W1;
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (W1 != null) {
                wbVar.setText(m9c.k(W1, true));
            } else {
                wbVar.setText("");
            }
            pc0Var.q(this.e);
            bf0Var.f(this.e, pc0Var);
        } else {
            TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-j));
            if (charSequence != null) {
                wbVar.setText(charSequence);
            } else if (L0 != null) {
                wbVar.setText(L0.title);
            } else {
                wbVar.setText("");
            }
            pc0Var.p(L0);
            this.e = null;
            bf0Var.f(L0, pc0Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i) {
        int i2;
        int i3 = oc7.s5;
        int i4 = i & 4;
        int i5 = this.h;
        if (i4 != 0 && this.e != null) {
            this.e = oc7.r1(i5).W1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i != 0 && (i & 256) == 0 && (i & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) oc7.r1(i5).R.f(this.f);
        uy2 uy2Var = this.s;
        if (dialog == null || (i2 = dialog.unread_count) == 0) {
            this.d = 0;
            uy2Var.a.c(0, this.r);
        } else if (this.d != i2) {
            this.d = i2;
            uy2Var.a.c(i2, this.r);
        }
    }

    public final void c(boolean z) {
        TL_account.RequirementToContact L2 = (!this.y || this.e == null) ? null : oc7.r1(this.h).L2(this.e.id);
        boolean z2 = L2 instanceof TL_account.requirementToContactPremium;
        if (this.F == z2 && this.H == pg3.j(L2)) {
            return;
        }
        this.F = z2;
        this.H = pg3.j(L2);
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
        nj8 nj8Var;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j);
        if (view == this.a) {
            if (!this.F && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i).getCurrentTime()) || oc7.r1(i).a0.containsKey(Long.valueOf(this.e.id))) {
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
                        float height = (view.getHeight() / 2.0f) + view.getY() + gm.L(18.0f);
                        float width = (view.getWidth() / 2.0f) + view.getX() + gm.L(18.0f);
                        canvas.save();
                        cmb.s0.setColor(cmb.w0(null, this.I, false));
                        canvas.drawCircle(width, height, gm.L(11.33f) * d, cmb.s0);
                        nj8 nj8Var2 = this.J;
                        if (nj8Var2 == null) {
                            nj8 nj8Var3 = new nj8(cmb.Bk, cmb.Ck, -1, -1, null);
                            this.J = nj8Var3;
                            nj8Var = nj8Var3;
                        } else {
                            nj8Var = nj8Var2;
                        }
                        nj8Var.d((int) (width - gm.L(10.0f)), 0.0f, (int) (height - gm.L(10.0f)), (int) (gm.L(10.0f) + width), 0.0f, (int) (gm.L(10.0f) + height));
                        canvas.drawCircle(width, height, gm.L(10.0f) * d, this.J.f);
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
                        int L = gm.L(53.0f);
                        int L2 = gm.L(59.0f);
                        canvas.save();
                        float f4 = this.n;
                        float f5 = L2;
                        float f6 = L;
                        canvas.scale(f4, f4, f5, f6);
                        cmb.s0.setColor(cmb.w0(null, this.I, false));
                        canvas.drawCircle(f5, f6, gm.L(7.0f), cmb.s0);
                        cmb.s0.setColor(cmb.w0(null, cmb.S8, false));
                        canvas.drawCircle(f5, f6, gm.L(5.0f), cmb.s0);
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
            bf0 bf0Var = this.a;
            int measuredWidth = (bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft();
            int measuredHeight = (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop();
            cmb.n0.setColor(cmb.w0(null, cmb.A5, false));
            cmb.n0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, gm.L(28.0f), cmb.n0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(86.0f), TLObject.FLAG_30));
        this.s.a.D = gm.L(13.0f);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            uy2 uy2Var = this.s;
            if (uy2Var != null) {
                uy2Var.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
