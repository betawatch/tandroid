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
import java.util.HashSet;
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
import org.telegram.ui.af1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class po extends FrameLayout implements oe.d, NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public final ImageView E;
    public final e31 F;
    public final org.telegram.ui.un G;
    public final rx0[] H;
    public final j9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public rx0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final oe.b a;
    public int a0;
    public boolean b;
    public Integer b0;
    public Integer c;
    public final sv0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.u6 d0;
    public final lo e;
    public boolean e0;
    public final boolean f;
    public final r5 f0;
    public final r5 g0;
    public final org.telegram.ui.fl h;
    public final xc h0;
    public final io i0;
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
    public final s6 s;
    public Drawable s0;
    public boolean t0;
    public PorterDuffColorFilter u0;
    public final AtomicReference v;
    public PorterDuffColorFilter v0;
    public final ImageView w;
    public int w0;
    public final ImageView x;
    public int x0;
    public final ImageView y;
    public org.telegram.ui.ActionBar.k y0;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x010b, code lost:
    
        if (r3 != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02cb, code lost:
    
        if (r0.s4 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fd, code lost:
    
        if (r3.s4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public po(Context context, org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        ds dsVar = ds.h;
        this.a = new oe.b(0, this, dsVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        rx0[] rx0VarArr = new rx0[6];
        this.H = rx0VarArr;
        this.I = new j9((org.telegram.ui.ActionBar.u6) null);
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
        this.h0 = new xc(this);
        this.i0 = new io(this, 2);
        this.m0 = false;
        this.n0 = false;
        this.o0 = null;
        this.p0 = null;
        this.d0 = u6Var;
        boolean z14 = r2Var instanceof org.telegram.ui.un;
        if (z14) {
            this.G = (org.telegram.ui.un) r2Var;
        }
        org.telegram.ui.un unVar = this.G;
        if (unVar == null || (!((i12 = unVar.d4) == 0 || i12 == 8) || UserObject.isReplyUser(unVar.i()) || (this.G.i() != null && this.G.i().id == UserObject.VERIFY))) {
            z11 = 8;
            z12 = false;
        } else {
            z11 = 8;
            z12 = true;
        }
        lo loVar = new lo(this, context, r2Var, z12, u6Var);
        this.e = loVar;
        if (z14 || (r2Var instanceof af1)) {
            org.telegram.ui.un unVar2 = this.G;
            if (unVar2 == null || ((i10 = unVar2.d4) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(unVar2.f))) {
                this.c0 = new sv0(r2Var);
            }
            org.telegram.ui.un unVar3 = this.G;
            if (unVar3 != null) {
                if (unVar3.O9()) {
                    org.telegram.ui.un unVar4 = this.G;
                    if (unVar4.j4 != null) {
                    }
                    z13 = true;
                    this.f = z13;
                    if (z13) {
                        loVar.setVisibility(8);
                    }
                }
                int i13 = this.G.d4;
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
        loVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        loVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(loVar);
        if (z12) {
            org.telegram.ui.un unVar5 = this.G;
            TLRPC.Chat chat = unVar5 != null ? unVar5.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                gb1.c(loVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            loVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
                public final /* synthetic */ po b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            po poVar = this.b;
                            if (!poVar.d()) {
                                poVar.e(true, false);
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
        org.telegram.ui.ActionBar.f7.Y(flVar, org.telegram.ui.ActionBar.y6.A8, u6Var);
        flVar.setTextSize(18);
        flVar.setGravity(3);
        flVar.setTypeface(AndroidUtilities.bold());
        flVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        flVar.setCanHideRightDrawable(false);
        flVar.setRightDrawableOutside(true);
        flVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(flVar);
        if (o()) {
            s6 s6Var = new s6(context, true, true, true);
            this.s = s6Var;
            s6Var.b(0.3f, 320L, dsVar);
            s6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.y6.B8;
            org.telegram.ui.ActionBar.f7.Z(s6Var, i15, u6Var);
            s6Var.setTag(Integer.valueOf(i15));
            s6Var.setTextSize(AndroidUtilities.dp(14.0f));
            s6Var.setGravity(3);
            s6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            s6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(s6Var);
        } else {
            org.telegram.ui.fl flVar2 = new org.telegram.ui.fl(context, atomicReference2);
            this.r = flVar2;
            flVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.y6.B8;
            org.telegram.ui.ActionBar.f7.Y(flVar2, i16, u6Var);
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
            imageView.setImageDrawable(new ii.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            e31 e31Var = new e31(context, u6Var);
            this.F = e31Var;
            imageView2.setImageDrawable(e31Var);
            e31Var.k = true;
            e31Var.b.setColor(0);
            addView(imageView2);
            this.T = z10;
            imageView2.setOnClickListener(new ga(6, this, u6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            org.telegram.ui.ActionBar.f7.t(imageView3, org.telegram.ui.ActionBar.y6.s8, u6Var, PorterDuff.Mode.SRC_IN);
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
        org.telegram.ui.un unVar6 = this.G;
        if (unVar6 != null && ((i11 = unVar6.d4) == 0 || i11 == 8 || i11 == 3)) {
            if (unVar6.O9()) {
                org.telegram.ui.un unVar7 = this.G;
                if (!unVar7.t4) {
                }
            }
            if (!UserObject.isReplyUser(this.G.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.ko
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                po poVar = this.b;
                                if (!poVar.d()) {
                                    poVar.e(true, false);
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
            rx0VarArr[0] = new r61(true);
            rx0VarArr[1] = new eq(true);
            rx0VarArr[2] = new dq0(true);
            rx0VarArr[3] = new eh0(u6Var, false);
            rx0VarArr[4] = new bn0(true);
            rx0VarArr[5] = new eq();
            int i18 = 0;
            while (true) {
                rx0[] rx0VarArr2 = this.H;
                if (i18 >= rx0VarArr2.length) {
                    break;
                }
                rx0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.f0 = new r5(AndroidUtilities.dp(24.0f), this.h);
        this.g0 = new r5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.un unVar = this.G;
        org.telegram.ui.fl flVar = this.r;
        if (flVar == null) {
            return;
        }
        int i10 = 0;
        rx0[] rx0VarArr = this.H;
        if (!z10) {
            this.N = null;
            flVar.setLeftDrawable((Drawable) null);
            flVar.g(null, null);
            while (i10 < rx0VarArr.length) {
                rx0 rx0Var = rx0VarArr[i10];
                if (rx0Var != null) {
                    rx0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.J).getPrintingStringType(unVar.a(), unVar.p4).intValue();
            rx0 rx0Var2 = rx0VarArr[intValue];
            if (rx0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.u6 u6Var = this.d0;
            if (intValue == 5) {
                flVar.g(rx0Var2, "**oo**");
                rx0VarArr[intValue].b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pa, u6Var));
                flVar.setLeftDrawable((Drawable) null);
            } else {
                flVar.g(null, null);
                rx0VarArr[intValue].b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pa, u6Var));
                flVar.setLeftDrawable(rx0VarArr[intValue]);
            }
            this.N = rx0VarArr[intValue];
            while (i10 < rx0VarArr.length) {
                rx0 rx0Var3 = rx0VarArr[i10];
                if (rx0Var3 != null) {
                    if (i10 == intValue) {
                        rx0Var3.d();
                    } else {
                        rx0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
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

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int dp;
        org.telegram.ui.un unVar = this.G;
        if (unVar == null) {
            return;
        }
        TLRPC.User i10 = unVar.i();
        TLRPC.Chat chat = unVar.e;
        if (unVar.d4 == 3) {
            long S8 = unVar.S8();
            if (S8 >= 0) {
                user = unVar.getMessagesController().getUser(Long.valueOf(S8));
                chat = null;
            } else {
                chat = unVar.getMessagesController().getChat(Long.valueOf(-S8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.J;
        j9 j9Var = this.I;
        lo loVar = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    j9Var.p = 1.0f;
                    j9Var.k(i11, chat);
                    if (loVar != null) {
                        loVar.setAnimatedEmojiDrawable(null);
                        loVar.f(chat, j9Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        loVar.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = unVar.b();
            if (!ChatObject.canManageMonoForum(i11, chat) || b10 == 0) {
                loVar.setAnimatedEmojiDrawable(null);
                pg.d.o(i11, chat, j9Var, loVar);
            } else if (b10 > 0) {
                TLRPC.User user2 = unVar.getMessagesController().getUser(Long.valueOf(b10));
                j9Var.r(user2);
                loVar.setAnimatedEmojiDrawable(null);
                loVar.f(user2, j9Var);
            } else {
                TLRPC.Chat chat2 = unVar.getMessagesController().getChat(Long.valueOf(-b10));
                j9Var.q(chat2);
                loVar.setAnimatedEmojiDrawable(null);
                loVar.f(chat2, j9Var);
            }
            loVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        j9Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            j9Var.p = 0.8f;
            j9Var.g(12);
            if (loVar != null) {
                loVar.setAnimatedEmojiDrawable(null);
                loVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            j9Var.p = 0.8f;
            j9Var.g(21);
            if (loVar != null) {
                loVar.setAnimatedEmojiDrawable(null);
                loVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && unVar.d4 == 3) {
            j9Var.p = 0.8f;
            j9Var.g(22);
            if (loVar != null) {
                loVar.setAnimatedEmojiDrawable(null);
                loVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            j9Var.p = 1.0f;
            if (loVar != null) {
                loVar.setAnimatedEmojiDrawable(null);
                loVar.a.setForUserOrChat(user, j9Var, null, true, 3, false);
                return;
            }
            return;
        }
        j9Var.p = 0.8f;
        j9Var.g(1);
        if (loVar != null) {
            loVar.setAnimatedEmojiDrawable(null);
            loVar.h(null, null, j9Var, user);
        }
    }

    public final r5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        r5 r5Var = this.g0;
        r5Var.j(j10, false);
        r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.d0)));
        int dp = AndroidUtilities.dp(1.0f);
        r5Var.I = 0;
        r5Var.J = dp;
        return r5Var;
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.y6.Nl);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.y6.Nl);
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
        org.telegram.ui.un unVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z13;
        ch chVar;
        Drawable drawable;
        TLRPC.User user;
        lo loVar = this.e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            unVar = this.G;
            TLRPC.User i10 = unVar.i();
            chat = unVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = unVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (unVar.X8() != 0 && (user = unVar.getMessagesController().getUser(Long.valueOf(unVar.X8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = loVar.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof g6)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!unVar.s4) {
                if (chat == null) {
                    return;
                }
                unVar.presentFragment(ProfileActivity.t4(-chat.id), z11);
                return;
            }
            sv0 sv0Var = this.c0;
            if (i10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (unVar.d4 == 3) {
                        bundle.putLong("topic_id", unVar.S8());
                    } else if (unVar.t4) {
                        bundle.putLong("topic_id", unVar.j4.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, sv0Var);
                    if (!z14) {
                        profileActivity.T4(unVar.l8);
                    }
                    profileActivity.X4(z15 ? 2 : 1);
                    unVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (i10.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i10)) {
                org.telegram.ui.ActionBar.r2 r2Var = sv0Var.w;
                int[] iArr = sv0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!sv0Var.f && (r2Var == null || sv0Var.r != r2Var.getUserConfig().getClientUserId() || sv0Var.s != 0 || !r2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", unVar.a());
                if (unVar.d4 == 3) {
                    bundle2.putLong("topic_id", unVar.S8());
                }
                ta0 ta0Var = new ta0(bundle2, sv0Var);
                ta0Var.c = unVar.l8;
                unVar.presentFragment(ta0Var, z11);
                return;
            }
            if (unVar.d4 == 3) {
                z13 = z12;
                long S8 = unVar.S8();
                bundle2.putBoolean("saved", true);
                if (S8 >= 0) {
                    bundle2.putLong("user_id", S8);
                } else {
                    bundle2.putLong("chat_id", -S8);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", i10.id);
                if (this.w != null && !z14) {
                    bundle2.putLong("dialog_id", unVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", unVar.b());
            }
            org.telegram.ui.ActionBar.q0 q0Var = unVar.W1;
            bundle2.putBoolean("reportSpam", (q0Var == null || (chVar = unVar.Y0) == null || !chVar.d(q0Var) || unVar.Z1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, sv0Var);
            if (!z14) {
                profileActivity2.Y4(unVar.m8, unVar.n8, unVar.o8);
            }
            profileActivity2.X4(z13 ? 2 : 1);
            unVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        unVar = this.G;
        TLRPC.User i102 = unVar.i();
        chat = unVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = unVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = loVar.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!unVar.s4) {
        }
    }

    public final void g(int i10, boolean z10) {
        e31 e31Var = this.F;
        if (e31Var == null) {
            return;
        }
        boolean z11 = this.l0;
        if (i10 != 0 || this.T) {
            oe.b bVar = this.a;
            if (z11) {
                bVar.a(false, z10);
            } else {
                bVar.a(true, z10);
                e31Var.b(i10);
            }
        }
    }

    public y9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.a0;
    }

    public int getLeftPadding() {
        return this.L;
    }

    public sv0 getSharedMediaPreloader() {
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
        s6 s6Var = this.s;
        if (s6Var != null) {
            return s6Var;
        }
        return null;
    }

    public ImageView getTimeItem() {
        return this.w;
    }

    public org.telegram.ui.ActionBar.b6 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.fl flVar = this.h;
        float max = flVar != null ? Math.max(0.0f, flVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.fl flVar2 = this.r;
        if (flVar2 != null) {
            max = Math.max(max, flVar2.getExactWidthIncludeDrawables());
        }
        lo loVar = this.e;
        return (int) (max + ((loVar == null || loVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.n0 = false;
        if (z10 || z11) {
            this.n0 = true;
            if (!(this.h.getRightDrawable() instanceof en0)) {
                en0 en0Var = new en0(!z10 ? 1 : 0);
                en0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, this.d0));
                this.h.j(en0Var);
                this.p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.r0 = mutate;
            int i10 = org.telegram.ui.ActionBar.y6.zh;
            org.telegram.ui.ActionBar.u6 u6Var = this.d0;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(this, mutate, i10, u6Var, mode);
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.s0 = mutate2;
            org.telegram.ui.ActionBar.f7.y(this, mutate2, org.telegram.ui.ActionBar.y6.Ah, this.d0, mode);
            this.h.j(new ar(this.r0, this.s0));
            this.m0 = true;
            this.p0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof en0) {
            this.h.j(null);
            this.m0 = false;
            this.p0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof s5) && (((s5) this.h.getRightDrawable()).a instanceof t5)) {
                ((t5) ((s5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.q0 = mutate3;
                org.telegram.ui.ActionBar.f7.y(this, mutate3, org.telegram.ui.ActionBar.y6.zh, this.d0, PorterDuff.Mode.MULTIPLY);
                this.f0.g(this.q0, z14);
            } else {
                this.f0.g(null, z14);
            }
            this.f0.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.d0)));
            this.h.i(this.f0);
            this.m0 = false;
            this.o0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.o0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.y0;
        if (kVar != null) {
            kVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        org.telegram.ui.fl flVar = this.h;
        org.telegram.ui.ActionBar.f7.r(flVar);
        org.telegram.ui.fl flVar2 = this.r;
        org.telegram.ui.ActionBar.f7.r(flVar2);
        flVar.setTextColor(i10);
        flVar2.setTextColor(i11);
        flVar2.setTag(Integer.valueOf(i11));
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
        org.telegram.ui.ActionBar.k kVar = this.y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        j9 j9Var = this.I;
        j9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        lo loVar = this.e;
        if (isReplyUser) {
            j9Var.g(12);
            j9Var.p = 0.8f;
            if (loVar != null) {
                loVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            j9Var.g(21);
            j9Var.p = 0.8f;
            if (loVar != null) {
                loVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            j9Var.p = 1.0f;
            if (loVar != null) {
                loVar.f(user, j9Var);
                return;
            }
            return;
        }
        j9Var.g(1);
        j9Var.p = 0.8f;
        if (loVar != null) {
            loVar.h(null, null, j9Var, user);
        }
    }

    public final void l() {
        int i10 = this.V;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.u6 u6Var = this.d0;
        s6 s6Var = this.s;
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
                            org.telegram.ui.ActionBar.f7.Y(flVar, i11, u6Var);
                            flVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (s6Var != null) {
                    s6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        s6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.a0;
                        if (i12 >= 0) {
                            org.telegram.ui.ActionBar.f7.Z(s6Var, i12, u6Var);
                            s6Var.setTag(Integer.valueOf(this.a0));
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
                int i13 = org.telegram.ui.ActionBar.y6.B8;
                org.telegram.ui.ActionBar.f7.Y(flVar, i13, u6Var);
                flVar.setTag(Integer.valueOf(i13));
            }
        } else if (s6Var != null) {
            if (this.W == null) {
                this.W = s6Var.getText();
            }
            s6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                s6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.y6.B8;
                org.telegram.ui.ActionBar.f7.Z(s6Var, i14, u6Var);
                s6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.y0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.un unVar = this.G;
        if (unVar == null) {
            return;
        }
        this.U = 0;
        TLRPC.ChatFull chatFull = unVar.l8;
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
        org.telegram.ui.ActionBar.u6 u6Var = this.d0;
        boolean[] zArr = this.R;
        s6 s6Var = this.s;
        org.telegram.ui.fl flVar = this.r;
        org.telegram.ui.fl flVar2 = this.h;
        int i16 = this.J;
        org.telegram.ui.un unVar = this.G;
        if (unVar == null) {
            return;
        }
        if (unVar.d4 == 6) {
            String str = unVar.b4.link;
            jg.z[] zVarArr = jg.z.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = unVar.i();
        TLRPC.Chat chat = unVar.e;
        boolean z13 = UserObject.isUserSelf(i17) && unVar.d4 == 0 && unVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z13) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = unVar.d4) != 0 && i10 != 8))) && unVar.d4 != 3) {
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
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(unVar.a(), unVar.p4, false);
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
            if (unVar.O9() && flVar2.getTag() != null) {
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
                    this.Q.addListener(new oo(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    flVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(unVar.a(), unVar.p4);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (unVar.O9() && !unVar.t4) {
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
                    this.Q.addListener(new oo(this, 0));
                    this.Q.setDuration(180L);
                    this.Q.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = unVar.d4;
            if (i18 == 8) {
                if (unVar.f4) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (unVar.b() == 0) {
                    int topicsCount = unVar.getMessagesController().getTopicsController().getTopicsCount(-unVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, unVar.b());
                    int i19 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i19 > 0) {
                        z12 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z12 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, pg.d.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z12 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, unVar.getMessagesController().getSavedMessagesController().getMessagesCount(unVar.S8())), new Object[0]);
                } else {
                    if (unVar.t4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, unVar.b());
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
                        TLRPC.ChatFull chatFull = unVar.l8;
                        int i21 = this.U;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                formatPluralString = chat.megagroup ? chatFull == null ? LocaleController.getString(R.string.Loading).toLowerCase() : chat.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            } else if (chat.megagroup) {
                                formatPluralString = i21 > 1 ? a1.g.D(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i21, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i12, new Object[0]);
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
                            formatPluralString = (i21 <= 1 || i23 == 0) ? LocaleController.formatPluralString("Members", i23, new Object[0]) : a1.g.D(LocaleController.formatPluralString("Members", i23, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i21, new Object[0]));
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
        this.a0 = z12 ? org.telegram.ui.ActionBar.y6.pa : org.telegram.ui.ActionBar.y6.B8;
        if (this.W != null) {
            this.W = charSequence;
        } else if (flVar != null) {
            flVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                org.telegram.ui.ActionBar.f7.Y(flVar, this.a0, u6Var);
                flVar.setTag(Integer.valueOf(this.a0));
            } else {
                flVar.setTextColor(num.intValue());
            }
        } else {
            s6Var.c(charSequence, z10, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                org.telegram.ui.ActionBar.f7.Z(s6Var, this.a0, u6Var);
                s6Var.setTag(Integer.valueOf(this.a0));
            } else {
                s6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.y0;
        if (kVar != null) {
            kVar.d(z10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (unVar.d4 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        r5 r5Var = this.f0;
        if (r5Var != null) {
            r5Var.a();
        }
        r5 r5Var2 = this.g0;
        if (r5Var2 != null) {
            r5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.un unVar = this.G;
        if (unVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (unVar.d4 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        r5 r5Var = this.f0;
        if (r5Var != null) {
            r5Var.b();
        }
        r5 r5Var2 = this.g0;
        if (r5Var2 != null) {
            r5Var2.b();
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
            s6 s6Var = this.s;
            if (s6Var != null) {
                sb2.append(s6Var.getText());
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
        lo loVar = this.e;
        int measuredHeight = (((currentActionBarHeight - loVar.getMeasuredHeight()) - 2) / 2) + (this.K ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.k0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.L + 1;
        int i15 = measuredHeight + 1;
        loVar.layout(i14, i15, loVar.getMeasuredWidth() + i14, loVar.getMeasuredHeight() + i15);
        int dp2 = this.L + AndroidUtilities.dp(loVar.getVisibility() == 0 ? this.k0 ? 49.66f : 55.0f : this.k0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.fl flVar = this.h;
        if (visibility != 8) {
            flVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - flVar.getPaddingTop(), flVar.getMeasuredWidth() + dp2, flVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (flVar.getTextHeight() + measuredHeight)) - flVar.getPaddingTop()));
            if (b6Var != null) {
                b6Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, b6Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + b6Var.getTextHeight() + measuredHeight);
            }
        } else {
            flVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - flVar.getPaddingTop(), flVar.getMeasuredWidth() + dp2, flVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (flVar.getTextHeight() + measuredHeight)) - flVar.getPaddingTop()));
            if (b6Var != null) {
                b6Var.layout(dp2, AndroidUtilities.dp(10.0f) + measuredHeight, b6Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + b6Var.getTextHeight() + measuredHeight);
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
            s6 s6Var = this.s;
            if (s6Var != null) {
                s6Var.layout(dp2, dp, s6Var.getMeasuredWidth() + dp2, s6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.b6 b6Var2 = (org.telegram.ui.ActionBar.b6) this.v.get();
        if (b6Var2 != null) {
            b6Var2.layout(dp2, dp, b6Var2.getMeasuredWidth() + dp2, b6Var2.getTextHeight() + dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        lo loVar = this.e;
        int dp = size - AndroidUtilities.dp((loVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f7 = this.d;
        loVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.fl flVar = this.h;
        flVar.measure(makeMeasureSpec, makeMeasureSpec2);
        s6 s6Var = this.s;
        org.telegram.ui.fl flVar2 = this.r;
        if (flVar2 != null) {
            flVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (s6Var != null) {
            s6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
            View view = (org.telegram.ui.ActionBar.b6) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(getContext());
            atomicReference.set(b6Var);
            int i13 = org.telegram.ui.ActionBar.y6.A8;
            org.telegram.ui.ActionBar.u6 u6Var = this.d0;
            org.telegram.ui.ActionBar.f7.Y(b6Var, i13, u6Var);
            b6Var.setTextSizePx(AndroidUtilities.dp(this.k0 ? 17.5f : 18.0f));
            b6Var.setGravity(3);
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            b6Var.i(flVar.getRightDrawable());
            b6Var.j(flVar.getRightDrawable2());
            b6Var.setRightDrawableOutside(flVar.getRightDrawableOutside());
            b6Var.setLeftDrawable(flVar.getLeftDrawable());
            b6Var.l(flVar.getText(), false);
            ViewPropertyAnimator duration = b6Var.animate().alpha(0.0f).setDuration(350L);
            ds dsVar = ds.h;
            duration.setInterpolator(dsVar).withEndAction(new io(this, 0)).start();
            addView(b6Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.b6) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(getContext());
            atomicReference2.set(b6Var2);
            int i14 = org.telegram.ui.ActionBar.y6.B8;
            org.telegram.ui.ActionBar.f7.Y(b6Var2, i14, u6Var);
            b6Var2.setTag(Integer.valueOf(i14));
            b6Var2.setTextSizePx(AndroidUtilities.dp(this.k0 ? 13.5f : 14.0f));
            b6Var2.setGravity(3);
            if (flVar2 != null) {
                b6Var2.l(flVar2.getText(), false);
            } else if (s6Var != null) {
                b6Var2.l(s6Var.getText(), false);
            }
            b6Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(dsVar).withEndAction(new io(this, 1)).start();
            addView(b6Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.b6 b6Var3 = (org.telegram.ui.ActionBar.b6) atomicReference.get();
        if (b6Var3 != null) {
            b6Var3.measure(org.telegram.messenger.vh.x((loVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xc xcVar = this.h0;
        io ioVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            xcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(ioVar);
            AndroidUtilities.runOnUIThread(ioVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            xcVar.c(false);
            this.j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(ioVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final PorterDuffColorFilter p() {
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, this.d0);
        if (this.u0 == null || w02 != this.w0) {
            this.w0 = w02;
            this.u0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
        }
        return this.u0;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.y0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i10 = this.J;
        j9 j9Var = this.I;
        j9Var.k(i10, chat);
        lo loVar = this.e;
        if (loVar != null) {
            loVar.f(chat, j9Var);
            loVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
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
                s6 s6Var = this.s;
                if (s6Var != null) {
                    s6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.y0;
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        rx0 rx0Var = this.N;
        org.telegram.ui.ActionBar.u6 u6Var = this.d0;
        if (rx0Var != null) {
            rx0Var.b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.pa, u6Var));
        }
        Drawable drawable = this.q0;
        if (drawable != null) {
            drawable.setColorFilter(p());
        }
        r5 r5Var = this.g0;
        if (r5Var != null) {
            r5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, u6Var)));
        }
        r5 r5Var2 = this.f0;
        if (r5Var2 != null) {
            r5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.zh, u6Var)));
        }
        Drawable drawable2 = this.r0;
        if (drawable2 != null) {
            drawable2.setColorFilter(p());
        }
        if (this.s0 != null) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ah, u6Var);
            if (this.v0 == null || w02 != this.x0) {
                this.x0 = w02;
                this.v0 = new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY);
            }
            this.s0.setColorFilter(this.v0);
        }
        org.telegram.ui.fl flVar = this.h;
        if (flVar != null) {
            try {
                if (flVar.getRightDrawable2() instanceof en0) {
                    ((en0) flVar.getRightDrawable2()).b(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.B8, u6Var));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        invalidate();
    }

    public void f() {
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
