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
import di.ub;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o4 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public boolean F;
    public final org.telegram.ui.Components.u5 G;
    public long H;
    public int I;
    public ug.z0 J;
    public Drawable K;
    public final org.telegram.ui.Components.i9 a;
    public final ub b;
    public final org.telegram.ui.Components.t8 c;
    public int d;
    public TLRPC.User e;
    public long f;
    public final int h;
    public float n;
    public boolean r;
    public final kq s;
    public final fp w;
    public final boolean x;
    public boolean y;

    public o4(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.c = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        new RectF();
        this.h = m10.t0;
        er erVar = er.h;
        this.E = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.G = new org.telegram.ui.Components.u5(this, 0L, 350L, erVar);
        this.I = org.telegram.ui.ActionBar.j6.d6;
        this.x = z10;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.a = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(27.0f));
        addView(i9Var, c8.ja.d(54, 54.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        ub ubVar = new ub(context, 6);
        this.b = ubVar;
        ns.i(ubVar);
        org.telegram.ui.ActionBar.q6.U(ubVar, org.telegram.ui.ActionBar.j6.G6, e6Var);
        ubVar.setTextSize(1, 12.0f);
        ubVar.setMaxLines(1);
        ubVar.setGravity(49);
        ubVar.setLines(1);
        ubVar.setEllipsize(TextUtils.TruncateAt.END);
        addView(ubVar, c8.ja.d(-1, -2.0f, 51, 6.0f, 64.0f, 6.0f, 0.0f));
        kq kqVar = new kq(context, e6Var);
        this.s = kqVar;
        addView(kqVar, c8.ja.d(-1, 28.0f, 48, 0.0f, 4.0f, 0.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.j6.W8;
        int i10 = org.telegram.ui.ActionBar.j6.U8;
        jq jqVar = kqVar.a;
        jqVar.v = i7;
        jqVar.w = i10;
        kqVar.setGravity(5);
        if (z10) {
            fp fpVar = new fp(21, context, e6Var);
            this.w = fpVar;
            fpVar.b(org.telegram.ui.ActionBar.j6.B5, org.telegram.ui.ActionBar.j6.h5, org.telegram.ui.ActionBar.j6.C5);
            fpVar.setDrawUnchecked(false);
            fpVar.setDrawBackgroundAsArc(4);
            fpVar.setProgressDelegate(new ca(this, 4));
            addView(fpVar, c8.ja.d(24, 24.0f, 49, 19.0f, 42.0f, 0.0f, 0.0f));
            fpVar.a(false, false);
            setWillNotDraw(false);
        }
    }

    public final void a(long j3, boolean z10, CharSequence charSequence) {
        if (this.f != j3) {
            this.r = false;
            invalidate();
        }
        this.f = j3;
        boolean E = org.telegram.messenger.m5.E(j3);
        org.telegram.ui.Components.i9 i9Var = this.a;
        org.telegram.ui.Components.t8 t8Var = this.c;
        int i7 = this.h;
        ub ubVar = this.b;
        if (E) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            this.e = a22;
            if (charSequence != null) {
                ubVar.setText(charSequence);
            } else if (a22 != null) {
                ubVar.setText(q10.j(a22, true));
            } else {
                ubVar.setText("");
            }
            t8Var.r(this.e);
            i9Var.f(this.e, t8Var);
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
            if (charSequence != null) {
                ubVar.setText(charSequence);
            } else if (M0 != null) {
                ubVar.setText(M0.title);
            } else {
                ubVar.setText("");
            }
            t8Var.q(M0);
            this.e = null;
            i9Var.f(M0, t8Var);
        }
        c(false);
        b(0);
    }

    public final void b(int i7) {
        int i10;
        int i11 = np.D8;
        int i12 = i7 & 4;
        int i13 = this.h;
        if (i12 != 0 && this.e != null) {
            this.e = np.s1(i13).a2(Long.valueOf(this.e.id));
            this.a.invalidate();
            invalidate();
        }
        if (i7 != 0 && (i7 & 256) == 0 && (i7 & 2048) == 0) {
            return;
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) np.s1(i13).R.f(this.f);
        kq kqVar = this.s;
        if (dialog == null || (i10 = dialog.unread_count) == 0) {
            this.d = 0;
            kqVar.a.c(0, this.r);
        } else if (this.d != i10) {
            this.d = i10;
            kqVar.a.c(i10, this.r);
        }
    }

    public final void c(boolean z10) {
        TL_account.RequirementToContact J2 = (!this.y || this.e == null) ? null : np.s1(this.h).J2(this.e.id);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        float d;
        TLRPC.User user;
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.a) {
            if (!this.F && (user = this.e) != null && !user.bot) {
                TLRPC.UserStatus userStatus = user.status;
                int i7 = this.h;
                if ((userStatus != null && userStatus.expires > ConnectionsManager.getInstance(i7).getCurrentTime()) || np.s1(i7).a0.containsKey(Long.valueOf(this.e.id))) {
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
                                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, this.I, false));
                                canvas.drawCircle(width, height, org.telegram.messenger.g0.L(11.33f) * d, org.telegram.ui.ActionBar.j6.t0);
                                if (this.J == null) {
                                    this.J = new ug.z0(org.telegram.ui.ActionBar.j6.Ck, org.telegram.ui.ActionBar.j6.Dk, -1, -1, null);
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
                                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, this.I, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(7.0f), org.telegram.ui.ActionBar.j6.t0);
                                org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.T8, false));
                                canvas.drawCircle(f13, f14, org.telegram.messenger.g0.L(5.0f), org.telegram.ui.ActionBar.j6.t0);
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
            org.telegram.ui.Components.i9 i9Var = this.a;
            int measuredWidth = (i9Var.getMeasuredWidth() / 2) + i9Var.getLeft();
            int measuredHeight = (i9Var.getMeasuredHeight() / 2) + i9Var.getTop();
            org.telegram.ui.ActionBar.j6.o0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B5, false));
            org.telegram.ui.ActionBar.j6.o0.setAlpha((int) (this.w.getProgress() * 255.0f));
            canvas.drawCircle(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(28.0f), org.telegram.ui.ActionBar.j6.o0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
        this.s.a.E = org.telegram.messenger.g0.L(13.0f);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            kq kqVar = this.s;
            if (kqVar != null) {
                kqVar.invalidate();
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
