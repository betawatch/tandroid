package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d81 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50, og0, oe.d {
    public v71 E;
    public org.telegram.ui.Components.j9 F;
    public org.telegram.ui.Components.y9 G;
    public FrameLayout H;
    public FrameLayout I;
    public ImageView J;
    public TextView K;
    public TextView L;
    public TextView M;
    public boolean N;
    public View O;
    public View P;
    public int Q;
    public NotificationCenter.ObserversGroup R;
    public int S;
    public boolean T;
    public ValueAnimator U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public final oe.b a;
    public float a0;
    public a9 b;
    public final ArrayList b0;
    public org.telegram.ui.Components.r71 c;
    public int c0;
    public org.telegram.ui.ActionBar.y5 d;
    public int d0;
    public org.telegram.ui.ActionBar.y5 e;
    public int e0;
    public u71 f;
    public boolean f0;
    public org.telegram.ui.Components.g50 h;
    public AnimatorSet n;
    public org.telegram.ui.Cells.d4 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation v;
    public FrameLayout w;
    public FrameLayout x;
    public k0 y;

    public d81() {
        this(null);
    }

    public static boolean V(d81 d81Var, org.telegram.ui.Components.t61 t61Var, View view) {
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            hi.m3.j(d81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new p71(d81Var, 2));
            return true;
        }
        if (t61Var.H(org.telegram.ui.Cells.a7.class)) {
            Object obj2 = t61Var.G;
            String str = obj2 instanceof t01 ? ((t01) obj2).h : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(d81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new fy0(21, d81Var, str), false);
                H.W(d81Var.c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void W(d81 d81Var) {
        TLRPC.User user = MessagesController.getInstance(d81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(d81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(d81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.g50 g50Var = d81Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        g50Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new p71(d81Var, 0), new fi.e1(7), 0);
    }

    public static /* synthetic */ void X(d81 d81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.H0(LaunchActivity.I1, d81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(d81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void Y(d81 d81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(d81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(d81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new l71(2, d81Var, tL_attachMenuBot), 66);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(d81 d81Var) {
        String str;
        int i10;
        String string;
        String str2;
        int i11;
        String str3;
        CharSequence charSequence;
        String str4;
        CharSequence charSequence2;
        char c10;
        String str5;
        boolean z10;
        String str6;
        String str7;
        CharSequence charSequence3;
        int i12 = d81Var.Q + 1;
        d81Var.Q = i12;
        if (i12 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(d81Var.getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d81Var.getParentActivity(), 0, d81Var.resourceProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DebugMenu);
        String string2 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string3 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string4 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string5 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                str = "DebugMenuDisableLogs";
                i10 = R.string.DebugMenuDisableLogs;
            } else {
                str = "DebugMenuEnableLogs";
                i10 = R.string.DebugMenuEnableLogs;
            }
            string = LocaleController.getString(str, i10);
        }
        if (SharedConfig.inappCamera) {
            str2 = "DebugMenuDisableCamera";
            i11 = R.string.DebugMenuDisableCamera;
        } else {
            str2 = "DebugMenuEnableCamera";
            i11 = R.string.DebugMenuEnableCamera;
        }
        String string6 = LocaleController.getString(str2, i11);
        String string7 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string8 = LocaleController.getString(R.string.DebugMenuCallSettings);
        String string9 = (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) ? LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate) : null;
        String string10 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        String str8 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str9 = z11 ? "Clean app update" : null;
        String str10 = z11 ? "Reset suggestions" : null;
        String string11 = z11 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string12 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string13 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        String str11 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            str3 = null;
        }
        boolean z12 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str12 = z12 ? "Force remove premium suggestions" : null;
        String str13 = z12 ? "Share device info" : null;
        String str14 = z12 ? "Force performance class" : null;
        String str15 = (!z12 || org.telegram.ui.Components.o60.l()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        String string14 = LocaleController.getString(fi.c1.q(d81Var.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str16 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
        String str17 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
        String str18 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str19 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str20 = !SharedConfig.isUsingCamera2(d81Var.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str21 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str22 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            charSequence = null;
            if (Build.VERSION.SDK_INT >= 31) {
                str4 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str23 = !SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str24 = !SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                if (Build.VERSION.SDK_INT < 28) {
                    charSequence2 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    charSequence2 = charSequence;
                }
                String str25 = SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                String str26 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader" : charSequence;
                String str27 = !SharedConfig.frameMetricsEnabled ? "hide frame metrics" : "show frame metrics";
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    c10 = 28;
                    str5 = charSequence;
                } else {
                    str5 = SharedConfig.debugViewMetrics ? "disable debug view metrics" : "enable debug view metrics";
                    c10 = 28;
                }
                wi.a aVar = wi.e.a;
                aVar.a();
                String str28 = !aVar.d ? "hide experimental settings" : "show experimental settings";
                z10 = BuildVars.DEBUG_PRIVATE_VERSION;
                CharSequence charSequence4 = !z10 ? "Clear widget heights" : charSequence;
                if (z10) {
                    str6 = str28;
                    str7 = str20;
                    charSequence3 = charSequence;
                } else {
                    str6 = str28;
                    str7 = str20;
                    charSequence3 = "Widget static layers".concat(SharedConfig.widgetStaticLayers ? " ✓" : "");
                }
                CharSequence[] charSequenceArr = new CharSequence[45];
                charSequenceArr[0] = string2;
                charSequenceArr[1] = string3;
                charSequenceArr[2] = string4;
                charSequenceArr[3] = string5;
                charSequenceArr[4] = string;
                charSequenceArr[5] = string6;
                charSequenceArr[6] = string7;
                charSequenceArr[7] = string8;
                charSequenceArr[8] = charSequence;
                charSequenceArr[9] = string9;
                charSequenceArr[10] = string10;
                charSequenceArr[11] = str8;
                charSequenceArr[12] = str9;
                charSequenceArr[13] = str10;
                charSequenceArr[14] = string11;
                charSequenceArr[15] = string12;
                charSequenceArr[16] = string13;
                charSequenceArr[17] = str11;
                charSequenceArr[18] = str3;
                charSequenceArr[19] = str12;
                charSequenceArr[20] = str13;
                charSequenceArr[21] = str14;
                charSequenceArr[22] = str15;
                charSequenceArr[23] = string14;
                charSequenceArr[24] = str16;
                charSequenceArr[25] = str17;
                charSequenceArr[26] = str18;
                charSequenceArr[27] = str19;
                charSequenceArr[c10] = str7;
                charSequenceArr[29] = str21;
                charSequenceArr[30] = str22;
                charSequenceArr[31] = str4;
                charSequenceArr[32] = str23;
                charSequenceArr[33] = str24;
                charSequenceArr[34] = charSequence2;
                charSequenceArr[35] = "Reload app config";
                charSequenceArr[36] = str25;
                charSequenceArr[37] = "Make Memory Dump";
                charSequenceArr[38] = str26;
                charSequenceArr[39] = str27;
                charSequenceArr[40] = charSequence;
                charSequenceArr[41] = str5;
                charSequenceArr[42] = str6;
                charSequenceArr[43] = charSequence4;
                charSequenceArr[44] = charSequence3;
                alertDialog$Builder.f(charSequenceArr, new n4(d81Var, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), charSequence);
                d81Var.showDialog(alertDialog$Builder.a);
            }
        } else {
            charSequence = null;
        }
        str4 = charSequence;
        if (!SharedConfig.adaptableColorInBrowser) {
        }
        if (!SharedConfig.debugVideoQualities) {
        }
        if (Build.VERSION.SDK_INT < 28) {
        }
        if (SharedConfig.forceForumTabs) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        if (!SharedConfig.frameMetricsEnabled) {
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        wi.a aVar2 = wi.e.a;
        aVar2.a();
        if (!aVar2.d) {
        }
        z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        if (!z10) {
        }
        if (z10) {
        }
        CharSequence[] charSequenceArr2 = new CharSequence[45];
        charSequenceArr2[0] = string2;
        charSequenceArr2[1] = string3;
        charSequenceArr2[2] = string4;
        charSequenceArr2[3] = string5;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string6;
        charSequenceArr2[6] = string7;
        charSequenceArr2[7] = string8;
        charSequenceArr2[8] = charSequence;
        charSequenceArr2[9] = string9;
        charSequenceArr2[10] = string10;
        charSequenceArr2[11] = str8;
        charSequenceArr2[12] = str9;
        charSequenceArr2[13] = str10;
        charSequenceArr2[14] = string11;
        charSequenceArr2[15] = string12;
        charSequenceArr2[16] = string13;
        charSequenceArr2[17] = str11;
        charSequenceArr2[18] = str3;
        charSequenceArr2[19] = str12;
        charSequenceArr2[20] = str13;
        charSequenceArr2[21] = str14;
        charSequenceArr2[22] = str15;
        charSequenceArr2[23] = string14;
        charSequenceArr2[24] = str16;
        charSequenceArr2[25] = str17;
        charSequenceArr2[26] = str18;
        charSequenceArr2[27] = str19;
        charSequenceArr2[c10] = str7;
        charSequenceArr2[29] = str21;
        charSequenceArr2[30] = str22;
        charSequenceArr2[31] = str4;
        charSequenceArr2[32] = str23;
        charSequenceArr2[33] = str24;
        charSequenceArr2[34] = charSequence2;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str25;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str26;
        charSequenceArr2[39] = str27;
        charSequenceArr2[40] = charSequence;
        charSequenceArr2[41] = str5;
        charSequenceArr2[42] = str6;
        charSequenceArr2[43] = charSequence4;
        charSequenceArr2[44] = charSequence3;
        alertDialog$Builder.f(charSequenceArr2, new n4(d81Var, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), charSequence);
        d81Var.showDialog(alertDialog$Builder.a);
    }

    public static void a0(d81 d81Var, ArrayList arrayList) {
        int i10;
        int i11 = 0;
        if (d81Var.d.w()) {
            arrayList.add(org.telegram.ui.Components.t61.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            u71 u71Var = d81Var.f;
            ArrayList arrayList2 = u71Var.d;
            ArrayList arrayList3 = u71Var.v;
            if (u71Var.w) {
                ArrayList arrayList4 = u71Var.r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    CharSequence charSequence = (CharSequence) u71Var.n.get(i12);
                    int i15 = org.telegram.ui.Cells.a7.a;
                    org.telegram.ui.Components.t61 K = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                    K.l = charSequence;
                    K.G = (t01) obj;
                    arrayList.add(K);
                    i12 = i14;
                }
                if (u71Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                ArrayList arrayList5 = u71Var.s;
                int size2 = arrayList5.size();
                while (i11 < size2) {
                    Object obj2 = arrayList5.get(i11);
                    i11++;
                    int i16 = i12 + 1;
                    CharSequence charSequence2 = (CharSequence) u71Var.n.get(i12);
                    int i17 = org.telegram.ui.Cells.a7.a;
                    org.telegram.ui.Components.t61 K2 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                    K2.l = charSequence2;
                    K2.G = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(K2);
                    i12 = i16;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList3.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList3.get(i18);
                    i18++;
                    if (obj3 instanceof t01) {
                        t01 t01Var = (t01) obj3;
                        String str = t01Var.a;
                        int i19 = org.telegram.ui.Cells.a7.a;
                        org.telegram.ui.Components.t61 K3 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                        K3.l = str;
                        K3.G = t01Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i20 = org.telegram.ui.Cells.a7.a;
                        org.telegram.ui.Components.t61 K4 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                        K4.l = str2;
                        K4.G = faqSearchResult;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.t61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            int size4 = arrayList2.size();
            while (i11 < size4) {
                Object obj4 = arrayList2.get(i11);
                i11++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i21 = org.telegram.ui.Cells.a7.a;
                org.telegram.ui.Components.t61 K5 = org.telegram.ui.Components.t61.K(org.telegram.ui.Cells.a7.class);
                K5.l = str3;
                K5.G = faqSearchResult2;
                arrayList.add(K5);
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.t61.n(d81Var.w, 188));
        d81Var.b0.clear();
        int i22 = 0;
        while (true) {
            i10 = 4;
            if (i22 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i22).isClientActivated() && d81Var.currentAccount != i22) {
                d81Var.b0.add(Integer.valueOf(i22));
            }
            i22++;
        }
        Collections.sort(d81Var.b0, new bv(10));
        Set<String> set = d81Var.getMessagesController().pendingSuggestions;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(b81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new q71(d81Var, i11)));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && d81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(b81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.vh.g(new StringBuilder("+"), d81Var.getUserConfig().getCurrentUser().phone, kf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new p71(d81Var, i23)), LocaleController.getString(R.string.CheckPhoneNumberNo), new q71(d81Var, i23), bi.h7.H2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new q71(d81Var, 2)));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(b81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new q71(d81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new q71(d81Var, i10)));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        if (d81Var.b0.size() > 0) {
            ic.a.p(R.string.SettingsAccounts, arrayList);
            for (int i24 = 0; i24 < d81Var.b0.size(); i24++) {
                int intValue = ((Integer) d81Var.b0.get(i24)).intValue();
                int i25 = x71.a;
                org.telegram.ui.Components.t61 K6 = org.telegram.ui.Components.t61.K(x71.class);
                K6.d = i24;
                K6.z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        boolean z10 = d81Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z10 && d81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w10 = org.telegram.ui.Wallet.l0.w(d81Var.currentAccount);
            int i26 = org.telegram.ui.ActionBar.y6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence string = LocaleController.getString(R.string.WalletAttachMoney);
            int i27 = org.telegram.ui.Cells.v8.V;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string = org.telegram.ui.Cells.v8.b(string);
            }
            arrayList.add(z71.a(25, 0, 0, i26, string, null, w10.u() > 0 ? org.telegram.ui.Wallet.l0.n(w10.u(), false) : null));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        arrayList.add(z71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(z71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(z71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(z71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(z71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(z71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(z71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(z71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(z71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.t61.C(null));
        if (!z10 && d81Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.l0 w11 = org.telegram.ui.Wallet.l0.w(d81Var.currentAccount);
            int i28 = org.telegram.ui.ActionBar.y6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence string2 = LocaleController.getString(R.string.WalletAttachMoney);
            int i29 = org.telegram.ui.Cells.v8.V;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string2 = org.telegram.ui.Cells.v8.b(string2);
            }
            arrayList.add(z71.a(25, 0, 0, i28, string2, null, w11.u() > 0 ? org.telegram.ui.Wallet.l0.n(w11.u(), false) : null));
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        if (!d81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(z71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (d81Var.getMessagesController().starsPurchaseAvailable()) {
            bi.ca y3 = bi.ca.y(d81Var.currentAccount, false);
            arrayList.add(z71.a(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!y3.e || y3.p().amount <= 0) ? "" : bi.dd.I0(y3.p(), 0.85f, ' ')));
        }
        bi.ca.y(d81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (bi.ca.y(d81Var.currentAccount, true).e && (bi.ca.y(d81Var.currentAccount, true).O(0) || bi.ca.y(d81Var.currentAccount, true).p().positive()))) {
            bi.ca y10 = bi.ca.y(d81Var.currentAccount, true);
            long j10 = y10.p().amount;
            int i30 = R.drawable.filled_gram_earnings;
            String string3 = LocaleController.getString(R.string.GramEarnings);
            if (y10.e && j10 > 0) {
                charSequence3 = bi.dd.I0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(z71.a(13, -14965523, -15431455, i30, string3, null, charSequence3));
        }
        if (!d81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(z71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!d81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(z71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.t61) ic.a.g(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        ic.a.p(R.string.SettingsHelp, arrayList);
        arrayList.add(z71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(z71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(z71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(z71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        wi.a aVar = wi.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.t61.C(null));
            arrayList.add(org.telegram.ui.Components.t61.u("Experimental"));
            arrayList.add(z71.a(24, -765355, -2148011, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
            arrayList.add(z71.a(26, -11154873, -14175180, 0, LocaleController.getString(R.string.AudioRecorderSettings), null, null));
            arrayList.add(z71.a(27, -12743701, -13996071, 0, LocaleController.getString(R.string.HeaderSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.t61.C(null));
            ic.a.p(R.string.SettingsDebug, arrayList);
            arrayList.add(z71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(z71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(z71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.t61.m(d81Var.M));
    }

    public static /* synthetic */ void c0(d81 d81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        d81Var.e0 = -1;
        if (tL_error == null) {
            TLRPC.User user = d81Var.getMessagesController().getUser(Long.valueOf(d81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = d81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    d81Var.getMessagesController().putUser(user, false);
                }
            } else {
                d81Var.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && d81Var.s != null) {
                FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(d81Var.s, true).renameTo(FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(d81Var.s.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(d81Var.s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(d81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && d81Var.v != null) {
                FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(d81Var.v, true).renameTo(FileLoader.getInstance(d81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            d81Var.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            d81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = d81Var.getMessagesController().getUserFull(d81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                d81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            d81Var.l0(user);
        }
        d81Var.s = null;
        d81Var.v = null;
        d81Var.m0(false, true);
        d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        d81Var.getUserConfig().saveConfig(true);
    }

    public static void d0(d81 d81Var, int i10) {
        Long l4;
        Long l10;
        long j10;
        int i11 = 1;
        if (i10 == 0) {
            d81Var.getUserConfig().syncContacts = true;
            d81Var.getUserConfig().saveConfig(false);
            d81Var.getContactsController().forceImportContacts();
            return;
        }
        if (i10 == 1) {
            d81Var.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            d81Var.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            d81Var.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            d81Var.c.g3.O(true);
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.t.s(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i10 == 6) {
            d81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(org.telegram.messenger.t.e(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
            org.telegram.ui.Components.gb1.T();
            SharedPrefsHelper.cleanupAccount(d81Var.currentAccount);
            MessagesController.getEmojiSettings(d81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            MessagesController.getGlobalNotificationsSettings().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            ChatThemeController.getInstance(d81Var.currentAccount).clearCache();
            d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            y21.X();
            rg.s0.e(d81Var.currentAccount).a();
            SharedPreferences mainSettings = d81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.t.e(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit.remove(str);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(d81Var.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(d81Var.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit2.remove(str2);
                }
            }
            edit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(d81Var.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) d81Var.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            d81Var.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i10 == 13) {
            Set<String> set = d81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            d81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i10 == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i10 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i10 == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(d81Var.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = d81Var.getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                a8.xe.a((LaunchActivity) d81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                d81Var.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                d81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new r71(d81Var, 0));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(d81Var.getParentActivity(), 0, d81Var.resourceProvider);
                    alertDialog$Builder.a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(measureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(measureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(measureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new ty0(measureDevicePerformanceClass, i11));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.p();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean q5 = fi.c1.q(d81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q5).apply();
                    Toast.makeText(d81Var.getParentActivity(), LocaleController.getString(!q5 ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    for (int i12 = 0; i12 < d81Var.getParentLayout().getFragmentStack().size(); i12++) {
                        ((org.telegram.ui.ActionBar.r2) d81Var.getParentLayout().getFragmentStack().get(i12)).clearSheets();
                    }
                    return;
                }
                if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i10 == 27) {
                    d81Var.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(d81Var.currentAccount);
                    return;
                }
                if (i10 == 29) {
                    hi.y.b();
                    hi.b1.c();
                    hi.q0.a();
                    hi.a5.c();
                    return;
                }
                if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i10 == 35) {
                    MessagesController.getInstance(d81Var.currentAccount).loadAppConfig(true);
                    return;
                }
                if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                }
                if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                }
                if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                    return;
                }
                if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.B();
                        return;
                    }
                    return;
                }
                if (i10 == 41) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z10;
                    edit3.putBoolean("debugViewMetrics", z10).apply();
                    return;
                }
                if (i10 != 42) {
                    if (i10 != 43) {
                        if (i10 == 44) {
                            SharedConfig.toggleWidgetStaticLayers();
                            return;
                        }
                        return;
                    } else {
                        for (int i13 = 0; i13 < 4; i13++) {
                            if (UserConfig.getInstance(i13).isClientActivated()) {
                                MessagesStorage.getInstance(i13).clearWidgetHeights();
                            }
                        }
                        org.telegram.ui.Components.wc.b0(d81Var).R(R.raw.done, 36, "Widget heights cleared").j();
                        return;
                    }
                }
                wi.a aVar = wi.e.a;
                synchronized (aVar) {
                    if (!aVar.b) {
                        SharedPreferences sharedPreferences = wi.d.a;
                        aVar.c = sharedPreferences.contains("experimental_settings_allowed");
                        aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                        aVar.b = true;
                    }
                    boolean z11 = !aVar.d;
                    aVar.d = z11;
                    aVar.c = true;
                    aVar.b = true;
                    wi.d.a.edit().putBoolean("experimental_settings_allowed", z11).apply();
                }
                d81Var.c.g3.O(true);
                return;
            }
            int i14 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            int i15 = 0;
            while (i15 < i14) {
                StringBuilder sb3 = new StringBuilder("/sys/devices/system/cpu/cpu");
                sb3.append(i15);
                long j19 = j11;
                sb3.append("/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong = AndroidUtilities.getSysInfoLong(sb3.toString());
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i15 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i15 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i15 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i15);
                sb2.append(" ");
                if (sysInfoLong != null) {
                    sb2.append("min=");
                    l10 = sysInfoLong2;
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    j10 = (sysInfoLong.longValue() / 1000) + j19;
                    j12++;
                } else {
                    l10 = sysInfoLong2;
                    j10 = j19;
                }
                long j20 = j10;
                if (l10 != null) {
                    sb2.append("cur=");
                    sb2.append(l10.longValue() / 1000);
                    sb2.append(" ");
                    j13 += l10.longValue() / 1000;
                    j14++;
                }
                if (sysInfoLong3 != null) {
                    sb2.append("max=");
                    sb2.append(sysInfoLong3.longValue() / 1000);
                    sb2.append(" ");
                    j15 = (sysInfoLong3.longValue() / 1000) + j15;
                    j16++;
                }
                if (sysInfoLong4 != null) {
                    sb2.append("cpc=");
                    sb2.append(sysInfoLong4);
                    sb2.append(" ");
                    j17 = sysInfoLong4.longValue() + j17;
                    j18++;
                }
                sb2.append("\n");
                i15++;
                j11 = j20;
            }
            long j21 = j11;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Build.MANUFACTURER);
            sb4.append(", ");
            sb4.append(Build.MODEL);
            sb4.append(" (");
            sb4.append(Build.PRODUCT);
            sb4.append(", ");
            sb4.append(Build.DEVICE);
            sb4.append(")  (android ");
            int i16 = Build.VERSION.SDK_INT;
            sb4.append(i16);
            sb4.append(")\n");
            if (i16 >= 31) {
                sb4.append("SoC: ");
                sb4.append(Build.SOC_MANUFACTURER);
                sb4.append(", ");
                sb4.append(Build.SOC_MODEL);
                sb4.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb4.append("GPU: ");
                sb4.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb4.append(", min=");
                    l4 = sysInfoLong6;
                    sb4.append(sysInfoLong5.longValue() / 1000);
                } else {
                    l4 = sysInfoLong6;
                }
                if (l4 != null) {
                    sb4.append(", mmin=");
                    sb4.append(l4.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb4.append(", max=");
                    sb4.append(sysInfoLong7.longValue() / 1000);
                }
                sb4.append("\n");
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb4.append("GLES Version: ");
            sb4.append(deviceConfigurationInfo.getGlEsVersion());
            sb4.append("\nMemory: class=");
            sb4.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb4.append(", total=");
            sb4.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb4.append(", avail=");
            sb4.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb4.append(", low?=");
            sb4.append(memoryInfo.lowMemory);
            sb4.append(" (threshold=");
            sb4.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb4.append(")\nCurrent class: ");
            sb4.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb4.append(", measured: ");
            sb4.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i16 >= 31) {
                sb4.append(", suggest=");
                sb4.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb4.append("\n");
            sb4.append(i14);
            sb4.append(" CPUs");
            if (j12 > 0) {
                sb4.append(", avgMinFreq=");
                sb4.append(j21 / j12);
            }
            if (j14 > 0) {
                sb4.append(", avgCurFreq=");
                sb4.append(j13 / j14);
            }
            if (j16 > 0) {
                sb4.append(", avgMaxFreq=");
                sb4.append(j15 / j16);
            }
            if (j18 > 0) {
                sb4.append(", avgCapacity=");
                sb4.append(j17 / j18);
            }
            sb4.append("\n");
            sb4.append((CharSequence) sb2);
            i0(MediaController.VIDEO_MIME_TYPE, sb4);
            i0("video/hevc", sb4);
            i0("video/x-vnd.on2.vp8", sb4);
            i0("video/x-vnd.on2.vp9", sb4);
            d81Var.showDialog(new w71(d81Var, d81Var.getParentActivity(), sb4.toString()));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void e0(d81 d81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            d81Var.s = fileLocation;
            d81Var.v = photoSize2.location;
            d81Var.G.h(ImageLocation.getForLocal(fileLocation), "90_90", d81Var.F, null);
            d81Var.m0(true, false);
        } else {
            if (d81Var.s == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            d81Var.e0 = d81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l71(1, d81Var, str));
        }
        d81Var.simpleActionBar.j().requestLayout();
    }

    public static void f0(d81 d81Var, org.telegram.ui.Components.t61 t61Var) {
        Object obj = t61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                ki1.a(d81Var.getParentActivity(), new org.telegram.ui.Components.oy(25, d81Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.H0(LaunchActivity.I1, d81Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (t61Var.H(x71.class)) {
            int i10 = t61Var.z;
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i10);
                return;
            }
            return;
        }
        if (t61Var.H(org.telegram.ui.Cells.a7.class)) {
            Object obj2 = t61Var.G;
            if (obj2 instanceof t01) {
                t01 t01Var = (t01) obj2;
                org.telegram.ui.ActionBar.j5 parentLayout = d81Var.getParentLayout();
                t01Var.b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, t01Var.c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(d81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, d81Var.f.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = t61Var.G;
            if (obj3 != null) {
                d81Var.f.E(obj3);
                return;
            }
            return;
        }
        switch (t61Var.d) {
            case 1:
                d81Var.j0(new UserInfoActivity());
                break;
            case 2:
                d81Var.j0(new ThemeActivity(0));
                break;
            case 3:
                d81Var.j0(new PrivacySettingsActivity());
                break;
            case 5:
                d81Var.j0(new NotificationsSettingsActivity());
                break;
            case 6:
                d81Var.j0(new DataSettingsActivity());
                break;
            case 7:
                d81Var.j0(new FiltersSetupActivity());
                break;
            case 8:
                d81Var.j0(new SessionsActivity(0));
                break;
            case 9:
                d81Var.j0(new tb0());
                break;
            case 10:
                d81Var.j0(new LanguageSelectActivity());
                break;
            case 11:
                d81Var.j0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                d81Var.j0(new bi.dd());
                break;
            case 13:
                d81Var.j0(new gi.h());
                break;
            case 15:
                d81Var.j0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                vg.n1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                d81Var.showDialog(org.telegram.ui.Components.g5.T(d81Var, d81Var.resourceProvider));
                break;
            case 18:
                qf.d.r(d81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                qf.d.r(d81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.P4(d81Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.P4(d81Var.getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(d81Var.currentAccount).isFrozen()) {
                    qf.d.r(d81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                    break;
                } else {
                    b.b(d81Var.currentAccount);
                    break;
                }
            case 24:
                d81Var.presentFragment(new g31(null));
                break;
            case 25:
                d81Var.j0(new org.telegram.ui.Wallet.m5());
                break;
            case 26:
                d81Var.presentFragment(new p4(null));
                break;
            case 27:
                g70 g70Var = new g70();
                g70Var.e = true;
                d81Var.presentFragment(g70Var);
                break;
        }
    }

    public static void i0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i11].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i10));
                        } else {
                            i11++;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb2.append("\n");
            sb2.append(arrayList.size());
            sb2.append("+");
            sb2.append(arrayList2.size());
            sb2.append(" ");
            sb2.append(str.substring(6));
            sb2.append(" codecs:\n");
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (i12 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i12)).intValue());
                sb2.append("{d} ");
                sb2.append(codecInfoAt2.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType.getMaxSupportedInstances());
                sb2.append(")");
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i13)).intValue());
                sb2.append("{e} ");
                sb2.append(codecInfoAt3.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                sb2.append(")");
            }
            sb2.append("\n");
        } catch (Exception unused) {
        }
    }

    @Override // oe.d
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            h0();
        }
    }

    @Override // org.telegram.ui.Components.f50
    public final void F(float f7) {
        org.telegram.ui.Cells.d4 d4Var = this.r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.f50
    public final void L(boolean z10, boolean z11) {
        org.telegram.ui.Cells.d4 d4Var = this.r;
        if (d4Var == null) {
            return;
        }
        d4Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.f50
    public final void R(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new ii.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i10 = 7;
        this.b = new a9(this, context, i10);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.f0 = true;
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, i10));
        this.simpleActionBar.setBackground(null);
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.z0 = new jg.e2(this, 19);
        this.d = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.y5 a10 = j10.a(1, R.drawable.ic_ab_other);
        this.e = a10;
        a10.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.e.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        u71 u71Var = new u71(this, this, context);
        this.f = u71Var;
        u71Var.G();
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(this, new e5(this, 26), new s71(this), new s71(this));
        this.c = r71Var;
        r71Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.r71 r71Var2 = this.c;
        r71Var2.g3.r = false;
        r71Var2.u1();
        this.c.setSectionsDrawBackground(true);
        oi.a.d(this.c, 0, 0, AndroidUtilities.dp(12.0f), this.d0);
        this.c.setClipToPadding(false);
        this.c.j(new i3(this, 29));
        this.b.addView(this.c, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        View view = new View(context);
        this.P = view;
        view.setBackground(getBaseSimpleGlass().a(this.P));
        this.b.addView(this.P, org.telegram.ui.Components.gb1.i(-1, 0, 48));
        this.b.addView(this.simpleActionBar, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
        this.h = g50Var;
        g50Var.H = true;
        g50Var.a = this;
        g50Var.b = this;
        this.w = new FrameLayout(context);
        k0 k0Var = new k0(this, context, 25);
        this.y = k0Var;
        this.w.addView(k0Var, org.telegram.ui.Components.gb1.h(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new q71(this, 5));
        org.telegram.ui.Components.gb1.b(this.y);
        this.w.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: org.telegram.ui.t71
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                d81.this.o0();
            }
        });
        this.E = new v71(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        frameLayout.setPivotX(0.0f);
        this.x.setPivotY(0.0f);
        this.E.addView(this.x, org.telegram.ui.Components.gb1.i(90, 90, 51));
        a9 a9Var = this.b;
        a9Var.addView(this.E, a9Var.indexOfChild(this.c) + 1, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.F = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.G = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.x.addView(this.G, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        org.telegram.ui.Cells.d4 d4Var = new org.telegram.ui.Cells.d4(this, context);
        this.r = d4Var;
        d4Var.setSize(AndroidUtilities.dp(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.x.addView(this.r, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.H = frameLayout2;
        int dp = AndroidUtilities.dp(32.0f);
        int i11 = org.telegram.ui.ActionBar.y6.a7;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, getThemedColor(i11));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
        frameLayout2.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout2, K, N, null, resourceProvider);
        this.H.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.I = frameLayout3;
        int dp2 = AndroidUtilities.dp(30.0f);
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K2 = org.telegram.ui.ActionBar.y6.K(dp2, getThemedColor(i12));
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.u6 resourceProvider2 = getResourceProvider();
        frameLayout3.setBackground(K2);
        org.telegram.ui.ActionBar.f7.k(frameLayout3, K2, N2, null, resourceProvider2);
        ImageView imageView = new ImageView(context);
        this.J = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.J.setImageResource(R.drawable.filled_premium_camera);
        this.I.addView(this.J, org.telegram.ui.Components.gb1.i(22, 22, 17));
        this.H.addView(this.I, org.telegram.ui.Components.gb1.g(30.0f, 30));
        this.H.setPivotX(0.0f);
        this.H.setPivotY(0.0f);
        a9 a9Var2 = this.b;
        a9Var2.addView(this.H, a9Var2.indexOfChild(this.E) + 1, org.telegram.ui.Components.gb1.i(34, 34, 51));
        TextView textView = new TextView(context);
        this.K = textView;
        textView.setTextSize(1, 22.0f);
        this.K.setTypeface(AndroidUtilities.bold());
        this.K.setGravity(17);
        this.K.setSingleLine();
        TextView textView2 = this.K;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView k10 = d3.k(this.w, this.K, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.L = k10;
        k10.setTextSize(1, 13.0f);
        this.L.setGravity(17);
        this.L.setSingleLine();
        this.L.setEllipsize(truncateAt);
        TextView k11 = d3.k(this.w, this.L, org.telegram.ui.Components.gb1.h(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.M = k11;
        k11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(this.M, org.telegram.ui.ActionBar.y6.B6, getResourceProvider());
        this.M.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.M.setGravity(17);
        TextView textView3 = this.M;
        int i13 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i13), 2, -1), null, org.telegram.ui.ActionBar.f7.N(i13), getResourceProvider());
        this.M.setOnClickListener(new q71(this, 6));
        this.O = new View(context);
        n0(true, false);
        this.c.g3.O(false);
        l0(getUserConfig().getCurrentUser());
        p0();
        h0();
        this.simpleActionBar.setBackground(null);
        int i14 = this.mSystemInsets.b;
        if (this.P != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i14;
            ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.P.setLayoutParams(layoutParams);
            }
        }
        n0(true, false);
        a9 a9Var3 = this.b;
        s71 s71Var = new s71(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(a9Var3, s71Var);
        a9 a9Var4 = this.b;
        this.fragmentView = a9Var4;
        return a9Var4;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.r71 r71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            l0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.r71 r71Var2 = this.c;
            if (r71Var2 != null) {
                r71Var2.g3.O(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            l0(getUserConfig().getCurrentUser());
        } else {
            if (i10 != NotificationCenter.newSuggestionsAvailable || (r71Var = this.c) == null) {
                return;
            }
            r71Var.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ qu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.c;
    }

    public final void h0() {
        org.telegram.ui.ActionBar.r5 r5Var;
        boolean z10;
        if (this.N && (z10 = (r5Var = this.simpleActionBar).F) != this.f0) {
            this.f0 = z10;
            r5Var.setBackButtonImageAnimated(z10 ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
            this.simpleActionBar.setBackButtonContentDescription(LocaleController.getString(z10 ? R.string.AccDescrGoBack : R.string.QrCode));
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0(org.telegram.ui.ActionBar.r2 r2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.I1) == null || (actionBarLayout = launchActivity.s0) == null) {
            presentFragment(r2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.c0((org.telegram.ui.ActionBar.r2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.g5 g5Var = new org.telegram.ui.ActionBar.g5(r2Var);
        g5Var.c = true;
        g5Var.g = true;
        actionBarLayout.T(g5Var);
    }

    public final void k0(float f7) {
        this.simpleActionBar.setTitlesAlpha(f7);
        View view = this.P;
        if (view != null) {
            view.setAlpha(f7);
        }
    }

    public final void l0(TLRPC.User user) {
        String str;
        String str2;
        if (this.G != null && this.e0 == -1) {
            this.F.r(user);
            this.G.f(user, this.F);
            this.K.setText(UserObject.getUserName(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(kf.b.c().b("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb2.append(" • @");
                sb2.append(publicUsername);
            }
            this.L.setText(sb2);
            TextView textView = this.M;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int i10 = packageInfo.versionCode;
                int i11 = i10 / 10;
                int i12 = i10 % 10;
                if (i12 == 1 || i12 == 2) {
                    str2 = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str2 = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                int i13 = R.string.TelegramVersion;
                Locale locale = Locale.US;
                str = LocaleController.formatString(i13, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str2);
            } catch (Exception e) {
                FileLog.e(e);
                str = null;
            }
            textView.setText(str);
        }
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (!z11) {
            if (z10) {
                this.r.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            } else {
                this.r.setAlpha(0.0f);
                this.r.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        if (z10) {
            this.r.setVisibility(0);
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.d4, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.d4, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new q40(10, this, z10));
        this.n.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0038, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.simpleActionBar.getHeight()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        if (!this.d.w()) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z12 = false;
            if (this.T == z12 || z10) {
                this.T = z12;
                valueAnimator = this.U;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.U = null;
                }
                if (z11) {
                    k0(z12 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.simpleActionBar.getTitlesAlpha(), z12 ? 1.0f : 0.0f);
                this.U = ofFloat;
                ofFloat.addUpdateListener(new v11(this, 8));
                this.U.setInterpolator(org.telegram.ui.Components.ds.h);
                this.U.setDuration(420L);
                this.U.start();
                return;
            }
            return;
        }
        z12 = true;
        if (this.T == z12) {
        }
        this.T = z12;
        valueAnimator = this.U;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
    }

    public final void o0() {
        if (this.E == null || this.x == null) {
            return;
        }
        float height = this.y.getHeight() / 2.0f;
        View view = this.y;
        float f7 = 1.0f;
        while (view != null && view != this.fragmentView && (view.getParent() instanceof View)) {
            height += view.getY();
            f7 *= view.getAlpha();
            view = (View) view.getParent();
        }
        if (view != this.fragmentView || !this.y.isAttachedToWindow() || this.y.getHeight() == 0) {
            if (this.X != 0.0f) {
                this.X = 0.0f;
                this.E.setHideProgress(1.0f);
                this.H.setAlpha(0.0f);
                return;
            }
            return;
        }
        float f10 = 0.0f;
        for (View view2 = this.w; view2 != null && view2 != this.c && (view2.getParent() instanceof View); view2 = (View) view2.getParent()) {
            f10 += view2.getY();
        }
        float paddingTop = (height - f10) + this.c.getPaddingTop();
        v71 v71Var = this.E;
        float f11 = -AndroidUtilities.dp(16.0f);
        NotchInfoUtils.NotchInfo notchInfo = v71Var.n;
        if (notchInfo != null && notchInfo.isLikelyCircle) {
            f11 = notchInfo.bounds.centerY();
        }
        float a2 = a8.ee.a((height - f11) / Math.max(1.0f, paddingTop - f11), 0.0f, 1.0f);
        float max = Math.max(height, f11);
        this.Y = height;
        this.Z = paddingTop;
        this.a0 = f11;
        float dp = AndroidUtilities.dp(90.0f);
        float scaleX = this.y.getScaleX() * (AndroidUtilities.lerp(AndroidUtilities.dp(this.E.getHiddenAvatarSizeDp()), dp, a2) / dp);
        float f12 = (dp * scaleX) / 2.0f;
        float width = (this.E.getWidth() / 2.0f) - f12;
        if (max == this.V && scaleX == this.W && a2 == this.X && f7 == this.E.getAlpha() && width == this.x.getTranslationX()) {
            return;
        }
        this.V = max;
        this.W = scaleX;
        this.X = a2;
        this.E.setAlpha(f7);
        this.x.setScaleX(scaleX);
        this.x.setScaleY(scaleX);
        this.x.setTranslationX(width);
        float f13 = max - f12;
        this.x.setTranslationY(f13);
        this.H.setAlpha(a8.ee.a(AndroidUtilities.ilerp(a2, 0.75f, 1.0f), 0.0f, 1.0f) * f7);
        this.H.setScaleX(scaleX);
        this.H.setScaleY(scaleX);
        this.H.setTranslationX((AndroidUtilities.dp(60.0f) * scaleX) + width);
        this.H.setTranslationY((AndroidUtilities.dp(60.0f) * scaleX) + f13);
        this.E.setHideProgress(1.0f - a2);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (!r5Var.F) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        r5Var.f(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
        this.R = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.updateInterfaces).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.N = bundle.getBoolean("hasMainTabs", false);
        }
        this.d0 = this.N ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.R;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.R = null;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.j71 j71Var = this.c.g3;
        if (j71Var != null) {
            j71Var.l();
        }
    }

    public final void p0() {
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.G6));
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.y6));
        this.d.V();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.d6);
        if (this.O.getBackground() == null || themedColor != this.S) {
            this.S = themedColor;
            this.O.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor}));
        }
        this.c.invalidate();
    }

    @Override // org.telegram.ui.og0
    public final void s() {
        this.c.y0(0);
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.og0
    public final hh.d y() {
        return null;
    }

    public d81(Bundle bundle) {
        super(bundle);
        this.a = new oe.b(0, this, org.telegram.ui.Components.ds.h, 350L, false);
        this.Q = 0;
        this.X = -1.0f;
        this.b0 = new ArrayList();
        this.e0 = -1;
        this.f0 = true;
    }

    @Override // org.telegram.ui.og0
    public final /* synthetic */ void D() {
    }

    @Override // org.telegram.ui.Components.f50
    public final /* synthetic */ void Q() {
    }

    @Override // oe.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
