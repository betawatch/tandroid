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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class ko extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.d50, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.b7 G;
    public boolean G0;
    public org.telegram.ui.Cells.r8 H;
    public boolean H0;
    public org.telegram.ui.Cells.r8 I;
    public boolean I0;
    public org.telegram.ui.Cells.r8 J;
    public TLRPC.ChatReactions J0;
    public org.telegram.ui.Cells.r8 K;
    public TL_stories.TL_premium_boostsStatus K0;
    public qo0 L;
    public boolean L0;
    public org.telegram.ui.Cells.r8 M;
    public boolean M0;
    public org.telegram.ui.Cells.r8 N;
    public boolean N0;
    public org.telegram.ui.Cells.r8 O;
    public final ArrayList O0;
    public org.telegram.ui.Cells.e9 P;
    public final io P0;
    public org.telegram.ui.Cells.r8 Q;
    public org.telegram.ui.Components.yj0 Q0;
    public LinearLayout R;
    public ValueAnimator R0;
    public LinearLayout S;
    public org.telegram.ui.Cells.r8 T;
    public org.telegram.ui.Cells.r8 U;
    public org.telegram.ui.Cells.r8 V;
    public org.telegram.ui.Cells.r8 W;
    public org.telegram.ui.Cells.r8 X;
    public org.telegram.ui.Cells.r8 Y;
    public org.telegram.ui.Cells.r8 Z;
    public org.telegram.ui.ActionBar.u0 a;
    public org.telegram.ui.Cells.r8 a0;
    public org.telegram.ui.ActionBar.c2 b;
    public jo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ca d0;
    public ci.j4 e;
    public org.telegram.ui.Cells.r8 e0;
    public ei.g6 f;
    public org.telegram.ui.Cells.r8 f0;
    public ii.b g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.e9 h0;
    public org.telegram.ui.Cells.r8 i0;
    public org.telegram.ui.Cells.e9 j0;
    public org.telegram.ui.Cells.r8 k0;
    public org.telegram.ui.Cells.r8 l0;
    public org.telegram.ui.Cells.r8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.r8 n0;
    public org.telegram.ui.Cells.r8 o0;
    public org.telegram.ui.Cells.r8 p0;
    public org.telegram.ui.Cells.r8 q0;
    public final org.telegram.ui.Components.h9 r;
    public org.telegram.ui.Cells.e9 r0;
    public final org.telegram.ui.Components.e50 s;
    public org.telegram.ui.Cells.e9 s0;
    public org.telegram.ui.Cells.r8 t0;
    public TLRPC.FileLocation u0;
    public org.telegram.ui.Components.qu v;
    public long v0;
    public ai.r w;
    public TLRPC.Chat w0;
    public org.telegram.ui.Components.bp0 x;
    public TLRPC.ChatFull x0;
    public LinearLayout y;
    public TLRPC.TL_chatAdminRights y0;
    public TLRPC.TL_chatBannedRights z0;

    public ko(Bundle bundle) {
        super(bundle);
        this.O0 = new ArrayList();
        this.P0 = new io(this);
        this.r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.v0 == 0) {
            this.s = new org.telegram.ui.Components.e50(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.v0));
            this.s = new org.telegram.ui.Components.e50((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(ko koVar, FrameLayout frameLayout, View view) {
        if (!koVar.F0) {
            TLRPC.ChatFull chatFull = koVar.x0;
            org.telegram.ui.Components.xc.a0(koVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", koVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -koVar.v0;
        wy wyVar = new wy(null);
        wyVar.a = j10;
        wyVar.setResourceProvider(koVar.resourceProvider);
        boolean z10 = koVar.E0;
        boolean z11 = koVar.G0;
        ai.r5 r5Var = new ai.r5(12, koVar, view);
        wyVar.c = z10;
        wyVar.d = z11;
        wyVar.f = r5Var;
        koVar.presentFragment(wyVar);
    }

    public static /* synthetic */ void V(ko koVar) {
        koVar.u0 = null;
        long j10 = koVar.B0;
        if (j10 == 0) {
            MessagesController.getInstance(koVar.currentAccount).changeChatAvatar(koVar.v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bo(koVar, 2));
        }
        koVar.n0(false, true);
        ci.j4 j4Var = koVar.e;
        org.telegram.ui.Components.h9 h9Var = koVar.r;
        Object obj = koVar.C0;
        if (obj == null) {
            obj = koVar.w0;
        }
        j4Var.h(null, null, h9Var, obj);
        koVar.Q0.M(0);
        koVar.b0.e.d();
    }

    public static void X(ko koVar) {
        int i10 = koVar.currentAccount;
        long j10 = koVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = koVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e = org.telegram.messenger.v0.e(16, "onlySelect", "dialogsType", true);
        e.putBoolean("resetDelegate", false);
        ey eyVar = new ey(e);
        eyVar.setCurrentAccount(i10);
        eyVar.C2 = new gi.q1(eyVar, i10, j10, botVerifierSettings);
        U.presentFragment(eyVar);
    }

    public static void Y(ko koVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        c2Var.dismiss();
        if (koVar.getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(35, koVar.currentAccount, koVar.getParentActivity(), koVar, koVar.getResourceProvider());
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new eh(11, koVar, chat);
        }
        koVar.showDialog(j0Var);
    }

    public static void Z(ko koVar) {
        bd bdVar = new bd(-koVar.w0.id);
        bdVar.l0 = koVar;
        koVar.presentFragment(bdVar);
        MessagesController.getInstance(koVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(koVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(ko koVar) {
        koVar.N0 = true;
        NotificationCenter.getInstance(koVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(10);
        o00Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        o00Var.f = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lj, false);
        o00Var.n = false;
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String g0(TLRPC.User user) {
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

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fi));
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

    /* JADX WARN: Removed duplicated region for block: B:142:0x07fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x09fe  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        final ko koVar;
        int i10;
        Context context2;
        int i11;
        int i12;
        int i13;
        boolean z10;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final ko koVar2;
        boolean z11;
        String format;
        int i14;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        int i15;
        int i16;
        org.telegram.ui.Cells.r8 r8Var3;
        org.telegram.ui.Cells.r8 r8Var4;
        org.telegram.ui.Cells.r8 r8Var5;
        org.telegram.ui.Cells.r8 r8Var6;
        TLRPC.ChatFull chatFull;
        boolean z12;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i17 = 1;
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar != null) {
            quVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 3));
        id idVar = new id(i17, context, this);
        idVar.setOnTouchListener(new di.d(9));
        this.fragmentView = idVar;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, idVar, null);
        ai.r rVar = new ai.r(context);
        this.w = rVar;
        org.telegram.ui.Components.bp0 bp0Var = new org.telegram.ui.Components.bp0(context, this.w, this.resourceProvider, false);
        this.x = bp0Var;
        bp0Var.setFillViewport(true);
        idVar.addView(this.x, w7.z5.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(rVar, new FrameLayout.LayoutParams(-1, -2));
        rVar.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i18 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i18, linearLayout2, null);
        rVar.addView(this.d, w7.z5.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.z5.n(-1, -2));
        ci.j4 j4Var = new ci.j4(this, context, 6);
        this.e = j4Var;
        j4Var.setRoundRadius(this.E0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i19 = 5;
        if (this.C0 != null || ChatObject.canChangeChatInfo(this.w0)) {
            View view = this.e;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(view, w7.z5.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(this, context, paint, i19);
            this.f = g6Var;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(g6Var, w7.z5.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            View view2 = this.n;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(view2, w7.z5.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i17) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j10 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                                        int i20 = chatPhoto2.dc_id;
                                        if (i20 != 0) {
                                            chatPhoto2.photo_big.dc_id = i20;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view3.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view3.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view3.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j11 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var7 = koVar14.H;
                            boolean z16 = r8Var7 != null && r8Var7.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j11;
                            yoVar.o0 = z16;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z17 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat2 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat2;
                            if (ChatObject.isChannel(chat2) && !kpVar.f.megagroup) {
                                z17 = true;
                            }
                            kpVar.s = z17;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i22 = 0; i22 < tL_chatReactionsSome.reactions.size(); i22++) {
                                            if (tL_chatReactionsSome.reactions.get(i22) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i22)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
        } else {
            View view3 = this.e;
            boolean z16 = LocaleController.isRTL;
            frameLayout2.addView(view3, w7.z5.d(64, 64.0f, (z16 ? 5 : 3) | 48, z16 ? 0.0f : 16.0f, 12.0f, z16 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, idVar, this);
        this.v = quVar2;
        long j10 = this.B0;
        if (j10 != 0) {
            quVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.H0) {
            quVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            quVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.qu quVar3 = this.v;
        TLRPC.Chat chat = this.w0;
        quVar3.setEnabled(chat != null || ChatObject.canChangeChatInfo(chat));
        org.telegram.ui.Components.qu quVar4 = this.v;
        quVar4.setFocusable(quVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new n0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        View view4 = this.v;
        boolean z17 = LocaleController.isRTL;
        frameLayout2.addView(view4, w7.z5.d(-1, -2.0f, 16, z17 ? 5.0f : 96.0f, 0.0f, z17 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.y = linearLayout3;
        linearLayout3.setOrientation(1);
        rVar.addView(this.y, w7.z5.n(-1, -2));
        final int i20 = 12;
        if (this.C0 != null || ChatObject.canChangeChatInfo(this.w0)) {
            jo joVar = new jo(context);
            this.b0 = joVar;
            org.telegram.ui.ActionBar.r6.T(joVar, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
            this.b0.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i20) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat2 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat2.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j11 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var7 = koVar14.H;
                            boolean z162 = r8Var7 != null && r8Var7.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j11;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat22 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat22;
                            if (ChatObject.isChannel(chat22) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i22 = 0; i22 < tL_chatReactionsSome.reactions.size(); i22++) {
                                            if (tL_chatReactionsSome.reactions.get(i22) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i22)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.b0, w7.z5.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.G(this.E, org.telegram.ui.ActionBar.k6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i21 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.W(editTextBoldCursor2, i21, null);
        this.E.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(LocaleController.isRTL ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.C0 != null || ChatObject.canChangeChatInfo(this.w0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.E.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        org.telegram.ui.ActionBar.r6.w(this.E, i21);
        this.E.setCursorSize(AndroidUtilities.dp(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.y.addView(this.E, w7.z5.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, w7.z5.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new ka(this, 2));
        this.E.addTextChangedListener(new ld(1));
        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(context);
        this.G = b7Var;
        rVar.addView(b7Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        rVar.addView(this.F, w7.z5.n(-1, -2));
        TLRPC.Chat chat2 = this.w0;
        CharSequence charSequence = "";
        if (chat2 != null) {
            final int i22 = 15;
            if (chat2.megagroup && ((chatFull3 = this.x0) == null || chatFull3.can_set_location)) {
                org.telegram.ui.Cells.r8 r8Var7 = new org.telegram.ui.Cells.r8(context);
                this.H = r8Var7;
                z12 = true;
                org.telegram.ui.ActionBar.r6.T(r8Var7, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i18), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                this.F.addView(this.H, w7.z5.n(-1, -2));
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i22) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.x0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.P0;
                                long j102 = koVar4.B0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.x0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.x0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new nh0(koVar6.v0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new vb(koVar8.w0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.B0);
                                koVar10.presentFragment(new sa(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.B0));
                                break;
                            case 9:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    sc0 sc0Var = new sc0(4);
                                    sc0Var.e0 = -koVar13.v0;
                                    TLRPC.ChatFull chatFull5 = koVar13.x0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(sc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.v0;
                                org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.N = new ArrayList();
                                yoVar.O = new ArrayList();
                                yoVar.Q = new ArrayList();
                                yoVar.d0 = true;
                                yoVar.g0 = new ArrayList();
                                yoVar.p0 = new HashMap();
                                yoVar.r0 = new no(yoVar, 5);
                                yoVar.u0 = false;
                                yoVar.a0 = j11;
                                yoVar.o0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.x0;
                                yoVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.Y(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.v0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.x0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                bw0 bw0Var = new bw0(koVar16.v0);
                                bw0Var.w = new co(koVar16, 4);
                                koVar16.presentFragment(bw0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                d60 d60Var = new d60(-koVar17.w0.id);
                                d60Var.c = koVar17.K0;
                                d60Var.l0 = koVar17;
                                koVar17.presentFragment(d60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.x0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.x0;
                                mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(mh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.v0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.x0;
                                    rpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            rpVar.w = 1;
                                        }
                                    }
                                    koVar20.presentFragment(rpVar);
                                    break;
                                }
                            default:
                                ko koVar21 = this.b;
                                koVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", koVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                z12 = true;
            }
            final int i23 = 16;
            if (this.w0.creator && ((chatFull2 = this.x0) == null || chatFull2.can_set_username)) {
                org.telegram.ui.Cells.r8 r8Var8 = new org.telegram.ui.Cells.r8(context);
                this.I = r8Var8;
                org.telegram.ui.ActionBar.r6.T(r8Var8, org.telegram.ui.ActionBar.k6.M0(z12), org.telegram.ui.ActionBar.r6.O(i18), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                this.F.addView(this.I, w7.z5.n(-1, -2));
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i23) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.x0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.P0;
                                long j102 = koVar4.B0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.x0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.x0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new nh0(koVar6.v0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new vb(koVar8.w0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.B0);
                                koVar10.presentFragment(new sa(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.B0));
                                break;
                            case 9:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    sc0 sc0Var = new sc0(4);
                                    sc0Var.e0 = -koVar13.v0;
                                    TLRPC.ChatFull chatFull5 = koVar13.x0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(sc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.v0;
                                org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.N = new ArrayList();
                                yoVar.O = new ArrayList();
                                yoVar.Q = new ArrayList();
                                yoVar.d0 = true;
                                yoVar.g0 = new ArrayList();
                                yoVar.p0 = new HashMap();
                                yoVar.r0 = new no(yoVar, 5);
                                yoVar.u0 = false;
                                yoVar.a0 = j11;
                                yoVar.o0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.x0;
                                yoVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.Y(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.v0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.x0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                bw0 bw0Var = new bw0(koVar16.v0);
                                bw0Var.w = new co(koVar16, 4);
                                koVar16.presentFragment(bw0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                d60 d60Var = new d60(-koVar17.w0.id);
                                d60Var.c = koVar17.K0;
                                d60Var.l0 = koVar17;
                                koVar17.presentFragment(d60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.x0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.x0;
                                mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(mh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.v0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.x0;
                                    rpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            rpVar.w = 1;
                                        }
                                    }
                                    koVar20.presentFragment(rpVar);
                                    break;
                                }
                            default:
                                ko koVar21 = this.b;
                                koVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", koVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.w0) && ((this.H0 && ChatObject.canUserDoAdminAction(this.w0, z12 ? 1 : 0)) || (!this.H0 && ChatObject.canUserDoAdminAction(this.w0, 0)))) {
                org.telegram.ui.Cells.r8 r8Var9 = new org.telegram.ui.Cells.r8(context);
                this.J = r8Var9;
                org.telegram.ui.ActionBar.r6.T(r8Var9, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i18), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                this.F.addView(this.J, w7.z5.n(-1, -2));
                final int i24 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i24) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.x0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.P0;
                                long j102 = koVar4.B0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.x0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.x0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new nh0(koVar6.v0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new vb(koVar8.w0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.B0);
                                koVar10.presentFragment(new sa(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.B0));
                                break;
                            case 9:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    sc0 sc0Var = new sc0(4);
                                    sc0Var.e0 = -koVar13.v0;
                                    TLRPC.ChatFull chatFull5 = koVar13.x0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(sc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.v0;
                                org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.N = new ArrayList();
                                yoVar.O = new ArrayList();
                                yoVar.Q = new ArrayList();
                                yoVar.d0 = true;
                                yoVar.g0 = new ArrayList();
                                yoVar.p0 = new HashMap();
                                yoVar.r0 = new no(yoVar, 5);
                                yoVar.u0 = false;
                                yoVar.a0 = j11;
                                yoVar.o0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.x0;
                                yoVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.Y(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.v0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.x0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                bw0 bw0Var = new bw0(koVar16.v0);
                                bw0Var.w = new co(koVar16, 4);
                                koVar16.presentFragment(bw0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                d60 d60Var = new d60(-koVar17.w0.id);
                                d60Var.c = koVar17.K0;
                                d60Var.l0 = koVar17;
                                koVar17.presentFragment(d60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.x0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.x0;
                                mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(mh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.v0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.x0;
                                    rpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            rpVar.w = 1;
                                        }
                                    }
                                    koVar20.presentFragment(rpVar);
                                    break;
                                }
                            default:
                                ko koVar21 = this.b;
                                koVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", koVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.w0) && this.H0 && ChatObject.canUserDoAdminAction(this.w0, 1)) {
                org.telegram.ui.Cells.r8 r8Var10 = new org.telegram.ui.Cells.r8(context);
                this.K = r8Var10;
                org.telegram.ui.ActionBar.r6.T(r8Var10, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i18), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                this.K.s(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.z5.n(-1, -2));
                final int i25 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i25) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.x0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.P0;
                                long j102 = koVar4.B0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.x0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.x0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new nh0(koVar6.v0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new vb(koVar8.w0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.B0);
                                koVar10.presentFragment(new sa(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.B0));
                                break;
                            case 9:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    sc0 sc0Var = new sc0(4);
                                    sc0Var.e0 = -koVar13.v0;
                                    TLRPC.ChatFull chatFull5 = koVar13.x0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(sc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.v0;
                                org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.N = new ArrayList();
                                yoVar.O = new ArrayList();
                                yoVar.Q = new ArrayList();
                                yoVar.d0 = true;
                                yoVar.g0 = new ArrayList();
                                yoVar.p0 = new HashMap();
                                yoVar.r0 = new no(yoVar, 5);
                                yoVar.u0 = false;
                                yoVar.a0 = j11;
                                yoVar.o0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.x0;
                                yoVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.Y(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.v0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.x0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                bw0 bw0Var = new bw0(koVar16.v0);
                                bw0Var.w = new co(koVar16, 4);
                                koVar16.presentFragment(bw0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                d60 d60Var = new d60(-koVar17.w0.id);
                                d60Var.c = koVar17.K0;
                                d60Var.l0 = koVar17;
                                koVar17.presentFragment(d60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.x0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.x0;
                                mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(mh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.v0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.x0;
                                    rpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            rpVar.w = 1;
                                        }
                                    }
                                    koVar20.presentFragment(rpVar);
                                    break;
                                }
                            default:
                                ko koVar21 = this.b;
                                koVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", koVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.w0) && ChatObject.canChangeChatInfo(this.w0)) {
                i10 = i18;
                qo0 qo0Var = new qo0(this.currentAccount, -this.w0.id, context, getResourceProvider());
                this.L = qo0Var;
                org.telegram.ui.ActionBar.r6.T(qo0Var, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i10), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                this.F.addView(this.L, w7.z5.n(-1, -2));
                final int i26 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i26) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.x0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.P0;
                                long j102 = koVar4.B0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.x0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.x0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new nh0(koVar6.v0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new vb(koVar8.w0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.B0);
                                koVar10.presentFragment(new sa(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.B0));
                                break;
                            case 9:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    sc0 sc0Var = new sc0(4);
                                    sc0Var.e0 = -koVar13.v0;
                                    TLRPC.ChatFull chatFull5 = koVar13.x0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(sc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.v0;
                                org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.N = new ArrayList();
                                yoVar.O = new ArrayList();
                                yoVar.Q = new ArrayList();
                                yoVar.d0 = true;
                                yoVar.g0 = new ArrayList();
                                yoVar.p0 = new HashMap();
                                yoVar.r0 = new no(yoVar, 5);
                                yoVar.u0 = false;
                                yoVar.a0 = j11;
                                yoVar.o0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.x0;
                                yoVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.Y(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.v0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.x0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                bw0 bw0Var = new bw0(koVar16.v0);
                                bw0Var.w = new co(koVar16, 4);
                                koVar16.presentFragment(bw0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                d60 d60Var = new d60(-koVar17.w0.id);
                                d60Var.c = koVar17.K0;
                                d60Var.l0 = koVar17;
                                koVar17.presentFragment(d60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.x0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.x0;
                                mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(mh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.v0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.x0;
                                    rpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            rpVar.w = 1;
                                        }
                                    }
                                    koVar20.presentFragment(rpVar);
                                    break;
                                }
                            default:
                                ko koVar21 = this.b;
                                koVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", koVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i10 = i18;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.w0) || ChatObject.isCommunity(this.w0)) {
                context3 = context;
                frameLayout = frameLayout2;
                koVar = this;
            } else {
                long j11 = -this.w0.id;
                org.telegram.ui.Cells.r8 r8Var11 = new org.telegram.ui.Cells.r8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.M = r8Var11;
                org.telegram.ui.ActionBar.r6.T(r8Var11, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i10), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                this.M.n(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.w0.autotranslation);
                final int i27 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j11, new Utilities.Callback(this) { // from class: org.telegram.ui.ao
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i27) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ko koVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    koVar3.getClass();
                                    break;
                                } else {
                                    koVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < koVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.K0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, w7.z5.n(-1, -2));
                frameLayout = frameLayout2;
                koVar = this;
                this.M.setOnClickListener(new ai.t3(this, new boolean[]{false}, j11, 1));
            }
            if (!koVar.H0 && ChatObject.canBlockUsers(koVar.w0) && (ChatObject.isChannel(koVar.w0) || koVar.w0.creator)) {
                org.telegram.ui.Cells.r8 r8Var12 = new org.telegram.ui.Cells.r8(context3);
                koVar.N = r8Var12;
                org.telegram.ui.ActionBar.r6.T(r8Var12, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i10), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                koVar.F.addView(koVar.N, w7.z5.n(-1, -2));
                koVar.N.setOnClickListener(new org.telegram.ui.ActionBar.s1(15, koVar, context3));
            }
            if (ChatObject.isMegagroup(koVar.w0) && ChatObject.hasAdminRights(koVar.w0) && !ChatObject.isCommunity(koVar.w0)) {
                final int i28 = 1;
                MessagesController.getInstance(koVar.currentAccount).getBoostsController().getBoostsStats(-koVar.w0.id, new Utilities.Callback(koVar) { // from class: org.telegram.ui.ao
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i28) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ko koVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    koVar3.getClass();
                                    break;
                                } else {
                                    koVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < koVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.K0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                qo0 qo0Var2 = new qo0(koVar.currentAccount, -koVar.w0.id, context3, koVar.getResourceProvider());
                koVar.L = qo0Var2;
                org.telegram.ui.ActionBar.r6.T(qo0Var2, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i10), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                koVar.F.addView(koVar.L, w7.z5.n(-1, -2));
                final int i29 = 20;
                koVar.L.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view32) {
                        switch (i29) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.x0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.P0;
                                long j102 = koVar4.B0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.x0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.x0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new nh0(koVar6.v0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new vb(koVar8.w0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.B0);
                                koVar10.presentFragment(new sa(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.B0));
                                break;
                            case 9:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    sc0 sc0Var = new sc0(4);
                                    sc0Var.e0 = -koVar13.v0;
                                    TLRPC.ChatFull chatFull5 = koVar13.x0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    sc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(sc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j112 = koVar14.v0;
                                org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.N = new ArrayList();
                                yoVar.O = new ArrayList();
                                yoVar.Q = new ArrayList();
                                yoVar.d0 = true;
                                yoVar.g0 = new ArrayList();
                                yoVar.p0 = new HashMap();
                                yoVar.r0 = new no(yoVar, 5);
                                yoVar.u0 = false;
                                yoVar.a0 = j112;
                                yoVar.o0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.x0;
                                yoVar.Z = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.m0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.Y(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.v0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.x0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                bw0 bw0Var = new bw0(koVar16.v0);
                                bw0Var.w = new co(koVar16, 4);
                                koVar16.presentFragment(bw0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                d60 d60Var = new d60(-koVar17.w0.id);
                                d60Var.c = koVar17.K0;
                                d60Var.l0 = koVar17;
                                koVar17.presentFragment(d60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.x0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.x0;
                                mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(mh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.v0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.x0;
                                    rpVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                }
                                            }
                                            rpVar.w = 1;
                                        }
                                    }
                                    koVar20.presentFragment(rpVar);
                                    break;
                                }
                            default:
                                ko koVar21 = this.b;
                                koVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", koVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!koVar.H0 && koVar.w0.creator) {
                org.telegram.ui.Cells.r8 r8Var13 = new org.telegram.ui.Cells.r8(23, context, null, false, true);
                context2 = context;
                koVar.Q = r8Var13;
                org.telegram.ui.ActionBar.r6.T(r8Var13, org.telegram.ui.ActionBar.k6.M0(true), org.telegram.ui.ActionBar.r6.O(i10), org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                koVar.Q.n(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), koVar.E0);
                koVar.Q.getCheckBox().setIcon(koVar.F0 ? 0 : R.drawable.permission_locked);
                koVar.F.addView(koVar.Q, w7.z5.c(-2.0f, -1));
                koVar.Q.setOnClickListener(new org.telegram.ui.ActionBar.s1(16, koVar, frameLayout));
            } else {
                context2 = context;
            }
            koVar.o0();
        } else {
            koVar = this;
            i10 = i18;
            context2 = context;
        }
        org.telegram.ui.ActionBar.y m10 = koVar.actionBar.m();
        if (koVar.C0 != null || ChatObject.canChangeChatInfo(koVar.w0) || koVar.N != null) {
            org.telegram.ui.ActionBar.u0 g10 = m10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            koVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (koVar.H == null && koVar.N == null && koVar.I == null && koVar.J == null && koVar.Q == null) {
            i11 = -2;
            i12 = -1;
        } else {
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context2, 12, koVar.resourceProvider);
            koVar.P = e9Var;
            if (koVar.Q != null) {
                e9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                e9Var.setFixedSize(12);
            }
            i11 = -2;
            i12 = -1;
            rVar.addView(koVar.P, w7.z5.n(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        koVar.R = linearLayout5;
        linearLayout5.setOrientation(1);
        rVar.addView(koVar.R, w7.z5.n(i12, i11));
        final int i30 = 8;
        if (koVar.w0 != null) {
            org.telegram.ui.Cells.r8 r8Var14 = new org.telegram.ui.Cells.r8(context2);
            koVar.X = r8Var14;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.k6.M0(false);
            int i31 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.T(r8Var14, M0, null, org.telegram.ui.ActionBar.r6.O(i31));
            org.telegram.ui.Cells.r8 r8Var15 = koVar.X;
            if (!ChatObject.isChannel(koVar.w0)) {
                TLRPC.Chat chat3 = koVar.w0;
                if (!chat3.creator && (!ChatObject.hasAdminRights(chat3) || !ChatObject.canChangeChatInfo(koVar.w0))) {
                    i14 = 8;
                    r8Var15.setVisibility(i14);
                    final int i32 = 21;
                    koVar.X.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view32) {
                            switch (i32) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.x0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.P0;
                                    long j102 = koVar4.B0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.x0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new nh0(koVar6.v0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new vb(koVar8.w0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.B0);
                                    koVar10.presentFragment(new sa(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.B0));
                                    break;
                                case 9:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        sc0 sc0Var = new sc0(4);
                                        sc0Var.e0 = -koVar13.v0;
                                        TLRPC.ChatFull chatFull5 = koVar13.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(sc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.v0;
                                    org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                    boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.N = new ArrayList();
                                    yoVar.O = new ArrayList();
                                    yoVar.Q = new ArrayList();
                                    yoVar.d0 = true;
                                    yoVar.g0 = new ArrayList();
                                    yoVar.p0 = new HashMap();
                                    yoVar.r0 = new no(yoVar, 5);
                                    yoVar.u0 = false;
                                    yoVar.a0 = j112;
                                    yoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.x0;
                                    yoVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.Y(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.v0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.x0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    bw0 bw0Var = new bw0(koVar16.v0);
                                    bw0Var.w = new co(koVar16, 4);
                                    koVar16.presentFragment(bw0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    d60 d60Var = new d60(-koVar17.w0.id);
                                    d60Var.c = koVar17.K0;
                                    d60Var.l0 = koVar17;
                                    koVar17.presentFragment(d60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.x0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.x0;
                                    mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(mh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.v0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.x0;
                                        rpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                rpVar.w = 1;
                                            }
                                        }
                                        koVar20.presentFragment(rpVar);
                                        break;
                                    }
                                default:
                                    ko koVar21 = this.b;
                                    koVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", koVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var16 = new org.telegram.ui.Cells.r8(context2);
                    koVar.V = r8Var16;
                    org.telegram.ui.ActionBar.r6.T(r8Var16, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                    final int i33 = 22;
                    koVar.V.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view32) {
                            switch (i33) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.x0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.P0;
                                    long j102 = koVar4.B0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.x0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new nh0(koVar6.v0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new vb(koVar8.w0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.B0);
                                    koVar10.presentFragment(new sa(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.B0));
                                    break;
                                case 9:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        sc0 sc0Var = new sc0(4);
                                        sc0Var.e0 = -koVar13.v0;
                                        TLRPC.ChatFull chatFull5 = koVar13.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(sc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.v0;
                                    org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                    boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.N = new ArrayList();
                                    yoVar.O = new ArrayList();
                                    yoVar.Q = new ArrayList();
                                    yoVar.d0 = true;
                                    yoVar.g0 = new ArrayList();
                                    yoVar.p0 = new HashMap();
                                    yoVar.r0 = new no(yoVar, 5);
                                    yoVar.u0 = false;
                                    yoVar.a0 = j112;
                                    yoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.x0;
                                    yoVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.Y(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.v0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.x0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    bw0 bw0Var = new bw0(koVar16.v0);
                                    bw0Var.w = new co(koVar16, 4);
                                    koVar16.presentFragment(bw0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    d60 d60Var = new d60(-koVar17.w0.id);
                                    d60Var.c = koVar17.K0;
                                    d60Var.l0 = koVar17;
                                    koVar17.presentFragment(d60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.x0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.x0;
                                    mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(mh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.v0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.x0;
                                        rpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                rpVar.w = 1;
                                            }
                                        }
                                        koVar20.presentFragment(rpVar);
                                        break;
                                    }
                                default:
                                    ko koVar21 = this.b;
                                    koVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", koVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var17 = new org.telegram.ui.Cells.r8(context2);
                    koVar.O = r8Var17;
                    org.telegram.ui.ActionBar.r6.T(r8Var17, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                    final int i34 = 23;
                    koVar.O.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view32) {
                            switch (i34) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.x0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.P0;
                                    long j102 = koVar4.B0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.x0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new nh0(koVar6.v0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new vb(koVar8.w0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.B0);
                                    koVar10.presentFragment(new sa(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.B0));
                                    break;
                                case 9:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        sc0 sc0Var = new sc0(4);
                                        sc0Var.e0 = -koVar13.v0;
                                        TLRPC.ChatFull chatFull5 = koVar13.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(sc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.v0;
                                    org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                    boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.N = new ArrayList();
                                    yoVar.O = new ArrayList();
                                    yoVar.Q = new ArrayList();
                                    yoVar.d0 = true;
                                    yoVar.g0 = new ArrayList();
                                    yoVar.p0 = new HashMap();
                                    yoVar.r0 = new no(yoVar, 5);
                                    yoVar.u0 = false;
                                    yoVar.a0 = j112;
                                    yoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.x0;
                                    yoVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.Y(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.v0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.x0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    bw0 bw0Var = new bw0(koVar16.v0);
                                    bw0Var.w = new co(koVar16, 4);
                                    koVar16.presentFragment(bw0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    d60 d60Var = new d60(-koVar17.w0.id);
                                    d60Var.c = koVar17.K0;
                                    d60Var.l0 = koVar17;
                                    koVar17.presentFragment(d60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.x0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.x0;
                                    mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(mh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.v0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.x0;
                                        rpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                rpVar.w = 1;
                                            }
                                        }
                                        koVar20.presentFragment(rpVar);
                                        break;
                                    }
                                default:
                                    ko koVar21 = this.b;
                                    koVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", koVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(koVar.w0, 28)) {
                        org.telegram.ui.Cells.r8 r8Var18 = new org.telegram.ui.Cells.r8(context2);
                        koVar.e0 = r8Var18;
                        org.telegram.ui.ActionBar.r6.T(r8Var18, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                        final int i35 = 24;
                        koVar.e0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view32) {
                                switch (i35) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.x0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.P0;
                                        long j102 = koVar4.B0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.x0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new nh0(koVar6.v0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new vb(koVar8.w0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.B0);
                                        koVar10.presentFragment(new sa(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.B0));
                                        break;
                                    case 9:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            sc0 sc0Var = new sc0(4);
                                            sc0Var.e0 = -koVar13.v0;
                                            TLRPC.ChatFull chatFull5 = koVar13.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(sc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.v0;
                                        org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                        boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.N = new ArrayList();
                                        yoVar.O = new ArrayList();
                                        yoVar.Q = new ArrayList();
                                        yoVar.d0 = true;
                                        yoVar.g0 = new ArrayList();
                                        yoVar.p0 = new HashMap();
                                        yoVar.r0 = new no(yoVar, 5);
                                        yoVar.u0 = false;
                                        yoVar.a0 = j112;
                                        yoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.x0;
                                        yoVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.Y(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.v0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.x0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        bw0 bw0Var = new bw0(koVar16.v0);
                                        bw0Var.w = new co(koVar16, 4);
                                        koVar16.presentFragment(bw0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        d60 d60Var = new d60(-koVar17.w0.id);
                                        d60Var.c = koVar17.K0;
                                        d60Var.l0 = koVar17;
                                        koVar17.presentFragment(d60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.x0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.x0;
                                        mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(mh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.v0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.x0;
                                            rpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    rpVar.w = 1;
                                                }
                                            }
                                            koVar20.presentFragment(rpVar);
                                            break;
                                        }
                                    default:
                                        ko koVar21 = this.b;
                                        koVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", koVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                        koVar.f0();
                    }
                    org.telegram.ui.Cells.r8 r8Var19 = new org.telegram.ui.Cells.r8(context2);
                    koVar.W = r8Var19;
                    final int i36 = 0;
                    org.telegram.ui.ActionBar.r6.T(r8Var19, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                    koVar.W.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view32) {
                            switch (i36) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.x0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.P0;
                                    long j102 = koVar4.B0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.x0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new nh0(koVar6.v0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new vb(koVar8.w0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.B0);
                                    koVar10.presentFragment(new sa(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.B0));
                                    break;
                                case 9:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        sc0 sc0Var = new sc0(4);
                                        sc0Var.e0 = -koVar13.v0;
                                        TLRPC.ChatFull chatFull5 = koVar13.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(sc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.v0;
                                    org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                    boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.N = new ArrayList();
                                    yoVar.O = new ArrayList();
                                    yoVar.Q = new ArrayList();
                                    yoVar.d0 = true;
                                    yoVar.g0 = new ArrayList();
                                    yoVar.p0 = new HashMap();
                                    yoVar.r0 = new no(yoVar, 5);
                                    yoVar.u0 = false;
                                    yoVar.a0 = j112;
                                    yoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.x0;
                                    yoVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.Y(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.v0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.x0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    bw0 bw0Var = new bw0(koVar16.v0);
                                    bw0Var.w = new co(koVar16, 4);
                                    koVar16.presentFragment(bw0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    d60 d60Var = new d60(-koVar17.w0.id);
                                    d60Var.c = koVar17.K0;
                                    d60Var.l0 = koVar17;
                                    koVar17.presentFragment(d60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.x0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.x0;
                                    mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(mh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.v0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.x0;
                                        rpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                rpVar.w = 1;
                                            }
                                        }
                                        koVar20.presentFragment(rpVar);
                                        break;
                                    }
                                default:
                                    ko koVar21 = this.b;
                                    koVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", koVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.r8 r8Var20 = new org.telegram.ui.Cells.r8(context2);
                    koVar.T = r8Var20;
                    org.telegram.ui.ActionBar.r6.T(r8Var20, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                    final int i37 = 2;
                    koVar.T.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view32) {
                            switch (i37) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.x0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.P0;
                                    long j102 = koVar4.B0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.x0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new nh0(koVar6.v0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new vb(koVar8.w0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.B0);
                                    koVar10.presentFragment(new sa(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.B0));
                                    break;
                                case 9:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        sc0 sc0Var = new sc0(4);
                                        sc0Var.e0 = -koVar13.v0;
                                        TLRPC.ChatFull chatFull5 = koVar13.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(sc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.v0;
                                    org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                    boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.N = new ArrayList();
                                    yoVar.O = new ArrayList();
                                    yoVar.Q = new ArrayList();
                                    yoVar.d0 = true;
                                    yoVar.g0 = new ArrayList();
                                    yoVar.p0 = new HashMap();
                                    yoVar.r0 = new no(yoVar, 5);
                                    yoVar.u0 = false;
                                    yoVar.a0 = j112;
                                    yoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.x0;
                                    yoVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.Y(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.v0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.x0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    bw0 bw0Var = new bw0(koVar16.v0);
                                    bw0Var.w = new co(koVar16, 4);
                                    koVar16.presentFragment(bw0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    d60 d60Var = new d60(-koVar17.w0.id);
                                    d60Var.c = koVar17.K0;
                                    d60Var.l0 = koVar17;
                                    koVar17.presentFragment(d60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.x0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.x0;
                                    mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(mh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.v0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.x0;
                                        rpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                rpVar.w = 1;
                                            }
                                        }
                                        koVar20.presentFragment(rpVar);
                                        break;
                                    }
                                default:
                                    ko koVar21 = this.b;
                                    koVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", koVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(koVar.w0)) {
                        org.telegram.ui.Cells.r8 r8Var21 = new org.telegram.ui.Cells.r8(context2);
                        koVar.U = r8Var21;
                        org.telegram.ui.ActionBar.r6.T(r8Var21, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                        final int i38 = 3;
                        koVar.U.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view32) {
                                switch (i38) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.x0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.P0;
                                        long j102 = koVar4.B0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.x0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new nh0(koVar6.v0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new vb(koVar8.w0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.B0);
                                        koVar10.presentFragment(new sa(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.B0));
                                        break;
                                    case 9:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            sc0 sc0Var = new sc0(4);
                                            sc0Var.e0 = -koVar13.v0;
                                            TLRPC.ChatFull chatFull5 = koVar13.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(sc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.v0;
                                        org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                        boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.N = new ArrayList();
                                        yoVar.O = new ArrayList();
                                        yoVar.Q = new ArrayList();
                                        yoVar.d0 = true;
                                        yoVar.g0 = new ArrayList();
                                        yoVar.p0 = new HashMap();
                                        yoVar.r0 = new no(yoVar, 5);
                                        yoVar.u0 = false;
                                        yoVar.a0 = j112;
                                        yoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.x0;
                                        yoVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.Y(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.v0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.x0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        bw0 bw0Var = new bw0(koVar16.v0);
                                        bw0Var.w = new co(koVar16, 4);
                                        koVar16.presentFragment(bw0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        d60 d60Var = new d60(-koVar17.w0.id);
                                        d60Var.c = koVar17.K0;
                                        d60Var.l0 = koVar17;
                                        koVar17.presentFragment(d60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.x0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.x0;
                                        mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(mh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.v0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.x0;
                                            rpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    rpVar.w = 1;
                                                }
                                            }
                                            koVar20.presentFragment(rpVar);
                                            break;
                                        }
                                    default:
                                        ko koVar21 = this.b;
                                        koVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", koVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.r8 r8Var22 = new org.telegram.ui.Cells.r8(context2);
                    koVar.Z = r8Var22;
                    r8Var22.o(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    org.telegram.ui.ActionBar.r6.T(koVar.Z, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                    final int i39 = 4;
                    koVar.Z.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view32) {
                            switch (i39) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.x0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.P0;
                                    long j102 = koVar4.B0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.x0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new nh0(koVar6.v0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new vb(koVar8.w0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.B0);
                                    koVar10.presentFragment(new sa(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.B0));
                                    break;
                                case 9:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        sc0 sc0Var = new sc0(4);
                                        sc0Var.e0 = -koVar13.v0;
                                        TLRPC.ChatFull chatFull5 = koVar13.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        sc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(sc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.v0;
                                    org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                    boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.N = new ArrayList();
                                    yoVar.O = new ArrayList();
                                    yoVar.Q = new ArrayList();
                                    yoVar.d0 = true;
                                    yoVar.g0 = new ArrayList();
                                    yoVar.p0 = new HashMap();
                                    yoVar.r0 = new no(yoVar, 5);
                                    yoVar.u0 = false;
                                    yoVar.a0 = j112;
                                    yoVar.o0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.x0;
                                    yoVar.Z = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.m0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.Y(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.v0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.x0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    bw0 bw0Var = new bw0(koVar16.v0);
                                    bw0Var.w = new co(koVar16, 4);
                                    koVar16.presentFragment(bw0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    d60 d60Var = new d60(-koVar17.w0.id);
                                    d60Var.c = koVar17.K0;
                                    d60Var.l0 = koVar17;
                                    koVar17.presentFragment(d60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.x0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.x0;
                                    mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(mh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.v0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.x0;
                                        rpVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                    if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                    }
                                                }
                                                rpVar.w = 1;
                                            }
                                        }
                                        koVar20.presentFragment(rpVar);
                                        break;
                                    }
                                default:
                                    ko koVar21 = this.b;
                                    koVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", koVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    koVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(koVar.w0) || koVar.w0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var23 = new org.telegram.ui.Cells.r8(context2);
                        koVar.Y = r8Var23;
                        r8Var23.o(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        org.telegram.ui.ActionBar.r6.T(koVar.Y, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                        final int i40 = 5;
                        koVar.Y.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view32) {
                                switch (i40) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.x0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.P0;
                                        long j102 = koVar4.B0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.x0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new nh0(koVar6.v0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new vb(koVar8.w0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.B0);
                                        koVar10.presentFragment(new sa(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.B0));
                                        break;
                                    case 9:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            sc0 sc0Var = new sc0(4);
                                            sc0Var.e0 = -koVar13.v0;
                                            TLRPC.ChatFull chatFull5 = koVar13.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(sc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.v0;
                                        org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                        boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.N = new ArrayList();
                                        yoVar.O = new ArrayList();
                                        yoVar.Q = new ArrayList();
                                        yoVar.d0 = true;
                                        yoVar.g0 = new ArrayList();
                                        yoVar.p0 = new HashMap();
                                        yoVar.r0 = new no(yoVar, 5);
                                        yoVar.u0 = false;
                                        yoVar.a0 = j112;
                                        yoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.x0;
                                        yoVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.Y(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.v0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.x0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        bw0 bw0Var = new bw0(koVar16.v0);
                                        bw0Var.w = new co(koVar16, 4);
                                        koVar16.presentFragment(bw0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        d60 d60Var = new d60(-koVar17.w0.id);
                                        d60Var.c = koVar17.K0;
                                        d60Var.l0 = koVar17;
                                        koVar17.presentFragment(d60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.x0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.x0;
                                        mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(mh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.v0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.x0;
                                            rpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    rpVar.w = 1;
                                                }
                                            }
                                            koVar20.presentFragment(rpVar);
                                            break;
                                        }
                                    default:
                                        ko koVar21 = this.b;
                                        koVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", koVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(koVar.w0)) {
                        org.telegram.ui.Cells.r8 r8Var24 = new org.telegram.ui.Cells.r8(context2);
                        koVar.a0 = r8Var24;
                        r8Var24.o(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        org.telegram.ui.ActionBar.r6.T(koVar.a0, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
                        final int i41 = 6;
                        koVar.a0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view32) {
                                switch (i41) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.x0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.P0;
                                        long j102 = koVar4.B0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.x0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.x0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new nh0(koVar6.v0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.v0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new vb(koVar8.w0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(u91.d0(koVar9.w0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.B0);
                                        koVar10.presentFragment(new sa(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.B0));
                                        break;
                                    case 9:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            sc0 sc0Var = new sc0(4);
                                            sc0Var.e0 = -koVar13.v0;
                                            TLRPC.ChatFull chatFull5 = koVar13.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            sc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(sc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.v0;
                                        org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                                        boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.N = new ArrayList();
                                        yoVar.O = new ArrayList();
                                        yoVar.Q = new ArrayList();
                                        yoVar.d0 = true;
                                        yoVar.g0 = new ArrayList();
                                        yoVar.p0 = new HashMap();
                                        yoVar.r0 = new no(yoVar, 5);
                                        yoVar.u0 = false;
                                        yoVar.a0 = j112;
                                        yoVar.o0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.x0;
                                        yoVar.Z = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.m0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.Y(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.v0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.x0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        bw0 bw0Var = new bw0(koVar16.v0);
                                        bw0Var.w = new co(koVar16, 4);
                                        koVar16.presentFragment(bw0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        d60 d60Var = new d60(-koVar17.w0.id);
                                        d60Var.c = koVar17.K0;
                                        d60Var.l0 = koVar17;
                                        koVar17.presentFragment(d60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.x0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.x0;
                                        mh0Var.h0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(mh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.v0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.x0;
                                            rpVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                                        if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                                        }
                                                    }
                                                    rpVar.w = 1;
                                                }
                                            }
                                            koVar20.presentFragment(rpVar);
                                            break;
                                        }
                                    default:
                                        ko koVar21 = this.b;
                                        koVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", koVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    koVar.R.addView(koVar.O, w7.z5.n(-1, -2));
                    r8Var = koVar.e0;
                    if (r8Var != null) {
                        koVar.R.addView(r8Var, w7.z5.n(-1, -2));
                    }
                    if (!koVar.H0 && !koVar.w0.gigagroup) {
                        koVar.R.addView(koVar.X, w7.z5.n(-1, -2));
                    }
                    if (!koVar.H0) {
                        koVar.R.addView(koVar.V, w7.z5.n(-1, -2));
                    }
                    koVar.R.addView(koVar.W, w7.z5.n(-1, -2));
                    koVar.R.addView(koVar.T, w7.z5.n(-1, -2));
                    r8Var2 = koVar.U;
                    if (r8Var2 != null && (chatFull = koVar.x0) != null && chatFull.requests_pending > 0) {
                        koVar.R.addView(r8Var2, w7.z5.n(-1, -2));
                    }
                    if (koVar.H0) {
                        koVar.R.addView(koVar.V, w7.z5.n(-1, -2));
                    }
                    if (!koVar.H0 || koVar.w0.gigagroup) {
                        i15 = -2;
                        i16 = -1;
                        koVar.R.addView(koVar.X, w7.z5.n(-1, -2));
                    } else {
                        i15 = -2;
                        i16 = -1;
                    }
                    r8Var3 = koVar.a0;
                    if (r8Var3 != null) {
                        koVar.R.addView(r8Var3, w7.z5.n(i16, i15));
                    }
                    r8Var4 = koVar.Y;
                    if (r8Var4 != null) {
                        koVar.R.addView(r8Var4, w7.z5.n(i16, i15));
                    }
                    r8Var5 = koVar.Z;
                    if (r8Var5 != null) {
                        koVar.R.addView(r8Var5, w7.z5.n(i16, i15));
                    }
                    if (koVar.Z != null && koVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(koVar.w0)) {
                        koVar.Z.setVisibility(0);
                    }
                    r8Var6 = koVar.Y;
                    if (r8Var6 != null) {
                        org.telegram.ui.Cells.r8 r8Var25 = koVar.Z;
                        r8Var6.setNeedDivider(r8Var25 != null && r8Var25.getVisibility() == 0);
                    }
                }
            }
            i14 = 0;
            r8Var15.setVisibility(i14);
            final int i322 = 21;
            koVar.X.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i322) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var162 = new org.telegram.ui.Cells.r8(context2);
            koVar.V = r8Var162;
            org.telegram.ui.ActionBar.r6.T(r8Var162, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
            final int i332 = 22;
            koVar.V.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i332) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var172 = new org.telegram.ui.Cells.r8(context2);
            koVar.O = r8Var172;
            org.telegram.ui.ActionBar.r6.T(r8Var172, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
            final int i342 = 23;
            koVar.O.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i342) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(koVar.w0, 28)) {
            }
            org.telegram.ui.Cells.r8 r8Var192 = new org.telegram.ui.Cells.r8(context2);
            koVar.W = r8Var192;
            final int i362 = 0;
            org.telegram.ui.ActionBar.r6.T(r8Var192, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
            koVar.W.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i362) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var202 = new org.telegram.ui.Cells.r8(context2);
            koVar.T = r8Var202;
            org.telegram.ui.ActionBar.r6.T(r8Var202, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
            final int i372 = 2;
            koVar.T.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i372) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(koVar.w0)) {
            }
            org.telegram.ui.Cells.r8 r8Var222 = new org.telegram.ui.Cells.r8(context2);
            koVar.Z = r8Var222;
            r8Var222.o(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            org.telegram.ui.ActionBar.r6.T(koVar.Z, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
            final int i392 = 4;
            koVar.Z.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i392) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            koVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(koVar.w0)) {
            }
            org.telegram.ui.Cells.r8 r8Var232 = new org.telegram.ui.Cells.r8(context2);
            koVar.Y = r8Var232;
            r8Var232.o(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            org.telegram.ui.ActionBar.r6.T(koVar.Y, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i31));
            final int i402 = 5;
            koVar.Y.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i402) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(koVar.w0)) {
            }
            koVar.R.addView(koVar.O, w7.z5.n(-1, -2));
            r8Var = koVar.e0;
            if (r8Var != null) {
            }
            if (!koVar.H0) {
                koVar.R.addView(koVar.X, w7.z5.n(-1, -2));
            }
            if (!koVar.H0) {
            }
            koVar.R.addView(koVar.W, w7.z5.n(-1, -2));
            koVar.R.addView(koVar.T, w7.z5.n(-1, -2));
            r8Var2 = koVar.U;
            if (r8Var2 != null) {
                koVar.R.addView(r8Var2, w7.z5.n(-1, -2));
            }
            if (koVar.H0) {
            }
            if (koVar.H0) {
            }
            i15 = -2;
            i16 = -1;
            koVar.R.addView(koVar.X, w7.z5.n(-1, -2));
            r8Var3 = koVar.a0;
            if (r8Var3 != null) {
            }
            r8Var4 = koVar.Y;
            if (r8Var4 != null) {
            }
            r8Var5 = koVar.Z;
            if (r8Var5 != null) {
            }
            if (koVar.Z != null) {
                koVar.Z.setVisibility(0);
            }
            r8Var6 = koVar.Y;
            if (r8Var6 != null) {
            }
        }
        if (koVar.C0 != null) {
            org.telegram.ui.Cells.r8 r8Var26 = new org.telegram.ui.Cells.r8(context2);
            koVar.k0 = r8Var26;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.k6.M0(false);
            int i42 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.T(r8Var26, M02, null, org.telegram.ui.ActionBar.r6.O(i42));
            koVar.k0.setPrioritizeTitleOverValue(true);
            koVar.R.addView(koVar.k0, w7.z5.n(-1, -2));
            final int i43 = 7;
            koVar.k0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i43) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            koVar.r0();
            org.telegram.ui.Cells.r8 r8Var27 = new org.telegram.ui.Cells.r8(context2);
            koVar.n0 = r8Var27;
            org.telegram.ui.ActionBar.r6.T(r8Var27, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i42));
            koVar.n0.s(d0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            koVar.R.addView(koVar.n0, w7.z5.n(-1, -2));
            koVar.n0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i30) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            koVar.n0.h(45, koVar.D0 == null, false);
            TLRPC.UserFull userFull = koVar.D0;
            if (userFull != null) {
                org.telegram.ui.Cells.r8 r8Var28 = koVar.n0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                r8Var28.w(format, z11);
            }
            if (!koVar.getMessagesController().starrefProgramAllowed) {
                koVar.n0.setVisibility(8);
            }
            org.telegram.ui.Cells.r8 r8Var29 = new org.telegram.ui.Cells.r8(context2);
            koVar.o0 = r8Var29;
            org.telegram.ui.ActionBar.r6.T(r8Var29, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i42));
            koVar.o0.o(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            koVar.R.addView(koVar.o0, w7.z5.n(-1, -2));
            final int i44 = 9;
            koVar.o0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i44) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var30 = new org.telegram.ui.Cells.r8(context2);
            koVar.p0 = r8Var30;
            org.telegram.ui.ActionBar.r6.T(r8Var30, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i42));
            koVar.p0.o(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            koVar.R.addView(koVar.p0, w7.z5.n(-1, -2));
            final int i45 = 10;
            koVar.p0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i45) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var31 = new org.telegram.ui.Cells.r8(context2);
            koVar.q0 = r8Var31;
            org.telegram.ui.ActionBar.r6.T(r8Var31, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i42));
            koVar.q0.o(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            koVar.R.addView(koVar.q0, w7.z5.n(-1, -2));
            final int i46 = 11;
            koVar.q0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i46) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = koVar.w0;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                koVar.R.setVisibility(8);
                koVar.G.setVisibility(8);
            }
            rVar.addView(new org.telegram.ui.Cells.b7(context2), w7.z5.n(-1, -2));
        } else if (koVar.C0 != null) {
            koVar.r0 = new org.telegram.ui.Cells.e9(context2, 12, koVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new ai.f5(1), indexOf, indexOf + 10, 33);
            }
            koVar.r0.setText(valueOf);
            rVar.addView(koVar.r0, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r8 r8Var32 = new org.telegram.ui.Cells.r8(context2);
            koVar.t0 = r8Var32;
            org.telegram.ui.Cells.y M03 = org.telegram.ui.ActionBar.k6.M0(true);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
            int i47 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.ActionBar.r6.T(r8Var32, M03, O, org.telegram.ui.ActionBar.r6.O(i47));
            koVar.t0.o(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.r8 r8Var33 = koVar.t0;
            int i48 = org.telegram.ui.ActionBar.k6.q6;
            r8Var33.g(i48, i48);
            rVar.addView(koVar.t0, w7.z5.n(-1, -2));
            final int i49 = 13;
            koVar.t0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i49) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.e9 e9Var2 = new org.telegram.ui.Cells.e9(context2, 12, koVar.resourceProvider);
            koVar.s0 = e9Var2;
            e9Var2.setFixedSize(12);
            rVar.addView(koVar.s0, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.r8 r8Var34 = koVar.t0;
            TLRPC.UserFull userFull2 = koVar.D0;
            r8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.e9 e9Var3 = koVar.s0;
            TLRPC.UserFull userFull3 = koVar.D0;
            e9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = koVar.C0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                koVar.S = linearLayout6;
                linearLayout6.setOrientation(1);
                rVar.addView(koVar.S, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2);
                l4Var.setText(LocaleController.getString(R.string.BotBalance));
                koVar.S.addView(l4Var, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.r8 r8Var35 = new org.telegram.ui.Cells.r8(context2);
                koVar.l0 = r8Var35;
                org.telegram.ui.ActionBar.r6.T(r8Var35, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i47));
                koVar.l0.setPrioritizeTitleOverValue(true);
                koVar.S.addView(koVar.l0, w7.z5.n(-1, -2));
                final ai.k0 g11 = ai.k0.g(koVar.currentAccount);
                final int i50 = 0;
                koVar.l0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        switch (i50) {
                            case 0:
                                ko koVar3 = this.b;
                                long j12 = koVar3.B0;
                                if (g11.h(j12, false) != null) {
                                    koVar3.presentFragment(new ai.x(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ko koVar4 = this.b;
                                long j13 = koVar4.B0;
                                if (g11.h(j13, false) != null) {
                                    koVar4.presentFragment(new ai.x(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.m(j10)) {
                    long i51 = g11.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i51 > 0) {
                        double d = i51 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            i13 = i47;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            koVar.l0.s(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i13 = i47;
                    koVar.l0.s(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.da0(AndroidUtilities.dp(30.0f), koVar.l0.c), 0, spannableStringBuilder2.length(), 33);
                    koVar.l0.s(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i13 = i47;
                }
                koVar.l0.setVisibility(g11.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.r8 r8Var36 = new org.telegram.ui.Cells.r8(context2);
                koVar.m0 = r8Var36;
                org.telegram.ui.ActionBar.r6.T(r8Var36, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i13));
                final int i52 = 1;
                koVar.m0.setPrioritizeTitleOverValue(true);
                koVar.S.addView(koVar.m0, w7.z5.n(-1, -2));
                koVar.m0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        switch (i52) {
                            case 0:
                                ko koVar3 = this.b;
                                long j12 = koVar3.B0;
                                if (g11.h(j12, false) != null) {
                                    koVar3.presentFragment(new ai.x(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ko koVar4 = this.b;
                                long j13 = koVar4.B0;
                                if (g11.h(j13, false) != null) {
                                    koVar4.presentFragment(new ai.x(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j10, false) != null) {
                    org.telegram.ui.Cells.r8 r8Var37 = koVar.m0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j10).amount <= 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                        charSequence = ai.nd.Y0(false, TextUtils.concat("XTR", ai.nd.L0(g11.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    r8Var37.s(string2, charSequence, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.da0(AndroidUtilities.dp(30.0f), koVar.m0.c), 0, spannableStringBuilder3.length(), 33);
                    koVar.m0.s(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                koVar.m0.setVisibility(g11.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.e9 e9Var4 = new org.telegram.ui.Cells.e9(context2, 12, koVar.getResourceProvider());
                e9Var4.setFixedSize(12);
                e9Var4.setTag(R.id.fit_width_tag, 1);
                rVar.addView(e9Var4, w7.z5.n(-1, 12));
                koVar.S.setVisibility((koVar.m0.getVisibility() == 0 || koVar.l0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = koVar.w0;
        final int i53 = 14;
        if ((chat5 == null || !chat5.creator) && !((user = koVar.C0) != null && user.bot && user.bot_can_edit)) {
            koVar2 = koVar;
        } else {
            final long j12 = chat5 != null ? chat5.linked_community_id : koVar.C0.linked_community_id;
            final long j13 = chat5 != null ? -chat5.id : koVar.C0.id;
            final boolean z18 = koVar.C0 != null;
            if (j12 != 0) {
                ii.b bVar = new ii.b(context2, koVar.resourceProvider);
                koVar.g0 = bVar;
                bVar.a(koVar.currentAccount, koVar.getMessagesController().getChat(Long.valueOf(j12)));
                ii.b bVar2 = koVar.g0;
                final int i54 = 0;
                org.telegram.ui.Cells.y M04 = org.telegram.ui.ActionBar.k6.M0(false);
                int i55 = org.telegram.ui.ActionBar.k6.i6;
                org.telegram.ui.ActionBar.r6.T(bVar2, M04, null, org.telegram.ui.ActionBar.r6.O(i55));
                koVar.g0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        switch (i54) {
                            case 0:
                                ko koVar3 = this.b;
                                MessagesController messagesController = koVar3.getMessagesController();
                                long j14 = j12;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    koVar3.showDialog(new hi.k0(koVar3, j14, null, null));
                                    break;
                                } else {
                                    koVar3.presentFragment(new hi.o(si.o0.e(j14, "community_id")));
                                    break;
                                }
                            default:
                                ko koVar4 = this.b;
                                koVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j12);
                                koVar4.presentFragment(new hi.f(bundle));
                                break;
                        }
                    }
                });
                rVar.addView(koVar.g0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.r8 r8Var38 = new org.telegram.ui.Cells.r8(context2);
                koVar.i0 = r8Var38;
                r8Var38.o(R.drawable.outline_community_remove_24, LocaleController.getString(z18 ? R.string.CommunityRemoveBotFromCommunity : koVar.H0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                org.telegram.ui.Cells.r8 r8Var39 = koVar.i0;
                int i56 = org.telegram.ui.ActionBar.k6.p7;
                r8Var39.g(i56, i56);
                org.telegram.ui.ActionBar.r6.T(koVar.i0, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(i55));
                koVar2 = koVar;
                koVar.i0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.zn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                        ko koVar3 = ko.this;
                        org.telegram.ui.Components.f5.v0(koVar3, string3, LocaleController.getString(z18 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : koVar3.H0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new go(koVar3, j13, j12, 0));
                    }
                });
                rVar.addView(koVar2.i0, w7.z5.n(-1, -2));
                org.telegram.ui.Cells.e9 e9Var5 = new org.telegram.ui.Cells.e9(context2, 12, koVar2.getResourceProvider());
                koVar2.j0 = e9Var5;
                e9Var5.setFixedSize(14);
                koVar2.j0.setTag(R.id.fit_width_tag, 1);
                rVar.addView(koVar2.j0, w7.z5.n(-1, 14));
            } else {
                koVar2 = koVar;
                org.telegram.ui.Cells.r8 r8Var40 = new org.telegram.ui.Cells.r8(context2);
                koVar2.f0 = r8Var40;
                r8Var40.g(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                org.telegram.ui.ActionBar.r6.Y(koVar2.f0.getTextView(), org.telegram.ui.ActionBar.k6.il);
                org.telegram.ui.ActionBar.r6.T(koVar2.f0, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
                koVar2.f0.o(R.drawable.msg_groups, LocaleController.getString(z18 ? R.string.CommunityAddBotToCommunity : koVar2.H0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                final int i57 = 1;
                koVar2.f0.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        switch (i57) {
                            case 0:
                                ko koVar3 = this.b;
                                MessagesController messagesController = koVar3.getMessagesController();
                                long j14 = j13;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    koVar3.showDialog(new hi.k0(koVar3, j14, null, null));
                                    break;
                                } else {
                                    koVar3.presentFragment(new hi.o(si.o0.e(j14, "community_id")));
                                    break;
                                }
                            default:
                                ko koVar4 = this.b;
                                koVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j13);
                                koVar4.presentFragment(new hi.f(bundle));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.e9 e9Var6 = new org.telegram.ui.Cells.e9(context2, 12, koVar2.resourceProvider);
                koVar2.h0 = e9Var6;
                e9Var6.setText(LocaleController.getString(z18 ? R.string.CommunityAddBotToCommunityInfo : koVar2.H0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                rVar.addView(koVar2.f0, w7.z5.n(-1, -2));
                rVar.addView(koVar2.h0, w7.z5.n(-1, -2));
            }
        }
        TLRPC.Chat chat6 = koVar2.w0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context2);
            koVar2.c0 = frameLayout3;
            rVar.addView(frameLayout3, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(context2);
            koVar2.d0 = caVar;
            org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
            org.telegram.ui.ActionBar.r6.T(koVar2.d0, org.telegram.ui.ActionBar.k6.M0(false), null, org.telegram.ui.ActionBar.r6.O(org.telegram.ui.ActionBar.k6.i6));
            if (koVar2.C0 != null) {
                koVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
            } else if (koVar2.H0) {
                koVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                koVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            koVar2.c0.addView(koVar2.d0, w7.z5.c(-2.0f, -1));
            koVar2.d0.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view32) {
                    switch (i53) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.x0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.P0;
                            long j102 = koVar4.B0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.x0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.x0.chat_photo.video_sizes.get(0), koVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.u1().g2(null, user22.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.x0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new nh0(koVar6.v0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.v0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new vb(koVar8.w0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(u91.d0(koVar9.w0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.B0);
                            koVar10.presentFragment(new sa(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.B0));
                            break;
                        case 9:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view32.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.C0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.s(koVar12, false, koVar12.w0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                sc0 sc0Var = new sc0(4);
                                sc0Var.e0 = -koVar13.v0;
                                TLRPC.ChatFull chatFull5 = koVar13.x0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        sc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                sc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(sc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.v0;
                            org.telegram.ui.Cells.r8 r8Var72 = koVar14.H;
                            boolean z162 = r8Var72 != null && r8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.N = new ArrayList();
                            yoVar.O = new ArrayList();
                            yoVar.Q = new ArrayList();
                            yoVar.d0 = true;
                            yoVar.g0 = new ArrayList();
                            yoVar.p0 = new HashMap();
                            yoVar.r0 = new no(yoVar, 5);
                            yoVar.u0 = false;
                            yoVar.a0 = j112;
                            yoVar.o0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.x0;
                            yoVar.Z = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.m0 = tL_chatInviteExported;
                                } else {
                                    yoVar.Y(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j122 = koVar15.v0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j122;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j122));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.x0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            bw0 bw0Var = new bw0(koVar16.v0);
                            bw0Var.w = new co(koVar16, 4);
                            koVar16.presentFragment(bw0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            d60 d60Var = new d60(-koVar17.w0.id);
                            d60Var.c = koVar17.K0;
                            d60Var.l0 = koVar17;
                            koVar17.presentFragment(d60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.H0 || koVar18.w0.gigagroup) && !ChatObject.isCommunity(koVar18.w0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.x0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            mh0 mh0Var = new mh0(koVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.x0;
                            mh0Var.h0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(mh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.w0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.v0, koVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.v0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j132 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j132;
                                TLRPC.ChatFull chatFull8 = koVar20.x0;
                                rpVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j132));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i222 = 0; i222 < tL_chatReactionsSome.reactions.size(); i222++) {
                                            if (tL_chatReactionsSome.reactions.get(i222) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i222)).emoticon);
                                            }
                                        }
                                        rpVar.w = 1;
                                    }
                                }
                                koVar20.presentFragment(rpVar);
                                break;
                            }
                        default:
                            ko koVar21 = this.b;
                            koVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", koVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.v0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            rVar.addView(new org.telegram.ui.Cells.b7(context2), w7.z5.n(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        koVar2.c = undoView;
        idVar.addView(undoView, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.qu quVar5 = koVar2.v;
        TLRPC.User user3 = koVar2.C0;
        quVar5.setText(Emoji.replaceEmoji(user3 != null ? ContactsController.formatName(user3) : koVar2.w0.title, koVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.qu quVar6 = koVar2.v;
        quVar6.setSelection(quVar6.n());
        TLRPC.ChatFull chatFull4 = koVar2.x0;
        if (chatFull4 != null) {
            koVar2.E.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = koVar2.D0;
            if (userFull4 != null) {
                koVar2.E.setText(userFull4.about);
            }
        }
        koVar2.k0();
        koVar2.p0(true, false);
        return koVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.w0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.r8 r8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
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
                f0();
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
                        r8Var = this.Q;
                        if (r8Var != null) {
                            r8Var.getCheckBox().setIcon(this.F0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.F0 = z10;
                    r8Var = this.Q;
                    if (r8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.w0) && !this.x0.hidden_prehistory) {
                    z11 = false;
                }
                this.I0 = z11;
                p0(false, false);
                if (z12) {
                    h0();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.chatSwitchedForum) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.v0 != longValue) {
                return;
            }
            this.E0 = booleanValue;
            this.G0 = booleanValue2;
            org.telegram.ui.Cells.r8 r8Var2 = this.Q;
            if (r8Var2 != null) {
                r8Var2.setChecked(booleanValue);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0) {
                k0();
            }
            if ((intValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                r0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.channelRightsUpdated) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            if (chat == null || chat.id != this.v0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.y0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.z0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.A0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var == null || h5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.v0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.x0 = chatFull4;
                if (chatFull4 != null) {
                    this.J0 = chatFull4.available_reactions;
                }
                s0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.botStarsUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == j10) {
                    m0(getMessagesController().getUserFull(j10));
                    return;
                }
                return;
            } else {
                if (i10 == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i10 == NotificationCenter.dialogDeleted && (-this.v0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.h5 h5Var2 = this.parentLayout;
                    if (h5Var2 == null || h5Var2.getLastFragment() != this) {
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
                ai.k0 g10 = ai.k0.g(this.currentAccount);
                this.m0.setVisibility(g10.a(j10) ? 0 : 8);
                this.m0.w(ai.nd.Y0(false, TextUtils.concat("XTR", ai.nd.K0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.r8 r8Var3 = this.k0;
                if (r8Var3 != null) {
                    r8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.S.setVisibility((this.m0.getVisibility() == 0 || this.l0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.l0 != null) {
                ai.k0 g11 = ai.k0.g(this.currentAccount);
                this.l0.setVisibility(g11.b(j10) ? 0 : 8);
                long i14 = g11.i(j10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i14 > 0) {
                    double d = i14 / 1.0E9d;
                    if (d > 1000.0d) {
                        spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
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
                org.telegram.ui.Cells.r8 r8Var4 = this.k0;
                if (r8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z11 = false;
                    }
                    r8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.S;
                if (this.m0.getVisibility() != 0 && this.l0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.qu quVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.B0 != 0) {
            TLRPC.UserFull userFull = this.D0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.qu quVar2 = this.v;
            if ((quVar2 == null || this.C0.first_name.equals(quVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new co(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new co(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.x0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.w0) || this.x0.hidden_prehistory == this.I0) && (((quVar = this.v) == null || this.w0.title.equals(quVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.E0 == this.w0.forum))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.H0) {
                    alertDialog$Builder2.a.T = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder2.a.T = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new co(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new co(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    public final void f0() {
        if (this.e0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.v0);
        TLRPC.ChatFull chatFull = this.x0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.e0.u(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ mu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        jo joVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(joVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0, 4, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b0, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.V, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Cells.r8 r8Var = this.U;
        if (r8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.N, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.v, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.l6));
        LinearLayout linearLayout = this.y;
        int i11 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.t6(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d0, 4, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.Cells.r8 r8Var2 = this.K;
        if (r8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        org.telegram.ui.Cells.r8 r8Var3 = this.a0;
        if (r8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(r8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bo(this, 0));
    }

    public final void i0() {
        this.s.n(this.u0 != null, new eo(this, 0), new v5(this, 5), 0);
        this.Q0.M(0);
        this.Q0.P(43);
        this.b0.e.d();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.qu quVar;
        String str;
        String str2;
        if (this.M0 || (quVar = this.v) == null) {
            return;
        }
        if (quVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.M0 = true;
        int i10 = 3;
        String str3 = "";
        if (this.C0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.C0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.C0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
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
            this.b = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new ai.e0(this, getConnectionsManager().sendRequest(setbotinfo, new vc(7, this, setbotinfo)), i10));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.w0) && (!this.I0 || this.E0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.v0, this, new co(this, 5));
            return;
        }
        if (this.x0 != null && ChatObject.isChannel(this.w0)) {
            TLRPC.ChatFull chatFull = this.x0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.I0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().toggleChannelInvitesHistory(this.v0, this.I0);
            }
        }
        if (this.s.g()) {
            this.L0 = true;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.b = c2Var;
            c2Var.setOnCancelListener(new gg(this, r0));
            this.b.show();
            return;
        }
        if (!this.w0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.v0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.x0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.v0, this.E.getText().toString(), this.x0);
        }
        boolean z12 = this.E0;
        TLRPC.Chat chat = this.w0;
        if (z12 != chat.forum || this.G0 != chat.forum_tabs) {
            r0 = this.G0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.v0, this.E0, this.G0);
            if (this.E0 && !this.G0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i11 = 0; i11 < fragmentStack.size(); i11++) {
                    if ((fragmentStack.get(i11) instanceof sn) && ((sn) fragmentStack.get(i11)).getArguments().getLong("chat_id") == this.v0) {
                        ((ActionBarLayout) getParentLayout()).Z(i11);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        org.telegram.ui.ActionBar.h5 parentLayout = getParentLayout();
                        HashSet hashSet = ye1.q1;
                        ((ActionBarLayout) parentLayout).c(i11, ye1.D0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (r0 != 0) {
                q0();
            }
        }
        finishFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        boolean z10;
        if (this.e == null || this.N0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.v0));
        long j10 = this.B0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.C0 = user;
        this.w0 = chat;
        org.telegram.ui.Components.h9 h9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(h9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.u0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, h9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.g()) {
                        this.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.Q0 == null) {
                        this.Q0 = new org.telegram.ui.Components.yj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.b0.e.setAnimation(this.Q0);
                }
                if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
                    PhotoViewer.u1().z0();
                }
                if (this.Z == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.w0)) {
                    this.Z.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.b0 != null) {
        }
        if (PhotoViewer.E1()) {
            PhotoViewer.u1().z0();
        }
        if (this.Z == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.r5 n10;
        this.x0 = chatFull;
        if (chatFull != null) {
            if (this.w0 == null) {
                this.w0 = getMessagesController().getChat(Long.valueOf(this.v0));
            }
            this.I0 = !ChatObject.isChannel(this.w0) || this.x0.hidden_prehistory;
            this.J0 = this.x0.available_reactions;
            ArrayList arrayList = this.O0;
            arrayList.clear();
            TLRPC.Chat chat = this.w0;
            TLRPC.ChatFull chatFull2 = this.x0;
            ArrayList arrayList2 = new ArrayList();
            if (chatFull2 != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                n10 = org.telegram.ui.Components.r5.m(UserConfig.selectedAccount, org.telegram.ui.Components.r5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.r5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.r5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.r5 m10 = org.telegram.ui.Components.r5.m(UserConfig.selectedAccount, org.telegram.ui.Components.r5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.Z != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.w0)) {
                this.Z.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j10 = this.B0;
                this.C0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.r8 r8Var = this.n0;
            if (r8Var != null) {
                r8Var.h(45, this.D0 == null, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    this.n0.w(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.r8 r8Var2 = this.t0;
            if (r8Var2 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                r8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.e9 e9Var = this.s0;
            if (e9Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                e9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        int i10 = 0;
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<ei.g6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<ei.g6, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new ho(i10, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        gp0 gp0Var;
        int w02;
        ArrayList<Integer> arrayList;
        qo0 qo0Var = this.L;
        if (qo0Var != null) {
            TLRPC.Chat chat = this.w0;
            org.telegram.ui.Cells.r8 r8Var3 = this.N;
            boolean z10 = (r8Var3 != null && r8Var3.getVisibility() == 0) || ((r8Var = this.Q) != null && r8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.w0) && ChatObject.hasAdminRights(this.w0)) || ((r8Var2 = this.M) != null && r8Var2.getVisibility() == 0));
            Paint paint = qo0Var.n;
            int i10 = qo0Var.a;
            org.telegram.ui.ActionBar.g6 g6Var = qo0Var.d;
            if (chat == null) {
                return;
            }
            qo0Var.v = z10;
            qo0Var.r = new org.telegram.ui.Components.i11(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            gp0 gp0Var2 = qo0Var.w;
            if (gp0Var2 != null) {
                gp0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = gp0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                qo0Var.w = new gp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    gp0Var = gp0.c(i10, ChatObject.getProfileColorId(chat));
                    gp0Var.a = AndroidUtilities.dp(11.0f);
                    gp0Var.d();
                } else {
                    gp0Var = null;
                }
                qo0Var.w = gp0Var;
            }
            gp0 gp0Var3 = qo0Var.w;
            if (gp0Var3 != null) {
                gp0Var3.e(qo0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                qo0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, i13));
                gp0 gp0Var4 = new gp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                gp0Var4.a = AndroidUtilities.dp(11.0f);
                gp0Var4.d();
                qo0Var.x = gp0Var4;
                gp0Var4.e(qo0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.k6.r8[colorId];
                qo0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.k6.w0(i14, g6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    qo0Var.s = -1;
                    w02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.k6.r8[0];
                    qo0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.k6.w0(i15, g6Var);
                }
            }
            qo0Var.r.o(w02);
            paint.setColor(org.telegram.ui.ActionBar.k6.o1(0.1f, w02));
            gp0 a10 = gp0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            qo0Var.x = a10;
            a10.e(qo0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar == null || !quVar.e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        quVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0113, code lost:
    
        if (java.lang.Math.max(r1 == null ? 0 : r1.participants_count, r0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011d, code lost:
    
        if (r0.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.v0;
        long j11 = this.B0;
        boolean z10 = true;
        if (j10 == 0) {
            TLRPC.User user = j11 == 0 ? null : getMessagesController().getUser(Long.valueOf(j11));
            this.C0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j11);
                this.C0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.C0, true);
                    if (this.D0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.D0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.w0;
            org.telegram.ui.Components.h9 h9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.e50 e50Var = this.s;
            e50Var.a = this;
            e50Var.b = this;
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            if (this.x0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.v0));
        this.w0 = chat2;
        if (chat2 == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.v0);
            this.w0 = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.w0, true);
                if (this.x0 == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.v0, ChatObject.isChannel(this.w0), new CountDownLatch(1), false, false);
                    this.x0 = loadChatInfo;
                }
            }
            return false;
        }
        chat = this.w0;
        org.telegram.ui.Components.h9 h9Var2 = this.r;
        if (chat == null) {
            this.y0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.z0 = TLRPC.TL_chatBannedRights.clone(this.w0.banned_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.w0.default_banned_rights);
            h9Var2.n(5L, this.w0.title, null);
            this.H0 = ChatObject.isChannel(this.w0) && !this.w0.megagroup;
            TLRPC.Chat chat3 = this.w0;
            boolean z11 = chat3.forum;
            this.E0 = z11;
            this.G0 = chat3.forum_tabs;
            if (j11 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.x0;
                }
                TLRPC.ChatFull chatFull2 = this.x0;
                if (chatFull2 != null) {
                }
                this.F0 = z10;
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
                getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
            }
            z10 = false;
            this.F0 = z10;
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            h9Var2.n(5L, this.C0.first_name, null);
            this.H0 = false;
            this.E0 = false;
            this.G0 = false;
            this.F0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.C0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.e50 e50Var2 = this.s;
        e50Var2.a = this;
        e50Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.x0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null) {
            e50Var.d();
        }
        if (this.w0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.C0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar != null) {
            quVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        ai.r rVar = this.w;
        if (rVar != null) {
            rVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.O0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.r5) obj).p(null);
        }
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar != null) {
            quVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar != null) {
            quVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.k6.G6, null);
            }
            ci.j4 j4Var = this.e;
            if (j4Var != null) {
                j4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        TLRPC.ChatFull chatFull;
        int i14;
        String str2;
        String string;
        org.telegram.ui.Cells.r8 r8Var;
        org.telegram.ui.Cells.r8 r8Var2;
        org.telegram.ui.Cells.r8 r8Var3;
        org.telegram.ui.Cells.r8 r8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.r8 r8Var5;
        org.telegram.ui.Cells.r8 r8Var6;
        org.telegram.ui.Cells.r8 r8Var7;
        org.telegram.ui.Cells.r8 r8Var8;
        org.telegram.ui.Cells.r8 r8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.v0))) != null) {
            this.w0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.w0);
        org.telegram.ui.Cells.e9 e9Var = this.P;
        if (e9Var != null) {
            e9Var.setVisibility((this.I != null || ((r8Var7 = this.J) != null && r8Var7.getVisibility() == 0) || (((r8Var8 = this.N) != null && r8Var8.getVisibility() == 0) || ((r8Var9 = this.H) != null && r8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.r8 r8Var10 = this.Y;
        if (r8Var10 != null) {
            r8Var10.setVisibility(ChatObject.isChannel(this.w0) ? 0 : 8);
        }
        org.telegram.ui.Cells.r8 r8Var11 = this.J;
        if (r8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.x0;
            if (chatFull2 == null || (!this.H0 && chatFull2.linked_chat_id == 0)) {
                r8Var11.setVisibility(8);
            } else {
                r8Var11.setVisibility(0);
                if (this.x0.linked_chat_id == 0) {
                    this.J.u(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.x0.linked_chat_id));
                    if (chat2 == null) {
                        this.J.setVisibility(8);
                    } else if (this.H0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.J.u(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.u(LocaleController.getString("Discussion", R.string.Discussion), si.o0.h("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.r8 r8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var13 = this.Q;
                            r8Var12.u(string2, str4, false, i16, r8Var13 != null && r8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.r8 r8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String h = si.o0.h("@", publicUsername2);
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.r8 r8Var15 = this.Q;
                            r8Var14.u(string3, h, false, i17, r8Var15 != null && r8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.r8 r8Var16 = this.H;
        if (r8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.x0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                r8Var16.setVisibility(8);
            } else {
                r8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.x0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.q(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.q(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.x0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.w0.noforwards;
                if (this.H0) {
                    if (isPublic) {
                        i15 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z13) {
                        i15 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i15 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i15);
                } else {
                    if (isPublic) {
                        i14 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z13) {
                        i14 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i14);
                }
                String str5 = string;
                if (this.H0) {
                    org.telegram.ui.Cells.r8 r8Var17 = this.I;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i18 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.r8 r8Var18 = this.N;
                    r8Var17.u(string4, str5, false, i18, (r8Var18 != null && r8Var18.getVisibility() == 0) || ((r8Var3 = this.J) != null && r8Var3.getVisibility() == 0) || ((r8Var4 = this.Q) != null && r8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.r8 r8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i19 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var20 = this.N;
                    r8Var19.u(string5, str5, false, i19, (r8Var20 != null && r8Var20.getVisibility() == 0) || ((r8Var = this.J) != null && r8Var.getVisibility() == 0) || ((r8Var2 = this.Q) != null && r8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.w0));
                org.telegram.ui.Cells.r8 r8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i20 = R.drawable.msg_channel;
                org.telegram.ui.Cells.r8 r8Var22 = this.N;
                r8Var21.u(string7, string6, false, i20, (r8Var22 != null && r8Var22.getVisibility() == 0) || ((r8Var5 = this.J) != null && r8Var5.getVisibility() == 0) || ((r8Var6 = this.Q) != null && r8Var6.getVisibility() == 0));
            }
        }
        if (this.N != null) {
            if (!this.I0 || this.E0) {
                i13 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i13 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.N.u(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i13), z11, R.drawable.msg_discuss, this.Q != null);
            this.N.setEnabled(!this.E0);
            boolean z14 = (this.E0 || isPublic || ((chatFull = this.x0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.R0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.N.getAlpha() <= 0.0f && !z14) {
                this.N.setVisibility(8);
                o0();
            } else if (this.N.getVisibility() != 0 || this.N.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                int i21 = 0;
                boolean z15 = false;
                while (i21 < this.F.getChildCount()) {
                    if (!z15 && this.F.getChildAt(i21) == this.N) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.F.getChildAt(i21));
                    }
                    i21++;
                    z15 = z15;
                }
                int i22 = 0;
                boolean z16 = false;
                while (i22 < this.w.getChildCount()) {
                    if (!z16 && this.w.getChildAt(i22) == this.F) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.w.getChildAt(i22));
                    }
                    i22++;
                    z16 = z16;
                }
                if (this.N.getVisibility() != 0) {
                    this.N.setAlpha(0.0f);
                    this.N.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.N.setVisibility(0);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    ((View) arrayList.get(i23)).setTranslationY((1.0f - this.N.getAlpha()) * (-this.N.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.R0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.l0(12, this, arrayList));
                    this.R0.addListener(new ah.q0(this, z14, arrayList, 5));
                    this.R0.setDuration(320L);
                    this.R0.setInterpolator(org.telegram.ui.Components.bs.h);
                    this.R0.start();
                } else {
                    this.N.setAlpha(z14 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z14 ? 0 : 8);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY(0.0f);
                    }
                    this.R0 = null;
                }
            }
        }
        if (this.T != null) {
            if (this.x0 != null) {
                org.telegram.ui.Cells.r8 r8Var23 = this.U;
                if (r8Var23 != null) {
                    if (r8Var23.getParent() == null) {
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.z5.n(-1, -2));
                    }
                    this.U.setVisibility(this.x0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.H0 || ChatObject.isCommunity(this.w0)) {
                    if (ChatObject.isChannel(this.w0)) {
                        this.T.u(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.x0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.T.u(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.x0.participants.participants.size())), false, R.drawable.msg_groups, this.U.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.w0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i25 = this.E0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.w0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i10 = jr.n0(tL_chatBannedRights) + i26;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.w0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.E0 && !tL_chatBannedRights2.manage_topics) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i10++;
                            }
                            i11 = i25;
                        } else {
                            i10 = i25;
                            i11 = i10;
                        }
                        z12 = z11;
                        this.X.u(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.r8 r8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.x0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i27 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.r8 r8Var25 = this.Y;
                        r8Var24.u(string8, format, false, i27, r8Var25 != null && r8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.r8 r8Var26 = this.U;
                    if (r8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.x0.requests_pending));
                        int i28 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.r8 r8Var27 = this.Y;
                        r8Var26.u(string9, format2, false, i28, r8Var27 != null && r8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.u(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.x0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.r8 r8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.x0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i29 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.r8 r8Var29 = this.Y;
                    r8Var28.u(string10, format3, false, i29, r8Var29 != null && r8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.r8 r8Var30 = this.W;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.w0)) {
                    i12 = this.x0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.x0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i30 = 0;
                        for (int i31 = 0; i31 < size; i31++) {
                            TLRPC.ChatParticipant chatParticipant = this.x0.participants.participants.get(i31);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i30++;
                            }
                        }
                        i12 = i30;
                    }
                }
                r8Var30.u(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.H0 || ChatObject.isCommunity(this.w0)) {
                    org.telegram.ui.Cells.r8 r8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i32 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.r8 r8Var32 = this.Y;
                    r8Var31.o(i32, string12, r8Var32 != null && r8Var32.getVisibility() == 0);
                    if (this.w0.gigagroup) {
                        org.telegram.ui.Cells.r8 r8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i33 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.r8 r8Var34 = this.Y;
                        r8Var33.o(i33, string13, r8Var34 != null && r8Var34.getVisibility() == 0);
                    } else {
                        this.X.o(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.o(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.r8 r8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i34 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.r8 r8Var36 = this.Y;
                    r8Var35.o(i34, string14, r8Var36 != null && r8Var36.getVisibility() == 0);
                }
                this.W.o(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.O.setVisibility(ChatObject.canChangeChatInfo(this.w0) ? 0 : 8);
            s0(z12);
            if (this.x0 == null || !ChatObject.canUserDoAdminAction(this.w0, 3) || (isPublic && this.w0.creator)) {
                this.V.setVisibility(8);
            } else if (this.x0.invitesCount > 0) {
                this.V.u(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.x0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.V.u(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.K != null) {
            t0(null);
        }
    }

    public final void q0() {
        ey eyVar;
        yw ywVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof sn) {
                sn snVar = (sn) fragmentStack.get(i10);
                if (snVar.getArguments().getLong("chat_id") == this.v0) {
                    ((ActionBarLayout) getParentLayout()).b0(snVar, false);
                    snVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, snVar);
                    if (!this.G0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new ye1(bundle));
                        i10++;
                    }
                }
            } else if (this.G0 && (fragmentStack.get(i10) instanceof ye1)) {
                ye1 ye1Var = (ye1) fragmentStack.get(i10);
                if (ye1Var.g() != null && ye1Var.g().id == this.v0) {
                    ((ActionBarLayout) getParentLayout()).b0(ye1Var, false);
                    i10--;
                }
            } else if (this.G0 && (fragmentStack.get(i10) instanceof ey) && (eyVar = (ey) fragmentStack.get(i10)) != null && (ywVar = eyVar.G3) != null && ywVar.c()) {
                eyVar.G3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.k0 == null) {
            return;
        }
        if (this.C0.usernames.size() <= 1) {
            this.k0.u(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.C0.username, false, R.drawable.msg_link2, true);
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
        this.k0.u(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.C0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null) {
            e50Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10) {
        String str;
        String str2;
        int i10;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.v0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.w0);
        TLRPC.ChatReactions chatReactions = this.J0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string;
                this.O.u(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i11 = 0;
            for (0; i10 < tL_chatReactionsSome.reactions.size(); i10 + 1) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i10);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
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
            if (isChannelAndNotMegaGroup) {
                if (chatFull != null && chatFull.paid_reactions_available) {
                    i11++;
                }
                str2 = i11 == 0 ? LocaleController.getString(R.string.ReactionsOff) : String.valueOf(i11);
            } else {
                int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i11);
                str2 = min == 0 ? LocaleController.getString(R.string.ReactionsOff) : LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
            }
        } else {
            str2 = LocaleController.getString(R.string.ReactionsAll);
        }
        str = str2;
        this.O.u(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null && (str = e50Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar != null) {
            String obj = quVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l4) {
        TLRPC.Chat chat = this.w0;
        if (chat == null || this.K == null) {
            return;
        }
        long j10 = 0;
        if (!(l4 != null ? l4.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.K.u(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.w0.linked_monoforum_id));
        if (l4 != null) {
            j10 = l4.longValue();
        } else if (chat2 != null) {
            j10 = chat2.send_paid_messages_stars;
        }
        this.K.u(LocaleController.getString(R.string.PostSuggestions), ai.nd.Y0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
