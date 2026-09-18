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
import org.telegram.ui.dg1;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public class eo extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final k21 F;
    public final org.telegram.ui.zn G;
    public final xw0[] H;
    public final h9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public xw0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final le.b a;
    public int a0;
    public boolean b;
    public Integer b0;
    public Integer c;
    public final cv0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 d0;
    public final zn e;
    public boolean e0;
    public final boolean f;
    public final o5 f0;
    public final o5 g0;
    public final org.telegram.ui.il h;
    public final yc h0;
    public final wn i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public String o0;
    public String p0;
    public Drawable q0;
    public final org.telegram.ui.il r;
    public Drawable r0;
    public final p6 s;
    public Drawable s0;
    public boolean t0;
    public org.telegram.ui.ActionBar.k u0;
    public final AtomicReference v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;

    /* JADX WARN: Code restructure failed: missing block: B:104:0x010d, code lost:
    
        if (r3 != 6) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02e3, code lost:
    
        if (r0.g4 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00ff, code lost:
    
        if (r3.g4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public eo(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z11;
        int i10;
        int i11;
        int i12;
        qr qrVar = qr.h;
        this.a = new le.b(0, this, qrVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        xw0[] xw0VarArr = new xw0[6];
        this.H = xw0VarArr;
        this.I = new h9((org.telegram.ui.ActionBar.e6) null);
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
        this.i0 = new wn(this, 2);
        this.m0 = false;
        this.n0 = false;
        this.o0 = null;
        this.p0 = null;
        this.d0 = e6Var;
        boolean z12 = n2Var instanceof org.telegram.ui.zn;
        if (z12) {
            this.G = (org.telegram.ui.zn) n2Var;
        }
        org.telegram.ui.zn znVar = this.G;
        boolean z13 = znVar != null && ((i12 = znVar.R3) == 0 || i12 == 8) && !UserObject.isReplyUser(znVar.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY);
        zn znVar2 = new zn(this, context, n2Var, z13, e6Var);
        this.e = znVar2;
        if (z12 || (n2Var instanceof dg1)) {
            org.telegram.ui.zn znVar3 = this.G;
            if (znVar3 == null || ((i10 = znVar3.R3) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(znVar3.f))) {
                this.c0 = new cv0(n2Var);
            }
            org.telegram.ui.zn znVar4 = this.G;
            if (znVar4 != null) {
                if (znVar4.F9()) {
                    org.telegram.ui.zn znVar5 = this.G;
                    if (znVar5.X3 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        znVar2.setVisibility(8);
                    }
                }
                int i13 = this.G.R3;
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 9) {
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
        znVar2.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        znVar2.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(znVar2);
        if (z13) {
            org.telegram.ui.zn znVar6 = this.G;
            TLRPC.Chat chat = znVar6 != null ? znVar6.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                w7.a6.b(znVar2, 0.05f, 1.2f);
            }
            final int i14 = 0;
            znVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yn
                public final /* synthetic */ eo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            eo eoVar = this.b;
                            if (!eoVar.d()) {
                                eoVar.e(true, false);
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
        ilVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, e6Var));
        ilVar.setTextSize(18);
        ilVar.setGravity(3);
        ilVar.setTypeface(AndroidUtilities.bold());
        ilVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        ilVar.setCanHideRightDrawable(false);
        ilVar.setRightDrawableOutside(true);
        ilVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(ilVar);
        if (o()) {
            p6 p6Var = new p6(context, true, true, true);
            this.s = p6Var;
            p6Var.b(0.3f, 320L, qrVar);
            p6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.j6.B8;
            p6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, e6Var));
            p6Var.setTag(Integer.valueOf(i15));
            p6Var.setTextSize(AndroidUtilities.dp(14.0f));
            p6Var.setGravity(3);
            p6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            p6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(p6Var);
        } else {
            org.telegram.ui.il ilVar2 = new org.telegram.ui.il(context, atomicReference2);
            this.r = ilVar2;
            ilVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.j6.B8;
            ilVar2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, e6Var));
            ilVar2.setTag(Integer.valueOf(i16));
            ilVar2.setTextSize(14);
            ilVar2.setGravity(3);
            ilVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(ilVar2);
        }
        if (this.G != null) {
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new fi.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            k21 k21Var = new k21(context, e6Var);
            this.F = k21Var;
            imageView2.setImageDrawable(k21Var);
            k21Var.k = true;
            k21Var.b.setColor(0);
            addView(imageView2);
            this.T = z10;
            imageView2.setOnClickListener(new org.telegram.ui.sf(24, this, e6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, e6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.ui.zn znVar7 = this.G;
        if (znVar7 != null && ((i11 = znVar7.R3) == 0 || i11 == 8 || i11 == 3)) {
            if (znVar7.F9()) {
                org.telegram.ui.zn znVar8 = this.G;
                if (!znVar8.h4) {
                }
            }
            if (!UserObject.isReplyUser(this.G.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.yn
                    public final /* synthetic */ eo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                eo eoVar = this.b;
                                if (!eoVar.d()) {
                                    eoVar.e(true, false);
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
            xw0VarArr[0] = new v51(true);
            xw0VarArr[1] = new rp(true);
            xw0VarArr[2] = new lp0(true);
            xw0VarArr[3] = new rg0(e6Var, false);
            xw0VarArr[4] = new gm0(true);
            xw0VarArr[5] = new rp();
            int i18 = 0;
            while (true) {
                xw0[] xw0VarArr2 = this.H;
                if (i18 >= xw0VarArr2.length) {
                    break;
                }
                xw0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.f0 = new o5(AndroidUtilities.dp(24.0f), this.h);
        this.g0 = new o5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.zn znVar = this.G;
        org.telegram.ui.il ilVar = this.r;
        if (ilVar == null) {
            return;
        }
        int i10 = 0;
        xw0[] xw0VarArr = this.H;
        if (!z10) {
            this.N = null;
            ilVar.setLeftDrawable((Drawable) null);
            ilVar.g(null, null);
            while (i10 < xw0VarArr.length) {
                xw0 xw0Var = xw0VarArr[i10];
                if (xw0Var != null) {
                    xw0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.J).getPrintingStringType(znVar.a(), znVar.d4).intValue();
            xw0 xw0Var2 = xw0VarArr[intValue];
            if (xw0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.d0;
            if (intValue == 5) {
                ilVar.g(xw0Var2, "**oo**");
                xw0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, e6Var));
                ilVar.setLeftDrawable((Drawable) null);
            } else {
                ilVar.g(null, null);
                xw0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, e6Var));
                ilVar.setLeftDrawable(xw0VarArr[intValue]);
            }
            this.N = xw0VarArr[intValue];
            while (i10 < xw0VarArr.length) {
                xw0 xw0Var3 = xw0VarArr[i10];
                if (xw0Var3 != null) {
                    if (i10 == intValue) {
                        xw0Var3.d();
                    } else {
                        xw0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // le.d
    public final void D(int i10, float f7, float f10, le.e eVar) {
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
        org.telegram.ui.zn znVar = this.G;
        if (znVar == null) {
            return;
        }
        TLRPC.User i10 = znVar.i();
        TLRPC.Chat chat = znVar.e;
        if (znVar.R3 == 3) {
            long I8 = znVar.I8();
            if (I8 >= 0) {
                user = znVar.getMessagesController().getUser(Long.valueOf(I8));
                chat = null;
            } else {
                chat = znVar.getMessagesController().getChat(Long.valueOf(-I8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.J;
        h9 h9Var = this.I;
        zn znVar2 = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    h9Var.p = 1.0f;
                    h9Var.k(i11, chat);
                    if (znVar2 != null) {
                        znVar2.setAnimatedEmojiDrawable(null);
                        znVar2.e(chat, h9Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        znVar2.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long d = znVar.d();
            if (!ChatObject.canManageMonoForum(i11, chat) || d == 0) {
                znVar2.setAnimatedEmojiDrawable(null);
                ng.d.o(i11, chat, h9Var, znVar2);
            } else if (d > 0) {
                TLRPC.User user2 = znVar.getMessagesController().getUser(Long.valueOf(d));
                h9Var.r(user2);
                znVar2.setAnimatedEmojiDrawable(null);
                znVar2.e(user2, h9Var);
            } else {
                TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(-d));
                h9Var.q(chat2);
                znVar2.setAnimatedEmojiDrawable(null);
                znVar2.e(chat2, h9Var);
            }
            znVar2.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        h9Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            h9Var.p = 0.8f;
            h9Var.g(12);
            if (znVar2 != null) {
                znVar2.setAnimatedEmojiDrawable(null);
                znVar2.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            h9Var.p = 0.8f;
            h9Var.g(21);
            if (znVar2 != null) {
                znVar2.setAnimatedEmojiDrawable(null);
                znVar2.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && znVar.R3 == 3) {
            h9Var.p = 0.8f;
            h9Var.g(22);
            if (znVar2 != null) {
                znVar2.setAnimatedEmojiDrawable(null);
                znVar2.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            h9Var.p = 1.0f;
            if (znVar2 != null) {
                znVar2.setAnimatedEmojiDrawable(null);
                znVar2.a.setForUserOrChat(user, h9Var, null, true, 3, false);
                return;
            }
            return;
        }
        h9Var.p = 0.8f;
        h9Var.g(1);
        if (znVar2 != null) {
            znVar2.setAnimatedEmojiDrawable(null);
            znVar2.h(null, null, h9Var, user);
        }
    }

    public final o5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        o5 o5Var = this.g0;
        o5Var.j(j3, false);
        o5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.d0)));
        int dp = AndroidUtilities.dp(1.0f);
        o5Var.I = 0;
        o5Var.J = dp;
        return o5Var;
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
        float a2 = this.h0.a(0.02f);
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
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
                boolean drawChild = super.drawChild(canvas, view, j3);
                if (z11) {
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.j6.Il);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.j6.Il);
                }
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
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
        org.telegram.ui.zn znVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z13;
        ch chVar;
        Drawable drawable;
        TLRPC.User user;
        zn znVar2 = this.e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            znVar = this.G;
            TLRPC.User i10 = znVar.i();
            chat = znVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = znVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (znVar.N8() != 0 && (user = znVar.getMessagesController().getUser(Long.valueOf(znVar.N8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = znVar2.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof d6)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!znVar.g4) {
                if (chat == null) {
                    return;
                }
                znVar.presentFragment(ProfileActivity.m4(-chat.id), z11);
                return;
            }
            cv0 cv0Var = this.c0;
            if (i10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (znVar.R3 == 3) {
                        bundle.putLong("topic_id", znVar.I8());
                    } else if (znVar.h4) {
                        bundle.putLong("topic_id", znVar.X3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, cv0Var);
                    if (!z14) {
                        profileActivity.K4(znVar.Z7);
                    }
                    profileActivity.N4(z15 ? 2 : 1);
                    znVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (i10.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i10)) {
                org.telegram.ui.ActionBar.n2 n2Var = cv0Var.w;
                int[] iArr = cv0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!cv0Var.f && (n2Var == null || cv0Var.r != n2Var.getUserConfig().getClientUserId() || cv0Var.s != 0 || !n2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", znVar.a());
                if (znVar.R3 == 3) {
                    bundle2.putLong("topic_id", znVar.I8());
                }
                ka0 ka0Var = new ka0(bundle2, cv0Var);
                ka0Var.c = znVar.Z7;
                znVar.presentFragment(ka0Var, z11);
                return;
            }
            if (znVar.R3 == 3) {
                z13 = z12;
                long I8 = znVar.I8();
                bundle2.putBoolean("saved", true);
                if (I8 >= 0) {
                    bundle2.putLong("user_id", I8);
                } else {
                    bundle2.putLong("chat_id", -I8);
                }
            } else {
                z13 = z12;
                bundle2.putLong("user_id", i10.id);
                if (this.w != null && !z14) {
                    bundle2.putLong("dialog_id", znVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", znVar.d());
            }
            org.telegram.ui.ActionBar.q0 q0Var = znVar.K1;
            bundle2.putBoolean("reportSpam", (q0Var == null || (chVar = znVar.M0) == null || !chVar.d(q0Var) || znVar.N1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, cv0Var);
            if (!z14) {
                profileActivity2.O4(znVar.a8, znVar.b8, znVar.c8);
            }
            profileActivity2.N4(z13 ? 2 : 1);
            znVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        znVar = this.G;
        TLRPC.User i102 = znVar.i();
        chat = znVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = znVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = znVar2.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!znVar.g4) {
        }
    }

    public final void g(int i10, boolean z10) {
        k21 k21Var = this.F;
        if (k21Var == null) {
            return;
        }
        boolean z11 = this.l0;
        if (i10 != 0 || this.T) {
            le.b bVar = this.a;
            if (z11) {
                bVar.a(false, z10);
            } else {
                bVar.a(true, z10);
                k21Var.b(i10);
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

    public cv0 getSharedMediaPreloader() {
        return this.c0;
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
        p6 p6Var = this.s;
        if (p6Var != null) {
            return p6Var;
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
        org.telegram.ui.il ilVar = this.h;
        float max = ilVar != null ? Math.max(0.0f, ilVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.il ilVar2 = this.r;
        if (ilVar2 != null) {
            max = Math.max(max, ilVar2.getExactWidthIncludeDrawables());
        }
        zn znVar = this.e;
        return (int) (max + ((znVar == null || znVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.n0 = false;
        if (z10 || z11) {
            this.n0 = true;
            if (!(this.h.getRightDrawable() instanceof km0)) {
                km0 km0Var = new km0(!z10 ? 1 : 0);
                km0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.d0));
                this.h.j(km0Var);
                this.p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.r0 = mutate;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.d0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.s0 = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ah, this.d0), mode));
            this.h.j(new pq(this.r0, this.s0));
            this.m0 = true;
            this.p0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof km0) {
            this.h.j(null);
            this.m0 = false;
            this.p0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof p5) && (((p5) this.h.getRightDrawable()).a instanceof q5)) {
                ((q5) ((p5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.d0), PorterDuff.Mode.MULTIPLY));
                this.f0.g(this.q0, z14);
            } else {
                this.f0.g(null, z14);
            }
            this.f0.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.d0)));
            this.h.i(this.f0);
            this.m0 = false;
            this.o0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.o0 = null;
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.d(z14);
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
        if (!this.m0 && !this.n0) {
            if (drawable2 != null) {
                this.p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.p0 = null;
            }
            ilVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        h9 h9Var = this.I;
        h9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        zn znVar = this.e;
        if (isReplyUser) {
            h9Var.g(12);
            h9Var.p = 0.8f;
            if (znVar != null) {
                znVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            h9Var.g(21);
            h9Var.p = 0.8f;
            if (znVar != null) {
                znVar.h(null, null, h9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            h9Var.p = 1.0f;
            if (znVar != null) {
                znVar.e(user, h9Var);
                return;
            }
            return;
        }
        h9Var.g(1);
        h9Var.p = 0.8f;
        if (znVar != null) {
            znVar.h(null, null, h9Var, user);
        }
    }

    public final void l() {
        int i10 = this.V;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.e6 e6Var = this.d0;
        p6 p6Var = this.s;
        org.telegram.ui.il ilVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (ilVar != null) {
                    ilVar.k(charSequence);
                    this.W = null;
                    Integer num = this.b0;
                    if (num != null) {
                        ilVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.a0;
                        if (i11 >= 0) {
                            ilVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
                            ilVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (p6Var != null) {
                    p6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        p6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.a0;
                        if (i12 >= 0) {
                            p6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, e6Var));
                            p6Var.setTag(Integer.valueOf(this.a0));
                        }
                    }
                }
            }
        } else if (ilVar != null) {
            if (this.W == null) {
                this.W = ilVar.getText();
            }
            ilVar.k(string);
            Integer num3 = this.b0;
            if (num3 != null) {
                ilVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                ilVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
                ilVar.setTag(Integer.valueOf(i13));
            }
        } else if (p6Var != null) {
            if (this.W == null) {
                this.W = p6Var.getText();
            }
            p6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                p6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.B8;
                p6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, e6Var));
                p6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.zn znVar = this.G;
        if (znVar == null) {
            return;
        }
        this.U = 0;
        TLRPC.ChatFull chatFull = znVar.Z7;
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
        int i11;
        String formatPluralString;
        TLRPC.ChatParticipants chatParticipants;
        int i12;
        String formatShortNumber;
        int i13;
        int i14;
        String formatString;
        int i15;
        org.telegram.ui.ActionBar.e6 e6Var = this.d0;
        boolean[] zArr = this.R;
        p6 p6Var = this.s;
        org.telegram.ui.il ilVar = this.r;
        org.telegram.ui.il ilVar2 = this.h;
        int i16 = this.J;
        org.telegram.ui.zn znVar = this.G;
        if (znVar == null) {
            return;
        }
        if (znVar.R3 == 6) {
            String str = znVar.P3.link;
            hg.y[] yVarArr = hg.y.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = znVar.i();
        TLRPC.Chat chat = znVar.e;
        boolean z12 = UserObject.isUserSelf(i17) && znVar.R3 == 0 && znVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z12) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = znVar.R3) != 0 && i10 != 8))) && znVar.R3 != 3) {
            if (getSubtitleTextView().getVisibility() != 8) {
                getSubtitleTextView().setVisibility(8);
                return;
            }
            return;
        }
        if (z12) {
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
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(znVar.a(), znVar.d4, false);
        if (printingString == null) {
            UserObject.isBotForum(i17);
        }
        CharSequence charSequence = "";
        if (printingString != null) {
            printingString = TextUtils.replace(printingString, new String[]{"..."}, new String[]{""});
        }
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        boolean z13 = z12;
        if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            if (znVar.F9() && ilVar2.getTag() != null) {
                ilVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.Q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Q = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Q = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(ilVar2, (Property<org.telegram.ui.il, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.Q.addListener(new co(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    ilVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(znVar.a(), znVar.d4);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z11 = true;
        } else {
            if (znVar.F9() && !znVar.h4) {
                if (ilVar2.getTag() != null) {
                    return;
                }
                ilVar2.setTag(1);
                AnimatorSet animatorSet3 = this.Q;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.Q = null;
                }
                if (!z10) {
                    ilVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.Q = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(ilVar2, (Property<org.telegram.ui.il, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.Q.addListener(new co(this, 0));
                    this.Q.setDuration(180L);
                    this.Q.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = znVar.R3;
            if (i18 == 8) {
                if (znVar.T3) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (znVar.d() == 0) {
                    int topicsCount = znVar.getMessagesController().getTopicsController().getTopicsCount(-znVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, znVar.d());
                    int i19 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i19 > 0) {
                        z11 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z11 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, ng.d.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z11 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, znVar.getMessagesController().getSavedMessagesController().getMessagesCount(znVar.I8())), new Object[0]);
                } else {
                    if (znVar.h4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, znVar.d());
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
                        TLRPC.ChatFull chatFull = znVar.Z7;
                        int i21 = this.U;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                formatPluralString = chat.megagroup ? chatFull == null ? LocaleController.getString(R.string.Loading).toLowerCase() : chat.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            } else if (chat.megagroup) {
                                formatPluralString = i21 > 1 ? a4.a.C(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i21, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i12, new Object[0]);
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
                            formatPluralString = (i21 <= 1 || i23 == 0) ? LocaleController.formatPluralString("Members", i23, new Object[0]) : a4.a.C(LocaleController.formatPluralString("Members", i23, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i21, new Object[0]));
                        }
                    } else if (i17 != null) {
                        TLRPC.User user = MessagesController.getInstance(i16).getUser(Long.valueOf(i17.id));
                        if (user != null) {
                            i17 = user;
                        }
                        if (!UserObject.isReplyUser(i17)) {
                            long j3 = i17.id;
                            if (j3 != UserObject.VERIFY) {
                                if (j3 == UserConfig.getInstance(i16).getClientUserId()) {
                                    charSequence = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                } else {
                                    long j10 = i17.id;
                                    if (j10 == 333000 || j10 == 777000 || j10 == 42777) {
                                        charSequence = LocaleController.getString(R.string.ServiceNotifications);
                                    } else if (MessagesController.isSupportUser(i17)) {
                                        charSequence = LocaleController.getString(R.string.SupportStatus);
                                    } else {
                                        boolean z14 = i17.bot;
                                        if (z14 && (i11 = i17.bot_active_users) != 0) {
                                            charSequence = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                        } else if (z14) {
                                            charSequence = LocaleController.getString(R.string.Bot);
                                        } else {
                                            zArr[0] = false;
                                            charSequence = LocaleController.formatUserStatus(i16, i17, zArr, this.e0 ? this.S : null);
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
        this.a0 = z11 ? org.telegram.ui.ActionBar.j6.pa : org.telegram.ui.ActionBar.j6.B8;
        if (this.W != null) {
            this.W = charSequence;
        } else if (ilVar != null) {
            ilVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                ilVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.a0, e6Var));
                ilVar.setTag(Integer.valueOf(this.a0));
            } else {
                ilVar.setTextColor(num.intValue());
            }
        } else {
            p6Var.c(charSequence, z10, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                p6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.a0, e6Var));
                p6Var.setTag(Integer.valueOf(this.a0));
            } else {
                p6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
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
        org.telegram.ui.zn znVar = this.G;
        if (znVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (znVar.R3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        o5 o5Var = this.f0;
        if (o5Var != null) {
            o5Var.a();
        }
        o5 o5Var2 = this.g0;
        if (o5Var2 != null) {
            o5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.zn znVar = this.G;
        if (znVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (znVar.R3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        o5 o5Var = this.f0;
        if (o5Var != null) {
            o5Var.b();
        }
        o5 o5Var2 = this.g0;
        if (o5Var2 != null) {
            o5Var2.b();
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
        org.telegram.ui.il ilVar = this.r;
        if (ilVar != null) {
            sb2.append(ilVar.getText());
        } else {
            p6 p6Var = this.s;
            if (p6Var != null) {
                sb2.append(p6Var.getText());
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
        zn znVar = this.e;
        int measuredHeight = (((currentActionBarHeight - znVar.getMeasuredHeight()) - 2) / 2) + (this.K ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.k0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.L + 1;
        int i15 = measuredHeight + 1;
        znVar.layout(i14, i15, znVar.getMeasuredWidth() + i14, znVar.getMeasuredHeight() + i15);
        int dp2 = this.L + AndroidUtilities.dp(znVar.getVisibility() == 0 ? this.k0 ? 49.66f : 55.0f : this.k0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.il ilVar = this.h;
        if (visibility != 8) {
            ilVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - ilVar.getPaddingTop(), ilVar.getMeasuredWidth() + dp2, ilVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (ilVar.getTextHeight() + measuredHeight)) - ilVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, j5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + j5Var.getTextHeight() + measuredHeight);
            }
        } else {
            ilVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - ilVar.getPaddingTop(), ilVar.getMeasuredWidth() + dp2, ilVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (ilVar.getTextHeight() + measuredHeight)) - ilVar.getPaddingTop()));
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
        org.telegram.ui.il ilVar2 = this.r;
        if (ilVar2 != null) {
            ilVar2.layout(dp2, dp, ilVar2.getMeasuredWidth() + dp2, ilVar2.getTextHeight() + dp);
        } else {
            p6 p6Var = this.s;
            if (p6Var != null) {
                p6Var.layout(dp2, dp, p6Var.getMeasuredWidth() + dp2, p6Var.getTextHeight() + dp);
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
        zn znVar = this.e;
        int dp = size - AndroidUtilities.dp((znVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f7 = this.d;
        znVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.il ilVar = this.h;
        ilVar.measure(makeMeasureSpec, makeMeasureSpec2);
        p6 p6Var = this.s;
        org.telegram.ui.il ilVar2 = this.r;
        if (ilVar2 != null) {
            ilVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (p6Var != null) {
            p6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.e6 e6Var = this.d0;
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, e6Var));
            j5Var.setTextSizePx(AndroidUtilities.dp(this.k0 ? 17.5f : 18.0f));
            j5Var.setGravity(3);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            j5Var.i(ilVar.getRightDrawable());
            j5Var.j(ilVar.getRightDrawable2());
            j5Var.setRightDrawableOutside(ilVar.getRightDrawableOutside());
            j5Var.setLeftDrawable(ilVar.getLeftDrawable());
            j5Var.l(ilVar.getText(), false);
            ViewPropertyAnimator duration = j5Var.animate().alpha(0.0f).setDuration(350L);
            qr qrVar = qr.h;
            duration.setInterpolator(qrVar).withEndAction(new wn(this, 0)).start();
            addView(j5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference2.set(j5Var2);
            int i14 = org.telegram.ui.ActionBar.j6.B8;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, e6Var));
            j5Var2.setTag(Integer.valueOf(i14));
            j5Var2.setTextSizePx(AndroidUtilities.dp(this.k0 ? 13.5f : 14.0f));
            j5Var2.setGravity(3);
            if (ilVar2 != null) {
                j5Var2.l(ilVar2.getText(), false);
            } else if (p6Var != null) {
                j5Var2.l(p6Var.getText(), false);
            }
            j5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).withEndAction(new wn(this, 1)).start();
            addView(j5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) atomicReference.get();
        if (j5Var3 != null) {
            j5Var3.measure(org.telegram.messenger.wh.y((znVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        yc ycVar = this.h0;
        wn wnVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            ycVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(wnVar);
            AndroidUtilities.runOnUIThread(wnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            ycVar.c(false);
            this.j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(wnVar);
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
        zn znVar = this.e;
        if (znVar != null) {
            znVar.e(chat, h9Var);
            znVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
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
            org.telegram.ui.il ilVar = this.r;
            if (ilVar != null) {
                ilVar.k(charSequence);
            } else {
                p6 p6Var = this.s;
                if (p6Var != null) {
                    p6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
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

    @Override // le.d
    public final /* synthetic */ void C(float f7, int i10) {
    }
}
