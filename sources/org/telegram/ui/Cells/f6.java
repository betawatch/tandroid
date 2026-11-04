package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.dz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f6 extends z implements cs, org.telegram.ui.ActionBar.z5 {
    public final RectF A0;
    public final wo B0;
    public boolean C0;
    public u10 D0;
    public TLRPC.User E;
    public n10 E0;
    public TLRPC.Chat F;
    public boolean F0;
    public TLRPC.EncryptedChat G;
    public TextPaint G0;
    public org.telegram.messenger.d5 H;
    public TextPaint H0;
    public long I;
    public boolean I0;
    public String J;
    public final gc J0;
    public int K;
    public final Paint K0;
    public TLRPC.FileLocation L;
    public final RectF L0;
    public boolean M;
    public ly0 M0;
    public boolean N;
    public boolean N0;
    public final int O;
    public boolean O0;
    public int P;
    public vg.x0 P0;
    public int Q;
    public Drawable Q0;
    public StaticLayout R;
    public int R0;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public nc W;
    public StaticLayout a0;
    public int b0;
    public int c0;
    public int d0;
    public boolean e0;
    public boolean f;
    public int f0;
    public final int g0;
    public wc0 h;
    public int h0;
    public int i0;
    public StaticLayout j0;
    public boolean[] k0;
    public boolean l0;
    public boolean m0;
    public CharSequence n;
    public final org.telegram.ui.Components.u5 n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public final ImageReceiver r;
    public int r0;
    public final org.telegram.ui.Components.u8 s;
    public StaticLayout s0;
    public final org.telegram.ui.Components.e5 t0;
    public final org.telegram.ui.Components.e5 u0;
    public final ei.o7 v0;
    public CharSequence w;
    public final RectF w0;
    public final org.telegram.ui.ActionBar.e6 x;
    public ly0 x0;
    public TLRPC.TL_sponsoredPeer y;
    public Paint y0;
    public final gc z0;

    public f6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O = h10.t0;
        this.g0 = org.telegram.messenger.g0.L(19.0f);
        this.n0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xq.h);
        xq xqVar = xq.f;
        this.v0 = new ei.o7(null, false);
        this.w0 = new RectF();
        this.z0 = new gc(this);
        this.A0 = new RectF();
        this.I0 = true;
        this.J0 = new gc(this);
        this.K0 = new Paint(1);
        this.L0 = new RectF();
        this.R0 = org.telegram.ui.ActionBar.r6.b;
        this.x = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.s = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        wo woVar = new wo(21, context, e6Var);
        this.B0 = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar);
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), this);
        this.t0 = e5Var;
        e5Var.setCallback(this);
        org.telegram.ui.Components.e5 e5Var2 = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), this);
        this.u0 = e5Var2;
        e5Var2.setCallback(this);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p6));
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.i4) {
            invalidate();
            return;
        }
        if (i3 == hs.i3) {
            TLRPC.User user = this.E;
            TL_account.RequirementToContact requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            int i11 = this.O;
            if (user == null) {
                TLRPC.Chat chat = this.F;
                if (chat == null) {
                    org.telegram.messenger.d5 d5Var = this.H;
                    if (d5Var == null) {
                        return;
                    }
                    if (this.m0 && d5Var.m != null) {
                        requirementToContact = hp.s1(i11).J2(this.H.m.id);
                    }
                } else if (chat.send_paid_messages_stars != 0) {
                    TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                    requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
                    requirementToContact = requirementtocontactpaidmessages;
                }
            } else if (this.m0) {
                requirementToContact = hp.s1(i11).J2(this.E.id);
            }
            boolean z10 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.o0 == z10 && this.p0 == org.telegram.messenger.m5.k(requirementToContact)) {
                return;
            }
            this.o0 = z10;
            this.p0 = org.telegram.messenger.m5.k(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.F;
    }

    public long getDialogId() {
        return this.I;
    }

    public TLRPC.User getUser() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.P();
        hs.e().c(this, hs.i4);
        if (this.m0) {
            hs.e().c(this, hs.i3);
        }
        this.u0.a();
        this.t0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.R();
        hs.e().n(this, hs.i4);
        if (this.m0) {
            hs.e().n(this, hs.i3);
        }
        this.u0.b();
        this.t0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        int ceil;
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        boolean z10 = this.N;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        if (z10) {
            Paint d = (!this.F0 || e6Var == null) ? null : e6Var.d("paintDivider");
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            Paint paint = d;
            if (bd.a0) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.S) {
            z.s(this.T, this.U, org.telegram.ui.ActionBar.k6.a1);
            org.telegram.ui.ActionBar.k6.a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            boolean z11 = bd.a0;
            org.telegram.ui.Components.e5 e5Var = this.t0;
            if (z11) {
                ceil = (int) (staticLayout.getLineRight(0) + this.P + org.telegram.messenger.g0.L(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.P - org.telegram.messenger.g0.L(3.0f)) - e5Var.s;
            } else {
                f10 = 6.0f;
                ceil = (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - org.telegram.messenger.g0.L(3.0f)) - e5Var.s);
                z.t(e5Var, ceil, ((this.R.getHeight() - e5Var.s) / 2.0f) + this.Q);
                e5Var.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.P, this.Q);
                this.R.draw(canvas2);
                canvas2.restore();
                boolean z12 = bd.a0;
                org.telegram.ui.Components.e5 e5Var2 = this.u0;
                z.t(e5Var2, !z12 ? this.R.getLineLeft(0) == 0.0f ? (this.P - org.telegram.messenger.g0.L(3.0f)) - e5Var2.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - org.telegram.messenger.g0.L(3.0f)) - e5Var2.s) : (int) (this.R.getLineRight(0) + this.P + org.telegram.messenger.g0.L(f10)), ((this.R.getHeight() - e5Var2.s) / 2.0f) + this.Q);
                e5Var2.draw(canvas2);
            }
            f10 = 6.0f;
            z.t(e5Var, ceil, ((this.R.getHeight() - e5Var.s) / 2.0f) + this.Q);
            e5Var.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.P, this.Q);
            this.R.draw(canvas2);
            canvas2.restore();
            boolean z122 = bd.a0;
            org.telegram.ui.Components.e5 e5Var22 = this.u0;
            z.t(e5Var22, !z122 ? this.R.getLineLeft(0) == 0.0f ? (this.P - org.telegram.messenger.g0.L(3.0f)) - e5Var22.s : (int) ((((this.P + this.V) - Math.ceil(this.R.getLineWidth(0))) - org.telegram.messenger.g0.L(3.0f)) - e5Var22.s) : (int) (this.R.getLineRight(0) + this.P + org.telegram.messenger.g0.L(f10)), ((this.R.getHeight() - e5Var22.s) / 2.0f) + this.Q);
            e5Var22.draw(canvas2);
        } else {
            f10 = 6.0f;
        }
        if (this.y == null || this.x0 == null || this.y0 == null) {
            f11 = 2.0f;
        } else {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var);
            this.y0.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            int L = org.telegram.messenger.g0.L(12.66f) + ((int) this.x0.k());
            int L2 = org.telegram.messenger.g0.L(17.33f);
            float L3 = bd.a0 ? org.telegram.messenger.g0.L(12.0f) : org.telegram.messenger.k5.z(12.0f, getWidth(), L);
            int i3 = this.Q;
            f11 = 2.0f;
            float f12 = f10;
            RectF rectF = this.w0;
            rectF.set(L3, i3, r6 + L, i3 + L2);
            rectF.inset(-org.telegram.messenger.g0.L(f12), -org.telegram.messenger.g0.L(f12));
            canvas2.save();
            float a10 = this.z0.a(0.1f);
            canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas2.translate(L3, this.Q);
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f13 = L2;
            rectF2.set(0.0f, 0.0f, L, f13);
            float f14 = f13 / 2.0f;
            canvas2.drawRoundRect(rectF2, f14, f14, this.y0);
            this.x0.c(org.telegram.messenger.g0.L(6.33f), f14, 1.0f, w02, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.s0 != null) {
            canvas2.save();
            canvas2.translate(this.r0 + this.c0, org.telegram.messenger.g0.L(this.N0 ? 35.0f : 33.0f) + this.d0);
            this.s0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.j0;
        int i10 = this.g0;
        if (staticLayout2 != null) {
            int L4 = this.h0 - org.telegram.messenger.g0.L(5.5f);
            float L5 = org.telegram.messenger.g0.L(11.0f) + L4 + this.i0;
            float L6 = org.telegram.messenger.g0.L(23.0f) + i10;
            RectF rectF3 = this.A0;
            rectF3.set(L4, i10, L5, L6);
            float f15 = org.telegram.messenger.g0.p * 11.5f;
            canvas2.drawRoundRect(rectF3, f15, f15, hp.s1(this.O).r2(this.I, 0L, null) ? org.telegram.ui.ActionBar.k6.y0 : org.telegram.ui.ActionBar.k6.w0);
            canvas2.save();
            canvas2.translate(this.h0, org.telegram.messenger.g0.L(4.0f) + i10);
            this.j0.draw(canvas2);
            canvas2.restore();
        }
        if (this.a0 != null) {
            nc ncVar = this.W;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U8, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.W8, false);
            ncVar.g.setColor(x02);
            y yVar = ncVar.e;
            if (yVar != null) {
                org.telegram.ui.ActionBar.k6.H1(yVar, x03, true);
            }
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(this.b0, i10, this.a0.getWidth() + r12, org.telegram.messenger.g0.L(23.0f) + i10);
            rectF4.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(4.0f));
            nc ncVar2 = this.W;
            ncVar2.i = false;
            ncVar2.c = 0;
            ncVar2.a(rectF4);
            nc ncVar3 = this.W;
            ncVar3.n = true;
            ncVar3.c(canvas2, ncVar3.g);
            y yVar2 = ncVar3.e;
            if (yVar2 != null) {
                yVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.b0, org.telegram.messenger.g0.L(4.0f) + i10);
            this.a0.draw(canvas2);
            canvas2.restore();
        }
        boolean z13 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z13) {
            TLRPC.Chat chat = this.F;
            ei.o7 o7Var = this.v0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.E;
                if (user != null) {
                    ei.s7.h(user.id, canvas2, imageReceiver, o7Var);
                } else if (chat != null) {
                    if (org.telegram.messenger.t3.Y(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.k6.S0;
                        RectF rectF5 = o7Var.F;
                        RectF rectF6 = o7Var.F;
                        cg.r.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    ei.s7.h(-this.F.id, canvas2, imageReceiver, o7Var);
                } else {
                    imageReceiver.A0(o7Var.F);
                    imageReceiver.h(canvas2, null);
                }
            } else {
                if (this.h == null) {
                    this.h = new wc0();
                }
                wc0 wc0Var = this.h;
                RectF rectF7 = o7Var.F;
                RectF rectF8 = o7Var.F;
                wc0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f11));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.A0(rectF8);
                imageReceiver.h(canvas2, null);
                canvas2.restore();
            }
        }
        float d10 = this.n0.d(this.o0);
        if (d10 > 0.0f) {
            float s6 = imageReceiver.s() + org.telegram.messenger.g0.L(14.0f);
            float r5 = imageReceiver.r() + org.telegram.messenger.g0.L(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, e6Var));
            canvas2.drawCircle(r5, s6, org.telegram.messenger.g0.L(11.33f) * d10, org.telegram.ui.ActionBar.k6.t0);
            if (this.P0 == null) {
                this.P0 = new vg.x0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.x);
            }
            this.P0.d((int) (r5 - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (s6 - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + r5), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + s6));
            canvas2.drawCircle(r5, s6, org.telegram.messenger.g0.L(10.0f) * d10, this.P0.f);
            if (this.Q0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.Q0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.Q0.setBounds((int) (r5 - (((r6.getIntrinsicWidth() / f11) * 0.875f) * d10)), (int) (s6 - (((this.Q0.getIntrinsicHeight() / f11) * 0.875f) * d10)), (int) (((this.Q0.getIntrinsicWidth() / f11) * 0.875f * d10) + r5), (int) (((this.Q0.getIntrinsicHeight() / f11) * 0.875f * d10) + s6));
            this.Q0.setAlpha((int) (d10 * 255.0f));
            this.Q0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.q0 || this.M0 == null) {
            return;
        }
        float L7 = org.telegram.messenger.g0.L(28.0f) + this.M0.c;
        float L8 = bd.a0 ? org.telegram.messenger.g0.L(15.0f) : (getWidth() - L7) - org.telegram.messenger.g0.L(15.0f);
        float L9 = org.telegram.messenger.g0.L(28.0f);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        Paint paint2 = this.K0;
        paint2.setColor(x04);
        float height = (getHeight() + L9) / f11;
        RectF rectF9 = this.L0;
        rectF9.set(L8, (getHeight() - L9) / f11, L7 + L8, height);
        canvas2.save();
        float a11 = this.J0.a(0.06f);
        canvas2.scale(a11, a11, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f11, rectF9.height() / f11, paint2);
        this.M0.c(org.telegram.messenger.g0.L(14.0f) + L8, getHeight() / f11, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.R;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.l0) {
            sb2.append(", ");
            sb2.append(bd.M0(2131754739, null));
            sb2.append("\n");
        }
        if (this.s0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.s0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        wo woVar = this.B0;
        if (woVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(woVar.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        if (this.E == null && this.F == null && this.G == null && this.H == null) {
            return;
        }
        wo woVar = this.B0;
        if (woVar != null) {
            int L = bd.a0 ? (i11 - i3) - org.telegram.messenger.g0.L(42.0f) : org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(36.0f);
            woVar.layout(L, L2, woVar.getMeasuredWidth() + L, woVar.getMeasuredHeight() + L2);
        }
        if (z10) {
            v();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        wo woVar = this.B0;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), this.N0 ? org.telegram.messenger.g0.L(56.0f) : org.telegram.messenger.g0.L(60.0f) + (this.N ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6.i == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
    
        if (r6.i == false) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        nc ncVar;
        if (this.q0 && this.D0 != null && this.E != null) {
            boolean contains = this.L0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            gc gcVar = this.J0;
            if (action == 0 || motionEvent.getAction() == 2) {
                gcVar.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (gcVar.i) {
                        this.D0.a(this.E);
                    }
                    gcVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    gcVar.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.y != null && this.E0 != null) {
            boolean contains2 = this.w0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            gc gcVar2 = this.z0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                gcVar2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (gcVar2.i) {
                        this.E0.a(this, this.y);
                    }
                    gcVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    gcVar2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.E == null && this.F == null) || !this.v0.a(this, motionEvent)) && ((ncVar = this.W) == null || !ncVar.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.I0 = z10;
    }

    public void setOnSponsoredOptionsClick(n10 n10Var) {
        this.E0 = n10Var;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.q0 == z10) {
            return;
        }
        if (this.M0 == null) {
            this.M0 = new ly0(bd.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        int L = z10 ? org.telegram.messenger.g0.L(30.0f) + ((int) this.M0.c) : 0;
        boolean z11 = bd.a0;
        int i3 = z11 ? L : 0;
        if (z11) {
            L = 0;
        }
        setPadding(i3, 0, L, 0);
        this.q0 = z10;
        this.J0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.O0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        y(0);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i3 = this.R0;
        int i10 = org.telegram.ui.ActionBar.r6.b;
        if (i3 == i10) {
            if (this.R == null || getMeasuredWidth() <= 0) {
                return;
            }
            v();
            return;
        }
        this.R0 = i10;
        try {
            y(0);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void v() {
        TLRPC.Chat M0;
        TextPaint textPaint;
        int measuredWidth;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i3;
        int i10;
        int L;
        this.S = false;
        this.l0 = false;
        TLRPC.EncryptedChat encryptedChat = this.G;
        int i11 = this.O;
        if (encryptedChat != null) {
            this.S = true;
            this.I = org.telegram.messenger.m5.F(encryptedChat.id);
            if (bd.a0) {
                this.T = (getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C + 2)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                this.P = org.telegram.messenger.g0.L(11.0f);
            } else {
                this.T = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                this.P = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(r2 + 4);
            }
            this.U = org.telegram.messenger.g0.L(22.0f);
            z(false, null, null, false);
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                this.I = -chat.id;
                this.l0 = chat.verified;
                if (chat.monoforum && (M0 = hp.s1(i11).M0(Long.valueOf(this.F.linked_monoforum_id))) != null) {
                    this.l0 = M0.verified;
                }
                if (bd.a0) {
                    this.P = org.telegram.messenger.g0.L(11.0f);
                } else {
                    this.P = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                }
                z(this.l0, null, this.F, false);
            } else {
                TLRPC.User user = this.E;
                if (user != null) {
                    this.I = user.id;
                    if (bd.a0) {
                        this.P = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        this.P = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                    }
                    this.U = org.telegram.messenger.g0.L(21.0f);
                    this.l0 = this.E.verified;
                    if (!this.M) {
                        hp.s1(i11);
                    }
                    z(this.l0, this.E, null, false);
                } else if (this.H != null) {
                    this.I = 0L;
                    if (bd.a0) {
                        this.P = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        this.P = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                    }
                    if (this.W == null) {
                        nc ncVar = new nc(this);
                        this.W = ncVar;
                        ncVar.h = new f(this, 6);
                    }
                }
            }
        }
        if (bd.a0) {
            this.r0 = org.telegram.messenger.g0.L(11.0f);
        } else {
            this.r0 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
        }
        if (this.y != null) {
            if (this.x0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(bd.M0(2131745845, null)).append((CharSequence) " i");
                wp wpVar = new wp(R.drawable.ic_ab_other, 0);
                wpVar.I = 0.55f;
                wpVar.J = 0.55f;
                wpVar.H = 0.7f;
                wpVar.r = -org.telegram.messenger.g0.L(2.0f);
                wpVar.s = 0.0f;
                append.setSpan(wpVar, append.length() - 1, append.length(), 33);
                this.x0 = new ly0(append, 12.0f, null);
            }
            if (this.y0 == null) {
                this.y0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat2 = this.F;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        CharSequence charSequence4 = charSequence3;
        if (chat2 != null) {
            charSequence4 = charSequence3;
            if (chat2.monoforum) {
                TLRPC.Chat M02 = hp.s1(i11).M0(Long.valueOf(this.F.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (M02 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.U(M02.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) bd.M0(2131748355, null));
                    spannableStringBuilder.setSpan(new dz(bd.M0(2131748355, null), org.telegram.ui.ActionBar.k6.y6, e6Var), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.F.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat2.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.E;
            charSequence4 = charSequence3;
            if (user2 != null) {
                charSequence4 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(l10.p(user2)));
            }
        }
        CharSequence N2 = org.telegram.messenger.g0.N2(charSequence4);
        if (TextUtils.isEmpty(N2)) {
            TLRPC.User user3 = this.E;
            N2 = (user3 == null || TextUtils.isEmpty(user3.phone)) ? bd.M0(2131749336, null) : org.telegram.messenger.k5.i(new StringBuilder("+"), this.E.phone, mf.b.c());
        }
        if (this.F0) {
            if (this.G0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.G0 = textPaint2;
                textPaint2.setTypeface(org.telegram.messenger.g0.o());
            }
            this.G0.setTextSize(org.telegram.messenger.g0.L(this.N0 ? 15.0f : 16.0f));
            if (this.G != null) {
                this.G0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Z8, e6Var));
            } else {
                this.G0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X8, e6Var));
            }
            textPaint = this.G0;
        } else {
            textPaint = this.G != null ? org.telegram.ui.ActionBar.k6.E0 : org.telegram.ui.ActionBar.k6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (bd.a0) {
            measuredWidth = (getMeasuredWidth() - this.P) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
            this.V = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.P) - org.telegram.messenger.g0.L(14.0f);
            this.V = measuredWidth;
        }
        if (this.S) {
            this.V -= org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
        }
        if (this.y != null) {
            int L2 = org.telegram.messenger.g0.L(20.66f) + ((int) this.x0.c);
            this.V -= L2;
            if (bd.a0) {
                this.P += L2;
            }
        }
        if (this.H != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.k6.L0.measureText(bd.M0(2131749182, null)) + 1.0f);
            this.a0 = new StaticLayout(bd.M0(2131749182, null), org.telegram.ui.ActionBar.k6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (bd.a0) {
                this.b0 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(19.0f);
                this.P += measureText;
                this.r0 += measureText;
            } else {
                this.b0 = ((getMeasuredWidth() - measureText) - org.telegram.messenger.g0.L(19.0f)) - org.telegram.messenger.g0.L(16.0f);
            }
            this.V = org.telegram.messenger.camera.q.w(32.0f, measureText, this.V);
        }
        this.V -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.e0) {
            int V0 = hp.s1(i11).V0((TLRPC.Dialog) hp.s1(i11).R.f(this.I));
            if (V0 != 0) {
                this.f0 = V0;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(V0);
                String sb3 = sb2.toString();
                this.i0 = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(sb3)));
                this.j0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.k6.L0, this.i0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L3 = org.telegram.messenger.g0.L(18.0f) + this.i0;
                this.V -= L3;
                paddingRight -= L3;
                if (bd.a0) {
                    this.h0 = org.telegram.messenger.g0.L(19.0f);
                    this.P += L3;
                    this.r0 += L3;
                } else {
                    this.h0 = (getMeasuredWidth() - this.i0) - org.telegram.messenger.g0.L(19.0f);
                }
            } else {
                this.f0 = 0;
                this.j0 = null;
            }
        } else {
            this.f0 = 0;
            this.j0 = null;
        }
        int i12 = paddingRight;
        org.telegram.ui.Components.e5 e5Var = this.t0;
        boolean d = e5Var.d();
        int i13 = e5Var.s;
        if (!d) {
            if (bd.a0) {
                this.V -= i13;
            } else {
                this.P += i13;
            }
        }
        org.telegram.ui.Components.e5 e5Var2 = this.u0;
        if (!e5Var2.d() && !bd.a0) {
            this.V -= e5Var2.s;
        }
        if (this.V < 0) {
            this.V = 0;
        }
        float L4 = this.V - org.telegram.messenger.g0.L(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(N2, textPaint3, L4, truncateAt);
        if (ellipsize != null) {
            ellipsize = org.telegram.messenger.i6.m(ellipsize, textPaint3.getFontMetricsInt(), false, null, 0);
        }
        CharSequence charSequence5 = ellipsize;
        int i14 = this.V;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(charSequence5, textPaint3, i14, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.Q0;
        TLRPC.Chat chat3 = this.F;
        if (chat3 == null || this.w != null) {
            charSequence = this.w;
            if (charSequence == null) {
                TLRPC.User user4 = this.E;
                if (user4 == null) {
                    charSequence = null;
                } else if (hp.F2(user4)) {
                    charSequence = bd.M0(2131744335, null);
                } else {
                    TLRPC.User user5 = this.E;
                    boolean z10 = user5.bot;
                    if (z10 && (i3 = user5.bot_active_users) != 0) {
                        charSequence = bd.H(' ', "BotUsersShort", i3);
                    } else if (z10) {
                        charSequence = bd.M0(2131753156, null);
                    } else {
                        long j10 = user5.id;
                        if (j10 == 489000) {
                            charSequence = bd.M0(2131743626, null);
                        } else if (l10.A(j10)) {
                            charSequence = bd.M0(2131745571, null);
                        } else {
                            if (this.k0 == null) {
                                this.k0 = new boolean[1];
                            }
                            boolean[] zArr = this.k0;
                            zArr[0] = false;
                            charSequence = bd.d0(i11, this.E, zArr, null);
                            if (this.k0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.k6.P0;
                            }
                            TLRPC.User user6 = this.E;
                            if (user6 != null && (user6.id == h10.i(i11).e() || ((userStatus = this.E.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()))) {
                                textPaint4 = org.telegram.ui.ActionBar.k6.P0;
                                charSequence = bd.M0(2131747834, null);
                            }
                        }
                    }
                }
            }
            if (this.M || l10.z(this.E)) {
                this.Q = org.telegram.messenger.g0.L(20.0f);
                charSequence = null;
            }
        } else {
            if (org.telegram.messenger.t3.Y(chat3)) {
                charSequence = bd.M0(2131751990, null).toLowerCase();
            } else if (org.telegram.messenger.t3.V(this.F)) {
                TLRPC.Chat chat4 = this.F;
                int i15 = chat4.participants_count;
                charSequence = i15 != 0 ? bd.H(',', "Subscribers", i15) : !org.telegram.messenger.t3.t0(chat4) ? bd.M0(2131752329, null).toLowerCase() : bd.M0(2131752318, null).toLowerCase();
            } else {
                TLRPC.Chat chat5 = this.F;
                int i16 = chat5.participants_count;
                charSequence = i16 != 0 ? bd.H(',', "Members", i16) : chat5.has_geo ? bd.M0(2131748650, null) : org.telegram.messenger.t3.p0(chat5) ? bd.M0(2131748356, null) : !org.telegram.messenger.t3.t0(this.F) ? bd.M0(2131748649, null).toLowerCase() : bd.M0(2131748646, null).toLowerCase();
            }
            this.Q = org.telegram.messenger.g0.L(19.0f);
        }
        if (this.F0) {
            if (this.H0 == null) {
                this.H0 = new TextPaint(1);
            }
            this.H0.setTextSize(org.telegram.messenger.g0.L(this.N0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.k6.Q0) {
                this.H0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, e6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.k6.P0) {
                this.H0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p6, e6Var));
            }
            textPaint4 = this.H0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i10 = i12;
            this.Q = org.telegram.messenger.g0.L(20.0f);
            this.s0 = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint4, i12 - org.telegram.messenger.g0.L(12.0f), truncateAt), textPaint4, i12, alignment, 1.0f, 0.0f, false);
            i10 = i12;
            this.s0 = staticLayout;
            this.Q = org.telegram.messenger.g0.L(9.0f);
            this.U -= org.telegram.messenger.g0.L(10.0f);
        }
        if (bd.a0) {
            L = (getMeasuredWidth() - org.telegram.messenger.g0.L(57.0f)) - getPaddingRight();
        } else {
            L = org.telegram.messenger.g0.L(this.N0 ? 14.0f : this.O0 ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.v0.F.set(L, org.telegram.messenger.g0.L(this.N0 ? 6.0f : 7.0f), org.telegram.messenger.g0.L(this.N0 ? 44.0f : this.O0 ? 42.0f : 46.0f) + L, org.telegram.messenger.g0.L(this.N0 ? 44.0f : 46.0f) + org.telegram.messenger.g0.L(this.N0 ? 6.0f : 7.0f));
        if (bd.a0) {
            if (this.R.getLineCount() > 0 && this.R.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.R.getLineWidth(0));
                double d10 = this.V;
                if (ceil < d10) {
                    this.P = (int) ((d10 - ceil) + this.P);
                }
            }
            StaticLayout staticLayout2 = this.s0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.s0.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.s0.getLineWidth(0));
                double d11 = i10;
                if (ceil2 < d11) {
                    this.r0 = (int) ((d11 - ceil2) + this.r0);
                }
            }
        } else {
            if (this.R.getLineCount() > 0 && this.R.getLineRight(0) == this.V) {
                double ceil3 = Math.ceil(this.R.getLineWidth(0));
                double d12 = this.V;
                if (ceil3 < d12) {
                    this.P = (int) (this.P - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout3 = this.s0;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0 && this.s0.getLineRight(0) == i10) {
                double ceil4 = Math.ceil(this.s0.getLineWidth(0));
                double d13 = i10;
                if (ceil4 < d13) {
                    this.r0 = (int) (this.r0 - (d13 - ceil4));
                }
            }
        }
        this.P = getPaddingLeft() + this.P;
        this.r0 = getPaddingLeft() + this.r0;
        this.T = getPaddingLeft() + this.T;
        if (this.N0) {
            this.P = org.telegram.messenger.g0.L(1.0f) + this.P;
            this.Q = org.telegram.messenger.g0.L(1.0f) + this.Q;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.u0 == drawable || this.t0 == drawable || super.verifyDrawable(drawable);
    }

    public final void w(boolean z10, boolean z11) {
        wo woVar = this.B0;
        if (woVar == null) {
            return;
        }
        woVar.a(z10, z11);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i3 = this.O;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z12) {
            this.E = (TLRPC.User) obj;
            this.F = null;
            this.H = null;
            TL_account.RequirementToContact J2 = this.m0 ? hp.s1(i3).J2(this.E.id) : null;
            this.o0 = J2 instanceof TL_account.requirementToContactPremium;
            this.p0 = org.telegram.messenger.m5.k(J2);
            setOpenBotButton(this.C0 && this.E.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.F = chat;
            this.E = null;
            this.H = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.o0 = false;
            this.p0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.d5) {
            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) obj;
            this.H = d5Var;
            this.F = null;
            this.E = null;
            if (this.m0 && d5Var.m != null) {
                requirementToContact = hp.s1(i3).J2(this.H.m.id);
            }
            this.o0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.p0 = org.telegram.messenger.m5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.G = encryptedChat;
        this.w = charSequence2;
        this.e0 = z10;
        this.M = z11;
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i3) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        int L;
        TLRPC.Dialog dialog;
        String i10;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user3 = this.E;
        ImageReceiver imageReceiver = this.r;
        int i11 = this.O;
        org.telegram.ui.Components.u8 u8Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            u8Var.r(user3);
            if (l10.z(this.E)) {
                u8Var.g(12);
                imageReceiver.q0(null, null, u8Var, null, null, 0);
            } else if (this.M) {
                u8Var.g(1);
                imageReceiver.q0(null, null, u8Var, null, null, 0);
            } else {
                TLRPC.User user4 = this.E;
                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.s0(ac.m(i11, 1, user4), "50_50", ac.m(h10.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = u8Var;
                fileLocation = fileLocation3;
                imageReceiver.s0(ac.m(i11, 1, user4), "50_50", ac.m(h10.t0, 2, this.E), "50_50", drawable2, this.E, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.F;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            u8Var.q(chat);
                            imageReceiver.s0(ac.m(i11, 1, this.F), "50_50", ac.m(h10.t0, 2, this.F), "50_50", drawable, this.F, 0);
                        } else {
                            rg.c.n(i11, chat, u8Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = u8Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                org.telegram.messenger.d5 d5Var = this.H;
                if (d5Var != null) {
                    u8Var.k(0L, d5Var.i, d5Var.j, null);
                    imageReceiver.q0(null, null, u8Var, null, null, 0);
                } else {
                    u8Var.k(0L, null, null, null);
                    imageReceiver.q0(null, null, u8Var, null, null, 0);
                }
            }
        }
        if (org.telegram.messenger.t3.Y(this.F)) {
            int L2 = org.telegram.messenger.g0.L(46.0f);
            Rect rect = cg.r.a;
            L = (L2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.F;
            if (chat2 == null || !chat2.monoforum) {
                L = org.telegram.messenger.g0.L(this.O0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                L = 0;
            }
        }
        imageReceiver.J0(L);
        if (i3 != 0) {
            int i12 = hp.C8;
            boolean z10 = !(((i3 & 2) == 0 || this.E == null) && ((i3 & 8) == 0 || this.F == null)) && (((fileLocation2 = this.L) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z10 && (i3 & 4) != 0 && (user2 = this.E) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.K) {
                    z10 = true;
                }
            }
            if (!z10 && (524288 & i3) != 0 && ((user = this.E) != null || this.F != null)) {
                z(user != null ? user.verified : this.F.verified, user, this.F, true);
            }
            if ((!z10 && (i3 & 1) != 0 && this.E != null) || ((i3 & 16) != 0 && this.F != null)) {
                if (this.E != null) {
                    i10 = this.E.first_name + this.E.last_name;
                } else {
                    TLRPC.Chat chat3 = this.F;
                    i10 = chat3.monoforum ? rg.c.i(i11, chat3, false) : chat3.title;
                }
                if (!i10.equals(this.J)) {
                    z10 = true;
                }
            }
            if (!((z10 || !this.e0 || (i3 & 256) == 0 || (dialog = (TLRPC.Dialog) hp.s1(i11).R.f(this.I)) == null || hp.s1(i11).V0(dialog) == this.f0) ? z10 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.E;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.K = userStatus2.expires;
            } else {
                this.K = 0;
            }
            this.J = this.E.first_name + this.E.last_name;
        } else {
            TLRPC.Chat chat4 = this.F;
            if (chat4 != null) {
                this.J = chat4.monoforum ? rg.c.i(i11, chat4, false) : chat4.title;
            }
        }
        this.L = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            v();
        }
        postInvalidate();
    }

    public final void z(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        boolean z12 = bd.a0;
        org.telegram.ui.Components.e5 e5Var = this.u0;
        e5Var.a = z12;
        boolean z13 = this.I0;
        org.telegram.ui.ActionBar.e6 e6Var = this.x;
        if (z13 && z10) {
            e5Var.g(new xp(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1, 0, 0), z11);
            e5Var.k(null);
        } else if (z13 && user != null && !this.M && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            e5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
        } else if (!this.I0 || chat == null || this.M || org.telegram.messenger.m5.f(chat.emoji_status) == 0) {
            if (this.I0 && user != null && !this.M) {
                hp.s1(this.O);
                if (hp.B2(user)) {
                    e5Var.g((Drawable) ha.e.d().f, z11);
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
                }
            }
            e5Var.g(null, z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
        } else {
            e5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z11);
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
        }
        long c2 = user != null ? org.telegram.messenger.m5.c(user) : chat != null ? org.telegram.messenger.m5.c(chat) : 0L;
        org.telegram.ui.Components.e5 e5Var2 = this.t0;
        if (c2 == 0 || this.M) {
            e5Var2.g(null, z11);
        } else {
            e5Var2.j(c2, z11);
        }
        e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, e6Var)));
    }
}
