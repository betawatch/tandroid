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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qe0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.e10;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class h6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.z5 {
    public final mp A0;
    public boolean B0;
    public Utilities.Callback C0;
    public Utilities.Callback2 D0;
    public TLRPC.Chat E;
    public boolean E0;
    public TLRPC.EncryptedChat F;
    public TextPaint F0;
    public ContactsController.Contact G;
    public TextPaint G0;
    public long H;
    public boolean H0;
    public String I;
    public final zc I0;
    public int J;
    public final Paint J0;
    public TLRPC.FileLocation K;
    public final RectF K0;
    public boolean L;
    public f01 L0;
    public boolean M;
    public boolean M0;
    public final int N;
    public boolean N0;
    public int O;
    public sg.c1 O0;
    public int P;
    public Drawable P0;
    public StaticLayout Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public gd V;
    public StaticLayout W;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public boolean f;
    public final int f0;
    public int g0;
    public qe0 h;
    public int h0;
    public StaticLayout i0;
    public boolean[] j0;
    public boolean k0;
    public boolean l0;
    public final org.telegram.ui.Components.e6 m0;
    public CharSequence n;
    public boolean n0;
    public long o0;
    public boolean p0;
    public int q0;
    public final ImageReceiver r;
    public StaticLayout r0;
    public final org.telegram.ui.Components.i9 s;
    public final org.telegram.ui.Components.o5 s0;
    public final org.telegram.ui.Components.o5 t0;
    public final bi.j9 u0;
    public CharSequence v;
    public final RectF v0;
    public final org.telegram.ui.ActionBar.f6 w;
    public f01 w0;
    public TLRPC.TL_sponsoredPeer x;
    public Paint x0;
    public TLRPC.User y;
    public final zc y0;
    public final RectF z0;

    public h6(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.N = UserConfig.selectedAccount;
        this.f0 = AndroidUtilities.dp(19.0f);
        this.m0 = new org.telegram.ui.Components.e6(this, 0L, 350L, pr.h);
        pr prVar = pr.f;
        this.u0 = new bi.j9(null, false);
        this.v0 = new RectF();
        this.y0 = new zc(this);
        this.z0 = new RectF();
        this.H0 = true;
        this.I0 = new zc(this);
        this.J0 = new Paint(1);
        this.K0 = new RectF();
        this.w = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.s = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        mp mpVar = new mp(context, 21, f6Var);
        this.A0 = mpVar;
        mpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        addView(mpVar);
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), this);
        this.s0 = o5Var;
        o5Var.setCallback(this);
        org.telegram.ui.Components.o5 o5Var2 = new org.telegram.ui.Components.o5(AndroidUtilities.dp(20.0f), this);
        this.t0 = o5Var2;
        o5Var2.setCallback(this);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void d() {
        if (this.Q == null || getMeasuredWidth() <= 0) {
            return;
        }
        r();
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
            int i12 = this.N;
            if (user == null) {
                TLRPC.Chat chat = this.E;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.G;
                    if (contact == null) {
                        return;
                    }
                    if (this.l0 && contact.user != null) {
                        requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.G.user.id);
                    }
                }
            } else if (this.l0) {
                requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.y.id);
            }
            if (this.n0 == DialogObject.isPremiumBlocked(requirementToContact) && this.o0 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
                return;
            }
            this.n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            invalidate();
        }
    }

    public TLRPC.Chat getChat() {
        return this.E;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.H;
    }

    public TLRPC.User getUser() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.l0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.t0.a();
        this.s0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.l0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.t0.b();
        this.s0.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        float f11;
        float f12;
        int ceil;
        if (this.y == null && this.E == null && this.F == null && this.G == null) {
            return;
        }
        boolean z10 = this.M;
        org.telegram.ui.ActionBar.f6 f6Var = this.w;
        if (z10) {
            Paint G = (!this.E0 || f6Var == null) ? null : f6Var.G("paintDivider");
            if (G == null) {
                G = org.telegram.ui.ActionBar.j6.k0;
            }
            Paint paint = G;
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
        if (this.R) {
            a0.o(this.S, this.T, org.telegram.ui.ActionBar.j6.a1);
            org.telegram.ui.ActionBar.j6.a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.Q;
        if (staticLayout != null) {
            boolean z11 = LocaleController.isRTL;
            org.telegram.ui.Components.o5 o5Var = this.s0;
            if (z11) {
                ceil = (int) (staticLayout.getLineRight(0) + this.O + AndroidUtilities.dp(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.O - AndroidUtilities.dp(3.0f)) - o5Var.s;
            } else {
                f12 = 6.0f;
                ceil = (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - o5Var.s);
                a0.p(o5Var, ceil, ((this.Q.getHeight() - o5Var.s) / 2.0f) + this.P);
                o5Var.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.O, this.P);
                this.Q.draw(canvas2);
                canvas2.restore();
                boolean z12 = LocaleController.isRTL;
                org.telegram.ui.Components.o5 o5Var2 = this.t0;
                a0.p(o5Var2, !z12 ? this.Q.getLineLeft(0) == 0.0f ? (this.O - AndroidUtilities.dp(3.0f)) - o5Var2.s : (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - o5Var2.s) : (int) (this.Q.getLineRight(0) + this.O + AndroidUtilities.dp(f12)), ((this.Q.getHeight() - o5Var2.s) / 2.0f) + this.P);
                o5Var2.draw(canvas2);
            }
            f12 = 6.0f;
            a0.p(o5Var, ceil, ((this.Q.getHeight() - o5Var.s) / 2.0f) + this.P);
            o5Var.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.O, this.P);
            this.Q.draw(canvas2);
            canvas2.restore();
            boolean z122 = LocaleController.isRTL;
            org.telegram.ui.Components.o5 o5Var22 = this.t0;
            a0.p(o5Var22, !z122 ? this.Q.getLineLeft(0) == 0.0f ? (this.O - AndroidUtilities.dp(3.0f)) - o5Var22.s : (int) ((((this.O + this.U) - Math.ceil(this.Q.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - o5Var22.s) : (int) (this.Q.getLineRight(0) + this.O + AndroidUtilities.dp(f12)), ((this.Q.getHeight() - o5Var22.s) / 2.0f) + this.P);
            o5Var22.draw(canvas2);
        }
        if (this.x == null || this.w0 == null || this.x0 == null) {
            f7 = 2.0f;
        } else {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var);
            this.x0.setColor(org.telegram.ui.ActionBar.j6.l1(0.1f, v02));
            int dp = AndroidUtilities.dp(12.66f) + ((int) this.w0.l());
            int dp2 = AndroidUtilities.dp(17.33f);
            float dp3 = LocaleController.isRTL ? AndroidUtilities.dp(12.0f) : org.telegram.messenger.w1.B(12.0f, getWidth(), dp);
            int i10 = this.P;
            f7 = 2.0f;
            RectF rectF = this.v0;
            rectF.set(dp3, i10, r6 + dp, i10 + dp2);
            rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas2.save();
            float a2 = this.y0.a(0.1f);
            canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas2.translate(dp3, this.P);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f13 = dp2;
            rectF2.set(0.0f, 0.0f, dp, f13);
            float f14 = f13 / 2.0f;
            canvas2.drawRoundRect(rectF2, f14, f14, this.x0);
            this.w0.c(AndroidUtilities.dp(6.33f), f14, 1.0f, v02, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.r0 != null) {
            canvas2.save();
            canvas2.translate(this.q0 + this.b0, AndroidUtilities.dp(this.M0 ? 35.0f : 33.0f) + this.c0);
            this.r0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.i0;
        int i11 = this.f0;
        if (staticLayout2 != null) {
            int dp4 = this.g0 - AndroidUtilities.dp(5.5f);
            float dp5 = AndroidUtilities.dp(11.0f) + dp4 + this.h0;
            float dp6 = AndroidUtilities.dp(23.0f) + i11;
            RectF rectF3 = this.z0;
            rectF3.set(dp4, i11, dp5, dp6);
            float f15 = AndroidUtilities.density * 11.5f;
            f10 = 23.0f;
            f11 = 4.0f;
            canvas2.drawRoundRect(rectF3, f15, f15, MessagesController.getInstance(this.N).isDialogMuted(this.H, 0L) ? org.telegram.ui.ActionBar.j6.y0 : org.telegram.ui.ActionBar.j6.w0);
            canvas2.save();
            canvas2.translate(this.g0, AndroidUtilities.dp(4.0f) + i11);
            this.i0.draw(canvas2);
            canvas2.restore();
        } else {
            f10 = 23.0f;
            f11 = 4.0f;
        }
        if (this.W != null) {
            gd gdVar = this.V;
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U8, false);
            int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.W8, false);
            gdVar.g.setColor(w02);
            z zVar = gdVar.e;
            if (zVar != null) {
                org.telegram.ui.ActionBar.j6.B1(zVar, w03, true);
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(this.a0, i11, this.W.getWidth() + r4, AndroidUtilities.dp(f10) + i11);
            rectF4.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(f11));
            gd gdVar2 = this.V;
            gdVar2.i = false;
            gdVar2.c = 0;
            gdVar2.a(rectF4);
            gd gdVar3 = this.V;
            gdVar3.n = true;
            gdVar3.c(canvas2, gdVar3.g);
            z zVar2 = gdVar3.e;
            if (zVar2 != null) {
                zVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.a0, AndroidUtilities.dp(f11) + i11);
            this.W.draw(canvas2);
            canvas2.restore();
        }
        boolean z13 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z13) {
            TLRPC.Chat chat = this.E;
            bi.j9 j9Var = this.u0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.y;
                if (user != null) {
                    bi.p9.h(user.id, canvas2, imageReceiver, j9Var);
                } else if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.j6.S0;
                        RectF rectF5 = j9Var.F;
                        RectF rectF6 = j9Var.F;
                        yf.p.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    bi.p9.h(-this.E.id, canvas2, imageReceiver, j9Var);
                } else {
                    imageReceiver.setImageCoords(j9Var.F);
                    imageReceiver.draw(canvas2);
                }
            } else {
                if (this.h == null) {
                    this.h = new qe0();
                }
                qe0 qe0Var = this.h;
                RectF rectF7 = j9Var.F;
                RectF rectF8 = j9Var.F;
                qe0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f7));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.setImageCoords(rectF8);
                imageReceiver.draw(canvas2);
                canvas2.restore();
            }
        }
        float e7 = this.m0.e(this.n0);
        if (e7 > 0.0f) {
            float centerY = imageReceiver.getCenterY() + AndroidUtilities.dp(14.0f);
            float centerX = imageReceiver.getCenterX() + AndroidUtilities.dp(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.j6.t0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e7, org.telegram.ui.ActionBar.j6.t0);
            if (this.O0 == null) {
                this.O0 = new sg.c1(org.telegram.ui.ActionBar.j6.Lj, org.telegram.ui.ActionBar.j6.Mj, -1, -1, this.w);
            }
            this.O0.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e7, this.O0.f);
            if (this.P0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.P0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.P0.setBounds((int) (centerX - (((r3.getIntrinsicWidth() / f7) * 0.875f) * e7)), (int) (centerY - (((this.P0.getIntrinsicHeight() / f7) * 0.875f) * e7)), (int) (((this.P0.getIntrinsicWidth() / f7) * 0.875f * e7) + centerX), (int) (((this.P0.getIntrinsicHeight() / f7) * 0.875f * e7) + centerY));
            this.P0.setAlpha((int) (e7 * 255.0f));
            this.P0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.p0 || this.L0 == null) {
            return;
        }
        float dp7 = AndroidUtilities.dp(28.0f) + this.L0.c;
        float dp8 = LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getWidth() - dp7) - AndroidUtilities.dp(15.0f);
        float dp9 = AndroidUtilities.dp(28.0f);
        int w04 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false);
        Paint paint2 = this.J0;
        paint2.setColor(w04);
        float height = (getHeight() + dp9) / f7;
        RectF rectF9 = this.K0;
        rectF9.set(dp8, (getHeight() - dp9) / f7, dp7 + dp8, height);
        canvas2.save();
        float a10 = this.I0.a(0.06f);
        canvas2.scale(a10, a10, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f7, rectF9.height() / f7, paint2);
        this.L0.c(AndroidUtilities.dp(14.0f) + dp8, getHeight() / f7, 1.0f, -1, canvas);
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
            vl.l(R.string.AccDescrVerified, "\n", sb2);
        }
        if (this.r0 != null) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(this.r0.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
        mp mpVar = this.A0;
        if (mpVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(mpVar.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.y == null && this.E == null && this.F == null && this.G == null) {
            return;
        }
        mp mpVar = this.A0;
        if (mpVar != null) {
            int dp = LocaleController.isRTL ? (i12 - i10) - AndroidUtilities.dp(42.0f) : AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(36.0f);
            mpVar.layout(dp, dp2, mpVar.getMeasuredWidth() + dp, mpVar.getMeasuredHeight() + dp2);
        }
        if (z10) {
            r();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        mp mpVar = this.A0;
        if (mpVar != null) {
            mpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.M0 ? AndroidUtilities.dp(56.0f) : AndroidUtilities.dp(60.0f) + (this.M ? 1 : 0));
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
        gd gdVar;
        if (this.p0 && this.C0 != null && this.y != null) {
            boolean contains = this.K0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            zc zcVar = this.I0;
            if (action == 0 || motionEvent.getAction() == 2) {
                zcVar.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (zcVar.h) {
                        this.C0.run(this.y);
                    }
                    zcVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    zcVar.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.x != null && this.D0 != null) {
            boolean contains2 = this.v0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            zc zcVar2 = this.y0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                zcVar2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (zcVar2.h) {
                        this.D0.run(this, this.x);
                    }
                    zcVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    zcVar2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.y == null && this.E == null) || !this.u0.a(motionEvent, this)) && ((gdVar = this.V) == null || !gdVar.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void r() {
        TLRPC.Chat chat;
        TextPaint textPaint;
        int measuredWidth;
        float f7;
        float f10;
        CharSequence charSequence;
        TLRPC.UserStatus userStatus;
        int i10;
        int i11;
        int dp;
        this.R = false;
        this.k0 = false;
        TLRPC.EncryptedChat encryptedChat = this.F;
        float f11 = 11.0f;
        int i12 = this.N;
        if (encryptedChat != null) {
            this.R = true;
            this.H = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            if (LocaleController.isRTL) {
                this.S = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth();
                this.O = AndroidUtilities.dp(11.0f);
            } else {
                this.S = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.O = org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            }
            this.T = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 != null) {
                this.H = -chat2.id;
                this.k0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.E.linked_monoforum_id))) != null) {
                    this.k0 = chat.verified;
                }
                if (LocaleController.isRTL) {
                    this.O = AndroidUtilities.dp(11.0f);
                } else {
                    this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                v(this.k0, null, this.E, false);
            } else {
                TLRPC.User user = this.y;
                if (user != null) {
                    this.H = user.id;
                    if (LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(11.0f);
                    } else {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    this.T = AndroidUtilities.dp(21.0f);
                    this.k0 = this.y.verified;
                    if (!this.L) {
                        MessagesController.getInstance(i12).isPremiumUser(this.y);
                    }
                    v(this.k0, this.y, null, false);
                } else if (this.G != null) {
                    this.H = 0L;
                    if (LocaleController.isRTL) {
                        this.O = AndroidUtilities.dp(11.0f);
                    } else {
                        this.O = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    if (this.V == null) {
                        gd gdVar = new gd(this);
                        this.V = gdVar;
                        gdVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (LocaleController.isRTL) {
            this.q0 = AndroidUtilities.dp(11.0f);
        } else {
            this.q0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        if (this.x != null) {
            if (this.w0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                nq nqVar = new nq(R.drawable.ic_ab_other, 0);
                nqVar.setScale(0.55f, 0.55f);
                nqVar.spaceScaleX = 0.7f;
                nqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(nqVar, append.length() - 1, append.length(), 33);
                this.w0 = new f01(append, 12.0f, null);
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
        TLRPC.Chat chat3 = this.E;
        org.telegram.ui.ActionBar.f6 f6Var = this.w;
        CharSequence charSequence4 = charSequence3;
        if (chat3 != null) {
            charSequence4 = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(this.E.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder.setSpan(new e10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.j6.y6, f6Var), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.E.title));
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
            replaceNewLines = (user3 == null || TextUtils.isEmpty(user3.phone)) ? LocaleController.getString(R.string.HiddenName) : org.telegram.messenger.w1.j(new StringBuilder("+"), this.y.phone, gf.b.c());
        }
        if (this.E0) {
            if (this.F0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.F0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            this.F0.setTextSize(AndroidUtilities.dp(this.M0 ? 15.0f : 16.0f));
            if (this.F != null) {
                this.F0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Z8, f6Var));
            } else {
                this.F0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X8, f6Var));
            }
            textPaint = this.F0;
        } else {
            textPaint = this.F != null ? org.telegram.ui.ActionBar.j6.E0 : org.telegram.ui.ActionBar.j6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.O) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.U = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.O) - AndroidUtilities.dp(14.0f);
            this.U = measuredWidth;
        }
        if (this.R) {
            this.U -= org.telegram.ui.ActionBar.j6.a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.w0.c);
            this.U -= dp2;
            if (LocaleController.isRTL) {
                this.O += dp2;
            }
        }
        if (this.G != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.j6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.W = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.j6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (LocaleController.isRTL) {
                this.a0 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.O += measureText;
                this.q0 += measureText;
            } else {
                this.a0 = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            }
            this.U = vl.v(32.0f, measureText, this.U);
        }
        this.U -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.d0) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.H));
            if (dialogUnreadCount != 0) {
                this.e0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dialogUnreadCount);
                String sb3 = sb2.toString();
                f7 = 0.0f;
                f10 = 12.0f;
                this.h0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.j6.L0.measureText(sb3)));
                this.i0 = new StaticLayout(sb3, org.telegram.ui.ActionBar.j6.L0, this.h0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.h0;
                this.U -= dp3;
                paddingRight -= dp3;
                if (LocaleController.isRTL) {
                    this.g0 = AndroidUtilities.dp(19.0f);
                    this.O += dp3;
                    this.q0 += dp3;
                } else {
                    this.g0 = (getMeasuredWidth() - this.h0) - AndroidUtilities.dp(19.0f);
                }
            } else {
                f7 = 0.0f;
                f10 = 12.0f;
                this.e0 = 0;
                this.i0 = null;
            }
        } else {
            f7 = 0.0f;
            f10 = 12.0f;
            this.e0 = 0;
            this.i0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.o5 o5Var = this.s0;
        boolean d = o5Var.d();
        int i14 = o5Var.s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.U -= i14;
            } else {
                this.O += i14;
            }
        }
        org.telegram.ui.Components.o5 o5Var2 = this.t0;
        if (!o5Var2.d() && !LocaleController.isRTL) {
            this.U -= o5Var2.s;
        }
        if (this.U < 0) {
            this.U = 0;
        }
        float dp4 = this.U - AndroidUtilities.dp(f10);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint3, dp4, truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint3.getFontMetricsInt(), false);
        }
        CharSequence charSequence5 = ellipsize;
        int i15 = this.U;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.Q = new StaticLayout(charSequence5, textPaint3, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.j6.Q0;
        TLRPC.Chat chat5 = this.E;
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
                        long j3 = user5.id;
                        if (j3 == UserObject.VERIFY) {
                            charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                        } else if (UserObject.isService(j3)) {
                            charSequence = LocaleController.getString(R.string.ServiceNotifications);
                        } else {
                            if (this.j0 == null) {
                                this.j0 = new boolean[1];
                            }
                            boolean[] zArr = this.j0;
                            zArr[0] = false;
                            charSequence6 = LocaleController.formatUserStatus(i12, this.y, zArr);
                            if (this.j0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.j6.P0;
                            }
                            TLRPC.User user6 = this.y;
                            if (user6 != null && (user6.id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                textPaint4 = org.telegram.ui.ActionBar.j6.P0;
                                charSequence = LocaleController.getString(R.string.Online);
                            }
                        }
                    }
                }
                if (!this.L || UserObject.isReplyUser(this.y)) {
                    this.P = AndroidUtilities.dp(20.0f);
                    charSequence = null;
                }
            }
            charSequence = charSequence6;
            if (!this.L) {
            }
            this.P = AndroidUtilities.dp(20.0f);
            charSequence = null;
        } else {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.E)) {
                TLRPC.Chat chat6 = this.E;
                int i16 = chat6.participants_count;
                charSequence = i16 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i16) : !ChatObject.isPublic(chat6) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            } else {
                TLRPC.Chat chat7 = this.E;
                int i17 = chat7.participants_count;
                charSequence = i17 != 0 ? LocaleController.formatPluralStringComma("Members", i17) : chat7.has_geo ? LocaleController.getString(R.string.MegaLocation) : ChatObject.isMonoForum(chat7) ? LocaleController.getString(R.string.MonoforumMessages) : !ChatObject.isPublic(this.E) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
            }
            this.P = AndroidUtilities.dp(19.0f);
        }
        if (this.E0) {
            if (this.G0 == null) {
                this.G0 = new TextPaint(1);
            }
            this.G0.setTextSize(AndroidUtilities.dp(this.M0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.j6.Q0) {
                this.G0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.j6.P0) {
                this.G0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.p6, f6Var));
            }
            textPaint4 = this.G0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.P = AndroidUtilities.dp(20.0f);
            this.r0 = null;
        } else {
            i11 = i13;
            this.r0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint4, i13 - AndroidUtilities.dp(f10), truncateAt), textPaint4, i13, alignment, 1.0f, 0.0f, false);
            this.P = AndroidUtilities.dp(9.0f);
            this.T -= AndroidUtilities.dp(10.0f);
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.M0) {
                f11 = 14.0f;
            } else if (this.N0) {
                f11 = 15.0f;
            }
            dp = AndroidUtilities.dp(f11) + getPaddingLeft();
        }
        this.u0.F.set(dp, AndroidUtilities.dp(this.M0 ? 6.0f : 7.0f), AndroidUtilities.dp(this.M0 ? 44.0f : this.N0 ? 42.0f : 46.0f) + dp, AndroidUtilities.dp(this.M0 ? 44.0f : 46.0f) + AndroidUtilities.dp(this.M0 ? 6.0f : 7.0f));
        if (LocaleController.isRTL) {
            if (this.Q.getLineCount() > 0 && this.Q.getLineLeft(0) == f7) {
                double ceil = Math.ceil(this.Q.getLineWidth(0));
                double d10 = this.U;
                if (ceil < d10) {
                    this.O = (int) ((d10 - ceil) + this.O);
                }
            }
            StaticLayout staticLayout = this.r0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.r0.getLineLeft(0) == f7) {
                double ceil2 = Math.ceil(this.r0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.q0 = (int) ((d11 - ceil2) + this.q0);
                }
            }
        } else {
            if (this.Q.getLineCount() > 0 && this.Q.getLineRight(0) == this.U) {
                double ceil3 = Math.ceil(this.Q.getLineWidth(0));
                double d12 = this.U;
                if (ceil3 < d12) {
                    this.O = (int) (this.O - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.r0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.r0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.r0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.q0 = (int) (this.q0 - (d13 - ceil4));
                }
            }
        }
        this.O = getPaddingLeft() + this.O;
        this.q0 = getPaddingLeft() + this.q0;
        this.S = getPaddingLeft() + this.S;
        if (this.M0) {
            this.O = AndroidUtilities.dp(1.0f) + this.O;
            this.P = AndroidUtilities.dp(1.0f) + this.P;
        }
    }

    public final void s(boolean z10, boolean z11) {
        mp mpVar = this.A0;
        if (mpVar == null) {
            return;
        }
        mpVar.a(z10, z11);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z10) {
        this.H0 = z10;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<h6, TLRPC.TL_sponsoredPeer> callback2) {
        this.D0 = callback2;
    }

    public void setOpenBotButton(boolean z10) {
        if (this.p0 == z10) {
            return;
        }
        if (this.L0 == null) {
            this.L0 = new f01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        int dp = z10 ? AndroidUtilities.dp(30.0f) + ((int) this.L0.c) : 0;
        boolean z11 = LocaleController.isRTL;
        int i10 = z11 ? dp : 0;
        if (z11) {
            dp = 0;
        }
        setPadding(i10, 0, dp, 0);
        this.p0 = z10;
        this.I0.c(false);
    }

    public void setRectangularAvatar(boolean z10) {
        this.N0 = z10;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        u(0);
    }

    public final void t(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.n = charSequence;
        boolean z12 = obj instanceof TLRPC.User;
        int i10 = this.N;
        if (z12) {
            this.y = (TLRPC.User) obj;
            this.E = null;
            this.G = null;
            r2 = this.l0 ? MessagesController.getInstance(i10).isUserContactBlocked(this.y.id) : null;
            this.n0 = DialogObject.isPremiumBlocked(r2);
            this.o0 = DialogObject.getMessagesStarsPrice(r2);
            setOpenBotButton(this.B0 && this.y.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.E = chat;
            this.y = null;
            this.G = null;
            TL_account.RequirementToContact requirementToContact = ChatObject.getRequirementToContact(chat);
            this.n0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.o0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.G = contact;
            this.E = null;
            this.y = null;
            if (this.l0 && contact.user != null) {
                r2 = MessagesController.getInstance(i10).isUserContactBlocked(this.G.user.id);
            }
            this.n0 = DialogObject.isPremiumBlocked(r2);
            this.o0 = DialogObject.getMessagesStarsPrice(r2);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.F = encryptedChat;
        this.v = charSequence2;
        this.d0 = z10;
        this.L = z11;
        u(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i10) {
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
        int i12 = this.N;
        org.telegram.ui.Components.i9 i9Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            i9Var.m(i12, user3);
            if (UserObject.isReplyUser(this.y)) {
                i9Var.g(12);
                imageReceiver.setImage(null, null, i9Var, null, null, 0);
            } else if (this.L) {
                i9Var.g(1);
                imageReceiver.setImage(null, null, i9Var, null, null, 0);
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
                drawable2 = i9Var;
                fileLocation = fileLocation3;
                imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, user4, 1), "50_50", ImageLocation.getForUserOrChat(this.y, 2), "50_50", drawable2, this.y, 0);
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
                            i9Var.k(i12, chat);
                            imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, this.E, 1), "50_50", ImageLocation.getForUserOrChat(this.E, 2), "50_50", drawable, this.E, 0);
                        } else {
                            og.d.n(i12, chat, i9Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = i9Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                ContactsController.Contact contact = this.G;
                if (contact != null) {
                    i9Var.n(0L, contact.first_name, contact.last_name);
                    imageReceiver.setImage(null, null, i9Var, null, null, 0);
                } else {
                    i9Var.n(0L, null, null);
                    imageReceiver.setImage(null, null, i9Var, null, null, 0);
                }
            }
        }
        if (ChatObject.isCommunity(this.E)) {
            int dp2 = AndroidUtilities.dp(46.0f);
            Rect rect = yf.p.a;
            dp = (dp2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.E;
            if (chat2 == null || !chat2.monoforum) {
                dp = AndroidUtilities.dp(this.N0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                dp = 0;
            }
        }
        imageReceiver.setRoundRadius(dp);
        if (i10 != 0) {
            boolean z10 = !(((MessagesController.UPDATE_MASK_AVATAR & i10) == 0 || this.y == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i10) == 0 || this.E == null)) && (((fileLocation2 = this.K) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z10 && (MessagesController.UPDATE_MASK_STATUS & i10) != 0 && (user2 = this.y) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.J) {
                    z10 = true;
                }
            }
            if (!z10 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & i10) != 0 && ((user = this.y) != null || this.E != null)) {
                v(user != null ? user.verified : this.E.verified, user, this.E, true);
            }
            if ((!z10 && (MessagesController.UPDATE_MASK_NAME & i10) != 0 && this.y != null) || ((MessagesController.UPDATE_MASK_CHAT_NAME & i10) != 0 && this.E != null)) {
                if (this.y != null) {
                    i11 = this.y.first_name + this.y.last_name;
                } else {
                    TLRPC.Chat chat3 = this.E;
                    i11 = chat3.monoforum ? og.d.i(chat3, i12, false) : chat3.title;
                }
                if (!i11.equals(this.I)) {
                    z10 = true;
                }
            }
            if (!((z10 || !this.d0 || (i10 & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.H)) == null || MessagesController.getInstance(i12).getDialogUnreadCount(dialog) == this.e0) ? z10 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.y;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.J = userStatus2.expires;
            } else {
                this.J = 0;
            }
            this.I = this.y.first_name + this.y.last_name;
        } else {
            TLRPC.Chat chat4 = this.E;
            if (chat4 != null) {
                this.I = chat4.monoforum ? og.d.i(chat4, i12, false) : chat4.title;
            }
        }
        this.K = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            r();
        }
        postInvalidate();
    }

    public final void v(boolean z10, TLRPC.User user, TLRPC.Chat chat, boolean z11) {
        boolean z12 = LocaleController.isRTL;
        org.telegram.ui.Components.o5 o5Var = this.t0;
        o5Var.a = z12;
        boolean z13 = this.H0;
        org.telegram.ui.ActionBar.f6 f6Var = this.w;
        if (z13 && z10) {
            o5Var.g(new oq(org.telegram.ui.ActionBar.j6.f1, org.telegram.ui.ActionBar.j6.i1, 0, 0), z11);
            o5Var.k(null);
        } else if (z13 && user != null && !this.L && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var)));
        } else if (this.H0 && chat != null && !this.L && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            o5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var)));
        } else if (!this.H0 || user == null || this.L || !MessagesController.getInstance(this.N).isPremiumUser(user)) {
            o5Var.g(null, z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var)));
        } else {
            o5Var.g(sg.d1.d().e, z11);
            o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var)));
        }
        long botVerificationIcon = user != null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
        org.telegram.ui.Components.o5 o5Var2 = this.s0;
        if (botVerificationIcon == 0 || this.L) {
            o5Var2.g(null, z11);
        } else {
            o5Var2.j(botVerificationIcon, z11);
        }
        o5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z9, f6Var)));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.t0 == drawable || this.s0 == drawable || super.verifyDrawable(drawable);
    }
}
