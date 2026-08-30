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
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
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
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o81 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.v40, ug0, xd.b {
    public org.telegram.ui.Components.z8 B;
    public org.telegram.ui.Components.p9 C;
    public FrameLayout D;
    public FrameLayout E;
    public ImageView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public boolean J;
    public View K;
    public int L;
    public boolean M;
    public ValueAnimator N;
    public final ArrayList O;
    public int P;
    public int Q;
    public int R;
    public final ng.e S;
    public final sg.d T;
    public final sg.d U;
    public ng.k V;
    public final ArrayList W;
    public final RectF X;
    public final RectF Y;
    public final xd.a a;
    public kh.j4 b;
    public org.telegram.ui.Components.g61 c;
    public eg.i0 d;
    public org.telegram.ui.ActionBar.w0 e;
    public org.telegram.ui.ActionBar.w0 f;
    public g81 h;
    public org.telegram.ui.Components.w40 n;
    public AnimatorSet r;
    public org.telegram.ui.Cells.y3 s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public o81() {
        this(null);
    }

    public static boolean U(o81 o81Var, org.telegram.ui.Components.i51 i51Var, View view) {
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            rh.q2.j(o81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new c81(o81Var, 0));
            return true;
        }
        if (i51Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = i51Var.G;
            String str = obj2 instanceof q01 ? ((q01) obj2).h : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.o70 H = org.telegram.ui.Components.o70.H(o81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new l01(12, o81Var, str), false);
                H.W(o81Var.c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void V(o81 o81Var) {
        TLRPC.User user = MessagesController.getInstance(o81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(o81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(o81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.w40 w40Var = o81Var.n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        w40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new c81(o81Var, 4), new dg.e0(6), 0);
    }

    public static /* synthetic */ void W(o81 o81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.D1, o81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(o81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Y(o81 o81Var) {
        String str;
        int i10;
        String string;
        String str2;
        int i11;
        char c3;
        String string2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i12 = o81Var.L + 1;
        o81Var.L = i12;
        if (i12 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(o81Var.getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o81Var.getParentActivity(), 0, o81Var.resourceProvider);
        String string3 = LocaleController.getString(R.string.DebugMenu);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = string3;
        String string4 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string5 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string6 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string7 = LocaleController.getString(R.string.DebugMenuResetDialogs);
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
        String string8 = LocaleController.getString(str2, i11);
        String string9 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string10 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c3 = 1;
            string2 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            string2 = null;
            c3 = 1;
        }
        String string11 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        String str7 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
        boolean z4 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str8 = z4 ? "Clean app update" : null;
        String str9 = z4 ? "Reset suggestions" : null;
        String string12 = z4 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string13 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string14 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        String str10 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            str3 = null;
        }
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str11 = z10 ? "Force remove premium suggestions" : null;
        String str12 = z10 ? "Share device info" : null;
        String str13 = z10 ? "Force performance class" : null;
        String str14 = (!z10 || org.telegram.ui.Components.x50.c()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        String string15 = LocaleController.getString(ph.v0.q(o81Var.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str15 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
        String str16 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
        String str17 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str18 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str19 = !SharedConfig.isUsingCamera2(o81Var.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str20 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str21 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            str4 = string2;
            if (Build.VERSION.SDK_INT >= 31) {
                str5 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str22 = !SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str23 = !SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                String str24 = str5;
                if (Build.VERSION.SDK_INT < 28) {
                    str6 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    str6 = null;
                }
                String str25 = SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                String str26 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader" : null;
                String str27 = !SharedConfig.frameMetricsEnabled ? "hide frame metrics" : "show frame metrics";
                String str28 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.shadowsInSections ? "disable shadows in settings" : "enable shadows in settings" : null;
                String str29 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.debugViewMetrics ? "disable debug view metrics" : "enable debug view metrics" : null;
                CharSequence[] charSequenceArr = new CharSequence[42];
                charSequenceArr[0] = string4;
                charSequenceArr[c3] = string5;
                charSequenceArr[2] = string6;
                charSequenceArr[3] = string7;
                charSequenceArr[4] = string;
                charSequenceArr[5] = string8;
                charSequenceArr[6] = string9;
                charSequenceArr[7] = string10;
                charSequenceArr[8] = null;
                charSequenceArr[9] = str4;
                charSequenceArr[10] = string11;
                charSequenceArr[11] = str7;
                charSequenceArr[12] = str8;
                charSequenceArr[13] = str9;
                charSequenceArr[14] = string12;
                charSequenceArr[15] = string13;
                charSequenceArr[16] = string14;
                charSequenceArr[17] = str10;
                charSequenceArr[18] = str3;
                charSequenceArr[19] = str11;
                charSequenceArr[20] = str12;
                charSequenceArr[21] = str13;
                charSequenceArr[22] = str14;
                charSequenceArr[23] = string15;
                charSequenceArr[24] = str15;
                charSequenceArr[25] = str16;
                charSequenceArr[26] = str17;
                charSequenceArr[27] = str18;
                charSequenceArr[28] = str19;
                charSequenceArr[29] = str20;
                charSequenceArr[30] = str21;
                charSequenceArr[31] = str24;
                charSequenceArr[32] = str22;
                charSequenceArr[33] = str23;
                charSequenceArr[34] = str6;
                charSequenceArr[35] = "Reload app config";
                charSequenceArr[36] = str25;
                charSequenceArr[37] = "Make Memory Dump";
                charSequenceArr[38] = str26;
                charSequenceArr[39] = str27;
                charSequenceArr[40] = str28;
                charSequenceArr[41] = str29;
                alertDialog$Builder.f(charSequenceArr, new qv(o81Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                o81Var.showDialog(d2Var);
            }
        } else {
            str4 = string2;
        }
        str5 = null;
        if (!SharedConfig.adaptableColorInBrowser) {
        }
        if (!SharedConfig.debugVideoQualities) {
        }
        String str242 = str5;
        if (Build.VERSION.SDK_INT < 28) {
        }
        if (SharedConfig.forceForumTabs) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        if (!SharedConfig.frameMetricsEnabled) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        CharSequence[] charSequenceArr2 = new CharSequence[42];
        charSequenceArr2[0] = string4;
        charSequenceArr2[c3] = string5;
        charSequenceArr2[2] = string6;
        charSequenceArr2[3] = string7;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string8;
        charSequenceArr2[6] = string9;
        charSequenceArr2[7] = string10;
        charSequenceArr2[8] = null;
        charSequenceArr2[9] = str4;
        charSequenceArr2[10] = string11;
        charSequenceArr2[11] = str7;
        charSequenceArr2[12] = str8;
        charSequenceArr2[13] = str9;
        charSequenceArr2[14] = string12;
        charSequenceArr2[15] = string13;
        charSequenceArr2[16] = string14;
        charSequenceArr2[17] = str10;
        charSequenceArr2[18] = str3;
        charSequenceArr2[19] = str11;
        charSequenceArr2[20] = str12;
        charSequenceArr2[21] = str13;
        charSequenceArr2[22] = str14;
        charSequenceArr2[23] = string15;
        charSequenceArr2[24] = str15;
        charSequenceArr2[25] = str16;
        charSequenceArr2[26] = str17;
        charSequenceArr2[27] = str18;
        charSequenceArr2[28] = str19;
        charSequenceArr2[29] = str20;
        charSequenceArr2[30] = str21;
        charSequenceArr2[31] = str242;
        charSequenceArr2[32] = str22;
        charSequenceArr2[33] = str23;
        charSequenceArr2[34] = str6;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str25;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str26;
        charSequenceArr2[39] = str27;
        charSequenceArr2[40] = str28;
        charSequenceArr2[41] = str29;
        alertDialog$Builder.f(charSequenceArr2, new qv(o81Var, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        o81Var.showDialog(d2Var);
    }

    public static /* synthetic */ void Z(o81 o81Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        o81Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        o81Var.d.setAlpha(floatValue);
    }

    public static void a0(o81 o81Var, ArrayList arrayList) {
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        ArrayList arrayList3 = o81Var.O;
        org.telegram.ui.ActionBar.r0 r0Var = o81Var.e.C;
        int i11 = 0;
        if (r0Var != null && r0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.i51.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            g81 g81Var = o81Var.h;
            ArrayList arrayList4 = g81Var.d;
            ArrayList arrayList5 = g81Var.v;
            if (g81Var.w) {
                ArrayList arrayList6 = g81Var.r;
                int size = arrayList6.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList6.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    CharSequence charSequence = (CharSequence) g81Var.n.get(i12);
                    int i15 = org.telegram.ui.Cells.u6.a;
                    org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.u6.class);
                    J.l = charSequence;
                    J.G = (q01) obj;
                    arrayList.add(J);
                    i12 = i14;
                }
                if (g81Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                ArrayList arrayList7 = g81Var.s;
                int size2 = arrayList7.size();
                while (i11 < size2) {
                    Object obj2 = arrayList7.get(i11);
                    i11++;
                    int i16 = i12 + 1;
                    CharSequence charSequence2 = (CharSequence) g81Var.n.get(i12);
                    int i17 = org.telegram.ui.Cells.u6.a;
                    org.telegram.ui.Components.i51 J2 = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.u6.class);
                    J2.l = charSequence2;
                    J2.G = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(J2);
                    i12 = i16;
                }
                return;
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList5.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList5.get(i18);
                    i18++;
                    if (obj3 instanceof q01) {
                        q01 q01Var = (q01) obj3;
                        String str = q01Var.a;
                        int i19 = org.telegram.ui.Cells.u6.a;
                        org.telegram.ui.Components.i51 J3 = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.u6.class);
                        J3.l = str;
                        J3.G = q01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i20 = org.telegram.ui.Cells.u6.a;
                        org.telegram.ui.Components.i51 J4 = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.u6.class);
                        J4.l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.i51.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i21 = org.telegram.ui.Cells.u6.a;
                org.telegram.ui.Components.i51 J5 = org.telegram.ui.Components.i51.J(org.telegram.ui.Cells.u6.class);
                J5.l = str3;
                J5.G = faqSearchResult2;
                arrayList.add(J5);
            }
            return;
        }
        FrameLayout frameLayout = o81Var.x;
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(-4);
        i51Var.c = frameLayout;
        i51Var.z = 188;
        arrayList.add(i51Var);
        arrayList3.clear();
        int i22 = 0;
        while (true) {
            i10 = 4;
            if (i22 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i22).isClientActivated() && o81Var.currentAccount != i22) {
                arrayList3.add(Integer.valueOf(i22));
            }
            i22++;
        }
        Collections.sort(arrayList3, new cu(10));
        Set<String> set = o81Var.getMessagesController().pendingSuggestions;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(m81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new d81(o81Var, i11)));
            arrayList.add(org.telegram.ui.Components.i51.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && o81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(m81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.y3.j(new StringBuilder("+"), o81Var.getUserConfig().getCurrentUser().phone, se.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new c81(o81Var, i23)), LocaleController.getString(R.string.CheckPhoneNumberNo), new d81(o81Var, i23), lh.g5.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new d81(o81Var, 2)));
            arrayList.add(org.telegram.ui.Components.i51.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(m81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new d81(o81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new d81(o81Var, i10)));
            arrayList.add(org.telegram.ui.Components.i51.B(null));
        }
        if (arrayList3.size() > 0) {
            yh.r(R.string.SettingsAccounts, arrayList);
            for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                int intValue = ((Integer) arrayList3.get(i24)).intValue();
                int i25 = i81.a;
                org.telegram.ui.Components.i51 J6 = org.telegram.ui.Components.i51.J(i81.class);
                J6.d = i24;
                J6.z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.i51.B(null));
        }
        arrayList.add(k81.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(k81.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(k81.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(k81.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(k81.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(k81.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(k81.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(k81.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(k81.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.i51.B(null));
        if (!o81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(k81.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (o81Var.getMessagesController().starsPurchaseAvailable()) {
            lh.t7 y10 = lh.t7.y(o81Var.currentAccount, false);
            arrayList.add(k81.a(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!y10.e || y10.p().amount <= 0) ? "" : lh.ja.J0(y10.p(), 0.85f, ' ')));
        }
        lh.t7.y(o81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (lh.t7.y(o81Var.currentAccount, true).e && (lh.t7.y(o81Var.currentAccount, true).O(0) || lh.t7.y(o81Var.currentAccount, true).p().positive()))) {
            lh.t7 y11 = lh.t7.y(o81Var.currentAccount, true);
            long j10 = y11.p().amount;
            int i26 = R.drawable.settings_gram_24;
            String string = LocaleController.getString(R.string.MyTON);
            if (y11.e && j10 > 0) {
                charSequence3 = lh.ja.J0(y11.p(), 0.85f, ' ');
            }
            arrayList.add(k81.a(13, -14965523, -15431455, i26, string, null, charSequence3));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            while (i11 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i27 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.i51 J7 = org.telegram.ui.Components.i51.J(k81.class);
                    long j11 = tL_attachMenuBot2.bot_id;
                    J7.d = (int) (j11 ^ (j11 >>> 32));
                    J7.k = i27;
                    J7.l = tL_attachMenuBot2.short_name;
                    J7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    J7.G = tL_attachMenuBot2;
                    arrayList.add(J7);
                }
            }
        }
        if (!o81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(k81.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!o81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(k81.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.i51) kh.a2.i(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.i51.B(null));
        }
        yh.r(R.string.SettingsHelp, arrayList);
        arrayList.add(k81.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(k81.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(k81.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(k81.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.i51.B(null));
            yh.r(R.string.SettingsDebug, arrayList);
            arrayList.add(k81.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(k81.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(k81.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.i51.l(o81Var.I));
    }

    public static /* synthetic */ void b0(o81 o81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        o81Var.R = -1;
        if (tL_error == null) {
            TLRPC.User user = o81Var.getMessagesController().getUser(Long.valueOf(o81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = o81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    o81Var.getMessagesController().putUser(user, false);
                }
            } else {
                o81Var.getUserConfig().setCurrentUser(user);
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
            if (closestPhotoSizeWithSize != null && o81Var.v != null) {
                FileLoader.getInstance(o81Var.currentAccount).getPathToAttach(o81Var.v, true).renameTo(FileLoader.getInstance(o81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(o81Var.v.volume_id);
                sb.append("_");
                String m9 = android.support.v4.media.a.m(o81Var.v.local_id, "@90_90", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@90_90", sb2), ImageLocation.getForUserOrChat(o81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(o81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && o81Var.w != null) {
                FileLoader.getInstance(o81Var.currentAccount).getPathToAttach(o81Var.w, true).renameTo(FileLoader.getInstance(o81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            o81Var.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            o81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = o81Var.getMessagesController().getUserFull(o81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                o81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            o81Var.m0(user);
        }
        o81Var.v = null;
        o81Var.w = null;
        o81Var.n0(false, true);
        o81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        o81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        o81Var.getUserConfig().saveConfig(true);
    }

    public static void c0(o81 o81Var, int i10) {
        long j10;
        Long l10;
        int i11 = 1;
        int i12 = 0;
        if (i10 == 0) {
            o81Var.getUserConfig().syncContacts = true;
            o81Var.getUserConfig().saveConfig(false);
            o81Var.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i10 == 1) {
            o81Var.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            o81Var.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            o81Var.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            o81Var.c.V2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                kh.a2.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
            o81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            k7.a6.a();
            SharedPrefsHelper.cleanupAccount(o81Var.currentAccount);
            MessagesController.getEmojiSettings(o81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(o81Var.currentAccount).clearCache();
            o81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            n31.W();
            cg.f1.e(o81Var.currentAccount).a();
            SharedPreferences mainSettings = o81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.y3.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit.remove(str);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(o81Var.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(o81Var.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit2.remove(str2);
                }
            }
            edit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.f2.j(o81Var.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) o81Var.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            o81Var.getMessagesStorage().readAllDialogs(-1);
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
            Set<String> set = o81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            o81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                Toast.makeText(o81Var.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = o81Var.getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                k7.x8.a((LaunchActivity) o81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                o81Var.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                o81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new e81(o81Var, i12));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o81Var.getParentActivity(), 0, o81Var.resourceProvider);
                    alertDialog$Builder.a.O = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(measureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(measureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(measureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new qy0(measureDevicePerformanceClass, i11));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean q10 = ph.v0.q(o81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q10).apply();
                    Toast.makeText(o81Var.getParentActivity(), LocaleController.getString(!q10 ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i12 < o81Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.p2) o81Var.getParentLayout().getFragmentStack().get(i12)).clearSheets();
                        i12++;
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
                    o81Var.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(o81Var.currentAccount);
                    return;
                }
                if (i10 == 29) {
                    rh.q.b();
                    rh.r0.c();
                    rh.i0.a();
                    rh.x3.c();
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
                    MessagesController.getInstance(o81Var.currentAccount).loadAppConfig(true);
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
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity != null) {
                        launchActivity.B();
                        return;
                    }
                    return;
                }
                if (i10 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z4 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z4;
                    edit3.putBoolean("shadowsInSections", z4).apply();
                    return;
                }
                if (i10 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z10;
                    edit4.putBoolean("debugViewMetrics", z10).apply();
                    return;
                }
                return;
            }
            int i13 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb = new StringBuilder();
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            while (i12 < i13) {
                long j20 = j11;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpu_capacity");
                sb.append("#");
                sb.append(i12);
                sb.append(" ");
                int i14 = i12;
                if (sysInfoLong != null) {
                    sb.append("min=");
                    l10 = sysInfoLong3;
                    sb.append(sysInfoLong.longValue() / 1000);
                    sb.append(" ");
                    j12 += sysInfoLong.longValue() / 1000;
                    j13++;
                } else {
                    l10 = sysInfoLong3;
                }
                if (sysInfoLong2 != null) {
                    sb.append("cur=");
                    sb.append(sysInfoLong2.longValue() / 1000);
                    sb.append(" ");
                    j14 += sysInfoLong2.longValue() / 1000;
                    j15++;
                }
                if (l10 != null) {
                    sb.append("max=");
                    sb.append(l10.longValue() / 1000);
                    sb.append(" ");
                    j16 = (l10.longValue() / 1000) + j16;
                    j17++;
                }
                if (sysInfoLong4 != null) {
                    sb.append("cpc=");
                    sb.append(sysInfoLong4);
                    sb.append(" ");
                    j18 = sysInfoLong4.longValue() + j18;
                    j19++;
                }
                sb.append("\n");
                i12 = i14 + 1;
                j11 = j20;
            }
            long j21 = j11;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Build.MANUFACTURER);
            sb2.append(", ");
            sb2.append(Build.MODEL);
            sb2.append(" (");
            sb2.append(Build.PRODUCT);
            sb2.append(", ");
            sb2.append(Build.DEVICE);
            sb2.append(")  (android ");
            int i15 = Build.VERSION.SDK_INT;
            sb2.append(i15);
            sb2.append(")\n");
            if (i15 >= 31) {
                sb2.append("SoC: ");
                sb2.append(Build.SOC_MANUFACTURER);
                sb2.append(", ");
                sb2.append(Build.SOC_MODEL);
                sb2.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb2.append("GPU: ");
                sb2.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb2.append(", min=");
                    j10 = j12;
                    sb2.append(sysInfoLong5.longValue() / 1000);
                } else {
                    j10 = j12;
                }
                if (sysInfoLong6 != null) {
                    sb2.append(", mmin=");
                    sb2.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb2.append(", max=");
                    sb2.append(sysInfoLong7.longValue() / 1000);
                }
                sb2.append("\n");
            } else {
                j10 = j12;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb2.append("GLES Version: ");
            sb2.append(deviceConfigurationInfo.getGlEsVersion());
            sb2.append("\nMemory: class=");
            sb2.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb2.append(", total=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb2.append(", avail=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb2.append(", low?=");
            sb2.append(memoryInfo.lowMemory);
            sb2.append(" (threshold=");
            sb2.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb2.append(")\nCurrent class: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb2.append(", measured: ");
            sb2.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i15 >= 31) {
                sb2.append(", suggest=");
                sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb2.append("\n");
            sb2.append(i13);
            sb2.append(" CPUs");
            if (j13 > j21) {
                sb2.append(", avgMinFreq=");
                sb2.append(j10 / j13);
            }
            if (j15 > j21) {
                sb2.append(", avgCurFreq=");
                sb2.append(j14 / j15);
            }
            if (j17 > j21) {
                sb2.append(", avgMaxFreq=");
                sb2.append(j16 / j17);
            }
            if (j19 > j21) {
                sb2.append(", avgCapacity=");
                sb2.append(j18 / j19);
            }
            sb2.append("\n");
            sb2.append((CharSequence) sb);
            k0(MediaController.VIDEO_MIME_TYPE, sb2);
            k0("video/hevc", sb2);
            k0("video/x-vnd.on2.vp8", sb2);
            k0("video/x-vnd.on2.vp9", sb2);
            o81Var.showDialog(new h81(o81Var, o81Var.getParentActivity(), sb2.toString()));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void d0(o81 o81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            o81Var.v = fileLocation;
            o81Var.w = photoSize2.location;
            o81Var.C.h(ImageLocation.getForLocal(fileLocation), "90_90", o81Var.B, null);
            o81Var.n0(true, false);
        } else {
            if (o81Var.v == null) {
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
            o81Var.R = o81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new sb0(22, o81Var, str));
        }
        o81Var.actionBar.n().requestLayout();
    }

    public static void e0(o81 o81Var, org.telegram.ui.Components.i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                si1.a(o81Var.getParentActivity(), new nh.z1(8, o81Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.C0(LaunchActivity.D1, o81Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (i51Var.G(i81.class)) {
            int i10 = i51Var.z;
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
                return;
            }
            return;
        }
        if (i51Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = i51Var.G;
            if (obj2 instanceof q01) {
                q01 q01Var = (q01) obj2;
                org.telegram.ui.ActionBar.e5 parentLayout = o81Var.getParentLayout();
                q01Var.b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, q01Var.c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(o81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, o81Var.h.B, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = i51Var.G;
            if (obj3 != null) {
                o81Var.h.E(obj3);
                return;
            }
            return;
        }
        switch (i51Var.d) {
            case 1:
                o81Var.l0(new UserInfoActivity());
                break;
            case 2:
                o81Var.l0(new ThemeActivity(0));
                break;
            case 3:
                o81Var.l0(new PrivacySettingsActivity());
                break;
            case 5:
                o81Var.l0(new NotificationsSettingsActivity());
                break;
            case 6:
                o81Var.l0(new DataSettingsActivity());
                break;
            case 7:
                o81Var.l0(new FiltersSetupActivity());
                break;
            case 8:
                o81Var.l0(new SessionsActivity(0));
                break;
            case 9:
                o81Var.l0(new ec0());
                break;
            case 10:
                o81Var.l0(new LanguageSelectActivity());
                break;
            case 11:
                o81Var.l0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                o81Var.l0(new lh.ja());
                break;
            case 13:
                o81Var.l0(new qh.g());
                break;
            case 15:
                o81Var.l0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                gg.v2.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                o81Var.showDialog(org.telegram.ui.Components.z4.U(o81Var, o81Var.resourceProvider));
                break;
            case 18:
                af.g.s(o81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                af.g.s(o81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.H4(o81Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.H4(o81Var.getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(o81Var.currentAccount).isFrozen()) {
                    af.g.s(o81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                    break;
                } else {
                    c.b(o81Var.currentAccount);
                    break;
                }
        }
    }

    public static /* synthetic */ void f0(o81 o81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(o81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(o81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new sb0(23, o81Var, tL_attachMenuBot), 66);
    }

    public static void k0(String str, StringBuilder sb) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
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
            sb.append("\n");
            sb.append(arrayList.size());
            sb.append("+");
            sb.append(arrayList2.size());
            sb.append(" ");
            sb.append(str.substring(6));
            sb.append(" codecs:\n");
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (i12 > 0) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i12)).intValue());
                sb.append("{d} ");
                sb.append(codecInfoAt2.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType.getMaxSupportedInstances());
                sb.append(")");
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 > 0 || !arrayList.isEmpty()) {
                    sb.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i13)).intValue());
                sb.append("{e} ");
                sb.append(codecInfoAt3.getName());
                sb.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb.append("; mi=");
                sb.append(capabilitiesForType2.getMaxSupportedInstances());
                sb.append(")");
            }
            sb.append("\n");
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final void D(float f10) {
        org.telegram.ui.Cells.y3 y3Var = this.s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.v40
    public final void I(boolean z4, boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    @Override // xd.b
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            j0();
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.b = new kh.j4(this, context, 8);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.K();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 17));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c3.F();
        c3.E = new fb(this, 16);
        this.e = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        g81 g81Var = new g81(this, this, context);
        this.h = g81Var;
        g81Var.G();
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new d5(this, 26), new f81(this), new f81(this));
        this.c = g61Var;
        g61Var.V2.r = false;
        g61Var.p1();
        this.c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.Q);
        this.c.setClipToPadding(false);
        this.c.j(new l3(this, 29));
        org.telegram.ui.Components.g61 g61Var2 = this.c;
        kh.j4 j4Var = this.b;
        Objects.requireNonNull(g61Var2);
        this.V = new ng.k(g61Var2, j4Var, new x8(g61Var2, 0));
        this.c.C0(new c81(this, 2));
        this.b.addView(this.c, k7.b6.e(-1, -1, 119));
        eg.i0 i0Var = new eg.i0(this, context);
        this.d = i0Var;
        this.b.addView(i0Var, k7.b6.e(-1, 200, 48));
        this.b.addView(this.actionBar, k7.b6.e(-1, -2, 55));
        org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
        this.n = w40Var;
        w40Var.E = true;
        w40Var.a = this;
        w40Var.b = this;
        this.x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        this.x.addView(frameLayout, k7.b6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new d81(this, 5));
        k7.d6.a(this.y);
        this.B = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.C = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.y.addView(this.C, k7.b6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.s = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.y.addView(this.s, k7.b6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.D = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.j6.a7)));
        this.D.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.E = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.j6.Oh)));
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.F.setImageResource(R.drawable.filled_premium_camera);
        this.E.addView(this.F, k7.b6.e(22, 22, 17));
        this.D.addView(this.E, k7.b6.c(30.0f, 30));
        this.y.addView(this.D, k7.b6.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        k7.d6.a(this.D);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 22.0f);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setGravity(17);
        this.G.setSingleLine();
        TextView textView2 = this.G;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView i10 = yh.i(this.x, this.G, k7.b6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.H = i10;
        i10.setTextSize(1, 13.0f);
        this.H.setGravity(17);
        this.H.setSingleLine();
        this.H.setEllipsize(truncateAt);
        TextView i11 = yh.i(this.x, this.H, k7.b6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.I = i11;
        i11.setTextSize(1, 14.0f);
        this.I.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.B6));
        this.I.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.I.setGravity(17);
        this.I.setBackground(org.telegram.ui.ActionBar.j6.f0(getThemedColor(org.telegram.ui.ActionBar.j6.i6), 2, -1));
        this.I.setOnClickListener(new d81(this, 6));
        this.K = new View(context);
        o0(true, false);
        this.c.V2.N(false);
        m0(getUserConfig().getCurrentUser());
        p0();
        j0();
        kh.j4 j4Var2 = this.b;
        f81 f81Var = new f81(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(j4Var2, f81Var);
        kh.j4 j4Var3 = this.b;
        this.fragmentView = j4Var3;
        return j4Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.g61 g61Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            m0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.g61 g61Var2 = this.c;
            if (g61Var2 != null) {
                g61Var2.V2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            m0(getUserConfig().getCurrentUser());
        } else {
            if (i10 != NotificationCenter.newSuggestionsAvailable || (g61Var = this.c) == null) {
                return;
            }
            g61Var.V2.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    public final void i0() {
        ng.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.S) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.P) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.X.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
        RectF rectF = this.Y;
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.J ? 2 : 1, this.W);
        eVar.e(this.V, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f;
        xd.a aVar = this.a;
        org.telegram.ui.Components.z10.d(w0Var, 1.0f - aVar.e);
        org.telegram.ui.Components.z10.d(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.J ? 0.0f : 1.0f, 1.0f, aVar.e));
    }

    public final void l0(org.telegram.ui.ActionBar.p2 p2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.D1) == null || (actionBarLayout = launchActivity.p0) == null) {
            presentFragment(p2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.a0((org.telegram.ui.ActionBar.p2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(p2Var);
        c5Var.c = true;
        c5Var.g = true;
        actionBarLayout.R(c5Var);
    }

    public final void m0(TLRPC.User user) {
        String str;
        String str2;
        if (this.C != null && this.R == -1) {
            this.B.r(user);
            this.C.e(user, this.B);
            this.G.setText(UserObject.getUserName(user));
            StringBuilder sb = new StringBuilder();
            if (user != null) {
                sb.append(se.b.c().b("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb.append(" • @");
                sb.append(publicUsername);
            }
            this.H.setText(sb);
            TextView textView = this.I;
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

    public final void n0(boolean z4, boolean z10) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r = null;
        }
        if (!z10) {
            if (z4) {
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            } else {
                this.s.setAlpha(0.0f);
                this.s.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        int i10 = 1;
        if (z4) {
            this.s.setVisibility(0);
            this.r.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new l61(i10, this, z4));
        this.r.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.actionBar.getHeight()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(boolean z4, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.r0 r0Var = this.e.C;
        if (r0Var == null || r0Var.getTag() == null) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z11 = false;
            if (this.M == z11 || z4) {
                this.M = z11;
                valueAnimator = this.N;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.N = null;
                }
                if (z10) {
                    this.actionBar.getTitlesContainer().setAlpha(z11 ? 1.0f : 0.0f);
                    this.d.setAlpha(z11 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z11 ? 1.0f : 0.0f);
                this.N = ofFloat;
                ofFloat.addUpdateListener(new h11(this, 11));
                this.N.setInterpolator(org.telegram.ui.Components.nr.h);
                this.N.setDuration(420L);
                this.N.start();
                return;
            }
            return;
        }
        z11 = true;
        if (this.M == z11) {
        }
        this.M = z11;
        valueAnimator = this.N;
        if (valueAnimator != null) {
        }
        if (z10) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!kVar.k0) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        kVar.h(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.J = bundle.getBoolean("hasMainTabs", false);
        }
        this.Q = this.J ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    public final void p0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.C(getThemedColor(i10), false);
        this.b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.a7));
        this.G.setTextColor(getThemedColor(i10));
        this.H.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.y6));
        this.e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.d6);
        this.K.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.l1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ug0
    public final void s() {
        this.c.x0(0);
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.ug0
    public final sg.d y() {
        return this.U;
    }

    public o81(Bundle bundle) {
        super(bundle);
        this.a = new xd.a(0, this, org.telegram.ui.Components.nr.h, 350L, false);
        this.L = 0;
        this.O = new ArrayList();
        this.R = -1;
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        RectF rectF = new RectF();
        this.X = rectF;
        RectF rectF2 = new RectF();
        this.Y = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.S = new ng.e(false);
            this.T = new sg.d(null);
            this.U = new sg.d(null);
        } else {
            this.S = null;
            this.T = null;
            this.U = null;
        }
    }

    @Override // org.telegram.ui.Components.v40
    public final /* synthetic */ void P() {
    }

    @Override // xd.b
    public final /* synthetic */ void z(float f10, int i10) {
    }
}
