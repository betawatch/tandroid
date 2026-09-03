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
import org.telegram.ui.sf1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ao extends FrameLayout implements xd.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView B;
    public final x11 C;
    public final org.telegram.ui.xn D;
    public final mw0[] E;
    public final z8 F;
    public final int G;
    public boolean H;
    public int I;
    public int J;
    public mw0 K;
    public int L;
    public int M;
    public AnimatorSet N;
    public final boolean[] O;
    public final boolean[] P;
    public final boolean Q;
    public int R;
    public int S;
    public CharSequence T;
    public int U;
    public Integer V;
    public final qu0 W;
    public final xd.a a;
    public final org.telegram.ui.ActionBar.g6 a0;
    public boolean b;
    public boolean b0;
    public Integer c;
    public final j5 c0;
    public final int d;
    public final j5 d0;
    public final wn e;
    public final rc e0;
    public final boolean f;
    public final tn f0;
    public boolean g0;
    public final org.telegram.ui.il h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public String m0;
    public final AtomicReference n;
    public Drawable n0;
    public Drawable o0;
    public Drawable p0;
    public boolean q0;
    public final org.telegram.ui.il r;
    public org.telegram.ui.ActionBar.k r0;
    public final k6 s;
    public final AtomicReference v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        if (r3 != 6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02e3, code lost:
    
        if (r0.d4 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ff, code lost:
    
        if (r3.d4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ao(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z10;
        int i10;
        int i11;
        int i12;
        pr prVar = pr.h;
        this.a = new xd.a(0, this, prVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        mw0[] mw0VarArr = new mw0[6];
        this.E = mw0VarArr;
        this.F = new z8((org.telegram.ui.ActionBar.g6) null);
        this.G = UserConfig.selectedAccount;
        this.H = true;
        this.I = AndroidUtilities.dp(8.0f);
        this.J = 0;
        this.L = -1;
        this.M = -1;
        this.O = new boolean[1];
        this.P = new boolean[1];
        this.R = -1;
        this.U = -1;
        this.b0 = false;
        this.e0 = new rc(this);
        this.f0 = new tn(this, 2);
        this.j0 = false;
        this.k0 = false;
        this.l0 = null;
        this.m0 = null;
        this.a0 = g6Var;
        boolean z11 = p2Var instanceof org.telegram.ui.xn;
        if (z11) {
            this.D = (org.telegram.ui.xn) p2Var;
        }
        org.telegram.ui.xn xnVar = this.D;
        boolean z12 = xnVar != null && ((i12 = xnVar.O3) == 0 || i12 == 8) && !UserObject.isReplyUser(xnVar.i()) && (this.D.i() == null || this.D.i().id != UserObject.VERIFY);
        wn wnVar = new wn(this, context, p2Var, z12, g6Var);
        this.e = wnVar;
        if (z11 || (p2Var instanceof sf1)) {
            org.telegram.ui.xn xnVar2 = this.D;
            if (xnVar2 == null || ((i10 = xnVar2.O3) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(xnVar2.f))) {
                this.W = new qu0(p2Var);
            }
            org.telegram.ui.xn xnVar3 = this.D;
            if (xnVar3 != null) {
                if (xnVar3.F9()) {
                    org.telegram.ui.xn xnVar4 = this.D;
                    if (xnVar4.U3 != null) {
                    }
                    z10 = true;
                    this.f = z10;
                    if (z10) {
                        wnVar.setVisibility(8);
                    }
                }
                int i13 = this.D.O3;
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 9) {
                        }
                    }
                }
                z10 = true;
                this.f = z10;
                if (z10) {
                }
            }
            z10 = false;
            this.f = z10;
            if (z10) {
            }
        }
        wnVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        wnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(wnVar);
        if (z12) {
            org.telegram.ui.xn xnVar5 = this.D;
            TLRPC.Chat chat = xnVar5 != null ? xnVar5.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                k7.e6.b(wnVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            wnVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                public final /* synthetic */ ao b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ao aoVar = this.b;
                            if (!aoVar.d()) {
                                aoVar.e(true, false);
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
        org.telegram.ui.il ilVar = new org.telegram.ui.il(context, atomicReference);
        this.h = ilVar;
        ilVar.setEllipsizeByGradient(true);
        ilVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A8, g6Var));
        ilVar.setTextSize(18);
        ilVar.setGravity(3);
        ilVar.setTypeface(AndroidUtilities.bold());
        ilVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        ilVar.setCanHideRightDrawable(false);
        ilVar.setRightDrawableOutside(true);
        ilVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(ilVar);
        if (o()) {
            k6 k6Var = new k6(context, true, true, true);
            this.s = k6Var;
            k6Var.b(0.3f, 320L, prVar);
            k6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.k6.B8;
            k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
            k6Var.setTag(Integer.valueOf(i15));
            k6Var.setTextSize(AndroidUtilities.dp(14.0f));
            k6Var.setGravity(3);
            k6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            k6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(k6Var);
        } else {
            org.telegram.ui.il ilVar2 = new org.telegram.ui.il(context, atomicReference2);
            this.r = ilVar2;
            ilVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.k6.B8;
            ilVar2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var));
            ilVar2.setTag(Integer.valueOf(i16));
            ilVar2.setTextSize(14);
            ilVar2.setGravity(3);
            ilVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(ilVar2);
        }
        if (this.D != null) {
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new th.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            x11 x11Var = new x11(context, g6Var);
            this.C = x11Var;
            imageView2.setImageDrawable(x11Var);
            x11Var.k = true;
            x11Var.b.setColor(0);
            addView(imageView2);
            this.Q = z4;
            imageView2.setOnClickListener(new w2(9, this, g6Var));
            if (z4) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s8, g6Var), PorterDuff.Mode.SRC_IN));
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.B = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        org.telegram.ui.xn xnVar6 = this.D;
        if (xnVar6 != null && ((i11 = xnVar6.O3) == 0 || i11 == 8 || i11 == 3)) {
            if (xnVar6.F9()) {
                org.telegram.ui.xn xnVar7 = this.D;
                if (!xnVar7.e4) {
                }
            }
            if (!UserObject.isReplyUser(this.D.i()) && (this.D.i() == null || this.D.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.vn
                    public final /* synthetic */ ao b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                ao aoVar = this.b;
                                if (!aoVar.d()) {
                                    aoVar.e(true, false);
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
            TLRPC.Chat chat2 = this.D.e;
            mw0VarArr[0] = new f51(true);
            mw0VarArr[1] = new rp(true);
            mw0VarArr[2] = new bp0(true);
            mw0VarArr[3] = new pg0(g6Var, false);
            mw0VarArr[4] = new dm0(true);
            mw0VarArr[5] = new rp();
            int i18 = 0;
            while (true) {
                mw0[] mw0VarArr2 = this.E;
                if (i18 >= mw0VarArr2.length) {
                    break;
                }
                mw0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.c0 = new j5(AndroidUtilities.dp(24.0f), this.h);
        this.d0 = new j5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z4) {
        org.telegram.ui.xn xnVar = this.D;
        org.telegram.ui.il ilVar = this.r;
        if (ilVar == null) {
            return;
        }
        int i10 = 0;
        mw0[] mw0VarArr = this.E;
        if (!z4) {
            this.K = null;
            ilVar.setLeftDrawable((Drawable) null);
            ilVar.g(null, null);
            while (i10 < mw0VarArr.length) {
                mw0 mw0Var = mw0VarArr[i10];
                if (mw0Var != null) {
                    mw0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.G).getPrintingStringType(xnVar.a(), xnVar.a4).intValue();
            mw0 mw0Var2 = mw0VarArr[intValue];
            if (mw0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.g6 g6Var = this.a0;
            if (intValue == 5) {
                ilVar.g(mw0Var2, "**oo**");
                mw0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.pa, g6Var));
                ilVar.setLeftDrawable((Drawable) null);
            } else {
                ilVar.g(null, null);
                mw0VarArr[intValue].b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.pa, g6Var));
                ilVar.setLeftDrawable(mw0VarArr[intValue]);
            }
            this.K = mw0VarArr[intValue];
            while (i10 < mw0VarArr.length) {
                mw0 mw0Var3 = mw0VarArr[i10];
                if (mw0Var3 != null) {
                    if (i10 == intValue) {
                        mw0Var3.d();
                    } else {
                        mw0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        ImageView imageView;
        if (i10 != 0 || (imageView = this.w) == null) {
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
        org.telegram.ui.xn xnVar = this.D;
        if (xnVar == null) {
            return;
        }
        TLRPC.User i10 = xnVar.i();
        TLRPC.Chat chat = xnVar.e;
        if (xnVar.O3 == 3) {
            long I8 = xnVar.I8();
            if (I8 >= 0) {
                user = xnVar.getMessagesController().getUser(Long.valueOf(I8));
                chat = null;
            } else {
                chat = xnVar.getMessagesController().getChat(Long.valueOf(-I8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.G;
        z8 z8Var = this.F;
        wn wnVar = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    z8Var.p = 1.0f;
                    z8Var.k(i11, chat);
                    if (wnVar != null) {
                        wnVar.setAnimatedEmojiDrawable(null);
                        wnVar.e(chat, z8Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        wnVar.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = xnVar.b();
            if (!ChatObject.canManageMonoForum(i11, chat) || b10 == 0) {
                wnVar.setAnimatedEmojiDrawable(null);
                bg.e.o(i11, chat, z8Var, wnVar);
            } else if (b10 > 0) {
                TLRPC.User user2 = xnVar.getMessagesController().getUser(Long.valueOf(b10));
                z8Var.r(user2);
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.e(user2, z8Var);
            } else {
                TLRPC.Chat chat2 = xnVar.getMessagesController().getChat(Long.valueOf(-b10));
                z8Var.q(chat2);
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.e(chat2, z8Var);
            }
            wnVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        z8Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            z8Var.p = 0.8f;
            z8Var.g(12);
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            z8Var.p = 0.8f;
            z8Var.g(21);
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && xnVar.O3 == 3) {
            z8Var.p = 0.8f;
            z8Var.g(22);
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            z8Var.p = 1.0f;
            if (wnVar != null) {
                wnVar.setAnimatedEmojiDrawable(null);
                wnVar.a.setForUserOrChat(user, z8Var, null, true, 3, false);
                return;
            }
            return;
        }
        z8Var.p = 0.8f;
        z8Var.g(1);
        if (wnVar != null) {
            wnVar.setAnimatedEmojiDrawable(null);
            wnVar.h(null, null, z8Var, user);
        }
    }

    public final j5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        j5 j5Var = this.d0;
        j5Var.j(j10, false);
        j5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.a0)));
        int dp = AndroidUtilities.dp(1.0f);
        j5Var.F = 0;
        j5Var.G = dp;
        return j5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.G).getConnectionState();
            if (this.S != connectionState) {
                this.S = connectionState;
                l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.emojiLoaded) {
            if (i10 == NotificationCenter.savedMessagesDialogsUpdate) {
                n(true);
            }
        } else {
            org.telegram.ui.il ilVar = this.h;
            if (ilVar != null) {
                ilVar.invalidate();
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
        float a2 = this.e0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.e) {
            boolean z4 = false;
            ImageView imageView = this.w;
            boolean z10 = imageView != null && imageView.getVisibility() == 0;
            ImageView imageView2 = this.x;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                z4 = true;
            }
            if (z10 || z4) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
                rectF.inset(-AndroidUtilities.dp(3.0f), -AndroidUtilities.dp(3.0f));
                canvas.saveLayer(rectF, null);
                boolean drawChild = super.drawChild(canvas, view, j10);
                if (z10) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.k6.Il);
                }
                if (z4) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.k6.Il);
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
    public final void e(boolean z4, boolean z10) {
        boolean z11;
        org.telegram.ui.xn xnVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z12;
        sg sgVar;
        Drawable drawable;
        TLRPC.User user;
        wn wnVar = this.e;
        if (z4) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z11 = false;
            xnVar = this.D;
            TLRPC.User i10 = xnVar.i();
            chat = xnVar.e;
            boolean z13 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = xnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (xnVar.N8() != 0 && (user = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.N8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = wnVar.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof y5)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!xnVar.d4) {
                if (chat == null) {
                    return;
                }
                xnVar.presentFragment(ProfileActivity.m4(-chat.id), z10);
                return;
            }
            qu0 qu0Var = this.W;
            if (i10 == null) {
                boolean z14 = z11;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (xnVar.O3 == 3) {
                        bundle.putLong("topic_id", xnVar.I8());
                    } else if (xnVar.e4) {
                        bundle.putLong("topic_id", xnVar.U3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, qu0Var);
                    if (!z13) {
                        profileActivity.K4(xnVar.W7);
                    }
                    profileActivity.N4(z14 ? 2 : 1);
                    xnVar.presentFragment(profileActivity, z10);
                    return;
                }
                return;
            }
            if (i10.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i10)) {
                org.telegram.ui.ActionBar.p2 p2Var = qu0Var.w;
                int[] iArr = qu0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!qu0Var.f && (p2Var == null || qu0Var.r != p2Var.getUserConfig().getClientUserId() || qu0Var.s != 0 || !p2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", xnVar.a());
                if (xnVar.O3 == 3) {
                    bundle2.putLong("topic_id", xnVar.I8());
                }
                fa0 fa0Var = new fa0(bundle2, qu0Var);
                fa0Var.c = xnVar.W7;
                xnVar.presentFragment(fa0Var, z10);
                return;
            }
            if (xnVar.O3 == 3) {
                z12 = z11;
                long I8 = xnVar.I8();
                bundle2.putBoolean("saved", true);
                if (I8 >= 0) {
                    bundle2.putLong("user_id", I8);
                } else {
                    bundle2.putLong("chat_id", -I8);
                }
            } else {
                z12 = z11;
                bundle2.putLong("user_id", i10.id);
                if (this.w != null && !z13) {
                    bundle2.putLong("dialog_id", xnVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", xnVar.b());
            }
            org.telegram.ui.ActionBar.r0 r0Var = xnVar.H1;
            bundle2.putBoolean("reportSpam", (r0Var == null || (sgVar = xnVar.J0) == null || !sgVar.d(r0Var) || xnVar.K1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.s8, this.a0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, qu0Var);
            if (!z13) {
                profileActivity2.O4(xnVar.X7, xnVar.Y7, xnVar.Z7);
            }
            profileActivity2.N4(z12 ? 2 : 1);
            xnVar.presentFragment(profileActivity2, z10);
            return;
        }
        z11 = z4;
        xnVar = this.D;
        TLRPC.User i102 = xnVar.i();
        chat = xnVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = xnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = wnVar.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!xnVar.d4) {
        }
    }

    public final void g(int i10, boolean z4) {
        x11 x11Var = this.C;
        if (x11Var == null) {
            return;
        }
        boolean z10 = this.i0;
        if (i10 != 0 || this.Q) {
            xd.a aVar = this.a;
            if (z10) {
                aVar.a(false, z4);
            } else {
                aVar.a(true, z4);
                x11Var.b(i10);
            }
        }
    }

    public p9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.U;
    }

    public int getLeftPadding() {
        return this.I;
    }

    public qu0 getSharedMediaPreloader() {
        return this.W;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.il ilVar = this.r;
        return ilVar != null ? ilVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.il ilVar = this.r;
        if (ilVar != null) {
            return ilVar;
        }
        k6 k6Var = this.s;
        if (k6Var != null) {
            return k6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.w;
    }

    public org.telegram.ui.ActionBar.l5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.il ilVar = this.h;
        float max = ilVar != null ? Math.max(0.0f, ilVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.il ilVar2 = this.r;
        if (ilVar2 != null) {
            max = Math.max(max, ilVar2.getExactWidthIncludeDrawables());
        }
        wn wnVar = this.e;
        return (int) (max + ((wnVar == null || wnVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z4, boolean z10, boolean z11, boolean z12, TLRPC.EmojiStatus emojiStatus, boolean z13) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.k0 = false;
        if (z4 || z10) {
            this.k0 = true;
            if (!(this.h.getRightDrawable() instanceof fm0)) {
                fm0 fm0Var = new fm0(!z4 ? 1 : 0);
                fm0Var.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.B8, this.a0));
                this.h.j(fm0Var);
                this.m0 = LocaleController.getString(R.string.ScamMessage);
                this.j0 = true;
            }
        } else if (z11) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.o0 = mutate;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.a0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.p0 = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ah, this.a0), mode));
            this.h.j(new pq(this.o0, this.p0));
            this.j0 = true;
            this.m0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof fm0) {
            this.h.j(null);
            this.j0 = false;
            this.m0 = null;
        }
        if (z12 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof k5) && (((k5) this.h.getRightDrawable()).a instanceof l5)) {
                ((l5) ((k5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.c0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z13);
            } else if (z12) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.n0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.a0), PorterDuff.Mode.MULTIPLY));
                this.c0.g(this.n0, z13);
            } else {
                this.c0.g(null, z13);
            }
            this.c0.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.zh, this.a0)));
            this.h.i(this.c0);
            this.j0 = false;
            this.l0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.l0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.r0;
        if (kVar != null) {
            kVar.d(z13);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.il ilVar = this.r;
        ilVar.setTextColor(i11);
        ilVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.il ilVar = this.h;
        ilVar.setLeftDrawable(drawable);
        if (!this.j0 && !this.k0) {
            if (drawable2 != null) {
                this.m0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.m0 = null;
            }
            ilVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.r0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z4) {
        int i10 = this.G;
        z8 z8Var = this.F;
        z8Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        wn wnVar = this.e;
        if (isReplyUser) {
            z8Var.g(12);
            z8Var.p = 0.8f;
            if (wnVar != null) {
                wnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            z8Var.g(21);
            z8Var.p = 0.8f;
            if (wnVar != null) {
                wnVar.h(null, null, z8Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z4) {
            z8Var.p = 1.0f;
            if (wnVar != null) {
                wnVar.e(user, z8Var);
                return;
            }
            return;
        }
        z8Var.g(1);
        z8Var.p = 0.8f;
        if (wnVar != null) {
            wnVar.h(null, null, z8Var, user);
        }
    }

    public final void l() {
        int i10 = this.S;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.g6 g6Var = this.a0;
        k6 k6Var = this.s;
        org.telegram.ui.il ilVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.T;
            if (charSequence != null) {
                if (ilVar != null) {
                    ilVar.k(charSequence);
                    this.T = null;
                    Integer num = this.V;
                    if (num != null) {
                        ilVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.U;
                        if (i11 >= 0) {
                            ilVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
                            ilVar.setTag(Integer.valueOf(this.U));
                        }
                    }
                } else if (k6Var != null) {
                    k6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.T = null;
                    Integer num2 = this.V;
                    if (num2 != null) {
                        k6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.U;
                        if (i12 >= 0) {
                            k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
                            k6Var.setTag(Integer.valueOf(this.U));
                        }
                    }
                }
            }
        } else if (ilVar != null) {
            if (this.T == null) {
                this.T = ilVar.getText();
            }
            ilVar.k(string);
            Integer num3 = this.V;
            if (num3 != null) {
                ilVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.k6.B8;
                ilVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
                ilVar.setTag(Integer.valueOf(i13));
            }
        } else if (k6Var != null) {
            if (this.T == null) {
                this.T = k6Var.getText();
            }
            k6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.V;
            if (num4 != null) {
                k6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.k6.B8;
                k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
                k6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.r0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z4;
        org.telegram.ui.xn xnVar = this.D;
        if (xnVar == null) {
            return;
        }
        this.R = 0;
        TLRPC.ChatFull chatFull = xnVar.W7;
        if (chatFull == null) {
            return;
        }
        int i10 = this.G;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z4 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z4 || chatFull.participants_count <= 200) {
                return;
            }
            this.R = chatFull.online_count;
            return;
        }
        for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                this.R++;
            }
        }
    }

    public final void n(boolean z4) {
        int i10;
        boolean z10;
        int i11;
        String formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String formatShortNumber;
        int i13;
        int i14;
        String formatString;
        int i15;
        org.telegram.ui.ActionBar.g6 g6Var = this.a0;
        boolean[] zArr = this.O;
        k6 k6Var = this.s;
        org.telegram.ui.il ilVar = this.r;
        org.telegram.ui.il ilVar2 = this.h;
        int i16 = this.G;
        org.telegram.ui.xn xnVar = this.D;
        if (xnVar == null) {
            return;
        }
        if (xnVar.O3 == 6) {
            String str = xnVar.M3.link;
            vf.t[] tVarArr = vf.t.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = xnVar.i();
        TLRPC.Chat chat = xnVar.e;
        boolean z11 = UserObject.isUserSelf(i17) && xnVar.O3 == 0 && xnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.q0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z11) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = xnVar.O3) != 0 && i10 != 8))) && xnVar.O3 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z11) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i15 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i15 = 0;
            }
            if (!this.q0) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i15) + 1).apply();
                this.q0 = true;
            }
        }
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(xnVar.a(), xnVar.a4, false);
        if (printingString == null) {
            UserObject.isBotForum(i17);
        }
        CharSequence charSequence = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z12 = z11;
        if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            if (xnVar.F9() && ilVar2.getTag() != null) {
                ilVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.N;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.N = null;
                }
                if (z4) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.N = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ilVar2, (Property<org.telegram.ui.il, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.N.addListener(new zn(this, 1));
                    this.N.setDuration(180L);
                    this.N.start();
                } else {
                    ilVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(xnVar.a(), xnVar.a4);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z10 = true;
        } else {
            if (xnVar.F9() && !xnVar.e4) {
                if (ilVar2.getTag() != null) {
                    return;
                }
                ilVar2.setTag(1);
                AnimatorSet animatorSet3 = this.N;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.N = null;
                }
                if (!z4) {
                    ilVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.N = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(ilVar2, (Property<org.telegram.ui.il, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.N.addListener(new zn(this, 0));
                    this.N.setDuration(180L);
                    this.N.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = xnVar.O3;
            if (i18 == 8) {
                if (xnVar.Q3) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (xnVar.b() == 0) {
                    int topicsCount = xnVar.getMessagesController().getTopicsController().getTopicsCount(-xnVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, xnVar.b());
                    int i19 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i19 > 0) {
                        z10 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z10 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, bg.e.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z10 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, xnVar.getMessagesController().getSavedMessagesController().getMessagesCount(xnVar.I8())), new Object[0]);
                } else {
                    if (xnVar.e4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, xnVar.b());
                        if (findTopic2 != null) {
                            i13 = 1;
                            i14 = findTopic2.totalMessagesCount - 1;
                        } else {
                            i13 = 1;
                            i14 = 0;
                        }
                        if (i14 > 0) {
                            Object[] objArr = new Object[i13];
                            objArr[0] = Integer.valueOf(i14);
                            formatPluralString = LocaleController.formatPluralString("messages", i14, objArr);
                        } else {
                            int i20 = R.string.TopicProfileStatus;
                            Object[] objArr2 = new Object[i13];
                            objArr2[0] = chat.title;
                            formatPluralString = LocaleController.formatString(i20, objArr2);
                        }
                    } else if (chat != null) {
                        TLRPC.ChatFull chatFull = xnVar.W7;
                        int i21 = this.R;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                formatPluralString = chat.megagroup ? chatFull == null ? LocaleController.getString(R.string.Loading).toLowerCase() : chat.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            } else if (chat.megagroup) {
                                formatPluralString = i21 > 1 ? android.support.v4.media.a.z(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i21, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i12, new Object[0]);
                            } else {
                                int[] iArr = new int[1];
                                boolean isAccessibilityScreenReaderEnabled = AndroidUtilities.isAccessibilityScreenReaderEnabled();
                                int i22 = chatFull.participants_count;
                                if (isAccessibilityScreenReaderEnabled) {
                                    iArr[0] = i22;
                                    formatShortNumber = String.valueOf(i22);
                                } else {
                                    formatShortNumber = LocaleController.formatShortNumber(i22, iArr);
                                }
                                formatPluralString = chat.megagroup ? LocaleController.formatPluralString("Members", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber) : LocaleController.formatPluralString("Subscribers", iArr[0], new Object[0]).replace(String.format("%d", Integer.valueOf(iArr[0])), formatShortNumber);
                            }
                        } else if (ChatObject.isKickedFromChat(chat)) {
                            formatPluralString = LocaleController.getString(R.string.YouWereKicked);
                        } else if (ChatObject.isLeftFromChat(chat)) {
                            formatPluralString = LocaleController.getString(R.string.YouLeft);
                        } else {
                            int i23 = chat.participants_count;
                            if (chatFull != null && (chatParticipants = chatFull.participants) != null) {
                                i23 = chatParticipants.participants.size();
                            }
                            formatPluralString = (i21 <= 1 || i23 == 0) ? LocaleController.formatPluralString("Members", i23, new Object[0]) : android.support.v4.media.a.z(LocaleController.formatPluralString("Members", i23, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i21, new Object[0]));
                        }
                    } else if (i17 != null) {
                        TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(i17.id));
                        if (user != null) {
                            i17 = user;
                        }
                        if (!UserObject.isReplyUser(i17)) {
                            long j10 = i17.id;
                            if (j10 != UserObject.VERIFY) {
                                if (j10 == UserConfig.getInstance(i16).getClientUserId()) {
                                    charSequence = z12 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                } else {
                                    long j11 = i17.id;
                                    if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                        charSequence = LocaleController.getString(R.string.ServiceNotifications);
                                    } else if (MessagesController.isSupportUser(i17)) {
                                        charSequence = LocaleController.getString(R.string.SupportStatus);
                                    } else {
                                        boolean z13 = i17.bot;
                                        if (z13 && (i11 = i17.bot_active_users) != 0) {
                                            charSequence = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                        } else if (z13) {
                                            charSequence = LocaleController.getString(R.string.Bot);
                                        } else {
                                            zArr[0] = false;
                                            charSequence = LocaleController.formatUserStatus(i16, i17, zArr, this.b0 ? this.P : null);
                                            z10 = zArr[0];
                                        }
                                    }
                                }
                            }
                        }
                    }
                    charSequence = formatPluralString;
                }
                z10 = false;
            }
        }
        this.U = z10 ? org.telegram.ui.ActionBar.k6.pa : org.telegram.ui.ActionBar.k6.B8;
        if (this.T != null) {
            this.T = charSequence;
        } else if (ilVar != null) {
            ilVar.k(charSequence);
            Integer num = this.V;
            if (num == null) {
                ilVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(this.U, g6Var));
                ilVar.setTag(Integer.valueOf(this.U));
            } else {
                ilVar.setTextColor(num.intValue());
            }
        } else {
            k6Var.c(charSequence, z4, true);
            Integer num2 = this.V;
            if (num2 == null) {
                k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(this.U, g6Var));
                k6Var.setTag(Integer.valueOf(this.U));
            } else {
                k6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.r0;
        if (kVar != null) {
            kVar.d(z4);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.xn xnVar = this.D;
        if (xnVar != null) {
            int i10 = this.G;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (xnVar.O3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.S = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        j5 j5Var = this.c0;
        if (j5Var != null) {
            j5Var.a();
        }
        j5 j5Var2 = this.d0;
        if (j5Var2 != null) {
            j5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.xn xnVar = this.D;
        if (xnVar != null) {
            int i10 = this.G;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (xnVar.O3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        j5 j5Var = this.c0;
        if (j5Var != null) {
            j5Var.b();
        }
        j5 j5Var2 = this.d0;
        if (j5Var2 != null) {
            j5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.getText());
        if (this.l0 != null) {
            sb.append(", ");
            sb.append(this.l0);
        }
        if (this.m0 != null) {
            sb.append(", ");
            sb.append(this.m0);
        }
        sb.append("\n");
        org.telegram.ui.il ilVar = this.r;
        if (ilVar != null) {
            sb.append(ilVar.getText());
        } else {
            k6 k6Var = this.s;
            if (k6Var != null) {
                sb.append(k6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        wn wnVar = this.e;
        int measuredHeight = (((currentActionBarHeight - wnVar.getMeasuredHeight()) - 2) / 2) + (this.H ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.h0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.I + 1;
        int i15 = measuredHeight + 1;
        wnVar.layout(i14, i15, wnVar.getMeasuredWidth() + i14, wnVar.getMeasuredHeight() + i15);
        int dp2 = this.I + AndroidUtilities.dp(wnVar.getVisibility() == 0 ? this.h0 ? 49.66f : 55.0f : this.h0 ? 13.0f : 1.0f) + this.J;
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.il ilVar = this.h;
        if (visibility != 8) {
            ilVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - ilVar.getPaddingTop(), ilVar.getMeasuredWidth() + dp2, ilVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (ilVar.getTextHeight() + measuredHeight)) - ilVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, l5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + l5Var.getTextHeight() + measuredHeight);
            }
        } else {
            ilVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - ilVar.getPaddingTop(), ilVar.getMeasuredWidth() + dp2, ilVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (ilVar.getTextHeight() + measuredHeight)) - ilVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(dp2, AndroidUtilities.dp(10.0f) + measuredHeight, l5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + l5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.I, AndroidUtilities.dp(27.33f) + measuredHeight, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.I, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.I, measuredHeight - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.I, imageView2.getMeasuredHeight() + (measuredHeight - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.I, AndroidUtilities.dp(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.I, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.I, AndroidUtilities.dp(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.I, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        org.telegram.ui.il ilVar2 = this.r;
        if (ilVar2 != null) {
            ilVar2.layout(dp2, dp, ilVar2.getMeasuredWidth() + dp2, ilVar2.getTextHeight() + dp);
        } else {
            k6 k6Var = this.s;
            if (k6Var != null) {
                k6Var.layout(dp2, dp, k6Var.getMeasuredWidth() + dp2, k6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) this.v.get();
        if (l5Var2 != null) {
            l5Var2.layout(dp2, dp, l5Var2.getMeasuredWidth() + dp2, l5Var2.getTextHeight() + dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        wn wnVar = this.e;
        int dp = size - AndroidUtilities.dp((wnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f10 = this.d;
        wnVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.il ilVar = this.h;
        ilVar.measure(makeMeasureSpec, makeMeasureSpec2);
        k6 k6Var = this.s;
        org.telegram.ui.il ilVar2 = this.r;
        if (ilVar2 != null) {
            ilVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (k6Var != null) {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
        ImageView imageView4 = this.B;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i12 = this.L;
        AtomicReference atomicReference = this.n;
        if (i12 != -1 && i12 != size && i12 > size) {
            this.M = i12;
            View view = (org.telegram.ui.ActionBar.l5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference.set(l5Var);
            int i13 = org.telegram.ui.ActionBar.k6.A8;
            org.telegram.ui.ActionBar.g6 g6Var = this.a0;
            l5Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
            l5Var.setTextSizePx(AndroidUtilities.dp(this.h0 ? 17.5f : 18.0f));
            l5Var.setGravity(3);
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            l5Var.i(ilVar.getRightDrawable());
            l5Var.j(ilVar.getRightDrawable2());
            l5Var.setRightDrawableOutside(ilVar.getRightDrawableOutside());
            l5Var.setLeftDrawable(ilVar.getLeftDrawable());
            l5Var.l(ilVar.getText(), false);
            ViewPropertyAnimator duration = l5Var.animate().alpha(0.0f).setDuration(350L);
            pr prVar = pr.h;
            duration.setInterpolator(prVar).withEndAction(new tn(this, 0)).start();
            addView(l5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference2.set(l5Var2);
            int i14 = org.telegram.ui.ActionBar.k6.B8;
            l5Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
            l5Var2.setTag(Integer.valueOf(i14));
            l5Var2.setTextSizePx(AndroidUtilities.dp(this.h0 ? 13.5f : 14.0f));
            l5Var2.setGravity(3);
            if (ilVar2 != null) {
                l5Var2.l(ilVar2.getText(), false);
            } else if (k6Var != null) {
                l5Var2.l(k6Var.getText(), false);
            }
            l5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(prVar).withEndAction(new tn(this, 1)).start();
            addView(l5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) atomicReference.get();
        if (l5Var3 != null) {
            l5Var3.measure(org.telegram.ui.b.d((wnVar.getVisibility() == 0 ? 54 : 0) + 16, this.M, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.L = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        rc rcVar = this.e0;
        tn tnVar = this.f0;
        if (action == 0 && a()) {
            this.g0 = true;
            rcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(tnVar);
            AndroidUtilities.runOnUIThread(tnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.g0) {
            rcVar.c(false);
            this.g0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(tnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.r0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i10 = this.G;
        z8 z8Var = this.F;
        z8Var.k(i10, chat);
        wn wnVar = this.e;
        if (wnVar != null) {
            wnVar.e(chat, z8Var);
            wnVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z4) {
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setVisibility((!z4 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i10) {
        this.I = i10;
    }

    public void setOccupyStatusBar(boolean z4) {
        this.H = z4;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.V = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        super.setPressed(z4);
        this.e0.c(z4);
    }

    public void setRightAvatarPadding(int i10) {
        this.J = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.T == null) {
            org.telegram.ui.il ilVar = this.r;
            if (ilVar != null) {
                ilVar.k(charSequence);
            } else {
                k6 k6Var = this.s;
                if (k6Var != null) {
                    k6Var.setText(charSequence);
                }
            }
        } else {
            this.T = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.r0;
        if (kVar != null) {
            kVar.d(true);
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

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
