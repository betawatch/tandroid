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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ln extends org.telegram.ui.ActionBar.d2 implements org.telegram.ui.Components.e30, org.telegram.messenger.cs {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public LinearLayout E;
    public TLRPC.UserFull E0;
    public EditTextBoldCursor F;
    public boolean F0;
    public LinearLayout G;
    public boolean G0;
    public org.telegram.ui.Cells.x6 H;
    public boolean H0;
    public org.telegram.ui.Cells.l8 I;
    public boolean I0;
    public org.telegram.ui.Cells.l8 J;
    public boolean J0;
    public org.telegram.ui.Cells.l8 K;
    public boolean K0;
    public org.telegram.ui.Cells.l8 L;
    public TLRPC.ChatReactions L0;
    public il0 M;
    public TL_stories.TL_premium_boostsStatus M0;
    public org.telegram.ui.Cells.l8 N;
    public boolean N0;
    public org.telegram.ui.Cells.l8 O;
    public boolean O0;
    public org.telegram.ui.Cells.l8 P;
    public boolean P0;
    public org.telegram.ui.Cells.y8 Q;
    public final ArrayList Q0;
    public org.telegram.ui.Cells.l8 R;
    public final jn R0;
    public LinearLayout S;
    public org.telegram.ui.Components.ch0 S0;
    public LinearLayout T;
    public ValueAnimator T0;
    public org.telegram.ui.Cells.l8 U;
    public org.telegram.ui.Cells.l8 V;
    public org.telegram.ui.Cells.l8 W;
    public org.telegram.ui.Cells.l8 X;
    public org.telegram.ui.Cells.l8 Y;
    public org.telegram.ui.Cells.l8 Z;
    public org.telegram.ui.ActionBar.b5 a;
    public org.telegram.ui.Cells.l8 a0;
    public org.telegram.ui.ActionBar.s1 b;
    public org.telegram.ui.Cells.l8 b0;
    public UndoView c;
    public kn c0;
    public LinearLayout d;
    public FrameLayout d0;
    public ei.d4 e;
    public org.telegram.ui.Cells.v9 e0;
    public gi.n5 f;
    public org.telegram.ui.Cells.l8 f0;
    public org.telegram.ui.Cells.l8 g0;
    public AnimatorSet h;
    public ki.b h0;
    public org.telegram.ui.Cells.y8 i0;
    public org.telegram.ui.Cells.l8 j0;
    public org.telegram.ui.Cells.y8 k0;
    public org.telegram.ui.Cells.l8 l0;
    public org.telegram.ui.Cells.l8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.l8 n0;
    public org.telegram.ui.Cells.l8 o0;
    public org.telegram.ui.Cells.l8 p0;
    public org.telegram.ui.Cells.l8 q0;
    public final org.telegram.ui.Components.u8 r;
    public org.telegram.ui.Cells.l8 r0;
    public final org.telegram.ui.Components.f30 s;
    public org.telegram.ui.Cells.y8 s0;
    public org.telegram.ui.Cells.y8 t0;
    public org.telegram.ui.Cells.l8 u0;
    public TLRPC.FileLocation v0;
    public org.telegram.ui.Components.jt w;
    public long w0;
    public org.telegram.ui.Components.jm0 x;
    public TLRPC.Chat x0;
    public org.telegram.ui.Components.km0 y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public ln(Bundle bundle) {
        super(bundle);
        this.Q0 = new ArrayList();
        this.R0 = new jn(this);
        this.r = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.f30(0, false, false);
        } else {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.f30((M0 == null || !org.telegram.messenger.t3.V(M0)) ? 2 : 1, true, true);
        }
    }

    public static void Z(ln lnVar, FrameLayout frameLayout, View view) {
        int i3 = 3;
        if (!lnVar.G0) {
            TLRPC.ChatFull chatFull = lnVar.y0;
            org.telegram.ui.Components.fc.a0(lnVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(lnVar.getMessagesController().c5, "ChannelTopicsForbidden", new Object[0])) : org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131752280, "ChannelTopicsDiscussionForbidden"))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -lnVar.w0;
        kx kxVar = new kx(null);
        kxVar.a = j10;
        kxVar.setResourceProvider(lnVar.resourceProvider);
        boolean z10 = lnVar.F0;
        boolean z11 = lnVar.H0;
        boolean z12 = lnVar.I0;
        ei.d0 d0Var = new ei.d0(i3, lnVar, view);
        kxVar.c = z10;
        kxVar.d = z11;
        kxVar.e = z12;
        kxVar.h = d0Var;
        lnVar.presentFragment(kxVar);
    }

    public static /* synthetic */ void a0(ln lnVar) {
        lnVar.v0 = null;
        long j10 = lnVar.C0;
        if (j10 == 0) {
            org.telegram.messenger.hp.s1(lnVar.currentAccount).B(lnVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = lnVar.getMessagesController().o1(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            lnVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new fn(lnVar, 2));
        }
        lnVar.s0(false, true);
        ei.d4 d4Var = lnVar.e;
        org.telegram.ui.Components.u8 u8Var = lnVar.r;
        Object obj = lnVar.D0;
        if (obj == null) {
            obj = lnVar.x0;
        }
        d4Var.j(null, null, u8Var, obj);
        lnVar.S0.M(0);
        lnVar.c0.e.d();
    }

    public static void b0(ln lnVar, long j10, long j11) {
        org.telegram.messenger.hp.s1(lnVar.currentAccount).Q2(j10, j11, true, false, new c5(lnVar, 4));
    }

    public static void c0(ln lnVar) {
        int i3 = lnVar.currentAccount;
        long j10 = lnVar.C0;
        TL_bots.BotVerifierSettings botVerifierSettings = lnVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        Bundle l10 = org.telegram.ui.Cells.f1.l(16, "onlySelect", "dialogsType", true);
        l10.putBoolean("resetDelegate", false);
        uw uwVar = new uw(l10);
        uwVar.setCurrentAccount(i3);
        uwVar.D2 = new ii.o1(uwVar, i3, j10, botVerifierSettings);
        T.presentFragment(uwVar);
    }

    public static void d0(ln lnVar, org.telegram.ui.ActionBar.s1 s1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, org.telegram.messenger.e3 e3Var) {
        s1Var.dismiss();
        if (lnVar.getParentActivity() == null) {
            return;
        }
        vg.i0 i0Var = new vg.i0(35, lnVar.currentAccount, lnVar.getParentActivity(), lnVar, lnVar.getResourceProvider());
        i0Var.A1(e3Var);
        i0Var.z1(tL_premium_boostsStatus, true);
        i0Var.B1(j10);
        TLRPC.Chat M0 = lnVar.getMessagesController().M0(Long.valueOf(-j10));
        if (M0 != null) {
            i0Var.J2 = new sc(24, lnVar, M0);
        }
        lnVar.showDialog(i0Var);
    }

    public static void e0(ln lnVar) {
        pc pcVar = new pc(-lnVar.x0.id);
        pcVar.m0 = lnVar;
        lnVar.presentFragment(pcVar);
        org.telegram.messenger.hp.s1(lnVar.currentAccount).e7.edit().putInt("boostingappearance", org.telegram.messenger.hp.s1(lnVar.currentAccount).e7.getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void f0(ln lnVar) {
        lnVar.P0 = true;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(lnVar.currentAccount);
        int i3 = org.telegram.messenger.hp.C8;
        f10.k(org.telegram.messenger.hs.r, 2);
    }

    public static SpannableStringBuilder i0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        cz czVar = new cz(10);
        czVar.a.setTypeface(org.telegram.messenger.g0.o1("fonts/num.otf"));
        czVar.f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false);
        czVar.n = false;
        spannableStringBuilder.setSpan(czVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String l0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i3);
            i3++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final void H(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.e30
    public final void O(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.e30
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ji.j(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x101b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1028  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x108a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x10b6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x10be  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x108f  */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r22;
        int i3;
        Context context2;
        Integer num;
        final ln lnVar;
        int i10;
        org.telegram.ui.ActionBar.n6 n6Var;
        Integer num2;
        boolean z10;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i11;
        TLRPC.User user;
        final ln lnVar2;
        float f10;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        boolean z11;
        String format;
        int i12;
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        int i13;
        org.telegram.ui.Cells.l8 l8Var3;
        org.telegram.ui.Cells.l8 l8Var4;
        org.telegram.ui.Cells.l8 l8Var5;
        org.telegram.ui.Cells.l8 l8Var6;
        TLRPC.ChatFull chatFull2;
        boolean z12;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i14 = 1;
        setHasOwnBackground(true);
        org.telegram.ui.Components.jt jtVar = this.w;
        if (jtVar != null) {
            jtVar.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i15 = 6;
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, i15));
        wc wcVar = new wc(i14, context, this);
        wcVar.setOnTouchListener(new fi.a(9));
        this.fragmentView = wcVar;
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context);
        this.x = jm0Var;
        org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(context, this.x, this.resourceProvider, false);
        this.y = km0Var;
        km0Var.setFillViewport(true);
        this.y.setDrawBackground(true);
        wcVar.addView(this.y, b8.mf.c(-1.0f, -1));
        this.y.addView(jm0Var, new FrameLayout.LayoutParams(-1, -2));
        jm0Var.setOrientation(1);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.L0(2131752415));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i16 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i16, linearLayout2, null);
        jm0Var.addView(this.d, b8.mf.o(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, b8.mf.o(-1, -2));
        ei.d4 d4Var = new ei.d4(i15, context, this);
        this.e = d4Var;
        d4Var.setRoundRadius(this.F0 ? org.telegram.messenger.g0.L(16.0f) : org.telegram.messenger.g0.L(32.0f));
        int i17 = 3;
        if (this.D0 != null || org.telegram.messenger.t3.d(this.x0)) {
            ei.d4 d4Var2 = this.e;
            boolean z13 = org.telegram.messenger.bd.a0;
            frameLayout2.addView(d4Var2, b8.mf.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            gi.n5 n5Var = new gi.n5(this, context, paint, i15);
            this.f = n5Var;
            boolean z14 = org.telegram.messenger.bd.a0;
            frameLayout2.addView(n5Var, b8.mf.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(org.telegram.messenger.g0.L(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z15 = org.telegram.messenger.bd.a0;
            frameLayout2.addView(radialProgressView2, b8.mf.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 8.0f));
            s0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j10 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j10 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j10));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i18 = chatPhoto2.dc_id;
                                        if (i18 != 0) {
                                            chatPhoto2.photo_big.dc_id = i18;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i19 = userProfilePhoto2.dc_id;
                                        if (i19 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i19;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j11 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var7 = lnVar14.I;
                            boolean z16 = l8Var7 != null && l8Var7.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j11;
                            boVar.o0 = z16;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z17 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z17 = true;
                            }
                            qoVar.s = z17;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i20 = 0; i20 < tL_chatReactionsSome.reactions.size(); i20++) {
                                            if (tL_chatReactionsSome.reactions.get(i20) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i20)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
        } else {
            ei.d4 d4Var3 = this.e;
            boolean z16 = org.telegram.messenger.bd.a0;
            frameLayout2.addView(d4Var3, b8.mf.d(64, 64.0f, (z16 ? 5 : 3) | 48, z16 ? 0.0f : 16.0f, 12.0f, z16 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.jt jtVar2 = new org.telegram.ui.Components.jt(context, wcVar, this);
        this.w = jtVar2;
        long j10 = this.C0;
        if (j10 != 0) {
            jtVar2.setHint(org.telegram.messenger.bd.L0(2131753021));
            r22 = 0;
        } else if (this.J0) {
            r22 = 0;
            jtVar2.setHint(org.telegram.messenger.bd.M0(2131751125, "EnterChannelName"));
        } else {
            r22 = 0;
            jtVar2.setHint(org.telegram.messenger.bd.M0(2131749430, "GroupName"));
        }
        org.telegram.ui.Components.jt jtVar3 = this.w;
        TLRPC.Chat chat3 = this.x0;
        jtVar3.setEnabled((chat3 != null || org.telegram.messenger.t3.d(chat3)) ? true : r22);
        org.telegram.ui.Components.jt jtVar4 = this.w;
        jtVar4.setFocusable(jtVar4.isEnabled());
        this.w.getEditText().addTextChangedListener(new n0(this, i17));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r22] = new InputFilter.LengthFilter(128);
        this.w.setFilters(inputFilterArr);
        org.telegram.ui.Components.jt jtVar5 = this.w;
        boolean z17 = org.telegram.messenger.bd.a0;
        frameLayout2.addView(jtVar5, b8.mf.d(-1, -2.0f, 16, z17 ? 5.0f : 96.0f, 0.0f, z17 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.E = linearLayout3;
        linearLayout3.setOrientation(1);
        jm0Var.addView(this.E, b8.mf.o(-1, -2));
        final int i18 = 12;
        if (this.D0 != null || org.telegram.messenger.t3.d(this.x0)) {
            kn knVar = new kn(context);
            this.c0 = knVar;
            org.telegram.ui.ActionBar.r6.S(knVar, org.telegram.ui.ActionBar.k6.N0(r22), null, org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
            this.c0.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            this.c0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i19 = userProfilePhoto2.dc_id;
                                        if (i19 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i19;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j11 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var7 = lnVar14.I;
                            boolean z162 = l8Var7 != null && l8Var7.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j11;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i20 = 0; i20 < tL_chatReactionsSome.reactions.size(); i20++) {
                                            if (tL_chatReactionsSome.reactions.get(i20) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i20)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            this.E.addView(this.c0, b8.mf.o(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.F = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.F(this.F, org.telegram.ui.ActionBar.k6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        int i19 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor2, i19, null);
        int i20 = r22;
        this.F.setPadding(i20, i20, i20, org.telegram.messenger.g0.L(6.0f));
        this.F.setBackgroundDrawable(null);
        this.F.setGravity(org.telegram.messenger.bd.a0 ? 5 : 3);
        this.F.setInputType(180225);
        this.F.setImeOptions(6);
        this.F.setEnabled(this.D0 != null || org.telegram.messenger.t3.d(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.F;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.F.setFilters(new InputFilter[]{new InputFilter.LengthFilter(org.telegram.messenger.hs.e4)});
        this.F.setHint(org.telegram.messenger.bd.M0(2131751461, "DescriptionOptionalPlaceholder"));
        org.telegram.ui.ActionBar.r6.v(this.F, i19);
        this.F.setCursorSize(org.telegram.messenger.g0.L(20.0f));
        this.F.setCursorWidth(1.5f);
        if (this.F.isEnabled()) {
            this.E.addView(this.F, b8.mf.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.E.addView(this.F, b8.mf.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.F.setOnEditorActionListener(new ea(this, 2));
        this.F.addTextChangedListener(new zc(1));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context);
        this.H = x6Var;
        jm0Var.addView(x6Var, b8.mf.o(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.G = linearLayout4;
        linearLayout4.setOrientation(1);
        jm0Var.addView(this.G, b8.mf.o(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        CharSequence charSequence = "";
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.l8 l8Var7 = new org.telegram.ui.Cells.l8(context);
                this.I = l8Var7;
                org.telegram.ui.ActionBar.r6.S(l8Var7, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i16), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                this.G.addView(this.I, b8.mf.o(-1, -2));
                final int i21 = 15;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                    public final /* synthetic */ ln b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                ln lnVar3 = this.b;
                                lnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", lnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                nq nqVar = new nq(bundle);
                                nqVar.C0(lnVar3.y0);
                                lnVar3.presentFragment(nqVar);
                                break;
                            case 1:
                                ln lnVar4 = this.b;
                                jn jnVar = lnVar4.R0;
                                long j102 = lnVar4.C0;
                                if (!lnVar4.s.g()) {
                                    org.telegram.messenger.ac acVar = null;
                                    TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ln lnVar5 = this.b;
                                lnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                nq nqVar2 = new nq(bundle2);
                                nqVar2.C0(lnVar5.y0);
                                lnVar5.presentFragment(nqVar2);
                                break;
                            case 3:
                                ln lnVar6 = this.b;
                                lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                break;
                            case 4:
                                ln lnVar7 = this.b;
                                lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                break;
                            case 5:
                                ln lnVar8 = this.b;
                                lnVar8.getClass();
                                lnVar8.presentFragment(new kb(lnVar8.x0));
                                break;
                            case 6:
                                ln lnVar9 = this.b;
                                lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                break;
                            case 7:
                                ln lnVar10 = this.b;
                                lnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", lnVar10.C0);
                                lnVar10.presentFragment(new ka(bundle3));
                                break;
                            case 8:
                                ln lnVar11 = this.b;
                                lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                break;
                            case 9:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                ln.c0(this.b);
                                break;
                            case 14:
                                ln lnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                break;
                            case 15:
                                ln lnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(lnVar13)) {
                                    la0 la0Var = new la0(4);
                                    la0Var.m0 = -lnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    la0Var.H0 = new gn(lnVar13, 6);
                                    lnVar13.presentFragment(la0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ln lnVar14 = this.b;
                                long j11 = lnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                bo boVar = new bo(null);
                                boVar.N = new ArrayList();
                                boVar.O = new ArrayList();
                                boVar.Q = new ArrayList();
                                boVar.d0 = true;
                                boVar.g0 = new ArrayList();
                                boVar.p0 = new HashMap();
                                boVar.r0 = new nn(boVar, 5);
                                boVar.t0 = false;
                                boVar.a0 = j11;
                                boVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                boVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        boVar.m0 = tL_chatInviteExported;
                                    } else {
                                        boVar.d0(false);
                                    }
                                }
                                lnVar14.presentFragment(boVar);
                                break;
                            case 17:
                                ln lnVar15 = this.b;
                                long j12 = lnVar15.w0;
                                qo qoVar = new qo(null);
                                qoVar.w = new ArrayList();
                                boolean z172 = false;
                                qoVar.P = false;
                                qoVar.Q = false;
                                qoVar.F = j12;
                                TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                qoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                    z172 = true;
                                }
                                qoVar.s = z172;
                                qoVar.h = lnVar15.y0;
                                lnVar15.presentFragment(qoVar);
                                break;
                            case 18:
                                ln lnVar16 = this.b;
                                xr0 xr0Var = new xr0(lnVar16.w0);
                                xr0Var.s = new gn(lnVar16, 4);
                                lnVar16.presentFragment(xr0Var);
                                break;
                            case 19:
                                ln.e0(this.b);
                                break;
                            case 20:
                                ln lnVar17 = this.b;
                                e40 e40Var = new e40(-lnVar17.x0.id);
                                e40Var.c = lnVar17.M0;
                                e40Var.m0 = lnVar17;
                                lnVar17.presentFragment(e40Var);
                                break;
                            case 21:
                                ln lnVar18 = this.b;
                                lnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                nq nqVar3 = new nq(bundle4);
                                nqVar3.C0(lnVar18.y0);
                                lnVar18.presentFragment(nqVar3);
                                break;
                            case 22:
                                ln lnVar19 = this.b;
                                xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                lnVar19.presentFragment(xe0Var);
                                break;
                            case 23:
                                ln lnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                    lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", lnVar20.w0);
                                    xo xoVar = new xo(bundle5);
                                    TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                    xoVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xoVar.a == null) {
                                            xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                        }
                                        xoVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xoVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xoVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            xoVar.w = 1;
                                        }
                                    }
                                    lnVar20.presentFragment(xoVar);
                                    break;
                                }
                            default:
                                ln lnVar21 = this.b;
                                lnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", lnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                lnVar21.presentFragment(new wm(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.l8 l8Var8 = new org.telegram.ui.Cells.l8(context);
                this.J = l8Var8;
                org.telegram.ui.ActionBar.r6.S(l8Var8, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i16), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                this.G.addView(this.J, b8.mf.o(-1, -2));
                final int i22 = 16;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                    public final /* synthetic */ ln b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                ln lnVar3 = this.b;
                                lnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", lnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                nq nqVar = new nq(bundle);
                                nqVar.C0(lnVar3.y0);
                                lnVar3.presentFragment(nqVar);
                                break;
                            case 1:
                                ln lnVar4 = this.b;
                                jn jnVar = lnVar4.R0;
                                long j102 = lnVar4.C0;
                                if (!lnVar4.s.g()) {
                                    org.telegram.messenger.ac acVar = null;
                                    TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ln lnVar5 = this.b;
                                lnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                nq nqVar2 = new nq(bundle2);
                                nqVar2.C0(lnVar5.y0);
                                lnVar5.presentFragment(nqVar2);
                                break;
                            case 3:
                                ln lnVar6 = this.b;
                                lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                break;
                            case 4:
                                ln lnVar7 = this.b;
                                lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                break;
                            case 5:
                                ln lnVar8 = this.b;
                                lnVar8.getClass();
                                lnVar8.presentFragment(new kb(lnVar8.x0));
                                break;
                            case 6:
                                ln lnVar9 = this.b;
                                lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                break;
                            case 7:
                                ln lnVar10 = this.b;
                                lnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", lnVar10.C0);
                                lnVar10.presentFragment(new ka(bundle3));
                                break;
                            case 8:
                                ln lnVar11 = this.b;
                                lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                break;
                            case 9:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                ln.c0(this.b);
                                break;
                            case 14:
                                ln lnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                break;
                            case 15:
                                ln lnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(lnVar13)) {
                                    la0 la0Var = new la0(4);
                                    la0Var.m0 = -lnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    la0Var.H0 = new gn(lnVar13, 6);
                                    lnVar13.presentFragment(la0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ln lnVar14 = this.b;
                                long j11 = lnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                bo boVar = new bo(null);
                                boVar.N = new ArrayList();
                                boVar.O = new ArrayList();
                                boVar.Q = new ArrayList();
                                boVar.d0 = true;
                                boVar.g0 = new ArrayList();
                                boVar.p0 = new HashMap();
                                boVar.r0 = new nn(boVar, 5);
                                boVar.t0 = false;
                                boVar.a0 = j11;
                                boVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                boVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        boVar.m0 = tL_chatInviteExported;
                                    } else {
                                        boVar.d0(false);
                                    }
                                }
                                lnVar14.presentFragment(boVar);
                                break;
                            case 17:
                                ln lnVar15 = this.b;
                                long j12 = lnVar15.w0;
                                qo qoVar = new qo(null);
                                qoVar.w = new ArrayList();
                                boolean z172 = false;
                                qoVar.P = false;
                                qoVar.Q = false;
                                qoVar.F = j12;
                                TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                qoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                    z172 = true;
                                }
                                qoVar.s = z172;
                                qoVar.h = lnVar15.y0;
                                lnVar15.presentFragment(qoVar);
                                break;
                            case 18:
                                ln lnVar16 = this.b;
                                xr0 xr0Var = new xr0(lnVar16.w0);
                                xr0Var.s = new gn(lnVar16, 4);
                                lnVar16.presentFragment(xr0Var);
                                break;
                            case 19:
                                ln.e0(this.b);
                                break;
                            case 20:
                                ln lnVar17 = this.b;
                                e40 e40Var = new e40(-lnVar17.x0.id);
                                e40Var.c = lnVar17.M0;
                                e40Var.m0 = lnVar17;
                                lnVar17.presentFragment(e40Var);
                                break;
                            case 21:
                                ln lnVar18 = this.b;
                                lnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                nq nqVar3 = new nq(bundle4);
                                nqVar3.C0(lnVar18.y0);
                                lnVar18.presentFragment(nqVar3);
                                break;
                            case 22:
                                ln lnVar19 = this.b;
                                xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                lnVar19.presentFragment(xe0Var);
                                break;
                            case 23:
                                ln lnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                    lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", lnVar20.w0);
                                    xo xoVar = new xo(bundle5);
                                    TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                    xoVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xoVar.a == null) {
                                            xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                        }
                                        xoVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xoVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xoVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            xoVar.w = 1;
                                        }
                                    }
                                    lnVar20.presentFragment(xoVar);
                                    break;
                                }
                            default:
                                ln lnVar21 = this.b;
                                lnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", lnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                lnVar21.presentFragment(new wm(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.T(this.x0) && ((this.J0 && org.telegram.messenger.t3.y(1, this.x0)) || (!this.J0 && org.telegram.messenger.t3.y(0, this.x0)))) {
                org.telegram.ui.Cells.l8 l8Var9 = new org.telegram.ui.Cells.l8(context);
                this.K = l8Var9;
                org.telegram.ui.ActionBar.r6.S(l8Var9, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i16), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                this.G.addView(this.K, b8.mf.o(-1, -2));
                final int i23 = 17;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                    public final /* synthetic */ ln b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                ln lnVar3 = this.b;
                                lnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", lnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                nq nqVar = new nq(bundle);
                                nqVar.C0(lnVar3.y0);
                                lnVar3.presentFragment(nqVar);
                                break;
                            case 1:
                                ln lnVar4 = this.b;
                                jn jnVar = lnVar4.R0;
                                long j102 = lnVar4.C0;
                                if (!lnVar4.s.g()) {
                                    org.telegram.messenger.ac acVar = null;
                                    TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ln lnVar5 = this.b;
                                lnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                nq nqVar2 = new nq(bundle2);
                                nqVar2.C0(lnVar5.y0);
                                lnVar5.presentFragment(nqVar2);
                                break;
                            case 3:
                                ln lnVar6 = this.b;
                                lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                break;
                            case 4:
                                ln lnVar7 = this.b;
                                lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                break;
                            case 5:
                                ln lnVar8 = this.b;
                                lnVar8.getClass();
                                lnVar8.presentFragment(new kb(lnVar8.x0));
                                break;
                            case 6:
                                ln lnVar9 = this.b;
                                lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                break;
                            case 7:
                                ln lnVar10 = this.b;
                                lnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", lnVar10.C0);
                                lnVar10.presentFragment(new ka(bundle3));
                                break;
                            case 8:
                                ln lnVar11 = this.b;
                                lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                break;
                            case 9:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                ln.c0(this.b);
                                break;
                            case 14:
                                ln lnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                break;
                            case 15:
                                ln lnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(lnVar13)) {
                                    la0 la0Var = new la0(4);
                                    la0Var.m0 = -lnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    la0Var.H0 = new gn(lnVar13, 6);
                                    lnVar13.presentFragment(la0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ln lnVar14 = this.b;
                                long j11 = lnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                bo boVar = new bo(null);
                                boVar.N = new ArrayList();
                                boVar.O = new ArrayList();
                                boVar.Q = new ArrayList();
                                boVar.d0 = true;
                                boVar.g0 = new ArrayList();
                                boVar.p0 = new HashMap();
                                boVar.r0 = new nn(boVar, 5);
                                boVar.t0 = false;
                                boVar.a0 = j11;
                                boVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                boVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        boVar.m0 = tL_chatInviteExported;
                                    } else {
                                        boVar.d0(false);
                                    }
                                }
                                lnVar14.presentFragment(boVar);
                                break;
                            case 17:
                                ln lnVar15 = this.b;
                                long j12 = lnVar15.w0;
                                qo qoVar = new qo(null);
                                qoVar.w = new ArrayList();
                                boolean z172 = false;
                                qoVar.P = false;
                                qoVar.Q = false;
                                qoVar.F = j12;
                                TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                qoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                    z172 = true;
                                }
                                qoVar.s = z172;
                                qoVar.h = lnVar15.y0;
                                lnVar15.presentFragment(qoVar);
                                break;
                            case 18:
                                ln lnVar16 = this.b;
                                xr0 xr0Var = new xr0(lnVar16.w0);
                                xr0Var.s = new gn(lnVar16, 4);
                                lnVar16.presentFragment(xr0Var);
                                break;
                            case 19:
                                ln.e0(this.b);
                                break;
                            case 20:
                                ln lnVar17 = this.b;
                                e40 e40Var = new e40(-lnVar17.x0.id);
                                e40Var.c = lnVar17.M0;
                                e40Var.m0 = lnVar17;
                                lnVar17.presentFragment(e40Var);
                                break;
                            case 21:
                                ln lnVar18 = this.b;
                                lnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                nq nqVar3 = new nq(bundle4);
                                nqVar3.C0(lnVar18.y0);
                                lnVar18.presentFragment(nqVar3);
                                break;
                            case 22:
                                ln lnVar19 = this.b;
                                xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                lnVar19.presentFragment(xe0Var);
                                break;
                            case 23:
                                ln lnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                    lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", lnVar20.w0);
                                    xo xoVar = new xo(bundle5);
                                    TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                    xoVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xoVar.a == null) {
                                            xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                        }
                                        xoVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xoVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xoVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            xoVar.w = 1;
                                        }
                                    }
                                    lnVar20.presentFragment(xoVar);
                                    break;
                                }
                            default:
                                ln lnVar21 = this.b;
                                lnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", lnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                lnVar21.presentFragment(new wm(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.V(this.x0) && this.J0 && org.telegram.messenger.t3.y(1, this.x0)) {
                org.telegram.ui.Cells.l8 l8Var10 = new org.telegram.ui.Cells.l8(context);
                this.L = l8Var10;
                org.telegram.ui.ActionBar.r6.S(l8Var10, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i16), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                this.L.s(org.telegram.messenger.bd.L0(2131747104), "", R.drawable.msg_markunread, true);
                this.G.addView(this.L, b8.mf.o(-1, -2));
                final int i24 = 18;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                    public final /* synthetic */ ln b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                ln lnVar3 = this.b;
                                lnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", lnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                nq nqVar = new nq(bundle);
                                nqVar.C0(lnVar3.y0);
                                lnVar3.presentFragment(nqVar);
                                break;
                            case 1:
                                ln lnVar4 = this.b;
                                jn jnVar = lnVar4.R0;
                                long j102 = lnVar4.C0;
                                if (!lnVar4.s.g()) {
                                    org.telegram.messenger.ac acVar = null;
                                    TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ln lnVar5 = this.b;
                                lnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                nq nqVar2 = new nq(bundle2);
                                nqVar2.C0(lnVar5.y0);
                                lnVar5.presentFragment(nqVar2);
                                break;
                            case 3:
                                ln lnVar6 = this.b;
                                lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                break;
                            case 4:
                                ln lnVar7 = this.b;
                                lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                break;
                            case 5:
                                ln lnVar8 = this.b;
                                lnVar8.getClass();
                                lnVar8.presentFragment(new kb(lnVar8.x0));
                                break;
                            case 6:
                                ln lnVar9 = this.b;
                                lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                break;
                            case 7:
                                ln lnVar10 = this.b;
                                lnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", lnVar10.C0);
                                lnVar10.presentFragment(new ka(bundle3));
                                break;
                            case 8:
                                ln lnVar11 = this.b;
                                lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                break;
                            case 9:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                ln.c0(this.b);
                                break;
                            case 14:
                                ln lnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                break;
                            case 15:
                                ln lnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(lnVar13)) {
                                    la0 la0Var = new la0(4);
                                    la0Var.m0 = -lnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    la0Var.H0 = new gn(lnVar13, 6);
                                    lnVar13.presentFragment(la0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ln lnVar14 = this.b;
                                long j11 = lnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                bo boVar = new bo(null);
                                boVar.N = new ArrayList();
                                boVar.O = new ArrayList();
                                boVar.Q = new ArrayList();
                                boVar.d0 = true;
                                boVar.g0 = new ArrayList();
                                boVar.p0 = new HashMap();
                                boVar.r0 = new nn(boVar, 5);
                                boVar.t0 = false;
                                boVar.a0 = j11;
                                boVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                boVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        boVar.m0 = tL_chatInviteExported;
                                    } else {
                                        boVar.d0(false);
                                    }
                                }
                                lnVar14.presentFragment(boVar);
                                break;
                            case 17:
                                ln lnVar15 = this.b;
                                long j12 = lnVar15.w0;
                                qo qoVar = new qo(null);
                                qoVar.w = new ArrayList();
                                boolean z172 = false;
                                qoVar.P = false;
                                qoVar.Q = false;
                                qoVar.F = j12;
                                TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                qoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                    z172 = true;
                                }
                                qoVar.s = z172;
                                qoVar.h = lnVar15.y0;
                                lnVar15.presentFragment(qoVar);
                                break;
                            case 18:
                                ln lnVar16 = this.b;
                                xr0 xr0Var = new xr0(lnVar16.w0);
                                xr0Var.s = new gn(lnVar16, 4);
                                lnVar16.presentFragment(xr0Var);
                                break;
                            case 19:
                                ln.e0(this.b);
                                break;
                            case 20:
                                ln lnVar17 = this.b;
                                e40 e40Var = new e40(-lnVar17.x0.id);
                                e40Var.c = lnVar17.M0;
                                e40Var.m0 = lnVar17;
                                lnVar17.presentFragment(e40Var);
                                break;
                            case 21:
                                ln lnVar18 = this.b;
                                lnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                nq nqVar3 = new nq(bundle4);
                                nqVar3.C0(lnVar18.y0);
                                lnVar18.presentFragment(nqVar3);
                                break;
                            case 22:
                                ln lnVar19 = this.b;
                                xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                lnVar19.presentFragment(xe0Var);
                                break;
                            case 23:
                                ln lnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                    lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", lnVar20.w0);
                                    xo xoVar = new xo(bundle5);
                                    TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                    xoVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xoVar.a == null) {
                                            xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                        }
                                        xoVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xoVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xoVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            xoVar.w = 1;
                                        }
                                    }
                                    lnVar20.presentFragment(xoVar);
                                    break;
                                }
                            default:
                                ln lnVar21 = this.b;
                                lnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", lnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                lnVar21.presentFragment(new wm(bundle6));
                                break;
                        }
                    }
                });
            }
            if (org.telegram.messenger.t3.V(this.x0) && org.telegram.messenger.t3.d(this.x0)) {
                i3 = i16;
                z12 = 1;
                il0 il0Var = new il0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.M = il0Var;
                org.telegram.ui.ActionBar.r6.S(il0Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                this.G.addView(this.M, b8.mf.o(-1, -2));
                final int i25 = 19;
                this.M.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.an
                    public final /* synthetic */ ln b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                ln lnVar3 = this.b;
                                lnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", lnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                nq nqVar = new nq(bundle);
                                nqVar.C0(lnVar3.y0);
                                lnVar3.presentFragment(nqVar);
                                break;
                            case 1:
                                ln lnVar4 = this.b;
                                jn jnVar = lnVar4.R0;
                                long j102 = lnVar4.C0;
                                if (!lnVar4.s.g()) {
                                    org.telegram.messenger.ac acVar = null;
                                    TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ln lnVar5 = this.b;
                                lnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                nq nqVar2 = new nq(bundle2);
                                nqVar2.C0(lnVar5.y0);
                                lnVar5.presentFragment(nqVar2);
                                break;
                            case 3:
                                ln lnVar6 = this.b;
                                lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                break;
                            case 4:
                                ln lnVar7 = this.b;
                                lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                break;
                            case 5:
                                ln lnVar8 = this.b;
                                lnVar8.getClass();
                                lnVar8.presentFragment(new kb(lnVar8.x0));
                                break;
                            case 6:
                                ln lnVar9 = this.b;
                                lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                break;
                            case 7:
                                ln lnVar10 = this.b;
                                lnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", lnVar10.C0);
                                lnVar10.presentFragment(new ka(bundle3));
                                break;
                            case 8:
                                ln lnVar11 = this.b;
                                lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                break;
                            case 9:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                ln.c0(this.b);
                                break;
                            case 14:
                                ln lnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                break;
                            case 15:
                                ln lnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(lnVar13)) {
                                    la0 la0Var = new la0(4);
                                    la0Var.m0 = -lnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    la0Var.H0 = new gn(lnVar13, 6);
                                    lnVar13.presentFragment(la0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ln lnVar14 = this.b;
                                long j11 = lnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                bo boVar = new bo(null);
                                boVar.N = new ArrayList();
                                boVar.O = new ArrayList();
                                boVar.Q = new ArrayList();
                                boVar.d0 = true;
                                boVar.g0 = new ArrayList();
                                boVar.p0 = new HashMap();
                                boVar.r0 = new nn(boVar, 5);
                                boVar.t0 = false;
                                boVar.a0 = j11;
                                boVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                boVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        boVar.m0 = tL_chatInviteExported;
                                    } else {
                                        boVar.d0(false);
                                    }
                                }
                                lnVar14.presentFragment(boVar);
                                break;
                            case 17:
                                ln lnVar15 = this.b;
                                long j12 = lnVar15.w0;
                                qo qoVar = new qo(null);
                                qoVar.w = new ArrayList();
                                boolean z172 = false;
                                qoVar.P = false;
                                qoVar.Q = false;
                                qoVar.F = j12;
                                TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                qoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                    z172 = true;
                                }
                                qoVar.s = z172;
                                qoVar.h = lnVar15.y0;
                                lnVar15.presentFragment(qoVar);
                                break;
                            case 18:
                                ln lnVar16 = this.b;
                                xr0 xr0Var = new xr0(lnVar16.w0);
                                xr0Var.s = new gn(lnVar16, 4);
                                lnVar16.presentFragment(xr0Var);
                                break;
                            case 19:
                                ln.e0(this.b);
                                break;
                            case 20:
                                ln lnVar17 = this.b;
                                e40 e40Var = new e40(-lnVar17.x0.id);
                                e40Var.c = lnVar17.M0;
                                e40Var.m0 = lnVar17;
                                lnVar17.presentFragment(e40Var);
                                break;
                            case 21:
                                ln lnVar18 = this.b;
                                lnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                nq nqVar3 = new nq(bundle4);
                                nqVar3.C0(lnVar18.y0);
                                lnVar18.presentFragment(nqVar3);
                                break;
                            case 22:
                                ln lnVar19 = this.b;
                                xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                lnVar19.presentFragment(xe0Var);
                                break;
                            case 23:
                                ln lnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                    lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", lnVar20.w0);
                                    xo xoVar = new xo(bundle5);
                                    TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                    xoVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xoVar.a == null) {
                                            xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                        }
                                        xoVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xoVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xoVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            xoVar.w = 1;
                                        }
                                    }
                                    lnVar20.presentFragment(xoVar);
                                    break;
                                }
                            default:
                                ln lnVar21 = this.b;
                                lnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", lnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                lnVar21.presentFragment(new wm(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i3 = i16;
                z12 = 1;
            }
            if (!org.telegram.messenger.t3.V(this.x0) || org.telegram.messenger.t3.Y(this.x0)) {
                context3 = context;
                frameLayout = frameLayout2;
                num = 1;
                lnVar = this;
            } else {
                long j11 = -this.x0.id;
                num = 1;
                org.telegram.ui.Cells.l8 l8Var11 = new org.telegram.ui.Cells.l8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.N = l8Var11;
                org.telegram.ui.ActionBar.r6.S(l8Var11, org.telegram.ui.ActionBar.k6.N0(z12), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                this.N.n(R.drawable.msg_translate, org.telegram.messenger.bd.L0(2131752458), this.x0.autotranslation);
                final int i26 = 0;
                getMessagesController().G0().a(j11, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.en
                    public final /* synthetic */ ln b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        int i27 = i26;
                        ln lnVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i27) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    lnVar3.getClass();
                                    break;
                                } else {
                                    lnVar3.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < lnVar3.getMessagesController().A4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                lnVar3.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                this.G.addView(this.N, b8.mf.o(-1, -2));
                boolean[] zArr = new boolean[z12];
                zArr[0] = false;
                frameLayout = frameLayout2;
                lnVar = this;
                this.N.setOnClickListener(new ci.c3(this, zArr, j11, 1));
            }
            final int i27 = 20;
            if (!lnVar.J0 && org.telegram.messenger.t3.w(2, lnVar.x0) && (org.telegram.messenger.t3.T(lnVar.x0) || lnVar.x0.creator)) {
                org.telegram.ui.Cells.l8 l8Var12 = new org.telegram.ui.Cells.l8(context3);
                lnVar.O = l8Var12;
                org.telegram.ui.ActionBar.r6.S(l8Var12, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                lnVar.G.addView(lnVar.O, b8.mf.o(-1, -2));
                lnVar.O.setOnClickListener(new org.telegram.messenger.video.g(i27, lnVar, context3));
            }
            if (org.telegram.messenger.t3.n0(lnVar.x0) && org.telegram.messenger.t3.N(lnVar.x0) && !org.telegram.messenger.t3.Y(lnVar.x0)) {
                final int i28 = 1;
                org.telegram.messenger.hp.s1(lnVar.currentAccount).G0().a(-lnVar.x0.id, new org.telegram.messenger.u10(lnVar) { // from class: org.telegram.ui.en
                    public final /* synthetic */ ln b;

                    {
                        this.b = lnVar;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        int i272 = i28;
                        ln lnVar3 = this.b;
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        switch (i272) {
                            case 0:
                                if (tL_premium_boostsStatus == null) {
                                    lnVar3.getClass();
                                    break;
                                } else {
                                    lnVar3.N.getCheckBox().setIcon(tL_premium_boostsStatus.level < lnVar3.getMessagesController().A4 ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                lnVar3.M0 = tL_premium_boostsStatus;
                                break;
                        }
                    }
                });
                il0 il0Var2 = new il0(lnVar.currentAccount, -lnVar.x0.id, context3, lnVar.getResourceProvider());
                lnVar.M = il0Var2;
                org.telegram.ui.ActionBar.r6.S(il0Var2, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                lnVar.G.addView(lnVar.M, b8.mf.o(-1, -2));
                lnVar.M.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                    public final /* synthetic */ ln b;

                    {
                        this.b = lnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                ln lnVar3 = this.b;
                                lnVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", lnVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                nq nqVar = new nq(bundle);
                                nqVar.C0(lnVar3.y0);
                                lnVar3.presentFragment(nqVar);
                                break;
                            case 1:
                                ln lnVar4 = this.b;
                                jn jnVar = lnVar4.R0;
                                long j102 = lnVar4.C0;
                                if (!lnVar4.s.g()) {
                                    org.telegram.messenger.ac acVar = null;
                                    TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                    if (a22 == null) {
                                        TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = M0.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                            int i182 = chatPhoto2.dc_id;
                                            if (i182 != 0) {
                                                chatPhoto2.photo_big.dc_id = i182;
                                            }
                                            TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.v1().N2(null, lnVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                            int i192 = userProfilePhoto2.dc_id;
                                            if (i192 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i192;
                                            }
                                            PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ln lnVar5 = this.b;
                                lnVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", lnVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                nq nqVar2 = new nq(bundle2);
                                nqVar2.C0(lnVar5.y0);
                                lnVar5.presentFragment(nqVar2);
                                break;
                            case 3:
                                ln lnVar6 = this.b;
                                lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                break;
                            case 4:
                                ln lnVar7 = this.b;
                                lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                break;
                            case 5:
                                ln lnVar8 = this.b;
                                lnVar8.getClass();
                                lnVar8.presentFragment(new kb(lnVar8.x0));
                                break;
                            case 6:
                                ln lnVar9 = this.b;
                                lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                break;
                            case 7:
                                ln lnVar10 = this.b;
                                lnVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", lnVar10.C0);
                                lnVar10.presentFragment(new ka(bundle3));
                                break;
                            case 8:
                                ln lnVar11 = this.b;
                                lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                break;
                            case 9:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                break;
                            case 12:
                                this.b.n0();
                                break;
                            case 13:
                                ln.c0(this.b);
                                break;
                            case 14:
                                ln lnVar12 = this.b;
                                org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                break;
                            case 15:
                                ln lnVar13 = this.b;
                                if (org.telegram.messenger.g0.J1(lnVar13)) {
                                    la0 la0Var = new la0(4);
                                    la0Var.m0 = -lnVar13.w0;
                                    TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    la0Var.H0 = new gn(lnVar13, 6);
                                    lnVar13.presentFragment(la0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ln lnVar14 = this.b;
                                long j112 = lnVar14.w0;
                                org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                bo boVar = new bo(null);
                                boVar.N = new ArrayList();
                                boVar.O = new ArrayList();
                                boVar.Q = new ArrayList();
                                boVar.d0 = true;
                                boVar.g0 = new ArrayList();
                                boVar.p0 = new HashMap();
                                boVar.r0 = new nn(boVar, 5);
                                boVar.t0 = false;
                                boVar.a0 = j112;
                                boVar.o0 = z162;
                                TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                boVar.Z = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        boVar.m0 = tL_chatInviteExported;
                                    } else {
                                        boVar.d0(false);
                                    }
                                }
                                lnVar14.presentFragment(boVar);
                                break;
                            case 17:
                                ln lnVar15 = this.b;
                                long j12 = lnVar15.w0;
                                qo qoVar = new qo(null);
                                qoVar.w = new ArrayList();
                                boolean z172 = false;
                                qoVar.P = false;
                                qoVar.Q = false;
                                qoVar.F = j12;
                                TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                qoVar.f = M02;
                                if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                    z172 = true;
                                }
                                qoVar.s = z172;
                                qoVar.h = lnVar15.y0;
                                lnVar15.presentFragment(qoVar);
                                break;
                            case 18:
                                ln lnVar16 = this.b;
                                xr0 xr0Var = new xr0(lnVar16.w0);
                                xr0Var.s = new gn(lnVar16, 4);
                                lnVar16.presentFragment(xr0Var);
                                break;
                            case 19:
                                ln.e0(this.b);
                                break;
                            case 20:
                                ln lnVar17 = this.b;
                                e40 e40Var = new e40(-lnVar17.x0.id);
                                e40Var.c = lnVar17.M0;
                                e40Var.m0 = lnVar17;
                                lnVar17.presentFragment(e40Var);
                                break;
                            case 21:
                                ln lnVar18 = this.b;
                                lnVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", lnVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                nq nqVar3 = new nq(bundle4);
                                nqVar3.C0(lnVar18.y0);
                                lnVar18.presentFragment(nqVar3);
                                break;
                            case 22:
                                ln lnVar19 = this.b;
                                xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                lnVar19.presentFragment(xe0Var);
                                break;
                            case 23:
                                ln lnVar20 = this.b;
                                if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                    lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", lnVar20.w0);
                                    xo xoVar = new xo(bundle5);
                                    TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                    xoVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (xoVar.a == null) {
                                            xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                        }
                                        xoVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            xoVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            xoVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                    xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                }
                                            }
                                            xoVar.w = 1;
                                        }
                                    }
                                    lnVar20.presentFragment(xoVar);
                                    break;
                                }
                            default:
                                ln lnVar21 = this.b;
                                lnVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", lnVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                lnVar21.presentFragment(new wm(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!lnVar.J0 && lnVar.x0.creator) {
                org.telegram.ui.Cells.l8 l8Var13 = new org.telegram.ui.Cells.l8(23, context, null, false, true);
                context2 = context;
                lnVar.R = l8Var13;
                org.telegram.ui.ActionBar.r6.S(l8Var13, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(i3), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                lnVar.R.n(R.drawable.msg_topics, org.telegram.messenger.bd.L0(2131752281), lnVar.F0);
                lnVar.R.getCheckBox().setIcon(lnVar.G0 ? 0 : R.drawable.permission_locked);
                lnVar.G.addView(lnVar.R, b8.mf.c(-2.0f, -1));
                lnVar.R.setOnClickListener(new org.telegram.messenger.video.g(21, lnVar, frameLayout));
            } else {
                context2 = context;
            }
            lnVar.t0();
        } else {
            i3 = i16;
            context2 = context;
            num = 1;
            lnVar = this;
        }
        lnVar.simpleActionBar.o();
        if (lnVar.D0 != null || org.telegram.messenger.t3.d(lnVar.x0) || lnVar.O != null) {
            lnVar.a = lnVar.simpleActionBar.n(org.telegram.messenger.bd.L0(2131745956));
        }
        if (lnVar.I == null && lnVar.O == null && lnVar.J == null && lnVar.K == null && lnVar.R == null) {
            i10 = -2;
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(12, context2, lnVar.resourceProvider);
            lnVar.Q = y8Var;
            if (lnVar.R != null) {
                y8Var.setText(org.telegram.messenger.bd.L0(2131750589));
            } else {
                y8Var.setFixedSize(12);
            }
            i10 = -2;
            jm0Var.addView(lnVar.Q, b8.mf.o(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        lnVar.S = linearLayout5;
        linearLayout5.setOrientation(1);
        jm0Var.addView(lnVar.S, b8.mf.o(-1, i10));
        final int i29 = 8;
        if (lnVar.x0 != null) {
            org.telegram.ui.Cells.l8 l8Var14 = new org.telegram.ui.Cells.l8(context2);
            lnVar.Y = l8Var14;
            org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(false);
            int i30 = org.telegram.ui.ActionBar.k6.i6;
            n6Var = null;
            org.telegram.ui.ActionBar.r6.S(l8Var14, N0, null, org.telegram.ui.ActionBar.r6.N(i30));
            org.telegram.ui.Cells.l8 l8Var15 = lnVar.Y;
            if (!org.telegram.messenger.t3.T(lnVar.x0)) {
                TLRPC.Chat chat5 = lnVar.x0;
                if (!chat5.creator && (!org.telegram.messenger.t3.N(chat5) || !org.telegram.messenger.t3.d(lnVar.x0))) {
                    i12 = 8;
                    l8Var15.setVisibility(i12);
                    final int i31 = 21;
                    lnVar.Y.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j12 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j12;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l8 l8Var16 = new org.telegram.ui.Cells.l8(context2);
                    lnVar.W = l8Var16;
                    org.telegram.ui.ActionBar.r6.S(l8Var16, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                    final int i32 = 22;
                    lnVar.W.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j12 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j12;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l8 l8Var17 = new org.telegram.ui.Cells.l8(context2);
                    lnVar.P = l8Var17;
                    org.telegram.ui.ActionBar.r6.S(l8Var17, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                    final int i33 = 23;
                    lnVar.P.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j12 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j12;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    if (org.telegram.messenger.t3.y(28, lnVar.x0)) {
                        org.telegram.ui.Cells.l8 l8Var18 = new org.telegram.ui.Cells.l8(context2);
                        lnVar.f0 = l8Var18;
                        org.telegram.ui.ActionBar.r6.S(l8Var18, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                        final int i34 = 24;
                        lnVar.f0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                            public final /* synthetic */ ln b;

                            {
                                this.b = lnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i34) {
                                    case 0:
                                        ln lnVar3 = this.b;
                                        lnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", lnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        nq nqVar = new nq(bundle);
                                        nqVar.C0(lnVar3.y0);
                                        lnVar3.presentFragment(nqVar);
                                        break;
                                    case 1:
                                        ln lnVar4 = this.b;
                                        jn jnVar = lnVar4.R0;
                                        long j102 = lnVar4.C0;
                                        if (!lnVar4.s.g()) {
                                            org.telegram.messenger.ac acVar = null;
                                            TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ln lnVar5 = this.b;
                                        lnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", lnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        nq nqVar2 = new nq(bundle2);
                                        nqVar2.C0(lnVar5.y0);
                                        lnVar5.presentFragment(nqVar2);
                                        break;
                                    case 3:
                                        ln lnVar6 = this.b;
                                        lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                        break;
                                    case 4:
                                        ln lnVar7 = this.b;
                                        lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                        break;
                                    case 5:
                                        ln lnVar8 = this.b;
                                        lnVar8.getClass();
                                        lnVar8.presentFragment(new kb(lnVar8.x0));
                                        break;
                                    case 6:
                                        ln lnVar9 = this.b;
                                        lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                        break;
                                    case 7:
                                        ln lnVar10 = this.b;
                                        lnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", lnVar10.C0);
                                        lnVar10.presentFragment(new ka(bundle3));
                                        break;
                                    case 8:
                                        ln lnVar11 = this.b;
                                        lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                        break;
                                    case 9:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        ln.c0(this.b);
                                        break;
                                    case 14:
                                        ln lnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                        break;
                                    case 15:
                                        ln lnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(lnVar13)) {
                                            la0 la0Var = new la0(4);
                                            la0Var.m0 = -lnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            la0Var.H0 = new gn(lnVar13, 6);
                                            lnVar13.presentFragment(la0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ln lnVar14 = this.b;
                                        long j112 = lnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        bo boVar = new bo(null);
                                        boVar.N = new ArrayList();
                                        boVar.O = new ArrayList();
                                        boVar.Q = new ArrayList();
                                        boVar.d0 = true;
                                        boVar.g0 = new ArrayList();
                                        boVar.p0 = new HashMap();
                                        boVar.r0 = new nn(boVar, 5);
                                        boVar.t0 = false;
                                        boVar.a0 = j112;
                                        boVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                        boVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                boVar.m0 = tL_chatInviteExported;
                                            } else {
                                                boVar.d0(false);
                                            }
                                        }
                                        lnVar14.presentFragment(boVar);
                                        break;
                                    case 17:
                                        ln lnVar15 = this.b;
                                        long j12 = lnVar15.w0;
                                        qo qoVar = new qo(null);
                                        qoVar.w = new ArrayList();
                                        boolean z172 = false;
                                        qoVar.P = false;
                                        qoVar.Q = false;
                                        qoVar.F = j12;
                                        TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                        qoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        qoVar.s = z172;
                                        qoVar.h = lnVar15.y0;
                                        lnVar15.presentFragment(qoVar);
                                        break;
                                    case 18:
                                        ln lnVar16 = this.b;
                                        xr0 xr0Var = new xr0(lnVar16.w0);
                                        xr0Var.s = new gn(lnVar16, 4);
                                        lnVar16.presentFragment(xr0Var);
                                        break;
                                    case 19:
                                        ln.e0(this.b);
                                        break;
                                    case 20:
                                        ln lnVar17 = this.b;
                                        e40 e40Var = new e40(-lnVar17.x0.id);
                                        e40Var.c = lnVar17.M0;
                                        e40Var.m0 = lnVar17;
                                        lnVar17.presentFragment(e40Var);
                                        break;
                                    case 21:
                                        ln lnVar18 = this.b;
                                        lnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", lnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                        nq nqVar3 = new nq(bundle4);
                                        nqVar3.C0(lnVar18.y0);
                                        lnVar18.presentFragment(nqVar3);
                                        break;
                                    case 22:
                                        ln lnVar19 = this.b;
                                        xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                        xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                        lnVar19.presentFragment(xe0Var);
                                        break;
                                    case 23:
                                        ln lnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                            lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", lnVar20.w0);
                                            xo xoVar = new xo(bundle5);
                                            TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                            xoVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xoVar.a == null) {
                                                    xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                                }
                                                xoVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xoVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xoVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    xoVar.w = 1;
                                                }
                                            }
                                            lnVar20.presentFragment(xoVar);
                                            break;
                                        }
                                    default:
                                        ln lnVar21 = this.b;
                                        lnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", lnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                        lnVar21.presentFragment(new wm(bundle6));
                                        break;
                                }
                            }
                        });
                        lnVar.k0();
                    }
                    org.telegram.ui.Cells.l8 l8Var19 = new org.telegram.ui.Cells.l8(context2);
                    lnVar.X = l8Var19;
                    final int i35 = 0;
                    org.telegram.ui.ActionBar.r6.S(l8Var19, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                    lnVar.X.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i35) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j12 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j12;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.l8 l8Var20 = new org.telegram.ui.Cells.l8(context2);
                    lnVar.U = l8Var20;
                    org.telegram.ui.ActionBar.r6.S(l8Var20, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                    final int i36 = 2;
                    lnVar.U.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j12 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j12;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!org.telegram.messenger.t3.V(lnVar.x0)) {
                        org.telegram.ui.Cells.l8 l8Var21 = new org.telegram.ui.Cells.l8(context2);
                        lnVar.V = l8Var21;
                        org.telegram.ui.ActionBar.r6.S(l8Var21, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                        final int i37 = 3;
                        lnVar.V.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                            public final /* synthetic */ ln b;

                            {
                                this.b = lnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i37) {
                                    case 0:
                                        ln lnVar3 = this.b;
                                        lnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", lnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        nq nqVar = new nq(bundle);
                                        nqVar.C0(lnVar3.y0);
                                        lnVar3.presentFragment(nqVar);
                                        break;
                                    case 1:
                                        ln lnVar4 = this.b;
                                        jn jnVar = lnVar4.R0;
                                        long j102 = lnVar4.C0;
                                        if (!lnVar4.s.g()) {
                                            org.telegram.messenger.ac acVar = null;
                                            TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ln lnVar5 = this.b;
                                        lnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", lnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        nq nqVar2 = new nq(bundle2);
                                        nqVar2.C0(lnVar5.y0);
                                        lnVar5.presentFragment(nqVar2);
                                        break;
                                    case 3:
                                        ln lnVar6 = this.b;
                                        lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                        break;
                                    case 4:
                                        ln lnVar7 = this.b;
                                        lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                        break;
                                    case 5:
                                        ln lnVar8 = this.b;
                                        lnVar8.getClass();
                                        lnVar8.presentFragment(new kb(lnVar8.x0));
                                        break;
                                    case 6:
                                        ln lnVar9 = this.b;
                                        lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                        break;
                                    case 7:
                                        ln lnVar10 = this.b;
                                        lnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", lnVar10.C0);
                                        lnVar10.presentFragment(new ka(bundle3));
                                        break;
                                    case 8:
                                        ln lnVar11 = this.b;
                                        lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                        break;
                                    case 9:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        ln.c0(this.b);
                                        break;
                                    case 14:
                                        ln lnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                        break;
                                    case 15:
                                        ln lnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(lnVar13)) {
                                            la0 la0Var = new la0(4);
                                            la0Var.m0 = -lnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            la0Var.H0 = new gn(lnVar13, 6);
                                            lnVar13.presentFragment(la0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ln lnVar14 = this.b;
                                        long j112 = lnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        bo boVar = new bo(null);
                                        boVar.N = new ArrayList();
                                        boVar.O = new ArrayList();
                                        boVar.Q = new ArrayList();
                                        boVar.d0 = true;
                                        boVar.g0 = new ArrayList();
                                        boVar.p0 = new HashMap();
                                        boVar.r0 = new nn(boVar, 5);
                                        boVar.t0 = false;
                                        boVar.a0 = j112;
                                        boVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                        boVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                boVar.m0 = tL_chatInviteExported;
                                            } else {
                                                boVar.d0(false);
                                            }
                                        }
                                        lnVar14.presentFragment(boVar);
                                        break;
                                    case 17:
                                        ln lnVar15 = this.b;
                                        long j12 = lnVar15.w0;
                                        qo qoVar = new qo(null);
                                        qoVar.w = new ArrayList();
                                        boolean z172 = false;
                                        qoVar.P = false;
                                        qoVar.Q = false;
                                        qoVar.F = j12;
                                        TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                        qoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        qoVar.s = z172;
                                        qoVar.h = lnVar15.y0;
                                        lnVar15.presentFragment(qoVar);
                                        break;
                                    case 18:
                                        ln lnVar16 = this.b;
                                        xr0 xr0Var = new xr0(lnVar16.w0);
                                        xr0Var.s = new gn(lnVar16, 4);
                                        lnVar16.presentFragment(xr0Var);
                                        break;
                                    case 19:
                                        ln.e0(this.b);
                                        break;
                                    case 20:
                                        ln lnVar17 = this.b;
                                        e40 e40Var = new e40(-lnVar17.x0.id);
                                        e40Var.c = lnVar17.M0;
                                        e40Var.m0 = lnVar17;
                                        lnVar17.presentFragment(e40Var);
                                        break;
                                    case 21:
                                        ln lnVar18 = this.b;
                                        lnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", lnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                        nq nqVar3 = new nq(bundle4);
                                        nqVar3.C0(lnVar18.y0);
                                        lnVar18.presentFragment(nqVar3);
                                        break;
                                    case 22:
                                        ln lnVar19 = this.b;
                                        xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                        xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                        lnVar19.presentFragment(xe0Var);
                                        break;
                                    case 23:
                                        ln lnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                            lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", lnVar20.w0);
                                            xo xoVar = new xo(bundle5);
                                            TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                            xoVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xoVar.a == null) {
                                                    xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                                }
                                                xoVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xoVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xoVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    xoVar.w = 1;
                                                }
                                            }
                                            lnVar20.presentFragment(xoVar);
                                            break;
                                        }
                                    default:
                                        ln lnVar21 = this.b;
                                        lnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", lnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                        lnVar21.presentFragment(new wm(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.l8 l8Var22 = new org.telegram.ui.Cells.l8(context2);
                    lnVar.a0 = l8Var22;
                    l8Var22.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.bd.L0(2131752471)), false);
                    org.telegram.ui.ActionBar.r6.S(lnVar.a0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                    final int i38 = 4;
                    lnVar.a0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i38) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j12 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j12;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    lnVar.a0.setVisibility(8);
                    if (!org.telegram.messenger.t3.T(lnVar.x0) || lnVar.x0.gigagroup) {
                        org.telegram.ui.Cells.l8 l8Var23 = new org.telegram.ui.Cells.l8(context2);
                        lnVar.Z = l8Var23;
                        l8Var23.o(R.drawable.msg_log, org.telegram.messenger.bd.L0(2131751080), false);
                        org.telegram.ui.ActionBar.r6.S(lnVar.Z, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                        final int i39 = 5;
                        lnVar.Z.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                            public final /* synthetic */ ln b;

                            {
                                this.b = lnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i39) {
                                    case 0:
                                        ln lnVar3 = this.b;
                                        lnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", lnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        nq nqVar = new nq(bundle);
                                        nqVar.C0(lnVar3.y0);
                                        lnVar3.presentFragment(nqVar);
                                        break;
                                    case 1:
                                        ln lnVar4 = this.b;
                                        jn jnVar = lnVar4.R0;
                                        long j102 = lnVar4.C0;
                                        if (!lnVar4.s.g()) {
                                            org.telegram.messenger.ac acVar = null;
                                            TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ln lnVar5 = this.b;
                                        lnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", lnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        nq nqVar2 = new nq(bundle2);
                                        nqVar2.C0(lnVar5.y0);
                                        lnVar5.presentFragment(nqVar2);
                                        break;
                                    case 3:
                                        ln lnVar6 = this.b;
                                        lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                        break;
                                    case 4:
                                        ln lnVar7 = this.b;
                                        lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                        break;
                                    case 5:
                                        ln lnVar8 = this.b;
                                        lnVar8.getClass();
                                        lnVar8.presentFragment(new kb(lnVar8.x0));
                                        break;
                                    case 6:
                                        ln lnVar9 = this.b;
                                        lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                        break;
                                    case 7:
                                        ln lnVar10 = this.b;
                                        lnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", lnVar10.C0);
                                        lnVar10.presentFragment(new ka(bundle3));
                                        break;
                                    case 8:
                                        ln lnVar11 = this.b;
                                        lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                        break;
                                    case 9:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        ln.c0(this.b);
                                        break;
                                    case 14:
                                        ln lnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                        break;
                                    case 15:
                                        ln lnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(lnVar13)) {
                                            la0 la0Var = new la0(4);
                                            la0Var.m0 = -lnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            la0Var.H0 = new gn(lnVar13, 6);
                                            lnVar13.presentFragment(la0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ln lnVar14 = this.b;
                                        long j112 = lnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        bo boVar = new bo(null);
                                        boVar.N = new ArrayList();
                                        boVar.O = new ArrayList();
                                        boVar.Q = new ArrayList();
                                        boVar.d0 = true;
                                        boVar.g0 = new ArrayList();
                                        boVar.p0 = new HashMap();
                                        boVar.r0 = new nn(boVar, 5);
                                        boVar.t0 = false;
                                        boVar.a0 = j112;
                                        boVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                        boVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                boVar.m0 = tL_chatInviteExported;
                                            } else {
                                                boVar.d0(false);
                                            }
                                        }
                                        lnVar14.presentFragment(boVar);
                                        break;
                                    case 17:
                                        ln lnVar15 = this.b;
                                        long j12 = lnVar15.w0;
                                        qo qoVar = new qo(null);
                                        qoVar.w = new ArrayList();
                                        boolean z172 = false;
                                        qoVar.P = false;
                                        qoVar.Q = false;
                                        qoVar.F = j12;
                                        TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                        qoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        qoVar.s = z172;
                                        qoVar.h = lnVar15.y0;
                                        lnVar15.presentFragment(qoVar);
                                        break;
                                    case 18:
                                        ln lnVar16 = this.b;
                                        xr0 xr0Var = new xr0(lnVar16.w0);
                                        xr0Var.s = new gn(lnVar16, 4);
                                        lnVar16.presentFragment(xr0Var);
                                        break;
                                    case 19:
                                        ln.e0(this.b);
                                        break;
                                    case 20:
                                        ln lnVar17 = this.b;
                                        e40 e40Var = new e40(-lnVar17.x0.id);
                                        e40Var.c = lnVar17.M0;
                                        e40Var.m0 = lnVar17;
                                        lnVar17.presentFragment(e40Var);
                                        break;
                                    case 21:
                                        ln lnVar18 = this.b;
                                        lnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", lnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                        nq nqVar3 = new nq(bundle4);
                                        nqVar3.C0(lnVar18.y0);
                                        lnVar18.presentFragment(nqVar3);
                                        break;
                                    case 22:
                                        ln lnVar19 = this.b;
                                        xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                        xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                        lnVar19.presentFragment(xe0Var);
                                        break;
                                    case 23:
                                        ln lnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                            lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", lnVar20.w0);
                                            xo xoVar = new xo(bundle5);
                                            TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                            xoVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xoVar.a == null) {
                                                    xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                                }
                                                xoVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xoVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xoVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    xoVar.w = 1;
                                                }
                                            }
                                            lnVar20.presentFragment(xoVar);
                                            break;
                                        }
                                    default:
                                        ln lnVar21 = this.b;
                                        lnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", lnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                        lnVar21.presentFragment(new wm(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (org.telegram.messenger.t3.R(lnVar.x0)) {
                        org.telegram.ui.Cells.l8 l8Var24 = new org.telegram.ui.Cells.l8(context2);
                        lnVar.b0 = l8Var24;
                        l8Var24.o(R.drawable.msg_stats, org.telegram.messenger.bd.L0(2131744901), true);
                        org.telegram.ui.ActionBar.r6.S(lnVar.b0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
                        final int i40 = 6;
                        lnVar.b0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                            public final /* synthetic */ ln b;

                            {
                                this.b = lnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i40) {
                                    case 0:
                                        ln lnVar3 = this.b;
                                        lnVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", lnVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        nq nqVar = new nq(bundle);
                                        nqVar.C0(lnVar3.y0);
                                        lnVar3.presentFragment(nqVar);
                                        break;
                                    case 1:
                                        ln lnVar4 = this.b;
                                        jn jnVar = lnVar4.R0;
                                        long j102 = lnVar4.C0;
                                        if (!lnVar4.s.g()) {
                                            org.telegram.messenger.ac acVar = null;
                                            TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                            if (a22 == null) {
                                                TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = M0.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                    int i182 = chatPhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i182;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.v1().N2(null, lnVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                    int i192 = userProfilePhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i192;
                                                    }
                                                    PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ln lnVar5 = this.b;
                                        lnVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", lnVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        nq nqVar2 = new nq(bundle2);
                                        nqVar2.C0(lnVar5.y0);
                                        lnVar5.presentFragment(nqVar2);
                                        break;
                                    case 3:
                                        ln lnVar6 = this.b;
                                        lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                        break;
                                    case 4:
                                        ln lnVar7 = this.b;
                                        lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                        break;
                                    case 5:
                                        ln lnVar8 = this.b;
                                        lnVar8.getClass();
                                        lnVar8.presentFragment(new kb(lnVar8.x0));
                                        break;
                                    case 6:
                                        ln lnVar9 = this.b;
                                        lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                        break;
                                    case 7:
                                        ln lnVar10 = this.b;
                                        lnVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", lnVar10.C0);
                                        lnVar10.presentFragment(new ka(bundle3));
                                        break;
                                    case 8:
                                        ln lnVar11 = this.b;
                                        lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                        break;
                                    case 9:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.n0();
                                        break;
                                    case 13:
                                        ln.c0(this.b);
                                        break;
                                    case 14:
                                        ln lnVar12 = this.b;
                                        org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                        break;
                                    case 15:
                                        ln lnVar13 = this.b;
                                        if (org.telegram.messenger.g0.J1(lnVar13)) {
                                            la0 la0Var = new la0(4);
                                            la0Var.m0 = -lnVar13.w0;
                                            TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            la0Var.H0 = new gn(lnVar13, 6);
                                            lnVar13.presentFragment(la0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ln lnVar14 = this.b;
                                        long j112 = lnVar14.w0;
                                        org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                        boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                        bo boVar = new bo(null);
                                        boVar.N = new ArrayList();
                                        boVar.O = new ArrayList();
                                        boVar.Q = new ArrayList();
                                        boVar.d0 = true;
                                        boVar.g0 = new ArrayList();
                                        boVar.p0 = new HashMap();
                                        boVar.r0 = new nn(boVar, 5);
                                        boVar.t0 = false;
                                        boVar.a0 = j112;
                                        boVar.o0 = z162;
                                        TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                        boVar.Z = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                boVar.m0 = tL_chatInviteExported;
                                            } else {
                                                boVar.d0(false);
                                            }
                                        }
                                        lnVar14.presentFragment(boVar);
                                        break;
                                    case 17:
                                        ln lnVar15 = this.b;
                                        long j12 = lnVar15.w0;
                                        qo qoVar = new qo(null);
                                        qoVar.w = new ArrayList();
                                        boolean z172 = false;
                                        qoVar.P = false;
                                        qoVar.Q = false;
                                        qoVar.F = j12;
                                        TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                                        qoVar.f = M02;
                                        if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        qoVar.s = z172;
                                        qoVar.h = lnVar15.y0;
                                        lnVar15.presentFragment(qoVar);
                                        break;
                                    case 18:
                                        ln lnVar16 = this.b;
                                        xr0 xr0Var = new xr0(lnVar16.w0);
                                        xr0Var.s = new gn(lnVar16, 4);
                                        lnVar16.presentFragment(xr0Var);
                                        break;
                                    case 19:
                                        ln.e0(this.b);
                                        break;
                                    case 20:
                                        ln lnVar17 = this.b;
                                        e40 e40Var = new e40(-lnVar17.x0.id);
                                        e40Var.c = lnVar17.M0;
                                        e40Var.m0 = lnVar17;
                                        lnVar17.presentFragment(e40Var);
                                        break;
                                    case 21:
                                        ln lnVar18 = this.b;
                                        lnVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", lnVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                        nq nqVar3 = new nq(bundle4);
                                        nqVar3.C0(lnVar18.y0);
                                        lnVar18.presentFragment(nqVar3);
                                        break;
                                    case 22:
                                        ln lnVar19 = this.b;
                                        xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                        TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                        xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                        lnVar19.presentFragment(xe0Var);
                                        break;
                                    case 23:
                                        ln lnVar20 = this.b;
                                        if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                            lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", lnVar20.w0);
                                            xo xoVar = new xo(bundle5);
                                            TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                            xoVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (xoVar.a == null) {
                                                    xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                                }
                                                xoVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    xoVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    xoVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                        if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                            xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                        }
                                                    }
                                                    xoVar.w = 1;
                                                }
                                            }
                                            lnVar20.presentFragment(xoVar);
                                            break;
                                        }
                                    default:
                                        ln lnVar21 = this.b;
                                        lnVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", lnVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                        lnVar21.presentFragment(new wm(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    lnVar.S.addView(lnVar.P, b8.mf.o(-1, -2));
                    l8Var = lnVar.f0;
                    if (l8Var != null) {
                        lnVar.S.addView(l8Var, b8.mf.o(-1, -2));
                    }
                    if (!lnVar.J0 && !lnVar.x0.gigagroup) {
                        lnVar.S.addView(lnVar.Y, b8.mf.o(-1, -2));
                    }
                    if (!lnVar.J0) {
                        lnVar.S.addView(lnVar.W, b8.mf.o(-1, -2));
                    }
                    lnVar.S.addView(lnVar.X, b8.mf.o(-1, -2));
                    lnVar.S.addView(lnVar.U, b8.mf.o(-1, -2));
                    l8Var2 = lnVar.V;
                    if (l8Var2 != null && (chatFull2 = lnVar.y0) != null && chatFull2.requests_pending > 0) {
                        lnVar.S.addView(l8Var2, b8.mf.o(-1, -2));
                    }
                    if (lnVar.J0) {
                        lnVar.S.addView(lnVar.W, b8.mf.o(-1, -2));
                    }
                    if (!lnVar.J0 || lnVar.x0.gigagroup) {
                        i13 = -2;
                        lnVar.S.addView(lnVar.Y, b8.mf.o(-1, -2));
                    } else {
                        i13 = -2;
                    }
                    l8Var3 = lnVar.b0;
                    if (l8Var3 != null) {
                        lnVar.S.addView(l8Var3, b8.mf.o(-1, i13));
                    }
                    l8Var4 = lnVar.Z;
                    if (l8Var4 != null) {
                        lnVar.S.addView(l8Var4, b8.mf.o(-1, i13));
                    }
                    l8Var5 = lnVar.a0;
                    if (l8Var5 != null) {
                        lnVar.S.addView(l8Var5, b8.mf.o(-1, i13));
                    }
                    if (lnVar.a0 != null && lnVar.getMessagesController().g6 && org.telegram.messenger.t3.V(lnVar.x0)) {
                        lnVar.a0.setVisibility(0);
                    }
                    l8Var6 = lnVar.Z;
                    if (l8Var6 != null) {
                        org.telegram.ui.Cells.l8 l8Var25 = lnVar.a0;
                        l8Var6.setNeedDivider(l8Var25 != null && l8Var25.getVisibility() == 0);
                    }
                }
            }
            i12 = 0;
            l8Var15.setVisibility(i12);
            final int i312 = 21;
            lnVar.Y.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i312) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var162 = new org.telegram.ui.Cells.l8(context2);
            lnVar.W = l8Var162;
            org.telegram.ui.ActionBar.r6.S(l8Var162, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
            final int i322 = 22;
            lnVar.W.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var172 = new org.telegram.ui.Cells.l8(context2);
            lnVar.P = l8Var172;
            org.telegram.ui.ActionBar.r6.S(l8Var172, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
            final int i332 = 23;
            lnVar.P.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.t3.y(28, lnVar.x0)) {
            }
            org.telegram.ui.Cells.l8 l8Var192 = new org.telegram.ui.Cells.l8(context2);
            lnVar.X = l8Var192;
            final int i352 = 0;
            org.telegram.ui.ActionBar.r6.S(l8Var192, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
            lnVar.X.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var202 = new org.telegram.ui.Cells.l8(context2);
            lnVar.U = l8Var202;
            org.telegram.ui.ActionBar.r6.S(l8Var202, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
            final int i362 = 2;
            lnVar.U.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            if (!org.telegram.messenger.t3.V(lnVar.x0)) {
            }
            org.telegram.ui.Cells.l8 l8Var222 = new org.telegram.ui.Cells.l8(context2);
            lnVar.a0 = l8Var222;
            l8Var222.o(R.drawable.menu_feature_premium, i0(org.telegram.messenger.bd.L0(2131752471)), false);
            org.telegram.ui.ActionBar.r6.S(lnVar.a0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
            final int i382 = 4;
            lnVar.a0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i382) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            lnVar.a0.setVisibility(8);
            if (!org.telegram.messenger.t3.T(lnVar.x0)) {
            }
            org.telegram.ui.Cells.l8 l8Var232 = new org.telegram.ui.Cells.l8(context2);
            lnVar.Z = l8Var232;
            l8Var232.o(R.drawable.msg_log, org.telegram.messenger.bd.L0(2131751080), false);
            org.telegram.ui.ActionBar.r6.S(lnVar.Z, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i30));
            final int i392 = 5;
            lnVar.Z.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i392) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            if (org.telegram.messenger.t3.R(lnVar.x0)) {
            }
            lnVar.S.addView(lnVar.P, b8.mf.o(-1, -2));
            l8Var = lnVar.f0;
            if (l8Var != null) {
            }
            if (!lnVar.J0) {
                lnVar.S.addView(lnVar.Y, b8.mf.o(-1, -2));
            }
            if (!lnVar.J0) {
            }
            lnVar.S.addView(lnVar.X, b8.mf.o(-1, -2));
            lnVar.S.addView(lnVar.U, b8.mf.o(-1, -2));
            l8Var2 = lnVar.V;
            if (l8Var2 != null) {
                lnVar.S.addView(l8Var2, b8.mf.o(-1, -2));
            }
            if (lnVar.J0) {
            }
            if (lnVar.J0) {
            }
            i13 = -2;
            lnVar.S.addView(lnVar.Y, b8.mf.o(-1, -2));
            l8Var3 = lnVar.b0;
            if (l8Var3 != null) {
            }
            l8Var4 = lnVar.Z;
            if (l8Var4 != null) {
            }
            l8Var5 = lnVar.a0;
            if (l8Var5 != null) {
            }
            if (lnVar.a0 != null) {
                lnVar.a0.setVisibility(0);
            }
            l8Var6 = lnVar.Z;
            if (l8Var6 != null) {
            }
        } else {
            n6Var = null;
        }
        if (lnVar.D0 != null) {
            org.telegram.ui.Cells.l8 l8Var26 = new org.telegram.ui.Cells.l8(context2);
            lnVar.l0 = l8Var26;
            org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(false);
            int i41 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.S(l8Var26, N02, n6Var, org.telegram.ui.ActionBar.r6.N(i41));
            lnVar.l0.setPrioritizeTitleOverValue(true);
            lnVar.S.addView(lnVar.l0, b8.mf.o(-1, -2));
            final int i42 = 7;
            lnVar.l0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i42) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            lnVar.w0();
            org.telegram.ui.Cells.l8 l8Var27 = new org.telegram.ui.Cells.l8(context2);
            lnVar.o0 = l8Var27;
            org.telegram.ui.ActionBar.r6.S(l8Var27, org.telegram.ui.ActionBar.k6.N0(false), n6Var, org.telegram.ui.ActionBar.r6.N(i41));
            lnVar.o0.s(i0(org.telegram.messenger.bd.L0(2131754346)), "", R.drawable.msg_shareout, true);
            lnVar.S.addView(lnVar.o0, b8.mf.o(-1, -2));
            lnVar.o0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i29) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            lnVar.o0.h(45, lnVar.E0 == null, false);
            TLRPC.UserFull userFull = lnVar.E0;
            if (userFull != null) {
                org.telegram.ui.Cells.l8 l8Var28 = lnVar.o0;
                if (userFull.starref_program == null) {
                    format = org.telegram.messenger.bd.L0(2131754345);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                l8Var28.w(format, z11);
            }
            if (!lnVar.getMessagesController().f6) {
                lnVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.l8 l8Var29 = new org.telegram.ui.Cells.l8(context2);
            lnVar.p0 = l8Var29;
            org.telegram.ui.ActionBar.r6.S(l8Var29, org.telegram.ui.ActionBar.k6.N0(false), n6Var, org.telegram.ui.ActionBar.r6.N(i41));
            lnVar.p0.o(R.drawable.msg_log, org.telegram.messenger.bd.L0(2131753092), true);
            lnVar.S.addView(lnVar.p0, b8.mf.o(-1, -2));
            final int i43 = 9;
            lnVar.p0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i43) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var30 = new org.telegram.ui.Cells.l8(context2);
            lnVar.q0 = l8Var30;
            org.telegram.ui.ActionBar.r6.S(l8Var30, org.telegram.ui.ActionBar.k6.N0(false), n6Var, org.telegram.ui.ActionBar.r6.N(i41));
            lnVar.q0.o(R.drawable.msg_media, org.telegram.messenger.bd.L0(2131753093), true);
            lnVar.S.addView(lnVar.q0, b8.mf.o(-1, -2));
            final int i44 = 10;
            lnVar.q0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var31 = new org.telegram.ui.Cells.l8(context2);
            lnVar.r0 = l8Var31;
            org.telegram.ui.ActionBar.r6.S(l8Var31, org.telegram.ui.ActionBar.k6.N0(false), n6Var, org.telegram.ui.ActionBar.r6.N(i41));
            lnVar.r0.o(R.drawable.msg_bot, org.telegram.messenger.bd.L0(2131753101), true);
            lnVar.S.addView(lnVar.r0, b8.mf.o(-1, -2));
            final int i45 = 11;
            lnVar.r0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = lnVar.x0;
        if (chat6 != null) {
            if (!org.telegram.messenger.t3.N(chat6)) {
                lnVar.S.setVisibility(8);
                lnVar.H.setVisibility(8);
            }
            jm0Var.addView(new org.telegram.ui.Cells.x6(context2), b8.mf.o(-1, -2));
        } else if (lnVar.D0 != null) {
            lnVar.s0 = new org.telegram.ui.Cells.y8(12, context2, lnVar.resourceProvider);
            String L0 = org.telegram.messenger.bd.L0(2131753052);
            SpannableString valueOf = SpannableString.valueOf(L0);
            int indexOf = L0.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new ci.k4(1), indexOf, indexOf + 10, 33);
            }
            lnVar.s0.setText(valueOf);
            jm0Var.addView(lnVar.s0, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.l8 l8Var32 = new org.telegram.ui.Cells.l8(context2);
            lnVar.u0 = l8Var32;
            org.telegram.ui.Cells.y N03 = org.telegram.ui.ActionBar.k6.N0(true);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
            int i46 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.S(l8Var32, N03, N, org.telegram.ui.ActionBar.r6.N(i46));
            lnVar.u0.o(R.drawable.menu_factcheck, org.telegram.messenger.bd.L0(2131752929), false);
            org.telegram.ui.Cells.l8 l8Var33 = lnVar.u0;
            int i47 = org.telegram.ui.ActionBar.k6.q6;
            l8Var33.g(i47, i47);
            jm0Var.addView(lnVar.u0, b8.mf.o(-1, -2));
            final int i48 = 13;
            lnVar.u0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i48) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j12 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j12;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j12));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(12, context2, lnVar.resourceProvider);
            lnVar.t0 = y8Var2;
            y8Var2.setFixedSize(12);
            jm0Var.addView(lnVar.t0, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.l8 l8Var34 = lnVar.u0;
            TLRPC.UserFull userFull2 = lnVar.E0;
            l8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.y8 y8Var3 = lnVar.t0;
            TLRPC.UserFull userFull3 = lnVar.E0;
            y8Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = lnVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                lnVar.T = linearLayout6;
                linearLayout6.setOrientation(1);
                jm0Var.addView(lnVar.T, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context2);
                n4Var.setText(org.telegram.messenger.bd.L0(2131753112));
                lnVar.T.addView(n4Var, b8.mf.o(-1, -2));
                org.telegram.ui.Cells.l8 l8Var35 = new org.telegram.ui.Cells.l8(context2);
                lnVar.m0 = l8Var35;
                org.telegram.ui.ActionBar.r6.S(l8Var35, org.telegram.ui.ActionBar.k6.N0(false), n6Var, org.telegram.ui.ActionBar.r6.N(i46));
                lnVar.m0.setPrioritizeTitleOverValue(true);
                lnVar.T.addView(lnVar.m0, b8.mf.o(-1, -2));
                final ci.i0 g7 = ci.i0.g(lnVar.currentAccount);
                final int i49 = 0;
                lnVar.m0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.bn
                    public final /* synthetic */ ln b;

                    {
                        this.b = lnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i49) {
                            case 0:
                                ln lnVar3 = this.b;
                                long j12 = lnVar3.C0;
                                if (g7.h(j12, false) != null) {
                                    lnVar3.presentFragment(new ci.v(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ln lnVar4 = this.b;
                                long j13 = lnVar4.C0;
                                if (g7.h(j13, false) != null) {
                                    lnVar4.presentFragment(new ci.v(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g7.m(j10)) {
                    long i50 = g7.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i50 > 0) {
                        double d = i50 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d, 0));
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
                    lnVar.m0.s(org.telegram.messenger.bd.L0(2131753110), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x70(org.telegram.messenger.g0.L(30.0f), lnVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    lnVar.m0.s(org.telegram.messenger.bd.L0(2131753110), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                lnVar.m0.setVisibility(g7.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.l8 l8Var36 = new org.telegram.ui.Cells.l8(context2);
                lnVar.n0 = l8Var36;
                org.telegram.ui.ActionBar.r6.S(l8Var36, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i46));
                final int i51 = 1;
                lnVar.n0.setPrioritizeTitleOverValue(true);
                lnVar.T.addView(lnVar.n0, b8.mf.o(-1, -2));
                lnVar.n0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.bn
                    public final /* synthetic */ ln b;

                    {
                        this.b = lnVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                ln lnVar3 = this.b;
                                long j12 = lnVar3.C0;
                                if (g7.h(j12, false) != null) {
                                    lnVar3.presentFragment(new ci.v(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ln lnVar4 = this.b;
                                long j13 = lnVar4.C0;
                                if (g7.h(j13, false) != null) {
                                    lnVar4.presentFragment(new ci.v(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g7.h(j10, false) != null) {
                    org.telegram.ui.Cells.l8 l8Var37 = lnVar.n0;
                    String L02 = org.telegram.messenger.bd.L0(2131753111);
                    if (g7.c(j10).amount <= 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                        charSequence = ci.wb.a1(false, TextUtils.concat("XTR", ci.wb.N0(g7.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    l8Var37.s(L02, charSequence, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.x70(org.telegram.messenger.g0.L(30.0f), lnVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    lnVar.n0.s(org.telegram.messenger.bd.L0(2131753111), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                lnVar.n0.setVisibility(g7.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(12, context2, lnVar.getResourceProvider());
                y8Var4.setFixedSize(12);
                num2 = num;
                y8Var4.setTag(R.id.fit_width_tag, num2);
                jm0Var.addView(y8Var4, b8.mf.o(-1, 12));
                lnVar.T.setVisibility((lnVar.n0.getVisibility() == 0 || lnVar.m0.getVisibility() == 0) ? 0 : 8);
                chat = lnVar.x0;
                i11 = 14;
                if ((chat == null && chat.creator) || ((user = lnVar.D0) != null && user.bot && user.bot_can_edit)) {
                    final long j12 = chat != null ? chat.linked_community_id : lnVar.D0.linked_community_id;
                    final long j13 = chat != null ? -chat.id : lnVar.D0.id;
                    final boolean z18 = lnVar.D0 != null;
                    if (j12 != 0) {
                        ki.b bVar = new ki.b(context2, lnVar.resourceProvider);
                        lnVar.h0 = bVar;
                        bVar.a(lnVar.currentAccount, lnVar.getMessagesController().M0(Long.valueOf(j12)));
                        ki.b bVar2 = lnVar.h0;
                        final int i52 = 0;
                        org.telegram.ui.Cells.y N04 = org.telegram.ui.ActionBar.k6.N0(false);
                        int i53 = org.telegram.ui.ActionBar.k6.i6;
                        org.telegram.ui.ActionBar.r6.S(bVar2, N04, null, org.telegram.ui.ActionBar.r6.N(i53));
                        lnVar.h0.setOnClickListener(new View.OnClickListener(lnVar) { // from class: org.telegram.ui.cn
                            public final /* synthetic */ ln b;

                            {
                                this.b = lnVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i52) {
                                    case 0:
                                        ln lnVar3 = this.b;
                                        org.telegram.messenger.hp messagesController = lnVar3.getMessagesController();
                                        long j14 = j12;
                                        if (!org.telegram.messenger.t3.N(messagesController.M0(Long.valueOf(j14)))) {
                                            lnVar3.showDialog(new ji.b0(lnVar3, j14, null, null));
                                            break;
                                        } else {
                                            lnVar3.presentFragment(new ji.n(a1.g.j(j14, "community_id")));
                                            break;
                                        }
                                    default:
                                        ln lnVar4 = this.b;
                                        lnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j12);
                                        lnVar4.presentFragment(new ji.e(bundle));
                                        break;
                                }
                            }
                        });
                        jm0Var.addView(lnVar.h0, b8.mf.o(-1, -2));
                        org.telegram.ui.Cells.l8 l8Var38 = new org.telegram.ui.Cells.l8(context2);
                        lnVar.j0 = l8Var38;
                        l8Var38.o(R.drawable.outline_community_remove_24, org.telegram.messenger.bd.L0(z18 ? 2131751884 : lnVar.J0 ? 2131751883 : 2131751882), false);
                        org.telegram.ui.Cells.l8 l8Var39 = lnVar.j0;
                        int i54 = org.telegram.ui.ActionBar.k6.p7;
                        l8Var39.g(i54, i54);
                        org.telegram.ui.ActionBar.r6.S(lnVar.j0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(i53));
                        org.telegram.ui.Cells.l8 l8Var40 = lnVar.j0;
                        lnVar2 = lnVar;
                        f10 = -2.0f;
                        l8Var40.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.dn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String M0 = org.telegram.messenger.bd.M0(2131751915, null);
                                ln lnVar3 = ln.this;
                                org.telegram.ui.Components.t4.u0(lnVar3, M0, org.telegram.messenger.bd.M0(z18 ? 2131751917 : lnVar3.J0 ? 2131751916 : 2131751914, null), org.telegram.messenger.bd.M0(2131746329, null), true, new org.telegram.messenger.ok(lnVar3, j13, j12, 1));
                            }
                        });
                        jm0Var.addView(lnVar2.j0, b8.mf.o(-1, -2));
                        org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(12, context2, lnVar2.getResourceProvider());
                        lnVar2.k0 = y8Var5;
                        y8Var5.setFixedSize(14);
                        lnVar2.k0.setTag(R.id.fit_width_tag, num2);
                        jm0Var.addView(lnVar2.k0, b8.mf.o(-1, 14));
                    } else {
                        lnVar2 = lnVar;
                        f10 = -2.0f;
                        org.telegram.ui.Cells.l8 l8Var41 = new org.telegram.ui.Cells.l8(context2);
                        lnVar2.g0 = l8Var41;
                        l8Var41.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                        org.telegram.ui.ActionBar.r6.X(lnVar2.g0.getTextView(), org.telegram.ui.ActionBar.k6.Wl);
                        org.telegram.ui.ActionBar.r6.S(lnVar2.g0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                        lnVar2.g0.o(R.drawable.msg_groups, org.telegram.messenger.bd.L0(z18 ? 2131751981 : lnVar2.J0 ? 2131751979 : 2131751976), false);
                        final int i55 = 1;
                        lnVar2.g0.setOnClickListener(new View.OnClickListener(lnVar2) { // from class: org.telegram.ui.cn
                            public final /* synthetic */ ln b;

                            {
                                this.b = lnVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i55) {
                                    case 0:
                                        ln lnVar3 = this.b;
                                        org.telegram.messenger.hp messagesController = lnVar3.getMessagesController();
                                        long j14 = j13;
                                        if (!org.telegram.messenger.t3.N(messagesController.M0(Long.valueOf(j14)))) {
                                            lnVar3.showDialog(new ji.b0(lnVar3, j14, null, null));
                                            break;
                                        } else {
                                            lnVar3.presentFragment(new ji.n(a1.g.j(j14, "community_id")));
                                            break;
                                        }
                                    default:
                                        ln lnVar4 = this.b;
                                        lnVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j13);
                                        lnVar4.presentFragment(new ji.e(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.y8 y8Var6 = new org.telegram.ui.Cells.y8(12, context2, lnVar2.resourceProvider);
                        lnVar2.i0 = y8Var6;
                        y8Var6.setText(org.telegram.messenger.bd.L0(z18 ? 2131751980 : lnVar2.J0 ? 2131751978 : 2131751975));
                        jm0Var.addView(lnVar2.g0, b8.mf.o(-1, -2));
                        jm0Var.addView(lnVar2.i0, b8.mf.o(-1, -2));
                    }
                } else {
                    lnVar2 = lnVar;
                    f10 = -2.0f;
                }
                chat2 = lnVar2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    lnVar2.d0 = frameLayout3;
                    jm0Var.addView(frameLayout3, b8.mf.o(-1, -2));
                    org.telegram.ui.Cells.v9 v9Var = new org.telegram.ui.Cells.v9(context2);
                    lnVar2.e0 = v9Var;
                    org.telegram.ui.ActionBar.r6.V(v9Var.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                    org.telegram.ui.ActionBar.r6.S(lnVar2.e0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
                    if (lnVar2.D0 == null) {
                        lnVar2.e0.b(org.telegram.messenger.bd.L0(2131751567), false);
                    } else if (lnVar2.J0) {
                        lnVar2.e0.b(org.telegram.messenger.bd.L0(2131752422), false);
                    } else {
                        lnVar2.e0.b(org.telegram.messenger.bd.L0(2131751573), false);
                    }
                    lnVar2.d0.addView(lnVar2.e0, b8.mf.c(f10, -1));
                    lnVar2.e0.setOnClickListener(new View.OnClickListener(lnVar2) { // from class: org.telegram.ui.an
                        public final /* synthetic */ ln b;

                        {
                            this.b = lnVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    ln lnVar3 = this.b;
                                    lnVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", lnVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    nq nqVar = new nq(bundle);
                                    nqVar.C0(lnVar3.y0);
                                    lnVar3.presentFragment(nqVar);
                                    break;
                                case 1:
                                    ln lnVar4 = this.b;
                                    jn jnVar = lnVar4.R0;
                                    long j102 = lnVar4.C0;
                                    if (!lnVar4.s.g()) {
                                        org.telegram.messenger.ac acVar = null;
                                        TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                        if (a22 == null) {
                                            TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = M0.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                                int i182 = chatPhoto2.dc_id;
                                                if (i182 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i182;
                                                }
                                                TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.v1().N2(null, lnVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                                int i192 = userProfilePhoto2.dc_id;
                                                if (i192 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i192;
                                                }
                                                PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ln lnVar5 = this.b;
                                    lnVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", lnVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    nq nqVar2 = new nq(bundle2);
                                    nqVar2.C0(lnVar5.y0);
                                    lnVar5.presentFragment(nqVar2);
                                    break;
                                case 3:
                                    ln lnVar6 = this.b;
                                    lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                                    break;
                                case 4:
                                    ln lnVar7 = this.b;
                                    lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                                    break;
                                case 5:
                                    ln lnVar8 = this.b;
                                    lnVar8.getClass();
                                    lnVar8.presentFragment(new kb(lnVar8.x0));
                                    break;
                                case 6:
                                    ln lnVar9 = this.b;
                                    lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                                    break;
                                case 7:
                                    ln lnVar10 = this.b;
                                    lnVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", lnVar10.C0);
                                    lnVar10.presentFragment(new ka(bundle3));
                                    break;
                                case 8:
                                    ln lnVar11 = this.b;
                                    lnVar11.presentFragment(new ii.k(lnVar11.C0));
                                    break;
                                case 9:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.n0();
                                    break;
                                case 13:
                                    ln.c0(this.b);
                                    break;
                                case 14:
                                    ln lnVar12 = this.b;
                                    org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                                    break;
                                case 15:
                                    ln lnVar13 = this.b;
                                    if (org.telegram.messenger.g0.J1(lnVar13)) {
                                        la0 la0Var = new la0(4);
                                        la0Var.m0 = -lnVar13.w0;
                                        TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        la0Var.H0 = new gn(lnVar13, 6);
                                        lnVar13.presentFragment(la0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ln lnVar14 = this.b;
                                    long j112 = lnVar14.w0;
                                    org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                                    boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                                    bo boVar = new bo(null);
                                    boVar.N = new ArrayList();
                                    boVar.O = new ArrayList();
                                    boVar.Q = new ArrayList();
                                    boVar.d0 = true;
                                    boVar.g0 = new ArrayList();
                                    boVar.p0 = new HashMap();
                                    boVar.r0 = new nn(boVar, 5);
                                    boVar.t0 = false;
                                    boVar.a0 = j112;
                                    boVar.o0 = z162;
                                    TLRPC.ChatFull chatFull7 = lnVar14.y0;
                                    boVar.Z = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            boVar.m0 = tL_chatInviteExported;
                                        } else {
                                            boVar.d0(false);
                                        }
                                    }
                                    lnVar14.presentFragment(boVar);
                                    break;
                                case 17:
                                    ln lnVar15 = this.b;
                                    long j122 = lnVar15.w0;
                                    qo qoVar = new qo(null);
                                    qoVar.w = new ArrayList();
                                    boolean z172 = false;
                                    qoVar.P = false;
                                    qoVar.Q = false;
                                    qoVar.F = j122;
                                    TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j122));
                                    qoVar.f = M02;
                                    if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    qoVar.s = z172;
                                    qoVar.h = lnVar15.y0;
                                    lnVar15.presentFragment(qoVar);
                                    break;
                                case 18:
                                    ln lnVar16 = this.b;
                                    xr0 xr0Var = new xr0(lnVar16.w0);
                                    xr0Var.s = new gn(lnVar16, 4);
                                    lnVar16.presentFragment(xr0Var);
                                    break;
                                case 19:
                                    ln.e0(this.b);
                                    break;
                                case 20:
                                    ln lnVar17 = this.b;
                                    e40 e40Var = new e40(-lnVar17.x0.id);
                                    e40Var.c = lnVar17.M0;
                                    e40Var.m0 = lnVar17;
                                    lnVar17.presentFragment(e40Var);
                                    break;
                                case 21:
                                    ln lnVar18 = this.b;
                                    lnVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", lnVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                                    nq nqVar3 = new nq(bundle4);
                                    nqVar3.C0(lnVar18.y0);
                                    lnVar18.presentFragment(nqVar3);
                                    break;
                                case 22:
                                    ln lnVar19 = this.b;
                                    xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                                    TLRPC.ChatFull chatFull8 = lnVar19.y0;
                                    xe0Var.m0(chatFull8, chatFull8.exported_invite);
                                    lnVar19.presentFragment(xe0Var);
                                    break;
                                case 23:
                                    ln lnVar20 = this.b;
                                    if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                        lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", lnVar20.w0);
                                        xo xoVar = new xo(bundle5);
                                        TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                        xoVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (xoVar.a == null) {
                                                xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                            }
                                            xoVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                xoVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                xoVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                                    if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                        xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                                    }
                                                }
                                                xoVar.w = 1;
                                            }
                                        }
                                        lnVar20.presentFragment(xoVar);
                                        break;
                                    }
                                default:
                                    ln lnVar21 = this.b;
                                    lnVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", lnVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                                    lnVar21.presentFragment(new wm(bundle6));
                                    break;
                            }
                        }
                    });
                    jm0Var.addView(new org.telegram.ui.Cells.x6(context2), b8.mf.o(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                lnVar2.c = undoView;
                wcVar.addView(undoView, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.jt jtVar6 = lnVar2.w;
                TLRPC.User user3 = lnVar2.D0;
                jtVar6.setText(org.telegram.messenger.i6.l(user3 == null ? org.telegram.messenger.g5.p(user3) : lnVar2.x0.title, lnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.jt jtVar7 = lnVar2.w;
                jtVar7.setSelection(jtVar7.n());
                chatFull = lnVar2.y0;
                if (chatFull == null) {
                    lnVar2.F.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = lnVar2.E0;
                    if (userFull4 != null) {
                        lnVar2.F.setText(userFull4.about);
                    }
                }
                lnVar2.p0();
                lnVar2.u0(true, false);
                return lnVar2.fragmentView;
            }
        }
        num2 = num;
        chat = lnVar.x0;
        i11 = 14;
        if (chat == null) {
        }
        lnVar2 = lnVar;
        f10 = -2.0f;
        chat2 = lnVar2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            lnVar2.d0 = frameLayout32;
            jm0Var.addView(frameLayout32, b8.mf.o(-1, -2));
            org.telegram.ui.Cells.v9 v9Var2 = new org.telegram.ui.Cells.v9(context2);
            lnVar2.e0 = v9Var2;
            org.telegram.ui.ActionBar.r6.V(v9Var2.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
            org.telegram.ui.ActionBar.r6.S(lnVar2.e0, org.telegram.ui.ActionBar.k6.N0(false), null, org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6));
            if (lnVar2.D0 == null) {
            }
            lnVar2.d0.addView(lnVar2.e0, b8.mf.c(f10, -1));
            lnVar2.e0.setOnClickListener(new View.OnClickListener(lnVar2) { // from class: org.telegram.ui.an
                public final /* synthetic */ ln b;

                {
                    this.b = lnVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ln lnVar3 = this.b;
                            lnVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", lnVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            nq nqVar = new nq(bundle);
                            nqVar.C0(lnVar3.y0);
                            lnVar3.presentFragment(nqVar);
                            break;
                        case 1:
                            ln lnVar4 = this.b;
                            jn jnVar = lnVar4.R0;
                            long j102 = lnVar4.C0;
                            if (!lnVar4.s.g()) {
                                org.telegram.messenger.ac acVar = null;
                                TLRPC.User a22 = j102 == 0 ? null : lnVar4.getMessagesController().a2(Long.valueOf(j102));
                                if (a22 == null) {
                                    TLRPC.Chat M0 = lnVar4.getMessagesController().M0(Long.valueOf(lnVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = M0.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                        int i182 = chatPhoto2.dc_id;
                                        if (i182 != 0) {
                                            chatPhoto2.photo_big.dc_id = i182;
                                        }
                                        TLRPC.ChatFull chatFull5 = lnVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                acVar = org.telegram.messenger.ac.j(lnVar4.y0.chat_photo.video_sizes.get(0), lnVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.v1().h2(null, M0.photo.photo_big, null, acVar, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.v1().N2(null, lnVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = a22.photo;
                                        int i192 = userProfilePhoto2.dc_id;
                                        if (i192 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i192;
                                        }
                                        PhotoViewer.v1().h2(null, a22.photo.photo_big, null, null, null, null, null, 0, jnVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ln lnVar5 = this.b;
                            lnVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", lnVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            nq nqVar2 = new nq(bundle2);
                            nqVar2.C0(lnVar5.y0);
                            lnVar5.presentFragment(nqVar2);
                            break;
                        case 3:
                            ln lnVar6 = this.b;
                            lnVar6.presentFragment(new ai.c7(lnVar6.w0));
                            break;
                        case 4:
                            ln lnVar7 = this.b;
                            lnVar7.presentFragment(new ii.q3(-lnVar7.w0));
                            break;
                        case 5:
                            ln lnVar8 = this.b;
                            lnVar8.getClass();
                            lnVar8.presentFragment(new kb(lnVar8.x0));
                            break;
                        case 6:
                            ln lnVar9 = this.b;
                            lnVar9.presentFragment(r41.g0(lnVar9.x0, false));
                            break;
                        case 7:
                            ln lnVar10 = this.b;
                            lnVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", lnVar10.C0);
                            lnVar10.presentFragment(new ka(bundle3));
                            break;
                        case 8:
                            ln lnVar11 = this.b;
                            lnVar11.presentFragment(new ii.k(lnVar11.C0));
                            break;
                        case 9:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            sf.c.t(view.getContext(), "https://t.me/BotFather?start=" + ln.l0(this.b.D0));
                            break;
                        case 12:
                            this.b.n0();
                            break;
                        case 13:
                            ln.c0(this.b);
                            break;
                        case 14:
                            ln lnVar12 = this.b;
                            org.telegram.ui.Components.t4.r(lnVar12, false, lnVar12.x0, null, false, true, true, false, new gn(lnVar12, 7));
                            break;
                        case 15:
                            ln lnVar13 = this.b;
                            if (org.telegram.messenger.g0.J1(lnVar13)) {
                                la0 la0Var = new la0(4);
                                la0Var.m0 = -lnVar13.w0;
                                TLRPC.ChatFull chatFull6 = lnVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        la0Var.D0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                la0Var.H0 = new gn(lnVar13, 6);
                                lnVar13.presentFragment(la0Var);
                                break;
                            }
                            break;
                        case 16:
                            ln lnVar14 = this.b;
                            long j112 = lnVar14.w0;
                            org.telegram.ui.Cells.l8 l8Var72 = lnVar14.I;
                            boolean z162 = l8Var72 != null && l8Var72.getVisibility() == 0;
                            bo boVar = new bo(null);
                            boVar.N = new ArrayList();
                            boVar.O = new ArrayList();
                            boVar.Q = new ArrayList();
                            boVar.d0 = true;
                            boVar.g0 = new ArrayList();
                            boVar.p0 = new HashMap();
                            boVar.r0 = new nn(boVar, 5);
                            boVar.t0 = false;
                            boVar.a0 = j112;
                            boVar.o0 = z162;
                            TLRPC.ChatFull chatFull7 = lnVar14.y0;
                            boVar.Z = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    boVar.m0 = tL_chatInviteExported;
                                } else {
                                    boVar.d0(false);
                                }
                            }
                            lnVar14.presentFragment(boVar);
                            break;
                        case 17:
                            ln lnVar15 = this.b;
                            long j122 = lnVar15.w0;
                            qo qoVar = new qo(null);
                            qoVar.w = new ArrayList();
                            boolean z172 = false;
                            qoVar.P = false;
                            qoVar.Q = false;
                            qoVar.F = j122;
                            TLRPC.Chat M02 = qoVar.getMessagesController().M0(Long.valueOf(j122));
                            qoVar.f = M02;
                            if (org.telegram.messenger.t3.T(M02) && !qoVar.f.megagroup) {
                                z172 = true;
                            }
                            qoVar.s = z172;
                            qoVar.h = lnVar15.y0;
                            lnVar15.presentFragment(qoVar);
                            break;
                        case 18:
                            ln lnVar16 = this.b;
                            xr0 xr0Var = new xr0(lnVar16.w0);
                            xr0Var.s = new gn(lnVar16, 4);
                            lnVar16.presentFragment(xr0Var);
                            break;
                        case 19:
                            ln.e0(this.b);
                            break;
                        case 20:
                            ln lnVar17 = this.b;
                            e40 e40Var = new e40(-lnVar17.x0.id);
                            e40Var.c = lnVar17.M0;
                            e40Var.m0 = lnVar17;
                            lnVar17.presentFragment(e40Var);
                            break;
                        case 21:
                            ln lnVar18 = this.b;
                            lnVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", lnVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((lnVar18.J0 || lnVar18.x0.gigagroup) && !org.telegram.messenger.t3.Y(lnVar18.x0)) ? 0 : 3);
                            nq nqVar3 = new nq(bundle4);
                            nqVar3.C0(lnVar18.y0);
                            lnVar18.presentFragment(nqVar3);
                            break;
                        case 22:
                            ln lnVar19 = this.b;
                            xe0 xe0Var = new xe0(lnVar19.w0, 0, 0L);
                            TLRPC.ChatFull chatFull8 = lnVar19.y0;
                            xe0Var.m0(chatFull8, chatFull8.exported_invite);
                            lnVar19.presentFragment(xe0Var);
                            break;
                        case 23:
                            ln lnVar20 = this.b;
                            if (org.telegram.messenger.t3.V(lnVar20.x0)) {
                                lnVar20.presentFragment(new dh.o(lnVar20.w0, lnVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", lnVar20.w0);
                                xo xoVar = new xo(bundle5);
                                TLRPC.ChatFull chatFull9 = lnVar20.y0;
                                xoVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (xoVar.a == null) {
                                        xoVar.a = xoVar.getMessagesController().M0(Long.valueOf(xoVar.c));
                                    }
                                    xoVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        xoVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        xoVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i202 = 0; i202 < tL_chatReactionsSome.reactions.size(); i202++) {
                                            if (tL_chatReactionsSome.reactions.get(i202) instanceof TLRPC.TL_reactionEmoji) {
                                                xoVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i202)).emoticon);
                                            }
                                        }
                                        xoVar.w = 1;
                                    }
                                }
                                lnVar20.presentFragment(xoVar);
                                break;
                            }
                        default:
                            ln lnVar21 = this.b;
                            lnVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", lnVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", lnVar21.w0);
                            lnVar21.presentFragment(new wm(bundle6));
                            break;
                    }
                }
            });
            jm0Var.addView(new org.telegram.ui.Cells.x6(context2), b8.mf.o(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        lnVar2.c = undoView2;
        wcVar.addView(undoView2, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.jt jtVar62 = lnVar2.w;
        TLRPC.User user32 = lnVar2.D0;
        jtVar62.setText(org.telegram.messenger.i6.l(user32 == null ? org.telegram.messenger.g5.p(user32) : lnVar2.x0.title, lnVar2.w.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.jt jtVar72 = lnVar2.w;
        jtVar72.setSelection(jtVar72.n());
        chatFull = lnVar2.y0;
        if (chatFull == null) {
        }
        lnVar2.p0();
        lnVar2.u0(true, false);
        return lnVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r13 == null ? 0 : r13.participants_count, r12.x0.participants_count) >= getMessagesController().c5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.l8 l8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i11 = org.telegram.messenger.hs.T;
        boolean z11 = true;
        long j10 = this.C0;
        int i12 = 0;
        if (i3 == i11) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.w0) {
                if (this.y0 == null && (editTextBoldCursor = this.F) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.y0 == null;
                this.y0 = chatFull;
                k0();
                if (j10 != 0) {
                    this.G0 = false;
                } else {
                    if (!this.F0) {
                        TLRPC.ChatFull chatFull2 = this.y0;
                    }
                    TLRPC.ChatFull chatFull3 = this.y0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z10 = true;
                        this.G0 = z10;
                        l8Var = this.R;
                        if (l8Var != null) {
                            l8Var.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.G0 = z10;
                    l8Var = this.R;
                    if (l8Var != null) {
                    }
                }
                if (org.telegram.messenger.t3.T(this.x0) && !this.y0.hidden_prehistory) {
                    z11 = false;
                }
                this.K0 = z11;
                u0(false, false);
                if (z12) {
                    m0();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.r5) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.w0 != longValue) {
                return;
            }
            this.F0 = booleanValue;
            this.H0 = booleanValue2;
            if (objArr.length > 3) {
                this.I0 = ((Boolean) objArr[3]).booleanValue();
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.R;
            if (l8Var2 != null) {
                l8Var2.setChecked(this.F0);
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.r) {
            int intValue = ((Integer) objArr[0]).intValue();
            int i13 = org.telegram.messenger.hp.C8;
            if ((intValue & 2) != 0) {
                p0();
            }
            if ((intValue & 1) != 0) {
                w0();
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.b1) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i3 == org.telegram.messenger.hs.X4) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull N0 = getMessagesController().N0(longValue2);
                this.y0 = N0;
                if (N0 != null) {
                    this.L0 = N0.available_reactions;
                }
                x0(true);
                return;
            }
            return;
        }
        if (i3 != org.telegram.messenger.hs.C3) {
            if (i3 == org.telegram.messenger.hs.E0) {
                if (((Long) objArr[0]).longValue() == j10) {
                    r0(getMessagesController().b2(j10));
                    return;
                }
                return;
            } else {
                if (i3 == org.telegram.messenger.hs.L3) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i3 == org.telegram.messenger.hs.y1 && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
                    if (q4Var2 == null || q4Var2.getLastFragment() != this) {
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
            if (this.n0 != null) {
                ci.i0 g7 = ci.i0.g(this.currentAccount);
                this.n0.setVisibility(g7.a(j10) ? 0 : 8);
                this.n0.w(ci.wb.a1(false, TextUtils.concat("XTR", ci.wb.M0(g7.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.l8 l8Var3 = this.l0;
                if (l8Var3 != null) {
                    l8Var3.setNeedDivider(g7.a(j10) || g7.b(j10));
                }
                this.T.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                ci.i0 g10 = ci.i0.g(this.currentAccount);
                this.m0.setVisibility(g10.b(j10) ? 0 : 8);
                long i14 = g10.i(j10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i14 > 0) {
                    double d = i14 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) org.telegram.messenger.g0.o0((int) d, 0));
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
                this.m0.w(spannableStringBuilder, true);
                org.telegram.ui.Cells.l8 l8Var4 = this.l0;
                if (l8Var4 != null) {
                    if (!g10.a(j10) && !g10.b(j10)) {
                        z11 = false;
                    }
                    l8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.T;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ mq0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.e30
    public final String getInitialSearchString() {
        return this.w.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.km0 getScrollViewForSimpleGlass() {
        return this.y;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        kn knVar = this.c0;
        int i3 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(knVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, 4, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, 0, new Class[]{org.telegram.ui.Cells.l8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.U, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.Cells.l8 l8Var = this.V;
        if (l8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l8Var, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Z, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.O, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.w, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        LinearLayout linearLayout = this.E;
        int i10 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.S, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e0, 4, new Class[]{org.telegram.ui.Cells.v9.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.P, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.Cells.l8 l8Var2 = this.L;
        if (l8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l8Var2, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        org.telegram.ui.Cells.l8 l8Var3 = this.b0;
        if (l8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(l8Var3, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z10) {
        org.telegram.ui.Components.jt jtVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        int i3 = 1;
        int i10 = 0;
        String str3 = "";
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.jt jtVar2 = this.w;
            if ((jtVar2 != null && !this.D0.first_name.equals(jtVar2.getText().toString())) || ((editTextBoldCursor2 = this.F) != null && !str3.equals(editTextBoldCursor2.getText().toString()))) {
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131743736, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131752983, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new gn(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new gn(this, i3));
                    showDialog(s1Var);
                    return false;
                }
                return false;
            }
            return true;
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && (str = chatFull.about) != null) {
            str3 = str;
        }
        if ((chatFull != null && org.telegram.messenger.t3.T(this.x0) && this.y0.hidden_prehistory != this.K0) || (((jtVar = this.w) != null && !this.x0.title.equals(jtVar.getText().toString())) || (((editTextBoldCursor = this.F) != null && !str3.equals(editTextBoldCursor.getText().toString())) || this.F0 != this.x0.forum))) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                String M02 = org.telegram.messenger.bd.M0(2131743736, "UserRestrictionsApplyChanges");
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                s1Var2.S = M02;
                if (this.J0) {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131752305, "ChannelSettingsChangedAlert");
                } else {
                    s1Var2.U = org.telegram.messenger.bd.M0(2131749409, "GroupSettingsChangedAlert");
                }
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131754216, "ApplyTheme"), new gn(this, 2));
                alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747588, "PassportDiscard"), new gn(this, 3));
                showDialog(s1Var2);
            }
            return false;
        }
        return true;
    }

    public final void k0() {
        String str;
        if (this.f0 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) getMessagesController().P2.f(-this.w0);
        if (arrayList == null || arrayList.isEmpty()) {
            str = null;
        } else {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList);
            str = !TextUtils.isEmpty(ziVar.z) ? ziVar.z.toString() : !TextUtils.isEmpty(ziVar.v) ? ziVar.v.toString() : "";
        }
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && str == null) {
            str = org.telegram.messenger.bd.M0(2131742902, null);
        }
        this.f0.u(org.telegram.messenger.bd.M0(2131742908, null), str, false, R.drawable.menu_welcome_messages, true);
    }

    public final void m0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().j1(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().q1(getUserConfig().f());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new fn(this, 0));
    }

    public final void n0() {
        this.s.n(this.v0 != null, new hn(this, 0), new s5(this, 5), 0);
        this.S0.M(0);
        this.S0.P(43);
        this.c0.e.d();
    }

    public final void o0() {
        org.telegram.ui.Components.jt jtVar;
        String str;
        String str2;
        if (this.O0 || (jtVar = this.w) == null) {
            return;
        }
        if (jtVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.F3(this.w);
            return;
        }
        this.O0 = true;
        int i3 = 3;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().q1(this.D0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.D0.first_name.equals(this.w.getText().toString())) {
                setbotinfo.name = this.w.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.F.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            this.b.setOnCancelListener(new ci.b0(this, getConnectionsManager().sendRequest(setbotinfo, new org.telegram.ui.ActionBar.h6(9, this, setbotinfo)), i3));
            this.b.show();
            return;
        }
        if (!org.telegram.messenger.t3.T(this.x0) && (!this.K0 || this.F0)) {
            getMessagesController().T(getParentActivity(), this.w0, this, new gn(this, 5), null);
            return;
        }
        if (this.y0 != null && org.telegram.messenger.t3.T(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.K0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().b5(this.w0, this.K0);
            }
        }
        if (this.s.g()) {
            this.N0 = true;
            org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
            this.b = s1Var;
            s1Var.setOnCancelListener(new rf(this, r0));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.w.getText().toString())) {
            getMessagesController().C(this.w0, this.w.getText().toString(), null);
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.F;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            org.telegram.messenger.hp messagesController = getMessagesController();
            long j10 = this.w0;
            String obj = this.F.getText().toString();
            TLRPC.ChatFull chatFull3 = this.y0;
            messagesController.getClass();
            TLRPC.TL_messages_editChatAbout tL_messages_editChatAbout = new TLRPC.TL_messages_editChatAbout();
            tL_messages_editChatAbout.peer = messagesController.j1(-j10);
            tL_messages_editChatAbout.about = obj;
            messagesController.getConnectionsManager().sendRequest(tL_messages_editChatAbout, new org.telegram.messenger.uh(messagesController, chatFull3, obj, 7), 64);
        }
        boolean z12 = this.F0;
        TLRPC.Chat chat = this.x0;
        boolean z13 = chat.forum;
        if (z12 != z13 || this.H0 != chat.forum_tabs || this.I0 != chat.forum_sidebar) {
            boolean z14 = this.H0 != chat.forum_tabs;
            boolean z15 = this.I0 != chat.forum_sidebar;
            r0 = z12 == z13 ? 0 : 1;
            getMessagesController().a5(this.w0, this.F0, this.H0, this.I0);
            if (this.F0 && !this.H0 && (r0 != 0 || z14)) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                    if ((fragmentStack.get(i10) instanceof wm) && ((wm) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).b0(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
                        HashSet hashSet = m91.r1;
                        ((ActionBarLayout) parentLayout).c(i10, m91.I0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (z14 || z15) {
                v0(z14);
            }
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onActivityResultFragment(int i3, int i10, Intent intent) {
        this.s.h(i3, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.jt jtVar = this.w;
        if (jtVar == null || !jtVar.e) {
            return j0(z10);
        }
        if (!z10) {
            return false;
        }
        jtVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
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
    
        if (java.lang.Math.max(r5 == null ? 0 : r5.participants_count, r1.participants_count) >= getMessagesController().c5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
    @Override // org.telegram.ui.ActionBar.d2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.w0;
        long j11 = this.C0;
        boolean z10 = true;
        if (j10 == 0) {
            TLRPC.User a22 = j11 == 0 ? null : getMessagesController().a2(Long.valueOf(j11));
            this.D0 = a22;
            if (a22 == null) {
                TLRPC.User k02 = org.telegram.messenger.qr.a0(this.currentAccount).k0(j11);
                this.D0 = k02;
                if (k02 != null) {
                    getMessagesController().X3(this.D0, true, false);
                    if (this.E0 == null) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList L0 = org.telegram.messenger.qr.a0(this.currentAccount).L0(hashSet);
                        if (!L0.isEmpty()) {
                            this.E0 = (TLRPC.UserFull) L0.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            org.telegram.ui.Components.u8 u8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.f30 f30Var = this.s;
            f30Var.a = this;
            f30Var.b = this;
            getNotificationCenter().c(this, org.telegram.messenger.hs.r);
            getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
            getNotificationCenter().c(this, org.telegram.messenger.hs.b1);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
        this.x0 = M0;
        if (M0 == null) {
            TLRPC.Chat P = org.telegram.messenger.qr.a0(this.currentAccount).P(this.w0);
            this.x0 = P;
            if (P != null) {
                getMessagesController().Q3(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull F0 = org.telegram.messenger.qr.a0(this.currentAccount).F0(this.w0, org.telegram.messenger.t3.T(this.x0), new CountDownLatch(1), false, false, 0);
                    this.y0 = F0;
                }
            }
            return false;
        }
        chat = this.x0;
        org.telegram.ui.Components.u8 u8Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            u8Var2.k(5L, this.x0.title, null, null);
            this.J0 = org.telegram.messenger.t3.T(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat2 = this.x0;
            boolean z11 = chat2.forum;
            this.F0 = z11;
            this.H0 = chat2.forum_tabs;
            this.I0 = chat2.forum_sidebar;
            if (j11 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.y0;
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null) {
                }
                this.G0 = z10;
                getNotificationCenter().c(this, org.telegram.messenger.hs.T);
                getNotificationCenter().c(this, org.telegram.messenger.hs.r5);
                getNotificationCenter().c(this, org.telegram.messenger.hs.X4);
                getNotificationCenter().c(this, org.telegram.messenger.hs.L3);
            }
            z10 = false;
            this.G0 = z10;
            getNotificationCenter().c(this, org.telegram.messenger.hs.T);
            getNotificationCenter().c(this, org.telegram.messenger.hs.r5);
            getNotificationCenter().c(this, org.telegram.messenger.hs.X4);
            getNotificationCenter().c(this, org.telegram.messenger.hs.L3);
        } else {
            u8Var2.k(5L, this.D0.first_name, null, null);
            this.J0 = false;
            this.F0 = false;
            this.H0 = false;
            this.I0 = false;
            this.G0 = false;
            getNotificationCenter().c(this, org.telegram.messenger.hs.E0);
            if (this.D0.bot) {
                getNotificationCenter().c(this, org.telegram.messenger.hs.C3);
            }
        }
        org.telegram.ui.Components.f30 f30Var2 = this.s;
        f30Var2.a = this;
        f30Var2.b = this;
        getNotificationCenter().c(this, org.telegram.messenger.hs.r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        getNotificationCenter().c(this, org.telegram.messenger.hs.b1);
        if (this.y0 != null) {
            m0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.f30 f30Var = this.s;
        if (f30Var != null) {
            f30Var.d();
        }
        if (this.x0 != null) {
            getNotificationCenter().n(this, org.telegram.messenger.hs.T);
            getNotificationCenter().n(this, org.telegram.messenger.hs.r5);
            getNotificationCenter().n(this, org.telegram.messenger.hs.X4);
            getNotificationCenter().n(this, org.telegram.messenger.hs.L3);
        } else {
            getNotificationCenter().n(this, org.telegram.messenger.hs.E0);
            if (this.D0.bot) {
                getNotificationCenter().n(this, org.telegram.messenger.hs.C3);
            }
        }
        getNotificationCenter().n(this, org.telegram.messenger.hs.r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.b1);
        org.telegram.ui.Components.jt jtVar = this.w;
        if (jtVar != null) {
            jtVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.Components.g5) obj).o(null);
        }
        org.telegram.ui.Components.jt jtVar = this.w;
        if (jtVar != null) {
            jtVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        this.s.j(i3, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.jt jtVar = this.w;
        if (jtVar != null) {
            jtVar.s();
            this.w.getEditText().requestFocus();
        }
        t0();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        u0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.F;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            ei.d4 d4Var = this.e;
            if (d4Var != null) {
                d4Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p0() {
        boolean z10;
        if (this.e == null || this.P0) {
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.w0));
        long j10 = this.C0;
        TLRPC.User a22 = j10 == 0 ? null : getMessagesController().a2(Long.valueOf(j10));
        if (M0 == null && a22 == null) {
            return;
        }
        this.D0 = a22;
        this.x0 = M0;
        org.telegram.ui.Components.u8 u8Var = this.r;
        if (a22 == null ? M0.photo == null : a22.photo == null) {
            this.e.setImageDrawable(u8Var);
        } else {
            TLRPC.Chat chat = a22 != null ? a22 : M0;
            this.v0 = a22 != null ? a22.photo.photo_small : M0.photo.photo_small;
            org.telegram.messenger.ac m10 = org.telegram.messenger.ac.m(this.currentAccount, 1, chat);
            this.e.e(chat, u8Var);
            if (m10 != null) {
                z10 = true;
                if (this.c0 != null) {
                    if (z10 || this.s.g()) {
                        this.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.M0(2131752213, "ChatSetNewPhoto"), true);
                    } else {
                        this.c0.o(R.drawable.msg_addphoto, org.telegram.messenger.bd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                    }
                    if (this.S0 == null) {
                        this.S0 = new org.telegram.ui.Components.ch0(R.raw.camera_outline, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                    }
                    this.c0.e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                    this.c0.e.setAnimation(this.S0);
                }
                if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
                    PhotoViewer.v1().z0();
                }
                if (this.a0 == null && getMessagesController().g6 && org.telegram.messenger.t3.V(this.x0)) {
                    this.a0.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.c0 != null) {
        }
        if (PhotoViewer.F1()) {
            PhotoViewer.v1().z0();
        }
        if (this.a0 == null) {
        }
    }

    public final void q0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.g5 m10;
        this.y0 = chatFull;
        if (chatFull != null) {
            if (this.x0 == null) {
                this.x0 = getMessagesController().M0(Long.valueOf(this.w0));
            }
            this.K0 = !org.telegram.messenger.t3.T(this.x0) || this.y0.hidden_prehistory;
            this.L0 = this.y0.available_reactions;
            ArrayList arrayList = this.Q0;
            arrayList.clear();
            TLRPC.Chat chat = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && org.telegram.messenger.t3.V(chat)) {
                TLRPC.ChatReactions chatReactions = chatFull2.available_reactions;
                if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                    ArrayList<TLRPC.Reaction> arrayList3 = ((TLRPC.TL_chatReactionsSome) chatReactions).reactions;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i3);
                        i3++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).r.get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                m10 = org.telegram.ui.Components.g5.l(org.telegram.messenger.h10.t0, org.telegram.ui.Components.g5.f(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            m10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.g5.m(org.telegram.messenger.h10.t0, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.g5.f()) : null;
                        }
                        if (m10 != null) {
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    ArrayList arrayList4 = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).n;
                    int size2 = arrayList4.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = arrayList4.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction2 = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.g5 l10 = org.telegram.ui.Components.g5.l(org.telegram.messenger.h10.t0, org.telegram.ui.Components.g5.f(), tL_availableReaction2.activate_animation);
                            arrayList2.add(l10);
                            l10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.a0 != null && getMessagesController().g6 && org.telegram.messenger.t3.V(this.x0)) {
                this.a0.setVisibility(0);
            }
        }
        k0();
    }

    public final void r0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j10 = this.C0;
                this.D0 = j10 == 0 ? null : getMessagesController().a2(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.l8 l8Var = this.o0;
            if (l8Var != null) {
                l8Var.h(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.w(userFull2.starref_program == null ? org.telegram.messenger.bd.M0(2131754345, null) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.l8 l8Var2 = this.u0;
            if (l8Var2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                l8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.y8 y8Var = this.t0;
            if (y8Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                y8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.f30 f30Var = this.s;
        if (f30Var != null) {
            f30Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<gi.n5, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<gi.n5, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new dh.x(29, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.f30 f30Var = this.s;
        if (f30Var != null && (str = f30Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.jt jtVar = this.w;
        if (jtVar != null) {
            String obj = jtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0() {
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        int i3;
        xl0 xl0Var;
        int w02;
        ArrayList<Integer> arrayList;
        il0 il0Var = this.M;
        if (il0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.l8 l8Var3 = this.O;
            boolean z10 = (l8Var3 != null && l8Var3.getVisibility() == 0) || ((l8Var = this.R) != null && l8Var.getVisibility() == 0) || ((org.telegram.messenger.t3.n0(this.x0) && org.telegram.messenger.t3.N(this.x0)) || ((l8Var2 = this.N) != null && l8Var2.getVisibility() == 0));
            Paint paint = il0Var.n;
            int i10 = il0Var.a;
            org.telegram.ui.ActionBar.e6 e6Var = il0Var.d;
            if (chat == null) {
                return;
            }
            il0Var.w = z10;
            il0Var.r = new org.telegram.ui.Components.ly0(org.telegram.messenger.i6.m(chat.title, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false, null, 0), 13.0f, org.telegram.messenger.g0.o());
            xl0 xl0Var2 = il0Var.x;
            if (xl0Var2 != null) {
                xl0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = xl0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                i3 = -16777216;
                il0Var.x = new xl0(i12, i12, i12, tL_emojiStatusCollectible.document_id);
            } else {
                i3 = -16777216;
                if (org.telegram.messenger.t3.I(chat) >= 0) {
                    xl0Var = xl0.c(i10, org.telegram.messenger.t3.I(chat));
                    xl0Var.a = org.telegram.messenger.g0.L(11.0f);
                    xl0Var.d();
                } else {
                    xl0Var = null;
                }
                il0Var.x = xl0Var;
            }
            xl0 xl0Var3 = il0Var.x;
            if (xl0Var3 != null) {
                xl0Var3.e(il0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a10 = e6Var != null ? e6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
                int i13 = (!a10 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a10 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | i3;
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | i3 : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | i3 : intValue;
                il0Var.r.n(i13);
                paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, i13));
                xl0 xl0Var4 = new xl0(intValue, intValue2, intValue3, tL_peerColorCollectible.gift_emoji_id);
                xl0Var4.a = org.telegram.messenger.g0.L(11.0f);
                xl0Var4.d();
                il0Var.y = xl0Var4;
                xl0Var4.e(il0Var);
                return;
            }
            int F = org.telegram.messenger.t3.F(chat);
            if (F < 7) {
                int i14 = org.telegram.ui.ActionBar.k6.r8[F];
                il0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.k6.w0(i14, e6Var);
            } else {
                org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).q4;
                org.telegram.messenger.wo d = xoVar == null ? null : xoVar.d(F);
                if (d != null) {
                    il0Var.s = -1;
                    w02 = d.f();
                } else {
                    int i15 = org.telegram.ui.ActionBar.k6.r8[0];
                    il0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.k6.w0(i15, e6Var);
                }
            }
            il0Var.r.n(w02);
            paint.setColor(org.telegram.ui.ActionBar.k6.r1(0.1f, w02));
            xl0 a11 = xl0.a(i10, F);
            a11.a = org.telegram.messenger.g0.L(11.0f);
            a11.d();
            il0Var.y = a11;
            a11.e(il0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(boolean z10, boolean z11) {
        boolean z12;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        TLRPC.ChatFull chatFull;
        int i14;
        String str2;
        String M0;
        org.telegram.ui.Cells.l8 l8Var;
        org.telegram.ui.Cells.l8 l8Var2;
        org.telegram.ui.Cells.l8 l8Var3;
        org.telegram.ui.Cells.l8 l8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.l8 l8Var5;
        org.telegram.ui.Cells.l8 l8Var6;
        org.telegram.ui.Cells.l8 l8Var7;
        org.telegram.ui.Cells.l8 l8Var8;
        org.telegram.ui.Cells.l8 l8Var9;
        TLRPC.Chat M02;
        if (z10 && (M02 = getMessagesController().M0(Long.valueOf(this.w0))) != null) {
            this.x0 = M02;
        }
        boolean t02 = org.telegram.messenger.t3.t0(this.x0);
        org.telegram.ui.Cells.y8 y8Var = this.Q;
        if (y8Var != null) {
            y8Var.setVisibility((this.J != null || ((l8Var7 = this.K) != null && l8Var7.getVisibility() == 0) || (((l8Var8 = this.O) != null && l8Var8.getVisibility() == 0) || ((l8Var9 = this.I) != null && l8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.l8 l8Var10 = this.Z;
        if (l8Var10 != null) {
            l8Var10.setVisibility(org.telegram.messenger.t3.T(this.x0) ? 0 : 8);
        }
        org.telegram.ui.Cells.l8 l8Var11 = this.K;
        if (l8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.J0 && chatFull2.linked_chat_id == 0)) {
                l8Var11.setVisibility(8);
            } else {
                l8Var11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.K.u(org.telegram.messenger.bd.M0(2131751390, "Discussion"), org.telegram.messenger.bd.M0(2131751382, "DiscussionInfoShort"), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(this.y0.linked_chat_id));
                    if (M03 == null) {
                        this.K.setVisibility(8);
                    } else if (this.J0) {
                        String K = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K)) {
                            this.K.u(org.telegram.messenger.bd.M0(2131751390, "Discussion"), M03.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.K.u(org.telegram.messenger.bd.M0(2131751390, "Discussion"), t4.c.f("@", K), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String K2 = org.telegram.messenger.t3.K(M03, false);
                        if (TextUtils.isEmpty(K2)) {
                            org.telegram.ui.Cells.l8 l8Var12 = this.K;
                            String M04 = org.telegram.messenger.bd.M0(2131748891, "LinkedChannel");
                            String str4 = M03.title;
                            org.telegram.ui.Cells.l8 l8Var13 = this.R;
                            l8Var12.u(M04, str4, false, R.drawable.msg_channel, l8Var13 != null && l8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.l8 l8Var14 = this.K;
                            String M05 = org.telegram.messenger.bd.M0(2131748891, "LinkedChannel");
                            String f10 = t4.c.f("@", K2);
                            org.telegram.ui.Cells.l8 l8Var15 = this.R;
                            l8Var14.u(M05, f10, false, R.drawable.msg_channel, l8Var15 != null && l8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.l8 l8Var16 = this.I;
        if (l8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                l8Var16.setVisibility(8);
            } else {
                l8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.I.q(org.telegram.messenger.bd.M0(2131753961, "AttachLocation"), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.I.q(org.telegram.messenger.bd.M0(2131753961, "AttachLocation"), "Unknown address", z11, true);
                }
            }
        }
        if (this.J != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.x0.noforwards;
                if (this.J0) {
                    if (t02) {
                        i15 = 2131743930;
                        str3 = "TypePublic";
                    } else if (z13) {
                        i15 = 2131743931;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i15 = 2131743934;
                        str3 = "TypePrivate";
                    }
                    M0 = org.telegram.messenger.bd.M0(i15, str3);
                } else {
                    if (t02) {
                        i14 = 2131743929;
                        str2 = "TypePublicGroup";
                    } else if (z13) {
                        i14 = 2131743932;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = 2131743933;
                        str2 = "TypePrivateGroup";
                    }
                    M0 = org.telegram.messenger.bd.M0(i14, str2);
                }
                String str5 = M0;
                if (this.J0) {
                    org.telegram.ui.Cells.l8 l8Var17 = this.J;
                    String M06 = org.telegram.messenger.bd.M0(2131752276, "ChannelType");
                    org.telegram.ui.Cells.l8 l8Var18 = this.O;
                    l8Var17.u(M06, str5, false, R.drawable.msg_channel, (l8Var18 != null && l8Var18.getVisibility() == 0) || ((l8Var3 = this.K) != null && l8Var3.getVisibility() == 0) || ((l8Var4 = this.R) != null && l8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.l8 l8Var19 = this.J;
                    String M07 = org.telegram.messenger.bd.M0(2131749400, "GroupType");
                    org.telegram.ui.Cells.l8 l8Var20 = this.O;
                    l8Var19.u(M07, str5, false, R.drawable.msg_groups, (l8Var20 != null && l8Var20.getVisibility() == 0) || ((l8Var = this.K) != null && l8Var.getVisibility() == 0) || ((l8Var2 = this.R) != null && l8Var2.getVisibility() == 0));
                }
            } else {
                String M08 = !t02 ? org.telegram.messenger.bd.M0(2131743939, "TypeLocationGroupEdit") : String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().V2, "/%s"), org.telegram.messenger.t3.K(this.x0, false));
                org.telegram.ui.Cells.l8 l8Var21 = this.J;
                String M09 = org.telegram.messenger.bd.M0(2131743940, "TypeLocationGroup");
                org.telegram.ui.Cells.l8 l8Var22 = this.O;
                l8Var21.u(M09, M08, false, R.drawable.msg_channel, (l8Var22 != null && l8Var22.getVisibility() == 0) || ((l8Var5 = this.K) != null && l8Var5.getVisibility() == 0) || ((l8Var6 = this.R) != null && l8Var6.getVisibility() == 0));
            }
        }
        if (this.O != null) {
            if (!this.K0 || this.F0) {
                i13 = 2131752228;
                str = "ChatHistoryVisible";
            } else {
                i13 = 2131752232;
                str = "ChatHistoryHidden";
            }
            this.O.u(org.telegram.messenger.bd.M0(2131752229, "ChatHistoryShort"), org.telegram.messenger.bd.M0(i13, str), z11, R.drawable.msg_discuss, this.R != null);
            this.O.setEnabled(!this.F0);
            boolean z14 = (this.F0 || t02 || ((chatFull = this.y0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.T0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.O.getAlpha() <= 0.0f && !z14) {
                this.O.setVisibility(8);
                t0();
            } else if (this.O.getVisibility() != 0 || this.O.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                int i16 = 0;
                boolean z15 = false;
                while (i16 < this.G.getChildCount()) {
                    if (!z15 && this.G.getChildAt(i16) == this.O) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.G.getChildAt(i16));
                    }
                    i16++;
                    z15 = z15;
                }
                int i17 = 0;
                boolean z16 = false;
                while (i17 < this.x.getChildCount()) {
                    if (!z16 && this.x.getChildAt(i17) == this.G) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.x.getChildAt(i17));
                    }
                    i17++;
                    z16 = z16;
                }
                if (this.O.getVisibility() != 0) {
                    this.O.setAlpha(0.0f);
                    this.O.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.O.setVisibility(0);
                for (int i18 = 0; i18 < arrayList.size(); i18++) {
                    ((View) arrayList.get(i18)).setTranslationY((1.0f - this.O.getAlpha()) * (-this.O.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.T0 = ofFloat;
                    ofFloat.addUpdateListener(new ci.uc(11, this, arrayList));
                    this.T0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 7));
                    this.T0.setDuration(320L);
                    this.T0.setInterpolator(org.telegram.ui.Components.xq.h);
                    this.T0.start();
                } else {
                    this.O.setAlpha(z14 ? 1.0f : 0.0f);
                    this.O.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.O.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.O.setVisibility(z14 ? 0 : 8);
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        ((View) arrayList.get(i19)).setTranslationY(0.0f);
                    }
                    this.T0 = null;
                }
            }
        }
        if (this.U != null) {
            if (this.y0 != null) {
                org.telegram.ui.Cells.l8 l8Var23 = this.V;
                if (l8Var23 != null) {
                    if (l8Var23.getParent() == null) {
                        i3 = 0;
                        this.S.addView(this.V, this.S.indexOfChild(this.U) + 1, b8.mf.o(-1, -2));
                    } else {
                        i3 = 0;
                    }
                    this.V.setVisibility(this.y0.requests_pending > 0 ? i3 : 8);
                } else {
                    i3 = 0;
                }
                if (!this.J0 || org.telegram.messenger.t3.Y(this.x0)) {
                    if (org.telegram.messenger.t3.T(this.x0)) {
                        org.telegram.ui.Cells.l8 l8Var24 = this.U;
                        String M010 = org.telegram.messenger.bd.M0(2131752377, "ChannelMembers");
                        Object[] objArr = new Object[1];
                        objArr[i3] = Integer.valueOf(this.y0.participants_count);
                        l8Var24.u(M010, String.format("%d", objArr), false, R.drawable.msg_groups, true);
                    } else {
                        org.telegram.ui.Cells.l8 l8Var25 = this.U;
                        CharSequence M011 = org.telegram.messenger.bd.M0(2131752377, "ChannelMembers");
                        Object[] objArr2 = new Object[1];
                        objArr2[i3] = Integer.valueOf(this.y0.participants.participants.size());
                        l8Var25.u(M011, String.format("%d", objArr2), false, R.drawable.msg_groups, this.V.getVisibility() == 0 ? 1 : i3);
                    }
                    TLRPC.Chat chat = this.x0;
                    if (!chat.gigagroup || org.telegram.messenger.t3.Y(chat)) {
                        int i20 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i21 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i21++;
                            }
                            i10 = nq.s0(tL_chatBannedRights) + i21;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.x0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.F0 && !tL_chatBannedRights2.manage_topics) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i10++;
                            }
                            i11 = i20;
                        } else {
                            i10 = i20;
                            i11 = i10;
                        }
                        org.telegram.ui.Cells.l8 l8Var26 = this.Y;
                        String M012 = org.telegram.messenger.bd.M0(2131752333, null);
                        Integer valueOf = Integer.valueOf(i10);
                        Integer valueOf2 = Integer.valueOf(i11);
                        Object[] objArr3 = new Object[2];
                        objArr3[i3] = valueOf;
                        objArr3[1] = valueOf2;
                        l8Var26.u(M012, String.format("%d/%d", objArr3), z11, R.drawable.msg_permissions, true);
                        z12 = z11;
                    } else {
                        org.telegram.ui.Cells.l8 l8Var27 = this.Y;
                        CharSequence M013 = org.telegram.messenger.bd.M0(2131752453, null);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        Object[] objArr4 = new Object[1];
                        objArr4[i3] = Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count));
                        CharSequence format = String.format("%d", objArr4);
                        org.telegram.ui.Cells.l8 l8Var28 = this.Z;
                        l8Var27.u(M013, format, false, R.drawable.msg_user_remove, (l8Var28 == null || l8Var28.getVisibility() != 0) ? i3 : 1);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.l8 l8Var29 = this.V;
                    if (l8Var29 != null) {
                        CharSequence M014 = org.telegram.messenger.bd.M0(2131748643, "MemberRequests");
                        Object[] objArr5 = new Object[1];
                        objArr5[i3] = Integer.valueOf(this.y0.requests_pending);
                        CharSequence format2 = String.format("%d", objArr5);
                        org.telegram.ui.Cells.l8 l8Var30 = this.Z;
                        l8Var29.u(M014, format2, false, R.drawable.msg_requests, (l8Var30 == null || l8Var30.getVisibility() != 0) ? i3 : 1);
                    }
                } else {
                    org.telegram.ui.Cells.l8 l8Var31 = this.U;
                    String M015 = org.telegram.messenger.bd.M0(2131752289, "ChannelSubscribers");
                    Object[] objArr6 = new Object[1];
                    objArr6[i3] = Integer.valueOf(this.y0.participants_count);
                    l8Var31.u(M015, String.format("%d", objArr6), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.l8 l8Var32 = this.Y;
                    CharSequence M016 = org.telegram.messenger.bd.M0(2131752453, null);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    Object[] objArr7 = new Object[1];
                    objArr7[i3] = Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count));
                    CharSequence format3 = String.format("%d", objArr7);
                    org.telegram.ui.Cells.l8 l8Var33 = this.Z;
                    l8Var32.u(M016, format3, false, R.drawable.msg_user_remove, (l8Var33 == null || l8Var33.getVisibility() != 0) ? i3 : 1);
                    z12 = z11;
                }
                org.telegram.ui.Cells.l8 l8Var34 = this.X;
                String M017 = org.telegram.messenger.bd.M0(2131752517, "ChannelAdministrators");
                if (org.telegram.messenger.t3.T(this.x0)) {
                    i12 = this.y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.y0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i22 = i3;
                        int i23 = i22;
                        while (i22 < size) {
                            TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i22);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i23++;
                            }
                            i22++;
                        }
                        i12 = i23;
                    }
                }
                Object[] objArr8 = new Object[1];
                objArr8[i3] = Integer.valueOf(i12);
                l8Var34.u(M017, String.format("%d", objArr8), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                i3 = 0;
                if (!this.J0 || org.telegram.messenger.t3.Y(this.x0)) {
                    org.telegram.ui.Cells.l8 l8Var35 = this.U;
                    String M018 = org.telegram.messenger.bd.M0(2131752377, "ChannelMembers");
                    org.telegram.ui.Cells.l8 l8Var36 = this.Z;
                    l8Var35.o(R.drawable.msg_groups, M018, l8Var36 != null && l8Var36.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.l8 l8Var37 = this.Y;
                        String M019 = org.telegram.messenger.bd.M0(2131752453, null);
                        org.telegram.ui.Cells.l8 l8Var38 = this.Z;
                        l8Var37.o(R.drawable.msg_chats_remove, M019, l8Var38 != null && l8Var38.getVisibility() == 0);
                    } else {
                        this.Y.o(R.drawable.msg_permissions, org.telegram.messenger.bd.M0(2131752333, null), true);
                    }
                } else {
                    this.U.o(R.drawable.msg_groups, org.telegram.messenger.bd.M0(2131752289, "ChannelSubscribers"), true);
                    org.telegram.ui.Cells.l8 l8Var39 = this.Y;
                    String M020 = org.telegram.messenger.bd.M0(2131752453, null);
                    org.telegram.ui.Cells.l8 l8Var40 = this.Z;
                    l8Var39.o(R.drawable.msg_chats_remove, M020, l8Var40 != null && l8Var40.getVisibility() == 0);
                }
                this.X.o(R.drawable.msg_admins, org.telegram.messenger.bd.M0(2131752517, "ChannelAdministrators"), true);
            }
            this.P.setVisibility(org.telegram.messenger.t3.w(1, this.x0) ? i3 : 8);
            x0(z12);
            if (this.y0 == null || !org.telegram.messenger.t3.y(3, this.x0) || (t02 && this.x0.creator)) {
                this.W.setVisibility(8);
            } else if (this.y0.invitesCount > 0) {
                this.W.u(org.telegram.messenger.bd.M0(2131749148, "InviteLinks"), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.W.u(org.telegram.messenger.bd.M0(2131749148, "InviteLinks"), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.L != null) {
            y0(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0(boolean z10) {
        uw uwVar;
        pv pvVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i3 = 0;
        while (i3 < fragmentStack.size()) {
            if (fragmentStack.get(i3) instanceof wm) {
                wm wmVar = (wm) fragmentStack.get(i3);
                if (wmVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).d0(wmVar, false);
                    wmVar.clearViews();
                    if (((ActionBarLayout) getParentLayout()).c(i3, wmVar)) {
                        org.telegram.messenger.hs.e().j(wmVar.aa);
                    }
                    if (z10 && !this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i3, new m91(bundle));
                        i3++;
                    }
                }
            } else if (z10 && this.H0 && (fragmentStack.get(i3) instanceof m91)) {
                m91 m91Var = (m91) fragmentStack.get(i3);
                if (m91Var.g() != null && m91Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).d0(m91Var, false);
                    i3--;
                }
            } else if (z10 && this.H0 && (fragmentStack.get(i3) instanceof uw) && (uwVar = (uw) fragmentStack.get(i3)) != null && (pvVar = uwVar.G3) != null && pvVar.c()) {
                uwVar.G3.a();
            }
            i3++;
        }
    }

    public final void w0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.u(org.telegram.messenger.bd.M0(2131753005, null), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            if (tL_username.active) {
                i3++;
            }
        }
        this.l0.u(org.telegram.messenger.bd.M0(2131753004, null), org.telegram.messenger.bd.a0(null, null, 2131753003, Integer.valueOf(i3), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ boolean x() {
        return false;
    }

    public final void x0(boolean z10) {
        String str;
        String str2;
        int i3;
        TLRPC.ChatFull N0 = getMessagesController().N0(this.w0);
        boolean V = org.telegram.messenger.t3.V(this.x0);
        TLRPC.ChatReactions chatReactions = this.L0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String M0 = org.telegram.messenger.bd.M0(2131746387, null);
            if (N0 == null || !N0.paid_reactions_available) {
                str = M0;
                this.P.u(org.telegram.messenger.bd.M0(2131746395, null), str, z10, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i10 = 0;
            for (0; i3 < tL_chatReactionsSome.reactions.size(); i3 + 1) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i3);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) getMediaDataController().r.get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i10++;
                    }
                } else {
                    i3 = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i3 + 1;
                    i10++;
                }
            }
            if (V) {
                if (N0 != null && N0.paid_reactions_available) {
                    i10++;
                }
                str2 = i10 == 0 ? org.telegram.messenger.bd.M0(2131746387, null) : String.valueOf(i10);
            } else {
                int min = Math.min(getMediaDataController().n.size(), i10);
                str2 = min == 0 ? org.telegram.messenger.bd.M0(2131746387, null) : org.telegram.messenger.bd.a0(null, null, 2131746392, Integer.valueOf(min), Integer.valueOf(getMediaDataController().n.size()));
            }
        } else {
            str2 = org.telegram.messenger.bd.M0(2131746394, null);
        }
        str = str2;
        this.P.u(org.telegram.messenger.bd.M0(2131746395, null), str, z10, R.drawable.msg_reactions2, true);
    }

    public final void y0(Long l10) {
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.L == null) {
            return;
        }
        long j10 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.L.u(org.telegram.messenger.bd.M0(2131747104, null), org.telegram.messenger.bd.M0(2131747094, null), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.x0.linked_monoforum_id));
        if (l10 != null) {
            j10 = l10.longValue();
        } else if (M0 != null) {
            j10 = M0.send_paid_messages_stars;
        }
        this.L.u(org.telegram.messenger.bd.M0(2131747104, null), ci.wb.a1(false, org.telegram.messenger.bd.a0(null, null, 2131747076, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.e30
    public final /* synthetic */ void T() {
    }
}
