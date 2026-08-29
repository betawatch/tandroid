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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class ko extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.r40, NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor A;
    public TLRPC.UserFull A0;
    public LinearLayout B;
    public boolean B0;
    public org.telegram.ui.Cells.x6 C;
    public boolean C0;
    public org.telegram.ui.Cells.m8 D;
    public boolean D0;
    public org.telegram.ui.Cells.m8 E;
    public boolean E0;
    public org.telegram.ui.Cells.m8 F;
    public boolean F0;
    public org.telegram.ui.Cells.m8 G;
    public TLRPC.ChatReactions G0;
    public go0 H;
    public TL_stories.TL_premium_boostsStatus H0;
    public org.telegram.ui.Cells.m8 I;
    public boolean I0;
    public org.telegram.ui.Cells.m8 J;
    public boolean J0;
    public org.telegram.ui.Cells.m8 K;
    public boolean K0;
    public org.telegram.ui.Cells.y8 L;
    public final ArrayList L0;
    public org.telegram.ui.Cells.m8 M;
    public final io M0;
    public LinearLayout N;
    public org.telegram.ui.Components.xi0 N0;
    public LinearLayout O;
    public ValueAnimator O0;
    public org.telegram.ui.Cells.m8 P;
    public org.telegram.ui.Cells.m8 Q;
    public org.telegram.ui.Cells.m8 R;
    public org.telegram.ui.Cells.m8 S;
    public org.telegram.ui.Cells.m8 T;
    public org.telegram.ui.Cells.m8 U;
    public org.telegram.ui.Cells.m8 V;
    public org.telegram.ui.Cells.m8 W;
    public jo X;
    public FrameLayout Y;
    public org.telegram.ui.Cells.y9 Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.x6 a0;
    public org.telegram.ui.ActionBar.c2 b;
    public org.telegram.ui.Cells.m8 b0;
    public UndoView c;
    public org.telegram.ui.Cells.m8 c0;
    public LinearLayout d;
    public rh.a d0;
    public lh.y3 e;
    public org.telegram.ui.Cells.y8 e0;
    public cg.i0 f;
    public org.telegram.ui.Cells.m8 f0;
    public org.telegram.ui.Cells.y8 g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.m8 h0;
    public org.telegram.ui.Cells.m8 i0;
    public org.telegram.ui.Cells.m8 j0;
    public org.telegram.ui.Cells.m8 k0;
    public org.telegram.ui.Cells.m8 l0;
    public org.telegram.ui.Cells.m8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.m8 n0;
    public org.telegram.ui.Cells.y8 o0;
    public org.telegram.ui.Cells.y8 p0;
    public org.telegram.ui.Cells.m8 q0;
    public final org.telegram.ui.Components.e9 r;
    public TLRPC.FileLocation r0;
    public final org.telegram.ui.Components.s40 s;
    public long s0;
    public TLRPC.Chat t0;
    public TLRPC.ChatFull u0;
    public org.telegram.ui.Components.au v;
    public TLRPC.TL_chatAdminRights v0;
    public bg.y3 w;
    public TLRPC.TL_chatBannedRights w0;
    public org.telegram.ui.Components.un0 x;
    public TLRPC.TL_chatBannedRights x0;
    public LinearLayout y;
    public final long y0;
    public TLRPC.User z0;

    public ko(Bundle bundle) {
        super(bundle);
        this.L0 = new ArrayList();
        this.M0 = new io(this);
        this.r = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
        this.s0 = bundle.getLong("chat_id", 0L);
        this.y0 = bundle.getLong("user_id", 0L);
        if (this.s0 == 0) {
            this.s = new org.telegram.ui.Components.s40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.s0));
            this.s = new org.telegram.ui.Components.s40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(ko koVar, FrameLayout frameLayout, View view) {
        if (!koVar.C0) {
            TLRPC.ChatFull chatFull = koVar.u0;
            org.telegram.ui.Components.tc.a0(koVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", koVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -koVar.s0;
        xy xyVar = new xy(null);
        xyVar.a = j10;
        xyVar.setResourceProvider(koVar.resourceProvider);
        boolean z10 = koVar.B0;
        boolean z11 = koVar.D0;
        bh.v vVar = new bh.v(14, koVar, view);
        xyVar.c = z10;
        xyVar.d = z11;
        xyVar.f = vVar;
        koVar.presentFragment(xyVar);
    }

    public static /* synthetic */ void V(ko koVar) {
        koVar.r0 = null;
        long j10 = koVar.y0;
        if (j10 == 0) {
            MessagesController.getInstance(koVar.currentAccount).changeChatAvatar(koVar.s0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = koVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            koVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new co(koVar, 2));
        }
        koVar.n0(false, true);
        lh.y3 y3Var = koVar.e;
        org.telegram.ui.Components.e9 e9Var = koVar.r;
        Object obj = koVar.z0;
        if (obj == null) {
            obj = koVar.t0;
        }
        y3Var.h(null, null, e9Var, obj);
        koVar.N0.K(0);
        koVar.X.e.d();
    }

    public static void X(ko koVar) {
        int i10 = koVar.currentAccount;
        long j10 = koVar.y0;
        TL_bots.botVerifierSettings botverifiersettings = koVar.A0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e10 = org.telegram.messenger.x3.e(16, "onlySelect", "dialogsType", true);
        e10.putBoolean("resetDelegate", false);
        fy fyVar = new fy(e10);
        fyVar.setCurrentAccount(i10);
        fyVar.y2 = new org.telegram.ui.Components.u1(fyVar, i10, j10, botverifiersettings);
        U.presentFragment(fyVar);
    }

    public static void Y(ko koVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        c2Var.dismiss();
        if (koVar.getParentActivity() == null) {
            return;
        }
        cg.v0 v0Var = new cg.v0(35, koVar.currentAccount, koVar.getParentActivity(), koVar, koVar.getResourceProvider());
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = koVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.M0 = new vf(17, koVar, chat);
        }
        koVar.showDialog(v0Var);
    }

    public static void Z(ko koVar) {
        vc vcVar = new vc(-koVar.t0.id);
        vcVar.h0 = koVar;
        koVar.presentFragment(vcVar);
        MessagesController.getInstance(koVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(koVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(ko koVar) {
        koVar.K0 = true;
        NotificationCenter.getInstance(koVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        n00 n00Var = new n00(10);
        n00Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        n00Var.f = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false);
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

    @Override // org.telegram.ui.Components.r40
    public final void D(float f9) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f9);
    }

    @Override // org.telegram.ui.Components.r40
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.r40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new wc(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x080e  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        final ko koVar;
        bg.y3 y3Var;
        Context context2;
        final int i10;
        final int i11;
        int i12;
        int i13;
        int i14;
        CharSequence charSequence;
        boolean z10;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        Context context3;
        final ko koVar2;
        boolean z11;
        String format;
        int i15;
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        int i16;
        int i17;
        org.telegram.ui.Cells.m8 m8Var3;
        org.telegram.ui.Cells.m8 m8Var4;
        org.telegram.ui.Cells.m8 m8Var5;
        org.telegram.ui.Cells.m8 m8Var6;
        TLRPC.ChatFull chatFull;
        boolean z12;
        Context context4;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i18 = 1;
        org.telegram.ui.Components.au auVar = this.v;
        if (auVar != null) {
            auVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg.n1(this, 17));
        dd ddVar = new dd(i18, context, this);
        ddVar.setOnTouchListener(new mh.d(9));
        this.fragmentView = ddVar;
        ddVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.a7));
        bg.y3 y3Var2 = new bg.y3(context);
        this.w = y3Var2;
        org.telegram.ui.Components.un0 un0Var = new org.telegram.ui.Components.un0(context, this.w, this.resourceProvider, false);
        this.x = un0Var;
        un0Var.setFillViewport(true);
        ddVar.addView(this.x, i7.f6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(y3Var2, new FrameLayout.LayoutParams(-1, -2));
        y3Var2.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.d6));
        y3Var2.addView(this.d, i7.f6.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, i7.f6.n(-1, -2));
        int i19 = 5;
        lh.y3 y3Var3 = new lh.y3(this, context, i19);
        this.e = y3Var3;
        y3Var3.setRoundRadius(this.B0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.z0 != null || ChatObject.canChangeChatInfo(this.t0)) {
            lh.y3 y3Var4 = this.e;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(y3Var4, i7.f6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            cg.i0 i0Var = new cg.i0(this, context, paint, i19);
            this.f = i0Var;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(i0Var, i7.f6.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, i7.f6.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j10 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                                        int i20 = chatPhoto2.dc_id;
                                        if (i20 != 0) {
                                            chatPhoto2.photo_big.dc_id = i20;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j11 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var7 = koVar14.D;
                            boolean z16 = m8Var7 != null && m8Var7.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j11;
                            yoVar.j0 = z16;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z17 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat2 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat2;
                            if (ChatObject.isChannel(chat2) && !kpVar.f.megagroup) {
                                z17 = true;
                            }
                            kpVar.s = z17;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
        } else {
            lh.y3 y3Var5 = this.e;
            boolean z16 = LocaleController.isRTL;
            frameLayout2.addView(y3Var5, i7.f6.d(64, 64.0f, (z16 ? 5 : 3) | 48, z16 ? 0.0f : 16.0f, 12.0f, z16 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.au auVar2 = new org.telegram.ui.Components.au(context, ddVar, this);
        this.v = auVar2;
        long j10 = this.y0;
        if (j10 != 0) {
            auVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.E0) {
            auVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            auVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.au auVar3 = this.v;
        TLRPC.Chat chat = this.t0;
        auVar3.setEnabled(chat != null || ChatObject.canChangeChatInfo(chat));
        org.telegram.ui.Components.au auVar4 = this.v;
        auVar4.setFocusable(auVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new p0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.au auVar5 = this.v;
        boolean z17 = LocaleController.isRTL;
        frameLayout2.addView(auVar5, i7.f6.d(-1, -2.0f, 16, z17 ? 5.0f : 96.0f, 0.0f, z17 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        y3Var2.addView(this.y, i7.f6.n(-1, -2));
        final int i20 = 12;
        if (this.z0 != null || ChatObject.canChangeChatInfo(this.t0)) {
            jo joVar = new jo(context);
            this.X = joVar;
            joVar.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            this.X.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
            this.X.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat2 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat2.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i21 = userProfilePhoto2.dc_id;
                                        if (i21 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i21;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j11 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var7 = koVar14.D;
                            boolean z162 = m8Var7 != null && m8Var7.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j11;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat22 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat22;
                            if (ChatObject.isChannel(chat22) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.X, i7.f6.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.A = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.A.setHintTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.A;
        int i21 = org.telegram.ui.ActionBar.g6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.g6.u0(i21));
        this.A.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.A.setBackgroundDrawable(null);
        this.A.setGravity(LocaleController.isRTL ? 5 : 3);
        this.A.setInputType(180225);
        this.A.setImeOptions(6);
        this.A.setEnabled(this.z0 != null || ChatObject.canChangeChatInfo(this.t0));
        EditTextBoldCursor editTextBoldCursor3 = this.A;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.A.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.A.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.A.setCursorColor(org.telegram.ui.ActionBar.g6.u0(i21));
        this.A.setCursorSize(AndroidUtilities.dp(20.0f));
        this.A.setCursorWidth(1.5f);
        if (this.A.isEnabled()) {
            this.y.addView(this.A, i7.f6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.A, i7.f6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.A.setOnEditorActionListener(new da(this, 2));
        this.A.addTextChangedListener(new gd(1));
        org.telegram.ui.Cells.x6 x6Var = new org.telegram.ui.Cells.x6(context);
        this.C = x6Var;
        y3Var2.addView(x6Var, i7.f6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(1);
        y3Var2.addView(this.B, i7.f6.n(-1, -2));
        TLRPC.Chat chat2 = this.t0;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.u0) == null || chatFull3.can_set_location)) {
                org.telegram.ui.Cells.m8 m8Var7 = new org.telegram.ui.Cells.m8(context);
                this.D = m8Var7;
                m8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.D, i7.f6.n(-1, -2));
                final int i22 = 15;
                this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
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
                                bundle.putLong("chat_id", koVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.u0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.M0;
                                long j102 = koVar4.y0;
                                if (!koVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.u0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.u0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new ih0(koVar6.s0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new ob(koVar8.t0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.y0);
                                koVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new ph.j(koVar11.y0));
                                break;
                            case 9:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    rc0 rc0Var = new rc0(4);
                                    rc0Var.a0 = -koVar13.s0;
                                    TLRPC.ChatFull chatFull5 = koVar13.u0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    rc0Var.B0 = new eo(koVar13, 6);
                                    koVar13.presentFragment(rc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.s0;
                                org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.I = new ArrayList();
                                yoVar.J = new ArrayList();
                                yoVar.L = new ArrayList();
                                yoVar.Y = true;
                                yoVar.b0 = new ArrayList();
                                yoVar.k0 = new HashMap();
                                yoVar.m0 = new no(yoVar, 5);
                                yoVar.p0 = false;
                                yoVar.V = j11;
                                yoVar.j0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.u0;
                                yoVar.U = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.h0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.s0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.K = false;
                                kpVar.L = false;
                                kpVar.A = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.u0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                pv0 pv0Var = new pv0(koVar16.s0);
                                pv0Var.v = new eo(koVar16, 4);
                                koVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                a60 a60Var = new a60(-koVar17.t0.id);
                                a60Var.c = koVar17.H0;
                                a60Var.h0 = koVar17;
                                koVar17.presentFragment(a60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.u0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.u0;
                                hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                    koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.s0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.B = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                bundle6.putLong("chat_id", koVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                koVar21.presentFragment(new tn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.t0.creator && ((chatFull2 = this.u0) == null || chatFull2.can_set_username)) {
                org.telegram.ui.Cells.m8 m8Var8 = new org.telegram.ui.Cells.m8(context);
                this.E = m8Var8;
                m8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.E, i7.f6.n(-1, -2));
                final int i23 = 16;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
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
                                bundle.putLong("chat_id", koVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.u0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.M0;
                                long j102 = koVar4.y0;
                                if (!koVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.u0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.u0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new ih0(koVar6.s0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new ob(koVar8.t0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.y0);
                                koVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new ph.j(koVar11.y0));
                                break;
                            case 9:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    rc0 rc0Var = new rc0(4);
                                    rc0Var.a0 = -koVar13.s0;
                                    TLRPC.ChatFull chatFull5 = koVar13.u0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    rc0Var.B0 = new eo(koVar13, 6);
                                    koVar13.presentFragment(rc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.s0;
                                org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.I = new ArrayList();
                                yoVar.J = new ArrayList();
                                yoVar.L = new ArrayList();
                                yoVar.Y = true;
                                yoVar.b0 = new ArrayList();
                                yoVar.k0 = new HashMap();
                                yoVar.m0 = new no(yoVar, 5);
                                yoVar.p0 = false;
                                yoVar.V = j11;
                                yoVar.j0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.u0;
                                yoVar.U = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.h0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.s0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.K = false;
                                kpVar.L = false;
                                kpVar.A = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.u0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                pv0 pv0Var = new pv0(koVar16.s0);
                                pv0Var.v = new eo(koVar16, 4);
                                koVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                a60 a60Var = new a60(-koVar17.t0.id);
                                a60Var.c = koVar17.H0;
                                a60Var.h0 = koVar17;
                                koVar17.presentFragment(a60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.u0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.u0;
                                hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                    koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.s0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.B = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                bundle6.putLong("chat_id", koVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                koVar21.presentFragment(new tn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.t0) && ((this.E0 && ChatObject.canUserDoAdminAction(this.t0, 1)) || (!this.E0 && ChatObject.canUserDoAdminAction(this.t0, 0)))) {
                org.telegram.ui.Cells.m8 m8Var9 = new org.telegram.ui.Cells.m8(context);
                this.F = m8Var9;
                m8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.F, i7.f6.n(-1, -2));
                final int i24 = 17;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.u0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.M0;
                                long j102 = koVar4.y0;
                                if (!koVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.u0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.u0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new ih0(koVar6.s0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new ob(koVar8.t0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.y0);
                                koVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new ph.j(koVar11.y0));
                                break;
                            case 9:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    rc0 rc0Var = new rc0(4);
                                    rc0Var.a0 = -koVar13.s0;
                                    TLRPC.ChatFull chatFull5 = koVar13.u0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    rc0Var.B0 = new eo(koVar13, 6);
                                    koVar13.presentFragment(rc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.s0;
                                org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.I = new ArrayList();
                                yoVar.J = new ArrayList();
                                yoVar.L = new ArrayList();
                                yoVar.Y = true;
                                yoVar.b0 = new ArrayList();
                                yoVar.k0 = new HashMap();
                                yoVar.m0 = new no(yoVar, 5);
                                yoVar.p0 = false;
                                yoVar.V = j11;
                                yoVar.j0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.u0;
                                yoVar.U = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.h0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.s0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.K = false;
                                kpVar.L = false;
                                kpVar.A = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.u0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                pv0 pv0Var = new pv0(koVar16.s0);
                                pv0Var.v = new eo(koVar16, 4);
                                koVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                a60 a60Var = new a60(-koVar17.t0.id);
                                a60Var.c = koVar17.H0;
                                a60Var.h0 = koVar17;
                                koVar17.presentFragment(a60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.u0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.u0;
                                hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                    koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.s0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.B = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                bundle6.putLong("chat_id", koVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                koVar21.presentFragment(new tn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.t0) && this.E0 && ChatObject.canUserDoAdminAction(this.t0, 1)) {
                org.telegram.ui.Cells.m8 m8Var10 = new org.telegram.ui.Cells.m8(context);
                this.G = m8Var10;
                m8Var10.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                this.G.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.B.addView(this.G, i7.f6.n(-1, -2));
                final int i25 = 18;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.u0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.M0;
                                long j102 = koVar4.y0;
                                if (!koVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.u0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.u0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new ih0(koVar6.s0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new ob(koVar8.t0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.y0);
                                koVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new ph.j(koVar11.y0));
                                break;
                            case 9:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    rc0 rc0Var = new rc0(4);
                                    rc0Var.a0 = -koVar13.s0;
                                    TLRPC.ChatFull chatFull5 = koVar13.u0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    rc0Var.B0 = new eo(koVar13, 6);
                                    koVar13.presentFragment(rc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.s0;
                                org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.I = new ArrayList();
                                yoVar.J = new ArrayList();
                                yoVar.L = new ArrayList();
                                yoVar.Y = true;
                                yoVar.b0 = new ArrayList();
                                yoVar.k0 = new HashMap();
                                yoVar.m0 = new no(yoVar, 5);
                                yoVar.p0 = false;
                                yoVar.V = j11;
                                yoVar.j0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.u0;
                                yoVar.U = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.h0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.s0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.K = false;
                                kpVar.L = false;
                                kpVar.A = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.u0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                pv0 pv0Var = new pv0(koVar16.s0);
                                pv0Var.v = new eo(koVar16, 4);
                                koVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                a60 a60Var = new a60(-koVar17.t0.id);
                                a60Var.c = koVar17.H0;
                                a60Var.h0 = koVar17;
                                koVar17.presentFragment(a60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.u0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.u0;
                                hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                    koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.s0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.B = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                bundle6.putLong("chat_id", koVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                koVar21.presentFragment(new tn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.t0) && ChatObject.canChangeChatInfo(this.t0)) {
                z12 = true;
                y3Var = y3Var2;
                go0 go0Var = new go0(this.currentAccount, -this.t0.id, context, getResourceProvider());
                this.H = go0Var;
                go0Var.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                this.B.addView(this.H, i7.f6.n(-1, -2));
                final int i26 = 19;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.xn
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                ko koVar3 = this.b;
                                koVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", koVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.u0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.M0;
                                long j102 = koVar4.y0;
                                if (!koVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.u0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.u0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new ih0(koVar6.s0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new ob(koVar8.t0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.y0);
                                koVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new ph.j(koVar11.y0));
                                break;
                            case 9:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    rc0 rc0Var = new rc0(4);
                                    rc0Var.a0 = -koVar13.s0;
                                    TLRPC.ChatFull chatFull5 = koVar13.u0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    rc0Var.B0 = new eo(koVar13, 6);
                                    koVar13.presentFragment(rc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j11 = koVar14.s0;
                                org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.I = new ArrayList();
                                yoVar.J = new ArrayList();
                                yoVar.L = new ArrayList();
                                yoVar.Y = true;
                                yoVar.b0 = new ArrayList();
                                yoVar.k0 = new HashMap();
                                yoVar.m0 = new no(yoVar, 5);
                                yoVar.p0 = false;
                                yoVar.V = j11;
                                yoVar.j0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.u0;
                                yoVar.U = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.h0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.s0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.K = false;
                                kpVar.L = false;
                                kpVar.A = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.u0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                pv0 pv0Var = new pv0(koVar16.s0);
                                pv0Var.v = new eo(koVar16, 4);
                                koVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                a60 a60Var = new a60(-koVar17.t0.id);
                                a60Var.c = koVar17.H0;
                                a60Var.h0 = koVar17;
                                koVar17.presentFragment(a60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.u0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.u0;
                                hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                    koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.s0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.B = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                bundle6.putLong("chat_id", koVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                koVar21.presentFragment(new tn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                y3Var = y3Var2;
                z12 = true;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.t0) || ChatObject.isCommunity(this.t0)) {
                context4 = context;
                frameLayout = frameLayout2;
                koVar = this;
            } else {
                long j11 = -this.t0.id;
                org.telegram.ui.Cells.m8 m8Var11 = new org.telegram.ui.Cells.m8(23, context, this.resourceProvider, false, true);
                context4 = context;
                this.I = m8Var11;
                m8Var11.setBackground(org.telegram.ui.ActionBar.g6.K0(z12));
                this.I.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.t0.autotranslation);
                final int i27 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j11, new f5.d(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ ko b;

                    {
                        this.b = this;
                    }

                    @Override // f5.d
                    public final void accept(Object obj) {
                        switch (i27) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ko koVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    koVar3.getClass();
                                    break;
                                } else {
                                    koVar3.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < koVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.H0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.B.addView(this.I, i7.f6.n(-1, -2));
                frameLayout = frameLayout2;
                koVar = this;
                this.I.setOnClickListener(new jh.q2(this, new boolean[]{false}, j11, 1));
            }
            if (!koVar.E0 && ChatObject.canBlockUsers(koVar.t0) && (ChatObject.isChannel(koVar.t0) || koVar.t0.creator)) {
                org.telegram.ui.Cells.m8 m8Var12 = new org.telegram.ui.Cells.m8(context4);
                koVar.J = m8Var12;
                m8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(true));
                koVar.B.addView(koVar.J, i7.f6.n(-1, -2));
                i11 = 23;
                koVar.J.setOnClickListener(new nh.r7(i11, koVar, context4));
            } else {
                i11 = 23;
            }
            if (ChatObject.isMegagroup(koVar.t0) && ChatObject.hasAdminRights(koVar.t0) && !ChatObject.isCommunity(koVar.t0)) {
                final int i28 = 1;
                MessagesController.getInstance(koVar.currentAccount).getBoostsController().getBoostsStats(-koVar.t0.id, new f5.d(koVar) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // f5.d
                    public final void accept(Object obj) {
                        switch (i28) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ko koVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    koVar3.getClass();
                                    break;
                                } else {
                                    koVar3.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < koVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.H0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                go0 go0Var2 = new go0(koVar.currentAccount, -koVar.t0.id, context4, koVar.getResourceProvider());
                koVar.H = go0Var2;
                go0Var2.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                koVar.B.addView(koVar.H, i7.f6.n(-1, -2));
                final int i29 = 20;
                koVar.H.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                bundle.putLong("chat_id", koVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.x0(koVar3.u0);
                                koVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ko koVar4 = this.b;
                                io ioVar = koVar4.M0;
                                long j102 = koVar4.y0;
                                if (!koVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i202 = chatPhoto2.dc_id;
                                            if (i202 != 0) {
                                                chatPhoto2.photo_big.dc_id = i202;
                                            }
                                            TLRPC.ChatFull chatFull4 = koVar4.u0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, koVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i212 = userProfilePhoto2.dc_id;
                                            if (i212 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i212;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ko koVar5 = this.b;
                                koVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", koVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.x0(koVar5.u0);
                                koVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ko koVar6 = this.b;
                                koVar6.presentFragment(new ih0(koVar6.s0));
                                break;
                            case 4:
                                ko koVar7 = this.b;
                                koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                break;
                            case 5:
                                ko koVar8 = this.b;
                                koVar8.getClass();
                                koVar8.presentFragment(new ob(koVar8.t0));
                                break;
                            case 6:
                                ko koVar9 = this.b;
                                koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                break;
                            case 7:
                                ko koVar10 = this.b;
                                koVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", koVar10.y0);
                                koVar10.presentFragment(new la(bundle3));
                                break;
                            case 8:
                                ko koVar11 = this.b;
                                koVar11.presentFragment(new ph.j(koVar11.y0));
                                break;
                            case 9:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                ko.X(this.b);
                                break;
                            case 14:
                                ko koVar12 = this.b;
                                org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                break;
                            case 15:
                                ko koVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                    rc0 rc0Var = new rc0(4);
                                    rc0Var.a0 = -koVar13.s0;
                                    TLRPC.ChatFull chatFull5 = koVar13.u0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    rc0Var.B0 = new eo(koVar13, 6);
                                    koVar13.presentFragment(rc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ko koVar14 = this.b;
                                long j112 = koVar14.s0;
                                org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                yo yoVar = new yo(null);
                                yoVar.I = new ArrayList();
                                yoVar.J = new ArrayList();
                                yoVar.L = new ArrayList();
                                yoVar.Y = true;
                                yoVar.b0 = new ArrayList();
                                yoVar.k0 = new HashMap();
                                yoVar.m0 = new no(yoVar, 5);
                                yoVar.p0 = false;
                                yoVar.V = j112;
                                yoVar.j0 = z162;
                                TLRPC.ChatFull chatFull6 = koVar14.u0;
                                yoVar.U = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        yoVar.h0 = tL_chatInviteExported;
                                    } else {
                                        yoVar.X(false);
                                    }
                                }
                                koVar14.presentFragment(yoVar);
                                break;
                            case 17:
                                ko koVar15 = this.b;
                                long j12 = koVar15.s0;
                                kp kpVar = new kp(null);
                                kpVar.v = new ArrayList();
                                boolean z172 = false;
                                kpVar.K = false;
                                kpVar.L = false;
                                kpVar.A = j12;
                                TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                kpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                    z172 = true;
                                }
                                kpVar.s = z172;
                                kpVar.h = koVar15.u0;
                                koVar15.presentFragment(kpVar);
                                break;
                            case 18:
                                ko koVar16 = this.b;
                                pv0 pv0Var = new pv0(koVar16.s0);
                                pv0Var.v = new eo(koVar16, 4);
                                koVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ko.Z(this.b);
                                break;
                            case 20:
                                ko koVar17 = this.b;
                                a60 a60Var = new a60(-koVar17.t0.id);
                                a60Var.c = koVar17.H0;
                                a60Var.h0 = koVar17;
                                koVar17.presentFragment(a60Var);
                                break;
                            case 21:
                                ko koVar18 = this.b;
                                koVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", koVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.x0(koVar18.u0);
                                koVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ko koVar19 = this.b;
                                hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = koVar19.u0;
                                hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                koVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ko koVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                    koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", koVar20.s0);
                                    rp rpVar = new rp(bundle5);
                                    rpVar.d = new ArrayList();
                                    rpVar.r = new ArrayList();
                                    rpVar.v = -1;
                                    rpVar.B = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    rpVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                bundle6.putLong("chat_id", koVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                koVar21.presentFragment(new tn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!koVar.E0 && koVar.t0.creator) {
                org.telegram.ui.Cells.m8 m8Var13 = new org.telegram.ui.Cells.m8(23, context, null, false, true);
                context2 = context;
                koVar.M = m8Var13;
                m8Var13.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
                koVar.M.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), koVar.B0);
                koVar.M.getCheckBox().setIcon(koVar.C0 ? 0 : R.drawable.permission_locked);
                koVar.B.addView(koVar.M, i7.f6.c(-2.0f, -1));
                i10 = 24;
                koVar.M.setOnClickListener(new nh.r7(i10, koVar, frameLayout));
            } else {
                context2 = context;
                i10 = 24;
            }
            koVar.o0();
        } else {
            koVar = this;
            y3Var = y3Var2;
            context2 = context;
            i10 = 24;
            i11 = 23;
        }
        org.telegram.ui.ActionBar.a0 n10 = koVar.actionBar.n();
        if (koVar.z0 != null || ChatObject.canChangeChatInfo(koVar.t0) || koVar.J != null) {
            org.telegram.ui.ActionBar.w0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            koVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (koVar.D == null && koVar.J == null && koVar.E == null && koVar.F == null && koVar.M == null) {
            i13 = -1;
            i14 = -2;
            i12 = 12;
        } else {
            i12 = 12;
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context2, 12, koVar.resourceProvider);
            koVar.L = y8Var;
            if (koVar.M != null) {
                y8Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                y8Var.setFixedSize(12);
            }
            i13 = -1;
            i14 = -2;
            y3Var.addView(koVar.L, i7.f6.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        koVar.N = linearLayout4;
        linearLayout4.setOrientation(1);
        y3Var.addView(koVar.N, i7.f6.n(i13, i14));
        final int i30 = 8;
        if (koVar.t0 != null) {
            org.telegram.ui.Cells.m8 m8Var14 = new org.telegram.ui.Cells.m8(context2);
            koVar.T = m8Var14;
            m8Var14.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            org.telegram.ui.Cells.m8 m8Var15 = koVar.T;
            if (!ChatObject.isChannel(koVar.t0)) {
                TLRPC.Chat chat3 = koVar.t0;
                if (!chat3.creator && (!ChatObject.hasAdminRights(chat3) || !ChatObject.canChangeChatInfo(koVar.t0))) {
                    i15 = 8;
                    m8Var15.setVisibility(i15);
                    final int i31 = 21;
                    koVar.T.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                    bundle.putLong("chat_id", koVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.u0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.M0;
                                    long j102 = koVar4.y0;
                                    if (!koVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.u0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new ih0(koVar6.s0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new ob(koVar8.t0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.y0);
                                    koVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new ph.j(koVar11.y0));
                                    break;
                                case 9:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        rc0 rc0Var = new rc0(4);
                                        rc0Var.a0 = -koVar13.s0;
                                        TLRPC.ChatFull chatFull5 = koVar13.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        rc0Var.B0 = new eo(koVar13, 6);
                                        koVar13.presentFragment(rc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.s0;
                                    org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                    boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.I = new ArrayList();
                                    yoVar.J = new ArrayList();
                                    yoVar.L = new ArrayList();
                                    yoVar.Y = true;
                                    yoVar.b0 = new ArrayList();
                                    yoVar.k0 = new HashMap();
                                    yoVar.m0 = new no(yoVar, 5);
                                    yoVar.p0 = false;
                                    yoVar.V = j112;
                                    yoVar.j0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.u0;
                                    yoVar.U = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.h0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.s0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.K = false;
                                    kpVar.L = false;
                                    kpVar.A = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.u0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    pv0 pv0Var = new pv0(koVar16.s0);
                                    pv0Var.v = new eo(koVar16, 4);
                                    koVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    a60 a60Var = new a60(-koVar17.t0.id);
                                    a60Var.c = koVar17.H0;
                                    a60Var.h0 = koVar17;
                                    koVar17.presentFragment(a60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.u0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.u0;
                                    hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                        koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.s0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.B = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                    bundle6.putLong("chat_id", koVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                    koVar21.presentFragment(new tn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var16 = new org.telegram.ui.Cells.m8(context2);
                    koVar.R = m8Var16;
                    m8Var16.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    final int i32 = 22;
                    koVar.R.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                    bundle.putLong("chat_id", koVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.u0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.M0;
                                    long j102 = koVar4.y0;
                                    if (!koVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.u0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new ih0(koVar6.s0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new ob(koVar8.t0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.y0);
                                    koVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new ph.j(koVar11.y0));
                                    break;
                                case 9:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        rc0 rc0Var = new rc0(4);
                                        rc0Var.a0 = -koVar13.s0;
                                        TLRPC.ChatFull chatFull5 = koVar13.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        rc0Var.B0 = new eo(koVar13, 6);
                                        koVar13.presentFragment(rc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.s0;
                                    org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                    boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.I = new ArrayList();
                                    yoVar.J = new ArrayList();
                                    yoVar.L = new ArrayList();
                                    yoVar.Y = true;
                                    yoVar.b0 = new ArrayList();
                                    yoVar.k0 = new HashMap();
                                    yoVar.m0 = new no(yoVar, 5);
                                    yoVar.p0 = false;
                                    yoVar.V = j112;
                                    yoVar.j0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.u0;
                                    yoVar.U = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.h0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.s0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.K = false;
                                    kpVar.L = false;
                                    kpVar.A = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.u0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    pv0 pv0Var = new pv0(koVar16.s0);
                                    pv0Var.v = new eo(koVar16, 4);
                                    koVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    a60 a60Var = new a60(-koVar17.t0.id);
                                    a60Var.c = koVar17.H0;
                                    a60Var.h0 = koVar17;
                                    koVar17.presentFragment(a60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.u0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.u0;
                                    hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                        koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.s0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.B = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                    bundle6.putLong("chat_id", koVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                    koVar21.presentFragment(new tn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var17 = new org.telegram.ui.Cells.m8(context2);
                    koVar.K = m8Var17;
                    m8Var17.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    koVar.K.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                        public final /* synthetic */ ko b;

                        {
                            this.b = koVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    ko koVar3 = this.b;
                                    koVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", koVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.u0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.M0;
                                    long j102 = koVar4.y0;
                                    if (!koVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.u0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new ih0(koVar6.s0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new ob(koVar8.t0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.y0);
                                    koVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new ph.j(koVar11.y0));
                                    break;
                                case 9:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        rc0 rc0Var = new rc0(4);
                                        rc0Var.a0 = -koVar13.s0;
                                        TLRPC.ChatFull chatFull5 = koVar13.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        rc0Var.B0 = new eo(koVar13, 6);
                                        koVar13.presentFragment(rc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.s0;
                                    org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                    boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.I = new ArrayList();
                                    yoVar.J = new ArrayList();
                                    yoVar.L = new ArrayList();
                                    yoVar.Y = true;
                                    yoVar.b0 = new ArrayList();
                                    yoVar.k0 = new HashMap();
                                    yoVar.m0 = new no(yoVar, 5);
                                    yoVar.p0 = false;
                                    yoVar.V = j112;
                                    yoVar.j0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.u0;
                                    yoVar.U = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.h0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.s0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.K = false;
                                    kpVar.L = false;
                                    kpVar.A = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.u0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    pv0 pv0Var = new pv0(koVar16.s0);
                                    pv0Var.v = new eo(koVar16, 4);
                                    koVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    a60 a60Var = new a60(-koVar17.t0.id);
                                    a60Var.c = koVar17.H0;
                                    a60Var.h0 = koVar17;
                                    koVar17.presentFragment(a60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.u0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.u0;
                                    hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                        koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.s0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.B = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                    bundle6.putLong("chat_id", koVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                    koVar21.presentFragment(new tn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(koVar.t0, 28)) {
                        org.telegram.ui.Cells.m8 m8Var18 = new org.telegram.ui.Cells.m8(context2);
                        koVar.b0 = m8Var18;
                        m8Var18.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                        koVar.b0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                            public final /* synthetic */ ko b;

                            {
                                this.b = koVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        ko koVar3 = this.b;
                                        koVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", koVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.u0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.M0;
                                        long j102 = koVar4.y0;
                                        if (!koVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.u0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new ih0(koVar6.s0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new ob(koVar8.t0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.y0);
                                        koVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new ph.j(koVar11.y0));
                                        break;
                                    case 9:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            rc0 rc0Var = new rc0(4);
                                            rc0Var.a0 = -koVar13.s0;
                                            TLRPC.ChatFull chatFull5 = koVar13.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            rc0Var.B0 = new eo(koVar13, 6);
                                            koVar13.presentFragment(rc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.s0;
                                        org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                        boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.I = new ArrayList();
                                        yoVar.J = new ArrayList();
                                        yoVar.L = new ArrayList();
                                        yoVar.Y = true;
                                        yoVar.b0 = new ArrayList();
                                        yoVar.k0 = new HashMap();
                                        yoVar.m0 = new no(yoVar, 5);
                                        yoVar.p0 = false;
                                        yoVar.V = j112;
                                        yoVar.j0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.u0;
                                        yoVar.U = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.h0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.s0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.K = false;
                                        kpVar.L = false;
                                        kpVar.A = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.u0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        pv0 pv0Var = new pv0(koVar16.s0);
                                        pv0Var.v = new eo(koVar16, 4);
                                        koVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        a60 a60Var = new a60(-koVar17.t0.id);
                                        a60Var.c = koVar17.H0;
                                        a60Var.h0 = koVar17;
                                        koVar17.presentFragment(a60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.u0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.u0;
                                        hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                            koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.s0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.B = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                        bundle6.putLong("chat_id", koVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                        koVar21.presentFragment(new tn(bundle6));
                                        break;
                                }
                            }
                        });
                        koVar.f0();
                    }
                    org.telegram.ui.Cells.m8 m8Var19 = new org.telegram.ui.Cells.m8(context2);
                    koVar.S = m8Var19;
                    final int i33 = 0;
                    m8Var19.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    koVar.S.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                    bundle.putLong("chat_id", koVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.u0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.M0;
                                    long j102 = koVar4.y0;
                                    if (!koVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.u0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new ih0(koVar6.s0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new ob(koVar8.t0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.y0);
                                    koVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new ph.j(koVar11.y0));
                                    break;
                                case 9:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        rc0 rc0Var = new rc0(4);
                                        rc0Var.a0 = -koVar13.s0;
                                        TLRPC.ChatFull chatFull5 = koVar13.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        rc0Var.B0 = new eo(koVar13, 6);
                                        koVar13.presentFragment(rc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.s0;
                                    org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                    boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.I = new ArrayList();
                                    yoVar.J = new ArrayList();
                                    yoVar.L = new ArrayList();
                                    yoVar.Y = true;
                                    yoVar.b0 = new ArrayList();
                                    yoVar.k0 = new HashMap();
                                    yoVar.m0 = new no(yoVar, 5);
                                    yoVar.p0 = false;
                                    yoVar.V = j112;
                                    yoVar.j0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.u0;
                                    yoVar.U = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.h0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.s0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.K = false;
                                    kpVar.L = false;
                                    kpVar.A = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.u0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    pv0 pv0Var = new pv0(koVar16.s0);
                                    pv0Var.v = new eo(koVar16, 4);
                                    koVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    a60 a60Var = new a60(-koVar17.t0.id);
                                    a60Var.c = koVar17.H0;
                                    a60Var.h0 = koVar17;
                                    koVar17.presentFragment(a60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.u0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.u0;
                                    hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                        koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.s0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.B = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                    bundle6.putLong("chat_id", koVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                    koVar21.presentFragment(new tn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.m8 m8Var20 = new org.telegram.ui.Cells.m8(context2);
                    koVar.P = m8Var20;
                    m8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
                    final int i34 = 2;
                    koVar.P.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                    bundle.putLong("chat_id", koVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.u0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.M0;
                                    long j102 = koVar4.y0;
                                    if (!koVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.u0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new ih0(koVar6.s0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new ob(koVar8.t0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.y0);
                                    koVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new ph.j(koVar11.y0));
                                    break;
                                case 9:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        rc0 rc0Var = new rc0(4);
                                        rc0Var.a0 = -koVar13.s0;
                                        TLRPC.ChatFull chatFull5 = koVar13.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        rc0Var.B0 = new eo(koVar13, 6);
                                        koVar13.presentFragment(rc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.s0;
                                    org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                    boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.I = new ArrayList();
                                    yoVar.J = new ArrayList();
                                    yoVar.L = new ArrayList();
                                    yoVar.Y = true;
                                    yoVar.b0 = new ArrayList();
                                    yoVar.k0 = new HashMap();
                                    yoVar.m0 = new no(yoVar, 5);
                                    yoVar.p0 = false;
                                    yoVar.V = j112;
                                    yoVar.j0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.u0;
                                    yoVar.U = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.h0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.s0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.K = false;
                                    kpVar.L = false;
                                    kpVar.A = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.u0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    pv0 pv0Var = new pv0(koVar16.s0);
                                    pv0Var.v = new eo(koVar16, 4);
                                    koVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    a60 a60Var = new a60(-koVar17.t0.id);
                                    a60Var.c = koVar17.H0;
                                    a60Var.h0 = koVar17;
                                    koVar17.presentFragment(a60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.u0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.u0;
                                    hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                        koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.s0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.B = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                    bundle6.putLong("chat_id", koVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                    koVar21.presentFragment(new tn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.isChannelAndNotMegaGroup(koVar.t0)) {
                        org.telegram.ui.Cells.m8 m8Var21 = new org.telegram.ui.Cells.m8(context2);
                        koVar.Q = m8Var21;
                        m8Var21.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                        final int i35 = 3;
                        koVar.Q.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                        bundle.putLong("chat_id", koVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.u0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.M0;
                                        long j102 = koVar4.y0;
                                        if (!koVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.u0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new ih0(koVar6.s0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new ob(koVar8.t0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.y0);
                                        koVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new ph.j(koVar11.y0));
                                        break;
                                    case 9:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            rc0 rc0Var = new rc0(4);
                                            rc0Var.a0 = -koVar13.s0;
                                            TLRPC.ChatFull chatFull5 = koVar13.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            rc0Var.B0 = new eo(koVar13, 6);
                                            koVar13.presentFragment(rc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.s0;
                                        org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                        boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.I = new ArrayList();
                                        yoVar.J = new ArrayList();
                                        yoVar.L = new ArrayList();
                                        yoVar.Y = true;
                                        yoVar.b0 = new ArrayList();
                                        yoVar.k0 = new HashMap();
                                        yoVar.m0 = new no(yoVar, 5);
                                        yoVar.p0 = false;
                                        yoVar.V = j112;
                                        yoVar.j0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.u0;
                                        yoVar.U = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.h0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.s0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.K = false;
                                        kpVar.L = false;
                                        kpVar.A = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.u0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        pv0 pv0Var = new pv0(koVar16.s0);
                                        pv0Var.v = new eo(koVar16, 4);
                                        koVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        a60 a60Var = new a60(-koVar17.t0.id);
                                        a60Var.c = koVar17.H0;
                                        a60Var.h0 = koVar17;
                                        koVar17.presentFragment(a60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.u0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.u0;
                                        hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                            koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.s0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.B = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                        bundle6.putLong("chat_id", koVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                        koVar21.presentFragment(new tn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.m8 m8Var22 = new org.telegram.ui.Cells.m8(context2);
                    koVar.V = m8Var22;
                    m8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    koVar.V.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    final int i36 = 4;
                    koVar.V.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                    bundle.putLong("chat_id", koVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.x0(koVar3.u0);
                                    koVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ko koVar4 = this.b;
                                    io ioVar = koVar4.M0;
                                    long j102 = koVar4.y0;
                                    if (!koVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i202 = chatPhoto2.dc_id;
                                                if (i202 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i202;
                                                }
                                                TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, koVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i212 = userProfilePhoto2.dc_id;
                                                if (i212 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i212;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ko koVar5 = this.b;
                                    koVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", koVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.x0(koVar5.u0);
                                    koVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ko koVar6 = this.b;
                                    koVar6.presentFragment(new ih0(koVar6.s0));
                                    break;
                                case 4:
                                    ko koVar7 = this.b;
                                    koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                    break;
                                case 5:
                                    ko koVar8 = this.b;
                                    koVar8.getClass();
                                    koVar8.presentFragment(new ob(koVar8.t0));
                                    break;
                                case 6:
                                    ko koVar9 = this.b;
                                    koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                    break;
                                case 7:
                                    ko koVar10 = this.b;
                                    koVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", koVar10.y0);
                                    koVar10.presentFragment(new la(bundle3));
                                    break;
                                case 8:
                                    ko koVar11 = this.b;
                                    koVar11.presentFragment(new ph.j(koVar11.y0));
                                    break;
                                case 9:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    ko.X(this.b);
                                    break;
                                case 14:
                                    ko koVar12 = this.b;
                                    org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                    break;
                                case 15:
                                    ko koVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                        rc0 rc0Var = new rc0(4);
                                        rc0Var.a0 = -koVar13.s0;
                                        TLRPC.ChatFull chatFull5 = koVar13.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        rc0Var.B0 = new eo(koVar13, 6);
                                        koVar13.presentFragment(rc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ko koVar14 = this.b;
                                    long j112 = koVar14.s0;
                                    org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                    boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                    yo yoVar = new yo(null);
                                    yoVar.I = new ArrayList();
                                    yoVar.J = new ArrayList();
                                    yoVar.L = new ArrayList();
                                    yoVar.Y = true;
                                    yoVar.b0 = new ArrayList();
                                    yoVar.k0 = new HashMap();
                                    yoVar.m0 = new no(yoVar, 5);
                                    yoVar.p0 = false;
                                    yoVar.V = j112;
                                    yoVar.j0 = z162;
                                    TLRPC.ChatFull chatFull6 = koVar14.u0;
                                    yoVar.U = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            yoVar.h0 = tL_chatInviteExported;
                                        } else {
                                            yoVar.X(false);
                                        }
                                    }
                                    koVar14.presentFragment(yoVar);
                                    break;
                                case 17:
                                    ko koVar15 = this.b;
                                    long j12 = koVar15.s0;
                                    kp kpVar = new kp(null);
                                    kpVar.v = new ArrayList();
                                    boolean z172 = false;
                                    kpVar.K = false;
                                    kpVar.L = false;
                                    kpVar.A = j12;
                                    TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    kpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                        z172 = true;
                                    }
                                    kpVar.s = z172;
                                    kpVar.h = koVar15.u0;
                                    koVar15.presentFragment(kpVar);
                                    break;
                                case 18:
                                    ko koVar16 = this.b;
                                    pv0 pv0Var = new pv0(koVar16.s0);
                                    pv0Var.v = new eo(koVar16, 4);
                                    koVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ko.Z(this.b);
                                    break;
                                case 20:
                                    ko koVar17 = this.b;
                                    a60 a60Var = new a60(-koVar17.t0.id);
                                    a60Var.c = koVar17.H0;
                                    a60Var.h0 = koVar17;
                                    koVar17.presentFragment(a60Var);
                                    break;
                                case 21:
                                    ko koVar18 = this.b;
                                    koVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", koVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.x0(koVar18.u0);
                                    koVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ko koVar19 = this.b;
                                    hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = koVar19.u0;
                                    hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    koVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ko koVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                        koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", koVar20.s0);
                                        rp rpVar = new rp(bundle5);
                                        rpVar.d = new ArrayList();
                                        rpVar.r = new ArrayList();
                                        rpVar.v = -1;
                                        rpVar.B = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        rpVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                    bundle6.putLong("chat_id", koVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                    koVar21.presentFragment(new tn(bundle6));
                                    break;
                            }
                        }
                    });
                    koVar.V.setVisibility(8);
                    if (!ChatObject.isChannel(koVar.t0) || koVar.t0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var23 = new org.telegram.ui.Cells.m8(context2);
                        koVar.U = m8Var23;
                        m8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        koVar.U.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                        final int i37 = 5;
                        koVar.U.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                        bundle.putLong("chat_id", koVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.u0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.M0;
                                        long j102 = koVar4.y0;
                                        if (!koVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.u0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new ih0(koVar6.s0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new ob(koVar8.t0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.y0);
                                        koVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new ph.j(koVar11.y0));
                                        break;
                                    case 9:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            rc0 rc0Var = new rc0(4);
                                            rc0Var.a0 = -koVar13.s0;
                                            TLRPC.ChatFull chatFull5 = koVar13.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            rc0Var.B0 = new eo(koVar13, 6);
                                            koVar13.presentFragment(rc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.s0;
                                        org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                        boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.I = new ArrayList();
                                        yoVar.J = new ArrayList();
                                        yoVar.L = new ArrayList();
                                        yoVar.Y = true;
                                        yoVar.b0 = new ArrayList();
                                        yoVar.k0 = new HashMap();
                                        yoVar.m0 = new no(yoVar, 5);
                                        yoVar.p0 = false;
                                        yoVar.V = j112;
                                        yoVar.j0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.u0;
                                        yoVar.U = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.h0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.s0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.K = false;
                                        kpVar.L = false;
                                        kpVar.A = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.u0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        pv0 pv0Var = new pv0(koVar16.s0);
                                        pv0Var.v = new eo(koVar16, 4);
                                        koVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        a60 a60Var = new a60(-koVar17.t0.id);
                                        a60Var.c = koVar17.H0;
                                        a60Var.h0 = koVar17;
                                        koVar17.presentFragment(a60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.u0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.u0;
                                        hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                            koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.s0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.B = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                        bundle6.putLong("chat_id", koVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                        koVar21.presentFragment(new tn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(koVar.t0)) {
                        org.telegram.ui.Cells.m8 m8Var24 = new org.telegram.ui.Cells.m8(context2);
                        koVar.W = m8Var24;
                        m8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        koVar.W.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                        final int i38 = 6;
                        koVar.W.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                                        bundle.putLong("chat_id", koVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.x0(koVar3.u0);
                                        koVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ko koVar4 = this.b;
                                        io ioVar = koVar4.M0;
                                        long j102 = koVar4.y0;
                                        if (!koVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i202 = chatPhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i202;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = koVar4.u0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, koVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i212 = userProfilePhoto2.dc_id;
                                                    if (i212 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i212;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ko koVar5 = this.b;
                                        koVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", koVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.x0(koVar5.u0);
                                        koVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ko koVar6 = this.b;
                                        koVar6.presentFragment(new ih0(koVar6.s0));
                                        break;
                                    case 4:
                                        ko koVar7 = this.b;
                                        koVar7.presentFragment(new ph.d3(-koVar7.s0));
                                        break;
                                    case 5:
                                        ko koVar8 = this.b;
                                        koVar8.getClass();
                                        koVar8.presentFragment(new ob(koVar8.t0));
                                        break;
                                    case 6:
                                        ko koVar9 = this.b;
                                        koVar9.presentFragment(t91.d0(koVar9.t0, false));
                                        break;
                                    case 7:
                                        ko koVar10 = this.b;
                                        koVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", koVar10.y0);
                                        koVar10.presentFragment(new la(bundle3));
                                        break;
                                    case 8:
                                        ko koVar11 = this.b;
                                        koVar11.presentFragment(new ph.j(koVar11.y0));
                                        break;
                                    case 9:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        ko.X(this.b);
                                        break;
                                    case 14:
                                        ko koVar12 = this.b;
                                        org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                                        break;
                                    case 15:
                                        ko koVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                            rc0 rc0Var = new rc0(4);
                                            rc0Var.a0 = -koVar13.s0;
                                            TLRPC.ChatFull chatFull5 = koVar13.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            rc0Var.B0 = new eo(koVar13, 6);
                                            koVar13.presentFragment(rc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ko koVar14 = this.b;
                                        long j112 = koVar14.s0;
                                        org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                                        boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                                        yo yoVar = new yo(null);
                                        yoVar.I = new ArrayList();
                                        yoVar.J = new ArrayList();
                                        yoVar.L = new ArrayList();
                                        yoVar.Y = true;
                                        yoVar.b0 = new ArrayList();
                                        yoVar.k0 = new HashMap();
                                        yoVar.m0 = new no(yoVar, 5);
                                        yoVar.p0 = false;
                                        yoVar.V = j112;
                                        yoVar.j0 = z162;
                                        TLRPC.ChatFull chatFull6 = koVar14.u0;
                                        yoVar.U = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                yoVar.h0 = tL_chatInviteExported;
                                            } else {
                                                yoVar.X(false);
                                            }
                                        }
                                        koVar14.presentFragment(yoVar);
                                        break;
                                    case 17:
                                        ko koVar15 = this.b;
                                        long j12 = koVar15.s0;
                                        kp kpVar = new kp(null);
                                        kpVar.v = new ArrayList();
                                        boolean z172 = false;
                                        kpVar.K = false;
                                        kpVar.L = false;
                                        kpVar.A = j12;
                                        TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        kpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                            z172 = true;
                                        }
                                        kpVar.s = z172;
                                        kpVar.h = koVar15.u0;
                                        koVar15.presentFragment(kpVar);
                                        break;
                                    case 18:
                                        ko koVar16 = this.b;
                                        pv0 pv0Var = new pv0(koVar16.s0);
                                        pv0Var.v = new eo(koVar16, 4);
                                        koVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ko.Z(this.b);
                                        break;
                                    case 20:
                                        ko koVar17 = this.b;
                                        a60 a60Var = new a60(-koVar17.t0.id);
                                        a60Var.c = koVar17.H0;
                                        a60Var.h0 = koVar17;
                                        koVar17.presentFragment(a60Var);
                                        break;
                                    case 21:
                                        ko koVar18 = this.b;
                                        koVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", koVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.x0(koVar18.u0);
                                        koVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ko koVar19 = this.b;
                                        hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = koVar19.u0;
                                        hh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        koVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ko koVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                            koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", koVar20.s0);
                                            rp rpVar = new rp(bundle5);
                                            rpVar.d = new ArrayList();
                                            rpVar.r = new ArrayList();
                                            rpVar.v = -1;
                                            rpVar.B = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            rpVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                                        bundle6.putLong("chat_id", koVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                                        koVar21.presentFragment(new tn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    koVar.N.addView(koVar.K, i7.f6.n(-1, -2));
                    m8Var = koVar.b0;
                    if (m8Var != null) {
                        koVar.N.addView(m8Var, i7.f6.n(-1, -2));
                    }
                    if (!koVar.E0 && !koVar.t0.gigagroup) {
                        koVar.N.addView(koVar.T, i7.f6.n(-1, -2));
                    }
                    if (!koVar.E0) {
                        koVar.N.addView(koVar.R, i7.f6.n(-1, -2));
                    }
                    koVar.N.addView(koVar.S, i7.f6.n(-1, -2));
                    koVar.N.addView(koVar.P, i7.f6.n(-1, -2));
                    m8Var2 = koVar.Q;
                    if (m8Var2 != null && (chatFull = koVar.u0) != null && chatFull.requests_pending > 0) {
                        koVar.N.addView(m8Var2, i7.f6.n(-1, -2));
                    }
                    if (koVar.E0) {
                        koVar.N.addView(koVar.R, i7.f6.n(-1, -2));
                    }
                    if (!koVar.E0 || koVar.t0.gigagroup) {
                        i16 = -2;
                        i17 = -1;
                        koVar.N.addView(koVar.T, i7.f6.n(-1, -2));
                    } else {
                        i16 = -2;
                        i17 = -1;
                    }
                    m8Var3 = koVar.W;
                    if (m8Var3 != null) {
                        koVar.N.addView(m8Var3, i7.f6.n(i17, i16));
                    }
                    m8Var4 = koVar.U;
                    if (m8Var4 != null) {
                        koVar.N.addView(m8Var4, i7.f6.n(i17, i16));
                    }
                    m8Var5 = koVar.V;
                    if (m8Var5 != null) {
                        koVar.N.addView(m8Var5, i7.f6.n(i17, i16));
                    }
                    if (koVar.V != null && koVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(koVar.t0)) {
                        koVar.V.setVisibility(0);
                    }
                    m8Var6 = koVar.U;
                    if (m8Var6 != null) {
                        org.telegram.ui.Cells.m8 m8Var25 = koVar.V;
                        m8Var6.setNeedDivider(m8Var25 != null && m8Var25.getVisibility() == 0);
                    }
                }
            }
            i15 = 0;
            m8Var15.setVisibility(i15);
            final int i312 = 21;
            koVar.T.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var162 = new org.telegram.ui.Cells.m8(context2);
            koVar.R = m8Var162;
            m8Var162.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            final int i322 = 22;
            koVar.R.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var172 = new org.telegram.ui.Cells.m8(context2);
            koVar.K = m8Var172;
            m8Var172.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.K.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(koVar.t0, 28)) {
            }
            org.telegram.ui.Cells.m8 m8Var192 = new org.telegram.ui.Cells.m8(context2);
            koVar.S = m8Var192;
            final int i332 = 0;
            m8Var192.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.S.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var202 = new org.telegram.ui.Cells.m8(context2);
            koVar.P = m8Var202;
            m8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            final int i342 = 2;
            koVar.P.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isChannelAndNotMegaGroup(koVar.t0)) {
            }
            org.telegram.ui.Cells.m8 m8Var222 = new org.telegram.ui.Cells.m8(context2);
            koVar.V = m8Var222;
            m8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            koVar.V.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            final int i362 = 4;
            koVar.V.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            koVar.V.setVisibility(8);
            if (!ChatObject.isChannel(koVar.t0)) {
            }
            org.telegram.ui.Cells.m8 m8Var232 = new org.telegram.ui.Cells.m8(context2);
            koVar.U = m8Var232;
            m8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            koVar.U.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            final int i372 = 5;
            koVar.U.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i372) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(koVar.t0)) {
            }
            koVar.N.addView(koVar.K, i7.f6.n(-1, -2));
            m8Var = koVar.b0;
            if (m8Var != null) {
            }
            if (!koVar.E0) {
                koVar.N.addView(koVar.T, i7.f6.n(-1, -2));
            }
            if (!koVar.E0) {
            }
            koVar.N.addView(koVar.S, i7.f6.n(-1, -2));
            koVar.N.addView(koVar.P, i7.f6.n(-1, -2));
            m8Var2 = koVar.Q;
            if (m8Var2 != null) {
                koVar.N.addView(m8Var2, i7.f6.n(-1, -2));
            }
            if (koVar.E0) {
            }
            if (koVar.E0) {
            }
            i16 = -2;
            i17 = -1;
            koVar.N.addView(koVar.T, i7.f6.n(-1, -2));
            m8Var3 = koVar.W;
            if (m8Var3 != null) {
            }
            m8Var4 = koVar.U;
            if (m8Var4 != null) {
            }
            m8Var5 = koVar.V;
            if (m8Var5 != null) {
            }
            if (koVar.V != null) {
                koVar.V.setVisibility(0);
            }
            m8Var6 = koVar.U;
            if (m8Var6 != null) {
            }
        }
        if (koVar.z0 != null) {
            org.telegram.ui.Cells.m8 m8Var26 = new org.telegram.ui.Cells.m8(context2);
            koVar.h0 = m8Var26;
            m8Var26.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.h0.setPrioritizeTitleOverValue(true);
            koVar.N.addView(koVar.h0, i7.f6.n(-1, -2));
            final int i39 = 7;
            koVar.h0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            koVar.r0();
            org.telegram.ui.Cells.m8 m8Var27 = new org.telegram.ui.Cells.m8(context2);
            koVar.k0 = m8Var27;
            m8Var27.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.k0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            koVar.N.addView(koVar.k0, i7.f6.n(-1, -2));
            koVar.k0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            koVar.k0.f(45, koVar.A0 == null, false);
            TLRPC.UserFull userFull = koVar.A0;
            if (userFull != null) {
                org.telegram.ui.Cells.m8 m8Var28 = koVar.k0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r1.commission_permille / 10.0f));
                }
                m8Var28.u(format, z11);
            }
            if (!koVar.getMessagesController().starrefProgramAllowed) {
                koVar.k0.setVisibility(8);
            }
            org.telegram.ui.Cells.m8 m8Var29 = new org.telegram.ui.Cells.m8(context2);
            koVar.l0 = m8Var29;
            m8Var29.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.l0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            koVar.N.addView(koVar.l0, i7.f6.n(-1, -2));
            final int i40 = 9;
            koVar.l0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i40) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var30 = new org.telegram.ui.Cells.m8(context2);
            koVar.m0 = m8Var30;
            m8Var30.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.m0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            koVar.N.addView(koVar.m0, i7.f6.n(-1, -2));
            final int i41 = 10;
            koVar.m0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
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
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var31 = new org.telegram.ui.Cells.m8(context2);
            koVar.n0 = m8Var31;
            m8Var31.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            koVar.n0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            koVar.N.addView(koVar.n0, i7.f6.n(-1, -2));
            final int i42 = 11;
            koVar.n0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i42) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = koVar.t0;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                koVar.N.setVisibility(8);
                koVar.C.setVisibility(8);
            }
            y3Var.addView(new org.telegram.ui.Cells.x6(context2), i7.f6.n(-1, -2));
        } else if (koVar.z0 != null) {
            koVar.o0 = new org.telegram.ui.Cells.y8(context2, i12, koVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new jh.m3(1), indexOf, indexOf + 10, 33);
            }
            koVar.o0.setText(valueOf);
            y3Var.addView(koVar.o0, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.m8 m8Var32 = new org.telegram.ui.Cells.m8(context2);
            koVar.q0 = m8Var32;
            m8Var32.setBackground(org.telegram.ui.ActionBar.g6.K0(true));
            koVar.q0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.m8 m8Var33 = koVar.q0;
            int i43 = org.telegram.ui.ActionBar.g6.q6;
            m8Var33.e(i43, i43);
            y3Var.addView(koVar.q0, i7.f6.n(-1, -2));
            final int i44 = 13;
            koVar.q0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j12 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j12;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j12));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j13;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.y8 y8Var2 = new org.telegram.ui.Cells.y8(context2, i12, koVar.resourceProvider);
            koVar.p0 = y8Var2;
            y8Var2.setFixedSize(i12);
            y3Var.addView(koVar.p0, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.m8 m8Var34 = koVar.q0;
            TLRPC.UserFull userFull2 = koVar.A0;
            m8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.y8 y8Var3 = koVar.p0;
            TLRPC.UserFull userFull3 = koVar.A0;
            y8Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = koVar.z0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                koVar.O = linearLayout5;
                linearLayout5.setOrientation(1);
                y3Var.addView(koVar.O, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context2);
                k4Var.setText(LocaleController.getString(R.string.BotBalance));
                koVar.O.addView(k4Var, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.m8 m8Var35 = new org.telegram.ui.Cells.m8(context2);
                koVar.i0 = m8Var35;
                m8Var35.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                koVar.i0.setPrioritizeTitleOverValue(true);
                koVar.O.addView(koVar.i0, i7.f6.n(-1, -2));
                final jh.b0 g11 = jh.b0.g(koVar.currentAccount);
                final int i45 = 0;
                koVar.i0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i45) {
                            case 0:
                                ko koVar3 = this.b;
                                long j12 = koVar3.y0;
                                if (g11.h(j12, false) != null) {
                                    koVar3.presentFragment(new jh.q(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ko koVar4 = this.b;
                                long j13 = koVar4.y0;
                                if (g11.h(j13, false) != null) {
                                    koVar4.presentFragment(new jh.q(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.m(j10)) {
                    long i46 = g11.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i46 > 0) {
                        double d = i46 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            charSequence = "";
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            koVar.i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    charSequence = "";
                    koVar.i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.d90(AndroidUtilities.dp(30.0f), koVar.i0.c), 0, spannableStringBuilder2.length(), 33);
                    koVar.i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    charSequence = "";
                }
                koVar.i0.setVisibility(g11.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.m8 m8Var36 = new org.telegram.ui.Cells.m8(context2);
                koVar.j0 = m8Var36;
                m8Var36.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                final int i47 = 1;
                koVar.j0.setPrioritizeTitleOverValue(true);
                koVar.O.addView(koVar.j0, i7.f6.n(-1, -2));
                koVar.j0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i47) {
                            case 0:
                                ko koVar3 = this.b;
                                long j12 = koVar3.y0;
                                if (g11.h(j12, false) != null) {
                                    koVar3.presentFragment(new jh.q(1, j12));
                                    break;
                                }
                                break;
                            default:
                                ko koVar4 = this.b;
                                long j13 = koVar4.y0;
                                if (g11.h(j13, false) != null) {
                                    koVar4.presentFragment(new jh.q(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j10, false) != null) {
                    org.telegram.ui.Cells.m8 m8Var37 = koVar.j0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j10).amount <= 0) {
                        X0 = charSequence;
                        z10 = false;
                    } else {
                        z10 = false;
                        X0 = jh.ia.X0(false, TextUtils.concat("XTR", jh.ia.K0(g11.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    m8Var37.q(string2, X0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.d90(AndroidUtilities.dp(30.0f), koVar.j0.c), 0, spannableStringBuilder3.length(), 33);
                    koVar.j0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                koVar.j0.setVisibility(g11.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.y8 y8Var4 = new org.telegram.ui.Cells.y8(context2, 12, koVar.getResourceProvider());
                y8Var4.setFixedSize(12);
                y8Var4.setTag(R.id.fit_width_tag, 1);
                y3Var.addView(y8Var4, i7.f6.n(-1, 12));
                koVar.O.setVisibility((koVar.j0.getVisibility() == 0 || koVar.i0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = koVar.t0;
        final int i48 = 14;
        if ((chat5 == null || !chat5.creator) && !((user = koVar.z0) != null && user.bot && user.bot_can_edit)) {
            context3 = context2;
            koVar2 = koVar;
        } else {
            final long j12 = chat5 != null ? chat5.linked_community_id : koVar.z0.linked_community_id;
            final long j13 = chat5 != null ? -chat5.id : koVar.z0.id;
            final boolean z18 = koVar.z0 != null;
            if (j12 != 0) {
                rh.a aVar = new rh.a(context2, koVar.resourceProvider);
                koVar.d0 = aVar;
                aVar.a(koVar.currentAccount, koVar.getMessagesController().getChat(Long.valueOf(j12)));
                final int i49 = 0;
                koVar.d0.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                koVar.d0.setOnClickListener(new View.OnClickListener(koVar) { // from class: org.telegram.ui.zn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i49) {
                            case 0:
                                ko koVar3 = this.b;
                                MessagesController messagesController = koVar3.getMessagesController();
                                long j14 = j12;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    koVar3.showDialog(new qh.i0(koVar3, j14, null, null));
                                    break;
                                } else {
                                    koVar3.presentFragment(new qh.n(j7.l1.g(j14, "community_id")));
                                    break;
                                }
                            default:
                                ko koVar4 = this.b;
                                koVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j12);
                                koVar4.presentFragment(new qh.g(bundle));
                                break;
                        }
                    }
                });
                y3Var.addView(koVar.d0, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.m8 m8Var38 = new org.telegram.ui.Cells.m8(context2);
                koVar.f0 = m8Var38;
                m8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(z18 ? R.string.CommunityRemoveBotFromCommunity : koVar.E0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                org.telegram.ui.Cells.m8 m8Var39 = koVar.f0;
                int i50 = org.telegram.ui.ActionBar.g6.p7;
                m8Var39.e(i50, i50);
                koVar.f0.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                context3 = context;
                koVar2 = koVar;
                koVar.f0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.ao
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                        ko koVar3 = ko.this;
                        org.telegram.ui.Components.c5.v0(koVar3, string3, LocaleController.getString(z18 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : koVar3.E0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new ho(koVar3, j13, j12, 0));
                    }
                });
                y3Var.addView(koVar2.f0, i7.f6.n(-1, -2));
                org.telegram.ui.Cells.y8 y8Var5 = new org.telegram.ui.Cells.y8(context3, 12, koVar2.getResourceProvider());
                koVar2.g0 = y8Var5;
                y8Var5.setFixedSize(14);
                koVar2.g0.setTag(R.id.fit_width_tag, 1);
                y3Var.addView(koVar2.g0, i7.f6.n(-1, 14));
            } else {
                context3 = context2;
                koVar2 = koVar;
                org.telegram.ui.Cells.m8 m8Var40 = new org.telegram.ui.Cells.m8(context3);
                koVar2.c0 = m8Var40;
                m8Var40.e(org.telegram.ui.ActionBar.g6.v6, org.telegram.ui.ActionBar.g6.u6);
                koVar2.c0.setTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.il));
                koVar2.c0.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                koVar2.c0.m(R.drawable.msg_groups, LocaleController.getString(z18 ? R.string.CommunityAddBotToCommunity : koVar2.E0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                final int i51 = 1;
                koVar2.c0.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.zn
                    public final /* synthetic */ ko b;

                    {
                        this.b = koVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                ko koVar3 = this.b;
                                MessagesController messagesController = koVar3.getMessagesController();
                                long j14 = j13;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    koVar3.showDialog(new qh.i0(koVar3, j14, null, null));
                                    break;
                                } else {
                                    koVar3.presentFragment(new qh.n(j7.l1.g(j14, "community_id")));
                                    break;
                                }
                            default:
                                ko koVar4 = this.b;
                                koVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j13);
                                koVar4.presentFragment(new qh.g(bundle));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.y8 y8Var6 = new org.telegram.ui.Cells.y8(context3, 12, koVar2.resourceProvider);
                koVar2.e0 = y8Var6;
                y8Var6.setText(LocaleController.getString(z18 ? R.string.CommunityAddBotToCommunityInfo : koVar2.E0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                y3Var.addView(koVar2.c0, i7.f6.n(-1, -2));
                y3Var.addView(koVar2.e0, i7.f6.n(-1, -2));
            }
        }
        TLRPC.Chat chat6 = koVar2.t0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context3);
            koVar2.Y = frameLayout3;
            y3Var.addView(frameLayout3, i7.f6.n(-1, -2));
            org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(context3);
            koVar2.Z = y9Var;
            y9Var.setTextColor(org.telegram.ui.ActionBar.g6.u0(org.telegram.ui.ActionBar.g6.p7));
            koVar2.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
            if (koVar2.z0 != null) {
                koVar2.Z.b(LocaleController.getString(R.string.DeleteBot), false);
            } else if (koVar2.E0) {
                koVar2.Z.b(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                koVar2.Z.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            koVar2.Y.addView(koVar2.Z, i7.f6.c(-2.0f, -1));
            koVar2.Z.setOnClickListener(new View.OnClickListener(koVar2) { // from class: org.telegram.ui.xn
                public final /* synthetic */ ko b;

                {
                    this.b = koVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i48) {
                        case 0:
                            ko koVar3 = this.b;
                            koVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", koVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.x0(koVar3.u0);
                            koVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ko koVar4 = this.b;
                            io ioVar = koVar4.M0;
                            long j102 = koVar4.y0;
                            if (!koVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : koVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat22 = koVar4.getMessagesController().getChat(Long.valueOf(koVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i202 = chatPhoto2.dc_id;
                                        if (i202 != 0) {
                                            chatPhoto2.photo_big.dc_id = i202;
                                        }
                                        TLRPC.ChatFull chatFull4 = koVar4.u0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(koVar4.u0.chat_photo.video_sizes.get(0), koVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, koVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i212 = userProfilePhoto2.dc_id;
                                        if (i212 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i212;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, ioVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ko koVar5 = this.b;
                            koVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", koVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.x0(koVar5.u0);
                            koVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ko koVar6 = this.b;
                            koVar6.presentFragment(new ih0(koVar6.s0));
                            break;
                        case 4:
                            ko koVar7 = this.b;
                            koVar7.presentFragment(new ph.d3(-koVar7.s0));
                            break;
                        case 5:
                            ko koVar8 = this.b;
                            koVar8.getClass();
                            koVar8.presentFragment(new ob(koVar8.t0));
                            break;
                        case 6:
                            ko koVar9 = this.b;
                            koVar9.presentFragment(t91.d0(koVar9.t0, false));
                            break;
                        case 7:
                            ko koVar10 = this.b;
                            koVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", koVar10.y0);
                            koVar10.presentFragment(new la(bundle3));
                            break;
                        case 8:
                            ko koVar11 = this.b;
                            koVar11.presentFragment(new ph.j(koVar11.y0));
                            break;
                        case 9:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ye.d.s(view.getContext(), "https://t.me/BotFather?start=" + ko.g0(this.b.z0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            ko.X(this.b);
                            break;
                        case 14:
                            ko koVar12 = this.b;
                            org.telegram.ui.Components.c5.s(koVar12, false, koVar12.t0, null, false, true, true, false, new eo(koVar12, 7));
                            break;
                        case 15:
                            ko koVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(koVar13)) {
                                rc0 rc0Var = new rc0(4);
                                rc0Var.a0 = -koVar13.s0;
                                TLRPC.ChatFull chatFull5 = koVar13.u0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        rc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                rc0Var.B0 = new eo(koVar13, 6);
                                koVar13.presentFragment(rc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ko koVar14 = this.b;
                            long j112 = koVar14.s0;
                            org.telegram.ui.Cells.m8 m8Var72 = koVar14.D;
                            boolean z162 = m8Var72 != null && m8Var72.getVisibility() == 0;
                            yo yoVar = new yo(null);
                            yoVar.I = new ArrayList();
                            yoVar.J = new ArrayList();
                            yoVar.L = new ArrayList();
                            yoVar.Y = true;
                            yoVar.b0 = new ArrayList();
                            yoVar.k0 = new HashMap();
                            yoVar.m0 = new no(yoVar, 5);
                            yoVar.p0 = false;
                            yoVar.V = j112;
                            yoVar.j0 = z162;
                            TLRPC.ChatFull chatFull6 = koVar14.u0;
                            yoVar.U = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    yoVar.h0 = tL_chatInviteExported;
                                } else {
                                    yoVar.X(false);
                                }
                            }
                            koVar14.presentFragment(yoVar);
                            break;
                        case 17:
                            ko koVar15 = this.b;
                            long j122 = koVar15.s0;
                            kp kpVar = new kp(null);
                            kpVar.v = new ArrayList();
                            boolean z172 = false;
                            kpVar.K = false;
                            kpVar.L = false;
                            kpVar.A = j122;
                            TLRPC.Chat chat222 = kpVar.getMessagesController().getChat(Long.valueOf(j122));
                            kpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !kpVar.f.megagroup) {
                                z172 = true;
                            }
                            kpVar.s = z172;
                            kpVar.h = koVar15.u0;
                            koVar15.presentFragment(kpVar);
                            break;
                        case 18:
                            ko koVar16 = this.b;
                            pv0 pv0Var = new pv0(koVar16.s0);
                            pv0Var.v = new eo(koVar16, 4);
                            koVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ko.Z(this.b);
                            break;
                        case 20:
                            ko koVar17 = this.b;
                            a60 a60Var = new a60(-koVar17.t0.id);
                            a60Var.c = koVar17.H0;
                            a60Var.h0 = koVar17;
                            koVar17.presentFragment(a60Var);
                            break;
                        case 21:
                            ko koVar18 = this.b;
                            koVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", koVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((koVar18.E0 || koVar18.t0.gigagroup) && !ChatObject.isCommunity(koVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.x0(koVar18.u0);
                            koVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ko koVar19 = this.b;
                            hh0 hh0Var = new hh0(koVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = koVar19.u0;
                            hh0Var.g0(chatFull7, chatFull7.exported_invite);
                            koVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ko koVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(koVar20.t0)) {
                                koVar20.presentFragment(new kg.s(koVar20.s0, koVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", koVar20.s0);
                                rp rpVar = new rp(bundle5);
                                rpVar.d = new ArrayList();
                                rpVar.r = new ArrayList();
                                rpVar.v = -1;
                                rpVar.B = new ArrayList();
                                long j132 = bundle5.getLong("chat_id", 0L);
                                rpVar.c = j132;
                                TLRPC.ChatFull chatFull8 = koVar20.u0;
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
                            bundle6.putLong("chat_id", koVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", koVar21.s0);
                            koVar21.presentFragment(new tn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.x6 x6Var2 = new org.telegram.ui.Cells.x6(context3);
            koVar2.a0 = x6Var2;
            y3Var.addView(x6Var2, i7.f6.n(-1, -2));
        }
        UndoView undoView = new UndoView(context3);
        koVar2.c = undoView;
        ddVar.addView(undoView, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.au auVar6 = koVar2.v;
        TLRPC.User user3 = koVar2.z0;
        auVar6.setText(Emoji.replaceEmoji(user3 != null ? ContactsController.formatName(user3) : koVar2.t0.title, koVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.au auVar7 = koVar2.v;
        auVar7.setSelection(auVar7.n());
        TLRPC.ChatFull chatFull4 = koVar2.u0;
        if (chatFull4 != null) {
            koVar2.A.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = koVar2.A0;
            if (userFull4 != null) {
                koVar2.A.setText(userFull4.about);
            }
        }
        koVar2.k0();
        koVar2.p0(true, false);
        return koVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.t0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
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
        org.telegram.ui.Cells.m8 m8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z11 = true;
        long j10 = this.y0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.s0) {
                if (this.u0 == null && (editTextBoldCursor = this.A) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.u0 == null;
                this.u0 = chatFull;
                f0();
                if (j10 != 0) {
                    this.C0 = false;
                } else {
                    if (!this.B0) {
                        TLRPC.ChatFull chatFull2 = this.u0;
                    }
                    TLRPC.ChatFull chatFull3 = this.u0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z10 = true;
                        this.C0 = z10;
                        m8Var = this.M;
                        if (m8Var != null) {
                            m8Var.getCheckBox().setIcon(this.C0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.C0 = z10;
                    m8Var = this.M;
                    if (m8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.t0) && !this.u0.hidden_prehistory) {
                    z11 = false;
                }
                this.F0 = z11;
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
            if (this.s0 != longValue) {
                return;
            }
            this.B0 = booleanValue;
            this.D0 = booleanValue2;
            org.telegram.ui.Cells.m8 m8Var2 = this.M;
            if (m8Var2 != null) {
                m8Var2.setChecked(booleanValue);
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
            if (chat == null || chat.id != this.s0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.v0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.w0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.x0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.s0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.u0 = chatFull4;
                if (chatFull4 != null) {
                    this.G0 = chatFull4.available_reactions;
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
                if (i10 == NotificationCenter.dialogDeleted && (-this.s0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
                    if (b5Var2 == null || b5Var2.getLastFragment() != this) {
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
            if (this.j0 != null) {
                jh.b0 g10 = jh.b0.g(this.currentAccount);
                this.j0.setVisibility(g10.a(j10) ? 0 : 8);
                this.j0.u(jh.ia.X0(false, TextUtils.concat("XTR", jh.ia.J0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.m8 m8Var3 = this.h0;
                if (m8Var3 != null) {
                    m8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.O.setVisibility((this.j0.getVisibility() == 0 || this.i0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.i0 != null) {
                jh.b0 g11 = jh.b0.g(this.currentAccount);
                this.i0.setVisibility(g11.b(j10) ? 0 : 8);
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
                this.i0.u(spannableStringBuilder, true);
                org.telegram.ui.Cells.m8 m8Var4 = this.h0;
                if (m8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z11 = false;
                    }
                    m8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.O;
                if (this.j0.getVisibility() != 0 && this.i0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void dismissCurrentDialog() {
        if (this.s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z10) {
        org.telegram.ui.Components.au auVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.y0 != 0) {
            TLRPC.UserFull userFull = this.A0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.au auVar2 = this.v;
            if ((auVar2 == null || this.z0.first_name.equals(auVar2.getText().toString())) && ((editTextBoldCursor2 = this.A) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new eo(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new eo(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.u0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.t0) || this.u0.hidden_prehistory == this.F0) && (((auVar = this.v) == null || this.t0.title.equals(auVar.getText().toString())) && (((editTextBoldCursor = this.A) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.B0 == this.t0.forum))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.N = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.E0) {
                    alertDialog$Builder2.a.P = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder2.a.P = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new eo(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new eo(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    public final void f0() {
        if (this.b0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.s0);
        TLRPC.ChatFull chatFull = this.u0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.b0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ zt0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.r40
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.t8));
        jo joVar = this.X;
        int i10 = org.telegram.ui.ActionBar.g6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(joVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.S, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.R, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.m8 m8Var = this.Q;
        if (m8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(m8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.g6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.au auVar = this.v;
        int i14 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(auVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.g6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.a0, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Z, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Z, 4, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 4, new Class[]{org.telegram.ui.Cells.y9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
        int i17 = org.telegram.ui.ActionBar.g6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.K, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.m8 m8Var2 = this.G;
        if (m8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(m8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.G, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.m8 m8Var3 = this.W;
        if (m8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(m8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 4, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.W, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.s0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new co(this, 0));
    }

    public final void i0() {
        this.s.o(this.r0 != null, new fo(this, 0), new s5(this, 5), 0);
        this.N0.K(0);
        this.N0.N(43);
        this.X.e.d();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.au auVar;
        String str;
        String str2;
        if (this.J0 || (auVar = this.v) == null) {
            return;
        }
        if (auVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.J0 = true;
        int i10 = 3;
        String str3 = "";
        if (this.z0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.z0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.z0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.A0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.A;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.A.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new jh.w(this, getConnectionsManager().sendRequest(setbotinfo, new zg(i10, this, setbotinfo)), i10));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.t0) && (!this.F0 || this.B0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.s0, this, new eo(this, 5));
            return;
        }
        if (this.u0 != null && ChatObject.isChannel(this.t0)) {
            TLRPC.ChatFull chatFull = this.u0;
            boolean z10 = chatFull.hidden_prehistory;
            boolean z11 = this.F0;
            if (z10 != z11) {
                chatFull.hidden_prehistory = z11;
                getMessagesController().toggleChannelInvitesHistory(this.s0, this.F0);
            }
        }
        if (this.s.h()) {
            this.I0 = true;
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, null);
            this.b = c2Var;
            c2Var.setOnCancelListener(new cg(this, r0));
            this.b.show();
            return;
        }
        if (!this.t0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.s0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.u0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.A;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.s0, this.A.getText().toString(), this.u0);
        }
        boolean z12 = this.B0;
        TLRPC.Chat chat = this.t0;
        if (z12 != chat.forum || this.D0 != chat.forum_tabs) {
            r0 = this.D0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.s0, this.B0, this.D0);
            if (this.B0 && !this.D0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                for (int i11 = 0; i11 < fragmentStack.size(); i11++) {
                    if ((fragmentStack.get(i11) instanceof tn) && ((tn) fragmentStack.get(i11)).getArguments().getLong("chat_id") == this.s0) {
                        ((ActionBarLayout) getParentLayout()).Y(i11);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.s0);
                        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                        HashSet hashSet = ze1.j1;
                        ((ActionBarLayout) parentLayout).c(i11, ze1.E0(getMessagesController(), getMessagesStorage(), bundle));
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
        if (this.e == null || this.K0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.s0));
        long j10 = this.y0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.z0 = user;
        this.t0 = chat;
        org.telegram.ui.Components.e9 e9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(e9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.r0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, e9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.X != null) {
                    if (z10 || this.s.h()) {
                        this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.N0 == null) {
                        this.N0 = new org.telegram.ui.Components.xi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.X.e.setAnimation(this.N0);
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    PhotoViewer.t1().y0();
                }
                if (this.V == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.t0)) {
                    this.V.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (this.X != null) {
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().y0();
        }
        if (this.V == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.p5 n10;
        this.u0 = chatFull;
        if (chatFull != null) {
            if (this.t0 == null) {
                this.t0 = getMessagesController().getChat(Long.valueOf(this.s0));
            }
            this.F0 = !ChatObject.isChannel(this.t0) || this.u0.hidden_prehistory;
            this.G0 = this.u0.available_reactions;
            ArrayList arrayList = this.L0;
            arrayList.clear();
            TLRPC.Chat chat = this.t0;
            TLRPC.ChatFull chatFull2 = this.u0;
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
                                n10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, org.telegram.ui.Components.p5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.p5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.p5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.p5 m10 = org.telegram.ui.Components.p5.m(UserConfig.selectedAccount, org.telegram.ui.Components.p5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m10);
                            m10.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.V != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.t0)) {
                this.V.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.A0 = userFull;
        if (userFull != null) {
            if (this.z0 == null) {
                long j10 = this.y0;
                this.z0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.m8 m8Var = this.k0;
            if (m8Var != null) {
                m8Var.f(45, this.A0 == null, true);
                TLRPC.UserFull userFull2 = this.A0;
                if (userFull2 != null) {
                    this.k0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.q0;
            if (m8Var2 != null) {
                TLRPC.UserFull userFull3 = this.A0;
                m8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.y8 y8Var = this.p0;
            if (y8Var != null) {
                TLRPC.UserFull userFull4 = this.A0;
                y8Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<cg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<cg.i0, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new bg.z2(29, this, z10));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        uo0 uo0Var;
        int v02;
        ArrayList<Integer> arrayList;
        go0 go0Var = this.H;
        if (go0Var != null) {
            TLRPC.Chat chat = this.t0;
            org.telegram.ui.Cells.m8 m8Var3 = this.J;
            boolean z10 = (m8Var3 != null && m8Var3.getVisibility() == 0) || ((m8Var = this.M) != null && m8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.t0) && ChatObject.hasAdminRights(this.t0)) || ((m8Var2 = this.I) != null && m8Var2.getVisibility() == 0));
            Paint paint = go0Var.n;
            int i10 = go0Var.a;
            org.telegram.ui.ActionBar.c6 c6Var = go0Var.d;
            if (chat == null) {
                return;
            }
            go0Var.v = z10;
            go0Var.r = new org.telegram.ui.Components.zz0(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.g6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            uo0 uo0Var2 = go0Var.w;
            if (uo0Var2 != null) {
                uo0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = uo0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                go0Var.w = new uo0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    uo0Var = uo0.c(i10, ChatObject.getProfileColorId(chat));
                    uo0Var.a = AndroidUtilities.dp(11.0f);
                    uo0Var.d();
                } else {
                    uo0Var = null;
                }
                go0Var.w = uo0Var;
            }
            uo0 uo0Var3 = go0Var.w;
            if (uo0Var3 != null) {
                uo0Var3.e(go0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = c6Var != null ? c6Var.a() : org.telegram.ui.ActionBar.g6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                go0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, i13));
                uo0 uo0Var4 = new uo0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                uo0Var4.a = AndroidUtilities.dp(11.0f);
                uo0Var4.d();
                go0Var.x = uo0Var4;
                uo0Var4.e(go0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.g6.r8[colorId];
                go0Var.s = i14;
                v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    go0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.g6.r8[0];
                    go0Var.s = i15;
                    v02 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
                }
            }
            go0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(0.1f, v02));
            uo0 a10 = uo0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            go0Var.x = a10;
            a10.e(go0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.au auVar = this.v;
        if (auVar == null || !auVar.e) {
            return e0(z10);
        }
        if (!z10) {
            return false;
        }
        auVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005a, code lost:
    
        if (r1 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0116, code lost:
    
        if (java.lang.Math.max(r2 == null ? 0 : r2.participants_count, r1.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        if (r1.linked_chat_id != 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.s0;
        long j11 = this.y0;
        boolean z10 = true;
        if (j10 == 0) {
            TLRPC.User user = j11 == 0 ? null : getMessagesController().getUser(Long.valueOf(j11));
            this.z0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j11);
                this.z0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.z0, true);
                    if (this.A0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.A0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.t0;
            org.telegram.ui.Components.e9 e9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.s40 s40Var = this.s;
            s40Var.a = this;
            s40Var.b = this;
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            if (this.u0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.s0));
        this.t0 = chat2;
        if (chat2 == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.s0);
            this.t0 = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.t0, true);
                if (this.u0 == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.s0, ChatObject.isChannel(this.t0), new CountDownLatch(1), false, false);
                    this.u0 = loadChatInfo;
                }
            }
            return false;
        }
        chat = this.t0;
        org.telegram.ui.Components.e9 e9Var2 = this.r;
        if (chat == null) {
            this.v0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.w0 = TLRPC.TL_chatBannedRights.clone(this.t0.banned_rights);
            this.x0 = TLRPC.TL_chatBannedRights.clone(this.t0.default_banned_rights);
            e9Var2.n(5L, this.t0.title, null);
            this.E0 = ChatObject.isChannel(this.t0) && !this.t0.megagroup;
            TLRPC.Chat chat3 = this.t0;
            boolean z11 = chat3.forum;
            this.B0 = z11;
            this.D0 = chat3.forum_tabs;
            if (j11 == 0) {
                if (!z11) {
                    TLRPC.ChatFull chatFull = this.u0;
                }
                TLRPC.ChatFull chatFull2 = this.u0;
                if (chatFull2 != null) {
                }
                this.C0 = z10;
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
                getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
            }
            z10 = false;
            this.C0 = z10;
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            e9Var2.n(5L, this.z0.first_name, null);
            this.E0 = false;
            this.B0 = false;
            this.D0 = false;
            this.C0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.z0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.s40 s40Var2 = this.s;
        s40Var2.a = this;
        s40Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.u0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.s40 s40Var = this.s;
        if (s40Var != null) {
            s40Var.e();
        }
        if (this.t0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.z0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.au auVar = this.v;
        if (auVar != null) {
            auVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        bg.y3 y3Var = this.w;
        if (y3Var != null) {
            y3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.L0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.p5) obj).p(null);
        }
        org.telegram.ui.Components.au auVar = this.v;
        if (auVar != null) {
            auVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.au auVar = this.v;
        if (auVar != null) {
            auVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.s.l();
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
        org.telegram.ui.Cells.m8 m8Var;
        org.telegram.ui.Cells.m8 m8Var2;
        org.telegram.ui.Cells.m8 m8Var3;
        org.telegram.ui.Cells.m8 m8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.m8 m8Var5;
        org.telegram.ui.Cells.m8 m8Var6;
        org.telegram.ui.Cells.m8 m8Var7;
        org.telegram.ui.Cells.m8 m8Var8;
        org.telegram.ui.Cells.m8 m8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.s0))) != null) {
            this.t0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.t0);
        org.telegram.ui.Cells.y8 y8Var = this.L;
        int i16 = 8;
        if (y8Var != null) {
            y8Var.setVisibility((this.E != null || ((m8Var7 = this.F) != null && m8Var7.getVisibility() == 0) || (((m8Var8 = this.J) != null && m8Var8.getVisibility() == 0) || ((m8Var9 = this.D) != null && m8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.m8 m8Var10 = this.U;
        if (m8Var10 != null) {
            m8Var10.setVisibility(ChatObject.isChannel(this.t0) ? 0 : 8);
        }
        org.telegram.ui.Cells.m8 m8Var11 = this.F;
        if (m8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.u0;
            if (chatFull2 == null || (!this.E0 && chatFull2.linked_chat_id == 0)) {
                m8Var11.setVisibility(8);
            } else {
                m8Var11.setVisibility(0);
                if (this.u0.linked_chat_id == 0) {
                    this.F.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.u0.linked_chat_id));
                    if (chat2 == null) {
                        this.F.setVisibility(8);
                    } else if (this.E0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), u3.c.e("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.m8 m8Var12 = this.F;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.m8 m8Var13 = this.M;
                            m8Var12.s(string2, str4, false, i17, m8Var13 != null && m8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.m8 m8Var14 = this.F;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String e10 = u3.c.e("@", publicUsername2);
                            int i18 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.m8 m8Var15 = this.M;
                            m8Var14.s(string3, e10, false, i18, m8Var15 != null && m8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.m8 m8Var16 = this.D;
        if (m8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.u0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                m8Var16.setVisibility(8);
            } else {
                m8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.u0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.D.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z11, true);
                } else {
                    this.D.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z11, true);
                }
            }
        }
        if (this.E != null) {
            TLRPC.ChatFull chatFull4 = this.u0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z13 = this.t0.noforwards;
                if (this.E0) {
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
                if (this.E0) {
                    org.telegram.ui.Cells.m8 m8Var17 = this.E;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i19 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.m8 m8Var18 = this.J;
                    m8Var17.s(string4, str5, false, i19, (m8Var18 != null && m8Var18.getVisibility() == 0) || ((m8Var3 = this.F) != null && m8Var3.getVisibility() == 0) || ((m8Var4 = this.M) != null && m8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.m8 m8Var19 = this.E;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i20 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.m8 m8Var20 = this.J;
                    m8Var19.s(string5, str5, false, i20, (m8Var20 != null && m8Var20.getVisibility() == 0) || ((m8Var = this.F) != null && m8Var.getVisibility() == 0) || ((m8Var2 = this.M) != null && m8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a4.w.q(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.t0));
                org.telegram.ui.Cells.m8 m8Var21 = this.E;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i21 = R.drawable.msg_channel;
                org.telegram.ui.Cells.m8 m8Var22 = this.J;
                m8Var21.s(string7, string6, false, i21, (m8Var22 != null && m8Var22.getVisibility() == 0) || ((m8Var5 = this.F) != null && m8Var5.getVisibility() == 0) || ((m8Var6 = this.M) != null && m8Var6.getVisibility() == 0));
            }
        }
        if (this.J != null) {
            if (!this.F0 || this.B0) {
                i13 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i13 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.J.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i13), z11, R.drawable.msg_discuss, this.M != null);
            this.J.setEnabled(!this.B0);
            boolean z14 = (this.B0 || isPublic || ((chatFull = this.u0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.J.getAlpha() <= 0.0f && !z14) {
                this.J.setVisibility(8);
                o0();
            } else if (this.J.getVisibility() != 0 || this.J.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                boolean z15 = false;
                for (int i22 = 0; i22 < this.B.getChildCount(); i22++) {
                    if (!z15 && this.B.getChildAt(i22) == this.J) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.B.getChildAt(i22));
                    }
                }
                boolean z16 = false;
                for (int i23 = 0; i23 < this.w.getChildCount(); i23++) {
                    if (!z16 && this.w.getChildAt(i23) == this.B) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.w.getChildAt(i23));
                    }
                }
                if (this.J.getVisibility() != 0) {
                    this.J.setAlpha(0.0f);
                    this.J.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.J.setVisibility(0);
                for (int i24 = 0; i24 < arrayList.size(); i24++) {
                    ((View) arrayList.get(i24)).setTranslationY((1.0f - this.J.getAlpha()) * (-this.J.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.O0 = ofFloat;
                    ofFloat.addUpdateListener(new bg.b3(i16, this, arrayList));
                    this.O0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 6));
                    this.O0.setDuration(320L);
                    this.O0.setInterpolator(org.telegram.ui.Components.jr.h);
                    this.O0.start();
                } else {
                    this.J.setAlpha(z14 ? 1.0f : 0.0f);
                    this.J.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.J.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.J.setVisibility(z14 ? 0 : 8);
                    for (int i25 = 0; i25 < arrayList.size(); i25++) {
                        ((View) arrayList.get(i25)).setTranslationY(0.0f);
                    }
                    this.O0 = null;
                }
            }
        }
        if (this.P != null) {
            if (this.u0 != null) {
                org.telegram.ui.Cells.m8 m8Var23 = this.Q;
                if (m8Var23 != null) {
                    if (m8Var23.getParent() == null) {
                        this.N.addView(this.Q, this.N.indexOfChild(this.P) + 1, i7.f6.n(-1, -2));
                    }
                    this.Q.setVisibility(this.u0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.E0 || ChatObject.isCommunity(this.t0)) {
                    if (ChatObject.isChannel(this.t0)) {
                        this.P.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.u0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.P.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.u0.participants.participants.size())), false, R.drawable.msg_groups, this.Q.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.t0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i26 = this.B0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.t0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i27 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i27++;
                            }
                            i10 = jr.n0(tL_chatBannedRights) + i27;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.t0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.B0 && !tL_chatBannedRights2.manage_topics) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i10++;
                            }
                            i11 = i26;
                        } else {
                            i10 = i26;
                            i11 = i10;
                        }
                        z12 = z11;
                        this.T.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.m8 m8Var24 = this.T;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.u0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i28 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.m8 m8Var25 = this.U;
                        m8Var24.s(string8, format, false, i28, m8Var25 != null && m8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.m8 m8Var26 = this.Q;
                    if (m8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.u0.requests_pending));
                        int i29 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.m8 m8Var27 = this.U;
                        m8Var26.s(string9, format2, false, i29, m8Var27 != null && m8Var27.getVisibility() == 0);
                    }
                } else {
                    this.P.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.u0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.m8 m8Var28 = this.T;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.u0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i30 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.m8 m8Var29 = this.U;
                    m8Var28.s(string10, format3, false, i30, m8Var29 != null && m8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.m8 m8Var30 = this.S;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.t0)) {
                    i12 = this.u0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.u0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i31 = 0;
                        for (int i32 = 0; i32 < size; i32++) {
                            TLRPC.ChatParticipant chatParticipant = this.u0.participants.participants.get(i32);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i31++;
                            }
                        }
                        i12 = i31;
                    }
                }
                m8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.E0 || ChatObject.isCommunity(this.t0)) {
                    org.telegram.ui.Cells.m8 m8Var31 = this.P;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i33 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.m8 m8Var32 = this.U;
                    m8Var31.m(i33, string12, m8Var32 != null && m8Var32.getVisibility() == 0);
                    if (this.t0.gigagroup) {
                        org.telegram.ui.Cells.m8 m8Var33 = this.T;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i34 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.m8 m8Var34 = this.U;
                        m8Var33.m(i34, string13, m8Var34 != null && m8Var34.getVisibility() == 0);
                    } else {
                        this.T.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.P.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.m8 m8Var35 = this.T;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i35 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.m8 m8Var36 = this.U;
                    m8Var35.m(i35, string14, m8Var36 != null && m8Var36.getVisibility() == 0);
                }
                this.S.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.K.setVisibility(ChatObject.canChangeChatInfo(this.t0) ? 0 : 8);
            s0(z12);
            if (this.u0 == null || !ChatObject.canUserDoAdminAction(this.t0, 3) || (isPublic && this.t0.creator)) {
                this.R.setVisibility(8);
            } else if (this.u0.invitesCount > 0) {
                this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.u0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.G != null) {
            t0(null);
        }
    }

    public final void q0() {
        fy fyVar;
        ax axVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof tn) {
                tn tnVar = (tn) fragmentStack.get(i10);
                if (tnVar.getArguments().getLong("chat_id") == this.s0) {
                    ((ActionBarLayout) getParentLayout()).a0(tnVar, false);
                    tnVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, tnVar);
                    if (!this.D0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.s0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new ze1(bundle));
                        i10++;
                    }
                }
            } else if (this.D0 && (fragmentStack.get(i10) instanceof ze1)) {
                ze1 ze1Var = (ze1) fragmentStack.get(i10);
                if (ze1Var.g() != null && ze1Var.g().id == this.s0) {
                    ((ActionBarLayout) getParentLayout()).a0(ze1Var, false);
                    i10--;
                }
            } else if (this.D0 && (fragmentStack.get(i10) instanceof fy) && (fyVar = (fy) fragmentStack.get(i10)) != null && (axVar = fyVar.B3) != null && axVar.c()) {
                fyVar.B3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.h0 == null) {
            return;
        }
        if (this.z0.usernames.size() <= 1) {
            this.h0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.z0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.z0.usernames;
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
        this.h0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.z0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.s40 s40Var = this.s;
        if (s40Var != null) {
            s40Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z10) {
        String str;
        String str2;
        int i10;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.s0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.t0);
        TLRPC.ChatReactions chatReactions = this.G0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string;
                this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
            }
            str2 = "1";
        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
            int i11 = 0;
            while (i10 < tL_chatReactionsSome.reactions.size()) {
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
        this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.s40 s40Var = this.s;
        if (s40Var != null && (str = s40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.au auVar = this.v;
        if (auVar != null) {
            String obj = auVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l10) {
        TLRPC.Chat chat = this.t0;
        if (chat == null || this.G == null) {
            return;
        }
        long j10 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.G.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.t0.linked_monoforum_id));
        if (l10 != null) {
            j10 = l10.longValue();
        } else if (chat2 != null) {
            j10 = chat2.send_paid_messages_stars;
        }
        this.G.s(LocaleController.getString(R.string.PostSuggestions), jh.ia.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.r40
    public final /* synthetic */ void P() {
    }
}
