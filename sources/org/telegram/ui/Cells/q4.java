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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.t5 D;
    public boolean E;
    public final org.telegram.ui.Components.t5 F;
    public long G;
    public int H;
    public kg.k1 I;
    public Drawable J;
    public final org.telegram.ui.Components.g9 a;
    public final ag.j3 b;
    public final org.telegram.ui.Components.r8 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final lq s;
    public final ep w;
    public final boolean x;
    public boolean y;

    public q4(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        new RectF();
        this.h = d20.s0;
        gr grVar = gr.h;
        this.D = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.F = new org.telegram.ui.Components.t5(this, 0L, 350L, grVar);
        this.H = org.telegram.ui.ActionBar.t6.d6;
        this.x = z10;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(27.0f));
        addView(g9Var, w7.b6.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ag.j3 j3Var = new ag.j3(context, 3);
        this.b = j3Var;
        zs.i(j3Var);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        j3Var.setTextSize(1, 12.0f);
        j3Var.setMaxLines(1);
        j3Var.setGravity(49);
        j3Var.setLines(1);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(j3Var, w7.b6.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        lq lqVar = new lq(context, p6Var);
        this.s = lqVar;
        addView(lqVar, w7.b6.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.t6.W8;
        int i11 = org.telegram.ui.ActionBar.t6.U8;
        kq kqVar = lqVar.a;
        kqVar.v = i10;
        kqVar.w = i11;
        lqVar.setGravity(5);
        if (z10) {
            ep epVar = new ep(21, context, p6Var);
            this.w = epVar;
            epVar.b(org.telegram.ui.ActionBar.t6.B5, org.telegram.ui.ActionBar.t6.h5, org.telegram.ui.ActionBar.t6.C5);
            epVar.setDrawUnchecked(false);
            epVar.setDrawBackgroundAsArc(4);
            epVar.setProgressDelegate(new ca(this, 4));
            addView(epVar, w7.b6.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            epVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j10, boolean z10, CharSequence charSequence) {
        if (this.f != j10) {
            this.r = false;
            invalidate();
        }
        this.f = j10;
        boolean E = org.telegram.messenger.o5.E(j10);
        org.telegram.ui.Components.g9 g9Var = this.a;
        org.telegram.ui.Components.r8 r8Var = this.c;
        int i10 = this.h;
        ag.j3 j3Var = this.b;
        if (E) {
            TLRPC.User Z1 = vp.r1(i10).Z1(Long.valueOf(j10));
            this.e = Z1;
            if (charSequence != null) {
                j3Var.setText(charSequence);
            } else if (Z1 != null) {
                j3Var.setText(h20.j(Z1, true));
            } else {
                j3Var.setText("");
            }
            r8Var.r(this.e);
            g9Var.e(this.e, r8Var);
        } else {
            TLRPC.Chat L0 = vp.r1(i10).L0(Long.valueOf(-j10));
            if (charSequence != null) {
                j3Var.setText(charSequence);
            } else if (L0 != null) {
                j3Var.setText(L0.title);
            } else {
                j3Var.setText("");
            }
            r8Var.q(L0);
            this.e = null;
            g9Var.e(L0, r8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i10) {
        int i11;
        int i12 = vp.D8;
        int i13 = i10 & 4;
        int i14 = this.h;
        if (i13 != 0 && this.e != null) {
            this.e = vp.r1(i14).Z1(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i10 != 0 && (i10 & 256) == 0 && (i10 & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(i14).Q.f(this.f);
        lq lqVar = this.s;
        if (dialog == null || (i11 = dialog.unread_count) == 0) {
            this.d = 0;
            lqVar.a.c(0, this.r);
        } else if (this.d != i11) {
            this.d = i11;
            lqVar.a.c(i11, this.r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact H2 = (!this.y || this.e == null) ? null : vp.r1(this.h).H2(this.e.id);
        boolean z11 = H2 instanceof TL_account.requirementToContactPremium;
        if (this.E == z11 && this.G == org.telegram.messenger.o5.k(H2)) {
            return;
        }
        this.E = z11;
        this.G = org.telegram.messenger.o5.k(H2);
        if (!z10) {
            this.D.f(this.E, true);
            this.F.f(this.G > 0, true);
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
            if (!this.E && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i10 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i10).getCurrentTime()) || vp.r1(i10).Z.containsKey(Long.valueOf(this.e.id))) {
                    z10 = true;
                    if (!this.r) {
                        this.n = z10 ? 1.0f : 0.0f;
                    }
                    if (z10) {
                        float f7 = this.n;
                        if (f7 != 1.0f) {
                            float f10 = f7 + 0.10666667f;
                            this.n = f10;
                            if (f10 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            d = this.D.d(this.E);
                            if (d > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + org.telegram.messenger.i0.L(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + org.telegram.messenger.i0.L(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, this.H, false));
                                canvas.drawCircle(width, height, org.telegram.messenger.i0.L(11.33f) * d, org.telegram.ui.ActionBar.t6.t0);
                                if (this.I == null) {
                                    this.I = new kg.k1(org.telegram.ui.ActionBar.t6.zk, org.telegram.ui.ActionBar.t6.Ak, -1, -1, null);
                                }
                                this.I.d((int) (width - org.telegram.messenger.i0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.i0.L(10.0f)), (int) (org.telegram.messenger.i0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.i0.L(10.0f) + height));
                                canvas.drawCircle(width, height, org.telegram.messenger.i0.L(10.0f) * d, this.I.f);
                                if (this.J == null) {
                                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                                    this.J = mutate;
                                    mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                }
                                this.J.setBounds((int) (width - (((r6.getIntrinsicWidth() / 2.0f) * 0.875f) * d)), (int) (height - (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f) * d)), (int) (((this.J.getIntrinsicWidth() / 2.0f) * 0.875f * d) + width), (int) (((this.J.getIntrinsicHeight() / 2.0f) * 0.875f * d) + height));
                                this.J.setAlpha((int) (d * 255.0f));
                                this.J.draw(canvas);
                                canvas.restore();
                            } else if (this.n != 0.0f) {
                                int L = org.telegram.messenger.i0.L(53.0f);
                                int L2 = org.telegram.messenger.i0.L(59.0f);
                                canvas.save();
                                float f11 = this.n;
                                float f12 = L2;
                                float f13 = L;
                                canvas.scale(f11, f11, f12, f13);
                                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, this.H, false));
                                canvas.drawCircle(f12, f13, org.telegram.messenger.i0.L(7.0f), org.telegram.ui.ActionBar.t6.t0);
                                org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.T8, false));
                                canvas.drawCircle(f12, f13, org.telegram.messenger.i0.L(5.0f), org.telegram.ui.ActionBar.t6.t0);
                                canvas.restore();
                            }
                            this.r = true;
                        }
                    }
                    if (!z10) {
                        float f14 = this.n;
                        if (f14 != 0.0f) {
                            float f15 = f14 - 0.10666667f;
                            this.n = f15;
                            if (f15 < 0.0f) {
                                this.n = 0.0f;
                            }
                            invalidate();
                        }
                    }
                    d = this.D.d(this.E);
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
            d = this.D.d(this.E);
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
            org.telegram.ui.Components.g9 g9Var = this.a;
            int measuredWidth = (g9Var.getMeasuredWidth() / 2) + g9Var.getLeft();
            int measuredHeight = (g9Var.getMeasuredHeight() / 2) + g9Var.getTop();
            org.telegram.ui.ActionBar.t6.o0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B5, false));
            org.telegram.ui.ActionBar.t6.o0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.i0.L(28.0f), org.telegram.ui.ActionBar.t6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(86.0f), TLObject.FLAG_30));
        this.s.a.E = org.telegram.messenger.i0.L(13.0f);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            lq lqVar = this.s;
            if (lqVar != null) {
                lqVar.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
