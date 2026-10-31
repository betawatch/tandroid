package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class oo extends org.telegram.ui.ActionBar.k2 implements org.telegram.ui.Components.a40, org.telegram.messenger.us {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public LinearLayout D;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.c7 G;
    public boolean G0;
    public org.telegram.ui.Cells.p8 H;
    public boolean H0;
    public org.telegram.ui.Cells.p8 I;
    public boolean I0;
    public org.telegram.ui.Cells.p8 J;
    public boolean J0;
    public org.telegram.ui.Cells.p8 K;
    public TLRPC.ChatReactions K0;
    public zm0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.p8 M;
    public boolean M0;
    public org.telegram.ui.Cells.p8 N;
    public boolean N0;
    public org.telegram.ui.Cells.p8 O;
    public boolean O0;
    public org.telegram.ui.Cells.b9 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.p8 Q;
    public final lo Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.bi0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.p8 T;
    public org.telegram.ui.Cells.p8 U;
    public org.telegram.ui.Cells.p8 V;
    public org.telegram.ui.Cells.p8 W;
    public org.telegram.ui.Cells.p8 X;
    public org.telegram.ui.Cells.p8 Y;
    public org.telegram.ui.Cells.p8 Z;
    public org.telegram.ui.ActionBar.l5 a;
    public org.telegram.ui.Cells.p8 a0;
    public org.telegram.ui.ActionBar.x1 b;
    public mo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.x9 d0;
    public ag.d2 e;
    public org.telegram.ui.Cells.p8 e0;
    public kg.f0 f;
    public org.telegram.ui.Cells.p8 f0;
    public zh.b g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.b9 h0;
    public org.telegram.ui.Cells.p8 i0;
    public org.telegram.ui.Cells.b9 j0;
    public org.telegram.ui.Cells.p8 k0;
    public org.telegram.ui.Cells.p8 l0;
    public org.telegram.ui.Cells.p8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.p8 n0;
    public org.telegram.ui.Cells.p8 o0;
    public org.telegram.ui.Cells.p8 p0;
    public org.telegram.ui.Cells.p8 q0;
    public final org.telegram.ui.Components.r8 r;
    public org.telegram.ui.Cells.b9 r0;
    public final org.telegram.ui.Components.b40 s;
    public org.telegram.ui.Cells.b9 s0;
    public org.telegram.ui.Cells.p8 t0;
    public TLRPC.FileLocation u0;
    public long v0;
    public org.telegram.ui.Components.wt w;
    public TLRPC.Chat w0;
    public org.telegram.ui.Components.hn0 x;
    public TLRPC.ChatFull x0;
    public org.telegram.ui.Components.in0 y;
    public TLRPC.TL_chatAdminRights y0;
    public TLRPC.TL_chatBannedRights z0;

    public oo(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new lo(this);
        this.r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.v0 == 0) {
            this.s = new org.telegram.ui.Components.b40(0, false, false);
        } else {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.v0));
            this.s = new org.telegram.ui.Components.b40((L0 == null || !org.telegram.messenger.w3.V(L0)) ? 2 : 1, true, true);
        }
    }

    public static void Y(oo ooVar, FrameLayout frameLayout, View view) {
        int i10 = 0;
        if (!ooVar.F0) {
            TLRPC.ChatFull chatFull = ooVar.x0;
            org.telegram.ui.Components.cc.a0(ooVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(ooVar.getMessagesController().d5, "ChannelTopicsForbidden", new Object[0])) : org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131752280, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -ooVar.v0;
        qy qyVar = new qy(null);
        qyVar.a = j10;
        qyVar.setResourceProvider(ooVar.resourceProvider);
        boolean z10 = ooVar.E0;
        boolean z11 = ooVar.G0;
        boolean z12 = ooVar.H0;
        jo joVar = new jo(i10, ooVar, view);
        qyVar.c = z10;
        qyVar.d = z11;
        qyVar.e = z12;
        qyVar.h = joVar;
        ooVar.presentFragment(qyVar);
    }

    public static /* synthetic */ void Z(oo ooVar) {
        ooVar.u0 = null;
        long j10 = ooVar.B0;
        if (j10 == 0) {
            org.telegram.messenger.vp.r1(ooVar.currentAccount).B(ooVar.v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = ooVar.getMessagesController().n1(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            ooVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fo(ooVar, 2));
        }
        ooVar.r0(false, true);
        ag.d2 d2Var = ooVar.e;
        org.telegram.ui.Components.r8 r8Var = ooVar.r;
        Object obj = ooVar.C0;
        if (obj == null) {
            obj = ooVar.w0;
        }
        d2Var.j(null, null, r8Var, obj);
        ooVar.R0.M(0);
        ooVar.b0.e.d();
    }

    public static void a0(oo ooVar, long j10, long j11) {
        org.telegram.messenger.vp.r1(ooVar.currentAccount).O2(j10, j11, true, false, new z4(ooVar, 4));
    }

    public static void b0(oo ooVar) {
        int i10 = ooVar.currentAccount;
        long j10 = ooVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = ooVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle j11 = org.telegram.ui.Cells.f1.j(16, "onlySelect", "dialogsType", true);
        j11.putBoolean("resetDelegate", false);
        ay ayVar = new ay(j11);
        ayVar.setCurrentAccount(i10);
        ayVar.C2 = new di.a(ayVar, i10, j10, botVerifierSettings);
        T.presentFragment(ayVar);
    }

    public static void c0(oo ooVar, org.telegram.ui.ActionBar.x1 x1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, org.telegram.messenger.h3 h3Var) {
        x1Var.dismiss();
        if (ooVar.getParentActivity() == null) {
            return;
        }
        kg.q0 q0Var = new kg.q0(35, ooVar.currentAccount, ooVar.getParentActivity(), ooVar, ooVar.getResourceProvider());
        q0Var.A1(h3Var);
        q0Var.z1(tL_premium_boostsStatus, true);
        q0Var.B1(j10);
        TLRPC.Chat L0 = ooVar.getMessagesController().L0(Long.valueOf(-j10));
        if (L0 != null) {
            q0Var.I2 = new zg(13, ooVar, L0);
        }
        ooVar.showDialog(q0Var);
    }

    public static void d0(oo ooVar) {
        zc zcVar = new zc(-ooVar.w0.id);
        zcVar.l0 = ooVar;
        ooVar.presentFragment(zcVar);
        org.telegram.messenger.vp.r1(ooVar.currentAccount).f7.edit().putInt("boostingappearance", org.telegram.messenger.vp.r1(ooVar.currentAccount).f7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void e0(oo ooVar) {
        ooVar.O0 = true;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(ooVar.currentAccount);
        int i10 = org.telegram.messenger.vp.D8;
        f7.k(org.telegram.messenger.zs.r, 2);
    }

    public static SpannableStringBuilder h0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        g00 g00Var = new g00(10);
        g00Var.a.setTypeface(org.telegram.messenger.i0.o1("fonts/num.otf"));
        g00Var.f = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.zk, false);
        g00Var.n = false;
        spannableStringBuilder.setSpan(g00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String k0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final void H(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.a40
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.a40
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1041  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x104e  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x10b0  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x10e4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x10b5  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0890  */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r21;
        int i10;
        Context context2;
        final int i11;
        Integer num;
        final int i12;
        final oo ooVar;
        int i13;
        org.telegram.ui.ActionBar.w6 w6Var;
        int i14;
        Integer num2;
        boolean z10;
        CharSequence Z0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        TLRPC.User user;
        final oo ooVar2;
        float f7;
        Context context3;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        boolean z11;
        String format;
        int i15;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        int i16;
        org.telegram.ui.Cells.p8 p8Var3;
        org.telegram.ui.Cells.p8 p8Var4;
        org.telegram.ui.Cells.p8 p8Var5;
        org.telegram.ui.Cells.p8 p8Var6;
        TLRPC.ChatFull chatFull2;
        Context context4;
        FrameLayout frameLayout;
        int i17;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i18 = 1;
        setHasOwnBackground(true);
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 25));
        gd gdVar = new gd(i18, context, this);
        gdVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(8));
        this.fragmentView = gdVar;
        org.telegram.ui.Components.hn0 hn0Var = new org.telegram.ui.Components.hn0(context);
        this.x = hn0Var;
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(context, this.x, this.resourceProvider, false);
        this.y = in0Var;
        in0Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        gdVar.addView(this.y, w7.b6.c(-1.0f, -1));
        this.y.addView(hn0Var, new FrameLayout.LayoutParams(-1, -2));
        hn0Var.setOrientation(1);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.K0(2131752415));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i19 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i19, linearLayout2, null);
        hn0Var.addView(this.d, w7.b6.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.b6.o(-1, -2));
        int i20 = 5;
        ag.d2 d2Var = new ag.d2(this, context, i20);
        this.e = d2Var;
        d2Var.setRoundRadius(this.E0 ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(32.0f));
        int i21 = 3;
        if (this.C0 != null || org.telegram.messenger.w3.d(this.w0)) {
            ag.d2 d2Var2 = this.e;
            boolean z12 = org.telegram.messenger.cd.X;
            frameLayout2.addView(d2Var2, w7.b6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            kg.f0 f0Var = new kg.f0(this, context, paint, i20);
            this.f = f0Var;
            boolean z13 = org.telegram.messenger.cd.X;
            frameLayout2.addView(f0Var, w7.b6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(org.telegram.messenger.i0.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = org.telegram.messenger.cd.X;
            frameLayout2.addView(radialProgressView2, w7.b6.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            r0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j10 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j10 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j10));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i22 = chatPhoto2.dc_id;
                                        if (i22 != 0) {
                                            chatPhoto2.photo_big.dc_id = i22;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i23 = userProfilePhoto2.dc_id;
                                        if (i23 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i23;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j11 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var7 = ooVar14.H;
                            boolean z15 = p8Var7 != null && p8Var7.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j11;
                            cpVar.n0 = z15;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z16 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z16 = true;
                            }
                            qpVar.s = z16;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i24 = 0; i24 < tL_chatReactionsSome.reactions.size(); i24++) {
                                            if (tL_chatReactionsSome.reactions.get(i24) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i24)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
        } else {
            ag.d2 d2Var3 = this.e;
            boolean z15 = org.telegram.messenger.cd.X;
            frameLayout2.addView(d2Var3, w7.b6.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.wt wtVar2 = new org.telegram.ui.Components.wt(context, gdVar, this);
        this.w = wtVar2;
        long j10 = this.B0;
        if (j10 != 0) {
            wtVar2.setHint(org.telegram.messenger.cd.K0(2131753021));
            r21 = 0;
        } else if (this.I0) {
            r21 = 0;
            wtVar2.setHint(org.telegram.messenger.cd.L0(2131751125, "EnterChannelName"));
        } else {
            r21 = 0;
            wtVar2.setHint(org.telegram.messenger.cd.L0(2131749431, "GroupName"));
        }
        org.telegram.ui.Components.wt wtVar3 = this.w;
        TLRPC.Chat chat3 = this.w0;
        wtVar3.setEnabled((chat3 != null || org.telegram.messenger.w3.d(chat3)) ? true : r21);
        org.telegram.ui.Components.wt wtVar4 = this.w;
        wtVar4.setFocusable(wtVar4.isEnabled());
        this.w.getEditText().addTextChangedListener(new n0(this, i21));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r21] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        org.telegram.ui.Components.wt wtVar5 = this.w;
        boolean z16 = org.telegram.messenger.cd.X;
        frameLayout2.addView(wtVar5, w7.b6.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.D = linearLayout3;
        linearLayout3.setOrientation(1);
        hn0Var.addView(this.D, w7.b6.o(-1, -2));
        final int i22 = 12;
        if (this.C0 != null || org.telegram.messenger.w3.d(this.w0)) {
            mo moVar = new mo(context);
            this.b0 = moVar;
            org.telegram.ui.ActionBar.a7.S(moVar, org.telegram.ui.ActionBar.t6.N0(r21), null, org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
            this.b0.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i22) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i23 = userProfilePhoto2.dc_id;
                                        if (i23 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i23;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j11 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var7 = ooVar14.H;
                            boolean z152 = p8Var7 != null && p8Var7.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j11;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i24 = 0; i24 < tL_chatReactionsSome.reactions.size(); i24++) {
                                            if (tL_chatReactionsSome.reactions.get(i24) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i24)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            this.D.addView(this.b0, w7.b6.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.a7.F(this.E, org.telegram.ui.ActionBar.t6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i23 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor2, i23, null);
        int i24 = r21;
        this.E.setPadding(i24, i24, i24, org.telegram.messenger.i0.L(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(org.telegram.messenger.cd.X ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.C0 != null || org.telegram.messenger.w3.d(this.w0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.zs.e4)});
        this.E.setHint(org.telegram.messenger.cd.L0(2131751461, "DescriptionOptionalPlaceholder"));
        org.telegram.ui.ActionBar.a7.v(this.E, i23);
        this.E.setCursorSize(org.telegram.messenger.i0.L(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.D.addView(this.E, w7.b6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.D.addView(this.E, w7.b6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new ha(this, 2));
        this.E.addTextChangedListener(new jd(1));
        org.telegram.ui.Cells.c7 c7Var = new org.telegram.ui.Cells.c7(context);
        this.G = c7Var;
        hn0Var.addView(c7Var, w7.b6.o(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        hn0Var.addView(this.F, w7.b6.o(-1, -2));
        TLRPC.Chat chat4 = this.w0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.x0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.p8 p8Var7 = new org.telegram.ui.Cells.p8(context);
                this.H = p8Var7;
                org.telegram.ui.ActionBar.a7.S(p8Var7, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i19), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                this.F.addView(this.H, w7.b6.o(-1, -2));
                final int i25 = 15;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                oo ooVar3 = this.b;
                                ooVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ooVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                pr prVar = new pr(bundle);
                                prVar.B0(ooVar3.x0);
                                ooVar3.presentFragment(prVar);
                                break;
                            case 1:
                                oo ooVar4 = this.b;
                                lo loVar = ooVar4.Q0;
                                long j102 = ooVar4.B0;
                                if (!ooVar4.s.g()) {
                                    org.telegram.messenger.ic icVar = null;
                                    TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                    if (Z1 == null) {
                                        TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i222 = chatPhoto2.dc_id;
                                            if (i222 != 0) {
                                                chatPhoto2.photo_big.dc_id = i222;
                                            }
                                            TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                            int i232 = userProfilePhoto2.dc_id;
                                            if (i232 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i232;
                                            }
                                            PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                oo ooVar5 = this.b;
                                ooVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ooVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                pr prVar2 = new pr(bundle2);
                                prVar2.B0(ooVar5.x0);
                                ooVar5.presentFragment(prVar2);
                                break;
                            case 3:
                                oo ooVar6 = this.b;
                                ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                break;
                            case 4:
                                oo ooVar7 = this.b;
                                ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                break;
                            case 5:
                                oo ooVar8 = this.b;
                                ooVar8.getClass();
                                ooVar8.presentFragment(new sb(ooVar8.w0));
                                break;
                            case 6:
                                oo ooVar9 = this.b;
                                ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                break;
                            case 7:
                                oo ooVar10 = this.b;
                                ooVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ooVar10.B0);
                                ooVar10.presentFragment(new oa(bundle3));
                                break;
                            case 8:
                                oo ooVar11 = this.b;
                                ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                break;
                            case 9:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                break;
                            case 12:
                                this.b.m0();
                                break;
                            case 13:
                                oo.b0(this.b);
                                break;
                            case 14:
                                oo ooVar12 = this.b;
                                org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                break;
                            case 15:
                                oo ooVar13 = this.b;
                                if (org.telegram.messenger.i0.J1(ooVar13)) {
                                    yb0 yb0Var = new yb0(4);
                                    yb0Var.n0 = -ooVar13.v0;
                                    TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    yb0Var.N0 = new go(ooVar13, 6);
                                    ooVar13.presentFragment(yb0Var);
                                    break;
                                }
                                break;
                            case 16:
                                oo ooVar14 = this.b;
                                long j11 = ooVar14.v0;
                                org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                cp cpVar = new cp(null);
                                cpVar.M = new ArrayList();
                                cpVar.N = new ArrayList();
                                cpVar.P = new ArrayList();
                                cpVar.c0 = true;
                                cpVar.f0 = new ArrayList();
                                cpVar.o0 = new HashMap();
                                cpVar.q0 = new ro(cpVar, 5);
                                cpVar.s0 = false;
                                cpVar.Z = j11;
                                cpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                cpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        cpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        cpVar.c0(false);
                                    }
                                }
                                ooVar14.presentFragment(cpVar);
                                break;
                            case 17:
                                oo ooVar15 = this.b;
                                long j12 = ooVar15.v0;
                                qp qpVar = new qp(null);
                                qpVar.w = new ArrayList();
                                boolean z162 = false;
                                qpVar.O = false;
                                qpVar.P = false;
                                qpVar.E = j12;
                                TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                qpVar.f = L02;
                                if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                    z162 = true;
                                }
                                qpVar.s = z162;
                                qpVar.h = ooVar15.x0;
                                ooVar15.presentFragment(qpVar);
                                break;
                            case 18:
                                oo ooVar16 = this.b;
                                rt0 rt0Var = new rt0(ooVar16.v0);
                                rt0Var.s = new go(ooVar16, 4);
                                ooVar16.presentFragment(rt0Var);
                                break;
                            case 19:
                                oo.d0(this.b);
                                break;
                            case 20:
                                oo ooVar17 = this.b;
                                i50 i50Var = new i50(-ooVar17.w0.id);
                                i50Var.c = ooVar17.L0;
                                i50Var.l0 = ooVar17;
                                ooVar17.presentFragment(i50Var);
                                break;
                            case 21:
                                oo ooVar18 = this.b;
                                ooVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ooVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                pr prVar3 = new pr(bundle4);
                                prVar3.B0(ooVar18.x0);
                                ooVar18.presentFragment(prVar3);
                                break;
                            case 22:
                                oo ooVar19 = this.b;
                                kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                ooVar19.presentFragment(kg0Var);
                                break;
                            case 23:
                                oo ooVar20 = this.b;
                                if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                    ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ooVar20.v0);
                                    xp xpVar = new xp(bundle5);
                                    TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                    xpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xpVar.a == null) {
                                            xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                        }
                                        xpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                    xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                }
                                            }
                                            xpVar.w = 1;
                                        }
                                    }
                                    ooVar20.presentFragment(xpVar);
                                    break;
                                }
                            default:
                                oo ooVar21 = this.b;
                                ooVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", ooVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                ooVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.w0.creator && ((chatFull3 = this.x0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.p8 p8Var8 = new org.telegram.ui.Cells.p8(context);
                this.I = p8Var8;
                org.telegram.ui.ActionBar.a7.S(p8Var8, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i19), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                this.F.addView(this.I, w7.b6.o(-1, -2));
                final int i26 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                oo ooVar3 = this.b;
                                ooVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ooVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                pr prVar = new pr(bundle);
                                prVar.B0(ooVar3.x0);
                                ooVar3.presentFragment(prVar);
                                break;
                            case 1:
                                oo ooVar4 = this.b;
                                lo loVar = ooVar4.Q0;
                                long j102 = ooVar4.B0;
                                if (!ooVar4.s.g()) {
                                    org.telegram.messenger.ic icVar = null;
                                    TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                    if (Z1 == null) {
                                        TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i222 = chatPhoto2.dc_id;
                                            if (i222 != 0) {
                                                chatPhoto2.photo_big.dc_id = i222;
                                            }
                                            TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                            int i232 = userProfilePhoto2.dc_id;
                                            if (i232 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i232;
                                            }
                                            PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                oo ooVar5 = this.b;
                                ooVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ooVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                pr prVar2 = new pr(bundle2);
                                prVar2.B0(ooVar5.x0);
                                ooVar5.presentFragment(prVar2);
                                break;
                            case 3:
                                oo ooVar6 = this.b;
                                ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                break;
                            case 4:
                                oo ooVar7 = this.b;
                                ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                break;
                            case 5:
                                oo ooVar8 = this.b;
                                ooVar8.getClass();
                                ooVar8.presentFragment(new sb(ooVar8.w0));
                                break;
                            case 6:
                                oo ooVar9 = this.b;
                                ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                break;
                            case 7:
                                oo ooVar10 = this.b;
                                ooVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ooVar10.B0);
                                ooVar10.presentFragment(new oa(bundle3));
                                break;
                            case 8:
                                oo ooVar11 = this.b;
                                ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                break;
                            case 9:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                break;
                            case 12:
                                this.b.m0();
                                break;
                            case 13:
                                oo.b0(this.b);
                                break;
                            case 14:
                                oo ooVar12 = this.b;
                                org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                break;
                            case 15:
                                oo ooVar13 = this.b;
                                if (org.telegram.messenger.i0.J1(ooVar13)) {
                                    yb0 yb0Var = new yb0(4);
                                    yb0Var.n0 = -ooVar13.v0;
                                    TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    yb0Var.N0 = new go(ooVar13, 6);
                                    ooVar13.presentFragment(yb0Var);
                                    break;
                                }
                                break;
                            case 16:
                                oo ooVar14 = this.b;
                                long j11 = ooVar14.v0;
                                org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                cp cpVar = new cp(null);
                                cpVar.M = new ArrayList();
                                cpVar.N = new ArrayList();
                                cpVar.P = new ArrayList();
                                cpVar.c0 = true;
                                cpVar.f0 = new ArrayList();
                                cpVar.o0 = new HashMap();
                                cpVar.q0 = new ro(cpVar, 5);
                                cpVar.s0 = false;
                                cpVar.Z = j11;
                                cpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                cpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        cpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        cpVar.c0(false);
                                    }
                                }
                                ooVar14.presentFragment(cpVar);
                                break;
                            case 17:
                                oo ooVar15 = this.b;
                                long j12 = ooVar15.v0;
                                qp qpVar = new qp(null);
                                qpVar.w = new ArrayList();
                                boolean z162 = false;
                                qpVar.O = false;
                                qpVar.P = false;
                                qpVar.E = j12;
                                TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                qpVar.f = L02;
                                if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                    z162 = true;
                                }
                                qpVar.s = z162;
                                qpVar.h = ooVar15.x0;
                                ooVar15.presentFragment(qpVar);
                                break;
                            case 18:
                                oo ooVar16 = this.b;
                                rt0 rt0Var = new rt0(ooVar16.v0);
                                rt0Var.s = new go(ooVar16, 4);
                                ooVar16.presentFragment(rt0Var);
                                break;
                            case 19:
                                oo.d0(this.b);
                                break;
                            case 20:
                                oo ooVar17 = this.b;
                                i50 i50Var = new i50(-ooVar17.w0.id);
                                i50Var.c = ooVar17.L0;
                                i50Var.l0 = ooVar17;
                                ooVar17.presentFragment(i50Var);
                                break;
                            case 21:
                                oo ooVar18 = this.b;
                                ooVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ooVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                pr prVar3 = new pr(bundle4);
                                prVar3.B0(ooVar18.x0);
                                ooVar18.presentFragment(prVar3);
                                break;
                            case 22:
                                oo ooVar19 = this.b;
                                kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                ooVar19.presentFragment(kg0Var);
                                break;
                            case 23:
                                oo ooVar20 = this.b;
                                if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                    ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ooVar20.v0);
                                    xp xpVar = new xp(bundle5);
                                    TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                    xpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xpVar.a == null) {
                                            xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                        }
                                        xpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                    xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                }
                                            }
                                            xpVar.w = 1;
                                        }
                                    }
                                    ooVar20.presentFragment(xpVar);
                                    break;
                                }
                            default:
                                oo ooVar21 = this.b;
                                ooVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", ooVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                ooVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.w3.T(this.w0) && ((this.I0 && org.telegram.messenger.w3.y(1, this.w0)) || (!this.I0 && org.telegram.messenger.w3.y(0, this.w0)))) {
                org.telegram.ui.Cells.p8 p8Var9 = new org.telegram.ui.Cells.p8(context);
                this.J = p8Var9;
                org.telegram.ui.ActionBar.a7.S(p8Var9, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i19), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                this.F.addView(this.J, w7.b6.o(-1, -2));
                final int i27 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                oo ooVar3 = this.b;
                                ooVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ooVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                pr prVar = new pr(bundle);
                                prVar.B0(ooVar3.x0);
                                ooVar3.presentFragment(prVar);
                                break;
                            case 1:
                                oo ooVar4 = this.b;
                                lo loVar = ooVar4.Q0;
                                long j102 = ooVar4.B0;
                                if (!ooVar4.s.g()) {
                                    org.telegram.messenger.ic icVar = null;
                                    TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                    if (Z1 == null) {
                                        TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i222 = chatPhoto2.dc_id;
                                            if (i222 != 0) {
                                                chatPhoto2.photo_big.dc_id = i222;
                                            }
                                            TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                            int i232 = userProfilePhoto2.dc_id;
                                            if (i232 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i232;
                                            }
                                            PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                oo ooVar5 = this.b;
                                ooVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ooVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                pr prVar2 = new pr(bundle2);
                                prVar2.B0(ooVar5.x0);
                                ooVar5.presentFragment(prVar2);
                                break;
                            case 3:
                                oo ooVar6 = this.b;
                                ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                break;
                            case 4:
                                oo ooVar7 = this.b;
                                ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                break;
                            case 5:
                                oo ooVar8 = this.b;
                                ooVar8.getClass();
                                ooVar8.presentFragment(new sb(ooVar8.w0));
                                break;
                            case 6:
                                oo ooVar9 = this.b;
                                ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                break;
                            case 7:
                                oo ooVar10 = this.b;
                                ooVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ooVar10.B0);
                                ooVar10.presentFragment(new oa(bundle3));
                                break;
                            case 8:
                                oo ooVar11 = this.b;
                                ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                break;
                            case 9:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                break;
                            case 12:
                                this.b.m0();
                                break;
                            case 13:
                                oo.b0(this.b);
                                break;
                            case 14:
                                oo ooVar12 = this.b;
                                org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                break;
                            case 15:
                                oo ooVar13 = this.b;
                                if (org.telegram.messenger.i0.J1(ooVar13)) {
                                    yb0 yb0Var = new yb0(4);
                                    yb0Var.n0 = -ooVar13.v0;
                                    TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    yb0Var.N0 = new go(ooVar13, 6);
                                    ooVar13.presentFragment(yb0Var);
                                    break;
                                }
                                break;
                            case 16:
                                oo ooVar14 = this.b;
                                long j11 = ooVar14.v0;
                                org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                cp cpVar = new cp(null);
                                cpVar.M = new ArrayList();
                                cpVar.N = new ArrayList();
                                cpVar.P = new ArrayList();
                                cpVar.c0 = true;
                                cpVar.f0 = new ArrayList();
                                cpVar.o0 = new HashMap();
                                cpVar.q0 = new ro(cpVar, 5);
                                cpVar.s0 = false;
                                cpVar.Z = j11;
                                cpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                cpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        cpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        cpVar.c0(false);
                                    }
                                }
                                ooVar14.presentFragment(cpVar);
                                break;
                            case 17:
                                oo ooVar15 = this.b;
                                long j12 = ooVar15.v0;
                                qp qpVar = new qp(null);
                                qpVar.w = new ArrayList();
                                boolean z162 = false;
                                qpVar.O = false;
                                qpVar.P = false;
                                qpVar.E = j12;
                                TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                qpVar.f = L02;
                                if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                    z162 = true;
                                }
                                qpVar.s = z162;
                                qpVar.h = ooVar15.x0;
                                ooVar15.presentFragment(qpVar);
                                break;
                            case 18:
                                oo ooVar16 = this.b;
                                rt0 rt0Var = new rt0(ooVar16.v0);
                                rt0Var.s = new go(ooVar16, 4);
                                ooVar16.presentFragment(rt0Var);
                                break;
                            case 19:
                                oo.d0(this.b);
                                break;
                            case 20:
                                oo ooVar17 = this.b;
                                i50 i50Var = new i50(-ooVar17.w0.id);
                                i50Var.c = ooVar17.L0;
                                i50Var.l0 = ooVar17;
                                ooVar17.presentFragment(i50Var);
                                break;
                            case 21:
                                oo ooVar18 = this.b;
                                ooVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ooVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                pr prVar3 = new pr(bundle4);
                                prVar3.B0(ooVar18.x0);
                                ooVar18.presentFragment(prVar3);
                                break;
                            case 22:
                                oo ooVar19 = this.b;
                                kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                ooVar19.presentFragment(kg0Var);
                                break;
                            case 23:
                                oo ooVar20 = this.b;
                                if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                    ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ooVar20.v0);
                                    xp xpVar = new xp(bundle5);
                                    TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                    xpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xpVar.a == null) {
                                            xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                        }
                                        xpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                    xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                }
                                            }
                                            xpVar.w = 1;
                                        }
                                    }
                                    ooVar20.presentFragment(xpVar);
                                    break;
                                }
                            default:
                                oo ooVar21 = this.b;
                                ooVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", ooVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                ooVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.w3.V(this.w0) && this.I0 && org.telegram.messenger.w3.y(1, this.w0)) {
                org.telegram.ui.Cells.p8 p8Var10 = new org.telegram.ui.Cells.p8(context);
                this.K = p8Var10;
                org.telegram.ui.ActionBar.a7.S(p8Var10, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i19), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                this.K.s(org.telegram.messenger.cd.K0(2131747111), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.b6.o(-1, -2));
                final int i28 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i28) {
                            case 0:
                                oo ooVar3 = this.b;
                                ooVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ooVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                pr prVar = new pr(bundle);
                                prVar.B0(ooVar3.x0);
                                ooVar3.presentFragment(prVar);
                                break;
                            case 1:
                                oo ooVar4 = this.b;
                                lo loVar = ooVar4.Q0;
                                long j102 = ooVar4.B0;
                                if (!ooVar4.s.g()) {
                                    org.telegram.messenger.ic icVar = null;
                                    TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                    if (Z1 == null) {
                                        TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i222 = chatPhoto2.dc_id;
                                            if (i222 != 0) {
                                                chatPhoto2.photo_big.dc_id = i222;
                                            }
                                            TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                            int i232 = userProfilePhoto2.dc_id;
                                            if (i232 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i232;
                                            }
                                            PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                oo ooVar5 = this.b;
                                ooVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ooVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                pr prVar2 = new pr(bundle2);
                                prVar2.B0(ooVar5.x0);
                                ooVar5.presentFragment(prVar2);
                                break;
                            case 3:
                                oo ooVar6 = this.b;
                                ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                break;
                            case 4:
                                oo ooVar7 = this.b;
                                ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                break;
                            case 5:
                                oo ooVar8 = this.b;
                                ooVar8.getClass();
                                ooVar8.presentFragment(new sb(ooVar8.w0));
                                break;
                            case 6:
                                oo ooVar9 = this.b;
                                ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                break;
                            case 7:
                                oo ooVar10 = this.b;
                                ooVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ooVar10.B0);
                                ooVar10.presentFragment(new oa(bundle3));
                                break;
                            case 8:
                                oo ooVar11 = this.b;
                                ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                break;
                            case 9:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                break;
                            case 12:
                                this.b.m0();
                                break;
                            case 13:
                                oo.b0(this.b);
                                break;
                            case 14:
                                oo ooVar12 = this.b;
                                org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                break;
                            case 15:
                                oo ooVar13 = this.b;
                                if (org.telegram.messenger.i0.J1(ooVar13)) {
                                    yb0 yb0Var = new yb0(4);
                                    yb0Var.n0 = -ooVar13.v0;
                                    TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    yb0Var.N0 = new go(ooVar13, 6);
                                    ooVar13.presentFragment(yb0Var);
                                    break;
                                }
                                break;
                            case 16:
                                oo ooVar14 = this.b;
                                long j11 = ooVar14.v0;
                                org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                cp cpVar = new cp(null);
                                cpVar.M = new ArrayList();
                                cpVar.N = new ArrayList();
                                cpVar.P = new ArrayList();
                                cpVar.c0 = true;
                                cpVar.f0 = new ArrayList();
                                cpVar.o0 = new HashMap();
                                cpVar.q0 = new ro(cpVar, 5);
                                cpVar.s0 = false;
                                cpVar.Z = j11;
                                cpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                cpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        cpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        cpVar.c0(false);
                                    }
                                }
                                ooVar14.presentFragment(cpVar);
                                break;
                            case 17:
                                oo ooVar15 = this.b;
                                long j12 = ooVar15.v0;
                                qp qpVar = new qp(null);
                                qpVar.w = new ArrayList();
                                boolean z162 = false;
                                qpVar.O = false;
                                qpVar.P = false;
                                qpVar.E = j12;
                                TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                qpVar.f = L02;
                                if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                    z162 = true;
                                }
                                qpVar.s = z162;
                                qpVar.h = ooVar15.x0;
                                ooVar15.presentFragment(qpVar);
                                break;
                            case 18:
                                oo ooVar16 = this.b;
                                rt0 rt0Var = new rt0(ooVar16.v0);
                                rt0Var.s = new go(ooVar16, 4);
                                ooVar16.presentFragment(rt0Var);
                                break;
                            case 19:
                                oo.d0(this.b);
                                break;
                            case 20:
                                oo ooVar17 = this.b;
                                i50 i50Var = new i50(-ooVar17.w0.id);
                                i50Var.c = ooVar17.L0;
                                i50Var.l0 = ooVar17;
                                ooVar17.presentFragment(i50Var);
                                break;
                            case 21:
                                oo ooVar18 = this.b;
                                ooVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ooVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                pr prVar3 = new pr(bundle4);
                                prVar3.B0(ooVar18.x0);
                                ooVar18.presentFragment(prVar3);
                                break;
                            case 22:
                                oo ooVar19 = this.b;
                                kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                ooVar19.presentFragment(kg0Var);
                                break;
                            case 23:
                                oo ooVar20 = this.b;
                                if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                    ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ooVar20.v0);
                                    xp xpVar = new xp(bundle5);
                                    TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                    xpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xpVar.a == null) {
                                            xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                        }
                                        xpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                    xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                }
                                            }
                                            xpVar.w = 1;
                                        }
                                    }
                                    ooVar20.presentFragment(xpVar);
                                    break;
                                }
                            default:
                                oo ooVar21 = this.b;
                                ooVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", ooVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                ooVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.w3.V(this.w0) && org.telegram.messenger.w3.d(this.w0)) {
                i10 = i19;
                zm0 zm0Var = new zm0(this.currentAccount, -this.w0.id, context, getResourceProvider());
                this.L = zm0Var;
                org.telegram.ui.ActionBar.a7.S(zm0Var, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                this.F.addView(this.L, w7.b6.o(-1, -2));
                final int i29 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i29) {
                            case 0:
                                oo ooVar3 = this.b;
                                ooVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ooVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                pr prVar = new pr(bundle);
                                prVar.B0(ooVar3.x0);
                                ooVar3.presentFragment(prVar);
                                break;
                            case 1:
                                oo ooVar4 = this.b;
                                lo loVar = ooVar4.Q0;
                                long j102 = ooVar4.B0;
                                if (!ooVar4.s.g()) {
                                    org.telegram.messenger.ic icVar = null;
                                    TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                    if (Z1 == null) {
                                        TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i222 = chatPhoto2.dc_id;
                                            if (i222 != 0) {
                                                chatPhoto2.photo_big.dc_id = i222;
                                            }
                                            TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                            int i232 = userProfilePhoto2.dc_id;
                                            if (i232 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i232;
                                            }
                                            PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                oo ooVar5 = this.b;
                                ooVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ooVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                pr prVar2 = new pr(bundle2);
                                prVar2.B0(ooVar5.x0);
                                ooVar5.presentFragment(prVar2);
                                break;
                            case 3:
                                oo ooVar6 = this.b;
                                ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                break;
                            case 4:
                                oo ooVar7 = this.b;
                                ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                break;
                            case 5:
                                oo ooVar8 = this.b;
                                ooVar8.getClass();
                                ooVar8.presentFragment(new sb(ooVar8.w0));
                                break;
                            case 6:
                                oo ooVar9 = this.b;
                                ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                break;
                            case 7:
                                oo ooVar10 = this.b;
                                ooVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ooVar10.B0);
                                ooVar10.presentFragment(new oa(bundle3));
                                break;
                            case 8:
                                oo ooVar11 = this.b;
                                ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                break;
                            case 9:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                break;
                            case 12:
                                this.b.m0();
                                break;
                            case 13:
                                oo.b0(this.b);
                                break;
                            case 14:
                                oo ooVar12 = this.b;
                                org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                break;
                            case 15:
                                oo ooVar13 = this.b;
                                if (org.telegram.messenger.i0.J1(ooVar13)) {
                                    yb0 yb0Var = new yb0(4);
                                    yb0Var.n0 = -ooVar13.v0;
                                    TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    yb0Var.N0 = new go(ooVar13, 6);
                                    ooVar13.presentFragment(yb0Var);
                                    break;
                                }
                                break;
                            case 16:
                                oo ooVar14 = this.b;
                                long j11 = ooVar14.v0;
                                org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                cp cpVar = new cp(null);
                                cpVar.M = new ArrayList();
                                cpVar.N = new ArrayList();
                                cpVar.P = new ArrayList();
                                cpVar.c0 = true;
                                cpVar.f0 = new ArrayList();
                                cpVar.o0 = new HashMap();
                                cpVar.q0 = new ro(cpVar, 5);
                                cpVar.s0 = false;
                                cpVar.Z = j11;
                                cpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                cpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        cpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        cpVar.c0(false);
                                    }
                                }
                                ooVar14.presentFragment(cpVar);
                                break;
                            case 17:
                                oo ooVar15 = this.b;
                                long j12 = ooVar15.v0;
                                qp qpVar = new qp(null);
                                qpVar.w = new ArrayList();
                                boolean z162 = false;
                                qpVar.O = false;
                                qpVar.P = false;
                                qpVar.E = j12;
                                TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                qpVar.f = L02;
                                if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                    z162 = true;
                                }
                                qpVar.s = z162;
                                qpVar.h = ooVar15.x0;
                                ooVar15.presentFragment(qpVar);
                                break;
                            case 18:
                                oo ooVar16 = this.b;
                                rt0 rt0Var = new rt0(ooVar16.v0);
                                rt0Var.s = new go(ooVar16, 4);
                                ooVar16.presentFragment(rt0Var);
                                break;
                            case 19:
                                oo.d0(this.b);
                                break;
                            case 20:
                                oo ooVar17 = this.b;
                                i50 i50Var = new i50(-ooVar17.w0.id);
                                i50Var.c = ooVar17.L0;
                                i50Var.l0 = ooVar17;
                                ooVar17.presentFragment(i50Var);
                                break;
                            case 21:
                                oo ooVar18 = this.b;
                                ooVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ooVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                pr prVar3 = new pr(bundle4);
                                prVar3.B0(ooVar18.x0);
                                ooVar18.presentFragment(prVar3);
                                break;
                            case 22:
                                oo ooVar19 = this.b;
                                kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                ooVar19.presentFragment(kg0Var);
                                break;
                            case 23:
                                oo ooVar20 = this.b;
                                if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                    ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ooVar20.v0);
                                    xp xpVar = new xp(bundle5);
                                    TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                    xpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xpVar.a == null) {
                                            xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                        }
                                        xpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                    xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                }
                                            }
                                            xpVar.w = 1;
                                        }
                                    }
                                    ooVar20.presentFragment(xpVar);
                                    break;
                                }
                            default:
                                oo ooVar21 = this.b;
                                ooVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", ooVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                ooVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i10 = i19;
            }
            if (!org.telegram.messenger.w3.V(this.w0) || org.telegram.messenger.w3.Y(this.w0)) {
                context4 = context;
                frameLayout = frameLayout2;
                num = 1;
                ooVar = this;
            } else {
                long j11 = -this.w0.id;
                num = 1;
                org.telegram.ui.Cells.p8 p8Var11 = new org.telegram.ui.Cells.p8(23, context, this.resourceProvider, false, true);
                context4 = context;
                this.M = p8Var11;
                org.telegram.ui.ActionBar.a7.S(p8Var11, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                this.M.n(R.drawable.msg_translate, org.telegram.messenger.cd.K0(2131752458), this.w0.autotranslation);
                final int i30 = 0;
                getMessagesController().G0().a(j11, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ oo b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        int i31 = i30;
                        oo ooVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i31) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    ooVar3.getClass();
                                    break;
                                } else {
                                    ooVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < ooVar3.getMessagesController().B4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                ooVar3.L0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, w7.b6.o(-1, -2));
                frameLayout = frameLayout2;
                ooVar = this;
                this.M.setOnClickListener(new zn(this, new boolean[]{false}, j11, 0));
            }
            if (ooVar.I0) {
                i17 = 6;
                i11 = 2;
            } else {
                i11 = 2;
                if (org.telegram.messenger.w3.w(2, ooVar.w0) && (org.telegram.messenger.w3.T(ooVar.w0) || ooVar.w0.creator)) {
                    org.telegram.ui.Cells.p8 p8Var12 = new org.telegram.ui.Cells.p8(context4);
                    ooVar.N = p8Var12;
                    org.telegram.ui.ActionBar.a7.S(p8Var12, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                    ooVar.F.addView(ooVar.N, w7.b6.o(-1, -2));
                    i17 = 6;
                    ooVar.N.setOnClickListener(new ud(i17, context4, (org.telegram.ui.ActionBar.k2) ooVar));
                } else {
                    i17 = 6;
                }
            }
            if (org.telegram.messenger.w3.n0(ooVar.w0) && org.telegram.messenger.w3.N(ooVar.w0) && !org.telegram.messenger.w3.Y(ooVar.w0)) {
                final int i31 = 1;
                org.telegram.messenger.vp.r1(ooVar.currentAccount).G0().a(-ooVar.w0.id, new org.telegram.messenger.q20(ooVar) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ oo b;

                    {
                        this.b = ooVar;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        int i312 = i31;
                        oo ooVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i312) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    ooVar3.getClass();
                                    break;
                                } else {
                                    ooVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < ooVar3.getMessagesController().B4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                ooVar3.L0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                Context context5 = context4;
                i12 = i17;
                zm0 zm0Var2 = new zm0(ooVar.currentAccount, -ooVar.w0.id, context5, ooVar.getResourceProvider());
                ooVar.L = zm0Var2;
                org.telegram.ui.ActionBar.a7.S(zm0Var2, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                ooVar.F.addView(ooVar.L, w7.b6.o(-1, -2));
                final int i32 = 20;
                ooVar.L.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ oo b;

                    {
                        this.b = ooVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i32) {
                            case 0:
                                oo ooVar3 = this.b;
                                ooVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", ooVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                pr prVar = new pr(bundle);
                                prVar.B0(ooVar3.x0);
                                ooVar3.presentFragment(prVar);
                                break;
                            case 1:
                                oo ooVar4 = this.b;
                                lo loVar = ooVar4.Q0;
                                long j102 = ooVar4.B0;
                                if (!ooVar4.s.g()) {
                                    org.telegram.messenger.ic icVar = null;
                                    TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                    if (Z1 == null) {
                                        TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = L0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                            int i222 = chatPhoto2.dc_id;
                                            if (i222 != 0) {
                                                chatPhoto2.photo_big.dc_id = i222;
                                            }
                                            TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, ooVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                            int i232 = userProfilePhoto2.dc_id;
                                            if (i232 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i232;
                                            }
                                            PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                oo ooVar5 = this.b;
                                ooVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", ooVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                pr prVar2 = new pr(bundle2);
                                prVar2.B0(ooVar5.x0);
                                ooVar5.presentFragment(prVar2);
                                break;
                            case 3:
                                oo ooVar6 = this.b;
                                ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                break;
                            case 4:
                                oo ooVar7 = this.b;
                                ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                break;
                            case 5:
                                oo ooVar8 = this.b;
                                ooVar8.getClass();
                                ooVar8.presentFragment(new sb(ooVar8.w0));
                                break;
                            case 6:
                                oo ooVar9 = this.b;
                                ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                break;
                            case 7:
                                oo ooVar10 = this.b;
                                ooVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", ooVar10.B0);
                                ooVar10.presentFragment(new oa(bundle3));
                                break;
                            case 8:
                                oo ooVar11 = this.b;
                                ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                break;
                            case 9:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                break;
                            case 12:
                                this.b.m0();
                                break;
                            case 13:
                                oo.b0(this.b);
                                break;
                            case 14:
                                oo ooVar12 = this.b;
                                org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                break;
                            case 15:
                                oo ooVar13 = this.b;
                                if (org.telegram.messenger.i0.J1(ooVar13)) {
                                    yb0 yb0Var = new yb0(4);
                                    yb0Var.n0 = -ooVar13.v0;
                                    TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    yb0Var.N0 = new go(ooVar13, 6);
                                    ooVar13.presentFragment(yb0Var);
                                    break;
                                }
                                break;
                            case 16:
                                oo ooVar14 = this.b;
                                long j112 = ooVar14.v0;
                                org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                cp cpVar = new cp(null);
                                cpVar.M = new ArrayList();
                                cpVar.N = new ArrayList();
                                cpVar.P = new ArrayList();
                                cpVar.c0 = true;
                                cpVar.f0 = new ArrayList();
                                cpVar.o0 = new HashMap();
                                cpVar.q0 = new ro(cpVar, 5);
                                cpVar.s0 = false;
                                cpVar.Z = j112;
                                cpVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                cpVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        cpVar.l0 = tL_chatInviteExported;
                                    } else {
                                        cpVar.c0(false);
                                    }
                                }
                                ooVar14.presentFragment(cpVar);
                                break;
                            case 17:
                                oo ooVar15 = this.b;
                                long j12 = ooVar15.v0;
                                qp qpVar = new qp(null);
                                qpVar.w = new ArrayList();
                                boolean z162 = false;
                                qpVar.O = false;
                                qpVar.P = false;
                                qpVar.E = j12;
                                TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                qpVar.f = L02;
                                if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                    z162 = true;
                                }
                                qpVar.s = z162;
                                qpVar.h = ooVar15.x0;
                                ooVar15.presentFragment(qpVar);
                                break;
                            case 18:
                                oo ooVar16 = this.b;
                                rt0 rt0Var = new rt0(ooVar16.v0);
                                rt0Var.s = new go(ooVar16, 4);
                                ooVar16.presentFragment(rt0Var);
                                break;
                            case 19:
                                oo.d0(this.b);
                                break;
                            case 20:
                                oo ooVar17 = this.b;
                                i50 i50Var = new i50(-ooVar17.w0.id);
                                i50Var.c = ooVar17.L0;
                                i50Var.l0 = ooVar17;
                                ooVar17.presentFragment(i50Var);
                                break;
                            case 21:
                                oo ooVar18 = this.b;
                                ooVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", ooVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                pr prVar3 = new pr(bundle4);
                                prVar3.B0(ooVar18.x0);
                                ooVar18.presentFragment(prVar3);
                                break;
                            case 22:
                                oo ooVar19 = this.b;
                                kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                ooVar19.presentFragment(kg0Var);
                                break;
                            case 23:
                                oo ooVar20 = this.b;
                                if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                    ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", ooVar20.v0);
                                    xp xpVar = new xp(bundle5);
                                    TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                    xpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xpVar.a == null) {
                                            xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                        }
                                        xpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                    xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                }
                                            }
                                            xpVar.w = 1;
                                        }
                                    }
                                    ooVar20.presentFragment(xpVar);
                                    break;
                                }
                            default:
                                oo ooVar21 = this.b;
                                ooVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", ooVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                ooVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i12 = i17;
            }
            if (!ooVar.I0 && ooVar.w0.creator) {
                org.telegram.ui.Cells.p8 p8Var13 = new org.telegram.ui.Cells.p8(23, context, null, false, true);
                context2 = context;
                ooVar.Q = p8Var13;
                org.telegram.ui.ActionBar.a7.S(p8Var13, org.telegram.ui.ActionBar.t6.N0(true), org.telegram.ui.ActionBar.a7.N(i10), org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                ooVar.Q.n(R.drawable.msg_topics, org.telegram.messenger.cd.K0(2131752281), ooVar.E0);
                ooVar.Q.getCheckBox().setIcon(ooVar.F0 ? 0 : R.drawable.permission_locked);
                ooVar.F.addView(ooVar.Q, w7.b6.c(-2.0f, -1));
                ooVar.Q.setOnClickListener(new ud(7, ooVar, frameLayout));
            } else {
                context2 = context;
            }
            ooVar.s0();
        } else {
            i10 = i19;
            context2 = context;
            i11 = 2;
            num = 1;
            i12 = 6;
            ooVar = this;
        }
        ooVar.simpleActionBar.o();
        if (ooVar.C0 != null || org.telegram.messenger.w3.d(ooVar.w0) || ooVar.N != null) {
            ooVar.a = ooVar.simpleActionBar.n(org.telegram.messenger.cd.K0(2131745963));
        }
        if (ooVar.H == null && ooVar.N == null && ooVar.I == null && ooVar.J == null && ooVar.Q == null) {
            i13 = -1;
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(12, context2, ooVar.resourceProvider);
            ooVar.P = b9Var;
            if (ooVar.Q != null) {
                b9Var.setText(org.telegram.messenger.cd.K0(2131750589));
            } else {
                b9Var.setFixedSize(12);
            }
            i13 = -1;
            hn0Var.addView(ooVar.P, w7.b6.o(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        ooVar.R = linearLayout5;
        linearLayout5.setOrientation(1);
        hn0Var.addView(ooVar.R, w7.b6.o(i13, -2));
        if (ooVar.w0 != null) {
            org.telegram.ui.Cells.p8 p8Var14 = new org.telegram.ui.Cells.p8(context2);
            ooVar.X = p8Var14;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.t6.N0(false);
            int i33 = org.telegram.ui.ActionBar.t6.i6;
            w6Var = null;
            org.telegram.ui.ActionBar.a7.S(p8Var14, N0, null, org.telegram.ui.ActionBar.a7.N(i33));
            org.telegram.ui.Cells.p8 p8Var15 = ooVar.X;
            if (!org.telegram.messenger.w3.T(ooVar.w0)) {
                TLRPC.Chat chat5 = ooVar.w0;
                if (!chat5.creator && (!org.telegram.messenger.w3.N(chat5) || !org.telegram.messenger.w3.d(ooVar.w0))) {
                    i15 = 8;
                    p8Var15.setVisibility(i15);
                    final int i34 = 21;
                    ooVar.X.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j12 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j12;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.p8 p8Var16 = new org.telegram.ui.Cells.p8(context2);
                    ooVar.V = p8Var16;
                    org.telegram.ui.ActionBar.a7.S(p8Var16, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                    final int i35 = 22;
                    ooVar.V.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i35) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j12 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j12;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.p8 p8Var17 = new org.telegram.ui.Cells.p8(context2);
                    ooVar.O = p8Var17;
                    org.telegram.ui.ActionBar.a7.S(p8Var17, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                    final int i36 = 23;
                    ooVar.O.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j12 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j12;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    if (org.telegram.messenger.w3.y(28, ooVar.w0)) {
                        org.telegram.ui.Cells.p8 p8Var18 = new org.telegram.ui.Cells.p8(context2);
                        ooVar.e0 = p8Var18;
                        org.telegram.ui.ActionBar.a7.S(p8Var18, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                        final int i37 = 24;
                        ooVar.e0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ oo b;

                            {
                                this.b = ooVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i37) {
                                    case 0:
                                        oo ooVar3 = this.b;
                                        ooVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ooVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        pr prVar = new pr(bundle);
                                        prVar.B0(ooVar3.x0);
                                        ooVar3.presentFragment(prVar);
                                        break;
                                    case 1:
                                        oo ooVar4 = this.b;
                                        lo loVar = ooVar4.Q0;
                                        long j102 = ooVar4.B0;
                                        if (!ooVar4.s.g()) {
                                            org.telegram.messenger.ic icVar = null;
                                            TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                            if (Z1 == null) {
                                                TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = L0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                    int i222 = chatPhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i222;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                    int i232 = userProfilePhoto2.dc_id;
                                                    if (i232 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i232;
                                                    }
                                                    PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        oo ooVar5 = this.b;
                                        ooVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ooVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        pr prVar2 = new pr(bundle2);
                                        prVar2.B0(ooVar5.x0);
                                        ooVar5.presentFragment(prVar2);
                                        break;
                                    case 3:
                                        oo ooVar6 = this.b;
                                        ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                        break;
                                    case 4:
                                        oo ooVar7 = this.b;
                                        ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                        break;
                                    case 5:
                                        oo ooVar8 = this.b;
                                        ooVar8.getClass();
                                        ooVar8.presentFragment(new sb(ooVar8.w0));
                                        break;
                                    case 6:
                                        oo ooVar9 = this.b;
                                        ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                        break;
                                    case 7:
                                        oo ooVar10 = this.b;
                                        ooVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ooVar10.B0);
                                        ooVar10.presentFragment(new oa(bundle3));
                                        break;
                                    case 8:
                                        oo ooVar11 = this.b;
                                        ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                        break;
                                    case 9:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.m0();
                                        break;
                                    case 13:
                                        oo.b0(this.b);
                                        break;
                                    case 14:
                                        oo ooVar12 = this.b;
                                        org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                        break;
                                    case 15:
                                        oo ooVar13 = this.b;
                                        if (org.telegram.messenger.i0.J1(ooVar13)) {
                                            yb0 yb0Var = new yb0(4);
                                            yb0Var.n0 = -ooVar13.v0;
                                            TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            yb0Var.N0 = new go(ooVar13, 6);
                                            ooVar13.presentFragment(yb0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        oo ooVar14 = this.b;
                                        long j112 = ooVar14.v0;
                                        org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        cp cpVar = new cp(null);
                                        cpVar.M = new ArrayList();
                                        cpVar.N = new ArrayList();
                                        cpVar.P = new ArrayList();
                                        cpVar.c0 = true;
                                        cpVar.f0 = new ArrayList();
                                        cpVar.o0 = new HashMap();
                                        cpVar.q0 = new ro(cpVar, 5);
                                        cpVar.s0 = false;
                                        cpVar.Z = j112;
                                        cpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                        cpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                cpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                cpVar.c0(false);
                                            }
                                        }
                                        ooVar14.presentFragment(cpVar);
                                        break;
                                    case 17:
                                        oo ooVar15 = this.b;
                                        long j12 = ooVar15.v0;
                                        qp qpVar = new qp(null);
                                        qpVar.w = new ArrayList();
                                        boolean z162 = false;
                                        qpVar.O = false;
                                        qpVar.P = false;
                                        qpVar.E = j12;
                                        TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                        qpVar.f = L02;
                                        if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        qpVar.s = z162;
                                        qpVar.h = ooVar15.x0;
                                        ooVar15.presentFragment(qpVar);
                                        break;
                                    case 18:
                                        oo ooVar16 = this.b;
                                        rt0 rt0Var = new rt0(ooVar16.v0);
                                        rt0Var.s = new go(ooVar16, 4);
                                        ooVar16.presentFragment(rt0Var);
                                        break;
                                    case 19:
                                        oo.d0(this.b);
                                        break;
                                    case 20:
                                        oo ooVar17 = this.b;
                                        i50 i50Var = new i50(-ooVar17.w0.id);
                                        i50Var.c = ooVar17.L0;
                                        i50Var.l0 = ooVar17;
                                        ooVar17.presentFragment(i50Var);
                                        break;
                                    case 21:
                                        oo ooVar18 = this.b;
                                        ooVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ooVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                        pr prVar3 = new pr(bundle4);
                                        prVar3.B0(ooVar18.x0);
                                        ooVar18.presentFragment(prVar3);
                                        break;
                                    case 22:
                                        oo ooVar19 = this.b;
                                        kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                        kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                        ooVar19.presentFragment(kg0Var);
                                        break;
                                    case 23:
                                        oo ooVar20 = this.b;
                                        if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                            ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ooVar20.v0);
                                            xp xpVar = new xp(bundle5);
                                            TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                            xpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xpVar.a == null) {
                                                    xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                                }
                                                xpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                        if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                            xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                        }
                                                    }
                                                    xpVar.w = 1;
                                                }
                                            }
                                            ooVar20.presentFragment(xpVar);
                                            break;
                                        }
                                    default:
                                        oo ooVar21 = this.b;
                                        ooVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", ooVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                        ooVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                        ooVar.j0();
                    }
                    org.telegram.ui.Cells.p8 p8Var19 = new org.telegram.ui.Cells.p8(context2);
                    ooVar.W = p8Var19;
                    final int i38 = 0;
                    org.telegram.ui.ActionBar.a7.S(p8Var19, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                    ooVar.W.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i38) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j12 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j12;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.p8 p8Var20 = new org.telegram.ui.Cells.p8(context2);
                    ooVar.T = p8Var20;
                    org.telegram.ui.ActionBar.a7.S(p8Var20, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                    ooVar.T.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j12 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j12;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    if (org.telegram.messenger.w3.V(ooVar.w0)) {
                        org.telegram.ui.Cells.p8 p8Var21 = new org.telegram.ui.Cells.p8(context2);
                        ooVar.U = p8Var21;
                        org.telegram.ui.ActionBar.a7.S(p8Var21, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                        final int i39 = 3;
                        ooVar.U.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ oo b;

                            {
                                this.b = ooVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i39) {
                                    case 0:
                                        oo ooVar3 = this.b;
                                        ooVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ooVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        pr prVar = new pr(bundle);
                                        prVar.B0(ooVar3.x0);
                                        ooVar3.presentFragment(prVar);
                                        break;
                                    case 1:
                                        oo ooVar4 = this.b;
                                        lo loVar = ooVar4.Q0;
                                        long j102 = ooVar4.B0;
                                        if (!ooVar4.s.g()) {
                                            org.telegram.messenger.ic icVar = null;
                                            TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                            if (Z1 == null) {
                                                TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = L0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                    int i222 = chatPhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i222;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                    int i232 = userProfilePhoto2.dc_id;
                                                    if (i232 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i232;
                                                    }
                                                    PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        oo ooVar5 = this.b;
                                        ooVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ooVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        pr prVar2 = new pr(bundle2);
                                        prVar2.B0(ooVar5.x0);
                                        ooVar5.presentFragment(prVar2);
                                        break;
                                    case 3:
                                        oo ooVar6 = this.b;
                                        ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                        break;
                                    case 4:
                                        oo ooVar7 = this.b;
                                        ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                        break;
                                    case 5:
                                        oo ooVar8 = this.b;
                                        ooVar8.getClass();
                                        ooVar8.presentFragment(new sb(ooVar8.w0));
                                        break;
                                    case 6:
                                        oo ooVar9 = this.b;
                                        ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                        break;
                                    case 7:
                                        oo ooVar10 = this.b;
                                        ooVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ooVar10.B0);
                                        ooVar10.presentFragment(new oa(bundle3));
                                        break;
                                    case 8:
                                        oo ooVar11 = this.b;
                                        ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                        break;
                                    case 9:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.m0();
                                        break;
                                    case 13:
                                        oo.b0(this.b);
                                        break;
                                    case 14:
                                        oo ooVar12 = this.b;
                                        org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                        break;
                                    case 15:
                                        oo ooVar13 = this.b;
                                        if (org.telegram.messenger.i0.J1(ooVar13)) {
                                            yb0 yb0Var = new yb0(4);
                                            yb0Var.n0 = -ooVar13.v0;
                                            TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            yb0Var.N0 = new go(ooVar13, 6);
                                            ooVar13.presentFragment(yb0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        oo ooVar14 = this.b;
                                        long j112 = ooVar14.v0;
                                        org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        cp cpVar = new cp(null);
                                        cpVar.M = new ArrayList();
                                        cpVar.N = new ArrayList();
                                        cpVar.P = new ArrayList();
                                        cpVar.c0 = true;
                                        cpVar.f0 = new ArrayList();
                                        cpVar.o0 = new HashMap();
                                        cpVar.q0 = new ro(cpVar, 5);
                                        cpVar.s0 = false;
                                        cpVar.Z = j112;
                                        cpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                        cpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                cpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                cpVar.c0(false);
                                            }
                                        }
                                        ooVar14.presentFragment(cpVar);
                                        break;
                                    case 17:
                                        oo ooVar15 = this.b;
                                        long j12 = ooVar15.v0;
                                        qp qpVar = new qp(null);
                                        qpVar.w = new ArrayList();
                                        boolean z162 = false;
                                        qpVar.O = false;
                                        qpVar.P = false;
                                        qpVar.E = j12;
                                        TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                        qpVar.f = L02;
                                        if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        qpVar.s = z162;
                                        qpVar.h = ooVar15.x0;
                                        ooVar15.presentFragment(qpVar);
                                        break;
                                    case 18:
                                        oo ooVar16 = this.b;
                                        rt0 rt0Var = new rt0(ooVar16.v0);
                                        rt0Var.s = new go(ooVar16, 4);
                                        ooVar16.presentFragment(rt0Var);
                                        break;
                                    case 19:
                                        oo.d0(this.b);
                                        break;
                                    case 20:
                                        oo ooVar17 = this.b;
                                        i50 i50Var = new i50(-ooVar17.w0.id);
                                        i50Var.c = ooVar17.L0;
                                        i50Var.l0 = ooVar17;
                                        ooVar17.presentFragment(i50Var);
                                        break;
                                    case 21:
                                        oo ooVar18 = this.b;
                                        ooVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ooVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                        pr prVar3 = new pr(bundle4);
                                        prVar3.B0(ooVar18.x0);
                                        ooVar18.presentFragment(prVar3);
                                        break;
                                    case 22:
                                        oo ooVar19 = this.b;
                                        kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                        kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                        ooVar19.presentFragment(kg0Var);
                                        break;
                                    case 23:
                                        oo ooVar20 = this.b;
                                        if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                            ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ooVar20.v0);
                                            xp xpVar = new xp(bundle5);
                                            TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                            xpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xpVar.a == null) {
                                                    xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                                }
                                                xpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                        if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                            xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                        }
                                                    }
                                                    xpVar.w = 1;
                                                }
                                            }
                                            ooVar20.presentFragment(xpVar);
                                            break;
                                        }
                                    default:
                                        oo ooVar21 = this.b;
                                        ooVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", ooVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                        ooVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.p8 p8Var22 = new org.telegram.ui.Cells.p8(context2);
                    ooVar.Z = p8Var22;
                    p8Var22.o(R.drawable.menu_feature_premium, h0(org.telegram.messenger.cd.K0(2131752471)), false);
                    org.telegram.ui.ActionBar.a7.S(ooVar.Z, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                    final int i40 = 4;
                    ooVar.Z.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i40) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j12 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j12;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    ooVar.Z.setVisibility(8);
                    if (!org.telegram.messenger.w3.T(ooVar.w0) || ooVar.w0.gigagroup) {
                        org.telegram.ui.Cells.p8 p8Var23 = new org.telegram.ui.Cells.p8(context2);
                        ooVar.Y = p8Var23;
                        p8Var23.o(R.drawable.msg_log, org.telegram.messenger.cd.K0(2131751080), false);
                        org.telegram.ui.ActionBar.a7.S(ooVar.Y, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                        final int i41 = 5;
                        ooVar.Y.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ oo b;

                            {
                                this.b = ooVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i41) {
                                    case 0:
                                        oo ooVar3 = this.b;
                                        ooVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ooVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        pr prVar = new pr(bundle);
                                        prVar.B0(ooVar3.x0);
                                        ooVar3.presentFragment(prVar);
                                        break;
                                    case 1:
                                        oo ooVar4 = this.b;
                                        lo loVar = ooVar4.Q0;
                                        long j102 = ooVar4.B0;
                                        if (!ooVar4.s.g()) {
                                            org.telegram.messenger.ic icVar = null;
                                            TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                            if (Z1 == null) {
                                                TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = L0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                    int i222 = chatPhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i222;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                    int i232 = userProfilePhoto2.dc_id;
                                                    if (i232 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i232;
                                                    }
                                                    PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        oo ooVar5 = this.b;
                                        ooVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ooVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        pr prVar2 = new pr(bundle2);
                                        prVar2.B0(ooVar5.x0);
                                        ooVar5.presentFragment(prVar2);
                                        break;
                                    case 3:
                                        oo ooVar6 = this.b;
                                        ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                        break;
                                    case 4:
                                        oo ooVar7 = this.b;
                                        ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                        break;
                                    case 5:
                                        oo ooVar8 = this.b;
                                        ooVar8.getClass();
                                        ooVar8.presentFragment(new sb(ooVar8.w0));
                                        break;
                                    case 6:
                                        oo ooVar9 = this.b;
                                        ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                        break;
                                    case 7:
                                        oo ooVar10 = this.b;
                                        ooVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ooVar10.B0);
                                        ooVar10.presentFragment(new oa(bundle3));
                                        break;
                                    case 8:
                                        oo ooVar11 = this.b;
                                        ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                        break;
                                    case 9:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.m0();
                                        break;
                                    case 13:
                                        oo.b0(this.b);
                                        break;
                                    case 14:
                                        oo ooVar12 = this.b;
                                        org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                        break;
                                    case 15:
                                        oo ooVar13 = this.b;
                                        if (org.telegram.messenger.i0.J1(ooVar13)) {
                                            yb0 yb0Var = new yb0(4);
                                            yb0Var.n0 = -ooVar13.v0;
                                            TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            yb0Var.N0 = new go(ooVar13, 6);
                                            ooVar13.presentFragment(yb0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        oo ooVar14 = this.b;
                                        long j112 = ooVar14.v0;
                                        org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        cp cpVar = new cp(null);
                                        cpVar.M = new ArrayList();
                                        cpVar.N = new ArrayList();
                                        cpVar.P = new ArrayList();
                                        cpVar.c0 = true;
                                        cpVar.f0 = new ArrayList();
                                        cpVar.o0 = new HashMap();
                                        cpVar.q0 = new ro(cpVar, 5);
                                        cpVar.s0 = false;
                                        cpVar.Z = j112;
                                        cpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                        cpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                cpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                cpVar.c0(false);
                                            }
                                        }
                                        ooVar14.presentFragment(cpVar);
                                        break;
                                    case 17:
                                        oo ooVar15 = this.b;
                                        long j12 = ooVar15.v0;
                                        qp qpVar = new qp(null);
                                        qpVar.w = new ArrayList();
                                        boolean z162 = false;
                                        qpVar.O = false;
                                        qpVar.P = false;
                                        qpVar.E = j12;
                                        TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                        qpVar.f = L02;
                                        if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        qpVar.s = z162;
                                        qpVar.h = ooVar15.x0;
                                        ooVar15.presentFragment(qpVar);
                                        break;
                                    case 18:
                                        oo ooVar16 = this.b;
                                        rt0 rt0Var = new rt0(ooVar16.v0);
                                        rt0Var.s = new go(ooVar16, 4);
                                        ooVar16.presentFragment(rt0Var);
                                        break;
                                    case 19:
                                        oo.d0(this.b);
                                        break;
                                    case 20:
                                        oo ooVar17 = this.b;
                                        i50 i50Var = new i50(-ooVar17.w0.id);
                                        i50Var.c = ooVar17.L0;
                                        i50Var.l0 = ooVar17;
                                        ooVar17.presentFragment(i50Var);
                                        break;
                                    case 21:
                                        oo ooVar18 = this.b;
                                        ooVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ooVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                        pr prVar3 = new pr(bundle4);
                                        prVar3.B0(ooVar18.x0);
                                        ooVar18.presentFragment(prVar3);
                                        break;
                                    case 22:
                                        oo ooVar19 = this.b;
                                        kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                        kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                        ooVar19.presentFragment(kg0Var);
                                        break;
                                    case 23:
                                        oo ooVar20 = this.b;
                                        if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                            ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ooVar20.v0);
                                            xp xpVar = new xp(bundle5);
                                            TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                            xpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xpVar.a == null) {
                                                    xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                                }
                                                xpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                        if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                            xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                        }
                                                    }
                                                    xpVar.w = 1;
                                                }
                                            }
                                            ooVar20.presentFragment(xpVar);
                                            break;
                                        }
                                    default:
                                        oo ooVar21 = this.b;
                                        ooVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", ooVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                        ooVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (org.telegram.messenger.w3.R(ooVar.w0)) {
                        org.telegram.ui.Cells.p8 p8Var24 = new org.telegram.ui.Cells.p8(context2);
                        ooVar.a0 = p8Var24;
                        p8Var24.o(R.drawable.msg_stats, org.telegram.messenger.cd.K0(2131744909), true);
                        org.telegram.ui.ActionBar.a7.S(ooVar.a0, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
                        ooVar.a0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ oo b;

                            {
                                this.b = ooVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i12) {
                                    case 0:
                                        oo ooVar3 = this.b;
                                        ooVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", ooVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        pr prVar = new pr(bundle);
                                        prVar.B0(ooVar3.x0);
                                        ooVar3.presentFragment(prVar);
                                        break;
                                    case 1:
                                        oo ooVar4 = this.b;
                                        lo loVar = ooVar4.Q0;
                                        long j102 = ooVar4.B0;
                                        if (!ooVar4.s.g()) {
                                            org.telegram.messenger.ic icVar = null;
                                            TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                            if (Z1 == null) {
                                                TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = L0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                    int i222 = chatPhoto2.dc_id;
                                                    if (i222 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i222;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, ooVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                    int i232 = userProfilePhoto2.dc_id;
                                                    if (i232 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i232;
                                                    }
                                                    PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        oo ooVar5 = this.b;
                                        ooVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", ooVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        pr prVar2 = new pr(bundle2);
                                        prVar2.B0(ooVar5.x0);
                                        ooVar5.presentFragment(prVar2);
                                        break;
                                    case 3:
                                        oo ooVar6 = this.b;
                                        ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                        break;
                                    case 4:
                                        oo ooVar7 = this.b;
                                        ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                        break;
                                    case 5:
                                        oo ooVar8 = this.b;
                                        ooVar8.getClass();
                                        ooVar8.presentFragment(new sb(ooVar8.w0));
                                        break;
                                    case 6:
                                        oo ooVar9 = this.b;
                                        ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                        break;
                                    case 7:
                                        oo ooVar10 = this.b;
                                        ooVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", ooVar10.B0);
                                        ooVar10.presentFragment(new oa(bundle3));
                                        break;
                                    case 8:
                                        oo ooVar11 = this.b;
                                        ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                        break;
                                    case 9:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.m0();
                                        break;
                                    case 13:
                                        oo.b0(this.b);
                                        break;
                                    case 14:
                                        oo ooVar12 = this.b;
                                        org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                        break;
                                    case 15:
                                        oo ooVar13 = this.b;
                                        if (org.telegram.messenger.i0.J1(ooVar13)) {
                                            yb0 yb0Var = new yb0(4);
                                            yb0Var.n0 = -ooVar13.v0;
                                            TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            yb0Var.N0 = new go(ooVar13, 6);
                                            ooVar13.presentFragment(yb0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        oo ooVar14 = this.b;
                                        long j112 = ooVar14.v0;
                                        org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        cp cpVar = new cp(null);
                                        cpVar.M = new ArrayList();
                                        cpVar.N = new ArrayList();
                                        cpVar.P = new ArrayList();
                                        cpVar.c0 = true;
                                        cpVar.f0 = new ArrayList();
                                        cpVar.o0 = new HashMap();
                                        cpVar.q0 = new ro(cpVar, 5);
                                        cpVar.s0 = false;
                                        cpVar.Z = j112;
                                        cpVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                        cpVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                cpVar.l0 = tL_chatInviteExported;
                                            } else {
                                                cpVar.c0(false);
                                            }
                                        }
                                        ooVar14.presentFragment(cpVar);
                                        break;
                                    case 17:
                                        oo ooVar15 = this.b;
                                        long j12 = ooVar15.v0;
                                        qp qpVar = new qp(null);
                                        qpVar.w = new ArrayList();
                                        boolean z162 = false;
                                        qpVar.O = false;
                                        qpVar.P = false;
                                        qpVar.E = j12;
                                        TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                                        qpVar.f = L02;
                                        if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        qpVar.s = z162;
                                        qpVar.h = ooVar15.x0;
                                        ooVar15.presentFragment(qpVar);
                                        break;
                                    case 18:
                                        oo ooVar16 = this.b;
                                        rt0 rt0Var = new rt0(ooVar16.v0);
                                        rt0Var.s = new go(ooVar16, 4);
                                        ooVar16.presentFragment(rt0Var);
                                        break;
                                    case 19:
                                        oo.d0(this.b);
                                        break;
                                    case 20:
                                        oo ooVar17 = this.b;
                                        i50 i50Var = new i50(-ooVar17.w0.id);
                                        i50Var.c = ooVar17.L0;
                                        i50Var.l0 = ooVar17;
                                        ooVar17.presentFragment(i50Var);
                                        break;
                                    case 21:
                                        oo ooVar18 = this.b;
                                        ooVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", ooVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                        pr prVar3 = new pr(bundle4);
                                        prVar3.B0(ooVar18.x0);
                                        ooVar18.presentFragment(prVar3);
                                        break;
                                    case 22:
                                        oo ooVar19 = this.b;
                                        kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                        kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                        ooVar19.presentFragment(kg0Var);
                                        break;
                                    case 23:
                                        oo ooVar20 = this.b;
                                        if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                            ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", ooVar20.v0);
                                            xp xpVar = new xp(bundle5);
                                            TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                            xpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xpVar.a == null) {
                                                    xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                                }
                                                xpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                        if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                            xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                        }
                                                    }
                                                    xpVar.w = 1;
                                                }
                                            }
                                            ooVar20.presentFragment(xpVar);
                                            break;
                                        }
                                    default:
                                        oo ooVar21 = this.b;
                                        ooVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", ooVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                        ooVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    ooVar.R.addView(ooVar.O, w7.b6.o(-1, -2));
                    p8Var = ooVar.e0;
                    if (p8Var != null) {
                        ooVar.R.addView(p8Var, w7.b6.o(-1, -2));
                    }
                    if (!ooVar.I0 && !ooVar.w0.gigagroup) {
                        ooVar.R.addView(ooVar.X, w7.b6.o(-1, -2));
                    }
                    if (!ooVar.I0) {
                        ooVar.R.addView(ooVar.V, w7.b6.o(-1, -2));
                    }
                    ooVar.R.addView(ooVar.W, w7.b6.o(-1, -2));
                    ooVar.R.addView(ooVar.T, w7.b6.o(-1, -2));
                    p8Var2 = ooVar.U;
                    if (p8Var2 != null && (chatFull2 = ooVar.x0) != null && chatFull2.requests_pending > 0) {
                        ooVar.R.addView(p8Var2, w7.b6.o(-1, -2));
                    }
                    if (ooVar.I0) {
                        ooVar.R.addView(ooVar.V, w7.b6.o(-1, -2));
                    }
                    if (!ooVar.I0 || ooVar.w0.gigagroup) {
                        i16 = -1;
                        ooVar.R.addView(ooVar.X, w7.b6.o(-1, -2));
                    } else {
                        i16 = -1;
                    }
                    p8Var3 = ooVar.a0;
                    if (p8Var3 != null) {
                        ooVar.R.addView(p8Var3, w7.b6.o(i16, -2));
                    }
                    p8Var4 = ooVar.Y;
                    if (p8Var4 != null) {
                        ooVar.R.addView(p8Var4, w7.b6.o(i16, -2));
                    }
                    p8Var5 = ooVar.Z;
                    if (p8Var5 != null) {
                        ooVar.R.addView(p8Var5, w7.b6.o(i16, -2));
                    }
                    if (ooVar.Z != null && ooVar.getMessagesController().h6 && org.telegram.messenger.w3.V(ooVar.w0)) {
                        ooVar.Z.setVisibility(0);
                    }
                    p8Var6 = ooVar.Y;
                    if (p8Var6 != null) {
                        org.telegram.ui.Cells.p8 p8Var25 = ooVar.Z;
                        p8Var6.setNeedDivider(p8Var25 != null && p8Var25.getVisibility() == 0);
                    }
                }
            }
            i15 = 0;
            p8Var15.setVisibility(i15);
            final int i342 = 21;
            ooVar.X.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var162 = new org.telegram.ui.Cells.p8(context2);
            ooVar.V = p8Var162;
            org.telegram.ui.ActionBar.a7.S(p8Var162, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
            final int i352 = 22;
            ooVar.V.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var172 = new org.telegram.ui.Cells.p8(context2);
            ooVar.O = p8Var172;
            org.telegram.ui.ActionBar.a7.S(p8Var172, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
            final int i362 = 23;
            ooVar.O.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.w3.y(28, ooVar.w0)) {
            }
            org.telegram.ui.Cells.p8 p8Var192 = new org.telegram.ui.Cells.p8(context2);
            ooVar.W = p8Var192;
            final int i382 = 0;
            org.telegram.ui.ActionBar.a7.S(p8Var192, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
            ooVar.W.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i382) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var202 = new org.telegram.ui.Cells.p8(context2);
            ooVar.T = p8Var202;
            org.telegram.ui.ActionBar.a7.S(p8Var202, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
            ooVar.T.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.w3.V(ooVar.w0)) {
            }
            org.telegram.ui.Cells.p8 p8Var222 = new org.telegram.ui.Cells.p8(context2);
            ooVar.Z = p8Var222;
            p8Var222.o(R.drawable.menu_feature_premium, h0(org.telegram.messenger.cd.K0(2131752471)), false);
            org.telegram.ui.ActionBar.a7.S(ooVar.Z, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
            final int i402 = 4;
            ooVar.Z.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i402) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            ooVar.Z.setVisibility(8);
            if (!org.telegram.messenger.w3.T(ooVar.w0)) {
            }
            org.telegram.ui.Cells.p8 p8Var232 = new org.telegram.ui.Cells.p8(context2);
            ooVar.Y = p8Var232;
            p8Var232.o(R.drawable.msg_log, org.telegram.messenger.cd.K0(2131751080), false);
            org.telegram.ui.ActionBar.a7.S(ooVar.Y, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i33));
            final int i412 = 5;
            ooVar.Y.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i412) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.w3.R(ooVar.w0)) {
            }
            ooVar.R.addView(ooVar.O, w7.b6.o(-1, -2));
            p8Var = ooVar.e0;
            if (p8Var != null) {
            }
            if (!ooVar.I0) {
                ooVar.R.addView(ooVar.X, w7.b6.o(-1, -2));
            }
            if (!ooVar.I0) {
            }
            ooVar.R.addView(ooVar.W, w7.b6.o(-1, -2));
            ooVar.R.addView(ooVar.T, w7.b6.o(-1, -2));
            p8Var2 = ooVar.U;
            if (p8Var2 != null) {
                ooVar.R.addView(p8Var2, w7.b6.o(-1, -2));
            }
            if (ooVar.I0) {
            }
            if (ooVar.I0) {
            }
            i16 = -1;
            ooVar.R.addView(ooVar.X, w7.b6.o(-1, -2));
            p8Var3 = ooVar.a0;
            if (p8Var3 != null) {
            }
            p8Var4 = ooVar.Y;
            if (p8Var4 != null) {
            }
            p8Var5 = ooVar.Z;
            if (p8Var5 != null) {
            }
            if (ooVar.Z != null) {
                ooVar.Z.setVisibility(0);
            }
            p8Var6 = ooVar.Y;
            if (p8Var6 != null) {
            }
        } else {
            w6Var = null;
        }
        if (ooVar.C0 != null) {
            org.telegram.ui.Cells.p8 p8Var26 = new org.telegram.ui.Cells.p8(context2);
            ooVar.k0 = p8Var26;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.t6.N0(false);
            int i42 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.S(p8Var26, N02, w6Var, org.telegram.ui.ActionBar.a7.N(i42));
            ooVar.k0.setPrioritizeTitleOverValue(true);
            ooVar.R.addView(ooVar.k0, w7.b6.o(-1, -2));
            final int i43 = 7;
            ooVar.k0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i43) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            ooVar.v0();
            org.telegram.ui.Cells.p8 p8Var27 = new org.telegram.ui.Cells.p8(context2);
            ooVar.n0 = p8Var27;
            org.telegram.ui.ActionBar.a7.S(p8Var27, org.telegram.ui.ActionBar.t6.N0(false), w6Var, org.telegram.ui.ActionBar.a7.N(i42));
            ooVar.n0.s(h0(org.telegram.messenger.cd.K0(2131754346)), "", R.drawable.msg_shareout, true);
            ooVar.R.addView(ooVar.n0, w7.b6.o(-1, -2));
            final int i44 = 8;
            ooVar.n0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            ooVar.n0.h(45, ooVar.D0 == null, false);
            TLRPC.UserFull userFull = ooVar.D0;
            if (userFull != null) {
                org.telegram.ui.Cells.p8 p8Var28 = ooVar.n0;
                if (userFull.starref_program == null) {
                    format = org.telegram.messenger.cd.K0(2131754345);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r1.commission_permille / 10.0f));
                }
                p8Var28.w(format, z11);
            }
            if (!ooVar.getMessagesController().g6) {
                ooVar.n0.setVisibility(8);
            }
            org.telegram.ui.Cells.p8 p8Var29 = new org.telegram.ui.Cells.p8(context2);
            ooVar.o0 = p8Var29;
            org.telegram.ui.ActionBar.a7.S(p8Var29, org.telegram.ui.ActionBar.t6.N0(false), w6Var, org.telegram.ui.ActionBar.a7.N(i42));
            ooVar.o0.o(R.drawable.msg_log, org.telegram.messenger.cd.K0(2131753092), true);
            ooVar.R.addView(ooVar.o0, w7.b6.o(-1, -2));
            final int i45 = 9;
            ooVar.o0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var30 = new org.telegram.ui.Cells.p8(context2);
            ooVar.p0 = p8Var30;
            org.telegram.ui.ActionBar.a7.S(p8Var30, org.telegram.ui.ActionBar.t6.N0(false), w6Var, org.telegram.ui.ActionBar.a7.N(i42));
            ooVar.p0.o(R.drawable.msg_media, org.telegram.messenger.cd.K0(2131753093), true);
            ooVar.R.addView(ooVar.p0, w7.b6.o(-1, -2));
            final int i46 = 10;
            ooVar.p0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i46) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var31 = new org.telegram.ui.Cells.p8(context2);
            ooVar.q0 = p8Var31;
            org.telegram.ui.ActionBar.a7.S(p8Var31, org.telegram.ui.ActionBar.t6.N0(false), w6Var, org.telegram.ui.ActionBar.a7.N(i42));
            ooVar.q0.o(R.drawable.msg_bot, org.telegram.messenger.cd.K0(2131753101), true);
            ooVar.R.addView(ooVar.q0, w7.b6.o(-1, -2));
            final int i47 = 11;
            ooVar.q0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i47) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = ooVar.w0;
        if (chat6 != null) {
            if (!org.telegram.messenger.w3.N(chat6)) {
                ooVar.R.setVisibility(8);
                ooVar.G.setVisibility(8);
            }
            hn0Var.addView(new org.telegram.ui.Cells.c7(context2), w7.b6.o(-1, -2));
        } else if (ooVar.C0 != null) {
            ooVar.r0 = new org.telegram.ui.Cells.b9(12, context2, ooVar.resourceProvider);
            String K0 = org.telegram.messenger.cd.K0(2131753052);
            SpannableString valueOf = SpannableString.valueOf(K0);
            int indexOf = K0.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new no(0), indexOf, indexOf + 10, 33);
            }
            ooVar.r0.setText(valueOf);
            hn0Var.addView(ooVar.r0, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.p8 p8Var32 = new org.telegram.ui.Cells.p8(context2);
            ooVar.t0 = p8Var32;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.t6.N0(true);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
            int i48 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.ActionBar.a7.S(p8Var32, N03, N, org.telegram.ui.ActionBar.a7.N(i48));
            ooVar.t0.o(R.drawable.menu_factcheck, org.telegram.messenger.cd.K0(2131752929), false);
            org.telegram.ui.Cells.p8 p8Var33 = ooVar.t0;
            int i49 = org.telegram.ui.ActionBar.t6.q6;
            p8Var33.g(i49, i49);
            hn0Var.addView(ooVar.t0, w7.b6.o(-1, -2));
            final int i50 = 13;
            ooVar.t0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i50) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j12 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j12;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j12));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(12, context2, ooVar.resourceProvider);
            ooVar.s0 = b9Var2;
            b9Var2.setFixedSize(12);
            hn0Var.addView(ooVar.s0, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.p8 p8Var34 = ooVar.t0;
            TLRPC.UserFull userFull2 = ooVar.D0;
            p8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.b9 b9Var3 = ooVar.s0;
            TLRPC.UserFull userFull3 = ooVar.D0;
            b9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = ooVar.C0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                ooVar.S = linearLayout6;
                linearLayout6.setOrientation(1);
                hn0Var.addView(ooVar.S, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context2);
                p4Var.setText(org.telegram.messenger.cd.K0(2131753112));
                ooVar.S.addView(p4Var, w7.b6.o(-1, -2));
                org.telegram.ui.Cells.p8 p8Var35 = new org.telegram.ui.Cells.p8(context2);
                ooVar.l0 = p8Var35;
                org.telegram.ui.ActionBar.a7.S(p8Var35, org.telegram.ui.ActionBar.t6.N0(false), w6Var, org.telegram.ui.ActionBar.a7.N(i48));
                ooVar.l0.setPrioritizeTitleOverValue(true);
                ooVar.S.addView(ooVar.l0, w7.b6.o(-1, -2));
                final rh.r g10 = rh.r.g(ooVar.currentAccount);
                final int i51 = 0;
                ooVar.l0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.ao
                    public final /* synthetic */ oo b;

                    {
                        this.b = ooVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                oo ooVar3 = this.b;
                                long j12 = ooVar3.B0;
                                if (g10.h(j12, false) != null) {
                                    ooVar3.presentFragment(new rh.i(1, j12));
                                    break;
                                }
                                break;
                            default:
                                oo ooVar4 = this.b;
                                long j13 = ooVar4.B0;
                                if (g10.h(j13, false) != null) {
                                    ooVar4.presentFragment(new rh.i(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.m(j10)) {
                    long i52 = g10.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i52 > 0) {
                        double d = i52 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.i0.o0((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            i14 = i48;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            ooVar.l0.s(org.telegram.messenger.cd.K0(2131753110), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i14 = i48;
                    ooVar.l0.s(org.telegram.messenger.cd.K0(2131753110), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u80(org.telegram.messenger.i0.L(30.0f), ooVar.l0.c), 0, spannableStringBuilder2.length(), 33);
                    ooVar.l0.s(org.telegram.messenger.cd.K0(2131753110), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i14 = i48;
                }
                ooVar.l0.setVisibility(g10.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.p8 p8Var36 = new org.telegram.ui.Cells.p8(context2);
                ooVar.m0 = p8Var36;
                org.telegram.ui.ActionBar.a7.S(p8Var36, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i14));
                final int i53 = 1;
                ooVar.m0.setPrioritizeTitleOverValue(true);
                ooVar.S.addView(ooVar.m0, w7.b6.o(-1, -2));
                ooVar.m0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.ao
                    public final /* synthetic */ oo b;

                    {
                        this.b = ooVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i53) {
                            case 0:
                                oo ooVar3 = this.b;
                                long j12 = ooVar3.B0;
                                if (g10.h(j12, false) != null) {
                                    ooVar3.presentFragment(new rh.i(1, j12));
                                    break;
                                }
                                break;
                            default:
                                oo ooVar4 = this.b;
                                long j13 = ooVar4.B0;
                                if (g10.h(j13, false) != null) {
                                    ooVar4.presentFragment(new rh.i(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g10.h(j10, false) != null) {
                    org.telegram.ui.Cells.p8 p8Var37 = ooVar.m0;
                    String K02 = org.telegram.messenger.cd.K0(2131753111);
                    if (g10.c(j10).amount <= 0) {
                        Z0 = "";
                        z10 = false;
                    } else {
                        z10 = false;
                        Z0 = rh.h8.Z0(false, TextUtils.concat("XTR", rh.h8.M0(g10.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    p8Var37.s(K02, Z0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.u80(org.telegram.messenger.i0.L(30.0f), ooVar.m0.c), 0, spannableStringBuilder3.length(), 33);
                    ooVar.m0.s(org.telegram.messenger.cd.K0(2131753111), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                ooVar.m0.setVisibility(g10.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(12, context2, ooVar.getResourceProvider());
                b9Var4.setFixedSize(12);
                num2 = num;
                b9Var4.setTag(R.id.fit_width_tag, num2);
                hn0Var.addView(b9Var4, w7.b6.o(-1, 12));
                ooVar.S.setVisibility((ooVar.m0.getVisibility() == 0 || ooVar.l0.getVisibility() == 0) ? 0 : 8);
                chat = ooVar.w0;
                if ((chat == null && chat.creator) || ((user = ooVar.C0) != null && user.bot && user.bot_can_edit)) {
                    final long j12 = chat != null ? chat.linked_community_id : ooVar.C0.linked_community_id;
                    final long j13 = chat != null ? -chat.id : ooVar.C0.id;
                    final boolean z17 = ooVar.C0 != null;
                    if (j12 != 0) {
                        zh.b bVar = new zh.b(context2, ooVar.resourceProvider);
                        ooVar.g0 = bVar;
                        bVar.a(ooVar.currentAccount, ooVar.getMessagesController().L0(Long.valueOf(j12)));
                        zh.b bVar2 = ooVar.g0;
                        final int i54 = 0;
                        org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.t6.N0(false);
                        int i55 = org.telegram.ui.ActionBar.t6.i6;
                        org.telegram.ui.ActionBar.a7.S(bVar2, N04, null, org.telegram.ui.ActionBar.a7.N(i55));
                        ooVar.g0.setOnClickListener(new View.OnClickListener(ooVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ oo b;

                            {
                                this.b = ooVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i54) {
                                    case 0:
                                        oo ooVar3 = this.b;
                                        org.telegram.messenger.vp messagesController = ooVar3.getMessagesController();
                                        long j14 = j12;
                                        if (!org.telegram.messenger.w3.N(messagesController.L0(Long.valueOf(j14)))) {
                                            ooVar3.showDialog(new yh.a0(ooVar3, j14, null, null));
                                            break;
                                        } else {
                                            ooVar3.presentFragment(new yh.l(org.telegram.ui.Cells.f1.k(j14, "community_id")));
                                            break;
                                        }
                                    default:
                                        oo ooVar4 = this.b;
                                        ooVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j12);
                                        ooVar4.presentFragment(new yh.e(bundle));
                                        break;
                                }
                            }
                        });
                        hn0Var.addView(ooVar.g0, w7.b6.o(-1, -2));
                        org.telegram.ui.Cells.p8 p8Var38 = new org.telegram.ui.Cells.p8(context2);
                        ooVar.i0 = p8Var38;
                        p8Var38.o(R.drawable.outline_community_remove_24, org.telegram.messenger.cd.K0(z17 ? 2131751884 : ooVar.I0 ? 2131751883 : 2131751882), false);
                        org.telegram.ui.Cells.p8 p8Var39 = ooVar.i0;
                        int i56 = org.telegram.ui.ActionBar.t6.p7;
                        p8Var39.g(i56, i56);
                        org.telegram.ui.ActionBar.a7.S(ooVar.i0, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(i55));
                        org.telegram.ui.Cells.p8 p8Var40 = ooVar.i0;
                        ooVar2 = ooVar;
                        f7 = -2.0f;
                        context3 = context;
                        p8Var40.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.co
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String L0 = org.telegram.messenger.cd.L0(2131751915, null);
                                oo ooVar3 = oo.this;
                                org.telegram.ui.Components.s4.u0(ooVar3, L0, org.telegram.messenger.cd.L0(z17 ? 2131751917 : ooVar3.I0 ? 2131751916 : 2131751914, null), org.telegram.messenger.cd.L0(2131746336, null), true, new ki.d(ooVar3, j13, j12, 3));
                            }
                        });
                        hn0Var.addView(ooVar2.i0, w7.b6.o(-1, -2));
                        org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(12, context3, ooVar2.getResourceProvider());
                        ooVar2.j0 = b9Var5;
                        b9Var5.setFixedSize(14);
                        ooVar2.j0.setTag(R.id.fit_width_tag, num2);
                        hn0Var.addView(ooVar2.j0, w7.b6.o(-1, 14));
                    } else {
                        ooVar2 = ooVar;
                        f7 = -2.0f;
                        context3 = context2;
                        org.telegram.ui.Cells.p8 p8Var41 = new org.telegram.ui.Cells.p8(context3);
                        ooVar2.f0 = p8Var41;
                        p8Var41.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                        org.telegram.ui.ActionBar.a7.X(ooVar2.f0.getTextView(), org.telegram.ui.ActionBar.t6.Wl);
                        org.telegram.ui.ActionBar.a7.S(ooVar2.f0, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                        ooVar2.f0.o(R.drawable.msg_groups, org.telegram.messenger.cd.K0(z17 ? 2131751981 : ooVar2.I0 ? 2131751979 : 2131751976), false);
                        final int i57 = 1;
                        ooVar2.f0.setOnClickListener(new View.OnClickListener(ooVar2) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ oo b;

                            {
                                this.b = ooVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i57) {
                                    case 0:
                                        oo ooVar3 = this.b;
                                        org.telegram.messenger.vp messagesController = ooVar3.getMessagesController();
                                        long j14 = j13;
                                        if (!org.telegram.messenger.w3.N(messagesController.L0(Long.valueOf(j14)))) {
                                            ooVar3.showDialog(new yh.a0(ooVar3, j14, null, null));
                                            break;
                                        } else {
                                            ooVar3.presentFragment(new yh.l(org.telegram.ui.Cells.f1.k(j14, "community_id")));
                                            break;
                                        }
                                    default:
                                        oo ooVar4 = this.b;
                                        ooVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j13);
                                        ooVar4.presentFragment(new yh.e(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.b9 b9Var6 = new org.telegram.ui.Cells.b9(12, context3, ooVar2.resourceProvider);
                        ooVar2.h0 = b9Var6;
                        b9Var6.setText(org.telegram.messenger.cd.K0(z17 ? 2131751980 : ooVar2.I0 ? 2131751978 : 2131751975));
                        hn0Var.addView(ooVar2.f0, w7.b6.o(-1, -2));
                        hn0Var.addView(ooVar2.h0, w7.b6.o(-1, -2));
                    }
                } else {
                    ooVar2 = ooVar;
                    f7 = -2.0f;
                    context3 = context2;
                }
                chat2 = ooVar2.w0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context3);
                    ooVar2.c0 = frameLayout3;
                    hn0Var.addView(frameLayout3, w7.b6.o(-1, -2));
                    org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(context3);
                    ooVar2.d0 = x9Var;
                    org.telegram.ui.ActionBar.a7.V(x9Var.getTextView(), org.telegram.ui.ActionBar.t6.p7, null);
                    org.telegram.ui.ActionBar.a7.S(ooVar2.d0, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
                    if (ooVar2.C0 == null) {
                        ooVar2.d0.b(org.telegram.messenger.cd.K0(2131751567), false);
                    } else if (ooVar2.I0) {
                        ooVar2.d0.b(org.telegram.messenger.cd.K0(2131752422), false);
                    } else {
                        ooVar2.d0.b(org.telegram.messenger.cd.K0(2131751573), false);
                    }
                    ooVar2.c0.addView(ooVar2.d0, w7.b6.c(f7, -1));
                    final int i58 = 14;
                    ooVar2.d0.setOnClickListener(new View.OnClickListener(ooVar2) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ oo b;

                        {
                            this.b = ooVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i58) {
                                case 0:
                                    oo ooVar3 = this.b;
                                    ooVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", ooVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    pr prVar = new pr(bundle);
                                    prVar.B0(ooVar3.x0);
                                    ooVar3.presentFragment(prVar);
                                    break;
                                case 1:
                                    oo ooVar4 = this.b;
                                    lo loVar = ooVar4.Q0;
                                    long j102 = ooVar4.B0;
                                    if (!ooVar4.s.g()) {
                                        org.telegram.messenger.ic icVar = null;
                                        TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                        if (Z1 == null) {
                                            TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = L0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                                int i222 = chatPhoto2.dc_id;
                                                if (i222 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i222;
                                                }
                                                TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, ooVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                                int i232 = userProfilePhoto2.dc_id;
                                                if (i232 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i232;
                                                }
                                                PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    oo ooVar5 = this.b;
                                    ooVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", ooVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    pr prVar2 = new pr(bundle2);
                                    prVar2.B0(ooVar5.x0);
                                    ooVar5.presentFragment(prVar2);
                                    break;
                                case 3:
                                    oo ooVar6 = this.b;
                                    ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                                    break;
                                case 4:
                                    oo ooVar7 = this.b;
                                    ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                                    break;
                                case 5:
                                    oo ooVar8 = this.b;
                                    ooVar8.getClass();
                                    ooVar8.presentFragment(new sb(ooVar8.w0));
                                    break;
                                case 6:
                                    oo ooVar9 = this.b;
                                    ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                                    break;
                                case 7:
                                    oo ooVar10 = this.b;
                                    ooVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", ooVar10.B0);
                                    ooVar10.presentFragment(new oa(bundle3));
                                    break;
                                case 8:
                                    oo ooVar11 = this.b;
                                    ooVar11.presentFragment(new xh.i(ooVar11.B0));
                                    break;
                                case 9:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.m0();
                                    break;
                                case 13:
                                    oo.b0(this.b);
                                    break;
                                case 14:
                                    oo ooVar12 = this.b;
                                    org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                                    break;
                                case 15:
                                    oo ooVar13 = this.b;
                                    if (org.telegram.messenger.i0.J1(ooVar13)) {
                                        yb0 yb0Var = new yb0(4);
                                        yb0Var.n0 = -ooVar13.v0;
                                        TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        yb0Var.N0 = new go(ooVar13, 6);
                                        ooVar13.presentFragment(yb0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    oo ooVar14 = this.b;
                                    long j112 = ooVar14.v0;
                                    org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    cp cpVar = new cp(null);
                                    cpVar.M = new ArrayList();
                                    cpVar.N = new ArrayList();
                                    cpVar.P = new ArrayList();
                                    cpVar.c0 = true;
                                    cpVar.f0 = new ArrayList();
                                    cpVar.o0 = new HashMap();
                                    cpVar.q0 = new ro(cpVar, 5);
                                    cpVar.s0 = false;
                                    cpVar.Z = j112;
                                    cpVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = ooVar14.x0;
                                    cpVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            cpVar.l0 = tL_chatInviteExported;
                                        } else {
                                            cpVar.c0(false);
                                        }
                                    }
                                    ooVar14.presentFragment(cpVar);
                                    break;
                                case 17:
                                    oo ooVar15 = this.b;
                                    long j122 = ooVar15.v0;
                                    qp qpVar = new qp(null);
                                    qpVar.w = new ArrayList();
                                    boolean z162 = false;
                                    qpVar.O = false;
                                    qpVar.P = false;
                                    qpVar.E = j122;
                                    TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j122));
                                    qpVar.f = L02;
                                    if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    qpVar.s = z162;
                                    qpVar.h = ooVar15.x0;
                                    ooVar15.presentFragment(qpVar);
                                    break;
                                case 18:
                                    oo ooVar16 = this.b;
                                    rt0 rt0Var = new rt0(ooVar16.v0);
                                    rt0Var.s = new go(ooVar16, 4);
                                    ooVar16.presentFragment(rt0Var);
                                    break;
                                case 19:
                                    oo.d0(this.b);
                                    break;
                                case 20:
                                    oo ooVar17 = this.b;
                                    i50 i50Var = new i50(-ooVar17.w0.id);
                                    i50Var.c = ooVar17.L0;
                                    i50Var.l0 = ooVar17;
                                    ooVar17.presentFragment(i50Var);
                                    break;
                                case 21:
                                    oo ooVar18 = this.b;
                                    ooVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", ooVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                                    pr prVar3 = new pr(bundle4);
                                    prVar3.B0(ooVar18.x0);
                                    ooVar18.presentFragment(prVar3);
                                    break;
                                case 22:
                                    oo ooVar19 = this.b;
                                    kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = ooVar19.x0;
                                    kg0Var.l0(chatFull8, chatFull8.exported_invite);
                                    ooVar19.presentFragment(kg0Var);
                                    break;
                                case 23:
                                    oo ooVar20 = this.b;
                                    if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                        ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", ooVar20.v0);
                                        xp xpVar = new xp(bundle5);
                                        TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                        xpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xpVar.a == null) {
                                                xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                            }
                                            xpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                                    if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                        xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                                    }
                                                }
                                                xpVar.w = 1;
                                            }
                                        }
                                        ooVar20.presentFragment(xpVar);
                                        break;
                                    }
                                default:
                                    oo ooVar21 = this.b;
                                    ooVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", ooVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                                    ooVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    hn0Var.addView(new org.telegram.ui.Cells.c7(context3), w7.b6.o(-1, -2));
                }
                UndoView undoView = new UndoView(context3);
                ooVar2.c = undoView;
                gdVar.addView(undoView, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.wt wtVar6 = ooVar2.w;
                TLRPC.User user3 = ooVar2.C0;
                wtVar6.setText(org.telegram.messenger.k6.l(user3 == null ? org.telegram.messenger.i5.p(user3) : ooVar2.w0.title, ooVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.wt wtVar7 = ooVar2.w;
                wtVar7.setSelection(wtVar7.n());
                chatFull = ooVar2.x0;
                if (chatFull == null) {
                    ooVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = ooVar2.D0;
                    if (userFull4 != null) {
                        ooVar2.E.setText(userFull4.about);
                    }
                }
                ooVar2.o0();
                ooVar2.t0(true, false);
                return ooVar2.fragmentView;
            }
        }
        num2 = num;
        chat = ooVar.w0;
        if (chat == null) {
        }
        ooVar2 = ooVar;
        f7 = -2.0f;
        context3 = context2;
        chat2 = ooVar2.w0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context3);
            ooVar2.c0 = frameLayout32;
            hn0Var.addView(frameLayout32, w7.b6.o(-1, -2));
            org.telegram.ui.Cells.x9 x9Var2 = new org.telegram.ui.Cells.x9(context3);
            ooVar2.d0 = x9Var2;
            org.telegram.ui.ActionBar.a7.V(x9Var2.getTextView(), org.telegram.ui.ActionBar.t6.p7, null);
            org.telegram.ui.ActionBar.a7.S(ooVar2.d0, org.telegram.ui.ActionBar.t6.N0(false), null, org.telegram.ui.ActionBar.a7.N(org.telegram.ui.ActionBar.t6.i6));
            if (ooVar2.C0 == null) {
            }
            ooVar2.c0.addView(ooVar2.d0, w7.b6.c(f7, -1));
            final int i582 = 14;
            ooVar2.d0.setOnClickListener(new View.OnClickListener(ooVar2) { // from class: org.telegram.ui.yn
                public final /* synthetic */ oo b;

                {
                    this.b = ooVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i582) {
                        case 0:
                            oo ooVar3 = this.b;
                            ooVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", ooVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            pr prVar = new pr(bundle);
                            prVar.B0(ooVar3.x0);
                            ooVar3.presentFragment(prVar);
                            break;
                        case 1:
                            oo ooVar4 = this.b;
                            lo loVar = ooVar4.Q0;
                            long j102 = ooVar4.B0;
                            if (!ooVar4.s.g()) {
                                org.telegram.messenger.ic icVar = null;
                                TLRPC.User Z1 = j102 == 0 ? null : ooVar4.getMessagesController().Z1(Long.valueOf(j102));
                                if (Z1 == null) {
                                    TLRPC.Chat L0 = ooVar4.getMessagesController().L0(Long.valueOf(ooVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = L0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = L0.photo;
                                        int i222 = chatPhoto2.dc_id;
                                        if (i222 != 0) {
                                            chatPhoto2.photo_big.dc_id = i222;
                                        }
                                        TLRPC.ChatFull chatFull5 = ooVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                icVar = org.telegram.messenger.ic.j(ooVar4.x0.chat_photo.video_sizes.get(0), ooVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, L0.photo.photo_big, null, icVar, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, ooVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = Z1.photo;
                                        int i232 = userProfilePhoto2.dc_id;
                                        if (i232 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i232;
                                        }
                                        PhotoViewer.v1().h2(null, Z1.photo.photo_big, null, null, null, null, null, 0, loVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            oo ooVar5 = this.b;
                            ooVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", ooVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            pr prVar2 = new pr(bundle2);
                            prVar2.B0(ooVar5.x0);
                            ooVar5.presentFragment(prVar2);
                            break;
                        case 3:
                            oo ooVar6 = this.b;
                            ooVar6.presentFragment(new kg.q1(ooVar6.v0));
                            break;
                        case 4:
                            oo ooVar7 = this.b;
                            ooVar7.presentFragment(new xh.z2(-ooVar7.v0));
                            break;
                        case 5:
                            oo ooVar8 = this.b;
                            ooVar8.getClass();
                            ooVar8.presentFragment(new sb(ooVar8.w0));
                            break;
                        case 6:
                            oo ooVar9 = this.b;
                            ooVar9.presentFragment(u61.f0(ooVar9.w0, false));
                            break;
                        case 7:
                            oo ooVar10 = this.b;
                            ooVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", ooVar10.B0);
                            ooVar10.presentFragment(new oa(bundle3));
                            break;
                        case 8:
                            oo ooVar11 = this.b;
                            ooVar11.presentFragment(new xh.i(ooVar11.B0));
                            break;
                        case 9:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            gf.f.r(view.getContext(), "https://t.me/BotFather?start=" + oo.k0(this.b.C0));
                            break;
                        case 12:
                            this.b.m0();
                            break;
                        case 13:
                            oo.b0(this.b);
                            break;
                        case 14:
                            oo ooVar12 = this.b;
                            org.telegram.ui.Components.s4.r(ooVar12, false, ooVar12.w0, null, false, true, true, false, new go(ooVar12, 7));
                            break;
                        case 15:
                            oo ooVar13 = this.b;
                            if (org.telegram.messenger.i0.J1(ooVar13)) {
                                yb0 yb0Var = new yb0(4);
                                yb0Var.n0 = -ooVar13.v0;
                                TLRPC.ChatFull chatFull6 = ooVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        yb0Var.I0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                yb0Var.N0 = new go(ooVar13, 6);
                                ooVar13.presentFragment(yb0Var);
                                break;
                            }
                            break;
                        case 16:
                            oo ooVar14 = this.b;
                            long j112 = ooVar14.v0;
                            org.telegram.ui.Cells.p8 p8Var72 = ooVar14.H;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            cp cpVar = new cp(null);
                            cpVar.M = new ArrayList();
                            cpVar.N = new ArrayList();
                            cpVar.P = new ArrayList();
                            cpVar.c0 = true;
                            cpVar.f0 = new ArrayList();
                            cpVar.o0 = new HashMap();
                            cpVar.q0 = new ro(cpVar, 5);
                            cpVar.s0 = false;
                            cpVar.Z = j112;
                            cpVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = ooVar14.x0;
                            cpVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    cpVar.l0 = tL_chatInviteExported;
                                } else {
                                    cpVar.c0(false);
                                }
                            }
                            ooVar14.presentFragment(cpVar);
                            break;
                        case 17:
                            oo ooVar15 = this.b;
                            long j122 = ooVar15.v0;
                            qp qpVar = new qp(null);
                            qpVar.w = new ArrayList();
                            boolean z162 = false;
                            qpVar.O = false;
                            qpVar.P = false;
                            qpVar.E = j122;
                            TLRPC.Chat L02 = qpVar.getMessagesController().L0(Long.valueOf(j122));
                            qpVar.f = L02;
                            if (org.telegram.messenger.w3.T(L02) && !qpVar.f.megagroup) {
                                z162 = true;
                            }
                            qpVar.s = z162;
                            qpVar.h = ooVar15.x0;
                            ooVar15.presentFragment(qpVar);
                            break;
                        case 18:
                            oo ooVar16 = this.b;
                            rt0 rt0Var = new rt0(ooVar16.v0);
                            rt0Var.s = new go(ooVar16, 4);
                            ooVar16.presentFragment(rt0Var);
                            break;
                        case 19:
                            oo.d0(this.b);
                            break;
                        case 20:
                            oo ooVar17 = this.b;
                            i50 i50Var = new i50(-ooVar17.w0.id);
                            i50Var.c = ooVar17.L0;
                            i50Var.l0 = ooVar17;
                            ooVar17.presentFragment(i50Var);
                            break;
                        case 21:
                            oo ooVar18 = this.b;
                            ooVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", ooVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((ooVar18.I0 || ooVar18.w0.gigagroup) && !org.telegram.messenger.w3.Y(ooVar18.w0)) ? 0 : 3);
                            pr prVar3 = new pr(bundle4);
                            prVar3.B0(ooVar18.x0);
                            ooVar18.presentFragment(prVar3);
                            break;
                        case 22:
                            oo ooVar19 = this.b;
                            kg0 kg0Var = new kg0(ooVar19.v0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = ooVar19.x0;
                            kg0Var.l0(chatFull8, chatFull8.exported_invite);
                            ooVar19.presentFragment(kg0Var);
                            break;
                        case 23:
                            oo ooVar20 = this.b;
                            if (org.telegram.messenger.w3.V(ooVar20.w0)) {
                                ooVar20.presentFragment(new sg.o(ooVar20.v0, ooVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", ooVar20.v0);
                                xp xpVar = new xp(bundle5);
                                TLRPC.ChatFull chatFull9 = ooVar20.x0;
                                xpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xpVar.a == null) {
                                        xpVar.a = xpVar.getMessagesController().L0(Long.valueOf(xpVar.c));
                                    }
                                    xpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i242 = 0; i242 < tL_chatReactionsSome.reactions.size(); i242++) {
                                            if (tL_chatReactionsSome.reactions.get(i242) instanceof TLRPC.TL_reactionEmoji) {
                                                xpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i242)).emoticon);
                                            }
                                        }
                                        xpVar.w = 1;
                                    }
                                }
                                ooVar20.presentFragment(xpVar);
                                break;
                            }
                        default:
                            oo ooVar21 = this.b;
                            ooVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", ooVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", ooVar21.v0);
                            ooVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            hn0Var.addView(new org.telegram.ui.Cells.c7(context3), w7.b6.o(-1, -2));
        }
        UndoView undoView2 = new UndoView(context3);
        ooVar2.c = undoView2;
        gdVar.addView(undoView2, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.wt wtVar62 = ooVar2.w;
        TLRPC.User user32 = ooVar2.C0;
        wtVar62.setText(org.telegram.messenger.k6.l(user32 == null ? org.telegram.messenger.i5.p(user32) : ooVar2.w0.title, ooVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.wt wtVar72 = ooVar2.w;
        wtVar72.setSelection(wtVar72.n());
        chatFull = ooVar2.x0;
        if (chatFull == null) {
        }
        ooVar2.o0();
        ooVar2.t0(true, false);
        return ooVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.w0.participants_count) >= getMessagesController().d5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.p8 p8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = org.telegram.messenger.zs.T;
        boolean z11 = true;
        long j10 = this.B0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.v0) {
                if (this.x0 == null && (editTextBoldCursor = this.E) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.x0 == null;
                this.x0 = chatFull;
                j0();
                if (j10 != 0) {
                    this.F0 = false;
                } else {
                    if (!this.E0) {
                        TLRPC.ChatFull chatFull2 = this.x0;
                    }
                    TLRPC.ChatFull chatFull3 = this.x0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z10 = true;
                        this.F0 = z10;
                        p8Var = this.Q;
                        if (p8Var != null) {
                            p8Var.getCheckBox().setIcon(this.F0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.F0 = z10;
                    p8Var = this.Q;
                    if (p8Var != null) {
                    }
                }
                if (org.telegram.messenger.w3.T(this.w0) && !this.x0.hidden_prehistory) {
                    z11 = false;
                }
                this.J0 = z11;
                t0(false, false);
                if (z12) {
                    l0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.r5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.v0 != longValue) {
                return;
            }
            this.E0 = booleanValue;
            this.G0 = booleanValue2;
            if (objArr.length > 3) {
                this.H0 = ((Boolean) objArr[3]).booleanValue();
            }
            org.telegram.ui.Cells.p8 p8Var2 = this.Q;
            if (p8Var2 != null) {
                p8Var2.setChecked(this.E0);
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i14 = org.telegram.messenger.vp.D8;
            if ((intValue & 2) != 0) {
                o0();
            }
            if ((intValue & 1) != 0) {
                v0();
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.v0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.y0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.z0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.A0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var == null || z4Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == org.telegram.messenger.zs.X4) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.v0) {
                TLRPC.ChatFull M0 = getMessagesController().M0(longValue2);
                this.x0 = M0;
                if (M0 != null) {
                    this.K0 = M0.available_reactions;
                }
                w0(true);
                return;
            }
            return;
        }
        if (i10 != org.telegram.messenger.zs.C3) {
            if (i10 == org.telegram.messenger.zs.E0) {
                if (((Long) objArr[0]).longValue() == j10) {
                    q0(getMessagesController().a2(j10));
                    return;
                }
                return;
            } else {
                if (i10 == org.telegram.messenger.zs.L3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i10 == org.telegram.messenger.zs.y1 && (-this.v0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
                    if (z4Var2 == null || z4Var2.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
        }
        if (((Long) objArr[0]).longValue() == j10) {
            if (this.m0 != null) {
                rh.r g10 = rh.r.g(this.currentAccount);
                this.m0.setVisibility(g10.a(j10) ? 0 : 8);
                this.m0.w(rh.h8.Z0(false, TextUtils.concat("XTR", rh.h8.L0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.p8 p8Var3 = this.k0;
                if (p8Var3 != null) {
                    p8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.S.setVisibility((this.m0.getVisibility() == 0 || this.l0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.l0 != null) {
                rh.r g11 = rh.r.g(this.currentAccount);
                this.l0.setVisibility(g11.b(j10) ? 0 : 8);
                long i15 = g11.i(j10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i15 > 0) {
                    double d = i15 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.i0.o0((int) d, 0));
                    } else {
                        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                        decimalFormatSymbols.setDecimalSeparator('.');
                        DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                        decimalFormat.setMinimumFractionDigits(2);
                        decimalFormat.setMaximumFractionDigits(3);
                        decimalFormat.setGroupingUsed(false);
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                    }
                }
                this.l0.w(spannableStringBuilder, true);
                org.telegram.ui.Cells.p8 p8Var4 = this.k0;
                if (p8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z11 = false;
                    }
                    p8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.S;
                if (this.m0.getVisibility() != 0 && this.l0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ gs0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.a40
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.in0 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        mo moVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.t6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(moVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b0, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b0, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.T, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.V, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.Cells.p8 p8Var = this.U;
        if (p8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(p8Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.N, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.H, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.l6));
        LinearLayout linearLayout = this.D;
        int i11 = org.telegram.ui.ActionBar.t6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.c7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.d0, 4, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        org.telegram.ui.Cells.p8 p8Var2 = this.K;
        if (p8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(p8Var2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        org.telegram.ui.Cells.p8 p8Var3 = this.a0;
        if (p8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(p8Var3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i10));
        }
        return arrayList;
    }

    public final boolean i0(boolean z10) {
        org.telegram.ui.Components.wt wtVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        int i10 = 1;
        int i11 = 0;
        String str3 = "";
        if (this.B0 != 0) {
            TLRPC.UserFull userFull = this.D0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.wt wtVar2 = this.w;
            if ((wtVar2 != null && !this.C0.first_name.equals(wtVar2.getText().toString())) || ((editTextBoldCursor2 = this.E) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131743752, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new go(this, i11));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new go(this, i10));
                    showDialog(x1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.x0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.w3.T(this.w0) && this.x0.hidden_prehistory != this.J0) || (((wtVar = this.w) != null && !this.w0.title.equals(wtVar.getText().toString())) || (((editTextBoldCursor = this.E) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.E0 != this.w0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String L02 = org.telegram.messenger.cd.L0(2131743752, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                x1Var2.R = L02;
                if (this.I0) {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    x1Var2.T = org.telegram.messenger.cd.L0(2131749410, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131754216, "ApplyTheme"), new go(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747596, "PassportDiscard"), new go(this, 3));
                showDialog(x1Var2);
            }
            return false;
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        String str;
        if (this.e0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().O2.f(-this.v0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
            str = !TextUtils.isEmpty(jjVar.z) ? jjVar.z.toString() : !TextUtils.isEmpty(jjVar.v) ? jjVar.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.x0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.cd.L0(2131742918, null);
        }
        this.e0.u(org.telegram.messenger.cd.L0(2131742924, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    public final void l0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().i1(-this.v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().p1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new fo(this, 0));
    }

    public final void m0() {
        this.s.n(this.u0 != null, new ho(this, 0), new q5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.b0.e.d();
    }

    public final void n0() {
        org.telegram.ui.Components.wt wtVar;
        String str;
        String str2;
        if (this.N0 || (wtVar = this.w) == null) {
            return;
        }
        if (wtVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.i0.E3(this.w);
            return;
        }
        this.N0 = true;
        String str3 = "";
        if (this.C0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().p1(this.C0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.C0.first_name.equals(this.w.getText().toString())) {
                setbotinfo.name = this.w.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.D0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.E.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.b.setOnCancelListener(new ba(this, getConnectionsManager().sendRequest(setbotinfo, new ag.k0(20, this, setbotinfo)), 2));
            this.b.show();
            return;
        }
        if (!org.telegram.messenger.w3.T(this.w0) && (!this.J0 || this.E0)) {
            getMessagesController().T(getParentActivity(), this.v0, this, new go(this, 5), null);
            return;
        }
        if (this.x0 != null && org.telegram.messenger.w3.T(this.w0)) {
            TLRPC.ChatFull chatFull = this.x0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.J0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().Y4(this.v0, this.J0);
            }
        }
        if (this.s.g()) {
            this.M0 = true;
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
            this.b = x1Var;
            x1Var.setOnCancelListener(new kg(this, r0));
            this.b.show();
            return;
        }
        if (!this.w0.title.equals(this.w.getText().toString())) {
            getMessagesController().C(this.v0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.x0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            org.telegram.messenger.vp messagesController = getMessagesController();
            long j10 = this.v0;
            String obj = this.E.getText().toString();
            TLRPC.ChatFull chatFull3 = this.x0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.i1(-j10);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.ci(messagesController, chatFull3, obj, 7), 64);
        }
        boolean z12 = this.E0;
        TLRPC.Chat chat = this.w0;
        boolean z13 = chat.forum;
        if (z12 != z13 || this.G0 != chat.forum_tabs || this.H0 != chat.forum_sidebar) {
            boolean z14 = this.G0 != chat.forum_tabs;
            boolean z15 = this.H0 != chat.forum_sidebar;
            r0 = z12 == z13 ? 0 : 1;
            getMessagesController().X4(this.v0, this.E0, this.G0, this.H0);
            if (this.E0 && !this.G0 && (r0 != 0 || z14)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                    if ((fragmentStack.get(i10) instanceof un) && ((un) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.v0) {
                        ((ActionBarLayout) getParentLayout()).a0(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
                        HashSet hashSet = pb1.q1;
                        ((ActionBarLayout) parentLayout).c(i10, pb1.H0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z14 || z15) {
                u0(z14);
            }
        }
        finishFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        boolean z10;
        if (this.e == null || this.O0) {
            return;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.v0));
        long j10 = this.B0;
        TLRPC.User Z1 = j10 == 0 ? null : getMessagesController().Z1(Long.valueOf(j10));
        if (L0 == null && Z1 == null) {
            return;
        }
        this.C0 = Z1;
        this.w0 = L0;
        org.telegram.ui.Components.r8 r8Var = this.r;
        if (Z1 == null ? L0.photo == null : Z1.photo == null) {
            this.e.setImageDrawable(r8Var);
        } else {
            TLRPC.Chat chat = Z1 != null ? Z1 : L0;
            this.u0 = Z1 != null ? Z1.photo.photo_small : L0.photo.photo_small;
            org.telegram.messenger.ic m10 = org.telegram.messenger.ic.m(this.currentAccount, 1, chat);
            this.e.e(chat, r8Var);
            if (m10 != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.g()) {
                        this.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.L0(2131752213, "ChatSetNewPhoto"), true);
                    } else {
                        this.b0.o(R.drawable.msg_addphoto, org.telegram.messenger.cd.L0(2131752212, "ChatSetPhotoOrVideo"), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.bi0(R.raw.camera_outline, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                    }
                    this.b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                    this.b0.e.setAnimation(this.R0);
                }
                if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                    PhotoViewer.v1().z0();
                }
                if (this.Z == null && getMessagesController().h6 && org.telegram.messenger.w3.V(this.w0)) {
                    this.Z.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.b0 != null) {
        }
        if (PhotoViewer.F1()) {
            PhotoViewer.v1().z0();
        }
        if (this.Z == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar == null || !wtVar.e) {
            return i0(z10);
        }
        if (!z10) {
            return false;
        }
        wtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0121, code lost:
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().d5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    @Override // org.telegram.ui.ActionBar.k2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.v0;
        long j11 = this.B0;
        boolean z10 = true;
        if (j10 == 0) {
            TLRPC.User Z1 = j11 == 0 ? null : getMessagesController().Z1(Long.valueOf(j11));
            this.C0 = Z1;
            if (Z1 == null) {
                TLRPC.User k02 = org.telegram.messenger.hs.a0(this.currentAccount).k0(j11);
                this.C0 = k02;
                if (k02 != null) {
                    getMessagesController().U3(this.C0, true, false);
                    if (this.D0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList L0 = org.telegram.messenger.hs.a0(this.currentAccount).L0(hashSet);
                        if (!L0.isEmpty()) {
                            this.D0 = (TLRPC.UserFull) L0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.w0;
            org.telegram.ui.Components.r8 r8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.b40 b40Var = this.s;
            b40Var.a = this;
            b40Var.b = this;
            getNotificationCenter().c(this, org.telegram.messenger.zs.r);
            getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
            getNotificationCenter().c(this, org.telegram.messenger.zs.b1);
            if (this.x0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.v0));
        this.w0 = L02;
        if (L02 == null) {
            TLRPC.Chat P = org.telegram.messenger.hs.a0(this.currentAccount).P(this.v0);
            this.w0 = P;
            if (P != null) {
                getMessagesController().N3(this.w0, true);
                if (this.x0 == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.hs.a0(this.currentAccount).F0(this.v0, org.telegram.messenger.w3.T(this.w0), new CountDownLatch(1), false, false, 0);
                    this.x0 = F0;
                }
            }
            return false;
        }
        chat = this.w0;
        org.telegram.ui.Components.r8 r8Var2 = this.r;
        if (chat == null) {
            this.y0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.z0 = TLRPC.TL_chatBannedRights.clone(this.w0.banned_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.w0.default_banned_rights);
            r8Var2.k(5L, this.w0.title, null, null);
            this.I0 = org.telegram.messenger.w3.T(this.w0) && !this.w0.megagroup;
            TLRPC.Chat chat2 = this.w0;
            boolean z11 = chat2.forum;
            this.E0 = z11;
            this.G0 = chat2.forum_tabs;
            this.H0 = chat2.forum_sidebar;
            if (j11 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.x0;
                }
                TLRPC.ChatFull chatFull2 = this.x0;
                if (chatFull2 != null) {
                }
                this.F0 = z10;
                getNotificationCenter().c(this, org.telegram.messenger.zs.T);
                getNotificationCenter().c(this, org.telegram.messenger.zs.r5);
                getNotificationCenter().c(this, org.telegram.messenger.zs.X4);
                getNotificationCenter().c(this, org.telegram.messenger.zs.L3);
            }
            z10 = false;
            this.F0 = z10;
            getNotificationCenter().c(this, org.telegram.messenger.zs.T);
            getNotificationCenter().c(this, org.telegram.messenger.zs.r5);
            getNotificationCenter().c(this, org.telegram.messenger.zs.X4);
            getNotificationCenter().c(this, org.telegram.messenger.zs.L3);
        } else {
            r8Var2.k(5L, this.C0.first_name, null, null);
            this.I0 = false;
            this.E0 = false;
            this.G0 = false;
            this.H0 = false;
            this.F0 = false;
            getNotificationCenter().c(this, org.telegram.messenger.zs.E0);
            if (this.C0.bot) {
                getNotificationCenter().c(this, org.telegram.messenger.zs.C3);
            }
        }
        org.telegram.ui.Components.b40 b40Var2 = this.s;
        b40Var2.a = this;
        b40Var2.b = this;
        getNotificationCenter().c(this, org.telegram.messenger.zs.r);
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        getNotificationCenter().c(this, org.telegram.messenger.zs.b1);
        if (this.x0 != null) {
            l0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.b40 b40Var = this.s;
        if (b40Var != null) {
            b40Var.d();
        }
        if (this.w0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.zs.T);
            getNotificationCenter().n(this, org.telegram.messenger.zs.r5);
            getNotificationCenter().n(this, org.telegram.messenger.zs.X4);
            getNotificationCenter().n(this, org.telegram.messenger.zs.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.zs.E0);
            if (this.C0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.zs.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.zs.r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.b1);
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.f5) obj).o(null);
        }
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            wtVar.s();
            this.w.getEditText().requestFocus();
        }
        s0();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        t0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.t6.G6, null);
            }
            ag.d2 d2Var = this.e;
            if (d2Var != null) {
                d2Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void p0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.f5 m10;
        this.x0 = chatFull;
        if (chatFull != null) {
            if (this.w0 == null) {
                this.w0 = getMessagesController().L0(Long.valueOf(this.v0));
            }
            this.J0 = !org.telegram.messenger.w3.T(this.w0) || this.x0.hidden_prehistory;
            this.K0 = this.x0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.w0;
            TLRPC.ChatFull chatFull2 = this.x0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.w3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i10);
                        i10++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m10 = org.telegram.ui.Components.f5.l(org.telegram.messenger.d20.s0, org.telegram.ui.Components.f5.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.f5.m(org.telegram.messenger.d20.s0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.f5.f()) : null;
                        }
                        if (m10 != null) {
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).n;
                    int size2 = arrayList4.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList4.get(i11);
                        i11++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.f5 l4 = org.telegram.ui.Components.f5.l(org.telegram.messenger.d20.s0, org.telegram.ui.Components.f5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l4);
                            l4.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().h6 && org.telegram.messenger.w3.V(this.w0)) {
                this.Z.setVisibility(0);
            }
        }
        j0();
    }

    public final void q0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j10 = this.B0;
                this.C0 = j10 == 0 ? null : getMessagesController().Z1(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.p8 p8Var = this.n0;
            if (p8Var != null) {
                p8Var.h(45, this.D0 == null, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    this.n0.w(userFull2.starref_program == null ? org.telegram.messenger.cd.L0(2131754345, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.p8 p8Var2 = this.t0;
            if (p8Var2 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                p8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.b9 b9Var = this.s0;
            if (b9Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                b9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void r0(boolean z10, boolean z11) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z11) {
            if (z10) {
                this.n.setAlpha(1.0f);
                this.n.setVisibility(0);
                this.f.setAlpha(1.0f);
                this.f.setVisibility(0);
                return;
            }
            this.n.setAlpha(0.0f);
            this.n.setVisibility(4);
            this.f.setAlpha(0.0f);
            this.f.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.h = animatorSet2;
        if (z10) {
            this.n.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<kg.f0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<kg.f0, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new eg.m(15, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.s;
        if (b40Var != null) {
            b40Var.f = bundle.getString("path");
        }
    }

    public final void s0() {
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        int i10;
        on0 on0Var;
        int w02;
        ArrayList<Integer> arrayList;
        zm0 zm0Var = this.L;
        if (zm0Var != null) {
            TLRPC.Chat chat = this.w0;
            org.telegram.ui.Cells.p8 p8Var3 = this.N;
            boolean z10 = (p8Var3 != null && p8Var3.getVisibility() == 0) || ((p8Var = this.Q) != null && p8Var.getVisibility() == 0) || ((org.telegram.messenger.w3.n0(this.w0) && org.telegram.messenger.w3.N(this.w0)) || ((p8Var2 = this.M) != null && p8Var2.getVisibility() == 0));
            Paint paint = zm0Var.n;
            int i11 = zm0Var.a;
            org.telegram.ui.ActionBar.p6 p6Var = zm0Var.d;
            if (chat == null) {
                return;
            }
            zm0Var.w = z10;
            zm0Var.r = new org.telegram.ui.Components.qz0(org.telegram.messenger.k6.m(chat.title, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.i0.o());
            on0 on0Var2 = zm0Var.x;
            if (on0Var2 != null) {
                on0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i12 = on0.j;
                int i13 = tL_emojiStatusCollectible.center_color | (-16777216);
                i10 = -16777216;
                zm0Var.x = new on0(i13, i13, i13, tL_emojiStatusCollectible.document_id);
            } else {
                i10 = -16777216;
                if (org.telegram.messenger.w3.I(chat) >= 0) {
                    on0Var = on0.c(i11, org.telegram.messenger.w3.I(chat));
                    on0Var.a = org.telegram.messenger.i0.L(11.0f);
                    on0Var.d();
                } else {
                    on0Var = null;
                }
                zm0Var.x = on0Var;
            }
            on0 on0Var3 = zm0Var.x;
            if (on0Var3 != null) {
                on0Var3.e(zm0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
                int i14 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | i10;
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | i10 : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | i10 : intValue;
                zm0Var.r.n(i14);
                paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, i14));
                on0 on0Var4 = new on0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                on0Var4.a = org.telegram.messenger.i0.L(11.0f);
                on0Var4.d();
                zm0Var.y = on0Var4;
                on0Var4.e(zm0Var);
                return;
            }
            int F = org.telegram.messenger.w3.F(chat);
            if (F < 7) {
                int i15 = org.telegram.ui.ActionBar.t6.r8[F];
                zm0Var.s = i15;
                w02 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
            } else {
                org.telegram.messenger.lp lpVar = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.s0).r4;
                org.telegram.messenger.kp d = lpVar == null ? null : lpVar.d(F);
                if (d != null) {
                    zm0Var.s = -1;
                    w02 = d.f();
                } else {
                    int i16 = org.telegram.ui.ActionBar.t6.r8[0];
                    zm0Var.s = i16;
                    w02 = org.telegram.ui.ActionBar.t6.w0(i16, p6Var);
                }
            }
            zm0Var.r.n(w02);
            paint.setColor(org.telegram.ui.ActionBar.t6.r1(0.1f, w02));
            on0 a10 = on0.a(i11, F);
            a10.a = org.telegram.messenger.i0.L(11.0f);
            a10.d();
            zm0Var.y = a10;
            a10.e(zm0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.s;
        if (b40Var != null && (str = b40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.wt wtVar = this.w;
        if (wtVar != null) {
            String obj = wtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        TLRPC.ChatFull chatFull;
        int i15;
        String str2;
        String L0;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        org.telegram.ui.Cells.p8 p8Var3;
        org.telegram.ui.Cells.p8 p8Var4;
        int i16;
        String str3;
        org.telegram.ui.Cells.p8 p8Var5;
        org.telegram.ui.Cells.p8 p8Var6;
        org.telegram.ui.Cells.p8 p8Var7;
        org.telegram.ui.Cells.p8 p8Var8;
        org.telegram.ui.Cells.p8 p8Var9;
        TLRPC.Chat L02;
        if (z10 && (L02 = getMessagesController().L0(Long.valueOf(this.v0))) != null) {
            this.w0 = L02;
        }
        boolean t02 = org.telegram.messenger.w3.t0(this.w0);
        org.telegram.ui.Cells.b9 b9Var = this.P;
        if (b9Var != null) {
            b9Var.setVisibility((this.I != null || ((p8Var7 = this.J) != null && p8Var7.getVisibility() == 0) || (((p8Var8 = this.N) != null && p8Var8.getVisibility() == 0) || ((p8Var9 = this.H) != null && p8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.p8 p8Var10 = this.Y;
        if (p8Var10 != null) {
            p8Var10.setVisibility(org.telegram.messenger.w3.T(this.w0) ? 0 : 8);
        }
        org.telegram.ui.Cells.p8 p8Var11 = this.J;
        if (p8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.x0;
            if (chatFull2 == null || (!this.I0 && chatFull2.linked_chat_id == 0)) {
                p8Var11.setVisibility(8);
            } else {
                p8Var11.setVisibility(0);
                if (this.x0.linked_chat_id == 0) {
                    this.J.u(org.telegram.messenger.cd.L0(2131751390, "Discussion"), org.telegram.messenger.cd.L0(2131751382, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(this.x0.linked_chat_id));
                    if (L03 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String K = org.telegram.messenger.w3.K(L03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.J.u(org.telegram.messenger.cd.L0(2131751390, "Discussion"), L03.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.u(org.telegram.messenger.cd.L0(2131751390, "Discussion"), sc.e.h("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.w3.K(L03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.p8 p8Var12 = this.J;
                            String L04 = org.telegram.messenger.cd.L0(2131748893, "LinkedChannel");
                            String str4 = L03.title;
                            org.telegram.ui.Cells.p8 p8Var13 = this.Q;
                            p8Var12.u(L04, str4, false, R.drawable.msg_channel, p8Var13 != null && p8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.p8 p8Var14 = this.J;
                            String L05 = org.telegram.messenger.cd.L0(2131748893, "LinkedChannel");
                            String h = sc.e.h("@", K2);
                            org.telegram.ui.Cells.p8 p8Var15 = this.Q;
                            p8Var14.u(L05, h, false, R.drawable.msg_channel, p8Var15 != null && p8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.p8 p8Var16 = this.H;
        if (p8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.x0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                p8Var16.setVisibility(8);
            } else {
                p8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.x0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.q(org.telegram.messenger.cd.L0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.q(org.telegram.messenger.cd.L0(2131753961, "AttachLocation"), "Unknown address", z11, true);
                }
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.x0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.w0.noforwards;
                if (this.I0) {
                    if (t02) {
                        i16 = 2131743945;
                        str3 = "TypePublic";
                    } else if (z13) {
                        i16 = 2131743946;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i16 = 2131743949;
                        str3 = "TypePrivate";
                    }
                    L0 = org.telegram.messenger.cd.L0(i16, str3);
                } else {
                    if (t02) {
                        i15 = 2131743944;
                        str2 = "TypePublicGroup";
                    } else if (z13) {
                        i15 = 2131743947;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i15 = 2131743948;
                        str2 = "TypePrivateGroup";
                    }
                    L0 = org.telegram.messenger.cd.L0(i15, str2);
                }
                String str5 = L0;
                if (this.I0) {
                    org.telegram.ui.Cells.p8 p8Var17 = this.I;
                    String L06 = org.telegram.messenger.cd.L0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.p8 p8Var18 = this.N;
                    p8Var17.u(L06, str5, false, R.drawable.msg_channel, (p8Var18 != null && p8Var18.getVisibility() == 0) || ((p8Var3 = this.J) != null && p8Var3.getVisibility() == 0) || ((p8Var4 = this.Q) != null && p8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.p8 p8Var19 = this.I;
                    String L07 = org.telegram.messenger.cd.L0(2131749401, "GroupType");
                    org.telegram.ui.Cells.p8 p8Var20 = this.N;
                    p8Var19.u(L07, str5, false, R.drawable.msg_groups, (p8Var20 != null && p8Var20.getVisibility() == 0) || ((p8Var = this.J) != null && p8Var.getVisibility() == 0) || ((p8Var2 = this.Q) != null && p8Var2.getVisibility() == 0));
                }
            } else {
                String L08 = !t02 ? org.telegram.messenger.cd.L0(2131743954, "TypeLocationGroupEdit") : String.format(a1.g.r(new StringBuilder("https://"), getMessagesController().U2, "/%s"), org.telegram.messenger.w3.K(this.w0, false));
                org.telegram.ui.Cells.p8 p8Var21 = this.I;
                String L09 = org.telegram.messenger.cd.L0(2131743955, "TypeLocationGroup");
                org.telegram.ui.Cells.p8 p8Var22 = this.N;
                p8Var21.u(L09, L08, false, R.drawable.msg_channel, (p8Var22 != null && p8Var22.getVisibility() == 0) || ((p8Var5 = this.J) != null && p8Var5.getVisibility() == 0) || ((p8Var6 = this.Q) != null && p8Var6.getVisibility() == 0));
            }
        }
        if (this.N != null) {
            if (!this.J0 || this.E0) {
                i14 = 2131752228;
                str = "ChatHistoryVisible";
            } else {
                i14 = 2131752232;
                str = "ChatHistoryHidden";
            }
            this.N.u(org.telegram.messenger.cd.L0(2131752229, "ChatHistoryShort"), org.telegram.messenger.cd.L0(i14, str), z11, R.drawable.msg_discuss, this.Q != null);
            this.N.setEnabled(!this.E0);
            boolean z14 = (this.E0 || t02 || ((chatFull = this.x0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.S0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.N.getAlpha() <= 0.0f && !z14) {
                this.N.setVisibility(8);
                s0();
            } else if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                boolean z15 = false;
                while (i17 < this.F.getChildCount()) {
                    if (!z15 && this.F.getChildAt(i17) == this.N) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.F.getChildAt(i17));
                    }
                    i17++;
                    z15 = z15;
                }
                int i18 = 0;
                boolean z16 = false;
                while (i18 < this.x.getChildCount()) {
                    if (!z16 && this.x.getChildAt(i18) == this.F) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.x.getChildAt(i18));
                    }
                    i18++;
                    z16 = z16;
                }
                if (this.N.getVisibility() != 0) {
                    this.N.setAlpha(0.0f);
                    this.N.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.N.setVisibility(0);
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    ((View) arrayList.get(i19)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.S0 = ofFloat;
                    ofFloat.addUpdateListener(new ag.p2(10, this, arrayList));
                    this.S0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 4));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.gr.h);
                    this.S0.start();
                } else {
                    this.N.setAlpha(z14 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z14 ? 0 : 8);
                    for (int i20 = 0; i20 < arrayList.size(); i20++) {
                        ((View) arrayList.get(i20)).setTranslationY(0.0f);
                    }
                    this.S0 = null;
                }
            }
        }
        if (this.T != null) {
            if (this.x0 != null) {
                org.telegram.ui.Cells.p8 p8Var23 = this.U;
                if (p8Var23 != null) {
                    if (p8Var23.getParent() == null) {
                        i10 = 0;
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.b6.o(-1, -2));
                    } else {
                        i10 = 0;
                    }
                    this.U.setVisibility(this.x0.requests_pending > 0 ? i10 : 8);
                } else {
                    i10 = 0;
                }
                if (!this.I0 || org.telegram.messenger.w3.Y(this.w0)) {
                    if (org.telegram.messenger.w3.T(this.w0)) {
                        org.telegram.ui.Cells.p8 p8Var24 = this.T;
                        String L010 = org.telegram.messenger.cd.L0(2131752377, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i10] = Integer.valueOf(this.x0.participants_count);
                        p8Var24.u(L010, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.p8 p8Var25 = this.T;
                        CharSequence L011 = org.telegram.messenger.cd.L0(2131752377, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i10] = Integer.valueOf(this.x0.participants.participants.size());
                        p8Var25.u(L011, String.format("%d", objArr2), false, R.drawable.msg_groups, this.U.getVisibility() == 0 ? 1 : i10);
                    }
                    TLRPC.Chat chat = this.w0;
                    if (!chat.gigagroup || org.telegram.messenger.w3.Y(chat)) {
                        int i21 = this.E0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.w0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i22 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i22++;
                            }
                            i11 = pr.r0(tL_chatBannedRights) + i22;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.w0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i11++;
                            }
                            if (this.E0 && !tL_chatBannedRights2.manage_topics) {
                                i11++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i11++;
                            }
                            i12 = i21;
                        } else {
                            i11 = i21;
                            i12 = i11;
                        }
                        org.telegram.ui.Cells.p8 p8Var26 = this.X;
                        String L012 = org.telegram.messenger.cd.L0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i11);
                        Integer valueOf2 = Integer.valueOf(i12);
                        Object[] objArr3 = new Object[2];
                        objArr3[i10] = valueOf;
                        objArr3[1] = valueOf2;
                        p8Var26.u(L012, String.format("%d/%d", objArr3), z11, R.drawable.msg_permissions, true);
                        z12 = z11;
                    } else {
                        org.telegram.ui.Cells.p8 p8Var27 = this.X;
                        CharSequence L013 = org.telegram.messenger.cd.L0(2131752453, null);
                        TLRPC.ChatFull chatFull5 = this.x0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i10] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        org.telegram.ui.Cells.p8 p8Var28 = this.Y;
                        p8Var27.u(L013, format, false, R.drawable.msg_user_remove, (p8Var28 == null || p8Var28.getVisibility() != 0) ? i10 : 1);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.p8 p8Var29 = this.U;
                    if (p8Var29 != null) {
                        CharSequence L014 = org.telegram.messenger.cd.L0(2131748650, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i10] = Integer.valueOf(this.x0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.p8 p8Var30 = this.Y;
                        p8Var29.u(L014, format2, false, R.drawable.msg_requests, (p8Var30 == null || p8Var30.getVisibility() != 0) ? i10 : 1);
                    }
                } else {
                    org.telegram.ui.Cells.p8 p8Var31 = this.T;
                    String L015 = org.telegram.messenger.cd.L0(2131752289, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i10] = Integer.valueOf(this.x0.participants_count);
                    p8Var31.u(L015, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.p8 p8Var32 = this.X;
                    CharSequence L016 = org.telegram.messenger.cd.L0(2131752453, null);
                    TLRPC.ChatFull chatFull6 = this.x0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i10] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    org.telegram.ui.Cells.p8 p8Var33 = this.Y;
                    p8Var32.u(L016, format3, false, R.drawable.msg_user_remove, (p8Var33 == null || p8Var33.getVisibility() != 0) ? i10 : 1);
                    z12 = z11;
                }
                org.telegram.ui.Cells.p8 p8Var34 = this.W;
                String L017 = org.telegram.messenger.cd.L0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.w3.T(this.w0)) {
                    i13 = this.x0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.x0;
                    if (chatFull7 == null) {
                        i13 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i23 = i10;
                        int i24 = i23;
                        while (i23 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.x0.participants.participants.get(i23);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i24++;
                            }
                            i23++;
                        }
                        i13 = i24;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i10] = Integer.valueOf(i13);
                p8Var34.u(L017, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                i10 = 0;
                if (!this.I0 || org.telegram.messenger.w3.Y(this.w0)) {
                    org.telegram.ui.Cells.p8 p8Var35 = this.T;
                    String L018 = org.telegram.messenger.cd.L0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.p8 p8Var36 = this.Y;
                    p8Var35.o(R.drawable.msg_groups, L018, p8Var36 != null && p8Var36.getVisibility() == 0);
                    if (this.w0.gigagroup) {
                        org.telegram.ui.Cells.p8 p8Var37 = this.X;
                        String L019 = org.telegram.messenger.cd.L0(2131752453, null);
                        org.telegram.ui.Cells.p8 p8Var38 = this.Y;
                        p8Var37.o(R.drawable.msg_chats_remove, L019, p8Var38 != null && p8Var38.getVisibility() == 0);
                    } else {
                        this.X.o(R.drawable.msg_permissions, org.telegram.messenger.cd.L0(2131752333, null), true);
                    }
                } else {
                    this.T.o(R.drawable.msg_groups, org.telegram.messenger.cd.L0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.p8 p8Var39 = this.X;
                    String L020 = org.telegram.messenger.cd.L0(2131752453, null);
                    org.telegram.ui.Cells.p8 p8Var40 = this.Y;
                    p8Var39.o(R.drawable.msg_chats_remove, L020, p8Var40 != null && p8Var40.getVisibility() == 0);
                }
                this.W.o(R.drawable.msg_admins, org.telegram.messenger.cd.L0(2131752517, "ChannelAdministrators"), true);
            }
            this.O.setVisibility(org.telegram.messenger.w3.w(1, this.w0) ? i10 : 8);
            w0(z12);
            if (this.x0 == null || !org.telegram.messenger.w3.y(3, this.w0) || (t02 && this.w0.creator)) {
                this.V.setVisibility(8);
            } else if (this.x0.invitesCount > 0) {
                this.V.u(org.telegram.messenger.cd.L0(2131749150, "InviteLinks"), Integer.toString(this.x0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.V.u(org.telegram.messenger.cd.L0(2131749150, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.K != null) {
            x0(null);
        }
    }

    public final void u0(boolean z10) {
        ay ayVar;
        xw xwVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof un) {
                un unVar = (un) fragmentStack.get(i10);
                if (unVar.getArguments().getLong("chat_id") == this.v0) {
                    ((ActionBarLayout) getParentLayout()).c0(unVar, false);
                    unVar.clearViews();
                    if (((ActionBarLayout) getParentLayout()).c(i10, unVar)) {
                        org.telegram.messenger.zs.e().j(unVar.Z9);
                    }
                    if (z10 && !this.G0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new pb1(bundle));
                        i10++;
                    }
                }
            } else if (z10 && this.G0 && (fragmentStack.get(i10) instanceof pb1)) {
                pb1 pb1Var = (pb1) fragmentStack.get(i10);
                if (pb1Var.g() != null && pb1Var.g().id == this.v0) {
                    ((ActionBarLayout) getParentLayout()).c0(pb1Var, false);
                    i10--;
                }
            } else if (z10 && this.G0 && (fragmentStack.get(i10) instanceof ay) && (ayVar = (ay) fragmentStack.get(i10)) != null && (xwVar = ayVar.F3) != null && xwVar.c()) {
                ayVar.F3.a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        if (this.k0 == null) {
            return;
        }
        if (this.C0.usernames.size() <= 1) {
            this.k0.u(org.telegram.messenger.cd.L0(2131753005, null), "t.me/" + this.C0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.C0.usernames;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i11);
            i11++;
            if (tL_username.active) {
                i10++;
            }
        }
        this.k0.u(org.telegram.messenger.cd.L0(2131753004, null), org.telegram.messenger.cd.a0(null, null, 2131753003, Integer.valueOf(i10), Integer.valueOf(this.C0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    public final void w0(boolean z10) {
        String str;
        String str2;
        int i10;
        TLRPC.ChatFull M0 = getMessagesController().M0(this.v0);
        boolean V = org.telegram.messenger.w3.V(this.w0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String L0 = org.telegram.messenger.cd.L0(2131746394, null);
            if (M0 == null || !M0.paid_reactions_available) {
                str = L0;
                this.O.u(org.telegram.messenger.cd.L0(2131746402, null), str, z10, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i11 = 0;
            for (0; i10 < tL_chatReactionsSome.reactions.size(); i10 + 1) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i11++;
                    }
                } else {
                    i10 = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i10 + 1;
                    i11++;
                }
            }
            if (V) {
                if (M0 != null && M0.paid_reactions_available) {
                    i11++;
                }
                str2 = i11 == 0 ? org.telegram.messenger.cd.L0(2131746394, null) : String.valueOf(i11);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i11);
                str2 = min == 0 ? org.telegram.messenger.cd.L0(2131746394, null) : org.telegram.messenger.cd.a0(null, null, 2131746399, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = org.telegram.messenger.cd.L0(2131746401, null);
        }
        str = str2;
        this.O.u(org.telegram.messenger.cd.L0(2131746402, null), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x0(Long l4) {
        TLRPC.Chat chat = this.w0;
        if (chat == null || this.K == null) {
            return;
        }
        long j10 = 0;
        if (!(l4 != null ? l4.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.K.u(org.telegram.messenger.cd.L0(2131747111, null), org.telegram.messenger.cd.L0(2131747101, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.w0.linked_monoforum_id));
        if (l4 != null) {
            j10 = l4.longValue();
        } else if (L0 != null) {
            j10 = L0.send_paid_messages_stars;
        }
        this.K.u(org.telegram.messenger.cd.L0(2131747111, null), rh.h8.Z0(false, org.telegram.messenger.cd.a0(null, null, 2131747083, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.a40
    public final /* synthetic */ void T() {
    }
}
