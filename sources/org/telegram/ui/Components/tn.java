package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class tn extends FrameLayout implements td.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView A;
    public final b11 B;
    public final org.telegram.ui.qn C;
    public final tv0[] D;
    public final z8 E;
    public final int F;
    public boolean G;
    public int H;
    public int I;
    public tv0 J;
    public int K;
    public int L;
    public AnimatorSet M;
    public final boolean[] N;
    public final boolean[] O;
    public final boolean P;
    public int Q;
    public int R;
    public CharSequence S;
    public int T;
    public Integer U;
    public final wt0 V;
    public final org.telegram.ui.ActionBar.b6 W;
    public final td.a a;
    public boolean a0;
    public boolean b;
    public final i5 b0;
    public Integer c;
    public final i5 c0;
    public final int d;
    public final pc d0;
    public final pn e;
    public final mn e0;
    public final boolean f;
    public boolean f0;
    public boolean g0;
    public final org.telegram.ui.zk h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public String k0;
    public String l0;
    public Drawable m0;
    public final AtomicReference n;
    public Drawable n0;
    public Drawable o0;
    public boolean p0;
    public org.telegram.ui.ActionBar.k q0;
    public final org.telegram.ui.zk r;
    public final j6 s;
    public final AtomicReference v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        if (r3 != 6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02e3, code lost:
    
        if (r0.c4 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ff, code lost:
    
        if (r3.c4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tn(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        boolean z11;
        int i9;
        int i10;
        int i11;
        gr grVar = gr.h;
        this.a = new td.a(0, this, grVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        tv0[] tv0VarArr = new tv0[6];
        this.D = tv0VarArr;
        this.E = new z8((org.telegram.ui.ActionBar.b6) null);
        this.F = UserConfig.selectedAccount;
        this.G = true;
        this.H = AndroidUtilities.dp(8.0f);
        this.I = 0;
        this.K = -1;
        this.L = -1;
        this.N = new boolean[1];
        this.O = new boolean[1];
        this.Q = -1;
        this.T = -1;
        this.a0 = false;
        this.d0 = new pc(this);
        this.e0 = new mn(this, 2);
        this.i0 = false;
        this.j0 = false;
        this.k0 = null;
        this.l0 = null;
        this.W = b6Var;
        boolean z12 = o2Var instanceof org.telegram.ui.qn;
        if (z12) {
            this.C = (org.telegram.ui.qn) o2Var;
        }
        org.telegram.ui.qn qnVar = this.C;
        boolean z13 = qnVar != null && ((i11 = qnVar.N3) == 0 || i11 == 8) && !UserObject.isReplyUser(qnVar.i()) && (this.C.i() == null || this.C.i().id != UserObject.VERIFY);
        pn pnVar = new pn(this, context, o2Var, z13, b6Var);
        this.e = pnVar;
        if (z12 || (o2Var instanceof we1)) {
            org.telegram.ui.qn qnVar2 = this.C;
            if (qnVar2 == null || ((i9 = qnVar2.N3) != 5 && i9 != 9 && i9 != 6 && i9 != 8 && !UserObject.isBotForum(qnVar2.f))) {
                this.V = new wt0(o2Var);
            }
            org.telegram.ui.qn qnVar3 = this.C;
            if (qnVar3 != null) {
                if (qnVar3.F9()) {
                    org.telegram.ui.qn qnVar4 = this.C;
                    if (qnVar4.T3 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        pnVar.setVisibility(8);
                    }
                }
                int i12 = this.C.N3;
                if (i12 != 2) {
                    if (i12 != 5) {
                        if (i12 != 9) {
                        }
                    }
                }
                z11 = true;
                this.f = z11;
                if (z11) {
                }
            }
            z11 = false;
            this.f = z11;
            if (z11) {
            }
        }
        pnVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        pnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(pnVar);
        if (z13) {
            org.telegram.ui.qn qnVar5 = this.C;
            TLRPC.Chat chat = qnVar5 != null ? qnVar5.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                g7.g6.b(pnVar, 0.05f, 1.2f);
            }
            final int i13 = 0;
            pnVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on
                public final /* synthetic */ tn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            tn tnVar = this.b;
                            if (!tnVar.d()) {
                                tnVar.e(true, false);
                                break;
                            }
                            break;
                        default:
                            this.b.e(false, false);
                            break;
                    }
                }
            });
        }
        org.telegram.ui.zk zkVar = new org.telegram.ui.zk(context, atomicReference);
        this.h = zkVar;
        zkVar.setEllipsizeByGradient(true);
        zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var));
        zkVar.setTextSize(18);
        zkVar.setGravity(3);
        zkVar.setTypeface(AndroidUtilities.bold());
        zkVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        zkVar.setCanHideRightDrawable(false);
        zkVar.setRightDrawableOutside(true);
        zkVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(zkVar);
        if (o()) {
            j6 j6Var = new j6(context, true, true, true);
            this.s = j6Var;
            j6Var.b(0.3f, 320L, grVar);
            j6Var.setEllipsizeByGradient(true);
            int i14 = org.telegram.ui.ActionBar.f6.B8;
            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
            j6Var.setTag(Integer.valueOf(i14));
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            j6Var.setGravity(3);
            j6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            j6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(j6Var);
        } else {
            org.telegram.ui.zk zkVar2 = new org.telegram.ui.zk(context, atomicReference2);
            this.r = zkVar2;
            zkVar2.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.f6.B8;
            zkVar2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
            zkVar2.setTag(Integer.valueOf(i15));
            zkVar2.setTextSize(14);
            zkVar2.setGravity(3);
            zkVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(zkVar2);
        }
        if (this.C != null) {
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new nh.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            b11 b11Var = new b11(context, b6Var);
            this.B = b11Var;
            imageView2.setImageDrawable(b11Var);
            b11Var.k = true;
            b11Var.b.setColor(0);
            addView(imageView2);
            this.P = z10;
            imageView2.setOnClickListener(new s2(11, this, b6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, b6Var), PorterDuff.Mode.SRC_IN));
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.A = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        org.telegram.ui.qn qnVar6 = this.C;
        if (qnVar6 != null && ((i10 = qnVar6.N3) == 0 || i10 == 8 || i10 == 3)) {
            if (qnVar6.F9()) {
                org.telegram.ui.qn qnVar7 = this.C;
                if (!qnVar7.d4) {
                }
            }
            if (!UserObject.isReplyUser(this.C.i()) && (this.C.i() == null || this.C.i().id != UserObject.VERIFY)) {
                final int i16 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.on
                    public final /* synthetic */ tn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i16) {
                            case 0:
                                tn tnVar = this.b;
                                if (!tnVar.d()) {
                                    tnVar.e(true, false);
                                    break;
                                }
                                break;
                            default:
                                this.b.e(false, false);
                                break;
                        }
                    }
                });
            }
            TLRPC.Chat chat2 = this.C.e;
            tv0VarArr[0] = new j41(true);
            tv0VarArr[1] = new hp(true);
            tv0VarArr[2] = new go0(true);
            tv0VarArr[3] = new rf0(b6Var, false);
            tv0VarArr[4] = new gl0(true);
            tv0VarArr[5] = new hp();
            int i17 = 0;
            while (true) {
                tv0[] tv0VarArr2 = this.D;
                if (i17 >= tv0VarArr2.length) {
                    break;
                }
                tv0VarArr2[i17].c(chat2 != null);
                i17++;
            }
        }
        this.b0 = new i5(AndroidUtilities.dp(24.0f), this.h);
        this.c0 = new i5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.qn qnVar = this.C;
        org.telegram.ui.zk zkVar = this.r;
        if (zkVar == null) {
            return;
        }
        int i9 = 0;
        tv0[] tv0VarArr = this.D;
        if (!z10) {
            this.J = null;
            zkVar.setLeftDrawable((Drawable) null);
            zkVar.g(null, null);
            while (i9 < tv0VarArr.length) {
                tv0 tv0Var = tv0VarArr[i9];
                if (tv0Var != null) {
                    tv0Var.e();
                }
                i9++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.F).getPrintingStringType(qnVar.a(), qnVar.Z3).intValue();
            tv0 tv0Var2 = tv0VarArr[intValue];
            if (tv0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.b6 b6Var = this.W;
            if (intValue == 5) {
                zkVar.g(tv0Var2, "**oo**");
                tv0VarArr[intValue].b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pa, b6Var));
                zkVar.setLeftDrawable((Drawable) null);
            } else {
                zkVar.g(null, null);
                tv0VarArr[intValue].b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.pa, b6Var));
                zkVar.setLeftDrawable(tv0VarArr[intValue]);
            }
            this.J = tv0VarArr[intValue];
            while (i9 < tv0VarArr.length) {
                tv0 tv0Var3 = tv0VarArr[i9];
                if (tv0Var3 != null) {
                    if (i9 == intValue) {
                        tv0Var3.d();
                    } else {
                        tv0Var3.e();
                    }
                }
                i9++;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        ImageView imageView;
        if (i9 != 0 || (imageView = this.w) == null) {
            return;
        }
        imageView.setAlpha(f10);
        float f12 = 0.85f * f10;
        imageView.setScaleX(f12);
        imageView.setScaleY(f12);
        imageView.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int dp;
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar == null) {
            return;
        }
        TLRPC.User i9 = qnVar.i();
        TLRPC.Chat chat = qnVar.e;
        if (qnVar.N3 == 3) {
            long I8 = qnVar.I8();
            if (I8 >= 0) {
                user = qnVar.getMessagesController().getUser(Long.valueOf(I8));
                chat = null;
            } else {
                chat = qnVar.getMessagesController().getChat(Long.valueOf(-I8));
                user = null;
            }
        } else {
            user = i9;
        }
        int i10 = this.F;
        z8 z8Var = this.E;
        pn pnVar = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    z8Var.p = 1.0f;
                    z8Var.k(i10, chat);
                    if (pnVar != null) {
                        pnVar.setAnimatedEmojiDrawable(null);
                        pnVar.e(chat, z8Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        pnVar.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = qnVar.b();
            if (!ChatObject.canManageMonoForum(i10, chat) || b10 == 0) {
                pnVar.setAnimatedEmojiDrawable(null);
                vf.c.o(i10, chat, z8Var, pnVar);
            } else if (b10 > 0) {
                TLRPC.User user2 = qnVar.getMessagesController().getUser(Long.valueOf(b10));
                z8Var.r(user2);
                pnVar.setAnimatedEmojiDrawable(null);
                pnVar.e(user2, z8Var);
            } else {
                TLRPC.Chat chat2 = qnVar.getMessagesController().getChat(Long.valueOf(-b10));
                z8Var.q(chat2);
                pnVar.setAnimatedEmojiDrawable(null);
                pnVar.e(chat2, z8Var);
            }
            pnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        z8Var.m(i10, user);
        if (UserObject.isReplyUser(user)) {
            z8Var.p = 0.8f;
            z8Var.g(12);
            if (pnVar != null) {
                pnVar.setAnimatedEmojiDrawable(null);
                pnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            z8Var.p = 0.8f;
            z8Var.g(21);
            if (pnVar != null) {
                pnVar.setAnimatedEmojiDrawable(null);
                pnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && qnVar.N3 == 3) {
            z8Var.p = 0.8f;
            z8Var.g(22);
            if (pnVar != null) {
                pnVar.setAnimatedEmojiDrawable(null);
                pnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            z8Var.p = 1.0f;
            if (pnVar != null) {
                pnVar.setAnimatedEmojiDrawable(null);
                pnVar.a.setForUserOrChat(user, z8Var, null, true, 3, false);
                return;
            }
            return;
        }
        z8Var.p = 0.8f;
        z8Var.g(1);
        if (pnVar != null) {
            pnVar.setAnimatedEmojiDrawable(null);
            pnVar.h(null, null, z8Var, user);
        }
    }

    public final i5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        i5 i5Var = this.c0;
        i5Var.j(j10, false);
        i5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W)));
        int dp = AndroidUtilities.dp(1.0f);
        i5Var.E = 0;
        i5Var.F = dp;
        return i5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.F).getConnectionState();
            if (this.R != connectionState) {
                this.R = connectionState;
                l();
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.emojiLoaded) {
            if (i9 == NotificationCenter.savedMessagesDialogsUpdate) {
                n(true);
            }
        } else {
            org.telegram.ui.zk zkVar = this.h;
            if (zkVar != null) {
                zkVar.invalidate();
            }
            if (getSubtitleTextView() != null) {
                getSubtitleTextView().invalidate();
            }
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a2 = this.d0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e) {
            boolean z10 = false;
            ImageView imageView = this.w;
            boolean z11 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.x;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z10 = true;
            }
            if (z11 || z10) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z11) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.f6.Il);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.f6.Il);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r2.getImageReceiver().hasNotThumb() != false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.qn qnVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z13;
        sg sgVar;
        Drawable drawable;
        TLRPC.User user;
        pn pnVar = this.e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            qnVar = this.C;
            TLRPC.User i9 = qnVar.i();
            chat = qnVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = qnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (qnVar.N8() != 0 && (user = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.N8()))) != null) {
                    chat = null;
                    i9 = user;
                }
            }
            imageReceiver = pnVar.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof x5)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!qnVar.c4) {
                if (chat == null) {
                    return;
                }
                qnVar.presentFragment(ProfileActivity.m4(-chat.id), z11);
                return;
            }
            wt0 wt0Var = this.V;
            if (i9 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (qnVar.N3 == 3) {
                        bundle.putLong("topic_id", qnVar.I8());
                    } else if (qnVar.d4) {
                        bundle.putLong("topic_id", qnVar.T3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, wt0Var);
                    if (!z14) {
                        profileActivity.K4(qnVar.V7);
                    }
                    profileActivity.N4(z15 ? 2 : 1);
                    qnVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (i9.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i9)) {
                org.telegram.ui.ActionBar.o2 o2Var = wt0Var.w;
                int[] iArr = wt0Var.c;
                int i10 = 0;
                while (true) {
                    if (i10 < iArr.length) {
                        if (iArr[i10] > 0) {
                            break;
                        } else {
                            i10++;
                        }
                    } else if (!wt0Var.f && (o2Var == null || wt0Var.r != o2Var.getUserConfig().getClientUserId() || wt0Var.s != 0 || !o2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", qnVar.a());
                if (qnVar.N3 == 3) {
                    bundle2.putLong("topic_id", qnVar.I8());
                }
                k90 k90Var = new k90(bundle2, wt0Var);
                k90Var.c = qnVar.V7;
                qnVar.presentFragment(k90Var, z11);
                return;
            }
            if (qnVar.N3 == 3) {
                z13 = z12;
                long I8 = qnVar.I8();
                bundle2.putBoolean("saved", true);
                if (I8 >= 0) {
                    bundle2.putLong("user_id", I8);
                } else {
                    bundle2.putLong("chat_id", -I8);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", i9.id);
                if (this.w != null && !z14) {
                    bundle2.putLong("dialog_id", qnVar.a());
                }
            }
            if (UserObject.isBotForum(i9)) {
                bundle2.putLong("topic_id", qnVar.b());
            }
            org.telegram.ui.ActionBar.r0 r0Var = qnVar.G1;
            bundle2.putBoolean("reportSpam", (r0Var == null || (sgVar = qnVar.I0) == null || !sgVar.d(r0Var) || qnVar.J1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.s8, this.W));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, wt0Var);
            if (!z14) {
                profileActivity2.O4(qnVar.W7, qnVar.X7, qnVar.Y7);
            }
            profileActivity2.N4(z13 ? 2 : 1);
            qnVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        qnVar = this.C;
        TLRPC.User i92 = qnVar.i();
        chat = qnVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = qnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = pnVar.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!qnVar.c4) {
        }
    }

    public final void g(int i9, boolean z10) {
        b11 b11Var = this.B;
        if (b11Var == null) {
            return;
        }
        boolean z11 = this.h0;
        if (i9 != 0 || this.P) {
            td.a aVar = this.a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                b11Var.b(i9);
            }
        }
    }

    public o9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.T;
    }

    public int getLeftPadding() {
        return this.H;
    }

    public wt0 getSharedMediaPreloader() {
        return this.V;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.zk zkVar = this.r;
        return zkVar != null ? zkVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.zk zkVar = this.r;
        if (zkVar != null) {
            return zkVar;
        }
        j6 j6Var = this.s;
        if (j6Var != null) {
            return j6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.w;
    }

    public org.telegram.ui.ActionBar.h5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.zk zkVar = this.h;
        float max = zkVar != null ? Math.max(0.0f, zkVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.zk zkVar2 = this.r;
        if (zkVar2 != null) {
            max = Math.max(max, zkVar2.getExactWidthIncludeDrawables());
        }
        pn pnVar = this.e;
        return (int) (max + ((pnVar == null || pnVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.j0 = false;
        if (z10 || z11) {
            this.j0 = true;
            if (!(this.h.getRightDrawable() instanceof il0)) {
                il0 il0Var = new il0(!z10 ? 1 : 0);
                il0Var.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, this.W));
                this.h.j(il0Var);
                this.l0 = LocaleController.getString(R.string.ScamMessage);
                this.i0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.n0 = mutate;
            int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.o0 = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ah, this.W), mode));
            this.h.j(new fq(this.n0, this.o0));
            this.i0 = true;
            this.l0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof il0) {
            this.h.j(null);
            this.i0 = false;
            this.l0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof j5) && (((j5) this.h.getRightDrawable()).a instanceof k5)) {
                ((k5) ((j5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.b0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.m0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W), PorterDuff.Mode.MULTIPLY));
                this.b0.g(this.m0, z14);
            } else {
                this.b0.g(null, z14);
            }
            this.b0.k(Integer.valueOf(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.zh, this.W)));
            this.h.i(this.b0);
            this.i0 = false;
            this.k0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.k0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.q0;
        if (kVar != null) {
            kVar.e(z14);
        }
    }

    public final void i(int i9, int i10) {
        this.h.setTextColor(i9);
        org.telegram.ui.zk zkVar = this.r;
        zkVar.setTextColor(i10);
        zkVar.setTag(Integer.valueOf(i10));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.zk zkVar = this.h;
        zkVar.setLeftDrawable(drawable);
        if (!this.i0 && !this.j0) {
            if (drawable2 != null) {
                this.l0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.l0 = null;
            }
            zkVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i9 = this.F;
        z8 z8Var = this.E;
        z8Var.m(i9, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        pn pnVar = this.e;
        if (isReplyUser) {
            z8Var.g(12);
            z8Var.p = 0.8f;
            if (pnVar != null) {
                pnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            z8Var.g(21);
            z8Var.p = 0.8f;
            if (pnVar != null) {
                pnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            z8Var.p = 1.0f;
            if (pnVar != null) {
                pnVar.e(user, z8Var);
                return;
            }
            return;
        }
        z8Var.g(1);
        z8Var.p = 0.8f;
        if (pnVar != null) {
            pnVar.h(null, null, z8Var, user);
        }
    }

    public final void l() {
        int i9 = this.R;
        String string = i9 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i9 == 1 ? LocaleController.getString(R.string.Connecting) : i9 == 5 ? LocaleController.getString(R.string.Updating) : i9 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.b6 b6Var = this.W;
        j6 j6Var = this.s;
        org.telegram.ui.zk zkVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.S;
            if (charSequence != null) {
                if (zkVar != null) {
                    zkVar.k(charSequence);
                    this.S = null;
                    Integer num = this.U;
                    if (num != null) {
                        zkVar.setTextColor(num.intValue());
                    } else {
                        int i10 = this.T;
                        if (i10 >= 0) {
                            zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                            zkVar.setTag(Integer.valueOf(this.T));
                        }
                    }
                } else if (j6Var != null) {
                    j6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.S = null;
                    Integer num2 = this.U;
                    if (num2 != null) {
                        j6Var.setTextColor(num2.intValue());
                    } else {
                        int i11 = this.T;
                        if (i11 >= 0) {
                            j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
                            j6Var.setTag(Integer.valueOf(this.T));
                        }
                    }
                }
            }
        } else if (zkVar != null) {
            if (this.S == null) {
                this.S = zkVar.getText();
            }
            zkVar.k(string);
            Integer num3 = this.U;
            if (num3 != null) {
                zkVar.setTextColor(num3.intValue());
            } else {
                int i12 = org.telegram.ui.ActionBar.f6.B8;
                zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
                zkVar.setTag(Integer.valueOf(i12));
            }
        } else if (j6Var != null) {
            if (this.S == null) {
                this.S = j6Var.getText();
            }
            j6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.U;
            if (num4 != null) {
                j6Var.setTextColor(num4.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.f6.B8;
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
                j6Var.setTag(Integer.valueOf(i13));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar == null) {
            return;
        }
        this.Q = 0;
        TLRPC.ChatFull chatFull = qnVar.V7;
        if (chatFull == null) {
            return;
        }
        int i9 = this.F;
        int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.Q = chatFull.online_count;
            return;
        }
        for (int i10 = 0; i10 < chatFull.participants.participants.size(); i10++) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(chatFull.participants.participants.get(i10).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == UserConfig.getInstance(i9).getClientUserId()) && user.status.expires > 10000)) {
                this.Q++;
            }
        }
    }

    public final void n(boolean z10) {
        int i9;
        boolean z11;
        int i10;
        String formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i11;
        String formatShortNumber;
        int i12;
        int i13;
        String formatString;
        int i14;
        org.telegram.ui.ActionBar.b6 b6Var = this.W;
        boolean[] zArr = this.N;
        j6 j6Var = this.s;
        org.telegram.ui.zk zkVar = this.r;
        org.telegram.ui.zk zkVar2 = this.h;
        int i15 = this.F;
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar == null) {
            return;
        }
        if (qnVar.N3 == 6) {
            String str = qnVar.L3.link;
            pf.u[] uVarArr = pf.u.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i16 = qnVar.i();
        TLRPC.Chat chat = qnVar.e;
        boolean z12 = UserObject.isUserSelf(i16) && qnVar.N3 == 0 && qnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.p0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i16) && !z12) || UserObject.isReplyUser(i16) || ((i16 != null && i16.id == UserObject.VERIFY) || ((i9 = qnVar.N3) != 0 && i9 != 8))) && qnVar.N3 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z12) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i14 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i14 = 0;
            }
            if (!this.p0) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i14) + 1).apply();
                this.p0 = true;
            }
        }
        CharSequence printingString = MessagesController.getInstance(i15).getPrintingString(qnVar.a(), qnVar.Z3, false);
        if (printingString == null) {
            UserObject.isBotForum(i16);
        }
        CharSequence charSequence = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z13 = z12;
        if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            if (qnVar.F9() && zkVar2.getTag() != null) {
                zkVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.M;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.M = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(zkVar2, (Property<org.telegram.ui.zk, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.M.addListener(new sn(this, 1));
                    this.M.setDuration(180L);
                    this.M.start();
                } else {
                    zkVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i15).getPrintingStringType(qnVar.a(), qnVar.Z3);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z11 = true;
        } else {
            if (qnVar.F9() && !qnVar.d4) {
                if (zkVar2.getTag() != null) {
                    return;
                }
                zkVar2.setTag(1);
                AnimatorSet animatorSet3 = this.M;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.M = null;
                }
                if (!z10) {
                    zkVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.M = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(zkVar2, (Property<org.telegram.ui.zk, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.M.addListener(new sn(this, 0));
                    this.M.setDuration(180L);
                    this.M.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i17 = qnVar.N3;
            if (i17 == 8) {
                if (qnVar.P3) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (qnVar.b() == 0) {
                    int topicsCount = qnVar.getMessagesController().getTopicsController().getTopicsCount(-qnVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i15).getTopicsController().findTopic(chat.id, qnVar.b());
                    int i18 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i18 > 0) {
                        z11 = false;
                        formatString = LocaleController.formatPluralString("messages", i18, Integer.valueOf(i18));
                    } else {
                        z11 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, vf.c.i(chat, i15, false));
                    }
                    charSequence = formatString;
                }
                z11 = false;
            } else {
                if (i17 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, qnVar.getMessagesController().getSavedMessagesController().getMessagesCount(qnVar.I8())), new Object[0]);
                } else {
                    if (qnVar.d4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i15).getTopicsController().findTopic(chat.id, qnVar.b());
                        if (findTopic2 != null) {
                            i12 = 1;
                            i13 = findTopic2.totalMessagesCount - 1;
                        } else {
                            i12 = 1;
                            i13 = 0;
                        }
                        if (i13 > 0) {
                            Object[] objArr = new Object[i12];
                            objArr[0] = Integer.valueOf(i13);
                            formatPluralString = LocaleController.formatPluralString("messages", i13, objArr);
                        } else {
                            int i19 = R.string.TopicProfileStatus;
                            Object[] objArr2 = new Object[i12];
                            objArr2[0] = chat.title;
                            formatPluralString = LocaleController.formatString(i19, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = qnVar.V7;
                        int i20 = this.Q;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i11 = chatFull.participants_count) == 0) {
                                formatPluralString = chat.megagroup ? chatFull == null ? LocaleController.getString(R.string.Loading).toLowerCase() : chat.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            } else if (chat.megagroup) {
                                formatPluralString = i20 > 1 ? aa.d.z(LocaleController.formatPluralString("Members", i11, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i20, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i11, new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean isAccessibilityScreenReaderEnabled = AndroidUtilities.isAccessibilityScreenReaderEnabled();
                                int i21 = chatFull.participants_count;
                                if (isAccessibilityScreenReaderEnabled) {
                                    iArr[0] = i21;
                                    formatShortNumber = String.valueOf(i21);
                                } else {
                                    formatShortNumber = LocaleController.formatShortNumber(i21, iArr);
                                }
                                formatPluralString = chat.megagroup ? LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber) : LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                            }
                        } else if (ChatObject.isKickedFromChat(chat)) {
                            formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(chat)) {
                            formatPluralString = LocaleController.getString(R.string.YouLeft);
                        } else {
                            int i22 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i22 = chatParticipants.participants.size();
                            }
                            formatPluralString = (i20 <= 1 || i22 == 0) ? LocaleController.formatPluralString("Members", i22, new Object[0]) : aa.d.z(LocaleController.formatPluralString("Members", i22, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i20, new Object[0]));
                        }
                    } else if (i16 != null) {
                        TLRPC.User user = MessagesController.getInstance(i15).getUser(Long.valueOf(i16.id));
                        if (user != null) {
                            i16 = user;
                        }
                        if (!UserObject.isReplyUser(i16)) {
                            long j10 = i16.id;
                            if (j10 != UserObject.VERIFY) {
                                if (j10 == UserConfig.getInstance(i15).getClientUserId()) {
                                    charSequence = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                } else {
                                    long j11 = i16.id;
                                    if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                        charSequence = LocaleController.getString(R.string.ServiceNotifications);
                                    } else if (MessagesController.isSupportUser(i16)) {
                                        charSequence = LocaleController.getString(R.string.SupportStatus);
                                    } else {
                                        boolean z14 = i16.bot;
                                        if (z14 && (i10 = i16.bot_active_users) != 0) {
                                            charSequence = LocaleController.formatPluralStringComma("BotUsers", i10, ',');
                                        } else if (z14) {
                                            charSequence = LocaleController.getString(R.string.Bot);
                                        } else {
                                            zArr[0] = false;
                                            charSequence = LocaleController.formatUserStatus(i15, i16, zArr, this.a0 ? this.O : null);
                                            z11 = zArr[0];
                                        }
                                    }
                                }
                            }
                        }
                    }
                    charSequence = formatPluralString;
                }
                z11 = false;
            }
        }
        this.T = z11 ? org.telegram.ui.ActionBar.f6.pa : org.telegram.ui.ActionBar.f6.B8;
        if (this.S != null) {
            this.S = charSequence;
        } else if (zkVar != null) {
            zkVar.k(charSequence);
            Integer num = this.U;
            if (num == null) {
                zkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(this.T, b6Var));
                zkVar.setTag(Integer.valueOf(this.T));
            } else {
                zkVar.setTextColor(num.intValue());
            }
        } else {
            j6Var.c(charSequence, z10, true);
            Integer num2 = this.U;
            if (num2 == null) {
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(this.T, b6Var));
                j6Var.setTag(Integer.valueOf(this.T));
            } else {
                j6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.q0;
        if (kVar != null) {
            kVar.e(z10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            int i9 = this.F;
            NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (qnVar.N3 == 3) {
                NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.R = ConnectionsManager.getInstance(i9).getConnectionState();
            l();
        }
        i5 i5Var = this.b0;
        if (i5Var != null) {
            i5Var.a();
        }
        i5 i5Var2 = this.c0;
        if (i5Var2 != null) {
            i5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.qn qnVar = this.C;
        if (qnVar != null) {
            int i9 = this.F;
            NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (qnVar.N3 == 3) {
                NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        i5 i5Var = this.b0;
        if (i5Var != null) {
            i5Var.b();
        }
        i5 i5Var2 = this.c0;
        if (i5Var2 != null) {
            i5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.k0 != null) {
            sb2.append(", ");
            sb2.append(this.k0);
        }
        if (this.l0 != null) {
            sb2.append(", ");
            sb2.append(this.l0);
        }
        sb2.append("\n");
        org.telegram.ui.zk zkVar = this.r;
        if (zkVar != null) {
            sb2.append(zkVar.getText());
        } else {
            j6 j6Var = this.s;
            if (j6Var != null) {
                sb2.append(j6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        pn pnVar = this.e;
        int measuredHeight = (((currentActionBarHeight - pnVar.getMeasuredHeight()) - 2) / 2) + (this.G ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.g0 ? 23.66f : 24.0f) + measuredHeight;
        int i13 = this.H + 1;
        int i14 = measuredHeight + 1;
        pnVar.layout(i13, i14, pnVar.getMeasuredWidth() + i13, pnVar.getMeasuredHeight() + i14);
        int dp2 = this.H + AndroidUtilities.dp(pnVar.getVisibility() == 0 ? this.g0 ? 49.66f : 55.0f : this.g0 ? 13.0f : 1.0f) + this.I;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.zk zkVar = this.h;
        if (visibility != 8) {
            zkVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - zkVar.getPaddingTop(), zkVar.getMeasuredWidth() + dp2, zkVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (zkVar.getTextHeight() + measuredHeight)) - zkVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + h5Var.getTextHeight() + measuredHeight);
            }
        } else {
            zkVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - zkVar.getPaddingTop(), zkVar.getMeasuredWidth() + dp2, zkVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (zkVar.getTextHeight() + measuredHeight)) - zkVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(10.0f) + measuredHeight, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + h5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.H, AndroidUtilities.dp(27.33f) + measuredHeight, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.H, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.H, measuredHeight - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.H, imageView2.getMeasuredHeight() + (measuredHeight - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.H, AndroidUtilities.dp(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.H, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        org.telegram.ui.zk zkVar2 = this.r;
        if (zkVar2 != null) {
            zkVar2.layout(dp2, dp, zkVar2.getMeasuredWidth() + dp2, zkVar2.getTextHeight() + dp);
        } else {
            j6 j6Var = this.s;
            if (j6Var != null) {
                j6Var.layout(dp2, dp, j6Var.getMeasuredWidth() + dp2, j6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) this.v.get();
        if (h5Var2 != null) {
            h5Var2.layout(dp2, dp, h5Var2.getMeasuredWidth() + dp2, h5Var2.getTextHeight() + dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        pn pnVar = this.e;
        int dp = size - AndroidUtilities.dp((pnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        pnVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.zk zkVar = this.h;
        zkVar.measure(makeMeasureSpec, makeMeasureSpec2);
        j6 j6Var = this.s;
        org.telegram.ui.zk zkVar2 = this.r;
        if (zkVar2 != null) {
            zkVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (j6Var != null) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(14.0f), TLObject.FLAG_30));
        }
        ImageView imageView2 = this.w;
        if (imageView2 != null) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(34.0f), TLObject.FLAG_30));
        }
        ImageView imageView3 = this.y;
        if (imageView3 != null) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i10));
        int i11 = this.K;
        AtomicReference atomicReference = this.n;
        if (i11 != -1 && i11 != size && i11 > size) {
            this.L = i11;
            View view = (org.telegram.ui.ActionBar.h5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference.set(h5Var);
            int i12 = org.telegram.ui.ActionBar.f6.A8;
            org.telegram.ui.ActionBar.b6 b6Var = this.W;
            h5Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
            h5Var.setTextSizePx(AndroidUtilities.dp(this.g0 ? 17.5f : 18.0f));
            h5Var.setGravity(3);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5Var.i(zkVar.getRightDrawable());
            h5Var.j(zkVar.getRightDrawable2());
            h5Var.setRightDrawableOutside(zkVar.getRightDrawableOutside());
            h5Var.setLeftDrawable(zkVar.getLeftDrawable());
            h5Var.l(zkVar.getText(), false);
            ViewPropertyAnimator duration = h5Var.animate().alpha(0.0f).setDuration(350L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).withEndAction(new mn(this, 0)).start();
            addView(h5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference2.set(h5Var2);
            int i13 = org.telegram.ui.ActionBar.f6.B8;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
            h5Var2.setTag(Integer.valueOf(i13));
            h5Var2.setTextSizePx(AndroidUtilities.dp(this.g0 ? 13.5f : 14.0f));
            h5Var2.setGravity(3);
            if (zkVar2 != null) {
                h5Var2.l(zkVar2.getText(), false);
            } else if (j6Var != null) {
                h5Var2.l(j6Var.getText(), false);
            }
            h5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).withEndAction(new mn(this, 1)).start();
            addView(h5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) atomicReference.get();
        if (h5Var3 != null) {
            h5Var3.measure(org.telegram.messenger.ll.d((pnVar.getVisibility() == 0 ? 54 : 0) + 16, this.L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.K = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        pc pcVar = this.d0;
        mn mnVar = this.e0;
        if (action == 0 && a()) {
            this.f0 = true;
            pcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(mnVar);
            AndroidUtilities.runOnUIThread(mnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f0) {
            pcVar.c(false);
            this.f0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(mnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.q0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i9 = this.F;
        z8 z8Var = this.E;
        z8Var.k(i9, chat);
        pn pnVar = this.e;
        if (pnVar != null) {
            pnVar.e(chat, z8Var);
            pnVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i9) {
        this.H = i9;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.G = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.U = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.d0.c(z10);
    }

    public void setRightAvatarPadding(int i9) {
        this.I = i9;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.S == null) {
            org.telegram.ui.zk zkVar = this.r;
            if (zkVar != null) {
                zkVar.k(charSequence);
            } else {
                j6 j6Var = this.s;
                if (j6Var != null) {
                    j6Var.setText(charSequence);
                }
            }
        } else {
            this.S = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.q0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public void setTitle(CharSequence charSequence) {
        h(charSequence, false, false, false, false, null, false);
    }

    public void setUserAvatar(TLRPC.User user) {
        k(user, false);
    }

    public void f() {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
