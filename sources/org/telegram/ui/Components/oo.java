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
import org.telegram.ui.te1;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class oo extends FrameLayout implements ne.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final q21 F;
    public final org.telegram.ui.sn G;
    public final fx0[] H;
    public final h9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public fx0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final ne.b a;
    public int a0;
    public boolean b;
    public Integer b0;
    public Integer c;
    public final kv0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 d0;
    public final ko e;
    public boolean e0;
    public final boolean f;
    public final p5 f0;
    public final p5 g0;
    public final org.telegram.ui.fl h;
    public final yc h0;
    public final ho i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public String o0;
    public String p0;
    public Drawable q0;
    public final org.telegram.ui.fl r;
    public Drawable r0;
    public final q6 s;
    public Drawable s0;
    public boolean t0;
    public org.telegram.ui.ActionBar.k u0;
    public final AtomicReference v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x010b, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e0, code lost:
    
        if (r0.g4 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fd, code lost:
    
        if (r3.g4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oo(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        bs bsVar = bs.h;
        this.a = new ne.b(0, this, bsVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        fx0[] fx0VarArr = new fx0[6];
        this.H = fx0VarArr;
        this.I = new h9((org.telegram.ui.ActionBar.d6) null);
        this.J = UserConfig.selectedAccount;
        this.K = true;
        this.L = AndroidUtilities.dp(8.0f);
        this.M = 0;
        this.O = -1;
        this.P = -1;
        this.R = new boolean[1];
        this.S = new boolean[1];
        this.U = -1;
        this.a0 = -1;
        this.e0 = false;
        this.h0 = new yc(this);
        this.i0 = new ho(this, 2);
        this.m0 = false;
        this.n0 = false;
        this.o0 = null;
        this.p0 = null;
        this.d0 = d6Var;
        boolean z14 = n2Var instanceof org.telegram.ui.sn;
        if (z14) {
            this.G = (org.telegram.ui.sn) n2Var;
        }
        org.telegram.ui.sn snVar = this.G;
        if (snVar == null || (!((i12 = snVar.R3) == 0 || i12 == 8) || UserObject.isReplyUser(snVar.i()) || (this.G.i() != null && this.G.i().id == UserObject.VERIFY))) {
            z11 = 8;
            z12 = false;
        } else {
            z11 = 8;
            z12 = true;
        }
        ko koVar = new ko(this, context, n2Var, z12, d6Var);
        this.e = koVar;
        if (z14 || (n2Var instanceof te1)) {
            org.telegram.ui.sn snVar2 = this.G;
            if (snVar2 == null || ((i10 = snVar2.R3) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(snVar2.f))) {
                this.c0 = new kv0(n2Var);
            }
            org.telegram.ui.sn snVar3 = this.G;
            if (snVar3 != null) {
                if (snVar3.K9()) {
                    org.telegram.ui.sn snVar4 = this.G;
                    if (snVar4.X3 != null) {
                    }
                    z13 = true;
                    this.f = z13;
                    if (z13) {
                        koVar.setVisibility(8);
                    }
                }
                int i13 = this.G.R3;
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 9) {
                        }
                    }
                }
                z13 = true;
                this.f = z13;
                if (z13) {
                }
            }
            z13 = false;
            this.f = z13;
            if (z13) {
            }
        }
        koVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        koVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(koVar);
        if (z12) {
            org.telegram.ui.sn snVar5 = this.G;
            TLRPC.Chat chat = snVar5 != null ? snVar5.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                w7.b6.b(koVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            koVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
                public final /* synthetic */ oo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            oo ooVar = this.b;
                            if (!ooVar.d()) {
                                ooVar.e(true, false);
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
        org.telegram.ui.fl flVar = new org.telegram.ui.fl(context, atomicReference);
        this.h = flVar;
        flVar.setEllipsizeByGradient(true);
        flVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
        flVar.setTextSize(18);
        flVar.setGravity(3);
        flVar.setTypeface(AndroidUtilities.bold());
        flVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        flVar.setCanHideRightDrawable(false);
        flVar.setRightDrawableOutside(true);
        flVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(flVar);
        if (o()) {
            q6 q6Var = new q6(context, true, true, true);
            this.s = q6Var;
            q6Var.b(0.3f, 320L, bsVar);
            q6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.h6.B8;
            q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, d6Var));
            q6Var.setTag(Integer.valueOf(i15));
            q6Var.setTextSize(AndroidUtilities.dp(14.0f));
            q6Var.setGravity(3);
            q6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            q6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(q6Var);
        } else {
            org.telegram.ui.fl flVar2 = new org.telegram.ui.fl(context, atomicReference2);
            this.r = flVar2;
            flVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.h6.B8;
            flVar2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, d6Var));
            flVar2.setTag(Integer.valueOf(i16));
            flVar2.setTextSize(14);
            flVar2.setGravity(3);
            flVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(flVar2);
        }
        if (this.G != null) {
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new hi.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            q21 q21Var = new q21(context, d6Var);
            this.F = q21Var;
            imageView2.setImageDrawable(q21Var);
            q21Var.k = true;
            q21Var.b.setColor(0);
            addView(imageView2);
            this.T = z10;
            imageView2.setOnClickListener(new ca(4, this, d6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.s8, d6Var), PorterDuff.Mode.SRC_IN));
            imageView3.setAlpha(0.0f);
            imageView3.setVisibility(4);
            imageView3.setScaleY(0.0f);
            imageView3.setScaleX(0.0f);
            addView(imageView3);
            ImageView imageView4 = new ImageView(context);
            this.E = imageView4;
            imageView4.setImageResource(R.drawable.star_small_inner);
            imageView4.setAlpha(0.0f);
            imageView4.setVisibility(4);
            imageView4.setScaleY(0.0f);
            imageView4.setScaleX(0.0f);
            addView(imageView4);
        }
        org.telegram.ui.sn snVar6 = this.G;
        if (snVar6 != null && ((i11 = snVar6.R3) == 0 || i11 == 8 || i11 == 3)) {
            if (snVar6.K9()) {
                org.telegram.ui.sn snVar7 = this.G;
                if (!snVar7.h4) {
                }
            }
            if (!UserObject.isReplyUser(this.G.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.jo
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                oo ooVar = this.b;
                                if (!ooVar.d()) {
                                    ooVar.e(true, false);
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
            TLRPC.Chat chat2 = this.G.e;
            fx0VarArr[0] = new d61(true);
            fx0VarArr[1] = new bq(true);
            fx0VarArr[2] = new tp0(true);
            fx0VarArr[3] = new bh0(d6Var, false);
            fx0VarArr[4] = new sm0(true);
            fx0VarArr[5] = new bq();
            int i18 = 0;
            while (true) {
                fx0[] fx0VarArr2 = this.H;
                if (i18 >= fx0VarArr2.length) {
                    break;
                }
                fx0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.f0 = new p5(AndroidUtilities.dp(24.0f), this.h);
        this.g0 = new p5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.sn snVar = this.G;
        org.telegram.ui.fl flVar = this.r;
        if (flVar == null) {
            return;
        }
        int i10 = 0;
        fx0[] fx0VarArr = this.H;
        if (!z10) {
            this.N = null;
            flVar.setLeftDrawable((Drawable) null);
            flVar.g(null, null);
            while (i10 < fx0VarArr.length) {
                fx0 fx0Var = fx0VarArr[i10];
                if (fx0Var != null) {
                    fx0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.J).getPrintingStringType(snVar.a(), snVar.d4).intValue();
            fx0 fx0Var2 = fx0VarArr[intValue];
            if (fx0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.d6 d6Var = this.d0;
            if (intValue == 5) {
                flVar.g(fx0Var2, "**oo**");
                fx0VarArr[intValue].b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pa, d6Var));
                flVar.setLeftDrawable((Drawable) null);
            } else {
                flVar.g(null, null);
                fx0VarArr[intValue].b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.pa, d6Var));
                flVar.setLeftDrawable(fx0VarArr[intValue]);
            }
            this.N = fx0VarArr[intValue];
            while (i10 < fx0VarArr.length) {
                fx0 fx0Var3 = fx0VarArr[i10];
                if (fx0Var3 != null) {
                    if (i10 == intValue) {
                        fx0Var3.d();
                    } else {
                        fx0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int dp;
        org.telegram.ui.sn snVar = this.G;
        if (snVar == null) {
            return;
        }
        TLRPC.User i10 = snVar.i();
        TLRPC.Chat chat = snVar.e;
        if (snVar.R3 == 3) {
            long N8 = snVar.N8();
            if (N8 >= 0) {
                user = snVar.getMessagesController().getUser(Long.valueOf(N8));
                chat = null;
            } else {
                chat = snVar.getMessagesController().getChat(Long.valueOf(-N8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.J;
        h9 h9Var = this.I;
        ko koVar = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    h9Var.p = 1.0f;
                    h9Var.k(i11, chat);
                    if (koVar != null) {
                        koVar.setAnimatedEmojiDrawable(null);
                        koVar.e(chat, h9Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        koVar.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long d = snVar.d();
            if (!ChatObject.canManageMonoForum(i11, chat) || d == 0) {
                koVar.setAnimatedEmojiDrawable(null);
                og.d.o(i11, chat, h9Var, koVar);
            } else if (d > 0) {
                TLRPC.User user2 = snVar.getMessagesController().getUser(Long.valueOf(d));
                h9Var.r(user2);
                koVar.setAnimatedEmojiDrawable(null);
                koVar.e(user2, h9Var);
            } else {
                TLRPC.Chat chat2 = snVar.getMessagesController().getChat(Long.valueOf(-d));
                h9Var.q(chat2);
                koVar.setAnimatedEmojiDrawable(null);
                koVar.e(chat2, h9Var);
            }
            koVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        h9Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            h9Var.p = 0.8f;
            h9Var.g(12);
            if (koVar != null) {
                koVar.setAnimatedEmojiDrawable(null);
                koVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            h9Var.p = 0.8f;
            h9Var.g(21);
            if (koVar != null) {
                koVar.setAnimatedEmojiDrawable(null);
                koVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && snVar.R3 == 3) {
            h9Var.p = 0.8f;
            h9Var.g(22);
            if (koVar != null) {
                koVar.setAnimatedEmojiDrawable(null);
                koVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            h9Var.p = 1.0f;
            if (koVar != null) {
                koVar.setAnimatedEmojiDrawable(null);
                koVar.a.setForUserOrChat(user, h9Var, null, true, 3, false);
                return;
            }
            return;
        }
        h9Var.p = 0.8f;
        h9Var.g(1);
        if (koVar != null) {
            koVar.setAnimatedEmojiDrawable(null);
            koVar.h(null, null, h9Var, user);
        }
    }

    public final p5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        p5 p5Var = this.g0;
        p5Var.j(j10, false);
        p5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, this.d0)));
        int dp = AndroidUtilities.dp(1.0f);
        p5Var.I = 0;
        p5Var.J = dp;
        return p5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.J).getConnectionState();
            if (this.V != connectionState) {
                this.V = connectionState;
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
            org.telegram.ui.fl flVar = this.h;
            if (flVar != null) {
                flVar.invalidate();
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
        float a2 = this.h0.a(0.02f);
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.h6.Ll);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.h6.Ll);
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
        org.telegram.ui.sn snVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z13;
        ch chVar;
        Drawable drawable;
        TLRPC.User user;
        ko koVar = this.e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            snVar = this.G;
            TLRPC.User i10 = snVar.i();
            chat = snVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = snVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (snVar.S8() != 0 && (user = snVar.getMessagesController().getUser(Long.valueOf(snVar.S8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = koVar.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof e6)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!snVar.g4) {
                if (chat == null) {
                    return;
                }
                snVar.presentFragment(ProfileActivity.m4(-chat.id), z11);
                return;
            }
            kv0 kv0Var = this.c0;
            if (i10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (snVar.R3 == 3) {
                        bundle.putLong("topic_id", snVar.N8());
                    } else if (snVar.h4) {
                        bundle.putLong("topic_id", snVar.X3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, kv0Var);
                    if (!z14) {
                        profileActivity.K4(snVar.Z7);
                    }
                    profileActivity.N4(z15 ? 2 : 1);
                    snVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (i10.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i10)) {
                org.telegram.ui.ActionBar.n2 n2Var = kv0Var.w;
                int[] iArr = kv0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!kv0Var.f && (n2Var == null || kv0Var.r != n2Var.getUserConfig().getClientUserId() || kv0Var.s != 0 || !n2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", snVar.a());
                if (snVar.R3 == 3) {
                    bundle2.putLong("topic_id", snVar.N8());
                }
                wa0 wa0Var = new wa0(bundle2, kv0Var);
                wa0Var.c = snVar.Z7;
                snVar.presentFragment(wa0Var, z11);
                return;
            }
            if (snVar.R3 == 3) {
                z13 = z12;
                long N8 = snVar.N8();
                bundle2.putBoolean("saved", true);
                if (N8 >= 0) {
                    bundle2.putLong("user_id", N8);
                } else {
                    bundle2.putLong("chat_id", -N8);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", i10.id);
                if (this.w != null && !z14) {
                    bundle2.putLong("dialog_id", snVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", snVar.d());
            }
            org.telegram.ui.ActionBar.p0 p0Var = snVar.K1;
            bundle2.putBoolean("reportSpam", (p0Var == null || (chVar = snVar.M0) == null || !chVar.d(p0Var) || snVar.N1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, kv0Var);
            if (!z14) {
                profileActivity2.O4(snVar.a8, snVar.b8, snVar.c8);
            }
            profileActivity2.N4(z13 ? 2 : 1);
            snVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        snVar = this.G;
        TLRPC.User i102 = snVar.i();
        chat = snVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = snVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = koVar.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!snVar.g4) {
        }
    }

    public final void g(int i10, boolean z10) {
        q21 q21Var = this.F;
        if (q21Var == null) {
            return;
        }
        boolean z11 = this.l0;
        if (i10 != 0 || this.T) {
            ne.b bVar = this.a;
            if (z11) {
                bVar.a(false, z10);
            } else {
                bVar.a(true, z10);
                q21Var.b(i10);
            }
        }
    }

    public w9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public kv0 getSharedMediaPreloader() {
        return this.c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.fl flVar = this.r;
        return flVar != null ? flVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.fl flVar = this.r;
        if (flVar != null) {
            return flVar;
        }
        q6 q6Var = this.s;
        if (q6Var != null) {
            return q6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.w;
    }

    public org.telegram.ui.ActionBar.j5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.fl flVar = this.h;
        float max = flVar != null ? Math.max(0.0f, flVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.fl flVar2 = this.r;
        if (flVar2 != null) {
            max = Math.max(max, flVar2.getExactWidthIncludeDrawables());
        }
        ko koVar = this.e;
        return (int) (max + ((koVar == null || koVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.n0 = false;
        if (z10 || z11) {
            this.n0 = true;
            if (!(this.h.getRightDrawable() instanceof vm0)) {
                vm0 vm0Var = new vm0(!z10 ? 1 : 0);
                vm0Var.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B8, this.d0));
                this.h.j(vm0Var);
                this.p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.r0 = mutate;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, this.d0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.s0 = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ah, this.d0), mode));
            this.h.j(new zq(this.r0, this.s0));
            this.m0 = true;
            this.p0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof vm0) {
            this.h.j(null);
            this.m0 = false;
            this.p0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof q5) && (((q5) this.h.getRightDrawable()).a instanceof r5)) {
                ((r5) ((q5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, this.d0), PorterDuff.Mode.MULTIPLY));
                this.f0.g(this.q0, z14);
            } else {
                this.f0.g(null, z14);
            }
            this.f0.k(Integer.valueOf(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.zh, this.d0)));
            this.h.i(this.f0);
            this.m0 = false;
            this.o0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.o0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.e(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.fl flVar = this.r;
        flVar.setTextColor(i11);
        flVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.fl flVar = this.h;
        flVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.n0) {
            if (drawable2 != null) {
                this.p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.p0 = null;
            }
            flVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        ko koVar = this.e;
        if (isReplyUser) {
            h9Var.g(12);
            h9Var.p = 0.8f;
            if (koVar != null) {
                koVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            h9Var.g(21);
            h9Var.p = 0.8f;
            if (koVar != null) {
                koVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            h9Var.p = 1.0f;
            if (koVar != null) {
                koVar.e(user, h9Var);
                return;
            }
            return;
        }
        h9Var.g(1);
        h9Var.p = 0.8f;
        if (koVar != null) {
            koVar.h(null, null, h9Var, user);
        }
    }

    public final void l() {
        int i10 = this.V;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.d6 d6Var = this.d0;
        q6 q6Var = this.s;
        org.telegram.ui.fl flVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (flVar != null) {
                    flVar.k(charSequence);
                    this.W = null;
                    Integer num = this.b0;
                    if (num != null) {
                        flVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.a0;
                        if (i11 >= 0) {
                            flVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
                            flVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (q6Var != null) {
                    q6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        q6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.a0;
                        if (i12 >= 0) {
                            q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
                            q6Var.setTag(Integer.valueOf(this.a0));
                        }
                    }
                }
            }
        } else if (flVar != null) {
            if (this.W == null) {
                this.W = flVar.getText();
            }
            flVar.k(string);
            Integer num3 = this.b0;
            if (num3 != null) {
                flVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.h6.B8;
                flVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                flVar.setTag(Integer.valueOf(i13));
            }
        } else if (q6Var != null) {
            if (this.W == null) {
                this.W = q6Var.getText();
            }
            q6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                q6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.h6.B8;
                q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
                q6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.e(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.sn snVar = this.G;
        if (snVar == null) {
            return;
        }
        this.U = 0;
        TLRPC.ChatFull chatFull = snVar.Z7;
        if (chatFull == null) {
            return;
        }
        int i10 = this.J;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.U = chatFull.online_count;
            return;
        }
        for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                this.U++;
            }
        }
    }

    public final void n(boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        String formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String formatShortNumber;
        int i13;
        int i14;
        String formatString;
        int i15;
        org.telegram.ui.ActionBar.d6 d6Var = this.d0;
        boolean[] zArr = this.R;
        q6 q6Var = this.s;
        org.telegram.ui.fl flVar = this.r;
        org.telegram.ui.fl flVar2 = this.h;
        int i16 = this.J;
        org.telegram.ui.sn snVar = this.G;
        if (snVar == null) {
            return;
        }
        if (snVar.R3 == 6) {
            String str = snVar.P3.link;
            ig.y[] yVarArr = ig.y.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = snVar.i();
        TLRPC.Chat chat = snVar.e;
        boolean z13 = UserObject.isUserSelf(i17) && snVar.R3 == 0 && snVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z13) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = snVar.R3) != 0 && i10 != 8))) && snVar.R3 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z13) {
            if (getSubtitleTextView().getVisibility() != 0) {
                i15 = 0;
                getSubtitleTextView().setVisibility(0);
            } else {
                i15 = 0;
            }
            if (!this.t0) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i15) + 1).apply();
                this.t0 = true;
            }
        }
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(snVar.a(), snVar.d4, false);
        if (printingString == null) {
            UserObject.isBotForum(i17);
        }
        CharSequence charSequence = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z14 = z13;
        if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            if (snVar.K9() && flVar2.getTag() != null) {
                flVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.Q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Q = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Q = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(flVar2, (Property<org.telegram.ui.fl, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.Q.addListener(new no(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    flVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(snVar.a(), snVar.d4);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (snVar.K9() && !snVar.h4) {
                if (flVar2.getTag() != null) {
                    return;
                }
                flVar2.setTag(1);
                AnimatorSet animatorSet3 = this.Q;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.Q = null;
                }
                if (!z10) {
                    flVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.Q = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(flVar2, (Property<org.telegram.ui.fl, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.Q.addListener(new no(this, 0));
                    this.Q.setDuration(180L);
                    this.Q.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = snVar.R3;
            if (i18 == 8) {
                if (snVar.T3) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (snVar.d() == 0) {
                    int topicsCount = snVar.getMessagesController().getTopicsController().getTopicsCount(-snVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, snVar.d());
                    int i19 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i19 > 0) {
                        z12 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z12 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, og.d.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z12 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, snVar.getMessagesController().getSavedMessagesController().getMessagesCount(snVar.N8())), new Object[0]);
                } else {
                    if (snVar.h4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, snVar.d());
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
                        TLRPC.ChatFull chatFull = snVar.Z7;
                        int i21 = this.U;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                formatPluralString = chat.megagroup ? chatFull == null ? LocaleController.getString(R.string.Loading).toLowerCase() : chat.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            } else if (chat.megagroup) {
                                formatPluralString = i21 > 1 ? a1.g.C(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i21, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i12, new Object[0]);
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
                            formatPluralString = (i21 <= 1 || i23 == 0) ? LocaleController.formatPluralString("Members", i23, new Object[0]) : a1.g.C(LocaleController.formatPluralString("Members", i23, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i21, new Object[0]));
                        }
                    } else {
                        if (i17 != null) {
                            TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(i17.id));
                            if (user != null) {
                                i17 = user;
                            }
                            if (!UserObject.isReplyUser(i17)) {
                                long j10 = i17.id;
                                if (j10 != UserObject.VERIFY) {
                                    if (j10 == UserConfig.getInstance(i16).getClientUserId()) {
                                        charSequence = z14 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j11 = i17.id;
                                        if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
                                            z11 = false;
                                            charSequence = LocaleController.getString(R.string.ServiceNotifications);
                                        } else if (MessagesController.isSupportUser(i17)) {
                                            charSequence = LocaleController.getString(R.string.SupportStatus);
                                        } else {
                                            boolean z15 = i17.bot;
                                            if (z15 && (i11 = i17.bot_active_users) != 0) {
                                                charSequence = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                            } else if (z15) {
                                                charSequence = UserObject.getBotStatus(i17);
                                            } else {
                                                zArr[0] = false;
                                                charSequence = LocaleController.formatUserStatus(i16, i17, zArr, this.e0 ? this.S : null);
                                                z12 = zArr[0];
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            z11 = false;
                        }
                        z12 = z11;
                    }
                    charSequence = formatPluralString;
                }
                z12 = false;
            }
        }
        this.a0 = z12 ? org.telegram.ui.ActionBar.h6.pa : org.telegram.ui.ActionBar.h6.B8;
        if (this.W != null) {
            this.W = charSequence;
        } else if (flVar != null) {
            flVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                flVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(this.a0, d6Var));
                flVar.setTag(Integer.valueOf(this.a0));
            } else {
                flVar.setTextColor(num.intValue());
            }
        } else {
            q6Var.c(charSequence, z10, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                q6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(this.a0, d6Var));
                q6Var.setTag(Integer.valueOf(this.a0));
            } else {
                q6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
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
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (snVar.R3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        p5 p5Var = this.f0;
        if (p5Var != null) {
            p5Var.a();
        }
        p5 p5Var2 = this.g0;
        if (p5Var2 != null) {
            p5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.sn snVar = this.G;
        if (snVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (snVar.R3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        p5 p5Var = this.f0;
        if (p5Var != null) {
            p5Var.b();
        }
        p5 p5Var2 = this.g0;
        if (p5Var2 != null) {
            p5Var2.b();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.h.getText());
        if (this.o0 != null) {
            sb2.append(", ");
            sb2.append(this.o0);
        }
        if (this.p0 != null) {
            sb2.append(", ");
            sb2.append(this.p0);
        }
        sb2.append("\n");
        org.telegram.ui.fl flVar = this.r;
        if (flVar != null) {
            sb2.append(flVar.getText());
        } else {
            q6 q6Var = this.s;
            if (q6Var != null) {
                sb2.append(q6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        ko koVar = this.e;
        int measuredHeight = (((currentActionBarHeight - koVar.getMeasuredHeight()) - 2) / 2) + (this.K ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.k0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.L + 1;
        int i15 = measuredHeight + 1;
        koVar.layout(i14, i15, koVar.getMeasuredWidth() + i14, koVar.getMeasuredHeight() + i15);
        int dp2 = this.L + AndroidUtilities.dp(koVar.getVisibility() == 0 ? this.k0 ? 49.66f : 55.0f : this.k0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.fl flVar = this.h;
        if (visibility != 8) {
            flVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - flVar.getPaddingTop(), flVar.getMeasuredWidth() + dp2, flVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (flVar.getTextHeight() + measuredHeight)) - flVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, j5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + j5Var.getTextHeight() + measuredHeight);
            }
        } else {
            flVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - flVar.getPaddingTop(), flVar.getMeasuredWidth() + dp2, flVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (flVar.getTextHeight() + measuredHeight)) - flVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(dp2, AndroidUtilities.dp(10.0f) + measuredHeight, j5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + j5Var.getTextHeight() + measuredHeight);
            }
        }
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.layout(AndroidUtilities.dp(29.0f) + this.L, AndroidUtilities.dp(27.33f) + measuredHeight, imageView.getMeasuredWidth() + AndroidUtilities.dp(29.0f) + this.L, imageView.getMeasuredHeight() + AndroidUtilities.dp(27.33f) + measuredHeight);
        }
        ImageView imageView2 = this.w;
        if (imageView2 != null) {
            imageView2.layout(AndroidUtilities.dp(19.333f) + this.L, measuredHeight - AndroidUtilities.dp(8.0f), imageView2.getMeasuredWidth() + AndroidUtilities.dp(19.333f) + this.L, imageView2.getMeasuredHeight() + (measuredHeight - AndroidUtilities.dp(8.0f)));
        }
        ImageView imageView3 = this.y;
        if (imageView3 != null) {
            imageView3.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + measuredHeight, imageView3.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView3.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.layout(AndroidUtilities.dp(28.0f) + this.L, AndroidUtilities.dp(24.0f) + measuredHeight, imageView4.getMeasuredWidth() + AndroidUtilities.dp(28.0f) + this.L, imageView4.getMeasuredHeight() + AndroidUtilities.dp(24.0f) + measuredHeight);
        }
        org.telegram.ui.fl flVar2 = this.r;
        if (flVar2 != null) {
            flVar2.layout(dp2, dp, flVar2.getMeasuredWidth() + dp2, flVar2.getTextHeight() + dp);
        } else {
            q6 q6Var = this.s;
            if (q6Var != null) {
                q6Var.layout(dp2, dp, q6Var.getMeasuredWidth() + dp2, q6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) this.v.get();
        if (j5Var2 != null) {
            j5Var2.layout(dp2, dp, j5Var2.getMeasuredWidth() + dp2, j5Var2.getTextHeight() + dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        ko koVar = this.e;
        int dp = size - AndroidUtilities.dp((koVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f7 = this.d;
        koVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.fl flVar = this.h;
        flVar.measure(makeMeasureSpec, makeMeasureSpec2);
        q6 q6Var = this.s;
        org.telegram.ui.fl flVar2 = this.r;
        if (flVar2 != null) {
            flVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (q6Var != null) {
            q6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
        ImageView imageView4 = this.E;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i12 = this.O;
        AtomicReference atomicReference = this.n;
        if (i12 != -1 && i12 != size && i12 > size) {
            this.P = i12;
            View view = (org.telegram.ui.ActionBar.j5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference.set(j5Var);
            int i13 = org.telegram.ui.ActionBar.h6.A8;
            org.telegram.ui.ActionBar.d6 d6Var = this.d0;
            j5Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
            j5Var.setTextSizePx(AndroidUtilities.dp(this.k0 ? 17.5f : 18.0f));
            j5Var.setGravity(3);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            j5Var.i(flVar.getRightDrawable());
            j5Var.j(flVar.getRightDrawable2());
            j5Var.setRightDrawableOutside(flVar.getRightDrawableOutside());
            j5Var.setLeftDrawable(flVar.getLeftDrawable());
            j5Var.l(flVar.getText(), false);
            ViewPropertyAnimator duration = j5Var.animate().alpha(0.0f).setDuration(350L);
            bs bsVar = bs.h;
            duration.setInterpolator(bsVar).withEndAction(new ho(this, 0)).start();
            addView(j5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference2.set(j5Var2);
            int i14 = org.telegram.ui.ActionBar.h6.B8;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
            j5Var2.setTag(Integer.valueOf(i14));
            j5Var2.setTextSizePx(AndroidUtilities.dp(this.k0 ? 13.5f : 14.0f));
            j5Var2.setGravity(3);
            if (flVar2 != null) {
                j5Var2.l(flVar2.getText(), false);
            } else if (q6Var != null) {
                j5Var2.l(q6Var.getText(), false);
            }
            j5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(bsVar).withEndAction(new ho(this, 1)).start();
            addView(j5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) atomicReference.get();
        if (j5Var3 != null) {
            j5Var3.measure(org.telegram.messenger.kk.c((koVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        yc ycVar = this.h0;
        ho hoVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            ycVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(hoVar);
            AndroidUtilities.runOnUIThread(hoVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            ycVar.c(false);
            this.j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(hoVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.u0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.k(i10, chat);
        ko koVar = this.e;
        if (koVar != null) {
            koVar.e(chat, h9Var);
            koVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i10) {
        this.L = i10;
    }

    public void setOccupyStatusBar(boolean z10) {
        this.K = z10;
    }

    public void setOverrideSubtitleColor(Integer num) {
        this.b0 = num;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.h0.c(z10);
    }

    public void setRightAvatarPadding(int i10) {
        this.M = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.W == null) {
            org.telegram.ui.fl flVar = this.r;
            if (flVar != null) {
                flVar.k(charSequence);
            } else {
                q6 q6Var = this.s;
                if (q6Var != null) {
                    q6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
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

    @Override // ne.d
    public final void u(int i10, float f7, float f10, ne.e eVar) {
        ImageView imageView;
        if (i10 != 0 || (imageView = this.w) == null) {
            return;
        }
        imageView.setAlpha(f7);
        float f11 = 0.85f * f7;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    public void f() {
    }

    @Override // ne.d
    public final /* synthetic */ void E(float f7, int i10) {
    }
}
