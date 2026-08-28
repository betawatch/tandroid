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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public int C;
    public int D;
    public Drawable E;
    public FrameLayout F;
    public FrameLayout G;
    public qv0 H;
    public zf.p1 I;
    public int J;
    public int K;
    public org.telegram.ui.Components.bz L;
    public final Paint M;
    public LinearGradient N;
    public final Matrix O;
    public final Paint P;
    public fw0 Q;
    public zf.w1 R;
    public boolean S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public float X;
    public int Y;
    public uv0 Z;
    public org.telegram.ui.Components.wk0 a;
    public zf.p0 a0;
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
    public final zf.z0 i0;
    public final zf.z0 j0;
    public i0.b k0;
    public boolean l0;
    public float m0;
    public int n;
    public FrameLayout n0;
    public wv0 o0;
    public ig.b p0;
    public final ig.e q0;
    public int r;
    public final ig.a r0;
    public int s;
    public final ig.a s0;
    int showAdsRow;
    public ra t0;
    public final ArrayList u0;
    public int v;
    public final RectF v0;
    public int w;
    public int x;
    public int y;

    public PremiumPreviewFragment(int i9, String str) {
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
        this.i0 = new zf.z0(org.telegram.ui.ActionBar.f6.Pj, org.telegram.ui.ActionBar.f6.Qj, org.telegram.ui.ActionBar.f6.Rj, org.telegram.ui.ActionBar.f6.Sj, null);
        this.k0 = i0.b.e;
        zf.z0 z0Var = new zf.z0(org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, -1, -1, null);
        this.j0 = z0Var;
        z0Var.m = true;
        z0Var.o = 0.0f;
        z0Var.p = 0.0f;
        z0Var.q = 1.0f;
        z0Var.b = 0.0f;
        z0Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.u0 = arrayList;
        RectF rectF = new RectF();
        this.v0 = rectF;
        arrayList.add(rectF);
        this.c0 = i9;
        if (!org.telegram.ui.ActionBar.f6.I.q() && i9 == 1) {
            z10 = true;
        }
        this.d0 = z10;
        this.e0 = str;
        org.telegram.ui.Cells.e3 e3Var = new org.telegram.ui.Cells.e3(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ig.e eVar = new ig.e(true);
            this.q0 = eVar;
            ng.d dVar = new ng.d(null);
            dVar.d = eVar;
            dVar.e = -3;
            dVar.f = e3Var;
            this.r0 = new ig.a(dVar);
        } else {
            this.q0 = null;
            this.r0 = new ig.a(e3Var);
        }
        this.s0 = new ig.a(e3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void T(PremiumPreviewFragment premiumPreviewFragment, View view, int i9) {
        org.telegram.ui.Components.i5 i5Var;
        qv0 qv0Var;
        int i10;
        int i11;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i12 = premiumPreviewFragment.c0;
        if (premiumPreviewFragment.getUserConfig().isClientActivated()) {
            if (i9 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull userFull = premiumPreviewFragment.getMessagesController().getUserFull(premiumPreviewFragment.getUserConfig().getClientUserId());
                if (userFull == null) {
                    return;
                }
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                p8Var.setChecked(!p8Var.b());
                userFull.sponsored_enabled = p8Var.b();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new m(premiumPreviewFragment, 17));
                premiumPreviewFragment.getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof qv0) {
                qv0 qv0Var2 = (qv0) view;
                hw0 hw0Var = null;
                if (i12 != 1 || !premiumPreviewFragment.getUserConfig().isPremium()) {
                    p0(premiumPreviewFragment.currentAccount, qv0Var2.f.a);
                    int i13 = premiumPreviewFragment.e;
                    if (i13 >= 0 && i13 < arrayList.size()) {
                        hw0Var = (hw0) arrayList.get(premiumPreviewFragment.e);
                    }
                    premiumPreviewFragment.showDialog(new zf.x0(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i12 == 1, qv0Var2.f.a, false, hw0Var));
                    return;
                }
                int i14 = qv0Var2.f.a;
                if (i14 == 29) {
                    premiumPreviewFragment.presentFragment(new pf.w0());
                    return;
                }
                if (i14 == 32) {
                    premiumPreviewFragment.presentFragment(new pf.o0());
                    return;
                }
                if (i14 == 33) {
                    pf.d dVar = new pf.d(null);
                    dVar.h = -4;
                    premiumPreviewFragment.presentFragment(dVar);
                    return;
                }
                if (i14 == 30) {
                    premiumPreviewFragment.presentFragment(new pf.y0());
                    return;
                }
                if (i14 == 34) {
                    premiumPreviewFragment.presentFragment(new pf.m0());
                    return;
                }
                if (i14 == 31) {
                    premiumPreviewFragment.presentFragment(new pf.n1());
                    return;
                }
                if (i14 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.k90(bundle, null));
                    return;
                }
                if (i14 != 12) {
                    if (i14 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i14 == 36) {
                        premiumPreviewFragment.presentFragment(new pf.l());
                        return;
                    } else {
                        if (i14 == 37) {
                            premiumPreviewFragment.presentFragment(new pf.r());
                            return;
                        }
                        return;
                    }
                }
                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                bg.y0 y0Var = new bg.y0(25, premiumPreviewFragment, qv0Var2);
                if (premiumPreviewFragment.o0 == null) {
                    s51[] s51VarArr = new s51[1];
                    boolean z10 = ((float) (qv0Var2.getHeight() + qv0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    org.telegram.ui.Components.i5 i5Var2 = qv0Var2.h;
                    if (i5Var2 != null) {
                        Drawable[] drawableArr = i5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.k5) {
                                ((org.telegram.ui.Components.k5) drawable).p(i5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.i5 i5Var3 = qv0Var2.h;
                        if (i5Var3 != null) {
                            i5Var3.f();
                            qv0Var2.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(qv0Var2.h.getBounds());
                            int dp = z10 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(qv0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i11 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                            int i15 = dp;
                            i5Var = i5Var3;
                            i10 = i15;
                            qv0Var = qv0Var2;
                            int i16 = i10;
                            vv0 vv0Var = new vv0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i11), !z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z10 ? 24 : 16, y0Var, s51VarArr);
                            vv0Var.c1 = true;
                            vv0Var.setSelected(emojiStatusDocumentId);
                            vv0Var.setSaveState(3);
                            vv0Var.y(i5Var, qv0Var);
                            wv0 wv0Var = new wv0(premiumPreviewFragment, vv0Var);
                            premiumPreviewFragment.o0 = wv0Var;
                            s51VarArr[0] = wv0Var;
                            wv0Var.showAsDropDown(qv0Var2, 0, i16, 53);
                            s51VarArr[0].b();
                        }
                        i5Var = i5Var3;
                        qv0Var = qv0Var2;
                    } else {
                        i5Var = null;
                        qv0Var = null;
                    }
                    i10 = 0;
                    i11 = 0;
                    if (!z10) {
                    }
                    int i162 = i10;
                    vv0 vv0Var2 = new vv0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i11), !z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z10 ? 24 : 16, y0Var, s51VarArr);
                    vv0Var2.c1 = true;
                    vv0Var2.setSelected(emojiStatusDocumentId);
                    vv0Var2.setSaveState(3);
                    vv0Var2.y(i5Var, qv0Var);
                    wv0 wv0Var2 = new wv0(premiumPreviewFragment, vv0Var2);
                    premiumPreviewFragment.o0 = wv0Var2;
                    s51VarArr[0] = wv0Var2;
                    wv0Var2.showAsDropDown(qv0Var2, 0, i162, 53);
                    s51VarArr[0].b();
                }
            }
        }
    }

    public static void j0(org.telegram.ui.ActionBar.o2 o2Var, hw0 hw0Var, String str, n2.e eVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (o2Var == null) {
                new zf.c1(o2Var).show();
                return;
            } else {
                o2Var.showDialog(new zf.c1(o2Var));
                return;
            }
        }
        int currentAccount = o2Var == null ? UserConfig.selectedAccount : o2Var.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            b.b(currentAccount);
            return;
        }
        if (hw0Var == null && (premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo()) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = premiumPromo.period_options;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i9);
                i9++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i10 = tL_premiumSubscriptionOption3.months;
                if (i10 == 1) {
                    hw0Var = new hw0(tL_premiumSubscriptionOption3);
                } else if (i10 == 12) {
                    hw0Var = new hw0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        hw0 hw0Var2 = hw0Var;
        o0();
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
            BillingController.getInstance().queryPurchases("subs", new bg.d0(o2Var, currentAccount, eVar, hw0Var2, 9));
            return;
        }
        Activity parentActivity = o2Var != null ? o2Var.getParentActivity() : LaunchActivity.C1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (hw0Var2 != null && (tL_premiumSubscriptionOption = hw0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.T0 = true;
                }
                ve.e.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
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

    public static String k0(int i9) {
        switch (i9) {
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

    public static void l0(int i9, ArrayList arrayList, boolean z10) {
        MessagesController messagesController = MessagesController.getInstance(i9);
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
            int i10 = 0;
            while (i10 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((gw0) arrayList.get(i10)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        Collections.sort(arrayList, new tv0(messagesController, 0));
    }

    public static void m0(int i9, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i9);
        int i10 = 0;
        int i11 = 1;
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
            while (i10 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((gw0) arrayList.get(i10)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i10);
                    i10--;
                }
                i10++;
            }
        }
        Collections.sort(arrayList, new tv0(messagesController, i11));
    }

    public static String n0(int i9, hw0 hw0Var) {
        int i10;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i11 = R.string.SubscribeToPremium;
        if (hw0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = hw0Var.a;
            if (!BuildVars.useInvoiceBilling()) {
                hw0Var.a();
                if (hw0Var.g == null) {
                    return LocaleController.getString(R.string.Loading);
                }
            }
            boolean isPremium = UserConfig.getInstance(i9).isPremium();
            int i12 = tL_premiumSubscriptionOption.months;
            boolean z10 = i12 > 12 && i12 % 12 == 0;
            boolean z11 = i12 == 12;
            String f10 = z11 ? hw0Var.f() : hw0Var.e();
            if (isPremium) {
                i10 = z11 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
            } else if (z11) {
                if (MessagesController.getInstance(i9).showAnnualPerMonth) {
                    i10 = R.string.SubscribeToPremium;
                    f10 = hw0Var.e();
                } else {
                    i10 = R.string.SubscribeToPremiumPerYear;
                    f10 = hw0Var.d();
                }
            } else if (!z10) {
                i10 = R.string.SubscribeToPremium;
                f10 = hw0Var.e();
            } else {
                if (!MessagesController.getInstance(i9).showAnnualPerMonth) {
                    return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, hw0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption.months / 12, new Object[0]));
                }
                i10 = R.string.SubscribeToPremium;
                f10 = hw0Var.e();
            }
            return LocaleController.formatString(i10, f10);
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
                    ArrayList arrayList2 = (ArrayList) ((n2.k) arrayList.get(0)).b.b;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i13);
                        i13++;
                        n2.j jVar = (n2.j) obj;
                        String str2 = jVar.d;
                        String str3 = jVar.c;
                        long j10 = jVar.b;
                        if (str2.equals("P1M")) {
                            str = jVar.a;
                        } else if (jVar.d.equals("P1Y")) {
                            if (MessagesController.getInstance(i9).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(j10 / 12, str3, 6);
                            } else {
                                i11 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(j10, str3, 6);
                            }
                        }
                    }
                }
            }
            return str == null ? LocaleController.getString(R.string.Loading) : LocaleController.formatString(i11, str);
        }
        TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(i9).getPremiumPromo();
        if (premiumPromo == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList3 = premiumPromo.period_options;
        int size2 = arrayList3.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                break;
            }
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList3.get(i14);
            i14++;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
            int i15 = tL_premiumSubscriptionOption4.months;
            if (i15 == 12) {
                tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                break;
            }
            if (tL_premiumSubscriptionOption2 == null && i15 == 1) {
                tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
            }
        }
        if (tL_premiumSubscriptionOption2 == null) {
            return LocaleController.getString(R.string.SubscribeToPremiumNoPrice);
        }
        if (tL_premiumSubscriptionOption2.months != 12) {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
        } else if (MessagesController.getInstance(i9).showAnnualPerMonth) {
            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount / 12, tL_premiumSubscriptionOption2.currency);
        } else {
            i11 = R.string.SubscribeToPremiumPerYear;
            formatCurrency = BillingController.getInstance().formatCurrency(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
        }
        return LocaleController.formatString(i11, formatCurrency);
    }

    public static void o0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new ih.q5(5));
    }

    public static void p0(int i9, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i9).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String k02 = k0(i10);
        if (k02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = k02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i9).sendRequest(tL_help_saveAppLog, new ih.q5(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q0(String str) {
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ih.q5(5));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        bw0 bw0Var;
        fw0 fw0Var = this.Q;
        return fw0Var == null || (bw0Var = fw0Var.d) == null || !bw0Var.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9 = 1;
        this.t0 = new ra(this, i9);
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.M;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nj, false);
        int i10 = org.telegram.ui.ActionBar.f6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.f6.w0(null, i10, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lj, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.N = linearGradient2;
        linearGradient2.setLocalMatrix(this.O);
        this.P.setShader(this.N);
        this.H = new qv0(context, null);
        this.I = new zf.p1(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i11 = this.c0;
        if (i11 == 0) {
            m0(this.currentAccount, arrayList);
        } else {
            l0(this.currentAccount, arrayList, false);
            l0(this.currentAccount, arrayList2, true);
            pf.r1.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                pf.g.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                pf.u d = pf.u.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.E = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.h5), PorterDuff.Mode.MULTIPLY));
        this.E.getPadding(rect);
        this.T = AndroidUtilities.statusBarHeight;
        this.Z = new uv0(this, context);
        pg.i iVar = new pg.i(this.Z);
        uv0 uv0Var = this.Z;
        ig.a aVar = this.r0;
        aVar.d = iVar;
        aVar.e = uv0Var;
        pg.i iVar2 = new pg.i(this.Z);
        uv0 uv0Var2 = this.Z;
        ig.a aVar2 = this.s0;
        aVar2.d = iVar2;
        aVar2.e = uv0Var2;
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.a = wk0Var;
        wk0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new kg.b(this, 6));
        this.a.C0(new sv0(this, i9));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.wk0 wk0Var2 = this.a;
        org.telegram.ui.Components.bz bzVar = new org.telegram.ui.Components.bz(this.a, (AndroidUtilities.dp(68.0f) + this.T) - AndroidUtilities.dp(16.0f));
        this.L = bzVar;
        wk0Var2.setLayoutManager(bzVar);
        this.L.R = true;
        this.a.setAdapter(new yv0(this));
        this.a.j(new l3(this, 25));
        this.Q = new fw0(this, context);
        zf.w1 w1Var = new zf.w1(context);
        this.R = w1Var;
        w1Var.b();
        if (i11 == 1) {
            if (this.d0) {
                zf.v1 v1Var = this.R.a;
                v1Var.q = true;
                v1Var.K = false;
                v1Var.H = true;
                v1Var.J = true;
                v1Var.k = AndroidUtilities.dp(-14.0f);
                zf.v1 v1Var2 = this.R.a;
                v1Var2.x = 2000L;
                v1Var2.y = 3000;
                v1Var2.r = 16;
                v1Var2.G = false;
                v1Var2.N = 28;
                v1Var2.P = i10;
            } else {
                zf.v1 v1Var3 = this.R.a;
                v1Var3.J = true;
                v1Var3.k = AndroidUtilities.dp(28.0f);
                zf.v1 v1Var4 = this.R.a;
                v1Var4.x = 2000L;
                v1Var4.y = 3000;
                v1Var4.r = 16;
                v1Var4.G = false;
                v1Var4.N = 28;
            }
        }
        this.Q.d.setStarParticlesView(this.R);
        this.Z.addView(this.R, g7.e6.c(-2.0f, -1));
        this.Z.addView(this.Q, g7.e6.c(-2.0f, -1));
        this.a.setOnItemClickListener(new i(this, 23));
        this.Z.addView(this.a, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.G = new FrameLayout(context);
        zf.p0 p0Var = new zf.p0(context, getResourceProvider(), false);
        this.a0 = p0Var;
        p0Var.E = true;
        p0Var.setClickable(false);
        p0Var.r.setClickable(false);
        p0Var.setStateListAnimator(null);
        s0(false);
        this.F = new FrameLayout(context);
        this.G.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.G.addView(this.a0, g7.e6.c(-1.0f, -1));
        View view = this.G;
        kg.d c10 = aVar.c(view, null, false);
        lg.d dVar = new lg.d(this.resourceProvider);
        int i12 = 2;
        dVar.e = new mg.b(i12);
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
        g7.g6.b(this.G, 0.02f, 1.5f);
        this.F.addView(this.G, g7.e6.d(-1, 72.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ig.b bVar = new ig.b(aVar.c(this.F, null, false));
        bVar.b(AndroidUtilities.dp(40.0f), false);
        this.p0 = new ig.b(aVar.c(this.Z, null, false));
        this.F.setBackground(bVar);
        if (getUserConfig().isClientActivated()) {
            this.Z.addView(this.F, g7.e6.e(-1, -2, 80));
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
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 14));
        this.actionBar.setForceSkipTouches(true);
        this.Z.addView(this.actionBar, g7.e6.e(-1, -2, 48));
        t0();
        v0();
        this.Q.d.j(200L);
        if (this.l0) {
            AndroidUtilities.runOnUIThread(new sv0(this, i12), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        q0(this.e0);
        View view2 = this.fragmentView;
        dl0 dl0Var = new dl0(this, 8);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view2, dl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.billingProductDetailsUpdated || i9 == NotificationCenter.premiumPromoUpdated) {
            s0(false);
            this.Q.a();
        }
        if (i9 == NotificationCenter.currentUserPremiumStatusChanged || i9 == NotificationCenter.premiumPromoUpdated) {
            this.Q.b();
            this.Q.a();
            v0();
            this.a.getAdapter().l();
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.c;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new e(this, 28), org.telegram.ui.ActionBar.f6.Lj, org.telegram.ui.ActionBar.f6.Mj, org.telegram.ui.ActionBar.f6.Nj, org.telegram.ui.ActionBar.f6.Oj, org.telegram.ui.ActionBar.f6.Pj, org.telegram.ui.ActionBar.f6.Qj, org.telegram.ui.ActionBar.f6.Rj, org.telegram.ui.ActionBar.f6.Sj, org.telegram.ui.ActionBar.f6.Tj, org.telegram.ui.ActionBar.f6.Vj, org.telegram.ui.ActionBar.f6.Wj, org.telegram.ui.ActionBar.f6.Uj, org.telegram.ui.ActionBar.f6.Zj);
    }

    public final void i0() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.q0) == null) {
            return;
        }
        this.v0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.k0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        eVar.g(1, this.u0);
        eVar.e(this.t0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isLightStatusBar() {
        return this.d0;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.n0;
        if (frameLayout == null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new bc0(this, 18));
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        u0(false);
    }

    @Override // org.telegram.ui.ActionBar.o2
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
            int i9 = 0;
            while (i9 < size) {
                TLRPC.Document document = arrayList.get(i9);
                i9++;
                FileLoader.getInstance(this.currentAccount).loadFile(document, getMediaDataController().getPremiumPromo(), 3, 0);
            }
        }
        if (this.c0 == 1) {
            pf.u1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.premiumPromoUpdated);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        bw0 bw0Var;
        super.onPause();
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
            bw0Var.setDialogVisible(true);
        }
        zf.w1 w1Var = this.R;
        if (w1Var != null) {
            w1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        bw0 bw0Var;
        super.onResume();
        fw0 fw0Var = this.Q;
        if (fw0Var != null && (bw0Var = fw0Var.d) != null) {
            bw0Var.setPaused(false);
            this.Q.d.setDialogVisible(false);
        }
        this.R.setPaused(false);
        setBulletinDelegate(new x8(this, 7));
    }

    public final void r0() {
        fw0 fw0Var;
        if (this.Z.getMeasuredWidth() == 0 || this.Z.getMeasuredHeight() == 0 || (fw0Var = this.Q) == null || fw0Var.d == null) {
            return;
        }
        if (this.d0) {
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.f6.Mj), getThemedColor(org.telegram.ui.ActionBar.f6.h5)));
            this.Q.d.setBackgroundBitmap(createBitmap);
            return;
        }
        int measuredWidth = this.Z.getMeasuredWidth();
        int measuredHeight = this.Z.getMeasuredHeight();
        zf.z0 z0Var = this.i0;
        z0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.h0;
        canvas.save();
        canvas.scale(100.0f / this.Z.getMeasuredWidth(), 100.0f / this.Z.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.Z.getMeasuredWidth(), this.Z.getMeasuredHeight(), z0Var.f);
        canvas.restore();
        this.Q.d.setBackgroundBitmap(this.g0);
    }

    public final void s0(boolean z10) {
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
                this.a0.a(n0(this.currentAccount, (hw0) arrayList.get(this.e)), null, z10);
                final int i9 = 0;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rv0
                    public final /* synthetic */ PremiumPreviewFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i9) {
                            case 0:
                                PremiumPreviewFragment.j0(this.b, null, "settings", null);
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
                                PremiumPreviewFragment.j0(premiumPreviewFragment, hw0Var, "settings", eVar);
                                return;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((hw0) arrayList.get(this.e)).f == null)) {
                this.a0.a(LocaleController.getString(R.string.Loading), null, z10);
                this.G.setOnClickListener(new fh.n(23));
                this.a0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.a0.a(n0(this.currentAccount, (hw0) arrayList.get(this.e)), null, z10);
                final int i10 = 1;
                this.G.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rv0
                    public final /* synthetic */ PremiumPreviewFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
                        switch (i10) {
                            case 0:
                                PremiumPreviewFragment.j0(this.b, null, "settings", null);
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
                                PremiumPreviewFragment.j0(premiumPreviewFragment, hw0Var, "settings", eVar);
                                return;
                        }
                    }
                });
                this.a0.setFlickerDisabled(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        u0(showDialog != null);
        return showDialog;
    }

    public final void t0() {
        org.telegram.ui.ActionBar.k kVar;
        ag.a aVar;
        if (this.Q == null || (kVar = this.actionBar) == null) {
            return;
        }
        boolean z10 = this.d0;
        kVar.C(org.telegram.ui.ActionBar.f6.w0(null, z10 ? org.telegram.ui.ActionBar.f6.G6 : org.telegram.ui.ActionBar.f6.Tj, false), true);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.w0(null, z10 ? org.telegram.ui.ActionBar.f6.G6 : org.telegram.ui.ActionBar.f6.Tj, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.Tj;
        kVar2.A(i0.a.k(org.telegram.ui.ActionBar.f6.w0(null, i9, false), 60), false);
        this.R.a.g();
        fw0 fw0Var = this.Q;
        if (fw0Var != null) {
            fw0Var.a.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, z10 ? org.telegram.ui.ActionBar.f6.G6 : i9, false));
            TextView textView = this.Q.b;
            if (z10) {
                i9 = org.telegram.ui.ActionBar.f6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            bw0 bw0Var = this.Q.d;
            if (bw0Var != null && (aVar = bw0Var.b) != null) {
                if (z10) {
                    aVar.w = org.telegram.ui.ActionBar.f6.Xj;
                    aVar.x = org.telegram.ui.ActionBar.f6.Yj;
                }
                aVar.b();
            }
        }
        r0();
    }

    public final void u0(boolean z10) {
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

    public final void v0() {
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
        int i9 = this.c0;
        if (i9 == 1 && getUserConfig().isPremium()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.x = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.s = i11;
            this.v = i12;
            int size2 = this.c.size() + i12;
            this.h = size2;
            this.w = size2;
        }
        int i13 = this.h;
        this.y = i13;
        this.h = i13 + 2;
        this.B = i13 + 1;
        if (i9 == 1 && getUserConfig().isPremium()) {
            int i14 = this.h;
            this.C = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.D = i14 + 2;
        }
        FrameLayout frameLayout = this.F;
        if (getUserConfig().isPremium() && ((hw0Var = this.f) == null || hw0Var.a.months >= ((hw0) this.d.get(this.e)).a.months || this.l0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        int dp = this.F.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        org.telegram.ui.Components.bz bzVar = this.L;
        bzVar.M = (this.T + dp) - AndroidUtilities.dp(16.0f);
        bzVar.p1();
        this.L.S = dp;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
