package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import di.xb;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.c6 E;
    public boolean F;
    public final org.telegram.ui.Components.c6 G;
    public long H;
    public int I;
    public ug.b1 J;
    public Drawable K;
    public final org.telegram.ui.Components.q9 a;
    public final xb b;
    public final org.telegram.ui.Components.b9 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final rq s;
    public final mp w;
    public final boolean x;
    public boolean y;

    public o4(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        new RectF();
        this.h = j10.t0;
        lr lrVar = lr.h;
        this.E = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 350L, lrVar);
        this.I = org.telegram.ui.ActionBar.n6.d6;
        this.x = z10;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(q9Var, c8.ma.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        xb xbVar = new xb(context, 6);
        this.b = xbVar;
        ks.i(xbVar);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, i6Var);
        xbVar.setTextSize(1, 12.0f);
        xbVar.setMaxLines(1);
        xbVar.setGravity(49);
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(xbVar, c8.ma.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        rq rqVar = new rq(context, i6Var);
        this.s = rqVar;
        addView(rqVar, c8.ma.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.n6.W8;
        int i10 = org.telegram.ui.ActionBar.n6.U8;
        qq qqVar = rqVar.a;
        qqVar.v = i7;
        qqVar.w = i10;
        rqVar.setGravity(5);
        if (z10) {
            mp mpVar = new mp(21, context, i6Var);
            this.w = mpVar;
            mpVar.b(org.telegram.ui.ActionBar.n6.B5, org.telegram.ui.ActionBar.n6.h5, org.telegram.ui.ActionBar.n6.C5);
            mpVar.setDrawUnchecked(false);
            mpVar.setDrawBackgroundAsArc(4);
            mpVar.setProgressDelegate(new da(this, 4));
            addView(mpVar, c8.ma.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            mpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z10, CharSequence charSequence) {
        if (this.f != j3) {
            this.r = false;
            invalidate();
        }
        this.f = j3;
        boolean E = org.telegram.messenger.n5.E(j3);
        org.telegram.ui.Components.q9 q9Var = this.a;
        org.telegram.ui.Components.b9 b9Var = this.c;
        int i7 = this.h;
        xb xbVar = this.b;
        if (E) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(j3));
            this.e = c22;
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (c22 != null) {
                xbVar.setText(o10.k(c22, true));
            } else {
                xbVar.setText("");
            }
            b9Var.r(this.e);
            q9Var.f(this.e, b9Var);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
            if (charSequence != null) {
                xbVar.setText(charSequence);
            } else if (O0 != null) {
                xbVar.setText(O0.title);
            } else {
                xbVar.setText("");
            }
            b9Var.q(O0);
            this.e = null;
            q9Var.f(O0, b9Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = org.telegram.messenger.mp.I8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = org.telegram.messenger.mp.u1(i13).c2(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i7 != 0 && (i7 & 256) == 0 && (i7 & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.mp.u1(i13).R.f(this.f);
        rq rqVar = this.s;
        if (dialog == null || (i10 = dialog.unread_count) == 0) {
            this.d = 0;
            rqVar.a.c(0, this.r);
        } else if (this.d != i10) {
            this.d = i10;
            rqVar.a.c(i10, this.r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact P2 = (!this.y || this.e == null) ? null : org.telegram.messenger.mp.u1(this.h).P2(this.e.id);
        boolean z11 = P2 instanceof TL_account.requirementToContactPremium;
        if (this.F == z11 && this.H == org.telegram.messenger.n5.k(P2)) {
            return;
        }
        this.F = z11;
        this.H = org.telegram.messenger.n5.k(P2);
        if (!z10) {
            this.E.f(this.F, true);
            this.G.f(this.H > 0, true);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        float d;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.a) {
            if (!this.F && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i7 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || org.telegram.messenger.mp.u1(i7).a0.containsKey(Long.valueOf(this.e.id))) {
                    z10 = true;
                    if (!this.r) {
                        this.n = z10 ? 1.0f : 0.0f;
                    }
                    if (z10) {
                        float f10 = this.n;
                        if (f10 != 1.0f) {
                            float f11 = f10 + 0.10666667f;
                            this.n = f11;
                            if (f11 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            d = this.E.d(this.F);
                            if (d > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + org.telegram.messenger.g0.L(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + org.telegram.messenger.g0.L(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, this.I, false));
                                canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.n6.t0);
                                if (this.J == null) {
                                    this.J = new ug.b1(org.telegram.ui.ActionBar.n6.Ck, org.telegram.ui.ActionBar.n6.Dk, -1, -1, null);
                                }
                                this.J.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                                canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, this.J.f);
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
                                int L = org.telegram.messenger.g0.L(53.0f);
                                int L2 = org.telegram.messenger.g0.L(59.0f);
                                canvas.save();
                                float f12 = this.n;
                                float f13 = L2;
                                float f14 = L;
                                canvas.scale(f12, f12, f13, f14);
                                org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, this.I, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(7.0f), org.telegram.ui.ActionBar.n6.t0);
                                org.telegram.ui.ActionBar.n6.t0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.T8, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.n6.t0);
                                canvas.restore();
                            }
                            this.r = true;
                        }
                    }
                    if (!z10) {
                        float f15 = this.n;
                        if (f15 != 0.0f) {
                            float f16 = f15 - 0.10666667f;
                            this.n = f16;
                            if (f16 < 0.0f) {
                                this.n = 0.0f;
                            }
                            invalidate();
                        }
                    }
                    d = this.E.d(this.F);
                    if (d > 0.0f) {
                    }
                    this.r = true;
                }
            }
            z10 = false;
            if (!this.r) {
            }
            if (z10) {
            }
            if (!z10) {
            }
            d = this.E.d(this.F);
            if (d > 0.0f) {
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
            org.telegram.ui.Components.q9 q9Var = this.a;
            int measuredWidth = (q9Var.getMeasuredWidth() / 2) + q9Var.getLeft();
            int measuredHeight = (q9Var.getMeasuredHeight() / 2) + q9Var.getTop();
            org.telegram.ui.ActionBar.n6.o0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
            org.telegram.ui.ActionBar.n6.o0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.n6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
        this.s.a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            rq rqVar = this.s;
            if (rqVar != null) {
                rqVar.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
