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
import bi.md;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wq;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.v5 D;
    public boolean E;
    public final org.telegram.ui.Components.v5 F;
    public long G;
    public int H;
    public ug.y0 I;
    public Drawable J;
    public final org.telegram.ui.Components.k9 a;
    public final md b;
    public final org.telegram.ui.Components.v8 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final cq s;
    public final wo w;
    public final boolean x;
    public boolean y;

    public o4(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        this.c = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        new RectF();
        this.h = p10.s0;
        wq wqVar = wq.h;
        this.D = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        this.F = new org.telegram.ui.Components.v5(this, 0L, 350L, wqVar);
        this.H = org.telegram.ui.ActionBar.m6.d6;
        this.x = z9;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(k9Var, c8.ha.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        md mdVar = new md(context, 6);
        this.b = mdVar;
        qs.i(mdVar);
        org.telegram.ui.ActionBar.t6.U(mdVar, org.telegram.ui.ActionBar.m6.G6, h6Var);
        mdVar.setTextSize(1, 12.0f);
        mdVar.setMaxLines(1);
        mdVar.setGravity(49);
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(mdVar, c8.ha.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        cq cqVar = new cq(context, h6Var);
        this.s = cqVar;
        addView(cqVar, c8.ha.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.m6.W8;
        int i10 = org.telegram.ui.ActionBar.m6.U8;
        bq bqVar = cqVar.a;
        bqVar.v = i7;
        bqVar.w = i10;
        cqVar.setGravity(5);
        if (z9) {
            wo woVar = new wo(21, context, h6Var);
            this.w = woVar;
            woVar.b(org.telegram.ui.ActionBar.m6.B5, org.telegram.ui.ActionBar.m6.h5, org.telegram.ui.ActionBar.m6.C5);
            woVar.setDrawUnchecked(false);
            woVar.setDrawBackgroundAsArc(4);
            woVar.setProgressDelegate(new ca(this, 4));
            addView(woVar, c8.ha.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            woVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z9, CharSequence charSequence) {
        if (this.f != j3) {
            this.r = false;
            invalidate();
        }
        this.f = j3;
        boolean E = org.telegram.messenger.m5.E(j3);
        org.telegram.ui.Components.k9 k9Var = this.a;
        org.telegram.ui.Components.v8 v8Var = this.c;
        int i7 = this.h;
        md mdVar = this.b;
        if (E) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            this.e = a22;
            if (charSequence != null) {
                mdVar.setText(charSequence);
            } else if (a22 != null) {
                mdVar.setText(t10.j(a22, true));
            } else {
                mdVar.setText("");
            }
            v8Var.r(this.e);
            k9Var.e(this.e, v8Var);
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (charSequence != null) {
                mdVar.setText(charSequence);
            } else if (M0 != null) {
                mdVar.setText(M0.title);
            } else {
                mdVar.setText("");
            }
            v8Var.q(M0);
            this.e = null;
            k9Var.e(M0, v8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = qp.C8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = qp.s1(i13).a2(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i7 != 0 && (i7 & 256) == 0 && (i7 & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) qp.s1(i13).Q.f(this.f);
        cq cqVar = this.s;
        if (dialog == null || (i10 = dialog.unread_count) == 0) {
            this.d = 0;
            cqVar.a.c(0, this.r);
        } else if (this.d != i10) {
            this.d = i10;
            cqVar.a.c(i10, this.r);
        }
    }

    public final void c(boolean z9) {
        TL_account.RequirementToContact J2 = (!this.y || this.e == null) ? null : qp.s1(this.h).J2(this.e.id);
        boolean z10 = J2 instanceof TL_account.requirementToContactPremium;
        if (this.E == z10 && this.G == org.telegram.messenger.m5.k(J2)) {
            return;
        }
        this.E = z10;
        this.G = org.telegram.messenger.m5.k(J2);
        if (!z9) {
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        float d;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.a) {
            if (!this.E && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i7 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || qp.s1(i7).Z.containsKey(Long.valueOf(this.e.id))) {
                    z9 = true;
                    if (!this.r) {
                        this.n = z9 ? 1.0f : 0.0f;
                    }
                    if (z9) {
                        float f10 = this.n;
                        if (f10 != 1.0f) {
                            float f11 = f10 + 0.10666667f;
                            this.n = f11;
                            if (f11 > 1.0f) {
                                this.n = 1.0f;
                            }
                            invalidate();
                            d = this.D.d(this.E);
                            if (d > 0.0f) {
                                float height = (view.getHeight() / 2.0f) + view.getY() + org.telegram.messenger.g0.L(18.0f);
                                float width = (view.getWidth() / 2.0f) + view.getX() + org.telegram.messenger.g0.L(18.0f);
                                canvas.save();
                                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, this.H, false));
                                canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.m6.t0);
                                if (this.I == null) {
                                    this.I = new ug.y0(org.telegram.ui.ActionBar.m6.zk, org.telegram.ui.ActionBar.m6.Ak, -1, -1, null);
                                }
                                this.I.d((int) (width - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (height - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + width), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + height));
                                canvas.drawCircle(width, height, org.telegram.messenger.g0.L(10.0f) * d, this.I.f);
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
                                int L = org.telegram.messenger.g0.L(53.0f);
                                int L2 = org.telegram.messenger.g0.L(59.0f);
                                canvas.save();
                                float f12 = this.n;
                                float f13 = L2;
                                float f14 = L;
                                canvas.scale(f12, f12, f13, f14);
                                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, this.H, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(7.0f), org.telegram.ui.ActionBar.m6.t0);
                                org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.T8, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.m6.t0);
                                canvas.restore();
                            }
                            this.r = true;
                        }
                    }
                    if (!z9) {
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
                    d = this.D.d(this.E);
                    if (d > 0.0f) {
                    }
                    this.r = true;
                }
            }
            z9 = false;
            if (!this.r) {
            }
            if (z9) {
            }
            if (!z9) {
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
            org.telegram.ui.Components.k9 k9Var = this.a;
            int measuredWidth = (k9Var.getMeasuredWidth() / 2) + k9Var.getLeft();
            int measuredHeight = (k9Var.getMeasuredHeight() / 2) + k9Var.getTop();
            org.telegram.ui.ActionBar.m6.o0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
            org.telegram.ui.ActionBar.m6.o0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.m6.o0);
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
            cq cqVar = this.s;
            if (cqVar != null) {
                cqVar.invalidate();
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
