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
import org.telegram.ui.ig1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class jo extends FrameLayout implements le.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final j21 F;
    public final org.telegram.ui.eo G;
    public final ww0[] H;
    public final g9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public ww0 N;
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
    public final av0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 d0;
    public final fo e;
    public boolean e0;
    public final boolean f;
    public final n5 f0;
    public final n5 g0;
    public final org.telegram.ui.nl h;
    public final xc h0;
    public final bo i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public String o0;
    public String p0;
    public Drawable q0;
    public final org.telegram.ui.nl r;
    public Drawable r0;
    public final o6 s;
    public Drawable s0;
    public boolean t0;
    public org.telegram.ui.ActionBar.l u0;
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
    public jo(Context context, org.telegram.ui.ActionBar.p2 p2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z11;
        int i10;
        int i11;
        int i12;
        wr wrVar = wr.h;
        this.a = new le.b(0, this, wrVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        ww0[] ww0VarArr = new ww0[6];
        this.H = ww0VarArr;
        this.I = new g9((org.telegram.ui.ActionBar.f6) null);
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
        this.i0 = new bo(this, 2);
        this.m0 = false;
        this.n0 = false;
        this.o0 = null;
        this.p0 = null;
        this.d0 = f6Var;
        boolean z12 = p2Var instanceof org.telegram.ui.eo;
        if (z12) {
            this.G = (org.telegram.ui.eo) p2Var;
        }
        org.telegram.ui.eo eoVar = this.G;
        boolean z13 = eoVar != null && ((i12 = eoVar.R3) == 0 || i12 == 8) && !UserObject.isReplyUser(eoVar.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY);
        fo foVar = new fo(this, context, p2Var, z13, f6Var);
        this.e = foVar;
        if (z12 || (p2Var instanceof ig1)) {
            org.telegram.ui.eo eoVar2 = this.G;
            if (eoVar2 == null || ((i10 = eoVar2.R3) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(eoVar2.f))) {
                this.c0 = new av0(p2Var);
            }
            org.telegram.ui.eo eoVar3 = this.G;
            if (eoVar3 != null) {
                if (eoVar3.F9()) {
                    org.telegram.ui.eo eoVar4 = this.G;
                    if (eoVar4.X3 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        foVar.setVisibility(8);
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
        foVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        foVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(foVar);
        if (z13) {
            org.telegram.ui.eo eoVar5 = this.G;
            TLRPC.Chat chat = eoVar5 != null ? eoVar5.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                w7.c6.b(foVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            foVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.eo
                public final /* synthetic */ jo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            jo joVar = this.b;
                            if (!joVar.d()) {
                                joVar.e(true, false);
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
        org.telegram.ui.nl nlVar = new org.telegram.ui.nl(context, atomicReference);
        this.h = nlVar;
        nlVar.setEllipsizeByGradient(true);
        nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
        nlVar.setTextSize(18);
        nlVar.setGravity(3);
        nlVar.setTypeface(AndroidUtilities.bold());
        nlVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        nlVar.setCanHideRightDrawable(false);
        nlVar.setRightDrawableOutside(true);
        nlVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(nlVar);
        if (o()) {
            o6 o6Var = new o6(context, true, true, true);
            this.s = o6Var;
            o6Var.b(0.3f, 320L, wrVar);
            o6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.j6.B8;
            o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
            o6Var.setTag(Integer.valueOf(i15));
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var.setGravity(3);
            o6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            o6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(o6Var);
        } else {
            org.telegram.ui.nl nlVar2 = new org.telegram.ui.nl(context, atomicReference2);
            this.r = nlVar2;
            nlVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.j6.B8;
            nlVar2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, f6Var));
            nlVar2.setTag(Integer.valueOf(i16));
            nlVar2.setTextSize(14);
            nlVar2.setGravity(3);
            nlVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(nlVar2);
        }
        if (this.G != null) {
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new ei.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            j21 j21Var = new j21(context, f6Var);
            this.F = j21Var;
            imageView2.setImageDrawable(j21Var);
            j21Var.k = true;
            j21Var.b.setColor(0);
            addView(imageView2);
            this.T = z10;
            imageView2.setOnClickListener(new org.telegram.ui.sh(21, this, f6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, f6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.ui.eo eoVar6 = this.G;
        if (eoVar6 != null && ((i11 = eoVar6.R3) == 0 || i11 == 8 || i11 == 3)) {
            if (eoVar6.F9()) {
                org.telegram.ui.eo eoVar7 = this.G;
                if (!eoVar7.h4) {
                }
            }
            if (!UserObject.isReplyUser(this.G.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.eo
                    public final /* synthetic */ jo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                jo joVar = this.b;
                                if (!joVar.d()) {
                                    joVar.e(true, false);
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
            ww0VarArr[0] = new t51(true);
            ww0VarArr[1] = new xp(true);
            ww0VarArr[2] = new ip0(true);
            ww0VarArr[3] = new qg0(f6Var, false);
            ww0VarArr[4] = new fm0(true);
            ww0VarArr[5] = new xp();
            int i18 = 0;
            while (true) {
                ww0[] ww0VarArr2 = this.H;
                if (i18 >= ww0VarArr2.length) {
                    break;
                }
                ww0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.f0 = new n5(AndroidUtilities.dp(24.0f), this.h);
        this.g0 = new n5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.eo eoVar = this.G;
        org.telegram.ui.nl nlVar = this.r;
        if (nlVar == null) {
            return;
        }
        int i10 = 0;
        ww0[] ww0VarArr = this.H;
        if (!z10) {
            this.N = null;
            nlVar.setLeftDrawable((Drawable) null);
            nlVar.g(null, null);
            while (i10 < ww0VarArr.length) {
                ww0 ww0Var = ww0VarArr[i10];
                if (ww0Var != null) {
                    ww0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.J).getPrintingStringType(eoVar.a(), eoVar.d4).intValue();
            ww0 ww0Var2 = ww0VarArr[intValue];
            if (ww0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.f6 f6Var = this.d0;
            if (intValue == 5) {
                nlVar.g(ww0Var2, "**oo**");
                ww0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, f6Var));
                nlVar.setLeftDrawable((Drawable) null);
            } else {
                nlVar.g(null, null);
                ww0VarArr[intValue].b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.pa, f6Var));
                nlVar.setLeftDrawable(ww0VarArr[intValue]);
            }
            this.N = ww0VarArr[intValue];
            while (i10 < ww0VarArr.length) {
                ww0 ww0Var3 = ww0VarArr[i10];
                if (ww0Var3 != null) {
                    if (i10 == intValue) {
                        ww0Var3.d();
                    } else {
                        ww0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // le.d
    public final void G(int i10, float f7, float f10, le.e eVar) {
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
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar == null) {
            return;
        }
        TLRPC.User i10 = eoVar.i();
        TLRPC.Chat chat = eoVar.e;
        if (eoVar.R3 == 3) {
            long I8 = eoVar.I8();
            if (I8 >= 0) {
                user = eoVar.getMessagesController().getUser(Long.valueOf(I8));
                chat = null;
            } else {
                chat = eoVar.getMessagesController().getChat(Long.valueOf(-I8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.J;
        g9 g9Var = this.I;
        fo foVar = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    g9Var.p = 1.0f;
                    g9Var.k(i11, chat);
                    if (foVar != null) {
                        foVar.setAnimatedEmojiDrawable(null);
                        foVar.e(chat, g9Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        foVar.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long d = eoVar.d();
            if (!ChatObject.canManageMonoForum(i11, chat) || d == 0) {
                foVar.setAnimatedEmojiDrawable(null);
                mg.d.o(i11, chat, g9Var, foVar);
            } else if (d > 0) {
                TLRPC.User user2 = eoVar.getMessagesController().getUser(Long.valueOf(d));
                g9Var.r(user2);
                foVar.setAnimatedEmojiDrawable(null);
                foVar.e(user2, g9Var);
            } else {
                TLRPC.Chat chat2 = eoVar.getMessagesController().getChat(Long.valueOf(-d));
                g9Var.q(chat2);
                foVar.setAnimatedEmojiDrawable(null);
                foVar.e(chat2, g9Var);
            }
            foVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        g9Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            g9Var.p = 0.8f;
            g9Var.g(12);
            if (foVar != null) {
                foVar.setAnimatedEmojiDrawable(null);
                foVar.h(null, null, g9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            g9Var.p = 0.8f;
            g9Var.g(21);
            if (foVar != null) {
                foVar.setAnimatedEmojiDrawable(null);
                foVar.h(null, null, g9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && eoVar.R3 == 3) {
            g9Var.p = 0.8f;
            g9Var.g(22);
            if (foVar != null) {
                foVar.setAnimatedEmojiDrawable(null);
                foVar.h(null, null, g9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            g9Var.p = 1.0f;
            if (foVar != null) {
                foVar.setAnimatedEmojiDrawable(null);
                foVar.a.setForUserOrChat(user, g9Var, null, true, 3, false);
                return;
            }
            return;
        }
        g9Var.p = 0.8f;
        g9Var.g(1);
        if (foVar != null) {
            foVar.setAnimatedEmojiDrawable(null);
            foVar.h(null, null, g9Var, user);
        }
    }

    public final n5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        n5 n5Var = this.g0;
        n5Var.j(j3, false);
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.zh, this.d0)));
        int dp = AndroidUtilities.dp(1.0f);
        n5Var.I = 0;
        n5Var.J = dp;
        return n5Var;
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
            org.telegram.ui.nl nlVar = this.h;
            if (nlVar != null) {
                nlVar.invalidate();
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
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
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
        org.telegram.ui.eo eoVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z13;
        fh fhVar;
        Drawable drawable;
        TLRPC.User user;
        fo foVar = this.e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            eoVar = this.G;
            TLRPC.User i10 = eoVar.i();
            chat = eoVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = eoVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (eoVar.N8() != 0 && (user = eoVar.getMessagesController().getUser(Long.valueOf(eoVar.N8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = foVar.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof c6)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!eoVar.g4) {
                if (chat == null) {
                    return;
                }
                eoVar.presentFragment(ProfileActivity.m4(-chat.id), z11);
                return;
            }
            av0 av0Var = this.c0;
            if (i10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (eoVar.R3 == 3) {
                        bundle.putLong("topic_id", eoVar.I8());
                    } else if (eoVar.h4) {
                        bundle.putLong("topic_id", eoVar.X3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, av0Var);
                    if (!z14) {
                        profileActivity.K4(eoVar.Z7);
                    }
                    profileActivity.N4(z15 ? 2 : 1);
                    eoVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (i10.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i10)) {
                org.telegram.ui.ActionBar.p2 p2Var = av0Var.w;
                int[] iArr = av0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!av0Var.f && (p2Var == null || av0Var.r != p2Var.getUserConfig().getClientUserId() || av0Var.s != 0 || !p2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", eoVar.a());
                if (eoVar.R3 == 3) {
                    bundle2.putLong("topic_id", eoVar.I8());
                }
                la0 la0Var = new la0(bundle2, av0Var);
                la0Var.c = eoVar.Z7;
                eoVar.presentFragment(la0Var, z11);
                return;
            }
            if (eoVar.R3 == 3) {
                z13 = z12;
                long I8 = eoVar.I8();
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
                    bundle2.putLong("dialog_id", eoVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", eoVar.d());
            }
            org.telegram.ui.ActionBar.r0 r0Var = eoVar.K1;
            bundle2.putBoolean("reportSpam", (r0Var == null || (fhVar = eoVar.M0) == null || !fhVar.d(r0Var) || eoVar.N1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, av0Var);
            if (!z14) {
                profileActivity2.O4(eoVar.a8, eoVar.b8, eoVar.c8);
            }
            profileActivity2.N4(z13 ? 2 : 1);
            eoVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        eoVar = this.G;
        TLRPC.User i102 = eoVar.i();
        chat = eoVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = eoVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = foVar.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!eoVar.g4) {
        }
    }

    public final void g(int i10, boolean z10) {
        j21 j21Var = this.F;
        if (j21Var == null) {
            return;
        }
        boolean z11 = this.l0;
        if (i10 != 0 || this.T) {
            le.b bVar = this.a;
            if (z11) {
                bVar.a(false, z10);
            } else {
                bVar.a(true, z10);
                j21Var.b(i10);
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

    public av0 getSharedMediaPreloader() {
        return this.c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.nl nlVar = this.r;
        return nlVar != null ? nlVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.nl nlVar = this.r;
        if (nlVar != null) {
            return nlVar;
        }
        o6 o6Var = this.s;
        if (o6Var != null) {
            return o6Var;
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
        org.telegram.ui.nl nlVar = this.h;
        float max = nlVar != null ? Math.max(0.0f, nlVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.nl nlVar2 = this.r;
        if (nlVar2 != null) {
            max = Math.max(max, nlVar2.getExactWidthIncludeDrawables());
        }
        fo foVar = this.e;
        return (int) (max + ((foVar == null || foVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.n0 = false;
        if (z10 || z11) {
            this.n0 = true;
            if (!(this.h.getRightDrawable() instanceof hm0)) {
                hm0 hm0Var = new hm0(!z10 ? 1 : 0);
                hm0Var.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, this.d0));
                this.h.j(hm0Var);
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
            this.h.j(new vq(this.r0, this.s0));
            this.m0 = true;
            this.p0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof hm0) {
            this.h.j(null);
            this.m0 = false;
            this.p0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof o5) && (((o5) this.h.getRightDrawable()).a instanceof p5)) {
                ((p5) ((o5) this.h.getRightDrawable()).a).o(this.h);
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
        org.telegram.ui.ActionBar.l lVar = this.u0;
        if (lVar != null) {
            lVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.nl nlVar = this.r;
        nlVar.setTextColor(i11);
        nlVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.nl nlVar = this.h;
        nlVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.n0) {
            if (drawable2 != null) {
                this.p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.p0 = null;
            }
            nlVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.l lVar = this.u0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        g9 g9Var = this.I;
        g9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        fo foVar = this.e;
        if (isReplyUser) {
            g9Var.g(12);
            g9Var.p = 0.8f;
            if (foVar != null) {
                foVar.h(null, null, g9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            g9Var.g(21);
            g9Var.p = 0.8f;
            if (foVar != null) {
                foVar.h(null, null, g9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            g9Var.p = 1.0f;
            if (foVar != null) {
                foVar.e(user, g9Var);
                return;
            }
            return;
        }
        g9Var.g(1);
        g9Var.p = 0.8f;
        if (foVar != null) {
            foVar.h(null, null, g9Var, user);
        }
    }

    public final void l() {
        int i10 = this.V;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.f6 f6Var = this.d0;
        o6 o6Var = this.s;
        org.telegram.ui.nl nlVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (nlVar != null) {
                    nlVar.k(charSequence);
                    this.W = null;
                    Integer num = this.b0;
                    if (num != null) {
                        nlVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.a0;
                        if (i11 >= 0) {
                            nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                            nlVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (o6Var != null) {
                    o6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        o6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.a0;
                        if (i12 >= 0) {
                            o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
                            o6Var.setTag(Integer.valueOf(this.a0));
                        }
                    }
                }
            }
        } else if (nlVar != null) {
            if (this.W == null) {
                this.W = nlVar.getText();
            }
            nlVar.k(string);
            Integer num3 = this.b0;
            if (num3 != null) {
                nlVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.j6.B8;
                nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
                nlVar.setTag(Integer.valueOf(i13));
            }
        } else if (o6Var != null) {
            if (this.W == null) {
                this.W = o6Var.getText();
            }
            o6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                o6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.j6.B8;
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
                o6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.u0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar == null) {
            return;
        }
        this.U = 0;
        TLRPC.ChatFull chatFull = eoVar.Z7;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.d0;
        boolean[] zArr = this.R;
        o6 o6Var = this.s;
        org.telegram.ui.nl nlVar = this.r;
        org.telegram.ui.nl nlVar2 = this.h;
        int i16 = this.J;
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar == null) {
            return;
        }
        if (eoVar.R3 == 6) {
            String str = eoVar.P3.link;
            gg.b0[] b0VarArr = gg.b0.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = eoVar.i();
        TLRPC.Chat chat = eoVar.e;
        boolean z12 = UserObject.isUserSelf(i17) && eoVar.R3 == 0 && eoVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z12) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = eoVar.R3) != 0 && i10 != 8))) && eoVar.R3 != 3) {
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
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(eoVar.a(), eoVar.d4, false);
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
            if (eoVar.F9() && nlVar2.getTag() != null) {
                nlVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.Q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Q = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Q = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(nlVar2, (Property<org.telegram.ui.nl, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.Q.addListener(new io(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    nlVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(eoVar.a(), eoVar.d4);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z11 = true;
        } else {
            if (eoVar.F9() && !eoVar.h4) {
                if (nlVar2.getTag() != null) {
                    return;
                }
                nlVar2.setTag(1);
                AnimatorSet animatorSet3 = this.Q;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.Q = null;
                }
                if (!z10) {
                    nlVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.Q = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(nlVar2, (Property<org.telegram.ui.nl, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.Q.addListener(new io(this, 0));
                    this.Q.setDuration(180L);
                    this.Q.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = eoVar.R3;
            if (i18 == 8) {
                if (eoVar.T3) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (eoVar.d() == 0) {
                    int topicsCount = eoVar.getMessagesController().getTopicsController().getTopicsCount(-eoVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, eoVar.d());
                    int i19 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i19 > 0) {
                        z11 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z11 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, mg.d.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z11 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, eoVar.getMessagesController().getSavedMessagesController().getMessagesCount(eoVar.I8())), new Object[0]);
                } else {
                    if (eoVar.h4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, eoVar.d());
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
                        TLRPC.ChatFull chatFull = eoVar.Z7;
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
        } else if (nlVar != null) {
            nlVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                nlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.a0, f6Var));
                nlVar.setTag(Integer.valueOf(this.a0));
            } else {
                nlVar.setTextColor(num.intValue());
            }
        } else {
            o6Var.c(charSequence, z10, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(this.a0, f6Var));
                o6Var.setTag(Integer.valueOf(this.a0));
            } else {
                o6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.u0;
        if (lVar != null) {
            lVar.d(z10);
        }
    }

    public boolean o() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (eoVar.R3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.V = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        n5 n5Var = this.f0;
        if (n5Var != null) {
            n5Var.a();
        }
        n5 n5Var2 = this.g0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.eo eoVar = this.G;
        if (eoVar != null) {
            int i10 = this.J;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (eoVar.R3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        n5 n5Var = this.f0;
        if (n5Var != null) {
            n5Var.b();
        }
        n5 n5Var2 = this.g0;
        if (n5Var2 != null) {
            n5Var2.b();
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
        org.telegram.ui.nl nlVar = this.r;
        if (nlVar != null) {
            sb2.append(nlVar.getText());
        } else {
            o6 o6Var = this.s;
            if (o6Var != null) {
                sb2.append(o6Var.getText());
            }
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        if (accessibilityNodeInfo.isClickable()) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.OpenProfile)));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
        fo foVar = this.e;
        int measuredHeight = (((currentActionBarHeight - foVar.getMeasuredHeight()) - 2) / 2) + (this.K ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.k0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.L + 1;
        int i15 = measuredHeight + 1;
        foVar.layout(i14, i15, foVar.getMeasuredWidth() + i14, foVar.getMeasuredHeight() + i15);
        int dp2 = this.L + AndroidUtilities.dp(foVar.getVisibility() == 0 ? this.k0 ? 49.66f : 55.0f : this.k0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.nl nlVar = this.h;
        if (visibility != 8) {
            nlVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - nlVar.getPaddingTop(), nlVar.getMeasuredWidth() + dp2, nlVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (nlVar.getTextHeight() + measuredHeight)) - nlVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, l5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + l5Var.getTextHeight() + measuredHeight);
            }
        } else {
            nlVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - nlVar.getPaddingTop(), nlVar.getMeasuredWidth() + dp2, nlVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (nlVar.getTextHeight() + measuredHeight)) - nlVar.getPaddingTop()));
            if (l5Var != null) {
                l5Var.layout(dp2, AndroidUtilities.dp(10.0f) + measuredHeight, l5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(10.0f) + l5Var.getTextHeight() + measuredHeight);
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
        org.telegram.ui.nl nlVar2 = this.r;
        if (nlVar2 != null) {
            nlVar2.layout(dp2, dp, nlVar2.getMeasuredWidth() + dp2, nlVar2.getTextHeight() + dp);
        } else {
            o6 o6Var = this.s;
            if (o6Var != null) {
                o6Var.layout(dp2, dp, o6Var.getMeasuredWidth() + dp2, o6Var.getTextHeight() + dp);
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
        fo foVar = this.e;
        int dp = size - AndroidUtilities.dp((foVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f7 = this.d;
        foVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.nl nlVar = this.h;
        nlVar.measure(makeMeasureSpec, makeMeasureSpec2);
        o6 o6Var = this.s;
        org.telegram.ui.nl nlVar2 = this.r;
        if (nlVar2 != null) {
            nlVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (o6Var != null) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
            View view = (org.telegram.ui.ActionBar.l5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference.set(l5Var);
            int i13 = org.telegram.ui.ActionBar.j6.A8;
            org.telegram.ui.ActionBar.f6 f6Var = this.d0;
            l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i13, f6Var));
            l5Var.setTextSizePx(AndroidUtilities.dp(this.k0 ? 17.5f : 18.0f));
            l5Var.setGravity(3);
            l5Var.setTypeface(AndroidUtilities.bold());
            l5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            l5Var.i(nlVar.getRightDrawable());
            l5Var.j(nlVar.getRightDrawable2());
            l5Var.setRightDrawableOutside(nlVar.getRightDrawableOutside());
            l5Var.setLeftDrawable(nlVar.getLeftDrawable());
            l5Var.l(nlVar.getText(), false);
            ViewPropertyAnimator duration = l5Var.animate().alpha(0.0f).setDuration(350L);
            wr wrVar = wr.h;
            duration.setInterpolator(wrVar).withEndAction(new bo(this, 0)).start();
            addView(l5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.l5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(getContext());
            atomicReference2.set(l5Var2);
            int i14 = org.telegram.ui.ActionBar.j6.B8;
            l5Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, f6Var));
            l5Var2.setTag(Integer.valueOf(i14));
            l5Var2.setTextSizePx(AndroidUtilities.dp(this.k0 ? 13.5f : 14.0f));
            l5Var2.setGravity(3);
            if (nlVar2 != null) {
                l5Var2.l(nlVar2.getText(), false);
            } else if (o6Var != null) {
                l5Var2.l(o6Var.getText(), false);
            }
            l5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(wrVar).withEndAction(new bo(this, 1)).start();
            addView(l5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) atomicReference.get();
        if (l5Var3 != null) {
            l5Var3.measure(org.telegram.messenger.em.d((foVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        xc xcVar = this.h0;
        bo boVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            xcVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(boVar);
            AndroidUtilities.runOnUIThread(boVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            xcVar.c(false);
            this.j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(boVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.u0 = lVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i10 = this.J;
        g9 g9Var = this.I;
        g9Var.k(i10, chat);
        fo foVar = this.e;
        if (foVar != null) {
            foVar.e(chat, g9Var);
            foVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
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
            org.telegram.ui.nl nlVar = this.r;
            if (nlVar != null) {
                nlVar.k(charSequence);
            } else {
                o6 o6Var = this.s;
                if (o6Var != null) {
                    o6Var.setText(charSequence);
                }
            }
        } else {
            this.W = charSequence;
        }
        org.telegram.ui.ActionBar.l lVar = this.u0;
        if (lVar != null) {
            lVar.d(true);
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
    public final /* synthetic */ void B(float f7, int i10) {
    }
}
