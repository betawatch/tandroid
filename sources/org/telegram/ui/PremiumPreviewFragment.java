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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public Drawable E;
    public FrameLayout F;
    public FrameLayout G;
    public rv0 H;
    public ag.e3 I;
    public int J;
    public int K;
    public org.telegram.ui.Components.dz L;
    public final Paint M;
    public LinearGradient N;
    public final Matrix O;
    public final Paint P;
    public fw0 Q;
    public ag.k3 R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public int Y;
    public vv0 Z;
    public org.telegram.ui.Components.zk0 a;
    public ag.s1 a0;
    public final ArrayList b;
    public float b0;
    public final ArrayList c;
    public final int c0;
    public final ArrayList d;
    public final boolean d0;
    public int e;
    public final String e0;
    public hw0 f;
    public boolean f0;
    public final Bitmap g0;
    public int h;
    public final Canvas h0;
    public final ag.i2 i0;
    public final ag.i2 j0;
    public i0.c k0;
    public boolean l0;
    public float m0;
    public int n;
    public FrameLayout n0;
    public xv0 o0;
    public jg.b p0;
    public final jg.e q0;
    public int r;
    public final jg.a r0;
    public int s;
    public final jg.a s0;
    int showAdsRow;
    public sa t0;
    public final ArrayList u0;
    public int v;
    public final RectF v0;
    public int w;
    public int x;
    public int y;

    public PremiumPreviewFragment(int i10, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z10 = false;
        this.e = 0;
        this.M = new Paint(1);
        this.O = new Matrix();
        this.P = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.g0 = createBitmap;
        this.h0 = new Canvas(createBitmap);
        this.i0 = new ag.i2(org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, null);
        this.k0 = i0.c.e;
        ag.i2 i2Var = new ag.i2(org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, -1, -1, null);
        this.j0 = i2Var;
        i2Var.m = true;
        i2Var.o = 0.0f;
        i2Var.p = 0.0f;
        i2Var.q = 1.0f;
        i2Var.b = 0.0f;
        i2Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.u0 = arrayList;
        RectF rectF = new RectF();
        this.v0 = rectF;
        arrayList.add(rectF);
        this.c0 = i10;
        if (!org.telegram.ui.ActionBar.g6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.d0 = z10;
        this.e0 = str;
        i6 i6Var = new i6(this);
        if (Build.VERSION.SDK_INT >= 31) {
            jg.e eVar = new jg.e(true);
            this.q0 = eVar;
            og.d dVar = new og.d(null);
            dVar.d = eVar;
            dVar.e = -3;
            dVar.f = i6Var;
            this.r0 = new jg.a(dVar);
        } else {
            this.q0 = null;
            this.r0 = new jg.a(i6Var);
        }
        this.s0 = new jg.a(i6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        org.telegram.ui.Components.i5 i5Var;
        rv0 rv0Var;
        int i11;
        int i12;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i13 = premiumPreviewFragment.c0;
        if (premiumPreviewFragment.getUserConfig().isClientActivated()) {
            if (i10 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                if (userFull == null) {
                    return;
                }
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                l8Var.setChecked(!l8Var.b());
                userFull.sponsored_enabled = l8Var.b();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new n(premiumPreviewFragment, 17));
                premiumPreviewFragment.getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof rv0) {
                rv0 rv0Var2 = (rv0) view;
                hw0 hw0Var = null;
                if (i13 != 1 || !premiumPreviewFragment.getUserConfig().isPremium()) {
                    q0(premiumPreviewFragment.currentAccount, rv0Var2.f.a);
                    int i14 = premiumPreviewFragment.e;
                    if (i14 >= 0 && i14 < arrayList.size()) {
                        hw0Var = (hw0) arrayList.get(premiumPreviewFragment.e);
                    }
                    premiumPreviewFragment.showDialog(new ag.g2(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i13 == 1, rv0Var2.f.a, false, hw0Var));
                    return;
                }
                int i15 = rv0Var2.f.a;
                if (i15 == 29) {
                    premiumPreviewFragment.presentFragment(new qf.w0());
                    return;
                }
                if (i15 == 32) {
                    premiumPreviewFragment.presentFragment(new qf.o0());
                    return;
                }
                if (i15 == 33) {
                    qf.e eVar = new qf.e(null);
                    eVar.h = -4;
                    premiumPreviewFragment.presentFragment(eVar);
                    return;
                }
                if (i15 == 30) {
                    premiumPreviewFragment.presentFragment(new qf.y0());
                    return;
                }
                if (i15 == 34) {
                    premiumPreviewFragment.presentFragment(new qf.m0());
                    return;
                }
                if (i15 == 31) {
                    premiumPreviewFragment.presentFragment(new qf.n1());
                    return;
                }
                if (i15 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.o90(bundle, null));
                    return;
                }
                if (i15 != 12) {
                    if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new qf.m());
                        return;
                    } else {
                        if (i15 == 37) {
                            premiumPreviewFragment.presentFragment(new qf.s());
                            return;
                        }
                        return;
                    }
                }
                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                cg.u0 u0Var = new cg.u0(25, premiumPreviewFragment, rv0Var2);
                if (premiumPreviewFragment.o0 == null) {
                    r51[] r51VarArr = new r51[1];
                    boolean z10 = ((float) (rv0Var2.getHeight() + rv0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    org.telegram.ui.Components.i5 i5Var2 = rv0Var2.h;
                    if (i5Var2 != null) {
                        Drawable[] drawableArr = i5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.k5) {
                                ((org.telegram.ui.Components.k5) drawable).p(i5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.i5 i5Var3 = rv0Var2.h;
                        if (i5Var3 != null) {
                            i5Var3.f();
                            rv0Var2.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(rv0Var2.h.getBounds());
                            int dp = z10 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(rv0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                            int i16 = dp;
                            i5Var = i5Var3;
                            i11 = i16;
                            rv0Var = rv0Var2;
                            int i17 = i11;
                            wv0 wv0Var = new wv0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), !z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z10 ? 24 : 16, u0Var, r51VarArr);
                            wv0Var.c1 = true;
                            wv0Var.setSelected(emojiStatusDocumentId);
                            wv0Var.setSaveState(3);
                            wv0Var.y(i5Var, rv0Var);
                            xv0 xv0Var = new xv0(premiumPreviewFragment, wv0Var);
                            premiumPreviewFragment.o0 = xv0Var;
                            r51VarArr[0] = xv0Var;
                            xv0Var.showAsDropDown(rv0Var2, 0, i17, 53);
                            r51VarArr[0].b();
                        }
                        i5Var = i5Var3;
                        rv0Var = rv0Var2;
                    } else {
                        i5Var = null;
                        rv0Var = null;
                    }
                    i11 = 0;
                    i12 = 0;
                    if (!z10) {
                    }
                    int i172 = i11;
                    wv0 wv0Var2 = new wv0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), !z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z10 ? 24 : 16, u0Var, r51VarArr);
                    wv0Var2.c1 = true;
                    wv0Var2.setSelected(emojiStatusDocumentId);
                    wv0Var2.setSaveState(3);
                    wv0Var2.y(i5Var, rv0Var);
                    xv0 xv0Var2 = new xv0(premiumPreviewFragment, wv0Var2);
                    premiumPreviewFragment.o0 = xv0Var2;
                    r51VarArr[0] = xv0Var2;
                    xv0Var2.showAsDropDown(rv0Var2, 0, i172, 53);
                    r51VarArr[0].b();
                }
            }
        }
    }

    public static void k0(org.telegram.ui.ActionBar.n2 n2Var, hw0 hw0Var, String str, n2.e eVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (n2Var == null) {
                new ag.m2(n2Var).show();
                return;
            } else {
                n2Var.showDialog(new ag.m2(n2Var));
                return;
            }
        }
        int currentAccount = n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            b.b(currentAccount);
            return;
        }
        if (hw0Var == null && (premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo()) != null) {
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
                    hw0Var = new hw0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    hw0Var = new hw0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        hw0 hw0Var2 = hw0Var;
        p0();
        if (!BuildVars.useInvoiceBilling()) {
            n2.l lVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (lVar == null || lVar.h.isEmpty()) {
                return;
            }
            if (hw0Var2.f == null) {
                hw0Var2.f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            hw0Var2.a();
            if (hw0Var2.g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new cg.a0(n2Var, currentAccount, eVar, hw0Var2, 9));
            return;
        }
        Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : LaunchActivity.C1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.T0 = true;
                }
                we.e.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
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
            launchActivity.T0 = true;
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

    public static void m0(int i10, ArrayList arrayList, boolean z10) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        if (z10) {
            arrayList.add(new gw0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new gw0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new gw0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        } else {
            arrayList.add(new gw0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new gw0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new gw0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new gw0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new gw0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new gw0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new gw0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new gw0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((gw0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new uv0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        int i12 = 1;
        arrayList.add(new gw0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new gw0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new gw0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new gw0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new gw0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new gw0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new gw0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new gw0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new gw0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new gw0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new gw0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new gw0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new gw0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new gw0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new gw0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new gw0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new gw0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new gw0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new gw0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new gw0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new gw0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new gw0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new gw0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new gw0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new gw0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new gw0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((gw0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new uv0(messagesController, i12));
    }

    public static String o0(int i10, hw0 hw0Var) {
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (hw0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = hw0Var.a;
            if (!BuildVars.useInvoiceBilling()) {
                hw0Var.a();
                if (hw0Var.g == null) {
                    return LocaleController.getString(R.string.Loading);
                }
            }
            boolean isPremium = UserConfig.getInstance(i10).isPremium();
            int i13 = tL_premiumSubscriptionOption.months;
            boolean z10 = i13 > 12 && i13 % 12 == 0;
            boolean z11 = i13 == 12;
            String f10 = z11 ? hw0Var.f() : hw0Var.e();
            if (isPremium) {
                i11 = z11 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
            } else if (z11) {
                if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                    i11 = R.string.SubscribeToPremium;
                    f10 = hw0Var.e();
                } else {
                    i11 = R.string.SubscribeToPremiumPerYear;
                    f10 = hw0Var.d();
                }
            } else if (!z10) {
                i11 = R.string.SubscribeToPremium;
                f10 = hw0Var.e();
            } else {
                if (!MessagesController.getInstance(i10).showAnnualPerMonth) {
                    return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, hw0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption.months / 12, new Object[0]));
                }
                i11 = R.string.SubscribeToPremium;
                f10 = hw0Var.e();
            }
            return LocaleController.formatString(i11, f10);
        }
        String str = null;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
        str = null;
        str = null;
        if (!BuildVars.useInvoiceBilling()) {
            n2.l lVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (lVar != null) {
                ArrayList arrayList = lVar.h;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = ((n2.k) arrayList.get(0)).b.a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i14);
                        i14++;
                        n2.j jVar = (n2.j) obj;
                        String str2 = jVar.d;
                        String str3 = jVar.c;
                        long j10 = jVar.b;
                        if (str2.equals("P1M")) {
                            str = jVar.a;
                        } else if (jVar.d.equals("P1Y")) {
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new jh.m5(5));
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new jh.m5(5));
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new jh.m5(5));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        bw0 bw0Var;
        fw0 fw0Var = this.Q;
        return fw0Var == null || (bw0Var = fw0Var.d) == null || !bw0Var.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 1;
        this.t0 = new sa(this, i10);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.M;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nj, false);
        int i11 = org.telegram.ui.ActionBar.g6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.g6.w0(null, i11, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lj, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.N = linearGradient2;
        linearGradient2.setLocalMatrix(this.O);
        this.P.setShader(this.N);
        this.H = new rv0(context, null);
        this.I = new ag.e3(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i12 = this.c0;
        if (i12 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            qf.q1.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                qf.h.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                qf.v d = qf.v.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.h5), PorterDuff.Mode.MULTIPLY));
        this.E.getPadding(rect);
        this.T = AndroidUtilities.statusBarHeight;
        this.Z = new vv0(this, context);
        qg.j jVar = new qg.j(this.Z);
        vv0 vv0Var = this.Z;
        jg.a aVar = this.r0;
        aVar.d = jVar;
        aVar.e = vv0Var;
        qg.j jVar2 = new qg.j(this.Z);
        vv0 vv0Var2 = this.Z;
        jg.a aVar2 = this.s0;
        aVar2.d = jVar2;
        aVar2.e = vv0Var2;
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.a = zk0Var;
        zk0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new lg.b(this, 6));
        this.a.C0(new tv0(this, i10));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.zk0 zk0Var2 = this.a;
        org.telegram.ui.Components.dz dzVar = new org.telegram.ui.Components.dz(this.a, (AndroidUtilities.dp(68.0f) + this.T) - AndroidUtilities.dp(16.0f));
        this.L = dzVar;
        zk0Var2.setLayoutManager(dzVar);
        this.L.R = true;
        this.a.setAdapter(new yv0(this));
        this.a.j(new m3(this, 25));
        this.Q = new fw0(this, context);
        ag.k3 k3Var = new ag.k3(context);
        this.R = k3Var;
        k3Var.b();
        if (i12 == 1) {
            if (this.d0) {
                ag.j3 j3Var = this.R.a;
                j3Var.q = true;
                j3Var.K = false;
                j3Var.H = true;
                j3Var.J = true;
                j3Var.k = AndroidUtilities.dp(-14.0f);
                ag.j3 j3Var2 = this.R.a;
                j3Var2.x = 2000L;
                j3Var2.y = 3000;
                j3Var2.r = 16;
                j3Var2.G = false;
                j3Var2.N = 28;
                j3Var2.P = i11;
            } else {
                ag.j3 j3Var3 = this.R.a;
                j3Var3.J = true;
                j3Var3.k = AndroidUtilities.dp(28.0f);
                ag.j3 j3Var4 = this.R.a;
                j3Var4.x = 2000L;
                j3Var4.y = 3000;
                j3Var4.r = 16;
                j3Var4.G = false;
                j3Var4.N = 28;
            }
        }
        this.Q.d.setStarParticlesView(this.R);
        this.Z.addView(this.R, h7.z5.c(-2.0f, -1));
        this.Z.addView(this.Q, h7.z5.c(-2.0f, -1));
        this.a.setOnItemClickListener(new i(this, 23));
        this.Z.addView(this.a, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.G = new FrameLayout(context);
        ag.s1 s1Var = new ag.s1(context, getResourceProvider(), false);
        this.a0 = s1Var;
        s1Var.E = true;
        s1Var.setClickable(false);
        s1Var.r.setClickable(false);
        s1Var.setStateListAnimator(null);
        t0(false);
        this.F = new FrameLayout(context);
        this.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.G.addView(this.a0, h7.z5.c(-1.0f, -1));
        View view = this.G;
        lg.d c10 = aVar.c(view, null, false);
        mg.d dVar = new mg.d(this.resourceProvider);
        dVar.e = new ng.a(9);
        dVar.d(-1, 553648127);
        dVar.c(0, 553648127);
        dVar.b(805306368, 83886079);
        float dpf2 = AndroidUtilities.dpf2(4.0f);
        float dpf22 = AndroidUtilities.dpf2(0.33333334f);
        dVar.n = dpf2;
        dVar.r = dpf22;
        float dpf23 = AndroidUtilities.dpf2(0.67f);
        float dpf24 = AndroidUtilities.dpf2(0.67f);
        dVar.f = dpf23;
        dVar.h = dpf24;
        c10.n(dVar);
        c10.p(AndroidUtilities.dp(28.0f));
        c10.o(AndroidUtilities.dp(8.0f));
        view.setBackground(c10);
        h7.b6.b(this.G, 0.02f, 1.5f);
        this.F.addView(this.G, h7.z5.d(-1, 72.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        jg.b bVar = new jg.b(aVar.c(this.F, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), false);
        this.p0 = new jg.b(aVar.c(this.Z, null, false));
        this.F.setBackground(bVar);
        if (getUserConfig().isClientActivated()) {
            this.Z.addView(this.F, h7.z5.e(-1, -2, 80));
        }
        this.fragmentView = this.Z;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null || !((ActionBarLayout) b5Var).J0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 15));
        this.actionBar.setForceSkipTouches(true);
        this.Z.addView(this.actionBar, h7.z5.e(-1, -2, 48));
        u0();
        w0();
        this.Q.d.j(200L);
        if (this.l0) {
            AndroidUtilities.runOnUIThread(new tv0(this, 2), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.e0);
        View view2 = this.fragmentView;
        dl0 dl0Var = new dl0(this, 8);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view2, dl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            t0(false);
            this.Q.a();
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged || i10 == NotificationCenter.premiumPromoUpdated) {
            this.Q.b();
            this.Q.a();
            w0();
            this.a.getAdapter().l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new e(this, 28), org.telegram.ui.ActionBar.g6.Lj, org.telegram.ui.ActionBar.g6.Mj, org.telegram.ui.ActionBar.g6.Nj, org.telegram.ui.ActionBar.g6.Oj, org.telegram.ui.ActionBar.g6.Pj, org.telegram.ui.ActionBar.g6.Qj, org.telegram.ui.ActionBar.g6.Rj, org.telegram.ui.ActionBar.g6.Sj, org.telegram.ui.ActionBar.g6.Tj, org.telegram.ui.ActionBar.g6.Vj, org.telegram.ui.ActionBar.g6.Wj, org.telegram.ui.ActionBar.g6.Uj, org.telegram.ui.ActionBar.g6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return this.d0;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void j0() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.q0) == null) {
            return;
        }
        this.v0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.k0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        eVar.g(1, this.u0);
        eVar.e(this.t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.n0;
        if (frameLayout == null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new f50(this, 20));
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        v0(false);
    }

    @Override // org.telegram.ui.ActionBar.n2
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
        if (this.c0 == 1) {
            qf.t1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        bw0 bw0Var;
        super.onPause();
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
            bw0Var.setDialogVisible(true);
        }
        ag.k3 k3Var = this.R;
        if (k3Var != null) {
            k3Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        bw0 bw0Var;
        super.onResume();
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
            bw0Var.setPaused(false);
            this.Q.d.setDialogVisible(false);
        }
        this.R.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    public final void s0() {
        fw0 fw0Var;
        if (this.Z.getMeasuredWidth() == 0 || this.Z.getMeasuredHeight() == 0 || (fw0Var = this.Q) == null || fw0Var.d == null) {
            return;
        }
        if (this.d0) {
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(i0.b.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.g6.Mj), getThemedColor(org.telegram.ui.ActionBar.g6.h5)));
            this.Q.d.setBackgroundBitmap(createBitmap);
            return;
        }
        int measuredWidth = this.Z.getMeasuredWidth();
        int measuredHeight = this.Z.getMeasuredHeight();
        ag.i2 i2Var = this.i0;
        i2Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.h0;
        canvas.save();
        canvas.scale(100.0f / this.Z.getMeasuredWidth(), 100.0f / this.Z.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.Z.getMeasuredWidth(), this.Z.getMeasuredHeight(), i2Var.f);
        canvas.restore();
        this.Q.d.setBackgroundBitmap(this.g0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        v0(showDialog != null);
        return showDialog;
    }

    public final void t0(boolean z10) {
        if (this.a0 == null) {
            return;
        }
        boolean isPremium = getUserConfig().isPremium();
        ArrayList arrayList = this.d;
        if (!isPremium || this.f == null || this.e >= arrayList.size() || ((hw0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (LocaleController.isRTL) {
                z10 = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.e < arrayList.size()) {
                this.a0.a(o0(this.currentAccount, (hw0) arrayList.get(this.e)), null, z10);
                final int i10 = 0;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sv0
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
                                hw0 hw0Var = (hw0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                hw0 hw0Var2 = premiumPreviewFragment.f;
                                n2.e eVar = null;
                                if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                    eVar = new n2.e();
                                    eVar.a = lastPremiumToken;
                                    eVar.b = 5;
                                }
                                PremiumPreviewFragment.k0(premiumPreviewFragment, hw0Var, "settings", eVar);
                                return;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((hw0) arrayList.get(this.e)).f == null)) {
                this.a0.a(LocaleController.getString(R.string.Loading), null, z10);
                this.G.setOnClickListener(new ag.l2(24));
                this.a0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.a0.a(o0(this.currentAccount, (hw0) arrayList.get(this.e)), null, z10);
                final int i11 = 1;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.sv0
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
                                hw0 hw0Var = (hw0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                hw0 hw0Var2 = premiumPreviewFragment.f;
                                n2.e eVar = null;
                                if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                    eVar = new n2.e();
                                    eVar.a = lastPremiumToken;
                                    eVar.b = 5;
                                }
                                PremiumPreviewFragment.k0(premiumPreviewFragment, hw0Var, "settings", eVar);
                                return;
                        }
                    }
                });
                this.a0.setFlickerDisabled(false);
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.k kVar;
        bg.a aVar;
        if (this.Q == null || (kVar = this.actionBar) == null) {
            return;
        }
        boolean z10 = this.d0;
        kVar.D(org.telegram.ui.ActionBar.g6.w0(null, z10 ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.Tj, false), true);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.w0(null, z10 ? org.telegram.ui.ActionBar.g6.G6 : org.telegram.ui.ActionBar.g6.Tj, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.Tj;
        kVar2.C(i0.b.k(org.telegram.ui.ActionBar.g6.w0(null, i10, false), 60), false);
        this.R.a.g();
        fw0 fw0Var = this.Q;
        if (fw0Var != null) {
            fw0Var.a.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, z10 ? org.telegram.ui.ActionBar.g6.G6 : i10, false));
            TextView textView = this.Q.b;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.g6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            bw0 bw0Var = this.Q.d;
            if (bw0Var != null && (aVar = bw0Var.b) != null) {
                if (z10) {
                    aVar.w = org.telegram.ui.ActionBar.g6.Xj;
                    aVar.x = org.telegram.ui.ActionBar.g6.Yj;
                }
                aVar.b();
            }
        }
        s0();
    }

    public final void v0(boolean z10) {
        bw0 bw0Var;
        if (z10 != this.V) {
            this.V = z10;
            fw0 fw0Var = this.Q;
            if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
                bw0Var.setDialogVisible(z10);
            }
            this.R.setPaused(z10);
            this.Z.invalidate();
        }
    }

    public final void w0() {
        hw0 hw0Var;
        this.x = -1;
        this.A = -1;
        this.s = -1;
        this.v = -1;
        this.w = -1;
        this.C = -1;
        this.showAdsRow = -1;
        this.D = -1;
        boolean z10 = true;
        this.h = 1;
        this.n = 1;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        int i10 = this.c0;
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
        this.B = i14 + 1;
        if (i10 == 1 && getUserConfig().isPremium()) {
            int i15 = this.h;
            this.C = i15;
            this.showAdsRow = i15 + 1;
            this.h = i15 + 3;
            this.D = i15 + 2;
        }
        FrameLayout frameLayout = this.F;
        if (getUserConfig().isPremium() && ((hw0Var = this.f) == null || hw0Var.a.months >= ((hw0) this.d.get(this.e)).a.months || this.l0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        int dp = this.F.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        org.telegram.ui.Components.dz dzVar = this.L;
        dzVar.M = (this.T + dp) - AndroidUtilities.dp(16.0f);
        dzVar.p1();
        this.L.S = dp;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
