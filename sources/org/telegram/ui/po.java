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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class po extends org.telegram.ui.ActionBar.p2 implements org.telegram.ui.Components.x40, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.User A0;
    public EditTextBoldCursor B;
    public TLRPC.UserFull B0;
    public LinearLayout C;
    public boolean C0;
    public org.telegram.ui.Cells.z6 D;
    public boolean D0;
    public org.telegram.ui.Cells.o8 E;
    public boolean E0;
    public org.telegram.ui.Cells.o8 F;
    public boolean F0;
    public org.telegram.ui.Cells.o8 G;
    public boolean G0;
    public org.telegram.ui.Cells.o8 H;
    public TLRPC.ChatReactions H0;
    public qo0 I;
    public TL_stories.TL_premium_boostsStatus I0;
    public org.telegram.ui.Cells.o8 J;
    public boolean J0;
    public org.telegram.ui.Cells.o8 K;
    public boolean K0;
    public org.telegram.ui.Cells.o8 L;
    public boolean L0;
    public org.telegram.ui.Cells.a9 M;
    public final ArrayList M0;
    public org.telegram.ui.Cells.o8 N;
    public final no N0;
    public LinearLayout O;
    public org.telegram.ui.Components.ij0 O0;
    public LinearLayout P;
    public ValueAnimator P0;
    public org.telegram.ui.Cells.o8 Q;
    public org.telegram.ui.Cells.o8 R;
    public org.telegram.ui.Cells.o8 S;
    public org.telegram.ui.Cells.o8 T;
    public org.telegram.ui.Cells.o8 U;
    public org.telegram.ui.Cells.o8 V;
    public org.telegram.ui.Cells.o8 W;
    public org.telegram.ui.Cells.o8 X;
    public oo Y;
    public FrameLayout Z;
    public org.telegram.ui.ActionBar.w0 a;
    public org.telegram.ui.Cells.aa a0;
    public org.telegram.ui.ActionBar.d2 b;
    public org.telegram.ui.Cells.z6 b0;
    public UndoView c;
    public org.telegram.ui.Cells.o8 c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.o8 d0;
    public oh.a4 e;
    public uh.a e0;
    public fg.i0 f;
    public org.telegram.ui.Cells.a9 f0;
    public org.telegram.ui.Cells.o8 g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.a9 h0;
    public org.telegram.ui.Cells.o8 i0;
    public org.telegram.ui.Cells.o8 j0;
    public org.telegram.ui.Cells.o8 k0;
    public org.telegram.ui.Cells.o8 l0;
    public org.telegram.ui.Cells.o8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.o8 n0;
    public org.telegram.ui.Cells.o8 o0;
    public org.telegram.ui.Cells.a9 p0;
    public org.telegram.ui.Cells.a9 q0;
    public final org.telegram.ui.Components.z8 r;
    public org.telegram.ui.Cells.o8 r0;
    public final org.telegram.ui.Components.y40 s;
    public TLRPC.FileLocation s0;
    public long t0;
    public TLRPC.Chat u0;
    public org.telegram.ui.Components.fu v;
    public TLRPC.ChatFull v0;
    public eg.s3 w;
    public TLRPC.TL_chatAdminRights w0;
    public org.telegram.ui.Components.fo0 x;
    public TLRPC.TL_chatBannedRights x0;
    public LinearLayout y;
    public TLRPC.TL_chatBannedRights y0;
    public final long z0;

    public po(Bundle bundle) {
        super(bundle);
        this.M0 = new ArrayList();
        this.N0 = new no(this);
        this.r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.t0 = bundle.getLong("chat_id", 0L);
        this.z0 = bundle.getLong("user_id", 0L);
        if (this.t0 == 0) {
            this.s = new org.telegram.ui.Components.y40(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.t0));
            this.s = new org.telegram.ui.Components.y40((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void U(po poVar, FrameLayout frameLayout, View view) {
        if (!poVar.D0) {
            TLRPC.ChatFull chatFull = poVar.v0;
            org.telegram.ui.Components.qc.a0(poVar).Q(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", poVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -poVar.t0;
        iz izVar = new iz(null);
        izVar.a = j10;
        izVar.setResourceProvider(poVar.resourceProvider);
        boolean z4 = poVar.C0;
        boolean z10 = poVar.E0;
        eh.w wVar = new eh.w(13, poVar, view);
        izVar.c = z4;
        izVar.d = z10;
        izVar.f = wVar;
        poVar.presentFragment(izVar);
    }

    public static /* synthetic */ void V(po poVar) {
        poVar.s0 = null;
        long j10 = poVar.z0;
        if (j10 == 0) {
            MessagesController.getInstance(poVar.currentAccount).changeChatAvatar(poVar.t0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = poVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            poVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ho(poVar, 2));
        }
        poVar.n0(false, true);
        oh.a4 a4Var = poVar.e;
        org.telegram.ui.Components.z8 z8Var = poVar.r;
        Object obj = poVar.A0;
        if (obj == null) {
            obj = poVar.u0;
        }
        a4Var.h(null, null, z8Var, obj);
        poVar.O0.K(0);
        poVar.Y.e.d();
    }

    public static void X(po poVar) {
        int i10 = poVar.currentAccount;
        long j10 = poVar.z0;
        TL_bots.botVerifierSettings botverifiersettings = poVar.B0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle e6 = org.telegram.messenger.y3.e(16, "onlySelect", "dialogsType", true);
        e6.putBoolean("resetDelegate", false);
        py pyVar = new py(e6);
        pyVar.setCurrentAccount(i10);
        pyVar.z2 = new org.telegram.ui.Components.s1(pyVar, i10, j10, botverifiersettings);
        U.presentFragment(pyVar);
    }

    public static void Y(po poVar, org.telegram.ui.ActionBar.d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        d2Var.dismiss();
        if (poVar.getParentActivity() == null) {
            return;
        }
        fg.v0 v0Var = new fg.v0(35, poVar.currentAccount, poVar.getParentActivity(), poVar, poVar.getResourceProvider());
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = poVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.N0 = new fc(25, poVar, chat);
        }
        poVar.showDialog(v0Var);
    }

    public static void Z(po poVar) {
        bd bdVar = new bd(-poVar.u0.id);
        bdVar.i0 = poVar;
        poVar.presentFragment(bdVar);
        MessagesController.getInstance(poVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(poVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void a0(po poVar) {
        poVar.L0 = true;
        NotificationCenter.getInstance(poVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder d0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        z00 z00Var = new z00(10);
        z00Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        z00Var.f = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lj, false);
        spannableStringBuilder.setSpan(z00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
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

    @Override // org.telegram.ui.Components.x40
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.x40
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.x40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0979  */
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        final po poVar;
        eg.s3 s3Var;
        Context context2;
        final int i10;
        int i11;
        int i12;
        int i13;
        CharSequence charSequence;
        boolean z4;
        CharSequence X0;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.User user;
        final po poVar2;
        float f10;
        boolean z10;
        String format;
        int i14;
        org.telegram.ui.Cells.o8 o8Var;
        org.telegram.ui.Cells.o8 o8Var2;
        int i15;
        int i16;
        org.telegram.ui.Cells.o8 o8Var3;
        org.telegram.ui.Cells.o8 o8Var4;
        org.telegram.ui.Cells.o8 o8Var5;
        org.telegram.ui.Cells.o8 o8Var6;
        TLRPC.ChatFull chatFull;
        boolean z11;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull2;
        TLRPC.ChatFull chatFull3;
        final int i17 = 1;
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.o();
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 17));
        jd jdVar = new jd(i17, context, this);
        jdVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(8));
        this.fragmentView = jdVar;
        jdVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.a7));
        eg.s3 s3Var2 = new eg.s3(context);
        this.w = s3Var2;
        org.telegram.ui.Components.fo0 fo0Var = new org.telegram.ui.Components.fo0(context, this.w, this.resourceProvider, false);
        this.x = fo0Var;
        fo0Var.setFillViewport(true);
        jdVar.addView(this.x, k7.c6.c(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.x);
        this.x.addView(s3Var2, new FrameLayout.LayoutParams(-1, -2));
        s3Var2.setOrientation(1);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setBackgroundColor(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.d6));
        s3Var2.addView(this.d, k7.c6.n(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, k7.c6.n(-1, -2));
        oh.a4 a4Var = new oh.a4(this, context, 5);
        this.e = a4Var;
        a4Var.setRoundRadius(this.C0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        int i18 = 4;
        if (this.A0 != null || ChatObject.canChangeChatInfo(this.u0)) {
            oh.a4 a4Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(a4Var2, k7.c6.d(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fg.i0 i0Var = new fg.i0(this, context, paint, i18);
            this.f = i0Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(i0Var, k7.c6.d(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, k7.c6.d(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            n0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j10 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat.photo;
                                        int i19 = chatPhoto2.dc_id;
                                        if (i19 != 0) {
                                            chatPhoto2.photo_big.dc_id = i19;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j11 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var7 = poVar14.E;
                            boolean z15 = o8Var7 != null && o8Var7.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j11;
                            epVar.k0 = z15;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z16 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat2 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat2;
                            if (ChatObject.isChannel(chat2) && !rpVar.f.megagroup) {
                                z16 = true;
                            }
                            rpVar.s = z16;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
        } else {
            oh.a4 a4Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(a4Var3, k7.c6.d(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.fu fuVar2 = new org.telegram.ui.Components.fu(context, jdVar, this);
        this.v = fuVar2;
        long j10 = this.z0;
        if (j10 != 0) {
            fuVar2.setHint(LocaleController.getString(R.string.BotName));
        } else if (this.F0) {
            fuVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            fuVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.fu fuVar3 = this.v;
        TLRPC.Chat chat = this.u0;
        fuVar3.setEnabled(chat != null || ChatObject.canChangeChatInfo(chat));
        org.telegram.ui.Components.fu fuVar4 = this.v;
        fuVar4.setFocusable(fuVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new n0(this, 2));
        this.v.setFilters(new InputFilter[]{new InputFilter.LengthFilter(128)});
        org.telegram.ui.Components.fu fuVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(fuVar5, k7.c6.d(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.y = linearLayout2;
        linearLayout2.setOrientation(1);
        s3Var2.addView(this.y, k7.c6.n(-1, -2));
        final int i19 = 12;
        if (this.A0 != null || ChatObject.canChangeChatInfo(this.u0)) {
            oo ooVar = new oo(context);
            this.Y = ooVar;
            ooVar.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            this.Y.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
            this.Y.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat2 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat2.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat2.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat2.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j11 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var7 = poVar14.E;
                            boolean z152 = o8Var7 != null && o8Var7.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j11;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat22 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat22;
                            if (ChatObject.isChannel(chat22) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.Y, k7.c6.n(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.B = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        this.B.setHintTextColor(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.H6));
        EditTextBoldCursor editTextBoldCursor2 = this.B;
        int i20 = org.telegram.ui.ActionBar.k6.G6;
        editTextBoldCursor2.setTextColor(org.telegram.ui.ActionBar.k6.u0(i20));
        this.B.setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
        this.B.setBackgroundDrawable(null);
        this.B.setGravity(LocaleController.isRTL ? 5 : 3);
        this.B.setInputType(180225);
        this.B.setImeOptions(6);
        this.B.setEnabled(this.A0 != null || ChatObject.canChangeChatInfo(this.u0));
        EditTextBoldCursor editTextBoldCursor3 = this.B;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.B.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.B.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        this.B.setCursorColor(org.telegram.ui.ActionBar.k6.u0(i20));
        this.B.setCursorSize(AndroidUtilities.dp(20.0f));
        this.B.setCursorWidth(1.5f);
        if (this.B.isEnabled()) {
            this.y.addView(this.B, k7.c6.k(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.B, k7.c6.k(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.B.setOnEditorActionListener(new ha(this, 2));
        this.B.addTextChangedListener(new md(1));
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context);
        this.D = z6Var;
        s3Var2.addView(z6Var, k7.c6.n(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.C = linearLayout3;
        linearLayout3.setOrientation(1);
        s3Var2.addView(this.C, k7.c6.n(-1, -2));
        TLRPC.Chat chat2 = this.u0;
        if (chat2 != null) {
            if (chat2.megagroup && ((chatFull3 = this.v0) == null || chatFull3.can_set_location)) {
                org.telegram.ui.Cells.o8 o8Var7 = new org.telegram.ui.Cells.o8(context);
                this.E = o8Var7;
                o8Var7.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.C.addView(this.E, k7.c6.n(-1, -2));
                final int i21 = 15;
                this.E.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i21) {
                            case 0:
                                po poVar3 = this.b;
                                poVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", poVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(poVar3.v0);
                                poVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                po poVar4 = this.b;
                                no noVar = poVar4.N0;
                                long j102 = poVar4.z0;
                                if (!poVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = poVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                po poVar5 = this.b;
                                poVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", poVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(poVar5.v0);
                                poVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                po poVar6 = this.b;
                                poVar6.presentFragment(new rh0(poVar6.t0));
                                break;
                            case 4:
                                po poVar7 = this.b;
                                poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                break;
                            case 5:
                                po poVar8 = this.b;
                                poVar8.getClass();
                                poVar8.presentFragment(new sb(poVar8.u0));
                                break;
                            case 6:
                                po poVar9 = this.b;
                                poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                break;
                            case 7:
                                po poVar10 = this.b;
                                poVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", poVar10.z0);
                                poVar10.presentFragment(new pa(bundle3));
                                break;
                            case 8:
                                po poVar11 = this.b;
                                poVar11.presentFragment(new sh.j(poVar11.z0));
                                break;
                            case 9:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                po.X(this.b);
                                break;
                            case 14:
                                po poVar12 = this.b;
                                org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                break;
                            case 15:
                                po poVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                    bd0 bd0Var = new bd0(4);
                                    bd0Var.b0 = -poVar13.t0;
                                    TLRPC.ChatFull chatFull5 = poVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    bd0Var.C0 = new io(poVar13, 6);
                                    poVar13.presentFragment(bd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                po poVar14 = this.b;
                                long j11 = poVar14.t0;
                                org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                ep epVar = new ep(null);
                                epVar.J = new ArrayList();
                                epVar.K = new ArrayList();
                                epVar.M = new ArrayList();
                                epVar.Z = true;
                                epVar.c0 = new ArrayList();
                                epVar.l0 = new HashMap();
                                epVar.n0 = new so(epVar, 5);
                                epVar.q0 = false;
                                epVar.W = j11;
                                epVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = poVar14.v0;
                                epVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        epVar.i0 = tL_chatInviteExported;
                                    } else {
                                        epVar.X(false);
                                    }
                                }
                                poVar14.presentFragment(epVar);
                                break;
                            case 17:
                                po poVar15 = this.b;
                                long j12 = poVar15.t0;
                                rp rpVar = new rp(null);
                                rpVar.v = new ArrayList();
                                boolean z162 = false;
                                rpVar.L = false;
                                rpVar.M = false;
                                rpVar.B = j12;
                                TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                rpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                    z162 = true;
                                }
                                rpVar.s = z162;
                                rpVar.h = poVar15.v0;
                                poVar15.presentFragment(rpVar);
                                break;
                            case 18:
                                po poVar16 = this.b;
                                aw0 aw0Var = new aw0(poVar16.t0);
                                aw0Var.v = new io(poVar16, 4);
                                poVar16.presentFragment(aw0Var);
                                break;
                            case 19:
                                po.Z(this.b);
                                break;
                            case 20:
                                po poVar17 = this.b;
                                n60 n60Var = new n60(-poVar17.u0.id);
                                n60Var.c = poVar17.I0;
                                n60Var.i0 = poVar17;
                                poVar17.presentFragment(n60Var);
                                break;
                            case 21:
                                po poVar18 = this.b;
                                poVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", poVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(poVar18.v0);
                                poVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                po poVar19 = this.b;
                                qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = poVar19.v0;
                                qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                poVar19.presentFragment(qh0Var);
                                break;
                            case 23:
                                po poVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                    poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", poVar20.t0);
                                    yp ypVar = new yp(bundle5);
                                    ypVar.d = new ArrayList();
                                    ypVar.r = new ArrayList();
                                    ypVar.v = -1;
                                    ypVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    ypVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = poVar20.v0;
                                    ypVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ypVar.a == null) {
                                            ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        ypVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ypVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ypVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            ypVar.w = 1;
                                        }
                                    }
                                    poVar20.presentFragment(ypVar);
                                    break;
                                }
                            default:
                                po poVar21 = this.b;
                                poVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", poVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                poVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.u0.creator && ((chatFull2 = this.v0) == null || chatFull2.can_set_username)) {
                org.telegram.ui.Cells.o8 o8Var8 = new org.telegram.ui.Cells.o8(context);
                this.F = o8Var8;
                o8Var8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.C.addView(this.F, k7.c6.n(-1, -2));
                final int i22 = 16;
                this.F.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                po poVar3 = this.b;
                                poVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", poVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(poVar3.v0);
                                poVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                po poVar4 = this.b;
                                no noVar = poVar4.N0;
                                long j102 = poVar4.z0;
                                if (!poVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = poVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                po poVar5 = this.b;
                                poVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", poVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(poVar5.v0);
                                poVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                po poVar6 = this.b;
                                poVar6.presentFragment(new rh0(poVar6.t0));
                                break;
                            case 4:
                                po poVar7 = this.b;
                                poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                break;
                            case 5:
                                po poVar8 = this.b;
                                poVar8.getClass();
                                poVar8.presentFragment(new sb(poVar8.u0));
                                break;
                            case 6:
                                po poVar9 = this.b;
                                poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                break;
                            case 7:
                                po poVar10 = this.b;
                                poVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", poVar10.z0);
                                poVar10.presentFragment(new pa(bundle3));
                                break;
                            case 8:
                                po poVar11 = this.b;
                                poVar11.presentFragment(new sh.j(poVar11.z0));
                                break;
                            case 9:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                po.X(this.b);
                                break;
                            case 14:
                                po poVar12 = this.b;
                                org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                break;
                            case 15:
                                po poVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                    bd0 bd0Var = new bd0(4);
                                    bd0Var.b0 = -poVar13.t0;
                                    TLRPC.ChatFull chatFull5 = poVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    bd0Var.C0 = new io(poVar13, 6);
                                    poVar13.presentFragment(bd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                po poVar14 = this.b;
                                long j11 = poVar14.t0;
                                org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                ep epVar = new ep(null);
                                epVar.J = new ArrayList();
                                epVar.K = new ArrayList();
                                epVar.M = new ArrayList();
                                epVar.Z = true;
                                epVar.c0 = new ArrayList();
                                epVar.l0 = new HashMap();
                                epVar.n0 = new so(epVar, 5);
                                epVar.q0 = false;
                                epVar.W = j11;
                                epVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = poVar14.v0;
                                epVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        epVar.i0 = tL_chatInviteExported;
                                    } else {
                                        epVar.X(false);
                                    }
                                }
                                poVar14.presentFragment(epVar);
                                break;
                            case 17:
                                po poVar15 = this.b;
                                long j12 = poVar15.t0;
                                rp rpVar = new rp(null);
                                rpVar.v = new ArrayList();
                                boolean z162 = false;
                                rpVar.L = false;
                                rpVar.M = false;
                                rpVar.B = j12;
                                TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                rpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                    z162 = true;
                                }
                                rpVar.s = z162;
                                rpVar.h = poVar15.v0;
                                poVar15.presentFragment(rpVar);
                                break;
                            case 18:
                                po poVar16 = this.b;
                                aw0 aw0Var = new aw0(poVar16.t0);
                                aw0Var.v = new io(poVar16, 4);
                                poVar16.presentFragment(aw0Var);
                                break;
                            case 19:
                                po.Z(this.b);
                                break;
                            case 20:
                                po poVar17 = this.b;
                                n60 n60Var = new n60(-poVar17.u0.id);
                                n60Var.c = poVar17.I0;
                                n60Var.i0 = poVar17;
                                poVar17.presentFragment(n60Var);
                                break;
                            case 21:
                                po poVar18 = this.b;
                                poVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", poVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(poVar18.v0);
                                poVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                po poVar19 = this.b;
                                qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = poVar19.v0;
                                qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                poVar19.presentFragment(qh0Var);
                                break;
                            case 23:
                                po poVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                    poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", poVar20.t0);
                                    yp ypVar = new yp(bundle5);
                                    ypVar.d = new ArrayList();
                                    ypVar.r = new ArrayList();
                                    ypVar.v = -1;
                                    ypVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    ypVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = poVar20.v0;
                                    ypVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ypVar.a == null) {
                                            ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        ypVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ypVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ypVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            ypVar.w = 1;
                                        }
                                    }
                                    poVar20.presentFragment(ypVar);
                                    break;
                                }
                            default:
                                po poVar21 = this.b;
                                poVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", poVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                poVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.u0) && ((this.F0 && ChatObject.canUserDoAdminAction(this.u0, 1)) || (!this.F0 && ChatObject.canUserDoAdminAction(this.u0, 0)))) {
                org.telegram.ui.Cells.o8 o8Var9 = new org.telegram.ui.Cells.o8(context);
                this.G = o8Var9;
                o8Var9.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                this.C.addView(this.G, k7.c6.n(-1, -2));
                final int i23 = 17;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                po poVar3 = this.b;
                                poVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", poVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(poVar3.v0);
                                poVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                po poVar4 = this.b;
                                no noVar = poVar4.N0;
                                long j102 = poVar4.z0;
                                if (!poVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = poVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                po poVar5 = this.b;
                                poVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", poVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(poVar5.v0);
                                poVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                po poVar6 = this.b;
                                poVar6.presentFragment(new rh0(poVar6.t0));
                                break;
                            case 4:
                                po poVar7 = this.b;
                                poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                break;
                            case 5:
                                po poVar8 = this.b;
                                poVar8.getClass();
                                poVar8.presentFragment(new sb(poVar8.u0));
                                break;
                            case 6:
                                po poVar9 = this.b;
                                poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                break;
                            case 7:
                                po poVar10 = this.b;
                                poVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", poVar10.z0);
                                poVar10.presentFragment(new pa(bundle3));
                                break;
                            case 8:
                                po poVar11 = this.b;
                                poVar11.presentFragment(new sh.j(poVar11.z0));
                                break;
                            case 9:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                po.X(this.b);
                                break;
                            case 14:
                                po poVar12 = this.b;
                                org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                break;
                            case 15:
                                po poVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                    bd0 bd0Var = new bd0(4);
                                    bd0Var.b0 = -poVar13.t0;
                                    TLRPC.ChatFull chatFull5 = poVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    bd0Var.C0 = new io(poVar13, 6);
                                    poVar13.presentFragment(bd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                po poVar14 = this.b;
                                long j11 = poVar14.t0;
                                org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                ep epVar = new ep(null);
                                epVar.J = new ArrayList();
                                epVar.K = new ArrayList();
                                epVar.M = new ArrayList();
                                epVar.Z = true;
                                epVar.c0 = new ArrayList();
                                epVar.l0 = new HashMap();
                                epVar.n0 = new so(epVar, 5);
                                epVar.q0 = false;
                                epVar.W = j11;
                                epVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = poVar14.v0;
                                epVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        epVar.i0 = tL_chatInviteExported;
                                    } else {
                                        epVar.X(false);
                                    }
                                }
                                poVar14.presentFragment(epVar);
                                break;
                            case 17:
                                po poVar15 = this.b;
                                long j12 = poVar15.t0;
                                rp rpVar = new rp(null);
                                rpVar.v = new ArrayList();
                                boolean z162 = false;
                                rpVar.L = false;
                                rpVar.M = false;
                                rpVar.B = j12;
                                TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                rpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                    z162 = true;
                                }
                                rpVar.s = z162;
                                rpVar.h = poVar15.v0;
                                poVar15.presentFragment(rpVar);
                                break;
                            case 18:
                                po poVar16 = this.b;
                                aw0 aw0Var = new aw0(poVar16.t0);
                                aw0Var.v = new io(poVar16, 4);
                                poVar16.presentFragment(aw0Var);
                                break;
                            case 19:
                                po.Z(this.b);
                                break;
                            case 20:
                                po poVar17 = this.b;
                                n60 n60Var = new n60(-poVar17.u0.id);
                                n60Var.c = poVar17.I0;
                                n60Var.i0 = poVar17;
                                poVar17.presentFragment(n60Var);
                                break;
                            case 21:
                                po poVar18 = this.b;
                                poVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", poVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(poVar18.v0);
                                poVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                po poVar19 = this.b;
                                qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = poVar19.v0;
                                qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                poVar19.presentFragment(qh0Var);
                                break;
                            case 23:
                                po poVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                    poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", poVar20.t0);
                                    yp ypVar = new yp(bundle5);
                                    ypVar.d = new ArrayList();
                                    ypVar.r = new ArrayList();
                                    ypVar.v = -1;
                                    ypVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    ypVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = poVar20.v0;
                                    ypVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ypVar.a == null) {
                                            ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        ypVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ypVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ypVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            ypVar.w = 1;
                                        }
                                    }
                                    poVar20.presentFragment(ypVar);
                                    break;
                                }
                            default:
                                po poVar21 = this.b;
                                poVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", poVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                poVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.u0) && this.F0 && ChatObject.canUserDoAdminAction(this.u0, 1)) {
                org.telegram.ui.Cells.o8 o8Var10 = new org.telegram.ui.Cells.o8(context);
                this.H = o8Var10;
                o8Var10.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
                this.H.q(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                this.C.addView(this.H, k7.c6.n(-1, -2));
                final int i24 = 18;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                po poVar3 = this.b;
                                poVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", poVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(poVar3.v0);
                                poVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                po poVar4 = this.b;
                                no noVar = poVar4.N0;
                                long j102 = poVar4.z0;
                                if (!poVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = poVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                po poVar5 = this.b;
                                poVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", poVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(poVar5.v0);
                                poVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                po poVar6 = this.b;
                                poVar6.presentFragment(new rh0(poVar6.t0));
                                break;
                            case 4:
                                po poVar7 = this.b;
                                poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                break;
                            case 5:
                                po poVar8 = this.b;
                                poVar8.getClass();
                                poVar8.presentFragment(new sb(poVar8.u0));
                                break;
                            case 6:
                                po poVar9 = this.b;
                                poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                break;
                            case 7:
                                po poVar10 = this.b;
                                poVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", poVar10.z0);
                                poVar10.presentFragment(new pa(bundle3));
                                break;
                            case 8:
                                po poVar11 = this.b;
                                poVar11.presentFragment(new sh.j(poVar11.z0));
                                break;
                            case 9:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                po.X(this.b);
                                break;
                            case 14:
                                po poVar12 = this.b;
                                org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                break;
                            case 15:
                                po poVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                    bd0 bd0Var = new bd0(4);
                                    bd0Var.b0 = -poVar13.t0;
                                    TLRPC.ChatFull chatFull5 = poVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    bd0Var.C0 = new io(poVar13, 6);
                                    poVar13.presentFragment(bd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                po poVar14 = this.b;
                                long j11 = poVar14.t0;
                                org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                ep epVar = new ep(null);
                                epVar.J = new ArrayList();
                                epVar.K = new ArrayList();
                                epVar.M = new ArrayList();
                                epVar.Z = true;
                                epVar.c0 = new ArrayList();
                                epVar.l0 = new HashMap();
                                epVar.n0 = new so(epVar, 5);
                                epVar.q0 = false;
                                epVar.W = j11;
                                epVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = poVar14.v0;
                                epVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        epVar.i0 = tL_chatInviteExported;
                                    } else {
                                        epVar.X(false);
                                    }
                                }
                                poVar14.presentFragment(epVar);
                                break;
                            case 17:
                                po poVar15 = this.b;
                                long j12 = poVar15.t0;
                                rp rpVar = new rp(null);
                                rpVar.v = new ArrayList();
                                boolean z162 = false;
                                rpVar.L = false;
                                rpVar.M = false;
                                rpVar.B = j12;
                                TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                rpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                    z162 = true;
                                }
                                rpVar.s = z162;
                                rpVar.h = poVar15.v0;
                                poVar15.presentFragment(rpVar);
                                break;
                            case 18:
                                po poVar16 = this.b;
                                aw0 aw0Var = new aw0(poVar16.t0);
                                aw0Var.v = new io(poVar16, 4);
                                poVar16.presentFragment(aw0Var);
                                break;
                            case 19:
                                po.Z(this.b);
                                break;
                            case 20:
                                po poVar17 = this.b;
                                n60 n60Var = new n60(-poVar17.u0.id);
                                n60Var.c = poVar17.I0;
                                n60Var.i0 = poVar17;
                                poVar17.presentFragment(n60Var);
                                break;
                            case 21:
                                po poVar18 = this.b;
                                poVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", poVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(poVar18.v0);
                                poVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                po poVar19 = this.b;
                                qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = poVar19.v0;
                                qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                poVar19.presentFragment(qh0Var);
                                break;
                            case 23:
                                po poVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                    poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", poVar20.t0);
                                    yp ypVar = new yp(bundle5);
                                    ypVar.d = new ArrayList();
                                    ypVar.r = new ArrayList();
                                    ypVar.v = -1;
                                    ypVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    ypVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = poVar20.v0;
                                    ypVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ypVar.a == null) {
                                            ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        ypVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ypVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ypVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            ypVar.w = 1;
                                        }
                                    }
                                    poVar20.presentFragment(ypVar);
                                    break;
                                }
                            default:
                                po poVar21 = this.b;
                                poVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", poVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                poVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.u0) && ChatObject.canChangeChatInfo(this.u0)) {
                z11 = true;
                s3Var = s3Var2;
                qo0 qo0Var = new qo0(this.currentAccount, -this.u0.id, context, getResourceProvider());
                this.I = qo0Var;
                qo0Var.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
                this.C.addView(this.I, k7.c6.n(-1, -2));
                final int i25 = 19;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                po poVar3 = this.b;
                                poVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", poVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(poVar3.v0);
                                poVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                po poVar4 = this.b;
                                no noVar = poVar4.N0;
                                long j102 = poVar4.z0;
                                if (!poVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = poVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                po poVar5 = this.b;
                                poVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", poVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(poVar5.v0);
                                poVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                po poVar6 = this.b;
                                poVar6.presentFragment(new rh0(poVar6.t0));
                                break;
                            case 4:
                                po poVar7 = this.b;
                                poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                break;
                            case 5:
                                po poVar8 = this.b;
                                poVar8.getClass();
                                poVar8.presentFragment(new sb(poVar8.u0));
                                break;
                            case 6:
                                po poVar9 = this.b;
                                poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                break;
                            case 7:
                                po poVar10 = this.b;
                                poVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", poVar10.z0);
                                poVar10.presentFragment(new pa(bundle3));
                                break;
                            case 8:
                                po poVar11 = this.b;
                                poVar11.presentFragment(new sh.j(poVar11.z0));
                                break;
                            case 9:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                po.X(this.b);
                                break;
                            case 14:
                                po poVar12 = this.b;
                                org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                break;
                            case 15:
                                po poVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                    bd0 bd0Var = new bd0(4);
                                    bd0Var.b0 = -poVar13.t0;
                                    TLRPC.ChatFull chatFull5 = poVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    bd0Var.C0 = new io(poVar13, 6);
                                    poVar13.presentFragment(bd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                po poVar14 = this.b;
                                long j11 = poVar14.t0;
                                org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                ep epVar = new ep(null);
                                epVar.J = new ArrayList();
                                epVar.K = new ArrayList();
                                epVar.M = new ArrayList();
                                epVar.Z = true;
                                epVar.c0 = new ArrayList();
                                epVar.l0 = new HashMap();
                                epVar.n0 = new so(epVar, 5);
                                epVar.q0 = false;
                                epVar.W = j11;
                                epVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = poVar14.v0;
                                epVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        epVar.i0 = tL_chatInviteExported;
                                    } else {
                                        epVar.X(false);
                                    }
                                }
                                poVar14.presentFragment(epVar);
                                break;
                            case 17:
                                po poVar15 = this.b;
                                long j12 = poVar15.t0;
                                rp rpVar = new rp(null);
                                rpVar.v = new ArrayList();
                                boolean z162 = false;
                                rpVar.L = false;
                                rpVar.M = false;
                                rpVar.B = j12;
                                TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                rpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                    z162 = true;
                                }
                                rpVar.s = z162;
                                rpVar.h = poVar15.v0;
                                poVar15.presentFragment(rpVar);
                                break;
                            case 18:
                                po poVar16 = this.b;
                                aw0 aw0Var = new aw0(poVar16.t0);
                                aw0Var.v = new io(poVar16, 4);
                                poVar16.presentFragment(aw0Var);
                                break;
                            case 19:
                                po.Z(this.b);
                                break;
                            case 20:
                                po poVar17 = this.b;
                                n60 n60Var = new n60(-poVar17.u0.id);
                                n60Var.c = poVar17.I0;
                                n60Var.i0 = poVar17;
                                poVar17.presentFragment(n60Var);
                                break;
                            case 21:
                                po poVar18 = this.b;
                                poVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", poVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(poVar18.v0);
                                poVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                po poVar19 = this.b;
                                qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = poVar19.v0;
                                qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                poVar19.presentFragment(qh0Var);
                                break;
                            case 23:
                                po poVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                    poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", poVar20.t0);
                                    yp ypVar = new yp(bundle5);
                                    ypVar.d = new ArrayList();
                                    ypVar.r = new ArrayList();
                                    ypVar.v = -1;
                                    ypVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    ypVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = poVar20.v0;
                                    ypVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ypVar.a == null) {
                                            ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        ypVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ypVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ypVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            ypVar.w = 1;
                                        }
                                    }
                                    poVar20.presentFragment(ypVar);
                                    break;
                                }
                            default:
                                po poVar21 = this.b;
                                poVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", poVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                poVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            } else {
                s3Var = s3Var2;
                z11 = true;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.u0) || ChatObject.isCommunity(this.u0)) {
                context3 = context;
                frameLayout = frameLayout2;
                poVar = this;
            } else {
                long j11 = -this.u0.id;
                org.telegram.ui.Cells.o8 o8Var11 = new org.telegram.ui.Cells.o8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.J = o8Var11;
                o8Var11.setBackground(org.telegram.ui.ActionBar.k6.K0(z11));
                this.J.l(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.u0.autotranslation);
                final int i26 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j11, new h5.d(this) { // from class: org.telegram.ui.go
                    public final /* synthetic */ po b;

                    {
                        this.b = this;
                    }

                    @Override // h5.d
                    public final void accept(Object obj) {
                        switch (i26) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                po poVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    poVar3.getClass();
                                    break;
                                } else {
                                    poVar3.J.getCheckBox().setIcon(tL_premium_boostsStatus.level < poVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.I0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.C.addView(this.J, k7.c6.n(-1, -2));
                frameLayout = frameLayout2;
                poVar = this;
                this.J.setOnClickListener(new mh.q2(this, new boolean[]{false}, j11, 1));
            }
            final int i27 = 20;
            if (!poVar.F0 && ChatObject.canBlockUsers(poVar.u0) && (ChatObject.isChannel(poVar.u0) || poVar.u0.creator)) {
                org.telegram.ui.Cells.o8 o8Var12 = new org.telegram.ui.Cells.o8(context3);
                poVar.K = o8Var12;
                o8Var12.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(true));
                poVar.C.addView(poVar.K, k7.c6.n(-1, -2));
                poVar.K.setOnClickListener(new org.telegram.messenger.video.g(i27, poVar, context3));
            }
            if (ChatObject.isMegagroup(poVar.u0) && ChatObject.hasAdminRights(poVar.u0) && !ChatObject.isCommunity(poVar.u0)) {
                final int i28 = 1;
                MessagesController.getInstance(poVar.currentAccount).getBoostsController().getBoostsStats(-poVar.u0.id, new h5.d(poVar) { // from class: org.telegram.ui.go
                    public final /* synthetic */ po b;

                    {
                        this.b = poVar;
                    }

                    @Override // h5.d
                    public final void accept(Object obj) {
                        switch (i28) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                po poVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    poVar3.getClass();
                                    break;
                                } else {
                                    poVar3.J.getCheckBox().setIcon(tL_premium_boostsStatus.level < poVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.I0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                qo0 qo0Var2 = new qo0(poVar.currentAccount, -poVar.u0.id, context3, poVar.getResourceProvider());
                poVar.I = qo0Var2;
                qo0Var2.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
                poVar.C.addView(poVar.I, k7.c6.n(-1, -2));
                poVar.I.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                    public final /* synthetic */ po b;

                    {
                        this.b = poVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i27) {
                            case 0:
                                po poVar3 = this.b;
                                poVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", poVar3.t0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                qr qrVar = new qr(bundle);
                                qrVar.x0(poVar3.v0);
                                poVar3.presentFragment(qrVar);
                                break;
                            case 1:
                                po poVar4 = this.b;
                                no noVar = poVar4.N0;
                                long j102 = poVar4.z0;
                                if (!poVar4.s.h()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                        TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull4 = poVar4.v0;
                                            if (chatFull4 != null) {
                                                TLRPC.Photo photo = chatFull4.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.t1().K2(null, poVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                po poVar5 = this.b;
                                poVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", poVar5.t0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                qr qrVar2 = new qr(bundle2);
                                qrVar2.x0(poVar5.v0);
                                poVar5.presentFragment(qrVar2);
                                break;
                            case 3:
                                po poVar6 = this.b;
                                poVar6.presentFragment(new rh0(poVar6.t0));
                                break;
                            case 4:
                                po poVar7 = this.b;
                                poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                break;
                            case 5:
                                po poVar8 = this.b;
                                poVar8.getClass();
                                poVar8.presentFragment(new sb(poVar8.u0));
                                break;
                            case 6:
                                po poVar9 = this.b;
                                poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                break;
                            case 7:
                                po poVar10 = this.b;
                                poVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", poVar10.z0);
                                poVar10.presentFragment(new pa(bundle3));
                                break;
                            case 8:
                                po poVar11 = this.b;
                                poVar11.presentFragment(new sh.j(poVar11.z0));
                                break;
                            case 9:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                break;
                            case 10:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                break;
                            case 11:
                                af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                break;
                            case 12:
                                this.b.i0();
                                break;
                            case 13:
                                po.X(this.b);
                                break;
                            case 14:
                                po poVar12 = this.b;
                                org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                break;
                            case 15:
                                po poVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                    bd0 bd0Var = new bd0(4);
                                    bd0Var.b0 = -poVar13.t0;
                                    TLRPC.ChatFull chatFull5 = poVar13.v0;
                                    if (chatFull5 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    bd0Var.C0 = new io(poVar13, 6);
                                    poVar13.presentFragment(bd0Var);
                                    break;
                                }
                                break;
                            case 16:
                                po poVar14 = this.b;
                                long j112 = poVar14.t0;
                                org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                ep epVar = new ep(null);
                                epVar.J = new ArrayList();
                                epVar.K = new ArrayList();
                                epVar.M = new ArrayList();
                                epVar.Z = true;
                                epVar.c0 = new ArrayList();
                                epVar.l0 = new HashMap();
                                epVar.n0 = new so(epVar, 5);
                                epVar.q0 = false;
                                epVar.W = j112;
                                epVar.k0 = z152;
                                TLRPC.ChatFull chatFull6 = poVar14.v0;
                                epVar.V = chatFull6;
                                if (chatFull6 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        epVar.i0 = tL_chatInviteExported;
                                    } else {
                                        epVar.X(false);
                                    }
                                }
                                poVar14.presentFragment(epVar);
                                break;
                            case 17:
                                po poVar15 = this.b;
                                long j12 = poVar15.t0;
                                rp rpVar = new rp(null);
                                rpVar.v = new ArrayList();
                                boolean z162 = false;
                                rpVar.L = false;
                                rpVar.M = false;
                                rpVar.B = j12;
                                TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                rpVar.f = chat222;
                                if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                    z162 = true;
                                }
                                rpVar.s = z162;
                                rpVar.h = poVar15.v0;
                                poVar15.presentFragment(rpVar);
                                break;
                            case 18:
                                po poVar16 = this.b;
                                aw0 aw0Var = new aw0(poVar16.t0);
                                aw0Var.v = new io(poVar16, 4);
                                poVar16.presentFragment(aw0Var);
                                break;
                            case 19:
                                po.Z(this.b);
                                break;
                            case 20:
                                po poVar17 = this.b;
                                n60 n60Var = new n60(-poVar17.u0.id);
                                n60Var.c = poVar17.I0;
                                n60Var.i0 = poVar17;
                                poVar17.presentFragment(n60Var);
                                break;
                            case 21:
                                po poVar18 = this.b;
                                poVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", poVar18.t0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                qr qrVar3 = new qr(bundle4);
                                qrVar3.x0(poVar18.v0);
                                poVar18.presentFragment(qrVar3);
                                break;
                            case 22:
                                po poVar19 = this.b;
                                qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                TLRPC.ChatFull chatFull7 = poVar19.v0;
                                qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                poVar19.presentFragment(qh0Var);
                                break;
                            case 23:
                                po poVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                    poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", poVar20.t0);
                                    yp ypVar = new yp(bundle5);
                                    ypVar.d = new ArrayList();
                                    ypVar.r = new ArrayList();
                                    ypVar.v = -1;
                                    ypVar.C = new ArrayList();
                                    long j13 = bundle5.getLong("chat_id", 0L);
                                    ypVar.c = j13;
                                    TLRPC.ChatFull chatFull8 = poVar20.v0;
                                    ypVar.b = chatFull8;
                                    if (chatFull8 != null) {
                                        if (ypVar.a == null) {
                                            ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                        }
                                        ypVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            ypVar.w = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            ypVar.w = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            ypVar.w = 1;
                                        }
                                    }
                                    poVar20.presentFragment(ypVar);
                                    break;
                                }
                            default:
                                po poVar21 = this.b;
                                poVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", poVar21.t0);
                                bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                poVar21.presentFragment(new xn(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!poVar.F0 && poVar.u0.creator) {
                org.telegram.ui.Cells.o8 o8Var13 = new org.telegram.ui.Cells.o8(23, context, null, false, true);
                context2 = context;
                poVar.N = o8Var13;
                o8Var13.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
                poVar.N.l(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), poVar.C0);
                poVar.N.getCheckBox().setIcon(poVar.D0 ? 0 : R.drawable.permission_locked);
                poVar.C.addView(poVar.N, k7.c6.c(-2.0f, -1));
                i10 = 21;
                poVar.N.setOnClickListener(new org.telegram.messenger.video.g(i10, poVar, frameLayout));
            } else {
                context2 = context;
                i10 = 21;
            }
            poVar.o0();
        } else {
            poVar = this;
            s3Var = s3Var2;
            context2 = context;
            i10 = 21;
        }
        org.telegram.ui.ActionBar.z n10 = poVar.actionBar.n();
        if (poVar.A0 != null || ChatObject.canChangeChatInfo(poVar.u0) || poVar.K != null) {
            org.telegram.ui.ActionBar.w0 g10 = n10.g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
            poVar.a = g10;
            g10.setContentDescription(LocaleController.getString("Done", R.string.Done));
        }
        if (poVar.E == null && poVar.K == null && poVar.F == null && poVar.G == null && poVar.N == null) {
            i12 = -1;
            i13 = -2;
            i11 = 12;
        } else {
            i11 = 12;
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context2, 12, poVar.resourceProvider);
            poVar.M = a9Var;
            if (poVar.N != null) {
                a9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                a9Var.setFixedSize(12);
            }
            i12 = -1;
            i13 = -2;
            s3Var.addView(poVar.M, k7.c6.n(-1, -2));
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        poVar.O = linearLayout4;
        linearLayout4.setOrientation(1);
        s3Var.addView(poVar.O, k7.c6.n(i12, i13));
        if (poVar.u0 != null) {
            org.telegram.ui.Cells.o8 o8Var14 = new org.telegram.ui.Cells.o8(context2);
            poVar.U = o8Var14;
            o8Var14.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            org.telegram.ui.Cells.o8 o8Var15 = poVar.U;
            if (!ChatObject.isChannel(poVar.u0)) {
                TLRPC.Chat chat3 = poVar.u0;
                if (!chat3.creator && (!ChatObject.hasAdminRights(chat3) || !ChatObject.canChangeChatInfo(poVar.u0))) {
                    i14 = 8;
                    o8Var15.setVisibility(i14);
                    poVar.U.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ po b;

                        {
                            this.b = poVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i10) {
                                case 0:
                                    po poVar3 = this.b;
                                    poVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", poVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(poVar3.v0);
                                    poVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    po poVar4 = this.b;
                                    no noVar = poVar4.N0;
                                    long j102 = poVar4.z0;
                                    if (!poVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    po poVar5 = this.b;
                                    poVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", poVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(poVar5.v0);
                                    poVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    po poVar6 = this.b;
                                    poVar6.presentFragment(new rh0(poVar6.t0));
                                    break;
                                case 4:
                                    po poVar7 = this.b;
                                    poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                    break;
                                case 5:
                                    po poVar8 = this.b;
                                    poVar8.getClass();
                                    poVar8.presentFragment(new sb(poVar8.u0));
                                    break;
                                case 6:
                                    po poVar9 = this.b;
                                    poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                    break;
                                case 7:
                                    po poVar10 = this.b;
                                    poVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", poVar10.z0);
                                    poVar10.presentFragment(new pa(bundle3));
                                    break;
                                case 8:
                                    po poVar11 = this.b;
                                    poVar11.presentFragment(new sh.j(poVar11.z0));
                                    break;
                                case 9:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    po.X(this.b);
                                    break;
                                case 14:
                                    po poVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                    break;
                                case 15:
                                    po poVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                        bd0 bd0Var = new bd0(4);
                                        bd0Var.b0 = -poVar13.t0;
                                        TLRPC.ChatFull chatFull5 = poVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        bd0Var.C0 = new io(poVar13, 6);
                                        poVar13.presentFragment(bd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    po poVar14 = this.b;
                                    long j112 = poVar14.t0;
                                    org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                    boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                    ep epVar = new ep(null);
                                    epVar.J = new ArrayList();
                                    epVar.K = new ArrayList();
                                    epVar.M = new ArrayList();
                                    epVar.Z = true;
                                    epVar.c0 = new ArrayList();
                                    epVar.l0 = new HashMap();
                                    epVar.n0 = new so(epVar, 5);
                                    epVar.q0 = false;
                                    epVar.W = j112;
                                    epVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = poVar14.v0;
                                    epVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            epVar.i0 = tL_chatInviteExported;
                                        } else {
                                            epVar.X(false);
                                        }
                                    }
                                    poVar14.presentFragment(epVar);
                                    break;
                                case 17:
                                    po poVar15 = this.b;
                                    long j12 = poVar15.t0;
                                    rp rpVar = new rp(null);
                                    rpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    rpVar.L = false;
                                    rpVar.M = false;
                                    rpVar.B = j12;
                                    TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    rpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    rpVar.s = z162;
                                    rpVar.h = poVar15.v0;
                                    poVar15.presentFragment(rpVar);
                                    break;
                                case 18:
                                    po poVar16 = this.b;
                                    aw0 aw0Var = new aw0(poVar16.t0);
                                    aw0Var.v = new io(poVar16, 4);
                                    poVar16.presentFragment(aw0Var);
                                    break;
                                case 19:
                                    po.Z(this.b);
                                    break;
                                case 20:
                                    po poVar17 = this.b;
                                    n60 n60Var = new n60(-poVar17.u0.id);
                                    n60Var.c = poVar17.I0;
                                    n60Var.i0 = poVar17;
                                    poVar17.presentFragment(n60Var);
                                    break;
                                case 21:
                                    po poVar18 = this.b;
                                    poVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", poVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(poVar18.v0);
                                    poVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    po poVar19 = this.b;
                                    qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = poVar19.v0;
                                    qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    poVar19.presentFragment(qh0Var);
                                    break;
                                case 23:
                                    po poVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                        poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", poVar20.t0);
                                        yp ypVar = new yp(bundle5);
                                        ypVar.d = new ArrayList();
                                        ypVar.r = new ArrayList();
                                        ypVar.v = -1;
                                        ypVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        ypVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = poVar20.v0;
                                        ypVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ypVar.a == null) {
                                                ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            ypVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ypVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ypVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                ypVar.w = 1;
                                            }
                                        }
                                        poVar20.presentFragment(ypVar);
                                        break;
                                    }
                                default:
                                    po poVar21 = this.b;
                                    poVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", poVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                    poVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.o8 o8Var16 = new org.telegram.ui.Cells.o8(context2);
                    poVar.S = o8Var16;
                    o8Var16.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                    final int i29 = 22;
                    poVar.S.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ po b;

                        {
                            this.b = poVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i29) {
                                case 0:
                                    po poVar3 = this.b;
                                    poVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", poVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(poVar3.v0);
                                    poVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    po poVar4 = this.b;
                                    no noVar = poVar4.N0;
                                    long j102 = poVar4.z0;
                                    if (!poVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    po poVar5 = this.b;
                                    poVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", poVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(poVar5.v0);
                                    poVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    po poVar6 = this.b;
                                    poVar6.presentFragment(new rh0(poVar6.t0));
                                    break;
                                case 4:
                                    po poVar7 = this.b;
                                    poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                    break;
                                case 5:
                                    po poVar8 = this.b;
                                    poVar8.getClass();
                                    poVar8.presentFragment(new sb(poVar8.u0));
                                    break;
                                case 6:
                                    po poVar9 = this.b;
                                    poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                    break;
                                case 7:
                                    po poVar10 = this.b;
                                    poVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", poVar10.z0);
                                    poVar10.presentFragment(new pa(bundle3));
                                    break;
                                case 8:
                                    po poVar11 = this.b;
                                    poVar11.presentFragment(new sh.j(poVar11.z0));
                                    break;
                                case 9:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    po.X(this.b);
                                    break;
                                case 14:
                                    po poVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                    break;
                                case 15:
                                    po poVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                        bd0 bd0Var = new bd0(4);
                                        bd0Var.b0 = -poVar13.t0;
                                        TLRPC.ChatFull chatFull5 = poVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        bd0Var.C0 = new io(poVar13, 6);
                                        poVar13.presentFragment(bd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    po poVar14 = this.b;
                                    long j112 = poVar14.t0;
                                    org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                    boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                    ep epVar = new ep(null);
                                    epVar.J = new ArrayList();
                                    epVar.K = new ArrayList();
                                    epVar.M = new ArrayList();
                                    epVar.Z = true;
                                    epVar.c0 = new ArrayList();
                                    epVar.l0 = new HashMap();
                                    epVar.n0 = new so(epVar, 5);
                                    epVar.q0 = false;
                                    epVar.W = j112;
                                    epVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = poVar14.v0;
                                    epVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            epVar.i0 = tL_chatInviteExported;
                                        } else {
                                            epVar.X(false);
                                        }
                                    }
                                    poVar14.presentFragment(epVar);
                                    break;
                                case 17:
                                    po poVar15 = this.b;
                                    long j12 = poVar15.t0;
                                    rp rpVar = new rp(null);
                                    rpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    rpVar.L = false;
                                    rpVar.M = false;
                                    rpVar.B = j12;
                                    TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    rpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    rpVar.s = z162;
                                    rpVar.h = poVar15.v0;
                                    poVar15.presentFragment(rpVar);
                                    break;
                                case 18:
                                    po poVar16 = this.b;
                                    aw0 aw0Var = new aw0(poVar16.t0);
                                    aw0Var.v = new io(poVar16, 4);
                                    poVar16.presentFragment(aw0Var);
                                    break;
                                case 19:
                                    po.Z(this.b);
                                    break;
                                case 20:
                                    po poVar17 = this.b;
                                    n60 n60Var = new n60(-poVar17.u0.id);
                                    n60Var.c = poVar17.I0;
                                    n60Var.i0 = poVar17;
                                    poVar17.presentFragment(n60Var);
                                    break;
                                case 21:
                                    po poVar18 = this.b;
                                    poVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", poVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(poVar18.v0);
                                    poVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    po poVar19 = this.b;
                                    qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = poVar19.v0;
                                    qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    poVar19.presentFragment(qh0Var);
                                    break;
                                case 23:
                                    po poVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                        poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", poVar20.t0);
                                        yp ypVar = new yp(bundle5);
                                        ypVar.d = new ArrayList();
                                        ypVar.r = new ArrayList();
                                        ypVar.v = -1;
                                        ypVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        ypVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = poVar20.v0;
                                        ypVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ypVar.a == null) {
                                                ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            ypVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ypVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ypVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                ypVar.w = 1;
                                            }
                                        }
                                        poVar20.presentFragment(ypVar);
                                        break;
                                    }
                                default:
                                    po poVar21 = this.b;
                                    poVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", poVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                    poVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.o8 o8Var17 = new org.telegram.ui.Cells.o8(context2);
                    poVar.L = o8Var17;
                    o8Var17.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                    final int i30 = 23;
                    poVar.L.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ po b;

                        {
                            this.b = poVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i30) {
                                case 0:
                                    po poVar3 = this.b;
                                    poVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", poVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(poVar3.v0);
                                    poVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    po poVar4 = this.b;
                                    no noVar = poVar4.N0;
                                    long j102 = poVar4.z0;
                                    if (!poVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    po poVar5 = this.b;
                                    poVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", poVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(poVar5.v0);
                                    poVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    po poVar6 = this.b;
                                    poVar6.presentFragment(new rh0(poVar6.t0));
                                    break;
                                case 4:
                                    po poVar7 = this.b;
                                    poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                    break;
                                case 5:
                                    po poVar8 = this.b;
                                    poVar8.getClass();
                                    poVar8.presentFragment(new sb(poVar8.u0));
                                    break;
                                case 6:
                                    po poVar9 = this.b;
                                    poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                    break;
                                case 7:
                                    po poVar10 = this.b;
                                    poVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", poVar10.z0);
                                    poVar10.presentFragment(new pa(bundle3));
                                    break;
                                case 8:
                                    po poVar11 = this.b;
                                    poVar11.presentFragment(new sh.j(poVar11.z0));
                                    break;
                                case 9:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    po.X(this.b);
                                    break;
                                case 14:
                                    po poVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                    break;
                                case 15:
                                    po poVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                        bd0 bd0Var = new bd0(4);
                                        bd0Var.b0 = -poVar13.t0;
                                        TLRPC.ChatFull chatFull5 = poVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        bd0Var.C0 = new io(poVar13, 6);
                                        poVar13.presentFragment(bd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    po poVar14 = this.b;
                                    long j112 = poVar14.t0;
                                    org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                    boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                    ep epVar = new ep(null);
                                    epVar.J = new ArrayList();
                                    epVar.K = new ArrayList();
                                    epVar.M = new ArrayList();
                                    epVar.Z = true;
                                    epVar.c0 = new ArrayList();
                                    epVar.l0 = new HashMap();
                                    epVar.n0 = new so(epVar, 5);
                                    epVar.q0 = false;
                                    epVar.W = j112;
                                    epVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = poVar14.v0;
                                    epVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            epVar.i0 = tL_chatInviteExported;
                                        } else {
                                            epVar.X(false);
                                        }
                                    }
                                    poVar14.presentFragment(epVar);
                                    break;
                                case 17:
                                    po poVar15 = this.b;
                                    long j12 = poVar15.t0;
                                    rp rpVar = new rp(null);
                                    rpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    rpVar.L = false;
                                    rpVar.M = false;
                                    rpVar.B = j12;
                                    TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    rpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    rpVar.s = z162;
                                    rpVar.h = poVar15.v0;
                                    poVar15.presentFragment(rpVar);
                                    break;
                                case 18:
                                    po poVar16 = this.b;
                                    aw0 aw0Var = new aw0(poVar16.t0);
                                    aw0Var.v = new io(poVar16, 4);
                                    poVar16.presentFragment(aw0Var);
                                    break;
                                case 19:
                                    po.Z(this.b);
                                    break;
                                case 20:
                                    po poVar17 = this.b;
                                    n60 n60Var = new n60(-poVar17.u0.id);
                                    n60Var.c = poVar17.I0;
                                    n60Var.i0 = poVar17;
                                    poVar17.presentFragment(n60Var);
                                    break;
                                case 21:
                                    po poVar18 = this.b;
                                    poVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", poVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(poVar18.v0);
                                    poVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    po poVar19 = this.b;
                                    qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = poVar19.v0;
                                    qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    poVar19.presentFragment(qh0Var);
                                    break;
                                case 23:
                                    po poVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                        poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", poVar20.t0);
                                        yp ypVar = new yp(bundle5);
                                        ypVar.d = new ArrayList();
                                        ypVar.r = new ArrayList();
                                        ypVar.v = -1;
                                        ypVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        ypVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = poVar20.v0;
                                        ypVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ypVar.a == null) {
                                                ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            ypVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ypVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ypVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                ypVar.w = 1;
                                            }
                                        }
                                        poVar20.presentFragment(ypVar);
                                        break;
                                    }
                                default:
                                    po poVar21 = this.b;
                                    poVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", poVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                    poVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(poVar.u0, 28)) {
                        org.telegram.ui.Cells.o8 o8Var18 = new org.telegram.ui.Cells.o8(context2);
                        poVar.c0 = o8Var18;
                        o8Var18.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                        final int i31 = 24;
                        poVar.c0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ po b;

                            {
                                this.b = poVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i31) {
                                    case 0:
                                        po poVar3 = this.b;
                                        poVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", poVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(poVar3.v0);
                                        poVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        po poVar4 = this.b;
                                        no noVar = poVar4.N0;
                                        long j102 = poVar4.z0;
                                        if (!poVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        po poVar5 = this.b;
                                        poVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", poVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(poVar5.v0);
                                        poVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        po poVar6 = this.b;
                                        poVar6.presentFragment(new rh0(poVar6.t0));
                                        break;
                                    case 4:
                                        po poVar7 = this.b;
                                        poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                        break;
                                    case 5:
                                        po poVar8 = this.b;
                                        poVar8.getClass();
                                        poVar8.presentFragment(new sb(poVar8.u0));
                                        break;
                                    case 6:
                                        po poVar9 = this.b;
                                        poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                        break;
                                    case 7:
                                        po poVar10 = this.b;
                                        poVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", poVar10.z0);
                                        poVar10.presentFragment(new pa(bundle3));
                                        break;
                                    case 8:
                                        po poVar11 = this.b;
                                        poVar11.presentFragment(new sh.j(poVar11.z0));
                                        break;
                                    case 9:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        po.X(this.b);
                                        break;
                                    case 14:
                                        po poVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                        break;
                                    case 15:
                                        po poVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                            bd0 bd0Var = new bd0(4);
                                            bd0Var.b0 = -poVar13.t0;
                                            TLRPC.ChatFull chatFull5 = poVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            bd0Var.C0 = new io(poVar13, 6);
                                            poVar13.presentFragment(bd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        po poVar14 = this.b;
                                        long j112 = poVar14.t0;
                                        org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                        boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                        ep epVar = new ep(null);
                                        epVar.J = new ArrayList();
                                        epVar.K = new ArrayList();
                                        epVar.M = new ArrayList();
                                        epVar.Z = true;
                                        epVar.c0 = new ArrayList();
                                        epVar.l0 = new HashMap();
                                        epVar.n0 = new so(epVar, 5);
                                        epVar.q0 = false;
                                        epVar.W = j112;
                                        epVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = poVar14.v0;
                                        epVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                epVar.i0 = tL_chatInviteExported;
                                            } else {
                                                epVar.X(false);
                                            }
                                        }
                                        poVar14.presentFragment(epVar);
                                        break;
                                    case 17:
                                        po poVar15 = this.b;
                                        long j12 = poVar15.t0;
                                        rp rpVar = new rp(null);
                                        rpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        rpVar.L = false;
                                        rpVar.M = false;
                                        rpVar.B = j12;
                                        TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        rpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        rpVar.s = z162;
                                        rpVar.h = poVar15.v0;
                                        poVar15.presentFragment(rpVar);
                                        break;
                                    case 18:
                                        po poVar16 = this.b;
                                        aw0 aw0Var = new aw0(poVar16.t0);
                                        aw0Var.v = new io(poVar16, 4);
                                        poVar16.presentFragment(aw0Var);
                                        break;
                                    case 19:
                                        po.Z(this.b);
                                        break;
                                    case 20:
                                        po poVar17 = this.b;
                                        n60 n60Var = new n60(-poVar17.u0.id);
                                        n60Var.c = poVar17.I0;
                                        n60Var.i0 = poVar17;
                                        poVar17.presentFragment(n60Var);
                                        break;
                                    case 21:
                                        po poVar18 = this.b;
                                        poVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", poVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(poVar18.v0);
                                        poVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        po poVar19 = this.b;
                                        qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = poVar19.v0;
                                        qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        poVar19.presentFragment(qh0Var);
                                        break;
                                    case 23:
                                        po poVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                            poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", poVar20.t0);
                                            yp ypVar = new yp(bundle5);
                                            ypVar.d = new ArrayList();
                                            ypVar.r = new ArrayList();
                                            ypVar.v = -1;
                                            ypVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            ypVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = poVar20.v0;
                                            ypVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ypVar.a == null) {
                                                    ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                ypVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ypVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ypVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    ypVar.w = 1;
                                                }
                                            }
                                            poVar20.presentFragment(ypVar);
                                            break;
                                        }
                                    default:
                                        po poVar21 = this.b;
                                        poVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", poVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                        poVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                        poVar.f0();
                    }
                    org.telegram.ui.Cells.o8 o8Var19 = new org.telegram.ui.Cells.o8(context2);
                    poVar.T = o8Var19;
                    final int i32 = 0;
                    o8Var19.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                    poVar.T.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ po b;

                        {
                            this.b = poVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    po poVar3 = this.b;
                                    poVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", poVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(poVar3.v0);
                                    poVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    po poVar4 = this.b;
                                    no noVar = poVar4.N0;
                                    long j102 = poVar4.z0;
                                    if (!poVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    po poVar5 = this.b;
                                    poVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", poVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(poVar5.v0);
                                    poVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    po poVar6 = this.b;
                                    poVar6.presentFragment(new rh0(poVar6.t0));
                                    break;
                                case 4:
                                    po poVar7 = this.b;
                                    poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                    break;
                                case 5:
                                    po poVar8 = this.b;
                                    poVar8.getClass();
                                    poVar8.presentFragment(new sb(poVar8.u0));
                                    break;
                                case 6:
                                    po poVar9 = this.b;
                                    poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                    break;
                                case 7:
                                    po poVar10 = this.b;
                                    poVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", poVar10.z0);
                                    poVar10.presentFragment(new pa(bundle3));
                                    break;
                                case 8:
                                    po poVar11 = this.b;
                                    poVar11.presentFragment(new sh.j(poVar11.z0));
                                    break;
                                case 9:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    po.X(this.b);
                                    break;
                                case 14:
                                    po poVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                    break;
                                case 15:
                                    po poVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                        bd0 bd0Var = new bd0(4);
                                        bd0Var.b0 = -poVar13.t0;
                                        TLRPC.ChatFull chatFull5 = poVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        bd0Var.C0 = new io(poVar13, 6);
                                        poVar13.presentFragment(bd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    po poVar14 = this.b;
                                    long j112 = poVar14.t0;
                                    org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                    boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                    ep epVar = new ep(null);
                                    epVar.J = new ArrayList();
                                    epVar.K = new ArrayList();
                                    epVar.M = new ArrayList();
                                    epVar.Z = true;
                                    epVar.c0 = new ArrayList();
                                    epVar.l0 = new HashMap();
                                    epVar.n0 = new so(epVar, 5);
                                    epVar.q0 = false;
                                    epVar.W = j112;
                                    epVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = poVar14.v0;
                                    epVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            epVar.i0 = tL_chatInviteExported;
                                        } else {
                                            epVar.X(false);
                                        }
                                    }
                                    poVar14.presentFragment(epVar);
                                    break;
                                case 17:
                                    po poVar15 = this.b;
                                    long j12 = poVar15.t0;
                                    rp rpVar = new rp(null);
                                    rpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    rpVar.L = false;
                                    rpVar.M = false;
                                    rpVar.B = j12;
                                    TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    rpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    rpVar.s = z162;
                                    rpVar.h = poVar15.v0;
                                    poVar15.presentFragment(rpVar);
                                    break;
                                case 18:
                                    po poVar16 = this.b;
                                    aw0 aw0Var = new aw0(poVar16.t0);
                                    aw0Var.v = new io(poVar16, 4);
                                    poVar16.presentFragment(aw0Var);
                                    break;
                                case 19:
                                    po.Z(this.b);
                                    break;
                                case 20:
                                    po poVar17 = this.b;
                                    n60 n60Var = new n60(-poVar17.u0.id);
                                    n60Var.c = poVar17.I0;
                                    n60Var.i0 = poVar17;
                                    poVar17.presentFragment(n60Var);
                                    break;
                                case 21:
                                    po poVar18 = this.b;
                                    poVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", poVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(poVar18.v0);
                                    poVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    po poVar19 = this.b;
                                    qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = poVar19.v0;
                                    qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    poVar19.presentFragment(qh0Var);
                                    break;
                                case 23:
                                    po poVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                        poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", poVar20.t0);
                                        yp ypVar = new yp(bundle5);
                                        ypVar.d = new ArrayList();
                                        ypVar.r = new ArrayList();
                                        ypVar.v = -1;
                                        ypVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        ypVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = poVar20.v0;
                                        ypVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ypVar.a == null) {
                                                ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            ypVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ypVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ypVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                ypVar.w = 1;
                                            }
                                        }
                                        poVar20.presentFragment(ypVar);
                                        break;
                                    }
                                default:
                                    po poVar21 = this.b;
                                    poVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", poVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                    poVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.o8 o8Var20 = new org.telegram.ui.Cells.o8(context2);
                    poVar.Q = o8Var20;
                    o8Var20.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                    final int i33 = 2;
                    poVar.Q.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ po b;

                        {
                            this.b = poVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    po poVar3 = this.b;
                                    poVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", poVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(poVar3.v0);
                                    poVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    po poVar4 = this.b;
                                    no noVar = poVar4.N0;
                                    long j102 = poVar4.z0;
                                    if (!poVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    po poVar5 = this.b;
                                    poVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", poVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(poVar5.v0);
                                    poVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    po poVar6 = this.b;
                                    poVar6.presentFragment(new rh0(poVar6.t0));
                                    break;
                                case 4:
                                    po poVar7 = this.b;
                                    poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                    break;
                                case 5:
                                    po poVar8 = this.b;
                                    poVar8.getClass();
                                    poVar8.presentFragment(new sb(poVar8.u0));
                                    break;
                                case 6:
                                    po poVar9 = this.b;
                                    poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                    break;
                                case 7:
                                    po poVar10 = this.b;
                                    poVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", poVar10.z0);
                                    poVar10.presentFragment(new pa(bundle3));
                                    break;
                                case 8:
                                    po poVar11 = this.b;
                                    poVar11.presentFragment(new sh.j(poVar11.z0));
                                    break;
                                case 9:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    po.X(this.b);
                                    break;
                                case 14:
                                    po poVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                    break;
                                case 15:
                                    po poVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                        bd0 bd0Var = new bd0(4);
                                        bd0Var.b0 = -poVar13.t0;
                                        TLRPC.ChatFull chatFull5 = poVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        bd0Var.C0 = new io(poVar13, 6);
                                        poVar13.presentFragment(bd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    po poVar14 = this.b;
                                    long j112 = poVar14.t0;
                                    org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                    boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                    ep epVar = new ep(null);
                                    epVar.J = new ArrayList();
                                    epVar.K = new ArrayList();
                                    epVar.M = new ArrayList();
                                    epVar.Z = true;
                                    epVar.c0 = new ArrayList();
                                    epVar.l0 = new HashMap();
                                    epVar.n0 = new so(epVar, 5);
                                    epVar.q0 = false;
                                    epVar.W = j112;
                                    epVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = poVar14.v0;
                                    epVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            epVar.i0 = tL_chatInviteExported;
                                        } else {
                                            epVar.X(false);
                                        }
                                    }
                                    poVar14.presentFragment(epVar);
                                    break;
                                case 17:
                                    po poVar15 = this.b;
                                    long j12 = poVar15.t0;
                                    rp rpVar = new rp(null);
                                    rpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    rpVar.L = false;
                                    rpVar.M = false;
                                    rpVar.B = j12;
                                    TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    rpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    rpVar.s = z162;
                                    rpVar.h = poVar15.v0;
                                    poVar15.presentFragment(rpVar);
                                    break;
                                case 18:
                                    po poVar16 = this.b;
                                    aw0 aw0Var = new aw0(poVar16.t0);
                                    aw0Var.v = new io(poVar16, 4);
                                    poVar16.presentFragment(aw0Var);
                                    break;
                                case 19:
                                    po.Z(this.b);
                                    break;
                                case 20:
                                    po poVar17 = this.b;
                                    n60 n60Var = new n60(-poVar17.u0.id);
                                    n60Var.c = poVar17.I0;
                                    n60Var.i0 = poVar17;
                                    poVar17.presentFragment(n60Var);
                                    break;
                                case 21:
                                    po poVar18 = this.b;
                                    poVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", poVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(poVar18.v0);
                                    poVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    po poVar19 = this.b;
                                    qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = poVar19.v0;
                                    qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    poVar19.presentFragment(qh0Var);
                                    break;
                                case 23:
                                    po poVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                        poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", poVar20.t0);
                                        yp ypVar = new yp(bundle5);
                                        ypVar.d = new ArrayList();
                                        ypVar.r = new ArrayList();
                                        ypVar.v = -1;
                                        ypVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        ypVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = poVar20.v0;
                                        ypVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ypVar.a == null) {
                                                ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            ypVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ypVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ypVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                ypVar.w = 1;
                                            }
                                        }
                                        poVar20.presentFragment(ypVar);
                                        break;
                                    }
                                default:
                                    po poVar21 = this.b;
                                    poVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", poVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                    poVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(poVar.u0)) {
                        org.telegram.ui.Cells.o8 o8Var21 = new org.telegram.ui.Cells.o8(context2);
                        poVar.R = o8Var21;
                        o8Var21.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                        final int i34 = 3;
                        poVar.R.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ po b;

                            {
                                this.b = poVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i34) {
                                    case 0:
                                        po poVar3 = this.b;
                                        poVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", poVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(poVar3.v0);
                                        poVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        po poVar4 = this.b;
                                        no noVar = poVar4.N0;
                                        long j102 = poVar4.z0;
                                        if (!poVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        po poVar5 = this.b;
                                        poVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", poVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(poVar5.v0);
                                        poVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        po poVar6 = this.b;
                                        poVar6.presentFragment(new rh0(poVar6.t0));
                                        break;
                                    case 4:
                                        po poVar7 = this.b;
                                        poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                        break;
                                    case 5:
                                        po poVar8 = this.b;
                                        poVar8.getClass();
                                        poVar8.presentFragment(new sb(poVar8.u0));
                                        break;
                                    case 6:
                                        po poVar9 = this.b;
                                        poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                        break;
                                    case 7:
                                        po poVar10 = this.b;
                                        poVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", poVar10.z0);
                                        poVar10.presentFragment(new pa(bundle3));
                                        break;
                                    case 8:
                                        po poVar11 = this.b;
                                        poVar11.presentFragment(new sh.j(poVar11.z0));
                                        break;
                                    case 9:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        po.X(this.b);
                                        break;
                                    case 14:
                                        po poVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                        break;
                                    case 15:
                                        po poVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                            bd0 bd0Var = new bd0(4);
                                            bd0Var.b0 = -poVar13.t0;
                                            TLRPC.ChatFull chatFull5 = poVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            bd0Var.C0 = new io(poVar13, 6);
                                            poVar13.presentFragment(bd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        po poVar14 = this.b;
                                        long j112 = poVar14.t0;
                                        org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                        boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                        ep epVar = new ep(null);
                                        epVar.J = new ArrayList();
                                        epVar.K = new ArrayList();
                                        epVar.M = new ArrayList();
                                        epVar.Z = true;
                                        epVar.c0 = new ArrayList();
                                        epVar.l0 = new HashMap();
                                        epVar.n0 = new so(epVar, 5);
                                        epVar.q0 = false;
                                        epVar.W = j112;
                                        epVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = poVar14.v0;
                                        epVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                epVar.i0 = tL_chatInviteExported;
                                            } else {
                                                epVar.X(false);
                                            }
                                        }
                                        poVar14.presentFragment(epVar);
                                        break;
                                    case 17:
                                        po poVar15 = this.b;
                                        long j12 = poVar15.t0;
                                        rp rpVar = new rp(null);
                                        rpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        rpVar.L = false;
                                        rpVar.M = false;
                                        rpVar.B = j12;
                                        TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        rpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        rpVar.s = z162;
                                        rpVar.h = poVar15.v0;
                                        poVar15.presentFragment(rpVar);
                                        break;
                                    case 18:
                                        po poVar16 = this.b;
                                        aw0 aw0Var = new aw0(poVar16.t0);
                                        aw0Var.v = new io(poVar16, 4);
                                        poVar16.presentFragment(aw0Var);
                                        break;
                                    case 19:
                                        po.Z(this.b);
                                        break;
                                    case 20:
                                        po poVar17 = this.b;
                                        n60 n60Var = new n60(-poVar17.u0.id);
                                        n60Var.c = poVar17.I0;
                                        n60Var.i0 = poVar17;
                                        poVar17.presentFragment(n60Var);
                                        break;
                                    case 21:
                                        po poVar18 = this.b;
                                        poVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", poVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(poVar18.v0);
                                        poVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        po poVar19 = this.b;
                                        qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = poVar19.v0;
                                        qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        poVar19.presentFragment(qh0Var);
                                        break;
                                    case 23:
                                        po poVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                            poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", poVar20.t0);
                                            yp ypVar = new yp(bundle5);
                                            ypVar.d = new ArrayList();
                                            ypVar.r = new ArrayList();
                                            ypVar.v = -1;
                                            ypVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            ypVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = poVar20.v0;
                                            ypVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ypVar.a == null) {
                                                    ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                ypVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ypVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ypVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    ypVar.w = 1;
                                                }
                                            }
                                            poVar20.presentFragment(ypVar);
                                            break;
                                        }
                                    default:
                                        po poVar21 = this.b;
                                        poVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", poVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                        poVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.o8 o8Var22 = new org.telegram.ui.Cells.o8(context2);
                    poVar.W = o8Var22;
                    o8Var22.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    poVar.W.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                    final int i35 = 4;
                    poVar.W.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                        public final /* synthetic */ po b;

                        {
                            this.b = poVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i35) {
                                case 0:
                                    po poVar3 = this.b;
                                    poVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", poVar3.t0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    qr qrVar = new qr(bundle);
                                    qrVar.x0(poVar3.v0);
                                    poVar3.presentFragment(qrVar);
                                    break;
                                case 1:
                                    po poVar4 = this.b;
                                    no noVar = poVar4.N0;
                                    long j102 = poVar4.z0;
                                    if (!poVar4.s.h()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                            TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                if (chatFull4 != null) {
                                                    TLRPC.Photo photo = chatFull4.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.t1().K2(null, poVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    po poVar5 = this.b;
                                    poVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", poVar5.t0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    qr qrVar2 = new qr(bundle2);
                                    qrVar2.x0(poVar5.v0);
                                    poVar5.presentFragment(qrVar2);
                                    break;
                                case 3:
                                    po poVar6 = this.b;
                                    poVar6.presentFragment(new rh0(poVar6.t0));
                                    break;
                                case 4:
                                    po poVar7 = this.b;
                                    poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                    break;
                                case 5:
                                    po poVar8 = this.b;
                                    poVar8.getClass();
                                    poVar8.presentFragment(new sb(poVar8.u0));
                                    break;
                                case 6:
                                    po poVar9 = this.b;
                                    poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                    break;
                                case 7:
                                    po poVar10 = this.b;
                                    poVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", poVar10.z0);
                                    poVar10.presentFragment(new pa(bundle3));
                                    break;
                                case 8:
                                    po poVar11 = this.b;
                                    poVar11.presentFragment(new sh.j(poVar11.z0));
                                    break;
                                case 9:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                    break;
                                case 10:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                    break;
                                case 11:
                                    af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                    break;
                                case 12:
                                    this.b.i0();
                                    break;
                                case 13:
                                    po.X(this.b);
                                    break;
                                case 14:
                                    po poVar12 = this.b;
                                    org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                    break;
                                case 15:
                                    po poVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                        bd0 bd0Var = new bd0(4);
                                        bd0Var.b0 = -poVar13.t0;
                                        TLRPC.ChatFull chatFull5 = poVar13.v0;
                                        if (chatFull5 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        bd0Var.C0 = new io(poVar13, 6);
                                        poVar13.presentFragment(bd0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    po poVar14 = this.b;
                                    long j112 = poVar14.t0;
                                    org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                    boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                    ep epVar = new ep(null);
                                    epVar.J = new ArrayList();
                                    epVar.K = new ArrayList();
                                    epVar.M = new ArrayList();
                                    epVar.Z = true;
                                    epVar.c0 = new ArrayList();
                                    epVar.l0 = new HashMap();
                                    epVar.n0 = new so(epVar, 5);
                                    epVar.q0 = false;
                                    epVar.W = j112;
                                    epVar.k0 = z152;
                                    TLRPC.ChatFull chatFull6 = poVar14.v0;
                                    epVar.V = chatFull6;
                                    if (chatFull6 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            epVar.i0 = tL_chatInviteExported;
                                        } else {
                                            epVar.X(false);
                                        }
                                    }
                                    poVar14.presentFragment(epVar);
                                    break;
                                case 17:
                                    po poVar15 = this.b;
                                    long j12 = poVar15.t0;
                                    rp rpVar = new rp(null);
                                    rpVar.v = new ArrayList();
                                    boolean z162 = false;
                                    rpVar.L = false;
                                    rpVar.M = false;
                                    rpVar.B = j12;
                                    TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                    rpVar.f = chat222;
                                    if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    rpVar.s = z162;
                                    rpVar.h = poVar15.v0;
                                    poVar15.presentFragment(rpVar);
                                    break;
                                case 18:
                                    po poVar16 = this.b;
                                    aw0 aw0Var = new aw0(poVar16.t0);
                                    aw0Var.v = new io(poVar16, 4);
                                    poVar16.presentFragment(aw0Var);
                                    break;
                                case 19:
                                    po.Z(this.b);
                                    break;
                                case 20:
                                    po poVar17 = this.b;
                                    n60 n60Var = new n60(-poVar17.u0.id);
                                    n60Var.c = poVar17.I0;
                                    n60Var.i0 = poVar17;
                                    poVar17.presentFragment(n60Var);
                                    break;
                                case 21:
                                    po poVar18 = this.b;
                                    poVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", poVar18.t0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                    qr qrVar3 = new qr(bundle4);
                                    qrVar3.x0(poVar18.v0);
                                    poVar18.presentFragment(qrVar3);
                                    break;
                                case 22:
                                    po poVar19 = this.b;
                                    qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                    TLRPC.ChatFull chatFull7 = poVar19.v0;
                                    qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                    poVar19.presentFragment(qh0Var);
                                    break;
                                case 23:
                                    po poVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                        poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", poVar20.t0);
                                        yp ypVar = new yp(bundle5);
                                        ypVar.d = new ArrayList();
                                        ypVar.r = new ArrayList();
                                        ypVar.v = -1;
                                        ypVar.C = new ArrayList();
                                        long j13 = bundle5.getLong("chat_id", 0L);
                                        ypVar.c = j13;
                                        TLRPC.ChatFull chatFull8 = poVar20.v0;
                                        ypVar.b = chatFull8;
                                        if (chatFull8 != null) {
                                            if (ypVar.a == null) {
                                                ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                            }
                                            ypVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                ypVar.w = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                ypVar.w = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                ypVar.w = 1;
                                            }
                                        }
                                        poVar20.presentFragment(ypVar);
                                        break;
                                    }
                                default:
                                    po poVar21 = this.b;
                                    poVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", poVar21.t0);
                                    bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                    poVar21.presentFragment(new xn(bundle6));
                                    break;
                            }
                        }
                    });
                    poVar.W.setVisibility(8);
                    if (!ChatObject.isChannel(poVar.u0) || poVar.u0.gigagroup) {
                        org.telegram.ui.Cells.o8 o8Var23 = new org.telegram.ui.Cells.o8(context2);
                        poVar.V = o8Var23;
                        o8Var23.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        poVar.V.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                        final int i36 = 5;
                        poVar.V.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ po b;

                            {
                                this.b = poVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i36) {
                                    case 0:
                                        po poVar3 = this.b;
                                        poVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", poVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(poVar3.v0);
                                        poVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        po poVar4 = this.b;
                                        no noVar = poVar4.N0;
                                        long j102 = poVar4.z0;
                                        if (!poVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        po poVar5 = this.b;
                                        poVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", poVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(poVar5.v0);
                                        poVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        po poVar6 = this.b;
                                        poVar6.presentFragment(new rh0(poVar6.t0));
                                        break;
                                    case 4:
                                        po poVar7 = this.b;
                                        poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                        break;
                                    case 5:
                                        po poVar8 = this.b;
                                        poVar8.getClass();
                                        poVar8.presentFragment(new sb(poVar8.u0));
                                        break;
                                    case 6:
                                        po poVar9 = this.b;
                                        poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                        break;
                                    case 7:
                                        po poVar10 = this.b;
                                        poVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", poVar10.z0);
                                        poVar10.presentFragment(new pa(bundle3));
                                        break;
                                    case 8:
                                        po poVar11 = this.b;
                                        poVar11.presentFragment(new sh.j(poVar11.z0));
                                        break;
                                    case 9:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        po.X(this.b);
                                        break;
                                    case 14:
                                        po poVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                        break;
                                    case 15:
                                        po poVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                            bd0 bd0Var = new bd0(4);
                                            bd0Var.b0 = -poVar13.t0;
                                            TLRPC.ChatFull chatFull5 = poVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            bd0Var.C0 = new io(poVar13, 6);
                                            poVar13.presentFragment(bd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        po poVar14 = this.b;
                                        long j112 = poVar14.t0;
                                        org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                        boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                        ep epVar = new ep(null);
                                        epVar.J = new ArrayList();
                                        epVar.K = new ArrayList();
                                        epVar.M = new ArrayList();
                                        epVar.Z = true;
                                        epVar.c0 = new ArrayList();
                                        epVar.l0 = new HashMap();
                                        epVar.n0 = new so(epVar, 5);
                                        epVar.q0 = false;
                                        epVar.W = j112;
                                        epVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = poVar14.v0;
                                        epVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                epVar.i0 = tL_chatInviteExported;
                                            } else {
                                                epVar.X(false);
                                            }
                                        }
                                        poVar14.presentFragment(epVar);
                                        break;
                                    case 17:
                                        po poVar15 = this.b;
                                        long j12 = poVar15.t0;
                                        rp rpVar = new rp(null);
                                        rpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        rpVar.L = false;
                                        rpVar.M = false;
                                        rpVar.B = j12;
                                        TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        rpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        rpVar.s = z162;
                                        rpVar.h = poVar15.v0;
                                        poVar15.presentFragment(rpVar);
                                        break;
                                    case 18:
                                        po poVar16 = this.b;
                                        aw0 aw0Var = new aw0(poVar16.t0);
                                        aw0Var.v = new io(poVar16, 4);
                                        poVar16.presentFragment(aw0Var);
                                        break;
                                    case 19:
                                        po.Z(this.b);
                                        break;
                                    case 20:
                                        po poVar17 = this.b;
                                        n60 n60Var = new n60(-poVar17.u0.id);
                                        n60Var.c = poVar17.I0;
                                        n60Var.i0 = poVar17;
                                        poVar17.presentFragment(n60Var);
                                        break;
                                    case 21:
                                        po poVar18 = this.b;
                                        poVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", poVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(poVar18.v0);
                                        poVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        po poVar19 = this.b;
                                        qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = poVar19.v0;
                                        qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        poVar19.presentFragment(qh0Var);
                                        break;
                                    case 23:
                                        po poVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                            poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", poVar20.t0);
                                            yp ypVar = new yp(bundle5);
                                            ypVar.d = new ArrayList();
                                            ypVar.r = new ArrayList();
                                            ypVar.v = -1;
                                            ypVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            ypVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = poVar20.v0;
                                            ypVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ypVar.a == null) {
                                                    ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                ypVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ypVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ypVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    ypVar.w = 1;
                                                }
                                            }
                                            poVar20.presentFragment(ypVar);
                                            break;
                                        }
                                    default:
                                        po poVar21 = this.b;
                                        poVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", poVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                        poVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(poVar.u0)) {
                        org.telegram.ui.Cells.o8 o8Var24 = new org.telegram.ui.Cells.o8(context2);
                        poVar.X = o8Var24;
                        o8Var24.m(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        poVar.X.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                        final int i37 = 6;
                        poVar.X.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                            public final /* synthetic */ po b;

                            {
                                this.b = poVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i37) {
                                    case 0:
                                        po poVar3 = this.b;
                                        poVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", poVar3.t0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        qr qrVar = new qr(bundle);
                                        qrVar.x0(poVar3.v0);
                                        poVar3.presentFragment(qrVar);
                                        break;
                                    case 1:
                                        po poVar4 = this.b;
                                        no noVar = poVar4.N0;
                                        long j102 = poVar4.z0;
                                        if (!poVar4.s.h()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                                TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull4 = poVar4.v0;
                                                    if (chatFull4 != null) {
                                                        TLRPC.Photo photo = chatFull4.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.t1().K2(null, poVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        po poVar5 = this.b;
                                        poVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", poVar5.t0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        qr qrVar2 = new qr(bundle2);
                                        qrVar2.x0(poVar5.v0);
                                        poVar5.presentFragment(qrVar2);
                                        break;
                                    case 3:
                                        po poVar6 = this.b;
                                        poVar6.presentFragment(new rh0(poVar6.t0));
                                        break;
                                    case 4:
                                        po poVar7 = this.b;
                                        poVar7.presentFragment(new sh.d3(-poVar7.t0));
                                        break;
                                    case 5:
                                        po poVar8 = this.b;
                                        poVar8.getClass();
                                        poVar8.presentFragment(new sb(poVar8.u0));
                                        break;
                                    case 6:
                                        po poVar9 = this.b;
                                        poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                                        break;
                                    case 7:
                                        po poVar10 = this.b;
                                        poVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", poVar10.z0);
                                        poVar10.presentFragment(new pa(bundle3));
                                        break;
                                    case 8:
                                        po poVar11 = this.b;
                                        poVar11.presentFragment(new sh.j(poVar11.z0));
                                        break;
                                    case 9:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                                        break;
                                    case 10:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                                        break;
                                    case 11:
                                        af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                                        break;
                                    case 12:
                                        this.b.i0();
                                        break;
                                    case 13:
                                        po.X(this.b);
                                        break;
                                    case 14:
                                        po poVar12 = this.b;
                                        org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                                        break;
                                    case 15:
                                        po poVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                            bd0 bd0Var = new bd0(4);
                                            bd0Var.b0 = -poVar13.t0;
                                            TLRPC.ChatFull chatFull5 = poVar13.v0;
                                            if (chatFull5 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            bd0Var.C0 = new io(poVar13, 6);
                                            poVar13.presentFragment(bd0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        po poVar14 = this.b;
                                        long j112 = poVar14.t0;
                                        org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                                        boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                                        ep epVar = new ep(null);
                                        epVar.J = new ArrayList();
                                        epVar.K = new ArrayList();
                                        epVar.M = new ArrayList();
                                        epVar.Z = true;
                                        epVar.c0 = new ArrayList();
                                        epVar.l0 = new HashMap();
                                        epVar.n0 = new so(epVar, 5);
                                        epVar.q0 = false;
                                        epVar.W = j112;
                                        epVar.k0 = z152;
                                        TLRPC.ChatFull chatFull6 = poVar14.v0;
                                        epVar.V = chatFull6;
                                        if (chatFull6 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                epVar.i0 = tL_chatInviteExported;
                                            } else {
                                                epVar.X(false);
                                            }
                                        }
                                        poVar14.presentFragment(epVar);
                                        break;
                                    case 17:
                                        po poVar15 = this.b;
                                        long j12 = poVar15.t0;
                                        rp rpVar = new rp(null);
                                        rpVar.v = new ArrayList();
                                        boolean z162 = false;
                                        rpVar.L = false;
                                        rpVar.M = false;
                                        rpVar.B = j12;
                                        TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                                        rpVar.f = chat222;
                                        if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        rpVar.s = z162;
                                        rpVar.h = poVar15.v0;
                                        poVar15.presentFragment(rpVar);
                                        break;
                                    case 18:
                                        po poVar16 = this.b;
                                        aw0 aw0Var = new aw0(poVar16.t0);
                                        aw0Var.v = new io(poVar16, 4);
                                        poVar16.presentFragment(aw0Var);
                                        break;
                                    case 19:
                                        po.Z(this.b);
                                        break;
                                    case 20:
                                        po poVar17 = this.b;
                                        n60 n60Var = new n60(-poVar17.u0.id);
                                        n60Var.c = poVar17.I0;
                                        n60Var.i0 = poVar17;
                                        poVar17.presentFragment(n60Var);
                                        break;
                                    case 21:
                                        po poVar18 = this.b;
                                        poVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", poVar18.t0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                                        qr qrVar3 = new qr(bundle4);
                                        qrVar3.x0(poVar18.v0);
                                        poVar18.presentFragment(qrVar3);
                                        break;
                                    case 22:
                                        po poVar19 = this.b;
                                        qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                                        TLRPC.ChatFull chatFull7 = poVar19.v0;
                                        qh0Var.g0(chatFull7, chatFull7.exported_invite);
                                        poVar19.presentFragment(qh0Var);
                                        break;
                                    case 23:
                                        po poVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                            poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", poVar20.t0);
                                            yp ypVar = new yp(bundle5);
                                            ypVar.d = new ArrayList();
                                            ypVar.r = new ArrayList();
                                            ypVar.v = -1;
                                            ypVar.C = new ArrayList();
                                            long j13 = bundle5.getLong("chat_id", 0L);
                                            ypVar.c = j13;
                                            TLRPC.ChatFull chatFull8 = poVar20.v0;
                                            ypVar.b = chatFull8;
                                            if (chatFull8 != null) {
                                                if (ypVar.a == null) {
                                                    ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                                }
                                                ypVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    ypVar.w = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    ypVar.w = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    ypVar.w = 1;
                                                }
                                            }
                                            poVar20.presentFragment(ypVar);
                                            break;
                                        }
                                    default:
                                        po poVar21 = this.b;
                                        poVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", poVar21.t0);
                                        bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                                        poVar21.presentFragment(new xn(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    poVar.O.addView(poVar.L, k7.c6.n(-1, -2));
                    o8Var = poVar.c0;
                    if (o8Var != null) {
                        poVar.O.addView(o8Var, k7.c6.n(-1, -2));
                    }
                    if (!poVar.F0 && !poVar.u0.gigagroup) {
                        poVar.O.addView(poVar.U, k7.c6.n(-1, -2));
                    }
                    if (!poVar.F0) {
                        poVar.O.addView(poVar.S, k7.c6.n(-1, -2));
                    }
                    poVar.O.addView(poVar.T, k7.c6.n(-1, -2));
                    poVar.O.addView(poVar.Q, k7.c6.n(-1, -2));
                    o8Var2 = poVar.R;
                    if (o8Var2 != null && (chatFull = poVar.v0) != null && chatFull.requests_pending > 0) {
                        poVar.O.addView(o8Var2, k7.c6.n(-1, -2));
                    }
                    if (poVar.F0) {
                        poVar.O.addView(poVar.S, k7.c6.n(-1, -2));
                    }
                    if (!poVar.F0 || poVar.u0.gigagroup) {
                        i15 = -1;
                        i16 = -2;
                        poVar.O.addView(poVar.U, k7.c6.n(-1, -2));
                    } else {
                        i15 = -1;
                        i16 = -2;
                    }
                    o8Var3 = poVar.X;
                    if (o8Var3 != null) {
                        poVar.O.addView(o8Var3, k7.c6.n(i15, i16));
                    }
                    o8Var4 = poVar.V;
                    if (o8Var4 != null) {
                        poVar.O.addView(o8Var4, k7.c6.n(i15, i16));
                    }
                    o8Var5 = poVar.W;
                    if (o8Var5 != null) {
                        poVar.O.addView(o8Var5, k7.c6.n(i15, i16));
                    }
                    if (poVar.W != null && poVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(poVar.u0)) {
                        poVar.W.setVisibility(0);
                    }
                    o8Var6 = poVar.V;
                    if (o8Var6 != null) {
                        org.telegram.ui.Cells.o8 o8Var25 = poVar.W;
                        o8Var6.setNeedDivider(o8Var25 != null && o8Var25.getVisibility() == 0);
                    }
                }
            }
            i14 = 0;
            o8Var15.setVisibility(i14);
            poVar.U.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.o8 o8Var162 = new org.telegram.ui.Cells.o8(context2);
            poVar.S = o8Var162;
            o8Var162.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            final int i292 = 22;
            poVar.S.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i292) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.o8 o8Var172 = new org.telegram.ui.Cells.o8(context2);
            poVar.L = o8Var172;
            o8Var172.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            final int i302 = 23;
            poVar.L.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i302) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(poVar.u0, 28)) {
            }
            org.telegram.ui.Cells.o8 o8Var192 = new org.telegram.ui.Cells.o8(context2);
            poVar.T = o8Var192;
            final int i322 = 0;
            o8Var192.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            poVar.T.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.o8 o8Var202 = new org.telegram.ui.Cells.o8(context2);
            poVar.Q = o8Var202;
            o8Var202.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            final int i332 = 2;
            poVar.Q.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(poVar.u0)) {
            }
            org.telegram.ui.Cells.o8 o8Var222 = new org.telegram.ui.Cells.o8(context2);
            poVar.W = o8Var222;
            o8Var222.m(R.drawable.menu_feature_premium, d0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            poVar.W.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            final int i352 = 4;
            poVar.W.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i352) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            poVar.W.setVisibility(8);
            if (!ChatObject.isChannel(poVar.u0)) {
            }
            org.telegram.ui.Cells.o8 o8Var232 = new org.telegram.ui.Cells.o8(context2);
            poVar.V = o8Var232;
            o8Var232.m(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            poVar.V.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            final int i362 = 5;
            poVar.V.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(poVar.u0)) {
            }
            poVar.O.addView(poVar.L, k7.c6.n(-1, -2));
            o8Var = poVar.c0;
            if (o8Var != null) {
            }
            if (!poVar.F0) {
                poVar.O.addView(poVar.U, k7.c6.n(-1, -2));
            }
            if (!poVar.F0) {
            }
            poVar.O.addView(poVar.T, k7.c6.n(-1, -2));
            poVar.O.addView(poVar.Q, k7.c6.n(-1, -2));
            o8Var2 = poVar.R;
            if (o8Var2 != null) {
                poVar.O.addView(o8Var2, k7.c6.n(-1, -2));
            }
            if (poVar.F0) {
            }
            if (poVar.F0) {
            }
            i15 = -1;
            i16 = -2;
            poVar.O.addView(poVar.U, k7.c6.n(-1, -2));
            o8Var3 = poVar.X;
            if (o8Var3 != null) {
            }
            o8Var4 = poVar.V;
            if (o8Var4 != null) {
            }
            o8Var5 = poVar.W;
            if (o8Var5 != null) {
            }
            if (poVar.W != null) {
                poVar.W.setVisibility(0);
            }
            o8Var6 = poVar.V;
            if (o8Var6 != null) {
            }
        }
        if (poVar.A0 != null) {
            org.telegram.ui.Cells.o8 o8Var26 = new org.telegram.ui.Cells.o8(context2);
            poVar.i0 = o8Var26;
            o8Var26.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            poVar.i0.setPrioritizeTitleOverValue(true);
            poVar.O.addView(poVar.i0, k7.c6.n(-1, -2));
            final int i38 = 7;
            poVar.i0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i38) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            poVar.r0();
            org.telegram.ui.Cells.o8 o8Var27 = new org.telegram.ui.Cells.o8(context2);
            poVar.l0 = o8Var27;
            o8Var27.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            poVar.l0.q(d0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            poVar.O.addView(poVar.l0, k7.c6.n(-1, -2));
            final int i39 = 8;
            poVar.l0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i39) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            poVar.l0.f(45, poVar.B0 == null, false);
            TLRPC.UserFull userFull = poVar.B0;
            if (userFull != null) {
                org.telegram.ui.Cells.o8 o8Var28 = poVar.l0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z10 = false;
                } else {
                    z10 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                o8Var28.u(format, z10);
            }
            if (!poVar.getMessagesController().starrefProgramAllowed) {
                poVar.l0.setVisibility(8);
            }
            org.telegram.ui.Cells.o8 o8Var29 = new org.telegram.ui.Cells.o8(context2);
            poVar.m0 = o8Var29;
            o8Var29.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            poVar.m0.m(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            poVar.O.addView(poVar.m0, k7.c6.n(-1, -2));
            final int i40 = 9;
            poVar.m0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i40) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.o8 o8Var30 = new org.telegram.ui.Cells.o8(context2);
            poVar.n0 = o8Var30;
            o8Var30.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            poVar.n0.m(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            poVar.O.addView(poVar.n0, k7.c6.n(-1, -2));
            final int i41 = 10;
            poVar.n0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i41) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.o8 o8Var31 = new org.telegram.ui.Cells.o8(context2);
            poVar.o0 = o8Var31;
            o8Var31.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            poVar.o0.m(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            poVar.O.addView(poVar.o0, k7.c6.n(-1, -2));
            final int i42 = 11;
            poVar.o0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i42) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat4 = poVar.u0;
        if (chat4 != null) {
            if (!ChatObject.hasAdminRights(chat4)) {
                poVar.O.setVisibility(8);
                poVar.D.setVisibility(8);
            }
            s3Var.addView(new org.telegram.ui.Cells.z6(context2), k7.c6.n(-1, -2));
        } else if (poVar.A0 != null) {
            poVar.p0 = new org.telegram.ui.Cells.a9(context2, i11, poVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new mh.l3(1), indexOf, indexOf + 10, 33);
            }
            poVar.p0.setText(valueOf);
            s3Var.addView(poVar.p0, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.o8 o8Var32 = new org.telegram.ui.Cells.o8(context2);
            poVar.r0 = o8Var32;
            o8Var32.setBackground(org.telegram.ui.ActionBar.k6.K0(true));
            poVar.r0.m(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.o8 o8Var33 = poVar.r0;
            int i43 = org.telegram.ui.ActionBar.k6.q6;
            o8Var33.e(i43, i43);
            s3Var.addView(poVar.r0, k7.c6.n(-1, -2));
            final int i44 = 13;
            poVar.r0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user2.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j12 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j12;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j12));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j13 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j13;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j13));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.a9 a9Var2 = new org.telegram.ui.Cells.a9(context2, i11, poVar.resourceProvider);
            poVar.q0 = a9Var2;
            a9Var2.setFixedSize(i11);
            s3Var.addView(poVar.q0, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.o8 o8Var34 = poVar.r0;
            TLRPC.UserFull userFull2 = poVar.B0;
            o8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.a9 a9Var3 = poVar.q0;
            TLRPC.UserFull userFull3 = poVar.B0;
            a9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = poVar.A0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout5 = new LinearLayout(context2);
                poVar.P = linearLayout5;
                linearLayout5.setOrientation(1);
                s3Var.addView(poVar.P, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context2);
                m4Var.setText(LocaleController.getString(R.string.BotBalance));
                poVar.P.addView(m4Var, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.o8 o8Var35 = new org.telegram.ui.Cells.o8(context2);
                poVar.j0 = o8Var35;
                o8Var35.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                poVar.j0.setPrioritizeTitleOverValue(true);
                poVar.P.addView(poVar.j0, k7.c6.n(-1, -2));
                final mh.a0 g11 = mh.a0.g(poVar.currentAccount);
                final int i45 = 0;
                poVar.j0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.co
                    public final /* synthetic */ po b;

                    {
                        this.b = poVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i45) {
                            case 0:
                                po poVar3 = this.b;
                                long j12 = poVar3.z0;
                                if (g11.h(j12, false) != null) {
                                    poVar3.presentFragment(new mh.p(1, j12));
                                    break;
                                }
                                break;
                            default:
                                po poVar4 = this.b;
                                long j13 = poVar4.z0;
                                if (g11.h(j13, false) != null) {
                                    poVar4.presentFragment(new mh.p(0, j13));
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
                            poVar.j0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    charSequence = "";
                    poVar.j0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.l90(AndroidUtilities.dp(30.0f), poVar.j0.c), 0, spannableStringBuilder2.length(), 33);
                    poVar.j0.q(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    charSequence = "";
                }
                poVar.j0.setVisibility(g11.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.o8 o8Var36 = new org.telegram.ui.Cells.o8(context2);
                poVar.k0 = o8Var36;
                o8Var36.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                final int i47 = 1;
                poVar.k0.setPrioritizeTitleOverValue(true);
                poVar.P.addView(poVar.k0, k7.c6.n(-1, -2));
                poVar.k0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.co
                    public final /* synthetic */ po b;

                    {
                        this.b = poVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i47) {
                            case 0:
                                po poVar3 = this.b;
                                long j12 = poVar3.z0;
                                if (g11.h(j12, false) != null) {
                                    poVar3.presentFragment(new mh.p(1, j12));
                                    break;
                                }
                                break;
                            default:
                                po poVar4 = this.b;
                                long j13 = poVar4.z0;
                                if (g11.h(j13, false) != null) {
                                    poVar4.presentFragment(new mh.p(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g11.h(j10, false) != null) {
                    org.telegram.ui.Cells.o8 o8Var37 = poVar.k0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g11.c(j10).amount <= 0) {
                        X0 = charSequence;
                        z4 = false;
                    } else {
                        z4 = false;
                        X0 = mh.ja.X0(false, TextUtils.concat("XTR", mh.ja.K0(g11.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    o8Var37.q(string2, X0, R.drawable.menu_premium_main, z4);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.l90(AndroidUtilities.dp(30.0f), poVar.k0.c), 0, spannableStringBuilder3.length(), 33);
                    poVar.k0.q(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                poVar.k0.setVisibility(g11.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.a9 a9Var4 = new org.telegram.ui.Cells.a9(context2, 12, poVar.getResourceProvider());
                a9Var4.setFixedSize(12);
                a9Var4.setTag(R.id.fit_width_tag, 1);
                s3Var.addView(a9Var4, k7.c6.n(-1, 12));
                poVar.P.setVisibility((poVar.k0.getVisibility() == 0 || poVar.j0.getVisibility() == 0) ? 0 : 8);
            }
        }
        TLRPC.Chat chat5 = poVar.u0;
        final int i48 = 14;
        if ((chat5 == null || !chat5.creator) && !((user = poVar.A0) != null && user.bot && user.bot_can_edit)) {
            poVar2 = poVar;
            f10 = -2.0f;
        } else {
            final long j12 = chat5 != null ? chat5.linked_community_id : poVar.A0.linked_community_id;
            final long j13 = chat5 != null ? -chat5.id : poVar.A0.id;
            final boolean z17 = poVar.A0 != null;
            if (j12 != 0) {
                uh.a aVar = new uh.a(context2, poVar.resourceProvider);
                poVar.e0 = aVar;
                aVar.a(poVar.currentAccount, poVar.getMessagesController().getChat(Long.valueOf(j12)));
                final int i49 = 0;
                poVar.e0.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                poVar.e0.setOnClickListener(new View.OnClickListener(poVar) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ po b;

                    {
                        this.b = poVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i49) {
                            case 0:
                                po poVar3 = this.b;
                                MessagesController messagesController = poVar3.getMessagesController();
                                long j14 = j12;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    poVar3.showDialog(new th.i0(poVar3, j14, null, null));
                                    break;
                                } else {
                                    poVar3.presentFragment(new th.n(l.d.g(j14, "community_id")));
                                    break;
                                }
                            default:
                                po poVar4 = this.b;
                                poVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j12);
                                poVar4.presentFragment(new th.g(bundle));
                                break;
                        }
                    }
                });
                s3Var.addView(poVar.e0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.o8 o8Var38 = new org.telegram.ui.Cells.o8(context2);
                poVar.g0 = o8Var38;
                o8Var38.m(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : poVar.F0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                org.telegram.ui.Cells.o8 o8Var39 = poVar.g0;
                int i50 = org.telegram.ui.ActionBar.k6.p7;
                o8Var39.e(i50, i50);
                poVar.g0.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                poVar2 = poVar;
                f10 = -2.0f;
                poVar.g0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.fo
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                        po poVar3 = po.this;
                        org.telegram.ui.Components.z4.v0(poVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : poVar3.F0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new mo(poVar3, j13, j12, 0));
                    }
                });
                s3Var.addView(poVar2.g0, k7.c6.n(-1, -2));
                org.telegram.ui.Cells.a9 a9Var5 = new org.telegram.ui.Cells.a9(context2, 12, poVar2.getResourceProvider());
                poVar2.h0 = a9Var5;
                a9Var5.setFixedSize(14);
                poVar2.h0.setTag(R.id.fit_width_tag, 1);
                s3Var.addView(poVar2.h0, k7.c6.n(-1, 14));
            } else {
                poVar2 = poVar;
                f10 = -2.0f;
                org.telegram.ui.Cells.o8 o8Var40 = new org.telegram.ui.Cells.o8(context2);
                poVar2.d0 = o8Var40;
                o8Var40.e(org.telegram.ui.ActionBar.k6.v6, org.telegram.ui.ActionBar.k6.u6);
                poVar2.d0.setTextColor(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.il));
                poVar2.d0.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
                poVar2.d0.m(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : poVar2.F0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                final int i51 = 1;
                poVar2.d0.setOnClickListener(new View.OnClickListener(poVar2) { // from class: org.telegram.ui.eo
                    public final /* synthetic */ po b;

                    {
                        this.b = poVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i51) {
                            case 0:
                                po poVar3 = this.b;
                                MessagesController messagesController = poVar3.getMessagesController();
                                long j14 = j13;
                                if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                    poVar3.showDialog(new th.i0(poVar3, j14, null, null));
                                    break;
                                } else {
                                    poVar3.presentFragment(new th.n(l.d.g(j14, "community_id")));
                                    break;
                                }
                            default:
                                po poVar4 = this.b;
                                poVar4.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("dialog_id", j13);
                                poVar4.presentFragment(new th.g(bundle));
                                break;
                        }
                    }
                });
                org.telegram.ui.Cells.a9 a9Var6 = new org.telegram.ui.Cells.a9(context2, 12, poVar2.resourceProvider);
                poVar2.f0 = a9Var6;
                a9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : poVar2.F0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                s3Var.addView(poVar2.d0, k7.c6.n(-1, -2));
                s3Var.addView(poVar2.f0, k7.c6.n(-1, -2));
            }
        }
        TLRPC.Chat chat6 = poVar2.u0;
        if (chat6 != null && chat6.creator) {
            FrameLayout frameLayout3 = new FrameLayout(context2);
            poVar2.Z = frameLayout3;
            s3Var.addView(frameLayout3, k7.c6.n(-1, -2));
            org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(context2);
            poVar2.a0 = aaVar;
            aaVar.setTextColor(org.telegram.ui.ActionBar.k6.u0(org.telegram.ui.ActionBar.k6.p7));
            poVar2.a0.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
            if (poVar2.A0 != null) {
                poVar2.a0.b(LocaleController.getString(R.string.DeleteBot), false);
            } else if (poVar2.F0) {
                poVar2.a0.b(LocaleController.getString(R.string.ChannelDelete), false);
            } else {
                poVar2.a0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
            }
            poVar2.Z.addView(poVar2.a0, k7.c6.c(f10, -1));
            poVar2.a0.setOnClickListener(new View.OnClickListener(poVar2) { // from class: org.telegram.ui.bo
                public final /* synthetic */ po b;

                {
                    this.b = poVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i48) {
                        case 0:
                            po poVar3 = this.b;
                            poVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", poVar3.t0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            qr qrVar = new qr(bundle);
                            qrVar.x0(poVar3.v0);
                            poVar3.presentFragment(qrVar);
                            break;
                        case 1:
                            po poVar4 = this.b;
                            no noVar = poVar4.N0;
                            long j102 = poVar4.z0;
                            if (!poVar4.s.h()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : poVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat22 = poVar4.getMessagesController().getChat(Long.valueOf(poVar4.t0));
                                    TLRPC.ChatPhoto chatPhoto = chat22.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat22.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull4 = poVar4.v0;
                                        if (chatFull4 != null) {
                                            TLRPC.Photo photo = chatFull4.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(poVar4.v0.chat_photo.video_sizes.get(0), poVar4.v0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.t1().e2(null, chat22.photo.photo_big, null, imageLocation, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.t1().K2(null, poVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.t1().e2(null, user22.photo.photo_big, null, null, null, null, null, 0, noVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            po poVar5 = this.b;
                            poVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", poVar5.t0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            qr qrVar2 = new qr(bundle2);
                            qrVar2.x0(poVar5.v0);
                            poVar5.presentFragment(qrVar2);
                            break;
                        case 3:
                            po poVar6 = this.b;
                            poVar6.presentFragment(new rh0(poVar6.t0));
                            break;
                        case 4:
                            po poVar7 = this.b;
                            poVar7.presentFragment(new sh.d3(-poVar7.t0));
                            break;
                        case 5:
                            po poVar8 = this.b;
                            poVar8.getClass();
                            poVar8.presentFragment(new sb(poVar8.u0));
                            break;
                        case 6:
                            po poVar9 = this.b;
                            poVar9.presentFragment(ha1.d0(poVar9.u0, false));
                            break;
                        case 7:
                            po poVar10 = this.b;
                            poVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", poVar10.z0);
                            poVar10.presentFragment(new pa(bundle3));
                            break;
                        case 8:
                            po poVar11 = this.b;
                            poVar11.presentFragment(new sh.j(poVar11.z0));
                            break;
                        case 9:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-intro");
                            break;
                        case 10:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0) + "-commands");
                            break;
                        case 11:
                            af.g.s(view.getContext(), "https://t.me/BotFather?start=" + po.g0(this.b.A0));
                            break;
                        case 12:
                            this.b.i0();
                            break;
                        case 13:
                            po.X(this.b);
                            break;
                        case 14:
                            po poVar12 = this.b;
                            org.telegram.ui.Components.z4.s(poVar12, false, poVar12.u0, null, false, true, true, false, new io(poVar12, 7));
                            break;
                        case 15:
                            po poVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(poVar13)) {
                                bd0 bd0Var = new bd0(4);
                                bd0Var.b0 = -poVar13.t0;
                                TLRPC.ChatFull chatFull5 = poVar13.v0;
                                if (chatFull5 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull5.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        bd0Var.x0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                bd0Var.C0 = new io(poVar13, 6);
                                poVar13.presentFragment(bd0Var);
                                break;
                            }
                            break;
                        case 16:
                            po poVar14 = this.b;
                            long j112 = poVar14.t0;
                            org.telegram.ui.Cells.o8 o8Var72 = poVar14.E;
                            boolean z152 = o8Var72 != null && o8Var72.getVisibility() == 0;
                            ep epVar = new ep(null);
                            epVar.J = new ArrayList();
                            epVar.K = new ArrayList();
                            epVar.M = new ArrayList();
                            epVar.Z = true;
                            epVar.c0 = new ArrayList();
                            epVar.l0 = new HashMap();
                            epVar.n0 = new so(epVar, 5);
                            epVar.q0 = false;
                            epVar.W = j112;
                            epVar.k0 = z152;
                            TLRPC.ChatFull chatFull6 = poVar14.v0;
                            epVar.V = chatFull6;
                            if (chatFull6 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    epVar.i0 = tL_chatInviteExported;
                                } else {
                                    epVar.X(false);
                                }
                            }
                            poVar14.presentFragment(epVar);
                            break;
                        case 17:
                            po poVar15 = this.b;
                            long j122 = poVar15.t0;
                            rp rpVar = new rp(null);
                            rpVar.v = new ArrayList();
                            boolean z162 = false;
                            rpVar.L = false;
                            rpVar.M = false;
                            rpVar.B = j122;
                            TLRPC.Chat chat222 = rpVar.getMessagesController().getChat(Long.valueOf(j122));
                            rpVar.f = chat222;
                            if (ChatObject.isChannel(chat222) && !rpVar.f.megagroup) {
                                z162 = true;
                            }
                            rpVar.s = z162;
                            rpVar.h = poVar15.v0;
                            poVar15.presentFragment(rpVar);
                            break;
                        case 18:
                            po poVar16 = this.b;
                            aw0 aw0Var = new aw0(poVar16.t0);
                            aw0Var.v = new io(poVar16, 4);
                            poVar16.presentFragment(aw0Var);
                            break;
                        case 19:
                            po.Z(this.b);
                            break;
                        case 20:
                            po poVar17 = this.b;
                            n60 n60Var = new n60(-poVar17.u0.id);
                            n60Var.c = poVar17.I0;
                            n60Var.i0 = poVar17;
                            poVar17.presentFragment(n60Var);
                            break;
                        case 21:
                            po poVar18 = this.b;
                            poVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", poVar18.t0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((poVar18.F0 || poVar18.u0.gigagroup) && !ChatObject.isCommunity(poVar18.u0)) ? 0 : 3);
                            qr qrVar3 = new qr(bundle4);
                            qrVar3.x0(poVar18.v0);
                            poVar18.presentFragment(qrVar3);
                            break;
                        case 22:
                            po poVar19 = this.b;
                            qh0 qh0Var = new qh0(poVar19.t0, 0L, 0);
                            TLRPC.ChatFull chatFull7 = poVar19.v0;
                            qh0Var.g0(chatFull7, chatFull7.exported_invite);
                            poVar19.presentFragment(qh0Var);
                            break;
                        case 23:
                            po poVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(poVar20.u0)) {
                                poVar20.presentFragment(new ng.s(poVar20.t0, poVar20.v0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", poVar20.t0);
                                yp ypVar = new yp(bundle5);
                                ypVar.d = new ArrayList();
                                ypVar.r = new ArrayList();
                                ypVar.v = -1;
                                ypVar.C = new ArrayList();
                                long j132 = bundle5.getLong("chat_id", 0L);
                                ypVar.c = j132;
                                TLRPC.ChatFull chatFull8 = poVar20.v0;
                                ypVar.b = chatFull8;
                                if (chatFull8 != null) {
                                    if (ypVar.a == null) {
                                        ypVar.a = ypVar.getMessagesController().getChat(Long.valueOf(j132));
                                    }
                                    ypVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull8.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        ypVar.w = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        ypVar.w = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                ypVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        ypVar.w = 1;
                                    }
                                }
                                poVar20.presentFragment(ypVar);
                                break;
                            }
                        default:
                            po poVar21 = this.b;
                            poVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", poVar21.t0);
                            bundle6.putLong("welcome_messages_chat_id", poVar21.t0);
                            poVar21.presentFragment(new xn(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(context2);
            poVar2.b0 = z6Var2;
            s3Var.addView(z6Var2, k7.c6.n(-1, -2));
        }
        UndoView undoView = new UndoView(context2);
        poVar2.c = undoView;
        jdVar.addView(undoView, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.fu fuVar6 = poVar2.v;
        TLRPC.User user3 = poVar2.A0;
        fuVar6.setText(Emoji.replaceEmoji(user3 != null ? ContactsController.formatName(user3) : poVar2.u0.title, poVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.fu fuVar7 = poVar2.v;
        fuVar7.setSelection(fuVar7.n());
        TLRPC.ChatFull chatFull4 = poVar2.v0;
        if (chatFull4 != null) {
            poVar2.B.setText(chatFull4.about);
        } else {
            TLRPC.UserFull userFull4 = poVar2.B0;
            if (userFull4 != null) {
                poVar2.B.setText(userFull4.about);
            }
        }
        poVar2.k0();
        poVar2.p0(true, false);
        return poVar2.fragmentView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (java.lang.Math.max(r12 == null ? 0 : r12.participants_count, r11.u0.participants_count) >= getMessagesController().forumUpgradeParticipantsMin) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2;
        boolean z4;
        org.telegram.ui.Cells.o8 o8Var;
        EditTextBoldCursor editTextBoldCursor;
        int i12 = NotificationCenter.chatInfoDidLoad;
        boolean z10 = true;
        long j10 = this.z0;
        int i13 = 0;
        if (i10 == i12) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (chatFull.id == this.t0) {
                if (this.v0 == null && (editTextBoldCursor = this.B) != null) {
                    editTextBoldCursor.setText(chatFull.about);
                }
                boolean z11 = this.v0 == null;
                this.v0 = chatFull;
                f0();
                if (j10 != 0) {
                    this.D0 = false;
                } else {
                    if (!this.C0) {
                        TLRPC.ChatFull chatFull2 = this.v0;
                    }
                    TLRPC.ChatFull chatFull3 = this.v0;
                    if (chatFull3 == null || chatFull3.linked_chat_id == 0) {
                        z4 = true;
                        this.D0 = z4;
                        o8Var = this.N;
                        if (o8Var != null) {
                            o8Var.getCheckBox().setIcon(this.D0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z4 = false;
                    this.D0 = z4;
                    o8Var = this.N;
                    if (o8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.u0) && !this.v0.hidden_prehistory) {
                    z10 = false;
                }
                this.G0 = z10;
                p0(false, false);
                if (z11) {
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
            if (this.t0 != longValue) {
                return;
            }
            this.C0 = booleanValue;
            this.E0 = booleanValue2;
            org.telegram.ui.Cells.o8 o8Var2 = this.N;
            if (o8Var2 != null) {
                o8Var2.setChecked(booleanValue);
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
            if (chat == null || chat.id != this.t0) {
                return;
            }
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.w0;
            if ((tL_chatAdminRights == null || tL_chatAdminRights.equals(chat.admin_rights)) && (((tL_chatBannedRights = this.x0) == null || tL_chatBannedRights.equals(chat.banned_rights)) && ((tL_chatBannedRights2 = this.y0) == null || tL_chatBannedRights2.equals(chat.default_banned_rights)))) {
                return;
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var == null || f5Var.getLastFragment() != this) {
                removeSelfFromStack();
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (i10 == NotificationCenter.chatAvailableReactionsUpdated) {
            long longValue2 = ((Long) objArr[0]).longValue();
            if (longValue2 == this.t0) {
                TLRPC.ChatFull chatFull4 = getMessagesController().getChatFull(longValue2);
                this.v0 = chatFull4;
                if (chatFull4 != null) {
                    this.H0 = chatFull4.available_reactions;
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
                if (i10 == NotificationCenter.dialogDeleted && (-this.t0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.f5 f5Var2 = this.parentLayout;
                    if (f5Var2 == null || f5Var2.getLastFragment() != this) {
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
            if (this.k0 != null) {
                mh.a0 g10 = mh.a0.g(this.currentAccount);
                this.k0.setVisibility(g10.a(j10) ? 0 : 8);
                this.k0.u(mh.ja.X0(false, TextUtils.concat("XTR", mh.ja.J0(g10.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.o8 o8Var3 = this.i0;
                if (o8Var3 != null) {
                    o8Var3.setNeedDivider(g10.a(j10) || g10.b(j10));
                }
                this.P.setVisibility((this.k0.getVisibility() == 0 || this.j0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.j0 != null) {
                mh.a0 g11 = mh.a0.g(this.currentAccount);
                this.j0.setVisibility(g11.b(j10) ? 0 : 8);
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
                this.j0.u(spannableStringBuilder, true);
                org.telegram.ui.Cells.o8 o8Var4 = this.i0;
                if (o8Var4 != null) {
                    if (!g11.a(j10) && !g11.b(j10)) {
                        z10 = false;
                    }
                    o8Var4.setNeedDivider(z10);
                }
                LinearLayout linearLayout = this.P;
                if (this.k0.getVisibility() != 0 && this.j0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void dismissCurrentDialog() {
        if (this.s.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean e0(boolean z4) {
        org.telegram.ui.Components.fu fuVar;
        EditTextBoldCursor editTextBoldCursor;
        String str;
        EditTextBoldCursor editTextBoldCursor2;
        String str2;
        String str3 = "";
        if (this.z0 != 0) {
            TLRPC.UserFull userFull = this.B0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            org.telegram.ui.Components.fu fuVar2 = this.v;
            if ((fuVar2 == null || this.A0.first_name.equals(fuVar2.getText().toString())) && ((editTextBoldCursor2 = this.B) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.Q = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new io(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new io(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.v0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.u0) || this.v0.hidden_prehistory == this.G0) && (((fuVar = this.v) == null || this.u0.title.equals(fuVar.getText().toString())) && (((editTextBoldCursor = this.B) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.C0 == this.u0.forum))) {
                return true;
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder2.a.O = LocaleController.getString("UserRestrictionsApplyChanges", R.string.UserRestrictionsApplyChanges);
                if (this.F0) {
                    alertDialog$Builder2.a.Q = LocaleController.getString("ChannelSettingsChangedAlert", R.string.ChannelSettingsChangedAlert);
                } else {
                    alertDialog$Builder2.a.Q = LocaleController.getString("GroupSettingsChangedAlert", R.string.GroupSettingsChangedAlert);
                }
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new io(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new io(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    public final void f0() {
        if (this.c0 == null) {
            return;
        }
        String firstWelcomeMessageText = getMessagesController().getFirstWelcomeMessageText(-this.t0);
        TLRPC.ChatFull chatFull = this.v0;
        if (chatFull != null && !chatFull.has_welcome_messages && firstWelcomeMessageText == null) {
            firstWelcomeMessageText = LocaleController.getString(R.string.WelcomeMessageOff);
        }
        this.c0.s(LocaleController.getString(R.string.WelcomeMessage), firstWelcomeMessageText, false, R.drawable.menu_welcome_messages, true);
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ lu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 5);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        oo ooVar = this.Y;
        int i10 = org.telegram.ui.ActionBar.k6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ooVar, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 4096, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.T, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.S, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.o8 o8Var = this.R;
        if (o8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(o8Var, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.R, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i13 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 4, null, null, null, null, i11));
        org.telegram.ui.Components.fu fuVar = this.v;
        int i14 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar, TLObject.FLAG_23, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.v, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, TLObject.FLAG_23, null, null, null, null, i14));
        LinearLayout linearLayout = this.d;
        int i15 = org.telegram.ui.ActionBar.k6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(linearLayout, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.y, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Z, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 1, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 1, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b0, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a0, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.a0, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 4, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
        int i17 = org.telegram.ui.ActionBar.k6.Gi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.k6.Hi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 4096, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.L, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        org.telegram.ui.Cells.o8 o8Var2 = this.H;
        if (o8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(o8Var2, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.H, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        org.telegram.ui.Cells.o8 o8Var3 = this.X;
        if (o8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(o8Var3, 4096, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.X, 4, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.X, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i12));
        }
        return arrayList;
    }

    public final void h0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.t0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ho(this, 0));
    }

    public final void i0() {
        this.s.o(this.s0 != null, new jo(this, 0), new v5(this, 5), 0);
        this.O0.K(0);
        this.O0.N(43);
        this.Y.e.d();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        org.telegram.ui.Components.fu fuVar;
        String str;
        String str2;
        if (this.K0 || (fuVar = this.v) == null) {
            return;
        }
        if (fuVar.a.length() == 0) {
            Vibrator vibrator = (Vibrator) getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.v);
            return;
        }
        this.K0 = true;
        int i10 = 0;
        int i11 = 3;
        String str3 = "";
        if (this.A0 != null) {
            TL_bots.setBotInfo setbotinfo = new TL_bots.setBotInfo();
            setbotinfo.bot = getMessagesController().getInputUser(this.A0);
            setbotinfo.flags |= 4;
            setbotinfo.lang_code = "";
            if (!this.A0.first_name.equals(this.v.getText().toString())) {
                setbotinfo.name = this.v.getText().toString();
                setbotinfo.flags |= 8;
            }
            TLRPC.UserFull userFull = this.B0;
            if (userFull != null && (str2 = userFull.about) != null) {
                str3 = str2;
            }
            EditTextBoldCursor editTextBoldCursor = this.B;
            if (editTextBoldCursor != null && !str3.equals(editTextBoldCursor.getText().toString())) {
                setbotinfo.about = this.B.getText().toString();
                setbotinfo.flags = 1 | setbotinfo.flags;
            }
            this.b = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new mh.v(this, getConnectionsManager().sendRequest(setbotinfo, new lo(i10, this, setbotinfo)), i11));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.u0) && (!this.G0 || this.C0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.t0, this, new io(this, 5));
            return;
        }
        if (this.v0 != null && ChatObject.isChannel(this.u0)) {
            TLRPC.ChatFull chatFull = this.v0;
            boolean z4 = chatFull.hidden_prehistory;
            boolean z10 = this.G0;
            if (z4 != z10) {
                chatFull.hidden_prehistory = z10;
                getMessagesController().toggleChannelInvitesHistory(this.t0, this.G0);
            }
        }
        if (this.s.h()) {
            this.J0 = true;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, null);
            this.b = d2Var;
            d2Var.setOnCancelListener(new ig(this, r0));
            this.b.show();
            return;
        }
        if (!this.u0.title.equals(this.v.getText().toString())) {
            getMessagesController().changeChatTitle(this.t0, this.v.getText().toString());
        }
        TLRPC.ChatFull chatFull2 = this.v0;
        if (chatFull2 != null && (str = chatFull2.about) != null) {
            str3 = str;
        }
        EditTextBoldCursor editTextBoldCursor2 = this.B;
        if (editTextBoldCursor2 != null && !str3.equals(editTextBoldCursor2.getText().toString())) {
            getMessagesController().updateChatAbout(this.t0, this.B.getText().toString(), this.v0);
        }
        boolean z11 = this.C0;
        TLRPC.Chat chat = this.u0;
        if (z11 != chat.forum || this.E0 != chat.forum_tabs) {
            r0 = this.E0 == chat.forum_tabs ? 0 : 1;
            getMessagesController().toggleChannelForum(this.t0, this.C0, this.E0);
            if (this.C0 && !this.E0) {
                List fragmentStack = getParentLayout().getFragmentStack();
                while (i10 < fragmentStack.size()) {
                    if ((fragmentStack.get(i10) instanceof xn) && ((xn) fragmentStack.get(i10)).getArguments().getLong("chat_id") == this.t0) {
                        ((ActionBarLayout) getParentLayout()).Y(i10);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.t0);
                        org.telegram.ui.ActionBar.f5 parentLayout = getParentLayout();
                        HashSet hashSet = mf1.k1;
                        ((ActionBarLayout) parentLayout).c(i10, mf1.E0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                    i10++;
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
        boolean z4;
        if (this.e == null || this.L0) {
            return;
        }
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.t0));
        long j10 = this.z0;
        TLRPC.User user = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
        if (chat == null && user == null) {
            return;
        }
        this.A0 = user;
        this.u0 = chat;
        org.telegram.ui.Components.z8 z8Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(z8Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.s0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.e(chat2, z8Var);
            if (forUserOrChat != null) {
                z4 = true;
                if (this.Y != null) {
                    if (z4 || this.s.h()) {
                        this.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.Y.m(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.O0 == null) {
                        this.O0 = new org.telegram.ui.Components.ij0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
                    }
                    this.Y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
                    this.Y.e.setAnimation(this.O0);
                }
                if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
                    PhotoViewer.t1().y0();
                }
                if (this.W == null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.u0)) {
                    this.W.setVisibility(0);
                    return;
                }
                return;
            }
        }
        z4 = false;
        if (this.Y != null) {
        }
        if (PhotoViewer.C1()) {
            PhotoViewer.t1().y0();
        }
        if (this.W == null) {
        }
    }

    public final void l0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.l5 n10;
        this.v0 = chatFull;
        if (chatFull != null) {
            if (this.u0 == null) {
                this.u0 = getMessagesController().getChat(Long.valueOf(this.t0));
            }
            this.G0 = !ChatObject.isChannel(this.u0) || this.v0.hidden_prehistory;
            this.H0 = this.v0.available_reactions;
            ArrayList arrayList = this.M0;
            arrayList.clear();
            TLRPC.Chat chat = this.u0;
            TLRPC.ChatFull chatFull2 = this.v0;
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
                                n10 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, org.telegram.ui.Components.l5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.l5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.l5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.l5 m9 = org.telegram.ui.Components.l5.m(UserConfig.selectedAccount, org.telegram.ui.Components.l5.g(), tL_availableReaction2.activate_animation);
                            arrayList2.add(m9);
                            m9.b(null);
                        }
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (this.W != null && getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(this.u0)) {
                this.W.setVisibility(0);
            }
        }
        f0();
    }

    public final void m0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.B0 = userFull;
        if (userFull != null) {
            if (this.A0 == null) {
                long j10 = this.z0;
                this.A0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.o8 o8Var = this.l0;
            if (o8Var != null) {
                o8Var.f(45, this.B0 == null, true);
                TLRPC.UserFull userFull2 = this.B0;
                if (userFull2 != null) {
                    this.l0.u(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.o8 o8Var2 = this.r0;
            if (o8Var2 != null) {
                TLRPC.UserFull userFull3 = this.B0;
                o8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.a9 a9Var = this.q0;
            if (a9Var != null) {
                TLRPC.UserFull userFull4 = this.B0;
                a9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void n0(boolean z4, boolean z10) {
        if (this.n == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (!z10) {
            if (z4) {
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
        if (z4) {
            this.n.setVisibility(0);
            this.f.setVisibility(0);
            AnimatorSet animatorSet3 = this.h;
            RadialProgressView radialProgressView = this.n;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<fg.i0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<fg.i0, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new eg.u2(19, this, z4));
        this.h.start();
    }

    public final void o0() {
        org.telegram.ui.Cells.o8 o8Var;
        org.telegram.ui.Cells.o8 o8Var2;
        ep0 ep0Var;
        int v02;
        ArrayList<Integer> arrayList;
        qo0 qo0Var = this.I;
        if (qo0Var != null) {
            TLRPC.Chat chat = this.u0;
            org.telegram.ui.Cells.o8 o8Var3 = this.K;
            boolean z4 = (o8Var3 != null && o8Var3.getVisibility() == 0) || ((o8Var = this.N) != null && o8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.u0) && ChatObject.hasAdminRights(this.u0)) || ((o8Var2 = this.J) != null && o8Var2.getVisibility() == 0));
            Paint paint = qo0Var.n;
            int i10 = qo0Var.a;
            org.telegram.ui.ActionBar.g6 g6Var = qo0Var.d;
            if (chat == null) {
                return;
            }
            qo0Var.v = z4;
            qo0Var.r = new org.telegram.ui.Components.l01(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            ep0 ep0Var2 = qo0Var.w;
            if (ep0Var2 != null) {
                ep0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = ep0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                qo0Var.w = new ep0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    ep0Var = ep0.c(i10, ChatObject.getProfileColorId(chat));
                    ep0Var.a = AndroidUtilities.dp(11.0f);
                    ep0Var.d();
                } else {
                    ep0Var = null;
                }
                qo0Var.w = ep0Var;
            }
            ep0 ep0Var3 = qo0Var.w;
            if (ep0Var3 != null) {
                ep0Var3.e(qo0Var);
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
                paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, i13));
                ep0 ep0Var4 = new ep0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                ep0Var4.a = AndroidUtilities.dp(11.0f);
                ep0Var4.d();
                qo0Var.x = ep0Var4;
                ep0Var4.e(qo0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.k6.r8[colorId];
                qo0Var.s = i14;
                v02 = org.telegram.ui.ActionBar.k6.v0(i14, g6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    qo0Var.s = -1;
                    v02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.k6.r8[0];
                    qo0Var.s = i15;
                    v02 = org.telegram.ui.ActionBar.k6.v0(i15, g6Var);
                }
            }
            qo0Var.r.o(v02);
            paint.setColor(org.telegram.ui.ActionBar.k6.l1(0.1f, v02));
            ep0 a10 = ep0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            qo0Var.x = a10;
            a10.e(qo0Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.i(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar == null || !fuVar.e) {
            return e0(z4);
        }
        if (!z4) {
            return false;
        }
        fuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
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
    @Override // org.telegram.ui.ActionBar.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onFragmentCreate() {
        TLRPC.Chat chat;
        long j10 = this.t0;
        long j11 = this.z0;
        boolean z4 = true;
        if (j10 == 0) {
            TLRPC.User user = j11 == 0 ? null : getMessagesController().getUser(Long.valueOf(j11));
            this.A0 = user;
            if (user == null) {
                TLRPC.User userSync = MessagesStorage.getInstance(this.currentAccount).getUserSync(j11);
                this.A0 = userSync;
                if (userSync != null) {
                    getMessagesController().putUser(this.A0, true);
                    if (this.B0 == null) {
                        HashSet<Long> hashSet = new HashSet<>();
                        hashSet.add(Long.valueOf(j11));
                        ArrayList<TLRPC.UserFull> loadUserInfos = MessagesStorage.getInstance(this.currentAccount).loadUserInfos(hashSet);
                        if (!loadUserInfos.isEmpty()) {
                            this.B0 = loadUserInfos.get(0);
                        }
                    }
                }
                return false;
            }
            chat = this.u0;
            org.telegram.ui.Components.z8 z8Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.y40 y40Var = this.s;
            y40Var.a = this;
            y40Var.b = this;
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
            getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
            if (this.v0 != null) {
            }
            return super.onFragmentCreate();
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.t0));
        this.u0 = chat2;
        if (chat2 == null) {
            TLRPC.Chat chatSync = MessagesStorage.getInstance(this.currentAccount).getChatSync(this.t0);
            this.u0 = chatSync;
            if (chatSync != null) {
                getMessagesController().putChat(this.u0, true);
                if (this.v0 == null) {
                    TLRPC.ChatFull loadChatInfo = MessagesStorage.getInstance(this.currentAccount).loadChatInfo(this.t0, ChatObject.isChannel(this.u0), new CountDownLatch(1), false, false);
                    this.v0 = loadChatInfo;
                }
            }
            return false;
        }
        chat = this.u0;
        org.telegram.ui.Components.z8 z8Var2 = this.r;
        if (chat == null) {
            this.w0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.x0 = TLRPC.TL_chatBannedRights.clone(this.u0.banned_rights);
            this.y0 = TLRPC.TL_chatBannedRights.clone(this.u0.default_banned_rights);
            z8Var2.n(5L, this.u0.title, null);
            this.F0 = ChatObject.isChannel(this.u0) && !this.u0.megagroup;
            TLRPC.Chat chat3 = this.u0;
            boolean z10 = chat3.forum;
            this.C0 = z10;
            this.E0 = chat3.forum_tabs;
            if (j11 == 0) {
                if (!z10) {
                    TLRPC.ChatFull chatFull = this.v0;
                }
                TLRPC.ChatFull chatFull2 = this.v0;
                if (chatFull2 != null) {
                }
                this.D0 = z4;
                getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
                getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
                getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
            }
            z4 = false;
            this.D0 = z4;
            getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().addObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            z8Var2.n(5L, this.A0.first_name, null);
            this.F0 = false;
            this.C0 = false;
            this.E0 = false;
            this.D0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.A0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.y40 y40Var2 = this.s;
        y40Var2.a = this;
        y40Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.v0 != null) {
            h0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.y40 y40Var = this.s;
        if (y40Var != null) {
            y40Var.e();
        }
        if (this.u0 != null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatSwitchedForum);
            getNotificationCenter().removeObserver(this, NotificationCenter.chatAvailableReactionsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.channelConnectedBotsUpdate);
        } else {
            getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.A0.bot) {
                getNotificationCenter().removeObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.channelRightsUpdated);
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        eg.s3 s3Var = this.w;
        if (s3Var != null) {
            s3Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + i13);
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.M0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.l5) obj).p(null);
        }
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.e(0, true);
        }
        this.s.j();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.k(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            fuVar.s();
            this.v.getEditText().requestFocus();
        }
        o0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        p0(true, true);
        this.s.l();
    }

    public final void p0(boolean z4, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        TLRPC.ChatFull chatFull;
        int i14;
        String str2;
        String string;
        org.telegram.ui.Cells.o8 o8Var;
        org.telegram.ui.Cells.o8 o8Var2;
        org.telegram.ui.Cells.o8 o8Var3;
        org.telegram.ui.Cells.o8 o8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.o8 o8Var5;
        org.telegram.ui.Cells.o8 o8Var6;
        org.telegram.ui.Cells.o8 o8Var7;
        org.telegram.ui.Cells.o8 o8Var8;
        org.telegram.ui.Cells.o8 o8Var9;
        TLRPC.Chat chat;
        if (z4 && (chat = getMessagesController().getChat(Long.valueOf(this.t0))) != null) {
            this.u0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.u0);
        org.telegram.ui.Cells.a9 a9Var = this.M;
        if (a9Var != null) {
            a9Var.setVisibility((this.F != null || ((o8Var7 = this.G) != null && o8Var7.getVisibility() == 0) || (((o8Var8 = this.K) != null && o8Var8.getVisibility() == 0) || ((o8Var9 = this.E) != null && o8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.o8 o8Var10 = this.V;
        if (o8Var10 != null) {
            o8Var10.setVisibility(ChatObject.isChannel(this.u0) ? 0 : 8);
        }
        org.telegram.ui.Cells.o8 o8Var11 = this.G;
        if (o8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.v0;
            if (chatFull2 == null || (!this.F0 && chatFull2.linked_chat_id == 0)) {
                o8Var11.setVisibility(8);
            } else {
                o8Var11.setVisibility(0);
                if (this.v0.linked_chat_id == 0) {
                    this.G.s(LocaleController.getString("Discussion", R.string.Discussion), LocaleController.getString("DiscussionInfoShort", R.string.DiscussionInfoShort), false, R.drawable.msg_discuss, true);
                } else {
                    TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.v0.linked_chat_id));
                    if (chat2 == null) {
                        this.G.setVisibility(8);
                    } else if (this.F0) {
                        String publicUsername = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername)) {
                            this.G.s(LocaleController.getString("Discussion", R.string.Discussion), chat2.title, false, R.drawable.msg_discuss, true);
                        } else {
                            this.G.s(LocaleController.getString("Discussion", R.string.Discussion), yh.k("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.o8 o8Var12 = this.G;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.o8 o8Var13 = this.N;
                            o8Var12.s(string2, str4, false, i16, o8Var13 != null && o8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.o8 o8Var14 = this.G;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String k10 = yh.k("@", publicUsername2);
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.o8 o8Var15 = this.N;
                            o8Var14.s(string3, k10, false, i17, o8Var15 != null && o8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.o8 o8Var16 = this.E;
        if (o8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.v0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                o8Var16.setVisibility(8);
            } else {
                o8Var16.setVisibility(0);
                TLRPC.ChannelLocation channelLocation = this.v0.location;
                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                    this.E.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), ((TLRPC.TL_channelLocation) channelLocation).address, z10, true);
                } else {
                    this.E.o(LocaleController.getString("AttachLocation", R.string.AttachLocation), "Unknown address", z10, true);
                }
            }
        }
        if (this.F != null) {
            TLRPC.ChatFull chatFull4 = this.v0;
            if (chatFull4 == null || !(chatFull4.location instanceof TLRPC.TL_channelLocation)) {
                boolean z12 = this.u0.noforwards;
                if (this.F0) {
                    if (isPublic) {
                        i15 = R.string.TypePublic;
                        str3 = "TypePublic";
                    } else if (z12) {
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
                    } else if (z12) {
                        i14 = R.string.TypePrivateGroupRestrictedForwards;
                        str2 = "TypePrivateGroupRestrictedForwards";
                    } else {
                        i14 = R.string.TypePrivateGroup;
                        str2 = "TypePrivateGroup";
                    }
                    string = LocaleController.getString(str2, i14);
                }
                String str5 = string;
                if (this.F0) {
                    org.telegram.ui.Cells.o8 o8Var17 = this.F;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i18 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.o8 o8Var18 = this.K;
                    o8Var17.s(string4, str5, false, i18, (o8Var18 != null && o8Var18.getVisibility() == 0) || ((o8Var3 = this.G) != null && o8Var3.getVisibility() == 0) || ((o8Var4 = this.N) != null && o8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.o8 o8Var19 = this.F;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i19 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.o8 o8Var20 = this.K;
                    o8Var19.s(string5, str5, false, i19, (o8Var20 != null && o8Var20.getVisibility() == 0) || ((o8Var = this.G) != null && o8Var.getVisibility() == 0) || ((o8Var2 = this.N) != null && o8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(android.support.v4.media.a.r(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.u0));
                org.telegram.ui.Cells.o8 o8Var21 = this.F;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i20 = R.drawable.msg_channel;
                org.telegram.ui.Cells.o8 o8Var22 = this.K;
                o8Var21.s(string7, string6, false, i20, (o8Var22 != null && o8Var22.getVisibility() == 0) || ((o8Var5 = this.G) != null && o8Var5.getVisibility() == 0) || ((o8Var6 = this.N) != null && o8Var6.getVisibility() == 0));
            }
        }
        if (this.K != null) {
            if (!this.G0 || this.C0) {
                i13 = R.string.ChatHistoryVisible;
                str = "ChatHistoryVisible";
            } else {
                i13 = R.string.ChatHistoryHidden;
                str = "ChatHistoryHidden";
            }
            this.K.s(LocaleController.getString("ChatHistoryShort", R.string.ChatHistoryShort), LocaleController.getString(str, i13), z10, R.drawable.msg_discuss, this.N != null);
            this.K.setEnabled(!this.C0);
            boolean z13 = (this.C0 || isPublic || ((chatFull = this.v0) != null && chatFull.linked_chat_id != 0) || (chatFull != null && (chatFull.location instanceof TLRPC.TL_channelLocation))) ? false : true;
            ValueAnimator valueAnimator = this.P0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.K.getAlpha() <= 0.0f && !z13) {
                this.K.setVisibility(8);
                o0();
            } else if (this.K.getVisibility() != 0 || this.K.getAlpha() < 1.0f || !z13) {
                ArrayList arrayList = new ArrayList();
                boolean z14 = false;
                for (int i21 = 0; i21 < this.C.getChildCount(); i21++) {
                    if (!z14 && this.C.getChildAt(i21) == this.K) {
                        z14 = true;
                    } else if (z14) {
                        arrayList.add(this.C.getChildAt(i21));
                    }
                }
                boolean z15 = false;
                for (int i22 = 0; i22 < this.w.getChildCount(); i22++) {
                    if (!z15 && this.w.getChildAt(i22) == this.C) {
                        z15 = true;
                    } else if (z15) {
                        arrayList.add(this.w.getChildAt(i22));
                    }
                }
                if (this.K.getVisibility() != 0) {
                    this.K.setAlpha(0.0f);
                    this.K.setTranslationY((-r5.getHeight()) / 2.0f);
                }
                this.K.setVisibility(0);
                for (int i23 = 0; i23 < arrayList.size(); i23++) {
                    ((View) arrayList.get(i23)).setTranslationY((1.0f - this.K.getAlpha()) * (-this.K.getHeight()));
                }
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K.getAlpha(), z13 ? 1.0f : 0.0f);
                    this.P0 = ofFloat;
                    ofFloat.addUpdateListener(new bg.a(9, this, arrayList));
                    this.P0.addListener(new androidx.fragment.app.g(this, z13, arrayList, 5));
                    this.P0.setDuration(320L);
                    this.P0.setInterpolator(org.telegram.ui.Components.pr.h);
                    this.P0.start();
                } else {
                    this.K.setAlpha(z13 ? 1.0f : 0.0f);
                    this.K.setTranslationY(((-r5.getHeight()) / 2.0f) * (z13 ? 0.0f : 1.0f));
                    this.K.setScaleY(((z13 ? 1.0f : 0.0f) * 0.8f) + 0.2f);
                    this.K.setVisibility(z13 ? 0 : 8);
                    for (int i24 = 0; i24 < arrayList.size(); i24++) {
                        ((View) arrayList.get(i24)).setTranslationY(0.0f);
                    }
                    this.P0 = null;
                }
            }
        }
        if (this.Q != null) {
            if (this.v0 != null) {
                org.telegram.ui.Cells.o8 o8Var23 = this.R;
                if (o8Var23 != null) {
                    if (o8Var23.getParent() == null) {
                        this.O.addView(this.R, this.O.indexOfChild(this.Q) + 1, k7.c6.n(-1, -2));
                    }
                    this.R.setVisibility(this.v0.requests_pending > 0 ? 0 : 8);
                }
                if (!this.F0 || ChatObject.isCommunity(this.u0)) {
                    if (ChatObject.isChannel(this.u0)) {
                        this.Q.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.v0.participants_count)), false, R.drawable.msg_groups, true);
                    } else {
                        this.Q.s(LocaleController.getString("ChannelMembers", R.string.ChannelMembers), String.format("%d", Integer.valueOf(this.v0.participants.participants.size())), false, R.drawable.msg_groups, this.R.getVisibility() == 0);
                    }
                    TLRPC.Chat chat3 = this.u0;
                    if (!chat3.gigagroup || ChatObject.isCommunity(chat3)) {
                        int i25 = this.C0 ? 16 : 15;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.u0.default_banned_rights;
                        if (tL_chatBannedRights != null) {
                            int i26 = !tL_chatBannedRights.send_plain ? 1 : 0;
                            if (!tL_chatBannedRights.edit_rank) {
                                i26++;
                            }
                            i10 = qr.n0(tL_chatBannedRights) + i26;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.u0.default_banned_rights;
                            if (!tL_chatBannedRights2.pin_messages) {
                                i10++;
                            }
                            if (!tL_chatBannedRights2.invite_users) {
                                i10++;
                            }
                            if (this.C0 && !tL_chatBannedRights2.manage_topics) {
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
                        z11 = z10;
                        this.U.s(LocaleController.getString(R.string.ChannelPermissions), String.format("%d/%d", Integer.valueOf(i10), Integer.valueOf(i11)), z11, R.drawable.msg_permissions, true);
                    } else {
                        org.telegram.ui.Cells.o8 o8Var24 = this.U;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.v0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i27 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.o8 o8Var25 = this.V;
                        o8Var24.s(string8, format, false, i27, o8Var25 != null && o8Var25.getVisibility() == 0);
                        z11 = z10;
                    }
                    org.telegram.ui.Cells.o8 o8Var26 = this.R;
                    if (o8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.v0.requests_pending));
                        int i28 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.o8 o8Var27 = this.V;
                        o8Var26.s(string9, format2, false, i28, o8Var27 != null && o8Var27.getVisibility() == 0);
                    }
                } else {
                    this.Q.s(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.v0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.o8 o8Var28 = this.U;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.v0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i29 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.o8 o8Var29 = this.V;
                    o8Var28.s(string10, format3, false, i29, o8Var29 != null && o8Var29.getVisibility() == 0);
                    z11 = z10;
                }
                org.telegram.ui.Cells.o8 o8Var30 = this.T;
                String string11 = LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators);
                if (ChatObject.isChannel(this.u0)) {
                    i12 = this.v0.admins_count;
                } else {
                    TLRPC.ChatFull chatFull7 = this.v0;
                    if (chatFull7 == null) {
                        i12 = 1;
                    } else {
                        int size = chatFull7.participants.participants.size();
                        int i30 = 0;
                        for (int i31 = 0; i31 < size; i31++) {
                            TLRPC.ChatParticipant chatParticipant = this.v0.participants.participants.get(i31);
                            if ((chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) || (chatParticipant instanceof TLRPC.TL_chatParticipantCreator)) {
                                i30++;
                            }
                        }
                        i12 = i30;
                    }
                }
                o8Var30.s(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z11 = z10;
                if (!this.F0 || ChatObject.isCommunity(this.u0)) {
                    org.telegram.ui.Cells.o8 o8Var31 = this.Q;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i32 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.o8 o8Var32 = this.V;
                    o8Var31.m(i32, string12, o8Var32 != null && o8Var32.getVisibility() == 0);
                    if (this.u0.gigagroup) {
                        org.telegram.ui.Cells.o8 o8Var33 = this.U;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i33 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.o8 o8Var34 = this.V;
                        o8Var33.m(i33, string13, o8Var34 != null && o8Var34.getVisibility() == 0);
                    } else {
                        this.U.m(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.Q.m(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.o8 o8Var35 = this.U;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i34 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.o8 o8Var36 = this.V;
                    o8Var35.m(i34, string14, o8Var36 != null && o8Var36.getVisibility() == 0);
                }
                this.T.m(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.L.setVisibility(ChatObject.canChangeChatInfo(this.u0) ? 0 : 8);
            s0(z11);
            if (this.v0 == null || !ChatObject.canUserDoAdminAction(this.u0, 3) || (isPublic && this.u0.creator)) {
                this.S.setVisibility(8);
            } else if (this.v0.invitesCount > 0) {
                this.S.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.v0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.S.s(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.H != null) {
            t0(null);
        }
    }

    public final void q0() {
        py pyVar;
        kx kxVar;
        if (getParentLayout() == null) {
            return;
        }
        List fragmentStack = getParentLayout().getFragmentStack();
        int i10 = 0;
        while (i10 < fragmentStack.size()) {
            if (fragmentStack.get(i10) instanceof xn) {
                xn xnVar = (xn) fragmentStack.get(i10);
                if (xnVar.getArguments().getLong("chat_id") == this.t0) {
                    ((ActionBarLayout) getParentLayout()).a0(xnVar, false);
                    xnVar.clearViews();
                    ((ActionBarLayout) getParentLayout()).c(i10, xnVar);
                    if (!this.E0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.t0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new mf1(bundle));
                        i10++;
                    }
                }
            } else if (this.E0 && (fragmentStack.get(i10) instanceof mf1)) {
                mf1 mf1Var = (mf1) fragmentStack.get(i10);
                if (mf1Var.g() != null && mf1Var.g().id == this.t0) {
                    ((ActionBarLayout) getParentLayout()).a0(mf1Var, false);
                    i10--;
                }
            } else if (this.E0 && (fragmentStack.get(i10) instanceof py) && (pyVar = (py) fragmentStack.get(i10)) != null && (kxVar = pyVar.C3) != null && kxVar.c()) {
                pyVar.C3.a();
            }
            i10++;
        }
    }

    public final void r0() {
        if (this.i0 == null) {
            return;
        }
        if (this.A0.usernames.size() <= 1) {
            this.i0.s(LocaleController.getString(R.string.BotPublicLink), "t.me/" + this.A0.username, false, R.drawable.msg_link2, true);
            return;
        }
        ArrayList<TLRPC.TL_username> arrayList = this.A0.usernames;
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
        this.i0.s(LocaleController.getString(R.string.BotPublicLinks), LocaleController.formatString(R.string.BotPublicLinksCount, Integer.valueOf(i10), Integer.valueOf(this.A0.usernames.size())), false, R.drawable.msg_link2, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.y40 y40Var = this.s;
        if (y40Var != null) {
            y40Var.f = bundle.getString("path");
        }
    }

    public final void s0(boolean z4) {
        String str;
        String str2;
        int i10;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.t0);
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(this.u0);
        TLRPC.ChatReactions chatReactions = this.H0;
        if (chatReactions == null || (chatReactions instanceof TLRPC.TL_chatReactionsNone)) {
            String string = LocaleController.getString(R.string.ReactionsOff);
            if (chatFull == null || !chatFull.paid_reactions_available) {
                str = string;
                this.L.s(LocaleController.getString(R.string.Reactions), str, z4, R.drawable.msg_reactions2, true);
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
        this.L.s(LocaleController.getString(R.string.Reactions), str, z4, R.drawable.msg_reactions2, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.y40 y40Var = this.s;
        if (y40Var != null && (str = y40Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.fu fuVar = this.v;
        if (fuVar != null) {
            String obj = fuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(Long l10) {
        TLRPC.Chat chat = this.u0;
        if (chat == null || this.H == null) {
            return;
        }
        long j10 = 0;
        if (!(l10 != null ? l10.longValue() >= 0 : chat.broadcast_messages_allowed)) {
            this.H.s(LocaleController.getString(R.string.PostSuggestions), LocaleController.getString(R.string.PostSuggestionsOff), false, R.drawable.msg_markunread, true);
            return;
        }
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.u0.linked_monoforum_id));
        if (l10 != null) {
            j10 = l10.longValue();
        } else if (chat2 != null) {
            j10 = chat2.send_paid_messages_stars;
        }
        this.H.s(LocaleController.getString(R.string.PostSuggestions), mh.ja.X0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ void P() {
    }
}
