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
import org.telegram.ui.ze1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class xn extends FrameLayout implements vd.b, NotificationCenter.NotificationCenterDelegate {
    public final ImageView A;
    public final m11 B;
    public final org.telegram.ui.tn C;
    public final dw0[] D;
    public final e9 E;
    public final int F;
    public boolean G;
    public int H;
    public int I;
    public dw0 J;
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
    public final iu0 V;
    public final org.telegram.ui.ActionBar.c6 W;
    public final vd.a a;
    public boolean a0;
    public boolean b;
    public final n5 b0;
    public Integer c;
    public final n5 c0;
    public final int d;
    public final uc d0;
    public final tn e;
    public final qn e0;
    public final boolean f;
    public boolean f0;
    public boolean g0;
    public final org.telegram.ui.cl h;
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
    public org.telegram.ui.ActionBar.l q0;
    public final org.telegram.ui.cl r;
    public final o6 s;
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
    public xn(Context context, org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        boolean z11;
        int i10;
        int i11;
        int i12;
        jr jrVar = jr.h;
        this.a = new vd.a(0, this, jrVar, 320L, false);
        this.d = 42;
        AtomicReference atomicReference = new AtomicReference();
        this.n = atomicReference;
        AtomicReference atomicReference2 = new AtomicReference();
        this.v = atomicReference2;
        dw0[] dw0VarArr = new dw0[6];
        this.D = dw0VarArr;
        this.E = new e9((org.telegram.ui.ActionBar.c6) null);
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
        this.d0 = new uc(this);
        this.e0 = new qn(this, 2);
        this.i0 = false;
        this.j0 = false;
        this.k0 = null;
        this.l0 = null;
        this.W = c6Var;
        boolean z12 = o2Var instanceof org.telegram.ui.tn;
        if (z12) {
            this.C = (org.telegram.ui.tn) o2Var;
        }
        org.telegram.ui.tn tnVar = this.C;
        boolean z13 = tnVar != null && ((i12 = tnVar.N3) == 0 || i12 == 8) && !UserObject.isReplyUser(tnVar.i()) && (this.C.i() == null || this.C.i().id != UserObject.VERIFY);
        tn tnVar2 = new tn(this, context, o2Var, z13, c6Var);
        this.e = tnVar2;
        if (z12 || (o2Var instanceof ze1)) {
            org.telegram.ui.tn tnVar3 = this.C;
            if (tnVar3 == null || ((i10 = tnVar3.N3) != 5 && i10 != 9 && i10 != 6 && i10 != 8 && !UserObject.isBotForum(tnVar3.f))) {
                this.V = new iu0(o2Var);
            }
            org.telegram.ui.tn tnVar4 = this.C;
            if (tnVar4 != null) {
                if (tnVar4.F9()) {
                    org.telegram.ui.tn tnVar5 = this.C;
                    if (tnVar5.T3 != null) {
                    }
                    z11 = true;
                    this.f = z11;
                    if (z11) {
                        tnVar2.setVisibility(8);
                    }
                }
                int i13 = this.C.N3;
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
        tnVar2.setContentDescription(LocaleController.getString(R.string.AccDescrProfilePicture));
        tnVar2.setRoundRadius(AndroidUtilities.dp(21.0f));
        addView(tnVar2);
        if (z13) {
            org.telegram.ui.tn tnVar6 = this.C;
            TLRPC.Chat chat = tnVar6 != null ? tnVar6.e : null;
            if (chat != null && chat.linked_community_id != 0) {
                i7.h6.b(tnVar2, 0.05f, 1.2f);
            }
            final int i14 = 0;
            tnVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sn
                public final /* synthetic */ xn b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            xn xnVar = this.b;
                            if (!xnVar.d()) {
                                xnVar.e(true, false);
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
        org.telegram.ui.cl clVar = new org.telegram.ui.cl(context, atomicReference);
        this.h = clVar;
        clVar.setEllipsizeByGradient(true);
        clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A8, c6Var));
        clVar.setTextSize(18);
        clVar.setGravity(3);
        clVar.setTypeface(AndroidUtilities.bold());
        clVar.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
        clVar.setCanHideRightDrawable(false);
        clVar.setRightDrawableOutside(true);
        clVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(12.0f));
        addView(clVar);
        if (o()) {
            o6 o6Var = new o6(context, true, true, true);
            this.s = o6Var;
            o6Var.b(0.3f, 320L, jrVar);
            o6Var.setEllipsizeByGradient(true);
            int i15 = org.telegram.ui.ActionBar.g6.B8;
            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
            o6Var.setTag(Integer.valueOf(i15));
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
            o6Var.setGravity(3);
            o6Var.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            o6Var.setTranslationY(-AndroidUtilities.dp(1.0f));
            addView(o6Var);
        } else {
            org.telegram.ui.cl clVar2 = new org.telegram.ui.cl(context, atomicReference2);
            this.r = clVar2;
            clVar2.setEllipsizeByGradient(true);
            int i16 = org.telegram.ui.ActionBar.g6.B8;
            clVar2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
            clVar2.setTag(Integer.valueOf(i16));
            clVar2.setTextSize(14);
            clVar2.setGravity(3);
            clVar2.setPadding(0, 0, AndroidUtilities.dp(10.0f), 0);
            addView(clVar2);
        }
        if (this.C != null) {
            ImageView imageView = new ImageView(context);
            this.x = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setVisibility(8);
            imageView.setImageDrawable(new qh.a());
            addView(imageView);
            ImageView imageView2 = new ImageView(context);
            this.w = imageView2;
            imageView2.setScaleType(scaleType);
            imageView2.setVisibility(8);
            m11 m11Var = new m11(context, c6Var);
            this.B = m11Var;
            imageView2.setImageDrawable(m11Var);
            m11Var.k = true;
            m11Var.b.setColor(0);
            addView(imageView2);
            this.P = z10;
            imageView2.setOnClickListener(new t2(12, this, c6Var));
            if (z10) {
                imageView2.setContentDescription(LocaleController.getString(R.string.SetTimer));
            } else {
                imageView2.setContentDescription(LocaleController.getString(R.string.AccAutoDeleteTimer));
            }
            ImageView imageView3 = new ImageView(context);
            this.y = imageView3;
            imageView3.setImageResource(R.drawable.star_small_outline);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, c6Var), PorterDuff.Mode.SRC_IN));
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
        org.telegram.ui.tn tnVar7 = this.C;
        if (tnVar7 != null && ((i11 = tnVar7.N3) == 0 || i11 == 8 || i11 == 3)) {
            if (tnVar7.F9()) {
                org.telegram.ui.tn tnVar8 = this.C;
                if (!tnVar8.d4) {
                }
            }
            if (!UserObject.isReplyUser(this.C.i()) && (this.C.i() == null || this.C.i().id != UserObject.VERIFY)) {
                final int i17 = 1;
                setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.sn
                    public final /* synthetic */ xn b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i17) {
                            case 0:
                                xn xnVar = this.b;
                                if (!xnVar.d()) {
                                    xnVar.e(true, false);
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
            dw0VarArr[0] = new u41(true);
            dw0VarArr[1] = new lp(true);
            dw0VarArr[2] = new ro0(true);
            dw0VarArr[3] = new dg0(c6Var, false);
            dw0VarArr[4] = new tl0(true);
            dw0VarArr[5] = new lp();
            int i18 = 0;
            while (true) {
                dw0[] dw0VarArr2 = this.D;
                if (i18 >= dw0VarArr2.length) {
                    break;
                }
                dw0VarArr2[i18].c(chat2 != null);
                i18++;
            }
        }
        this.b0 = new n5(AndroidUtilities.dp(24.0f), this.h);
        this.c0 = new n5(AndroidUtilities.dp(17.0f), this.h);
    }

    private void setTypingAnimation(boolean z10) {
        org.telegram.ui.tn tnVar = this.C;
        org.telegram.ui.cl clVar = this.r;
        if (clVar == null) {
            return;
        }
        int i10 = 0;
        dw0[] dw0VarArr = this.D;
        if (!z10) {
            this.J = null;
            clVar.setLeftDrawable((Drawable) null);
            clVar.g(null, null);
            while (i10 < dw0VarArr.length) {
                dw0 dw0Var = dw0VarArr[i10];
                if (dw0Var != null) {
                    dw0Var.e();
                }
                i10++;
            }
            return;
        }
        try {
            int intValue = MessagesController.getInstance(this.F).getPrintingStringType(tnVar.a(), tnVar.Z3).intValue();
            dw0 dw0Var2 = dw0VarArr[intValue];
            if (dw0Var2 == null) {
                return;
            }
            org.telegram.ui.ActionBar.c6 c6Var = this.W;
            if (intValue == 5) {
                clVar.g(dw0Var2, "**oo**");
                dw0VarArr[intValue].b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pa, c6Var));
                clVar.setLeftDrawable((Drawable) null);
            } else {
                clVar.g(null, null);
                dw0VarArr[intValue].b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.pa, c6Var));
                clVar.setLeftDrawable(dw0VarArr[intValue]);
            }
            this.J = dw0VarArr[intValue];
            while (i10 < dw0VarArr.length) {
                dw0 dw0Var3 = dw0VarArr[i10];
                if (dw0Var3 != null) {
                    if (i10 == intValue) {
                        dw0Var3.d();
                    } else {
                        dw0Var3.e();
                    }
                }
                i10++;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // vd.b
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        ImageView imageView;
        if (i10 != 0 || (imageView = this.w) == null) {
            return;
        }
        imageView.setAlpha(f9);
        float f11 = 0.85f * f9;
        imageView.setScaleX(f11);
        imageView.setScaleY(f11);
        imageView.setVisibility(f9 > 0.0f ? 0 : 8);
    }

    public boolean a() {
        return false;
    }

    public final void b() {
        TLRPC.User user;
        int dp;
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar == null) {
            return;
        }
        TLRPC.User i10 = tnVar.i();
        TLRPC.Chat chat = tnVar.e;
        if (tnVar.N3 == 3) {
            long I8 = tnVar.I8();
            if (I8 >= 0) {
                user = tnVar.getMessagesController().getUser(Long.valueOf(I8));
                chat = null;
            } else {
                chat = tnVar.getMessagesController().getChat(Long.valueOf(-I8));
                user = null;
            }
        } else {
            user = i10;
        }
        int i11 = this.F;
        e9 e9Var = this.E;
        tn tnVar2 = this.e;
        if (user == null) {
            if (!ChatObject.isMonoForum(chat)) {
                if (chat != null) {
                    e9Var.p = 1.0f;
                    e9Var.k(i11, chat);
                    if (tnVar2 != null) {
                        tnVar2.setAnimatedEmojiDrawable(null);
                        tnVar2.e(chat, e9Var);
                        if (chat.forum) {
                            dp = AndroidUtilities.dp(ChatObject.hasStories(chat) ? 11.0f : 16.0f);
                        } else {
                            dp = AndroidUtilities.dp(21.0f);
                        }
                        tnVar2.setRoundRadius(dp);
                        return;
                    }
                    return;
                }
                return;
            }
            long b10 = tnVar.b();
            if (!ChatObject.canManageMonoForum(i11, chat) || b10 == 0) {
                tnVar2.setAnimatedEmojiDrawable(null);
                yf.d.o(i11, chat, e9Var, tnVar2);
            } else if (b10 > 0) {
                TLRPC.User user2 = tnVar.getMessagesController().getUser(Long.valueOf(b10));
                e9Var.r(user2);
                tnVar2.setAnimatedEmojiDrawable(null);
                tnVar2.e(user2, e9Var);
            } else {
                TLRPC.Chat chat2 = tnVar.getMessagesController().getChat(Long.valueOf(-b10));
                e9Var.q(chat2);
                tnVar2.setAnimatedEmojiDrawable(null);
                tnVar2.e(chat2, e9Var);
            }
            tnVar2.setRoundRadius(AndroidUtilities.dp(21.0f));
            return;
        }
        e9Var.m(i11, user);
        if (UserObject.isReplyUser(user)) {
            e9Var.p = 0.8f;
            e9Var.g(12);
            if (tnVar2 != null) {
                tnVar2.setAnimatedEmojiDrawable(null);
                tnVar2.h(null, null, e9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            e9Var.p = 0.8f;
            e9Var.g(21);
            if (tnVar2 != null) {
                tnVar2.setAnimatedEmojiDrawable(null);
                tnVar2.h(null, null, e9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isUserSelf(user) && tnVar.N3 == 3) {
            e9Var.p = 0.8f;
            e9Var.g(22);
            if (tnVar2 != null) {
                tnVar2.setAnimatedEmojiDrawable(null);
                tnVar2.h(null, null, e9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user)) {
            e9Var.p = 1.0f;
            if (tnVar2 != null) {
                tnVar2.setAnimatedEmojiDrawable(null);
                tnVar2.a.setForUserOrChat(user, e9Var, null, true, 3, false);
                return;
            }
            return;
        }
        e9Var.p = 0.8f;
        e9Var.g(1);
        if (tnVar2 != null) {
            tnVar2.setAnimatedEmojiDrawable(null);
            tnVar2.h(null, null, e9Var, user);
        }
    }

    public final n5 c(long j10) {
        if (j10 == 0) {
            return null;
        }
        n5 n5Var = this.c0;
        n5Var.j(j10, false);
        n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W)));
        int dp = AndroidUtilities.dp(1.0f);
        n5Var.E = 0;
        n5Var.F = dp;
        return n5Var;
    }

    public boolean d() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(this.F).getConnectionState();
            if (this.R != connectionState) {
                this.R = connectionState;
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
            org.telegram.ui.cl clVar = this.h;
            if (clVar != null) {
                clVar.invalidate();
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
        canvas.scale(a2, a2, getPivotX(), getHeight() - (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() / 2.0f));
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
                    canvas.drawCircle((imageView.getWidth() / 2.0f) + imageView.getX(), ((imageView.getHeight() / 2.0f) + imageView.getY()) - AndroidUtilities.dpf2(0.33f), imageView.getScaleX() * AndroidUtilities.dpf2(12.0f), org.telegram.ui.ActionBar.g6.Il);
                }
                if (z10) {
                    canvas.drawCircle((imageView2.getWidth() / 2.0f) + imageView2.getX(), (imageView2.getHeight() / 2.0f) + imageView2.getY(), imageView2.getScaleX() * AndroidUtilities.dpf2(7.66f), org.telegram.ui.ActionBar.g6.Il);
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
        org.telegram.ui.tn tnVar;
        TLRPC.Chat chat;
        ImageReceiver imageReceiver;
        String imageKey;
        ImageLoader imageLoader;
        boolean z13;
        vg vgVar;
        Drawable drawable;
        TLRPC.User user;
        tn tnVar2 = this.e;
        if (z10) {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y) {
                }
            }
            z12 = false;
            tnVar = this.C;
            TLRPC.User i10 = tnVar.i();
            chat = tnVar.e;
            boolean z14 = chat == null && chat.monoforum;
            if (chat != null && chat.monoforum) {
                chat = tnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat != null) {
                    return;
                }
                if (tnVar.N8() != 0 && (user = tnVar.getMessagesController().getUser(Long.valueOf(tnVar.N8()))) != null) {
                    chat = null;
                    i10 = user;
                }
            }
            imageReceiver = tnVar2.getImageReceiver();
            imageKey = imageReceiver.getImageKey();
            imageLoader = ImageLoader.getInstance();
            if (imageKey != null && !imageLoader.isInMemCache(imageKey, false)) {
                drawable = imageReceiver.getDrawable();
                if ((drawable instanceof BitmapDrawable) && !(drawable instanceof c6)) {
                    imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
                }
            }
            if (!tnVar.c4) {
                if (chat == null) {
                    return;
                }
                tnVar.presentFragment(ProfileActivity.m4(-chat.id), z11);
                return;
            }
            iu0 iu0Var = this.V;
            if (i10 == null) {
                boolean z15 = z12;
                if (chat != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", chat.id);
                    if (tnVar.N3 == 3) {
                        bundle.putLong("topic_id", tnVar.I8());
                    } else if (tnVar.d4) {
                        bundle.putLong("topic_id", tnVar.T3.getId());
                    }
                    ProfileActivity profileActivity = new ProfileActivity(bundle, iu0Var);
                    if (!z14) {
                        profileActivity.K4(tnVar.V7);
                    }
                    profileActivity.N4(z15 ? 2 : 1);
                    tnVar.presentFragment(profileActivity, z11);
                    return;
                }
                return;
            }
            if (i10.id == UserObject.VERIFY) {
                return;
            }
            Bundle bundle2 = new Bundle();
            if (UserObject.isUserSelf(i10)) {
                org.telegram.ui.ActionBar.o2 o2Var = iu0Var.w;
                int[] iArr = iu0Var.c;
                int i11 = 0;
                while (true) {
                    if (i11 < iArr.length) {
                        if (iArr[i11] > 0) {
                            break;
                        } else {
                            i11++;
                        }
                    } else if (!iu0Var.f && (o2Var == null || iu0Var.r != o2Var.getUserConfig().getClientUserId() || iu0Var.s != 0 || !o2Var.getMessagesController().getSavedMessagesController().hasDialogs())) {
                        return;
                    }
                }
                bundle2.putLong("dialog_id", tnVar.a());
                if (tnVar.N3 == 3) {
                    bundle2.putLong("topic_id", tnVar.I8());
                }
                y90 y90Var = new y90(bundle2, iu0Var);
                y90Var.c = tnVar.V7;
                tnVar.presentFragment(y90Var, z11);
                return;
            }
            if (tnVar.N3 == 3) {
                z13 = z12;
                long I8 = tnVar.I8();
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
                    bundle2.putLong("dialog_id", tnVar.a());
                }
            }
            if (UserObject.isBotForum(i10)) {
                bundle2.putLong("topic_id", tnVar.b());
            }
            org.telegram.ui.ActionBar.r0 r0Var = tnVar.G1;
            bundle2.putBoolean("reportSpam", (r0Var == null || (vgVar = tnVar.I0) == null || !vgVar.d(r0Var) || tnVar.J1.getVisibility() == 8) ? false : true);
            bundle2.putInt("actionBarColor", org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.s8, this.W));
            ProfileActivity profileActivity2 = new ProfileActivity(bundle2, iu0Var);
            if (!z14) {
                profileActivity2.O4(tnVar.W7, tnVar.X7, tnVar.Y7);
            }
            profileActivity2.N4(z13 ? 2 : 1);
            tnVar.presentFragment(profileActivity2, z11);
            return;
        }
        z12 = z10;
        tnVar = this.C;
        TLRPC.User i102 = tnVar.i();
        chat = tnVar.e;
        if (chat == null) {
        }
        if (chat != null) {
            chat = tnVar.getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat != null) {
            }
        }
        imageReceiver = tnVar2.getImageReceiver();
        imageKey = imageReceiver.getImageKey();
        imageLoader = ImageLoader.getInstance();
        if (imageKey != null) {
            drawable = imageReceiver.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                imageLoader.putImageToCache((BitmapDrawable) drawable, imageKey, false);
            }
        }
        if (!tnVar.c4) {
        }
    }

    public final void g(int i10, boolean z10) {
        m11 m11Var = this.B;
        if (m11Var == null) {
            return;
        }
        boolean z11 = this.h0;
        if (i10 != 0 || this.P) {
            vd.a aVar = this.a;
            if (z11) {
                aVar.a(false, z10);
            } else {
                aVar.a(true, z10);
                m11Var.b(i10);
            }
        }
    }

    public t9 getAvatarImageView() {
        return this.e;
    }

    public int getLastSubtitleColorKey() {
        return this.T;
    }

    public int getLeftPadding() {
        return this.H;
    }

    public iu0 getSharedMediaPreloader() {
        return this.V;
    }

    public TextPaint getSubtitlePaint() {
        org.telegram.ui.cl clVar = this.r;
        return clVar != null ? clVar.getTextPaint() : this.s.getPaint();
    }

    public View getSubtitleTextView() {
        org.telegram.ui.cl clVar = this.r;
        if (clVar != null) {
            return clVar;
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

    public org.telegram.ui.ActionBar.h5 getTitleTextView() {
        return this.h;
    }

    public int getVisualWidth() {
        org.telegram.ui.cl clVar = this.h;
        float max = clVar != null ? Math.max(0.0f, clVar.getExactWidthIncludeDrawables()) : 0.0f;
        org.telegram.ui.cl clVar2 = this.r;
        if (clVar2 != null) {
            max = Math.max(max, clVar2.getExactWidthIncludeDrawables());
        }
        tn tnVar = this.e;
        return (int) (max + ((tnVar == null || tnVar.getVisibility() != 0) ? AndroidUtilities.dp(34.0f) : AndroidUtilities.dp(70.0f)));
    }

    public final void h(CharSequence charSequence, boolean z10, boolean z11, boolean z12, boolean z13, TLRPC.EmojiStatus emojiStatus, boolean z14) {
        if (charSequence != null) {
            charSequence = Emoji.replaceEmoji(charSequence, this.h.getPaint().getFontMetricsInt(), false);
        }
        this.h.k(charSequence);
        this.j0 = false;
        if (z10 || z11) {
            this.j0 = true;
            if (!(this.h.getRightDrawable() instanceof vl0)) {
                vl0 vl0Var = new vl0(!z10 ? 1 : 0);
                vl0Var.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.B8, this.W));
                this.h.j(vl0Var);
                this.l0 = LocaleController.getString(R.string.ScamMessage);
                this.i0 = true;
            }
        } else if (z12) {
            Drawable mutate = getResources().getDrawable(R.drawable.verified_area).mutate();
            this.n0 = mutate;
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            mutate.setColorFilter(new PorterDuffColorFilter(v02, mode));
            Drawable mutate2 = getResources().getDrawable(R.drawable.verified_check).mutate();
            this.o0 = mutate2;
            mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ah, this.W), mode));
            this.h.j(new jq(this.n0, this.o0));
            this.i0 = true;
            this.l0 = LocaleController.getString(R.string.AccDescrVerified);
        } else if (this.h.getRightDrawable() instanceof vl0) {
            this.h.j(null);
            this.i0 = false;
            this.l0 = null;
        }
        if (z13 || DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
            if ((this.h.getRightDrawable() instanceof o5) && (((o5) this.h.getRightDrawable()).a instanceof p5)) {
                ((p5) ((o5) this.h.getRightDrawable()).a).o(this.h);
            }
            if (DialogObject.getEmojiStatusDocumentId(emojiStatus) != 0) {
                this.b0.j(DialogObject.getEmojiStatusDocumentId(emojiStatus), z14);
            } else if (z13) {
                Drawable mutate3 = ApplicationLoader.applicationContext.getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.m0 = mutate3;
                mutate3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W), PorterDuff.Mode.MULTIPLY));
                this.b0.g(this.m0, z14);
            } else {
                this.b0.g(null, z14);
            }
            this.b0.k(Integer.valueOf(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.zh, this.W)));
            this.h.i(this.b0);
            this.i0 = false;
            this.k0 = LocaleController.getString(R.string.AccDescrPremium);
        } else {
            this.h.i(null);
            this.k0 = null;
        }
        org.telegram.ui.ActionBar.l lVar = this.q0;
        if (lVar != null) {
            lVar.d(z14);
        }
    }

    public final void i(int i10, int i11) {
        this.h.setTextColor(i10);
        org.telegram.ui.cl clVar = this.r;
        clVar.setTextColor(i11);
        clVar.setTag(Integer.valueOf(i11));
    }

    public final void j(Drawable drawable, Drawable drawable2) {
        org.telegram.ui.cl clVar = this.h;
        clVar.setLeftDrawable(drawable);
        if (!this.i0 && !this.j0) {
            if (drawable2 != null) {
                this.l0 = LocaleController.getString(R.string.NotificationsMuted);
            } else {
                this.l0 = null;
            }
            clVar.j(drawable2);
        }
        org.telegram.ui.ActionBar.l lVar = this.q0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void k(TLRPC.User user, boolean z10) {
        int i10 = this.F;
        e9 e9Var = this.E;
        e9Var.m(i10, user);
        boolean isReplyUser = UserObject.isReplyUser(user);
        tn tnVar = this.e;
        if (isReplyUser) {
            e9Var.g(12);
            e9Var.p = 0.8f;
            if (tnVar != null) {
                tnVar.h(null, null, e9Var, user);
                return;
            }
            return;
        }
        if (UserObject.isAnonymous(user)) {
            e9Var.g(21);
            e9Var.p = 0.8f;
            if (tnVar != null) {
                tnVar.h(null, null, e9Var, user);
                return;
            }
            return;
        }
        if (!UserObject.isUserSelf(user) || z10) {
            e9Var.p = 1.0f;
            if (tnVar != null) {
                tnVar.e(user, e9Var);
                return;
            }
            return;
        }
        e9Var.g(1);
        e9Var.p = 0.8f;
        if (tnVar != null) {
            tnVar.h(null, null, e9Var, user);
        }
    }

    public final void l() {
        int i10 = this.R;
        String string = i10 == 2 ? LocaleController.getString(R.string.WaitingForNetwork) : i10 == 1 ? LocaleController.getString(R.string.Connecting) : i10 == 5 ? LocaleController.getString(R.string.Updating) : i10 == 4 ? LocaleController.getString(R.string.ConnectingToProxy) : null;
        org.telegram.ui.ActionBar.c6 c6Var = this.W;
        o6 o6Var = this.s;
        org.telegram.ui.cl clVar = this.r;
        if (string == null) {
            CharSequence charSequence = this.S;
            if (charSequence != null) {
                if (clVar != null) {
                    clVar.k(charSequence);
                    this.S = null;
                    Integer num = this.U;
                    if (num != null) {
                        clVar.setTextColor(num.intValue());
                    } else {
                        int i11 = this.T;
                        if (i11 >= 0) {
                            clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
                            clVar.setTag(Integer.valueOf(this.T));
                        }
                    }
                } else if (o6Var != null) {
                    o6Var.c(charSequence, !LocaleController.isRTL, true);
                    this.S = null;
                    Integer num2 = this.U;
                    if (num2 != null) {
                        o6Var.setTextColor(num2.intValue());
                    } else {
                        int i12 = this.T;
                        if (i12 >= 0) {
                            o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
                            o6Var.setTag(Integer.valueOf(this.T));
                        }
                    }
                }
            }
        } else if (clVar != null) {
            if (this.S == null) {
                this.S = clVar.getText();
            }
            clVar.k(string);
            Integer num3 = this.U;
            if (num3 != null) {
                clVar.setTextColor(num3.intValue());
            } else {
                int i13 = org.telegram.ui.ActionBar.g6.B8;
                clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
                clVar.setTag(Integer.valueOf(i13));
            }
        } else if (o6Var != null) {
            if (this.S == null) {
                this.S = o6Var.getText();
            }
            o6Var.c(string, !LocaleController.isRTL, true);
            Integer num4 = this.U;
            if (num4 != null) {
                o6Var.setTextColor(num4.intValue());
            } else {
                int i14 = org.telegram.ui.ActionBar.g6.B8;
                o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
                o6Var.setTag(Integer.valueOf(i14));
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.q0;
        if (lVar != null) {
            lVar.d(true);
        }
    }

    public final void m() {
        TLRPC.UserStatus userStatus;
        boolean z10;
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar == null) {
            return;
        }
        this.Q = 0;
        TLRPC.ChatFull chatFull = tnVar.V7;
        if (chatFull == null) {
            return;
        }
        int i10 = this.F;
        int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        if (!(chatFull instanceof TLRPC.TL_chatFull) && (!((z10 = chatFull instanceof TLRPC.TL_channelFull)) || chatFull.participants_count > 200 || chatFull.participants == null)) {
            if (!z10 || chatFull.participants_count <= 200) {
                return;
            }
            this.Q = chatFull.online_count;
            return;
        }
        for (int i11 = 0; i11 < chatFull.participants.participants.size(); i11++) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(chatFull.participants.participants.get(i11).user_id));
            if (user != null && (userStatus = user.status) != null && ((userStatus.expires > currentTime || user.id == UserConfig.getInstance(i10).getClientUserId()) && user.status.expires > 10000)) {
                this.Q++;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.W;
        boolean[] zArr = this.N;
        o6 o6Var = this.s;
        org.telegram.ui.cl clVar = this.r;
        org.telegram.ui.cl clVar2 = this.h;
        int i16 = this.F;
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar == null) {
            return;
        }
        if (tnVar.N3 == 6) {
            String str = tnVar.L3.link;
            sf.u[] uVarArr = sf.u.e;
            if (str.startsWith("https://")) {
                str = str.substring(8);
            }
            setSubtitle(str);
            return;
        }
        TLRPC.User i17 = tnVar.i();
        TLRPC.Chat chat = tnVar.e;
        boolean z12 = UserObject.isUserSelf(i17) && tnVar.N3 == 0 && tnVar.getMessagesController().getSavedMessagesController().getAllCount() >= 3 && (this.p0 || MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", 0) < 3);
        if (((UserObject.isUserSelf(i17) && !z12) || UserObject.isReplyUser(i17) || ((i17 != null && i17.id == UserObject.VERIFY) || ((i10 = tnVar.N3) != 0 && i10 != 8))) && tnVar.N3 != 3) {
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
            if (!this.p0) {
                MessagesController.getGlobalMainSettings().edit().putInt("savedmsgschatshint", MessagesController.getGlobalMainSettings().getInt("savedmsgschatshint", i15) + 1).apply();
                this.p0 = true;
            }
        }
        CharSequence printingString = MessagesController.getInstance(i16).getPrintingString(tnVar.a(), tnVar.Z3, false);
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
            if (tnVar.F9() && clVar2.getTag() != null) {
                clVar2.setTag(null);
                getSubtitleTextView().setVisibility(0);
                AnimatorSet animatorSet = this.M;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.M = null;
                }
                if (z10) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M = animatorSet2;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(clVar2, (Property<org.telegram.ui.cl, Float>) property2, 0.0f), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 1.0f));
                    this.M.addListener(new wn(this, 1));
                    this.M.setDuration(180L);
                    this.M.start();
                } else {
                    clVar2.setTranslationY(0.0f);
                    getSubtitleTextView().setAlpha(1.0f);
                }
            }
            Integer printingStringType = MessagesController.getInstance(i16).getPrintingStringType(tnVar.a(), tnVar.Z3);
            charSequence = (printingStringType == null || printingStringType.intValue() != 5) ? printingString : Emoji.replaceEmoji(printingString, getSubtitlePaint().getFontMetricsInt(), false);
            setTypingAnimation(true);
            z11 = true;
        } else {
            if (tnVar.F9() && !tnVar.d4) {
                if (clVar2.getTag() != null) {
                    return;
                }
                clVar2.setTag(1);
                AnimatorSet animatorSet3 = this.M;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                    this.M = null;
                }
                if (!z10) {
                    clVar2.setTranslationY(AndroidUtilities.dp(9.7f));
                    getSubtitleTextView().setAlpha(0.0f);
                    getSubtitleTextView().setVisibility(4);
                    return;
                } else {
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.M = animatorSet4;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(clVar2, (Property<org.telegram.ui.cl, Float>) property2, AndroidUtilities.dp(9.7f)), ObjectAnimator.ofFloat(getSubtitleTextView(), (Property<View, Float>) property, 0.0f));
                    this.M.addListener(new wn(this, 0));
                    this.M.setDuration(180L);
                    this.M.start();
                    return;
                }
            }
            setTypingAnimation(false);
            int i18 = tnVar.N3;
            if (i18 == 8) {
                if (tnVar.P3) {
                    charSequence = LocaleController.getString(R.string.ChatMessageSuggestions);
                } else if (tnVar.b() == 0) {
                    int topicsCount = tnVar.getMessagesController().getTopicsController().getTopicsCount(-tnVar.a());
                    charSequence = topicsCount > 0 ? LocaleController.formatPluralStringComma("Chats", topicsCount) : LocaleController.getString(R.string.ChatMessageSuggestions);
                } else {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, tnVar.b());
                    int i19 = findTopic != null ? findTopic.totalMessagesCount : 0;
                    if (i19 > 0) {
                        z11 = false;
                        formatString = LocaleController.formatPluralString("messages", i19, Integer.valueOf(i19));
                    } else {
                        z11 = false;
                        formatString = LocaleController.formatString(R.string.TopicProfileStatus, yf.d.i(chat, i16, false));
                    }
                    charSequence = formatString;
                }
                z11 = false;
            } else {
                if (i18 == 3) {
                    charSequence = LocaleController.formatPluralString("SavedMessagesCount", Math.max(1, tnVar.getMessagesController().getSavedMessagesController().getMessagesCount(tnVar.I8())), new Object[0]);
                } else {
                    if (tnVar.d4 && chat != null) {
                        TLRPC.TL_forumTopic findTopic2 = MessagesController.getInstance(i16).getTopicsController().findTopic(chat.id, tnVar.b());
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
                        TLRPC.ChatFull chatFull = tnVar.V7;
                        int i21 = this.Q;
                        if (ChatObject.isChannel(chat)) {
                            if (chatFull == null || (i12 = chatFull.participants_count) == 0) {
                                formatPluralString = chat.megagroup ? chatFull == null ? LocaleController.getString(R.string.Loading).toLowerCase() : chat.has_geo ? LocaleController.getString(R.string.MegaLocation).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase() : ChatObject.isPublic(chat) ? LocaleController.getString(R.string.ChannelPublic).toLowerCase() : LocaleController.getString(R.string.ChannelPrivate).toLowerCase();
                            } else if (chat.megagroup) {
                                formatPluralString = i21 > 1 ? a4.w.y(LocaleController.formatPluralString("Members", i12, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", Math.min(i21, chatFull.participants_count), new Object[0])) : LocaleController.formatPluralString("Members", i12, new Object[0]);
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
                            formatPluralString = (i21 <= 1 || i23 == 0) ? LocaleController.formatPluralString("Members", i23, new Object[0]) : a4.w.y(LocaleController.formatPluralString("Members", i23, new Object[0]), ", ", LocaleController.formatPluralString("OnlineCount", i21, new Object[0]));
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
                                    charSequence = z13 ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.SavedMessagesViewAsChatsHint), false) : LocaleController.getString(R.string.ChatYourSelf);
                                } else {
                                    long j11 = i17.id;
                                    if (j11 == 333000 || j11 == 777000 || j11 == 42777) {
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
                                            charSequence = LocaleController.formatUserStatus(i16, i17, zArr, this.a0 ? this.O : null);
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
        this.T = z11 ? org.telegram.ui.ActionBar.g6.pa : org.telegram.ui.ActionBar.g6.B8;
        if (this.S != null) {
            this.S = charSequence;
        } else if (clVar != null) {
            clVar.k(charSequence);
            Integer num = this.U;
            if (num == null) {
                clVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
                clVar.setTag(Integer.valueOf(this.T));
            } else {
                clVar.setTextColor(num.intValue());
            }
        } else {
            o6Var.c(charSequence, z10, true);
            Integer num2 = this.U;
            if (num2 == null) {
                o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(this.T, c6Var));
                o6Var.setTag(Integer.valueOf(this.T));
            } else {
                o6Var.setTextColor(num2.intValue());
            }
        }
        org.telegram.ui.ActionBar.l lVar = this.q0;
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
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            int i10 = this.F;
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (tnVar.N3 == 3) {
                NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
            this.R = ConnectionsManager.getInstance(i10).getConnectionState();
            l();
        }
        n5 n5Var = this.b0;
        if (n5Var != null) {
            n5Var.a();
        }
        n5 n5Var2 = this.c0;
        if (n5Var2 != null) {
            n5Var2.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.tn tnVar = this.C;
        if (tnVar != null) {
            int i10 = this.F;
            NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateConnectionState);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (tnVar.N3 == 3) {
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedMessagesDialogsUpdate);
            }
        }
        n5 n5Var = this.b0;
        if (n5Var != null) {
            n5Var.b();
        }
        n5 n5Var2 = this.c0;
        if (n5Var2 != null) {
            n5Var2.b();
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
        org.telegram.ui.cl clVar = this.r;
        if (clVar != null) {
            sb2.append(clVar.getText());
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
        tn tnVar = this.e;
        int measuredHeight = (((currentActionBarHeight - tnVar.getMeasuredHeight()) - 2) / 2) + (this.G ? AndroidUtilities.statusBarHeight : 0);
        int dp = AndroidUtilities.dp(this.g0 ? 23.66f : 24.0f) + measuredHeight;
        int i14 = this.H + 1;
        int i15 = measuredHeight + 1;
        tnVar.layout(i14, i15, tnVar.getMeasuredWidth() + i14, tnVar.getMeasuredHeight() + i15);
        int dp2 = this.H + AndroidUtilities.dp(tnVar.getVisibility() == 0 ? this.g0 ? 49.66f : 55.0f : this.g0 ? 13.0f : 1.0f) + this.I;
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) this.n.get();
        int visibility = getSubtitleTextView().getVisibility();
        org.telegram.ui.cl clVar = this.h;
        if (visibility != 8) {
            clVar.layout(dp2, (AndroidUtilities.dp(1.66f) + measuredHeight) - clVar.getPaddingTop(), clVar.getMeasuredWidth() + dp2, clVar.getPaddingBottom() + ((AndroidUtilities.dp(1.66f) + (clVar.getTextHeight() + measuredHeight)) - clVar.getPaddingTop()));
            if (h5Var != null) {
                h5Var.layout(dp2, AndroidUtilities.dp(1.66f) + measuredHeight, h5Var.getMeasuredWidth() + dp2, AndroidUtilities.dp(1.66f) + h5Var.getTextHeight() + measuredHeight);
            }
        } else {
            clVar.layout(dp2, (AndroidUtilities.dp(11.0f) + measuredHeight) - clVar.getPaddingTop(), clVar.getMeasuredWidth() + dp2, clVar.getPaddingBottom() + ((AndroidUtilities.dp(11.0f) + (clVar.getTextHeight() + measuredHeight)) - clVar.getPaddingTop()));
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
        org.telegram.ui.cl clVar2 = this.r;
        if (clVar2 != null) {
            clVar2.layout(dp2, dp, clVar2.getMeasuredWidth() + dp2, clVar2.getTextHeight() + dp);
        } else {
            o6 o6Var = this.s;
            if (o6Var != null) {
                o6Var.layout(dp2, dp, o6Var.getMeasuredWidth() + dp2, o6Var.getTextHeight() + dp);
            }
        }
        org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) this.v.get();
        if (h5Var2 != null) {
            h5Var2.layout(dp2, dp, h5Var2.getMeasuredWidth() + dp2, h5Var2.getTextHeight() + dp);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        tn tnVar = this.e;
        int dp = size - AndroidUtilities.dp((tnVar.getVisibility() == 0 ? 54 : 0) + 16);
        float f9 = this.d;
        tnVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) - 2, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) - 2, TLObject.FLAG_30));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_31);
        org.telegram.ui.cl clVar = this.h;
        clVar.measure(makeMeasureSpec, makeMeasureSpec2);
        o6 o6Var = this.s;
        org.telegram.ui.cl clVar2 = this.r;
        if (clVar2 != null) {
            clVar2.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_31));
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
        ImageView imageView4 = this.A;
        if (imageView4 != null) {
            imageView4.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        }
        setMeasuredDimension(size, View.MeasureSpec.getSize(i11));
        int i12 = this.K;
        AtomicReference atomicReference = this.n;
        if (i12 != -1 && i12 != size && i12 > size) {
            this.L = i12;
            View view = (org.telegram.ui.ActionBar.h5) atomicReference.get();
            if (view != null) {
                removeView(view);
            }
            org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference.set(h5Var);
            int i13 = org.telegram.ui.ActionBar.g6.A8;
            org.telegram.ui.ActionBar.c6 c6Var = this.W;
            h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
            h5Var.setTextSizePx(AndroidUtilities.dp(this.g0 ? 17.5f : 18.0f));
            h5Var.setGravity(3);
            h5Var.setTypeface(AndroidUtilities.bold());
            h5Var.setLeftDrawableTopPadding(-AndroidUtilities.dp(1.3f));
            h5Var.i(clVar.getRightDrawable());
            h5Var.j(clVar.getRightDrawable2());
            h5Var.setRightDrawableOutside(clVar.getRightDrawableOutside());
            h5Var.setLeftDrawable(clVar.getLeftDrawable());
            h5Var.l(clVar.getText(), false);
            ViewPropertyAnimator duration = h5Var.animate().alpha(0.0f).setDuration(350L);
            jr jrVar = jr.h;
            duration.setInterpolator(jrVar).withEndAction(new qn(this, 0)).start();
            addView(h5Var);
            AtomicReference atomicReference2 = this.v;
            View view2 = (org.telegram.ui.ActionBar.h5) atomicReference2.get();
            if (view2 != null) {
                removeView(view2);
            }
            org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(getContext());
            atomicReference2.set(h5Var2);
            int i14 = org.telegram.ui.ActionBar.g6.B8;
            h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
            h5Var2.setTag(Integer.valueOf(i14));
            h5Var2.setTextSizePx(AndroidUtilities.dp(this.g0 ? 13.5f : 14.0f));
            h5Var2.setGravity(3);
            if (clVar2 != null) {
                h5Var2.l(clVar2.getText(), false);
            } else if (o6Var != null) {
                h5Var2.l(o6Var.getText(), false);
            }
            h5Var2.animate().alpha(0.0f).setDuration(350L).setInterpolator(jrVar).withEndAction(new qn(this, 1)).start();
            addView(h5Var2);
            setClipChildren(false);
        }
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) atomicReference.get();
        if (h5Var3 != null) {
            h5Var3.measure(org.telegram.ui.b.d((tnVar.getVisibility() == 0 ? 54 : 0) + 16, this.L, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), TLObject.FLAG_31));
        }
        this.K = size;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        uc ucVar = this.d0;
        qn qnVar = this.e0;
        if (action == 0 && a()) {
            this.f0 = true;
            ucVar.c(true);
            AndroidUtilities.cancelRunOnUIThread(qnVar);
            AndroidUtilities.runOnUIThread(qnVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f0) {
            ucVar.c(false);
            this.f0 = false;
            if (isClickable()) {
                e(false, false);
            }
            AndroidUtilities.cancelRunOnUIThread(qnVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBar(org.telegram.ui.ActionBar.l lVar) {
        this.q0 = lVar;
    }

    public void setChatAvatar(TLRPC.Chat chat) {
        int i10 = this.F;
        e9 e9Var = this.E;
        e9Var.k(i10, chat);
        tn tnVar = this.e;
        if (tnVar != null) {
            tnVar.e(chat, e9Var);
            tnVar.setRoundRadius(AndroidUtilities.dp(ChatObject.isForum(chat) ? ChatObject.hasStories(chat) ? 11.0f : 16.0f : 21.0f));
        }
    }

    public void setCommunityItemVisible(boolean z10) {
        ImageView imageView = this.x;
        if (imageView != null) {
            imageView.setVisibility((!z10 || this.f) ? 8 : 0);
        }
    }

    public void setLeftPadding(int i10) {
        this.H = i10;
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

    public void setRightAvatarPadding(int i10) {
        this.I = i10;
    }

    public void setStoriesForceState(Integer num) {
        this.c = num;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (this.S == null) {
            org.telegram.ui.cl clVar = this.r;
            if (clVar != null) {
                clVar.k(charSequence);
            } else {
                o6 o6Var = this.s;
                if (o6Var != null) {
                    o6Var.setText(charSequence);
                }
            }
        } else {
            this.S = charSequence;
        }
        org.telegram.ui.ActionBar.l lVar = this.q0;
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

    @Override // vd.b
    public final /* synthetic */ void z(float f9, int i10) {
    }
}
