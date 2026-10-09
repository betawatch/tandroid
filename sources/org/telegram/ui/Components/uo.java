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
import org.telegram.ui.fg1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class uo extends FrameLayout implements me.d, NotificationCenter.NotificationCenterDelegate {
    public final ImageView E;
    public final a31 F;
    public final org.telegram.ui.zn G;
    public final ox0[] H;
    public final j9 I;
    public final int J;
    public boolean K;
    public int L;
    public int M;
    public ox0 N;
    public int O;
    public int P;
    public AnimatorSet Q;
    public final boolean[] R;
    public final boolean[] S;
    public final boolean T;
    public int U;
    public int V;
    public CharSequence W;
    public final me.b a;
    public int a0;
    public boolean b;
    public Integer b0;
    public Integer c;
    public final tv0 c0;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 d0;
    public final qo e;
    public boolean e0;
    public final boolean f;
    public final q5 f0;
    public final q5 g0;
    public final org.telegram.ui.ml h;
    public final bd h0;
    public final no i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public final AtomicReference n;
    public boolean n0;
    public String o0;
    public String p0;
    public Drawable q0;
    public final org.telegram.ui.ml r;
    public Drawable r0;
    public final r6 s;
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
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02e1, code lost:
    
        if (r0.g4 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fd, code lost:
    
        if (r3.g4 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uo(Context context, org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        int i12;
        hs hsVar = hs.h;
        this.a = new me.b(0, this, hsVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        ox0[] ox0VarArr = new ox0[6];
        this.H = ox0VarArr;
        this.I = new j9((org.telegram.ui.ActionBar.e6) null);
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
        this.h0 = new bd(this);
        this.i0 = new no(this, 2);
        this.m0 = false;
        this.n0 = false;
        this.o0 = null;
        this.p0 = null;
        this.d0 = e6Var;
        boolean z14 = n2Var instanceof org.telegram.ui.zn;
        if (z14) {
            this.G = (org.telegram.ui.zn) n2Var;
        }
        org.telegram.ui.zn znVar = this.G;
        if (znVar == null || (!((i12 = znVar.R3) == 0 || i12 == 8) || UserObject.isReplyUser(znVar.i()) || (this.G.i() != null && this.G.i().id == UserObject.VERIFY))) {
            z11 = 8;
            z12 = false;
        } else {
            z11 = 8;
            z12 = true;
        }
        qo qoVar = new qo(this, context, n2Var, z12, e6Var);
        this.e = qoVar;
        if (z14 || (n2Var instanceof fg1)) {
            org.telegram.ui.zn znVar2 = this.G;
            if (znVar2 == null || ((i10 = znVar2.R3) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(znVar2.f))) {
                this.c0 = new tv0(n2Var);
            }
            org.telegram.ui.zn znVar3 = this.G;
            if (znVar3 != null) {
                if (znVar3.K9()) {
                    org.telegram.ui.zn znVar4 = this.G;
                    if (znVar4.X3 != null) {
                    }
                    z13 = true;
                    this.f = z13;
                    if (z13) {
                        qoVar.setVisibility(8);
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
        qoVar.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        qoVar.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(qoVar);
        if (z12) {
            org.telegram.ui.zn znVar5 = this.G;
            TLRPC.Chat chat = znVar5 != null ? znVar5.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                w7.z5.b(qoVar, 0.05f, 1.2f);
            }
            final int i14 = 0;
            qoVar.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.po
                public final /* synthetic */ uo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            uo uoVar = this.b;
                            if (!uoVar.d()) {
                                uoVar.e(true, false);
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
        org.telegram.ui.ml mlVar = new org.telegram.ui.ml(context, atomicReference);
        this.h = mlVar;
        mlVar.setEllipsizeByGradient(true);
        mlVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var));
        mlVar.setTextSize(18);
        mlVar.setGravity(3);
        mlVar.setTypeface(AndroidUtilities.bold());
        mlVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        mlVar.setCanHideRightDrawable(false);
        mlVar.setRightDrawableOutside(true);
        mlVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(mlVar);
        if (p()) {
            r6 r6Var = new r6(context, true, true, true);
            this.s = r6Var;
            r6Var.b(0.3f, 320L, hsVar);
            r6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.i6.B8;
            r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, e6Var));
            r6Var.setTag(Integer.valueOf(i15));
            r6Var.setTextSize(AndroidUtilities.dp(14.0f));
            r6Var.setGravity(3);
            r6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            r6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(r6Var);
        } else {
            org.telegram.ui.ml mlVar2 = new org.telegram.ui.ml(context, atomicReference2);
            this.r = mlVar2;
            mlVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.i6.B8;
            mlVar2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i16, e6Var));
            mlVar2.setTag(Integer.valueOf(i16));
            mlVar2.setTextSize(14);
            mlVar2.setGravity(3);
            mlVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(mlVar2);
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
            a31 a31Var = new a31(context, e6Var);
            this.F = a31Var;
            imageView2.setImageDrawable(a31Var);
            a31Var.k = true;
            a31Var.b.setColor(0);
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
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s8, e6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.ui.zn znVar6 = this.G;
        if (znVar6 != null && ((i11 = znVar6.R3) == 0 || i11 == 8 || i11 == 3)) {
            if (znVar6.K9()) {
                org.telegram.ui.zn znVar7 = this.G;
                if (!znVar7.h4) {
                }
            }
            if (!UserObject.isReplyUser(this.G.i()) && (this.G.i() == null || this.G.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.po
                    public final /* synthetic */ uo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                uo uoVar = this.b;
                                if (!uoVar.d()) {
                                    uoVar.e(true, false);
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
            ox0VarArr[0] = new n61(true);
            ox0VarArr[1] = new hq(true);
            ox0VarArr[2] = new cq0(true);
            ox0VarArr[3] = new ih0(e6Var, false);
            ox0VarArr[4] = new an0(true);
            ox0VarArr[5] = new hq();
            int i18 = 0;
            while (true) {
                ox0[] ox0VarArr2 = this.H;
                if (i18 >= ox0VarArr2.length) {
                    break;
                }
                ox0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.f0 = new q5(AndroidUtilities.dp(24.0f), this.h);
        this.g0 = new q5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.zn znVar = this.G;
        org.telegram.ui.ml mlVar = this.r;
        if (mlVar == null) {
            return;
        }
        int i10 = 0;
        ox0[] ox0VarArr = this.H;
        if (!z10) {
            this.N = null;
            mlVar.setLeftDrawable((Drawable) null);
            mlVar.g(null, null);
            while (i10 < ox0VarArr.length) {
                ox0 ox0Var = ox0VarArr[i10];
                if (ox0Var != null) {
                    ox0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.J).getPrintingStringType(znVar.a(), znVar.d4).intValue();
            ox0 ox0Var2 = ox0VarArr[intValue];
            if (ox0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.e6 e6Var = this.d0;
            if (intValue == 5) {
                mlVar.g(ox0Var2, "**oo**");
                ox0VarArr[intValue].b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.pa, e6Var));
                mlVar.setLeftDrawable((Drawable) null);
            } else {
                mlVar.g(null, null);
                ox0VarArr[intValue].b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.pa, e6Var));
                mlVar.setLeftDrawable(ox0VarArr[intValue]);
            }
            this.N = ox0VarArr[intValue];
            while (i10 < ox0VarArr.length) {
                ox0 ox0Var3 = ox0VarArr[i10];
                if (ox0Var3 != null) {
                    if (i10 == intValue) {
                        ox0Var3.d();
                    } else {
                        ox0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
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
            long N8 = znVar.N8();
            if (N8 >= 0) {
                user = znVar.getMessagesController().getUser(Long.valueOf(N8));
                chat = null;
            } else {
                chat = znVar.getMessagesController().getChat(Long.valueOf(-N8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.J;
        j9 j9Var = this.I;
        qo qoVar = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    j9Var.p = 1.0f;
                    j9Var.k(i11, chat);
                    if (qoVar != null) {
                        qoVar.setAnimatedEmojiDrawable(null);
                        qoVar.e(chat, j9Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        qoVar.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long d = znVar.d();
            if (!ChatObject.canManageMonoForum(i11, chat) || d == 0) {
                qoVar.setAnimatedEmojiDrawable(null);
                ng.d.o(i11, chat, j9Var, qoVar);
            } else if (d > 0) {
                TLRPC.User user2 = znVar.getMessagesController().getUser(Long.valueOf(d));
                j9Var.r(user2);
                qoVar.setAnimatedEmojiDrawable(null);
                qoVar.e(user2, j9Var);
            } else {
                TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(-d));
                j9Var.q(chat2);
                qoVar.setAnimatedEmojiDrawable(null);
                qoVar.e(chat2, j9Var);
            }
            qoVar.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        j9Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            j9Var.p = 0.8f;
            j9Var.g(12);
            if (qoVar != null) {
                qoVar.setAnimatedEmojiDrawable(null);
                qoVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            j9Var.p = 0.8f;
            j9Var.g(21);
            if (qoVar != null) {
                qoVar.setAnimatedEmojiDrawable(null);
                qoVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && znVar.R3 == 3) {
            j9Var.p = 0.8f;
            j9Var.g(22);
            if (qoVar != null) {
                qoVar.setAnimatedEmojiDrawable(null);
                qoVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            j9Var.p = 1.0f;
            if (qoVar != null) {
                qoVar.setAnimatedEmojiDrawable(null);
                qoVar.a.setForUserOrChat(user, j9Var, null, true, 3, false);
                return;
            }
            return;
        }
        j9Var.p = 0.8f;
        j9Var.g(1);
        if (qoVar != null) {
            qoVar.setAnimatedEmojiDrawable(null);
            qoVar.h(null, null, j9Var, user);
        }
    }

    public final q5 c(long j3) {
        if (j3 == 0) {
            return null;
        }
        q5 q5Var = this.g0;
        q5Var.j(j3, false);
        q5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, this.d0)));
        int dp = AndroidUtilities.dp(1.0f);
        q5Var.I = 0;
        q5Var.J = dp;
        return q5Var;
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
                o(true);
            }
        } else {
            org.telegram.ui.ml mlVar = this.h;
            if (mlVar != null) {
                mlVar.invalidate();
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.i6.Ll);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.i6.Ll);
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
        fh fhVar;
        Drawable drawable;
        TLRPC.User user;
        qo qoVar = this.e;
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
                if (znVar.S8() != 0 && (user = znVar.getMessagesController().getUser(Long.valueOf(znVar.S8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = qoVar.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof f6)) {
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
            tv0 tv0Var = this.c0;
            if (i10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (znVar.R3 == 3) {
                        bundle.putLong("topic_id", znVar.N8());
                    } else if (znVar.h4) {
                        bundle.putLong("topic_id", znVar.X3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, tv0Var);
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
                org.telegram.ui.ActionBar.n2 n2Var = tv0Var.w;
                int[] iArr = tv0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!tv0Var.f && (n2Var == null || tv0Var.r != n2Var.getUserConfig().getClientUserId() || tv0Var.s != 0 || !n2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", znVar.a());
                if (znVar.R3 == 3) {
                    bundle2.putLong("topic_id", znVar.N8());
                }
                db0 db0Var = new db0(bundle2, tv0Var);
                db0Var.c = znVar.Z7;
                znVar.presentFragment(db0Var, z11);
                return;
            }
            if (znVar.R3 == 3) {
                z13 = z12;
                long N8 = znVar.N8();
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
                    bundle2.putLong("dialog_id", znVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", znVar.d());
            }
            org.telegram.ui.ActionBar.q0 q0Var = znVar.K1;
            bundle2.putBoolean("reportSpam", (q0Var == null || (fhVar = znVar.M0) == null || !fhVar.d(q0Var) || znVar.N1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.s8, this.d0));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, tv0Var);
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
        imageReceiver = qoVar.getImageReceiver();
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
        a31 a31Var = this.F;
        if (a31Var == null) {
            return;
        }
        boolean z11 = this.l0;
        if (i10 != 0 || this.T) {
            me.b bVar = this.a;
            if (z11) {
                bVar.a(false, z10);
            } else {
                bVar.a(true, z10);
                a31Var.b(i10);
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

    public tv0 getSharedMediaPreloader() {
        return this.c0;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.ml mlVar = this.r;
        return mlVar != null ? mlVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.ml mlVar = this.r;
        if (mlVar != null) {
            return mlVar;
        }
        r6 r6Var = this.s;
        if (r6Var != null) {
            return r6Var;
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
        org.telegram.ui.ml mlVar = this.h;
        float max = mlVar != null ? Math.max(0.0f, mlVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.ml mlVar2 = this.r;
        if (mlVar2 != null) {
            max = Math.max(max, mlVar2.getExactWidthIncludeDrawables());
        }
        qo qoVar = this.e;
        return (int) (max + ((qoVar == null || qoVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.n0 = false;
        if (z10 || z11) {
            this.n0 = true;
            if (!(this.h.getRightDrawable() instanceof dn0)) {
                dn0 dn0Var = new dn0(!z10 ? 1 : 0);
                dn0Var.b(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B8, this.d0));
                this.h.j(dn0Var);
                this.p0 = LocaleController.getString(R.string.ScamMessage);
                this.m0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.r0 = mutate;
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, this.d0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(w02, mode));
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.s0 = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Ah, this.d0), mode));
            this.h.j(new fr(this.r0, this.s0));
            this.m0 = true;
            this.p0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof dn0) {
            this.h.j(null);
            this.m0 = false;
            this.p0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof r5) && (((r5) this.h.getRightDrawable()).a instanceof s5)) {
                ((s5) ((r5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.f0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.q0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, this.d0), PorterDuff.Mode.MULTIPLY));
                this.f0.g(this.q0, z14);
            } else {
                this.f0.g(null, z14);
            }
            this.f0.k(Integer.valueOf(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.zh, this.d0)));
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
        org.telegram.ui.ml mlVar = this.r;
        mlVar.setTextColor(i11);
        mlVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.ml mlVar = this.h;
        mlVar.setLeftDrawable(drawable);
        if (!this.m0 && !this.n0) {
            if (drawable2 != null) {
                this.p0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.p0 = null;
            }
            mlVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.J;
        j9 j9Var = this.I;
        j9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        qo qoVar = this.e;
        if (isReplyUser) {
            j9Var.g(12);
            j9Var.p = 0.8f;
            if (qoVar != null) {
                qoVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            j9Var.g(21);
            j9Var.p = 0.8f;
            if (qoVar != null) {
                qoVar.h(null, null, j9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            j9Var.p = 1.0f;
            if (qoVar != null) {
                qoVar.e(user, j9Var);
                return;
            }
            return;
        }
        j9Var.g(1);
        j9Var.p = 0.8f;
        if (qoVar != null) {
            qoVar.h(null, null, j9Var, user);
        }
    }

    public final void l() {
        int i10 = this.V;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.e6 e6Var = this.d0;
        r6 r6Var = this.s;
        org.telegram.ui.ml mlVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.W;
            if (charSequence != null) {
                if (mlVar != null) {
                    mlVar.k(charSequence);
                    this.W = null;
                    Integer num = this.b0;
                    if (num != null) {
                        mlVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.a0;
                        if (i11 >= 0) {
                            mlVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
                            mlVar.setTag(Integer.valueOf(this.a0));
                        }
                    }
                } else if (r6Var != null) {
                    r6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.W = null;
                    Integer num2 = this.b0;
                    if (num2 != null) {
                        r6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.a0;
                        if (i12 >= 0) {
                            r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
                            r6Var.setTag(Integer.valueOf(this.a0));
                        }
                    }
                }
            }
        } else if (mlVar != null) {
            if (this.W == null) {
                this.W = mlVar.getText();
            }
            mlVar.k(string);
            Integer num3 = this.b0;
            if (num3 != null) {
                mlVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.i6.B8;
                mlVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
                mlVar.setTag(Integer.valueOf(i13));
            }
        } else if (r6Var != null) {
            if (this.W == null) {
                this.W = r6Var.getText();
            }
            r6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.b0;
            if (num4 != null) {
                r6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.i6.B8;
                r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
                r6Var.setTag(Integer.valueOf(i14));
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

    @Override // me.d
    public final void n(int i10, float f7, float f10, me.e eVar) {
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

    public final void o(boolean z10) {
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
        org.telegram.ui.ActionBar.e6 e6Var = this.d0;
        boolean[] zArr = this.R;
        r6 r6Var = this.s;
        org.telegram.ui.ml mlVar = this.r;
        org.telegram.ui.ml mlVar2 = this.h;
        int i16 = this.J;
        org.telegram.ui.zn znVar = this.G;
        if (znVar == null) {
            return;
        }
        if (znVar.R3 == 6) {
            String str = znVar.P3.link;
            hg.z[] zVarArr = hg.z.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = znVar.i();
        TLRPC.Chat chat = znVar.e;
        boolean z13 = UserObject.isUserSelf(i17) && znVar.R3 == 0 && znVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.t0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z13) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = znVar.R3) != 0 && i10 != 8))) && znVar.R3 != 3) {
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
        boolean z14 = z13;
        if (printingString != null && printingString.length() != 0 && (!ChatObject.isChannel(chat) || chat.megagroup)) {
            if (znVar.K9() && mlVar2.getTag() != null) {
                mlVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.Q;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Q = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Q = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(mlVar2, (Property<org.telegram.ui.ml, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.Q.addListener(new to(this, 1));
                    this.Q.setDuration(180L);
                    this.Q.start();
                } else {
                    mlVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(znVar.a(), znVar.d4);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z12 = true;
        } else {
            if (znVar.K9() && !znVar.h4) {
                if (mlVar2.getTag() != null) {
                    return;
                }
                mlVar2.setTag(1);
                AnimatorSet animatorSet3 = this.Q;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.Q = null;
                }
                if (!z10) {
                    mlVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.Q = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(mlVar2, (Property<org.telegram.ui.ml, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.Q.addListener(new to(this, 0));
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
                        z12 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z12 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, ng.d.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z12 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, znVar.getMessagesController().getSavedMessagesController().getMessagesCount(znVar.N8())), new Object[0]);
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
                                long j3 = i17.id;
                                if (j3 != UserObject.VERIFY) {
                                    if (j3 == UserConfig.getInstance(i16).getClientUserId()) {
                                        charSequence = z14 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                    } else {
                                        long j10 = i17.id;
                                        if (j10 == 333000 || j10 == 777000 || j10 == 42777) {
                                            z11 = false;
                                            charSequence = LocaleController.getString(R.string.ServiceNotifications);
                                        } else if (MessagesController.isSupportUser(i17)) {
                                            charSequence = LocaleController.getString(R.string.SupportStatus);
                                        } else {
                                            boolean z15 = i17.bot;
                                            if (z15 && (i11 = i17.bot_active_users) != 0) {
                                                charSequence = LocaleController.formatPluralStringComma("BotUsers", i11, ',');
                                            } else if (z15) {
                                                charSequence = LocaleController.getString(R.string.Bot);
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
        this.a0 = z12 ? org.telegram.ui.ActionBar.i6.pa : org.telegram.ui.ActionBar.i6.B8;
        if (this.W != null) {
            this.W = charSequence;
        } else if (mlVar != null) {
            mlVar.k(charSequence);
            Integer num = this.b0;
            if (num == null) {
                mlVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(this.a0, e6Var));
                mlVar.setTag(Integer.valueOf(this.a0));
            } else {
                mlVar.setTextColor(num.intValue());
            }
        } else {
            r6Var.c(charSequence, z10, true);
            Integer num2 = this.b0;
            if (num2 == null) {
                r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(this.a0, e6Var));
                r6Var.setTag(Integer.valueOf(this.a0));
            } else {
                r6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.k kVar = this.u0;
        if (kVar != null) {
            kVar.d(z10);
        }
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
        q5 q5Var = this.f0;
        if (q5Var != null) {
            q5Var.a();
        }
        q5 q5Var2 = this.g0;
        if (q5Var2 != null) {
            q5Var2.a();
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
        q5 q5Var = this.f0;
        if (q5Var != null) {
            q5Var.b();
        }
        q5 q5Var2 = this.g0;
        if (q5Var2 != null) {
            q5Var2.b();
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
        org.telegram.ui.ml mlVar = this.r;
        if (mlVar != null) {
            sb2.append(mlVar.getText());
        } else {
            r6 r6Var = this.s;
            if (r6Var != null) {
                sb2.append(r6Var.getText());
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
        qo qoVar = this.e;
        int measuredHeight = (((currentActionBarHeight - qoVar.getMeasuredHeight()) - 2) / 2) + (this.K ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.k0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.L + 1;
        int i15 = measuredHeight + 1;
        qoVar.layout(i14, i15, qoVar.getMeasuredWidth() + i14, qoVar.getMeasuredHeight() + i15);
        int dp2 = this.L + AndroidUtilities.dp(qoVar.getVisibility() == 0 ? this.k0 ? 49.66f : 55.0f : this.k0 ? 13.0f : 1.0f) + this.M;
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.ml mlVar = this.h;
        if (visibility != 8) {
            mlVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - mlVar.getPaddingTop(), mlVar.getMeasuredWidth() + dp2, mlVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (mlVar.getTextHeight() + measuredHeight)) - mlVar.getPaddingTop()));
            if (j5Var != null) {
                j5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, j5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + j5Var.getTextHeight() + measuredHeight);
            }
        } else {
            mlVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - mlVar.getPaddingTop(), mlVar.getMeasuredWidth() + dp2, mlVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (mlVar.getTextHeight() + measuredHeight)) - mlVar.getPaddingTop()));
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
        org.telegram.ui.ml mlVar2 = this.r;
        if (mlVar2 != null) {
            mlVar2.layout(dp2, dp, mlVar2.getMeasuredWidth() + dp2, mlVar2.getTextHeight() + dp);
        } else {
            r6 r6Var = this.s;
            if (r6Var != null) {
                r6Var.layout(dp2, dp, r6Var.getMeasuredWidth() + dp2, r6Var.getTextHeight() + dp);
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
        qo qoVar = this.e;
        int dp = size - AndroidUtilities.dp((qoVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f7 = this.d;
        qoVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.ml mlVar = this.h;
        mlVar.measure(makeMeasureSpec, makeMeasureSpec2);
        r6 r6Var = this.s;
        org.telegram.ui.ml mlVar2 = this.r;
        if (mlVar2 != null) {
            mlVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
        } else if (r6Var != null) {
            r6Var.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
            int i13 = org.telegram.ui.ActionBar.i6.A8;
            org.telegram.ui.ActionBar.e6 e6Var = this.d0;
            j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(i13, e6Var));
            j5Var.setTextSizePx(AndroidUtilities.dp(this.k0 ? 17.5f : 18.0f));
            j5Var.setGravity(3);
            j5Var.setTypeface(AndroidUtilities.bold());
            j5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            j5Var.i(mlVar.getRightDrawable());
            j5Var.j(mlVar.getRightDrawable2());
            j5Var.setRightDrawableOutside(mlVar.getRightDrawableOutside());
            j5Var.setLeftDrawable(mlVar.getLeftDrawable());
            j5Var.l(mlVar.getText(), false);
            ViewPropertyAnimator duration = j5Var.animate().alpha(0.0f).setDuration(350L);
            hs hsVar = hs.h;
            duration.setInterpolator(hsVar).withEndAction(new no(this, 0)).start();
            addView(j5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.j5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(getContext());
            atomicReference2.set(j5Var2);
            int i14 = org.telegram.ui.ActionBar.i6.B8;
            j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
            j5Var2.setTag(Integer.valueOf(i14));
            j5Var2.setTextSizePx(AndroidUtilities.dp(this.k0 ? 13.5f : 14.0f));
            j5Var2.setGravity(3);
            if (mlVar2 != null) {
                j5Var2.l(mlVar2.getText(), false);
            } else if (r6Var != null) {
                j5Var2.l(r6Var.getText(), false);
            }
            j5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(hsVar).withEndAction(new no(this, 1)).start();
            addView(j5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) atomicReference.get();
        if (j5Var3 != null) {
            j5Var3.measure(org.telegram.messenger.bi.c((qoVar.getVisibility() == 0 ? 54 : 0) + 16, this.P, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.O = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        bd bdVar = this.h0;
        no noVar = this.i0;
        if (action == 0 && a()) {
            this.j0 = true;
            bdVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(noVar);
            AndroidUtilities.runOnUIThread(noVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.j0) {
            bdVar.c(false);
            this.j0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(noVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return false;
    }

    public void setActionBar(org.telegram.ui.ActionBar.k kVar) {
        this.u0 = kVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i10 = this.J;
        j9 j9Var = this.I;
        j9Var.k(i10, chat);
        qo qoVar = this.e;
        if (qoVar != null) {
            qoVar.e(chat, j9Var);
            qoVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
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
            org.telegram.ui.ml mlVar = this.r;
            if (mlVar != null) {
                mlVar.k(charSequence);
            } else {
                r6 r6Var = this.s;
                if (r6Var != null) {
                    r6Var.setText(charSequence);
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

    @Override // me.d
    public final /* synthetic */ void A(float f7, int i10) {
    }
}
