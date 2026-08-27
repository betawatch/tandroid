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
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.p00;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.x5 {
    public TLRPC.Chat A;
    public boolean A0;
    public TLRPC.EncryptedChat B;
    public TextPaint B0;
    public ContactsController.Contact C;
    public TextPaint C0;
    public long D;
    public boolean D0;
    public String E;
    public final nc E0;
    public int F;
    public final Paint F0;
    public TLRPC.FileLocation G;
    public final RectF G0;
    public boolean H;
    public pz0 H0;
    public boolean I;
    public boolean I0;
    public final int J;
    public boolean J0;
    public int K;
    public ag.i2 K0;
    public int L;
    public Drawable L0;
    public StaticLayout M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public tc R;
    public StaticLayout S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int a0;
    public final int b0;
    public int c0;
    public int d0;
    public StaticLayout e0;
    public boolean f;
    public boolean[] f0;
    public boolean g0;
    public ce0 h;
    public boolean h0;
    public final org.telegram.ui.Components.y5 i0;
    public boolean j0;
    public long k0;
    public boolean l0;
    public int m0;
    public CharSequence n;
    public StaticLayout n0;
    public final org.telegram.ui.Components.i5 o0;
    public final org.telegram.ui.Components.i5 p0;
    public final jh.h7 q0;
    public final ImageReceiver r;
    public final RectF r0;
    public final org.telegram.ui.Components.y8 s;
    public pz0 s0;
    public Paint t0;
    public final nc u0;
    public CharSequence v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.c6 w;
    public final bp w0;
    public TLRPC.TL_sponsoredPeer x;
    public boolean x0;
    public TLRPC.User y;
    public Utilities.Callback y0;
    public Utilities.Callback2 z0;

    public e6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.J = UserConfig.selectedAccount;
        this.b0 = AndroidUtilities.dp(19.0f);
        this.i0 = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        er erVar = er.f;
        this.q0 = new jh.h7(null, false);
        this.r0 = new RectF();
        this.u0 = new nc(this);
        this.v0 = new RectF();
        this.D0 = true;
        this.E0 = new nc(this);
        this.F0 = new Paint(1);
        this.G0 = new RectF();
        this.w = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.s = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        bp bpVar = new bp(context, 21, c6Var);
        this.w0 = bpVar;
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar);
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), this);
        this.o0 = i5Var;
        i5Var.setCallback(this);
        org.telegram.ui.Components.i5 i5Var2 = new org.telegram.ui.Components.i5(AndroidUtilities.dp(20.0f), this);
        this.p0 = i5Var2;
        i5Var2.setCallback(this);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        if (this.M == null || getMeasuredWidth() <= 0) {
            return;
        }
        s();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
            TLRPC.User user = this.y;
            TL_account.RequirementToContact requirementToContact = null;
            int i12 = this.J;
            if (user == null) {
                TLRPC.Chat chat = this.A;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.C;
                    if (contact == null) {
                        return;
                    }
                    if (this.h0 && contact.user != null) {
                        requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.C.user.id);
                    }
                }
            } else if (this.h0) {
                requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.y.id);
            }
            if (this.j0 == DialogObject.isPremiumBlocked(requirementToContact) && this.k0 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
                return;
            }
            this.j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.A;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.D;
    }

    public TLRPC.User getUser() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.h0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.p0.a();
        this.o0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.h0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.p0.b();
        this.o0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f10;
        float f11;
        float f12;
        float f13;
        int ceil;
        if (this.y == null && this.A == null && this.B == null && this.C == null) {
            return;
        }
        boolean z10 = this.I;
        org.telegram.ui.ActionBar.c6 c6Var = this.w;
        if (z10) {
            Paint N = (!this.A0 || c6Var == null) ? null : c6Var.N("paintDivider");
            if (N == null) {
                N = org.telegram.ui.ActionBar.g6.k0;
            }
            Paint paint = N;
            if (LocaleController.isRTL) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, getMeasuredHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, paint);
            }
        } else {
            canvas2 = canvas;
        }
        if (this.N) {
            a0.p(this.O, this.P, org.telegram.ui.ActionBar.g6.a1);
            org.telegram.ui.ActionBar.g6.a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.Components.i5 i5Var = this.o0;
            if (z11) {
                ceil = (int) (staticLayout.getLineRight(0) + this.K + AndroidUtilities.dp(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.K - AndroidUtilities.dp(3.0f)) - i5Var.s;
            } else {
                f13 = 6.0f;
                ceil = (int) ((((this.K + this.Q) - Math.ceil(this.M.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - i5Var.s);
                a0.q(i5Var, ceil, ((this.M.getHeight() - i5Var.s) / 2.0f) + this.L);
                i5Var.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.K, this.L);
                this.M.draw(canvas2);
                canvas2.restore();
                boolean z12 = LocaleController.isRTL;
                org.telegram.ui.Components.i5 i5Var2 = this.p0;
                a0.q(i5Var2, !z12 ? this.M.getLineLeft(0) == 0.0f ? (this.K - AndroidUtilities.dp(3.0f)) - i5Var2.s : (int) ((((this.K + this.Q) - Math.ceil(this.M.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - i5Var2.s) : (int) (this.M.getLineRight(0) + this.K + AndroidUtilities.dp(f13)), ((this.M.getHeight() - i5Var2.s) / 2.0f) + this.L);
                i5Var2.draw(canvas2);
            }
            f13 = 6.0f;
            a0.q(i5Var, ceil, ((this.M.getHeight() - i5Var.s) / 2.0f) + this.L);
            i5Var.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.K, this.L);
            this.M.draw(canvas2);
            canvas2.restore();
            boolean z122 = LocaleController.isRTL;
            org.telegram.ui.Components.i5 i5Var22 = this.p0;
            a0.q(i5Var22, !z122 ? this.M.getLineLeft(0) == 0.0f ? (this.K - AndroidUtilities.dp(3.0f)) - i5Var22.s : (int) ((((this.K + this.Q) - Math.ceil(this.M.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - i5Var22.s) : (int) (this.M.getLineRight(0) + this.K + AndroidUtilities.dp(f13)), ((this.M.getHeight() - i5Var22.s) / 2.0f) + this.L);
            i5Var22.draw(canvas2);
        }
        if (this.x == null || this.s0 == null || this.t0 == null) {
            f10 = 2.0f;
        } else {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            this.t0.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, v02));
            int dp = AndroidUtilities.dp(12.66f) + ((int) this.s0.l());
            int dp2 = AndroidUtilities.dp(17.33f);
            float dp3 = LocaleController.isRTL ? AndroidUtilities.dp(12.0f) : org.telegram.messenger.y1.B(12.0f, getWidth(), dp);
            int i10 = this.L;
            f10 = 2.0f;
            RectF rectF = this.r0;
            rectF.set(dp3, i10, r6 + dp, i10 + dp2);
            rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas2.save();
            float a2 = this.u0.a(0.1f);
            canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas2.translate(dp3, this.L);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f14 = dp2;
            rectF2.set(0.0f, 0.0f, dp, f14);
            float f15 = f14 / 2.0f;
            canvas2.drawRoundRect(rectF2, f15, f15, this.t0);
            this.s0.c(AndroidUtilities.dp(6.33f), f15, 1.0f, v02, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.n0 != null) {
            canvas2.save();
            canvas2.translate(this.m0 + this.U, AndroidUtilities.dp(this.I0 ? 35.0f : 33.0f) + this.V);
            this.n0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.e0;
        int i11 = this.b0;
        if (staticLayout2 != null) {
            int dp4 = this.c0 - AndroidUtilities.dp(5.5f);
            float dp5 = AndroidUtilities.dp(11.0f) + dp4 + this.d0;
            float dp6 = AndroidUtilities.dp(23.0f) + i11;
            RectF rectF3 = this.v0;
            rectF3.set(dp4, i11, dp5, dp6);
            float f16 = AndroidUtilities.density * 11.5f;
            f11 = 23.0f;
            f12 = 4.0f;
            canvas2.drawRoundRect(rectF3, f16, f16, MessagesController.getInstance(this.J).isDialogMuted(this.D, 0L) ? org.telegram.ui.ActionBar.g6.y0 : org.telegram.ui.ActionBar.g6.w0);
            canvas2.save();
            canvas2.translate(this.c0, AndroidUtilities.dp(4.0f) + i11);
            this.e0.draw(canvas2);
            canvas2.restore();
        } else {
            f11 = 23.0f;
            f12 = 4.0f;
        }
        if (this.S != null) {
            tc tcVar = this.R;
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.U8, false);
            int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.W8, false);
            tcVar.g.setColor(w02);
            z zVar = tcVar.e;
            if (zVar != null) {
                org.telegram.ui.ActionBar.g6.B1(zVar, w03, true);
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(this.T, i11, this.S.getWidth() + r4, AndroidUtilities.dp(f11) + i11);
            rectF4.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(f12));
            tc tcVar2 = this.R;
            tcVar2.i = false;
            tcVar2.c = 0;
            tcVar2.a(rectF4);
            tc tcVar3 = this.R;
            tcVar3.n = true;
            tcVar3.c(canvas2, tcVar3.g);
            z zVar2 = tcVar3.e;
            if (zVar2 != null) {
                zVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.T, AndroidUtilities.dp(f12) + i11);
            this.S.draw(canvas2);
            canvas2.restore();
        }
        boolean z13 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z13) {
            TLRPC.Chat chat = this.A;
            jh.h7 h7Var = this.q0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.y;
                if (user != null) {
                    jh.l7.h(user.id, canvas2, imageReceiver, h7Var);
                } else if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.g6.S0;
                        RectF rectF5 = h7Var.F;
                        RectF rectF6 = h7Var.F;
                        gf.s.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    jh.l7.h(-this.A.id, canvas2, imageReceiver, h7Var);
                } else {
                    imageReceiver.setImageCoords(h7Var.F);
                    imageReceiver.draw(canvas2);
                }
            } else {
                if (this.h == null) {
                    this.h = new ce0();
                }
                ce0 ce0Var = this.h;
                RectF rectF7 = h7Var.F;
                RectF rectF8 = h7Var.F;
                ce0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f10));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.setImageCoords(rectF8);
                imageReceiver.draw(canvas2);
                canvas2.restore();
            }
        }
        float e9 = this.i0.e(this.j0);
        if (e9 > 0.0f) {
            float centerY = imageReceiver.getCenterY() + AndroidUtilities.dp(14.0f);
            float centerX = imageReceiver.getCenterX() + AndroidUtilities.dp(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.g6.t0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e9, org.telegram.ui.ActionBar.g6.t0);
            if (this.K0 == null) {
                this.K0 = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, this.w);
            }
            this.K0.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e9, this.K0.f);
            if (this.L0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.L0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.L0.setBounds((int) (centerX - (((r3.getIntrinsicWidth() / f10) * 0.875f) * e9)), (int) (centerY - (((this.L0.getIntrinsicHeight() / f10) * 0.875f) * e9)), (int) (((this.L0.getIntrinsicWidth() / f10) * 0.875f * e9) + centerX), (int) (((this.L0.getIntrinsicHeight() / f10) * 0.875f * e9) + centerY));
            this.L0.setAlpha((int) (e9 * 255.0f));
            this.L0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.l0 || this.H0 == null) {
            return;
        }
        float dp7 = AndroidUtilities.dp(28.0f) + this.H0.c;
        float dp8 = LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getWidth() - dp7) - AndroidUtilities.dp(15.0f);
        float dp9 = AndroidUtilities.dp(28.0f);
        int w04 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false);
        Paint paint2 = this.F0;
        paint2.setColor(w04);
        float height = (getHeight() + dp9) / f10;
        RectF rectF9 = this.G0;
        rectF9.set(dp8, (getHeight() - dp9) / f10, dp7 + dp8, height);
        canvas2.save();
        float a3 = this.E0.a(0.06f);
        canvas2.scale(a3, a3, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f10, rectF9.height() / f10, paint2);
        this.H0.c(AndroidUtilities.dp(14.0f) + dp8, getHeight() / f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        StaticLayout staticLayout = this.M;
        if (staticLayout != null) {
            sb2.append(staticLayout.getText());
        }
        if (this.g0) {
            sb2.append(", ");
            rl.j(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.n0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.n0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        bp bpVar = this.w0;
        if (bpVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(bpVar.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.y == null && this.A == null && this.B == null && this.C == null) {
            return;
        }
        bp bpVar = this.w0;
        if (bpVar != null) {
            int dp = LocaleController.isRTL ? (i12 - i10) - AndroidUtilities.dp(42.0f) : AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(36.0f);
            bpVar.layout(dp, dp2, bpVar.getMeasuredWidth() + dp, bpVar.getMeasuredHeight() + dp2);
        }
        if (z10) {
            s();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        bp bpVar = this.w0;
        if (bpVar != null) {
            bpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.I0 ? AndroidUtilities.dp(56.0f) : AndroidUtilities.dp(60.0f) + (this.I ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r6.h == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
    
        if (r6.h == false) goto L54;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        if (this.l0 && this.y0 != null && this.y != null) {
            boolean contains = this.G0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            nc ncVar = this.E0;
            if (action == 0 || motionEvent.getAction() == 2) {
                ncVar.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (ncVar.h) {
                        this.y0.run(this.y);
                    }
                    ncVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    ncVar.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.x != null && this.z0 != null) {
            boolean contains2 = this.r0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            nc ncVar2 = this.u0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                ncVar2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (ncVar2.h) {
                        this.z0.run(this, this.x);
                    }
                    ncVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    ncVar2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.y == null && this.A == null) || !this.q0.a(motionEvent, this)) && ((tcVar = this.R) == null || !tcVar.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void s() {
        TLRPC.Chat chat;
        TextPaint textPaint;
        int measuredWidth;
        float f10;
        float f11;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i10;
        int i11;
        int dp;
        this.N = false;
        this.g0 = false;
        TLRPC.EncryptedChat encryptedChat = this.B;
        float f12 = 11.0f;
        int i12 = this.J;
        if (encryptedChat != null) {
            this.N = true;
            this.D = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            if (LocaleController.isRTL) {
                this.O = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth();
                this.K = AndroidUtilities.dp(11.0f);
            } else {
                this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.K = org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            }
            this.P = AndroidUtilities.dp(22.0f);
            w(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.A;
            if (chat2 != null) {
                this.D = -chat2.id;
                this.g0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.A.linked_monoforum_id))) != null) {
                    this.g0 = chat.verified;
                }
                if (LocaleController.isRTL) {
                    this.K = AndroidUtilities.dp(11.0f);
                } else {
                    this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                w(this.g0, null, this.A, false);
            } else {
                TLRPC.User user = this.y;
                if (user != null) {
                    this.D = user.id;
                    if (LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(11.0f);
                    } else {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    this.P = AndroidUtilities.dp(21.0f);
                    this.g0 = this.y.verified;
                    if (!this.H) {
                        MessagesController.getInstance(i12).isPremiumUser(this.y);
                    }
                    w(this.g0, this.y, null, false);
                } else if (this.C != null) {
                    this.D = 0L;
                    if (LocaleController.isRTL) {
                        this.K = AndroidUtilities.dp(11.0f);
                    } else {
                        this.K = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    if (this.R == null) {
                        tc tcVar = new tc(this);
                        this.R = tcVar;
                        tcVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (LocaleController.isRTL) {
            this.m0 = AndroidUtilities.dp(11.0f);
        } else {
            this.m0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        if (this.x != null) {
            if (this.s0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                cq cqVar = new cq(R.drawable.ic_ab_other, 0);
                cqVar.setScale(0.55f, 0.55f);
                cqVar.spaceScaleX = 0.7f;
                cqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(cqVar, append.length() - 1, append.length(), 33);
                this.s0 = new pz0(append, 12.0f, null);
            }
            if (this.t0 == null) {
                this.t0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.A;
        org.telegram.ui.ActionBar.c6 c6Var = this.w;
        CharSequence charSequence4 = charSequence3;
        if (chat3 != null) {
            charSequence4 = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(this.A.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder.setSpan(new p00(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.g6.y6, c6Var), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.A.title));
                }
            } else if (charSequence3 == null) {
                charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat3.title));
            }
        } else if (charSequence3 == null) {
            TLRPC.User user2 = this.y;
            charSequence4 = charSequence3;
            if (user2 != null) {
                charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2)));
            }
        }
        CharSequence replaceNewLines = AndroidUtilities.replaceNewLines(charSequence4);
        if (TextUtils.isEmpty(replaceNewLines)) {
            TLRPC.User user3 = this.y;
            replaceNewLines = (user3 == null || TextUtils.isEmpty(user3.phone)) ? LocaleController.getString(R.string.HiddenName) : org.telegram.messenger.y1.k(new StringBuilder("+"), this.y.phone, oe.b.c());
        }
        if (this.A0) {
            if (this.B0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.B0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            this.B0.setTextSize(AndroidUtilities.dp(this.I0 ? 15.0f : 16.0f));
            if (this.B != null) {
                this.B0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Z8, c6Var));
            } else {
                this.B0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.X8, c6Var));
            }
            textPaint = this.B0;
        } else {
            textPaint = this.B != null ? org.telegram.ui.ActionBar.g6.E0 : org.telegram.ui.ActionBar.g6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.Q = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.K) - AndroidUtilities.dp(14.0f);
            this.Q = measuredWidth;
        }
        if (this.N) {
            this.Q -= org.telegram.ui.ActionBar.g6.a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.s0.c);
            this.Q -= dp2;
            if (LocaleController.isRTL) {
                this.K += dp2;
            }
        }
        if (this.C != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.g6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.S = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.g6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (LocaleController.isRTL) {
                this.T = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.K += measureText;
                this.m0 += measureText;
            } else {
                this.T = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            }
            this.Q = rl.u(32.0f, measureText, this.Q);
        }
        this.Q -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.W) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.D));
            if (dialogUnreadCount != 0) {
                this.a0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f10 = 0.0f;
                f11 = 12.0f;
                this.d0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.g6.L0.measureText(sb3)));
                this.e0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.g6.L0, this.d0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.d0;
                this.Q -= dp3;
                paddingRight -= dp3;
                if (LocaleController.isRTL) {
                    this.c0 = AndroidUtilities.dp(19.0f);
                    this.K += dp3;
                    this.m0 += dp3;
                } else {
                    this.c0 = (getMeasuredWidth() - this.d0) - AndroidUtilities.dp(19.0f);
                }
            } else {
                f10 = 0.0f;
                f11 = 12.0f;
                this.a0 = 0;
                this.e0 = null;
            }
        } else {
            f10 = 0.0f;
            f11 = 12.0f;
            this.a0 = 0;
            this.e0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.i5 i5Var = this.o0;
        boolean d = i5Var.d();
        int i14 = i5Var.s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.Q -= i14;
            } else {
                this.K += i14;
            }
        }
        org.telegram.ui.Components.i5 i5Var2 = this.p0;
        if (!i5Var2.d() && !LocaleController.isRTL) {
            this.Q -= i5Var2.s;
        }
        if (this.Q < 0) {
            this.Q = 0;
        }
        float dp4 = this.Q - AndroidUtilities.dp(f11);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint3, dp4, truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint3.getFontMetricsInt(), false);
        }
        CharSequence charSequence5 = ellipsize;
        int i15 = this.Q;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.M = new StaticLayout(charSequence5, textPaint3, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.g6.Q0;
        TLRPC.Chat chat5 = this.A;
        if (chat5 == null || this.v != null) {
            CharSequence charSequence6 = this.v;
            if (charSequence6 == null) {
                TLRPC.User user4 = this.y;
                if (user4 == null) {
                    charSequence = null;
                } else if (MessagesController.isSupportUser(user4)) {
                    charSequence = LocaleController.getString(R.string.SupportStatus);
                } else {
                    TLRPC.User user5 = this.y;
                    boolean z10 = user5.bot;
                    if (z10 && (i10 = user5.bot_active_users) != 0) {
                        charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                    } else if (z10) {
                        charSequence = LocaleController.getString(R.string.Bot);
                    } else {
                        long j10 = user5.id;
                        if (j10 == UserObject.VERIFY) {
                            charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                        } else if (UserObject.isService(j10)) {
                            charSequence = LocaleController.getString(R.string.ServiceNotifications);
                        } else {
                            if (this.f0 == null) {
                                this.f0 = new boolean[1];
                            }
                            boolean[] zArr = this.f0;
                            zArr[0] = false;
                            charSequence6 = LocaleController.formatUserStatus(i12, this.y, zArr);
                            if (this.f0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.g6.P0;
                            }
                            TLRPC.User user6 = this.y;
                            if (user6 != null && (user6.id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                textPaint4 = org.telegram.ui.ActionBar.g6.P0;
                                charSequence = LocaleController.getString(R.string.Online);
                            }
                        }
                    }
                }
                if (!this.H || UserObject.isReplyUser(this.y)) {
                    this.L = AndroidUtilities.dp(20.0f);
                    charSequence = null;
                }
            }
            charSequence = charSequence6;
            if (!this.H) {
            }
            this.L = AndroidUtilities.dp(20.0f);
            charSequence = null;
        } else {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.A)) {
                TLRPC.Chat chat6 = this.A;
                int i16 = chat6.participants_count;
                charSequence = i16 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i16) : !ChatObject.isPublic(chat6) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            } else {
                TLRPC.Chat chat7 = this.A;
                int i17 = chat7.participants_count;
                charSequence = i17 != 0 ? LocaleController.formatPluralStringComma("Members", i17) : chat7.has_geo ? LocaleController.getString(R.string.MegaLocation) : ChatObject.isMonoForum(chat7) ? LocaleController.getString(R.string.MonoforumMessages) : !ChatObject.isPublic(this.A) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
            }
            this.L = AndroidUtilities.dp(19.0f);
        }
        if (this.A0) {
            if (this.C0 == null) {
                this.C0 = new TextPaint(1);
            }
            this.C0.setTextSize(AndroidUtilities.dp(this.I0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.g6.Q0) {
                this.C0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.g6.P0) {
                this.C0.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.p6, c6Var));
            }
            textPaint4 = this.C0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.L = AndroidUtilities.dp(20.0f);
            this.n0 = null;
        } else {
            i11 = i13;
            this.n0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint4, i13 - AndroidUtilities.dp(f11), truncateAt), textPaint4, i13, alignment, 1.0f, 0.0f, false);
            this.L = AndroidUtilities.dp(9.0f);
            this.P -= AndroidUtilities.dp(10.0f);
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.I0) {
                f12 = 14.0f;
            } else if (this.J0) {
                f12 = 15.0f;
            }
            dp = AndroidUtilities.dp(f12) + getPaddingLeft();
        }
        this.q0.F.set(dp, AndroidUtilities.dp(this.I0 ? 6.0f : 7.0f), AndroidUtilities.dp(this.I0 ? 44.0f : this.J0 ? 42.0f : 46.0f) + dp, AndroidUtilities.dp(this.I0 ? 44.0f : 46.0f) + AndroidUtilities.dp(this.I0 ? 6.0f : 7.0f));
        if (LocaleController.isRTL) {
            if (this.M.getLineCount() > 0 && this.M.getLineLeft(0) == f10) {
                double ceil = Math.ceil(this.M.getLineWidth(0));
                double d10 = this.Q;
                if (ceil < d10) {
                    this.K = (int) ((d10 - ceil) + this.K);
                }
            }
            StaticLayout staticLayout = this.n0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.n0.getLineLeft(0) == f10) {
                double ceil2 = Math.ceil(this.n0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.m0 = (int) ((d11 - ceil2) + this.m0);
                }
            }
        } else {
            if (this.M.getLineCount() > 0 && this.M.getLineRight(0) == this.Q) {
                double ceil3 = Math.ceil(this.M.getLineWidth(0));
                double d12 = this.Q;
                if (ceil3 < d12) {
                    this.K = (int) (this.K - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.n0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.n0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.n0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.m0 = (int) (this.m0 - (d13 - ceil4));
                }
            }
        }
        this.K = getPaddingLeft() + this.K;
        this.m0 = getPaddingLeft() + this.m0;
        this.O = getPaddingLeft() + this.O;
        if (this.I0) {
            this.K = AndroidUtilities.dp(1.0f) + this.K;
            this.L = AndroidUtilities.dp(1.0f) + this.L;
        }
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.D0 = z10;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<e6, TLRPC.TL_sponsoredPeer> callback2) {
        this.z0 = callback2;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.l0 == z10) {
            return;
        }
        if (this.H0 == null) {
            this.H0 = new pz0(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        int dp = z10 ? AndroidUtilities.dp(30.0f) + ((int) this.H0.c) : 0;
        boolean z11 = LocaleController.isRTL;
        int i10 = z11 ? dp : 0;
        if (z11) {
            dp = 0;
        }
        setPadding(i10, 0, dp, 0);
        this.l0 = z10;
        this.E0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.J0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        v(0);
    }

    public final void t(boolean z10, boolean z11) {
        bp bpVar = this.w0;
        if (bpVar == null) {
            return;
        }
        bpVar.a(z10, z11);
    }

    public final void u(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i10 = this.J;
        if (z12) {
            this.y = (TLRPC.User) obj;
            this.A = null;
            this.C = null;
            r2 = this.h0 ? MessagesController.getInstance(i10).isUserContactBlocked(this.y.id) : null;
            this.j0 = DialogObject.isPremiumBlocked(r2);
            this.k0 = DialogObject.getMessagesStarsPrice(r2);
            setOpenBotButton(this.x0 && this.y.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.A = chat;
            this.y = null;
            this.C = null;
            TL_account.RequirementToContact requirementToContact = ChatObject.getRequirementToContact(chat);
            this.j0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.k0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.C = contact;
            this.A = null;
            this.y = null;
            if (this.h0 && contact.user != null) {
                r2 = MessagesController.getInstance(i10).isUserContactBlocked(this.C.user.id);
            }
            this.j0 = DialogObject.isPremiumBlocked(r2);
            this.k0 = DialogObject.getMessagesStarsPrice(r2);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.B = encryptedChat;
        this.v = charSequence2;
        this.W = z10;
        this.H = z11;
        v(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(int i10) {
        Drawable drawable;
        TLRPC.FileLocation fileLocation;
        int dp;
        TLRPC.Dialog dialog;
        String i11;
        TLRPC.User user;
        TLRPC.User user2;
        TLRPC.FileLocation fileLocation2;
        Drawable drawable2;
        TLRPC.User user3 = this.y;
        ImageReceiver imageReceiver = this.r;
        int i12 = this.J;
        org.telegram.ui.Components.y8 y8Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            y8Var.m(i12, user3);
            if (UserObject.isReplyUser(this.y)) {
                y8Var.g(12);
                imageReceiver.setImage(null, null, y8Var, null, null, 0);
            } else if (this.H) {
                y8Var.g(1);
                imageReceiver.setImage(null, null, y8Var, null, null, 0);
            } else {
                TLRPC.User user4 = this.y;
                TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
                if (userProfilePhoto != null) {
                    fileLocation3 = userProfilePhoto.photo_small;
                    Drawable drawable3 = userProfilePhoto.strippedBitmap;
                    if (drawable3 != null) {
                        drawable2 = drawable3;
                        fileLocation = fileLocation3;
                        imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, user4, 1), "50_50", ImageLocation.getForUserOrChat(this.y, 2), "50_50", drawable2, this.y, 0);
                        fileLocation3 = fileLocation;
                    }
                }
                drawable2 = y8Var;
                fileLocation = fileLocation3;
                imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, user4, 1), "50_50", ImageLocation.getForUserOrChat(this.y, 2), "50_50", drawable2, this.y, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.A;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            y8Var.k(i12, chat);
                            imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, this.A, 1), "50_50", ImageLocation.getForUserOrChat(this.A, 2), "50_50", drawable, this.A, 0);
                        } else {
                            wf.c.n(i12, chat, y8Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = y8Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                ContactsController.Contact contact = this.C;
                if (contact != null) {
                    y8Var.n(0L, contact.first_name, contact.last_name);
                    imageReceiver.setImage(null, null, y8Var, null, null, 0);
                } else {
                    y8Var.n(0L, null, null);
                    imageReceiver.setImage(null, null, y8Var, null, null, 0);
                }
            }
        }
        if (ChatObject.isCommunity(this.A)) {
            int dp2 = AndroidUtilities.dp(46.0f);
            Rect rect = gf.s.a;
            dp = (dp2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.A;
            if (chat2 == null || !chat2.monoforum) {
                dp = AndroidUtilities.dp(this.J0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                dp = 0;
            }
        }
        imageReceiver.setRoundRadius(dp);
        if (i10 != 0) {
            boolean z10 = !(((MessagesController.UPDATE_MASK_AVATAR & i10) == 0 || this.y == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i10) == 0 || this.A == null)) && (((fileLocation2 = this.G) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z10 && (MessagesController.UPDATE_MASK_STATUS & i10) != 0 && (user2 = this.y) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.F) {
                    z10 = true;
                }
            }
            if (!z10 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & i10) != 0 && ((user = this.y) != null || this.A != null)) {
                w(user != null ? user.verified : this.A.verified, user, this.A, true);
            }
            if ((!z10 && (MessagesController.UPDATE_MASK_NAME & i10) != 0 && this.y != null) || ((MessagesController.UPDATE_MASK_CHAT_NAME & i10) != 0 && this.A != null)) {
                if (this.y != null) {
                    i11 = this.y.first_name + this.y.last_name;
                } else {
                    TLRPC.Chat chat3 = this.A;
                    i11 = chat3.monoforum ? wf.c.i(chat3, i12, false) : chat3.title;
                }
                if (!i11.equals(this.E)) {
                    z10 = true;
                }
            }
            if (!((z10 || !this.W || (i10 & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.D)) == null || MessagesController.getInstance(i12).getDialogUnreadCount(dialog) == this.a0) ? z10 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.y;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.F = userStatus2.expires;
            } else {
                this.F = 0;
            }
            this.E = this.y.first_name + this.y.last_name;
        } else {
            TLRPC.Chat chat4 = this.A;
            if (chat4 != null) {
                this.E = chat4.monoforum ? wf.c.i(chat4, i12, false) : chat4.title;
            }
        }
        this.G = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            s();
        }
        postInvalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.p0 == drawable || this.o0 == drawable || super.verifyDrawable(drawable);
    }

    public final void w(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.i5 i5Var = this.p0;
        i5Var.a = z12;
        boolean z13 = this.D0;
        org.telegram.ui.ActionBar.c6 c6Var = this.w;
        if (z13 && z10) {
            i5Var.g(new dq(org.telegram.ui.ActionBar.g6.f1, org.telegram.ui.ActionBar.g6.i1, 0, 0), z11);
            i5Var.k(null);
        } else if (z13 && user != null && !this.H && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
        } else if (this.D0 && chat != null && !this.H && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            i5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
        } else if (!this.D0 || user == null || this.H || !MessagesController.getInstance(this.J).isPremiumUser(user)) {
            i5Var.g(null, z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
        } else {
            i5Var.g(ag.j2.d().e, z11);
            i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
        }
        long botVerificationIcon = user != null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
        org.telegram.ui.Components.i5 i5Var2 = this.o0;
        if (botVerificationIcon == 0 || this.H) {
            i5Var2.g(null, z11);
        } else {
            i5Var2.j(botVerificationIcon, z11);
        }
        i5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z9, c6Var)));
    }
}
