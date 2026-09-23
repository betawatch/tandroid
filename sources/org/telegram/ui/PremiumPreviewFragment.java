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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public nw0 L;
    public rg.p1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.qz P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public cx0 U;
    public rg.v1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.ml0 a;
    public boolean a0;
    public final ArrayList b;
    public float b0;
    public final ArrayList c;
    public int c0;
    public final ArrayList d;
    public rw0 d0;
    public int e;
    public rg.p0 e0;
    public ex0 f;
    public float f0;
    public final int g0;
    public int h;
    public final boolean h0;
    public final String i0;
    public boolean j0;
    public final Bitmap k0;
    public final Canvas l0;
    public final rg.z0 m0;
    public int n;
    public final rg.z0 n0;
    public i0.b o0;
    public boolean p0;
    public float q0;
    public int r;
    public FrameLayout r0;
    public int s;
    public tw0 s0;
    int showAdsRow;
    public ah.d t0;
    public final ah.h u0;
    public int v;
    public final ah.c v0;
    public int w;
    public final ah.c w0;
    public int x;
    public va x0;
    public int y;
    public final ArrayList y0;
    public final RectF z0;

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
        this.m0 = new rg.z0(org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, null);
        this.o0 = i0.b.e;
        rg.z0 z0Var = new rg.z0(org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, -1, -1, null);
        this.n0 = z0Var;
        z0Var.m = true;
        z0Var.o = 0.0f;
        z0Var.p = 0.0f;
        z0Var.q = 1.0f;
        z0Var.b = 0.0f;
        z0Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.y0 = arrayList;
        RectF rectF = new RectF();
        this.z0 = rectF;
        arrayList.add(rectF);
        this.g0 = i10;
        if (!org.telegram.ui.ActionBar.h6.I.q() && i10 == 1) {
            z10 = true;
        }
        this.h0 = z10;
        this.i0 = str;
        n7.a1 a1Var = new n7.a1(this);
        if (Build.VERSION.SDK_INT >= 31) {
            ah.h hVar = new ah.h(true);
            this.u0 = hVar;
            fh.d dVar = new fh.d(null);
            dVar.d = hVar;
            dVar.e = -3;
            dVar.f = a1Var;
            this.v0 = new ah.c(dVar);
        } else {
            this.u0 = null;
            this.v0 = new ah.c(a1Var);
        }
        this.w0 = new ah.c(a1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void U(PremiumPreviewFragment premiumPreviewFragment, View view, int i10) {
        org.telegram.ui.Components.o5 o5Var;
        nw0 nw0Var;
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
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                s8Var.setChecked(!s8Var.b());
                userFull.sponsored_enabled = s8Var.b();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = userFull.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new m(premiumPreviewFragment, 17));
                premiumPreviewFragment.getMessagesStorage().updateUserInfo(userFull, false);
                return;
            }
            if (view instanceof nw0) {
                nw0 nw0Var2 = (nw0) view;
                ex0 ex0Var = null;
                if (i13 != 1 || !premiumPreviewFragment.getUserConfig().isPremium()) {
                    q0(premiumPreviewFragment.currentAccount, nw0Var2.f.a);
                    int i14 = premiumPreviewFragment.e;
                    if (i14 >= 0 && i14 < arrayList.size()) {
                        ex0Var = (ex0) arrayList.get(premiumPreviewFragment.e);
                    }
                    premiumPreviewFragment.showDialog(new rg.x0(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i13 == 1, nw0Var2.f.a, false, ex0Var));
                    return;
                }
                int i15 = nw0Var2.f.a;
                if (i15 == 29) {
                    premiumPreviewFragment.presentFragment(new hg.f1());
                    return;
                }
                if (i15 == 32) {
                    premiumPreviewFragment.presentFragment(new hg.x0());
                    return;
                }
                if (i15 == 33) {
                    hg.d dVar = new hg.d(null);
                    dVar.h = -4;
                    premiumPreviewFragment.presentFragment(dVar);
                    return;
                }
                if (i15 == 30) {
                    premiumPreviewFragment.presentFragment(new hg.h1());
                    return;
                }
                if (i15 == 34) {
                    premiumPreviewFragment.presentFragment(new hg.v0());
                    return;
                }
                if (i15 == 31) {
                    premiumPreviewFragment.presentFragment(new hg.z1());
                    return;
                }
                if (i15 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", UserConfig.getInstance(premiumPreviewFragment.currentAccount).getClientUserId());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.ca0(bundle, null));
                    return;
                }
                if (i15 != 12) {
                    if (i15 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i15 == 36) {
                        premiumPreviewFragment.presentFragment(new hg.n());
                        return;
                    } else {
                        if (i15 == 37) {
                            premiumPreviewFragment.presentFragment(new hg.x());
                            return;
                        }
                        return;
                    }
                }
                Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(premiumPreviewFragment.getUserConfig().getCurrentUser());
                ai.m0 m0Var = new ai.m0(19, premiumPreviewFragment, nw0Var2);
                if (premiumPreviewFragment.s0 == null) {
                    q61[] q61VarArr = new q61[1];
                    boolean z10 = ((float) (nw0Var2.getHeight() + nw0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    int min = (int) Math.min(AndroidUtilities.dp(330.0f), AndroidUtilities.displaySize.y * 0.75f);
                    int min2 = (int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f);
                    org.telegram.ui.Components.o5 o5Var2 = nw0Var2.h;
                    if (o5Var2 != null) {
                        Drawable[] drawableArr = o5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.q5) {
                                ((org.telegram.ui.Components.q5) drawable).p(o5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.o5 o5Var3 = nw0Var2.h;
                        if (o5Var3 != null) {
                            o5Var3.f();
                            nw0Var2.c();
                            Rect rect = AndroidUtilities.rectTmp2;
                            rect.set(nw0Var2.h.getBounds());
                            int dp = z10 ? (AndroidUtilities.dp(12.0f) + (-rect.centerY())) - min : (-(nw0Var2.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                            i12 = rect.centerX() - (AndroidUtilities.displaySize.x - min2);
                            int i16 = dp;
                            o5Var = o5Var3;
                            i11 = i16;
                            nw0Var = nw0Var2;
                            int i17 = i11;
                            sw0 sw0Var = new sw0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), !z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z10 ? 24 : 16, m0Var, q61VarArr);
                            sw0Var.g1 = true;
                            sw0Var.setSelected(emojiStatusDocumentId);
                            sw0Var.setSaveState(3);
                            sw0Var.y(o5Var, nw0Var);
                            tw0 tw0Var = new tw0(premiumPreviewFragment, sw0Var);
                            premiumPreviewFragment.s0 = tw0Var;
                            q61VarArr[0] = tw0Var;
                            tw0Var.showAsDropDown(nw0Var2, 0, i17, 53);
                            q61VarArr[0].b();
                        }
                        o5Var = o5Var3;
                        nw0Var = nw0Var2;
                    } else {
                        o5Var = null;
                        nw0Var = null;
                    }
                    i11 = 0;
                    i12 = 0;
                    if (!z10) {
                    }
                    int i172 = i11;
                    sw0 sw0Var2 = new sw0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i12), !z10 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), !z10 ? 24 : 16, m0Var, q61VarArr);
                    sw0Var2.g1 = true;
                    sw0Var2.setSelected(emojiStatusDocumentId);
                    sw0Var2.setSaveState(3);
                    sw0Var2.y(o5Var, nw0Var);
                    tw0 tw0Var2 = new tw0(premiumPreviewFragment, sw0Var2);
                    premiumPreviewFragment.s0 = tw0Var2;
                    q61VarArr[0] = tw0Var2;
                    tw0Var2.showAsDropDown(nw0Var2, 0, i172, 53);
                    q61VarArr[0].b();
                }
            }
        }
    }

    public static void k0(org.telegram.ui.ActionBar.n2 n2Var, ex0 ex0Var, String str, c5.f fVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo premiumPromo;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            if (n2Var == null) {
                new rg.c1(n2Var).show();
                return;
            } else {
                n2Var.showDialog(new rg.c1(n2Var));
                return;
            }
        }
        int currentAccount = n2Var == null ? UserConfig.selectedAccount : n2Var.getCurrentAccount();
        if (MessagesController.getInstance(currentAccount).isFrozen()) {
            b.b(currentAccount);
            return;
        }
        if (ex0Var == null && (premiumPromo = MediaDataController.getInstance(currentAccount).getPremiumPromo()) != null) {
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
                    ex0Var = new ex0(tL_premiumSubscriptionOption3);
                } else if (i11 == 12) {
                    ex0Var = new ex0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        ex0 ex0Var2 = ex0Var;
        p0();
        if (!BuildVars.useInvoiceBilling()) {
            c5.o oVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (oVar == null || oVar.h.isEmpty()) {
                return;
            }
            if (ex0Var2.f == null) {
                ex0Var2.f = BillingController.PREMIUM_PRODUCT_DETAILS;
            }
            ex0Var2.a();
            if (ex0Var2.g == null) {
                return;
            }
            BillingController.getInstance().queryPurchases("subs", new da(n2Var, currentAccount, fVar, ex0Var2, 7));
            return;
        }
        Activity parentActivity = n2Var != null ? n2Var.getParentActivity() : LaunchActivity.G1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (ex0Var2 != null && (tL_premiumSubscriptionOption = ex0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.X0 = true;
                }
                nf.f.s(launchActivity, tL_premiumSubscriptionOption.bot_url);
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
            launchActivity.X0 = true;
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
            arrayList.add(new dx0(12, R.drawable.filled_premium_status2, LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatus), LocaleController.getString(R.string.PremiumPreviewBusinessEmojiStatusDescription)));
            arrayList.add(new dx0(35, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewFolderTags), LocaleController.getString(R.string.PremiumPreviewFolderTagsDescription)));
            arrayList.add(new dx0(14, R.drawable.filled_premium_camera, LocaleController.getString(R.string.PremiumPreviewBusinessStories), LocaleController.getString(R.string.PremiumPreviewBusinessStoriesDescription)));
        } else {
            arrayList.add(new dx0(29, R.drawable.filled_location, LocaleController.getString(R.string.PremiumBusinessLocation), LocaleController.getString(R.string.PremiumBusinessLocationDescription)));
            arrayList.add(new dx0(30, R.drawable.filled_premium_hours, LocaleController.getString(R.string.PremiumBusinessOpeningHours), LocaleController.getString(R.string.PremiumBusinessOpeningHoursDescription)));
            arrayList.add(new dx0(31, R.drawable.filled_open_message, LocaleController.getString(R.string.PremiumBusinessQuickReplies), LocaleController.getString(R.string.PremiumBusinessQuickRepliesDescription)));
            arrayList.add(new dx0(32, R.drawable.premium_status, LocaleController.getString(R.string.PremiumBusinessGreetingMessages), LocaleController.getString(R.string.PremiumBusinessGreetingMessagesDescription)));
            arrayList.add(new dx0(33, R.drawable.filled_premium_away, LocaleController.getString(R.string.PremiumBusinessAwayMessages), LocaleController.getString(R.string.PremiumBusinessAwayMessagesDescription)));
            arrayList.add(new dx0(34, R.drawable.filled_premium_bots, LocaleController.getString(R.string.PremiumBusinessChatbots2), LocaleController.getString(R.string.PremiumBusinessChatbotsDescription)));
            arrayList.add(new dx0(37, R.drawable.filled_premium_chatlink, LocaleController.getString(R.string.PremiumBusinessChatLinks), LocaleController.getString(R.string.PremiumBusinessChatLinksDescription)));
            arrayList.add(new dx0(36, R.drawable.filled_premium_intro, LocaleController.getString(R.string.PremiumBusinessIntro), LocaleController.getString(R.string.PremiumBusinessIntroDescription)));
        }
        if (messagesController.businessFeaturesTypesToPosition.size() > 0) {
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (messagesController.businessFeaturesTypesToPosition.get(((dx0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new qw0(messagesController, 0));
    }

    public static void n0(int i10, ArrayList arrayList) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        int i11 = 0;
        int i12 = 1;
        arrayList.add(new dx0(0, R.drawable.msg_premium_limits, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.formatString(R.string.PremiumPreviewLimitsDescription, Integer.valueOf(messagesController.channelsLimitPremium), Integer.valueOf(messagesController.dialogFiltersLimitPremium), Integer.valueOf(messagesController.dialogFiltersPinnedLimitPremium), Integer.valueOf(messagesController.publicLinksLimitPremium), 4)));
        arrayList.add(new dx0(14, R.drawable.msg_filled_stories, LocaleController.getString(R.string.PremiumPreviewStories), LocaleController.formatString(R.string.PremiumPreviewStoriesDescription, new Object[0])));
        arrayList.add(new dx0(1, R.drawable.msg_premium_uploads, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.PremiumPreviewUploadsDescription)));
        arrayList.add(new dx0(2, R.drawable.msg_premium_speed, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.PremiumPreviewDownloadSpeedDescription)));
        arrayList.add(new dx0(8, R.drawable.msg_premium_voice, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.PremiumPreviewVoiceToTextDescription)));
        arrayList.add(new dx0(3, R.drawable.msg_premium_ads, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.PremiumPreviewNoAdsDescription)));
        arrayList.add(new dx0(4, R.drawable.msg_premium_reactions, LocaleController.getString(R.string.PremiumPreviewReactions2), LocaleController.getString(R.string.PremiumPreviewReactions2Description)));
        arrayList.add(new dx0(5, R.drawable.msg_premium_stickers, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.PremiumPreviewStickersDescription)));
        arrayList.add(new dx0(11, R.drawable.msg_premium_emoji, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.PremiumPreviewEmojiDescription)));
        arrayList.add(new dx0(9, R.drawable.menu_premium_tools, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagementDescription)));
        arrayList.add(new dx0(6, R.drawable.msg_premium_badge, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.PremiumPreviewProfileBadgeDescription)));
        arrayList.add(new dx0(27, R.drawable.filled_messages_paid, LocaleController.getString(R.string.PremiumPreviewPaidMessages), LocaleController.getString(R.string.PremiumPreviewPaidMessagesDescription)));
        arrayList.add(new dx0(7, R.drawable.msg_premium_avatar, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.PremiumPreviewAnimatedProfilesDescription)));
        arrayList.add(new dx0(24, R.drawable.premium_tags, LocaleController.getString(R.string.PremiumPreviewTags2), LocaleController.getString(R.string.PremiumPreviewTagsDescription2)));
        arrayList.add(new dx0(10, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.PremiumPreviewAppIconDescription)));
        arrayList.add(new dx0(12, R.drawable.premium_status, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.PremiumPreviewEmojiStatusDescription)));
        arrayList.add(new dx0(13, R.drawable.msg_premium_translate, LocaleController.getString(R.string.PremiumPreviewTranslations), LocaleController.getString(R.string.PremiumPreviewTranslationsDescription)));
        arrayList.add(new dx0(22, R.drawable.premium_wallpaper, LocaleController.getString(R.string.PremiumPreviewWallpaper), LocaleController.getString(R.string.PremiumPreviewWallpaperDescription)));
        arrayList.add(new dx0(23, R.drawable.premium_colors, LocaleController.getString(R.string.PremiumPreviewProfileColor), LocaleController.getString(R.string.PremiumPreviewProfileColorDescription)));
        arrayList.add(new dx0(26, R.drawable.menu_premium_seen, LocaleController.getString(R.string.PremiumPreviewLastSeen), LocaleController.getString(R.string.PremiumPreviewLastSeenDescription)));
        arrayList.add(new dx0(28, R.drawable.filled_premium_business, LocaleController.getString(R.string.TelegramBusiness), LocaleController.getString(R.string.PremiumPreviewBusinessDescription)));
        arrayList.add(new dx0(38, R.drawable.menu_premium_effects, LocaleController.getString(R.string.PremiumPreviewEffects), LocaleController.getString(R.string.PremiumPreviewEffectsDescription)));
        arrayList.add(new dx0(39, R.drawable.msg_premium_icons, LocaleController.getString(R.string.PremiumPreviewTodo), LocaleController.getString(R.string.PremiumPreviewTodoDescription)));
        arrayList.add(new dx0(41, R.drawable.filled_sharing_off2_24, LocaleController.getString(R.string.PremiumPreviewSharingDisable), LocaleController.getString(R.string.PremiumPreviewSharingDisableDescription)));
        arrayList.add(new dx0(42, R.drawable.premium_ai_editor, LocaleController.getString(R.string.PremiumPreviewAIEditor), LocaleController.getString(R.string.PremiumPreviewAIEditorDescription)));
        arrayList.add(new dx0(43, R.drawable.premium_rich_editor, LocaleController.getString(R.string.PremiumPreviewRichEditor), LocaleController.getString(R.string.PremiumPreviewRichEditorDescription)));
        if (messagesController.premiumFeaturesTypesToPosition.size() > 0) {
            while (i11 < arrayList.size()) {
                if (messagesController.premiumFeaturesTypesToPosition.get(((dx0) arrayList.get(i11)).a, -1) == -1 && !BuildVars.DEBUG_VERSION) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
        }
        Collections.sort(arrayList, new qw0(messagesController, i12));
    }

    public static String o0(int i10, ex0 ex0Var) {
        int i11;
        String formatCurrency;
        if (BuildVars.IS_BILLING_UNAVAILABLE) {
            return LocaleController.getString(R.string.SubscribeToPremiumNotAvailable);
        }
        int i12 = R.string.SubscribeToPremium;
        if (ex0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = ex0Var.a;
            if (!BuildVars.useInvoiceBilling()) {
                ex0Var.a();
                if (ex0Var.g == null) {
                    return LocaleController.getString(R.string.Loading);
                }
            }
            boolean isPremium = UserConfig.getInstance(i10).isPremium();
            int i13 = tL_premiumSubscriptionOption.months;
            boolean z10 = i13 > 12 && i13 % 12 == 0;
            boolean z11 = i13 == 12;
            String f7 = z11 ? ex0Var.f() : ex0Var.e();
            if (isPremium) {
                i11 = z11 ? R.string.UpgradePremiumPerYear : R.string.UpgradePremiumPerMonth;
            } else if (z11) {
                if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                    i11 = R.string.SubscribeToPremium;
                    f7 = ex0Var.e();
                } else {
                    i11 = R.string.SubscribeToPremiumPerYear;
                    f7 = ex0Var.d();
                }
            } else if (!z10) {
                i11 = R.string.SubscribeToPremium;
                f7 = ex0Var.e();
            } else {
                if (!MessagesController.getInstance(i10).showAnnualPerMonth) {
                    return LocaleController.formatString(R.string.SubscribeToPremiumPerCustom, ex0Var.d(), LocaleController.formatPluralString("Years", tL_premiumSubscriptionOption.months / 12, new Object[0]));
                }
                i11 = R.string.SubscribeToPremium;
                f7 = ex0Var.e();
            }
            return LocaleController.formatString(i11, f7);
        }
        String str = null;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
        str = null;
        str = null;
        if (!BuildVars.useInvoiceBilling()) {
            c5.o oVar = BillingController.PREMIUM_PRODUCT_DETAILS;
            if (oVar != null) {
                ArrayList arrayList = oVar.h;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = ((c5.n) arrayList.get(0)).b.a;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        Object obj = arrayList2.get(i14);
                        i14++;
                        c5.l lVar = (c5.l) obj;
                        String str2 = lVar.d;
                        String str3 = lVar.c;
                        long j3 = lVar.b;
                        if (str2.equals("P1M")) {
                            str = lVar.a;
                        } else if (lVar.d.equals("P1Y")) {
                            if (MessagesController.getInstance(i10).showAnnualPerMonth) {
                                str = BillingController.getInstance().formatCurrency(j3 / 12, str3, 6);
                            } else {
                                i12 = R.string.SubscribeToPremiumPerYear;
                                str = BillingController.getInstance().formatCurrency(j3, str3, 6);
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
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_help_saveAppLog, new ai.u7(8));
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_help_saveAppLog, new ai.u7(8));
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new ai.u7(8));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        yw0 yw0Var;
        cx0 cx0Var = this.U;
        return cx0Var == null || (yw0Var = cx0Var.d) == null || !yw0Var.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        float f7;
        int i10 = 2;
        this.x0 = new va(this, i10);
        int i11 = 1;
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Oj, false);
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nj, false);
        int i12 = org.telegram.ui.ActionBar.h6.Mj;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w02, w03, org.telegram.ui.ActionBar.h6.w0(null, i12, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Lj, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Kj, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new nw0(context, null);
        this.M = new rg.p1(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i13 = this.g0;
        if (i13 == 0) {
            n0(this.currentAccount, arrayList);
        } else {
            m0(this.currentAccount, arrayList, false);
            m0(this.currentAccount, arrayList2, true);
            hg.c2.f(this.currentAccount).h();
            if (getUserConfig().isPremium()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                MediaDataController.getInstance(this.currentAccount).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetShortName, false);
                hg.g.a(this.currentAccount).c(null);
                if (getMessagesController().suggestedFilters.isEmpty()) {
                    getMessagesController().loadSuggestedFilters();
                }
                hg.a0 d = hg.a0.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable mutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.I = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = AndroidUtilities.statusBarHeight;
        this.d0 = new rw0(this, context);
        hh.k kVar = new hh.k(this.d0);
        rw0 rw0Var = this.d0;
        ah.c cVar = this.v0;
        cVar.f = kVar;
        cVar.g = rw0Var;
        hh.k kVar2 = new hh.k(this.d0);
        rw0 rw0Var2 = this.d0;
        ah.c cVar2 = this.w0;
        cVar2.f = kVar2;
        cVar2.g = rw0Var2;
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.a = ml0Var;
        ml0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new ch.b(this, 6));
        this.a.C0(new pw0(this, i11));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.ml0 ml0Var2 = this.a;
        org.telegram.ui.Components.qz qzVar = new org.telegram.ui.Components.qz(this.a, (AndroidUtilities.dp(68.0f) + this.X) - AndroidUtilities.dp(16.0f));
        this.P = qzVar;
        ml0Var2.setLayoutManager(qzVar);
        this.P.R = true;
        this.a.setAdapter(new vw0(this));
        int i14 = 24;
        this.a.j(new i3(this, i14));
        this.U = new cx0(this, context);
        rg.v1 v1Var = new rg.v1(context);
        this.V = v1Var;
        v1Var.b();
        if (i13 != 1) {
            f7 = 28.0f;
        } else if (this.h0) {
            rg.u1 u1Var = this.V.a;
            u1Var.q = true;
            u1Var.K = false;
            u1Var.H = true;
            u1Var.J = true;
            f7 = 28.0f;
            u1Var.k = AndroidUtilities.dp(-14.0f);
            rg.u1 u1Var2 = this.V.a;
            u1Var2.x = 2000L;
            u1Var2.y = 3000;
            u1Var2.r = 16;
            u1Var2.G = false;
            u1Var2.N = 28;
            u1Var2.P = i12;
        } else {
            f7 = 28.0f;
            rg.u1 u1Var3 = this.V.a;
            u1Var3.J = true;
            u1Var3.k = AndroidUtilities.dp(28.0f);
            rg.u1 u1Var4 = this.V.a;
            u1Var4.x = 2000L;
            u1Var4.y = 3000;
            u1Var4.r = 16;
            u1Var4.G = false;
            u1Var4.N = 28;
        }
        this.U.d.setStarParticlesView(this.V);
        this.d0.addView(this.V, w7.x5.c(-2.0f, -1));
        this.d0.addView(this.U, w7.x5.c(-2.0f, -1));
        this.a.setOnItemClickListener(new i(this, i14));
        this.d0.addView(this.a, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        rg.p0 p0Var = new rg.p0(context, getResourceProvider(), false);
        this.e0 = p0Var;
        p0Var.I = true;
        p0Var.setClickable(false);
        p0Var.r.setClickable(false);
        p0Var.setStateListAnimator(null);
        t0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.K.addView(this.e0, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = this.K;
        ch.d c10 = cVar.c(frameLayout, null, false);
        c10.o(eh.b.j(this.resourceProvider));
        c10.q(AndroidUtilities.dp(f7));
        c10.p(AndroidUtilities.dp(5.0f));
        frameLayout.setBackground(c10);
        w7.z5.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, w7.x5.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        ah.d dVar = new ah.d(cVar.c(this.J, null, false));
        dVar.b(AndroidUtilities.dp(40.0f), false);
        this.t0 = new ah.d(cVar.c(this.d0, null, false));
        this.J.setBackground(dVar);
        if (getUserConfig().isClientActivated()) {
            this.d0.addView(this.J, w7.x5.e(-1, -2, 80));
        }
        this.fragmentView = this.d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var == null || !((ActionBarLayout) c5Var).N0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 19));
        this.actionBar.setForceSkipTouches(true);
        this.d0.addView(this.actionBar, w7.x5.e(-1, -2, 48));
        u0();
        w0();
        this.U.d.j(200L);
        if (this.p0) {
            AndroidUtilities.runOnUIThread(new pw0(this, i10), 400L);
        }
        MediaDataController.getInstance(this.currentAccount).preloadPremiumPreviewStickers();
        r0(this.i0);
        View view = this.fragmentView;
        nl0 nl0Var = new nl0(this, 8);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view, nl0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.billingProductDetailsUpdated || i10 == NotificationCenter.premiumPromoUpdated) {
            t0(false);
            this.U.a();
        }
        if (i10 == NotificationCenter.currentUserPremiumStatusChanged || i10 == NotificationCenter.premiumPromoUpdated) {
            this.U.b();
            this.U.a();
            w0();
            this.a.getAdapter().l();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.c;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new e(this, 28), org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, org.telegram.ui.ActionBar.h6.Nj, org.telegram.ui.ActionBar.h6.Oj, org.telegram.ui.ActionBar.h6.Pj, org.telegram.ui.ActionBar.h6.Qj, org.telegram.ui.ActionBar.h6.Rj, org.telegram.ui.ActionBar.h6.Sj, org.telegram.ui.ActionBar.h6.Tj, org.telegram.ui.ActionBar.h6.Vj, org.telegram.ui.ActionBar.h6.Wj, org.telegram.ui.ActionBar.h6.Uj, org.telegram.ui.ActionBar.h6.Zj);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isLightStatusBar() {
        return this.h0;
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
        ah.h hVar;
        if (Build.VERSION.SDK_INT < 31 || (hVar = this.u0) == null) {
            return;
        }
        this.z0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.o0.d) - AndroidUtilities.dp(132.0f), this.fragmentView.getMeasuredWidth(), AndroidUtilities.dp(48.0f) + this.fragmentView.getMeasuredHeight());
        hVar.g(1, this.y0);
        hVar.e(this.x0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        FrameLayout frameLayout = this.r0;
        if (frameLayout == null) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        frameLayout.animate().translationY(AndroidUtilities.dp(1000.0f)).setListener(new wq0(this, 12));
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
        if (this.g0 == 1) {
            hg.g2.b(this.currentAccount).g();
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
        yw0 yw0Var;
        super.onPause();
        cx0 cx0Var = this.U;
        if (cx0Var != null && (yw0Var = cx0Var.d) != null) {
            yw0Var.setDialogVisible(true);
        }
        rg.v1 v1Var = this.V;
        if (v1Var != null) {
            v1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        yw0 yw0Var;
        super.onResume();
        cx0 cx0Var = this.U;
        if (cx0Var != null && (yw0Var = cx0Var.d) != null) {
            yw0Var.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new z8(this, 7));
    }

    public final void s0() {
        cx0 cx0Var;
        if (this.d0.getMeasuredWidth() == 0 || this.d0.getMeasuredHeight() == 0 || (cx0Var = this.U) == null || cx0Var.d == null) {
            return;
        }
        if (this.h0) {
            Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(i0.a.d(0.5f, getThemedColor(org.telegram.ui.ActionBar.h6.Mj), getThemedColor(org.telegram.ui.ActionBar.h6.h5)));
            this.U.d.setBackgroundBitmap(createBitmap);
            return;
        }
        int measuredWidth = this.d0.getMeasuredWidth();
        int measuredHeight = this.d0.getMeasuredHeight();
        rg.z0 z0Var = this.m0;
        z0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
        Canvas canvas = this.l0;
        canvas.save();
        canvas.scale(100.0f / this.d0.getMeasuredWidth(), 100.0f / this.d0.getMeasuredHeight());
        canvas.drawRect(0.0f, 0.0f, this.d0.getMeasuredWidth(), this.d0.getMeasuredHeight(), z0Var.f);
        canvas.restore();
        this.U.d.setBackgroundBitmap(this.k0);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        v0(showDialog != null);
        return showDialog;
    }

    public final void t0(boolean z10) {
        if (this.e0 == null) {
            return;
        }
        boolean isPremium = getUserConfig().isPremium();
        ArrayList arrayList = this.d;
        if (!isPremium || this.f == null || this.e >= arrayList.size() || ((ex0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (LocaleController.isRTL) {
                z10 = false;
            }
            if (BuildVars.IS_BILLING_UNAVAILABLE && this.e < arrayList.size()) {
                this.e0.a(o0(this.currentAccount, (ex0) arrayList.get(this.e)), null, z10);
                final int i10 = 0;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ow0
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
                                ex0 ex0Var = (ex0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                ex0 ex0Var2 = premiumPreviewFragment.f;
                                c5.f fVar = null;
                                if (ex0Var2 != null && (tL_premiumSubscriptionOption = ex0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                    fVar = new c5.f();
                                    fVar.a = lastPremiumToken;
                                    fVar.b = 5;
                                }
                                PremiumPreviewFragment.k0(premiumPreviewFragment, ex0Var, "settings", fVar);
                                return;
                        }
                    }
                });
                return;
            }
            if (!BuildVars.useInvoiceBilling() && (!BillingController.getInstance().isReady() || arrayList.isEmpty() || this.e >= arrayList.size() || ((ex0) arrayList.get(this.e)).f == null)) {
                this.e0.a(LocaleController.getString(R.string.Loading), null, z10);
                this.K.setOnClickListener(new ai.e2(20));
                this.e0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.e0.a(o0(this.currentAccount, (ex0) arrayList.get(this.e)), null, z10);
                final int i11 = 1;
                this.K.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ow0
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
                                ex0 ex0Var = (ex0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                                ex0 ex0Var2 = premiumPreviewFragment.f;
                                c5.f fVar = null;
                                if (ex0Var2 != null && (tL_premiumSubscriptionOption = ex0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                                    fVar = new c5.f();
                                    fVar.a = lastPremiumToken;
                                    fVar.b = 5;
                                }
                                PremiumPreviewFragment.k0(premiumPreviewFragment, ex0Var, "settings", fVar);
                                return;
                        }
                    }
                });
                this.e0.setFlickerDisabled(false);
            }
        }
    }

    public final void u0() {
        org.telegram.ui.ActionBar.k kVar;
        sg.a aVar;
        if (this.U == null || (kVar = this.actionBar) == null) {
            return;
        }
        boolean z10 = this.h0;
        kVar.B(org.telegram.ui.ActionBar.h6.w0(null, z10 ? org.telegram.ui.ActionBar.h6.G6 : org.telegram.ui.ActionBar.h6.Tj, false), true);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.w0(null, z10 ? org.telegram.ui.ActionBar.h6.G6 : org.telegram.ui.ActionBar.h6.Tj, false), false);
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.Tj;
        kVar2.A(i0.a.k(org.telegram.ui.ActionBar.h6.w0(null, i10, false), 60), false);
        this.V.a.g();
        cx0 cx0Var = this.U;
        if (cx0Var != null) {
            cx0Var.a.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, z10 ? org.telegram.ui.ActionBar.h6.G6 : i10, false));
            TextView textView = this.U.b;
            if (z10) {
                i10 = org.telegram.ui.ActionBar.h6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
            yw0 yw0Var = this.U.d;
            if (yw0Var != null && (aVar = yw0Var.b) != null) {
                if (z10) {
                    aVar.w = org.telegram.ui.ActionBar.h6.Xj;
                    aVar.x = org.telegram.ui.ActionBar.h6.Yj;
                }
                aVar.b();
            }
        }
        s0();
    }

    public final void v0(boolean z10) {
        yw0 yw0Var;
        if (z10 != this.Z) {
            this.Z = z10;
            cx0 cx0Var = this.U;
            if (cx0Var != null && (yw0Var = cx0Var.d) != null) {
                yw0Var.setDialogVisible(z10);
            }
            this.V.setPaused(z10);
            this.d0.invalidate();
        }
    }

    public final void w0() {
        ex0 ex0Var;
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
        if (getUserConfig().isPremium() && ((ex0Var = this.f) == null || ex0Var.a.months >= ((ex0) this.d.get(this.e)).a.months || this.p0)) {
            z10 = false;
        }
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z10, 1.0f, false);
        int dp = this.J.getVisibility() == 0 ? AndroidUtilities.dp(64.0f) : 0;
        org.telegram.ui.Components.qz qzVar = this.P;
        qzVar.M = (this.X + dp) - AndroidUtilities.dp(16.0f);
        qzVar.p1();
        this.P.S = dp;
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
