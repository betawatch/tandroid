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
import b8.mf;
import ci.ec;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public boolean F;
    public final org.telegram.ui.Components.u5 G;
    public long H;
    public int I;
    public vg.x0 J;
    public Drawable K;
    public final org.telegram.ui.Components.k9 a;
    public final ec b;
    public final org.telegram.ui.Components.u8 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final dq s;
    public final wo w;
    public final boolean x;
    public boolean y;

    public o4(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        new RectF();
        this.h = h10.t0;
        xq xqVar = xq.h;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.G = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.I = org.telegram.ui.ActionBar.k6.d6;
        this.x = z10;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(k9Var, mf.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ec ecVar = new ec(context, 6);
        this.b = ecVar;
        hs.i(ecVar);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, e6Var);
        ecVar.setTextSize(1, 12.0f);
        ecVar.setMaxLines(1);
        ecVar.setGravity(49);
        ecVar.setLines(1);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(ecVar, mf.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        dq dqVar = new dq(context, e6Var);
        this.s = dqVar;
        addView(dqVar, mf.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i3 = org.telegram.ui.ActionBar.k6.W8;
        int i10 = org.telegram.ui.ActionBar.k6.U8;
        cq cqVar = dqVar.a;
        cqVar.v = i3;
        cqVar.w = i10;
        dqVar.setGravity(5);
        if (z10) {
            wo woVar = new wo(21, context, e6Var);
            this.w = woVar;
            woVar.b(org.telegram.ui.ActionBar.k6.B5, org.telegram.ui.ActionBar.k6.h5, org.telegram.ui.ActionBar.k6.C5);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(4);
            woVar.setProgressDelegate(new ca(this, 4));
            addView(woVar, mf.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            woVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, boolean z10, CharSequence charSequence) {
        if (this.f != j10) {
            this.r = false;
            invalidate();
        }
        this.f = j10;
        boolean E = org.telegram.messenger.m5.E(j10);
        org.telegram.ui.Components.k9 k9Var = this.a;
        org.telegram.ui.Components.u8 u8Var = this.c;
        int i3 = this.h;
        ec ecVar = this.b;
        if (E) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            this.e = a22;
            if (charSequence != null) {
                ecVar.setText(charSequence);
            } else if (a22 != null) {
                ecVar.setText(l10.j(a22, true));
            } else {
                ecVar.setText("");
            }
            u8Var.r(this.e);
            k9Var.e(this.e, u8Var);
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (charSequence != null) {
                ecVar.setText(charSequence);
            } else if (M0 != null) {
                ecVar.setText(M0.title);
            } else {
                ecVar.setText("");
            }
            u8Var.q(M0);
            this.e = null;
            k9Var.e(M0, u8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i3) {
        int i10;
        int i11 = hp.C8;
        int i12 = i3 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = hp.s1(i13).a2(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i3 != 0 && (i3 & 256) == 0 && (i3 & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(i13).R.f(this.f);
        dq dqVar = this.s;
        if (dialog == null || (i10 = dialog.unread_count) == 0) {
            this.d = 0;
            dqVar.a.c(0, this.r);
        } else if (this.d != i10) {
            this.d = i10;
            dqVar.a.c(i10, this.r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact J2 = (!this.y || this.e == null) ? null : hp.s1(this.h).J2(this.e.id);
        boolean z11 = J2 instanceof TL_account.requirementToContactPremium;
        if (this.F == z11 && this.H == org.telegram.messenger.m5.k(J2)) {
            return;
        }
        this.F = z11;
        this.H = org.telegram.messenger.m5.k(J2);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float d;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (view == this.a) {
            if (!this.F && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i3 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i3).getCurrentTime()) || hp.s1(i3).a0.containsKey(Long.valueOf(this.e.id))) {
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
                                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, this.I, false));
                                canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.k6.t0);
                                if (this.J == null) {
                                    this.J = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, null);
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
                                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, this.I, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(7.0f), org.telegram.ui.ActionBar.k6.t0);
                                org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.T8, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.k6.t0);
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
            org.telegram.ui.Components.k9 k9Var = this.a;
            int measuredWidth = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
            int measuredHeight = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
            org.telegram.ui.ActionBar.k6.o0.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.B5, false));
            org.telegram.ui.ActionBar.k6.o0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.k6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
        this.s.a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            dq dqVar = this.s;
            if (dqVar != null) {
                dqVar.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
