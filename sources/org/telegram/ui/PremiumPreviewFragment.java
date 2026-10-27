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
import org.telegram.messenger.FileLog;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public xa A0;
    public final ArrayList B0;
    public final RectF C0;
    public Drawable D0;
    public int E;
    public int E0;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public iw0 L;
    public tg.r1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.yz P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public xw0 U;
    public tg.x1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.nm0 a;
    public boolean a0;
    public final ArrayList b;
    public float b0;
    public final ArrayList c;
    public int c0;
    public final ArrayList d;
    public mw0 d0;
    public int e;
    public tg.p0 e0;
    public zw0 f;
    public float f0;
    public final int g0;
    public int h;
    public final boolean h0;
    public final String i0;
    public boolean j0;
    public final Bitmap k0;
    public final Canvas l0;
    public final tg.a1 m0;
    public int n;
    public final tg.a1 n0;
    public i0.b o0;
    public boolean p0;
    public float q0;
    public int r;
    public tw0 r0;
    public int s;
    public int s0;
    int showAdsRow;
    public FrameLayout t0;
    public int u0;
    public int v;
    public ow0 v0;
    public int w;
    public ch.c w0;
    public int x;
    public final ch.f x0;
    public int y;
    public final ch.b y0;
    public final ch.b z0;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.k0 = createBitmap;
        this.l0 = new Canvas(createBitmap);
        this.m0 = new tg.a1(org.telegram.ui.ActionBar.y6.Pj, org.telegram.ui.ActionBar.y6.Qj, org.telegram.ui.ActionBar.y6.Rj, org.telegram.ui.ActionBar.y6.Sj, null);
        this.o0 = i0.b.e;
        tg.a1 a1Var = new tg.a1(org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, -1, -1, null);
        this.n0 = a1Var;
        a1Var.m = true;
        a1Var.o = 0.0f;
        a1Var.p = 0.0f;
        a1Var.q = 1.0f;
        a1Var.b = 0.0f;
        a1Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.g0 = i10;
        if (!org.telegram.ui.ActionBar.y6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.h0 = z10;
        this.i0 = str;
        m4.c cVar = new m4.c(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ch.f fVar = new ch.f(true, true);
            this.x0 = fVar;
            hh.d dVar = new hh.d(null);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f = cVar;
            this.y0 = new ch.b(dVar);
        } else {
            this.x0 = null;
            this.y0 = new ch.b(cVar);
        }
        this.z0 = new ch.b(cVar);
    }

    public static void V(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        org.telegram.ui.Components.r5 r5Var;
        iw0 iw0Var;
        int i11;
        int i12;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i13 = premiumPreviewFragment.g0;
        if (premiumPreviewFragment.getUserConfig().isClientActivated()) {
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                if (userFull == null) {
                    return;
                }
                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                v8Var.setChecked(!v8Var.d());
                userFull.sponsored_enabled = v8Var.d();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 18));
                premiumPreviewFragment.getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof iw0) {
                iw0 iw0Var2 = (iw0) view;
                zw0 zw0Var = null;
                if (i13 != 1 || !premiumPreviewFragment.getUserConfig().isPremium()) {
                    r0(premiumPreviewFragment.currentAccount, iw0Var2.f.a);
                    int i14 = premiumPreviewFragment.e;
                    if (i14 >= 0 && i14 < arrayList.size()) {
                        zw0Var = (zw0) arrayList.get(premiumPreviewFragment.e);
                    }
                    premiumPreviewFragment.showDialog(new tg.y0(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i13 == 1, iw0Var2.f.a, false, zw0Var));
                    return;
                }
                int i15 = iw0Var2.f.a;
                if (i15 == 29) {
                    premiumPreviewFragment.presentFragment(new jg.d1());
                    return;
                }
                if (i15 == 32) {
                    premiumPreviewFragment.presentFragment(new jg.v0());
                    return;
                }
                if (i15 == 33) {
                    jg.c cVar = new jg.c(null);
                    cVar.f = -4;
                    premiumPreviewFragment.presentFragment(cVar);
                    return;
                }
                if (i15 == 30) {
                    premiumPreviewFragment.presentFragment(new jg.h1());
                    return;
                }
                if (i15 == 34) {
                    premiumPreviewFragment.presentFragment(new jg.t0());
                    return;
                }
                if (i15 == 31) {
                    premiumPreviewFragment.presentFragment(new jg.z1());
                    return;
                }
                if (i15 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.ua0(bundle, null));
                    return;
                }
                if (i15 != 12) {
                    if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new jg.n());
                        return;
                    } else {
                        if (i15 == 37) {
                            premiumPreviewFragment.presentFragment(new jg.w());
                            return;
                        }
                        return;
                    }
                }
                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                bi.m5 m5Var = new bi.m5(22, premiumPreviewFragment, iw0Var2);
                if (premiumPreviewFragment.v0 == null) {
                    w51[] w51VarArr = new w51[1];
                    boolean z10 = ((float) (iw0Var2.getHeight() + iw0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    org.telegram.ui.Components.r5 r5Var2 = iw0Var2.h;
                    if (r5Var2 != null) {
                        Drawable[] drawableArr = r5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.t5) {
                                ((org.telegram.ui.Components.t5) drawable).p(r5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.r5 r5Var3 = iw0Var2.h;
                        if (r5Var3 != null) {
                            r5Var3.f();
                            iw0Var2.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(iw0Var2.h.getBounds());
                            int dp = z10 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(iw0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                            int i16 = dp;
                            r5Var = r5Var3;
                            i11 = i16;
                        } else {
                            r5Var = r5Var3;
                            i11 = 0;
                            i12 = 0;
                        }
                        iw0Var = iw0Var2;
                    } else {
                        r5Var = null;
                        iw0Var = null;
                        i11 = 0;
                        i12 = 0;
                    }
                    int i17 = i11;
                    nw0 nw0Var = new nw0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), z10 ? 24 : 16, m5Var, w51VarArr);
                    nw0Var.g1 = true;
                    nw0Var.setSelected(emojiStatusDocumentId);
                    nw0Var.setSaveState(3);
                    nw0Var.y(r5Var, iw0Var);
                    ow0 ow0Var = new ow0(premiumPreviewFragment, nw0Var);
                    premiumPreviewFragment.v0 = ow0Var;
                    w51VarArr[0] = ow0Var;
                    ow0Var.showAsDropDown(iw0Var2, 0, i17, 53);
                    w51VarArr[0].b();
                }
            }
        }
    }

    public static void l0(org.telegram.ui.ActionBar.r2 r2Var, zw0 zw0Var, String str, d5.g gVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (r2Var == null) {
                new tg.d1(r2Var).show();
                return;
            } else {
                r2Var.showDialog(new tg.d1(r2Var));
                return;
            }
        }
        int currentAccount = r2Var == null ? UserConfig.selectedAccount : r2Var.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            b.b(currentAccount);
            return;
        }
        if (zw0Var == null && (premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo()) != null) {
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
                    zw0Var = new zw0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    zw0Var = new zw0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        zw0 zw0Var2 = zw0Var;
        q0();
        if (!BuildVars.useInvoiceBilling()) {
            d5.o oVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (oVar == null || oVar.h.isEmpty()) {
                return;
            }
            if (zw0Var2.f == null) {
                zw0Var2.f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            zw0Var2.a();
            if (zw0Var2.g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new ag.k0(r2Var, currentAccount, gVar, zw0Var2, 8));
            return;
        }
        Activity parentActivity = r2Var != null ? r2Var.getParentActivity() : LaunchActivity.I1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (zw0Var2 != null && (tL_premiumSubscriptionOption = zw0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.Y0 = true;
                }
                qf.d.r(launchActivity, tL_premiumSubscriptionOption.bot_url);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(currentAccount);
            if (TextUtils.isEmpty(messagesController.premiumBotUsername)) {
                if (TextUtils.isEmpty(messagesController.premiumInvoiceSlug)) {
                    return;
                }
                launchActivity.g0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + messagesController.premiumInvoiceSlug)), null);
                return;
            }
            launchActivity.Y0 = true;
            launchActivity.g0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + messagesController.premiumBotUsername + "?start=" + str)), null);
        }
    }

    public static String m0(int i10) {
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

    public static void n0(int i10, ArrayList arrayList, boolean z10) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (z10) {
            arrayList.add(new yw0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new yw0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new yw0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        } else {
            arrayList.add(new yw0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new yw0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new yw0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new yw0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new yw0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new yw0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new yw0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new yw0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((yw0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new lw0(messagesController, 0));
    }

    public static void o0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        int i12 = 1;
        arrayList.add(new yw0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new yw0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new yw0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new yw0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new yw0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new yw0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new yw0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new yw0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new yw0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new yw0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new yw0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new yw0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new yw0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new yw0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new yw0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new yw0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new yw0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new yw0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new yw0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new yw0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new yw0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new yw0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new yw0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new yw0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new yw0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new yw0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((yw0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new lw0(messagesController, i12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String p0(int i10, zw0 zw0Var) {
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (zw0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = zw0Var.a;
            if (!BuildVars.useInvoiceBilling()) {
                zw0Var.a();
                if (zw0Var.g == null) {
                    return LocaleController.getString(R.string.Loading);
                }
            }
            boolean isPremium = UserConfig.getInstance(i10).isPremium();
            int i13 = tL_premiumSubscriptionOption.months;
            Object[] objArr = i13 > 12 && i13 % 12 == 0;
            Object[] objArr2 = i13 == 12;
            String f7 = objArr2 != false ? zw0Var.f() : zw0Var.e();
            if (isPremium) {
                i11 = objArr2 != false ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
            } else if (objArr2 == true) {
                if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                    i11 = R.string.SubscribeToPremium;
                    f7 = zw0Var.e();
                } else {
                    i11 = R.string.SubscribeToPremiumPerYear;
                    f7 = zw0Var.d();
                }
            } else if (objArr != true) {
                i11 = R.string.SubscribeToPremium;
                f7 = zw0Var.e();
            } else {
                if (!MessagesController.getInstance(i10).showAnnualPerMonth) {
                    return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, zw0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption.months / 12, new Object[0]));
                }
                i11 = R.string.SubscribeToPremium;
                f7 = zw0Var.e();
            }
            return LocaleController.formatString(i11, f7);
        }
        String str = null;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
        str = null;
        str = null;
        if (!BuildVars.useInvoiceBilling()) {
            d5.o oVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (oVar != null) {
                ArrayList arrayList = oVar.h;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = (ArrayList) ((d5.n) arrayList.get(0)).b.b;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i14);
                        i14++;
                        d5.m mVar = (d5.m) obj;
                        String str2 = mVar.d;
                        String str3 = mVar.c;
                        long j10 = mVar.b;
                        if (str2.equals("P1M")) {
                            str = mVar.a;
                        } else if (mVar.d.equals("P1Y")) {
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

    public static void q0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new di.d6(8));
    }

    public static void r0(int i10, int i11) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i10).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String m0 = m0(i11);
        if (m0 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = m0;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new di.d6(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s0(String str) {
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new di.d6(8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean canBeginSlide() {
        tw0 tw0Var;
        xw0 xw0Var = this.U;
        return xw0Var == null || (tw0Var = xw0Var.d) == null || !tw0Var.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        int i10 = 1;
        this.A0 = new xa(this, i10);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oj, false);
        int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nj, false);
        int i11 = org.telegram.ui.ActionBar.y6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.y6.x0(null, i11, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lj, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new iw0(context, null);
        this.M = new tg.r1(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i12 = this.g0;
        if (i12 == 0) {
            o0(this.currentAccount, arrayList);
        } else {
            n0(this.currentAccount, arrayList, false);
            n0(this.currentAccount, arrayList2, true);
            jg.c2.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                jg.f.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                jg.z d = jg.z.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.y6.h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = AndroidUtilities.statusBarHeight;
        this.d0 = new mw0(this, context);
        jh.k kVar = new jh.k(this.d0);
        mw0 mw0Var = this.d0;
        ch.b bVar = this.y0;
        bVar.f = kVar;
        bVar.g = mw0Var;
        jh.k kVar2 = new jh.k(this.d0);
        mw0 mw0Var2 = this.d0;
        ch.b bVar2 = this.z0;
        bVar2.f = kVar2;
        bVar2.g = mw0Var2;
        org.telegram.ui.Components.nm0 nm0Var = new org.telegram.ui.Components.nm0(context, null);
        this.a = nm0Var;
        nm0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new eh.b(this, 6));
        this.a.D0(new kw0(this, i10));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.nm0 nm0Var2 = this.a;
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(this.a, (AndroidUtilities.dp(68.0f) + this.X) - AndroidUtilities.dp(16.0f));
        this.P = yzVar;
        nm0Var2.setLayoutManager(yzVar);
        this.P.R = true;
        this.a.setAdapter(new qw0(this));
        int i13 = 25;
        this.a.j(new i3(this, i13));
        this.U = new xw0(this, context);
        tg.x1 x1Var = new tg.x1(context);
        this.V = x1Var;
        x1Var.c();
        if (i12 == 1) {
            if (this.h0) {
                tg.w1 w1Var = this.V.a;
                w1Var.q = true;
                w1Var.K = false;
                w1Var.H = true;
                w1Var.J = true;
                w1Var.k = AndroidUtilities.dp(-14.0f);
                tg.w1 w1Var2 = this.V.a;
                w1Var2.x = 2000L;
                w1Var2.y = 3000;
                w1Var2.r = 16;
                w1Var2.G = false;
                w1Var2.O = 28;
                w1Var2.Q = i11;
            } else {
                tg.w1 w1Var3 = this.V.a;
                w1Var3.J = true;
                w1Var3.k = AndroidUtilities.dp(28.0f);
                tg.w1 w1Var4 = this.V.a;
                w1Var4.x = 2000L;
                w1Var4.y = 3000;
                w1Var4.r = 16;
                w1Var4.G = false;
                w1Var4.O = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.d0.addView(this.V, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        this.d0.addView(this.U, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        this.a.setOnItemClickListener(new h(this, i13));
        this.d0.addView(this.a, org.telegram.ui.Components.kb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        tg.p0 p0Var = new tg.p0(context, getResourceProvider(), false);
        this.e0 = p0Var;
        p0Var.K = true;
        p0Var.setClickable(false);
        p0Var.v.setClickable(false);
        p0Var.setStateListAnimator(null);
        u0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.K.addView(this.e0, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        FrameLayout frameLayout = this.K;
        eh.d c10 = bVar.c(frameLayout, null, false);
        c10.v(gh.c.j(this.resourceProvider));
        c10.x(AndroidUtilities.dp(28.0f));
        c10.w(AndroidUtilities.dp(5.0f));
        frameLayout.setBackground(c10);
        org.telegram.ui.Components.kb1.c(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, org.telegram.ui.Components.kb1.h(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ch.c cVar = new ch.c(bVar.c(this.J, null, false));
        cVar.b(AndroidUtilities.dp(40.0f), false);
        this.w0 = new ch.c(bVar.c(this.d0, null, false));
        this.J.setBackground(cVar);
        if (getUserConfig().isClientActivated()) {
            this.d0.addView(this.J, org.telegram.ui.Components.kb1.i(-1, -2, 80));
        }
        this.fragmentView = this.d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var == null || !((ActionBarLayout) j5Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new c20(this, i13));
        this.actionBar.setForceSkipTouches(true);
        this.d0.addView(this.actionBar, org.telegram.ui.Components.kb1.i(-1, -2, 48));
        v0();
        x0();
        this.U.d.m(200L);
        if (this.p0) {
            AndroidUtilities.runOnUIThread(new kw0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        s0(this.i0);
        View view = this.fragmentView;
        jl0 jl0Var = new jl0(this, 9);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, jl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            u0(false);
            this.U.a();
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged || i10 == NotificationCenter.premiumPromoUpdated) {
            this.U.b();
            this.U.a();
            x0();
            this.a.getAdapter().l();
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.ActionBar.e4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.e4.c;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.kb1.C(new j6(17, this), org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, org.telegram.ui.ActionBar.y6.Nj, org.telegram.ui.ActionBar.y6.Oj, org.telegram.ui.ActionBar.y6.Pj, org.telegram.ui.ActionBar.y6.Qj, org.telegram.ui.ActionBar.y6.Rj, org.telegram.ui.ActionBar.y6.Sj, org.telegram.ui.ActionBar.y6.Tj, org.telegram.ui.ActionBar.y6.Vj, org.telegram.ui.ActionBar.y6.Wj, org.telegram.ui.ActionBar.y6.Uj, org.telegram.ui.ActionBar.y6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        return this.h0;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void k0() {
        ch.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.x0) == null) {
            return;
        }
        this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.o0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        fVar.g(1, this.B0);
        fVar.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.t0;
        if (frameLayout == null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new k50(this, 21));
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        w0(false);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        if (getMessagesController().premiumFeaturesBlocked()) {
            return false;
        }
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.premiumPromoUpdated);
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
        if (this.g0 == 1) {
            jg.g2.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        tw0 tw0Var;
        super.onPause();
        xw0 xw0Var = this.U;
        if (xw0Var != null && (tw0Var = xw0Var.d) != null) {
            tw0Var.setDialogVisible(true);
        }
        tg.x1 x1Var = this.V;
        if (x1Var != null) {
            x1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        tw0 tw0Var;
        super.onResume();
        xw0 xw0Var = this.U;
        if (xw0Var != null && (tw0Var = xw0Var.d) != null) {
            tw0Var.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new d9(this, 8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.h5);
        Drawable drawable = this.I;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            tg.x1 x1Var = this.V;
            if (x1Var == null || x1Var.a == null || this.d0 == null) {
                return;
            }
            v0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        w0(showDialog != null);
        return showDialog;
    }

    public final void t0() {
        xw0 xw0Var;
        if (this.d0.getMeasuredWidth() == 0 || this.d0.getMeasuredHeight() == 0 || (xw0Var = this.U) == null || xw0Var.d == null) {
            return;
        }
        if (!this.h0) {
            int measuredWidth = this.d0.getMeasuredWidth();
            int measuredHeight = this.d0.getMeasuredHeight();
            tg.a1 a1Var = this.m0;
            a1Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.l0;
            canvas.save();
            canvas.scale(100.0f / this.d0.getMeasuredWidth(), 100.0f / this.d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.d0.getMeasuredWidth(), this.d0.getMeasuredHeight(), a1Var.f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.k0);
            return;
        }
        int f7 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.y6.Mj), getThemedColor(org.telegram.ui.ActionBar.y6.h5));
        tw0 tw0Var = this.r0;
        tw0 tw0Var2 = this.U.d;
        if (tw0Var == tw0Var2 && this.s0 == f7) {
            return;
        }
        this.r0 = tw0Var2;
        this.s0 = f7;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(f7);
        this.U.d.setBackgroundBitmap(createBitmap);
    }

    public final void u0(boolean z10) {
        if (this.e0 == null) {
            return;
        }
        boolean isPremium = getUserConfig().isPremium();
        ArrayList arrayList = this.d;
        if (!isPremium || this.f == null || this.e >= arrayList.size() || ((zw0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (LocaleController.isRTL) {
                z10 = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.e < arrayList.size()) {
                this.e0.a(p0(this.currentAccount, (zw0) arrayList.get(this.e)), null, z10);
                final int i10 = 0;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jw0
                    public final /* synthetic */ PremiumPreviewFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i10) {
                            case 0:
                                PremiumPreviewFragment.l0(this.b, null, "settings", null);
                                return;
                            default:
                                PremiumPreviewFragment premiumPreviewFragment = this.b;
                                zw0 zw0Var = (zw0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                zw0 zw0Var2 = premiumPreviewFragment.f;
                                d5.g gVar = null;
                                if (zw0Var2 != null && (tL_premiumSubscriptionOption = zw0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                                    String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                    boolean z11 = true;
                                    if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                        z11 = false;
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(null);
                                    if (z11 && !isEmpty) {
                                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    }
                                    if (!z11 && isEmpty) {
                                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    }
                                    gVar = new d5.g();
                                    gVar.a = lastPremiumToken;
                                    gVar.b = 5;
                                }
                                PremiumPreviewFragment.l0(premiumPreviewFragment, zw0Var, "settings", gVar);
                                return;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((zw0) arrayList.get(this.e)).f == null)) {
                this.e0.a(LocaleController.getString(R.string.Loading), null, z10);
                this.K.setOnClickListener(new bh.f(22));
                this.e0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.e0.a(p0(this.currentAccount, (zw0) arrayList.get(this.e)), null, z10);
                final int i11 = 1;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jw0
                    public final /* synthetic */ PremiumPreviewFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i11) {
                            case 0:
                                PremiumPreviewFragment.l0(this.b, null, "settings", null);
                                return;
                            default:
                                PremiumPreviewFragment premiumPreviewFragment = this.b;
                                zw0 zw0Var = (zw0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                zw0 zw0Var2 = premiumPreviewFragment.f;
                                d5.g gVar = null;
                                if (zw0Var2 != null && (tL_premiumSubscriptionOption = zw0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                                    String lastPremiumToken = BillingController.getInstance().getLastPremiumToken();
                                    boolean z11 = true;
                                    if (TextUtils.isEmpty(lastPremiumToken) && TextUtils.isEmpty(null)) {
                                        z11 = false;
                                    }
                                    boolean isEmpty = TextUtils.isEmpty(null);
                                    if (z11 && !isEmpty) {
                                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                                    }
                                    if (!z11 && isEmpty) {
                                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                                    }
                                    gVar = new d5.g();
                                    gVar.a = lastPremiumToken;
                                    gVar.b = 5;
                                }
                                PremiumPreviewFragment.l0(premiumPreviewFragment, zw0Var, "settings", gVar);
                                return;
                        }
                    }
                });
                this.e0.setFlickerDisabled(false);
            }
        }
    }

    public final void v0() {
        ug.g gVar;
        if (this.U == null || this.actionBar == null) {
            return;
        }
        boolean z10 = this.h0;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, z10 ? org.telegram.ui.ActionBar.y6.G6 : org.telegram.ui.ActionBar.y6.Tj, false);
        if (x02 != this.u0) {
            this.u0 = x02;
            this.actionBar.y(x02, true);
            this.actionBar.y(x02, false);
        }
        int i10 = org.telegram.ui.ActionBar.y6.Tj;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.x0(null, i10, false), 60);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.p0 != o10) {
            kVar.x(o10, false);
        }
        this.V.a.g();
        xw0 xw0Var = this.U;
        if (xw0Var != null) {
            xw0Var.a.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, z10 ? org.telegram.ui.ActionBar.y6.G6 : i10, false));
            TextView textView = this.U.b;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.y6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            tw0 tw0Var = this.U.d;
            if (tw0Var != null && (gVar = tw0Var.b) != null) {
                if (z10) {
                    gVar.z = org.telegram.ui.ActionBar.y6.Xj;
                    gVar.A = org.telegram.ui.ActionBar.y6.Yj;
                }
                gVar.b();
            }
        }
        t0();
    }

    public final void w0(boolean z10) {
        tw0 tw0Var;
        if (z10 != this.Z) {
            this.Z = z10;
            xw0 xw0Var = this.U;
            if (xw0Var != null && (tw0Var = xw0Var.d) != null) {
                tw0Var.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.d0.invalidate();
        }
    }

    public final void x0() {
        zw0 zw0Var;
        this.x = -1;
        this.E = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        boolean z10 = true;
        this.h = 1;
        this.n = 1;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        int i10 = this.g0;
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
        this.F = i14 + 1;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i15 = this.h;
            this.G = i15;
            this.showAdsRow = i15 + 1;
            this.h = i15 + 3;
            this.H = i15 + 2;
        }
        FrameLayout frameLayout = this.J;
        if (getUserConfig().isPremium() && ((zw0Var = this.f) == null || zw0Var.a.months >= ((zw0) this.d.get(this.e)).a.months || this.p0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        int dp = this.J.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        org.telegram.ui.Components.yz yzVar = this.P;
        yzVar.M = (this.X + dp) - AndroidUtilities.dp(16.0f);
        yzVar.q1();
        this.P.S = dp;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
