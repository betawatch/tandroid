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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class mo extends org.telegram.ui.ActionBar.r2 implements org.telegram.ui.Components.f50, NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_chatBannedRights A0;
    public final long B0;
    public TLRPC.User C0;
    public TLRPC.UserFull D0;
    public EditTextBoldCursor E;
    public boolean E0;
    public LinearLayout F;
    public boolean F0;
    public org.telegram.ui.Cells.f7 G;
    public boolean G0;
    public org.telegram.ui.Cells.v8 H;
    public boolean H0;
    public org.telegram.ui.Cells.v8 I;
    public boolean I0;
    public org.telegram.ui.Cells.v8 J;
    public TLRPC.ChatReactions J0;
    public org.telegram.ui.Cells.v8 K;
    public TL_stories.TL_premium_boostsStatus K0;
    public wo0 L;
    public boolean L0;
    public org.telegram.ui.Cells.v8 M;
    public boolean M0;
    public org.telegram.ui.Cells.v8 N;
    public boolean N0;
    public org.telegram.ui.Cells.v8 O;
    public final ArrayList O0;
    public org.telegram.ui.Cells.i9 P;
    public final ko P0;
    public org.telegram.ui.Cells.v8 Q;
    public org.telegram.ui.Components.xj0 Q0;
    public LinearLayout R;
    public ValueAnimator R0;
    public LinearLayout S;
    public org.telegram.ui.Cells.v8 T;
    public org.telegram.ui.Cells.v8 U;
    public org.telegram.ui.Cells.v8 V;
    public org.telegram.ui.Cells.v8 W;
    public org.telegram.ui.Cells.v8 X;
    public org.telegram.ui.Cells.v8 Y;
    public org.telegram.ui.Cells.v8 Z;
    public org.telegram.ui.ActionBar.u5 a;
    public org.telegram.ui.Cells.v8 a0;
    public org.telegram.ui.ActionBar.e2 b;
    public lo b0;
    public UndoView c;
    public FrameLayout c0;
    public LinearLayout d;
    public org.telegram.ui.Cells.ga d0;
    public di.k4 e;
    public org.telegram.ui.Cells.v8 e0;
    public fi.f6 f;
    public org.telegram.ui.Cells.v8 f0;
    public ji.b g0;
    public AnimatorSet h;
    public org.telegram.ui.Cells.i9 h0;
    public org.telegram.ui.Cells.v8 i0;
    public org.telegram.ui.Cells.i9 j0;
    public org.telegram.ui.Cells.v8 k0;
    public org.telegram.ui.Cells.v8 l0;
    public org.telegram.ui.Cells.v8 m0;
    public RadialProgressView n;
    public org.telegram.ui.Cells.v8 n0;
    public org.telegram.ui.Cells.v8 o0;
    public org.telegram.ui.Cells.v8 p0;
    public org.telegram.ui.Cells.v8 q0;
    public final org.telegram.ui.Components.j9 r;
    public org.telegram.ui.Cells.i9 r0;
    public final org.telegram.ui.Components.g50 s;
    public org.telegram.ui.Cells.i9 s0;
    public org.telegram.ui.Cells.v8 t0;
    public TLRPC.FileLocation u0;
    public org.telegram.ui.Components.ru v;
    public long v0;
    public org.telegram.ui.Components.fp0 w;
    public TLRPC.Chat w0;
    public org.telegram.ui.Components.gp0 x;
    public TLRPC.ChatFull x0;
    public LinearLayout y;
    public TLRPC.TL_chatAdminRights y0;
    public TLRPC.TL_chatBannedRights z0;

    public mo(Bundle bundle) {
        super(bundle);
        this.O0 = new ArrayList();
        this.P0 = new ko(this);
        this.r = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.v0 = bundle.getLong("chat_id", 0L);
        this.B0 = bundle.getLong("user_id", 0L);
        if (this.v0 == 0) {
            this.s = new org.telegram.ui.Components.g50(0, false, false);
        } else {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.v0));
            this.s = new org.telegram.ui.Components.g50((chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) ? 2 : 1, true, true);
        }
    }

    public static void V(mo moVar, FrameLayout frameLayout, View view) {
        if (!moVar.F0) {
            TLRPC.ChatFull chatFull = moVar.x0;
            org.telegram.ui.Components.wc.b0(moVar).R(R.raw.topics, 36, (chatFull == null || chatFull.linked_chat_id == 0) ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelTopicsForbidden", moVar.getMessagesController().forumUpgradeParticipantsMin, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.getString("ChannelTopicsDiscussionForbidden", R.string.ChannelTopicsDiscussionForbidden))).j();
            try {
                frameLayout.performHapticFeedback(3);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long j10 = -moVar.v0;
        uy uyVar = new uy(null);
        uyVar.a = j10;
        uyVar.setResourceProvider(moVar.resourceProvider);
        boolean z10 = moVar.E0;
        boolean z11 = moVar.G0;
        bi.m5 m5Var = new bi.m5(12, moVar, view);
        uyVar.c = z10;
        uyVar.d = z11;
        uyVar.f = m5Var;
        moVar.presentFragment(uyVar);
    }

    public static /* synthetic */ void W(mo moVar) {
        moVar.u0 = null;
        long j10 = moVar.B0;
        if (j10 == 0) {
            MessagesController.getInstance(moVar.currentAccount).changeChatAvatar(moVar.v0, null, null, null, null, 0.0d, null, null, null, null);
        } else {
            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
            tL_photos_updateProfilePhoto.bot = moVar.getMessagesController().getInputUser(j10);
            tL_photos_updateProfilePhoto.flags |= 2;
            tL_photos_updateProfilePhoto.id = new TLRPC.TL_inputPhotoEmpty();
            moVar.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new eo(moVar, 2));
        }
        moVar.o0(false, true);
        di.k4 k4Var = moVar.e;
        org.telegram.ui.Components.j9 j9Var = moVar.r;
        Object obj = moVar.C0;
        if (obj == null) {
            obj = moVar.w0;
        }
        k4Var.h(null, null, j9Var, obj);
        moVar.Q0.M(0);
        moVar.b0.e.d();
    }

    public static void Y(mo moVar) {
        int i10 = moVar.currentAccount;
        long j10 = moVar.B0;
        TL_bots.BotVerifierSettings botVerifierSettings = moVar.D0.bot_info.verifier_settings;
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        Bundle c10 = org.telegram.messenger.vh.c(16, "onlySelect", "dialogsType", true);
        c10.putBoolean("resetDelegate", false);
        cy cyVar = new cy(c10);
        cyVar.setCurrentAccount(i10);
        cyVar.C2 = new hi.x1(cyVar, i10, j10, botVerifierSettings);
        U.presentFragment(cyVar);
    }

    public static void Z(mo moVar, org.telegram.ui.ActionBar.e2 e2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        e2Var.dismiss();
        if (moVar.getParentActivity() == null) {
            return;
        }
        tg.j0 j0Var = new tg.j0(35, moVar.currentAccount, moVar.getParentActivity(), moVar, moVar.getResourceProvider());
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        TLRPC.Chat chat = moVar.getMessagesController().getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new ed(22, moVar, chat);
        }
        moVar.showDialog(j0Var);
    }

    public static void a0(mo moVar) {
        bd bdVar = new bd(-moVar.w0.id);
        bdVar.l0 = moVar;
        moVar.presentFragment(bdVar);
        MessagesController.getInstance(moVar.currentAccount).getMainSettings().edit().putInt("boostingappearance", MessagesController.getInstance(moVar.currentAccount).getMainSettings().getInt("boostingappearance", 0) + 1).apply();
    }

    public static /* synthetic */ void b0(mo moVar) {
        moVar.N0 = true;
        NotificationCenter.getInstance(moVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static SpannableStringBuilder e0(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        m00 m00Var = new m00(10);
        m00Var.a.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
        m00Var.f = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lj, false);
        m00Var.n = false;
        spannableStringBuilder.setSpan(m00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    public static String h0(TLRPC.User user) {
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

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.n;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, photoSize2, inputFile, inputFile2, videoSize, photoSize, d, str));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0948  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09c4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x1001  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x1063  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x108f  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1068  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [org.telegram.ui.ActionBar.b7, org.telegram.ui.ActionBar.u6] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6, types: [boolean] */
    @Override // org.telegram.ui.ActionBar.r2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View createView(Context context) {
        ?? r21;
        int i10;
        Context context2;
        Integer num;
        final mo moVar;
        int i11;
        org.telegram.ui.ActionBar.b7 b7Var;
        int i12;
        Integer num2;
        boolean z10;
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        TLRPC.Chat chat;
        TLRPC.User user;
        final mo moVar2;
        ?? r11;
        TLRPC.Chat chat2;
        TLRPC.ChatFull chatFull;
        boolean z11;
        String format;
        int i13;
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        int i14;
        org.telegram.ui.Cells.v8 v8Var3;
        org.telegram.ui.Cells.v8 v8Var4;
        org.telegram.ui.Cells.v8 v8Var5;
        org.telegram.ui.Cells.v8 v8Var6;
        TLRPC.ChatFull chatFull2;
        int i15;
        Context context3;
        FrameLayout frameLayout;
        TLRPC.ChatFull chatFull3;
        TLRPC.ChatFull chatFull4;
        final int i16 = 1;
        setHasOwnBackground(true);
        org.telegram.ui.Components.ru ruVar = this.v;
        if (ruVar != null) {
            ruVar.o();
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 3));
        jd jdVar = new jd(i16, context, this);
        jdVar.setOnTouchListener(new ei.d(9));
        this.fragmentView = jdVar;
        org.telegram.ui.Components.fp0 fp0Var = new org.telegram.ui.Components.fp0(context);
        this.w = fp0Var;
        org.telegram.ui.Components.gp0 gp0Var = new org.telegram.ui.Components.gp0(context, this.w, this.resourceProvider, false);
        this.x = gp0Var;
        gp0Var.setFillViewport(true);
        this.x.setDrawBackground(true);
        jdVar.addView(this.x, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.x.addView(fp0Var, new FrameLayout.LayoutParams(-1, -2));
        fp0Var.setOrientation(1);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.ChannelEdit));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = this.d;
        int i17 = org.telegram.ui.ActionBar.y6.d6;
        org.telegram.ui.ActionBar.f7.i(i17, linearLayout2, null);
        fp0Var.addView(this.d, org.telegram.ui.Components.gb1.r(-1, -2));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d.addView(frameLayout2, org.telegram.ui.Components.gb1.r(-1, -2));
        int i18 = 6;
        di.k4 k4Var = new di.k4(this, context, i18);
        this.e = k4Var;
        k4Var.setRoundRadius(this.E0 ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(32.0f));
        if (this.C0 != null || ChatObject.canChangeChatInfo(this.w0)) {
            di.k4 k4Var2 = this.e;
            boolean z12 = LocaleController.isRTL;
            frameLayout2.addView(k4Var2, org.telegram.ui.Components.gb1.h(64, 64.0f, (z12 ? 5 : 3) | 48, z12 ? 0.0f : 16.0f, 12.0f, z12 ? 16.0f : 0.0f, 8.0f));
            Paint paint = new Paint(1);
            paint.setColor(1426063360);
            fi.f6 f6Var = new fi.f6(this, context, paint, i18);
            this.f = f6Var;
            boolean z13 = LocaleController.isRTL;
            frameLayout2.addView(f6Var, org.telegram.ui.Components.gb1.h(64, 64.0f, (z13 ? 5 : 3) | 48, z13 ? 0.0f : 16.0f, 12.0f, z13 ? 16.0f : 0.0f, 8.0f));
            RadialProgressView radialProgressView = new RadialProgressView(context);
            this.n = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.n.setProgressColor(-1);
            this.n.setNoProgress(false);
            RadialProgressView radialProgressView2 = this.n;
            boolean z14 = LocaleController.isRTL;
            frameLayout2.addView(radialProgressView2, org.telegram.ui.Components.gb1.h(64, 64.0f, (z14 ? 5 : 3) | 48, z14 ? 0.0f : 16.0f, 12.0f, z14 ? 16.0f : 0.0f, 8.0f));
            o0(false, false);
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j10 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j10 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j10));
                                if (user2 == null) {
                                    TLRPC.Chat chat3 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat3.photo;
                                        int i19 = chatPhoto2.dc_id;
                                        if (i19 != 0) {
                                            chatPhoto2.photo_big.dc_id = i19;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat3.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j11 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var7 = moVar14.H;
                            boolean z15 = v8Var7 != null && v8Var7.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j11;
                            apVar.n0 = z15;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z16 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat4 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !npVar.f.megagroup) {
                                z16 = true;
                            }
                            npVar.s = z16;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
        } else {
            di.k4 k4Var3 = this.e;
            boolean z15 = LocaleController.isRTL;
            frameLayout2.addView(k4Var3, org.telegram.ui.Components.gb1.h(64, 64.0f, (z15 ? 5 : 3) | 48, z15 ? 0.0f : 16.0f, 12.0f, z15 ? 16.0f : 0.0f, 12.0f));
        }
        org.telegram.ui.Components.ru ruVar2 = new org.telegram.ui.Components.ru(context, jdVar, this);
        this.v = ruVar2;
        long j10 = this.B0;
        if (j10 != 0) {
            ruVar2.setHint(LocaleController.getString(R.string.BotName));
            r21 = 0;
        } else if (this.H0) {
            r21 = 0;
            ruVar2.setHint(LocaleController.getString("EnterChannelName", R.string.EnterChannelName));
        } else {
            r21 = 0;
            ruVar2.setHint(LocaleController.getString("GroupName", R.string.GroupName));
        }
        org.telegram.ui.Components.ru ruVar3 = this.v;
        TLRPC.Chat chat3 = this.w0;
        ruVar3.setEnabled((chat3 != null || ChatObject.canChangeChatInfo(chat3)) ? true : r21);
        org.telegram.ui.Components.ru ruVar4 = this.v;
        ruVar4.setFocusable(ruVar4.isEnabled());
        this.v.getEditText().addTextChangedListener(new m0(this, 2));
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[r21] = new InputFilter.LengthFilter(128);
        this.v.setFilters(inputFilterArr);
        org.telegram.ui.Components.ru ruVar5 = this.v;
        boolean z16 = LocaleController.isRTL;
        frameLayout2.addView(ruVar5, org.telegram.ui.Components.gb1.h(-1, -2.0f, 16, z16 ? 5.0f : 96.0f, 0.0f, z16 ? 96.0f : 5.0f, 0.0f));
        LinearLayout linearLayout3 = new LinearLayout(context);
        this.y = linearLayout3;
        linearLayout3.setOrientation(1);
        fp0Var.addView(this.y, org.telegram.ui.Components.gb1.r(-1, -2));
        final int i19 = 12;
        if (this.C0 != null || ChatObject.canChangeChatInfo(this.w0)) {
            lo loVar = new lo(context);
            this.b0 = loVar;
            org.telegram.ui.ActionBar.f7.S(loVar, org.telegram.ui.ActionBar.y6.M0(r21), null, org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
            this.b0.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
            this.b0.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i20 = userProfilePhoto2.dc_id;
                                        if (i20 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i20;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j11 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var7 = moVar14.H;
                            boolean z152 = v8Var7 != null && v8Var7.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j11;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat4 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat4;
                            if (ChatObject.isChannel(chat4) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i21 = 0; i21 < tL_chatReactionsSome.reactions.size(); i21++) {
                                            if (tL_chatReactionsSome.reactions.get(i21) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i21)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            this.y.addView(this.b0, org.telegram.ui.Components.gb1.r(-1, -2));
        }
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.E = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.f7.F(this.E, org.telegram.ui.ActionBar.y6.H6);
        EditTextBoldCursor editTextBoldCursor2 = this.E;
        int i20 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.V(editTextBoldCursor2, i20, null);
        int i21 = r21;
        this.E.setPadding(i21, i21, i21, AndroidUtilities.dp(6.0f));
        this.E.setBackgroundDrawable(null);
        this.E.setGravity(LocaleController.isRTL ? 5 : 3);
        this.E.setInputType(180225);
        this.E.setImeOptions(6);
        this.E.setEnabled(this.C0 != null || ChatObject.canChangeChatInfo(this.w0));
        EditTextBoldCursor editTextBoldCursor3 = this.E;
        editTextBoldCursor3.setFocusable(editTextBoldCursor3.isEnabled());
        this.E.setFilters(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.E.setHint(LocaleController.getString("DescriptionOptionalPlaceholder", R.string.DescriptionOptionalPlaceholder));
        org.telegram.ui.ActionBar.f7.v(this.E, i20);
        this.E.setCursorSize(AndroidUtilities.dp(20.0f));
        this.E.setCursorWidth(1.5f);
        if (this.E.isEnabled()) {
            this.y.addView(this.E, org.telegram.ui.Components.gb1.o(23.0f, 15.0f, 23.0f, 9.0f, -1, -2));
        } else {
            this.y.addView(this.E, org.telegram.ui.Components.gb1.o(23.0f, 12.0f, 23.0f, 6.0f, -1, -2));
        }
        this.E.setOnEditorActionListener(new la(this, 2));
        this.E.addTextChangedListener(new md(1));
        org.telegram.ui.Cells.f7 f7Var = new org.telegram.ui.Cells.f7(context);
        this.G = f7Var;
        fp0Var.addView(f7Var, org.telegram.ui.Components.gb1.r(-1, -2));
        LinearLayout linearLayout4 = new LinearLayout(context);
        this.F = linearLayout4;
        linearLayout4.setOrientation(1);
        fp0Var.addView(this.F, org.telegram.ui.Components.gb1.r(-1, -2));
        TLRPC.Chat chat4 = this.w0;
        CharSequence charSequence = "";
        if (chat4 != null) {
            if (chat4.megagroup && ((chatFull4 = this.x0) == null || chatFull4.can_set_location)) {
                org.telegram.ui.Cells.v8 v8Var7 = new org.telegram.ui.Cells.v8(context);
                this.H = v8Var7;
                org.telegram.ui.ActionBar.f7.S(v8Var7, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i17), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                this.F.addView(this.H, org.telegram.ui.Components.gb1.r(-1, -2));
                final int i22 = 15;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ mo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i22) {
                            case 0:
                                mo moVar3 = this.b;
                                moVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", moVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kr krVar = new kr(bundle);
                                krVar.y0(moVar3.x0);
                                moVar3.presentFragment(krVar);
                                break;
                            case 1:
                                mo moVar4 = this.b;
                                ko koVar = moVar4.P0;
                                long j102 = moVar4.B0;
                                if (!moVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = moVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                mo moVar5 = this.b;
                                moVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", moVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kr krVar2 = new kr(bundle2);
                                krVar2.y0(moVar5.x0);
                                moVar5.presentFragment(krVar2);
                                break;
                            case 3:
                                mo moVar6 = this.b;
                                moVar6.presentFragment(new kh0(moVar6.v0));
                                break;
                            case 4:
                                mo moVar7 = this.b;
                                moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                break;
                            case 5:
                                mo moVar8 = this.b;
                                moVar8.getClass();
                                moVar8.presentFragment(new wb(moVar8.w0));
                                break;
                            case 6:
                                mo moVar9 = this.b;
                                moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                break;
                            case 7:
                                mo moVar10 = this.b;
                                moVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", moVar10.B0);
                                moVar10.presentFragment(new ta(bundle3));
                                break;
                            case 8:
                                mo moVar11 = this.b;
                                moVar11.presentFragment(new hi.k(moVar11.B0));
                                break;
                            case 9:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                break;
                            case 12:
                                this.b.j0();
                                break;
                            case 13:
                                mo.Y(this.b);
                                break;
                            case 14:
                                mo moVar12 = this.b;
                                org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                break;
                            case 15:
                                mo moVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -moVar13.v0;
                                    TLRPC.ChatFull chatFull6 = moVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.E0 = new fo(moVar13, 6);
                                    moVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                mo moVar14 = this.b;
                                long j11 = moVar14.v0;
                                org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                ap apVar = new ap(null);
                                apVar.M = new ArrayList();
                                apVar.N = new ArrayList();
                                apVar.P = new ArrayList();
                                apVar.c0 = true;
                                apVar.f0 = new ArrayList();
                                apVar.o0 = new HashMap();
                                apVar.q0 = new po(apVar, 5);
                                apVar.s0 = false;
                                apVar.Z = j11;
                                apVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = moVar14.x0;
                                apVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        apVar.l0 = tL_chatInviteExported;
                                    } else {
                                        apVar.Z(false);
                                    }
                                }
                                moVar14.presentFragment(apVar);
                                break;
                            case 17:
                                mo moVar15 = this.b;
                                long j12 = moVar15.v0;
                                np npVar = new np(null);
                                npVar.v = new ArrayList();
                                boolean z162 = false;
                                npVar.O = false;
                                npVar.P = false;
                                npVar.E = j12;
                                TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                npVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                    z162 = true;
                                }
                                npVar.s = z162;
                                npVar.h = moVar15.x0;
                                moVar15.presentFragment(npVar);
                                break;
                            case 18:
                                mo moVar16 = this.b;
                                fw0 fw0Var = new fw0(moVar16.v0);
                                fw0Var.s = new fo(moVar16, 4);
                                moVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                mo.a0(this.b);
                                break;
                            case 20:
                                mo moVar17 = this.b;
                                e60 e60Var = new e60(-moVar17.w0.id);
                                e60Var.c = moVar17.K0;
                                e60Var.l0 = moVar17;
                                moVar17.presentFragment(e60Var);
                                break;
                            case 21:
                                mo moVar18 = this.b;
                                moVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", moVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                kr krVar3 = new kr(bundle4);
                                krVar3.y0(moVar18.x0);
                                moVar18.presentFragment(krVar3);
                                break;
                            case 22:
                                mo moVar19 = this.b;
                                jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = moVar19.x0;
                                jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                moVar19.presentFragment(jh0Var);
                                break;
                            case 23:
                                mo moVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                    moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", moVar20.v0);
                                    vp vpVar = new vp(bundle5);
                                    TLRPC.ChatFull chatFull9 = moVar20.x0;
                                    vpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (vpVar.a == null) {
                                            vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                        }
                                        vpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            vpVar.v = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            vpVar.v = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            vpVar.v = 1;
                                        }
                                    }
                                    moVar20.presentFragment(vpVar);
                                    break;
                                }
                            default:
                                mo moVar21 = this.b;
                                moVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", moVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                moVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (this.w0.creator && ((chatFull3 = this.x0) == null || chatFull3.can_set_username)) {
                org.telegram.ui.Cells.v8 v8Var8 = new org.telegram.ui.Cells.v8(context);
                this.I = v8Var8;
                org.telegram.ui.ActionBar.f7.S(v8Var8, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i17), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                this.F.addView(this.I, org.telegram.ui.Components.gb1.r(-1, -2));
                final int i23 = 16;
                this.I.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ mo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i23) {
                            case 0:
                                mo moVar3 = this.b;
                                moVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", moVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kr krVar = new kr(bundle);
                                krVar.y0(moVar3.x0);
                                moVar3.presentFragment(krVar);
                                break;
                            case 1:
                                mo moVar4 = this.b;
                                ko koVar = moVar4.P0;
                                long j102 = moVar4.B0;
                                if (!moVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = moVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                mo moVar5 = this.b;
                                moVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", moVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kr krVar2 = new kr(bundle2);
                                krVar2.y0(moVar5.x0);
                                moVar5.presentFragment(krVar2);
                                break;
                            case 3:
                                mo moVar6 = this.b;
                                moVar6.presentFragment(new kh0(moVar6.v0));
                                break;
                            case 4:
                                mo moVar7 = this.b;
                                moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                break;
                            case 5:
                                mo moVar8 = this.b;
                                moVar8.getClass();
                                moVar8.presentFragment(new wb(moVar8.w0));
                                break;
                            case 6:
                                mo moVar9 = this.b;
                                moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                break;
                            case 7:
                                mo moVar10 = this.b;
                                moVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", moVar10.B0);
                                moVar10.presentFragment(new ta(bundle3));
                                break;
                            case 8:
                                mo moVar11 = this.b;
                                moVar11.presentFragment(new hi.k(moVar11.B0));
                                break;
                            case 9:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                break;
                            case 12:
                                this.b.j0();
                                break;
                            case 13:
                                mo.Y(this.b);
                                break;
                            case 14:
                                mo moVar12 = this.b;
                                org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                break;
                            case 15:
                                mo moVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -moVar13.v0;
                                    TLRPC.ChatFull chatFull6 = moVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.E0 = new fo(moVar13, 6);
                                    moVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                mo moVar14 = this.b;
                                long j11 = moVar14.v0;
                                org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                ap apVar = new ap(null);
                                apVar.M = new ArrayList();
                                apVar.N = new ArrayList();
                                apVar.P = new ArrayList();
                                apVar.c0 = true;
                                apVar.f0 = new ArrayList();
                                apVar.o0 = new HashMap();
                                apVar.q0 = new po(apVar, 5);
                                apVar.s0 = false;
                                apVar.Z = j11;
                                apVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = moVar14.x0;
                                apVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        apVar.l0 = tL_chatInviteExported;
                                    } else {
                                        apVar.Z(false);
                                    }
                                }
                                moVar14.presentFragment(apVar);
                                break;
                            case 17:
                                mo moVar15 = this.b;
                                long j12 = moVar15.v0;
                                np npVar = new np(null);
                                npVar.v = new ArrayList();
                                boolean z162 = false;
                                npVar.O = false;
                                npVar.P = false;
                                npVar.E = j12;
                                TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                npVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                    z162 = true;
                                }
                                npVar.s = z162;
                                npVar.h = moVar15.x0;
                                moVar15.presentFragment(npVar);
                                break;
                            case 18:
                                mo moVar16 = this.b;
                                fw0 fw0Var = new fw0(moVar16.v0);
                                fw0Var.s = new fo(moVar16, 4);
                                moVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                mo.a0(this.b);
                                break;
                            case 20:
                                mo moVar17 = this.b;
                                e60 e60Var = new e60(-moVar17.w0.id);
                                e60Var.c = moVar17.K0;
                                e60Var.l0 = moVar17;
                                moVar17.presentFragment(e60Var);
                                break;
                            case 21:
                                mo moVar18 = this.b;
                                moVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", moVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                kr krVar3 = new kr(bundle4);
                                krVar3.y0(moVar18.x0);
                                moVar18.presentFragment(krVar3);
                                break;
                            case 22:
                                mo moVar19 = this.b;
                                jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = moVar19.x0;
                                jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                moVar19.presentFragment(jh0Var);
                                break;
                            case 23:
                                mo moVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                    moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", moVar20.v0);
                                    vp vpVar = new vp(bundle5);
                                    TLRPC.ChatFull chatFull9 = moVar20.x0;
                                    vpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (vpVar.a == null) {
                                            vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                        }
                                        vpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            vpVar.v = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            vpVar.v = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            vpVar.v = 1;
                                        }
                                    }
                                    moVar20.presentFragment(vpVar);
                                    break;
                                }
                            default:
                                mo moVar21 = this.b;
                                moVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", moVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                moVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannel(this.w0) && ((this.H0 && ChatObject.canUserDoAdminAction(this.w0, 1)) || (!this.H0 && ChatObject.canUserDoAdminAction(this.w0, 0)))) {
                org.telegram.ui.Cells.v8 v8Var9 = new org.telegram.ui.Cells.v8(context);
                this.J = v8Var9;
                org.telegram.ui.ActionBar.f7.S(v8Var9, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i17), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                this.F.addView(this.J, org.telegram.ui.Components.gb1.r(-1, -2));
                final int i24 = 17;
                this.J.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ mo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i24) {
                            case 0:
                                mo moVar3 = this.b;
                                moVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", moVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kr krVar = new kr(bundle);
                                krVar.y0(moVar3.x0);
                                moVar3.presentFragment(krVar);
                                break;
                            case 1:
                                mo moVar4 = this.b;
                                ko koVar = moVar4.P0;
                                long j102 = moVar4.B0;
                                if (!moVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = moVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                mo moVar5 = this.b;
                                moVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", moVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kr krVar2 = new kr(bundle2);
                                krVar2.y0(moVar5.x0);
                                moVar5.presentFragment(krVar2);
                                break;
                            case 3:
                                mo moVar6 = this.b;
                                moVar6.presentFragment(new kh0(moVar6.v0));
                                break;
                            case 4:
                                mo moVar7 = this.b;
                                moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                break;
                            case 5:
                                mo moVar8 = this.b;
                                moVar8.getClass();
                                moVar8.presentFragment(new wb(moVar8.w0));
                                break;
                            case 6:
                                mo moVar9 = this.b;
                                moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                break;
                            case 7:
                                mo moVar10 = this.b;
                                moVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", moVar10.B0);
                                moVar10.presentFragment(new ta(bundle3));
                                break;
                            case 8:
                                mo moVar11 = this.b;
                                moVar11.presentFragment(new hi.k(moVar11.B0));
                                break;
                            case 9:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                break;
                            case 12:
                                this.b.j0();
                                break;
                            case 13:
                                mo.Y(this.b);
                                break;
                            case 14:
                                mo moVar12 = this.b;
                                org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                break;
                            case 15:
                                mo moVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -moVar13.v0;
                                    TLRPC.ChatFull chatFull6 = moVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.E0 = new fo(moVar13, 6);
                                    moVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                mo moVar14 = this.b;
                                long j11 = moVar14.v0;
                                org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                ap apVar = new ap(null);
                                apVar.M = new ArrayList();
                                apVar.N = new ArrayList();
                                apVar.P = new ArrayList();
                                apVar.c0 = true;
                                apVar.f0 = new ArrayList();
                                apVar.o0 = new HashMap();
                                apVar.q0 = new po(apVar, 5);
                                apVar.s0 = false;
                                apVar.Z = j11;
                                apVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = moVar14.x0;
                                apVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        apVar.l0 = tL_chatInviteExported;
                                    } else {
                                        apVar.Z(false);
                                    }
                                }
                                moVar14.presentFragment(apVar);
                                break;
                            case 17:
                                mo moVar15 = this.b;
                                long j12 = moVar15.v0;
                                np npVar = new np(null);
                                npVar.v = new ArrayList();
                                boolean z162 = false;
                                npVar.O = false;
                                npVar.P = false;
                                npVar.E = j12;
                                TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                npVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                    z162 = true;
                                }
                                npVar.s = z162;
                                npVar.h = moVar15.x0;
                                moVar15.presentFragment(npVar);
                                break;
                            case 18:
                                mo moVar16 = this.b;
                                fw0 fw0Var = new fw0(moVar16.v0);
                                fw0Var.s = new fo(moVar16, 4);
                                moVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                mo.a0(this.b);
                                break;
                            case 20:
                                mo moVar17 = this.b;
                                e60 e60Var = new e60(-moVar17.w0.id);
                                e60Var.c = moVar17.K0;
                                e60Var.l0 = moVar17;
                                moVar17.presentFragment(e60Var);
                                break;
                            case 21:
                                mo moVar18 = this.b;
                                moVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", moVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                kr krVar3 = new kr(bundle4);
                                krVar3.y0(moVar18.x0);
                                moVar18.presentFragment(krVar3);
                                break;
                            case 22:
                                mo moVar19 = this.b;
                                jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = moVar19.x0;
                                jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                moVar19.presentFragment(jh0Var);
                                break;
                            case 23:
                                mo moVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                    moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", moVar20.v0);
                                    vp vpVar = new vp(bundle5);
                                    TLRPC.ChatFull chatFull9 = moVar20.x0;
                                    vpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (vpVar.a == null) {
                                            vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                        }
                                        vpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            vpVar.v = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            vpVar.v = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            vpVar.v = 1;
                                        }
                                    }
                                    moVar20.presentFragment(vpVar);
                                    break;
                                }
                            default:
                                mo moVar21 = this.b;
                                moVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", moVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                moVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.w0) && this.H0 && ChatObject.canUserDoAdminAction(this.w0, 1)) {
                org.telegram.ui.Cells.v8 v8Var10 = new org.telegram.ui.Cells.v8(context);
                this.K = v8Var10;
                org.telegram.ui.ActionBar.f7.S(v8Var10, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i17), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                this.K.s(LocaleController.getString(R.string.PostSuggestions), "", R.drawable.msg_markunread, true);
                i15 = -2;
                this.F.addView(this.K, org.telegram.ui.Components.gb1.r(-1, -2));
                final int i25 = 18;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ mo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i25) {
                            case 0:
                                mo moVar3 = this.b;
                                moVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", moVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kr krVar = new kr(bundle);
                                krVar.y0(moVar3.x0);
                                moVar3.presentFragment(krVar);
                                break;
                            case 1:
                                mo moVar4 = this.b;
                                ko koVar = moVar4.P0;
                                long j102 = moVar4.B0;
                                if (!moVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = moVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                mo moVar5 = this.b;
                                moVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", moVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kr krVar2 = new kr(bundle2);
                                krVar2.y0(moVar5.x0);
                                moVar5.presentFragment(krVar2);
                                break;
                            case 3:
                                mo moVar6 = this.b;
                                moVar6.presentFragment(new kh0(moVar6.v0));
                                break;
                            case 4:
                                mo moVar7 = this.b;
                                moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                break;
                            case 5:
                                mo moVar8 = this.b;
                                moVar8.getClass();
                                moVar8.presentFragment(new wb(moVar8.w0));
                                break;
                            case 6:
                                mo moVar9 = this.b;
                                moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                break;
                            case 7:
                                mo moVar10 = this.b;
                                moVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", moVar10.B0);
                                moVar10.presentFragment(new ta(bundle3));
                                break;
                            case 8:
                                mo moVar11 = this.b;
                                moVar11.presentFragment(new hi.k(moVar11.B0));
                                break;
                            case 9:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                break;
                            case 12:
                                this.b.j0();
                                break;
                            case 13:
                                mo.Y(this.b);
                                break;
                            case 14:
                                mo moVar12 = this.b;
                                org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                break;
                            case 15:
                                mo moVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -moVar13.v0;
                                    TLRPC.ChatFull chatFull6 = moVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.E0 = new fo(moVar13, 6);
                                    moVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                mo moVar14 = this.b;
                                long j11 = moVar14.v0;
                                org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                ap apVar = new ap(null);
                                apVar.M = new ArrayList();
                                apVar.N = new ArrayList();
                                apVar.P = new ArrayList();
                                apVar.c0 = true;
                                apVar.f0 = new ArrayList();
                                apVar.o0 = new HashMap();
                                apVar.q0 = new po(apVar, 5);
                                apVar.s0 = false;
                                apVar.Z = j11;
                                apVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = moVar14.x0;
                                apVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        apVar.l0 = tL_chatInviteExported;
                                    } else {
                                        apVar.Z(false);
                                    }
                                }
                                moVar14.presentFragment(apVar);
                                break;
                            case 17:
                                mo moVar15 = this.b;
                                long j12 = moVar15.v0;
                                np npVar = new np(null);
                                npVar.v = new ArrayList();
                                boolean z162 = false;
                                npVar.O = false;
                                npVar.P = false;
                                npVar.E = j12;
                                TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                npVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                    z162 = true;
                                }
                                npVar.s = z162;
                                npVar.h = moVar15.x0;
                                moVar15.presentFragment(npVar);
                                break;
                            case 18:
                                mo moVar16 = this.b;
                                fw0 fw0Var = new fw0(moVar16.v0);
                                fw0Var.s = new fo(moVar16, 4);
                                moVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                mo.a0(this.b);
                                break;
                            case 20:
                                mo moVar17 = this.b;
                                e60 e60Var = new e60(-moVar17.w0.id);
                                e60Var.c = moVar17.K0;
                                e60Var.l0 = moVar17;
                                moVar17.presentFragment(e60Var);
                                break;
                            case 21:
                                mo moVar18 = this.b;
                                moVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", moVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                kr krVar3 = new kr(bundle4);
                                krVar3.y0(moVar18.x0);
                                moVar18.presentFragment(krVar3);
                                break;
                            case 22:
                                mo moVar19 = this.b;
                                jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = moVar19.x0;
                                jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                moVar19.presentFragment(jh0Var);
                                break;
                            case 23:
                                mo moVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                    moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", moVar20.v0);
                                    vp vpVar = new vp(bundle5);
                                    TLRPC.ChatFull chatFull9 = moVar20.x0;
                                    vpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (vpVar.a == null) {
                                            vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                        }
                                        vpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            vpVar.v = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            vpVar.v = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            vpVar.v = 1;
                                        }
                                    }
                                    moVar20.presentFragment(vpVar);
                                    break;
                                }
                            default:
                                mo moVar21 = this.b;
                                moVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", moVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                moVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i15 = -2;
            }
            if (ChatObject.isChannelAndNotMegaGroup(this.w0) && ChatObject.canChangeChatInfo(this.w0)) {
                i10 = i17;
                wo0 wo0Var = new wo0(this.currentAccount, -this.w0.id, context, getResourceProvider());
                this.L = wo0Var;
                org.telegram.ui.ActionBar.f7.S(wo0Var, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                this.F.addView(this.L, org.telegram.ui.Components.gb1.r(-1, i15));
                final int i26 = 19;
                this.L.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ mo b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i26) {
                            case 0:
                                mo moVar3 = this.b;
                                moVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", moVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kr krVar = new kr(bundle);
                                krVar.y0(moVar3.x0);
                                moVar3.presentFragment(krVar);
                                break;
                            case 1:
                                mo moVar4 = this.b;
                                ko koVar = moVar4.P0;
                                long j102 = moVar4.B0;
                                if (!moVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = moVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                mo moVar5 = this.b;
                                moVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", moVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kr krVar2 = new kr(bundle2);
                                krVar2.y0(moVar5.x0);
                                moVar5.presentFragment(krVar2);
                                break;
                            case 3:
                                mo moVar6 = this.b;
                                moVar6.presentFragment(new kh0(moVar6.v0));
                                break;
                            case 4:
                                mo moVar7 = this.b;
                                moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                break;
                            case 5:
                                mo moVar8 = this.b;
                                moVar8.getClass();
                                moVar8.presentFragment(new wb(moVar8.w0));
                                break;
                            case 6:
                                mo moVar9 = this.b;
                                moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                break;
                            case 7:
                                mo moVar10 = this.b;
                                moVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", moVar10.B0);
                                moVar10.presentFragment(new ta(bundle3));
                                break;
                            case 8:
                                mo moVar11 = this.b;
                                moVar11.presentFragment(new hi.k(moVar11.B0));
                                break;
                            case 9:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                break;
                            case 12:
                                this.b.j0();
                                break;
                            case 13:
                                mo.Y(this.b);
                                break;
                            case 14:
                                mo moVar12 = this.b;
                                org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                break;
                            case 15:
                                mo moVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -moVar13.v0;
                                    TLRPC.ChatFull chatFull6 = moVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.E0 = new fo(moVar13, 6);
                                    moVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                mo moVar14 = this.b;
                                long j11 = moVar14.v0;
                                org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                ap apVar = new ap(null);
                                apVar.M = new ArrayList();
                                apVar.N = new ArrayList();
                                apVar.P = new ArrayList();
                                apVar.c0 = true;
                                apVar.f0 = new ArrayList();
                                apVar.o0 = new HashMap();
                                apVar.q0 = new po(apVar, 5);
                                apVar.s0 = false;
                                apVar.Z = j11;
                                apVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = moVar14.x0;
                                apVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        apVar.l0 = tL_chatInviteExported;
                                    } else {
                                        apVar.Z(false);
                                    }
                                }
                                moVar14.presentFragment(apVar);
                                break;
                            case 17:
                                mo moVar15 = this.b;
                                long j12 = moVar15.v0;
                                np npVar = new np(null);
                                npVar.v = new ArrayList();
                                boolean z162 = false;
                                npVar.O = false;
                                npVar.P = false;
                                npVar.E = j12;
                                TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                npVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                    z162 = true;
                                }
                                npVar.s = z162;
                                npVar.h = moVar15.x0;
                                moVar15.presentFragment(npVar);
                                break;
                            case 18:
                                mo moVar16 = this.b;
                                fw0 fw0Var = new fw0(moVar16.v0);
                                fw0Var.s = new fo(moVar16, 4);
                                moVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                mo.a0(this.b);
                                break;
                            case 20:
                                mo moVar17 = this.b;
                                e60 e60Var = new e60(-moVar17.w0.id);
                                e60Var.c = moVar17.K0;
                                e60Var.l0 = moVar17;
                                moVar17.presentFragment(e60Var);
                                break;
                            case 21:
                                mo moVar18 = this.b;
                                moVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", moVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                kr krVar3 = new kr(bundle4);
                                krVar3.y0(moVar18.x0);
                                moVar18.presentFragment(krVar3);
                                break;
                            case 22:
                                mo moVar19 = this.b;
                                jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = moVar19.x0;
                                jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                moVar19.presentFragment(jh0Var);
                                break;
                            case 23:
                                mo moVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                    moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", moVar20.v0);
                                    vp vpVar = new vp(bundle5);
                                    TLRPC.ChatFull chatFull9 = moVar20.x0;
                                    vpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (vpVar.a == null) {
                                            vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                        }
                                        vpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            vpVar.v = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            vpVar.v = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            vpVar.v = 1;
                                        }
                                    }
                                    moVar20.presentFragment(vpVar);
                                    break;
                                }
                            default:
                                mo moVar21 = this.b;
                                moVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", moVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                moVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            } else {
                i10 = i17;
            }
            if (!ChatObject.isChannelAndNotMegaGroup(this.w0) || ChatObject.isCommunity(this.w0)) {
                context3 = context;
                frameLayout = frameLayout2;
                num = 1;
                moVar = this;
            } else {
                long j11 = -this.w0.id;
                num = 1;
                org.telegram.ui.Cells.v8 v8Var11 = new org.telegram.ui.Cells.v8(23, context, this.resourceProvider, false, true);
                context3 = context;
                this.M = v8Var11;
                org.telegram.ui.ActionBar.f7.S(v8Var11, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                this.M.n(R.drawable.msg_translate, LocaleController.getString(R.string.ChannelAutotranslation), this.w0.autotranslation);
                final int i27 = 0;
                getMessagesController().getBoostsController().getBoostsStats(j11, new Utilities.Callback(this) { // from class: org.telegram.ui.co
                    public final /* synthetic */ mo b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i27) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                mo moVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    moVar3.getClass();
                                    break;
                                } else {
                                    moVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < moVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.K0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                this.F.addView(this.M, org.telegram.ui.Components.gb1.r(-1, -2));
                frameLayout = frameLayout2;
                moVar = this;
                this.M.setOnClickListener(new bi.p3(this, new boolean[]{false}, j11, 1));
            }
            if (!moVar.H0 && ChatObject.canBlockUsers(moVar.w0) && (ChatObject.isChannel(moVar.w0) || moVar.w0.creator)) {
                org.telegram.ui.Cells.v8 v8Var12 = new org.telegram.ui.Cells.v8(context3);
                moVar.N = v8Var12;
                org.telegram.ui.ActionBar.f7.S(v8Var12, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                moVar.F.addView(moVar.N, org.telegram.ui.Components.gb1.r(-1, -2));
                moVar.N.setOnClickListener(new org.telegram.ui.ActionBar.u1(15, moVar, context3));
            }
            if (ChatObject.isMegagroup(moVar.w0) && ChatObject.hasAdminRights(moVar.w0) && !ChatObject.isCommunity(moVar.w0)) {
                final int i28 = 1;
                MessagesController.getInstance(moVar.currentAccount).getBoostsController().getBoostsStats(-moVar.w0.id, new Utilities.Callback(moVar) { // from class: org.telegram.ui.co
                    public final /* synthetic */ mo b;

                    {
                        this.b = moVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        switch (i28) {
                            case 0:
                                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                                mo moVar3 = this.b;
                                if (tL_premium_boostsStatus == null) {
                                    moVar3.getClass();
                                    break;
                                } else {
                                    moVar3.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < moVar3.getMessagesController().channelAutotranslationLevelMin ? R.drawable.permission_locked : 0);
                                    break;
                                }
                            default:
                                this.b.K0 = (TL_stories.TL_premium_boostsStatus) obj;
                                break;
                        }
                    }
                });
                wo0 wo0Var2 = new wo0(moVar.currentAccount, -moVar.w0.id, context3, moVar.getResourceProvider());
                moVar.L = wo0Var2;
                org.telegram.ui.ActionBar.f7.S(wo0Var2, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                moVar.F.addView(moVar.L, org.telegram.ui.Components.gb1.r(-1, -2));
                final int i29 = 20;
                moVar.L.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                    public final /* synthetic */ mo b;

                    {
                        this.b = moVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i29) {
                            case 0:
                                mo moVar3 = this.b;
                                moVar3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", moVar3.v0);
                                bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                kr krVar = new kr(bundle);
                                krVar.y0(moVar3.x0);
                                moVar3.presentFragment(krVar);
                                break;
                            case 1:
                                mo moVar4 = this.b;
                                ko koVar = moVar4.P0;
                                long j102 = moVar4.B0;
                                if (!moVar4.s.g()) {
                                    ImageLocation imageLocation = null;
                                    TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                    if (user2 == null) {
                                        TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                        TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                        if (chatPhoto != null && chatPhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                            int i192 = chatPhoto2.dc_id;
                                            if (i192 != 0) {
                                                chatPhoto2.photo_big.dc_id = i192;
                                            }
                                            TLRPC.ChatFull chatFull5 = moVar4.x0;
                                            if (chatFull5 != null) {
                                                TLRPC.Photo photo = chatFull5.chat_photo;
                                                if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                    imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                }
                                            }
                                            PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    } else {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                        if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                            PhotoViewer.u1().M2(null, moVar4, null);
                                            TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                            int i202 = userProfilePhoto2.dc_id;
                                            if (i202 != 0) {
                                                userProfilePhoto2.photo_big.dc_id = i202;
                                            }
                                            PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 2:
                                mo moVar5 = this.b;
                                moVar5.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("chat_id", moVar5.v0);
                                bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                kr krVar2 = new kr(bundle2);
                                krVar2.y0(moVar5.x0);
                                moVar5.presentFragment(krVar2);
                                break;
                            case 3:
                                mo moVar6 = this.b;
                                moVar6.presentFragment(new kh0(moVar6.v0));
                                break;
                            case 4:
                                mo moVar7 = this.b;
                                moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                break;
                            case 5:
                                mo moVar8 = this.b;
                                moVar8.getClass();
                                moVar8.presentFragment(new wb(moVar8.w0));
                                break;
                            case 6:
                                mo moVar9 = this.b;
                                moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                break;
                            case 7:
                                mo moVar10 = this.b;
                                moVar10.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putLong("bot_id", moVar10.B0);
                                moVar10.presentFragment(new ta(bundle3));
                                break;
                            case 8:
                                mo moVar11 = this.b;
                                moVar11.presentFragment(new hi.k(moVar11.B0));
                                break;
                            case 9:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                break;
                            case 10:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                break;
                            case 11:
                                qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                break;
                            case 12:
                                this.b.j0();
                                break;
                            case 13:
                                mo.Y(this.b);
                                break;
                            case 14:
                                mo moVar12 = this.b;
                                org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                break;
                            case 15:
                                mo moVar13 = this.b;
                                if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                    pc0 pc0Var = new pc0(4);
                                    pc0Var.e0 = -moVar13.v0;
                                    TLRPC.ChatFull chatFull6 = moVar13.x0;
                                    if (chatFull6 != null) {
                                        TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                        if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                            pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                        }
                                    }
                                    pc0Var.E0 = new fo(moVar13, 6);
                                    moVar13.presentFragment(pc0Var);
                                    break;
                                }
                                break;
                            case 16:
                                mo moVar14 = this.b;
                                long j112 = moVar14.v0;
                                org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                ap apVar = new ap(null);
                                apVar.M = new ArrayList();
                                apVar.N = new ArrayList();
                                apVar.P = new ArrayList();
                                apVar.c0 = true;
                                apVar.f0 = new ArrayList();
                                apVar.o0 = new HashMap();
                                apVar.q0 = new po(apVar, 5);
                                apVar.s0 = false;
                                apVar.Z = j112;
                                apVar.n0 = z152;
                                TLRPC.ChatFull chatFull7 = moVar14.x0;
                                apVar.Y = chatFull7;
                                if (chatFull7 != null) {
                                    TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                    if (tL_chatInviteExported != null) {
                                        apVar.l0 = tL_chatInviteExported;
                                    } else {
                                        apVar.Z(false);
                                    }
                                }
                                moVar14.presentFragment(apVar);
                                break;
                            case 17:
                                mo moVar15 = this.b;
                                long j12 = moVar15.v0;
                                np npVar = new np(null);
                                npVar.v = new ArrayList();
                                boolean z162 = false;
                                npVar.O = false;
                                npVar.P = false;
                                npVar.E = j12;
                                TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                npVar.f = chat42;
                                if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                    z162 = true;
                                }
                                npVar.s = z162;
                                npVar.h = moVar15.x0;
                                moVar15.presentFragment(npVar);
                                break;
                            case 18:
                                mo moVar16 = this.b;
                                fw0 fw0Var = new fw0(moVar16.v0);
                                fw0Var.s = new fo(moVar16, 4);
                                moVar16.presentFragment(fw0Var);
                                break;
                            case 19:
                                mo.a0(this.b);
                                break;
                            case 20:
                                mo moVar17 = this.b;
                                e60 e60Var = new e60(-moVar17.w0.id);
                                e60Var.c = moVar17.K0;
                                e60Var.l0 = moVar17;
                                moVar17.presentFragment(e60Var);
                                break;
                            case 21:
                                mo moVar18 = this.b;
                                moVar18.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putLong("chat_id", moVar18.v0);
                                bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                kr krVar3 = new kr(bundle4);
                                krVar3.y0(moVar18.x0);
                                moVar18.presentFragment(krVar3);
                                break;
                            case 22:
                                mo moVar19 = this.b;
                                jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                TLRPC.ChatFull chatFull8 = moVar19.x0;
                                jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                moVar19.presentFragment(jh0Var);
                                break;
                            case 23:
                                mo moVar20 = this.b;
                                if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                    moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                    break;
                                } else {
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putLong("chat_id", moVar20.v0);
                                    vp vpVar = new vp(bundle5);
                                    TLRPC.ChatFull chatFull9 = moVar20.x0;
                                    vpVar.b = chatFull9;
                                    if (chatFull9 != null) {
                                        if (vpVar.a == null) {
                                            vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                        }
                                        vpVar.d = new ArrayList();
                                        TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                            vpVar.v = 0;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                            vpVar.v = 2;
                                        } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                            TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                            for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                    vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                }
                                            }
                                            vpVar.v = 1;
                                        }
                                    }
                                    moVar20.presentFragment(vpVar);
                                    break;
                                }
                            default:
                                mo moVar21 = this.b;
                                moVar21.getClass();
                                Bundle bundle6 = new Bundle();
                                bundle6.putInt("chatMode", 9);
                                bundle6.putLong("chat_id", moVar21.v0);
                                bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                moVar21.presentFragment(new un(bundle6));
                                break;
                        }
                    }
                });
            }
            if (!moVar.H0 && moVar.w0.creator) {
                org.telegram.ui.Cells.v8 v8Var13 = new org.telegram.ui.Cells.v8(23, context, null, false, true);
                context2 = context;
                moVar.Q = v8Var13;
                org.telegram.ui.ActionBar.f7.S(v8Var13, org.telegram.ui.ActionBar.y6.M0(true), org.telegram.ui.ActionBar.f7.N(i10), org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                moVar.Q.n(R.drawable.msg_topics, LocaleController.getString(R.string.ChannelTopics), moVar.E0);
                moVar.Q.getCheckBox().setIcon(moVar.F0 ? 0 : R.drawable.permission_locked);
                moVar.F.addView(moVar.Q, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                moVar.Q.setOnClickListener(new org.telegram.ui.ActionBar.u1(16, moVar, frameLayout));
            } else {
                context2 = context;
            }
            moVar.p0();
        } else {
            i10 = i17;
            context2 = context;
            num = 1;
            moVar = this;
        }
        moVar.simpleActionBar.j();
        if (moVar.C0 != null || ChatObject.canChangeChatInfo(moVar.w0) || moVar.N != null) {
            moVar.a = moVar.simpleActionBar.i(LocaleController.getString(R.string.Save));
        }
        if (moVar.H == null && moVar.N == null && moVar.I == null && moVar.J == null && moVar.Q == null) {
            i11 = -2;
        } else {
            org.telegram.ui.Cells.i9 i9Var = new org.telegram.ui.Cells.i9(context2, 12, moVar.resourceProvider);
            moVar.P = i9Var;
            if (moVar.Q != null) {
                i9Var.setText(LocaleController.getString(R.string.ForumToggleDescription));
            } else {
                i9Var.setFixedSize(12);
            }
            i11 = -2;
            fp0Var.addView(moVar.P, org.telegram.ui.Components.gb1.r(-1, -2));
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        moVar.R = linearLayout5;
        linearLayout5.setOrientation(1);
        fp0Var.addView(moVar.R, org.telegram.ui.Components.gb1.r(-1, i11));
        final int i30 = 8;
        if (moVar.w0 != null) {
            org.telegram.ui.Cells.v8 v8Var14 = new org.telegram.ui.Cells.v8(context2);
            moVar.X = v8Var14;
            org.telegram.ui.Cells.y M0 = org.telegram.ui.ActionBar.y6.M0(false);
            int i31 = org.telegram.ui.ActionBar.y6.i6;
            b7Var = null;
            org.telegram.ui.ActionBar.f7.S(v8Var14, M0, null, org.telegram.ui.ActionBar.f7.N(i31));
            org.telegram.ui.Cells.v8 v8Var15 = moVar.X;
            if (!ChatObject.isChannel(moVar.w0)) {
                TLRPC.Chat chat5 = moVar.w0;
                if (!chat5.creator && (!ChatObject.hasAdminRights(chat5) || !ChatObject.canChangeChatInfo(moVar.w0))) {
                    i13 = 8;
                    v8Var15.setVisibility(i13);
                    final int i32 = 21;
                    moVar.X.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i32) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j12 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j12;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.v8 v8Var16 = new org.telegram.ui.Cells.v8(context2);
                    moVar.V = v8Var16;
                    org.telegram.ui.ActionBar.f7.S(v8Var16, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                    final int i33 = 22;
                    moVar.V.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i33) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j12 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j12;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.v8 v8Var17 = new org.telegram.ui.Cells.v8(context2);
                    moVar.O = v8Var17;
                    org.telegram.ui.ActionBar.f7.S(v8Var17, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                    final int i34 = 23;
                    moVar.O.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i34) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j12 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j12;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    if (ChatObject.canUserDoAdminAction(moVar.w0, 28)) {
                        org.telegram.ui.Cells.v8 v8Var18 = new org.telegram.ui.Cells.v8(context2);
                        moVar.e0 = v8Var18;
                        org.telegram.ui.ActionBar.f7.S(v8Var18, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                        final int i35 = 24;
                        moVar.e0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ mo b;

                            {
                                this.b = moVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i35) {
                                    case 0:
                                        mo moVar3 = this.b;
                                        moVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", moVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kr krVar = new kr(bundle);
                                        krVar.y0(moVar3.x0);
                                        moVar3.presentFragment(krVar);
                                        break;
                                    case 1:
                                        mo moVar4 = this.b;
                                        ko koVar = moVar4.P0;
                                        long j102 = moVar4.B0;
                                        if (!moVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        mo moVar5 = this.b;
                                        moVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", moVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kr krVar2 = new kr(bundle2);
                                        krVar2.y0(moVar5.x0);
                                        moVar5.presentFragment(krVar2);
                                        break;
                                    case 3:
                                        mo moVar6 = this.b;
                                        moVar6.presentFragment(new kh0(moVar6.v0));
                                        break;
                                    case 4:
                                        mo moVar7 = this.b;
                                        moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                        break;
                                    case 5:
                                        mo moVar8 = this.b;
                                        moVar8.getClass();
                                        moVar8.presentFragment(new wb(moVar8.w0));
                                        break;
                                    case 6:
                                        mo moVar9 = this.b;
                                        moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                        break;
                                    case 7:
                                        mo moVar10 = this.b;
                                        moVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", moVar10.B0);
                                        moVar10.presentFragment(new ta(bundle3));
                                        break;
                                    case 8:
                                        mo moVar11 = this.b;
                                        moVar11.presentFragment(new hi.k(moVar11.B0));
                                        break;
                                    case 9:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.j0();
                                        break;
                                    case 13:
                                        mo.Y(this.b);
                                        break;
                                    case 14:
                                        mo moVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                        break;
                                    case 15:
                                        mo moVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -moVar13.v0;
                                            TLRPC.ChatFull chatFull6 = moVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.E0 = new fo(moVar13, 6);
                                            moVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        mo moVar14 = this.b;
                                        long j112 = moVar14.v0;
                                        org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                        boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                        ap apVar = new ap(null);
                                        apVar.M = new ArrayList();
                                        apVar.N = new ArrayList();
                                        apVar.P = new ArrayList();
                                        apVar.c0 = true;
                                        apVar.f0 = new ArrayList();
                                        apVar.o0 = new HashMap();
                                        apVar.q0 = new po(apVar, 5);
                                        apVar.s0 = false;
                                        apVar.Z = j112;
                                        apVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = moVar14.x0;
                                        apVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                apVar.l0 = tL_chatInviteExported;
                                            } else {
                                                apVar.Z(false);
                                            }
                                        }
                                        moVar14.presentFragment(apVar);
                                        break;
                                    case 17:
                                        mo moVar15 = this.b;
                                        long j12 = moVar15.v0;
                                        np npVar = new np(null);
                                        npVar.v = new ArrayList();
                                        boolean z162 = false;
                                        npVar.O = false;
                                        npVar.P = false;
                                        npVar.E = j12;
                                        TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                        npVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        npVar.s = z162;
                                        npVar.h = moVar15.x0;
                                        moVar15.presentFragment(npVar);
                                        break;
                                    case 18:
                                        mo moVar16 = this.b;
                                        fw0 fw0Var = new fw0(moVar16.v0);
                                        fw0Var.s = new fo(moVar16, 4);
                                        moVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        mo.a0(this.b);
                                        break;
                                    case 20:
                                        mo moVar17 = this.b;
                                        e60 e60Var = new e60(-moVar17.w0.id);
                                        e60Var.c = moVar17.K0;
                                        e60Var.l0 = moVar17;
                                        moVar17.presentFragment(e60Var);
                                        break;
                                    case 21:
                                        mo moVar18 = this.b;
                                        moVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", moVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                        kr krVar3 = new kr(bundle4);
                                        krVar3.y0(moVar18.x0);
                                        moVar18.presentFragment(krVar3);
                                        break;
                                    case 22:
                                        mo moVar19 = this.b;
                                        jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = moVar19.x0;
                                        jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                        moVar19.presentFragment(jh0Var);
                                        break;
                                    case 23:
                                        mo moVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                            moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", moVar20.v0);
                                            vp vpVar = new vp(bundle5);
                                            TLRPC.ChatFull chatFull9 = moVar20.x0;
                                            vpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (vpVar.a == null) {
                                                    vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                                }
                                                vpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    vpVar.v = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    vpVar.v = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    vpVar.v = 1;
                                                }
                                            }
                                            moVar20.presentFragment(vpVar);
                                            break;
                                        }
                                    default:
                                        mo moVar21 = this.b;
                                        moVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", moVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                        moVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                        moVar.g0();
                    }
                    org.telegram.ui.Cells.v8 v8Var19 = new org.telegram.ui.Cells.v8(context2);
                    moVar.W = v8Var19;
                    final int i36 = 0;
                    org.telegram.ui.ActionBar.f7.S(v8Var19, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                    moVar.W.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i36) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j12 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j12;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Cells.v8 v8Var20 = new org.telegram.ui.Cells.v8(context2);
                    moVar.T = v8Var20;
                    org.telegram.ui.ActionBar.f7.S(v8Var20, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                    final int i37 = 2;
                    moVar.T.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i37) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j12 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j12;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    if (!ChatObject.isChannelAndNotMegaGroup(moVar.w0)) {
                        org.telegram.ui.Cells.v8 v8Var21 = new org.telegram.ui.Cells.v8(context2);
                        moVar.U = v8Var21;
                        org.telegram.ui.ActionBar.f7.S(v8Var21, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                        final int i38 = 3;
                        moVar.U.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ mo b;

                            {
                                this.b = moVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i38) {
                                    case 0:
                                        mo moVar3 = this.b;
                                        moVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", moVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kr krVar = new kr(bundle);
                                        krVar.y0(moVar3.x0);
                                        moVar3.presentFragment(krVar);
                                        break;
                                    case 1:
                                        mo moVar4 = this.b;
                                        ko koVar = moVar4.P0;
                                        long j102 = moVar4.B0;
                                        if (!moVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        mo moVar5 = this.b;
                                        moVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", moVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kr krVar2 = new kr(bundle2);
                                        krVar2.y0(moVar5.x0);
                                        moVar5.presentFragment(krVar2);
                                        break;
                                    case 3:
                                        mo moVar6 = this.b;
                                        moVar6.presentFragment(new kh0(moVar6.v0));
                                        break;
                                    case 4:
                                        mo moVar7 = this.b;
                                        moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                        break;
                                    case 5:
                                        mo moVar8 = this.b;
                                        moVar8.getClass();
                                        moVar8.presentFragment(new wb(moVar8.w0));
                                        break;
                                    case 6:
                                        mo moVar9 = this.b;
                                        moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                        break;
                                    case 7:
                                        mo moVar10 = this.b;
                                        moVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", moVar10.B0);
                                        moVar10.presentFragment(new ta(bundle3));
                                        break;
                                    case 8:
                                        mo moVar11 = this.b;
                                        moVar11.presentFragment(new hi.k(moVar11.B0));
                                        break;
                                    case 9:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.j0();
                                        break;
                                    case 13:
                                        mo.Y(this.b);
                                        break;
                                    case 14:
                                        mo moVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                        break;
                                    case 15:
                                        mo moVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -moVar13.v0;
                                            TLRPC.ChatFull chatFull6 = moVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.E0 = new fo(moVar13, 6);
                                            moVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        mo moVar14 = this.b;
                                        long j112 = moVar14.v0;
                                        org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                        boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                        ap apVar = new ap(null);
                                        apVar.M = new ArrayList();
                                        apVar.N = new ArrayList();
                                        apVar.P = new ArrayList();
                                        apVar.c0 = true;
                                        apVar.f0 = new ArrayList();
                                        apVar.o0 = new HashMap();
                                        apVar.q0 = new po(apVar, 5);
                                        apVar.s0 = false;
                                        apVar.Z = j112;
                                        apVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = moVar14.x0;
                                        apVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                apVar.l0 = tL_chatInviteExported;
                                            } else {
                                                apVar.Z(false);
                                            }
                                        }
                                        moVar14.presentFragment(apVar);
                                        break;
                                    case 17:
                                        mo moVar15 = this.b;
                                        long j12 = moVar15.v0;
                                        np npVar = new np(null);
                                        npVar.v = new ArrayList();
                                        boolean z162 = false;
                                        npVar.O = false;
                                        npVar.P = false;
                                        npVar.E = j12;
                                        TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                        npVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        npVar.s = z162;
                                        npVar.h = moVar15.x0;
                                        moVar15.presentFragment(npVar);
                                        break;
                                    case 18:
                                        mo moVar16 = this.b;
                                        fw0 fw0Var = new fw0(moVar16.v0);
                                        fw0Var.s = new fo(moVar16, 4);
                                        moVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        mo.a0(this.b);
                                        break;
                                    case 20:
                                        mo moVar17 = this.b;
                                        e60 e60Var = new e60(-moVar17.w0.id);
                                        e60Var.c = moVar17.K0;
                                        e60Var.l0 = moVar17;
                                        moVar17.presentFragment(e60Var);
                                        break;
                                    case 21:
                                        mo moVar18 = this.b;
                                        moVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", moVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                        kr krVar3 = new kr(bundle4);
                                        krVar3.y0(moVar18.x0);
                                        moVar18.presentFragment(krVar3);
                                        break;
                                    case 22:
                                        mo moVar19 = this.b;
                                        jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = moVar19.x0;
                                        jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                        moVar19.presentFragment(jh0Var);
                                        break;
                                    case 23:
                                        mo moVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                            moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", moVar20.v0);
                                            vp vpVar = new vp(bundle5);
                                            TLRPC.ChatFull chatFull9 = moVar20.x0;
                                            vpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (vpVar.a == null) {
                                                    vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                                }
                                                vpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    vpVar.v = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    vpVar.v = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    vpVar.v = 1;
                                                }
                                            }
                                            moVar20.presentFragment(vpVar);
                                            break;
                                        }
                                    default:
                                        mo moVar21 = this.b;
                                        moVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", moVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                        moVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    org.telegram.ui.Cells.v8 v8Var22 = new org.telegram.ui.Cells.v8(context2);
                    moVar.Z = v8Var22;
                    v8Var22.o(R.drawable.menu_feature_premium, e0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
                    org.telegram.ui.ActionBar.f7.S(moVar.Z, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                    final int i39 = 4;
                    moVar.Z.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i39) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user2 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j12 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j12;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    moVar.Z.setVisibility(8);
                    if (!ChatObject.isChannel(moVar.w0) || moVar.w0.gigagroup) {
                        org.telegram.ui.Cells.v8 v8Var23 = new org.telegram.ui.Cells.v8(context2);
                        moVar.Y = v8Var23;
                        v8Var23.o(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
                        org.telegram.ui.ActionBar.f7.S(moVar.Y, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                        final int i40 = 5;
                        moVar.Y.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ mo b;

                            {
                                this.b = moVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i40) {
                                    case 0:
                                        mo moVar3 = this.b;
                                        moVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", moVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kr krVar = new kr(bundle);
                                        krVar.y0(moVar3.x0);
                                        moVar3.presentFragment(krVar);
                                        break;
                                    case 1:
                                        mo moVar4 = this.b;
                                        ko koVar = moVar4.P0;
                                        long j102 = moVar4.B0;
                                        if (!moVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        mo moVar5 = this.b;
                                        moVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", moVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kr krVar2 = new kr(bundle2);
                                        krVar2.y0(moVar5.x0);
                                        moVar5.presentFragment(krVar2);
                                        break;
                                    case 3:
                                        mo moVar6 = this.b;
                                        moVar6.presentFragment(new kh0(moVar6.v0));
                                        break;
                                    case 4:
                                        mo moVar7 = this.b;
                                        moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                        break;
                                    case 5:
                                        mo moVar8 = this.b;
                                        moVar8.getClass();
                                        moVar8.presentFragment(new wb(moVar8.w0));
                                        break;
                                    case 6:
                                        mo moVar9 = this.b;
                                        moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                        break;
                                    case 7:
                                        mo moVar10 = this.b;
                                        moVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", moVar10.B0);
                                        moVar10.presentFragment(new ta(bundle3));
                                        break;
                                    case 8:
                                        mo moVar11 = this.b;
                                        moVar11.presentFragment(new hi.k(moVar11.B0));
                                        break;
                                    case 9:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.j0();
                                        break;
                                    case 13:
                                        mo.Y(this.b);
                                        break;
                                    case 14:
                                        mo moVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                        break;
                                    case 15:
                                        mo moVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -moVar13.v0;
                                            TLRPC.ChatFull chatFull6 = moVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.E0 = new fo(moVar13, 6);
                                            moVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        mo moVar14 = this.b;
                                        long j112 = moVar14.v0;
                                        org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                        boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                        ap apVar = new ap(null);
                                        apVar.M = new ArrayList();
                                        apVar.N = new ArrayList();
                                        apVar.P = new ArrayList();
                                        apVar.c0 = true;
                                        apVar.f0 = new ArrayList();
                                        apVar.o0 = new HashMap();
                                        apVar.q0 = new po(apVar, 5);
                                        apVar.s0 = false;
                                        apVar.Z = j112;
                                        apVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = moVar14.x0;
                                        apVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                apVar.l0 = tL_chatInviteExported;
                                            } else {
                                                apVar.Z(false);
                                            }
                                        }
                                        moVar14.presentFragment(apVar);
                                        break;
                                    case 17:
                                        mo moVar15 = this.b;
                                        long j12 = moVar15.v0;
                                        np npVar = new np(null);
                                        npVar.v = new ArrayList();
                                        boolean z162 = false;
                                        npVar.O = false;
                                        npVar.P = false;
                                        npVar.E = j12;
                                        TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                        npVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        npVar.s = z162;
                                        npVar.h = moVar15.x0;
                                        moVar15.presentFragment(npVar);
                                        break;
                                    case 18:
                                        mo moVar16 = this.b;
                                        fw0 fw0Var = new fw0(moVar16.v0);
                                        fw0Var.s = new fo(moVar16, 4);
                                        moVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        mo.a0(this.b);
                                        break;
                                    case 20:
                                        mo moVar17 = this.b;
                                        e60 e60Var = new e60(-moVar17.w0.id);
                                        e60Var.c = moVar17.K0;
                                        e60Var.l0 = moVar17;
                                        moVar17.presentFragment(e60Var);
                                        break;
                                    case 21:
                                        mo moVar18 = this.b;
                                        moVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", moVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                        kr krVar3 = new kr(bundle4);
                                        krVar3.y0(moVar18.x0);
                                        moVar18.presentFragment(krVar3);
                                        break;
                                    case 22:
                                        mo moVar19 = this.b;
                                        jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = moVar19.x0;
                                        jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                        moVar19.presentFragment(jh0Var);
                                        break;
                                    case 23:
                                        mo moVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                            moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", moVar20.v0);
                                            vp vpVar = new vp(bundle5);
                                            TLRPC.ChatFull chatFull9 = moVar20.x0;
                                            vpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (vpVar.a == null) {
                                                    vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                                }
                                                vpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    vpVar.v = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    vpVar.v = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    vpVar.v = 1;
                                                }
                                            }
                                            moVar20.presentFragment(vpVar);
                                            break;
                                        }
                                    default:
                                        mo moVar21 = this.b;
                                        moVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", moVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                        moVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    if (ChatObject.isBoostSupported(moVar.w0)) {
                        org.telegram.ui.Cells.v8 v8Var24 = new org.telegram.ui.Cells.v8(context2);
                        moVar.a0 = v8Var24;
                        v8Var24.o(R.drawable.msg_stats, LocaleController.getString(R.string.StatisticsAndBoosts), true);
                        org.telegram.ui.ActionBar.f7.S(moVar.a0, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
                        final int i41 = 6;
                        moVar.a0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                            public final /* synthetic */ mo b;

                            {
                                this.b = moVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i41) {
                                    case 0:
                                        mo moVar3 = this.b;
                                        moVar3.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("chat_id", moVar3.v0);
                                        bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                        kr krVar = new kr(bundle);
                                        krVar.y0(moVar3.x0);
                                        moVar3.presentFragment(krVar);
                                        break;
                                    case 1:
                                        mo moVar4 = this.b;
                                        ko koVar = moVar4.P0;
                                        long j102 = moVar4.B0;
                                        if (!moVar4.s.g()) {
                                            ImageLocation imageLocation = null;
                                            TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                            if (user2 == null) {
                                                TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                                TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                                if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                    int i192 = chatPhoto2.dc_id;
                                                    if (i192 != 0) {
                                                        chatPhoto2.photo_big.dc_id = i192;
                                                    }
                                                    TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                    if (chatFull5 != null) {
                                                        TLRPC.Photo photo = chatFull5.chat_photo;
                                                        if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                            imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                        }
                                                    }
                                                    PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            } else {
                                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                                if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                    PhotoViewer.u1().M2(null, moVar4, null);
                                                    TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                                    int i202 = userProfilePhoto2.dc_id;
                                                    if (i202 != 0) {
                                                        userProfilePhoto2.photo_big.dc_id = i202;
                                                    }
                                                    PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2:
                                        mo moVar5 = this.b;
                                        moVar5.getClass();
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putLong("chat_id", moVar5.v0);
                                        bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                        kr krVar2 = new kr(bundle2);
                                        krVar2.y0(moVar5.x0);
                                        moVar5.presentFragment(krVar2);
                                        break;
                                    case 3:
                                        mo moVar6 = this.b;
                                        moVar6.presentFragment(new kh0(moVar6.v0));
                                        break;
                                    case 4:
                                        mo moVar7 = this.b;
                                        moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                        break;
                                    case 5:
                                        mo moVar8 = this.b;
                                        moVar8.getClass();
                                        moVar8.presentFragment(new wb(moVar8.w0));
                                        break;
                                    case 6:
                                        mo moVar9 = this.b;
                                        moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                        break;
                                    case 7:
                                        mo moVar10 = this.b;
                                        moVar10.getClass();
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("bot_id", moVar10.B0);
                                        moVar10.presentFragment(new ta(bundle3));
                                        break;
                                    case 8:
                                        mo moVar11 = this.b;
                                        moVar11.presentFragment(new hi.k(moVar11.B0));
                                        break;
                                    case 9:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                        break;
                                    case 10:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                        break;
                                    case 11:
                                        qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                        break;
                                    case 12:
                                        this.b.j0();
                                        break;
                                    case 13:
                                        mo.Y(this.b);
                                        break;
                                    case 14:
                                        mo moVar12 = this.b;
                                        org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                        break;
                                    case 15:
                                        mo moVar13 = this.b;
                                        if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                            pc0 pc0Var = new pc0(4);
                                            pc0Var.e0 = -moVar13.v0;
                                            TLRPC.ChatFull chatFull6 = moVar13.x0;
                                            if (chatFull6 != null) {
                                                TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                                if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                    pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                                }
                                            }
                                            pc0Var.E0 = new fo(moVar13, 6);
                                            moVar13.presentFragment(pc0Var);
                                            break;
                                        }
                                        break;
                                    case 16:
                                        mo moVar14 = this.b;
                                        long j112 = moVar14.v0;
                                        org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                        boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                        ap apVar = new ap(null);
                                        apVar.M = new ArrayList();
                                        apVar.N = new ArrayList();
                                        apVar.P = new ArrayList();
                                        apVar.c0 = true;
                                        apVar.f0 = new ArrayList();
                                        apVar.o0 = new HashMap();
                                        apVar.q0 = new po(apVar, 5);
                                        apVar.s0 = false;
                                        apVar.Z = j112;
                                        apVar.n0 = z152;
                                        TLRPC.ChatFull chatFull7 = moVar14.x0;
                                        apVar.Y = chatFull7;
                                        if (chatFull7 != null) {
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                            if (tL_chatInviteExported != null) {
                                                apVar.l0 = tL_chatInviteExported;
                                            } else {
                                                apVar.Z(false);
                                            }
                                        }
                                        moVar14.presentFragment(apVar);
                                        break;
                                    case 17:
                                        mo moVar15 = this.b;
                                        long j12 = moVar15.v0;
                                        np npVar = new np(null);
                                        npVar.v = new ArrayList();
                                        boolean z162 = false;
                                        npVar.O = false;
                                        npVar.P = false;
                                        npVar.E = j12;
                                        TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                                        npVar.f = chat42;
                                        if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                            z162 = true;
                                        }
                                        npVar.s = z162;
                                        npVar.h = moVar15.x0;
                                        moVar15.presentFragment(npVar);
                                        break;
                                    case 18:
                                        mo moVar16 = this.b;
                                        fw0 fw0Var = new fw0(moVar16.v0);
                                        fw0Var.s = new fo(moVar16, 4);
                                        moVar16.presentFragment(fw0Var);
                                        break;
                                    case 19:
                                        mo.a0(this.b);
                                        break;
                                    case 20:
                                        mo moVar17 = this.b;
                                        e60 e60Var = new e60(-moVar17.w0.id);
                                        e60Var.c = moVar17.K0;
                                        e60Var.l0 = moVar17;
                                        moVar17.presentFragment(e60Var);
                                        break;
                                    case 21:
                                        mo moVar18 = this.b;
                                        moVar18.getClass();
                                        Bundle bundle4 = new Bundle();
                                        bundle4.putLong("chat_id", moVar18.v0);
                                        bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                        kr krVar3 = new kr(bundle4);
                                        krVar3.y0(moVar18.x0);
                                        moVar18.presentFragment(krVar3);
                                        break;
                                    case 22:
                                        mo moVar19 = this.b;
                                        jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                        TLRPC.ChatFull chatFull8 = moVar19.x0;
                                        jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                        moVar19.presentFragment(jh0Var);
                                        break;
                                    case 23:
                                        mo moVar20 = this.b;
                                        if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                            moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                            break;
                                        } else {
                                            Bundle bundle5 = new Bundle();
                                            bundle5.putLong("chat_id", moVar20.v0);
                                            vp vpVar = new vp(bundle5);
                                            TLRPC.ChatFull chatFull9 = moVar20.x0;
                                            vpVar.b = chatFull9;
                                            if (chatFull9 != null) {
                                                if (vpVar.a == null) {
                                                    vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                                }
                                                vpVar.d = new ArrayList();
                                                TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                                if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                    vpVar.v = 0;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                    vpVar.v = 2;
                                                } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                    TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                    for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                        if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                            vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                        }
                                                    }
                                                    vpVar.v = 1;
                                                }
                                            }
                                            moVar20.presentFragment(vpVar);
                                            break;
                                        }
                                    default:
                                        mo moVar21 = this.b;
                                        moVar21.getClass();
                                        Bundle bundle6 = new Bundle();
                                        bundle6.putInt("chatMode", 9);
                                        bundle6.putLong("chat_id", moVar21.v0);
                                        bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                        moVar21.presentFragment(new un(bundle6));
                                        break;
                                }
                            }
                        });
                    }
                    moVar.R.addView(moVar.O, org.telegram.ui.Components.gb1.r(-1, -2));
                    v8Var = moVar.e0;
                    if (v8Var != null) {
                        moVar.R.addView(v8Var, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                    if (!moVar.H0 && !moVar.w0.gigagroup) {
                        moVar.R.addView(moVar.X, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                    if (!moVar.H0) {
                        moVar.R.addView(moVar.V, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                    moVar.R.addView(moVar.W, org.telegram.ui.Components.gb1.r(-1, -2));
                    moVar.R.addView(moVar.T, org.telegram.ui.Components.gb1.r(-1, -2));
                    v8Var2 = moVar.U;
                    if (v8Var2 != null && (chatFull2 = moVar.x0) != null && chatFull2.requests_pending > 0) {
                        moVar.R.addView(v8Var2, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                    if (moVar.H0) {
                        moVar.R.addView(moVar.V, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                    if (!moVar.H0 || moVar.w0.gigagroup) {
                        i14 = -2;
                        moVar.R.addView(moVar.X, org.telegram.ui.Components.gb1.r(-1, -2));
                    } else {
                        i14 = -2;
                    }
                    v8Var3 = moVar.a0;
                    if (v8Var3 != null) {
                        moVar.R.addView(v8Var3, org.telegram.ui.Components.gb1.r(-1, i14));
                    }
                    v8Var4 = moVar.Y;
                    if (v8Var4 != null) {
                        moVar.R.addView(v8Var4, org.telegram.ui.Components.gb1.r(-1, i14));
                    }
                    v8Var5 = moVar.Z;
                    if (v8Var5 != null) {
                        moVar.R.addView(v8Var5, org.telegram.ui.Components.gb1.r(-1, i14));
                    }
                    if (moVar.Z != null && moVar.getMessagesController().starrefConnectAllowed && ChatObject.isChannelAndNotMegaGroup(moVar.w0)) {
                        moVar.Z.setVisibility(0);
                    }
                    v8Var6 = moVar.Y;
                    if (v8Var6 != null) {
                        org.telegram.ui.Cells.v8 v8Var25 = moVar.Z;
                        v8Var6.setNeedDivider(v8Var25 != null && v8Var25.getVisibility() == 0);
                    }
                }
            }
            i13 = 0;
            v8Var15.setVisibility(i13);
            final int i322 = 21;
            moVar.X.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i322) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.v8 v8Var162 = new org.telegram.ui.Cells.v8(context2);
            moVar.V = v8Var162;
            org.telegram.ui.ActionBar.f7.S(v8Var162, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
            final int i332 = 22;
            moVar.V.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i332) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.v8 v8Var172 = new org.telegram.ui.Cells.v8(context2);
            moVar.O = v8Var172;
            org.telegram.ui.ActionBar.f7.S(v8Var172, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
            final int i342 = 23;
            moVar.O.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i342) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.canUserDoAdminAction(moVar.w0, 28)) {
            }
            org.telegram.ui.Cells.v8 v8Var192 = new org.telegram.ui.Cells.v8(context2);
            moVar.W = v8Var192;
            final int i362 = 0;
            org.telegram.ui.ActionBar.f7.S(v8Var192, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
            moVar.W.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i362) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.v8 v8Var202 = new org.telegram.ui.Cells.v8(context2);
            moVar.T = v8Var202;
            org.telegram.ui.ActionBar.f7.S(v8Var202, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
            final int i372 = 2;
            moVar.T.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i372) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            if (!ChatObject.isChannelAndNotMegaGroup(moVar.w0)) {
            }
            org.telegram.ui.Cells.v8 v8Var222 = new org.telegram.ui.Cells.v8(context2);
            moVar.Z = v8Var222;
            v8Var222.o(R.drawable.menu_feature_premium, e0(LocaleController.getString(R.string.ChannelAffiliatePrograms)), false);
            org.telegram.ui.ActionBar.f7.S(moVar.Z, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
            final int i392 = 4;
            moVar.Z.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i392) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            moVar.Z.setVisibility(8);
            if (!ChatObject.isChannel(moVar.w0)) {
            }
            org.telegram.ui.Cells.v8 v8Var232 = new org.telegram.ui.Cells.v8(context2);
            moVar.Y = v8Var232;
            v8Var232.o(R.drawable.msg_log, LocaleController.getString(R.string.EventLog), false);
            org.telegram.ui.ActionBar.f7.S(moVar.Y, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i31));
            final int i402 = 5;
            moVar.Y.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i402) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            if (ChatObject.isBoostSupported(moVar.w0)) {
            }
            moVar.R.addView(moVar.O, org.telegram.ui.Components.gb1.r(-1, -2));
            v8Var = moVar.e0;
            if (v8Var != null) {
            }
            if (!moVar.H0) {
                moVar.R.addView(moVar.X, org.telegram.ui.Components.gb1.r(-1, -2));
            }
            if (!moVar.H0) {
            }
            moVar.R.addView(moVar.W, org.telegram.ui.Components.gb1.r(-1, -2));
            moVar.R.addView(moVar.T, org.telegram.ui.Components.gb1.r(-1, -2));
            v8Var2 = moVar.U;
            if (v8Var2 != null) {
                moVar.R.addView(v8Var2, org.telegram.ui.Components.gb1.r(-1, -2));
            }
            if (moVar.H0) {
            }
            if (moVar.H0) {
            }
            i14 = -2;
            moVar.R.addView(moVar.X, org.telegram.ui.Components.gb1.r(-1, -2));
            v8Var3 = moVar.a0;
            if (v8Var3 != null) {
            }
            v8Var4 = moVar.Y;
            if (v8Var4 != null) {
            }
            v8Var5 = moVar.Z;
            if (v8Var5 != null) {
            }
            if (moVar.Z != null) {
                moVar.Z.setVisibility(0);
            }
            v8Var6 = moVar.Y;
            if (v8Var6 != null) {
            }
        } else {
            b7Var = null;
        }
        if (moVar.C0 != null) {
            org.telegram.ui.Cells.v8 v8Var26 = new org.telegram.ui.Cells.v8(context2);
            moVar.k0 = v8Var26;
            org.telegram.ui.Cells.y M02 = org.telegram.ui.ActionBar.y6.M0(false);
            int i42 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.f7.S(v8Var26, M02, b7Var, org.telegram.ui.ActionBar.f7.N(i42));
            moVar.k0.setPrioritizeTitleOverValue(true);
            moVar.R.addView(moVar.k0, org.telegram.ui.Components.gb1.r(-1, -2));
            final int i43 = 7;
            moVar.k0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i43) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            moVar.s0();
            org.telegram.ui.Cells.v8 v8Var27 = new org.telegram.ui.Cells.v8(context2);
            moVar.n0 = v8Var27;
            org.telegram.ui.ActionBar.f7.S(v8Var27, org.telegram.ui.ActionBar.y6.M0(false), b7Var, org.telegram.ui.ActionBar.f7.N(i42));
            moVar.n0.s(e0(LocaleController.getString(R.string.AffiliateProgramBot)), "", R.drawable.msg_shareout, true);
            moVar.R.addView(moVar.n0, org.telegram.ui.Components.gb1.r(-1, -2));
            moVar.n0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i30) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            moVar.n0.h(45, moVar.D0 == null, false);
            TLRPC.UserFull userFull = moVar.D0;
            if (userFull != null) {
                org.telegram.ui.Cells.v8 v8Var28 = moVar.n0;
                if (userFull.starref_program == null) {
                    format = LocaleController.getString(R.string.AffiliateProgramBotOff);
                    z11 = false;
                } else {
                    z11 = false;
                    format = String.format(Locale.US, "%.1f%%", Float.valueOf(r0.commission_permille / 10.0f));
                }
                v8Var28.w(format, z11);
            }
            if (!moVar.getMessagesController().starrefProgramAllowed) {
                moVar.n0.setVisibility(8);
            }
            org.telegram.ui.Cells.v8 v8Var29 = new org.telegram.ui.Cells.v8(context2);
            moVar.o0 = v8Var29;
            org.telegram.ui.ActionBar.f7.S(v8Var29, org.telegram.ui.ActionBar.y6.M0(false), b7Var, org.telegram.ui.ActionBar.f7.N(i42));
            moVar.o0.o(R.drawable.msg_log, LocaleController.getString(R.string.BotEditIntro), true);
            moVar.R.addView(moVar.o0, org.telegram.ui.Components.gb1.r(-1, -2));
            final int i44 = 9;
            moVar.o0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i44) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.v8 v8Var30 = new org.telegram.ui.Cells.v8(context2);
            moVar.p0 = v8Var30;
            org.telegram.ui.ActionBar.f7.S(v8Var30, org.telegram.ui.ActionBar.y6.M0(false), b7Var, org.telegram.ui.ActionBar.f7.N(i42));
            moVar.p0.o(R.drawable.msg_media, LocaleController.getString(R.string.BotEditCommands), true);
            moVar.R.addView(moVar.p0, org.telegram.ui.Components.gb1.r(-1, -2));
            final int i45 = 10;
            moVar.p0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i45) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.v8 v8Var31 = new org.telegram.ui.Cells.v8(context2);
            moVar.q0 = v8Var31;
            org.telegram.ui.ActionBar.f7.S(v8Var31, org.telegram.ui.ActionBar.y6.M0(false), b7Var, org.telegram.ui.ActionBar.f7.N(i42));
            moVar.q0.o(R.drawable.msg_bot, LocaleController.getString(R.string.BotChangeSettings), true);
            moVar.R.addView(moVar.q0, org.telegram.ui.Components.gb1.r(-1, -2));
            final int i46 = 11;
            moVar.q0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i46) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
        }
        TLRPC.Chat chat6 = moVar.w0;
        if (chat6 != null) {
            if (!ChatObject.hasAdminRights(chat6)) {
                moVar.R.setVisibility(8);
                moVar.G.setVisibility(8);
            }
            fp0Var.addView(new org.telegram.ui.Cells.f7(context2), org.telegram.ui.Components.gb1.r(-1, -2));
        } else if (moVar.C0 != null) {
            moVar.r0 = new org.telegram.ui.Cells.i9(context2, 12, moVar.resourceProvider);
            String string = LocaleController.getString(R.string.BotManageInfo);
            SpannableString valueOf = SpannableString.valueOf(string);
            int indexOf = string.indexOf("@BotFather");
            if (indexOf != -1) {
                valueOf.setSpan(new bi.a5(1), indexOf, indexOf + 10, 33);
            }
            moVar.r0.setText(valueOf);
            fp0Var.addView(moVar.r0, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.v8 v8Var32 = new org.telegram.ui.Cells.v8(context2);
            moVar.t0 = v8Var32;
            org.telegram.ui.Cells.y M03 = org.telegram.ui.ActionBar.y6.M0(true);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
            int i47 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.ActionBar.f7.S(v8Var32, M03, N, org.telegram.ui.ActionBar.f7.N(i47));
            moVar.t0.o(R.drawable.menu_factcheck, LocaleController.getString(R.string.BotVerifyAccounts), false);
            org.telegram.ui.Cells.v8 v8Var33 = moVar.t0;
            int i48 = org.telegram.ui.ActionBar.y6.q6;
            v8Var33.g(i48, i48);
            fp0Var.addView(moVar.t0, org.telegram.ui.Components.gb1.r(-1, -2));
            final int i49 = 13;
            moVar.t0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i49) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user2 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user2 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user2.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user2.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j12 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j12;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j12));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.i9 i9Var2 = new org.telegram.ui.Cells.i9(context2, 12, moVar.resourceProvider);
            moVar.s0 = i9Var2;
            i9Var2.setFixedSize(12);
            fp0Var.addView(moVar.s0, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.v8 v8Var34 = moVar.t0;
            TLRPC.UserFull userFull2 = moVar.D0;
            v8Var34.setVisibility((userFull2 == null || (botInfo2 = userFull2.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            org.telegram.ui.Cells.i9 i9Var3 = moVar.s0;
            TLRPC.UserFull userFull3 = moVar.D0;
            i9Var3.setVisibility((userFull3 == null || (botInfo = userFull3.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            TLRPC.User user2 = moVar.C0;
            if (user2.bot && user2.bot_can_edit) {
                LinearLayout linearLayout6 = new LinearLayout(context2);
                moVar.S = linearLayout6;
                linearLayout6.setOrientation(1);
                fp0Var.addView(moVar.S, org.telegram.ui.Components.gb1.r(-1, -2));
                org.telegram.ui.Cells.q4 q4Var = new org.telegram.ui.Cells.q4(context2);
                q4Var.setText(LocaleController.getString(R.string.BotBalance));
                moVar.S.addView(q4Var, org.telegram.ui.Components.gb1.r(-1, -2));
                org.telegram.ui.Cells.v8 v8Var35 = new org.telegram.ui.Cells.v8(context2);
                moVar.l0 = v8Var35;
                org.telegram.ui.ActionBar.f7.S(v8Var35, org.telegram.ui.ActionBar.y6.M0(false), b7Var, org.telegram.ui.ActionBar.f7.N(i47));
                moVar.l0.setPrioritizeTitleOverValue(true);
                moVar.S.addView(moVar.l0, org.telegram.ui.Components.gb1.r(-1, -2));
                final bi.m0 g7 = bi.m0.g(moVar.currentAccount);
                final int i50 = 0;
                moVar.l0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.zn
                    public final /* synthetic */ mo b;

                    {
                        this.b = moVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i50) {
                            case 0:
                                mo moVar3 = this.b;
                                long j12 = moVar3.B0;
                                if (g7.h(j12, false) != null) {
                                    moVar3.presentFragment(new bi.y(1, j12));
                                    break;
                                }
                                break;
                            default:
                                mo moVar4 = this.b;
                                long j13 = moVar4.B0;
                                if (g7.h(j13, false) != null) {
                                    moVar4.presentFragment(new bi.y(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g7.m(j10)) {
                    long i51 = g7.i(j10);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i51 > 0) {
                        double d = i51 / 1.0E9d;
                        if (d > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) AndroidUtilities.formatWholeNumber((int) d, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            i12 = i47;
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d));
                            moVar.l0.s(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                        }
                    }
                    i12 = i47;
                    moVar.l0.s(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder, R.drawable.outline_gram_24, true);
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.ea0(AndroidUtilities.dp(30.0f), moVar.l0.c), 0, spannableStringBuilder2.length(), 33);
                    moVar.l0.s(LocaleController.getString(R.string.BotBalanceTON), spannableStringBuilder2, R.drawable.outline_gram_24, false);
                    i12 = i47;
                }
                moVar.l0.setVisibility(g7.b(j10) ? 0 : 8);
                org.telegram.ui.Cells.v8 v8Var36 = new org.telegram.ui.Cells.v8(context2);
                moVar.m0 = v8Var36;
                org.telegram.ui.ActionBar.f7.S(v8Var36, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(i12));
                final int i52 = 1;
                moVar.m0.setPrioritizeTitleOverValue(true);
                moVar.S.addView(moVar.m0, org.telegram.ui.Components.gb1.r(-1, -2));
                moVar.m0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.zn
                    public final /* synthetic */ mo b;

                    {
                        this.b = moVar;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i52) {
                            case 0:
                                mo moVar3 = this.b;
                                long j12 = moVar3.B0;
                                if (g7.h(j12, false) != null) {
                                    moVar3.presentFragment(new bi.y(1, j12));
                                    break;
                                }
                                break;
                            default:
                                mo moVar4 = this.b;
                                long j13 = moVar4.B0;
                                if (g7.h(j13, false) != null) {
                                    moVar4.presentFragment(new bi.y(0, j13));
                                    break;
                                }
                                break;
                        }
                    }
                });
                if (g7.h(j10, false) != null) {
                    org.telegram.ui.Cells.v8 v8Var37 = moVar.m0;
                    String string2 = LocaleController.getString(R.string.BotBalanceStars);
                    if (g7.c(j10).amount <= 0) {
                        z10 = false;
                    } else {
                        z10 = false;
                        charSequence = bi.dd.W0(false, TextUtils.concat("XTR", bi.dd.J0(g7.c(j10), 0.85f, ' ')), 0.85f, null);
                    }
                    v8Var37.s(string2, charSequence, R.drawable.menu_premium_main, z10);
                } else {
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x");
                    spannableStringBuilder3.setSpan(new org.telegram.ui.Components.ea0(AndroidUtilities.dp(30.0f), moVar.m0.c), 0, spannableStringBuilder3.length(), 33);
                    moVar.m0.s(LocaleController.getString(R.string.BotBalanceStars), spannableStringBuilder3, R.drawable.menu_premium_main, false);
                }
                moVar.m0.setVisibility(g7.a(j10) ? 0 : 8);
                org.telegram.ui.Cells.i9 i9Var4 = new org.telegram.ui.Cells.i9(context2, 12, moVar.getResourceProvider());
                i9Var4.setFixedSize(12);
                num2 = num;
                i9Var4.setTag(R.id.fit_width_tag, num2);
                fp0Var.addView(i9Var4, org.telegram.ui.Components.gb1.r(-1, 12));
                moVar.S.setVisibility((moVar.m0.getVisibility() == 0 || moVar.l0.getVisibility() == 0) ? 0 : 8);
                chat = moVar.w0;
                if ((chat == null && chat.creator) || ((user = moVar.C0) != null && user.bot && user.bot_can_edit)) {
                    final long j12 = chat != null ? chat.linked_community_id : moVar.C0.linked_community_id;
                    final long j13 = chat != null ? -chat.id : moVar.C0.id;
                    final boolean z17 = moVar.C0 != null;
                    if (j12 != 0) {
                        ji.b bVar = new ji.b(context2, moVar.resourceProvider);
                        moVar.g0 = bVar;
                        bVar.a(moVar.currentAccount, moVar.getMessagesController().getChat(Long.valueOf(j12)));
                        ji.b bVar2 = moVar.g0;
                        final int i53 = 0;
                        org.telegram.ui.Cells.y M04 = org.telegram.ui.ActionBar.y6.M0(false);
                        int i54 = org.telegram.ui.ActionBar.y6.i6;
                        org.telegram.ui.ActionBar.f7.S(bVar2, M04, null, org.telegram.ui.ActionBar.f7.N(i54));
                        moVar.g0.setOnClickListener(new View.OnClickListener(moVar) { // from class: org.telegram.ui.ao
                            public final /* synthetic */ mo b;

                            {
                                this.b = moVar;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i53) {
                                    case 0:
                                        mo moVar3 = this.b;
                                        MessagesController messagesController = moVar3.getMessagesController();
                                        long j14 = j12;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                            moVar3.showDialog(new ii.j0(moVar3, j14, null, null));
                                            break;
                                        } else {
                                            moVar3.presentFragment(new ii.o(a1.g.h(j14, "community_id")));
                                            break;
                                        }
                                    default:
                                        mo moVar4 = this.b;
                                        moVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j12);
                                        moVar4.presentFragment(new ii.f(bundle));
                                        break;
                                }
                            }
                        });
                        fp0Var.addView(moVar.g0, org.telegram.ui.Components.gb1.r(-1, -2));
                        org.telegram.ui.Cells.v8 v8Var38 = new org.telegram.ui.Cells.v8(context2);
                        moVar.i0 = v8Var38;
                        v8Var38.o(R.drawable.outline_community_remove_24, LocaleController.getString(z17 ? R.string.CommunityRemoveBotFromCommunity : moVar.H0 ? R.string.CommunityRemoveChannelFromCommunity : R.string.CommunityRemoveGroupFromCommunity), false);
                        org.telegram.ui.Cells.v8 v8Var39 = moVar.i0;
                        int i55 = org.telegram.ui.ActionBar.y6.p7;
                        v8Var39.g(i55, i55);
                        org.telegram.ui.Cells.v8 v8Var40 = moVar.i0;
                        org.telegram.ui.Cells.y M05 = org.telegram.ui.ActionBar.y6.M0(false);
                        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i54);
                        r11 = 0;
                        org.telegram.ui.ActionBar.f7.S(v8Var40, M05, null, N2);
                        moVar2 = moVar;
                        moVar.i0.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.bo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String string3 = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                                mo moVar3 = mo.this;
                                org.telegram.ui.Components.g5.u0(moVar3, string3, LocaleController.getString(z17 ? R.string.CommunityMenuRemoveBotFromCommunityConfirm : moVar3.H0 ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm), LocaleController.getString(R.string.Remove), true, new io(moVar3, j13, j12, 0));
                            }
                        });
                        fp0Var.addView(moVar2.i0, org.telegram.ui.Components.gb1.r(-1, -2));
                        org.telegram.ui.Cells.i9 i9Var5 = new org.telegram.ui.Cells.i9(context2, 12, moVar2.getResourceProvider());
                        moVar2.j0 = i9Var5;
                        i9Var5.setFixedSize(14);
                        moVar2.j0.setTag(R.id.fit_width_tag, num2);
                        fp0Var.addView(moVar2.j0, org.telegram.ui.Components.gb1.r(-1, 14));
                    } else {
                        moVar2 = moVar;
                        r11 = 0;
                        org.telegram.ui.Cells.v8 v8Var41 = new org.telegram.ui.Cells.v8(context2);
                        moVar2.f0 = v8Var41;
                        v8Var41.g(org.telegram.ui.ActionBar.y6.v6, org.telegram.ui.ActionBar.y6.u6);
                        org.telegram.ui.ActionBar.f7.X(moVar2.f0.getTextView(), org.telegram.ui.ActionBar.y6.il);
                        org.telegram.ui.ActionBar.f7.S(moVar2.f0, org.telegram.ui.ActionBar.y6.M0(false), null, org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                        moVar2.f0.o(R.drawable.msg_groups, LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunity : moVar2.H0 ? R.string.CommunityAddChannelToCommunity : R.string.CommunityAddGroupToCommunity), false);
                        final int i56 = 1;
                        moVar2.f0.setOnClickListener(new View.OnClickListener(moVar2) { // from class: org.telegram.ui.ao
                            public final /* synthetic */ mo b;

                            {
                                this.b = moVar2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                switch (i56) {
                                    case 0:
                                        mo moVar3 = this.b;
                                        MessagesController messagesController = moVar3.getMessagesController();
                                        long j14 = j13;
                                        if (!ChatObject.hasAdminRights(messagesController.getChat(Long.valueOf(j14)))) {
                                            moVar3.showDialog(new ii.j0(moVar3, j14, null, null));
                                            break;
                                        } else {
                                            moVar3.presentFragment(new ii.o(a1.g.h(j14, "community_id")));
                                            break;
                                        }
                                    default:
                                        mo moVar4 = this.b;
                                        moVar4.getClass();
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("dialog_id", j13);
                                        moVar4.presentFragment(new ii.f(bundle));
                                        break;
                                }
                            }
                        });
                        org.telegram.ui.Cells.i9 i9Var6 = new org.telegram.ui.Cells.i9(context2, 12, moVar2.resourceProvider);
                        moVar2.h0 = i9Var6;
                        i9Var6.setText(LocaleController.getString(z17 ? R.string.CommunityAddBotToCommunityInfo : moVar2.H0 ? R.string.CommunityAddChannelToCommunityInfo : R.string.CommunityAddGroupToCommunityInfo));
                        fp0Var.addView(moVar2.f0, org.telegram.ui.Components.gb1.r(-1, -2));
                        fp0Var.addView(moVar2.h0, org.telegram.ui.Components.gb1.r(-1, -2));
                    }
                } else {
                    moVar2 = moVar;
                    r11 = 0;
                }
                chat2 = moVar2.w0;
                if (chat2 != null && chat2.creator) {
                    FrameLayout frameLayout3 = new FrameLayout(context2);
                    moVar2.c0 = frameLayout3;
                    fp0Var.addView(frameLayout3, org.telegram.ui.Components.gb1.r(-1, -2));
                    org.telegram.ui.Cells.ga gaVar = new org.telegram.ui.Cells.ga(context2);
                    moVar2.d0 = gaVar;
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.p7, r11);
                    org.telegram.ui.ActionBar.f7.S(moVar2.d0, org.telegram.ui.ActionBar.y6.M0(false), r11, org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
                    if (moVar2.C0 == null) {
                        moVar2.d0.b(LocaleController.getString(R.string.DeleteBot), false);
                    } else if (moVar2.H0) {
                        moVar2.d0.b(LocaleController.getString(R.string.ChannelDelete), false);
                    } else {
                        moVar2.d0.b(LocaleController.getString(R.string.DeleteAndExitButton), false);
                    }
                    moVar2.c0.addView(moVar2.d0, org.telegram.ui.Components.gb1.g(-2.0f, -1));
                    final int i57 = 14;
                    moVar2.d0.setOnClickListener(new View.OnClickListener(moVar2) { // from class: org.telegram.ui.yn
                        public final /* synthetic */ mo b;

                        {
                            this.b = moVar2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i57) {
                                case 0:
                                    mo moVar3 = this.b;
                                    moVar3.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", moVar3.v0);
                                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                                    kr krVar = new kr(bundle);
                                    krVar.y0(moVar3.x0);
                                    moVar3.presentFragment(krVar);
                                    break;
                                case 1:
                                    mo moVar4 = this.b;
                                    ko koVar = moVar4.P0;
                                    long j102 = moVar4.B0;
                                    if (!moVar4.s.g()) {
                                        ImageLocation imageLocation = null;
                                        TLRPC.User user22 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                        if (user22 == null) {
                                            TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                            TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                            if (chatPhoto != null && chatPhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                                int i192 = chatPhoto2.dc_id;
                                                if (i192 != 0) {
                                                    chatPhoto2.photo_big.dc_id = i192;
                                                }
                                                TLRPC.ChatFull chatFull5 = moVar4.x0;
                                                if (chatFull5 != null) {
                                                    TLRPC.Photo photo = chatFull5.chat_photo;
                                                    if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                        imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                                    }
                                                }
                                                PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        } else {
                                            TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                            if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                                PhotoViewer.u1().M2(null, moVar4, null);
                                                TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                                int i202 = userProfilePhoto2.dc_id;
                                                if (i202 != 0) {
                                                    userProfilePhoto2.photo_big.dc_id = i202;
                                                }
                                                PhotoViewer.u1().g2(null, user22.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 2:
                                    mo moVar5 = this.b;
                                    moVar5.getClass();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", moVar5.v0);
                                    bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                                    kr krVar2 = new kr(bundle2);
                                    krVar2.y0(moVar5.x0);
                                    moVar5.presentFragment(krVar2);
                                    break;
                                case 3:
                                    mo moVar6 = this.b;
                                    moVar6.presentFragment(new kh0(moVar6.v0));
                                    break;
                                case 4:
                                    mo moVar7 = this.b;
                                    moVar7.presentFragment(new hi.d4(-moVar7.v0));
                                    break;
                                case 5:
                                    mo moVar8 = this.b;
                                    moVar8.getClass();
                                    moVar8.presentFragment(new wb(moVar8.w0));
                                    break;
                                case 6:
                                    mo moVar9 = this.b;
                                    moVar9.presentFragment(w91.c0(moVar9.w0, false));
                                    break;
                                case 7:
                                    mo moVar10 = this.b;
                                    moVar10.getClass();
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putLong("bot_id", moVar10.B0);
                                    moVar10.presentFragment(new ta(bundle3));
                                    break;
                                case 8:
                                    mo moVar11 = this.b;
                                    moVar11.presentFragment(new hi.k(moVar11.B0));
                                    break;
                                case 9:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                                    break;
                                case 10:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                                    break;
                                case 11:
                                    qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                                    break;
                                case 12:
                                    this.b.j0();
                                    break;
                                case 13:
                                    mo.Y(this.b);
                                    break;
                                case 14:
                                    mo moVar12 = this.b;
                                    org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                                    break;
                                case 15:
                                    mo moVar13 = this.b;
                                    if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                        pc0 pc0Var = new pc0(4);
                                        pc0Var.e0 = -moVar13.v0;
                                        TLRPC.ChatFull chatFull6 = moVar13.x0;
                                        if (chatFull6 != null) {
                                            TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                                pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                            }
                                        }
                                        pc0Var.E0 = new fo(moVar13, 6);
                                        moVar13.presentFragment(pc0Var);
                                        break;
                                    }
                                    break;
                                case 16:
                                    mo moVar14 = this.b;
                                    long j112 = moVar14.v0;
                                    org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                                    boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                                    ap apVar = new ap(null);
                                    apVar.M = new ArrayList();
                                    apVar.N = new ArrayList();
                                    apVar.P = new ArrayList();
                                    apVar.c0 = true;
                                    apVar.f0 = new ArrayList();
                                    apVar.o0 = new HashMap();
                                    apVar.q0 = new po(apVar, 5);
                                    apVar.s0 = false;
                                    apVar.Z = j112;
                                    apVar.n0 = z152;
                                    TLRPC.ChatFull chatFull7 = moVar14.x0;
                                    apVar.Y = chatFull7;
                                    if (chatFull7 != null) {
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                        if (tL_chatInviteExported != null) {
                                            apVar.l0 = tL_chatInviteExported;
                                        } else {
                                            apVar.Z(false);
                                        }
                                    }
                                    moVar14.presentFragment(apVar);
                                    break;
                                case 17:
                                    mo moVar15 = this.b;
                                    long j122 = moVar15.v0;
                                    np npVar = new np(null);
                                    npVar.v = new ArrayList();
                                    boolean z162 = false;
                                    npVar.O = false;
                                    npVar.P = false;
                                    npVar.E = j122;
                                    TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j122));
                                    npVar.f = chat42;
                                    if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                        z162 = true;
                                    }
                                    npVar.s = z162;
                                    npVar.h = moVar15.x0;
                                    moVar15.presentFragment(npVar);
                                    break;
                                case 18:
                                    mo moVar16 = this.b;
                                    fw0 fw0Var = new fw0(moVar16.v0);
                                    fw0Var.s = new fo(moVar16, 4);
                                    moVar16.presentFragment(fw0Var);
                                    break;
                                case 19:
                                    mo.a0(this.b);
                                    break;
                                case 20:
                                    mo moVar17 = this.b;
                                    e60 e60Var = new e60(-moVar17.w0.id);
                                    e60Var.c = moVar17.K0;
                                    e60Var.l0 = moVar17;
                                    moVar17.presentFragment(e60Var);
                                    break;
                                case 21:
                                    mo moVar18 = this.b;
                                    moVar18.getClass();
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putLong("chat_id", moVar18.v0);
                                    bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                                    kr krVar3 = new kr(bundle4);
                                    krVar3.y0(moVar18.x0);
                                    moVar18.presentFragment(krVar3);
                                    break;
                                case 22:
                                    mo moVar19 = this.b;
                                    jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                                    TLRPC.ChatFull chatFull8 = moVar19.x0;
                                    jh0Var.i0(chatFull8, chatFull8.exported_invite);
                                    moVar19.presentFragment(jh0Var);
                                    break;
                                case 23:
                                    mo moVar20 = this.b;
                                    if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                        moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                        break;
                                    } else {
                                        Bundle bundle5 = new Bundle();
                                        bundle5.putLong("chat_id", moVar20.v0);
                                        vp vpVar = new vp(bundle5);
                                        TLRPC.ChatFull chatFull9 = moVar20.x0;
                                        vpVar.b = chatFull9;
                                        if (chatFull9 != null) {
                                            if (vpVar.a == null) {
                                                vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                            }
                                            vpVar.d = new ArrayList();
                                            TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                            if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                                vpVar.v = 0;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                                vpVar.v = 2;
                                            } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                                TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                                for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                                    if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                        vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                                    }
                                                }
                                                vpVar.v = 1;
                                            }
                                        }
                                        moVar20.presentFragment(vpVar);
                                        break;
                                    }
                                default:
                                    mo moVar21 = this.b;
                                    moVar21.getClass();
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putInt("chatMode", 9);
                                    bundle6.putLong("chat_id", moVar21.v0);
                                    bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                                    moVar21.presentFragment(new un(bundle6));
                                    break;
                            }
                        }
                    });
                    fp0Var.addView(new org.telegram.ui.Cells.f7(context2), org.telegram.ui.Components.gb1.r(-1, -2));
                }
                UndoView undoView = new UndoView(context2);
                moVar2.c = undoView;
                jdVar.addView(undoView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                org.telegram.ui.Components.ru ruVar6 = moVar2.v;
                TLRPC.User user3 = moVar2.C0;
                ruVar6.setText(Emoji.replaceEmoji(user3 == null ? ContactsController.formatName(user3) : moVar2.w0.title, moVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
                org.telegram.ui.Components.ru ruVar7 = moVar2.v;
                ruVar7.setSelection(ruVar7.n());
                chatFull = moVar2.x0;
                if (chatFull == null) {
                    moVar2.E.setText(chatFull.about);
                } else {
                    TLRPC.UserFull userFull4 = moVar2.D0;
                    if (userFull4 != null) {
                        moVar2.E.setText(userFull4.about);
                    }
                }
                moVar2.l0();
                moVar2.q0(true, false);
                return moVar2.fragmentView;
            }
        }
        num2 = num;
        chat = moVar.w0;
        if (chat == null) {
        }
        moVar2 = moVar;
        r11 = 0;
        chat2 = moVar2.w0;
        if (chat2 != null) {
            FrameLayout frameLayout32 = new FrameLayout(context2);
            moVar2.c0 = frameLayout32;
            fp0Var.addView(frameLayout32, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Cells.ga gaVar2 = new org.telegram.ui.Cells.ga(context2);
            moVar2.d0 = gaVar2;
            org.telegram.ui.ActionBar.f7.V(gaVar2.getTextView(), org.telegram.ui.ActionBar.y6.p7, r11);
            org.telegram.ui.ActionBar.f7.S(moVar2.d0, org.telegram.ui.ActionBar.y6.M0(false), r11, org.telegram.ui.ActionBar.f7.N(org.telegram.ui.ActionBar.y6.i6));
            if (moVar2.C0 == null) {
            }
            moVar2.c0.addView(moVar2.d0, org.telegram.ui.Components.gb1.g(-2.0f, -1));
            final int i572 = 14;
            moVar2.d0.setOnClickListener(new View.OnClickListener(moVar2) { // from class: org.telegram.ui.yn
                public final /* synthetic */ mo b;

                {
                    this.b = moVar2;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i572) {
                        case 0:
                            mo moVar3 = this.b;
                            moVar3.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", moVar3.v0);
                            bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                            kr krVar = new kr(bundle);
                            krVar.y0(moVar3.x0);
                            moVar3.presentFragment(krVar);
                            break;
                        case 1:
                            mo moVar4 = this.b;
                            ko koVar = moVar4.P0;
                            long j102 = moVar4.B0;
                            if (!moVar4.s.g()) {
                                ImageLocation imageLocation = null;
                                TLRPC.User user22 = j102 == 0 ? null : moVar4.getMessagesController().getUser(Long.valueOf(j102));
                                if (user22 == null) {
                                    TLRPC.Chat chat32 = moVar4.getMessagesController().getChat(Long.valueOf(moVar4.v0));
                                    TLRPC.ChatPhoto chatPhoto = chat32.photo;
                                    if (chatPhoto != null && chatPhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.ChatPhoto chatPhoto2 = chat32.photo;
                                        int i192 = chatPhoto2.dc_id;
                                        if (i192 != 0) {
                                            chatPhoto2.photo_big.dc_id = i192;
                                        }
                                        TLRPC.ChatFull chatFull5 = moVar4.x0;
                                        if (chatFull5 != null) {
                                            TLRPC.Photo photo = chatFull5.chat_photo;
                                            if ((photo instanceof TLRPC.TL_photo) && !photo.video_sizes.isEmpty()) {
                                                imageLocation = ImageLocation.getForPhoto(moVar4.x0.chat_photo.video_sizes.get(0), moVar4.x0.chat_photo);
                                            }
                                        }
                                        PhotoViewer.u1().g2(null, chat32.photo.photo_big, null, imageLocation, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                } else {
                                    TLRPC.UserProfilePhoto userProfilePhoto = user22.photo;
                                    if (userProfilePhoto != null && userProfilePhoto.photo_big != null) {
                                        PhotoViewer.u1().M2(null, moVar4, null);
                                        TLRPC.UserProfilePhoto userProfilePhoto2 = user22.photo;
                                        int i202 = userProfilePhoto2.dc_id;
                                        if (i202 != 0) {
                                            userProfilePhoto2.photo_big.dc_id = i202;
                                        }
                                        PhotoViewer.u1().g2(null, user22.photo.photo_big, null, null, null, null, null, 0, koVar, null, 0L, 0L, 0L, true, null, null);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            mo moVar5 = this.b;
                            moVar5.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putLong("chat_id", moVar5.v0);
                            bundle2.putInt(TeXSymbolParser.TYPE_ATTR, 2);
                            kr krVar2 = new kr(bundle2);
                            krVar2.y0(moVar5.x0);
                            moVar5.presentFragment(krVar2);
                            break;
                        case 3:
                            mo moVar6 = this.b;
                            moVar6.presentFragment(new kh0(moVar6.v0));
                            break;
                        case 4:
                            mo moVar7 = this.b;
                            moVar7.presentFragment(new hi.d4(-moVar7.v0));
                            break;
                        case 5:
                            mo moVar8 = this.b;
                            moVar8.getClass();
                            moVar8.presentFragment(new wb(moVar8.w0));
                            break;
                        case 6:
                            mo moVar9 = this.b;
                            moVar9.presentFragment(w91.c0(moVar9.w0, false));
                            break;
                        case 7:
                            mo moVar10 = this.b;
                            moVar10.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("bot_id", moVar10.B0);
                            moVar10.presentFragment(new ta(bundle3));
                            break;
                        case 8:
                            mo moVar11 = this.b;
                            moVar11.presentFragment(new hi.k(moVar11.B0));
                            break;
                        case 9:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-intro");
                            break;
                        case 10:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0) + "-commands");
                            break;
                        case 11:
                            qf.d.r(view.getContext(), "https://t.me/BotFather?start=" + mo.h0(this.b.C0));
                            break;
                        case 12:
                            this.b.j0();
                            break;
                        case 13:
                            mo.Y(this.b);
                            break;
                        case 14:
                            mo moVar12 = this.b;
                            org.telegram.ui.Components.g5.r(moVar12, false, moVar12.w0, null, false, true, true, false, new fo(moVar12, 7));
                            break;
                        case 15:
                            mo moVar13 = this.b;
                            if (AndroidUtilities.isMapsInstalled(moVar13)) {
                                pc0 pc0Var = new pc0(4);
                                pc0Var.e0 = -moVar13.v0;
                                TLRPC.ChatFull chatFull6 = moVar13.x0;
                                if (chatFull6 != null) {
                                    TLRPC.ChannelLocation channelLocation = chatFull6.location;
                                    if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                        pc0Var.z0 = (TLRPC.TL_channelLocation) channelLocation;
                                    }
                                }
                                pc0Var.E0 = new fo(moVar13, 6);
                                moVar13.presentFragment(pc0Var);
                                break;
                            }
                            break;
                        case 16:
                            mo moVar14 = this.b;
                            long j112 = moVar14.v0;
                            org.telegram.ui.Cells.v8 v8Var72 = moVar14.H;
                            boolean z152 = v8Var72 != null && v8Var72.getVisibility() == 0;
                            ap apVar = new ap(null);
                            apVar.M = new ArrayList();
                            apVar.N = new ArrayList();
                            apVar.P = new ArrayList();
                            apVar.c0 = true;
                            apVar.f0 = new ArrayList();
                            apVar.o0 = new HashMap();
                            apVar.q0 = new po(apVar, 5);
                            apVar.s0 = false;
                            apVar.Z = j112;
                            apVar.n0 = z152;
                            TLRPC.ChatFull chatFull7 = moVar14.x0;
                            apVar.Y = chatFull7;
                            if (chatFull7 != null) {
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull7.exported_invite;
                                if (tL_chatInviteExported != null) {
                                    apVar.l0 = tL_chatInviteExported;
                                } else {
                                    apVar.Z(false);
                                }
                            }
                            moVar14.presentFragment(apVar);
                            break;
                        case 17:
                            mo moVar15 = this.b;
                            long j122 = moVar15.v0;
                            np npVar = new np(null);
                            npVar.v = new ArrayList();
                            boolean z162 = false;
                            npVar.O = false;
                            npVar.P = false;
                            npVar.E = j122;
                            TLRPC.Chat chat42 = npVar.getMessagesController().getChat(Long.valueOf(j122));
                            npVar.f = chat42;
                            if (ChatObject.isChannel(chat42) && !npVar.f.megagroup) {
                                z162 = true;
                            }
                            npVar.s = z162;
                            npVar.h = moVar15.x0;
                            moVar15.presentFragment(npVar);
                            break;
                        case 18:
                            mo moVar16 = this.b;
                            fw0 fw0Var = new fw0(moVar16.v0);
                            fw0Var.s = new fo(moVar16, 4);
                            moVar16.presentFragment(fw0Var);
                            break;
                        case 19:
                            mo.a0(this.b);
                            break;
                        case 20:
                            mo moVar17 = this.b;
                            e60 e60Var = new e60(-moVar17.w0.id);
                            e60Var.c = moVar17.K0;
                            e60Var.l0 = moVar17;
                            moVar17.presentFragment(e60Var);
                            break;
                        case 21:
                            mo moVar18 = this.b;
                            moVar18.getClass();
                            Bundle bundle4 = new Bundle();
                            bundle4.putLong("chat_id", moVar18.v0);
                            bundle4.putInt(TeXSymbolParser.TYPE_ATTR, ((moVar18.H0 || moVar18.w0.gigagroup) && !ChatObject.isCommunity(moVar18.w0)) ? 0 : 3);
                            kr krVar3 = new kr(bundle4);
                            krVar3.y0(moVar18.x0);
                            moVar18.presentFragment(krVar3);
                            break;
                        case 22:
                            mo moVar19 = this.b;
                            jh0 jh0Var = new jh0(moVar19.v0, 0L, 0);
                            TLRPC.ChatFull chatFull8 = moVar19.x0;
                            jh0Var.i0(chatFull8, chatFull8.exported_invite);
                            moVar19.presentFragment(jh0Var);
                            break;
                        case 23:
                            mo moVar20 = this.b;
                            if (ChatObject.isChannelAndNotMegaGroup(moVar20.w0)) {
                                moVar20.presentFragment(new bh.u(moVar20.v0, moVar20.x0));
                                break;
                            } else {
                                Bundle bundle5 = new Bundle();
                                bundle5.putLong("chat_id", moVar20.v0);
                                vp vpVar = new vp(bundle5);
                                TLRPC.ChatFull chatFull9 = moVar20.x0;
                                vpVar.b = chatFull9;
                                if (chatFull9 != null) {
                                    if (vpVar.a == null) {
                                        vpVar.a = vpVar.getMessagesController().getChat(Long.valueOf(vpVar.c));
                                    }
                                    vpVar.d = new ArrayList();
                                    TLRPC.ChatReactions chatReactions = chatFull9.available_reactions;
                                    if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                                        vpVar.v = 0;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsNone) {
                                        vpVar.v = 2;
                                    } else if (chatReactions instanceof TLRPC.TL_chatReactionsSome) {
                                        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
                                        for (int i212 = 0; i212 < tL_chatReactionsSome.reactions.size(); i212++) {
                                            if (tL_chatReactionsSome.reactions.get(i212) instanceof TLRPC.TL_reactionEmoji) {
                                                vpVar.d.add(((TLRPC.TL_reactionEmoji) tL_chatReactionsSome.reactions.get(i212)).emoticon);
                                            }
                                        }
                                        vpVar.v = 1;
                                    }
                                }
                                moVar20.presentFragment(vpVar);
                                break;
                            }
                        default:
                            mo moVar21 = this.b;
                            moVar21.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt("chatMode", 9);
                            bundle6.putLong("chat_id", moVar21.v0);
                            bundle6.putLong("welcome_messages_chat_id", moVar21.v0);
                            moVar21.presentFragment(new un(bundle6));
                            break;
                    }
                }
            });
            fp0Var.addView(new org.telegram.ui.Cells.f7(context2), org.telegram.ui.Components.gb1.r(-1, -2));
        }
        UndoView undoView2 = new UndoView(context2);
        moVar2.c = undoView2;
        jdVar.addView(undoView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        org.telegram.ui.Components.ru ruVar62 = moVar2.v;
        TLRPC.User user32 = moVar2.C0;
        ruVar62.setText(Emoji.replaceEmoji(user32 == null ? ContactsController.formatName(user32) : moVar2.w0.title, moVar2.v.getEditText().getPaint().getFontMetricsInt(), true));
        org.telegram.ui.Components.ru ruVar72 = moVar2.v;
        ruVar72.setSelection(ruVar72.n());
        chatFull = moVar2.x0;
        if (chatFull == null) {
        }
        moVar2.l0();
        moVar2.q0(true, false);
        return moVar2.fragmentView;
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
        org.telegram.ui.Cells.v8 v8Var;
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
                g0();
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
                        v8Var = this.Q;
                        if (v8Var != null) {
                            v8Var.getCheckBox().setIcon(this.F0 ? 0 : R.drawable.permission_locked);
                        }
                    }
                    z10 = false;
                    this.F0 = z10;
                    v8Var = this.Q;
                    if (v8Var != null) {
                    }
                }
                if (ChatObject.isChannel(this.w0) && !this.x0.hidden_prehistory) {
                    z11 = false;
                }
                this.I0 = z11;
                q0(false, false);
                if (z12) {
                    i0();
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
            org.telegram.ui.Cells.v8 v8Var2 = this.Q;
            if (v8Var2 != null) {
                v8Var2.setChecked(booleanValue);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0) {
                l0();
            }
            if ((intValue & MessagesController.UPDATE_MASK_NAME) != 0) {
                s0();
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
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var == null || j5Var.getLastFragment() != this) {
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
                t0(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.botStarsUpdated) {
            if (i10 == NotificationCenter.userInfoDidLoad) {
                if (((Long) objArr[0]).longValue() == j10) {
                    n0(getMessagesController().getUserFull(j10));
                    return;
                }
                return;
            } else {
                if (i10 == NotificationCenter.channelConnectedBotsUpdate) {
                    ((Long) objArr[0]).getClass();
                    return;
                }
                if (i10 == NotificationCenter.dialogDeleted && (-this.v0) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
                    if (j5Var2 == null || j5Var2.getLastFragment() != this) {
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
                bi.m0 g7 = bi.m0.g(this.currentAccount);
                this.m0.setVisibility(g7.a(j10) ? 0 : 8);
                this.m0.w(bi.dd.W0(false, TextUtils.concat("XTR", bi.dd.I0(g7.c(j10), 0.8f, ' ')), 0.85f, null), true);
                org.telegram.ui.Cells.v8 v8Var3 = this.k0;
                if (v8Var3 != null) {
                    v8Var3.setNeedDivider(g7.a(j10) || g7.b(j10));
                }
                this.S.setVisibility((this.m0.getVisibility() == 0 || this.l0.getVisibility() == 0) ? 0 : 8);
            }
            if (this.l0 != null) {
                bi.m0 g10 = bi.m0.g(this.currentAccount);
                this.l0.setVisibility(g10.b(j10) ? 0 : 8);
                long i14 = g10.i(j10);
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
                org.telegram.ui.Cells.v8 v8Var4 = this.k0;
                if (v8Var4 != null) {
                    if (!g10.a(j10) && !g10.b(j10)) {
                        z11 = false;
                    }
                    v8Var4.setNeedDivider(z11);
                }
                LinearLayout linearLayout = this.S;
                if (this.m0.getVisibility() != 0 && this.l0.getVisibility() != 0) {
                    i13 = 8;
                }
                linearLayout.setVisibility(i13);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void dismissCurrentDialog() {
        if (this.s.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean dismissDialogOnPause(Dialog dialog) {
        return dialog != this.s.c && super.dismissDialogOnPause(dialog);
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean f0(boolean z10) {
        org.telegram.ui.Components.ru ruVar;
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
            org.telegram.ui.Components.ru ruVar2 = this.v;
            if ((ruVar2 == null || this.C0.first_name.equals(ruVar2.getText().toString())) && ((editTextBoldCursor2 = this.E) == null || str3.equals(editTextBoldCursor2.getText().toString()))) {
                return true;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.a.T = LocaleController.getString(R.string.BotSettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new fo(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new fo(this, 1));
                showDialog(alertDialog$Builder.a);
                return false;
            }
        } else {
            TLRPC.ChatFull chatFull = this.x0;
            if (chatFull != null && (str = chatFull.about) != null) {
                str3 = str;
            }
            if ((chatFull == null || !ChatObject.isChannel(this.w0) || this.x0.hidden_prehistory == this.I0) && (((ruVar = this.v) == null || this.w0.title.equals(ruVar.getText().toString())) && (((editTextBoldCursor = this.E) == null || str3.equals(editTextBoldCursor.getText().toString())) && this.E0 == this.w0.forum))) {
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
                alertDialog$Builder2.k(LocaleController.getString("ApplyTheme", R.string.ApplyTheme), new fo(this, 2));
                alertDialog$Builder2.h(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new fo(this, 3));
                showDialog(alertDialog$Builder2.a);
            }
        }
        return false;
    }

    public final void g0() {
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

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final String getInitialSearchString() {
        return this.v.getText().toString();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.gp0 getScrollViewForSimpleGlass() {
        return this.x;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        lo loVar = this.b0;
        int i10 = org.telegram.ui.ActionBar.y6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(loVar, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b0, 4, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.b0, 0, new Class[]{org.telegram.ui.Cells.v8.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.T, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.W, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.V, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.Cells.v8 v8Var = this.U;
        if (v8Var != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(v8Var, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.X, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.I, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.N, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.H, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.v, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.l6));
        LinearLayout linearLayout = this.y;
        int i11 = org.telegram.ui.ActionBar.y6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h7(linearLayout, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.F, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.c0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d0, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.d0, 4, new Class[]{org.telegram.ui.Cells.ga.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.O, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.Cells.v8 v8Var2 = this.K;
        if (v8Var2 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(v8Var2, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        org.telegram.ui.Cells.v8 v8Var3 = this.a0;
        if (v8Var3 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(v8Var3, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        }
        return arrayList;
    }

    public final void i0() {
        TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
        tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-this.v0);
        tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
        tL_messages_getExportedChatInvites.limit = 0;
        getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new eo(this, 0));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        this.s.n(this.u0 != null, new go(this, 0), new u5(this, 5), 0);
        this.Q0.M(0);
        this.Q0.P(43);
        this.b0.e.d();
    }

    public final void k0() {
        org.telegram.ui.Components.ru ruVar;
        String str;
        String str2;
        if (this.M0 || (ruVar = this.v) == null) {
            return;
        }
        if (ruVar.a.length() == 0) {
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
            int i11 = 8;
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
            this.b = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
            this.b.setOnCancelListener(new bi.f0(this, getConnectionsManager().sendRequest(setbotinfo, new z7(i11, this, setbotinfo)), i10));
            this.b.show();
            return;
        }
        if (!ChatObject.isChannel(this.w0) && (!this.I0 || this.E0)) {
            getMessagesController().convertToMegaGroup(getParentActivity(), this.v0, this, new fo(this, 5));
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
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, null);
            this.b = e2Var;
            e2Var.setOnCancelListener(new fg(this, r0));
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
                for (int i12 = 0; i12 < fragmentStack.size(); i12++) {
                    if ((fragmentStack.get(i12) instanceof un) && ((un) fragmentStack.get(i12)).getArguments().getLong("chat_id") == this.v0) {
                        ((ActionBarLayout) getParentLayout()).a0(i12);
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        org.telegram.ui.ActionBar.j5 parentLayout = getParentLayout();
                        HashSet hashSet = af1.q1;
                        ((ActionBarLayout) parentLayout).c(i12, af1.E0(getMessagesController(), getMessagesStorage(), bundle));
                    }
                }
            }
            if (r0 != 0) {
                r0();
            }
        }
        finishFragment();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0() {
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
        org.telegram.ui.Components.j9 j9Var = this.r;
        if (user == null ? chat.photo == null : user.photo == null) {
            this.e.setImageDrawable(j9Var);
        } else {
            TLRPC.Chat chat2 = user != null ? user : chat;
            this.u0 = user != null ? user.photo.photo_small : chat.photo.photo_small;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(this.currentAccount, chat2, 1);
            this.e.f(chat2, j9Var);
            if (forUserOrChat != null) {
                z10 = true;
                if (this.b0 != null) {
                    if (z10 || this.s.g()) {
                        this.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetNewPhoto", R.string.ChatSetNewPhoto), true);
                    } else {
                        this.b0.o(R.drawable.msg_addphoto, LocaleController.getString("ChatSetPhotoOrVideo", R.string.ChatSetPhotoOrVideo), true);
                    }
                    if (this.Q0 == null) {
                        this.Q0 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
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

    public final void m0(TLRPC.ChatFull chatFull) {
        org.telegram.ui.Components.t5 n10;
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
                                n10 = org.telegram.ui.Components.t5.m(UserConfig.selectedAccount, org.telegram.ui.Components.t5.g(), tL_availableReaction.activate_animation);
                            }
                        } else {
                            n10 = reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? org.telegram.ui.Components.t5.n(UserConfig.selectedAccount, ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id, null, org.telegram.ui.Components.t5.g()) : null;
                        }
                        if (n10 != null) {
                            arrayList2.add(n10);
                            n10.b(null);
                        }
                    }
                } else if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
                    for (TLRPC.TL_availableReaction tL_availableReaction2 : MediaDataController.getInstance(UserConfig.selectedAccount).getEnabledReactionsList()) {
                        if (tL_availableReaction2 != null) {
                            org.telegram.ui.Components.t5 m10 = org.telegram.ui.Components.t5.m(UserConfig.selectedAccount, org.telegram.ui.Components.t5.g(), tL_availableReaction2.activate_animation);
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
        g0();
    }

    public final void n0(TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.BotInfo botInfo2;
        this.D0 = userFull;
        if (userFull != null) {
            if (this.C0 == null) {
                long j10 = this.B0;
                this.C0 = j10 == 0 ? null : getMessagesController().getUser(Long.valueOf(j10));
            }
            org.telegram.ui.Cells.v8 v8Var = this.n0;
            if (v8Var != null) {
                v8Var.h(45, this.D0 == null, true);
                TLRPC.UserFull userFull2 = this.D0;
                if (userFull2 != null) {
                    this.n0.w(userFull2.starref_program == null ? LocaleController.getString(R.string.AffiliateProgramBotOff) : String.format(Locale.US, "%.1f%%", Float.valueOf(r6.commission_permille / 10.0f)), false);
                }
            }
            org.telegram.ui.Cells.v8 v8Var2 = this.t0;
            if (v8Var2 != null) {
                TLRPC.UserFull userFull3 = this.D0;
                v8Var2.setVisibility((userFull3 == null || (botInfo2 = userFull3.bot_info) == null || botInfo2.verifier_settings == null) ? 8 : 0);
            }
            org.telegram.ui.Cells.i9 i9Var = this.s0;
            if (i9Var != null) {
                TLRPC.UserFull userFull4 = this.D0;
                i9Var.setVisibility((userFull4 == null || (botInfo = userFull4.bot_info) == null || botInfo.verifier_settings == null) ? 8 : 0);
            }
        }
    }

    public final void o0(boolean z10, boolean z11) {
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
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.f, (Property<fi.f6, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.n;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.f, (Property<fi.f6, Float>) property2, 0.0f));
        }
        this.h.setDuration(180L);
        this.h.addListener(new jo(i10, this, z10));
        this.h.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.s.h(i10, i11, intent);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.ru ruVar = this.v;
        if (ruVar == null || !ruVar.e) {
            return f0(z10);
        }
        if (!z10) {
            return false;
        }
        ruVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
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
    @Override // org.telegram.ui.ActionBar.r2
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
            org.telegram.ui.Components.j9 j9Var = this.r;
            if (chat == null) {
            }
            org.telegram.ui.Components.g50 g50Var = this.s;
            g50Var.a = this;
            g50Var.b = this;
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
        org.telegram.ui.Components.j9 j9Var2 = this.r;
        if (chat == null) {
            this.y0 = TLRPC.TL_chatAdminRights.clone(chat.admin_rights);
            this.z0 = TLRPC.TL_chatBannedRights.clone(this.w0.banned_rights);
            this.A0 = TLRPC.TL_chatBannedRights.clone(this.w0.default_banned_rights);
            j9Var2.n(5L, this.w0.title, null);
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
            j9Var2.n(5L, this.C0.first_name, null);
            this.H0 = false;
            this.E0 = false;
            this.G0 = false;
            this.F0 = false;
            getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
            if (this.C0.bot) {
                getNotificationCenter().addObserver(this, NotificationCenter.botStarsUpdated);
            }
        }
        org.telegram.ui.Components.g50 g50Var2 = this.s;
        g50Var2.a = this;
        g50Var2.b = this;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.channelRightsUpdated);
        if (this.x0 != null) {
            i0();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.ui.Components.g50 g50Var = this.s;
        if (g50Var != null) {
            g50Var.d();
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
        org.telegram.ui.Components.ru ruVar = this.v;
        if (ruVar != null) {
            ruVar.o();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.setTranslationY(-i13);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        ArrayList arrayList = this.O0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.t5) obj).p(null);
        }
        org.telegram.ui.Components.ru ruVar = this.v;
        if (ruVar != null) {
            ruVar.r();
        }
        UndoView undoView = this.c;
        if (undoView != null) {
            undoView.d(0, true);
        }
        this.s.i();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.s.j(i10, strArr, iArr);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.ru ruVar = this.v;
        if (ruVar != null) {
            ruVar.s();
            this.v.getEditText().requestFocus();
        }
        p0();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        q0(true, true);
        this.s.k();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null) {
                org.telegram.ui.ActionBar.f7.m(editTextBoldCursor, 30, org.telegram.ui.ActionBar.y6.G6, null);
            }
            di.k4 k4Var = this.e;
            if (k4Var != null) {
                k4Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0() {
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        mp0 mp0Var;
        int w02;
        ArrayList<Integer> arrayList;
        wo0 wo0Var = this.L;
        if (wo0Var != null) {
            TLRPC.Chat chat = this.w0;
            org.telegram.ui.Cells.v8 v8Var3 = this.N;
            boolean z10 = (v8Var3 != null && v8Var3.getVisibility() == 0) || ((v8Var = this.Q) != null && v8Var.getVisibility() == 0) || ((ChatObject.isMegagroup(this.w0) && ChatObject.hasAdminRights(this.w0)) || ((v8Var2 = this.M) != null && v8Var2.getVisibility() == 0));
            Paint paint = wo0Var.n;
            int i10 = wo0Var.a;
            org.telegram.ui.ActionBar.u6 u6Var = wo0Var.d;
            if (chat == null) {
                return;
            }
            wo0Var.v = z10;
            wo0Var.r = new org.telegram.ui.Components.q11(Emoji.replaceEmoji(chat.title, org.telegram.ui.ActionBar.y6.o2.getFontMetricsInt(), false), 13.0f, AndroidUtilities.bold());
            mp0 mp0Var2 = wo0Var.w;
            if (mp0Var2 != null) {
                mp0Var2.e(null);
            }
            TLRPC.EmojiStatus emojiStatus = chat.emoji_status;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                int i11 = mp0.j;
                int i12 = tL_emojiStatusCollectible.center_color | (-16777216);
                wo0Var.w = new mp0(tL_emojiStatusCollectible.document_id, i12, i12, i12);
            } else {
                if (ChatObject.getProfileColorId(chat) >= 0) {
                    mp0Var = mp0.c(i10, ChatObject.getProfileColorId(chat));
                    mp0Var.a = AndroidUtilities.dp(11.0f);
                    mp0Var.d();
                } else {
                    mp0Var = null;
                }
                wo0Var.w = mp0Var;
            }
            mp0 mp0Var3 = wo0Var.w;
            if (mp0Var3 != null) {
                mp0Var3.e(wo0Var);
            }
            TLRPC.PeerColor peerColor = chat.color;
            if (peerColor instanceof TLRPC.TL_peerColorCollectible) {
                TLRPC.TL_peerColorCollectible tL_peerColorCollectible = (TLRPC.TL_peerColorCollectible) peerColor;
                boolean a2 = u6Var != null ? u6Var.a() : org.telegram.ui.ActionBar.y6.I.q();
                int i13 = (!a2 || (tL_peerColorCollectible.flags & 1) == 0) ? tL_peerColorCollectible.accent_color : tL_peerColorCollectible.dark_accent_color;
                if (!a2 || (arrayList = tL_peerColorCollectible.dark_colors) == null) {
                    arrayList = tL_peerColorCollectible.colors;
                }
                int intValue = arrayList.get(0).intValue() | (-16777216);
                int intValue2 = arrayList.size() >= 2 ? arrayList.get(1).intValue() | (-16777216) : intValue;
                int intValue3 = arrayList.size() >= 3 ? arrayList.get(2).intValue() | (-16777216) : intValue;
                wo0Var.r.o(i13);
                paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, i13));
                mp0 mp0Var4 = new mp0(tL_peerColorCollectible.gift_emoji_id, intValue, intValue2, intValue3);
                mp0Var4.a = AndroidUtilities.dp(11.0f);
                mp0Var4.d();
                wo0Var.x = mp0Var4;
                mp0Var4.e(wo0Var);
                return;
            }
            int colorId = ChatObject.getColorId(chat);
            if (colorId < 7) {
                int i14 = org.telegram.ui.ActionBar.y6.r8[colorId];
                wo0Var.s = i14;
                w02 = org.telegram.ui.ActionBar.y6.w0(i14, u6Var);
            } else {
                MessagesController.PeerColors peerColors = MessagesController.getInstance(UserConfig.selectedAccount).peerColors;
                MessagesController.PeerColor color = peerColors != null ? peerColors.getColor(colorId) : null;
                if (color != null) {
                    wo0Var.s = -1;
                    w02 = color.getColor1();
                } else {
                    int i15 = org.telegram.ui.ActionBar.y6.r8[0];
                    wo0Var.s = i15;
                    w02 = org.telegram.ui.ActionBar.y6.w0(i15, u6Var);
                }
            }
            wo0Var.r.o(w02);
            paint.setColor(org.telegram.ui.ActionBar.y6.o1(0.1f, w02));
            mp0 a10 = mp0.a(i10, colorId);
            a10.a = AndroidUtilities.dp(11.0f);
            a10.d();
            wo0Var.x = a10;
            a10.e(wo0Var);
        }
    }

    public final void q0(boolean z10, boolean z11) {
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
        org.telegram.ui.Cells.v8 v8Var;
        org.telegram.ui.Cells.v8 v8Var2;
        org.telegram.ui.Cells.v8 v8Var3;
        org.telegram.ui.Cells.v8 v8Var4;
        int i15;
        String str3;
        org.telegram.ui.Cells.v8 v8Var5;
        org.telegram.ui.Cells.v8 v8Var6;
        org.telegram.ui.Cells.v8 v8Var7;
        org.telegram.ui.Cells.v8 v8Var8;
        org.telegram.ui.Cells.v8 v8Var9;
        TLRPC.Chat chat;
        if (z10 && (chat = getMessagesController().getChat(Long.valueOf(this.v0))) != null) {
            this.w0 = chat;
        }
        boolean isPublic = ChatObject.isPublic(this.w0);
        org.telegram.ui.Cells.i9 i9Var = this.P;
        if (i9Var != null) {
            i9Var.setVisibility((this.I != null || ((v8Var7 = this.J) != null && v8Var7.getVisibility() == 0) || (((v8Var8 = this.N) != null && v8Var8.getVisibility() == 0) || ((v8Var9 = this.H) != null && v8Var9.getVisibility() == 0))) ? 0 : 8);
        }
        org.telegram.ui.Cells.v8 v8Var10 = this.Y;
        if (v8Var10 != null) {
            v8Var10.setVisibility(ChatObject.isChannel(this.w0) ? 0 : 8);
        }
        org.telegram.ui.Cells.v8 v8Var11 = this.J;
        if (v8Var11 != null) {
            TLRPC.ChatFull chatFull2 = this.x0;
            if (chatFull2 == null || (!this.H0 && chatFull2.linked_chat_id == 0)) {
                v8Var11.setVisibility(8);
            } else {
                v8Var11.setVisibility(0);
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
                            this.J.u(LocaleController.getString("Discussion", R.string.Discussion), org.telegram.ui.Components.b10.j("@", publicUsername), false, R.drawable.msg_discuss, true);
                        }
                    } else {
                        String publicUsername2 = ChatObject.getPublicUsername(chat2);
                        if (TextUtils.isEmpty(publicUsername2)) {
                            org.telegram.ui.Cells.v8 v8Var12 = this.J;
                            String string2 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String str4 = chat2.title;
                            int i16 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.v8 v8Var13 = this.Q;
                            v8Var12.u(string2, str4, false, i16, v8Var13 != null && v8Var13.getVisibility() == 0);
                        } else {
                            org.telegram.ui.Cells.v8 v8Var14 = this.J;
                            String string3 = LocaleController.getString("LinkedChannel", R.string.LinkedChannel);
                            String j10 = org.telegram.ui.Components.b10.j("@", publicUsername2);
                            int i17 = R.drawable.msg_channel;
                            org.telegram.ui.Cells.v8 v8Var15 = this.Q;
                            v8Var14.u(string3, j10, false, i17, v8Var15 != null && v8Var15.getVisibility() == 0);
                        }
                    }
                }
            }
        }
        org.telegram.ui.Cells.v8 v8Var16 = this.H;
        if (v8Var16 != null) {
            TLRPC.ChatFull chatFull3 = this.x0;
            if (chatFull3 == null || !chatFull3.can_set_location) {
                v8Var16.setVisibility(8);
            } else {
                v8Var16.setVisibility(0);
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
                    org.telegram.ui.Cells.v8 v8Var17 = this.I;
                    String string4 = LocaleController.getString("ChannelType", R.string.ChannelType);
                    int i18 = R.drawable.msg_channel;
                    org.telegram.ui.Cells.v8 v8Var18 = this.N;
                    v8Var17.u(string4, str5, false, i18, (v8Var18 != null && v8Var18.getVisibility() == 0) || ((v8Var3 = this.J) != null && v8Var3.getVisibility() == 0) || ((v8Var4 = this.Q) != null && v8Var4.getVisibility() == 0));
                } else {
                    org.telegram.ui.Cells.v8 v8Var19 = this.I;
                    String string5 = LocaleController.getString("GroupType", R.string.GroupType);
                    int i19 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.v8 v8Var20 = this.N;
                    v8Var19.u(string5, str5, false, i19, (v8Var20 != null && v8Var20.getVisibility() == 0) || ((v8Var = this.J) != null && v8Var.getVisibility() == 0) || ((v8Var2 = this.Q) != null && v8Var2.getVisibility() == 0));
                }
            } else {
                String string6 = !isPublic ? LocaleController.getString("TypeLocationGroupEdit", R.string.TypeLocationGroupEdit) : String.format(a1.g.s(new StringBuilder("https://"), getMessagesController().linkPrefix, "/%s"), ChatObject.getPublicUsername(this.w0));
                org.telegram.ui.Cells.v8 v8Var21 = this.I;
                String string7 = LocaleController.getString("TypeLocationGroup", R.string.TypeLocationGroup);
                int i20 = R.drawable.msg_channel;
                org.telegram.ui.Cells.v8 v8Var22 = this.N;
                v8Var21.u(string7, string6, false, i20, (v8Var22 != null && v8Var22.getVisibility() == 0) || ((v8Var5 = this.J) != null && v8Var5.getVisibility() == 0) || ((v8Var6 = this.Q) != null && v8Var6.getVisibility() == 0));
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
                p0();
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
                    ofFloat.addUpdateListener(new bh.b0(11, this, arrayList));
                    this.R0.addListener(new ai.l0(this, z14, arrayList, 7));
                    this.R0.setDuration(320L);
                    this.R0.setInterpolator(org.telegram.ui.Components.ds.h);
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
                org.telegram.ui.Cells.v8 v8Var23 = this.U;
                if (v8Var23 != null) {
                    if (v8Var23.getParent() == null) {
                        this.R.addView(this.U, this.R.indexOfChild(this.T) + 1, org.telegram.ui.Components.gb1.r(-1, -2));
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
                            i10 = kr.o0(tL_chatBannedRights) + i26;
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
                        org.telegram.ui.Cells.v8 v8Var24 = this.X;
                        String string8 = LocaleController.getString(R.string.ChannelBlacklist);
                        TLRPC.ChatFull chatFull5 = this.x0;
                        String format = String.format("%d", Integer.valueOf(Math.max(chatFull5.banned_count, chatFull5.kicked_count)));
                        int i27 = R.drawable.msg_user_remove;
                        org.telegram.ui.Cells.v8 v8Var25 = this.Y;
                        v8Var24.u(string8, format, false, i27, v8Var25 != null && v8Var25.getVisibility() == 0);
                        z12 = z11;
                    }
                    org.telegram.ui.Cells.v8 v8Var26 = this.U;
                    if (v8Var26 != null) {
                        String string9 = LocaleController.getString("MemberRequests", R.string.MemberRequests);
                        String format2 = String.format("%d", Integer.valueOf(this.x0.requests_pending));
                        int i28 = R.drawable.msg_requests;
                        org.telegram.ui.Cells.v8 v8Var27 = this.Y;
                        v8Var26.u(string9, format2, false, i28, v8Var27 != null && v8Var27.getVisibility() == 0);
                    }
                } else {
                    this.T.u(LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), String.format("%d", Integer.valueOf(this.x0.participants_count)), false, R.drawable.msg_groups, true);
                    org.telegram.ui.Cells.v8 v8Var28 = this.X;
                    String string10 = LocaleController.getString(R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull6 = this.x0;
                    String format3 = String.format("%d", Integer.valueOf(Math.max(chatFull6.banned_count, chatFull6.kicked_count)));
                    int i29 = R.drawable.msg_user_remove;
                    org.telegram.ui.Cells.v8 v8Var29 = this.Y;
                    v8Var28.u(string10, format3, false, i29, v8Var29 != null && v8Var29.getVisibility() == 0);
                    z12 = z11;
                }
                org.telegram.ui.Cells.v8 v8Var30 = this.W;
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
                v8Var30.u(string11, String.format("%d", Integer.valueOf(i12)), false, R.drawable.msg_admins, true);
            } else {
                z12 = z11;
                if (!this.H0 || ChatObject.isCommunity(this.w0)) {
                    org.telegram.ui.Cells.v8 v8Var31 = this.T;
                    String string12 = LocaleController.getString("ChannelMembers", R.string.ChannelMembers);
                    int i32 = R.drawable.msg_groups;
                    org.telegram.ui.Cells.v8 v8Var32 = this.Y;
                    v8Var31.o(i32, string12, v8Var32 != null && v8Var32.getVisibility() == 0);
                    if (this.w0.gigagroup) {
                        org.telegram.ui.Cells.v8 v8Var33 = this.X;
                        String string13 = LocaleController.getString(R.string.ChannelBlacklist);
                        int i33 = R.drawable.msg_chats_remove;
                        org.telegram.ui.Cells.v8 v8Var34 = this.Y;
                        v8Var33.o(i33, string13, v8Var34 != null && v8Var34.getVisibility() == 0);
                    } else {
                        this.X.o(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelPermissions), true);
                    }
                } else {
                    this.T.o(R.drawable.msg_groups, LocaleController.getString("ChannelSubscribers", R.string.ChannelSubscribers), true);
                    org.telegram.ui.Cells.v8 v8Var35 = this.X;
                    String string14 = LocaleController.getString(R.string.ChannelBlacklist);
                    int i34 = R.drawable.msg_chats_remove;
                    org.telegram.ui.Cells.v8 v8Var36 = this.Y;
                    v8Var35.o(i34, string14, v8Var36 != null && v8Var36.getVisibility() == 0);
                }
                this.W.o(R.drawable.msg_admins, LocaleController.getString("ChannelAdministrators", R.string.ChannelAdministrators), true);
            }
            this.O.setVisibility(ChatObject.canChangeChatInfo(this.w0) ? 0 : 8);
            t0(z12);
            if (this.x0 == null || !ChatObject.canUserDoAdminAction(this.w0, 3) || (isPublic && this.w0.creator)) {
                this.V.setVisibility(8);
            } else if (this.x0.invitesCount > 0) {
                this.V.u(LocaleController.getString("InviteLinks", R.string.InviteLinks), Integer.toString(this.x0.invitesCount), false, R.drawable.msg_link2, true);
            } else {
                this.V.u(LocaleController.getString("InviteLinks", R.string.InviteLinks), "1", false, R.drawable.msg_link2, true);
            }
        }
        if (this.K != null) {
            u0(null);
        }
    }

    public final void r0() {
        cy cyVar;
        tw twVar;
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
                    ((ActionBarLayout) getParentLayout()).c(i10, unVar);
                    if (!this.G0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.v0);
                        ((ActionBarLayout) getParentLayout()).c(i10, new af1(bundle));
                        i10++;
                    }
                }
            } else if (this.G0 && (fragmentStack.get(i10) instanceof af1)) {
                af1 af1Var = (af1) fragmentStack.get(i10);
                if (af1Var.g() != null && af1Var.g().id == this.v0) {
                    ((ActionBarLayout) getParentLayout()).c0(af1Var, false);
                    i10--;
                }
            } else if (this.G0 && (fragmentStack.get(i10) instanceof cy) && (cyVar = (cy) fragmentStack.get(i10)) != null && (twVar = cyVar.G3) != null && twVar.c()) {
                cyVar.G3.a();
            }
            i10++;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.g50 g50Var = this.s;
        if (g50Var != null) {
            g50Var.f = bundle.getString("path");
        }
    }

    public final void s0() {
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

    @Override // org.telegram.ui.ActionBar.r2
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.g50 g50Var = this.s;
        if (g50Var != null && (str = g50Var.f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.ru ruVar = this.v;
        if (ruVar != null) {
            String obj = ruVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    public final void t0(boolean z10) {
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

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    public final void u0(Long l4) {
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
        this.K.u(LocaleController.getString(R.string.PostSuggestions), bi.dd.W0(false, LocaleController.formatString(R.string.PostSuggestionsStars, Long.valueOf(j10)), 0.66f, null), false, R.drawable.msg_markunread, true);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }
}
