package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public int C;
    public int D;
    public int E;
    public Drawable F;
    public FrameLayout G;
    public FrameLayout H;
    public gw0 I;
    public fg.j2 J;
    public int K;
    public int L;
    public org.telegram.ui.Components.rz M;
    public final Paint N;
    public LinearGradient O;
    public final Matrix P;
    public final Paint Q;
    public vw0 R;
    public fg.p2 S;
    public boolean T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public float Y;
    public int Z;
    public org.telegram.ui.Components.sl0 a;
    public kw0 a0;
    public final ArrayList b;
    public fg.b1 b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public final int d0;
    public int e;
    public final boolean e0;
    public xw0 f;
    public final String f0;
    public boolean g0;
    public int h;
    public final Bitmap h0;
    public final Canvas i0;
    public final fg.p1 j0;
    public final fg.p1 k0;
    public i0.b l0;
    public boolean m0;
    public int n;
    public float n0;
    public FrameLayout o0;
    public mw0 p0;
    public og.b q0;
    public int r;
    public final og.e r0;
    public int s;
    public final og.a s0;
    int showAdsRow;
    public final og.a t0;
    public ua u0;
    public int v;
    public final ArrayList v0;
    public int w;
    public final RectF w0;
    public int x;
    public int y;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z4 = false;
        this.e = 0;
        this.N = new Paint(1);
        this.P = new Matrix();
        this.Q = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.h0 = createBitmap;
        this.i0 = new Canvas(createBitmap);
        this.j0 = new fg.p1(org.telegram.ui.ActionBar.k6.Pj, org.telegram.ui.ActionBar.k6.Qj, org.telegram.ui.ActionBar.k6.Rj, org.telegram.ui.ActionBar.k6.Sj, null);
        this.l0 = i0.b.e;
        fg.p1 p1Var = new fg.p1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, null);
        this.k0 = p1Var;
        p1Var.m = true;
        p1Var.o = 0.0f;
        p1Var.p = 0.0f;
        p1Var.q = 1.0f;
        p1Var.b = 0.0f;
        p1Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.v0 = arrayList;
        RectF rectF = new RectF();
        this.w0 = rectF;
        arrayList.add(rectF);
        this.d0 = i10;
        if (!org.telegram.ui.ActionBar.k6.I.q() && i10 == 1) {
            z4 = true;
        }
        this.e0 = z4;
        this.f0 = str;
        n7.qa qaVar = new n7.qa(this);
        if (Build.VERSION.SDK_INT >= 31) {
            og.e eVar = new og.e(true);
            this.r0 = eVar;
            tg.d dVar = new tg.d(null);
            dVar.d = eVar;
            dVar.e = -3;
            dVar.f = qaVar;
            this.s0 = new og.a(dVar);
        } else {
            this.r0 = null;
            this.s0 = new og.a(qaVar);
        }
        this.t0 = new og.a(qaVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        org.telegram.ui.Components.j5 j5Var;
        gw0 gw0Var;
        int i11;
        int i12;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i13 = premiumPreviewFragment.d0;
        if (premiumPreviewFragment.getUserConfig().isClientActivated()) {
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                if (userFull == null) {
                    return;
                }
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                o8Var.setChecked(!o8Var.b());
                userFull.sponsored_enabled = o8Var.b();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new o(premiumPreviewFragment, 17));
                premiumPreviewFragment.getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof gw0) {
                gw0 gw0Var2 = (gw0) view;
                xw0 xw0Var = null;
                if (i13 != 1 || !premiumPreviewFragment.getUserConfig().isPremium()) {
                    q0(premiumPreviewFragment.currentAccount, gw0Var2.f.a);
                    int i14 = premiumPreviewFragment.e;
                    if (i14 >= 0 && i14 < arrayList.size()) {
                        xw0Var = (xw0) arrayList.get(premiumPreviewFragment.e);
                    }
                    premiumPreviewFragment.showDialog(new fg.n1(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i13 == 1, gw0Var2.f.a, false, xw0Var));
                    return;
                }
                int i15 = gw0Var2.f.a;
                if (i15 == 29) {
                    premiumPreviewFragment.presentFragment(new vf.v0());
                    return;
                }
                if (i15 == 32) {
                    premiumPreviewFragment.presentFragment(new vf.n0());
                    return;
                }
                if (i15 == 33) {
                    vf.c cVar = new vf.c(null);
                    cVar.h = -4;
                    premiumPreviewFragment.presentFragment(cVar);
                    return;
                }
                if (i15 == 30) {
                    premiumPreviewFragment.presentFragment(new vf.x0());
                    return;
                }
                if (i15 == 34) {
                    premiumPreviewFragment.presentFragment(new vf.l0());
                    return;
                }
                if (i15 == 31) {
                    premiumPreviewFragment.presentFragment(new vf.m1());
                    return;
                }
                if (i15 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.fa0(bundle, null));
                    return;
                }
                if (i15 != 12) {
                    if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new vf.k());
                        return;
                    } else {
                        if (i15 == 37) {
                            premiumPreviewFragment.presentFragment(new vf.q());
                            return;
                        }
                        return;
                    }
                }
                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                eh.w wVar = new eh.w(24, premiumPreviewFragment, gw0Var2);
                if (premiumPreviewFragment.p0 == null) {
                    n61[] n61VarArr = new n61[1];
                    boolean z4 = ((float) (gw0Var2.getHeight() + gw0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    org.telegram.ui.Components.j5 j5Var2 = gw0Var2.h;
                    if (j5Var2 != null) {
                        Drawable[] drawableArr = j5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.l5) {
                                ((org.telegram.ui.Components.l5) drawable).p(j5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.j5 j5Var3 = gw0Var2.h;
                        if (j5Var3 != null) {
                            j5Var3.f();
                            gw0Var2.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(gw0Var2.h.getBounds());
                            int dp = z4 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(gw0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                            int i16 = dp;
                            j5Var = j5Var3;
                            i11 = i16;
                            gw0Var = gw0Var2;
                            int i17 = i11;
                            lw0 lw0Var = new lw0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), !z4 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z4 ? 24 : 16, wVar, n61VarArr);
                            lw0Var.d1 = true;
                            lw0Var.setSelected(emojiStatusDocumentId);
                            lw0Var.setSaveState(3);
                            lw0Var.y(j5Var, gw0Var);
                            mw0 mw0Var = new mw0(premiumPreviewFragment, lw0Var);
                            premiumPreviewFragment.p0 = mw0Var;
                            n61VarArr[0] = mw0Var;
                            mw0Var.showAsDropDown(gw0Var2, 0, i17, 53);
                            n61VarArr[0].b();
                        }
                        j5Var = j5Var3;
                        gw0Var = gw0Var2;
                    } else {
                        j5Var = null;
                        gw0Var = null;
                    }
                    i11 = 0;
                    i12 = 0;
                    if (!z4) {
                    }
                    int i172 = i11;
                    lw0 lw0Var2 = new lw0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), !z4 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z4 ? 24 : 16, wVar, n61VarArr);
                    lw0Var2.d1 = true;
                    lw0Var2.setSelected(emojiStatusDocumentId);
                    lw0Var2.setSaveState(3);
                    lw0Var2.y(j5Var, gw0Var);
                    mw0 mw0Var2 = new mw0(premiumPreviewFragment, lw0Var2);
                    premiumPreviewFragment.p0 = mw0Var2;
                    n61VarArr[0] = mw0Var2;
                    mw0Var2.showAsDropDown(gw0Var2, 0, i172, 53);
                    n61VarArr[0].b();
                }
            }
        }
    }

    public static void k0(org.telegram.ui.ActionBar.p2 p2Var, xw0 xw0Var, String str, p2.e eVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (p2Var == null) {
                new fg.s1(p2Var).show();
                return;
            } else {
                p2Var.showDialog(new fg.s1(p2Var));
                return;
            }
        }
        int currentAccount = p2Var == null ? UserConfig.selectedAccount : p2Var.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            c.b(currentAccount);
            return;
        }
        if (xw0Var == null && (premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo()) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i10);
                i10++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i11 = tL_premiumSubscriptionOption3.months;
                if (i11 == 1) {
                    xw0Var = new xw0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    xw0Var = new xw0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        xw0 xw0Var2 = xw0Var;
        p0();
        if (!BuildVars.useInvoiceBilling()) {
            p2.m mVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (mVar == null || mVar.h.isEmpty()) {
                return;
            }
            if (xw0Var2.f == null) {
                xw0Var2.f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            xw0Var2.a();
            if (xw0Var2.g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new hg.a0(p2Var, currentAccount, eVar, xw0Var2, 9));
            return;
        }
        Activity parentActivity = p2Var != null ? p2Var.getParentActivity() : LaunchActivity.D1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (xw0Var2 != null && (tL_premiumSubscriptionOption = xw0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.U0 = true;
                }
                af.g.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(currentAccount);
            if (TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                if (TextUtils.isEmpty(messagesController.premiumInvoiceSlug)) {
                    return;
                }
                launchActivity.e0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + messagesController.premiumInvoiceSlug)), null);
                return;
            }
            launchActivity.U0 = true;
            launchActivity.e0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + messagesController.premiumBotUsername + "?start=" + str)), null);
        }
    }

    public static String l0(int i10) {
        switch (i10) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return "business_hours";
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return "todo";
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return "gifts";
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                return "pm_noforwards";
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                return "ai_compose";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                return "rich_formatting";
            default:
                return null;
        }
    }

    public static void m0(int i10, ArrayList arrayList, boolean z4) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (z4) {
            arrayList.add(new ww0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new ww0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new ww0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        } else {
            arrayList.add(new ww0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new ww0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new ww0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new ww0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new ww0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new ww0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new ww0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new ww0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((ww0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new jw0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        int i12 = 1;
        arrayList.add(new ww0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new ww0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new ww0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new ww0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new ww0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new ww0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new ww0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new ww0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new ww0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new ww0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new ww0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new ww0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new ww0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new ww0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new ww0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new ww0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new ww0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new ww0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new ww0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new ww0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new ww0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new ww0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new ww0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new ww0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new ww0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new ww0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((ww0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new jw0(messagesController, i12));
    }

    public static String o0(int i10, xw0 xw0Var) {
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (xw0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = xw0Var.a;
            if (!BuildVars.useInvoiceBilling()) {
                xw0Var.a();
                if (xw0Var.g == null) {
                    return LocaleController.getString(R.string.Loading);
                }
            }
            boolean isPremium = UserConfig.getInstance(i10).isPremium();
            int i13 = tL_premiumSubscriptionOption.months;
            boolean z4 = i13 > 12 && i13 % 12 == 0;
            boolean z10 = i13 == 12;
            String f10 = z10 ? xw0Var.f() : xw0Var.e();
            if (isPremium) {
                i11 = z10 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
            } else if (z10) {
                if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                    i11 = R.string.SubscribeToPremium;
                    f10 = xw0Var.e();
                } else {
                    i11 = R.string.SubscribeToPremiumPerYear;
                    f10 = xw0Var.d();
                }
            } else if (!z4) {
                i11 = R.string.SubscribeToPremium;
                f10 = xw0Var.e();
            } else {
                if (!MessagesController.getInstance(i10).showAnnualPerMonth) {
                    return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, xw0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption.months / 12, new Object[0]));
                }
                i11 = R.string.SubscribeToPremium;
                f10 = xw0Var.e();
            }
            return LocaleController.formatString(i11, f10);
        }
        String str = null;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
        str = null;
        str = null;
        if (!BuildVars.useInvoiceBilling()) {
            p2.m mVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (mVar != null) {
                ArrayList arrayList = mVar.h;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = ((p2.l) arrayList.get(0)).b.a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i14);
                        i14++;
                        p2.k kVar = (p2.k) obj;
                        String str2 = kVar.d;
                        String str3 = kVar.c;
                        long j10 = kVar.b;
                        if (str2.equals("P1M")) {
                            str = kVar.a;
                        } else if (kVar.d.equals("P1Y")) {
                            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(j10 / 12, str3, 6);
                            } else {
                                i12 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(j10, str3, 6);
                            }
                        }
                    }
                }
            }
            return str == null ? LocaleController.getString(R.string.Loading) : LocaleController.formatString(i12, str);
        }
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i10).getPremiumPromo();
        if (premiumPromo == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList3 = premiumPromo.period_options;
        int size2 = arrayList3.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                break;
            }
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList3.get(i15);
            i15++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            int i16 = tL_premiumSubscriptionOption4.months;
            if (i16 == 12) {
                tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                break;
            }
            if (tL_premiumSubscriptionOption2 == null && i16 == 1) {
                tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
            }
        }
        if (tL_premiumSubscriptionOption2 == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        if (tL_premiumSubscriptionOption2.months != 12) {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
        } else if (MessagesController.getInstance(i10).showAnnualPerMonth) {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount / 12, tL_premiumSubscriptionOption2.currency);
        } else {
            i12 = R.string.SubscribeToPremiumPerYear;
            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
        }
        return LocaleController.formatString(i12, formatCurrency);
    }

    public static void p0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new oh.p5(4));
    }

    public static void q0(int i10, int i11) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String l02 = l0(i11);
        if (l02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = l02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new oh.p5(4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new oh.p5(4));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean canBeginSlide() {
        rw0 rw0Var;
        vw0 vw0Var = this.R;
        return vw0Var == null || (rw0Var = vw0Var.d) == null || !rw0Var.a;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        float f10;
        int i10 = 2;
        this.u0 = new ua(this, i10);
        int i11 = 1;
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.N;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Nj, false);
        int i12 = org.telegram.ui.ActionBar.k6.Mj;
        int[] iArr = {w02, w03, org.telegram.ui.ActionBar.k6.w0(null, i12, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Lj, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Kj, false)};
        int i13 = 5;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, iArr, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.O = linearGradient2;
        linearGradient2.setLocalMatrix(this.P);
        this.Q.setShader(this.O);
        this.I = new gw0(context, null);
        this.J = new fg.j2(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i14 = this.d0;
        if (i14 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            vf.p1.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                vf.f.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                vf.t d = vf.t.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.F = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.h5), PorterDuff.Mode.MULTIPLY));
        this.F.getPadding(rect);
        this.U = AndroidUtilities.statusBarHeight;
        this.a0 = new kw0(this, context);
        vg.i iVar = new vg.i(this.a0);
        kw0 kw0Var = this.a0;
        og.a aVar = this.s0;
        aVar.d = iVar;
        aVar.e = kw0Var;
        vg.i iVar2 = new vg.i(this.a0);
        kw0 kw0Var2 = this.a0;
        og.a aVar2 = this.t0;
        aVar2.d = iVar2;
        aVar2.e = kw0Var2;
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.a = sl0Var;
        sl0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new org.telegram.ui.Components.tl(this, i13));
        this.a.C0(new iw0(this, i11));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.sl0 sl0Var2 = this.a;
        org.telegram.ui.Components.rz rzVar = new org.telegram.ui.Components.rz(this.a, (AndroidUtilities.dp(68.0f) + this.U) - AndroidUtilities.dp(16.0f));
        this.M = rzVar;
        sl0Var2.setLayoutManager(rzVar);
        this.M.R = true;
        this.a.setAdapter(new ow0(this));
        int i15 = 24;
        this.a.j(new l3(this, i15));
        this.R = new vw0(this, context);
        fg.p2 p2Var = new fg.p2(context);
        this.S = p2Var;
        p2Var.b();
        if (i14 != 1) {
            f10 = 28.0f;
        } else if (this.e0) {
            fg.o2 o2Var = this.S.a;
            o2Var.q = true;
            o2Var.K = false;
            o2Var.H = true;
            o2Var.J = true;
            f10 = 28.0f;
            o2Var.k = AndroidUtilities.dp(-14.0f);
            fg.o2 o2Var2 = this.S.a;
            o2Var2.x = 2000L;
            o2Var2.y = 3000;
            o2Var2.r = 16;
            o2Var2.G = false;
            o2Var2.N = 28;
            o2Var2.P = i12;
        } else {
            f10 = 28.0f;
            fg.o2 o2Var3 = this.S.a;
            o2Var3.J = true;
            o2Var3.k = AndroidUtilities.dp(28.0f);
            fg.o2 o2Var4 = this.S.a;
            o2Var4.x = 2000L;
            o2Var4.y = 3000;
            o2Var4.r = 16;
            o2Var4.G = false;
            o2Var4.N = 28;
        }
        this.R.d.setStarParticlesView(this.S);
        this.a0.addView(this.S, k7.c6.c(-2.0f, -1));
        this.a0.addView(this.R, k7.c6.c(-2.0f, -1));
        this.a.setOnItemClickListener(new j(this, i15));
        this.a0.addView(this.a, k7.c6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.H = new FrameLayout(context);
        fg.b1 b1Var = new fg.b1(context, getResourceProvider(), false);
        this.b0 = b1Var;
        b1Var.F = true;
        b1Var.setClickable(false);
        b1Var.r.setClickable(false);
        b1Var.setStateListAnimator(null);
        t0(false);
        this.G = new FrameLayout(context);
        this.H.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.H.addView(this.b0, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout = this.H;
        qg.b c3 = aVar.c(frameLayout, null, false);
        c3.n(sg.b.j(this.resourceProvider));
        c3.p(AndroidUtilities.dp(f10));
        c3.o(AndroidUtilities.dp(5.0f));
        frameLayout.setBackground(c3);
        k7.e6.b(this.H, 0.02f, 1.5f);
        this.G.addView(this.H, k7.c6.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        og.b bVar = new og.b(aVar.c(this.G, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), false);
        this.q0 = new og.b(aVar.c(this.a0, null, false));
        this.G.setBackground(bVar);
        if (getUserConfig().isClientActivated()) {
            this.a0.addView(this.G, k7.c6.e(-1, -2, 80));
        }
        this.fragmentView = this.a0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var == null || !((ActionBarLayout) f5Var).K0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 6));
        this.actionBar.setForceSkipTouches(true);
        this.a0.addView(this.actionBar, k7.c6.e(-1, -2, 48));
        u0();
        w0();
        this.R.d.j(200L);
        if (this.m0) {
            AndroidUtilities.runOnUIThread(new iw0(this, i10), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.f0);
        View view = this.fragmentView;
        kl0 kl0Var = new kl0(this, 8);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view, kl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            t0(false);
            this.R.a();
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged || i10 == NotificationCenter.premiumPromoUpdated) {
            this.R.b();
            this.R.a();
            w0();
            this.a.getAdapter().l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.c;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        return k7.f6.a(new f(this, 28), org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, org.telegram.ui.ActionBar.k6.Nj, org.telegram.ui.ActionBar.k6.Oj, org.telegram.ui.ActionBar.k6.Pj, org.telegram.ui.ActionBar.k6.Qj, org.telegram.ui.ActionBar.k6.Rj, org.telegram.ui.ActionBar.k6.Sj, org.telegram.ui.ActionBar.k6.Tj, org.telegram.ui.ActionBar.k6.Vj, org.telegram.ui.ActionBar.k6.Wj, org.telegram.ui.ActionBar.k6.Uj, org.telegram.ui.ActionBar.k6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        return this.e0;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void j0() {
        og.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.r0) == null) {
            return;
        }
        this.w0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.l0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        eVar.g(1, this.v0);
        eVar.e(this.u0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        FrameLayout frameLayout = this.o0;
        if (frameLayout == null) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new ss0(this, 11));
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        v0(false);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        if (getMessagesController().premiumFeaturesBlocked()) {
            return false;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addObserver(this, NotificationCenter.premiumPromoUpdated);
        if (getMediaDataController().getPremiumPromo() != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().getPremiumPromo().videos;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                TLRPC.Document document = arrayList.get(i10);
                i10++;
                FileLoader.getInstance(this.currentAccount).loadFile(document, getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        if (this.d0 == 1) {
            vf.s1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        rw0 rw0Var;
        super.onPause();
        vw0 vw0Var = this.R;
        if (vw0Var != null && (rw0Var = vw0Var.d) != null) {
            rw0Var.setDialogVisible(true);
        }
        fg.p2 p2Var = this.S;
        if (p2Var != null) {
            p2Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        rw0 rw0Var;
        super.onResume();
        vw0 vw0Var = this.R;
        if (vw0Var != null && (rw0Var = vw0Var.d) != null) {
            rw0Var.setPaused(false);
            this.R.d.setDialogVisible(false);
        }
        this.S.setPaused(false);
        setBulletinDelegate(new a9(this, 7));
    }

    public final void s0() {
        vw0 vw0Var;
        if (this.a0.getMeasuredWidth() == 0 || this.a0.getMeasuredHeight() == 0 || (vw0Var = this.R) == null || vw0Var.d == null) {
            return;
        }
        if (this.e0) {
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.k6.Mj), getThemedColor(org.telegram.ui.ActionBar.k6.h5)));
            this.R.d.setBackgroundBitmap(createBitmap);
            return;
        }
        int measuredWidth = this.a0.getMeasuredWidth();
        int measuredHeight = this.a0.getMeasuredHeight();
        fg.p1 p1Var = this.j0;
        p1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.i0;
        canvas.save();
        canvas.scale(100.0f / this.a0.getMeasuredWidth(), 100.0f / this.a0.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.a0.getMeasuredWidth(), this.a0.getMeasuredHeight(), p1Var.f);
        canvas.restore();
        this.R.d.setBackgroundBitmap(this.h0);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        v0(showDialog != null);
        return showDialog;
    }

    public final void t0(boolean z4) {
        if (this.b0 == null) {
            return;
        }
        boolean isPremium = getUserConfig().isPremium();
        ArrayList arrayList = this.d;
        if (!isPremium || this.f == null || this.e >= arrayList.size() || ((xw0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (LocaleController.isRTL) {
                z4 = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.e < arrayList.size()) {
                this.b0.a(o0(this.currentAccount, (xw0) arrayList.get(this.e)), null, z4);
                final int i10 = 0;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hw0
                    public final /* synthetic */ PremiumPreviewFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i10) {
                            case 0:
                                PremiumPreviewFragment.k0(this.b, null, "settings", null);
                                return;
                            default:
                                PremiumPreviewFragment premiumPreviewFragment = this.b;
                                xw0 xw0Var = (xw0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                xw0 xw0Var2 = premiumPreviewFragment.f;
                                p2.e eVar = null;
                                if (xw0Var2 != null && (tL_premiumSubscriptionOption = xw0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                                    String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                    boolean z10 = true;
                                    if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                        z10 = false;
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(null);
                                    if (z10 && !isEmpty) {
                                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    }
                                    if (!z10 && isEmpty) {
                                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    }
                                    eVar = new p2.e();
                                    eVar.a = lastPremiumToken;
                                    eVar.b = 5;
                                }
                                PremiumPreviewFragment.k0(premiumPreviewFragment, xw0Var, "settings", eVar);
                                return;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((xw0) arrayList.get(this.e)).f == null)) {
                this.b0.a(LocaleController.getString(R.string.Loading), null, z4);
                this.H.setOnClickListener(new eg.m(22));
                this.b0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.b0.a(o0(this.currentAccount, (xw0) arrayList.get(this.e)), null, z4);
                final int i11 = 1;
                this.H.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.hw0
                    public final /* synthetic */ PremiumPreviewFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i11) {
                            case 0:
                                PremiumPreviewFragment.k0(this.b, null, "settings", null);
                                return;
                            default:
                                PremiumPreviewFragment premiumPreviewFragment = this.b;
                                xw0 xw0Var = (xw0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                xw0 xw0Var2 = premiumPreviewFragment.f;
                                p2.e eVar = null;
                                if (xw0Var2 != null && (tL_premiumSubscriptionOption = xw0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                                    String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                    boolean z10 = true;
                                    if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                        z10 = false;
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(null);
                                    if (z10 && !isEmpty) {
                                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    }
                                    if (!z10 && isEmpty) {
                                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    }
                                    eVar = new p2.e();
                                    eVar.a = lastPremiumToken;
                                    eVar.b = 5;
                                }
                                PremiumPreviewFragment.k0(premiumPreviewFragment, xw0Var, "settings", eVar);
                                return;
                        }
                    }
                });
                this.b0.setFlickerDisabled(false);
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.k kVar;
        gg.a aVar;
        if (this.R == null || (kVar = this.actionBar) == null) {
            return;
        }
        boolean z4 = this.e0;
        kVar.C(org.telegram.ui.ActionBar.k6.w0(null, z4 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Tj, false), true);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.w0(null, z4 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Tj, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.Tj;
        kVar2.B(i0.a.k(org.telegram.ui.ActionBar.k6.w0(null, i10, false), 60), false);
        this.S.a.g();
        vw0 vw0Var = this.R;
        if (vw0Var != null) {
            vw0Var.a.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, z4 ? org.telegram.ui.ActionBar.k6.G6 : i10, false));
            TextView textView = this.R.b;
            if (z4) {
                i10 = org.telegram.ui.ActionBar.k6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
            rw0 rw0Var = this.R.d;
            if (rw0Var != null && (aVar = rw0Var.b) != null) {
                if (z4) {
                    aVar.w = org.telegram.ui.ActionBar.k6.Xj;
                    aVar.x = org.telegram.ui.ActionBar.k6.Yj;
                }
                aVar.b();
            }
        }
        s0();
    }

    public final void v0(boolean z4) {
        rw0 rw0Var;
        if (z4 != this.W) {
            this.W = z4;
            vw0 vw0Var = this.R;
            if (vw0Var != null && (rw0Var = vw0Var.d) != null) {
                rw0Var.setDialogVisible(z4);
            }
            this.S.setPaused(z4);
            this.a0.invalidate();
        }
    }

    public final void w0() {
        xw0 xw0Var;
        this.x = -1;
        this.B = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.D = -1;
        this.showAdsRow = -1;
        this.E = -1;
        boolean z4 = true;
        this.h = 1;
        this.n = 1;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        int i10 = this.d0;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.x = i11;
            int i13 = i11 + 2;
            this.h = i13;
            this.s = i12;
            this.v = i13;
            int size2 = this.c.size() + i13;
            this.h = size2;
            this.w = size2;
        }
        int i14 = this.h;
        this.y = i14;
        this.h = i14 + 2;
        this.C = i14 + 1;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i15 = this.h;
            this.D = i15;
            this.showAdsRow = i15 + 1;
            this.h = i15 + 3;
            this.E = i15 + 2;
        }
        FrameLayout frameLayout = this.G;
        if (getUserConfig().isPremium() && ((xw0Var = this.f) == null || xw0Var.a.months >= ((xw0) this.d.get(this.e)).a.months || this.m0)) {
            z4 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z4, 1.0f, false);
        int dp = this.G.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        org.telegram.ui.Components.rz rzVar = this.M;
        rzVar.M = (this.U + dp) - AndroidUtilities.dp(16.0f);
        rzVar.p1();
        this.M.S = dp;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
