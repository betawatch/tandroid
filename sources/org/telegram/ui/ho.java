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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ho extends org.telegram.ui.ActionBar.o2 implements org.telegram.ui.Components.d40, NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor A;
    public TLRPC.UserFull A0;
    public LinearLayout B;
    public boolean B0;
    public org.telegram.ui.Cells.z6 C;
    public boolean C0;
    public org.telegram.ui.Cells.p8 D;
    public boolean D0;
    public org.telegram.ui.Cells.p8 E;
    public boolean E0;
    public org.telegram.ui.Cells.p8 F;
    public boolean F0;
    public org.telegram.ui.Cells.p8 G;
    public TLRPC.ChatReactions G0;
    public ho0 H;
    public TL_stories.TL_premium_boostsStatus H0;
    public org.telegram.ui.Cells.p8 I;
    public boolean I0;
    public org.telegram.ui.Cells.p8 J;
    public boolean J0;
    public org.telegram.ui.Cells.p8 K;
    public boolean K0;
    public org.telegram.ui.Cells.b9 L;
    public final ArrayList L0;
    public org.telegram.ui.Cells.p8 M;
    public final fo M0;
    public LinearLayout N;
    public org.telegram.ui.Components.mi0 N0;
    public LinearLayout O;
    public ValueAnimator O0;
    public org.telegram.ui.Cells.p8 P;
    public org.telegram.ui.Cells.p8 Q;
    public org.telegram.ui.Cells.p8 R;
    public org.telegram.ui.Cells.p8 S;
    public org.telegram.ui.Cells.p8 T;
    public org.telegram.ui.Cells.p8 U;
    public org.telegram.ui.Cells.p8 V;
    public org.telegram.ui.Cells.p8 W;
    public go X;
    public FrameLayout Y;
    public org.telegram.ui.Cells.ba Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.z6 a0;
    public org.telegram.ui.ActionBar.c2 b;
    public org.telegram.ui.Cells.p8 b0;
    public UndoView c;
    public org.telegram.ui.Cells.p8 c0;
    public LinearLayout d;
    public oh.a d0;
    public ih.d4 e;
    public org.telegram.ui.Cells.b9 e0;
    public kh.h6 f;
    public org.telegram.ui.Cells.p8 f0;
    public org.telegram.ui.Cells.b9 g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.p8 h0;
    public org.telegram.ui.Cells.p8 i0;
    public org.telegram.ui.Cells.p8 j0;
    public org.telegram.ui.Cells.p8 k0;
    public org.telegram.ui.Cells.p8 l0;
    public org.telegram.ui.Cells.p8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.p8 n0;
    public org.telegram.ui.Cells.b9 o0;
    public org.telegram.ui.Cells.b9 p0;
    public org.telegram.ui.Cells.p8 q0;
    public final org.telegram.ui.Components.z8 r;
    public TLRPC.FileLocation r0;
    public final org.telegram.ui.Components.e40 s;
    public long s0;
    public TLRPC.Chat t0;
    public TLRPC.ChatFull u0;
    public org.telegram.ui.Components.ut v;
    public TLRPC.TL_chatAdminRights v0;
    public gh.m w;
    public TLRPC.TL_chatBannedRights w0;
    public org.telegram.ui.Components.in0 x;
    public TLRPC.TL_chatBannedRights x0;
    public LinearLayout y;
    public final long y0;
    public TLRPC.User z0;

    public ho(Bundle bundle) {
        super(bundle);
        this.L0 = new ArrayList();
        this.M0 = new fo(this);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.s0 = bundle.getLong("chat_id", 0L);
        this.y0 = bundle.getLong("user_id", 0L);
        if (this.s0 == 0) {
            this.s = new org.telegram.ui.Components.e40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.s0));
            this.s = new org.telegram.ui.Components.e40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void T(ho hoVar, FrameLayout frameLayout, View view) {
        if (!hoVar.C0) {
            TLRPC.ChatFull chatFull = hoVar.u0;
            org.telegram.ui.Components.oc.a0(hoVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", hoVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -hoVar.s0;
        vy vyVar = new vy(null);
        vyVar.a = j10;
        vyVar.setResourceProvider(hoVar.resourceProvider);
        boolean z10 = hoVar.B0;
        boolean z11 = hoVar.D0;
        bg.y0 y0Var = new bg.y0(14, hoVar, view);
        vyVar.c = z10;
        vyVar.d = z11;
        vyVar.f = y0Var;
        hoVar.presentFragment(vyVar);
    }

    public static /* synthetic */ void U(ho hoVar) {
        hoVar.r0 = null;
        long j10 = hoVar.y0;
        if (j10 == 0) {
            MessagesController.getInstance(hoVar.currentAccount).changeChatAvatar(hoVar.s0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = hoVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            hoVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new zn(hoVar, 2));
        }
        hoVar.m0(false, true);
        ih.d4 d4Var = hoVar.e;
        org.telegram.ui.Components.z8 z8Var = hoVar.r;
        Object obj = hoVar.z0;
        if (obj == null) {
            obj = hoVar.t0;
        }
        d4Var.h(null, null, z8Var, obj);
        hoVar.N0.K(0);
        hoVar.X.e.d();
    }

    public static void W(ho hoVar) {
        int i9 = hoVar.currentAccount;
        long j10 = hoVar.y0;
        TL_bots.botVerifierSettings botverifiersettings = hoVar.A0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e10 = org.telegram.messenger.l0.e(16, "onlySelect", "dialogsType", true);
        e10.putBoolean("resetDelegate", false);
        dy dyVar = new dy(e10);
        dyVar.setCurrentAccount(i9);
        dyVar.y2 = new mh.q1(dyVar, i9, j10, botverifiersettings);
        U.presentFragment(dyVar);
    }

    public static void X(ho hoVar, org.telegram.ui.ActionBar.c2 c2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        c2Var.dismiss();
        if (hoVar.getParentActivity() == null) {
            return;
        }
        zf.j0 j0Var = new zf.j0(35, hoVar.currentAccount, hoVar.getParentActivity(), hoVar, hoVar.getResourceProvider());
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j10);
        TLRPC.Chat chat = hoVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.M0 = new rd(20, hoVar, chat);
        }
        hoVar.showDialog(j0Var);
    }

    public static void Y(ho hoVar) {
        xc xcVar = new xc(-hoVar.t0.id);
        xcVar.h0 = hoVar;
        hoVar.presentFragment(xcVar);
        MessagesController.getInstance(hoVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(hoVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void Z(ho hoVar) {
        hoVar.K0 = true;
        NotificationCenter.getInstance(hoVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder c0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        l00 l00Var = new l00(10);
        l00Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        l00Var.f = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false);
        spannableStringBuilder.setSpan(l00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String f0(TLRPC.User user) {
        String str = user.username;
        if (str != null) {
            return str;
        }
        ArrayList<TLRPC.TL_username> arrayList = user.usernames;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i9);
            i9++;
            TLRPC.TL_username tL_username2 = tL_username;
            if (tL_username2.active) {
                return tL_username2.username;
            }
        }
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0915  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0efc  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0f08  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07f3  */
    @Override // org.telegram.ui.ActionBar.o2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        long j10;
        Integer num;
        ed edVar;
        final int i9;
        final ho hoVar;
        Context context2;
        final int i10;
        Integer num2;
        boolean z10;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        final int i11;
        TLRPC.User user;
        final ho hoVar2;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        int i12;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        org.telegram.ui.Cells.p8 p8Var3;
        org.telegram.ui.Cells.p8 p8Var4;
        org.telegram.ui.Cells.p8 p8Var5;
        org.telegram.ui.Cells.p8 p8Var6;
        TLRPC.ChatFull chatFull2;
        boolean z11;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i13 = 1;
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 25));
        ed edVar2 = new ed(i13, context, this);
        edVar2.setOnTouchListener(new jh.d(9));
        this.fragmentView = edVar2;
        edVar2.setBackgroundColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.a7));
        gh.m mVar = new gh.m(context);
        this.w = mVar;
        final int i14 = 0;
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(context, this.w, this.resourceProvider, false);
        this.x = in0Var;
        in0Var.setFillViewport(true);
        edVar2.addView(this.x, g7.e6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(mVar, new FrameLayout.LayoutParams(-1, -2));
        mVar.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.d6));
        mVar.addView(this.d, g7.e6.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, g7.e6.n(-1, -2));
        int i15 = 5;
        ih.d4 d4Var = new ih.d4(this, context, i15);
        this.e = d4Var;
        d4Var.setRoundRadius(this.B0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.z0 != null || ChatObject.canChangeChatInfo(this.t0)) {
            ih.d4 d4Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(d4Var2, g7.e6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            kh.h6 h6Var = new kh.h6(this, context, paint, i15);
            this.f = h6Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(h6Var, g7.e6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, g7.e6.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            m0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j11 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j11 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j11));
                                if (user2 == null) {
                                    TLRPC.Chat chat3 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i16 = chatPhoto2.dc_id;
                                        if (i16 != 0) {
                                            chatPhoto2.photo_big.dc_id = i16;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat3.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i17 = userProfilePhoto2.dc_id;
                                        if (i17 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i17;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j12 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var7 = hoVar14.D;
                            boolean z15 = p8Var7 != null && p8Var7.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j12;
                            voVar.j0 = z15;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z16 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat4 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !hpVar.f.megagroup) {
                                z16 = true;
                            }
                            hpVar.s = z16;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i18 = 0; i18 < tL_chatReactionsSome.reactions.size(); i18++) {
                                            if (tL_chatReactionsSome.reactions.get(i18) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i18)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
        } else {
            ih.d4 d4Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(d4Var3, g7.e6.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.ut utVar2 = new org.telegram.ui.Components.ut(context, edVar2, this);
        this.v = utVar2;
        long j11 = this.y0;
        if (j11 != 0) {
            utVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.E0) {
            utVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            utVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.ut utVar3 = this.v;
        TLRPC.Chat chat3 = this.t0;
        utVar3.setEnabled(chat3 != null || ChatObject.canChangeChatInfo(chat3));
        org.telegram.ui.Components.ut utVar4 = this.v;
        utVar4.setFocusable(utVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new o0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.ut utVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(utVar5, g7.e6.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        mVar.addView(this.y, g7.e6.n(-1, -2));
        final int i16 = 12;
        if (this.z0 != null || ChatObject.canChangeChatInfo(this.t0)) {
            go goVar = new go(context);
            this.X = goVar;
            goVar.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
            this.X.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
            this.X.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i17 = userProfilePhoto2.dc_id;
                                        if (i17 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i17;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j12 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var7 = hoVar14.D;
                            boolean z152 = p8Var7 != null && p8Var7.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j12;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat4 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i18 = 0; i18 < tL_chatReactionsSome.reactions.size(); i18++) {
                                            if (tL_chatReactionsSome.reactions.get(i18) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i18)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.X, g7.e6.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.A = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.A.setHintTextColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.A;
        int i17 = org.telegram.ui.ActionBar.f6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.f6.u0(i17));
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
        this.A.setCursorColor(org.telegram.ui.ActionBar.f6.u0(i17));
        this.A.setCursorSize(AndroidUtilities.dp(20.0f));
        this.A.setCursorWidth(1.5f);
        if (this.A.isEnabled()) {
            this.y.addView(this.A, g7.e6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.A, g7.e6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.A.setOnEditorActionListener(new ea(this, 2));
        this.A.addTextChangedListener(new hd(1));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context);
        this.C = z6Var;
        mVar.addView(z6Var, g7.e6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.B = linearLayout3;
        linearLayout3.setOrientation(1);
        mVar.addView(this.B, g7.e6.n(-1, -2));
        TLRPC.Chat chat4 = this.t0;
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.u0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.p8 p8Var7 = new org.telegram.ui.Cells.p8(context);
                this.D = p8Var7;
                p8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.B.addView(this.D, g7.e6.n(-1, -2));
                final int i18 = 15;
                this.D.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                    public final /* synthetic */ ho b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i18) {
                            case 0:
                                ho hoVar3 = this.b;
                                hoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", hoVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.w0(hoVar3.u0);
                                hoVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ho hoVar4 = this.b;
                                fo foVar = hoVar4.M0;
                                long j112 = hoVar4.y0;
                                if (!hoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ho hoVar5 = this.b;
                                hoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", hoVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.w0(hoVar5.u0);
                                hoVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ho hoVar6 = this.b;
                                hoVar6.presentFragment(new ih0(hoVar6.s0));
                                break;
                            case 4:
                                ho hoVar7 = this.b;
                                hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                break;
                            case 5:
                                ho hoVar8 = this.b;
                                hoVar8.getClass();
                                hoVar8.presentFragment(new pb(hoVar8.t0));
                                break;
                            case 6:
                                ho hoVar9 = this.b;
                                hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                break;
                            case 7:
                                ho hoVar10 = this.b;
                                hoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", hoVar10.y0);
                                hoVar10.presentFragment(new ma(bundle3));
                                break;
                            case 8:
                                ho hoVar11 = this.b;
                                hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                break;
                            case 9:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                break;
                            case 12:
                                this.b.h0();
                                break;
                            case 13:
                                ho.W(this.b);
                                break;
                            case 14:
                                ho hoVar12 = this.b;
                                org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                break;
                            case 15:
                                ho hoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.a0 = -hoVar13.s0;
                                    TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.B0 = new ao(hoVar13, 6);
                                    hoVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ho hoVar14 = this.b;
                                long j12 = hoVar14.s0;
                                org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                vo voVar = new vo(null);
                                voVar.I = new ArrayList();
                                voVar.J = new ArrayList();
                                voVar.L = new ArrayList();
                                voVar.Y = true;
                                voVar.b0 = new ArrayList();
                                voVar.k0 = new HashMap();
                                voVar.m0 = new ko(voVar, 5);
                                voVar.p0 = false;
                                voVar.V = j12;
                                voVar.j0 = z152;
                                TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                voVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        voVar.h0 = tL_chatInviteExported;
                                    } else {
                                        voVar.W(false);
                                    }
                                }
                                hoVar14.presentFragment(voVar);
                                break;
                            case 17:
                                ho hoVar15 = this.b;
                                long j13 = hoVar15.s0;
                                hp hpVar = new hp(null);
                                hpVar.v = new ArrayList();
                                boolean z162 = false;
                                hpVar.K = false;
                                hpVar.L = false;
                                hpVar.A = j13;
                                TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                hpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                    z162 = true;
                                }
                                hpVar.s = z162;
                                hpVar.h = hoVar15.u0;
                                hoVar15.presentFragment(hpVar);
                                break;
                            case 18:
                                ho hoVar16 = this.b;
                                pv0 pv0Var = new pv0(hoVar16.s0);
                                pv0Var.v = new ao(hoVar16, 4);
                                hoVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ho.Y(this.b);
                                break;
                            case 20:
                                ho hoVar17 = this.b;
                                y50 y50Var = new y50(-hoVar17.t0.id);
                                y50Var.c = hoVar17.H0;
                                y50Var.h0 = hoVar17;
                                hoVar17.presentFragment(y50Var);
                                break;
                            case 21:
                                ho hoVar18 = this.b;
                                hoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", hoVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.w0(hoVar18.u0);
                                hoVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ho hoVar19 = this.b;
                                hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                hoVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ho hoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                    hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", hoVar20.s0);
                                    op opVar = new op(bundle5);
                                    opVar.d = new ArrayList();
                                    opVar.r = new ArrayList();
                                    opVar.v = -1;
                                    opVar.B = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    opVar.c = j14;
                                    TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                    opVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (opVar.a == null) {
                                            opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        opVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            opVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            opVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            opVar.w = 1;
                                        }
                                    }
                                    hoVar20.presentFragment(opVar);
                                    break;
                                }
                            default:
                                ho hoVar21 = this.b;
                                hoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", hoVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                hoVar21.presentFragment(new qn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.t0.creator && ((chatFull3 = this.u0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.p8 p8Var8 = new org.telegram.ui.Cells.p8(context);
                this.E = p8Var8;
                p8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.B.addView(this.E, g7.e6.n(-1, -2));
                final int i19 = 16;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                    public final /* synthetic */ ho b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i19) {
                            case 0:
                                ho hoVar3 = this.b;
                                hoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", hoVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.w0(hoVar3.u0);
                                hoVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ho hoVar4 = this.b;
                                fo foVar = hoVar4.M0;
                                long j112 = hoVar4.y0;
                                if (!hoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ho hoVar5 = this.b;
                                hoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", hoVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.w0(hoVar5.u0);
                                hoVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ho hoVar6 = this.b;
                                hoVar6.presentFragment(new ih0(hoVar6.s0));
                                break;
                            case 4:
                                ho hoVar7 = this.b;
                                hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                break;
                            case 5:
                                ho hoVar8 = this.b;
                                hoVar8.getClass();
                                hoVar8.presentFragment(new pb(hoVar8.t0));
                                break;
                            case 6:
                                ho hoVar9 = this.b;
                                hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                break;
                            case 7:
                                ho hoVar10 = this.b;
                                hoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", hoVar10.y0);
                                hoVar10.presentFragment(new ma(bundle3));
                                break;
                            case 8:
                                ho hoVar11 = this.b;
                                hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                break;
                            case 9:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                break;
                            case 12:
                                this.b.h0();
                                break;
                            case 13:
                                ho.W(this.b);
                                break;
                            case 14:
                                ho hoVar12 = this.b;
                                org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                break;
                            case 15:
                                ho hoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.a0 = -hoVar13.s0;
                                    TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.B0 = new ao(hoVar13, 6);
                                    hoVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ho hoVar14 = this.b;
                                long j12 = hoVar14.s0;
                                org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                vo voVar = new vo(null);
                                voVar.I = new ArrayList();
                                voVar.J = new ArrayList();
                                voVar.L = new ArrayList();
                                voVar.Y = true;
                                voVar.b0 = new ArrayList();
                                voVar.k0 = new HashMap();
                                voVar.m0 = new ko(voVar, 5);
                                voVar.p0 = false;
                                voVar.V = j12;
                                voVar.j0 = z152;
                                TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                voVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        voVar.h0 = tL_chatInviteExported;
                                    } else {
                                        voVar.W(false);
                                    }
                                }
                                hoVar14.presentFragment(voVar);
                                break;
                            case 17:
                                ho hoVar15 = this.b;
                                long j13 = hoVar15.s0;
                                hp hpVar = new hp(null);
                                hpVar.v = new ArrayList();
                                boolean z162 = false;
                                hpVar.K = false;
                                hpVar.L = false;
                                hpVar.A = j13;
                                TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                hpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                    z162 = true;
                                }
                                hpVar.s = z162;
                                hpVar.h = hoVar15.u0;
                                hoVar15.presentFragment(hpVar);
                                break;
                            case 18:
                                ho hoVar16 = this.b;
                                pv0 pv0Var = new pv0(hoVar16.s0);
                                pv0Var.v = new ao(hoVar16, 4);
                                hoVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ho.Y(this.b);
                                break;
                            case 20:
                                ho hoVar17 = this.b;
                                y50 y50Var = new y50(-hoVar17.t0.id);
                                y50Var.c = hoVar17.H0;
                                y50Var.h0 = hoVar17;
                                hoVar17.presentFragment(y50Var);
                                break;
                            case 21:
                                ho hoVar18 = this.b;
                                hoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", hoVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.w0(hoVar18.u0);
                                hoVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ho hoVar19 = this.b;
                                hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                hoVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ho hoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                    hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", hoVar20.s0);
                                    op opVar = new op(bundle5);
                                    opVar.d = new ArrayList();
                                    opVar.r = new ArrayList();
                                    opVar.v = -1;
                                    opVar.B = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    opVar.c = j14;
                                    TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                    opVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (opVar.a == null) {
                                            opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        opVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            opVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            opVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            opVar.w = 1;
                                        }
                                    }
                                    hoVar20.presentFragment(opVar);
                                    break;
                                }
                            default:
                                ho hoVar21 = this.b;
                                hoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", hoVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                hoVar21.presentFragment(new qn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.t0) && ((this.E0 && ChatObject.canUserDoAdminAction(this.t0, 1)) || (!this.E0 && ChatObject.canUserDoAdminAction(this.t0, 0)))) {
                org.telegram.ui.Cells.p8 p8Var9 = new org.telegram.ui.Cells.p8(context);
                this.F = p8Var9;
                p8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                this.B.addView(this.F, g7.e6.n(-1, -2));
                final int i20 = 17;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                    public final /* synthetic */ ho b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i20) {
                            case 0:
                                ho hoVar3 = this.b;
                                hoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", hoVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.w0(hoVar3.u0);
                                hoVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ho hoVar4 = this.b;
                                fo foVar = hoVar4.M0;
                                long j112 = hoVar4.y0;
                                if (!hoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ho hoVar5 = this.b;
                                hoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", hoVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.w0(hoVar5.u0);
                                hoVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ho hoVar6 = this.b;
                                hoVar6.presentFragment(new ih0(hoVar6.s0));
                                break;
                            case 4:
                                ho hoVar7 = this.b;
                                hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                break;
                            case 5:
                                ho hoVar8 = this.b;
                                hoVar8.getClass();
                                hoVar8.presentFragment(new pb(hoVar8.t0));
                                break;
                            case 6:
                                ho hoVar9 = this.b;
                                hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                break;
                            case 7:
                                ho hoVar10 = this.b;
                                hoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", hoVar10.y0);
                                hoVar10.presentFragment(new ma(bundle3));
                                break;
                            case 8:
                                ho hoVar11 = this.b;
                                hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                break;
                            case 9:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                break;
                            case 12:
                                this.b.h0();
                                break;
                            case 13:
                                ho.W(this.b);
                                break;
                            case 14:
                                ho hoVar12 = this.b;
                                org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                break;
                            case 15:
                                ho hoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.a0 = -hoVar13.s0;
                                    TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.B0 = new ao(hoVar13, 6);
                                    hoVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ho hoVar14 = this.b;
                                long j12 = hoVar14.s0;
                                org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                vo voVar = new vo(null);
                                voVar.I = new ArrayList();
                                voVar.J = new ArrayList();
                                voVar.L = new ArrayList();
                                voVar.Y = true;
                                voVar.b0 = new ArrayList();
                                voVar.k0 = new HashMap();
                                voVar.m0 = new ko(voVar, 5);
                                voVar.p0 = false;
                                voVar.V = j12;
                                voVar.j0 = z152;
                                TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                voVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        voVar.h0 = tL_chatInviteExported;
                                    } else {
                                        voVar.W(false);
                                    }
                                }
                                hoVar14.presentFragment(voVar);
                                break;
                            case 17:
                                ho hoVar15 = this.b;
                                long j13 = hoVar15.s0;
                                hp hpVar = new hp(null);
                                hpVar.v = new ArrayList();
                                boolean z162 = false;
                                hpVar.K = false;
                                hpVar.L = false;
                                hpVar.A = j13;
                                TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                hpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                    z162 = true;
                                }
                                hpVar.s = z162;
                                hpVar.h = hoVar15.u0;
                                hoVar15.presentFragment(hpVar);
                                break;
                            case 18:
                                ho hoVar16 = this.b;
                                pv0 pv0Var = new pv0(hoVar16.s0);
                                pv0Var.v = new ao(hoVar16, 4);
                                hoVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ho.Y(this.b);
                                break;
                            case 20:
                                ho hoVar17 = this.b;
                                y50 y50Var = new y50(-hoVar17.t0.id);
                                y50Var.c = hoVar17.H0;
                                y50Var.h0 = hoVar17;
                                hoVar17.presentFragment(y50Var);
                                break;
                            case 21:
                                ho hoVar18 = this.b;
                                hoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", hoVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.w0(hoVar18.u0);
                                hoVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ho hoVar19 = this.b;
                                hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                hoVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ho hoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                    hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", hoVar20.s0);
                                    op opVar = new op(bundle5);
                                    opVar.d = new ArrayList();
                                    opVar.r = new ArrayList();
                                    opVar.v = -1;
                                    opVar.B = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    opVar.c = j14;
                                    TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                    opVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (opVar.a == null) {
                                            opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        opVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            opVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            opVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            opVar.w = 1;
                                        }
                                    }
                                    hoVar20.presentFragment(opVar);
                                    break;
                                }
                            default:
                                ho hoVar21 = this.b;
                                hoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", hoVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                hoVar21.presentFragment(new qn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.t0) && this.E0 && ChatObject.canUserDoAdminAction(this.t0, 1)) {
                org.telegram.ui.Cells.p8 p8Var10 = new org.telegram.ui.Cells.p8(context);
                this.G = p8Var10;
                p8Var10.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
                this.G.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.B.addView(this.G, g7.e6.n(-1, -2));
                final int i21 = 18;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                    public final /* synthetic */ ho b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                ho hoVar3 = this.b;
                                hoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", hoVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.w0(hoVar3.u0);
                                hoVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ho hoVar4 = this.b;
                                fo foVar = hoVar4.M0;
                                long j112 = hoVar4.y0;
                                if (!hoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ho hoVar5 = this.b;
                                hoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", hoVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.w0(hoVar5.u0);
                                hoVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ho hoVar6 = this.b;
                                hoVar6.presentFragment(new ih0(hoVar6.s0));
                                break;
                            case 4:
                                ho hoVar7 = this.b;
                                hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                break;
                            case 5:
                                ho hoVar8 = this.b;
                                hoVar8.getClass();
                                hoVar8.presentFragment(new pb(hoVar8.t0));
                                break;
                            case 6:
                                ho hoVar9 = this.b;
                                hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                break;
                            case 7:
                                ho hoVar10 = this.b;
                                hoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", hoVar10.y0);
                                hoVar10.presentFragment(new ma(bundle3));
                                break;
                            case 8:
                                ho hoVar11 = this.b;
                                hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                break;
                            case 9:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                break;
                            case 12:
                                this.b.h0();
                                break;
                            case 13:
                                ho.W(this.b);
                                break;
                            case 14:
                                ho hoVar12 = this.b;
                                org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                break;
                            case 15:
                                ho hoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.a0 = -hoVar13.s0;
                                    TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.B0 = new ao(hoVar13, 6);
                                    hoVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ho hoVar14 = this.b;
                                long j12 = hoVar14.s0;
                                org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                vo voVar = new vo(null);
                                voVar.I = new ArrayList();
                                voVar.J = new ArrayList();
                                voVar.L = new ArrayList();
                                voVar.Y = true;
                                voVar.b0 = new ArrayList();
                                voVar.k0 = new HashMap();
                                voVar.m0 = new ko(voVar, 5);
                                voVar.p0 = false;
                                voVar.V = j12;
                                voVar.j0 = z152;
                                TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                voVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        voVar.h0 = tL_chatInviteExported;
                                    } else {
                                        voVar.W(false);
                                    }
                                }
                                hoVar14.presentFragment(voVar);
                                break;
                            case 17:
                                ho hoVar15 = this.b;
                                long j13 = hoVar15.s0;
                                hp hpVar = new hp(null);
                                hpVar.v = new ArrayList();
                                boolean z162 = false;
                                hpVar.K = false;
                                hpVar.L = false;
                                hpVar.A = j13;
                                TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                hpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                    z162 = true;
                                }
                                hpVar.s = z162;
                                hpVar.h = hoVar15.u0;
                                hoVar15.presentFragment(hpVar);
                                break;
                            case 18:
                                ho hoVar16 = this.b;
                                pv0 pv0Var = new pv0(hoVar16.s0);
                                pv0Var.v = new ao(hoVar16, 4);
                                hoVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ho.Y(this.b);
                                break;
                            case 20:
                                ho hoVar17 = this.b;
                                y50 y50Var = new y50(-hoVar17.t0.id);
                                y50Var.c = hoVar17.H0;
                                y50Var.h0 = hoVar17;
                                hoVar17.presentFragment(y50Var);
                                break;
                            case 21:
                                ho hoVar18 = this.b;
                                hoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", hoVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.w0(hoVar18.u0);
                                hoVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ho hoVar19 = this.b;
                                hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                hoVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ho hoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                    hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", hoVar20.s0);
                                    op opVar = new op(bundle5);
                                    opVar.d = new ArrayList();
                                    opVar.r = new ArrayList();
                                    opVar.v = -1;
                                    opVar.B = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    opVar.c = j14;
                                    TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                    opVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (opVar.a == null) {
                                            opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        opVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            opVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            opVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            opVar.w = 1;
                                        }
                                    }
                                    hoVar20.presentFragment(opVar);
                                    break;
                                }
                            default:
                                ho hoVar21 = this.b;
                                hoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", hoVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                hoVar21.presentFragment(new qn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.t0) && ChatObject.canChangeChatInfo(this.t0)) {
                num = 1;
                z11 = true;
                j10 = j11;
                i9 = 22;
                ho0 ho0Var = new ho0(this.currentAccount, -this.t0.id, context, getResourceProvider());
                this.H = ho0Var;
                ho0Var.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
                this.B.addView(this.H, g7.e6.n(-1, -2));
                final int i22 = 19;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.un
                    public final /* synthetic */ ho b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                ho hoVar3 = this.b;
                                hoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", hoVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.w0(hoVar3.u0);
                                hoVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ho hoVar4 = this.b;
                                fo foVar = hoVar4.M0;
                                long j112 = hoVar4.y0;
                                if (!hoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ho hoVar5 = this.b;
                                hoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", hoVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.w0(hoVar5.u0);
                                hoVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ho hoVar6 = this.b;
                                hoVar6.presentFragment(new ih0(hoVar6.s0));
                                break;
                            case 4:
                                ho hoVar7 = this.b;
                                hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                break;
                            case 5:
                                ho hoVar8 = this.b;
                                hoVar8.getClass();
                                hoVar8.presentFragment(new pb(hoVar8.t0));
                                break;
                            case 6:
                                ho hoVar9 = this.b;
                                hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                break;
                            case 7:
                                ho hoVar10 = this.b;
                                hoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", hoVar10.y0);
                                hoVar10.presentFragment(new ma(bundle3));
                                break;
                            case 8:
                                ho hoVar11 = this.b;
                                hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                break;
                            case 9:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                break;
                            case 12:
                                this.b.h0();
                                break;
                            case 13:
                                ho.W(this.b);
                                break;
                            case 14:
                                ho hoVar12 = this.b;
                                org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                break;
                            case 15:
                                ho hoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.a0 = -hoVar13.s0;
                                    TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.B0 = new ao(hoVar13, 6);
                                    hoVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ho hoVar14 = this.b;
                                long j12 = hoVar14.s0;
                                org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                vo voVar = new vo(null);
                                voVar.I = new ArrayList();
                                voVar.J = new ArrayList();
                                voVar.L = new ArrayList();
                                voVar.Y = true;
                                voVar.b0 = new ArrayList();
                                voVar.k0 = new HashMap();
                                voVar.m0 = new ko(voVar, 5);
                                voVar.p0 = false;
                                voVar.V = j12;
                                voVar.j0 = z152;
                                TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                voVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        voVar.h0 = tL_chatInviteExported;
                                    } else {
                                        voVar.W(false);
                                    }
                                }
                                hoVar14.presentFragment(voVar);
                                break;
                            case 17:
                                ho hoVar15 = this.b;
                                long j13 = hoVar15.s0;
                                hp hpVar = new hp(null);
                                hpVar.v = new ArrayList();
                                boolean z162 = false;
                                hpVar.K = false;
                                hpVar.L = false;
                                hpVar.A = j13;
                                TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                hpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                    z162 = true;
                                }
                                hpVar.s = z162;
                                hpVar.h = hoVar15.u0;
                                hoVar15.presentFragment(hpVar);
                                break;
                            case 18:
                                ho hoVar16 = this.b;
                                pv0 pv0Var = new pv0(hoVar16.s0);
                                pv0Var.v = new ao(hoVar16, 4);
                                hoVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ho.Y(this.b);
                                break;
                            case 20:
                                ho hoVar17 = this.b;
                                y50 y50Var = new y50(-hoVar17.t0.id);
                                y50Var.c = hoVar17.H0;
                                y50Var.h0 = hoVar17;
                                hoVar17.presentFragment(y50Var);
                                break;
                            case 21:
                                ho hoVar18 = this.b;
                                hoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", hoVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.w0(hoVar18.u0);
                                hoVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ho hoVar19 = this.b;
                                hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                hoVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ho hoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                    hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", hoVar20.s0);
                                    op opVar = new op(bundle5);
                                    opVar.d = new ArrayList();
                                    opVar.r = new ArrayList();
                                    opVar.v = -1;
                                    opVar.B = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    opVar.c = j14;
                                    TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                    opVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (opVar.a == null) {
                                            opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        opVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            opVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            opVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            opVar.w = 1;
                                        }
                                    }
                                    hoVar20.presentFragment(opVar);
                                    break;
                                }
                            default:
                                ho hoVar21 = this.b;
                                hoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", hoVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                hoVar21.presentFragment(new qn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                j10 = j11;
                num = 1;
                i9 = 22;
                z11 = true;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.t0) || ChatObject.isCommunity(this.t0)) {
                context3 = context;
                frameLayout = frameLayout2;
                edVar = edVar2;
                hoVar = this;
            } else {
                long j12 = -this.t0.id;
                edVar = edVar2;
                org.telegram.ui.Cells.p8 p8Var11 = new org.telegram.ui.Cells.p8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.I = p8Var11;
                p8Var11.setBackground(org.telegram.ui.ActionBar.f6.K0(z11));
                this.I.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.t0.autotranslation);
                getMessagesController().getBoostsController().getBoostsStats(j12, new d5.d(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ ho b;

                    {
                        this.b = this;
                    }

                    @Override // d5.d
                    public final void accept(Object obj) {
                        switch (i14) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ho hoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    hoVar3.getClass();
                                    break;
                                } else {
                                    hoVar3.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < hoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.H0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.B.addView(this.I, g7.e6.n(-1, -2));
                frameLayout = frameLayout2;
                hoVar = this;
                this.I.setOnClickListener(new gh.s2(this, new boolean[]{false}, j12, 1));
            }
            if (!hoVar.E0 && ChatObject.canBlockUsers(hoVar.t0) && (ChatObject.isChannel(hoVar.t0) || hoVar.t0.creator)) {
                org.telegram.ui.Cells.p8 p8Var12 = new org.telegram.ui.Cells.p8(context3);
                hoVar.J = p8Var12;
                p8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(true));
                hoVar.B.addView(hoVar.J, g7.e6.n(-1, -2));
                hoVar.J.setOnClickListener(new mh.k3(i9, hoVar, context3));
            }
            if (ChatObject.isMegagroup(hoVar.t0) && ChatObject.hasAdminRights(hoVar.t0) && !ChatObject.isCommunity(hoVar.t0)) {
                final int i23 = 1;
                MessagesController.getInstance(hoVar.currentAccount).getBoostsController().getBoostsStats(-hoVar.t0.id, new d5.d(hoVar) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ ho b;

                    {
                        this.b = hoVar;
                    }

                    @Override // d5.d
                    public final void accept(Object obj) {
                        switch (i23) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                ho hoVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    hoVar3.getClass();
                                    break;
                                } else {
                                    hoVar3.I.getCheckBox().setIcon(tL_premium_boostsStatus.level < hoVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.H0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                ho0 ho0Var2 = new ho0(hoVar.currentAccount, -hoVar.t0.id, context3, hoVar.getResourceProvider());
                hoVar.H = ho0Var2;
                ho0Var2.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
                hoVar.B.addView(hoVar.H, g7.e6.n(-1, -2));
                final int i24 = 20;
                hoVar.H.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                    public final /* synthetic */ ho b;

                    {
                        this.b = hoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                ho hoVar3 = this.b;
                                hoVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", hoVar3.s0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                jr jrVar = new jr(bundle);
                                jrVar.w0(hoVar3.u0);
                                hoVar3.presentFragment(jrVar);
                                break;
                            case 1:
                                ho hoVar4 = this.b;
                                fo foVar = hoVar4.M0;
                                long j112 = hoVar4.y0;
                                if (!hoVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i162 = chatPhoto2.dc_id;
                                            if (i162 != 0) {
                                                chatPhoto2.photo_big.dc_id = i162;
                                            }
                                            TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, hoVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i172 = userProfilePhoto2.dc_id;
                                            if (i172 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i172;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                ho hoVar5 = this.b;
                                hoVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", hoVar5.s0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                jr jrVar2 = new jr(bundle2);
                                jrVar2.w0(hoVar5.u0);
                                hoVar5.presentFragment(jrVar2);
                                break;
                            case 3:
                                ho hoVar6 = this.b;
                                hoVar6.presentFragment(new ih0(hoVar6.s0));
                                break;
                            case 4:
                                ho hoVar7 = this.b;
                                hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                break;
                            case 5:
                                ho hoVar8 = this.b;
                                hoVar8.getClass();
                                hoVar8.presentFragment(new pb(hoVar8.t0));
                                break;
                            case 6:
                                ho hoVar9 = this.b;
                                hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                break;
                            case 7:
                                ho hoVar10 = this.b;
                                hoVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", hoVar10.y0);
                                hoVar10.presentFragment(new ma(bundle3));
                                break;
                            case 8:
                                ho hoVar11 = this.b;
                                hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                break;
                            case 9:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                break;
                            case 10:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                break;
                            case 11:
                                ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                break;
                            case 12:
                                this.b.h0();
                                break;
                            case 13:
                                ho.W(this.b);
                                break;
                            case 14:
                                ho hoVar12 = this.b;
                                org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                break;
                            case 15:
                                ho hoVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.a0 = -hoVar13.s0;
                                    TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.B0 = new ao(hoVar13, 6);
                                    hoVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                ho hoVar14 = this.b;
                                long j122 = hoVar14.s0;
                                org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                vo voVar = new vo(null);
                                voVar.I = new ArrayList();
                                voVar.J = new ArrayList();
                                voVar.L = new ArrayList();
                                voVar.Y = true;
                                voVar.b0 = new ArrayList();
                                voVar.k0 = new HashMap();
                                voVar.m0 = new ko(voVar, 5);
                                voVar.p0 = false;
                                voVar.V = j122;
                                voVar.j0 = z152;
                                TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                voVar.U = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        voVar.h0 = tL_chatInviteExported;
                                    } else {
                                        voVar.W(false);
                                    }
                                }
                                hoVar14.presentFragment(voVar);
                                break;
                            case 17:
                                ho hoVar15 = this.b;
                                long j13 = hoVar15.s0;
                                hp hpVar = new hp(null);
                                hpVar.v = new ArrayList();
                                boolean z162 = false;
                                hpVar.K = false;
                                hpVar.L = false;
                                hpVar.A = j13;
                                TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                hpVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                    z162 = true;
                                }
                                hpVar.s = z162;
                                hpVar.h = hoVar15.u0;
                                hoVar15.presentFragment(hpVar);
                                break;
                            case 18:
                                ho hoVar16 = this.b;
                                pv0 pv0Var = new pv0(hoVar16.s0);
                                pv0Var.v = new ao(hoVar16, 4);
                                hoVar16.presentFragment(pv0Var);
                                break;
                            case 19:
                                ho.Y(this.b);
                                break;
                            case 20:
                                ho hoVar17 = this.b;
                                y50 y50Var = new y50(-hoVar17.t0.id);
                                y50Var.c = hoVar17.H0;
                                y50Var.h0 = hoVar17;
                                hoVar17.presentFragment(y50Var);
                                break;
                            case 21:
                                ho hoVar18 = this.b;
                                hoVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", hoVar18.s0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                jr jrVar3 = new jr(bundle4);
                                jrVar3.w0(hoVar18.u0);
                                hoVar18.presentFragment(jrVar3);
                                break;
                            case 22:
                                ho hoVar19 = this.b;
                                hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                hoVar19.presentFragment(hh0Var);
                                break;
                            case 23:
                                ho hoVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                    hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", hoVar20.s0);
                                    op opVar = new op(bundle5);
                                    opVar.d = new ArrayList();
                                    opVar.r = new ArrayList();
                                    opVar.v = -1;
                                    opVar.B = new ArrayList();
                                    long j14 = bundle5.getLong("chat_id", 0L);
                                    opVar.c = j14;
                                    TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                    opVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (opVar.a == null) {
                                            opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                        }
                                        opVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            opVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            opVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                    opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                }
                                            }
                                            opVar.w = 1;
                                        }
                                    }
                                    hoVar20.presentFragment(opVar);
                                    break;
                                }
                            default:
                                ho hoVar21 = this.b;
                                hoVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", hoVar21.s0);
                                bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                hoVar21.presentFragment(new qn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!hoVar.E0 && hoVar.t0.creator) {
                org.telegram.ui.Cells.p8 p8Var13 = new org.telegram.ui.Cells.p8(23, context, null, false, true);
                context2 = context;
                hoVar.M = p8Var13;
                p8Var13.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
                hoVar.M.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), hoVar.B0);
                hoVar.M.getCheckBox().setIcon(hoVar.C0 ? 0 : R.drawable.permission_locked);
                hoVar.B.addView(hoVar.M, g7.e6.c(-2.0f, -1));
                hoVar.M.setOnClickListener(new mh.k3(23, hoVar, frameLayout));
            } else {
                context2 = context;
            }
            hoVar.n0();
        } else {
            j10 = j11;
            num = 1;
            edVar = edVar2;
            i9 = 22;
            hoVar = this;
            context2 = context;
        }
        org.telegram.ui.ActionBar.z n10 = hoVar.actionBar.n();
        if (hoVar.z0 != null || ChatObject.canChangeChatInfo(hoVar.t0) || hoVar.J != null) {
            org.telegram.ui.ActionBar.w0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            hoVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (hoVar.D != null || hoVar.J != null || hoVar.E != null || hoVar.F != null || hoVar.M != null) {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context2, 12, hoVar.resourceProvider);
            hoVar.L = b9Var;
            if (hoVar.M != null) {
                b9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                b9Var.setFixedSize(12);
            }
            mVar.addView(hoVar.L, g7.e6.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        hoVar.N = linearLayout4;
        linearLayout4.setOrientation(1);
        mVar.addView(hoVar.N, g7.e6.n(-1, -2));
        final int i25 = 8;
        if (hoVar.t0 != null) {
            org.telegram.ui.Cells.p8 p8Var14 = new org.telegram.ui.Cells.p8(context2);
            hoVar.T = p8Var14;
            p8Var14.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            org.telegram.ui.Cells.p8 p8Var15 = hoVar.T;
            if (!ChatObject.isChannel(hoVar.t0)) {
                TLRPC.Chat chat5 = hoVar.t0;
                if (!chat5.creator && (!ChatObject.hasAdminRights(chat5) || !ChatObject.canChangeChatInfo(hoVar.t0))) {
                    i12 = 8;
                    p8Var15.setVisibility(i12);
                    final int i26 = 21;
                    hoVar.T.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i26) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j13 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j13;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j14;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.p8 p8Var16 = new org.telegram.ui.Cells.p8(context2);
                    hoVar.R = p8Var16;
                    p8Var16.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    hoVar.R.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i9) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j13 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j13;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j14;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.p8 p8Var17 = new org.telegram.ui.Cells.p8(context2);
                    hoVar.K = p8Var17;
                    p8Var17.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    final int i27 = 23;
                    hoVar.K.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i27) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j13 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j13;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j14;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(hoVar.t0, 28)) {
                        org.telegram.ui.Cells.p8 p8Var18 = new org.telegram.ui.Cells.p8(context2);
                        hoVar.b0 = p8Var18;
                        p8Var18.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        final int i28 = 24;
                        hoVar.b0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                            public final /* synthetic */ ho b;

                            {
                                this.b = hoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i28) {
                                    case 0:
                                        ho hoVar3 = this.b;
                                        hoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", hoVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.w0(hoVar3.u0);
                                        hoVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ho hoVar4 = this.b;
                                        fo foVar = hoVar4.M0;
                                        long j112 = hoVar4.y0;
                                        if (!hoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ho hoVar5 = this.b;
                                        hoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", hoVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.w0(hoVar5.u0);
                                        hoVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ho hoVar6 = this.b;
                                        hoVar6.presentFragment(new ih0(hoVar6.s0));
                                        break;
                                    case 4:
                                        ho hoVar7 = this.b;
                                        hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                        break;
                                    case 5:
                                        ho hoVar8 = this.b;
                                        hoVar8.getClass();
                                        hoVar8.presentFragment(new pb(hoVar8.t0));
                                        break;
                                    case 6:
                                        ho hoVar9 = this.b;
                                        hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                        break;
                                    case 7:
                                        ho hoVar10 = this.b;
                                        hoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", hoVar10.y0);
                                        hoVar10.presentFragment(new ma(bundle3));
                                        break;
                                    case 8:
                                        ho hoVar11 = this.b;
                                        hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                        break;
                                    case 9:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.h0();
                                        break;
                                    case 13:
                                        ho.W(this.b);
                                        break;
                                    case 14:
                                        ho hoVar12 = this.b;
                                        org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                        break;
                                    case 15:
                                        ho hoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.a0 = -hoVar13.s0;
                                            TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.B0 = new ao(hoVar13, 6);
                                            hoVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ho hoVar14 = this.b;
                                        long j122 = hoVar14.s0;
                                        org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        vo voVar = new vo(null);
                                        voVar.I = new ArrayList();
                                        voVar.J = new ArrayList();
                                        voVar.L = new ArrayList();
                                        voVar.Y = true;
                                        voVar.b0 = new ArrayList();
                                        voVar.k0 = new HashMap();
                                        voVar.m0 = new ko(voVar, 5);
                                        voVar.p0 = false;
                                        voVar.V = j122;
                                        voVar.j0 = z152;
                                        TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                        voVar.U = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                voVar.h0 = tL_chatInviteExported;
                                            } else {
                                                voVar.W(false);
                                            }
                                        }
                                        hoVar14.presentFragment(voVar);
                                        break;
                                    case 17:
                                        ho hoVar15 = this.b;
                                        long j13 = hoVar15.s0;
                                        hp hpVar = new hp(null);
                                        hpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        hpVar.K = false;
                                        hpVar.L = false;
                                        hpVar.A = j13;
                                        TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        hpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        hpVar.s = z162;
                                        hpVar.h = hoVar15.u0;
                                        hoVar15.presentFragment(hpVar);
                                        break;
                                    case 18:
                                        ho hoVar16 = this.b;
                                        pv0 pv0Var = new pv0(hoVar16.s0);
                                        pv0Var.v = new ao(hoVar16, 4);
                                        hoVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ho.Y(this.b);
                                        break;
                                    case 20:
                                        ho hoVar17 = this.b;
                                        y50 y50Var = new y50(-hoVar17.t0.id);
                                        y50Var.c = hoVar17.H0;
                                        y50Var.h0 = hoVar17;
                                        hoVar17.presentFragment(y50Var);
                                        break;
                                    case 21:
                                        ho hoVar18 = this.b;
                                        hoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", hoVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.w0(hoVar18.u0);
                                        hoVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ho hoVar19 = this.b;
                                        hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                        hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                        hoVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ho hoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                            hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", hoVar20.s0);
                                            op opVar = new op(bundle5);
                                            opVar.d = new ArrayList();
                                            opVar.r = new ArrayList();
                                            opVar.v = -1;
                                            opVar.B = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            opVar.c = j14;
                                            TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                            opVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (opVar.a == null) {
                                                    opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                opVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    opVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    opVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    opVar.w = 1;
                                                }
                                            }
                                            hoVar20.presentFragment(opVar);
                                            break;
                                        }
                                    default:
                                        ho hoVar21 = this.b;
                                        hoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", hoVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                        hoVar21.presentFragment(new qn(bundle6));
                                        break;
                                }
                            }
                        });
                        hoVar.e0();
                    }
                    org.telegram.ui.Cells.p8 p8Var19 = new org.telegram.ui.Cells.p8(context2);
                    hoVar.S = p8Var19;
                    p8Var19.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    hoVar.S.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j13 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j13;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j14;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.p8 p8Var20 = new org.telegram.ui.Cells.p8(context2);
                    hoVar.P = p8Var20;
                    p8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                    final int i29 = 2;
                    hoVar.P.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j13 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j13;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j14;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.isChannelAndNotMegaGroup(hoVar.t0)) {
                        org.telegram.ui.Cells.p8 p8Var21 = new org.telegram.ui.Cells.p8(context2);
                        hoVar.Q = p8Var21;
                        p8Var21.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        i10 = 3;
                        hoVar.Q.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                            public final /* synthetic */ ho b;

                            {
                                this.b = hoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i10) {
                                    case 0:
                                        ho hoVar3 = this.b;
                                        hoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", hoVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.w0(hoVar3.u0);
                                        hoVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ho hoVar4 = this.b;
                                        fo foVar = hoVar4.M0;
                                        long j112 = hoVar4.y0;
                                        if (!hoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ho hoVar5 = this.b;
                                        hoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", hoVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.w0(hoVar5.u0);
                                        hoVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ho hoVar6 = this.b;
                                        hoVar6.presentFragment(new ih0(hoVar6.s0));
                                        break;
                                    case 4:
                                        ho hoVar7 = this.b;
                                        hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                        break;
                                    case 5:
                                        ho hoVar8 = this.b;
                                        hoVar8.getClass();
                                        hoVar8.presentFragment(new pb(hoVar8.t0));
                                        break;
                                    case 6:
                                        ho hoVar9 = this.b;
                                        hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                        break;
                                    case 7:
                                        ho hoVar10 = this.b;
                                        hoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", hoVar10.y0);
                                        hoVar10.presentFragment(new ma(bundle3));
                                        break;
                                    case 8:
                                        ho hoVar11 = this.b;
                                        hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                        break;
                                    case 9:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.h0();
                                        break;
                                    case 13:
                                        ho.W(this.b);
                                        break;
                                    case 14:
                                        ho hoVar12 = this.b;
                                        org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                        break;
                                    case 15:
                                        ho hoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.a0 = -hoVar13.s0;
                                            TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.B0 = new ao(hoVar13, 6);
                                            hoVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ho hoVar14 = this.b;
                                        long j122 = hoVar14.s0;
                                        org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        vo voVar = new vo(null);
                                        voVar.I = new ArrayList();
                                        voVar.J = new ArrayList();
                                        voVar.L = new ArrayList();
                                        voVar.Y = true;
                                        voVar.b0 = new ArrayList();
                                        voVar.k0 = new HashMap();
                                        voVar.m0 = new ko(voVar, 5);
                                        voVar.p0 = false;
                                        voVar.V = j122;
                                        voVar.j0 = z152;
                                        TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                        voVar.U = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                voVar.h0 = tL_chatInviteExported;
                                            } else {
                                                voVar.W(false);
                                            }
                                        }
                                        hoVar14.presentFragment(voVar);
                                        break;
                                    case 17:
                                        ho hoVar15 = this.b;
                                        long j13 = hoVar15.s0;
                                        hp hpVar = new hp(null);
                                        hpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        hpVar.K = false;
                                        hpVar.L = false;
                                        hpVar.A = j13;
                                        TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        hpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        hpVar.s = z162;
                                        hpVar.h = hoVar15.u0;
                                        hoVar15.presentFragment(hpVar);
                                        break;
                                    case 18:
                                        ho hoVar16 = this.b;
                                        pv0 pv0Var = new pv0(hoVar16.s0);
                                        pv0Var.v = new ao(hoVar16, 4);
                                        hoVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ho.Y(this.b);
                                        break;
                                    case 20:
                                        ho hoVar17 = this.b;
                                        y50 y50Var = new y50(-hoVar17.t0.id);
                                        y50Var.c = hoVar17.H0;
                                        y50Var.h0 = hoVar17;
                                        hoVar17.presentFragment(y50Var);
                                        break;
                                    case 21:
                                        ho hoVar18 = this.b;
                                        hoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", hoVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.w0(hoVar18.u0);
                                        hoVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ho hoVar19 = this.b;
                                        hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                        hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                        hoVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ho hoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                            hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", hoVar20.s0);
                                            op opVar = new op(bundle5);
                                            opVar.d = new ArrayList();
                                            opVar.r = new ArrayList();
                                            opVar.v = -1;
                                            opVar.B = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            opVar.c = j14;
                                            TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                            opVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (opVar.a == null) {
                                                    opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                opVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    opVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    opVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    opVar.w = 1;
                                                }
                                            }
                                            hoVar20.presentFragment(opVar);
                                            break;
                                        }
                                    default:
                                        ho hoVar21 = this.b;
                                        hoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", hoVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                        hoVar21.presentFragment(new qn(bundle6));
                                        break;
                                }
                            }
                        });
                    } else {
                        i10 = 3;
                    }
                    org.telegram.ui.Cells.p8 p8Var22 = new org.telegram.ui.Cells.p8(context2);
                    hoVar.V = p8Var22;
                    p8Var22.m(R.drawable.menu_feature_premium, c0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    hoVar.V.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    final int i30 = 4;
                    hoVar.V.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j13 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j13;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j14 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j14;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    hoVar.V.setVisibility(8);
                    if (!ChatObject.isChannel(hoVar.t0) || hoVar.t0.gigagroup) {
                        org.telegram.ui.Cells.p8 p8Var23 = new org.telegram.ui.Cells.p8(context2);
                        hoVar.U = p8Var23;
                        p8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        hoVar.U.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        final int i31 = 5;
                        hoVar.U.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                            public final /* synthetic */ ho b;

                            {
                                this.b = hoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i31) {
                                    case 0:
                                        ho hoVar3 = this.b;
                                        hoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", hoVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.w0(hoVar3.u0);
                                        hoVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ho hoVar4 = this.b;
                                        fo foVar = hoVar4.M0;
                                        long j112 = hoVar4.y0;
                                        if (!hoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ho hoVar5 = this.b;
                                        hoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", hoVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.w0(hoVar5.u0);
                                        hoVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ho hoVar6 = this.b;
                                        hoVar6.presentFragment(new ih0(hoVar6.s0));
                                        break;
                                    case 4:
                                        ho hoVar7 = this.b;
                                        hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                        break;
                                    case 5:
                                        ho hoVar8 = this.b;
                                        hoVar8.getClass();
                                        hoVar8.presentFragment(new pb(hoVar8.t0));
                                        break;
                                    case 6:
                                        ho hoVar9 = this.b;
                                        hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                        break;
                                    case 7:
                                        ho hoVar10 = this.b;
                                        hoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", hoVar10.y0);
                                        hoVar10.presentFragment(new ma(bundle3));
                                        break;
                                    case 8:
                                        ho hoVar11 = this.b;
                                        hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                        break;
                                    case 9:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.h0();
                                        break;
                                    case 13:
                                        ho.W(this.b);
                                        break;
                                    case 14:
                                        ho hoVar12 = this.b;
                                        org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                        break;
                                    case 15:
                                        ho hoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.a0 = -hoVar13.s0;
                                            TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.B0 = new ao(hoVar13, 6);
                                            hoVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ho hoVar14 = this.b;
                                        long j122 = hoVar14.s0;
                                        org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        vo voVar = new vo(null);
                                        voVar.I = new ArrayList();
                                        voVar.J = new ArrayList();
                                        voVar.L = new ArrayList();
                                        voVar.Y = true;
                                        voVar.b0 = new ArrayList();
                                        voVar.k0 = new HashMap();
                                        voVar.m0 = new ko(voVar, 5);
                                        voVar.p0 = false;
                                        voVar.V = j122;
                                        voVar.j0 = z152;
                                        TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                        voVar.U = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                voVar.h0 = tL_chatInviteExported;
                                            } else {
                                                voVar.W(false);
                                            }
                                        }
                                        hoVar14.presentFragment(voVar);
                                        break;
                                    case 17:
                                        ho hoVar15 = this.b;
                                        long j13 = hoVar15.s0;
                                        hp hpVar = new hp(null);
                                        hpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        hpVar.K = false;
                                        hpVar.L = false;
                                        hpVar.A = j13;
                                        TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        hpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        hpVar.s = z162;
                                        hpVar.h = hoVar15.u0;
                                        hoVar15.presentFragment(hpVar);
                                        break;
                                    case 18:
                                        ho hoVar16 = this.b;
                                        pv0 pv0Var = new pv0(hoVar16.s0);
                                        pv0Var.v = new ao(hoVar16, 4);
                                        hoVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ho.Y(this.b);
                                        break;
                                    case 20:
                                        ho hoVar17 = this.b;
                                        y50 y50Var = new y50(-hoVar17.t0.id);
                                        y50Var.c = hoVar17.H0;
                                        y50Var.h0 = hoVar17;
                                        hoVar17.presentFragment(y50Var);
                                        break;
                                    case 21:
                                        ho hoVar18 = this.b;
                                        hoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", hoVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.w0(hoVar18.u0);
                                        hoVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ho hoVar19 = this.b;
                                        hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                        hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                        hoVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ho hoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                            hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", hoVar20.s0);
                                            op opVar = new op(bundle5);
                                            opVar.d = new ArrayList();
                                            opVar.r = new ArrayList();
                                            opVar.v = -1;
                                            opVar.B = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            opVar.c = j14;
                                            TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                            opVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (opVar.a == null) {
                                                    opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                opVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    opVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    opVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    opVar.w = 1;
                                                }
                                            }
                                            hoVar20.presentFragment(opVar);
                                            break;
                                        }
                                    default:
                                        ho hoVar21 = this.b;
                                        hoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", hoVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                        hoVar21.presentFragment(new qn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(hoVar.t0)) {
                        org.telegram.ui.Cells.p8 p8Var24 = new org.telegram.ui.Cells.p8(context2);
                        hoVar.W = p8Var24;
                        p8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        hoVar.W.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        final int i32 = 6;
                        hoVar.W.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                            public final /* synthetic */ ho b;

                            {
                                this.b = hoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i32) {
                                    case 0:
                                        ho hoVar3 = this.b;
                                        hoVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", hoVar3.s0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        jr jrVar = new jr(bundle);
                                        jrVar.w0(hoVar3.u0);
                                        hoVar3.presentFragment(jrVar);
                                        break;
                                    case 1:
                                        ho hoVar4 = this.b;
                                        fo foVar = hoVar4.M0;
                                        long j112 = hoVar4.y0;
                                        if (!hoVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i162 = chatPhoto2.dc_id;
                                                    if (i162 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i162;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, hoVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i172 = userProfilePhoto2.dc_id;
                                                    if (i172 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i172;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        ho hoVar5 = this.b;
                                        hoVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", hoVar5.s0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        jr jrVar2 = new jr(bundle2);
                                        jrVar2.w0(hoVar5.u0);
                                        hoVar5.presentFragment(jrVar2);
                                        break;
                                    case 3:
                                        ho hoVar6 = this.b;
                                        hoVar6.presentFragment(new ih0(hoVar6.s0));
                                        break;
                                    case 4:
                                        ho hoVar7 = this.b;
                                        hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                        break;
                                    case 5:
                                        ho hoVar8 = this.b;
                                        hoVar8.getClass();
                                        hoVar8.presentFragment(new pb(hoVar8.t0));
                                        break;
                                    case 6:
                                        ho hoVar9 = this.b;
                                        hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                        break;
                                    case 7:
                                        ho hoVar10 = this.b;
                                        hoVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", hoVar10.y0);
                                        hoVar10.presentFragment(new ma(bundle3));
                                        break;
                                    case 8:
                                        ho hoVar11 = this.b;
                                        hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                        break;
                                    case 9:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                        break;
                                    case 10:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                        break;
                                    case 11:
                                        ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                        break;
                                    case 12:
                                        this.b.h0();
                                        break;
                                    case 13:
                                        ho.W(this.b);
                                        break;
                                    case 14:
                                        ho hoVar12 = this.b;
                                        org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                        break;
                                    case 15:
                                        ho hoVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.a0 = -hoVar13.s0;
                                            TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.B0 = new ao(hoVar13, 6);
                                            hoVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        ho hoVar14 = this.b;
                                        long j122 = hoVar14.s0;
                                        org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                        boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                        vo voVar = new vo(null);
                                        voVar.I = new ArrayList();
                                        voVar.J = new ArrayList();
                                        voVar.L = new ArrayList();
                                        voVar.Y = true;
                                        voVar.b0 = new ArrayList();
                                        voVar.k0 = new HashMap();
                                        voVar.m0 = new ko(voVar, 5);
                                        voVar.p0 = false;
                                        voVar.V = j122;
                                        voVar.j0 = z152;
                                        TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                        voVar.U = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                voVar.h0 = tL_chatInviteExported;
                                            } else {
                                                voVar.W(false);
                                            }
                                        }
                                        hoVar14.presentFragment(voVar);
                                        break;
                                    case 17:
                                        ho hoVar15 = this.b;
                                        long j13 = hoVar15.s0;
                                        hp hpVar = new hp(null);
                                        hpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        hpVar.K = false;
                                        hpVar.L = false;
                                        hpVar.A = j13;
                                        TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                                        hpVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        hpVar.s = z162;
                                        hpVar.h = hoVar15.u0;
                                        hoVar15.presentFragment(hpVar);
                                        break;
                                    case 18:
                                        ho hoVar16 = this.b;
                                        pv0 pv0Var = new pv0(hoVar16.s0);
                                        pv0Var.v = new ao(hoVar16, 4);
                                        hoVar16.presentFragment(pv0Var);
                                        break;
                                    case 19:
                                        ho.Y(this.b);
                                        break;
                                    case 20:
                                        ho hoVar17 = this.b;
                                        y50 y50Var = new y50(-hoVar17.t0.id);
                                        y50Var.c = hoVar17.H0;
                                        y50Var.h0 = hoVar17;
                                        hoVar17.presentFragment(y50Var);
                                        break;
                                    case 21:
                                        ho hoVar18 = this.b;
                                        hoVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", hoVar18.s0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                        jr jrVar3 = new jr(bundle4);
                                        jrVar3.w0(hoVar18.u0);
                                        hoVar18.presentFragment(jrVar3);
                                        break;
                                    case 22:
                                        ho hoVar19 = this.b;
                                        hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                        hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                        hoVar19.presentFragment(hh0Var);
                                        break;
                                    case 23:
                                        ho hoVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                            hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", hoVar20.s0);
                                            op opVar = new op(bundle5);
                                            opVar.d = new ArrayList();
                                            opVar.r = new ArrayList();
                                            opVar.v = -1;
                                            opVar.B = new ArrayList();
                                            long j14 = bundle5.getLong("chat_id", 0L);
                                            opVar.c = j14;
                                            TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                            opVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (opVar.a == null) {
                                                    opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                                }
                                                opVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    opVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    opVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                        if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                            opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                        }
                                                    }
                                                    opVar.w = 1;
                                                }
                                            }
                                            hoVar20.presentFragment(opVar);
                                            break;
                                        }
                                    default:
                                        ho hoVar21 = this.b;
                                        hoVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", hoVar21.s0);
                                        bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                        hoVar21.presentFragment(new qn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    hoVar.N.addView(hoVar.K, g7.e6.n(-1, -2));
                    p8Var = hoVar.b0;
                    if (p8Var != null) {
                        hoVar.N.addView(p8Var, g7.e6.n(-1, -2));
                    }
                    if (!hoVar.E0 && !hoVar.t0.gigagroup) {
                        hoVar.N.addView(hoVar.T, g7.e6.n(-1, -2));
                    }
                    if (!hoVar.E0) {
                        hoVar.N.addView(hoVar.R, g7.e6.n(-1, -2));
                    }
                    hoVar.N.addView(hoVar.S, g7.e6.n(-1, -2));
                    hoVar.N.addView(hoVar.P, g7.e6.n(-1, -2));
                    p8Var2 = hoVar.Q;
                    if (p8Var2 != null && (chatFull2 = hoVar.u0) != null && chatFull2.requests_pending > 0) {
                        hoVar.N.addView(p8Var2, g7.e6.n(-1, -2));
                    }
                    if (hoVar.E0) {
                        hoVar.N.addView(hoVar.R, g7.e6.n(-1, -2));
                    }
                    if (!hoVar.E0 || hoVar.t0.gigagroup) {
                        hoVar.N.addView(hoVar.T, g7.e6.n(-1, -2));
                    }
                    p8Var3 = hoVar.W;
                    if (p8Var3 != null) {
                        hoVar.N.addView(p8Var3, g7.e6.n(-1, -2));
                    }
                    p8Var4 = hoVar.U;
                    if (p8Var4 != null) {
                        hoVar.N.addView(p8Var4, g7.e6.n(-1, -2));
                    }
                    p8Var5 = hoVar.V;
                    if (p8Var5 != null) {
                        hoVar.N.addView(p8Var5, g7.e6.n(-1, -2));
                    }
                    if (hoVar.V != null && hoVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(hoVar.t0)) {
                        hoVar.V.setVisibility(0);
                    }
                    p8Var6 = hoVar.U;
                    if (p8Var6 != null) {
                        org.telegram.ui.Cells.p8 p8Var25 = hoVar.V;
                        p8Var6.setNeedDivider(p8Var25 != null && p8Var25.getVisibility() == 0);
                    }
                }
            }
            i12 = 0;
            p8Var15.setVisibility(i12);
            final int i262 = 21;
            hoVar.T.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i262) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var162 = new org.telegram.ui.Cells.p8(context2);
            hoVar.R = p8Var162;
            p8Var162.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.R.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var172 = new org.telegram.ui.Cells.p8(context2);
            hoVar.K = p8Var172;
            p8Var172.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            final int i272 = 23;
            hoVar.K.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i272) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(hoVar.t0, 28)) {
            }
            org.telegram.ui.Cells.p8 p8Var192 = new org.telegram.ui.Cells.p8(context2);
            hoVar.S = p8Var192;
            p8Var192.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.S.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i14) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var202 = new org.telegram.ui.Cells.p8(context2);
            hoVar.P = p8Var202;
            p8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
            final int i292 = 2;
            hoVar.P.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isChannelAndNotMegaGroup(hoVar.t0)) {
            }
            org.telegram.ui.Cells.p8 p8Var222 = new org.telegram.ui.Cells.p8(context2);
            hoVar.V = p8Var222;
            p8Var222.m(R.drawable.menu_feature_premium, c0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            hoVar.V.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            final int i302 = 4;
            hoVar.V.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i302) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            hoVar.V.setVisibility(8);
            if (!ChatObject.isChannel(hoVar.t0)) {
            }
            org.telegram.ui.Cells.p8 p8Var232 = new org.telegram.ui.Cells.p8(context2);
            hoVar.U = p8Var232;
            p8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            hoVar.U.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            final int i312 = 5;
            hoVar.U.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i312) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(hoVar.t0)) {
            }
            hoVar.N.addView(hoVar.K, g7.e6.n(-1, -2));
            p8Var = hoVar.b0;
            if (p8Var != null) {
            }
            if (!hoVar.E0) {
                hoVar.N.addView(hoVar.T, g7.e6.n(-1, -2));
            }
            if (!hoVar.E0) {
            }
            hoVar.N.addView(hoVar.S, g7.e6.n(-1, -2));
            hoVar.N.addView(hoVar.P, g7.e6.n(-1, -2));
            p8Var2 = hoVar.Q;
            if (p8Var2 != null) {
                hoVar.N.addView(p8Var2, g7.e6.n(-1, -2));
            }
            if (hoVar.E0) {
            }
            if (!hoVar.E0) {
            }
            hoVar.N.addView(hoVar.T, g7.e6.n(-1, -2));
            p8Var3 = hoVar.W;
            if (p8Var3 != null) {
            }
            p8Var4 = hoVar.U;
            if (p8Var4 != null) {
            }
            p8Var5 = hoVar.V;
            if (p8Var5 != null) {
            }
            if (hoVar.V != null) {
                hoVar.V.setVisibility(0);
            }
            p8Var6 = hoVar.U;
            if (p8Var6 != null) {
            }
        } else {
            i10 = 3;
        }
        if (hoVar.z0 != null) {
            org.telegram.ui.Cells.p8 p8Var26 = new org.telegram.ui.Cells.p8(context2);
            hoVar.h0 = p8Var26;
            p8Var26.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.h0.setPrioritizeTitleOverValue(true);
            hoVar.N.addView(hoVar.h0, g7.e6.n(-1, -2));
            final int i33 = 7;
            hoVar.h0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i33) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            hoVar.q0();
            org.telegram.ui.Cells.p8 p8Var27 = new org.telegram.ui.Cells.p8(context2);
            hoVar.k0 = p8Var27;
            p8Var27.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.k0.q(c0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            hoVar.N.addView(hoVar.k0, g7.e6.n(-1, -2));
            hoVar.k0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i25) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            hoVar.k0.f(45, hoVar.A0 == null, false);
            TLRPC.UserFull userFull = hoVar.A0;
            if (userFull != null) {
                hoVar.k0.u(userFull.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f)), false);
            }
            if (!hoVar.getMessagesController().starrefProgramAllowed) {
                hoVar.k0.setVisibility(8);
            }
            org.telegram.ui.Cells.p8 p8Var28 = new org.telegram.ui.Cells.p8(context2);
            hoVar.l0 = p8Var28;
            p8Var28.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.l0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            hoVar.N.addView(hoVar.l0, g7.e6.n(-1, -2));
            final int i34 = 9;
            hoVar.l0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i34) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var29 = new org.telegram.ui.Cells.p8(context2);
            hoVar.m0 = p8Var29;
            p8Var29.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.m0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            hoVar.N.addView(hoVar.m0, g7.e6.n(-1, -2));
            final int i35 = 10;
            hoVar.m0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i35) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var30 = new org.telegram.ui.Cells.p8(context2);
            hoVar.n0 = p8Var30;
            p8Var30.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            hoVar.n0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            hoVar.N.addView(hoVar.n0, g7.e6.n(-1, -2));
            final int i36 = 11;
            hoVar.n0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i36) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = hoVar.t0;
        if (chat6 != null) {
            if (!ChatObject.hasAdminRights(chat6)) {
                hoVar.N.setVisibility(8);
                hoVar.C.setVisibility(8);
            }
            mVar.addView(new org.telegram.ui.Cells.z6(context2), g7.e6.n(-1, -2));
        } else if (hoVar.z0 != null) {
            hoVar.o0 = new org.telegram.ui.Cells.b9(context2, 12, hoVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new gh.n3(1), indexOf, indexOf + 10, 33);
            }
            hoVar.o0.setText(valueOf);
            mVar.addView(hoVar.o0, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.p8 p8Var31 = new org.telegram.ui.Cells.p8(context2);
            hoVar.q0 = p8Var31;
            p8Var31.setBackground(org.telegram.ui.ActionBar.f6.K0(true));
            hoVar.q0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.p8 p8Var32 = hoVar.q0;
            int i37 = org.telegram.ui.ActionBar.f6.q6;
            p8Var32.e(i37, i37);
            mVar.addView(hoVar.q0, g7.e6.n(-1, -2));
            final int i38 = 13;
            hoVar.q0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j13 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j13;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j13));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j14 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j14;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j14));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.b9 b9Var2 = new org.telegram.ui.Cells.b9(context2, 12, hoVar.resourceProvider);
            hoVar.p0 = b9Var2;
            b9Var2.setFixedSize(12);
            mVar.addView(hoVar.p0, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.p8 p8Var33 = hoVar.q0;
            TLRPC.UserFull userFull2 = hoVar.A0;
            p8Var33.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.b9 b9Var3 = hoVar.p0;
            TLRPC.UserFull userFull3 = hoVar.A0;
            b9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = hoVar.z0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                hoVar.O = linearLayout5;
                linearLayout5.setOrientation(1);
                mVar.addView(hoVar.O, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
                m4Var.setText(LocaleController.getString(R.string.BotBalance));
                hoVar.O.addView(m4Var, g7.e6.n(-1, -2));
                org.telegram.ui.Cells.p8 p8Var34 = new org.telegram.ui.Cells.p8(context2);
                hoVar.i0 = p8Var34;
                p8Var34.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                hoVar.i0.setPrioritizeTitleOverValue(true);
                hoVar.O.addView(hoVar.i0, g7.e6.n(-1, -2));
                final gh.c0 g11 = gh.c0.g(hoVar.currentAccount);
                hoVar.i0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.vn
                    public final /* synthetic */ ho b;

                    {
                        this.b = hoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                ho hoVar3 = this.b;
                                long j13 = hoVar3.y0;
                                if (g11.h(j13, false) != null) {
                                    hoVar3.presentFragment(new gh.r(1, j13));
                                    break;
                                }
                                break;
                            default:
                                ho hoVar4 = this.b;
                                long j14 = hoVar4.y0;
                                if (g11.h(j14, false) != null) {
                                    hoVar4.presentFragment(new gh.r(0, j14));
                                    break;
                                }
                                break;
                        }
                    }
                });
                long j13 = j10;
                if (g11.m(j13)) {
                    long i39 = g11.i(j13);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i39 > 0) {
                        double d = i39 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(i10);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                        }
                    }
                    hoVar.i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.q80(AndroidUtilities.dp(30.0f), hoVar.i0.c), 0, spannableStringBuilder2.length(), 33);
                    hoVar.i0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                }
                hoVar.i0.setVisibility(g11.b(j13) ? 0 : 8);
                org.telegram.ui.Cells.p8 p8Var35 = new org.telegram.ui.Cells.p8(context2);
                hoVar.j0 = p8Var35;
                p8Var35.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                final int i40 = 1;
                hoVar.j0.setPrioritizeTitleOverValue(true);
                hoVar.O.addView(hoVar.j0, g7.e6.n(-1, -2));
                hoVar.j0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.vn
                    public final /* synthetic */ ho b;

                    {
                        this.b = hoVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i40) {
                            case 0:
                                ho hoVar3 = this.b;
                                long j132 = hoVar3.y0;
                                if (g11.h(j132, false) != null) {
                                    hoVar3.presentFragment(new gh.r(1, j132));
                                    break;
                                }
                                break;
                            default:
                                ho hoVar4 = this.b;
                                long j14 = hoVar4.y0;
                                if (g11.h(j14, false) != null) {
                                    hoVar4.presentFragment(new gh.r(0, j14));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j13, false) != null) {
                    org.telegram.ui.Cells.p8 p8Var36 = hoVar.j0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j13).amount <= 0) {
                        X0 = "";
                        z10 = false;
                    } else {
                        z10 = false;
                        X0 = gh.oa.X0(false, TextUtils.concat("XTR", gh.oa.K0(g11.c(j13), 0.85f, ' ')), 0.85f, null);
                    }
                    p8Var36.q(string2, X0, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.q80(AndroidUtilities.dp(30.0f), hoVar.j0.c), 0, spannableStringBuilder3.length(), 33);
                    hoVar.j0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                hoVar.j0.setVisibility(g11.a(j13) ? 0 : 8);
                org.telegram.ui.Cells.b9 b9Var4 = new org.telegram.ui.Cells.b9(context2, 12, hoVar.getResourceProvider());
                b9Var4.setFixedSize(12);
                num2 = num;
                b9Var4.setTag(R.id.fit_width_tag, num2);
                mVar.addView(b9Var4, g7.e6.n(-1, 12));
                hoVar.O.setVisibility((hoVar.j0.getVisibility() == 0 || hoVar.i0.getVisibility() == 0) ? 0 : 8);
                chat = hoVar.t0;
                i11 = 14;
                if ((chat == null && chat.creator) || ((user = hoVar.z0) != null && user.bot && user.bot_can_edit)) {
                    final long j14 = chat != null ? chat.linked_community_id : hoVar.z0.linked_community_id;
                    final long j15 = chat != null ? -chat.id : hoVar.z0.id;
                    final boolean z17 = hoVar.z0 != null;
                    if (j14 != 0) {
                        oh.a aVar = new oh.a(context2, hoVar.resourceProvider);
                        hoVar.d0 = aVar;
                        aVar.a(hoVar.currentAccount, hoVar.getMessagesController().getChat(Long.valueOf(j14)));
                        final int i41 = 0;
                        hoVar.d0.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        hoVar.d0.setOnClickListener(new View.OnClickListener(hoVar) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ho b;

                            {
                                this.b = hoVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i41) {
                                    case 0:
                                        ho hoVar3 = this.b;
                                        MessagesController messagesController = hoVar3.getMessagesController();
                                        long j16 = j14;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j16)))) {
                                            hoVar3.showDialog(new nh.j0(hoVar3, j16, null, null));
                                            break;
                                        } else {
                                            hoVar3.presentFragment(new nh.o(e2.c.g(j16, "community_id")));
                                            break;
                                        }
                                    default:
                                        ho hoVar4 = this.b;
                                        hoVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j14);
                                        hoVar4.presentFragment(new nh.f(bundle));
                                        break;
                                }
                            }
                        });
                        mVar.addView(hoVar.d0, g7.e6.n(-1, -2));
                        org.telegram.ui.Cells.p8 p8Var37 = new org.telegram.ui.Cells.p8(context2);
                        hoVar.f0 = p8Var37;
                        p8Var37.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : hoVar.E0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                        org.telegram.ui.Cells.p8 p8Var38 = hoVar.f0;
                        int i42 = org.telegram.ui.ActionBar.f6.p7;
                        p8Var38.e(i42, i42);
                        hoVar.f0.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        hoVar2 = hoVar;
                        hoVar.f0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.xn
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                                ho hoVar3 = ho.this;
                                org.telegram.ui.Components.y4.v0(hoVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : hoVar3.E0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new eo(hoVar3, j15, j14, 0));
                            }
                        });
                        mVar.addView(hoVar2.f0, g7.e6.n(-1, -2));
                        org.telegram.ui.Cells.b9 b9Var5 = new org.telegram.ui.Cells.b9(context2, 12, hoVar2.getResourceProvider());
                        hoVar2.g0 = b9Var5;
                        b9Var5.setFixedSize(14);
                        hoVar2.g0.setTag(R.id.fit_width_tag, num2);
                        mVar.addView(hoVar2.g0, g7.e6.n(-1, 14));
                    } else {
                        hoVar2 = hoVar;
                        org.telegram.ui.Cells.p8 p8Var39 = new org.telegram.ui.Cells.p8(context2);
                        hoVar2.c0 = p8Var39;
                        p8Var39.e(org.telegram.ui.ActionBar.f6.v6, org.telegram.ui.ActionBar.f6.u6);
                        hoVar2.c0.setTextColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.il));
                        hoVar2.c0.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                        hoVar2.c0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : hoVar2.E0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                        final int i43 = 1;
                        hoVar2.c0.setOnClickListener(new View.OnClickListener(hoVar2) { // from class: org.telegram.ui.wn
                            public final /* synthetic */ ho b;

                            {
                                this.b = hoVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i43) {
                                    case 0:
                                        ho hoVar3 = this.b;
                                        MessagesController messagesController = hoVar3.getMessagesController();
                                        long j16 = j15;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j16)))) {
                                            hoVar3.showDialog(new nh.j0(hoVar3, j16, null, null));
                                            break;
                                        } else {
                                            hoVar3.presentFragment(new nh.o(e2.c.g(j16, "community_id")));
                                            break;
                                        }
                                    default:
                                        ho hoVar4 = this.b;
                                        hoVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j15);
                                        hoVar4.presentFragment(new nh.f(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.b9 b9Var6 = new org.telegram.ui.Cells.b9(context2, 12, hoVar2.resourceProvider);
                        hoVar2.e0 = b9Var6;
                        b9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : hoVar2.E0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                        mVar.addView(hoVar2.c0, g7.e6.n(-1, -2));
                        mVar.addView(hoVar2.e0, g7.e6.n(-1, -2));
                    }
                } else {
                    hoVar2 = hoVar;
                }
                chat2 = hoVar2.t0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    hoVar2.Y = frameLayout3;
                    mVar.addView(frameLayout3, g7.e6.n(-1, -2));
                    org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(context2);
                    hoVar2.Z = baVar;
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.p7));
                    hoVar2.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                    if (hoVar2.z0 == null) {
                        hoVar2.Z.b(LocaleController.getString(R.string.DeleteBot), false);
                    } else if (hoVar2.E0) {
                        hoVar2.Z.b(LocaleController.getString(R.string.ChannelDelete), false);
                    } else {
                        hoVar2.Z.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                    }
                    hoVar2.Y.addView(hoVar2.Z, g7.e6.c(-2.0f, -1));
                    hoVar2.Z.setOnClickListener(new View.OnClickListener(hoVar2) { // from class: org.telegram.ui.un
                        public final /* synthetic */ ho b;

                        {
                            this.b = hoVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i11) {
                                case 0:
                                    ho hoVar3 = this.b;
                                    hoVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", hoVar3.s0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    jr jrVar = new jr(bundle);
                                    jrVar.w0(hoVar3.u0);
                                    hoVar3.presentFragment(jrVar);
                                    break;
                                case 1:
                                    ho hoVar4 = this.b;
                                    fo foVar = hoVar4.M0;
                                    long j112 = hoVar4.y0;
                                    if (!hoVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user22 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                        if (user22 == null) {
                                            TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i162 = chatPhoto2.dc_id;
                                                if (i162 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i162;
                                                }
                                                TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, hoVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                                int i172 = userProfilePhoto2.dc_id;
                                                if (i172 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i172;
                                                }
                                                PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    ho hoVar5 = this.b;
                                    hoVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", hoVar5.s0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    jr jrVar2 = new jr(bundle2);
                                    jrVar2.w0(hoVar5.u0);
                                    hoVar5.presentFragment(jrVar2);
                                    break;
                                case 3:
                                    ho hoVar6 = this.b;
                                    hoVar6.presentFragment(new ih0(hoVar6.s0));
                                    break;
                                case 4:
                                    ho hoVar7 = this.b;
                                    hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                                    break;
                                case 5:
                                    ho hoVar8 = this.b;
                                    hoVar8.getClass();
                                    hoVar8.presentFragment(new pb(hoVar8.t0));
                                    break;
                                case 6:
                                    ho hoVar9 = this.b;
                                    hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                                    break;
                                case 7:
                                    ho hoVar10 = this.b;
                                    hoVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", hoVar10.y0);
                                    hoVar10.presentFragment(new ma(bundle3));
                                    break;
                                case 8:
                                    ho hoVar11 = this.b;
                                    hoVar11.presentFragment(new mh.l(hoVar11.y0));
                                    break;
                                case 9:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                                    break;
                                case 10:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                                    break;
                                case 11:
                                    ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                                    break;
                                case 12:
                                    this.b.h0();
                                    break;
                                case 13:
                                    ho.W(this.b);
                                    break;
                                case 14:
                                    ho hoVar12 = this.b;
                                    org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                                    break;
                                case 15:
                                    ho hoVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.a0 = -hoVar13.s0;
                                        TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.B0 = new ao(hoVar13, 6);
                                        hoVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    ho hoVar14 = this.b;
                                    long j122 = hoVar14.s0;
                                    org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                                    boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                                    vo voVar = new vo(null);
                                    voVar.I = new ArrayList();
                                    voVar.J = new ArrayList();
                                    voVar.L = new ArrayList();
                                    voVar.Y = true;
                                    voVar.b0 = new ArrayList();
                                    voVar.k0 = new HashMap();
                                    voVar.m0 = new ko(voVar, 5);
                                    voVar.p0 = false;
                                    voVar.V = j122;
                                    voVar.j0 = z152;
                                    TLRPC.ChatFull chatFull7 = hoVar14.u0;
                                    voVar.U = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            voVar.h0 = tL_chatInviteExported;
                                        } else {
                                            voVar.W(false);
                                        }
                                    }
                                    hoVar14.presentFragment(voVar);
                                    break;
                                case 17:
                                    ho hoVar15 = this.b;
                                    long j132 = hoVar15.s0;
                                    hp hpVar = new hp(null);
                                    hpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    hpVar.K = false;
                                    hpVar.L = false;
                                    hpVar.A = j132;
                                    TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j132));
                                    hpVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    hpVar.s = z162;
                                    hpVar.h = hoVar15.u0;
                                    hoVar15.presentFragment(hpVar);
                                    break;
                                case 18:
                                    ho hoVar16 = this.b;
                                    pv0 pv0Var = new pv0(hoVar16.s0);
                                    pv0Var.v = new ao(hoVar16, 4);
                                    hoVar16.presentFragment(pv0Var);
                                    break;
                                case 19:
                                    ho.Y(this.b);
                                    break;
                                case 20:
                                    ho hoVar17 = this.b;
                                    y50 y50Var = new y50(-hoVar17.t0.id);
                                    y50Var.c = hoVar17.H0;
                                    y50Var.h0 = hoVar17;
                                    hoVar17.presentFragment(y50Var);
                                    break;
                                case 21:
                                    ho hoVar18 = this.b;
                                    hoVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", hoVar18.s0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                                    jr jrVar3 = new jr(bundle4);
                                    jrVar3.w0(hoVar18.u0);
                                    hoVar18.presentFragment(jrVar3);
                                    break;
                                case 22:
                                    ho hoVar19 = this.b;
                                    hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = hoVar19.u0;
                                    hh0Var.f0(chatFull8, chatFull8.exported_invite);
                                    hoVar19.presentFragment(hh0Var);
                                    break;
                                case 23:
                                    ho hoVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                        hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", hoVar20.s0);
                                        op opVar = new op(bundle5);
                                        opVar.d = new ArrayList();
                                        opVar.r = new ArrayList();
                                        opVar.v = -1;
                                        opVar.B = new ArrayList();
                                        long j142 = bundle5.getLong("chat_id", 0L);
                                        opVar.c = j142;
                                        TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                        opVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (opVar.a == null) {
                                                opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j142));
                                            }
                                            opVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                opVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                opVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                                    if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                        opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                                    }
                                                }
                                                opVar.w = 1;
                                            }
                                        }
                                        hoVar20.presentFragment(opVar);
                                        break;
                                    }
                                default:
                                    ho hoVar21 = this.b;
                                    hoVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", hoVar21.s0);
                                    bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                                    hoVar21.presentFragment(new qn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context2);
                    hoVar2.a0 = z6Var2;
                    mVar.addView(z6Var2, g7.e6.n(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                hoVar2.c = undoView;
                edVar.addView(undoView, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.ut utVar6 = hoVar2.v;
                TLRPC.User user3 = hoVar2.z0;
                utVar6.setText(Emoji.replaceEmoji(user3 == null ? ContactsController.formatName(user3) : hoVar2.t0.title, hoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.ut utVar7 = hoVar2.v;
                utVar7.setSelection(utVar7.n());
                chatFull = hoVar2.u0;
                if (chatFull == null) {
                    hoVar2.A.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = hoVar2.A0;
                    if (userFull4 != null) {
                        hoVar2.A.setText(userFull4.about);
                    }
                }
                hoVar2.j0();
                hoVar2.o0(true, false);
                return hoVar2.fragmentView;
            }
        }
        num2 = num;
        chat = hoVar.t0;
        i11 = 14;
        if (chat == null) {
        }
        hoVar2 = hoVar;
        chat2 = hoVar2.t0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            hoVar2.Y = frameLayout32;
            mVar.addView(frameLayout32, g7.e6.n(-1, -2));
            org.telegram.ui.Cells.ba baVar2 = new org.telegram.ui.Cells.ba(context2);
            hoVar2.Z = baVar2;
            baVar2.setTextColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.p7));
            hoVar2.Z.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
            if (hoVar2.z0 == null) {
            }
            hoVar2.Y.addView(hoVar2.Z, g7.e6.c(-2.0f, -1));
            hoVar2.Z.setOnClickListener(new View.OnClickListener(hoVar2) { // from class: org.telegram.ui.un
                public final /* synthetic */ ho b;

                {
                    this.b = hoVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            ho hoVar3 = this.b;
                            hoVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", hoVar3.s0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            jr jrVar = new jr(bundle);
                            jrVar.w0(hoVar3.u0);
                            hoVar3.presentFragment(jrVar);
                            break;
                        case 1:
                            ho hoVar4 = this.b;
                            fo foVar = hoVar4.M0;
                            long j112 = hoVar4.y0;
                            if (!hoVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j112 == 0 ? null : hoVar4.getMessagesController().getUser(Long.valueOf(j112));
                                if (user22 == null) {
                                    TLRPC.Chat chat32 = hoVar4.getMessagesController().getChat(Long.valueOf(hoVar4.s0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i162 = chatPhoto2.dc_id;
                                        if (i162 != 0) {
                                            chatPhoto2.photo_big.dc_id = i162;
                                        }
                                        TLRPC.ChatFull chatFull5 = hoVar4.u0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(hoVar4.u0.chat_photo.video_sizes.get(0), hoVar4.u0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, hoVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i172 = userProfilePhoto2.dc_id;
                                        if (i172 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i172;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, foVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            ho hoVar5 = this.b;
                            hoVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", hoVar5.s0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            jr jrVar2 = new jr(bundle2);
                            jrVar2.w0(hoVar5.u0);
                            hoVar5.presentFragment(jrVar2);
                            break;
                        case 3:
                            ho hoVar6 = this.b;
                            hoVar6.presentFragment(new ih0(hoVar6.s0));
                            break;
                        case 4:
                            ho hoVar7 = this.b;
                            hoVar7.presentFragment(new mh.u3(-hoVar7.s0));
                            break;
                        case 5:
                            ho hoVar8 = this.b;
                            hoVar8.getClass();
                            hoVar8.presentFragment(new pb(hoVar8.t0));
                            break;
                        case 6:
                            ho hoVar9 = this.b;
                            hoVar9.presentFragment(s91.c0(hoVar9.t0, false));
                            break;
                        case 7:
                            ho hoVar10 = this.b;
                            hoVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", hoVar10.y0);
                            hoVar10.presentFragment(new ma(bundle3));
                            break;
                        case 8:
                            ho hoVar11 = this.b;
                            hoVar11.presentFragment(new mh.l(hoVar11.y0));
                            break;
                        case 9:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-intro");
                            break;
                        case 10:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0) + "-commands");
                            break;
                        case 11:
                            ve.e.s(view.getContext(), "https://t.me/BotFather?start=" + ho.f0(this.b.z0));
                            break;
                        case 12:
                            this.b.h0();
                            break;
                        case 13:
                            ho.W(this.b);
                            break;
                        case 14:
                            ho hoVar12 = this.b;
                            org.telegram.ui.Components.y4.s(hoVar12, false, hoVar12.t0, null, false, true, true, false, new ao(hoVar12, 7));
                            break;
                        case 15:
                            ho hoVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(hoVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.a0 = -hoVar13.s0;
                                TLRPC.ChatFull chatFull6 = hoVar13.u0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.w0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.B0 = new ao(hoVar13, 6);
                                hoVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            ho hoVar14 = this.b;
                            long j122 = hoVar14.s0;
                            org.telegram.ui.Cells.p8 p8Var72 = hoVar14.D;
                            boolean z152 = p8Var72 != null && p8Var72.getVisibility() == 0;
                            vo voVar = new vo(null);
                            voVar.I = new ArrayList();
                            voVar.J = new ArrayList();
                            voVar.L = new ArrayList();
                            voVar.Y = true;
                            voVar.b0 = new ArrayList();
                            voVar.k0 = new HashMap();
                            voVar.m0 = new ko(voVar, 5);
                            voVar.p0 = false;
                            voVar.V = j122;
                            voVar.j0 = z152;
                            TLRPC.ChatFull chatFull7 = hoVar14.u0;
                            voVar.U = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    voVar.h0 = tL_chatInviteExported;
                                } else {
                                    voVar.W(false);
                                }
                            }
                            hoVar14.presentFragment(voVar);
                            break;
                        case 17:
                            ho hoVar15 = this.b;
                            long j132 = hoVar15.s0;
                            hp hpVar = new hp(null);
                            hpVar.v = new ArrayList();
                            boolean z162 = false;
                            hpVar.K = false;
                            hpVar.L = false;
                            hpVar.A = j132;
                            TLRPC.Chat chat42 = hpVar.getMessagesController().getChat(Long.valueOf(j132));
                            hpVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !hpVar.f.megagroup) {
                                z162 = true;
                            }
                            hpVar.s = z162;
                            hpVar.h = hoVar15.u0;
                            hoVar15.presentFragment(hpVar);
                            break;
                        case 18:
                            ho hoVar16 = this.b;
                            pv0 pv0Var = new pv0(hoVar16.s0);
                            pv0Var.v = new ao(hoVar16, 4);
                            hoVar16.presentFragment(pv0Var);
                            break;
                        case 19:
                            ho.Y(this.b);
                            break;
                        case 20:
                            ho hoVar17 = this.b;
                            y50 y50Var = new y50(-hoVar17.t0.id);
                            y50Var.c = hoVar17.H0;
                            y50Var.h0 = hoVar17;
                            hoVar17.presentFragment(y50Var);
                            break;
                        case 21:
                            ho hoVar18 = this.b;
                            hoVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", hoVar18.s0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((hoVar18.E0 || hoVar18.t0.gigagroup) && !ChatObject.isCommunity(hoVar18.t0)) ? 0 : 3);
                            jr jrVar3 = new jr(bundle4);
                            jrVar3.w0(hoVar18.u0);
                            hoVar18.presentFragment(jrVar3);
                            break;
                        case 22:
                            ho hoVar19 = this.b;
                            hh0 hh0Var = new hh0(hoVar19.s0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = hoVar19.u0;
                            hh0Var.f0(chatFull8, chatFull8.exported_invite);
                            hoVar19.presentFragment(hh0Var);
                            break;
                        case 23:
                            ho hoVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(hoVar20.t0)) {
                                hoVar20.presentFragment(new hg.s(hoVar20.s0, hoVar20.u0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", hoVar20.s0);
                                op opVar = new op(bundle5);
                                opVar.d = new ArrayList();
                                opVar.r = new ArrayList();
                                opVar.v = -1;
                                opVar.B = new ArrayList();
                                long j142 = bundle5.getLong("chat_id", 0L);
                                opVar.c = j142;
                                TLRPC.ChatFull chatFull9 = hoVar20.u0;
                                opVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (opVar.a == null) {
                                        opVar.a = opVar.getMessagesController().getChat(Long.valueOf(j142));
                                    }
                                    opVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        opVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        opVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i182 = 0; i182 < tL_chatReactionsSome.reactions.size(); i182++) {
                                            if (tL_chatReactionsSome.reactions.get(i182) instanceof TLRPC.TL_reactionEmoji) {
                                                opVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i182)).emoticon);
                                            }
                                        }
                                        opVar.w = 1;
                                    }
                                }
                                hoVar20.presentFragment(opVar);
                                break;
                            }
                        default:
                            ho hoVar21 = this.b;
                            hoVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", hoVar21.s0);
                            bundle6.putLong("welcome_messages_chat_id", hoVar21.s0);
                            hoVar21.presentFragment(new qn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.z6 z6Var22 = new org.telegram.ui.Cells.z6(context2);
            hoVar2.a0 = z6Var22;
            mVar.addView(z6Var22, g7.e6.n(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        hoVar2.c = undoView2;
        edVar.addView(undoView2, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.ut utVar62 = hoVar2.v;
        TLRPC.User user32 = hoVar2.z0;
        utVar62.setText(Emoji.replaceEmoji(user32 == null ? ContactsController.formatName(user32) : hoVar2.t0.title, hoVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.ut utVar72 = hoVar2.v;
        utVar72.setSelection(utVar72.n());
        chatFull = hoVar2.u0;
        if (chatFull == null) {
        }
        hoVar2.j0();
        hoVar2.o0(true, false);
        return hoVar2.fragmentView;
    }

    public final boolean d0(boolean z10) {
        org.telegram.ui.Components.ut utVar;
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
            org.telegram.ui.Components.ut utVar2 = this.v;
            if ((utVar2 == null || this.z0.first_name.equals(utVar2.getText().toString())) && ((editTextBoldCursor2 = this.A) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.P = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ao(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new ao(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.u0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.t0) || this.u0.hidden_prehistory == this.F0) && (((utVar = this.v) == null || this.t0.title.equals(utVar.getText().toString())) && (((editTextBoldCursor = this.A) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.B0 == this.t0.forum))) {
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
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new ao(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new ao(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.t0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z10;
        org.telegram.ui.Cells.p8 p8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i11 = NotificationCenter.chatInfoDidLoad;
        boolean z11 = true;
        long j10 = this.y0;
        int i12 = 0;
        if (i9 == i11) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.s0) {
                if (this.u0 == null && (editTextBoldCursor = this.A) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z12 = this.u0 == null;
                this.u0 = chatFull;
                e0();
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
                        p8Var = this.M;
                        if (p8Var != null) {
                            p8Var.getCheckBox().setIcon(this.C0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.C0 = z10;
                    p8Var = this.M;
                    if (p8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.t0) && !this.u0.hidden_prehistory) {
                    z11 = false;
                }
                this.F0 = z11;
                o0(false, false);
                if (z12) {
                    g0();
                    return;
                }
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.chatSwitchedForum) {
            long longValue = ((Long) objArr[0]).longValue();
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
            if (this.s0 != longValue) {
                return;
            }
            this.B0 = booleanValue;
            this.D0 = booleanValue2;
            org.telegram.ui.Cells.p8 p8Var2 = this.M;
            if (p8Var2 != null) {
                p8Var2.setChecked(booleanValue);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0) {
                j0();
            }
            if ((intValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                q0();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.channelRightsUpdated) {
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
        if (i9 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.s0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.u0 = chatFull4;
                if (chatFull4 != null) {
                    this.G0 = chatFull4.available_reactions;
                }
                r0(true);
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.botStarsUpdated) {
            if (i9 == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == j10) {
                    l0(getMessagesController().getUserFull(j10));
                    return;
                }
                return;
            } else {
                if (i9 == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i9 == NotificationCenter.dialogDeleted && (-this.s0) == ((Long) objArr[0]).longValue()) {
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
                gh.c0 g10 = gh.c0.g(this.currentAccount);
                this.j0.setVisibility(g10.a(j10) ? 0 : 8);
                this.j0.u(gh.oa.X0(false, TextUtils.concat("XTR", gh.oa.I0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.p8 p8Var3 = this.h0;
                if (p8Var3 != null) {
                    p8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.O.setVisibility((this.j0.getVisibility() == 0 || this.i0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.i0 != null) {
                gh.c0 g11 = gh.c0.g(this.currentAccount);
                this.i0.setVisibility(g11.b(j10) ? 0 : 8);
                long i13 = g11.i(j10);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (i13 > 0) {
                    double d = i13 / 1.0E9d;
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
                org.telegram.ui.Cells.p8 p8Var4 = this.h0;
                if (p8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z11 = false;
                    }
                    p8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.O;
                if (this.j0.getVisibility() != 0 && this.i0.getVisibility() != 0) {
                    i12 = 8;
                }
                linearLayout.setVisibility(i12);
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

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void e0() {
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

    public final void g0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.s0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new zn(this, 0));
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        go goVar = this.X;
        int i9 = org.telegram.ui.ActionBar.f6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(goVar, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 4096, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.S, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.R, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        org.telegram.ui.Cells.p8 p8Var = this.Q;
        if (p8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(p8Var, 4096, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i12 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 4, null, null, null, null, i10));
        org.telegram.ui.Components.ut utVar = this.v;
        int i13 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(utVar, TLObject.FLAG_23, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, TLObject.FLAG_23, null, null, null, null, i13));
        LinearLayout linearLayout = this.d;
        int i14 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(linearLayout, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.y, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Y, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 1, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 1, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.a0, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Z, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Z, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 4, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
        int i16 = org.telegram.ui.ActionBar.f6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 4096, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.K, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        org.telegram.ui.Cells.p8 p8Var2 = this.G;
        if (p8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(p8Var2, 4096, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.G, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        }
        org.telegram.ui.Cells.p8 p8Var3 = this.W;
        if (p8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(p8Var3, 4096, null, null, null, null, i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.W, 4, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.W, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        }
        return arrayList;
    }

    public final void h0() {
        this.s.o(this.r0 != null, new bo(this, 0), new r5(this, 5), 0);
        this.N0.K(0);
        this.N0.N(43);
        this.X.e.d();
    }

    public final void i0() {
        org.telegram.ui.Components.ut utVar;
        String str;
        String str2;
        if (this.J0 || (utVar = this.v) == null) {
            return;
        }
        if (utVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.J0 = true;
        int i9 = 3;
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
            this.b.setOnCancelListener(new gh.x(this, getConnectionsManager().sendRequest(setbotinfo, new rc(7, this, setbotinfo)), i9));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.t0) && (!this.F0 || this.B0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.s0, this, new ao(this, 5));
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
            c2Var.setOnCancelListener(new eg(this, r0));
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
                for (int i10 = 0; i10 < fragmentStack.size(); i10++) {
                    if ((fragmentStack.get(i10) instanceof qn) && ((qn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.s0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.s0);
                        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
                        HashSet hashSet = we1.j1;
                        ((ActionBarLayout) parentLayout).c(i10, we1.D0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (r0 != 0) {
                p0();
            }
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
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
        org.telegram.ui.Components.z8 z8Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(z8Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.r0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, z8Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.X != null) {
                    if (z10 || this.s.h()) {
                        this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.X.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.N0 == null) {
                        this.N0 = new org.telegram.ui.Components.mi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.X.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.X.e.setAnimation(this.N0);
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    PhotoViewer.t1().x0();
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
            PhotoViewer.t1().x0();
        }
        if (this.V == null) {
        }
    }

    public final void k0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.k5 n10;
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
                    int i9 = 0;
                    while (i9 < size) {
                        TLRPC.Reaction reaction = arrayList3.get(i9);
                        i9++;
                        TLRPC.Reaction reaction2 = reaction;
                        if (reaction2 instanceof TLRPC.TL_reactionEmoji) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(UserConfig.selectedAccount).getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction2).emoticon);
                            if (tL_availableReaction != null) {
                                n10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, org.telegram.ui.Components.k5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.k5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.k5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.k5 m10 = org.telegram.ui.Components.k5.m(UserConfig.selectedAccount, org.telegram.ui.Components.k5.g(), tL_availableReaction2.activate_animation);
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
        e0();
    }

    public final void l0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.A0 = userFull;
        if (userFull != null) {
            if (this.z0 == null) {
                long j10 = this.y0;
                this.z0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.p8 p8Var = this.k0;
            if (p8Var != null) {
                p8Var.f(45, this.A0 == null, true);
                TLRPC.UserFull userFull2 = this.A0;
                if (userFull2 != null) {
                    this.k0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.p8 p8Var2 = this.q0;
            if (p8Var2 != null) {
                TLRPC.UserFull userFull3 = this.A0;
                p8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.b9 b9Var = this.p0;
            if (b9Var != null) {
                TLRPC.UserFull userFull4 = this.A0;
                b9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void m0(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<kh.h6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<kh.h6, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new hg.b0(29, this, z10));
        this.h.start();
    }

    public final void n0() {
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        vo0 vo0Var;
        int v02;
        ArrayList<Integer> arrayList;
        ho0 ho0Var = this.H;
        if (ho0Var != null) {
            TLRPC.Chat chat = this.t0;
            org.telegram.ui.Cells.p8 p8Var3 = this.J;
            boolean z10 = (p8Var3 != null && p8Var3.getVisibility() == 0) || ((p8Var = this.M) != null && p8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.t0) && ChatObject.hasAdminRights(this.t0)) || ((p8Var2 = this.I) != null && p8Var2.getVisibility() == 0));
            Paint paint = ho0Var.n;
            int i9 = ho0Var.a;
            org.telegram.ui.ActionBar.b6 b6Var = ho0Var.d;
            if (chat == null) {
                return;
            }
            ho0Var.v = z10;
            ho0Var.r = new org.telegram.ui.Components.nz0(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.f6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            vo0 vo0Var2 = ho0Var.w;
            if (vo0Var2 != null) {
                vo0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i10 = vo0.j;
                int i11 = tL_emojiStatusCollectible.center_color | (-16777216);
                ho0Var.w = new vo0(tL_emojiStatusCollectible.document_id, i11, i11, i11);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    vo0Var = vo0.c(i9, ChatObject.getProfileColorId(chat));
                    vo0Var.a = AndroidUtilities.dp(11.0f);
                    vo0Var.d();
                } else {
                    vo0Var = null;
                }
                ho0Var.w = vo0Var;
            }
            vo0 vo0Var3 = ho0Var.w;
            if (vo0Var3 != null) {
                vo0Var3.e(ho0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q();
                int i12 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                ho0Var.r.o(i12);
                paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, i12));
                vo0 vo0Var4 = new vo0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                vo0Var4.a = AndroidUtilities.dp(11.0f);
                vo0Var4.d();
                ho0Var.x = vo0Var4;
                vo0Var4.e(ho0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i13 = org.telegram.ui.ActionBar.f6.r8[colorId];
                ho0Var.s = i13;
                v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    ho0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i14 = org.telegram.ui.ActionBar.f6.r8[0];
                    ho0Var.s = i14;
                    v02 = org.telegram.ui.ActionBar.f6.v0(i14, b6Var);
                }
            }
            ho0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.f6.l1(0.1f, v02));
            vo0 a3 = vo0.a(i9, colorId);
            a3.a = AndroidUtilities.dp(11.0f);
            a3.d();
            ho0Var.x = a3;
            a3.e(ho0Var);
        }
    }

    public final void o0(boolean z10, boolean z11) {
        boolean z12;
        int i9;
        int i10;
        int i11;
        int i12;
        String str;
        TLRPC.ChatFull chatFull;
        int i13;
        String str2;
        String string;
        org.telegram.ui.Cells.p8 p8Var;
        org.telegram.ui.Cells.p8 p8Var2;
        org.telegram.ui.Cells.p8 p8Var3;
        org.telegram.ui.Cells.p8 p8Var4;
        int i14;
        String str3;
        org.telegram.ui.Cells.p8 p8Var5;
        org.telegram.ui.Cells.p8 p8Var6;
        org.telegram.ui.Cells.p8 p8Var7;
        org.telegram.ui.Cells.p8 p8Var8;
        org.telegram.ui.Cells.p8 p8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.s0))) != null) {
            this.t0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.t0);
        org.telegram.ui.Cells.b9 b9Var = this.L;
        if (b9Var != null) {
            b9Var.setVisibility((this.E != null || ((p8Var7 = this.F) != null && p8Var7.getVisibility() == 0) || (((p8Var8 = this.J) != null && p8Var8.getVisibility() == 0) || ((p8Var9 = this.D) != null && p8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.p8 p8Var10 = this.U;
        if (p8Var10 != null) {
            p8Var10.setVisibility(ChatObject.isChannel(this.t0) ? 0 : 8);
        }
        org.telegram.ui.Cells.p8 p8Var11 = this.F;
        if (p8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.u0;
            if (chatFull2 == null || (!this.E0 && chatFull2.linked_chat_id == 0)) {
                p8Var11.setVisibility(8);
            } else {
                p8Var11.setVisibility(0);
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
                            this.F.s(LocaleController.getString("Discussion", R.string.Discussion), ta.b.d("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.p8 p8Var12 = this.F;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i15 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.p8 p8Var13 = this.M;
                            p8Var12.s(string2, str4, false, i15, p8Var13 != null && p8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.p8 p8Var14 = this.F;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String d = ta.b.d("@", publicUsername2);
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.p8 p8Var15 = this.M;
                            p8Var14.s(string3, d, false, i16, p8Var15 != null && p8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.p8 p8Var16 = this.D;
        if (p8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.u0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                p8Var16.setVisibility(8);
            } else {
                p8Var16.setVisibility(0);
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
                        i14 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z13) {
                        i14 = R.string.TypePrivateRestrictedForwards;
                        str3 = "TypePrivateRestrictedForwards";
                    } else {
                        i14 = R.string.TypePrivate;
                        str3 = "TypePrivate";
                    }
                    string = LocaleController.getString(str3, i14);
                } else {
                    if (isPublic) {
                        i13 = R.string.TypePublicGroup;
                        str2 = "TypePublicGroup";
                    } else if (z13) {
                        i13 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i13 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i13);
                }
                String str5 = string;
                if (this.E0) {
                    org.telegram.ui.Cells.p8 p8Var17 = this.E;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i17 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.p8 p8Var18 = this.J;
                    p8Var17.s(string4, str5, false, i17, (p8Var18 != null && p8Var18.getVisibility() == 0) || ((p8Var3 = this.F) != null && p8Var3.getVisibility() == 0) || ((p8Var4 = this.M) != null && p8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.p8 p8Var19 = this.E;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i18 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.p8 p8Var20 = this.J;
                    p8Var19.s(string5, str5, false, i18, (p8Var20 != null && p8Var20.getVisibility() == 0) || ((p8Var = this.F) != null && p8Var.getVisibility() == 0) || ((p8Var2 = this.M) != null && p8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(aa.d.r(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.t0));
                org.telegram.ui.Cells.p8 p8Var21 = this.E;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i19 = R.drawable.msg_channel;
                org.telegram.ui.Cells.p8 p8Var22 = this.J;
                p8Var21.s(string7, string6, false, i19, (p8Var22 != null && p8Var22.getVisibility() == 0) || ((p8Var5 = this.F) != null && p8Var5.getVisibility() == 0) || ((p8Var6 = this.M) != null && p8Var6.getVisibility() == 0));
            }
        }
        if (this.J != null) {
            if (!this.F0 || this.B0) {
                i12 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i12 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.J.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i12), z11, R.drawable.msg_discuss, this.M != null);
            this.J.setEnabled(!this.B0);
            boolean z14 = (this.B0 || isPublic || ((chatFull = this.u0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.O0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.J.getAlpha() <= 0.0f && !z14) {
                this.J.setVisibility(8);
                n0();
            } else if (this.J.getVisibility() != 0 || this.J.getAlpha() < 1.0f || !z14) {
                ArrayList arrayList = new ArrayList();
                boolean z15 = false;
                for (int i20 = 0; i20 < this.B.getChildCount(); i20++) {
                    if (!z15 && this.B.getChildAt(i20) == this.J) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.B.getChildAt(i20));
                    }
                }
                boolean z16 = false;
                for (int i21 = 0; i21 < this.w.getChildCount(); i21++) {
                    if (!z16 && this.w.getChildAt(i21) == this.B) {
                        z16 = true;
                    } else if (z16) {
                        arrayList.add(this.w.getChildAt(i21));
                    }
                }
                if (this.J.getVisibility() != 0) {
                    this.J.setAlpha(0.0f);
                    this.J.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.J.setVisibility(0);
                for (int i22 = 0; i22 < arrayList.size(); i22++) {
                    ((View) arrayList.get(i22)).setTranslationY((1.0f - this.J.getAlpha()) * (-this.J.getHeight()));
                }
                if (z11) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.J.getAlpha(), z14 ? 1.0f : 0.0f);
                    this.O0 = ofFloat;
                    ofFloat.addUpdateListener(new f2.g(6, this, arrayList));
                    this.O0.addListener(new androidx.fragment.app.g(this, z14, arrayList, 5));
                    this.O0.setDuration(320L);
                    this.O0.setInterpolator(org.telegram.ui.Components.gr.h);
                    this.O0.start();
                } else {
                    this.J.setAlpha(z14 ? 1.0f : 0.0f);
                    this.J.setTranslationY(((-r5.getHeight()) / 2.0f) * (z14 ? 0.0f : 1.0f));
                    this.J.setScaleY(((z14 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.J.setVisibility(z14 ? 0 : 8);
                    for (int i23 = 0; i23 < arrayList.size(); i23++) {
                        ((View) arrayList.get(i23)).setTranslationY(0.0f);
                    }
                    this.O0 = null;
                }
            }
        }
        if (this.P != null) {
            if (this.u0 != null) {
                org.telegram.ui.Cells.p8 p8Var23 = this.Q;
                if (p8Var23 != null) {
                    if (p8Var23.getParent() == null) {
                        this.N.addView(this.Q, this.N.indexOfChild(this.P) + 1, g7.e6.n(-1, -2));
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
                        int i24 = this.B0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.t0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i25 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i25++;
                            }
                            i9 = jr.m0(tL_chatBannedRights) + i25;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.t0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i9++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i9++;
                            }
                            if (this.B0 && !tL_chatBannedRights2.manage_topics) {
                                i9++;
                            }
                            if (!tL_chatBannedRights2.change_info) {
                                i9++;
                            }
                            i10 = i24;
                        } else {
                            i9 = i24;
                            i10 = i9;
                        }
                        z12 = z11;
                        this.T.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i9), Integer.valueOf(i10)), z12, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.p8 p8Var24 = this.T;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.u0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i26 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.p8 p8Var25 = this.U;
                        p8Var24.s(string8, format, false, i26, p8Var25 != null && p8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.p8 p8Var26 = this.Q;
                    if (p8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.u0.requests_pending));
                        int i27 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.p8 p8Var27 = this.U;
                        p8Var26.s(string9, format2, false, i27, p8Var27 != null && p8Var27.getVisibility() == 0);
                    }
                } else {
                    this.P.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.u0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.p8 p8Var28 = this.T;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.u0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i28 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.p8 p8Var29 = this.U;
                    p8Var28.s(string10, format3, false, i28, p8Var29 != null && p8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.p8 p8Var30 = this.S;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.t0)) {
                    i11 = this.u0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.u0;
                    if (chatFull7 == null) {
                        i11 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i29 = 0;
                        for (int i30 = 0; i30 < size; i30++) {
                            TLRPC.ChatParticipant chatParticipant = this.u0.participants.participants.get(i30);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i29++;
                            }
                        }
                        i11 = i29;
                    }
                }
                p8Var30.s(string11, String.format("%d", Integer.valueOf(i11)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.E0 || ChatObject.isCommunity(this.t0)) {
                    org.telegram.ui.Cells.p8 p8Var31 = this.P;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i31 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.p8 p8Var32 = this.U;
                    p8Var31.m(i31, string12, p8Var32 != null && p8Var32.getVisibility() == 0);
                    if (this.t0.gigagroup) {
                        org.telegram.ui.Cells.p8 p8Var33 = this.T;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i32 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.p8 p8Var34 = this.U;
                        p8Var33.m(i32, string13, p8Var34 != null && p8Var34.getVisibility() == 0);
                    } else {
                        this.T.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.P.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.p8 p8Var35 = this.T;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i33 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.p8 p8Var36 = this.U;
                    p8Var35.m(i33, string14, p8Var36 != null && p8Var36.getVisibility() == 0);
                }
                this.S.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.K.setVisibility(ChatObject.canChangeChatInfo(this.t0) ? 0 : 8);
            r0(z12);
            if (this.u0 == null || !ChatObject.canUserDoAdminAction(this.t0, 3) || (isPublic && this.t0.creator)) {
                this.R.setVisibility(8);
            } else if (this.u0.invitesCount > 0) {
                this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.u0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.R.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.G != null) {
            s0(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onActivityResultFragment(int i9, int i10, Intent intent) {
        this.s.i(i9, i10, intent);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar == null || !utVar.e) {
            return d0(z10);
        }
        if (!z10) {
            return false;
        }
        utVar.k(true);
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
            org.telegram.ui.Components.z8 z8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.e40 e40Var = this.s;
            e40Var.a = this;
            e40Var.b = this;
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
        org.telegram.ui.Components.z8 z8Var2 = this.r;
        if (chat == null) {
            this.v0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.w0 = TLRPC.TL_chatBannedRights.clone(this.t0.banned_rights);
            this.x0 = TLRPC.TL_chatBannedRights.clone(this.t0.default_banned_rights);
            z8Var2.n(5L, this.t0.title, null);
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
            z8Var2.n(5L, this.z0.first_name, null);
            this.E0 = false;
            this.B0 = false;
            this.D0 = false;
            this.C0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.z0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.e40 e40Var2 = this.s;
        e40Var2.a = this;
        e40Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.u0 != null) {
            g0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.e40 e40Var = this.s;
        if (e40Var != null) {
            e40Var.e();
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
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        gh.m mVar = this.w;
        if (mVar != null) {
            mVar.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i12);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i12);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.L0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((org.telegram.ui.Components.k5) obj).p(null);
        }
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s.j();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        this.s.k(i9, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            utVar.s();
            this.v.getEditText().requestFocus();
        }
        n0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        o0(true, true);
        this.s.l();
    }

    public final void p0() {
        dy dyVar;
        yw ywVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i9 = 0;
        while (i9 < fragmentStack.size()) {
            if (fragmentStack.get(i9) instanceof qn) {
                qn qnVar = (qn) fragmentStack.get(i9);
                if (qnVar.getArguments().getLong("chat_id") == this.s0) {
                    ((ActionBarLayout) getParentLayout()).a0(qnVar, false);
                    qnVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i9, qnVar);
                    if (!this.D0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.s0);
                        ((ActionBarLayout) getParentLayout()).c(i9, new we1(bundle));
                        i9++;
                    }
                }
            } else if (this.D0 && (fragmentStack.get(i9) instanceof we1)) {
                we1 we1Var = (we1) fragmentStack.get(i9);
                if (we1Var.g() != null && we1Var.g().id == this.s0) {
                    ((ActionBarLayout) getParentLayout()).a0(we1Var, false);
                    i9--;
                }
            } else if (this.D0 && (fragmentStack.get(i9) instanceof dy) && (dyVar = (dy) fragmentStack.get(i9)) != null && (ywVar = dyVar.B3) != null && ywVar.c()) {
                dyVar.B3.a();
            }
            i9++;
        }
    }

    public final void q0() {
        if (this.h0 == null) {
            return;
        }
        if (this.z0.usernames.size() <= 1) {
            this.h0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.z0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.z0.usernames;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            TLRPC.TL_username tL_username = arrayList.get(i10);
            i10++;
            if (tL_username.active) {
                i9++;
            }
        }
        this.h0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i9), Integer.valueOf(this.z0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    public final void r0(boolean z10) {
        String str;
        String str2;
        int i9;
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
            int i10 = 0;
            while (i9 < tL_chatReactionsSome.reactions.size()) {
                TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i9);
                if (reaction instanceof TLRPC.TL_reactionEmoji) {
                    TLRPC.TL_availableReaction tL_availableReaction = getMediaDataController().getReactionsMap().get(((TLRPC.TL_reactionEmoji) reaction).emoticon);
                    if (tL_availableReaction != null) {
                        if (tL_availableReaction.inactive) {
                        }
                        i10++;
                    }
                } else {
                    i9 = reaction instanceof TLRPC.TL_reactionCustomEmoji ? 0 : i9 + 1;
                    i10++;
                }
            }
            if (isChannelAndNotMegaGroup) {
                if (chatFull != null && chatFull.paid_reactions_available) {
                    i10++;
                }
                str2 = i10 == 0 ? LocaleController.getString(R.string.ReactionsOff) : String.valueOf(i10);
            } else {
                int min = Math.min(getMediaDataController().getEnabledReactionsList().size(), i10);
                str2 = min == 0 ? LocaleController.getString(R.string.ReactionsOff) : LocaleController.formatString(R.string.ReactionsCount, Integer.valueOf(min), Integer.valueOf(getMediaDataController().getEnabledReactionsList().size()));
            }
        } else {
            str2 = LocaleController.getString(R.string.ReactionsAll);
        }
        str = str2;
        this.K.s(LocaleController.getString(R.string.Reactions), str, z10, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.e40 e40Var = this.s;
        if (e40Var != null) {
            e40Var.f = bundle.getString("path");
        }
    }

    public final void s0(Long l10) {
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
        this.G.s(LocaleController.getString(R.string.PostSuggestions), gh.oa.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.e40 e40Var = this.s;
        if (e40Var != null && (str = e40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ut utVar = this.v;
        if (utVar != null) {
            String obj = utVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }
}
