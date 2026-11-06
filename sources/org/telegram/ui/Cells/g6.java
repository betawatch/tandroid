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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t10;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;
import org.telegram.ui.fz;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class g6 extends z implements ls, org.telegram.ui.ActionBar.a6 {
    public final wo A0;
    public boolean B0;
    public c20 C0;
    public TLRPC.User D;
    public v10 D0;
    public TLRPC.Chat E;
    public boolean E0;
    public TLRPC.EncryptedChat F;
    public TextPaint F0;
    public org.telegram.messenger.d5 G;
    public TextPaint G0;
    public long H;
    public boolean H0;
    public String I;
    public final ic I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public my0 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public ug.y0 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public int Q0;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public pc V;
    public StaticLayout W;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public boolean f;
    public final int f0;
    public int g0;
    public bd0 h;
    public int h0;
    public StaticLayout i0;
    public boolean[] j0;
    public boolean k0;
    public boolean l0;
    public final org.telegram.ui.Components.w5 m0;
    public CharSequence n;
    public boolean n0;
    public long o0;
    public boolean p0;
    public int q0;
    public final ImageReceiver r;
    public StaticLayout r0;
    public final org.telegram.ui.Components.w8 s;
    public final org.telegram.ui.Components.g5 s0;
    public final org.telegram.ui.Components.g5 t0;
    public final di.n7 u0;
    public final RectF v0;
    public CharSequence w;
    public my0 w0;
    public final org.telegram.ui.ActionBar.f6 x;
    public Paint x0;
    public TLRPC.TL_sponsoredPeer y;
    public final ic y0;
    public final RectF z0;

    public g6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.N = p10.s0;
        this.f0 = org.telegram.messenger.g0.L(19.0f);
        this.m0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xq.h);
        xq xqVar = xq.f;
        this.u0 = new di.n7(null, false);
        this.v0 = new RectF();
        this.y0 = new ic(this);
        this.z0 = new RectF();
        this.H0 = true;
        this.I0 = new ic(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.Q0 = org.telegram.ui.ActionBar.r6.b;
        this.x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.J0(org.telegram.messenger.g0.L(23.0f));
        this.s = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        wo woVar = new wo(21, context, f6Var);
        this.A0 = woVar;
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar);
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), this);
        this.s0 = g5Var;
        g5Var.setCallback(this);
        org.telegram.ui.Components.g5 g5Var2 = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), this);
        this.t0 = g5Var2;
        g5Var2.setCallback(this);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p6));
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.i4) {
            invalidate();
            return;
        }
        if (i7 == qs.i3) {
            TLRPC.User user = this.D;
            TL_account.RequirementToContact requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            requirementToContact = null;
            int i11 = this.N;
            if (user == null) {
                TLRPC.Chat chat = this.E;
                if (chat == null) {
                    org.telegram.messenger.d5 d5Var = this.G;
                    if (d5Var == null) {
                        return;
                    }
                    if (this.l0 && d5Var.m != null) {
                        requirementToContact = qp.s1(i11).J2(this.G.m.id);
                    }
                } else if (chat.send_paid_messages_stars != 0) {
                    TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                    requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
                    requirementToContact = requirementtocontactpaidmessages;
                }
            } else if (this.l0) {
                requirementToContact = qp.s1(i11).J2(this.D.id);
            }
            boolean z9 = requirementToContact instanceof TL_account.requirementToContactPremium;
            if (this.n0 == z9 && this.o0 == org.telegram.messenger.m5.k(requirementToContact)) {
                return;
            }
            this.n0 = z9;
            this.o0 = org.telegram.messenger.m5.k(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.P();
        qs.e().c(this, qs.i4);
        if (this.l0) {
            qs.e().c(this, qs.i3);
        }
        this.t0.a();
        this.s0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.R();
        qs.e().n(this, qs.i4);
        if (this.l0) {
            qs.e().n(this, qs.i3);
        }
        this.t0.b();
        this.s0.b();
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
        if (this.D == null && this.E == null && this.F == null && this.G == null) {
            return;
        }
        boolean z9 = this.M;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        if (z9) {
            Paint d = (!this.E0 || f6Var == null) ? null : f6Var.d("paintDivider");
            if (d == null) {
                d = org.telegram.ui.ActionBar.k6.k0;
            }
            Paint paint = d;
            if (hd.a0) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(org.telegram.messenger.g0.L(org.telegram.messenger.g0.C), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.R) {
            z.s(this.S, this.T, org.telegram.ui.ActionBar.k6.a1);
            org.telegram.ui.ActionBar.k6.a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            boolean z10 = hd.a0;
            org.telegram.ui.Components.g5 g5Var = this.s0;
            if (z10) {
                ceil = (int) (staticLayout.getLineRight(0) + this.O + org.telegram.messenger.g0.L(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.O - org.telegram.messenger.g0.L(3.0f)) - g5Var.s;
            } else {
                f10 = 6.0f;
                ceil = (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - org.telegram.messenger.g0.L(3.0f)) - g5Var.s);
                z.t(g5Var, ceil, ((this.Q.getHeight() - g5Var.s) / 2.0f) + this.P);
                g5Var.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.O, this.P);
                this.Q.draw(canvas2);
                canvas2.restore();
                boolean z11 = hd.a0;
                org.telegram.ui.Components.g5 g5Var2 = this.t0;
                z.t(g5Var2, !z11 ? this.Q.getLineLeft(0) == 0.0f ? (this.O - org.telegram.messenger.g0.L(3.0f)) - g5Var2.s : (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - org.telegram.messenger.g0.L(3.0f)) - g5Var2.s) : (int) (this.Q.getLineRight(0) + this.O + org.telegram.messenger.g0.L(f10)), ((this.Q.getHeight() - g5Var2.s) / 2.0f) + this.P);
                g5Var2.draw(canvas2);
            }
            f10 = 6.0f;
            z.t(g5Var, ceil, ((this.Q.getHeight() - g5Var.s) / 2.0f) + this.P);
            g5Var.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.O, this.P);
            this.Q.draw(canvas2);
            canvas2.restore();
            boolean z112 = hd.a0;
            org.telegram.ui.Components.g5 g5Var22 = this.t0;
            z.t(g5Var22, !z112 ? this.Q.getLineLeft(0) == 0.0f ? (this.O - org.telegram.messenger.g0.L(3.0f)) - g5Var22.s : (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - org.telegram.messenger.g0.L(3.0f)) - g5Var22.s) : (int) (this.Q.getLineRight(0) + this.O + org.telegram.messenger.g0.L(f10)), ((this.Q.getHeight() - g5Var22.s) / 2.0f) + this.P);
            g5Var22.draw(canvas2);
        } else {
            f10 = 6.0f;
        }
        if (this.y == null || this.w0 == null || this.x0 == null) {
            f11 = 2.0f;
        } else {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var);
            this.x0.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            int L = org.telegram.messenger.g0.L(12.66f) + ((int) this.w0.k());
            int L2 = org.telegram.messenger.g0.L(17.33f);
            float L3 = hd.a0 ? org.telegram.messenger.g0.L(12.0f) : org.telegram.messenger.k5.z(12.0f, getWidth(), L);
            int i7 = this.P;
            f11 = 2.0f;
            float f12 = f10;
            RectF rectF = this.v0;
            rectF.set(L3, i7, r6 + L, i7 + L2);
            rectF.inset(-org.telegram.messenger.g0.L(f12), -org.telegram.messenger.g0.L(f12));
            canvas2.save();
            float a10 = this.y0.a(0.1f);
            canvas2.scale(a10, a10, rectF.centerX(), rectF.centerY());
            canvas2.translate(L3, this.P);
            RectF rectF2 = org.telegram.messenger.g0.P;
            float f13 = L2;
            rectF2.set(0.0f, 0.0f, L, f13);
            float f14 = f13 / 2.0f;
            canvas2.drawRoundRect(rectF2, f14, f14, this.x0);
            this.w0.c(org.telegram.messenger.g0.L(6.33f), f14, 1.0f, w02, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.r0 != null) {
            canvas2.save();
            canvas2.translate(this.q0 + this.b0, org.telegram.messenger.g0.L(this.M0 ? 35.0f : 33.0f) + this.c0);
            this.r0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.i0;
        int i10 = this.f0;
        if (staticLayout2 != null) {
            int L4 = this.g0 - org.telegram.messenger.g0.L(5.5f);
            float L5 = org.telegram.messenger.g0.L(11.0f) + L4 + this.h0;
            float L6 = org.telegram.messenger.g0.L(23.0f) + i10;
            RectF rectF3 = this.z0;
            rectF3.set(L4, i10, L5, L6);
            float f15 = org.telegram.messenger.g0.p * 11.5f;
            canvas2.drawRoundRect(rectF3, f15, f15, qp.s1(this.N).r2(this.H, 0L, null) ? org.telegram.ui.ActionBar.k6.y0 : org.telegram.ui.ActionBar.k6.w0);
            canvas2.save();
            canvas2.translate(this.g0, org.telegram.messenger.g0.L(4.0f) + i10);
            this.i0.draw(canvas2);
            canvas2.restore();
        }
        if (this.W != null) {
            pc pcVar = this.V;
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.U8, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.W8, false);
            pcVar.g.setColor(x02);
            y yVar = pcVar.e;
            if (yVar != null) {
                org.telegram.ui.ActionBar.k6.H1(yVar, x03, true);
            }
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(this.a0, i10, this.W.getWidth() + r12, org.telegram.messenger.g0.L(23.0f) + i10);
            rectF4.inset(-org.telegram.messenger.g0.L(16.0f), -org.telegram.messenger.g0.L(4.0f));
            pc pcVar2 = this.V;
            pcVar2.i = false;
            pcVar2.c = 0;
            pcVar2.a(rectF4);
            pc pcVar3 = this.V;
            pcVar3.n = true;
            pcVar3.c(canvas2, pcVar3.g);
            y yVar2 = pcVar3.e;
            if (yVar2 != null) {
                yVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.a0, org.telegram.messenger.g0.L(4.0f) + i10);
            this.W.draw(canvas2);
            canvas2.restore();
        }
        boolean z12 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z12) {
            TLRPC.Chat chat = this.E;
            di.n7 n7Var = this.u0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.D;
                if (user != null) {
                    di.r7.h(user.id, canvas2, imageReceiver, n7Var);
                } else if (chat != null) {
                    if (org.telegram.messenger.t3.Y(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.k6.S0;
                        RectF rectF5 = n7Var.F;
                        RectF rectF6 = n7Var.F;
                        bg.s.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    di.r7.h(-this.E.id, canvas2, imageReceiver, n7Var);
                } else {
                    imageReceiver.A0(n7Var.F);
                    imageReceiver.h(canvas2, null);
                }
            } else {
                if (this.h == null) {
                    this.h = new bd0();
                }
                bd0 bd0Var = this.h;
                RectF rectF7 = n7Var.F;
                RectF rectF8 = n7Var.F;
                bd0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f11));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.A0(rectF8);
                imageReceiver.h(canvas2, null);
                canvas2.restore();
            }
        }
        float d2 = this.m0.d(this.n0);
        if (d2 > 0.0f) {
            float s5 = imageReceiver.s() + org.telegram.messenger.g0.L(14.0f);
            float r10 = imageReceiver.r() + org.telegram.messenger.g0.L(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d6, f6Var));
            canvas2.drawCircle(r10, s5, org.telegram.messenger.g0.L(11.33f) * d2, org.telegram.ui.ActionBar.k6.t0);
            if (this.O0 == null) {
                this.O0 = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, this.x);
            }
            this.O0.d((int) (r10 - org.telegram.messenger.g0.L(10.0f)), 0.0f, (int) (s5 - org.telegram.messenger.g0.L(10.0f)), (int) (org.telegram.messenger.g0.L(10.0f) + r10), 0.0f, (int) (org.telegram.messenger.g0.L(10.0f) + s5));
            canvas2.drawCircle(r10, s5, org.telegram.messenger.g0.L(10.0f) * d2, this.O0.f);
            if (this.P0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.P0.setBounds((int) (r10 - (((r6.getIntrinsicWidth() / f11) * 0.875f) * d2)), (int) (s5 - (((this.P0.getIntrinsicHeight() / f11) * 0.875f) * d2)), (int) (((this.P0.getIntrinsicWidth() / f11) * 0.875f * d2) + r10), (int) (((this.P0.getIntrinsicHeight() / f11) * 0.875f * d2) + s5));
            this.P0.setAlpha((int) (d2 * 255.0f));
            this.P0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.p0 || this.L0 == null) {
            return;
        }
        float L7 = org.telegram.messenger.g0.L(28.0f) + this.L0.c;
        float L8 = hd.a0 ? org.telegram.messenger.g0.L(15.0f) : (getWidth() - L7) - org.telegram.messenger.g0.L(15.0f);
        float L9 = org.telegram.messenger.g0.L(28.0f);
        int x04 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        Paint paint2 = this.J0;
        paint2.setColor(x04);
        float height = (getHeight() + L9) / f11;
        RectF rectF9 = this.K0;
        rectF9.set(L8, (getHeight() - L9) / f11, L7 + L8, height);
        canvas2.save();
        float a11 = this.I0.a(0.06f);
        canvas2.scale(a11, a11, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f11, rectF9.height() / f11, paint2);
        this.L0.c(org.telegram.messenger.g0.L(14.0f) + L8, getHeight() / f11, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.k0) {
            sb2.append(", ");
            sb2.append(hd.M0(2131754739, null));
            sb2.append("\n");
        }
        if (this.r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        wo woVar = this.A0;
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        if (this.D == null && this.E == null && this.F == null && this.G == null) {
            return;
        }
        wo woVar = this.A0;
        if (woVar != null) {
            int L = hd.a0 ? (i11 - i7) - org.telegram.messenger.g0.L(42.0f) : org.telegram.messenger.g0.L(42.0f);
            int L2 = org.telegram.messenger.g0.L(36.0f);
            woVar.layout(L, L2, woVar.getMeasuredWidth() + L, woVar.getMeasuredHeight() + L2);
        }
        if (z9) {
            v();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        wo woVar = this.A0;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i7), this.M0 ? org.telegram.messenger.g0.L(56.0f) : org.telegram.messenger.g0.L(60.0f) + (this.M ? 1 : 0));
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
        pc pcVar;
        if (this.p0 && this.C0 != null && this.D != null) {
            boolean contains = this.K0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            ic icVar = this.I0;
            if (action == 0 || motionEvent.getAction() == 2) {
                icVar.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (icVar.i) {
                        this.C0.a(this.D);
                    }
                    icVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    icVar.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.y != null && this.D0 != null) {
            boolean contains2 = this.v0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            ic icVar2 = this.y0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                icVar2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (icVar2.i) {
                        this.D0.a(this, this.y);
                    }
                    icVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    icVar2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.D == null && this.E == null) || !this.u0.a(this, motionEvent)) && ((pcVar = this.V) == null || !pcVar.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.y = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z9) {
        this.H0 = z9;
    }

    public void setOnSponsoredOptionsClick(v10 v10Var) {
        this.D0 = v10Var;
    }

    public void setOpenBotButton(boolean z9) {
        if (this.p0 == z9) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new my0(hd.M0(2131753020, null), 14.0f, org.telegram.messenger.g0.o());
        }
        int L = z9 ? org.telegram.messenger.g0.L(30.0f) + ((int) this.L0.c) : 0;
        boolean z10 = hd.a0;
        int i7 = z10 ? L : 0;
        if (z10) {
            L = 0;
        }
        setPadding(i7, 0, L, 0);
        this.p0 = z9;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z9) {
        this.N0 = z9;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.w = charSequence;
        y(0);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = this.Q0;
        int i10 = org.telegram.ui.ActionBar.r6.b;
        if (i7 == i10) {
            if (this.Q == null || getMeasuredWidth() <= 0) {
                return;
            }
            v();
            return;
        }
        this.Q0 = i10;
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
        int i7;
        int i10;
        int L;
        this.R = false;
        this.k0 = false;
        TLRPC.EncryptedChat encryptedChat = this.F;
        int i11 = this.N;
        if (encryptedChat != null) {
            this.R = true;
            this.H = org.telegram.messenger.m5.F(encryptedChat.id);
            if (hd.a0) {
                this.S = (getMeasuredWidth() - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C + 2)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                this.O = org.telegram.messenger.g0.L(11.0f);
            } else {
                this.S = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                this.O = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(r2 + 4);
            }
            this.T = org.telegram.messenger.g0.L(22.0f);
            z(false, null, null, false);
        } else {
            TLRPC.Chat chat = this.E;
            if (chat != null) {
                this.H = -chat.id;
                this.k0 = chat.verified;
                if (chat.monoforum && (M0 = qp.s1(i11).M0(Long.valueOf(this.E.linked_monoforum_id))) != null) {
                    this.k0 = M0.verified;
                }
                if (hd.a0) {
                    this.O = org.telegram.messenger.g0.L(11.0f);
                } else {
                    this.O = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                }
                z(this.k0, null, this.E, false);
            } else {
                TLRPC.User user = this.D;
                if (user != null) {
                    this.H = user.id;
                    if (hd.a0) {
                        this.O = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        this.O = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                    }
                    this.T = org.telegram.messenger.g0.L(21.0f);
                    this.k0 = this.D.verified;
                    if (!this.L) {
                        qp.s1(i11);
                    }
                    z(this.k0, this.D, null, false);
                } else if (this.G != null) {
                    this.H = 0L;
                    if (hd.a0) {
                        this.O = org.telegram.messenger.g0.L(11.0f);
                    } else {
                        this.O = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
                    }
                    if (this.V == null) {
                        pc pcVar = new pc(this);
                        this.V = pcVar;
                        pcVar.h = new f(this, 6);
                    }
                }
            }
        }
        if (hd.a0) {
            this.q0 = org.telegram.messenger.g0.L(11.0f);
        } else {
            this.q0 = org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
        }
        if (this.y != null) {
            if (this.w0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(hd.M0(2131745836, null)).append((CharSequence) " i");
                wp wpVar = new wp(R.drawable.ic_ab_other, 0);
                wpVar.H = 0.55f;
                wpVar.I = 0.55f;
                wpVar.G = 0.7f;
                wpVar.r = -org.telegram.messenger.g0.L(2.0f);
                wpVar.s = 0.0f;
                append.setSpan(wpVar, append.length() - 1, append.length(), 33);
                this.w0 = new my0(append, 12.0f, null);
            }
            if (this.x0 == null) {
                this.x0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat2 = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        CharSequence charSequence4 = charSequence3;
        if (chat2 != null) {
            charSequence4 = charSequence3;
            if (chat2.monoforum) {
                TLRPC.Chat M02 = qp.s1(i11).M0(Long.valueOf(this.E.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (M02 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.U(M02.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) hd.M0(2131748346, null));
                    spannableStringBuilder.setSpan(new fz(hd.M0(2131748346, null), org.telegram.ui.ActionBar.k6.y6, f6Var), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.E.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat2.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.D;
            charSequence4 = charSequence3;
            if (user2 != null) {
                charSequence4 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(t10.p(user2)));
            }
        }
        CharSequence N2 = org.telegram.messenger.g0.N2(charSequence4);
        if (TextUtils.isEmpty(N2)) {
            TLRPC.User user3 = this.D;
            N2 = (user3 == null || TextUtils.isEmpty(user3.phone)) ? hd.M0(2131749327, null) : org.telegram.messenger.k5.i(new StringBuilder("+"), this.D.phone, pf.b.c());
        }
        if (this.E0) {
            if (this.F0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.F0 = textPaint2;
                textPaint2.setTypeface(org.telegram.messenger.g0.o());
            }
            this.F0.setTextSize(org.telegram.messenger.g0.L(this.M0 ? 15.0f : 16.0f));
            if (this.F != null) {
                this.F0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Z8, f6Var));
            } else {
                this.F0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.X8, f6Var));
            }
            textPaint = this.F0;
        } else {
            textPaint = this.F != null ? org.telegram.ui.ActionBar.k6.E0 : org.telegram.ui.ActionBar.k6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (hd.a0) {
            measuredWidth = (getMeasuredWidth() - this.O) - org.telegram.messenger.g0.L(org.telegram.messenger.g0.C);
            this.U = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.O) - org.telegram.messenger.g0.L(14.0f);
            this.U = measuredWidth;
        }
        if (this.R) {
            this.U -= org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + org.telegram.messenger.g0.L(6.0f);
        }
        if (this.y != null) {
            int L2 = org.telegram.messenger.g0.L(20.66f) + ((int) this.w0.c);
            this.U -= L2;
            if (hd.a0) {
                this.O += L2;
            }
        }
        if (this.G != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.k6.L0.measureText(hd.M0(2131749173, null)) + 1.0f);
            this.W = new StaticLayout(hd.M0(2131749173, null), org.telegram.ui.ActionBar.k6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (hd.a0) {
                this.a0 = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(19.0f);
                this.O += measureText;
                this.q0 += measureText;
            } else {
                this.a0 = ((getMeasuredWidth() - measureText) - org.telegram.messenger.g0.L(19.0f)) - org.telegram.messenger.g0.L(16.0f);
            }
            this.U = org.telegram.messenger.camera.q.w(32.0f, measureText, this.U);
        }
        this.U -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.d0) {
            int V0 = qp.s1(i11).V0((TLRPC.Dialog) qp.s1(i11).Q.f(this.H));
            if (V0 != 0) {
                this.e0 = V0;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(V0);
                String sb3 = sb2.toString();
                this.h0 = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(sb3)));
                this.i0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.k6.L0, this.h0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int L3 = org.telegram.messenger.g0.L(18.0f) + this.h0;
                this.U -= L3;
                paddingRight -= L3;
                if (hd.a0) {
                    this.g0 = org.telegram.messenger.g0.L(19.0f);
                    this.O += L3;
                    this.q0 += L3;
                } else {
                    this.g0 = (getMeasuredWidth() - this.h0) - org.telegram.messenger.g0.L(19.0f);
                }
            } else {
                this.e0 = 0;
                this.i0 = null;
            }
        } else {
            this.e0 = 0;
            this.i0 = null;
        }
        int i12 = paddingRight;
        org.telegram.ui.Components.g5 g5Var = this.s0;
        boolean d = g5Var.d();
        int i13 = g5Var.s;
        if (!d) {
            if (hd.a0) {
                this.U -= i13;
            } else {
                this.O += i13;
            }
        }
        org.telegram.ui.Components.g5 g5Var2 = this.t0;
        if (!g5Var2.d() && !hd.a0) {
            this.U -= g5Var2.s;
        }
        if (this.U < 0) {
            this.U = 0;
        }
        float L4 = this.U - org.telegram.messenger.g0.L(12.0f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(N2, textPaint3, L4, truncateAt);
        if (ellipsize != null) {
            ellipsize = org.telegram.messenger.i6.m(ellipsize, textPaint3.getFontMetricsInt(), false, null, 0);
        }
        CharSequence charSequence5 = ellipsize;
        int i14 = this.U;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(charSequence5, textPaint3, i14, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.Q0;
        TLRPC.Chat chat3 = this.E;
        if (chat3 == null || this.w != null) {
            charSequence = this.w;
            if (charSequence == null) {
                TLRPC.User user4 = this.D;
                if (user4 == null) {
                    charSequence = null;
                } else if (qp.F2(user4)) {
                    charSequence = hd.M0(2131744326, null);
                } else {
                    TLRPC.User user5 = this.D;
                    boolean z9 = user5.bot;
                    if (z9 && (i7 = user5.bot_active_users) != 0) {
                        charSequence = hd.H(' ', "BotUsersShort", i7);
                    } else if (z9) {
                        charSequence = hd.M0(2131753156, null);
                    } else {
                        long j3 = user5.id;
                        if (j3 == 489000) {
                            charSequence = hd.M0(2131743617, null);
                        } else if (t10.A(j3)) {
                            charSequence = hd.M0(2131745562, null);
                        } else {
                            if (this.j0 == null) {
                                this.j0 = new boolean[1];
                            }
                            boolean[] zArr = this.j0;
                            zArr[0] = false;
                            charSequence = hd.d0(i11, this.D, zArr, null);
                            if (this.j0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.k6.P0;
                            }
                            TLRPC.User user6 = this.D;
                            if (user6 != null && (user6.id == p10.i(i11).e() || ((userStatus = this.D.status) != null && userStatus.expires > ConnectionsManager.getInstance(i11).getCurrentTime()))) {
                                textPaint4 = org.telegram.ui.ActionBar.k6.P0;
                                charSequence = hd.M0(2131747825, null);
                            }
                        }
                    }
                }
            }
            if (this.L || t10.z(this.D)) {
                this.P = org.telegram.messenger.g0.L(20.0f);
                charSequence = null;
            }
        } else {
            if (org.telegram.messenger.t3.Y(chat3)) {
                charSequence = hd.M0(2131751990, null).toLowerCase();
            } else if (org.telegram.messenger.t3.V(this.E)) {
                TLRPC.Chat chat4 = this.E;
                int i15 = chat4.participants_count;
                charSequence = i15 != 0 ? hd.H(',', "Subscribers", i15) : !org.telegram.messenger.t3.t0(chat4) ? hd.M0(2131752329, null).toLowerCase() : hd.M0(2131752318, null).toLowerCase();
            } else {
                TLRPC.Chat chat5 = this.E;
                int i16 = chat5.participants_count;
                charSequence = i16 != 0 ? hd.H(',', "Members", i16) : chat5.has_geo ? hd.M0(2131748641, null) : org.telegram.messenger.t3.p0(chat5) ? hd.M0(2131748347, null) : !org.telegram.messenger.t3.t0(this.E) ? hd.M0(2131748640, null).toLowerCase() : hd.M0(2131748637, null).toLowerCase();
            }
            this.P = org.telegram.messenger.g0.L(19.0f);
        }
        if (this.E0) {
            if (this.G0 == null) {
                this.G0 = new TextPaint(1);
            }
            this.G0.setTextSize(org.telegram.messenger.g0.L(this.M0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.k6.Q0) {
                this.G0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A6, f6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.k6.P0) {
                this.G0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p6, f6Var));
            }
            textPaint4 = this.G0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i10 = i12;
            this.P = org.telegram.messenger.g0.L(20.0f);
            this.r0 = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint4, i12 - org.telegram.messenger.g0.L(12.0f), truncateAt), textPaint4, i12, alignment, 1.0f, 0.0f, false);
            i10 = i12;
            this.r0 = staticLayout;
            this.P = org.telegram.messenger.g0.L(9.0f);
            this.T -= org.telegram.messenger.g0.L(10.0f);
        }
        if (hd.a0) {
            L = (getMeasuredWidth() - org.telegram.messenger.g0.L(57.0f)) - getPaddingRight();
        } else {
            L = org.telegram.messenger.g0.L(this.M0 ? 14.0f : this.N0 ? 15.0f : 11.0f) + getPaddingLeft();
        }
        this.u0.F.set(L, org.telegram.messenger.g0.L(this.M0 ? 6.0f : 7.0f), org.telegram.messenger.g0.L(this.M0 ? 44.0f : this.N0 ? 42.0f : 46.0f) + L, org.telegram.messenger.g0.L(this.M0 ? 44.0f : 46.0f) + org.telegram.messenger.g0.L(this.M0 ? 6.0f : 7.0f));
        if (hd.a0) {
            if (this.Q.getLineCount() > 0 && this.Q.getLineLeft(0) == 0.0f) {
                double ceil = Math.ceil(this.Q.getLineWidth(0));
                double d2 = this.U;
                if (ceil < d2) {
                    this.O = (int) ((d2 - ceil) + this.O);
                }
            }
            StaticLayout staticLayout2 = this.r0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.r0.getLineLeft(0) == 0.0f) {
                double ceil2 = Math.ceil(this.r0.getLineWidth(0));
                double d10 = i10;
                if (ceil2 < d10) {
                    this.q0 = (int) ((d10 - ceil2) + this.q0);
                }
            }
        } else {
            if (this.Q.getLineCount() > 0 && this.Q.getLineRight(0) == this.U) {
                double ceil3 = Math.ceil(this.Q.getLineWidth(0));
                double d11 = this.U;
                if (ceil3 < d11) {
                    this.O = (int) (this.O - (d11 - ceil3));
                }
            }
            StaticLayout staticLayout3 = this.r0;
            if (staticLayout3 != null && staticLayout3.getLineCount() > 0 && this.r0.getLineRight(0) == i10) {
                double ceil4 = Math.ceil(this.r0.getLineWidth(0));
                double d12 = i10;
                if (ceil4 < d12) {
                    this.q0 = (int) (this.q0 - (d12 - ceil4));
                }
            }
        }
        this.O = getPaddingLeft() + this.O;
        this.q0 = getPaddingLeft() + this.q0;
        this.S = getPaddingLeft() + this.S;
        if (this.M0) {
            this.O = org.telegram.messenger.g0.L(1.0f) + this.O;
            this.P = org.telegram.messenger.g0.L(1.0f) + this.P;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.t0 == drawable || this.s0 == drawable || super.verifyDrawable(drawable);
    }

    public final void w(boolean z9, boolean z10) {
        wo woVar = this.A0;
        if (woVar == null) {
            return;
        }
        woVar.a(z9, z10);
    }

    public final void x(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        this.n = charSequence;
        boolean z11 = obj instanceof TLRPC.User;
        int i7 = this.N;
        TL_account.RequirementToContact requirementToContact = null;
        TL_account.requirementToContactPaidMessages requirementtocontactpaidmessages = null;
        requirementToContact = null;
        if (z11) {
            this.D = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            TL_account.RequirementToContact J2 = this.l0 ? qp.s1(i7).J2(this.D.id) : null;
            this.n0 = J2 instanceof TL_account.requirementToContactPremium;
            this.o0 = org.telegram.messenger.m5.k(J2);
            setOpenBotButton(this.B0 && this.D.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.D = null;
            this.G = null;
            if (chat.send_paid_messages_stars != 0) {
                requirementtocontactpaidmessages = new TL_account.requirementToContactPaidMessages();
                requirementtocontactpaidmessages.stars_amount = chat.send_paid_messages_stars;
            }
            this.n0 = false;
            this.o0 = org.telegram.messenger.m5.k(requirementtocontactpaidmessages);
            setOpenBotButton(false);
        } else if (obj instanceof org.telegram.messenger.d5) {
            org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) obj;
            this.G = d5Var;
            this.E = null;
            this.D = null;
            if (this.l0 && d5Var.m != null) {
                requirementToContact = qp.s1(i7).J2(this.G.m.id);
            }
            this.n0 = requirementToContact instanceof TL_account.requirementToContactPremium;
            this.o0 = org.telegram.messenger.m5.k(requirementToContact);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.w = charSequence2;
        this.d0 = z9;
        this.L = z10;
        y(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i7) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        int L;
        TLRPC.Dialog dialog;
        String i10;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user3 = this.D;
        ImageReceiver imageReceiver = this.r;
        int i11 = this.N;
        org.telegram.ui.Components.w8 w8Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            w8Var.r(user3);
            if (t10.z(this.D)) {
                w8Var.g(12);
                imageReceiver.q0(null, null, w8Var, null, null, 0);
            } else if (this.L) {
                w8Var.g(1);
                imageReceiver.q0(null, null, w8Var, null, null, 0);
            } else {
                TLRPC.User user4 = this.D;
                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.s0(hc.m(i11, 1, user4), "50_50", hc.m(p10.s0, 2, this.D), "50_50", drawable2, this.D, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = w8Var;
                fileLocation = fileLocation3;
                imageReceiver.s0(hc.m(i11, 1, user4), "50_50", hc.m(p10.s0, 2, this.D), "50_50", drawable2, this.D, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.E;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            w8Var.q(chat);
                            imageReceiver.s0(hc.m(i11, 1, this.E), "50_50", hc.m(p10.s0, 2, this.E), "50_50", drawable, this.E, 0);
                        } else {
                            qg.d.n(i11, chat, w8Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = w8Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                org.telegram.messenger.d5 d5Var = this.G;
                if (d5Var != null) {
                    w8Var.k(0L, d5Var.i, d5Var.j, null);
                    imageReceiver.q0(null, null, w8Var, null, null, 0);
                } else {
                    w8Var.k(0L, null, null, null);
                    imageReceiver.q0(null, null, w8Var, null, null, 0);
                }
            }
        }
        if (org.telegram.messenger.t3.Y(this.E)) {
            int L2 = org.telegram.messenger.g0.L(46.0f);
            Rect rect = bg.s.a;
            L = (L2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 == null || !chat2.monoforum) {
                L = org.telegram.messenger.g0.L(this.N0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                L = 0;
            }
        }
        imageReceiver.J0(L);
        if (i7 != 0) {
            int i12 = qp.C8;
            boolean z9 = !(((i7 & 2) == 0 || this.D == null) && ((i7 & 8) == 0 || this.E == null)) && (((fileLocation2 = this.K) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z9 && (i7 & 4) != 0 && (user2 = this.D) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.J) {
                    z9 = true;
                }
            }
            if (!z9 && (524288 & i7) != 0 && ((user = this.D) != null || this.E != null)) {
                z(user != null ? user.verified : this.E.verified, user, this.E, true);
            }
            if ((!z9 && (i7 & 1) != 0 && this.D != null) || ((i7 & 16) != 0 && this.E != null)) {
                if (this.D != null) {
                    i10 = this.D.first_name + this.D.last_name;
                } else {
                    TLRPC.Chat chat3 = this.E;
                    i10 = chat3.monoforum ? qg.d.i(i11, chat3, false) : chat3.title;
                }
                if (!i10.equals(this.I)) {
                    z9 = true;
                }
            }
            if (!((z9 || !this.d0 || (i7 & 256) == 0 || (dialog = (TLRPC.Dialog) qp.s1(i11).Q.f(this.H)) == null || qp.s1(i11).V0(dialog) == this.e0) ? z9 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.D;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.J = userStatus2.expires;
            } else {
                this.J = 0;
            }
            this.I = this.D.first_name + this.D.last_name;
        } else {
            TLRPC.Chat chat4 = this.E;
            if (chat4 != null) {
                this.I = chat4.monoforum ? qg.d.i(i11, chat4, false) : chat4.title;
            }
        }
        this.K = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            v();
        }
        postInvalidate();
    }

    public final void z(boolean z9, TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        boolean z11 = hd.a0;
        org.telegram.ui.Components.g5 g5Var = this.t0;
        g5Var.a = z11;
        boolean z12 = this.H0;
        org.telegram.ui.ActionBar.f6 f6Var = this.x;
        if (z12 && z9) {
            g5Var.g(new xp(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1, 0, 0), z10);
            g5Var.k(null);
        } else if (z12 && user != null && !this.L && org.telegram.messenger.m5.f(user.emoji_status) != 0) {
            g5Var.j(org.telegram.messenger.m5.f(user.emoji_status), z10);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, f6Var)));
        } else if (!this.H0 || chat == null || this.L || org.telegram.messenger.m5.f(chat.emoji_status) == 0) {
            if (this.H0 && user != null && !this.L) {
                qp.s1(this.N);
                if (qp.B2(user)) {
                    g5Var.g((Drawable) ia.e.d().f, z10);
                    g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, f6Var)));
                }
            }
            g5Var.g(null, z10);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, f6Var)));
        } else {
            g5Var.j(org.telegram.messenger.m5.f(chat.emoji_status), z10);
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, f6Var)));
        }
        long c10 = user != null ? org.telegram.messenger.m5.c(user) : chat != null ? org.telegram.messenger.m5.c(chat) : 0L;
        org.telegram.ui.Components.g5 g5Var2 = this.s0;
        if (c10 == 0 || this.L) {
            g5Var2.g(null, z10);
        } else {
            g5Var2.j(c10, z10);
        }
        g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z9, f6Var)));
    }
}
