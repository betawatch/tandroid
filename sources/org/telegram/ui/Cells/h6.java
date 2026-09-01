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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ve0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.a10;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h6 extends a0 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
    public Utilities.Callback2 A0;
    public TLRPC.Chat B;
    public boolean B0;
    public TLRPC.EncryptedChat C;
    public TextPaint C0;
    public ContactsController.Contact D;
    public TextPaint D0;
    public long E;
    public boolean E0;
    public String F;
    public final rc F0;
    public int G;
    public final Paint G0;
    public TLRPC.FileLocation H;
    public final RectF H0;
    public boolean I;
    public l01 I0;
    public boolean J;
    public boolean J0;
    public final int K;
    public boolean K0;
    public int L;
    public fg.p1 L0;
    public int M;
    public Drawable M0;
    public StaticLayout N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public xc S;
    public StaticLayout T;
    public int U;
    public int V;
    public int W;
    public boolean a0;
    public int b0;
    public final int c0;
    public int d0;
    public int e0;
    public boolean f;
    public StaticLayout f0;
    public boolean[] g0;
    public ve0 h;
    public boolean h0;
    public boolean i0;
    public final org.telegram.ui.Components.z5 j0;
    public boolean k0;
    public long l0;
    public boolean m0;
    public CharSequence n;
    public int n0;
    public StaticLayout o0;
    public final org.telegram.ui.Components.j5 p0;
    public final org.telegram.ui.Components.j5 q0;
    public final ImageReceiver r;
    public final oh.i7 r0;
    public final org.telegram.ui.Components.z8 s;
    public final RectF s0;
    public l01 t0;
    public Paint u0;
    public CharSequence v;
    public final rc v0;
    public final org.telegram.ui.ActionBar.g6 w;
    public final RectF w0;
    public TLRPC.TL_sponsoredPeer x;
    public final np x0;
    public TLRPC.User y;
    public boolean y0;
    public Utilities.Callback z0;

    public h6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.K = UserConfig.selectedAccount;
        this.c0 = AndroidUtilities.dp(19.0f);
        this.j0 = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        pr prVar = pr.f;
        this.r0 = new oh.i7(null, false);
        this.s0 = new RectF();
        this.v0 = new rc(this);
        this.w0 = new RectF();
        this.E0 = true;
        this.F0 = new rc(this);
        this.G0 = new Paint(1);
        this.H0 = new RectF();
        this.w = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(23.0f));
        this.s = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        np npVar = new np(context, 21, g6Var);
        this.x0 = npVar;
        npVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        addView(npVar);
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), this);
        this.p0 = j5Var;
        j5Var.setCallback(this);
        org.telegram.ui.Components.j5 j5Var2 = new org.telegram.ui.Components.j5(AndroidUtilities.dp(20.0f), this);
        this.q0 = j5Var2;
        j5Var2.setCallback(this);
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
            int i12 = this.K;
            if (user == null) {
                TLRPC.Chat chat = this.B;
                if (chat != null) {
                    requirementToContact = ChatObject.getRequirementToContact(chat);
                } else {
                    ContactsController.Contact contact = this.D;
                    if (contact == null) {
                        return;
                    }
                    if (this.i0 && contact.user != null) {
                        requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.D.user.id);
                    }
                }
            } else if (this.i0) {
                requirementToContact = MessagesController.getInstance(i12).isUserContactBlocked(this.y.id);
            }
            if (this.k0 == DialogObject.isPremiumBlocked(requirementToContact) && this.l0 == DialogObject.getMessagesStarsPrice(requirementToContact)) {
                return;
            }
            this.k0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.l0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            invalidate();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void e() {
        if (this.N == null || getMeasuredWidth() <= 0) {
            return;
        }
        r();
    }

    public TLRPC.Chat getChat() {
        return this.B;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    public long getDialogId() {
        return this.E;
    }

    public TLRPC.User getUser() {
        return this.y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.r.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        if (this.i0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.q0.a();
        this.p0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        if (this.i0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.userIsPremiumBlockedUpadted);
        }
        this.q0.b();
        this.p0.b();
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
        if (this.y == null && this.B == null && this.C == null && this.D == null) {
            return;
        }
        boolean z4 = this.J;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (z4) {
            Paint F = (!this.B0 || g6Var == null) ? null : g6Var.F("paintDivider");
            if (F == null) {
                F = org.telegram.ui.ActionBar.k6.k0;
            }
            Paint paint = F;
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
        if (this.O) {
            a0.o(this.P, this.Q, org.telegram.ui.ActionBar.k6.a1);
            org.telegram.ui.ActionBar.k6.a1.draw(canvas2);
        }
        StaticLayout staticLayout = this.N;
        if (staticLayout != null) {
            boolean z10 = LocaleController.isRTL;
            org.telegram.ui.Components.j5 j5Var = this.p0;
            if (z10) {
                ceil = (int) (staticLayout.getLineRight(0) + this.L + AndroidUtilities.dp(6.0f));
            } else if (staticLayout.getLineLeft(0) == 0.0f) {
                ceil = (this.L - AndroidUtilities.dp(3.0f)) - j5Var.s;
            } else {
                f13 = 6.0f;
                ceil = (int) ((((this.L + this.R) - Math.ceil(this.N.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - j5Var.s);
                a0.p(j5Var, ceil, ((this.N.getHeight() - j5Var.s) / 2.0f) + this.M);
                j5Var.draw(canvas2);
                canvas2.save();
                canvas2.translate(this.L, this.M);
                this.N.draw(canvas2);
                canvas2.restore();
                boolean z11 = LocaleController.isRTL;
                org.telegram.ui.Components.j5 j5Var2 = this.q0;
                a0.p(j5Var2, !z11 ? this.N.getLineLeft(0) == 0.0f ? (this.L - AndroidUtilities.dp(3.0f)) - j5Var2.s : (int) ((((this.L + this.R) - Math.ceil(this.N.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - j5Var2.s) : (int) (this.N.getLineRight(0) + this.L + AndroidUtilities.dp(f13)), ((this.N.getHeight() - j5Var2.s) / 2.0f) + this.M);
                j5Var2.draw(canvas2);
            }
            f13 = 6.0f;
            a0.p(j5Var, ceil, ((this.N.getHeight() - j5Var.s) / 2.0f) + this.M);
            j5Var.draw(canvas2);
            canvas2.save();
            canvas2.translate(this.L, this.M);
            this.N.draw(canvas2);
            canvas2.restore();
            boolean z112 = LocaleController.isRTL;
            org.telegram.ui.Components.j5 j5Var22 = this.q0;
            a0.p(j5Var22, !z112 ? this.N.getLineLeft(0) == 0.0f ? (this.L - AndroidUtilities.dp(3.0f)) - j5Var22.s : (int) ((((this.L + this.R) - Math.ceil(this.N.getLineWidth(0))) - AndroidUtilities.dp(3.0f)) - j5Var22.s) : (int) (this.N.getLineRight(0) + this.L + AndroidUtilities.dp(f13)), ((this.N.getHeight() - j5Var22.s) / 2.0f) + this.M);
            j5Var22.draw(canvas2);
        }
        if (this.x == null || this.t0 == null || this.u0 == null) {
            f10 = 2.0f;
        } else {
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var);
            this.u0.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, v02));
            int dp = AndroidUtilities.dp(12.66f) + ((int) this.t0.l());
            int dp2 = AndroidUtilities.dp(17.33f);
            float dp3 = LocaleController.isRTL ? AndroidUtilities.dp(12.0f) : org.telegram.messenger.y3.B(12.0f, getWidth(), dp);
            int i10 = this.M;
            f10 = 2.0f;
            RectF rectF = this.s0;
            rectF.set(dp3, i10, r6 + dp, i10 + dp2);
            rectF.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas2.save();
            float a2 = this.v0.a(0.1f);
            canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas2.translate(dp3, this.M);
            RectF rectF2 = AndroidUtilities.rectTmp;
            float f14 = dp2;
            rectF2.set(0.0f, 0.0f, dp, f14);
            float f15 = f14 / 2.0f;
            canvas2.drawRoundRect(rectF2, f15, f15, this.u0);
            this.t0.c(AndroidUtilities.dp(6.33f), f15, 1.0f, v02, canvas);
            canvas2 = canvas;
            canvas2.restore();
        }
        if (this.o0 != null) {
            canvas2.save();
            canvas2.translate(this.n0 + this.V, AndroidUtilities.dp(this.J0 ? 35.0f : 33.0f) + this.W);
            this.o0.draw(canvas2);
            canvas2.restore();
        }
        StaticLayout staticLayout2 = this.f0;
        int i11 = this.c0;
        if (staticLayout2 != null) {
            int dp4 = this.d0 - AndroidUtilities.dp(5.5f);
            float dp5 = AndroidUtilities.dp(11.0f) + dp4 + this.e0;
            float dp6 = AndroidUtilities.dp(23.0f) + i11;
            RectF rectF3 = this.w0;
            rectF3.set(dp4, i11, dp5, dp6);
            float f16 = AndroidUtilities.density * 11.5f;
            f11 = 23.0f;
            f12 = 4.0f;
            canvas2.drawRoundRect(rectF3, f16, f16, MessagesController.getInstance(this.K).isDialogMuted(this.E, 0L) ? org.telegram.ui.ActionBar.k6.y0 : org.telegram.ui.ActionBar.k6.w0);
            canvas2.save();
            canvas2.translate(this.d0, AndroidUtilities.dp(4.0f) + i11);
            this.f0.draw(canvas2);
            canvas2.restore();
        } else {
            f11 = 23.0f;
            f12 = 4.0f;
        }
        if (this.T != null) {
            xc xcVar = this.S;
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.U8, false);
            int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.W8, false);
            xcVar.g.setColor(w02);
            z zVar = xcVar.e;
            if (zVar != null) {
                org.telegram.ui.ActionBar.k6.B1(zVar, w03, true);
            }
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(this.U, i11, this.T.getWidth() + r4, AndroidUtilities.dp(f11) + i11);
            rectF4.inset(-AndroidUtilities.dp(16.0f), -AndroidUtilities.dp(f12));
            xc xcVar2 = this.S;
            xcVar2.i = false;
            xcVar2.c = 0;
            xcVar2.a(rectF4);
            xc xcVar3 = this.S;
            xcVar3.n = true;
            xcVar3.c(canvas2, xcVar3.g);
            z zVar2 = xcVar3.e;
            if (zVar2 != null) {
                zVar2.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate(this.U, AndroidUtilities.dp(f12) + i11);
            this.T.draw(canvas2);
            canvas2.restore();
        }
        boolean z12 = this.f;
        ImageReceiver imageReceiver = this.r;
        if (!z12) {
            TLRPC.Chat chat = this.B;
            oh.i7 i7Var = this.r0;
            if (chat == null || !chat.monoforum) {
                TLRPC.User user = this.y;
                if (user != null) {
                    oh.m7.h(user.id, canvas2, imageReceiver, i7Var);
                } else if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        Drawable drawable = org.telegram.ui.ActionBar.k6.S0;
                        RectF rectF5 = i7Var.F;
                        RectF rectF6 = i7Var.F;
                        lf.r.a(canvas2, drawable, rectF5.centerX(), rectF6.centerY(), rectF6.width());
                    }
                    oh.m7.h(-this.B.id, canvas2, imageReceiver, i7Var);
                } else {
                    imageReceiver.setImageCoords(i7Var.F);
                    imageReceiver.draw(canvas2);
                }
            } else {
                if (this.h == null) {
                    this.h = new ve0();
                }
                ve0 ve0Var = this.h;
                RectF rectF7 = i7Var.F;
                RectF rectF8 = i7Var.F;
                ve0Var.a((int) rectF7.centerX(), (int) rectF8.centerY(), (int) (rectF8.width() / f10));
                canvas2.save();
                canvas2.clipPath(this.h);
                imageReceiver.setImageCoords(rectF8);
                imageReceiver.draw(canvas2);
                canvas2.restore();
            }
        }
        float e6 = this.j0.e(this.k0);
        if (e6 > 0.0f) {
            float centerY = imageReceiver.getCenterY() + AndroidUtilities.dp(14.0f);
            float centerX = imageReceiver.getCenterX() + AndroidUtilities.dp(16.0f);
            canvas2.save();
            org.telegram.ui.ActionBar.k6.t0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.d6, g6Var));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(11.33f) * e6, org.telegram.ui.ActionBar.k6.t0);
            if (this.L0 == null) {
                this.L0 = new fg.p1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, this.w);
            }
            this.L0.d((int) (centerX - AndroidUtilities.dp(10.0f)), 0.0f, (int) (centerY - AndroidUtilities.dp(10.0f)), (int) (AndroidUtilities.dp(10.0f) + centerX), 0.0f, (int) (AndroidUtilities.dp(10.0f) + centerY));
            canvas2.drawCircle(centerX, centerY, AndroidUtilities.dp(10.0f) * e6, this.L0.f);
            if (this.M0 == null) {
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock2).mutate();
                this.M0 = mutate;
                mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            }
            this.M0.setBounds((int) (centerX - (((r3.getIntrinsicWidth() / f10) * 0.875f) * e6)), (int) (centerY - (((this.M0.getIntrinsicHeight() / f10) * 0.875f) * e6)), (int) (((this.M0.getIntrinsicWidth() / f10) * 0.875f * e6) + centerX), (int) (((this.M0.getIntrinsicHeight() / f10) * 0.875f * e6) + centerY));
            this.M0.setAlpha((int) (e6 * 255.0f));
            this.M0.draw(canvas2);
            canvas2.restore();
        }
        if (!this.m0 || this.I0 == null) {
            return;
        }
        float dp7 = AndroidUtilities.dp(28.0f) + this.I0.c;
        float dp8 = LocaleController.isRTL ? AndroidUtilities.dp(15.0f) : (getWidth() - dp7) - AndroidUtilities.dp(15.0f);
        float dp9 = AndroidUtilities.dp(28.0f);
        int w04 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false);
        Paint paint2 = this.G0;
        paint2.setColor(w04);
        float height = (getHeight() + dp9) / f10;
        RectF rectF9 = this.H0;
        rectF9.set(dp8, (getHeight() - dp9) / f10, dp7 + dp8, height);
        canvas2.save();
        float a10 = this.F0.a(0.06f);
        canvas2.scale(a10, a10, rectF9.centerX(), rectF9.centerY());
        canvas2.drawRoundRect(rectF9, rectF9.height() / f10, rectF9.height() / f10, paint2);
        this.I0.c(AndroidUtilities.dp(14.0f) + dp8, getHeight() / f10, 1.0f, -1, canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.N;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.h0) {
            sb.append(", ");
            org.telegram.ui.b.i(R.string.AccDescrVerified, "\n", sb);
        }
        if (this.o0 != null) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.o0.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        np npVar = this.x0;
        if (npVar.a.q) {
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(npVar.a.q);
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        if (this.y == null && this.B == null && this.C == null && this.D == null) {
            return;
        }
        np npVar = this.x0;
        if (npVar != null) {
            int dp = LocaleController.isRTL ? (i12 - i10) - AndroidUtilities.dp(42.0f) : AndroidUtilities.dp(42.0f);
            int dp2 = AndroidUtilities.dp(36.0f);
            npVar.layout(dp, dp2, npVar.getMeasuredWidth() + dp, npVar.getMeasuredHeight() + dp2);
        }
        if (z4) {
            r();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        np npVar = this.x0;
        if (npVar != null) {
            npVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), this.J0 ? AndroidUtilities.dp(56.0f) : AndroidUtilities.dp(60.0f) + (this.J ? 1 : 0));
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
        xc xcVar;
        if (this.m0 && this.z0 != null && this.y != null) {
            boolean contains = this.H0.contains(motionEvent.getX(), motionEvent.getY());
            int action = motionEvent.getAction();
            rc rcVar = this.F0;
            if (action == 0 || motionEvent.getAction() == 2) {
                rcVar.c(contains);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (rcVar.h) {
                        this.z0.run(this.y);
                    }
                    rcVar.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    rcVar.c(false);
                    return true;
                }
            }
            if (!contains) {
            }
            return true;
        }
        if (this.x != null && this.A0 != null) {
            boolean contains2 = this.s0.contains(motionEvent.getX(), motionEvent.getY());
            int action2 = motionEvent.getAction();
            rc rcVar2 = this.v0;
            if (action2 == 0 || motionEvent.getAction() == 2) {
                rcVar2.c(contains2);
            } else {
                if (motionEvent.getAction() == 1) {
                    if (rcVar2.h) {
                        this.A0.run(this, this.x);
                    }
                    rcVar2.c(false);
                    return true;
                }
                if (motionEvent.getAction() == 3) {
                    rcVar2.c(false);
                    return true;
                }
            }
            if (!contains2) {
            }
            return true;
        }
        if (((this.y == null && this.B == null) || !this.r0.a(motionEvent, this)) && ((xcVar = this.S) == null || !xcVar.b(motionEvent))) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void r() {
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
        this.O = false;
        this.h0 = false;
        TLRPC.EncryptedChat encryptedChat = this.C;
        float f12 = 11.0f;
        int i12 = this.K;
        if (encryptedChat != null) {
            this.O = true;
            this.E = DialogObject.makeEncryptedDialogId(encryptedChat.id);
            if (LocaleController.isRTL) {
                this.P = (getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline + 2)) - org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth();
                this.L = AndroidUtilities.dp(11.0f);
            } else {
                this.P = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                this.L = org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(AndroidUtilities.leftBaseline + 4);
            }
            this.Q = AndroidUtilities.dp(22.0f);
            v(false, null, null, false);
        } else {
            TLRPC.Chat chat2 = this.B;
            if (chat2 != null) {
                this.E = -chat2.id;
                this.h0 = chat2.verified;
                if (chat2.monoforum && (chat = MessagesController.getInstance(i12).getChat(Long.valueOf(this.B.linked_monoforum_id))) != null) {
                    this.h0 = chat.verified;
                }
                if (LocaleController.isRTL) {
                    this.L = AndroidUtilities.dp(11.0f);
                } else {
                    this.L = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                }
                v(this.h0, null, this.B, false);
            } else {
                TLRPC.User user = this.y;
                if (user != null) {
                    this.E = user.id;
                    if (LocaleController.isRTL) {
                        this.L = AndroidUtilities.dp(11.0f);
                    } else {
                        this.L = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    this.Q = AndroidUtilities.dp(21.0f);
                    this.h0 = this.y.verified;
                    if (!this.I) {
                        MessagesController.getInstance(i12).isPremiumUser(this.y);
                    }
                    v(this.h0, this.y, null, false);
                } else if (this.D != null) {
                    this.E = 0L;
                    if (LocaleController.isRTL) {
                        this.L = AndroidUtilities.dp(11.0f);
                    } else {
                        this.L = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
                    }
                    if (this.S == null) {
                        xc xcVar = new xc(this);
                        this.S = xcVar;
                        xcVar.h = new g(this, 5);
                    }
                }
            }
        }
        if (LocaleController.isRTL) {
            this.n0 = AndroidUtilities.dp(11.0f);
        } else {
            this.n0 = AndroidUtilities.dp(AndroidUtilities.leftBaseline);
        }
        if (this.x != null) {
            if (this.t0 == null) {
                SpannableStringBuilder append = new SpannableStringBuilder(LocaleController.getString(R.string.SearchAd)).append((CharSequence) " i");
                oq oqVar = new oq(R.drawable.ic_ab_other, 0);
                oqVar.setScale(0.55f, 0.55f);
                oqVar.spaceScaleX = 0.7f;
                oqVar.translate(-AndroidUtilities.dp(2.0f), 0.0f);
                append.setSpan(oqVar, append.length() - 1, append.length(), 33);
                this.t0 = new l01(append, 12.0f, null);
            }
            if (this.u0 == null) {
                this.u0 = new Paint(1);
            }
        }
        CharSequence charSequence2 = this.n;
        CharSequence charSequence3 = charSequence2;
        if (charSequence2 == null) {
            charSequence3 = null;
        }
        TLRPC.Chat chat3 = this.B;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        CharSequence charSequence4 = charSequence3;
        if (chat3 != null) {
            charSequence4 = charSequence3;
            if (chat3.monoforum) {
                TLRPC.Chat chat4 = MessagesController.getInstance(i12).getChat(Long.valueOf(this.B.linked_monoforum_id));
                charSequence4 = charSequence3;
                if (chat4 != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.escape(chat4.title));
                    spannableStringBuilder.append((CharSequence) " ");
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.MonoforumSpan));
                    spannableStringBuilder.setSpan(new a10(LocaleController.getString(R.string.MonoforumSpan), org.telegram.ui.ActionBar.k6.y6, g6Var), length, spannableStringBuilder.length(), 33);
                    charSequence4 = spannableStringBuilder;
                } else if (charSequence3 == null) {
                    charSequence4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.B.title));
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
            replaceNewLines = (user3 == null || TextUtils.isEmpty(user3.phone)) ? LocaleController.getString(R.string.HiddenName) : org.telegram.messenger.y3.j(new StringBuilder("+"), this.y.phone, se.b.c());
        }
        if (this.B0) {
            if (this.C0 == null) {
                TextPaint textPaint2 = new TextPaint(1);
                this.C0 = textPaint2;
                textPaint2.setTypeface(AndroidUtilities.bold());
            }
            this.C0.setTextSize(AndroidUtilities.dp(this.J0 ? 15.0f : 16.0f));
            if (this.C != null) {
                this.C0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Z8, g6Var));
            } else {
                this.C0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.X8, g6Var));
            }
            textPaint = this.C0;
        } else {
            textPaint = this.C != null ? org.telegram.ui.ActionBar.k6.E0 : org.telegram.ui.ActionBar.k6.D0;
        }
        TextPaint textPaint3 = textPaint;
        if (LocaleController.isRTL) {
            measuredWidth = (getMeasuredWidth() - this.L) - AndroidUtilities.dp(AndroidUtilities.leftBaseline);
            this.R = measuredWidth;
        } else {
            measuredWidth = (getMeasuredWidth() - this.L) - AndroidUtilities.dp(14.0f);
            this.R = measuredWidth;
        }
        if (this.O) {
            this.R -= org.telegram.ui.ActionBar.k6.a1.getIntrinsicWidth() + AndroidUtilities.dp(6.0f);
        }
        if (this.x != null) {
            int dp2 = AndroidUtilities.dp(20.66f) + ((int) this.t0.c);
            this.R -= dp2;
            if (LocaleController.isRTL) {
                this.L += dp2;
            }
        }
        if (this.D != null) {
            int measureText = (int) (org.telegram.ui.ActionBar.k6.L0.measureText(LocaleController.getString(R.string.Invite)) + 1.0f);
            this.T = new StaticLayout(LocaleController.getString(R.string.Invite), org.telegram.ui.ActionBar.k6.L0, measureText, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            if (LocaleController.isRTL) {
                this.U = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(19.0f);
                this.L += measureText;
                this.n0 += measureText;
            } else {
                this.U = ((getMeasuredWidth() - measureText) - AndroidUtilities.dp(19.0f)) - AndroidUtilities.dp(16.0f);
            }
            this.R = org.telegram.ui.b.t(32.0f, measureText, this.R);
        }
        this.R -= getPaddingRight() + getPaddingLeft();
        int paddingRight = measuredWidth - (getPaddingRight() + getPaddingLeft());
        if (this.a0) {
            int dialogUnreadCount = MessagesController.getInstance(i12).getDialogUnreadCount((TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.E));
            if (dialogUnreadCount != 0) {
                this.b0 = dialogUnreadCount;
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder();
                sb.append(dialogUnreadCount);
                String sb2 = sb.toString();
                f10 = 0.0f;
                f11 = 12.0f;
                this.e0 = Math.max(AndroidUtilities.dp(12.0f), (int) Math.ceil(org.telegram.ui.ActionBar.k6.L0.measureText(sb2)));
                this.f0 = new StaticLayout(sb2, org.telegram.ui.ActionBar.k6.L0, this.e0, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                int dp3 = AndroidUtilities.dp(18.0f) + this.e0;
                this.R -= dp3;
                paddingRight -= dp3;
                if (LocaleController.isRTL) {
                    this.d0 = AndroidUtilities.dp(19.0f);
                    this.L += dp3;
                    this.n0 += dp3;
                } else {
                    this.d0 = (getMeasuredWidth() - this.e0) - AndroidUtilities.dp(19.0f);
                }
            } else {
                f10 = 0.0f;
                f11 = 12.0f;
                this.b0 = 0;
                this.f0 = null;
            }
        } else {
            f10 = 0.0f;
            f11 = 12.0f;
            this.b0 = 0;
            this.f0 = null;
        }
        int i13 = paddingRight;
        org.telegram.ui.Components.j5 j5Var = this.p0;
        boolean d = j5Var.d();
        int i14 = j5Var.s;
        if (!d) {
            if (LocaleController.isRTL) {
                this.R -= i14;
            } else {
                this.L += i14;
            }
        }
        org.telegram.ui.Components.j5 j5Var2 = this.q0;
        if (!j5Var2.d() && !LocaleController.isRTL) {
            this.R -= j5Var2.s;
        }
        if (this.R < 0) {
            this.R = 0;
        }
        float dp4 = this.R - AndroidUtilities.dp(f11);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        CharSequence ellipsize = TextUtils.ellipsize(replaceNewLines, textPaint3, dp4, truncateAt);
        if (ellipsize != null) {
            ellipsize = Emoji.replaceEmoji(ellipsize, textPaint3.getFontMetricsInt(), false);
        }
        CharSequence charSequence5 = ellipsize;
        int i15 = this.R;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.N = new StaticLayout(charSequence5, textPaint3, i15, alignment, 1.0f, 0.0f, false);
        TextPaint textPaint4 = org.telegram.ui.ActionBar.k6.Q0;
        TLRPC.Chat chat5 = this.B;
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
                    boolean z4 = user5.bot;
                    if (z4 && (i10 = user5.bot_active_users) != 0) {
                        charSequence = LocaleController.formatPluralStringSpaced("BotUsersShort", i10);
                    } else if (z4) {
                        charSequence = LocaleController.getString(R.string.Bot);
                    } else {
                        long j10 = user5.id;
                        if (j10 == UserObject.VERIFY) {
                            charSequence = LocaleController.getString(R.string.VerifyCodesNotifications);
                        } else if (UserObject.isService(j10)) {
                            charSequence = LocaleController.getString(R.string.ServiceNotifications);
                        } else {
                            if (this.g0 == null) {
                                this.g0 = new boolean[1];
                            }
                            boolean[] zArr = this.g0;
                            zArr[0] = false;
                            charSequence6 = LocaleController.formatUserStatus(i12, this.y, zArr);
                            if (this.g0[0]) {
                                textPaint4 = org.telegram.ui.ActionBar.k6.P0;
                            }
                            TLRPC.User user6 = this.y;
                            if (user6 != null && (user6.id == UserConfig.getInstance(i12).getClientUserId() || ((userStatus = this.y.status) != null && userStatus.expires > ConnectionsManager.getInstance(i12).getCurrentTime()))) {
                                textPaint4 = org.telegram.ui.ActionBar.k6.P0;
                                charSequence = LocaleController.getString(R.string.Online);
                            }
                        }
                    }
                }
                if (!this.I || UserObject.isReplyUser(this.y)) {
                    this.M = AndroidUtilities.dp(20.0f);
                    charSequence = null;
                }
            }
            charSequence = charSequence6;
            if (!this.I) {
            }
            this.M = AndroidUtilities.dp(20.0f);
            charSequence = null;
        } else {
            if (ChatObject.isCommunity(chat5)) {
                charSequence = LocaleController.getString(R.string.Community).toLowerCase();
            } else if (ChatObject.isChannelAndNotMegaGroup(this.B)) {
                TLRPC.Chat chat6 = this.B;
                int i16 = chat6.participants_count;
                charSequence = i16 != 0 ? LocaleController.formatPluralStringComma("Subscribers", i16) : !ChatObject.isPublic(chat6) ? LocaleController.getString(R.string.ChannelPrivate).toLowerCase() : LocaleController.getString(R.string.ChannelPublic).toLowerCase();
            } else {
                TLRPC.Chat chat7 = this.B;
                int i17 = chat7.participants_count;
                charSequence = i17 != 0 ? LocaleController.formatPluralStringComma("Members", i17) : chat7.has_geo ? LocaleController.getString(R.string.MegaLocation) : ChatObject.isMonoForum(chat7) ? LocaleController.getString(R.string.MonoforumMessages) : !ChatObject.isPublic(this.B) ? LocaleController.getString(R.string.MegaPrivate).toLowerCase() : LocaleController.getString(R.string.MegaPublic).toLowerCase();
            }
            this.M = AndroidUtilities.dp(19.0f);
        }
        if (this.B0) {
            if (this.D0 == null) {
                this.D0 = new TextPaint(1);
            }
            this.D0.setTextSize(AndroidUtilities.dp(this.J0 ? 13.0f : 15.0f));
            if (textPaint4 == org.telegram.ui.ActionBar.k6.Q0) {
                this.D0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
            } else if (textPaint4 == org.telegram.ui.ActionBar.k6.P0) {
                this.D0.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.p6, g6Var));
            }
            textPaint4 = this.D0;
        }
        if (TextUtils.isEmpty(charSequence)) {
            i11 = i13;
            this.M = AndroidUtilities.dp(20.0f);
            this.o0 = null;
        } else {
            i11 = i13;
            this.o0 = new StaticLayout(TextUtils.ellipsize(charSequence, textPaint4, i13 - AndroidUtilities.dp(f11), truncateAt), textPaint4, i13, alignment, 1.0f, 0.0f, false);
            this.M = AndroidUtilities.dp(9.0f);
            this.Q -= AndroidUtilities.dp(10.0f);
        }
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - AndroidUtilities.dp(57.0f)) - getPaddingRight();
        } else {
            if (this.J0) {
                f12 = 14.0f;
            } else if (this.K0) {
                f12 = 15.0f;
            }
            dp = AndroidUtilities.dp(f12) + getPaddingLeft();
        }
        this.r0.F.set(dp, AndroidUtilities.dp(this.J0 ? 6.0f : 7.0f), AndroidUtilities.dp(this.J0 ? 44.0f : this.K0 ? 42.0f : 46.0f) + dp, AndroidUtilities.dp(this.J0 ? 44.0f : 46.0f) + AndroidUtilities.dp(this.J0 ? 6.0f : 7.0f));
        if (LocaleController.isRTL) {
            if (this.N.getLineCount() > 0 && this.N.getLineLeft(0) == f10) {
                double ceil = Math.ceil(this.N.getLineWidth(0));
                double d10 = this.R;
                if (ceil < d10) {
                    this.L = (int) ((d10 - ceil) + this.L);
                }
            }
            StaticLayout staticLayout = this.o0;
            if (staticLayout != null && staticLayout.getLineCount() > 0 && this.o0.getLineLeft(0) == f10) {
                double ceil2 = Math.ceil(this.o0.getLineWidth(0));
                double d11 = i11;
                if (ceil2 < d11) {
                    this.n0 = (int) ((d11 - ceil2) + this.n0);
                }
            }
        } else {
            if (this.N.getLineCount() > 0 && this.N.getLineRight(0) == this.R) {
                double ceil3 = Math.ceil(this.N.getLineWidth(0));
                double d12 = this.R;
                if (ceil3 < d12) {
                    this.L = (int) (this.L - (d12 - ceil3));
                }
            }
            StaticLayout staticLayout2 = this.o0;
            if (staticLayout2 != null && staticLayout2.getLineCount() > 0 && this.o0.getLineRight(0) == i11) {
                double ceil4 = Math.ceil(this.o0.getLineWidth(0));
                double d13 = i11;
                if (ceil4 < d13) {
                    this.n0 = (int) (this.n0 - (d13 - ceil4));
                }
            }
        }
        this.L = getPaddingLeft() + this.L;
        this.n0 = getPaddingLeft() + this.n0;
        this.P = getPaddingLeft() + this.P;
        if (this.J0) {
            this.L = AndroidUtilities.dp(1.0f) + this.L;
            this.M = AndroidUtilities.dp(1.0f) + this.M;
        }
    }

    public final void s(boolean z4, boolean z10) {
        np npVar = this.x0;
        if (npVar == null) {
            return;
        }
        npVar.a(z4, z10);
    }

    public void setAd(TLRPC.TL_sponsoredPeer tL_sponsoredPeer) {
        this.x = tL_sponsoredPeer;
    }

    public void setAllowEmojiStatus(boolean z4) {
        this.E0 = z4;
    }

    public void setOnSponsoredOptionsClick(Utilities.Callback2<h6, TLRPC.TL_sponsoredPeer> callback2) {
        this.A0 = callback2;
    }

    public void setOpenBotButton(boolean z4) {
        if (this.m0 == z4) {
            return;
        }
        if (this.I0 == null) {
            this.I0 = new l01(LocaleController.getString(R.string.BotOpen), 14.0f, AndroidUtilities.bold());
        }
        int dp = z4 ? AndroidUtilities.dp(30.0f) + ((int) this.I0.c) : 0;
        boolean z10 = LocaleController.isRTL;
        int i10 = z10 ? dp : 0;
        if (z10) {
            dp = 0;
        }
        setPadding(i10, 0, dp, 0);
        this.m0 = z4;
        this.F0.c(false);
    }

    public void setRectangularAvatar(boolean z4) {
        this.K0 = z4;
    }

    public void setSubLabel(CharSequence charSequence) {
        this.v = charSequence;
        u(0);
    }

    public final void t(Object obj, TLRPC.EncryptedChat encryptedChat, CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        this.n = charSequence;
        boolean z11 = obj instanceof TLRPC.User;
        int i10 = this.K;
        if (z11) {
            this.y = (TLRPC.User) obj;
            this.B = null;
            this.D = null;
            r2 = this.i0 ? MessagesController.getInstance(i10).isUserContactBlocked(this.y.id) : null;
            this.k0 = DialogObject.isPremiumBlocked(r2);
            this.l0 = DialogObject.getMessagesStarsPrice(r2);
            setOpenBotButton(this.y0 && this.y.bot_has_main_app);
        } else if (obj instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            this.B = chat;
            this.y = null;
            this.D = null;
            TL_account.RequirementToContact requirementToContact = ChatObject.getRequirementToContact(chat);
            this.k0 = DialogObject.isPremiumBlocked(requirementToContact);
            this.l0 = DialogObject.getMessagesStarsPrice(requirementToContact);
            setOpenBotButton(false);
        } else if (obj instanceof ContactsController.Contact) {
            ContactsController.Contact contact = (ContactsController.Contact) obj;
            this.D = contact;
            this.B = null;
            this.y = null;
            if (this.i0 && contact.user != null) {
                r2 = MessagesController.getInstance(i10).isUserContactBlocked(this.D.user.id);
            }
            this.k0 = DialogObject.isPremiumBlocked(r2);
            this.l0 = DialogObject.getMessagesStarsPrice(r2);
            setOpenBotButton(false);
        } else {
            setOpenBotButton(false);
        }
        this.C = encryptedChat;
        this.v = charSequence2;
        this.a0 = z4;
        this.I = z10;
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
        int i12 = this.K;
        org.telegram.ui.Components.z8 z8Var = this.s;
        TLRPC.FileLocation fileLocation3 = null;
        if (user3 != null) {
            z8Var.m(i12, user3);
            if (UserObject.isReplyUser(this.y)) {
                z8Var.g(12);
                imageReceiver.setImage(null, null, z8Var, null, null, 0);
            } else if (this.I) {
                z8Var.g(1);
                imageReceiver.setImage(null, null, z8Var, null, null, 0);
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
                drawable2 = z8Var;
                fileLocation = fileLocation3;
                imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, user4, 1), "50_50", ImageLocation.getForUserOrChat(this.y, 2), "50_50", drawable2, this.y, 0);
                fileLocation3 = fileLocation;
            }
        } else {
            TLRPC.Chat chat = this.B;
            if (chat != null) {
                TLRPC.ChatPhoto chatPhoto = chat.photo;
                if (chatPhoto != null) {
                    fileLocation3 = chatPhoto.photo_small;
                    Drawable drawable4 = chatPhoto.strippedBitmap;
                    if (drawable4 != null) {
                        drawable = drawable4;
                        fileLocation = fileLocation3;
                        if (chat.monoforum) {
                            z8Var.k(i12, chat);
                            imageReceiver.setImage(ImageLocation.getForUserOrChat(i12, this.B, 1), "50_50", ImageLocation.getForUserOrChat(this.B, 2), "50_50", drawable, this.B, 0);
                        } else {
                            bg.e.n(i12, chat, z8Var, imageReceiver);
                        }
                        fileLocation3 = fileLocation;
                    }
                }
                drawable = z8Var;
                fileLocation = fileLocation3;
                if (chat.monoforum) {
                }
                fileLocation3 = fileLocation;
            } else {
                ContactsController.Contact contact = this.D;
                if (contact != null) {
                    z8Var.n(0L, contact.first_name, contact.last_name);
                    imageReceiver.setImage(null, null, z8Var, null, null, 0);
                } else {
                    z8Var.n(0L, null, null);
                    imageReceiver.setImage(null, null, z8Var, null, null, 0);
                }
            }
        }
        if (ChatObject.isCommunity(this.B)) {
            int dp2 = AndroidUtilities.dp(46.0f);
            Rect rect = lf.r.a;
            dp = (dp2 * 20) / 72;
        } else {
            TLRPC.Chat chat2 = this.B;
            if (chat2 == null || !chat2.monoforum) {
                dp = AndroidUtilities.dp(this.K0 ? 10.0f : (chat2 == null || !chat2.forum) ? 23.0f : 16.0f);
            } else {
                dp = 0;
            }
        }
        imageReceiver.setRoundRadius(dp);
        if (i10 != 0) {
            boolean z4 = !(((MessagesController.UPDATE_MASK_AVATAR & i10) == 0 || this.y == null) && ((MessagesController.UPDATE_MASK_CHAT_AVATAR & i10) == 0 || this.B == null)) && (((fileLocation2 = this.H) != null && fileLocation3 == null) || ((fileLocation2 == null && fileLocation3 != null) || !(fileLocation2 == null || (fileLocation2.volume_id == fileLocation3.volume_id && fileLocation2.local_id == fileLocation3.local_id))));
            if (!z4 && (MessagesController.UPDATE_MASK_STATUS & i10) != 0 && (user2 = this.y) != null) {
                TLRPC.UserStatus userStatus = user2.status;
                if ((userStatus != null ? userStatus.expires : 0) != this.G) {
                    z4 = true;
                }
            }
            if (!z4 && (MessagesController.UPDATE_MASK_EMOJI_STATUS & i10) != 0 && ((user = this.y) != null || this.B != null)) {
                v(user != null ? user.verified : this.B.verified, user, this.B, true);
            }
            if ((!z4 && (MessagesController.UPDATE_MASK_NAME & i10) != 0 && this.y != null) || ((MessagesController.UPDATE_MASK_CHAT_NAME & i10) != 0 && this.B != null)) {
                if (this.y != null) {
                    i11 = this.y.first_name + this.y.last_name;
                } else {
                    TLRPC.Chat chat3 = this.B;
                    i11 = chat3.monoforum ? bg.e.i(chat3, i12, false) : chat3.title;
                }
                if (!i11.equals(this.F)) {
                    z4 = true;
                }
            }
            if (!((z4 || !this.a0 || (i10 & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) == 0 || (dialog = (TLRPC.Dialog) MessagesController.getInstance(i12).dialogs_dict.f(this.E)) == null || MessagesController.getInstance(i12).getDialogUnreadCount(dialog) == this.b0) ? z4 : true)) {
                return;
            }
        }
        TLRPC.User user5 = this.y;
        if (user5 != null) {
            TLRPC.UserStatus userStatus2 = user5.status;
            if (userStatus2 != null) {
                this.G = userStatus2.expires;
            } else {
                this.G = 0;
            }
            this.F = this.y.first_name + this.y.last_name;
        } else {
            TLRPC.Chat chat4 = this.B;
            if (chat4 != null) {
                this.F = chat4.monoforum ? bg.e.i(chat4, i12, false) : chat4.title;
            }
        }
        this.H = fileLocation3;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            requestLayout();
        } else {
            r();
        }
        postInvalidate();
    }

    public final void v(boolean z4, TLRPC.User user, TLRPC.Chat chat, boolean z10) {
        boolean z11 = LocaleController.isRTL;
        org.telegram.ui.Components.j5 j5Var = this.q0;
        j5Var.a = z11;
        boolean z12 = this.E0;
        org.telegram.ui.ActionBar.g6 g6Var = this.w;
        if (z12 && z4) {
            j5Var.g(new pq(org.telegram.ui.ActionBar.k6.f1, org.telegram.ui.ActionBar.k6.i1, 0, 0), z10);
            j5Var.k(null);
        } else if (z12 && user != null && !this.I && DialogObject.getEmojiStatusDocumentId(user.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(user.emoji_status), z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
        } else if (this.E0 && chat != null && !this.I && DialogObject.getEmojiStatusDocumentId(chat.emoji_status) != 0) {
            j5Var.j(DialogObject.getEmojiStatusDocumentId(chat.emoji_status), z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
        } else if (!this.E0 || user == null || this.I || !MessagesController.getInstance(this.K).isPremiumUser(user)) {
            j5Var.g(null, z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
        } else {
            j5Var.g(fg.q1.d().e, z10);
            j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
        }
        long botVerificationIcon = user != null ? DialogObject.getBotVerificationIcon(user) : chat != null ? DialogObject.getBotVerificationIcon(chat) : 0L;
        org.telegram.ui.Components.j5 j5Var2 = this.p0;
        if (botVerificationIcon == 0 || this.I) {
            j5Var2.g(null, z10);
        } else {
            j5Var2.j(botVerificationIcon, z10);
        }
        j5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z9, g6Var)));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.q0 == drawable || this.p0 == drawable || super.verifyDrawable(drawable);
    }
}
