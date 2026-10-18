package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
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
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public class ko extends org.telegram.ui.ActionBar.n2 implements org.telegram.ui.Components.d50, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public TLRPC.TL_chatBannedRights B0;
    public final long C0;
    public TLRPC.User D0;
    public EditTextBoldCursor E;
    public TLRPC.UserFull E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.z6 G;
    public boolean G0;
    public org.telegram.ui.Cells.q8 H;
    public boolean H0;
    public org.telegram.ui.Cells.q8 I;
    public boolean I0;
    public org.telegram.ui.Cells.q8 J;
    public boolean J0;
    public org.telegram.ui.Cells.q8 K;
    public TLRPC.ChatReactions K0;
    public po0 L;
    public TL_stories.TL_premium_boostsStatus L0;
    public org.telegram.ui.Cells.q8 M;
    public boolean M0;
    public org.telegram.ui.Cells.q8 N;
    public boolean N0;
    public org.telegram.ui.Cells.q8 O;
    public boolean O0;
    public org.telegram.ui.Cells.d9 P;
    public final ArrayList P0;
    public org.telegram.ui.Cells.q8 Q;
    public final io Q0;
    public LinearLayout R;
    public org.telegram.ui.Components.uj0 R0;
    public LinearLayout S;
    public ValueAnimator S0;
    public org.telegram.ui.Cells.q8 T;
    public org.telegram.ui.Cells.q8 U;
    public org.telegram.ui.Cells.q8 V;
    public org.telegram.ui.Cells.q8 W;
    public org.telegram.ui.Cells.q8 X;
    public org.telegram.ui.Cells.q8 Y;
    public org.telegram.ui.Cells.q8 Z;
    public org.telegram.ui.ActionBar.u0 a;
    public org.telegram.ui.Cells.q8 a0;
    public org.telegram.ui.ActionBar.b2 b;
    public jo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ba d0;
    public ci.k4 e;
    public org.telegram.ui.Cells.z6 e0;
    public ei.g6 f;
    public org.telegram.ui.Cells.q8 f0;
    public org.telegram.ui.Cells.q8 g0;
    public AnimatorSet h;
    public ii.a h0;
    public org.telegram.ui.Cells.d9 i0;
    public org.telegram.ui.Cells.q8 j0;
    public org.telegram.ui.Cells.d9 k0;
    public org.telegram.ui.Cells.q8 l0;
    public org.telegram.ui.Cells.q8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.q8 n0;
    public org.telegram.ui.Cells.q8 o0;
    public org.telegram.ui.Cells.q8 p0;
    public org.telegram.ui.Cells.q8 q0;
    public final org.telegram.ui.Components.h9 r;
    public org.telegram.ui.Cells.q8 r0;
    public final org.telegram.ui.Components.e50 s;
    public org.telegram.ui.Cells.d9 s0;
    public org.telegram.ui.Cells.d9 t0;
    public org.telegram.ui.Cells.q8 u0;
    public org.telegram.ui.Components.qu v;
    public TLRPC.FileLocation v0;
    public ai.r w;
    public long w0;
    public org.telegram.ui.Components.wo0 x;
    public TLRPC.Chat x0;
    public LinearLayout y;
    public TLRPC.ChatFull y0;
    public TLRPC.TL_chatAdminRights z0;

    public ko(Bundle bundle) {
        super(bundle);
        this.P0 = new ArrayList();
        this.Q0 = new io(this);
        this.r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.w0 = bundle.getLong("chat_id", 0L);
        this.C0 = bundle.getLong("user_id", 0L);
        if (this.w0 == 0) {
            this.s = new org.telegram.ui.Components.e50(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
            this.s = new org.telegram.ui.Components.e50((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(ko koVar, FrameLayout frameLayout, View view) {
        if (!koVar.G0) {
            TLRPC.ChatFull chatFull = koVar.y0;
            org.telegram.ui.Components.xc.a0(koVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", koVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -koVar.w0;
        wy wyVar = new wy(null);
        wyVar.a = j10;
        wyVar.setResourceProvider(koVar.resourceProvider);
        boolean z10 = koVar.F0;
        boolean z11 = koVar.H0;
        ai.q5 q5Var = new ai.q5(12, koVar, view);
        wyVar.c = z10;
        wyVar.d = z11;
        wyVar.f = q5Var;
        koVar.presentFragment(wyVar);
    }

    public static /* synthetic */ void V(ko koVar) {
        koVar.v0 = null;
        long j10 = koVar.C0;
        if (j10 == 0) {
            MessagesController.getInstance(koVar.currentAccount).changeChatAvatar(koVar.w0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new bo(koVar, 2));
        }
        koVar.n0(false, true);
        ci.k4 k4Var = koVar.e;
        org.telegram.ui.Components.h9 h9Var = koVar.r;
        Object obj = koVar.D0;
        if (obj == null) {
            obj = koVar.x0;
        }
        k4Var.h(null, null, h9Var, obj);
        koVar.R0.M(0);
        koVar.b0.e.d();
    }

    public static void X(ko koVar) {
        int i10 = koVar.currentAccount;
        long j10 = koVar.C0;
        TL_bots.BotVerifierSettings botVerifierSettings = koVar.E0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle d = org.telegram.messenger.kk.d(16, "onlySelect", "dialogsType", true);
        d.putBoolean("resetDelegate", false);
        ey eyVar = new ey(d);
        eyVar.setCurrentAccount(i10);
        eyVar.C2 = new gi.q1(eyVar, i10, j10, botVerifierSettings);
        U.presentFragment(eyVar);
    }

    public static void Y(ko koVar, org.telegram.ui.ActionBar.b2 b2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        b2Var.dismiss();
        if (koVar.getParentActivity() == null) {
            return;
        }
        sg.j0 j0Var = new sg.j0(35, koVar.currentAccount, koVar.getParentActivity(), koVar, koVar.getResourceProvider());
        j0Var.H1(canApplyBoost);
        j0Var.G1(tL_premium_boostsStatus, true);
        j0Var.I1(j10);
        TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new gh(11, koVar, chat);
        }
        koVar.showDialog(j0Var);
    }

    public static void Z(ko koVar) {
        dd ddVar = new dd(-koVar.x0.id);
        ddVar.l0 = koVar;
        koVar.presentFragment(ddVar);
        MessagesController.getInstance(koVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(koVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(ko koVar) {
        koVar.O0 = true;
        NotificationCenter.getInstance(koVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00(10);
        n00Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        n00Var.f = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lj, false);
        spannableStringBuilder.setSpan(n00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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
    public final void F(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void J(boolean z10, boolean z11) {
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

    /* JADX WARN: Removed duplicated region for block: B:142:0x0786  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0ef8  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0f04  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0f66  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0f92  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07f7  */
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        int i10;
        Context context2;
        CharSequence charSequence;
        Integer num;
        final ko koVar;
        int i11;
        CharSequence charSequence2;
        Integer num2;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i12;
        TLRPC.User user;
        final ko koVar2;
        float f7;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        int i13;
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.q8 q8Var2;
        org.telegram.ui.Cells.q8 q8Var3;
        org.telegram.ui.Cells.q8 q8Var4;
        org.telegram.ui.Cells.q8 q8Var5;
        org.telegram.ui.Cells.q8 q8Var6;
        TLRPC.ChatFull chatFull2;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i14 = 1;
        org.telegram.ui.Components.qu quVar = this.v;
        if (quVar != null) {
            quVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 3));
        kd kdVar = new kd(i14, context, this);
        kdVar.setOnTouchListener(new di.d(9));
        this.fragmentView = kdVar;
        kdVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7));
        ai.r rVar = new ai.r(context);
        this.w = rVar;
        final int i15 = 0;
        org.telegram.ui.Components.wo0 wo0Var = new org.telegram.ui.Components.wo0(context, this.w, this.resourceProvider, false);
        this.x = wo0Var;
        wo0Var.setFillViewport(true);
        kdVar.addView(this.x, w7.z5.d(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(rVar, new FrameLayout.LayoutParams(-1, -2));
        rVar.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6));
        rVar.addView(this.d, w7.z5.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, w7.z5.n(-1, -2));
        ci.k4 k4Var = new ci.k4(this, context, 6);
        this.e = k4Var;
        k4Var.setRoundRadius(this.F0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i16 = 5;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            ci.k4 k4Var2 = this.e;
            boolean z10 = LocaleController.isRTL;
            frameLayout2.addView(k4Var2, w7.z5.a(64.0f, z10 ? 0.0f : 16.0f, 12.0f, z10 ? 16.0f : 0.0f, 8.0f, 64, (z10 ? 5 : 3) | 48));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            ei.g6 g6Var = new ei.g6(this, context, paint, i16);
            this.f = g6Var;
            boolean z11 = LocaleController.isRTL;
            frameLayout2.addView(g6Var, w7.z5.a(64.0f, z11 ? 0.0f : 16.0f, 12.0f, z11 ? 16.0f : 0.0f, 8.0f, 64, (z11 ? 5 : 3) | 48));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, w7.z5.a(64.0f, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f, 64, (z12 ? 5 : 3) | 48));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j10 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat3 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i17 = chatPhoto2.dc_id;
                                        if (i17 != 0) {
                                            chatPhoto2.photo_big.dc_id = i17;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat3.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i18 = userProfilePhoto2.dc_id;
                                        if (i18 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i18;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j11 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var7 = koVar14.H;
                            boolean z13 = q8Var7 != null && q8Var7.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j11;
                            yoVar.n0 = z13;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z14 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat4 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !kpVar.f.megagroup) {
                                z14 = true;
                            }
                            kpVar.s = z14;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                            if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
        } else {
            ci.k4 k4Var3 = this.e;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(k4Var3, w7.z5.a(64.0f, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 12.0f, 64, (z13 ? 5 : 3) | 48));
        }
        org.telegram.ui.Components.qu quVar2 = new org.telegram.ui.Components.qu(context, kdVar, this);
        this.v = quVar2;
        long j10 = this.C0;
        if (j10 != 0) {
            quVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.I0) {
            quVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            quVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.qu quVar3 = this.v;
        TLRPC.Chat chat3 = this.x0;
        quVar3.setEnabled(chat3 != null || ChatObject.canChangeChatInfo(chat3));
        org.telegram.ui.Components.qu quVar4 = this.v;
        quVar4.setFocusable(quVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new o0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.qu quVar5 = this.v;
        boolean z14 = LocaleController.isRTL;
        frameLayout2.addView(quVar5, w7.z5.a(-2.0f, z14 ? 5.0f : 96.0f, 0.0f, z14 ? 96.0f : 5.0f, 0.0f, -1, 16));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        rVar.addView(this.y, w7.z5.n(-1, -2));
        final int i17 = 12;
        if (this.D0 != null || ChatObject.canChangeChatInfo(this.x0)) {
            jo joVar = new jo(context);
            this.b0 = joVar;
            joVar.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            this.b0.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i18 = userProfilePhoto2.dc_id;
                                        if (i18 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i18;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j11 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var7 = koVar14.H;
                            boolean z132 = q8Var7 != null && q8Var7.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j11;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat4 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i19 = 0; i19 < tL_chatReactionsSome.reactions.size(); i19++) {
                                            if (tL_chatReactionsSome.reactions.get(i19) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i19)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
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
        this.E.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i18));
        this.E.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(LocaleController.isRTL ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.D0 != null || ChatObject.canChangeChatInfo(this.x0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.E.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.E.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i18));
        this.E.setCursorSize(AndroidUtilities.dp(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.y.addView(this.E, w7.z5.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, w7.z5.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new ma(this, 2));
        this.E.addTextChangedListener(new nd(1));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context);
        this.G = z6Var;
        rVar.addView(z6Var, w7.z5.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.F = linearLayout3;
        linearLayout3.setOrientation(1);
        rVar.addView(this.F, w7.z5.n(-1, -2));
        TLRPC.Chat chat4 = this.x0;
        if (chat4 != null) {
            final int i19 = 15;
            if (chat4.megagroup && ((chatFull4 = this.y0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.q8 q8Var7 = new org.telegram.ui.Cells.q8(context);
                this.H = q8Var7;
                q8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                this.F.addView(this.H, w7.z5.n(-1, -2));
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.y0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.Q0;
                                long j102 = koVar4.C0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = koVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.y0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new lh0(koVar6.w0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new xb(koVar8.x0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.C0);
                                koVar10.presentFragment(new ua(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.C0));
                                break;
                            case 9:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -koVar13.w0;
                                    TLRPC.ChatFull chatFull6 = koVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.w0;
                                org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.M = new ArrayList();
                                yoVar.N = new ArrayList();
                                yoVar.P = new ArrayList();
                                yoVar.c0 = true;
                                yoVar.f0 = new ArrayList();
                                yoVar.o0 = new HashMap();
                                yoVar.q0 = new no(yoVar, 5);
                                yoVar.t0 = false;
                                yoVar.Z = j11;
                                yoVar.n0 = z132;
                                TLRPC.ChatFull chatFull7 = koVar14.y0;
                                yoVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.l0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.w0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z142 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                    z142 = true;
                                }
                                kpVar.s = z142;
                                kpVar.h = koVar15.y0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                zv0 zv0Var = new zv0(koVar16.w0);
                                zv0Var.v = new co(koVar16, 4);
                                koVar16.presentFragment(zv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                b60 b60Var = new b60(-koVar17.x0.id);
                                b60Var.c = koVar17.L0;
                                b60Var.l0 = koVar17;
                                koVar17.presentFragment(b60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.y0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = koVar19.y0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                koVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.w0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = koVar20.y0;
                                    rpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                bundle6.putLong("chat_id", koVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            final int i20 = 16;
            if (this.x0.creator && ((chatFull3 = this.y0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.q8 q8Var8 = new org.telegram.ui.Cells.q8(context);
                this.I = q8Var8;
                q8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                this.F.addView(this.I, w7.z5.n(-1, -2));
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.y0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.Q0;
                                long j102 = koVar4.C0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = koVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.y0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new lh0(koVar6.w0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new xb(koVar8.x0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.C0);
                                koVar10.presentFragment(new ua(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.C0));
                                break;
                            case 9:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -koVar13.w0;
                                    TLRPC.ChatFull chatFull6 = koVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.w0;
                                org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.M = new ArrayList();
                                yoVar.N = new ArrayList();
                                yoVar.P = new ArrayList();
                                yoVar.c0 = true;
                                yoVar.f0 = new ArrayList();
                                yoVar.o0 = new HashMap();
                                yoVar.q0 = new no(yoVar, 5);
                                yoVar.t0 = false;
                                yoVar.Z = j11;
                                yoVar.n0 = z132;
                                TLRPC.ChatFull chatFull7 = koVar14.y0;
                                yoVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.l0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.w0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z142 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                    z142 = true;
                                }
                                kpVar.s = z142;
                                kpVar.h = koVar15.y0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                zv0 zv0Var = new zv0(koVar16.w0);
                                zv0Var.v = new co(koVar16, 4);
                                koVar16.presentFragment(zv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                b60 b60Var = new b60(-koVar17.x0.id);
                                b60Var.c = koVar17.L0;
                                b60Var.l0 = koVar17;
                                koVar17.presentFragment(b60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.y0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = koVar19.y0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                koVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.w0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = koVar20.y0;
                                    rpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                bundle6.putLong("chat_id", koVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.x0) && ((this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) || (!this.I0 && ChatObject.canUserDoAdminAction(this.x0, 0)))) {
                org.telegram.ui.Cells.q8 q8Var9 = new org.telegram.ui.Cells.q8(context);
                this.J = q8Var9;
                q8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                this.F.addView(this.J, w7.z5.n(-1, -2));
                final int i21 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.y0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.Q0;
                                long j102 = koVar4.C0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = koVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.y0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new lh0(koVar6.w0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new xb(koVar8.x0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.C0);
                                koVar10.presentFragment(new ua(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.C0));
                                break;
                            case 9:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -koVar13.w0;
                                    TLRPC.ChatFull chatFull6 = koVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.w0;
                                org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.M = new ArrayList();
                                yoVar.N = new ArrayList();
                                yoVar.P = new ArrayList();
                                yoVar.c0 = true;
                                yoVar.f0 = new ArrayList();
                                yoVar.o0 = new HashMap();
                                yoVar.q0 = new no(yoVar, 5);
                                yoVar.t0 = false;
                                yoVar.Z = j11;
                                yoVar.n0 = z132;
                                TLRPC.ChatFull chatFull7 = koVar14.y0;
                                yoVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.l0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.w0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z142 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                    z142 = true;
                                }
                                kpVar.s = z142;
                                kpVar.h = koVar15.y0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                zv0 zv0Var = new zv0(koVar16.w0);
                                zv0Var.v = new co(koVar16, 4);
                                koVar16.presentFragment(zv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                b60 b60Var = new b60(-koVar17.x0.id);
                                b60Var.c = koVar17.L0;
                                b60Var.l0 = koVar17;
                                koVar17.presentFragment(b60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.y0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = koVar19.y0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                koVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.w0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = koVar20.y0;
                                    rpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                bundle6.putLong("chat_id", koVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && this.I0 && ChatObject.canUserDoAdminAction(this.x0, 1)) {
                org.telegram.ui.Cells.q8 q8Var10 = new org.telegram.ui.Cells.q8(context);
                this.K = q8Var10;
                q8Var10.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
                this.K.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.F.addView(this.K, w7.z5.n(-1, -2));
                final int i22 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.y0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.Q0;
                                long j102 = koVar4.C0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = koVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.y0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new lh0(koVar6.w0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new xb(koVar8.x0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.C0);
                                koVar10.presentFragment(new ua(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.C0));
                                break;
                            case 9:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -koVar13.w0;
                                    TLRPC.ChatFull chatFull6 = koVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.w0;
                                org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.M = new ArrayList();
                                yoVar.N = new ArrayList();
                                yoVar.P = new ArrayList();
                                yoVar.c0 = true;
                                yoVar.f0 = new ArrayList();
                                yoVar.o0 = new HashMap();
                                yoVar.q0 = new no(yoVar, 5);
                                yoVar.t0 = false;
                                yoVar.Z = j11;
                                yoVar.n0 = z132;
                                TLRPC.ChatFull chatFull7 = koVar14.y0;
                                yoVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.l0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.w0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z142 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                    z142 = true;
                                }
                                kpVar.s = z142;
                                kpVar.h = koVar15.y0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                zv0 zv0Var = new zv0(koVar16.w0);
                                zv0Var.v = new co(koVar16, 4);
                                koVar16.presentFragment(zv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                b60 b60Var = new b60(-koVar17.x0.id);
                                b60Var.c = koVar17.L0;
                                b60Var.l0 = koVar17;
                                koVar17.presentFragment(b60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.y0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = koVar19.y0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                koVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.w0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = koVar20.y0;
                                    rpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                bundle6.putLong("chat_id", koVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.x0) && ChatObject.canChangeChatInfo(this.x0)) {
                charSequence = "";
                i10 = -2;
                po0 po0Var = new po0(this.currentAccount, -this.x0.id, context, getResourceProvider());
                this.L = po0Var;
                po0Var.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
                this.F.addView(this.L, w7.z5.n(-1, -2));
                final int i23 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.y0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.Q0;
                                long j102 = koVar4.C0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = koVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.y0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new lh0(koVar6.w0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new xb(koVar8.x0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.C0);
                                koVar10.presentFragment(new ua(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.C0));
                                break;
                            case 9:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -koVar13.w0;
                                    TLRPC.ChatFull chatFull6 = koVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.w0;
                                org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.M = new ArrayList();
                                yoVar.N = new ArrayList();
                                yoVar.P = new ArrayList();
                                yoVar.c0 = true;
                                yoVar.f0 = new ArrayList();
                                yoVar.o0 = new HashMap();
                                yoVar.q0 = new no(yoVar, 5);
                                yoVar.t0 = false;
                                yoVar.Z = j11;
                                yoVar.n0 = z132;
                                TLRPC.ChatFull chatFull7 = koVar14.y0;
                                yoVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.l0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.w0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z142 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                    z142 = true;
                                }
                                kpVar.s = z142;
                                kpVar.h = koVar15.y0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                zv0 zv0Var = new zv0(koVar16.w0);
                                zv0Var.v = new co(koVar16, 4);
                                koVar16.presentFragment(zv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                b60 b60Var = new b60(-koVar17.x0.id);
                                b60Var.c = koVar17.L0;
                                b60Var.l0 = koVar17;
                                koVar17.presentFragment(b60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.y0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = koVar19.y0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                koVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.w0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = koVar20.y0;
                                    rpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                bundle6.putLong("chat_id", koVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i10 = -2;
                charSequence = "";
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.x0) || ChatObject.isCommunity(this.x0)) {
                context3 = context;
                frameLayout = frameLayout2;
                num = 1;
                koVar = this;
            } else {
                long j11 = -this.x0.id;
                num = 1;
                org.telegram.ui.Cells.q8 q8Var11 = new org.telegram.ui.Cells.q8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.M = q8Var11;
                q8Var11.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
                this.M.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.x0.autotranslation);
                getMessagesController().getBoostsController().getBoostsStats(j11, new Utilities.Callback(this) { // from class: org.telegram.ui.ao
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i15) {
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
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, w7.z5.n(-1, i10));
                frameLayout = frameLayout2;
                koVar = this;
                this.M.setOnClickListener(new ai.c4(this, new boolean[]{false}, j11, 1));
            }
            if (!koVar.I0 && ChatObject.canBlockUsers(koVar.x0) && (ChatObject.isChannel(koVar.x0) || koVar.x0.creator)) {
                org.telegram.ui.Cells.q8 q8Var12 = new org.telegram.ui.Cells.q8(context3);
                koVar.N = q8Var12;
                q8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(true));
                koVar.F.addView(koVar.N, w7.z5.n(-1, i10));
                koVar.N.setOnClickListener(new org.telegram.ui.ActionBar.s1(15, koVar, context3));
            }
            if (ChatObject.isMegagroup(koVar.x0) && ChatObject.hasAdminRights(koVar.x0) && !ChatObject.isCommunity(koVar.x0)) {
                final int i24 = 1;
                MessagesController.getInstance(koVar.currentAccount).getBoostsController().getBoostsStats(-koVar.x0.id, new Utilities.Callback(koVar) { // from class: org.telegram.ui.ao
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i24) {
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
                                this.b.L0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                po0 po0Var2 = new po0(koVar.currentAccount, -koVar.x0.id, context3, koVar.getResourceProvider());
                koVar.L = po0Var2;
                po0Var2.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
                koVar.F.addView(koVar.L, w7.z5.n(-1, i10));
                final int i25 = 20;
                koVar.L.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.w0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.y0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.Q0;
                                long j102 = koVar4.C0;
                                if (!koVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i172 = chatPhoto2.dc_id;
                                            if (i172 != 0) {
                                                chatPhoto2.photo_big.dc_id = i172;
                                            }
                                            TLRPC.ChatFull chatFull5 = koVar4.y0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i182 = userProfilePhoto2.dc_id;
                                            if (i182 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i182;
                                            }
                                            PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.w0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.y0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new lh0(koVar6.w0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new xb(koVar8.x0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.C0);
                                koVar10.presentFragment(new ua(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new gi.l(koVar11.C0));
                                break;
                            case 9:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                break;
                            case 10:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                break;
                            case 11:
                                pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -koVar13.w0;
                                    TLRPC.ChatFull chatFull6 = koVar13.y0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.F0 = new co(koVar13, 6);
                                    koVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j112 = koVar14.w0;
                                org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.M = new ArrayList();
                                yoVar.N = new ArrayList();
                                yoVar.P = new ArrayList();
                                yoVar.c0 = true;
                                yoVar.f0 = new ArrayList();
                                yoVar.o0 = new HashMap();
                                yoVar.q0 = new no(yoVar, 5);
                                yoVar.t0 = false;
                                yoVar.Z = j112;
                                yoVar.n0 = z132;
                                TLRPC.ChatFull chatFull7 = koVar14.y0;
                                yoVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.l0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.w0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z142 = false;
                                kpVar.O = false;
                                kpVar.P = false;
                                kpVar.E = j12;
                                TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                    z142 = true;
                                }
                                kpVar.s = z142;
                                kpVar.h = koVar15.y0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                zv0 zv0Var = new zv0(koVar16.w0);
                                zv0Var.v = new co(koVar16, 4);
                                koVar16.presentFragment(zv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                b60 b60Var = new b60(-koVar17.x0.id);
                                b60Var.c = koVar17.L0;
                                b60Var.l0 = koVar17;
                                koVar17.presentFragment(b60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.w0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.y0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = koVar19.y0;
                                kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                koVar19.presentFragment(kh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                    koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.w0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.F = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull9 = koVar20.y0;
                                    rpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (rpVar.a == null) {
                                            rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        rpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            rpVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            rpVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                    rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                bundle6.putLong("chat_id", koVar21.w0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                koVar21.presentFragment(new sn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!koVar.I0 && koVar.x0.creator) {
                org.telegram.ui.Cells.q8 q8Var13 = new org.telegram.ui.Cells.q8(23, context, null, false, true);
                context2 = context;
                koVar.Q = q8Var13;
                q8Var13.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
                koVar.Q.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), koVar.F0);
                koVar.Q.getCheckBox().setIcon(koVar.G0 ? 0 : R.drawable.permission_locked);
                koVar.F.addView(koVar.Q, w7.z5.d(-2.0f, -1));
                koVar.Q.setOnClickListener(new org.telegram.ui.ActionBar.s1(16, koVar, frameLayout));
            } else {
                context2 = context;
            }
            koVar.o0();
        } else {
            i10 = -2;
            context2 = context;
            charSequence = "";
            num = 1;
            koVar = this;
        }
        org.telegram.ui.ActionBar.y n10 = koVar.actionBar.n();
        if (koVar.D0 != null || ChatObject.canChangeChatInfo(koVar.x0) || koVar.N != null) {
            org.telegram.ui.ActionBar.u0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            koVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (koVar.H == null && koVar.N == null && koVar.I == null && koVar.J == null && koVar.Q == null) {
            i11 = 12;
        } else {
            i11 = 12;
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context2, 12, koVar.resourceProvider);
            koVar.P = d9Var;
            if (koVar.Q != null) {
                d9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                d9Var.setFixedSize(12);
            }
            rVar.addView(koVar.P, w7.z5.n(-1, i10));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        koVar.R = linearLayout4;
        linearLayout4.setOrientation(1);
        rVar.addView(koVar.R, w7.z5.n(-1, i10));
        final int i26 = 8;
        if (koVar.x0 != null) {
            org.telegram.ui.Cells.q8 q8Var14 = new org.telegram.ui.Cells.q8(context2);
            koVar.X = q8Var14;
            q8Var14.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            org.telegram.ui.Cells.q8 q8Var15 = koVar.X;
            if (!ChatObject.isChannel(koVar.x0)) {
                TLRPC.Chat chat5 = koVar.x0;
                if (!chat5.creator && (!ChatObject.hasAdminRights(chat5) || !ChatObject.canChangeChatInfo(koVar.x0))) {
                    i13 = 8;
                    q8Var15.setVisibility(i13);
                    final int i27 = 21;
                    koVar.X.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.q8 q8Var16 = new org.telegram.ui.Cells.q8(context2);
                    koVar.V = q8Var16;
                    q8Var16.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    final int i28 = 22;
                    koVar.V.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i28) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.q8 q8Var17 = new org.telegram.ui.Cells.q8(context2);
                    koVar.O = q8Var17;
                    q8Var17.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    final int i29 = 23;
                    koVar.O.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(koVar.x0, 28)) {
                        org.telegram.ui.Cells.q8 q8Var18 = new org.telegram.ui.Cells.q8(context2);
                        koVar.f0 = q8Var18;
                        q8Var18.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        final int i30 = 24;
                        koVar.f0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i30) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.y0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.Q0;
                                        long j102 = koVar4.C0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.y0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new lh0(koVar6.w0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new xb(koVar8.x0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.C0);
                                        koVar10.presentFragment(new ua(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -koVar13.w0;
                                            TLRPC.ChatFull chatFull6 = koVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.w0;
                                        org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                        boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.M = new ArrayList();
                                        yoVar.N = new ArrayList();
                                        yoVar.P = new ArrayList();
                                        yoVar.c0 = true;
                                        yoVar.f0 = new ArrayList();
                                        yoVar.o0 = new HashMap();
                                        yoVar.q0 = new no(yoVar, 5);
                                        yoVar.t0 = false;
                                        yoVar.Z = j112;
                                        yoVar.n0 = z132;
                                        TLRPC.ChatFull chatFull7 = koVar14.y0;
                                        yoVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.l0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.w0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z142 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                            z142 = true;
                                        }
                                        kpVar.s = z142;
                                        kpVar.h = koVar15.y0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        zv0 zv0Var = new zv0(koVar16.w0);
                                        zv0Var.v = new co(koVar16, 4);
                                        koVar16.presentFragment(zv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        b60 b60Var = new b60(-koVar17.x0.id);
                                        b60Var.c = koVar17.L0;
                                        b60Var.l0 = koVar17;
                                        koVar17.presentFragment(b60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.y0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = koVar19.y0;
                                        kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        koVar19.presentFragment(kh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.w0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = koVar20.y0;
                                            rpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                        bundle6.putLong("chat_id", koVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                        koVar.f0();
                    }
                    org.telegram.ui.Cells.q8 q8Var19 = new org.telegram.ui.Cells.q8(context2);
                    koVar.W = q8Var19;
                    q8Var19.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    koVar.W.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i15) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.q8 q8Var20 = new org.telegram.ui.Cells.q8(context2);
                    koVar.T = q8Var20;
                    q8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                    final int i31 = 2;
                    koVar.T.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i31) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.isChannelAndNotMegaGroup(koVar.x0)) {
                        org.telegram.ui.Cells.q8 q8Var21 = new org.telegram.ui.Cells.q8(context2);
                        koVar.U = q8Var21;
                        q8Var21.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        final int i32 = 3;
                        koVar.U.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i32) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.y0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.Q0;
                                        long j102 = koVar4.C0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.y0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new lh0(koVar6.w0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new xb(koVar8.x0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.C0);
                                        koVar10.presentFragment(new ua(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -koVar13.w0;
                                            TLRPC.ChatFull chatFull6 = koVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.w0;
                                        org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                        boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.M = new ArrayList();
                                        yoVar.N = new ArrayList();
                                        yoVar.P = new ArrayList();
                                        yoVar.c0 = true;
                                        yoVar.f0 = new ArrayList();
                                        yoVar.o0 = new HashMap();
                                        yoVar.q0 = new no(yoVar, 5);
                                        yoVar.t0 = false;
                                        yoVar.Z = j112;
                                        yoVar.n0 = z132;
                                        TLRPC.ChatFull chatFull7 = koVar14.y0;
                                        yoVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.l0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.w0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z142 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                            z142 = true;
                                        }
                                        kpVar.s = z142;
                                        kpVar.h = koVar15.y0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        zv0 zv0Var = new zv0(koVar16.w0);
                                        zv0Var.v = new co(koVar16, 4);
                                        koVar16.presentFragment(zv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        b60 b60Var = new b60(-koVar17.x0.id);
                                        b60Var.c = koVar17.L0;
                                        b60Var.l0 = koVar17;
                                        koVar17.presentFragment(b60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.y0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = koVar19.y0;
                                        kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        koVar19.presentFragment(kh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.w0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = koVar20.y0;
                                            rpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                        bundle6.putLong("chat_id", koVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.q8 q8Var22 = new org.telegram.ui.Cells.q8(context2);
                    koVar.Z = q8Var22;
                    q8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    koVar.Z.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    final int i33 = 4;
                    koVar.Z.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j12;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    koVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(koVar.x0) || koVar.x0.gigagroup) {
                        org.telegram.ui.Cells.q8 q8Var23 = new org.telegram.ui.Cells.q8(context2);
                        koVar.Y = q8Var23;
                        q8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        koVar.Y.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        final int i34 = 5;
                        koVar.Y.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i34) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.y0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.Q0;
                                        long j102 = koVar4.C0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.y0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new lh0(koVar6.w0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new xb(koVar8.x0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.C0);
                                        koVar10.presentFragment(new ua(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -koVar13.w0;
                                            TLRPC.ChatFull chatFull6 = koVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.w0;
                                        org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                        boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.M = new ArrayList();
                                        yoVar.N = new ArrayList();
                                        yoVar.P = new ArrayList();
                                        yoVar.c0 = true;
                                        yoVar.f0 = new ArrayList();
                                        yoVar.o0 = new HashMap();
                                        yoVar.q0 = new no(yoVar, 5);
                                        yoVar.t0 = false;
                                        yoVar.Z = j112;
                                        yoVar.n0 = z132;
                                        TLRPC.ChatFull chatFull7 = koVar14.y0;
                                        yoVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.l0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.w0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z142 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                            z142 = true;
                                        }
                                        kpVar.s = z142;
                                        kpVar.h = koVar15.y0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        zv0 zv0Var = new zv0(koVar16.w0);
                                        zv0Var.v = new co(koVar16, 4);
                                        koVar16.presentFragment(zv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        b60 b60Var = new b60(-koVar17.x0.id);
                                        b60Var.c = koVar17.L0;
                                        b60Var.l0 = koVar17;
                                        koVar17.presentFragment(b60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.y0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = koVar19.y0;
                                        kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        koVar19.presentFragment(kh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.w0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = koVar20.y0;
                                            rpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                        bundle6.putLong("chat_id", koVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(koVar.x0)) {
                        org.telegram.ui.Cells.q8 q8Var24 = new org.telegram.ui.Cells.q8(context2);
                        koVar.a0 = q8Var24;
                        q8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        koVar.a0.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        final int i35 = 6;
                        koVar.a0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i35) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.w0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.y0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.Q0;
                                        long j102 = koVar4.C0;
                                        if (!koVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i172 = chatPhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i172;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i182 = userProfilePhoto2.dc_id;
                                                    if (i182 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i182;
                                                    }
                                                    PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.w0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.y0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new lh0(koVar6.w0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new xb(koVar8.x0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.C0);
                                        koVar10.presentFragment(new ua(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new gi.l(koVar11.C0));
                                        break;
                                    case 9:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                        break;
                                    case 10:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                        break;
                                    case 11:
                                        pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -koVar13.w0;
                                            TLRPC.ChatFull chatFull6 = koVar13.y0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.F0 = new co(koVar13, 6);
                                            koVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.w0;
                                        org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                        boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.M = new ArrayList();
                                        yoVar.N = new ArrayList();
                                        yoVar.P = new ArrayList();
                                        yoVar.c0 = true;
                                        yoVar.f0 = new ArrayList();
                                        yoVar.o0 = new HashMap();
                                        yoVar.q0 = new no(yoVar, 5);
                                        yoVar.t0 = false;
                                        yoVar.Z = j112;
                                        yoVar.n0 = z132;
                                        TLRPC.ChatFull chatFull7 = koVar14.y0;
                                        yoVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.l0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.w0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z142 = false;
                                        kpVar.O = false;
                                        kpVar.P = false;
                                        kpVar.E = j12;
                                        TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                            z142 = true;
                                        }
                                        kpVar.s = z142;
                                        kpVar.h = koVar15.y0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        zv0 zv0Var = new zv0(koVar16.w0);
                                        zv0Var.v = new co(koVar16, 4);
                                        koVar16.presentFragment(zv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        b60 b60Var = new b60(-koVar17.x0.id);
                                        b60Var.c = koVar17.L0;
                                        b60Var.l0 = koVar17;
                                        koVar17.presentFragment(b60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.w0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.y0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = koVar19.y0;
                                        kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                        koVar19.presentFragment(kh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                            koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.w0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.F = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull9 = koVar20.y0;
                                            rpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (rpVar.a == null) {
                                                    rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                rpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    rpVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    rpVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                        if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                            rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                        bundle6.putLong("chat_id", koVar21.w0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                        koVar21.presentFragment(new sn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    koVar.R.addView(koVar.O, w7.z5.n(-1, i10));
                    q8Var = koVar.f0;
                    if (q8Var != null) {
                        koVar.R.addView(q8Var, w7.z5.n(-1, i10));
                    }
                    if (!koVar.I0 && !koVar.x0.gigagroup) {
                        koVar.R.addView(koVar.X, w7.z5.n(-1, i10));
                    }
                    if (!koVar.I0) {
                        koVar.R.addView(koVar.V, w7.z5.n(-1, i10));
                    }
                    koVar.R.addView(koVar.W, w7.z5.n(-1, i10));
                    koVar.R.addView(koVar.T, w7.z5.n(-1, i10));
                    q8Var2 = koVar.U;
                    if (q8Var2 != null && (chatFull2 = koVar.y0) != null && chatFull2.requests_pending > 0) {
                        koVar.R.addView(q8Var2, w7.z5.n(-1, i10));
                    }
                    if (koVar.I0) {
                        koVar.R.addView(koVar.V, w7.z5.n(-1, i10));
                    }
                    if (!koVar.I0 || koVar.x0.gigagroup) {
                        koVar.R.addView(koVar.X, w7.z5.n(-1, i10));
                    }
                    q8Var3 = koVar.a0;
                    if (q8Var3 != null) {
                        koVar.R.addView(q8Var3, w7.z5.n(-1, i10));
                    }
                    q8Var4 = koVar.Y;
                    if (q8Var4 != null) {
                        koVar.R.addView(q8Var4, w7.z5.n(-1, i10));
                    }
                    q8Var5 = koVar.Z;
                    if (q8Var5 != null) {
                        koVar.R.addView(q8Var5, w7.z5.n(-1, i10));
                    }
                    if (koVar.Z != null && koVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(koVar.x0)) {
                        koVar.Z.setVisibility(0);
                    }
                    q8Var6 = koVar.Y;
                    if (q8Var6 != null) {
                        org.telegram.ui.Cells.q8 q8Var25 = koVar.Z;
                        q8Var6.setNeedDivider(q8Var25 != null && q8Var25.getVisibility() == 0);
                    }
                }
            }
            i13 = 0;
            q8Var15.setVisibility(i13);
            final int i272 = 21;
            koVar.X.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i272) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.q8 q8Var162 = new org.telegram.ui.Cells.q8(context2);
            koVar.V = q8Var162;
            q8Var162.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            final int i282 = 22;
            koVar.V.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i282) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.q8 q8Var172 = new org.telegram.ui.Cells.q8(context2);
            koVar.O = q8Var172;
            q8Var172.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            final int i292 = 23;
            koVar.O.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(koVar.x0, 28)) {
            }
            org.telegram.ui.Cells.q8 q8Var192 = new org.telegram.ui.Cells.q8(context2);
            koVar.W = q8Var192;
            q8Var192.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            koVar.W.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i15) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.q8 q8Var202 = new org.telegram.ui.Cells.q8(context2);
            koVar.T = q8Var202;
            q8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            final int i312 = 2;
            koVar.T.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i312) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isChannelAndNotMegaGroup(koVar.x0)) {
            }
            org.telegram.ui.Cells.q8 q8Var222 = new org.telegram.ui.Cells.q8(context2);
            koVar.Z = q8Var222;
            q8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            koVar.Z.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            final int i332 = 4;
            koVar.Z.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            koVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(koVar.x0)) {
            }
            org.telegram.ui.Cells.q8 q8Var232 = new org.telegram.ui.Cells.q8(context2);
            koVar.Y = q8Var232;
            q8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            koVar.Y.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            final int i342 = 5;
            koVar.Y.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(koVar.x0)) {
            }
            koVar.R.addView(koVar.O, w7.z5.n(-1, i10));
            q8Var = koVar.f0;
            if (q8Var != null) {
            }
            if (!koVar.I0) {
                koVar.R.addView(koVar.X, w7.z5.n(-1, i10));
            }
            if (!koVar.I0) {
            }
            koVar.R.addView(koVar.W, w7.z5.n(-1, i10));
            koVar.R.addView(koVar.T, w7.z5.n(-1, i10));
            q8Var2 = koVar.U;
            if (q8Var2 != null) {
                koVar.R.addView(q8Var2, w7.z5.n(-1, i10));
            }
            if (koVar.I0) {
            }
            if (!koVar.I0) {
            }
            koVar.R.addView(koVar.X, w7.z5.n(-1, i10));
            q8Var3 = koVar.a0;
            if (q8Var3 != null) {
            }
            q8Var4 = koVar.Y;
            if (q8Var4 != null) {
            }
            q8Var5 = koVar.Z;
            if (q8Var5 != null) {
            }
            if (koVar.Z != null) {
                koVar.Z.setVisibility(0);
            }
            q8Var6 = koVar.Y;
            if (q8Var6 != null) {
            }
        }
        if (koVar.D0 != null) {
            org.telegram.ui.Cells.q8 q8Var26 = new org.telegram.ui.Cells.q8(context2);
            koVar.l0 = q8Var26;
            q8Var26.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            koVar.l0.setPrioritizeTitleOverValue(true);
            koVar.R.addView(koVar.l0, w7.z5.n(-1, i10));
            final int i36 = 7;
            koVar.l0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i36) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            koVar.r0();
            org.telegram.ui.Cells.q8 q8Var27 = new org.telegram.ui.Cells.q8(context2);
            koVar.o0 = q8Var27;
            q8Var27.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            charSequence2 = charSequence;
            koVar.o0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), charSequence2, R.drawable.msg_shareout, true);
            koVar.R.addView(koVar.o0, w7.z5.n(-1, i10));
            koVar.o0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i26) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            koVar.o0.f(45, koVar.E0 == null, false);
            TLRPC.UserFull userFull = koVar.E0;
            if (userFull != null) {
                koVar.o0.u(userFull.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f)), false);
            }
            if (!koVar.getMessagesController().starrefProgramAllowed) {
                koVar.o0.setVisibility(8);
            }
            org.telegram.ui.Cells.q8 q8Var28 = new org.telegram.ui.Cells.q8(context2);
            koVar.p0 = q8Var28;
            q8Var28.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            koVar.p0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            koVar.R.addView(koVar.p0, w7.z5.n(-1, i10));
            final int i37 = 9;
            koVar.p0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i37) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.q8 q8Var29 = new org.telegram.ui.Cells.q8(context2);
            koVar.q0 = q8Var29;
            q8Var29.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            koVar.q0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            koVar.R.addView(koVar.q0, w7.z5.n(-1, i10));
            final int i38 = 10;
            koVar.q0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.q8 q8Var30 = new org.telegram.ui.Cells.q8(context2);
            koVar.r0 = q8Var30;
            q8Var30.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            koVar.r0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            koVar.R.addView(koVar.r0, w7.z5.n(-1, i10));
            final int i39 = 11;
            koVar.r0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
        } else {
            charSequence2 = charSequence;
        }
        TLRPC.Chat chat6 = koVar.x0;
        if (chat6 != null) {
            if (!ChatObject.hasAdminRights(chat6)) {
                koVar.R.setVisibility(8);
                koVar.G.setVisibility(8);
            }
            rVar.addView(new org.telegram.ui.Cells.z6(context2), w7.z5.n(-1, i10));
        } else if (koVar.D0 != null) {
            koVar.s0 = new org.telegram.ui.Cells.d9(context2, i11, koVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new ai.e5(1), indexOf, indexOf + 10, 33);
            }
            koVar.s0.setText(valueOf);
            rVar.addView(koVar.s0, w7.z5.n(-1, i10));
            org.telegram.ui.Cells.q8 q8Var31 = new org.telegram.ui.Cells.q8(context2);
            koVar.u0 = q8Var31;
            q8Var31.setBackground(org.telegram.ui.ActionBar.h6.L0(true));
            koVar.u0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.q8 q8Var32 = koVar.u0;
            int i40 = org.telegram.ui.ActionBar.h6.q6;
            q8Var32.e(i40, i40);
            rVar.addView(koVar.u0, w7.z5.n(-1, i10));
            final int i41 = 13;
            koVar.u0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i41) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j12;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.d9 d9Var2 = new org.telegram.ui.Cells.d9(context2, i11, koVar.resourceProvider);
            koVar.t0 = d9Var2;
            d9Var2.setFixedSize(i11);
            rVar.addView(koVar.t0, w7.z5.n(-1, i10));
            org.telegram.ui.Cells.q8 q8Var33 = koVar.u0;
            TLRPC.UserFull userFull2 = koVar.E0;
            q8Var33.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.d9 d9Var3 = koVar.t0;
            TLRPC.UserFull userFull3 = koVar.E0;
            d9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = koVar.D0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                koVar.S = linearLayout5;
                linearLayout5.setOrientation(1);
                rVar.addView(koVar.S, w7.z5.n(-1, i10));
                org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context2);
                l4Var.setText(LocaleController.getString(R.string.BotBalance));
                koVar.S.addView(l4Var, w7.z5.n(-1, i10));
                org.telegram.ui.Cells.q8 q8Var34 = new org.telegram.ui.Cells.q8(context2);
                koVar.m0 = q8Var34;
                q8Var34.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                koVar.m0.setPrioritizeTitleOverValue(true);
                koVar.S.addView(koVar.m0, w7.z5.n(-1, i10));
                final ai.k0 g11 = ai.k0.g(koVar.currentAccount);
                koVar.m0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                ko koVar3 = this.b;
                                long j12 = koVar3.C0;
                                if (g11.h(j12, false) != null) {
                                    koVar3.presentFragment(new ai.x(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ko koVar4 = this.b;
                                long j13 = koVar4.C0;
                                if (g11.h(j13, false) != null) {
                                    koVar4.presentFragment(new ai.x(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.m(j10)) {
                    long i42 = g11.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i42 > 0) {
                        double d = i42 / 1.0E9d;
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
                    koVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.ca0(AndroidUtilities.dp(30.0f), koVar.m0.c), 0, spannableStringBuilder2.length(), 33);
                    koVar.m0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                koVar.m0.setVisibility(g11.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.q8 q8Var35 = new org.telegram.ui.Cells.q8(context2);
                koVar.n0 = q8Var35;
                q8Var35.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                final int i43 = 1;
                koVar.n0.setPrioritizeTitleOverValue(true);
                koVar.S.addView(koVar.n0, w7.z5.n(-1, -2));
                koVar.n0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i43) {
                            case 0:
                                ko koVar3 = this.b;
                                long j12 = koVar3.C0;
                                if (g11.h(j12, false) != null) {
                                    koVar3.presentFragment(new ai.x(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ko koVar4 = this.b;
                                long j13 = koVar4.C0;
                                if (g11.h(j13, false) != null) {
                                    koVar4.presentFragment(new ai.x(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j10, false) != null) {
                    koVar.n0.q(LocaleController.getString(R.string.BotBalanceStars), g11.c(j10).amount <= 0 ? charSequence2 : ai.md.Y0(false, TextUtils.concat("XTR", ai.md.L0(g11.c(j10), 0.85f, ' ')), 0.85f, null), R.drawable.menu_premium_main, false);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.ca0(AndroidUtilities.dp(30.0f), koVar.n0.c), 0, spannableStringBuilder3.length(), 33);
                    koVar.n0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                koVar.n0.setVisibility(g11.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.d9 d9Var4 = new org.telegram.ui.Cells.d9(context2, 12, koVar.getResourceProvider());
                d9Var4.setFixedSize(12);
                num2 = num;
                d9Var4.setTag(R.id.fit_width_tag, num2);
                rVar.addView(d9Var4, w7.z5.n(-1, 12));
                koVar.S.setVisibility((koVar.n0.getVisibility() == 0 || koVar.m0.getVisibility() == 0) ? 0 : 8);
                chat = koVar.x0;
                i12 = 14;
                if ((chat == null && chat.creator) || ((user = koVar.D0) != null && user.bot && user.bot_can_edit)) {
                    final long j12 = chat != null ? chat.linked_community_id : koVar.D0.linked_community_id;
                    final long j13 = chat != null ? -chat.id : koVar.D0.id;
                    final boolean z15 = koVar.D0 != null;
                    if (j12 != 0) {
                        ii.a aVar = new ii.a(context2, koVar.resourceProvider);
                        koVar.h0 = aVar;
                        aVar.a(koVar.currentAccount, koVar.getMessagesController().getChat(Long.valueOf(j12)));
                        koVar.h0.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        koVar.h0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i15) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        MessagesController messagesController = koVar3.getMessagesController();
                                        long j14 = j12;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                            koVar3.showDialog(new hi.k0(koVar3, j14, null, null));
                                            break;
                                        } else {
                                            koVar3.presentFragment(new hi.o(zf.d0.b(j14, "community_id")));
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
                        rVar.addView(koVar.h0, w7.z5.n(-1, -2));
                        org.telegram.ui.Cells.q8 q8Var36 = new org.telegram.ui.Cells.q8(context2);
                        koVar.j0 = q8Var36;
                        q8Var36.m(R.drawable.outline_community_remove_24, LocaleController.getString(z15 ? R.string.CommunityRemoveBotFromCommunity : koVar.I0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                        org.telegram.ui.Cells.q8 q8Var37 = koVar.j0;
                        int i44 = org.telegram.ui.ActionBar.h6.p7;
                        q8Var37.e(i44, i44);
                        koVar.j0.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        org.telegram.ui.Cells.q8 q8Var38 = koVar.j0;
                        koVar2 = koVar;
                        f7 = -2.0f;
                        q8Var38.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.zn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String string2 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                                ko koVar3 = ko.this;
                                org.telegram.ui.Components.f5.u0(koVar3, string2, LocaleController.getString(z15 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : koVar3.I0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new go(koVar3, j13, j12, 0));
                            }
                        });
                        rVar.addView(koVar2.j0, w7.z5.n(-1, -2));
                        org.telegram.ui.Cells.d9 d9Var5 = new org.telegram.ui.Cells.d9(context2, 12, koVar2.getResourceProvider());
                        koVar2.k0 = d9Var5;
                        d9Var5.setFixedSize(14);
                        koVar2.k0.setTag(R.id.fit_width_tag, num2);
                        rVar.addView(koVar2.k0, w7.z5.n(-1, 14));
                    } else {
                        koVar2 = koVar;
                        f7 = -2.0f;
                        org.telegram.ui.Cells.q8 q8Var39 = new org.telegram.ui.Cells.q8(context2);
                        koVar2.g0 = q8Var39;
                        q8Var39.e(org.telegram.ui.ActionBar.h6.v6, org.telegram.ui.ActionBar.h6.u6);
                        koVar2.g0.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.il));
                        koVar2.g0.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                        koVar2.g0.m(R.drawable.msg_groups, LocaleController.getString(z15 ? R.string.CommunityAddBotToCommunity : koVar2.I0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                        final int i45 = 1;
                        koVar2.g0.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i45) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        MessagesController messagesController = koVar3.getMessagesController();
                                        long j14 = j13;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                            koVar3.showDialog(new hi.k0(koVar3, j14, null, null));
                                            break;
                                        } else {
                                            koVar3.presentFragment(new hi.o(zf.d0.b(j14, "community_id")));
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
                        org.telegram.ui.Cells.d9 d9Var6 = new org.telegram.ui.Cells.d9(context2, 12, koVar2.resourceProvider);
                        koVar2.i0 = d9Var6;
                        d9Var6.setText(LocaleController.getString(z15 ? R.string.CommunityAddBotToCommunityInfo : koVar2.I0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                        rVar.addView(koVar2.g0, w7.z5.n(-1, -2));
                        rVar.addView(koVar2.i0, w7.z5.n(-1, -2));
                    }
                } else {
                    koVar2 = koVar;
                    f7 = -2.0f;
                }
                chat2 = koVar2.x0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    koVar2.c0 = frameLayout3;
                    rVar.addView(frameLayout3, w7.z5.n(-1, -2));
                    org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context2);
                    koVar2.d0 = baVar;
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7));
                    koVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
                    if (koVar2.D0 == null) {
                        koVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
                    } else if (koVar2.I0) {
                        koVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
                    } else {
                        koVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                    }
                    koVar2.c0.addView(koVar2.d0, w7.z5.d(f7, -1));
                    koVar2.d0.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.wn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.w0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.y0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.Q0;
                                    long j102 = koVar4.C0;
                                    if (!koVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user22 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user22 == null) {
                                            TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i172 = chatPhoto2.dc_id;
                                                if (i172 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i172;
                                                }
                                                TLRPC.ChatFull chatFull5 = koVar4.y0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                                int i182 = userProfilePhoto2.dc_id;
                                                if (i182 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i182;
                                                }
                                                PhotoViewer.t1().f2(null, user22.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.w0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.y0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new lh0(koVar6.w0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new gi.u3(-koVar7.w0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new xb(koVar8.x0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(r91.d0(koVar9.x0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.C0);
                                    koVar10.presentFragment(new ua(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new gi.l(koVar11.C0));
                                    break;
                                case 9:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                                    break;
                                case 10:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                                    break;
                                case 11:
                                    pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -koVar13.w0;
                                        TLRPC.ChatFull chatFull6 = koVar13.y0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.F0 = new co(koVar13, 6);
                                        koVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.w0;
                                    org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                                    boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.M = new ArrayList();
                                    yoVar.N = new ArrayList();
                                    yoVar.P = new ArrayList();
                                    yoVar.c0 = true;
                                    yoVar.f0 = new ArrayList();
                                    yoVar.o0 = new HashMap();
                                    yoVar.q0 = new no(yoVar, 5);
                                    yoVar.t0 = false;
                                    yoVar.Z = j112;
                                    yoVar.n0 = z132;
                                    TLRPC.ChatFull chatFull7 = koVar14.y0;
                                    yoVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.l0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j122 = koVar15.w0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z142 = false;
                                    kpVar.O = false;
                                    kpVar.P = false;
                                    kpVar.E = j122;
                                    TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j122));
                                    kpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                        z142 = true;
                                    }
                                    kpVar.s = z142;
                                    kpVar.h = koVar15.y0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    zv0 zv0Var = new zv0(koVar16.w0);
                                    zv0Var.v = new co(koVar16, 4);
                                    koVar16.presentFragment(zv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    b60 b60Var = new b60(-koVar17.x0.id);
                                    b60Var.c = koVar17.L0;
                                    b60Var.l0 = koVar17;
                                    koVar17.presentFragment(b60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.w0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.y0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = koVar19.y0;
                                    kh0Var.g0(chatFull8, chatFull8.exported_invite);
                                    koVar19.presentFragment(kh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                        koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.w0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.F = new ArrayList();
                                        long j132 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j132;
                                        TLRPC.ChatFull chatFull9 = koVar20.y0;
                                        rpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (rpVar.a == null) {
                                                rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j132));
                                            }
                                            rpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                rpVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                rpVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                                    if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                        rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                                    bundle6.putLong("chat_id", koVar21.w0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                                    koVar21.presentFragment(new sn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context2);
                    koVar2.e0 = z6Var2;
                    rVar.addView(z6Var2, w7.z5.n(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                koVar2.c = undoView;
                kdVar.addView(undoView, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
                org.telegram.ui.Components.qu quVar6 = koVar2.v;
                TLRPC.User user3 = koVar2.D0;
                quVar6.setText(Emoji.replaceEmoji(user3 == null ? ContactsController.formatName(user3) : koVar2.x0.title, koVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.qu quVar7 = koVar2.v;
                quVar7.setSelection(quVar7.n());
                chatFull = koVar2.y0;
                if (chatFull == null) {
                    koVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = koVar2.E0;
                    if (userFull4 != null) {
                        koVar2.E.setText(userFull4.about);
                    }
                }
                koVar2.k0();
                koVar2.p0(true, false);
                return koVar2.fragmentView;
            }
        }
        num2 = num;
        chat = koVar.x0;
        i12 = 14;
        if (chat == null) {
        }
        koVar2 = koVar;
        f7 = -2.0f;
        chat2 = koVar2.x0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            koVar2.c0 = frameLayout32;
            rVar.addView(frameLayout32, w7.z5.n(-1, -2));
            org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context2);
            koVar2.d0 = baVar2;
            baVar2.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.p7));
            koVar2.d0.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.L0(false));
            if (koVar2.D0 == null) {
            }
            koVar2.c0.addView(koVar2.d0, w7.z5.d(f7, -1));
            koVar2.d0.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.wn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.w0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.y0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.Q0;
                            long j102 = koVar4.C0;
                            if (!koVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat32 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.w0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i172 = chatPhoto2.dc_id;
                                        if (i172 != 0) {
                                            chatPhoto2.photo_big.dc_id = i172;
                                        }
                                        TLRPC.ChatFull chatFull5 = koVar4.y0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.y0.chat_photo.video_sizes.get(0), koVar4.y0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().f2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i182 = userProfilePhoto2.dc_id;
                                        if (i182 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i182;
                                        }
                                        PhotoViewer.t1().f2(null, user22.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.w0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.y0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new lh0(koVar6.w0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new gi.u3(-koVar7.w0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new xb(koVar8.x0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(r91.d0(koVar9.x0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.C0);
                            koVar10.presentFragment(new ua(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new gi.l(koVar11.C0));
                            break;
                        case 9:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-intro");
                            break;
                        case 10:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0) + "-commands");
                            break;
                        case 11:
                            pf.d.r(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.D0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.f5.r(koVar12, false, koVar12.x0, null, false, true, true, false, new co(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -koVar13.w0;
                                TLRPC.ChatFull chatFull6 = koVar13.y0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.A0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.F0 = new co(koVar13, 6);
                                koVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.w0;
                            org.telegram.ui.Cells.q8 q8Var72 = koVar14.H;
                            boolean z132 = q8Var72 != null && q8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.M = new ArrayList();
                            yoVar.N = new ArrayList();
                            yoVar.P = new ArrayList();
                            yoVar.c0 = true;
                            yoVar.f0 = new ArrayList();
                            yoVar.o0 = new HashMap();
                            yoVar.q0 = new no(yoVar, 5);
                            yoVar.t0 = false;
                            yoVar.Z = j112;
                            yoVar.n0 = z132;
                            TLRPC.ChatFull chatFull7 = koVar14.y0;
                            yoVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.l0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j122 = koVar15.w0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z142 = false;
                            kpVar.O = false;
                            kpVar.P = false;
                            kpVar.E = j122;
                            TLRPC.Chat chat42 = kpVar.getMessagesController().getChat(Long.valueOf(j122));
                            kpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !kpVar.f.megagroup) {
                                z142 = true;
                            }
                            kpVar.s = z142;
                            kpVar.h = koVar15.y0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            zv0 zv0Var = new zv0(koVar16.w0);
                            zv0Var.v = new co(koVar16, 4);
                            koVar16.presentFragment(zv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            b60 b60Var = new b60(-koVar17.x0.id);
                            b60Var.c = koVar17.L0;
                            b60Var.l0 = koVar17;
                            koVar17.presentFragment(b60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.w0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.I0 || koVar18.x0.gigagroup) && !ChatObject.isCommunity(koVar18.x0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.y0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            kh0 kh0Var = new kh0(koVar19.w0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = koVar19.y0;
                            kh0Var.g0(chatFull8, chatFull8.exported_invite);
                            koVar19.presentFragment(kh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.x0)) {
                                koVar20.presentFragment(new ah.a0(koVar20.w0, koVar20.y0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.w0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.F = new ArrayList();
                                long j132 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j132;
                                TLRPC.ChatFull chatFull9 = koVar20.y0;
                                rpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (rpVar.a == null) {
                                        rpVar.a = rpVar.getMessagesController().getChat(Long.valueOf(j132));
                                    }
                                    rpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        rpVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        rpVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i192 = 0; i192 < tL_chatReactionsSome.reactions.size(); i192++) {
                                            if (tL_chatReactionsSome.reactions.get(i192) instanceof TLRPC.TL_reactionEmoji) {
                                                rpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i192)).emoticon);
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
                            bundle6.putLong("chat_id", koVar21.w0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.w0);
                            koVar21.presentFragment(new sn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.z6 z6Var22 = new org.telegram.ui.Cells.z6(context2);
            koVar2.e0 = z6Var22;
            rVar.addView(z6Var22, w7.z5.n(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        koVar2.c = undoView2;
        kdVar.addView(undoView2, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        org.telegram.ui.Components.qu quVar62 = koVar2.v;
        TLRPC.User user32 = koVar2.D0;
        quVar62.setText(Emoji.replaceEmoji(user32 == null ? ContactsController.formatName(user32) : koVar2.x0.title, koVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.qu quVar72 = koVar2.v;
        quVar72.setSelection(quVar72.n());
        chatFull = koVar2.y0;
        if (chatFull == null) {
        }
        koVar2.k0();
        koVar2.p0(true, false);
        return koVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.x0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
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
        org.telegram.ui.Cells.q8 q8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z11 = true;
        long j10 = this.C0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.w0) {
                if (this.y0 == null && (editTextBoldCursor = this.E) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.y0 == null;
                this.y0 = chatFull;
                f0();
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
                        q8Var = this.Q;
                        if (q8Var != null) {
                            q8Var.getCheckBox().setIcon(this.G0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.G0 = z10;
                    q8Var = this.Q;
                    if (q8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.x0) && !this.y0.hidden_prehistory) {
                    z11 = false;
                }
                this.J0 = z11;
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
            if (this.w0 != longValue) {
                return;
            }
            this.F0 = booleanValue;
            this.H0 = booleanValue2;
            org.telegram.ui.Cells.q8 q8Var2 = this.Q;
            if (q8Var2 != null) {
                q8Var2.setChecked(booleanValue);
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
            if (chat == null || chat.id != this.w0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.z0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.A0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.B0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var == null || d5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.w0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.y0 = chatFull4;
                if (chatFull4 != null) {
                    this.K0 = chatFull4.available_reactions;
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
                if (i10 == NotificationCenter.dialogDeleted && (-this.w0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
                    if (d5Var2 == null || d5Var2.getLastFragment() != this) {
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
                ai.k0 g10 = ai.k0.g(this.currentAccount);
                this.n0.setVisibility(g10.a(j10) ? 0 : 8);
                this.n0.u(ai.md.Y0(false, TextUtils.concat("XTR", ai.md.K0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.q8 q8Var3 = this.l0;
                if (q8Var3 != null) {
                    q8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.S.setVisibility((this.n0.getVisibility() == 0 || this.m0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.m0 != null) {
                ai.k0 g11 = ai.k0.g(this.currentAccount);
                this.m0.setVisibility(g11.b(j10) ? 0 : 8);
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
                this.m0.u(spannableStringBuilder, true);
                org.telegram.ui.Cells.q8 q8Var4 = this.l0;
                if (q8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z11 = false;
                    }
                    q8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.S;
                if (this.n0.getVisibility() != 0 && this.m0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        if (this.C0 != 0) {
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.qu quVar2 = this.v;
            if ((quVar2 == null || this.D0.first_name.equals(quVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
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
            TLRPC.ChatFull chatFull = this.y0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory == this.J0) && (((quVar = this.v) == null || this.x0.title.equals(quVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.F0 == this.x0.forum))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.R = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.I0) {
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
        if (this.f0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.w0);
        TLRPC.ChatFull chatFull = this.y0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.f0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ lu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        jo joVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.h6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(joVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b0, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b0, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.W, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.V, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.q8 q8Var = this.U;
        if (q8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(q8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.U, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.h6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.qu quVar = this.v;
        int i14 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(quVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c0, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.e0, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.d0, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, new Class[]{org.telegram.ui.Cells.d9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, new Class[]{org.telegram.ui.Cells.d9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
        int i17 = org.telegram.ui.ActionBar.h6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.O, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.q8 q8Var2 = this.K;
        if (q8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(q8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.K, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.q8 q8Var3 = this.a0;
        if (q8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(q8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.a0, 4, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.a0, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.w0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new bo(this, 0));
    }

    public final void i0() {
        this.s.n(this.v0 != null, new eo(this, 0), new w5(this, 5), 0);
        this.R0.M(0);
        this.R0.P(43);
        this.b0.e.d();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.qu quVar;
        String str;
        String str2;
        if (this.N0 || (quVar = this.v) == null) {
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
        this.N0 = true;
        int i10 = 3;
        String str3 = "";
        if (this.D0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.D0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.D0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.E0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.E.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new ai.e0(this, getConnectionsManager().sendRequest(setbotinfo, new xc(7, this, setbotinfo)), i10));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.x0) && (!this.J0 || this.F0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.w0, this, new co(this, 5));
            return;
        }
        if (this.y0 != null && ChatObject.isChannel(this.x0)) {
            TLRPC.ChatFull chatFull = this.y0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.J0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().toggleChannelInvitesHistory(this.w0, this.J0);
            }
        }
        if (this.s.g()) {
            this.M0 = true;
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, null);
            this.b = b2Var;
            b2Var.setOnCancelListener(new jg(this, r0));
            this.b.show();
            return;
        }
        if (!this.x0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.w0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.y0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.w0, this.E.getText().toString(), this.y0);
        }
        boolean z12 = this.F0;
        TLRPC.Chat chat = this.x0;
        if (z12 != chat.forum || this.H0 != chat.forum_tabs) {
            r0 = this.H0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.w0, this.F0, this.H0);
            if (this.F0 && !this.H0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i11 = 0; i11 < fragmentStack.size(); i11++) {
                    if ((fragmentStack.get(i11) instanceof sn) && ((sn) fragmentStack.get(i11)).getArguments().getLong("chat_id") == this.w0) {
                        ((ActionBarLayout) getParentLayout()).Y(i11);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
                        HashSet hashSet = te1.n1;
                        ((ActionBarLayout) parentLayout).c(i11, te1.E0(getMessagesController(), getMessagesStorage(), bundle));
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
        if (this.e == null || this.O0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.w0));
        long j10 = this.C0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.D0 = user;
        this.x0 = chat;
        org.telegram.ui.Components.h9 h9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(h9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.v0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, h9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.g()) {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.R0 == null) {
                        this.R0 = new org.telegram.ui.Components.uj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.b0.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.b0.e.setAnimation(this.R0);
                }
                if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                    PhotoViewer.t1().y0();
                }
                if (this.Z == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.x0)) {
                    this.Z.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.b0 != null) {
        }
        if (PhotoViewer.D1()) {
            PhotoViewer.t1().y0();
        }
        if (this.Z == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.r5 n10;
        this.y0 = chatFull;
        if (chatFull != null) {
            if (this.x0 == null) {
                this.x0 = getMessagesController().getChat(Long.valueOf(this.w0));
            }
            this.J0 = !ChatObject.isChannel(this.x0) || this.y0.hidden_prehistory;
            this.K0 = this.y0.available_reactions;
            ArrayList arrayList = this.P0;
            arrayList.clear();
            TLRPC.Chat chat = this.x0;
            TLRPC.ChatFull chatFull2 = this.y0;
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
            if (this.Z != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.x0)) {
                this.Z.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.E0 = userFull;
        if (userFull != null) {
            if (this.D0 == null) {
                long j10 = this.C0;
                this.D0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.q8 q8Var = this.o0;
            if (q8Var != null) {
                q8Var.f(45, this.E0 == null, true);
                TLRPC.UserFull userFull2 = this.E0;
                if (userFull2 != null) {
                    this.o0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.q8 q8Var2 = this.u0;
            if (q8Var2 != null) {
                TLRPC.UserFull userFull3 = this.E0;
                q8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.d9 d9Var = this.t0;
            if (d9Var != null) {
                TLRPC.UserFull userFull4 = this.E0;
                d9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
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
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.q8 q8Var2;
        fp0 fp0Var;
        int w02;
        ArrayList<Integer> arrayList;
        po0 po0Var = this.L;
        if (po0Var != null) {
            TLRPC.Chat chat = this.x0;
            org.telegram.ui.Cells.q8 q8Var3 = this.N;
            boolean z10 = (q8Var3 != null && q8Var3.getVisibility() == 0) || ((q8Var = this.Q) != null && q8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.x0) && ChatObject.hasAdminRights(this.x0)) || ((q8Var2 = this.M) != null && q8Var2.getVisibility() == 0));
            Paint paint = po0Var.n;
            int i10 = po0Var.a;
            org.telegram.ui.ActionBar.d6 d6Var = po0Var.d;
            if (chat == null) {
                return;
            }
            po0Var.v = z10;
            po0Var.r = new org.telegram.ui.Components.d11(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.h6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            fp0 fp0Var2 = po0Var.w;
            if (fp0Var2 != null) {
                fp0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = fp0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                po0Var.w = new fp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    fp0Var = fp0.c(i10, ChatObject.getProfileColorId(chat));
                    fp0Var.a = AndroidUtilities.dp(11.0f);
                    fp0Var.d();
                } else {
                    fp0Var = null;
                }
                po0Var.w = fp0Var;
            }
            fp0 fp0Var3 = po0Var.w;
            if (fp0Var3 != null) {
                fp0Var3.e(po0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                po0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.1f, i13));
                fp0 fp0Var4 = new fp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                fp0Var4.a = AndroidUtilities.dp(11.0f);
                fp0Var4.d();
                po0Var.x = fp0Var4;
                fp0Var4.e(po0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.h6.r8[colorId];
                po0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.h6.w0(i14, d6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    po0Var.s = -1;
                    w02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.h6.r8[0];
                    po0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.h6.w0(i15, d6Var);
                }
            }
            po0Var.r.o(w02);
            paint.setColor(org.telegram.ui.ActionBar.h6.m1(0.1f, w02));
            fp0 a10 = fp0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            po0Var.x = a10;
            a10.e(po0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
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
    @Override // org.telegram.ui.ActionBar.n2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.w0;
        long j11 = this.C0;
        boolean z10 = true;
        if (j10 == 0) {
            TLRPC.User user = j11 == 0 ? null : getMessagesController().getUser(Long.valueOf(j11));
            this.D0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j11);
                this.D0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.D0, true);
                    if (this.E0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.E0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.x0;
            org.telegram.ui.Components.h9 h9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.e50 e50Var = this.s;
            e50Var.a = this;
            e50Var.b = this;
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            if (this.y0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.w0));
        this.x0 = chat2;
        if (chat2 == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.w0);
            this.x0 = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.x0, true);
                if (this.y0 == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.w0, ChatObject.isChannel(this.x0), new CountDownLatch(1), false, false);
                    this.y0 = loadChatInfo;
                }
            }
            return false;
        }
        chat = this.x0;
        org.telegram.ui.Components.h9 h9Var2 = this.r;
        if (chat == null) {
            this.z0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.x0.banned_rights);
            this.B0 = TLRPC.TL_chatBannedRights.clone(this.x0.default_banned_rights);
            h9Var2.n(5L, this.x0.title, null);
            this.I0 = ChatObject.isChannel(this.x0) && !this.x0.megagroup;
            TLRPC.Chat chat3 = this.x0;
            boolean z11 = chat3.forum;
            this.F0 = z11;
            this.H0 = chat3.forum_tabs;
            if (j11 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.y0;
                }
                TLRPC.ChatFull chatFull2 = this.y0;
                if (chatFull2 != null) {
                }
                this.G0 = z10;
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
                getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
            }
            z10 = false;
            this.G0 = z10;
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            h9Var2.n(5L, this.D0.first_name, null);
            this.I0 = false;
            this.F0 = false;
            this.H0 = false;
            this.G0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.e50 e50Var2 = this.s;
        e50Var2.a = this;
        e50Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.y0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.e50 e50Var = this.s;
        if (e50Var != null) {
            e50Var.d();
        }
        if (this.x0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.D0.bot) {
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

    @Override // org.telegram.ui.ActionBar.n2
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

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.P0;
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
            undoView.e(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        org.telegram.ui.Cells.q8 q8Var;
        org.telegram.ui.Cells.q8 q8Var2;
        org.telegram.ui.Cells.q8 q8Var3;
        org.telegram.ui.Cells.q8 q8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.q8 q8Var5;
        org.telegram.ui.Cells.q8 q8Var6;
        org.telegram.ui.Cells.q8 q8Var7;
        org.telegram.ui.Cells.q8 q8Var8;
        org.telegram.ui.Cells.q8 q8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.w0))) != null) {
            this.x0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.x0);
        org.telegram.ui.Cells.d9 d9Var = this.P;
        if (d9Var != null) {
            d9Var.setVisibility((this.I != null || ((q8Var7 = this.J) != null && q8Var7.getVisibility() == 0) || (((q8Var8 = this.N) != null && q8Var8.getVisibility() == 0) || ((q8Var9 = this.H) != null && q8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.q8 q8Var10 = this.Y;
        if (q8Var10 != null) {
            q8Var10.setVisibility(ChatObject.isChannel(this.x0) ? 0 : 8);
        }
        org.telegram.ui.Cells.q8 q8Var11 = this.J;
        if (q8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.y0;
            if (chatFull2 == null || (!this.I0 && chatFull2.linked_chat_id == 0)) {
                q8Var11.setVisibility(8);
            } else {
                q8Var11.setVisibility(0);
                if (this.y0.linked_chat_id == 0) {
                    this.J.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.y0.linked_chat_id));
                    if (chat2 == null) {
                        this.J.setVisibility(8);
                    } else if (this.I0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.J.s(LocaleController.getString("Discussion", R.string.Discussion), r4.c.h("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.q8 q8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.q8 q8Var13 = this.Q;
                            q8Var12.s(string2, str4, false, i16, q8Var13 != null && q8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.q8 q8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String h = r4.c.h("@", publicUsername2);
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.q8 q8Var15 = this.Q;
                            q8Var14.s(string3, h, false, i17, q8Var15 != null && q8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.q8 q8Var16 = this.H;
        if (q8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.y0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                q8Var16.setVisibility(8);
            } else {
                q8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.y0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.H.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.H.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            }
        }
        if (this.I != null) {
            TLRPC.ChatFull chatFull4 = this.y0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.x0.noforwards;
                if (this.I0) {
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
                if (this.I0) {
                    org.telegram.ui.Cells.q8 q8Var17 = this.I;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i18 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.q8 q8Var18 = this.N;
                    q8Var17.s(string4, str5, false, i18, (q8Var18 != null && q8Var18.getVisibility() == 0) || ((q8Var3 = this.J) != null && q8Var3.getVisibility() == 0) || ((q8Var4 = this.Q) != null && q8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.q8 q8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i19 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.q8 q8Var20 = this.N;
                    q8Var19.s(string5, str5, false, i19, (q8Var20 != null && q8Var20.getVisibility() == 0) || ((q8Var = this.J) != null && q8Var.getVisibility() == 0) || ((q8Var2 = this.Q) != null && q8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.x0));
                org.telegram.ui.Cells.q8 q8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i20 = R.drawable.msg_channel;
                org.telegram.ui.Cells.q8 q8Var22 = this.N;
                q8Var21.s(string7, string6, false, i20, (q8Var22 != null && q8Var22.getVisibility() == 0) || ((q8Var5 = this.J) != null && q8Var5.getVisibility() == 0) || ((q8Var6 = this.Q) != null && q8Var6.getVisibility() == 0));
            }
        }
        if (this.N != null) {
            if (!this.J0 || this.F0) {
                i13 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i13 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.N.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i13), z11, R.drawable.msg_discuss, this.Q != null);
            this.N.setEnabled(!this.F0);
            boolean z14 = (this.F0 || isPublic || ((chatFull = this.y0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.S0;
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
                    this.S0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.l0(12, this, arrayList));
                    this.S0.addListener(new ah.q0(this, z14, arrayList, 5));
                    this.S0.setDuration(320L);
                    this.S0.setInterpolator(org.telegram.ui.Components.bs.h);
                    this.S0.start();
                } else {
                    this.N.setAlpha(z14 ? 1.0f : 0.0f);
                    this.N.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.N.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.N.setVisibility(z14 ? 0 : 8);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY(0.0f);
                    }
                    this.S0 = null;
                }
            }
        }
        if (this.T != null) {
            if (this.y0 != null) {
                org.telegram.ui.Cells.q8 q8Var23 = this.U;
                if (q8Var23 != null) {
                    if (q8Var23.getParent() == null) {
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, w7.z5.n(-1, -2));
                    }
                    this.U.setVisibility(this.y0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    if (ChatObject.isChannel(this.x0)) {
                        this.T.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.T.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.y0.participants.participants.size())), false, R.drawable.msg_groups, this.U.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.x0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i25 = this.F0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.x0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i10 = jr.n0(tL_chatBannedRights) + i26;
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
                            i11 = i25;
                        } else {
                            i10 = i25;
                            i11 = i10;
                        }
                        z12 = z11;
                        this.X.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.q8 q8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.y0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i27 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.q8 q8Var25 = this.Y;
                        q8Var24.s(string8, format, false, i27, q8Var25 != null && q8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.q8 q8Var26 = this.U;
                    if (q8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.y0.requests_pending));
                        int i28 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.q8 q8Var27 = this.Y;
                        q8Var26.s(string9, format2, false, i28, q8Var27 != null && q8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.y0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.q8 q8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.y0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i29 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.q8 q8Var29 = this.Y;
                    q8Var28.s(string10, format3, false, i29, q8Var29 != null && q8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.q8 q8Var30 = this.W;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.x0)) {
                    i12 = this.y0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.y0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i30 = 0;
                        for (int i31 = 0; i31 < size; i31++) {
                            TLRPC.ChatParticipant chatParticipant = this.y0.participants.participants.get(i31);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i30++;
                            }
                        }
                        i12 = i30;
                    }
                }
                q8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.I0 || ChatObject.isCommunity(this.x0)) {
                    org.telegram.ui.Cells.q8 q8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i32 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.q8 q8Var32 = this.Y;
                    q8Var31.m(i32, string12, q8Var32 != null && q8Var32.getVisibility() == 0);
                    if (this.x0.gigagroup) {
                        org.telegram.ui.Cells.q8 q8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i33 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.q8 q8Var34 = this.Y;
                        q8Var33.m(i33, string13, q8Var34 != null && q8Var34.getVisibility() == 0);
                    } else {
                        this.X.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.q8 q8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i34 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.q8 q8Var36 = this.Y;
                    q8Var35.m(i34, string14, q8Var36 != null && q8Var36.getVisibility() == 0);
                }
                this.W.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.O.setVisibility(ChatObject.canChangeChatInfo(this.x0) ? 0 : 8);
            s0(z12);
            if (this.y0 == null || !ChatObject.canUserDoAdminAction(this.x0, 3) || (isPublic && this.x0.creator)) {
                this.V.setVisibility(8);
            } else if (this.y0.invitesCount > 0) {
                this.V.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.y0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.V.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
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
                if (snVar.getArguments().getLong("chat_id") == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(snVar, false);
                    snVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, snVar);
                    if (!this.H0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.w0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new te1(bundle));
                        i10++;
                    }
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof te1)) {
                te1 te1Var = (te1) fragmentStack.get(i10);
                if (te1Var.g() != null && te1Var.g().id == this.w0) {
                    ((ActionBarLayout) getParentLayout()).a0(te1Var, false);
                    i10--;
                }
            } else if (this.H0 && (fragmentStack.get(i10) instanceof ey) && (eyVar = (ey) fragmentStack.get(i10)) != null && (ywVar = eyVar.G3) != null && ywVar.c()) {
                eyVar.G3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.l0 == null) {
            return;
        }
        if (this.D0.usernames.size() <= 1) {
            this.l0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.D0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.D0.usernames;
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
        this.l0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.D0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.w0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.x0);
        TLRPC.ChatReactions chatReactions = this.K0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string;
                this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
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
        this.O.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        TLRPC.Chat chat = this.x0;
        if (chat == null || this.K == null) {
            return;
        }
        long j10 = 0;
        if (!(l4 != null ? l4.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.K.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.x0.linked_monoforum_id));
        if (l4 != null) {
            j10 = l4.longValue();
        } else if (chat2 != null) {
            j10 = chat2.send_paid_messages_stars;
        }
        this.K.s(LocaleController.getString(R.string.PostSuggestions), ai.md.Y0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }
}
