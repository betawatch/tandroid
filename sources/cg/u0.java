package cg;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import i7.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.a60;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u0 extends LinearLayout {
    public TextView a;
    public TextView b;
    public final eg.b c;
    public LinearLayout d;
    public final /* synthetic */ v0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0b9b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0d7d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0dca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0da3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0bdf  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c2f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0554 A[LOOP:0: B:226:0x0552->B:227:0x0554, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x08f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0417  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u0(v0 v0Var, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        String formatString;
        boolean z10;
        int i15;
        int i16;
        int i17;
        float f9;
        boolean z11;
        int i18;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int min;
        int i19;
        c6 c6Var;
        c6 c6Var2;
        ArrayList arrayList4;
        boolean z12;
        int i20;
        int i21;
        String str2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int size2;
        c6 c6Var3;
        int i27;
        int i28;
        c6 c6Var4;
        c6 c6Var5;
        c6 c6Var6;
        ArrayList arrayList9;
        int i29;
        ArrayList arrayList10;
        ArrayList arrayList11;
        int i30;
        int i31;
        int i32;
        int i33;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        c6 c6Var7;
        c6 c6Var8;
        int i34;
        int i35;
        c6 c6Var9;
        final int i36;
        c6 c6Var10;
        c6 c6Var11;
        c6 c6Var12;
        c6 c6Var13;
        c6 c6Var14;
        int i37;
        boolean z13;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3;
        float f10;
        float f11;
        int i38;
        org.telegram.ui.ActionBar.o2 o2Var = v0Var.n;
        this.e = v0Var;
        setOrientation(1);
        i10 = ((f3) v0Var).backgroundPaddingLeft;
        int dp = AndroidUtilities.dp(6.0f) + i10;
        i11 = ((f3) v0Var).backgroundPaddingLeft;
        setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i11, 0);
        int i39 = v0Var.d0;
        i12 = ((f3) v0Var).currentAccount;
        androidx.emoji2.text.o u12 = v0.u1(i39, i12);
        v0Var.I0 = u12;
        int i40 = u12.a;
        i13 = ((f3) v0Var).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i13);
        boolean premiumFeaturesBlocked = messagesController.premiumFeaturesBlocked();
        boolean x12 = v0Var.x1();
        if (i39 == 31) {
            str = LocaleController.getString(x12 ? R.string.BoostingAdditionalFeaturesSubtitle : R.string.BoostingAdditionalFeaturesSubtitleChannel);
        } else if (i39 == 32) {
            str = v0Var.q1(true);
        } else if (i39 == 19) {
            org.telegram.ui.Cells.s1 s1Var = v0Var.c0;
            if (s1Var != null) {
                int i41 = s1Var.getMessageObject().messageOwner.from_boosts_applied;
                TLRPC.Chat s12 = v0Var.s1();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("GroupBoostedByUserWithTimes", i41, UserObject.getFirstName(v0Var.c0.getCurrentUser())));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.GroupBoostedByUserWithDescription, s12 == null ? "" : s12.title));
                str = spannableStringBuilder.toString();
            } else if (o2Var instanceof a60) {
                str = LocaleController.formatPluralString("BoostingGroupBoostWhatAreBoostsDescription", eg.q0.g(), new Object[0]);
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(v0Var.q1(true));
                if (ChatObject.hasAdminRights(v0Var.s1()) && x12) {
                    spannableStringBuilder2.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.BoostingPremiumUserCanBoostGroupWithLink));
                }
                str = spannableStringBuilder2.toString();
            }
        } else if (i39 == 18) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = v0Var.X;
            if (tL_premium_boostsStatus4.level == 0) {
                int i42 = x12 ? R.string.GroupNeedBoostsDescription : R.string.ChannelNeedBoostsDescription;
                int i43 = tL_premium_boostsStatus4.next_level_boosts;
                str = LocaleController.formatString(i42, LocaleController.formatPluralString("MoreBoosts", i43, Integer.valueOf(i43)));
            } else {
                int i44 = x12 ? R.string.GroupNeedBoostsDescriptionNextLevel : R.string.ChannelNeedBoostsDescriptionNextLevel;
                int i45 = tL_premium_boostsStatus4.next_level_boosts;
                int i46 = tL_premium_boostsStatus4.boosts;
                str = LocaleController.formatString(i44, LocaleController.formatPluralString("MoreBoosts", i45 - i46, Integer.valueOf(i45 - i46)), LocaleController.formatPluralString("BoostStories", v0Var.X.level + 1, new Object[0]));
            }
        } else if (i39 == 20) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(v0Var.o1()));
        } else if (i39 == 24) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(v0Var.o1()));
        } else if (i39 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i39 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i39 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i39 == 25) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i39 == 26) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i39 == 27) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i39 == 28) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(x12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i39 == 22) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i39 == 23) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else if (i39 == 21) {
            int i47 = v0Var.N0;
            str = LocaleController.formatPluralString("ReactionReachLvlForReaction", i47, Integer.valueOf(i47));
        } else if (i39 == 11) {
            formatString = !v0Var.U ? ChatObject.isChannelAndNotMegaGroup(v0Var.K0) ? v0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsers2One, ContactsController.formatName((TLRPC.User) v0Var.x0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers2", v0Var.x0.size(), Integer.valueOf(v0Var.x0.size())) : v0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsers2One, ContactsController.formatName((TLRPC.User) v0Var.x0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers2", v0Var.x0.size(), Integer.valueOf(v0Var.x0.size())) : ChatObject.isChannelAndNotMegaGroup(v0Var.K0) ? v0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteChannelRestrictedUsersOne, ContactsController.formatName((TLRPC.User) v0Var.x0.get(0))) : LocaleController.formatPluralString("InviteChannelRestrictedUsers", v0Var.x0.size(), Integer.valueOf(v0Var.x0.size())) : v0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteRestrictedUsersOne, ContactsController.formatName((TLRPC.User) v0Var.x0.get(0))) : LocaleController.formatPluralString("InviteRestrictedUsers", v0Var.x0.size(), Integer.valueOf(v0Var.x0.size()));
            z10 = true;
            androidx.emoji2.text.o oVar = v0Var.I0;
            int i48 = oVar.b;
            int i49 = oVar.c;
            i15 = v0Var.s0;
            if (i39 != 3) {
                i38 = ((f3) v0Var).currentAccount;
                i15 = MessagesController.getInstance(i38).dialogFilters.size() - 1;
            } else if (i39 == 7) {
                i15 = UserConfig.getActivatedAccountsCount();
            } else if (i39 == 0) {
                i16 = ((f3) v0Var).currentAccount;
                ArrayList<TLRPC.Dialog> dialogs = MessagesController.getInstance(i16).getDialogs(0);
                int size3 = dialogs.size();
                int i50 = 0;
                for (int i51 = 0; i51 < size3; i51++) {
                    TLRPC.Dialog dialog = dialogs.get(i51);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder) && dialog.pinned) {
                        i50++;
                    }
                }
                i15 = i50;
                i17 = ((f3) v0Var).currentAccount;
                if (!UserConfig.getInstance(i17).isPremium() || v0Var.J0) {
                    i15 = i49;
                    f9 = 1.0f;
                } else {
                    i15 = i15 < 0 ? i48 : i15;
                    if (i39 != 7) {
                        f10 = i15;
                        f11 = i49;
                    } else if (i15 > i48) {
                        f10 = i15 - i48;
                        f11 = i49 - i48;
                    } else {
                        f9 = 0.5f;
                    }
                    f9 = f10 / f11;
                }
                float f12 = i48 / i49;
                if (i39 == 18 && i39 != 20 && i39 != 24 && i39 != 25 && i39 != 26) {
                    if (i39 != 29 && i39 != 22 && i39 != 23 && i39 != 19 && i39 != 30 && i39 != 35 && i39 != 21 && i39 != 27 && i39 != 28 && i39 != 32) {
                        z11 = false;
                        i15 = z11 ? 0 : i15;
                        if (i39 != 11 || i39 == 34) {
                            i18 = ((f3) v0Var).currentAccount;
                            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && (((arrayList = v0Var.z0) != null && !arrayList.isEmpty()) || ((arrayList2 = v0Var.y0) != null && arrayList2.size() >= v0Var.x0.size()))) {
                                arrayList3 = !v0Var.z0.isEmpty() ? v0Var.y0 : v0Var.z0;
                                h9 h9Var = new h9(context, false);
                                h9Var.a.q = AndroidUtilities.dp(3.33f);
                                h9Var.setSize(AndroidUtilities.dp(72.0f));
                                h9Var.setStepFactor(0.4f);
                                min = Math.min(arrayList3.size(), 3);
                                h9Var.setCount(min);
                                for (i19 = 0; i19 < min; i19++) {
                                    Long l10 = (Long) arrayList3.get(i19);
                                    l10.getClass();
                                    i30 = ((f3) v0Var).currentAccount;
                                    TLRPC.User user = MessagesController.getInstance(i30).getUser(l10);
                                    i31 = ((f3) v0Var).currentAccount;
                                    h9Var.b(i19, user, i31);
                                }
                                h9Var.a(false);
                                addView(h9Var, f6.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                                TextView textView = new TextView(context);
                                textView.setGravity(17);
                                org.telegram.ui.b.g(20.0f, 1, textView);
                                int i52 = g6.j5;
                                c6Var = ((f3) v0Var).resourcesProvider;
                                textView.setTextColor(g6.v0(i52, c6Var));
                                textView.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                                addView(textView, f6.t(-1, -2, 1, 32, 0, 32, 9));
                                TextView textView2 = new TextView(context);
                                textView2.setGravity(17);
                                textView2.setTextSize(1, 14.0f);
                                c6Var2 = ((f3) v0Var).resourcesProvider;
                                textView2.setTextColor(g6.v0(i52, c6Var2));
                                addView(textView2, f6.t(-1, -2, 1, 32, 0, 32, 19));
                                boolean z14 = i39 != 34;
                                arrayList4 = v0Var.y0;
                                if (arrayList4 != null) {
                                    arrayList10 = v0Var.y0;
                                    int size4 = arrayList10.size();
                                    arrayList11 = v0Var.z0;
                                    if (size4 >= arrayList11.size()) {
                                        z12 = true;
                                        if (arrayList3.size() == 1) {
                                            int i53 = z14 ? R.string.InviteCallMessagePremiumBlockedOne : z12 ? R.string.InviteMessagePremiumBlockedOne : R.string.InvitePremiumBlockedOne;
                                            i29 = ((f3) v0Var).currentAccount;
                                            str2 = LocaleController.formatString(i53, UserObject.getForcedFirstName(MessagesController.getInstance(i29).getUser((Long) arrayList3.get(0))));
                                        } else if (arrayList3.size() == 2) {
                                            int i54 = z14 ? R.string.InviteCallMessagePremiumBlockedTwo : z12 ? R.string.InviteMessagePremiumBlockedTwo : R.string.InvitePremiumBlockedTwo;
                                            i25 = ((f3) v0Var).currentAccount;
                                            String forcedFirstName = UserObject.getForcedFirstName(MessagesController.getInstance(i25).getUser((Long) arrayList3.get(0)));
                                            i26 = ((f3) v0Var).currentAccount;
                                            str2 = LocaleController.formatString(i54, forcedFirstName, UserObject.getForcedFirstName(MessagesController.getInstance(i26).getUser((Long) arrayList3.get(1))));
                                        } else if (arrayList3.size() == 3) {
                                            int i55 = z14 ? R.string.InviteCallMessagePremiumBlockedThree : z12 ? R.string.InviteMessagePremiumBlockedThree : R.string.InvitePremiumBlockedThree;
                                            i22 = ((f3) v0Var).currentAccount;
                                            String forcedFirstName2 = UserObject.getForcedFirstName(MessagesController.getInstance(i22).getUser((Long) arrayList3.get(0)));
                                            i23 = ((f3) v0Var).currentAccount;
                                            String forcedFirstName3 = UserObject.getForcedFirstName(MessagesController.getInstance(i23).getUser((Long) arrayList3.get(1)));
                                            i24 = ((f3) v0Var).currentAccount;
                                            str2 = LocaleController.formatString(i55, forcedFirstName2, forcedFirstName3, UserObject.getForcedFirstName(MessagesController.getInstance(i24).getUser((Long) arrayList3.get(2))));
                                        } else {
                                            String str3 = z14 ? "InviteCallMessagePremiumBlockedMany" : z12 ? "InviteMessagePremiumBlockedMany" : "InvitePremiumBlockedMany";
                                            int size5 = arrayList3.size() - 2;
                                            i20 = ((f3) v0Var).currentAccount;
                                            String forcedFirstName4 = UserObject.getForcedFirstName(MessagesController.getInstance(i20).getUser((Long) arrayList3.get(0)));
                                            i21 = ((f3) v0Var).currentAccount;
                                            String formatPluralString = LocaleController.formatPluralString(str3, size5, forcedFirstName4, UserObject.getForcedFirstName(MessagesController.getInstance(i21).getUser((Long) arrayList3.get(1))));
                                            int size6 = arrayList3.size() - 2;
                                            int themedColor = v0Var.getThemedColor(g6.h5);
                                            h9Var.b = new r1(g6.Lj, g6.Mj, -1, -1, null);
                                            h9Var.c = new zz0(j7.l1.k(size6, "+"), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                                            Paint paint = new Paint(1);
                                            h9Var.d = paint;
                                            paint.setColor(themedColor);
                                            str2 = formatPluralString;
                                        }
                                        textView2.setText(AndroidUtilities.replaceTags(str2));
                                        arrayList5 = v0Var.z0;
                                        if (arrayList5 == null) {
                                            size = 0;
                                        } else {
                                            arrayList6 = v0Var.z0;
                                            size = arrayList6.size();
                                        }
                                        arrayList7 = v0Var.y0;
                                        if (arrayList7 == null) {
                                            size2 = 0;
                                        } else {
                                            arrayList8 = v0Var.y0;
                                            size2 = arrayList8.size();
                                        }
                                        if (size - size2 > 0 || ((size == 1 && size2 == 1) || !v0Var.U)) {
                                            ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                            v0Var.f0 = true;
                                        } else {
                                            c6Var3 = ((f3) v0Var).resourcesProvider;
                                            final int i56 = 0;
                                            d1 d1Var = new d1(context, c6Var3, false);
                                            h6.b(d1Var, 0.02f, 1.2f);
                                            d1Var.a(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), new View.OnClickListener(this) { // from class: cg.r0
                                                public final /* synthetic */ u0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i56) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.o2 o2Var2 = this.b.e.G0;
                                                            if (o2Var2 != null) {
                                                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                                                m2Var.a = true;
                                                                o2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            v0 v0Var2 = this.b.e;
                                                            v0Var2.n.presentFragment(tn.R9(v0Var2.W));
                                                            v0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            }, false);
                                            i27 = ((f3) v0Var).backgroundPaddingLeft;
                                            float f13 = (i27 / AndroidUtilities.density) + 4.0f;
                                            i28 = ((f3) v0Var).backgroundPaddingLeft;
                                            addView(d1Var, f6.k(f13, 0.0f, (i28 / AndroidUtilities.density) + 4.0f, 18.0f, -1, 48));
                                            s0 s0Var = new s0(this, context);
                                            s0Var.setGravity(17);
                                            int i57 = g6.z6;
                                            c6Var4 = ((f3) v0Var).resourcesProvider;
                                            s0Var.setTextColor(g6.v0(i57, c6Var4));
                                            s0Var.setText(" " + LocaleController.getString(R.string.InvitePremiumBlockedOr) + " ");
                                            s0Var.setTextSize(14.0f);
                                            addView(s0Var, f6.t(190, -2, 1, 12, 0, 12, 20));
                                            TextView textView3 = new TextView(context);
                                            textView3.setGravity(17);
                                            textView3.setTypeface(AndroidUtilities.bold());
                                            textView3.setTextSize(1, 20.0f);
                                            c6Var5 = ((f3) v0Var).resourcesProvider;
                                            textView3.setTextColor(g6.v0(i52, c6Var5));
                                            textView3.setText(LocaleController.getString(R.string.InviteBlockedTitle));
                                            addView(textView3, f6.t(-1, -2, 1, 32, 0, 32, 9));
                                            TextView textView4 = new TextView(context);
                                            textView4.setGravity(17);
                                            textView4.setTextSize(1, 14.0f);
                                            c6Var6 = ((f3) v0Var).resourcesProvider;
                                            textView4.setTextColor(g6.v0(i52, c6Var6));
                                            arrayList9 = v0Var.z0;
                                            if (arrayList9.size() <= 1) {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedOneMessage));
                                            } else {
                                                textView4.setText(LocaleController.getString(R.string.InviteBlockedManyMessage));
                                            }
                                            addView(textView4, f6.t(-1, -2, 1, 32, 0, 32, 19));
                                        }
                                        v0Var.L1();
                                        return;
                                    }
                                }
                                z12 = false;
                                if (arrayList3.size() == 1) {
                                }
                                textView2.setText(AndroidUtilities.replaceTags(str2));
                                arrayList5 = v0Var.z0;
                                if (arrayList5 == null) {
                                }
                                arrayList7 = v0Var.y0;
                                if (arrayList7 == null) {
                                }
                                if (size - size2 > 0) {
                                }
                                ((ViewGroup.MarginLayoutParams) textView2.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                                v0Var.f0 = true;
                                v0Var.L1();
                                return;
                            }
                        }
                        if (i39 != 31 && i39 != 34) {
                            c6Var14 = ((f3) v0Var).resourcesProvider;
                            t0 t0Var = new t0(this, context, i40, i15, i49, f12, c6Var14);
                            v0Var.t0 = t0Var;
                            if (z11) {
                                t0Var.setBagePosition(f9);
                                v0Var.t0.setType(i39);
                                v0Var.t0.w.setVisibility(8);
                                if (z10) {
                                    t0 t0Var2 = v0Var.t0;
                                    t0Var2.E.setVisibility(8);
                                    w wVar = t0Var2.e;
                                    if (wVar != null) {
                                        wVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(3.0f));
                                    }
                                    t0Var2.F = true;
                                } else {
                                    i37 = ((f3) v0Var).currentAccount;
                                    if (UserConfig.getInstance(i37).isPremium() || v0Var.J0) {
                                        v0Var.t0.v.setVisibility(8);
                                        if (i39 == 6) {
                                            v0Var.t0.w.setText("2 GB");
                                        } else {
                                            v0Var.t0.w.setText(Integer.toString(i48));
                                        }
                                        z13 = false;
                                        v0Var.t0.w.setVisibility(0);
                                        if (i39 != 2 || i39 == 5) {
                                            v0Var.t0.D = z13;
                                        }
                                        addView(v0Var.t0, f6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                                    }
                                }
                            } else {
                                tL_premium_boostsStatus2 = v0Var.X;
                                if (tL_premium_boostsStatus2 != null) {
                                    t0 t0Var3 = v0Var.t0;
                                    tL_premium_boostsStatus3 = v0Var.X;
                                    ChannelBoostsController.CanApplyBoost canApplyBoost = v0Var.Y;
                                    t0Var3.e(tL_premium_boostsStatus3, canApplyBoost != null && canApplyBoost.boostedNow);
                                }
                            }
                            z13 = false;
                            if (i39 != 2) {
                            }
                            v0Var.t0.D = z13;
                            addView(v0Var.t0, f6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                        }
                        if (i39 != 31) {
                            FrameLayout frameLayout = new FrameLayout(context);
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(f0.e.d(getContext(), R.drawable.large_boosts));
                            i32 = 17;
                            frameLayout.addView(imageView, f6.e(-2, -2, 17));
                            frameLayout.setBackground(g6.K(AndroidUtilities.dp(79.0f), g6.u0(g6.Oh)));
                            addView(frameLayout, f6.t(79, 79, 1, 0, 23, 0, 0));
                        } else {
                            i32 = 17;
                        }
                        TextView textView5 = new TextView(context);
                        this.a = textView5;
                        textView5.setTypeface(AndroidUtilities.bold());
                        if (i39 != 31) {
                            this.a.setText(LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle));
                        } else if (i39 == 32) {
                            this.a.setText(v0Var.r1());
                        } else {
                            i33 = 19;
                            if (i39 == 19) {
                                if (o2Var instanceof a60) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingGroupBoostWhatAreBoosts));
                                } else {
                                    this.a.setText(v0Var.r1());
                                }
                            } else if (i39 == 30) {
                                this.a.setText(v0Var.r1());
                            } else if (i39 == 35) {
                                this.a.setText(LocaleController.getString(R.string.UnlockBoostChannelAutotranslation));
                            } else if (i39 == 18) {
                                tL_premium_boostsStatus = v0Var.X;
                                if (tL_premium_boostsStatus.level == 0) {
                                    this.a.setText(LocaleController.getString(R.string.BoostingEnableStories));
                                } else {
                                    this.a.setText(LocaleController.getString(R.string.BoostingIncreaseLevel));
                                }
                            } else if (i39 == 21) {
                                this.a.setText(LocaleController.getString(R.string.ReactionCustomReactions));
                            } else if (i39 == 20) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableColor));
                            } else if (i39 == 24) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileColor));
                            } else if (i39 == 27) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableLinkIcon));
                            } else if (i39 == 28) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableProfileIcon));
                            } else if (i39 == 25) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableEmojiStatus));
                            } else if (i39 == 26) {
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableWearCollectibles));
                            } else {
                                if (i39 != 29) {
                                    if (i39 == 22 || i39 == 23) {
                                        this.a.setText(LocaleController.getString(R.string.BoostingEnableWallpaper));
                                    } else if (i39 == 11) {
                                        if (v0Var.U) {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                                        } else {
                                            this.a.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted));
                                        }
                                    } else if (i39 == 34) {
                                        this.a.setText(LocaleController.getString(R.string.CallInviteViaLinkTitle));
                                    } else if (i39 == 6) {
                                        this.a.setText(LocaleController.getString(R.string.FileTooLarge));
                                    } else if (i39 != 14 || v0Var.T <= 1) {
                                        this.a.setText(LocaleController.getString(R.string.LimitReached));
                                    } else {
                                        this.a.setText(LocaleController.getString(R.string.CreateMultipleStories));
                                    }
                                    this.a.setTextSize(1, 20.0f);
                                    TextView textView6 = this.a;
                                    int i58 = g6.G6;
                                    c6Var7 = ((f3) v0Var).resourcesProvider;
                                    textView6.setTextColor(g6.v0(i58, c6Var7));
                                    this.a.setGravity(i32);
                                    if (i39 != i33 || i39 == 32 || v0Var.y1()) {
                                        eg.b bVar = new eg.b(context);
                                        this.c = bVar;
                                        bVar.a(v0Var.Y.boostCount, false);
                                        if (i39 == 32) {
                                            bVar.setVisibility(8);
                                        }
                                        if (v0Var.a0) {
                                            addView(this.a, f6.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 0));
                                            LinearLayout linearLayout = new LinearLayout(getContext());
                                            linearLayout.setOrientation(0);
                                            linearLayout.setClipChildren(false);
                                            FrameLayout frameLayout2 = new FrameLayout(getContext());
                                            int dp2 = AndroidUtilities.dp(14.0f);
                                            int i59 = g6.a7;
                                            c6Var8 = ((f3) v0Var).resourcesProvider;
                                            frameLayout2.setBackground(g6.b0(dp2, g6.v0(i59, c6Var8)));
                                            t9 t9Var = new t9(getContext());
                                            t9Var.setRoundRadius(AndroidUtilities.dp(14.0f));
                                            i34 = ((f3) v0Var).currentAccount;
                                            TLRPC.Chat chat = MessagesController.getInstance(i34).getChat(Long.valueOf(-v0Var.W));
                                            e9 e9Var = new e9();
                                            i35 = ((f3) v0Var).currentAccount;
                                            e9Var.k(i35, chat);
                                            t9Var.e(chat, e9Var);
                                            frameLayout2.addView(t9Var, f6.c(28.0f, 28));
                                            TextView textView7 = new TextView(getContext());
                                            if (chat != null) {
                                                textView7.setText(chat.title);
                                            }
                                            textView7.setSingleLine(true);
                                            textView7.setMaxLines(1);
                                            textView7.setEllipsize(TextUtils.TruncateAt.END);
                                            textView7.setTextSize(1, 13.0f);
                                            c6Var9 = ((f3) v0Var).resourcesProvider;
                                            textView7.setTextColor(g6.v0(i58, c6Var9));
                                            frameLayout2.addView(textView7, f6.d(-2, -2.0f, 16, 36.0f, 0.0f, 12.0f, 0.0f));
                                            linearLayout.addView(frameLayout2, f6.t(-2, 28, 80, 18, 0, 18, 0));
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setDuration(100L);
                                            layoutTransition.enableTransitionType(4);
                                            linearLayout.setLayoutTransition(layoutTransition);
                                            linearLayout.addView(bVar, f6.t(-2, -2, 48, -30, 2, 18, 0));
                                            addView(linearLayout, f6.t(-2, 38, 17, 0, -4, 0, 12));
                                            h6.a(linearLayout);
                                            i36 = 1;
                                            linearLayout.setOnClickListener(new View.OnClickListener(this) { // from class: cg.r0
                                                public final /* synthetic */ u0 b;

                                                {
                                                    this.b = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    switch (i36) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.o2 o2Var2 = this.b.e.G0;
                                                            if (o2Var2 != null) {
                                                                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                                                                m2Var.a = true;
                                                                o2Var2.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            v0 v0Var2 = this.b.e;
                                                            v0Var2.n.presentFragment(tn.R9(v0Var2.W));
                                                            v0Var2.dismiss();
                                                            break;
                                                    }
                                                }
                                            });
                                            TextView textView8 = new TextView(context);
                                            this.b = textView8;
                                            textView8.setText(AndroidUtilities.replaceTags(formatString));
                                            this.b.setTextSize(i36, 14.0f);
                                            this.b.setGravity(i36);
                                            TextView textView9 = this.b;
                                            textView9.setLineSpacing(textView9.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                            if (i39 != 18) {
                                                c6Var11 = ((f3) v0Var).resourcesProvider;
                                                if (c6Var11 instanceof lh.b) {
                                                    TextView textView10 = this.b;
                                                    int i60 = g6.y6;
                                                    c6Var13 = ((f3) v0Var).resourcesProvider;
                                                    textView10.setTextColor(g6.v0(i60, c6Var13));
                                                } else {
                                                    TextView textView11 = this.b;
                                                    c6Var12 = ((f3) v0Var).resourcesProvider;
                                                    textView11.setTextColor(g6.v0(i58, c6Var12));
                                                }
                                            } else {
                                                TextView textView12 = this.b;
                                                c6Var10 = ((f3) v0Var).resourcesProvider;
                                                textView12.setTextColor(g6.v0(i58, c6Var10));
                                            }
                                            if (i39 != i33) {
                                                addView(this.b, f6.t(-2, -2, 1, 24, -2, 24, 17));
                                            } else {
                                                addView(this.b, f6.t(-2, -2, 1, 24, 0, 24, 24));
                                            }
                                            if (i39 == 31) {
                                                ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).bottomMargin = AndroidUtilities.dp(15.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).bottomMargin = AndroidUtilities.dp(6.0f);
                                                ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = AndroidUtilities.dp(12.0f);
                                            }
                                            v0Var.L1();
                                            return;
                                        }
                                        LinearLayout linearLayout2 = new LinearLayout(context);
                                        this.d = linearLayout2;
                                        linearLayout2.setOrientation(0);
                                        this.d.setWeightSum(1.0f);
                                        this.d.addView(this.a, f6.o(-2, -2, 1.0f, 0));
                                        this.d.addView(bVar, f6.t(-2, -2, 48, 0, 2, 0, 0));
                                        addView(this.d, f6.t(-2, -2, 1, 12, z10 ? 8 : 22, 12, 9));
                                    } else {
                                        addView(this.a, f6.t(-2, -2, 1, 0, z10 ? 8 : 22, 0, 10));
                                    }
                                    i36 = 1;
                                    TextView textView82 = new TextView(context);
                                    this.b = textView82;
                                    textView82.setText(AndroidUtilities.replaceTags(formatString));
                                    this.b.setTextSize(i36, 14.0f);
                                    this.b.setGravity(i36);
                                    TextView textView92 = this.b;
                                    textView92.setLineSpacing(textView92.getLineSpacingExtra(), this.b.getLineSpacingMultiplier() * 1.1f);
                                    if (i39 != 18) {
                                    }
                                    if (i39 != i33) {
                                    }
                                    if (i39 == 31) {
                                    }
                                    v0Var.L1();
                                    return;
                                }
                                this.a.setText(LocaleController.getString(R.string.BoostingEnableGroupEmojiPack));
                            }
                            this.a.setTextSize(1, 20.0f);
                            TextView textView62 = this.a;
                            int i582 = g6.G6;
                            c6Var7 = ((f3) v0Var).resourcesProvider;
                            textView62.setTextColor(g6.v0(i582, c6Var7));
                            this.a.setGravity(i32);
                            if (i39 != i33) {
                            }
                            eg.b bVar2 = new eg.b(context);
                            this.c = bVar2;
                            bVar2.a(v0Var.Y.boostCount, false);
                            if (i39 == 32) {
                            }
                            if (v0Var.a0) {
                            }
                        }
                        i33 = 19;
                        this.a.setTextSize(1, 20.0f);
                        TextView textView622 = this.a;
                        int i5822 = g6.G6;
                        c6Var7 = ((f3) v0Var).resourcesProvider;
                        textView622.setTextColor(g6.v0(i5822, c6Var7));
                        this.a.setGravity(i32);
                        if (i39 != i33) {
                        }
                        eg.b bVar22 = new eg.b(context);
                        this.c = bVar22;
                        bVar22.a(v0Var.Y.boostCount, false);
                        if (i39 == 32) {
                        }
                        if (v0Var.a0) {
                        }
                    }
                }
                z11 = true;
                if (z11) {
                }
                if (i39 != 11) {
                }
                i18 = ((f3) v0Var).currentAccount;
                if (!MessagesController.getInstance(i18).premiumFeaturesBlocked()) {
                    if (!v0Var.z0.isEmpty()) {
                    }
                    h9 h9Var2 = new h9(context, false);
                    h9Var2.a.q = AndroidUtilities.dp(3.33f);
                    h9Var2.setSize(AndroidUtilities.dp(72.0f));
                    h9Var2.setStepFactor(0.4f);
                    min = Math.min(arrayList3.size(), 3);
                    h9Var2.setCount(min);
                    while (i19 < min) {
                    }
                    h9Var2.a(false);
                    addView(h9Var2, f6.t(((min - 1) * 30) + 72, 72, 1, 0, 16, 0, 13));
                    TextView textView13 = new TextView(context);
                    textView13.setGravity(17);
                    org.telegram.ui.b.g(20.0f, 1, textView13);
                    int i522 = g6.j5;
                    c6Var = ((f3) v0Var).resourcesProvider;
                    textView13.setTextColor(g6.v0(i522, c6Var));
                    textView13.setText(LocaleController.getString(R.string.InvitePremiumBlockedTitle));
                    addView(textView13, f6.t(-1, -2, 1, 32, 0, 32, 9));
                    TextView textView22 = new TextView(context);
                    textView22.setGravity(17);
                    textView22.setTextSize(1, 14.0f);
                    c6Var2 = ((f3) v0Var).resourcesProvider;
                    textView22.setTextColor(g6.v0(i522, c6Var2));
                    addView(textView22, f6.t(-1, -2, 1, 32, 0, 32, 19));
                    if (i39 != 34) {
                    }
                    arrayList4 = v0Var.y0;
                    if (arrayList4 != null) {
                    }
                    z12 = false;
                    if (arrayList3.size() == 1) {
                    }
                    textView22.setText(AndroidUtilities.replaceTags(str2));
                    arrayList5 = v0Var.z0;
                    if (arrayList5 == null) {
                    }
                    arrayList7 = v0Var.y0;
                    if (arrayList7 == null) {
                    }
                    if (size - size2 > 0) {
                    }
                    ((ViewGroup.MarginLayoutParams) textView22.getLayoutParams()).bottomMargin = AndroidUtilities.dp(8.0f);
                    v0Var.f0 = true;
                    v0Var.L1();
                    return;
                }
                if (i39 != 31) {
                    c6Var14 = ((f3) v0Var).resourcesProvider;
                    t0 t0Var4 = new t0(this, context, i40, i15, i49, f12, c6Var14);
                    v0Var.t0 = t0Var4;
                    if (z11) {
                    }
                    z13 = false;
                    if (i39 != 2) {
                    }
                    v0Var.t0.D = z13;
                    addView(v0Var.t0, f6.p(-1, -2, 0.0f, 0, -4, 0, -4, 0));
                }
                if (i39 != 31) {
                }
                TextView textView52 = new TextView(context);
                this.a = textView52;
                textView52.setTypeface(AndroidUtilities.bold());
                if (i39 != 31) {
                }
                i33 = 19;
                this.a.setTextSize(1, 20.0f);
                TextView textView6222 = this.a;
                int i58222 = g6.G6;
                c6Var7 = ((f3) v0Var).resourcesProvider;
                textView6222.setTextColor(g6.v0(i58222, c6Var7));
                this.a.setGravity(i32);
                if (i39 != i33) {
                }
                eg.b bVar222 = new eg.b(context);
                this.c = bVar222;
                bVar222.a(v0Var.Y.boostCount, false);
                if (i39 == 32) {
                }
                if (v0Var.a0) {
                }
            }
            i17 = ((f3) v0Var).currentAccount;
            if (UserConfig.getInstance(i17).isPremium()) {
            }
            i15 = i49;
            f9 = 1.0f;
            float f122 = i48 / i49;
            if (i39 == 18) {
            }
            z11 = true;
            if (z11) {
            }
            if (i39 != 11) {
            }
            i18 = ((f3) v0Var).currentAccount;
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked()) {
            }
            if (i39 != 31) {
            }
            if (i39 != 31) {
            }
            TextView textView522 = new TextView(context);
            this.a = textView522;
            textView522.setTypeface(AndroidUtilities.bold());
            if (i39 != 31) {
            }
            i33 = 19;
            this.a.setTextSize(1, 20.0f);
            TextView textView62222 = this.a;
            int i582222 = g6.G6;
            c6Var7 = ((f3) v0Var).resourcesProvider;
            textView62222.setTextColor(g6.v0(i582222, c6Var7));
            this.a.setGravity(i32);
            if (i39 != i33) {
            }
            eg.b bVar2222 = new eg.b(context);
            this.c = bVar2222;
            bVar2222.a(v0Var.Y.boostCount, false);
            if (i39 == 32) {
            }
            if (v0Var.a0) {
            }
        } else if (i39 == 34) {
            str = v0Var.x0.size() == 1 ? LocaleController.formatString(R.string.InviteCallRestrictedUsersOne, ContactsController.formatName((TLRPC.User) v0Var.x0.get(0))) : LocaleController.formatPluralString("InviteCallRestrictedUsers", v0Var.x0.size(), Integer.valueOf(v0Var.x0.size()));
        } else if (premiumFeaturesBlocked) {
            str = (String) v0Var.I0.f;
        } else {
            i14 = ((f3) v0Var).currentAccount;
            str = (String) ((UserConfig.getInstance(i14).isPremium() || v0Var.J0) ? v0Var.I0.e : v0Var.I0.d);
        }
        formatString = str;
        z10 = premiumFeaturesBlocked;
        androidx.emoji2.text.o oVar2 = v0Var.I0;
        int i482 = oVar2.b;
        int i492 = oVar2.c;
        i15 = v0Var.s0;
        if (i39 != 3) {
        }
        i17 = ((f3) v0Var).currentAccount;
        if (UserConfig.getInstance(i17).isPremium()) {
        }
        i15 = i492;
        f9 = 1.0f;
        float f1222 = i482 / i492;
        if (i39 == 18) {
        }
        z11 = true;
        if (z11) {
        }
        if (i39 != 11) {
        }
        i18 = ((f3) v0Var).currentAccount;
        if (!MessagesController.getInstance(i18).premiumFeaturesBlocked()) {
        }
        if (i39 != 31) {
        }
        if (i39 != 31) {
        }
        TextView textView5222 = new TextView(context);
        this.a = textView5222;
        textView5222.setTypeface(AndroidUtilities.bold());
        if (i39 != 31) {
        }
        i33 = 19;
        this.a.setTextSize(1, 20.0f);
        TextView textView622222 = this.a;
        int i5822222 = g6.G6;
        c6Var7 = ((f3) v0Var).resourcesProvider;
        textView622222.setTextColor(g6.v0(i5822222, c6Var7));
        this.a.setGravity(i32);
        if (i39 != i33) {
        }
        eg.b bVar22222 = new eg.b(context);
        this.c = bVar22222;
        bVar22222.a(v0Var.Y.boostCount, false);
        if (i39 == 32) {
        }
        if (v0Var.a0) {
        }
    }
}
