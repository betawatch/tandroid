package org.telegram.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.ClipData;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.StrictMode;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.OneUIUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserNameResolver;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLParseException;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.webrtc.MediaStreamTrack;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public class LaunchActivity extends m5 implements org.telegram.ui.ActionBar.a5, NotificationCenter.NotificationCenterDelegate, xx, sf.a {
    public static final Pattern C1 = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    public static boolean D1;
    public static int E1;
    public static boolean F1;
    public static org.telegram.ui.Components.uu G1;
    public static LaunchActivity H1;
    public static Pattern I1;
    public static b0 J1;
    public static LaunchActivity K1;
    public org.telegram.ui.Components.ne0 A0;
    public ai.ne A1;
    public final ArrayList B0;
    public int B1;
    public org.telegram.ui.Components.c11 C0;
    public org.telegram.ui.Components.da D0;
    public final ArrayList E0;
    public org.telegram.ui.ActionBar.b2 F0;
    public View G0;
    public org.telegram.ui.ActionBar.b2 H0;
    public boolean I0;
    public HashMap J0;
    public HashMap K0;
    public Intent L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public String P0;
    public boolean Q;
    public String Q0;
    public String R;
    public TLRPC.TL_wallPaper R0;
    public String S;
    public org.telegram.ui.ActionBar.g6 S0;
    public CharSequence T;
    public TLRPC.TL_theme T0;
    public ArrayList U;
    public boolean U0;
    public ArrayList V;
    public org.telegram.ui.ActionBar.b2 V0;
    public ArrayList W;
    public boolean W0;
    public Uri X;
    public boolean X0;
    public String Y;
    public yh.o4 Y0;
    public ArrayList Z;
    public a6 Z0;
    public ArrayList a0;
    public final ArrayList a1;
    public Uri b0;
    public final SparseIntArray b1;
    public int c0;
    public int c1;
    public final ia0 d1;
    public FlagSecureReason e1;
    public final LiteMode.BatteryReceiver f1;
    public p90 g0;
    public qh.e g1;
    public ArrayList h0;
    public boolean h1;
    public ArrayList i0;
    public zf.x i1;
    public String j0;
    public na0 j1;
    public ActionMode k0;
    public oa0 k1;
    public boolean l0;
    public boolean l1;
    public final com.google.firebase.messaging.l m0;
    public NotificationCenter.ObserversGroup m1;
    public final rf.b n0;
    public NotificationCenter.ObserversGroup n1;
    public ImageView o0;
    public boolean o1;
    public ig.k p0;
    public o90 p1;
    public ActionBarLayout q0;
    public ig.l0 q1;
    public ActionBarLayout r0;
    public boolean r1;
    public ActionBarLayout s0;
    public ViewGroup s1;
    public ba0 t0;
    public final xk0 t1;
    public FrameLayout u0;
    public org.telegram.ui.ActionBar.b2 u1;
    public ig.n1 v0;
    public org.telegram.ui.ActionBar.b2 v1;
    public m0 w0;
    public boolean w1;
    public la0 x0;
    public long x1;
    public org.telegram.ui.ActionBar.w3 y0;
    public int[] y1;
    public org.telegram.ui.ActionBar.y3 z0;
    public ValueAnimator z1;
    public final ArrayList P = new ArrayList();
    public final ArrayList d0 = new ArrayList();
    public final ArrayList e0 = new ArrayList();
    public final ArrayList f0 = new ArrayList();

    public LaunchActivity() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        lVar.a = new HashMap();
        lVar.d = this;
        lVar.b = new rf.b(this);
        this.m0 = lVar;
        this.n0 = (rf.b) lVar.b;
        this.B0 = new ArrayList();
        this.E0 = new ArrayList();
        this.W0 = false;
        this.a1 = new ArrayList();
        this.b1 = new SparseIntArray();
        this.c1 = 5934;
        this.d1 = new ia0();
        this.f1 = new LiteMode.BatteryReceiver();
        this.o1 = true;
        System.identityHashCode(this);
        this.t1 = new xk0(this);
        this.B1 = 0;
    }

    public static void C0(AccountInstance accountInstance, ey eyVar, CharSequence charSequence, long j10, MessageObject messageObject, long j11, boolean z10, int i10, int i11) {
        org.telegram.ui.Components.ir0 ir0Var;
        org.telegram.ui.Components.ir0 ir0Var2;
        boolean z11 = eyVar == null || (ir0Var2 = eyVar.G2) == null || ir0Var2.n;
        TLRPC.WebPage webPage = null;
        if (z11 && eyVar != null && (ir0Var = eyVar.G2) != null) {
            webPage = ir0Var.getLoadedWebPage();
        }
        TLRPC.WebPage webPage2 = webPage;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (webPage2 == null && z11) {
            SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j10, j11, z10, i10, i11, 0L);
            return;
        }
        CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
        if (trimmedString == null || trimmedString.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {trimmedString};
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j10, messageObject, messageObject, webPage2, z11, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z10, i10, i11, null, false));
    }

    public static void E(int i10) {
        LaunchActivity launchActivity = K1;
        if (launchActivity != null) {
            launchActivity.C(i10);
        }
    }

    public static void G0(LaunchActivity launchActivity, int i10, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z10) {
        org.telegram.ui.ActionBar.n2 R = R();
        if (R == null) {
            return;
        }
        long j10 = tL_attachMenuBot.bot_id;
        gi.t4 b10 = gi.t4.b(i10, j10, j10, tL_attachMenuBot.short_name, null, 1, 0, 0L, null, false, str, null, 2, false, false);
        if (launchActivity.P() == null || launchActivity.P().k(b10) == null) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
            String restrictionReason = user == null ? null : MessagesController.getInstance(i10).getRestrictionReason(user.restriction_reason);
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(i10);
                MessagesController.showCantOpenAlert(R, restrictionReason);
                return;
            }
            gi.d3 d3Var = new gi.d3(launchActivity, R.getResourceProvider());
            d3Var.A0 = false;
            d3Var.x(z10);
            d3Var.k0 = launchActivity;
            d3Var.t(R, b10);
            d3Var.show();
        }
    }

    public static void L() {
        ArrayList<org.telegram.ui.ActionBar.j2> arrayList;
        org.telegram.ui.ActionBar.n2 U = U();
        if (U == null) {
            return;
        }
        ry w9 = U.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) U.getParentLayout()).w() : null;
        if (w9 != null && (arrayList = w9.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                w9.sheetsStack.get(size).dismiss(true);
            }
        }
        ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = U.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                U.sheetsStack.get(size2).dismiss(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = gi.d3.W0.iterator();
        while (it.hasNext()) {
            arrayList3.add((gi.d3) it.next());
        }
        int size3 = arrayList3.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj = arrayList3.get(i10);
            i10++;
            ((gi.d3) obj).k(true);
        }
    }

    public static org.telegram.ui.ActionBar.n2 N() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.t();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((ActionBarLayout) ((org.telegram.ui.ActionBar.d5) i0.a.h(1, H1.P))).t();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.O() == null) {
            return null;
        }
        return ((ActionBarLayout) H1.O()).t();
    }

    public static org.telegram.ui.ActionBar.n2 R() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.d5) i0.a.h(1, H1.P)).getLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.O() == null) {
            return null;
        }
        return H1.O().getLastFragment();
    }

    public static org.telegram.ui.ActionBar.n2 U() {
        ActionBarLayout actionBarLayout;
        BubbleActivity bubbleActivity = BubbleActivity.a0;
        if (bubbleActivity != null && (actionBarLayout = bubbleActivity.S) != null) {
            return actionBarLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = H1;
        if (launchActivity != null && !launchActivity.P.isEmpty()) {
            return ((org.telegram.ui.ActionBar.d5) i0.a.h(1, H1.P)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = H1;
        if (launchActivity2 == null || launchActivity2.O() == null) {
            return null;
        }
        return H1.O().getSafeLastFragment();
    }

    public static String V(int i10, String str, HashMap hashMap) {
        String str2 = (String) hashMap.get(str);
        return str2 == null ? LocaleController.getString(str, i10) : str2;
    }

    public static int W(Uri uri) {
        String query = uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND) ? uri.getQuery() : uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        if (TextUtils.isEmpty(query)) {
            return -1;
        }
        if (I1 == null) {
            I1 = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
        }
        try {
            Matcher matcher = I1.matcher(query);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                String group3 = matcher.group(3);
                String group4 = matcher.group(4);
                int i10 = 0;
                int parseInt = TextUtils.isEmpty(group) ? 0 : Integer.parseInt(group);
                int parseInt2 = TextUtils.isEmpty(group2) ? 0 : Integer.parseInt(group2);
                int parseInt3 = TextUtils.isEmpty(group3) ? 0 : Integer.parseInt(group3);
                if (!TextUtils.isEmpty(group4)) {
                    i10 = Integer.parseInt(group4);
                }
                return (parseInt * 86400) + (parseInt2 * 3600) + (parseInt3 * 60) + i10;
            }
        } catch (Throwable unused) {
        }
        try {
            return Integer.parseInt(query);
        } catch (Throwable unused2) {
            if (!query.contains(":")) {
                return -1;
            }
            String[] split = query.split(":");
            String str = split.length - 1 < 0 ? "0" : split[split.length - 1];
            String str2 = split.length - 2 < 0 ? "0" : split[split.length - 2];
            String str3 = split.length - 3 < 0 ? "0" : split[split.length - 3];
            try {
                return (Integer.parseInt(split.length - 4 >= 0 ? split[split.length - 4] : "0") * 86400) + (Integer.parseInt(str3) * 3600) + (Integer.parseInt(str2) * 60) + Integer.parseInt(str);
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
    }

    public static void a0(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a0(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void c0(float f7, float f10, float f11) {
        View decorView;
        ai.ne neVar;
        LaunchActivity launchActivity = H1;
        if (launchActivity == null || (decorView = launchActivity.getWindow().getDecorView()) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((neVar = launchActivity.A1) == null || ((View) neVar.a) != decorView)) {
            launchActivity.A1 = new ai.ne(decorView);
        }
        ai.ne neVar2 = launchActivity.A1;
        if (neVar2 != null) {
            View view = (View) neVar2.a;
            ArrayList arrayList = neVar2.b;
            if (arrayList.size() >= 7) {
                return;
            }
            float max = (Math.max(Math.max(v7.f7.a(0.0f, 0.0f, f7, f10), v7.f7.a(view.getWidth(), 0.0f, f7, f10)), Math.max(v7.f7.a(0.0f, view.getHeight(), f7, f10), v7.f7.a(view.getWidth(), view.getHeight(), f7, f10))) * 2.0f) / (AndroidUtilities.density * 1200.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
            ai.me meVar = new ai.me(f7, f10, f11);
            ofFloat.addUpdateListener(new ah.l0(1, neVar2, meVar));
            ofFloat.addListener(new ai.le(0, neVar2, meVar));
            ofFloat.setInterpolator(org.telegram.ui.Components.bs.g);
            ofFloat.setDuration((long) (max * 1000.0f));
            arrayList.add(meVar);
            neVar2.f1();
            ofFloat.start();
        }
    }

    public final void A() {
        if (this.O != UserConfig.selectedAccount || this.m1 == null) {
            NotificationCenter.ObserversGroup observersGroup = this.m1;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.m1 = null;
            }
            int i10 = UserConfig.selectedAccount;
            this.O = i10;
            this.m1 = NotificationCenter.getInstance(i10).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f2, code lost:
    
        if (r8 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        r0 = new java.io.BufferedReader(new java.io.InputStreamReader(r8));
        r9 = new java.lang.StringBuilder();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r11 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r11 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r10 >= 100) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r9.append(r11);
        r9.append('\n');
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        r1 = r9.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        r8.closeEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00df, code lost:
    
        if (r8 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00e1, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00e5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e6, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(Uri uri) {
        Throwable th2;
        InputStream inputStream;
        int i10 = UserConfig.selectedAccount;
        InputStream inputStream2 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        r1 = null;
        String str = null;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
        int[] iArr = {0};
        String fixFileName = FileLoader.fixFileName(MediaController.getFileName(uri));
        if (fixFileName == null || !fixFileName.endsWith(".zip")) {
            try {
                inputStream = getContentResolver().openInputStream(uri);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null || i11 >= 100) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append('\n');
                            i11++;
                        }
                        str = sb2.toString();
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream2 = inputStream;
                        if (inputStream2 == null) {
                            throw th2;
                        }
                        try {
                            inputStream2.close();
                            throw th2;
                        } catch (Exception e) {
                            FileLog.e(e);
                            throw th2;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    FileLog.e(e);
                }
            } catch (Exception e10) {
                e = e10;
                inputStream = null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        } else {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(getContentResolver().openInputStream(uri));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    while (true) {
                        if (nextEntry == null) {
                            break;
                        }
                        String name = nextEntry.getName();
                        if (name == null) {
                            nextEntry = zipInputStream.getNextEntry();
                        } else {
                            int lastIndexOf = name.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                name = name.substring(lastIndexOf + 1);
                            }
                            if (name.endsWith(".txt")) {
                                try {
                                    break;
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                            } else {
                                nextEntry = zipInputStream.getNextEntry();
                            }
                        }
                    }
                    zipInputStream.close();
                } catch (Throwable th5) {
                    try {
                        try {
                            zipInputStream.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    } catch (Exception e12) {
                        e = e12;
                        str = null;
                        try {
                            FileLog.e(e);
                        } catch (Exception e13) {
                            FileLog.e(e13);
                        }
                        if (str != null) {
                        }
                    }
                }
            } catch (Exception e14) {
                e = e14;
            }
        }
        if (str != null) {
            return;
        }
        TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
        tL_messages_checkHistoryImport.import_head = str;
        iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkHistoryImport, new ci.t8(this, uri, i10, b2Var, 6));
        b2Var.setOnCancelListener(new yy(i10, 1, iArr));
        try {
            b2Var.q(300L);
        } catch (Exception unused) {
        }
    }

    public final void B() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.i1 == null && SharedConfig.frameMetricsEnabled) {
                this.i1 = zf.x.b(this, this.w0);
            }
            zf.x xVar = this.i1;
            if (xVar == null || SharedConfig.frameMetricsEnabled) {
                return;
            }
            xVar.c();
            this.i1 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, final String str26, final String str27, final pf.c cVar, final boolean z12, final int i13, final boolean z13, final int i14, final int i15, final String str28, final String str29, final boolean z14, final String str30, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final String str31, final Integer num3, final boolean z20, final byte[] bArr) {
        final LaunchActivity launchActivity;
        b80 b80Var;
        final int i16;
        org.telegram.ui.ActionBar.b2 b2Var;
        final int i17;
        int[] iArr;
        b80 b80Var2;
        org.telegram.ui.Components.aw awVar;
        org.telegram.ui.Components.oy0 oy0Var;
        TLRPC.Chat chat;
        if (i11 == 0 && UserConfig.getActivatedAccountsCount() >= 2 && hashMap != null) {
            org.telegram.ui.Components.f5.h(this, new org.telegram.ui.Components.c5() { // from class: org.telegram.ui.w90
                @Override // org.telegram.ui.Components.c5
                public final void a(int i18) {
                    Pattern pattern = LaunchActivity.C1;
                    LaunchActivity launchActivity2 = LaunchActivity.this;
                    if (i18 != i10) {
                        launchActivity2.O0(i18);
                    }
                    launchActivity2.B0(i18, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z10, num, l4, l10, num2, str13, hashMap, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z11, str22, 1, i12, str23, str24, str25, str26, str27, cVar, z12, i13, z13, i14, i15, str28, str29, z14, str30, z15, z16, z17, z18, z19, str31, num3, z20, bArr);
                }
            }).show();
            return;
        }
        final pf.c cVar2 = cVar;
        char c10 = 1;
        char c11 = 1;
        final int i18 = 0;
        if (str16 != null) {
            NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
            int i19 = NotificationCenter.didReceiveSmsCode;
            if (globalInstance.hasObservers(i19)) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(i19, str16);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
            b2Var2.R = string;
            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OtherLoginCode, str16));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            F0(alertDialog$Builder);
            return;
        }
        if (str17 != null) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            String string2 = LocaleController.getString(R.string.AuthAnotherClient);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
            b2Var3.R = string2;
            b2Var3.T = LocaleController.getString(R.string.AuthAnotherClientUrl);
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
            F0(alertDialog$Builder2);
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var4 = new org.telegram.ui.ActionBar.b2(this, 3, null);
        final b80 b80Var3 = new b80(10, cVar2, b2Var4);
        final int[] iArr2 = {0};
        if (str10 != null) {
            TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
            tL_contacts_importContactToken.token = str10;
            final int i20 = 0;
            iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new RequestDelegate(this) { // from class: org.telegram.ui.y90
                public final /* synthetic */ LaunchActivity b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            Pattern pattern = LaunchActivity.C1;
                            AndroidUtilities.runOnUIThread(new j80(this.b, tLObject, i10, str10, tL_error, b80Var3));
                            break;
                        case 1:
                            Pattern pattern2 = LaunchActivity.C1;
                            AndroidUtilities.runOnUIThread(new ai.tb((ContextWrapper) this.b, tLObject, i10, str10, (Object) b80Var3, 27));
                            break;
                        default:
                            Pattern pattern3 = LaunchActivity.C1;
                            AndroidUtilities.runOnUIThread(new j80(this.b, tL_error, tLObject, i10, str10, b80Var3));
                            break;
                    }
                }
            });
        } else {
            if (str11 != null) {
                TL_chatlists.TL_chatlists_checkChatlistInvite tL_chatlists_checkChatlistInvite = new TL_chatlists.TL_chatlists_checkChatlistInvite();
                tL_chatlists_checkChatlistInvite.slug = str11;
                final int i21 = 1;
                launchActivity = this;
                iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_chatlists_checkChatlistInvite, new RequestDelegate(this) { // from class: org.telegram.ui.y90
                    public final /* synthetic */ LaunchActivity b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (i21) {
                            case 0:
                                Pattern pattern = LaunchActivity.C1;
                                AndroidUtilities.runOnUIThread(new j80(this.b, tLObject, i10, str11, tL_error, b80Var3));
                                break;
                            case 1:
                                Pattern pattern2 = LaunchActivity.C1;
                                AndroidUtilities.runOnUIThread(new ai.tb((ContextWrapper) this.b, tLObject, i10, str11, (Object) b80Var3, 27));
                                break;
                            default:
                                Pattern pattern3 = LaunchActivity.C1;
                                AndroidUtilities.runOnUIThread(new j80(this.b, tL_error, tLObject, i10, str11, b80Var3));
                                break;
                        }
                    }
                });
            } else {
                launchActivity = this;
                if (str29 != null) {
                    iArr2[0] = GiftAuctionController.getInstance(launchActivity.O).requestGiftAuctionBySlug(str29, new Utilities.Callback2(launchActivity) { // from class: org.telegram.ui.z90
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            GiftAuctionController.Auction auction;
                            int i22 = i18;
                            b80 b80Var4 = b80Var3;
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (i22) {
                                case 0:
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.q.q(R.string.GiftAuctionNotFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i0.a.h(1, launchActivity2.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState != null && (auction = GiftAuctionController.getInstance(launchActivity2.O).getAuction(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new ai.a2(launchActivity2, null, launchActivity2.O, auction.gift.title, auction.previewAttributes, false).show();
                                        }
                                    }
                                    try {
                                        b80Var4.run();
                                        break;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                    break;
                                default:
                                    LaunchActivity launchActivity3 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.q.q(R.string.GiftAuctionNotFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i0.a.h(1, launchActivity3.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern2 = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState != null) {
                                            int i23 = launchActivity3.O;
                                            long j10 = tL_StarGiftAuctionState.gift.id;
                                            org.telegram.ui.Components.zc[] zcVarArr = yh.w.p0;
                                            GiftAuctionController.getInstance(i23).getOrRequestAuction(j10, new org.telegram.ui.Components.a3(launchActivity3, (org.telegram.ui.ActionBar.d6) null, i23, 0L, (Runnable) null));
                                        }
                                    }
                                    try {
                                        b80Var4.run();
                                        break;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                            }
                        }
                    });
                } else if (str28 != null) {
                    GiftAuctionController giftAuctionController = GiftAuctionController.getInstance(launchActivity.O);
                    final char c12 = c11 == true ? 1 : 0;
                    iArr2[0] = giftAuctionController.requestGiftAuctionBySlug(str28, new Utilities.Callback2(launchActivity) { // from class: org.telegram.ui.z90
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            GiftAuctionController.Auction auction;
                            int i22 = c12;
                            b80 b80Var4 = b80Var3;
                            TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            switch (i22) {
                                case 0:
                                    LaunchActivity launchActivity2 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.q.q(R.string.GiftAuctionNotFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i0.a.h(1, launchActivity2.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState != null && (auction = GiftAuctionController.getInstance(launchActivity2.O).getAuction(tL_StarGiftAuctionState.gift.id)) != null) {
                                            new ai.a2(launchActivity2, null, launchActivity2.O, auction.gift.title, auction.previewAttributes, false).show();
                                        }
                                    }
                                    try {
                                        b80Var4.run();
                                        break;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                    break;
                                default:
                                    LaunchActivity launchActivity3 = this.b;
                                    if (tL_error != null) {
                                        org.telegram.messenger.q.q(R.string.GiftAuctionNotFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i0.a.h(1, launchActivity3.d0)), R.raw.error, 36);
                                    } else {
                                        Pattern pattern2 = LaunchActivity.C1;
                                        if (tL_StarGiftAuctionState != null) {
                                            int i23 = launchActivity3.O;
                                            long j10 = tL_StarGiftAuctionState.gift.id;
                                            org.telegram.ui.Components.zc[] zcVarArr = yh.w.p0;
                                            GiftAuctionController.getInstance(i23).getOrRequestAuction(j10, new org.telegram.ui.Components.a3(launchActivity3, (org.telegram.ui.ActionBar.d6) null, i23, 0L, (Runnable) null));
                                        }
                                    }
                                    try {
                                        b80Var4.run();
                                        break;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                            }
                        }
                    });
                } else if (str19 != null) {
                    TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                    getuniquestargift.slug = str19;
                    final int i22 = 2;
                    iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new RequestDelegate(launchActivity) { // from class: org.telegram.ui.y90
                        public final /* synthetic */ LaunchActivity b;

                        {
                            this.b = launchActivity;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i22) {
                                case 0:
                                    Pattern pattern = LaunchActivity.C1;
                                    AndroidUtilities.runOnUIThread(new j80(this.b, tLObject, i10, str19, tL_error, b80Var3));
                                    break;
                                case 1:
                                    Pattern pattern2 = LaunchActivity.C1;
                                    AndroidUtilities.runOnUIThread(new ai.tb((ContextWrapper) this.b, tLObject, i10, str19, (Object) b80Var3, 27));
                                    break;
                                default:
                                    Pattern pattern3 = LaunchActivity.C1;
                                    AndroidUtilities.runOnUIThread(new j80(this.b, tL_error, tLObject, i10, str19, b80Var3));
                                    break;
                            }
                        }
                    });
                } else if (str18 != null) {
                    TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                    TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                    tL_inputInvoiceSlug.slug = str18;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                    iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getPaymentForm, new ai.rb(this, tL_inputInvoiceSlug, b80Var3, i10, str18, 11));
                } else {
                    if (str != null) {
                        if (cVar2 != null) {
                            cVar2.d();
                        }
                        UserNameResolver userNameResolver = MessagesController.getInstance(i10).getUserNameResolver();
                        i17 = i10;
                        Utilities.Callback<Long> callback = new Utilities.Callback() { // from class: org.telegram.ui.aa0
                            /* JADX WARN: Can't wrap try/catch for region: R(8:59|(2:63|(10:66|(2:68|(2:70|(5:72|(2:74|(2:76|77)(1:78))(1:82)|79|80|81)(1:83))(1:331))(1:332)|84|85|(2:87|(2:89|90))(1:330)|(2:92|(1:96))(2:105|(5:(3:127|128|(8:130|(3:132|(1:159)(1:136)|137)(2:160|(1:165)(1:164))|138|(2:149|(2:154|(1:158))(1:153))(1:142)|143|(1:145)|146|(1:148))(4:(3:297|298|(3:320|321|(2:323|324)(1:326))(7:304|(1:306)(1:319)|307|(1:309)(1:318)|310|(2:312|(1:314)(1:316))(1:317)|315))(18:168|(2:170|(1:289)(2:174|(2:176|177)(1:178)))(3:290|(3:292|(1:294)|295)|296)|(1:288)(1:183)|184|(1:186)(1:287)|(3:188|(1:190)|(1:192))|193|(1:195)|196|(1:198)|(1:200)|(1:202)|(1:204)(1:286)|(1:206)(1:285)|207|(1:284)(1:210)|(3:215|(1:283)(1:219)|(1:(2:229|(5:264|265|266|267|(1:279)(5:269|(1:271)(1:278)|(2:273|(1:275))|276|277))(1:(5:257|(1:259)(1:263)|260|261|262)(2:(1:256)(1:237)|(7:243|(1:245)|(1:247)|248|249|250|252)(2:241|242))))(1:228))(2:222|(1:224)(1:225)))|214)|98|99|101))(2:123|(1:126))|125|98|99|101)(3:108|(1:117)(2:112|(1:114)(1:115))|116))|97|98|99|101))|345|346|(4:348|(1:350)|351|(1:353)(1:354))|98|99|101) */
                            /* JADX WARN: Code restructure failed: missing block: B:355:0x09bb, code lost:
                            
                                r0 = move-exception;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:357:0x09e9, code lost:
                            
                                org.telegram.messenger.FileLog.e(r0);
                             */
                            @Override // org.telegram.messenger.Utilities.Callback
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void run(Object obj) {
                                Long l11;
                                int i23;
                                String str32;
                                String str33;
                                Integer num4;
                                String str34;
                                int i24;
                                b80 b80Var4;
                                final byte[] bArr2;
                                String str35;
                                LaunchActivity launchActivity2;
                                Long l12;
                                String str36;
                                String str37;
                                String str38;
                                String str39;
                                String str40;
                                final b80 b80Var5;
                                Long l13;
                                String str41;
                                String str42;
                                int i25;
                                String str43;
                                int i26;
                                byte[] bArr3;
                                int i27;
                                b80 b80Var6;
                                String str44;
                                long j10;
                                boolean z21;
                                boolean z22;
                                String str45;
                                String str46;
                                boolean z23;
                                boolean z24;
                                org.telegram.ui.ActionBar.d6 d6Var;
                                org.telegram.ui.Components.xc a02;
                                int i28;
                                String str47;
                                String str48;
                                Integer num5;
                                String str49;
                                int i29;
                                final Long l14 = (Long) obj;
                                final LaunchActivity launchActivity3 = LaunchActivity.this;
                                ArrayList arrayList = launchActivity3.d0;
                                b80 b80Var7 = b80Var3;
                                if (l14 != null && l14.longValue() == Long.MAX_VALUE) {
                                    try {
                                        b80Var7.run();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(launchActivity3, 0, null);
                                    alertDialog$Builder3.a.R = LocaleController.getString(R.string.AffiliateLinkExpiredTitle);
                                    alertDialog$Builder3.a.T = LocaleController.getString(R.string.AffiliateLinkExpiredText);
                                    i0.a.r(R.string.OK, alertDialog$Builder3, null);
                                    return;
                                }
                                if (launchActivity3.isFinishing()) {
                                    return;
                                }
                                final boolean z25 = z13;
                                if (z25 && l14 != null) {
                                    ci.i7 storiesController = MessagesController.getInstance(launchActivity3.O).getStoriesController();
                                    long longValue = l14.longValue();
                                    o80 o80Var = new o80(launchActivity3, b80Var7, l14, 0);
                                    int i30 = storiesController.a;
                                    TL_stories.PeerStories y3 = storiesController.y(longValue);
                                    if (y3 != null) {
                                        for (int i31 = 0; i31 < y3.stories.size(); i31++) {
                                            if ((y3.stories.get(i31).media instanceof TLRPC.TL_messageMediaVideoStream) && !(y3.stories.get(i31) instanceof TL_stories.TL_storyItemSkipped)) {
                                                o80Var.run(y3.stories.get(i31));
                                                return;
                                            }
                                        }
                                    }
                                    long j11 = ((-93321425) + longValue) << 12;
                                    TL_stories.StoryItem storyItem = (TL_stories.StoryItem) storiesController.E.f(j11);
                                    if (storyItem != null) {
                                        o80Var.run(storyItem);
                                        return;
                                    }
                                    TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                                    tL_stories_getPeerStories.peer = MessagesController.getInstance(i30).getInputPeer(longValue);
                                    ConnectionsManager.getInstance(i30).sendRequest(tL_stories_getPeerStories, new ci.q6(storiesController, j11, o80Var));
                                    return;
                                }
                                final int i32 = i13;
                                if (i32 != 0 && l14 != null) {
                                    MessagesController.getInstance(launchActivity3.O).getStoriesController().d0(l14.longValue(), i32, new o80(launchActivity3, b80Var7, l14, 1));
                                    return;
                                }
                                final int i33 = i14;
                                if (i33 != 0 && l14 != null) {
                                    ci.i7 storiesController2 = MessagesController.getInstance(launchActivity3.O).getStoriesController();
                                    long longValue2 = l14.longValue();
                                    ai.ta taVar = new ai.ta(launchActivity3, b80Var7, l14, i33);
                                    int i34 = storiesController2.a;
                                    ci.w6 B = storiesController2.B(longValue2, false);
                                    if (B != null) {
                                        ci.b7 b10 = B.b(i33);
                                        if (b10 != null) {
                                            TL_stories.TL_storyAlbum tL_storyAlbum = new TL_stories.TL_storyAlbum();
                                            tL_storyAlbum.album_id = b10.a;
                                            tL_storyAlbum.title = b10.b;
                                            tL_storyAlbum.icon_photo = b10.c;
                                            tL_storyAlbum.icon_video = b10.d;
                                            taVar.run(tL_storyAlbum);
                                            return;
                                        }
                                        if (B.f) {
                                            taVar.run(null);
                                            return;
                                        }
                                    }
                                    TL_stories.TL_getAlbums tL_getAlbums = new TL_stories.TL_getAlbums();
                                    tL_getAlbums.peer = MessagesController.getInstance(i34).getInputPeer(longValue2);
                                    ConnectionsManager.getInstance(i34).sendRequest(tL_getAlbums, new ai.m2(i33, taVar));
                                    return;
                                }
                                final b80 b80Var8 = b80Var7;
                                final String str50 = str;
                                try {
                                    if (l14 != null && launchActivity3.q0 != null) {
                                        final String str51 = str13;
                                        final String str52 = str21;
                                        final boolean z26 = z11;
                                        final String str53 = str22;
                                        if ((str51 == null && str52 == null) || ((str51 != null && l14.longValue() > 0) || ((str52 != null && l14.longValue() > 0) || ((z26 && l14.longValue() < 0) || (str53 != null && l14.longValue() < 0))))) {
                                            final String str54 = str26;
                                            boolean isEmpty = TextUtils.isEmpty(str54);
                                            final int i35 = i17;
                                            final String str55 = str2;
                                            final String str56 = str3;
                                            final String str57 = str4;
                                            final String str58 = str5;
                                            final String str59 = str6;
                                            final String str60 = str7;
                                            final String str61 = str8;
                                            final String str62 = str9;
                                            final String str63 = str10;
                                            final String str64 = str11;
                                            final String str65 = str12;
                                            final boolean z27 = z10;
                                            final Integer num6 = num;
                                            final Long l15 = l4;
                                            final Long l16 = l10;
                                            final Integer num7 = num2;
                                            final HashMap hashMap2 = hashMap;
                                            final String str66 = str14;
                                            final String str67 = str15;
                                            final String str68 = str16;
                                            final String str69 = str17;
                                            final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                                            final String str70 = str18;
                                            final String str71 = str19;
                                            final String str72 = str20;
                                            final int i36 = i11;
                                            final int i37 = i12;
                                            final String str73 = str23;
                                            final String str74 = str24;
                                            final String str75 = str25;
                                            final pf.c cVar3 = cVar2;
                                            final boolean z28 = z12;
                                            final int i38 = i15;
                                            final String str76 = str28;
                                            final String str77 = str29;
                                            final boolean z29 = z14;
                                            final String str78 = str30;
                                            final boolean z30 = z15;
                                            final boolean z31 = z16;
                                            final boolean z32 = z17;
                                            final boolean z33 = z18;
                                            final boolean z34 = z19;
                                            final String str79 = str31;
                                            final Integer num8 = num3;
                                            final boolean z35 = z20;
                                            final byte[] bArr4 = bArr;
                                            final String str80 = str27;
                                            if (isEmpty) {
                                                l11 = l14;
                                                i23 = i35;
                                                str32 = str65;
                                                str33 = str51;
                                                num4 = num7;
                                                str34 = str69;
                                                i24 = i36;
                                                b80Var4 = b80Var8;
                                                bArr2 = bArr4;
                                                str35 = str80;
                                                launchActivity2 = launchActivity3;
                                                l12 = l15;
                                                str36 = str67;
                                                str37 = str71;
                                                str38 = str74;
                                            } else {
                                                final TLRPC.User user = MessagesController.getInstance(i35).getUser(l14);
                                                if (user == null) {
                                                    str35 = str80;
                                                    str32 = str65;
                                                    num4 = num7;
                                                    str34 = str69;
                                                    i24 = i36;
                                                    l11 = l14;
                                                    i23 = i35;
                                                    launchActivity2 = launchActivity3;
                                                    str33 = str51;
                                                    l12 = l15;
                                                    str36 = str67;
                                                    str37 = str71;
                                                    str38 = str74;
                                                    b80Var4 = b80Var8;
                                                    bArr2 = bArr4;
                                                } else {
                                                    if (user.bot) {
                                                        if (!user.bot_attach_menu) {
                                                            str47 = str80;
                                                            str48 = str65;
                                                            num5 = num7;
                                                            str49 = str69;
                                                            i29 = i36;
                                                        } else if (!MediaDataController.getInstance(i35).botInAttachMenu(user.id)) {
                                                            TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                                                            tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(i35).getInputUser(l14.longValue());
                                                            ConnectionsManager.getInstance(i35).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() { // from class: org.telegram.ui.p80
                                                                @Override // org.telegram.tgnet.RequestDelegate
                                                                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                                                                    Pattern pattern = LaunchActivity.C1;
                                                                    final LaunchActivity launchActivity4 = LaunchActivity.this;
                                                                    final int i39 = i35;
                                                                    final String str81 = str50;
                                                                    final String str82 = str55;
                                                                    final String str83 = str56;
                                                                    final String str84 = str57;
                                                                    final String str85 = str58;
                                                                    final String str86 = str59;
                                                                    final String str87 = str60;
                                                                    final String str88 = str61;
                                                                    final String str89 = str62;
                                                                    final String str90 = str63;
                                                                    final String str91 = str64;
                                                                    final String str92 = str65;
                                                                    final boolean z36 = z27;
                                                                    final Integer num9 = num6;
                                                                    final Long l17 = l15;
                                                                    final Long l18 = l16;
                                                                    final Integer num10 = num7;
                                                                    final String str93 = str51;
                                                                    final HashMap hashMap3 = hashMap2;
                                                                    final String str94 = str66;
                                                                    final String str95 = str67;
                                                                    final String str96 = str68;
                                                                    final String str97 = str69;
                                                                    final TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper2;
                                                                    final String str98 = str70;
                                                                    final String str99 = str71;
                                                                    final String str100 = str72;
                                                                    final String str101 = str52;
                                                                    final boolean z37 = z26;
                                                                    final String str102 = str53;
                                                                    final int i40 = i36;
                                                                    final int i41 = i37;
                                                                    final String str103 = str73;
                                                                    final String str104 = str74;
                                                                    final String str105 = str75;
                                                                    final pf.c cVar4 = cVar3;
                                                                    final boolean z38 = z28;
                                                                    final int i42 = i32;
                                                                    final boolean z39 = z25;
                                                                    final int i43 = i33;
                                                                    final int i44 = i38;
                                                                    final String str106 = str76;
                                                                    final String str107 = str77;
                                                                    final boolean z40 = z29;
                                                                    final String str108 = str78;
                                                                    final boolean z41 = z30;
                                                                    final boolean z42 = z31;
                                                                    final boolean z43 = z32;
                                                                    final boolean z44 = z33;
                                                                    final boolean z45 = z34;
                                                                    final String str109 = str79;
                                                                    final Integer num11 = num8;
                                                                    final boolean z46 = z35;
                                                                    final byte[] bArr5 = bArr4;
                                                                    final Long l19 = l14;
                                                                    final String str110 = str54;
                                                                    final String str111 = str80;
                                                                    final TLRPC.User user2 = user;
                                                                    final b80 b80Var9 = b80Var8;
                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.w80
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            final String str112;
                                                                            b80 b80Var10;
                                                                            pf.c cVar5;
                                                                            TLRPC.User user3;
                                                                            final String str113;
                                                                            final boolean z47;
                                                                            final int i45;
                                                                            final int i46;
                                                                            final TLRPC.TL_attachMenuBot tL_attachMenuBot;
                                                                            int i47;
                                                                            Pattern pattern2 = LaunchActivity.C1;
                                                                            final LaunchActivity launchActivity5 = LaunchActivity.this;
                                                                            TLRPC.TL_error tL_error2 = tL_error;
                                                                            final int i48 = i39;
                                                                            final String str114 = str81;
                                                                            final String str115 = str82;
                                                                            final String str116 = str83;
                                                                            final String str117 = str84;
                                                                            final String str118 = str85;
                                                                            final String str119 = str86;
                                                                            final String str120 = str87;
                                                                            final String str121 = str88;
                                                                            final String str122 = str89;
                                                                            final String str123 = str90;
                                                                            final String str124 = str91;
                                                                            final String str125 = str92;
                                                                            final boolean z48 = z36;
                                                                            final Integer num12 = num9;
                                                                            final Long l20 = l17;
                                                                            final Long l21 = l18;
                                                                            final Integer num13 = num10;
                                                                            final String str126 = str93;
                                                                            final HashMap hashMap4 = hashMap3;
                                                                            final String str127 = str94;
                                                                            final String str128 = str95;
                                                                            final String str129 = str96;
                                                                            final String str130 = str97;
                                                                            final TLRPC.TL_wallPaper tL_wallPaper4 = tL_wallPaper3;
                                                                            final String str131 = str98;
                                                                            final String str132 = str99;
                                                                            final String str133 = str100;
                                                                            final String str134 = str101;
                                                                            final boolean z49 = z37;
                                                                            final String str135 = str102;
                                                                            final int i49 = i40;
                                                                            final int i50 = i41;
                                                                            final String str136 = str103;
                                                                            final String str137 = str104;
                                                                            final String str138 = str105;
                                                                            final pf.c cVar6 = cVar4;
                                                                            final boolean z50 = z38;
                                                                            final int i51 = i42;
                                                                            final int i52 = i43;
                                                                            final int i53 = i44;
                                                                            final boolean z51 = z40;
                                                                            final String str139 = str108;
                                                                            final boolean z52 = z41;
                                                                            final boolean z53 = z42;
                                                                            final boolean z54 = z43;
                                                                            final boolean z55 = z44;
                                                                            final boolean z56 = z45;
                                                                            final String str140 = str109;
                                                                            final boolean z57 = z46;
                                                                            if (tL_error2 != null) {
                                                                                final boolean z58 = z39;
                                                                                final String str141 = str106;
                                                                                final String str142 = str107;
                                                                                final Integer num14 = num11;
                                                                                final byte[] bArr6 = bArr5;
                                                                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.g90
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        Pattern pattern3 = LaunchActivity.C1;
                                                                                        LaunchActivity.this.B0(i48, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, z48, num12, l20, l21, num13, str126, hashMap4, str127, str128, str129, str130, tL_wallPaper4, str131, str132, str133, str134, z49, str135, i49, i50, str136, str137, str138, null, null, cVar6, z50, i51, z58, i52, i53, str141, str142, z51, str139, z52, z53, z54, z55, z56, str140, num14, z57, bArr6);
                                                                                    }
                                                                                });
                                                                                return;
                                                                            }
                                                                            TLObject tLObject2 = tLObject;
                                                                            if (tLObject2 instanceof TLRPC.TL_attachMenuBotsBot) {
                                                                                final TLRPC.TL_attachMenuBot tL_attachMenuBot2 = ((TLRPC.TL_attachMenuBotsBot) tLObject2).bot;
                                                                                boolean z59 = tL_attachMenuBot2 != null && (tL_attachMenuBot2.show_in_side_menu || tL_attachMenuBot2.show_in_attach_menu);
                                                                                boolean z60 = tL_attachMenuBot2.inactive;
                                                                                final boolean z61 = z59;
                                                                                final Long l22 = l19;
                                                                                final String str143 = str110;
                                                                                final String str144 = str111;
                                                                                final TLRPC.User user4 = user2;
                                                                                final b80 b80Var11 = b80Var9;
                                                                                if (!z60 && !tL_attachMenuBot2.side_menu_disclaimer_needed) {
                                                                                    str112 = str143;
                                                                                    b80Var10 = b80Var11;
                                                                                } else if (z61) {
                                                                                    bi1.a(launchActivity5, new Utilities.Callback() { // from class: org.telegram.ui.h90
                                                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                                                        public final void run(Object obj2) {
                                                                                            Pattern pattern3 = LaunchActivity.C1;
                                                                                            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                                                                                            tL_attachMenuBot3.inactive = false;
                                                                                            tL_attachMenuBot3.request_write_access = false;
                                                                                            TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                            int i54 = i48;
                                                                                            tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i54).getInputUser(l22.longValue());
                                                                                            tL_messages_toggleBotInAttachMenu.enabled = true;
                                                                                            tL_messages_toggleBotInAttachMenu.write_allowed = true;
                                                                                            ConnectionsManager.getInstance(i54).sendRequest(tL_messages_toggleBotInAttachMenu, new gi.k2(i54, 5), 66);
                                                                                            LaunchActivity.this.x0(i54, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, z48, num12, l20, l21, num13, str126, hashMap4, str127, str128, str129, str130, tL_wallPaper4, str131, str132, str133, str134, z49, str135, i49, i50, str136, str137, str138, str143, str144, cVar6, z50, i51, i52, i53, z51, str139, user4, b80Var11, z61, true, z52, z53, z54, z55, z56, str140, z57);
                                                                                        }
                                                                                    }, cVar6 != null ? new fz(cVar6, 15) : null);
                                                                                    return;
                                                                                } else {
                                                                                    str112 = str143;
                                                                                    b80Var10 = b80Var11;
                                                                                }
                                                                                if (tL_attachMenuBot2.request_write_access) {
                                                                                    cVar5 = cVar6;
                                                                                    user3 = user4;
                                                                                    str113 = str139;
                                                                                    z47 = z51;
                                                                                    i45 = i53;
                                                                                    i46 = i52;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i47 = i48;
                                                                                } else {
                                                                                    if (!z50) {
                                                                                        launchActivity5.x0(i48, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, z48, num12, l20, l21, num13, str126, hashMap4, str127, str128, str129, str130, tL_wallPaper4, str131, str132, str133, str134, z49, str135, i49, i50, str136, str137, str138, str112, str144, cVar6, z50, i51, i52, i53, z51, str139, user4, b80Var10, false, false, z52, z53, z54, z55, z56, str140, z57);
                                                                                        return;
                                                                                    }
                                                                                    cVar5 = cVar6;
                                                                                    user3 = user4;
                                                                                    str113 = str139;
                                                                                    z47 = z51;
                                                                                    i45 = i53;
                                                                                    i46 = i52;
                                                                                    tL_attachMenuBot = tL_attachMenuBot2;
                                                                                    i47 = i48;
                                                                                }
                                                                                final b80 b80Var12 = b80Var10;
                                                                                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                                                                final TLRPC.User user5 = user3;
                                                                                final int i54 = i47;
                                                                                final pf.c cVar7 = cVar5;
                                                                                org.telegram.ui.Components.f5.m(LaunchActivity.R(), atomicBoolean, user5, new Runnable() { // from class: org.telegram.ui.i90
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        Pattern pattern3 = LaunchActivity.C1;
                                                                                        LaunchActivity launchActivity6 = LaunchActivity.this;
                                                                                        int i55 = launchActivity6.O;
                                                                                        Long l23 = l22;
                                                                                        SharedPrefsHelper.setWebViewConfirmShown(i55, l23.longValue(), true);
                                                                                        TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot;
                                                                                        tL_attachMenuBot3.inactive = false;
                                                                                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                                                                                        tL_attachMenuBot3.request_write_access = !atomicBoolean2.get();
                                                                                        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                                                                                        int i56 = i54;
                                                                                        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i56).getInputUser(l23.longValue());
                                                                                        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean2.get();
                                                                                        ConnectionsManager.getInstance(i56).sendRequest(tL_messages_toggleBotInAttachMenu, new gi.k2(i56, 6), 66);
                                                                                        launchActivity6.x0(i56, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str125, z48, num12, l20, l21, num13, str126, hashMap4, str127, str128, str129, str130, tL_wallPaper4, str131, str132, str133, str134, z49, str135, i49, i50, str136, str137, str138, str112, str144, cVar7, z50, i51, i46, i45, z47, str113, user5, b80Var12, false, false, z52, z53, z54, z55, z56, str140, z57);
                                                                                    }
                                                                                });
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                            return;
                                                        } else {
                                                            str47 = str80;
                                                            str48 = str65;
                                                            num5 = num7;
                                                            str49 = str69;
                                                            i29 = i36;
                                                            str50 = str50;
                                                            i35 = i35;
                                                        }
                                                        launchActivity3.x0(i35, str50, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, str48, z27, num6, l15, l16, num5, str51, hashMap2, str66, str67, str68, str49, tL_wallPaper2, str70, str71, str72, str52, z26, str53, i29, i37, str73, str74, str75, str54, str47, cVar3, z28, i32, i33, i38, z29, str78, user, b80Var8, false, false, z30, z31, z32, z33, z34, str79, z35);
                                                        return;
                                                    }
                                                    str35 = str80;
                                                    str32 = str65;
                                                    num4 = num7;
                                                    str34 = str69;
                                                    i24 = i36;
                                                    i23 = i35;
                                                    launchActivity2 = launchActivity3;
                                                    str33 = str51;
                                                    l12 = l15;
                                                    str36 = str67;
                                                    str37 = str71;
                                                    str38 = str74;
                                                    b80Var4 = b80Var8;
                                                    bArr2 = bArr4;
                                                    l11 = l14;
                                                }
                                            }
                                            if (z29) {
                                                str39 = str56;
                                                str40 = str50;
                                                if (ChatObject.isBoostSupported(MessagesController.getInstance(i23).getChat(Long.valueOf(-l11.longValue())))) {
                                                    launchActivity2.w0(l11, b80Var4, cVar3, null);
                                                    return;
                                                }
                                            } else {
                                                str39 = str56;
                                                str40 = str50;
                                            }
                                            if (str35 != null) {
                                                TLRPC.User user2 = MessagesController.getInstance(i23).getUser(l11);
                                                if (user2 != null && user2.bot) {
                                                    MessagesController.getInstance(i23).openApp(null, user2, str35, 0, cVar3, z30, z31);
                                                }
                                            } else {
                                                if (str73 == null || str38 != null) {
                                                    if (num6 == null || ((num4 == null && l16 == null) || l11.longValue() >= 0)) {
                                                        final int i39 = i23;
                                                        b80Var5 = b80Var4;
                                                        final LaunchActivity launchActivity4 = launchActivity2;
                                                        if (str33 == null) {
                                                            if (str59 == null && str60 == null) {
                                                                Bundle bundle = new Bundle();
                                                                TLRPC.User user3 = MessagesController.getInstance(i39).getUser(l11);
                                                                final String str81 = str33;
                                                                if (l11.longValue() < 0) {
                                                                    final TLRPC.Chat chat2 = MessagesController.getInstance(i39).getChat(Long.valueOf(-l11.longValue()));
                                                                    if (!z35 || chat2.linked_monoforum_id == 0) {
                                                                        l13 = l11;
                                                                        i27 = i39;
                                                                        str41 = str58;
                                                                        str44 = str52;
                                                                        str42 = str53;
                                                                        i25 = i37;
                                                                        str43 = str73;
                                                                        i26 = i38;
                                                                        bArr3 = bArr2;
                                                                        b80Var6 = b80Var5;
                                                                        launchActivity4 = launchActivity4;
                                                                        bundle.putLong("chat_id", -l13.longValue());
                                                                        j10 = l13.longValue();
                                                                    } else {
                                                                        if (MessagesController.getInstance(i39).getChat(Long.valueOf(chat2.linked_monoforum_id)) == null) {
                                                                            TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                                                                            tL_channels_getFullChannel.channel = MessagesController.getInputChannel(chat2);
                                                                            final String str82 = str35;
                                                                            final String str83 = str40;
                                                                            final Long l17 = l12;
                                                                            final String str84 = str36;
                                                                            final String str85 = str38;
                                                                            final String str86 = str32;
                                                                            final int i40 = i24;
                                                                            final String str87 = str39;
                                                                            final String str88 = str37;
                                                                            final String str89 = str34;
                                                                            final Integer num9 = num4;
                                                                            ConnectionsManager.getInstance(i39).sendRequest(tL_channels_getFullChannel, new RequestDelegate() { // from class: org.telegram.ui.r80
                                                                                @Override // org.telegram.tgnet.RequestDelegate
                                                                                public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                                                                                    Pattern pattern = LaunchActivity.C1;
                                                                                    final LaunchActivity launchActivity5 = LaunchActivity.this;
                                                                                    final int i41 = i39;
                                                                                    final TLRPC.Chat chat3 = chat2;
                                                                                    final b80 b80Var9 = b80Var5;
                                                                                    final String str90 = str83;
                                                                                    final String str91 = str55;
                                                                                    final String str92 = str87;
                                                                                    final String str93 = str57;
                                                                                    final String str94 = str58;
                                                                                    final String str95 = str59;
                                                                                    final String str96 = str60;
                                                                                    final String str97 = str61;
                                                                                    final String str98 = str62;
                                                                                    final String str99 = str63;
                                                                                    final String str100 = str64;
                                                                                    final String str101 = str86;
                                                                                    final boolean z36 = z27;
                                                                                    final Integer num10 = num6;
                                                                                    final Long l18 = l17;
                                                                                    final Long l19 = l16;
                                                                                    final Integer num11 = num9;
                                                                                    final String str102 = str81;
                                                                                    final HashMap hashMap3 = hashMap2;
                                                                                    final String str103 = str66;
                                                                                    final String str104 = str84;
                                                                                    final String str105 = str68;
                                                                                    final String str106 = str89;
                                                                                    final TLRPC.TL_wallPaper tL_wallPaper3 = tL_wallPaper2;
                                                                                    final String str107 = str70;
                                                                                    final String str108 = str88;
                                                                                    final String str109 = str72;
                                                                                    final String str110 = str52;
                                                                                    final boolean z37 = z26;
                                                                                    final String str111 = str53;
                                                                                    final int i42 = i40;
                                                                                    final int i43 = i37;
                                                                                    final String str112 = str73;
                                                                                    final String str113 = str85;
                                                                                    final String str114 = str75;
                                                                                    final String str115 = str54;
                                                                                    final String str116 = str82;
                                                                                    final pf.c cVar4 = cVar3;
                                                                                    final boolean z38 = z28;
                                                                                    final int i44 = i32;
                                                                                    final boolean z39 = z25;
                                                                                    final int i45 = i33;
                                                                                    final int i46 = i38;
                                                                                    final String str117 = str76;
                                                                                    final String str118 = str77;
                                                                                    final boolean z40 = z29;
                                                                                    final String str119 = str78;
                                                                                    final boolean z41 = z30;
                                                                                    final boolean z42 = z31;
                                                                                    final boolean z43 = z32;
                                                                                    final boolean z44 = z33;
                                                                                    final boolean z45 = z34;
                                                                                    final String str120 = str79;
                                                                                    final Integer num12 = num8;
                                                                                    final boolean z46 = z35;
                                                                                    final byte[] bArr5 = bArr2;
                                                                                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.z80
                                                                                        @Override // java.lang.Runnable
                                                                                        public final void run() {
                                                                                            Pattern pattern2 = LaunchActivity.C1;
                                                                                            TLObject tLObject2 = tLObject;
                                                                                            boolean z47 = tLObject2 instanceof TLRPC.TL_messages_chatFull;
                                                                                            b80 b80Var10 = b80Var9;
                                                                                            if (!z47) {
                                                                                                try {
                                                                                                    b80Var10.run();
                                                                                                    return;
                                                                                                } catch (Exception e7) {
                                                                                                    FileLog.e(e7);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject2;
                                                                                            int i47 = i41;
                                                                                            MessagesController.getInstance(i47).putUsers(tL_messages_chatFull.users, false);
                                                                                            MessagesController.getInstance(i47).putChats(tL_messages_chatFull.chats, false);
                                                                                            MessagesStorage.getInstance(i47).putUsersAndChats(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
                                                                                            if (MessagesController.getInstance(i47).getChat(Long.valueOf(chat3.linked_monoforum_id)) != null) {
                                                                                                LaunchActivity.this.B0(i47, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, z36, num10, l18, l19, num11, str102, hashMap3, str103, str104, str105, str106, tL_wallPaper3, str107, str108, str109, str110, z37, str111, i42, i43, str112, str113, str114, str115, str116, cVar4, z38, i44, z39, i45, i46, str117, str118, z40, str119, z41, z42, z43, z44, z45, str120, num12, z46, bArr5);
                                                                                                return;
                                                                                            }
                                                                                            try {
                                                                                                b80Var10.run();
                                                                                            } catch (Exception e10) {
                                                                                                FileLog.e(e10);
                                                                                            }
                                                                                        }
                                                                                    });
                                                                                }
                                                                            });
                                                                            return;
                                                                        }
                                                                        l13 = l11;
                                                                        i27 = i39;
                                                                        str44 = str52;
                                                                        str42 = str53;
                                                                        i25 = i37;
                                                                        str43 = str73;
                                                                        i26 = i38;
                                                                        bArr3 = bArr2;
                                                                        b80Var6 = b80Var5;
                                                                        launchActivity4 = launchActivity4;
                                                                        str41 = str58;
                                                                        bundle.putLong("chat_id", chat2.linked_monoforum_id);
                                                                        j10 = -chat2.linked_monoforum_id;
                                                                    }
                                                                } else {
                                                                    l13 = l11;
                                                                    str41 = str58;
                                                                    String str90 = str32;
                                                                    str42 = str53;
                                                                    i25 = i37;
                                                                    str43 = str73;
                                                                    i26 = i38;
                                                                    bArr3 = bArr2;
                                                                    i27 = i39;
                                                                    b80Var6 = b80Var5;
                                                                    str44 = str52;
                                                                    bundle.putLong("user_id", l13.longValue());
                                                                    long longValue3 = l13.longValue();
                                                                    if (str90 != null) {
                                                                        if (str90.startsWith("@")) {
                                                                            str90 = " ".concat(str90);
                                                                        }
                                                                        bundle.putString("start_text", str90);
                                                                    }
                                                                    j10 = longValue3;
                                                                }
                                                                if (str41 == null || user3 == null || !user3.bot) {
                                                                    z21 = false;
                                                                } else {
                                                                    bundle.putString("botUser", str41);
                                                                    z21 = true;
                                                                }
                                                                if (launchActivity4.X0) {
                                                                    launchActivity4.X0 = false;
                                                                    z22 = z21;
                                                                    bundle.putBoolean("premium_bot", true);
                                                                } else {
                                                                    z22 = z21;
                                                                }
                                                                if (num6 != null) {
                                                                    bundle.putInt("message_id", num6.intValue());
                                                                    if (num8 != null) {
                                                                        bundle.putInt("task_id", num8.intValue());
                                                                    }
                                                                    if (bArr3 != null) {
                                                                        bundle.putByteArray("poll_option_id", bArr3);
                                                                    }
                                                                }
                                                                if (str44 != null) {
                                                                    bundle.putString("voicechat", str44);
                                                                }
                                                                byte[] bArr5 = bArr3;
                                                                if (z26) {
                                                                    bundle.putBoolean("videochat", true);
                                                                }
                                                                if (str42 != null) {
                                                                    bundle.putString("livestream", str42);
                                                                }
                                                                if (i25 >= 0) {
                                                                    bundle.putInt("video_timestamp", i25);
                                                                }
                                                                if (str38 != null) {
                                                                    str45 = str38;
                                                                    bundle.putString("attach_bot", str45);
                                                                } else {
                                                                    str45 = str38;
                                                                }
                                                                if (str43 != null) {
                                                                    str46 = str42;
                                                                    bundle.putString("attach_bot_start_command", str43);
                                                                } else {
                                                                    str46 = str42;
                                                                }
                                                                org.telegram.ui.ActionBar.n2 n2Var = (arrayList.isEmpty() || str44 != null) ? null : (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList);
                                                                if (n2Var == null || MessagesController.getInstance(i27).checkCanOpenChat(bundle, n2Var)) {
                                                                    boolean z36 = (n2Var instanceof sn) && ((sn) n2Var).a() == j10;
                                                                    if (z22 && z36) {
                                                                        sn snVar = (sn) n2Var;
                                                                        if (snVar.f8 != 0) {
                                                                            snVar.getMessagesController().sendBotStart(snVar.f, str41);
                                                                        } else {
                                                                            snVar.M6 = true;
                                                                            MessagesController messagesController = snVar.getMessagesController();
                                                                            TLRPC.User user4 = snVar.f;
                                                                            snVar.e8 = str41;
                                                                            messagesController.sendBotStart(user4, str41);
                                                                            snVar.lc(false);
                                                                        }
                                                                    } else {
                                                                        if (str45 == null || !z36) {
                                                                            long j12 = -j10;
                                                                            TLRPC.Chat chat3 = MessagesController.getInstance(launchActivity4.O).getChat(Long.valueOf(j12));
                                                                            if (z33 || i26 > 0) {
                                                                                try {
                                                                                    b80Var6.run();
                                                                                } catch (Exception e7) {
                                                                                    FileLog.e(e7);
                                                                                }
                                                                                if (launchActivity4.isFinishing()) {
                                                                                    return;
                                                                                }
                                                                                Bundle bundle2 = new Bundle();
                                                                                if (l13.longValue() < 0) {
                                                                                    bundle2.putLong("chat_id", -l13.longValue());
                                                                                } else {
                                                                                    bundle2.putLong("user_id", l13.longValue());
                                                                                }
                                                                                if (i26 > 0) {
                                                                                    bundle2.putBoolean("open_gifts", true);
                                                                                    bundle2.putInt("open_gifts_collection", i26);
                                                                                    if (l13.longValue() == UserConfig.getInstance(launchActivity4.O).getClientUserId()) {
                                                                                        bundle2.putBoolean("my_profile", true);
                                                                                    }
                                                                                }
                                                                                ((ActionBarLayout) launchActivity4.O()).P(new ProfileActivity(bundle2, null));
                                                                                return;
                                                                            }
                                                                            if (chat3 == null || !chat3.forum) {
                                                                                LaunchActivity launchActivity5 = launchActivity4;
                                                                                long j13 = j10;
                                                                                MessagesController.getInstance(i27).ensureMessagesLoaded(j13, num6 == null ? 0 : num6.intValue(), new fa0(launchActivity5, b80Var6, str46, n2Var, j13, num6, bundle));
                                                                                return;
                                                                            }
                                                                            Long valueOf = (l16 != null || num6 == null) ? l16 : Long.valueOf(num6.intValue());
                                                                            if (valueOf != null && valueOf.longValue() != 0) {
                                                                                launchActivity4.l0(j10, num6, null, num8, bArr5, new s80(b80Var6, 0), 0, -1);
                                                                                return;
                                                                            }
                                                                            LaunchActivity launchActivity6 = launchActivity4;
                                                                            Bundle a2 = z7.g5.a(j12, "chat_id");
                                                                            if (str44 != null) {
                                                                                a2.putString("voicechat", str44);
                                                                            }
                                                                            if (z26) {
                                                                                a2.putBoolean("videochat", true);
                                                                            }
                                                                            launchActivity6.t0(te1.F0(launchActivity6, a2));
                                                                            try {
                                                                                b80Var6.run();
                                                                                return;
                                                                            } catch (Exception e10) {
                                                                                FileLog.e(e10);
                                                                                return;
                                                                            }
                                                                        }
                                                                        sn snVar2 = (sn) n2Var;
                                                                        snVar2.getClass();
                                                                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                                                                        tL_contacts_resolveUsername.username = str45;
                                                                        snVar2.getConnectionsManager().sendRequest(tL_contacts_resolveUsername, new pe(snVar2, 0));
                                                                    }
                                                                }
                                                                b80Var8 = b80Var6;
                                                            } else {
                                                                b80Var8 = b80Var5;
                                                                TLRPC.User user5 = MessagesController.getInstance(i39).getUser(l11);
                                                                if (user5 == null || (user5.bot && user5.bot_nochats)) {
                                                                    try {
                                                                        if (arrayList.isEmpty()) {
                                                                            return;
                                                                        }
                                                                        org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) arrayList.get(arrayList.size() - 1)).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                                                        return;
                                                                    } catch (Exception e11) {
                                                                        FileLog.e(e11);
                                                                        return;
                                                                    }
                                                                }
                                                                Bundle d = org.telegram.messenger.wh.d(2, "onlySelect", "dialogsType", true);
                                                                d.putBoolean("resetDelegate", false);
                                                                d.putBoolean("closeFragment", false);
                                                                d.putBoolean("allowGroups", str59 != null);
                                                                d.putBoolean("allowChannels", str60 != null);
                                                                String str91 = TextUtils.isEmpty(str59) ? TextUtils.isEmpty(str60) ? null : str60 : str59;
                                                                ey eyVar = new ey(d);
                                                                eyVar.C2 = new ig.k1(launchActivity4, i39, user5, str61, str91, eyVar);
                                                                launchActivity4.t0(eyVar);
                                                            }
                                                            b80Var8.run();
                                                            return;
                                                        }
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putBoolean("onlySelect", true);
                                                        bundle3.putBoolean("cantSendToChannels", true);
                                                        bundle3.putInt("dialogsType", 1);
                                                        bundle3.putString("selectAlertString", LocaleController.getString(R.string.SendGameToText));
                                                        bundle3.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendGameToGroupText));
                                                        ey eyVar2 = new ey(bundle3);
                                                        eyVar2.C2 = new q80(launchActivity4, str33, i39, MessagesController.getInstance(i39).getUser(l11));
                                                        if (AndroidUtilities.isTablet()) {
                                                            z24 = !launchActivity4.r0.getFragmentStack().isEmpty() && (launchActivity4.r0.getFragmentStack().get(launchActivity4.r0.getFragmentStack().size() + (-1)) instanceof pg0);
                                                            z23 = true;
                                                        } else {
                                                            z23 = true;
                                                            z24 = launchActivity4.q0.getFragmentStack().size() > 1 && (launchActivity4.q0.getFragmentStack().get(launchActivity4.q0.getFragmentStack().size() - 1) instanceof pg0);
                                                        }
                                                        ((ActionBarLayout) launchActivity4.O()).S(eyVar2, z24, z23);
                                                        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                                                            SecretMediaViewer.f().e(false, false);
                                                        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                                                            PhotoViewer.t1().G0(false, true);
                                                        } else if (l4.I() && l4.x().V) {
                                                            l4.x().o(false, true);
                                                        }
                                                        ei.vb.w();
                                                        s50 s50Var = s50.D3;
                                                        if (s50Var != null) {
                                                            s50Var.dismiss();
                                                        }
                                                        if (AndroidUtilities.isTablet()) {
                                                            launchActivity4.q0.U(true, true);
                                                            launchActivity4.s0.U(true, true);
                                                        }
                                                    } else {
                                                        b80 b80Var9 = b80Var4;
                                                        int z02 = launchActivity2.z0(i23, b80Var9, num6, num4, l16, null, null, MessagesController.getInstance(i23).getChat(Long.valueOf(-l11.longValue())), null, null, 0, -1);
                                                        b80Var5 = b80Var9;
                                                        iArr2[0] = z02;
                                                        if (z02 != 0) {
                                                            return;
                                                        }
                                                    }
                                                    b80Var8 = b80Var5;
                                                    b80Var8.run();
                                                    return;
                                                }
                                                TLRPC.User user6 = MessagesController.getInstance(i23).getUser(l11);
                                                if (user6 == null || !user6.bot) {
                                                    d6Var = null;
                                                    a02 = org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList));
                                                    i28 = R.string.BotSetAttachLinkNotBot;
                                                } else if (user6.bot_attach_menu) {
                                                    long longValue4 = l11.longValue();
                                                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot2 = new TLRPC.TL_messages_getAttachMenuBot();
                                                    tL_messages_getAttachMenuBot2.bot = MessagesController.getInstance(i23).getInputUser(longValue4);
                                                    ConnectionsManager.getInstance(i23).sendRequest(tL_messages_getAttachMenuBot2, new gi.z0(launchActivity2, i23, str35, str75, user6, str73, longValue4));
                                                } else {
                                                    a02 = org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList));
                                                    i28 = R.string.BotCantAddToAttachMenu;
                                                    d6Var = null;
                                                }
                                                org.telegram.messenger.wh.q(i28, a02, d6Var);
                                            }
                                            b80Var8 = b80Var4;
                                            b80Var8.run();
                                            return;
                                        }
                                    }
                                    b80Var8.run();
                                    return;
                                } catch (Exception e12) {
                                    FileLog.e(e12);
                                    return;
                                }
                                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                if (R != null) {
                                    if (R instanceof sn) {
                                        ((sn) R).ub();
                                    }
                                    if (AndroidUtilities.isNumeric(str50)) {
                                        org.telegram.ui.Components.xc.a0(R).t(LocaleController.getString(R.string.NoPhoneFound), null).j();
                                    } else {
                                        org.telegram.ui.Components.xc.a0(R).t(LocaleController.getString(R.string.NoUsernameFound), null).j();
                                    }
                                }
                            }
                        };
                        cVar2 = cVar2;
                        userNameResolver.resolve(str, str31, callback);
                        iArr = iArr2;
                        b2Var = b2Var4;
                        i16 = 0;
                    } else {
                        String str32 = str3;
                        if (str2 == null) {
                            b80Var = null;
                            ArrayList arrayList = this.d0;
                            if (str32 != null) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                                tL_inputStickerSetShortName.short_name = str32;
                                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList);
                                if (n2Var instanceof sn) {
                                    sn snVar = (sn) n2Var;
                                    oy0Var = new org.telegram.ui.Components.oy0(this, n2Var, tL_inputStickerSetShortName, null, (snVar.O0.getVisibility() == 0 || !((chat = snVar.e) == null || ChatObject.canSendStickers(chat))) ? null : snVar.Y, snVar.getResourceProvider());
                                    oy0Var.setCalcMandatoryInsets(snVar.C9());
                                } else {
                                    oy0Var = new org.telegram.ui.Components.oy0(this, n2Var, tL_inputStickerSetShortName, null, null, null);
                                }
                                oy0Var.Q = str4 != null;
                                n2Var.showDialog(oy0Var);
                                return;
                            }
                            if (str4 != null) {
                                if (arrayList.isEmpty()) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
                                if (str32 == null) {
                                    str32 = str4;
                                }
                                tL_inputStickerSetShortName2.short_name = str32;
                                ArrayList arrayList2 = new ArrayList(1);
                                arrayList2.add(tL_inputStickerSetShortName2);
                                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList);
                                if (n2Var2 instanceof sn) {
                                    sn snVar2 = (sn) n2Var2;
                                    awVar = new org.telegram.ui.Components.aw(n2Var2, this, snVar2.getResourceProvider(), arrayList2);
                                    awVar.setCalcMandatoryInsets(snVar2.C9());
                                } else {
                                    awVar = new org.telegram.ui.Components.aw(n2Var2, this, null, arrayList2);
                                }
                                n2Var2.showDialog(awVar);
                                return;
                            }
                            if (str9 != null) {
                                ey eyVar = new ey(org.telegram.messenger.wh.d(3, "onlySelect", "dialogsType", true));
                                i17 = i10;
                                eyVar.C2 = new qg(this, z10, i17, str9);
                                i16 = 0;
                                u0(eyVar, false, true);
                            } else {
                                i16 = 0;
                                if (hashMap != null) {
                                    long longValue = Utilities.parseLong((String) hashMap.get("bot_id")).longValue();
                                    if (longValue == 0) {
                                        return;
                                    }
                                    String str33 = (String) hashMap.get("payload");
                                    String str34 = (String) hashMap.get("nonce");
                                    String str35 = (String) hashMap.get("callback_url");
                                    TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
                                    getauthorizationform.bot_id = longValue;
                                    getauthorizationform.scope = (String) hashMap.get("scope");
                                    getauthorizationform.public_key = (String) hashMap.get("public_key");
                                    iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new t80(this, iArr2, i10, b80Var3, getauthorizationform, str33, str34, str35, 1));
                                } else if (str15 != null) {
                                    TLRPC.TL_help_getDeepLinkInfo tL_help_getDeepLinkInfo = new TLRPC.TL_help_getDeepLinkInfo();
                                    tL_help_getDeepLinkInfo.path = str15;
                                    iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(tL_help_getDeepLinkInfo, new RequestDelegate(this) { // from class: org.telegram.ui.x90
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (i16) {
                                                case 0:
                                                    Pattern pattern = LaunchActivity.C1;
                                                    AndroidUtilities.runOnUIThread(new lq(this.b, b80Var3, tLObject, 14));
                                                    break;
                                                default:
                                                    Pattern pattern2 = LaunchActivity.C1;
                                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((KeyEvent.Callback) this.b, (Object) b80Var3, tLObject, tL_error, 17));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (str14 != null) {
                                    TLRPC.TL_langpack_getLanguage tL_langpack_getLanguage = new TLRPC.TL_langpack_getLanguage();
                                    tL_langpack_getLanguage.lang_code = str14;
                                    tL_langpack_getLanguage.lang_pack = "android";
                                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(this.O);
                                    final char c13 = c10 == true ? 1 : 0;
                                    iArr2[0] = connectionsManager.sendRequest(tL_langpack_getLanguage, new RequestDelegate(this) { // from class: org.telegram.ui.x90
                                        public final /* synthetic */ LaunchActivity b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // org.telegram.tgnet.RequestDelegate
                                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                            switch (c13) {
                                                case 0:
                                                    Pattern pattern = LaunchActivity.C1;
                                                    AndroidUtilities.runOnUIThread(new lq(this.b, b80Var3, tLObject, 14));
                                                    break;
                                                default:
                                                    Pattern pattern2 = LaunchActivity.C1;
                                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90((KeyEvent.Callback) this.b, (Object) b80Var3, tLObject, tL_error, 17));
                                                    break;
                                            }
                                        }
                                    });
                                } else if (tL_wallPaper != null) {
                                    if (TextUtils.isEmpty(tL_wallPaper.slug)) {
                                        try {
                                            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                                            int i23 = wallPaperSettings.third_background_color;
                                            AndroidUtilities.runOnUIThread(new b80(8, this, new mc1(i23 != 0 ? new uh1("c", wallPaperSettings.background_color, wallPaperSettings.second_background_color, i23, wallPaperSettings.fourth_background_color) : new uh1(wallPaperSettings.background_color, wallPaperSettings.second_background_color, "c", AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false)), null, true)));
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                                    tL_inputWallPaperSlug.slug = tL_wallPaper.slug;
                                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                                    iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(getwallpaper, new ea(this, b80Var3, tL_wallPaper, 16));
                                } else {
                                    if (str20 != null) {
                                        b80Var2 = new b80(9, this, cVar2);
                                        TL_account.getTheme gettheme = new TL_account.getTheme();
                                        gettheme.format = "android";
                                        TLRPC.TL_inputThemeSlug tL_inputThemeSlug = new TLRPC.TL_inputThemeSlug();
                                        tL_inputThemeSlug.slug = str20;
                                        gettheme.theme = tL_inputThemeSlug;
                                        b2Var = b2Var4;
                                        iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(gettheme, new ea(this, b2Var, b80Var3, 17));
                                        i17 = i10;
                                        iArr = iArr2;
                                        if (iArr[i16] != 0) {
                                            b2Var.setOnCancelListener(new org.telegram.ui.Components.z1(i17, iArr, b80Var2));
                                            if (cVar2 != null) {
                                                cVar2.b = new org.telegram.ui.Components.e3(i17, iArr, b80Var2);
                                            }
                                            try {
                                                if (cVar2 != null) {
                                                    cVar2.d();
                                                } else {
                                                    b2Var.q(300L);
                                                }
                                                return;
                                            } catch (Exception unused) {
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    b2Var = b2Var4;
                                    if (l4 == null || (num == null && !z14)) {
                                        i17 = i10;
                                        iArr = iArr2;
                                        if (str30 != null) {
                                            TL_account.resolveBusinessChatLink resolvebusinesschatlink = new TL_account.resolveBusinessChatLink();
                                            resolvebusinesschatlink.slug = str30;
                                            ConnectionsManager.getInstance(this.O).sendRequest(resolvebusinesschatlink, new q90(this, 1));
                                        }
                                    } else {
                                        if (l10 != null) {
                                            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(l4);
                                            if (chat2 != null) {
                                                iArr2[0] = z0(i10, b80Var3, num, num2, l10, num3, null, chat2, null, null, 0, -1);
                                            } else {
                                                TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                                                TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                                                tL_inputChannel.channel_id = l4.longValue();
                                                tL_channels_getChannels.id.add(tL_inputChannel);
                                                iArr2[0] = ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getChannels, new t80(this, iArr2, i10, b80Var3, num, num2, l10, num3, 2));
                                            }
                                        } else {
                                            Bundle bundle = new Bundle();
                                            bundle.putLong("chat_id", l4.longValue());
                                            if (num != null) {
                                                bundle.putInt("message_id", num.intValue());
                                            }
                                            if (num3 != null) {
                                                bundle.putInt("task_id", num3.intValue());
                                            }
                                            if (bArr != null) {
                                                bundle.putByteArray("poll_option_id", bArr);
                                            }
                                            TLRPC.Chat chat3 = MessagesController.getInstance(this.O).getChat(l4);
                                            if (chat3 != null && ChatObject.isBoostSupported(chat3) && z14) {
                                                w0(Long.valueOf(-l4.longValue()), b80Var3, cVar2, null);
                                            } else if (chat3 == null || !chat3.forum) {
                                                org.telegram.ui.ActionBar.n2 n2Var3 = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList) : null;
                                                if (n2Var3 == null || MessagesController.getInstance(i10).checkCanOpenChat(bundle, n2Var3)) {
                                                    iArr = iArr2;
                                                    i17 = i10;
                                                    AndroidUtilities.runOnUIThread(new b90(this, bundle, l4, iArr2, b80Var3, z14, cVar2, l10, num, num3, bArr, n2Var3, i10));
                                                }
                                            } else {
                                                l0(-l4.longValue(), num, null, num3, bArr, new s80(b80Var3, 2), 0, -1);
                                            }
                                        }
                                        i17 = i10;
                                        iArr = iArr2;
                                    }
                                }
                                i17 = i10;
                            }
                            iArr = iArr2;
                            b2Var = b2Var4;
                        } else if (i11 == 0) {
                            TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                            tL_messages_checkChatInvite.hash = str2;
                            iArr2[0] = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.rb(this, i10, b2Var4, b80Var3, str2, 12), 2);
                            i17 = i10;
                            iArr = iArr2;
                            b2Var = b2Var4;
                            i16 = 0;
                        } else {
                            if (i11 == 1) {
                                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                                tL_messages_importChatInvite.hash = str2;
                                b80Var = null;
                                ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_importChatInvite, null, new eg(this, b80Var3, i10), 2);
                            } else {
                                b80Var = null;
                            }
                            i17 = i10;
                            iArr = iArr2;
                            b2Var = b2Var4;
                            i16 = 0;
                        }
                        b80Var2 = b80Var;
                        if (iArr[i16] != 0) {
                        }
                    }
                    b80Var = null;
                    b80Var2 = b80Var;
                    if (iArr[i16] != 0) {
                    }
                }
            }
            i17 = i10;
            i16 = 0;
            b2Var = b2Var4;
            iArr = iArr2;
            b80Var = null;
            b80Var2 = b80Var;
            if (iArr[i16] != 0) {
            }
        }
        i17 = i10;
        i16 = 0;
        b2Var = b2Var4;
        iArr = iArr2;
        b80Var = null;
        b80Var2 = b80Var;
        if (iArr[i16] != 0) {
        }
    }

    public final void C(int i10) {
        K1 = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT < 26 || i10 != 0) && !this.w1) {
            Utilities.globalQueue.postRunnable(new e80(this, i10, 0), 2000L);
        }
    }

    @Override // org.telegram.ui.xx
    public final boolean D() {
        ArrayList arrayList = this.U;
        return (arrayList != null && arrayList.size() == 1) || this.R != null;
    }

    public final void D0(int i10) {
        this.z0.setInternalNavigationBarColor(i10);
        org.telegram.ui.ActionBar.n3 P = P();
        if (P != null) {
            P.setNavigationBarColor(i10);
        }
    }

    public final void E0() {
        org.telegram.ui.ActionBar.y3 y3Var;
        ViewGroup view;
        if (this.z0.indexOfChild(this.t0) != -1) {
            y3Var = this.z0;
            view = this.t0;
        } else {
            y3Var = this.z0;
            view = this.q0.getView();
        }
        int indexOfChild = y3Var.indexOfChild(view);
        if (indexOfChild != -1) {
            this.z0.removeViewAt(indexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            ba0 ba0Var = new ba0(this, this);
            this.t0 = ba0Var;
            if (indexOfChild != -1) {
                this.z0.addView(ba0Var, indexOfChild, w7.z5.d(-1.0f, -1));
            } else {
                this.z0.addView(ba0Var, w7.z5.d(-1.0f, -1));
            }
            ig.n1 n1Var = new ig.n1(this, null, 5);
            this.v0 = n1Var;
            n1Var.setOccupyStatusBar(false);
            this.v0.V(org.telegram.ui.ActionBar.h6.s0());
            this.t0.addView(this.v0, w7.z5.w(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.q0.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.q0.getView());
            }
            this.t0.addView(this.q0.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.s0 = actionBarLayout;
            actionBarLayout.N0 = true;
            actionBarLayout.setFragmentStack(this.f0);
            this.s0.setDelegate(this);
            this.t0.addView(this.s0.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.u0 = frameLayout;
            ArrayList arrayList = this.e0;
            frameLayout.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.u0.setBackgroundColor(1056964608);
            this.t0.addView(this.u0);
            this.u0.setOnTouchListener(new e0(this, 3));
            this.u0.setOnClickListener(new ah.f(21));
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.r0 = actionBarLayout2;
            actionBarLayout2.M0 = true;
            actionBarLayout2.setRemoveActionBarExtraHeight(true);
            this.r0.setBackgroundView(this.u0);
            this.r0.setUseAlphaAnimations(true);
            this.r0.setFragmentStack(arrayList);
            this.r0.setDelegate(this);
            this.r0.setDrawerLayoutContainer(this.z0);
            ViewGroup view2 = this.r0.getView();
            view2.setVisibility(arrayList.isEmpty() ? 8 : 0);
            this.t0.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.q0.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.q0.getView());
            }
            this.q0.setFragmentStack(this.d0);
            if (indexOfChild != -1) {
                this.z0.addView(this.q0.getView(), indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.z0.addView(this.q0.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        w7.d0.a(this, SharedConfig.isFloatingDebugActive, false);
    }

    public final void F() {
        if (!AndroidUtilities.isTablet() || this.s0 == null) {
            return;
        }
        if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
            if (AndroidUtilities.isInMultiwindow || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
                this.O0 = true;
                List<org.telegram.ui.ActionBar.n2> fragmentStack = this.s0.getFragmentStack();
                if (!fragmentStack.isEmpty()) {
                    while (fragmentStack.size() > 0) {
                        org.telegram.ui.ActionBar.n2 n2Var = fragmentStack.get(0);
                        if (n2Var instanceof sn) {
                            ((sn) n2Var).Y4 = true;
                        }
                        n2Var.onPause();
                        n2Var.onFragmentDestroy();
                        n2Var.setParentLayout(null);
                        fragmentStack.remove(n2Var);
                        this.q0.c(-1, n2Var);
                    }
                    org.telegram.ui.Components.ne0 ne0Var = this.A0;
                    if (ne0Var == null || ne0Var.b.getVisibility() != 0) {
                        this.q0.U(true, true);
                    }
                }
                this.s0.getView().setVisibility(8);
                this.v0.setVisibility(this.q0.getFragmentStack().isEmpty() ? 0 : 8);
                return;
            }
            this.O0 = false;
            List<org.telegram.ui.ActionBar.n2> fragmentStack2 = this.q0.getFragmentStack();
            if (fragmentStack2.size() >= 2) {
                while (1 < fragmentStack2.size()) {
                    org.telegram.ui.ActionBar.n2 n2Var2 = fragmentStack2.get(1);
                    if (n2Var2 instanceof sn) {
                        ((sn) n2Var2).Y4 = true;
                    }
                    n2Var2.onPause();
                    n2Var2.onFragmentDestroy();
                    n2Var2.setParentLayout(null);
                    fragmentStack2.remove(n2Var2);
                    this.s0.c(-1, n2Var2);
                }
                org.telegram.ui.Components.ne0 ne0Var2 = this.A0;
                if (ne0Var2 == null || ne0Var2.b.getVisibility() != 0) {
                    this.q0.U(true, true);
                    this.s0.U(true, true);
                }
            }
            this.s0.getView().setVisibility(this.s0.getFragmentStack().isEmpty() ? 8 : 0);
            this.v0.setVisibility(this.s0.getFragmentStack().isEmpty() ? 0 : 8);
        }
    }

    public final org.telegram.ui.ActionBar.b2 F0(AlertDialog$Builder alertDialog$Builder) {
        try {
            org.telegram.ui.ActionBar.b2 o10 = alertDialog$Builder.o();
            o10.setCanceledOnTouchOutside(true);
            o10.setOnDismissListener(new ai.v3(11, this, o10));
            this.E0.add(o10);
            return o10;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public final void G(boolean z10) {
        H(z10, true, !this.W0);
    }

    public final void H(boolean z10, boolean z11, boolean z12) {
        qn qnVar;
        boolean z13;
        ArrayList arrayList = this.d0;
        boolean z14 = true;
        org.telegram.ui.ActionBar.n2 n2Var = !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList) : null;
        char c10 = 2;
        if (n2Var != null && (n2Var.isRemovingFromStack() || n2Var.isInPreviewMode())) {
            n2Var = arrayList.size() > 1 ? (org.telegram.ui.ActionBar.n2) i0.a.h(2, arrayList) : null;
        }
        if (n2Var != null) {
            n2Var.hasForceLightStatusBar();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (z11) {
            if (n2Var != null) {
                z13 = n2Var.isLightStatusBar();
                if (n2Var.getParentLayout() instanceof ActionBarLayout) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) n2Var.getParentLayout();
                    if (actionBarLayout.w() == null || actionBarLayout.w().getLastSheet() == null) {
                        ArrayList<org.telegram.ui.ActionBar.j2> arrayList2 = n2Var.sheetsStack;
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            org.telegram.ui.ActionBar.j2 j2Var = (org.telegram.ui.ActionBar.j2) i0.a.h(1, n2Var.sheetsStack);
                            if (j2Var.isShown()) {
                                z13 = j2Var.isAttachedLightStatusBar();
                            }
                        }
                    } else {
                        org.telegram.ui.ActionBar.j2 lastSheet = actionBarLayout.w().getLastSheet();
                        if (lastSheet.isShown()) {
                            z13 = lastSheet.isAttachedLightStatusBar();
                        }
                    }
                }
            } else {
                z13 = i0.b.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.s8, true)) > 0.699999988079071d;
            }
            AndroidUtilities.setLightStatusBar(this, z13);
        }
        if (i10 >= 26 && z12 && (!z10 || n2Var == null || !n2Var.isInPreviewMode())) {
            int x02 = (n2Var == null || !z10) ? org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.a7, true) : n2Var.getNavigationBarColor();
            if (n2Var instanceof sn) {
                sn snVar = (sn) n2Var;
                if (!snVar.Eb || (snVar.v.s != 1 && ((qnVar = snVar.ea) == null || !qnVar.G))) {
                    c10 = 1;
                }
            } else {
                c10 = 0;
            }
            if (P() != null && P().H > 0) {
                c10 = 0;
            }
            if (this.q0.w() != null) {
                ry w9 = this.q0.w();
                if (w9.sheetsStack != null) {
                    for (int i11 = 0; i11 < w9.sheetsStack.size(); i11++) {
                        org.telegram.ui.ActionBar.j2 j2Var2 = w9.sheetsStack.get(i11);
                        if (j2Var2.attachedToParent()) {
                            x02 = j2Var2.getNavigationBarColor(x02);
                            c10 = 0;
                        }
                    }
                }
            }
            Iterator it = gi.d3.W0.iterator();
            while (it.hasNext()) {
                x02 = ((gi.d3) it.next()).getNavigationBarColor(x02);
                c10 = 0;
            }
            D0(x02);
            if ((c10 != 0 || AndroidUtilities.computePerceivedBrightness(x02) < 0.721f) && c10 != 1) {
                z14 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z14);
        }
        if (z11) {
            getWindow().setStatusBarColor(0);
        }
    }

    public final void H0(p.a aVar) {
        org.telegram.ui.ActionBar.n2 n2Var;
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = this.f0;
            if (arrayList2.isEmpty()) {
                ArrayList arrayList3 = this.d0;
                n2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList3) : null;
            } else {
                n2Var = (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList2);
            }
        } else {
            n2Var = (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList);
        }
        if (org.telegram.ui.Components.xc.a(n2Var)) {
            aVar.c(org.telegram.ui.Components.xc.a0(n2Var)).j();
        }
    }

    public final void I(boolean z10) {
        ChatObject.Call call;
        long j10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z11 = false;
        if (sharedInstance == null || (call = sharedInstance.groupCall) == null) {
            this.l0 = false;
            return;
        }
        boolean z12 = this.l0;
        TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
        if (groupCallPeer != null) {
            j10 = groupCallPeer.user_id;
            if (j10 == 0) {
                long j11 = groupCallPeer.chat_id;
                if (j11 == 0) {
                    j11 = groupCallPeer.channel_id;
                }
                j10 = -j11;
            }
        } else {
            j10 = UserConfig.getInstance(this.O).clientUserId;
        }
        TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.f(j10);
        boolean z13 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
        if (z13 && groupCallParticipant.raise_hand_rating != 0) {
            z11 = true;
        }
        this.l0 = z11;
        if (z10 || !z12 || z11 || z13 || s50.D3 != null) {
            return;
        }
        N0(38);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v6 */
    public final void I0() {
        ?? r16;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.O).isClientActivated()) {
            try {
                if (!this.I0 && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str = MessagesController.getInstance(this.O).suggestedLangCode;
                    if (string.equals(str)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("alert already showed for ".concat(string));
                            return;
                        }
                        return;
                    }
                    final LocaleController.LocaleInfo[] localeInfoArr = new LocaleController.LocaleInfo[2];
                    boolean z10 = false;
                    String str2 = str.contains("-") ? str.split("-")[0] : str;
                    String str3 = "in".equals(str2) ? "id" : "iw".equals(str2) ? "he" : "jw".equals(str2) ? "jv" : null;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= LocaleController.getInstance().languages.size()) {
                            r16 = z10;
                            break;
                        }
                        LocaleController.LocaleInfo localeInfo2 = LocaleController.getInstance().languages.get(i10);
                        boolean z11 = z10;
                        if (localeInfo2.shortName.equals("en")) {
                            localeInfoArr[z11 ? 1 : 0] = localeInfo2;
                        }
                        if (localeInfo2.shortName.replace("_", "-").equals(str) || localeInfo2.shortName.equals(str2) || localeInfo2.shortName.equals(str3)) {
                            localeInfoArr[1] = localeInfo2;
                        }
                        if (localeInfoArr[z11 ? 1 : 0] != null && localeInfoArr[1] != null) {
                            r16 = z11;
                            break;
                        } else {
                            i10++;
                            z10 = z11 ? 1 : 0;
                        }
                    }
                    LocaleController.LocaleInfo localeInfo3 = localeInfoArr[r16];
                    if (localeInfo3 != null && (localeInfo = localeInfoArr[1]) != null && localeInfo3 != localeInfo) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("show lang alert for " + localeInfoArr[r16].getKey() + " and " + localeInfoArr[1].getKey());
                        }
                        this.J0 = null;
                        this.K0 = null;
                        this.I0 = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = localeInfoArr[1].getLangCode();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        final int i11 = 0;
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings, new RequestDelegate(this) { // from class: org.telegram.ui.r90
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i12 = 0;
                                switch (i11) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i12 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i12);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i12++;
                                            }
                                        }
                                        final int i13 = 1;
                                        final LaunchActivity launchActivity = this.b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.g80
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity2 = launchActivity;
                                                        HashMap hashMap2 = hashMap;
                                                        launchActivity2.K0 = hashMap2;
                                                        if (hashMap2 != null && launchActivity2.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr2;
                                                            launchActivity2.J0(localeInfoArr3[1], localeInfoArr3[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        Pattern pattern2 = LaunchActivity.C1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i12 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i12);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i12++;
                                            }
                                        }
                                        final int i14 = 0;
                                        final LaunchActivity launchActivity2 = this.b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.g80
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i14) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (hashMap22 != null && launchActivity22.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.J0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        }, 8);
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings2 = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings2.lang_code = localeInfoArr[r16].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        final int i12 = 1;
                        ConnectionsManager.getInstance(this.O).sendRequest(tL_langpack_getStrings2, new RequestDelegate(this) { // from class: org.telegram.ui.r90
                            public final /* synthetic */ LaunchActivity b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                int i122 = 0;
                                switch (i12) {
                                    case 0:
                                        Pattern pattern = LaunchActivity.C1;
                                        final HashMap hashMap = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector = (Vector) tLObject;
                                            while (i122 < vector.objects.size()) {
                                                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i122);
                                                hashMap.put(langPackString.key, langPackString.value);
                                                i122++;
                                            }
                                        }
                                        final int i13 = 1;
                                        final LaunchActivity launchActivity = this.b;
                                        final LocaleController.LocaleInfo[] localeInfoArr2 = localeInfoArr;
                                        final String str4 = str;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.g80
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i13) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity;
                                                        HashMap hashMap22 = hashMap;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (hashMap22 != null && launchActivity22.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr2;
                                                            launchActivity22.J0(localeInfoArr32[1], localeInfoArr32[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity;
                                                        HashMap hashMap3 = hashMap;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr2;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str4);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        Pattern pattern2 = LaunchActivity.C1;
                                        final HashMap hashMap2 = new HashMap();
                                        if (tLObject instanceof Vector) {
                                            Vector vector2 = (Vector) tLObject;
                                            while (i122 < vector2.objects.size()) {
                                                TLRPC.LangPackString langPackString2 = (TLRPC.LangPackString) vector2.objects.get(i122);
                                                hashMap2.put(langPackString2.key, langPackString2.value);
                                                i122++;
                                            }
                                        }
                                        final int i14 = 0;
                                        final LaunchActivity launchActivity2 = this.b;
                                        final LocaleController.LocaleInfo[] localeInfoArr3 = localeInfoArr;
                                        final String str5 = str;
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.g80
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i14) {
                                                    case 0:
                                                        LaunchActivity launchActivity22 = launchActivity2;
                                                        HashMap hashMap22 = hashMap2;
                                                        launchActivity22.K0 = hashMap22;
                                                        if (hashMap22 != null && launchActivity22.J0 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr32 = localeInfoArr3;
                                                            launchActivity22.J0(localeInfoArr32[1], localeInfoArr32[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                    default:
                                                        LaunchActivity launchActivity3 = launchActivity2;
                                                        HashMap hashMap3 = hashMap2;
                                                        launchActivity3.J0 = hashMap3;
                                                        if (launchActivity3.K0 != null && hashMap3 != null) {
                                                            LocaleController.LocaleInfo[] localeInfoArr4 = localeInfoArr3;
                                                            launchActivity3.J0(localeInfoArr4[1], localeInfoArr4[0], str5);
                                                            break;
                                                        }
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        }, 8);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void J() {
        ArrayList arrayList = this.d0;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ((org.telegram.ui.ActionBar.n2) obj).onFragmentDestroy();
        }
        arrayList.clear();
        if (AndroidUtilities.isTablet()) {
            ArrayList arrayList2 = this.e0;
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList2.get(i12);
                i12++;
                ((org.telegram.ui.ActionBar.n2) obj2).onFragmentDestroy();
            }
            arrayList2.clear();
            ArrayList arrayList3 = this.f0;
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                ((org.telegram.ui.ActionBar.n2) obj3).onFragmentDestroy();
            }
            arrayList3.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: Exception -> 0x001d, TryCatch #0 {Exception -> 0x001d, blocks: (B:3:0x0007, B:5:0x0010, B:9:0x0021, B:14:0x005d, B:17:0x0068, B:20:0x0070, B:23:0x0082, B:26:0x008b, B:30:0x00bb, B:33:0x0089, B:36:0x00de), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J0(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, String str) {
        boolean z10;
        int i10;
        int i11;
        try {
            this.I0 = false;
            LocaleController.LocaleInfo localeInfo3 = localeInfo;
            if (!localeInfo3.builtIn && !LocaleController.getInstance().isCurrentLocalLocale()) {
                z10 = false;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = V(R.string.ChooseYourLanguage, "ChooseYourLanguage", this.J0);
                b2Var.S = V(R.string.ChooseYourLanguage, "ChooseYourLanguage", this.K0);
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.p4[] p4VarArr = new org.telegram.ui.Cells.p4[2];
                String V = V(R.string.English, "English", this.J0);
                LocaleController.LocaleInfo[] localeInfoArr = {!z10 ? localeInfo3 : localeInfo2, !z10 ? localeInfo2 : localeInfo3};
                if (z10) {
                    localeInfo3 = localeInfo2;
                }
                LocaleController.LocaleInfo[] localeInfoArr2 = {localeInfo3};
                i11 = 0;
                for (i10 = 2; i11 < i10; i10 = 2) {
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(this);
                    p4VarArr[i11] = p4Var;
                    LocaleController.LocaleInfo localeInfo4 = localeInfoArr[i11];
                    String str2 = localeInfo4 == localeInfo2 ? V : null;
                    p4Var.b.setText(str2 != null ? str2 : localeInfo4.name);
                    p4Var.c.setText(localeInfo4.nameEnglish);
                    p4Var.e = localeInfo4;
                    p4Var.d = true;
                    p4VarArr[i11].setTag(Integer.valueOf(i11));
                    p4VarArr[i11].setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 2, -1));
                    p4VarArr[i11].a.a(i11 == 0, false);
                    linearLayout.addView(p4VarArr[i11], w7.z5.n(-1, 50));
                    p4VarArr[i11].setOnClickListener(new org.telegram.ui.Components.g51(23, localeInfoArr2, p4VarArr));
                    i11++;
                }
                org.telegram.ui.Cells.p4 p4Var2 = new org.telegram.ui.Cells.p4(this);
                String V2 = V(R.string.ChooseYourLanguageOther, "ChooseYourLanguageOther", this.J0);
                String V3 = V(R.string.ChooseYourLanguageOther, "ChooseYourLanguageOther", this.K0);
                p4Var2.b.setText(V2);
                p4Var2.c.setText(V3);
                p4Var2.a.a(false, false);
                p4Var2.e = null;
                p4Var2.d = false;
                p4Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 2, -1));
                p4Var2.setOnClickListener(new y50(this, 4));
                linearLayout.addView(p4Var2, w7.z5.n(-1, 50));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), new ov(12, this, localeInfoArr2));
                this.H0 = F0(alertDialog$Builder);
                MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str).commit();
            }
            z10 = true;
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
            b2Var2.R = V(R.string.ChooseYourLanguage, "ChooseYourLanguage", this.J0);
            b2Var2.S = V(R.string.ChooseYourLanguage, "ChooseYourLanguage", this.K0);
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            org.telegram.ui.Cells.p4[] p4VarArr2 = new org.telegram.ui.Cells.p4[2];
            String V4 = V(R.string.English, "English", this.J0);
            LocaleController.LocaleInfo[] localeInfoArr3 = {!z10 ? localeInfo3 : localeInfo2, !z10 ? localeInfo2 : localeInfo3};
            if (z10) {
            }
            LocaleController.LocaleInfo[] localeInfoArr22 = {localeInfo3};
            i11 = 0;
            while (i11 < i10) {
            }
            org.telegram.ui.Cells.p4 p4Var22 = new org.telegram.ui.Cells.p4(this);
            String V22 = V(R.string.ChooseYourLanguageOther, "ChooseYourLanguageOther", this.J0);
            String V32 = V(R.string.ChooseYourLanguageOther, "ChooseYourLanguageOther", this.K0);
            p4Var22.b.setText(V22);
            p4Var22.c.setText(V32);
            p4Var22.a.a(false, false);
            p4Var22.e = null;
            p4Var22.d = false;
            p4Var22.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I5, false), 2, -1));
            p4Var22.setOnClickListener(new y50(this, 4));
            linearLayout2.addView(p4Var22, w7.z5.n(-1, 50));
            alertDialog$Builder2.n(linearLayout2);
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), new ov(12, this, localeInfoArr22));
            this.H0 = F0(alertDialog$Builder2);
            MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str).commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r8 == null) goto L29;
     */
    @Override // org.telegram.ui.xx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean K(ey eyVar) {
        ei.a8 l4;
        FileOutputStream fileOutputStream;
        ArrayList arrayList = this.U;
        if (arrayList == null || arrayList.isEmpty()) {
            String str = this.R;
            if (str != null) {
                MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
                try {
                    Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(this.R, 1);
                    File file = new File(FileLoader.getDirectory(4), "-2147483648_" + SharedConfig.getLastLocalId() + ".jpg");
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            createVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            photoEntry.thumbPath = file.getAbsolutePath();
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                FileLog.e(th);
                            } catch (Throwable th3) {
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileOutputStream = null;
                    }
                    fileOutputStream.close();
                } catch (Throwable unused2) {
                }
                l4 = ei.a8.l(photoEntry);
            }
            l4 = null;
        } else {
            ArrayList K7 = sn.K7(this.U, false, null);
            if (!K7.isEmpty()) {
                l4 = ei.a8.l((MediaController.PhotoEntry) K7.get(0));
            }
            l4 = null;
        }
        if (l4 == null) {
            return false;
        }
        ci.c7 o10 = MessagesController.getInstance(this.O).getStoriesController().o();
        if (o10 != null && o10.a(this.O, 1)) {
            eyVar.showDialog(new sg.j0(o10.b(), this.O, this, eyVar, null));
            return false;
        }
        l4.o = true;
        l4.M = false;
        ei.vb.D(this, this.O).R(null, l4, 0L);
        eyVar.finishFragment();
        this.U = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.V = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.X = null;
        return true;
    }

    public final void K0(boolean z10, boolean z11, int i10, int i11, vi viVar) {
        if (this.z0 == null || isFinishing()) {
            return;
        }
        if (this.A0 == null) {
            this.A0 = new org.telegram.ui.Components.ne0(this);
        }
        SharedConfig.appLocked = true;
        int i12 = 0;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (l4.I() && l4.x().V) {
            l4.x().o(false, true);
        }
        ei.vb.w();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.A0.show();
        org.telegram.ui.Components.me0 me0Var = this.A0.b;
        ArrayList arrayList = this.B0;
        arrayList.isEmpty();
        me0Var.l(z11, i10, i11, new b80(6, this, viVar));
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            org.telegram.ui.Components.le0 le0Var = (org.telegram.ui.Components.le0) arrayList.get(i13);
            if (z10) {
                int size = arrayList.size() - 1;
            }
            le0Var.l(z11, i10, i11, null);
        }
        SharedConfig.isWaitingForPasscodeEnter = true;
        v90 v90Var = new v90(this);
        this.A0.b.setDelegate(v90Var);
        int size2 = arrayList.size();
        while (i12 < size2) {
            Object obj = arrayList.get(i12);
            i12++;
            ((org.telegram.ui.Components.le0) obj).setDelegate(v90Var);
        }
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void L0(int i10, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        float f7;
        float f10;
        if (this.C0 == null) {
            final org.telegram.ui.Components.c11 c11Var = new org.telegram.ui.Components.c11(this);
            c11Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            int i11 = AndroidUtilities.statusBarHeight;
            if (i11 > 0) {
                View view = new View(this);
                view.setBackgroundColor(-16777216);
                c11Var.addView(view, new FrameLayout.LayoutParams(-1, i11));
            }
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.logo_middle);
            linearLayout.addView(imageView, w7.z5.t(-2, -2, 3, 0, 28, 0, 0));
            TextView textView = new TextView(this);
            int i12 = org.telegram.ui.ActionBar.h6.G6;
            f10 = 4.0f;
            org.telegram.messenger.q.m(17.0f, org.telegram.ui.ActionBar.h6.x0(null, i12, false), 1, textView);
            textView.setText(LocaleController.getString(R.string.PrivacyPolicyAndTerms));
            linearLayout.addView(textView, w7.z5.t(-2, -2, 3, 0, 20, 0, 0));
            TextView textView2 = new TextView(this);
            c11Var.a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(51);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(textView2, w7.z5.t(-1, -2, 3, 0, 15, 0, 15));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setOverScrollMode(2);
            scrollView.setPadding(AndroidUtilities.dp(24.0f), i11, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(75.0f));
            scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            c11Var.addView(scrollView, w7.z5.n(-1, -2));
            TextView textView3 = new TextView(this);
            textView3.setText(LocaleController.getString(R.string.Decline).toUpperCase());
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            int i13 = org.telegram.ui.ActionBar.h6.y6;
            textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            textView3.setTextSize(1, 14.0f);
            textView3.setBackground(org.telegram.ui.ActionBar.h6.H0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.x0(null, i13, false)));
            f7 = 10.0f;
            textView3.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(10.0f));
            c11Var.addView(textView3, w7.z5.a(-2.0f, 16.0f, 0.0f, 16.0f, 16.0f, -2, 83));
            final int i14 = 0;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.z01
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i15 = i14;
                    c11 c11Var2 = c11Var;
                    switch (i15) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new a11(c11Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (c11Var2.c.min_age_confirm == 0) {
                                c11Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                b2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new a11(c11Var2, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", c11Var2.c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                break;
                            }
                    }
                }
            });
            TextView textView4 = new TextView(this);
            textView4.setText(LocaleController.getString(R.string.Accept));
            textView4.setGravity(17);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 14.0f);
            int dp = AndroidUtilities.dp(4.0f);
            textView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, -11491093, -12346402, -12346402));
            textView4.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            c11Var.addView(textView4, w7.z5.a(42.0f, 16.0f, 0.0f, 16.0f, 16.0f, -2, 85));
            final int i15 = 1;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.z01
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i152 = i15;
                    c11 c11Var2 = c11Var;
                    switch (i152) {
                        case 0:
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(view2.getContext());
                            String string = LocaleController.getString(R.string.TermsOfService);
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.R = string;
                            alertDialog$Builder.k(LocaleController.getString(R.string.DeclineDeactivate), new a11(c11Var2, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Back), null);
                            b2Var.T = LocaleController.getString(R.string.TosUpdateDecline);
                            alertDialog$Builder.o();
                            break;
                        default:
                            if (c11Var2.c.min_age_confirm == 0) {
                                c11Var2.a();
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(view2.getContext());
                                String string2 = LocaleController.getString(R.string.TosAgeTitle);
                                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                                b2Var2.R = string2;
                                alertDialog$Builder2.k(LocaleController.getString(R.string.Agree), new a11(c11Var2, 0));
                                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                b2Var2.T = LocaleController.formatString("TosAgeText", R.string.TosAgeText, LocaleController.formatPluralString("Years", c11Var2.c.min_age_confirm, new Object[0]));
                                alertDialog$Builder2.o();
                                break;
                            }
                    }
                }
            });
            View view2 = new View(this);
            view2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d7, false));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.bottomMargin = AndroidUtilities.dp(75.0f);
            layoutParams.gravity = 80;
            c11Var.addView(view2, layoutParams);
            this.C0 = c11Var;
            c11Var.setAlpha(0.0f);
            this.z0.addView(this.C0, w7.z5.d(-1.0f, -1));
            this.C0.setDelegate(new ca0(this));
        } else {
            f7 = 10.0f;
            f10 = 4.0f;
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i10).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            UserConfig.getInstance(i10).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i10).saveConfig(false);
        }
        org.telegram.ui.Components.c11 c11Var2 = this.C0;
        if (c11Var2.getVisibility() != 0) {
            c11Var2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_termsOfService.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_termsOfService.entities, false, false, false, false);
        int dp2 = AndroidUtilities.dp(f7);
        int dp3 = AndroidUtilities.dp(f10);
        int length = spannableStringBuilder.length() - 2;
        for (int i16 = 0; i16 < length; i16++) {
            if (spannableStringBuilder.charAt(i16) == '\n') {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i17) == '-') {
                    int i18 = i16 + 2;
                    if (spannableStringBuilder.charAt(i18) == ' ') {
                        org.telegram.ui.Components.cb cbVar = new org.telegram.ui.Components.cb(dp2, dp3);
                        spannableStringBuilder.replace(i17, i16 + 3, (CharSequence) "\u0000\u0000");
                        spannableStringBuilder.setSpan(cbVar, i17, i18, 33);
                    }
                }
            }
        }
        c11Var2.a.setText(spannableStringBuilder);
        c11Var2.c = tL_help_termsOfService;
        c11Var2.d = i10;
        this.C0.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList M(String str, String str2) {
        String str3;
        String lowerCase;
        TLRPC.User user;
        MessagesController messagesController = MessagesController.getInstance(this.O);
        ContactsController contactsController = ContactsController.getInstance(this.O);
        ArrayList arrayList = new ArrayList(contactsController.contacts);
        ArrayList arrayList2 = new ArrayList();
        String str4 = null;
        int i10 = 0;
        if (str2 != null) {
            String d = jf.b.d(str2, false);
            TLRPC.TL_contact tL_contact = contactsController.contactsByPhone.get(d);
            if (tL_contact == null) {
                tL_contact = contactsController.contactsByShortPhone.get(d.substring(Math.max(0, d.length() - 7)));
            }
            if (tL_contact != null) {
                TLRPC.User user2 = messagesController.getUser(Long.valueOf(tL_contact.user_id));
                if (user2 == null || user2.self) {
                    str3 = null;
                    if (arrayList2.isEmpty() && str3 != null) {
                        lowerCase = str3.trim().toLowerCase();
                        if (!TextUtils.isEmpty(lowerCase)) {
                            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                                translitString = null;
                            }
                            String[] strArr = {lowerCase, translitString};
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.TL_contact tL_contact2 = (TLRPC.TL_contact) arrayList.get(i11);
                                if (tL_contact2 != null && (user = messagesController.getUser(Long.valueOf(tL_contact2.user_id))) != null && !user.self) {
                                    int i12 = 3;
                                    String[] strArr2 = new String[3];
                                    strArr2[i10] = ContactsController.formatName(user.first_name, user.last_name).toLowerCase();
                                    String translitString2 = LocaleController.getInstance().getTranslitString(strArr2[i10]);
                                    strArr2[1] = translitString2;
                                    if (strArr2[i10].equals(translitString2)) {
                                        strArr2[1] = str4;
                                    }
                                    if (UserObject.isReplyUser(user)) {
                                        strArr2[2] = LocaleController.getString(R.string.RepliesTitle).toLowerCase();
                                    } else if (user.self) {
                                        strArr2[2] = LocaleController.getString(R.string.SavedMessages).toLowerCase();
                                    }
                                    int i13 = i10;
                                    int i14 = i13;
                                    while (true) {
                                        if (i13 >= 2) {
                                            break;
                                        }
                                        String str5 = strArr[i13];
                                        if (str5 != null) {
                                            while (i10 < i12) {
                                                String str6 = strArr2[i10];
                                                if (str6 != null && (str6.startsWith(str5) || str6.contains(" ".concat(str5)))) {
                                                    i14 = 1;
                                                    break;
                                                }
                                                i10++;
                                                i12 = 3;
                                            }
                                            String publicUsername = UserObject.getPublicUsername(user);
                                            if (i14 == 0 && publicUsername != null && publicUsername.startsWith(str5)) {
                                                i14 = 1;
                                            }
                                            if (i14 != 0) {
                                                arrayList2.add(tL_contact2);
                                                break;
                                            }
                                        }
                                        i13++;
                                        i10 = 0;
                                        i12 = 3;
                                    }
                                }
                                i11++;
                                str4 = null;
                                i10 = 0;
                            }
                        }
                    }
                    return arrayList2;
                }
                arrayList2.add(tL_contact);
            }
        }
        str3 = str;
        if (arrayList2.isEmpty()) {
            lowerCase = str3.trim().toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
            }
        }
        return arrayList2;
    }

    public final void M0(int i10, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z10) {
        int i11 = 1;
        int i12 = 0;
        if (this.D0 == null) {
            org.telegram.ui.Components.da daVar = new org.telegram.ui.Components.da(this);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i13 = org.telegram.ui.ActionBar.h6.d6;
            daVar.w = new GradientDrawable(orientation, new int[]{org.telegram.ui.ActionBar.h6.x0(null, i13, false), 0});
            daVar.x = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{org.telegram.ui.ActionBar.h6.x0(null, i13, false), 0});
            daVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
            int i14 = (int) (AndroidUtilities.statusBarHeight / AndroidUtilities.density);
            FrameLayout frameLayout = new FrameLayout(this);
            daVar.addView(frameLayout, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(176.0f) + AndroidUtilities.statusBarHeight));
            org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(this);
            xj0Var.f(R.raw.qr_code_logo, 108, 108, null);
            xj0Var.d();
            xj0Var.getAnimatedDrawable().K(1);
            xj0Var.setScaleType(ImageView.ScaleType.CENTER);
            xj0Var.setPadding(0, 0, 0, AndroidUtilities.dp(14.0f));
            frameLayout.addView(xj0Var, w7.z5.a(-2.0f, 0.0f, i14, 0.0f, 0.0f, -2, 17));
            xj0Var.setOnClickListener(new org.telegram.ui.Components.f0(daVar, 3));
            FrameLayout frameLayout2 = new FrameLayout(this);
            ScrollView scrollView = new ScrollView(this);
            daVar.f = scrollView;
            AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.s8, false));
            scrollView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            scrollView.setClipToPadding(false);
            daVar.addView(scrollView, w7.z5.a(-1.0f, 27.0f, i14 + 178, 27.0f, 130.0f, -1, 51));
            scrollView.addView(frameLayout2);
            TextView textView = new TextView(this);
            int i15 = org.telegram.ui.ActionBar.h6.G6;
            textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            textView.setTextSize(1, 20.0f);
            textView.setGravity(49);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.UpdateTelegram));
            frameLayout2.addView(textView, w7.z5.e(-2, -2, 49));
            TextView textView2 = new TextView(this);
            daVar.a = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i15, false));
            textView2.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.J6, false));
            textView2.setTextSize(1, 15.0f);
            textView2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            textView2.setGravity(49);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            frameLayout2.addView(textView2, w7.z5.a(-2.0f, 0.0f, 44.0f, 0.0f, 0.0f, -2, 51));
            ah.x xVar = new ah.x(this, 10);
            daVar.d = xVar;
            xVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            xVar.setBackgroundDrawable(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
            xVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            daVar.addView(xVar, w7.z5.a(46.0f, 0.0f, 0.0f, 0.0f, 45.0f, -2, 81));
            xVar.setOnClickListener(new org.telegram.ui.Components.ca(i12, daVar, this));
            TextView textView3 = new TextView(this);
            daVar.b = textView3;
            textView3.setGravity(17);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            xVar.addView(textView3, w7.z5.e(-2, -2, 17));
            ah.x xVar2 = new ah.x(daVar, this, 11);
            daVar.c = xVar2;
            xVar2.setWillNotDraw(false);
            xVar2.setAlpha(0.0f);
            xVar2.setScaleX(0.1f);
            xVar2.setScaleY(0.1f);
            xVar2.setVisibility(4);
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(xVar2);
            daVar.e = yj0Var;
            yj0Var.d(null, true, false);
            yj0Var.o = -1;
            xVar.addView(xVar2, w7.z5.e(36, 36, 17));
            this.D0 = daVar;
            this.z0.addView(daVar, w7.z5.d(-1.0f, -1));
        }
        org.telegram.ui.Components.da daVar2 = this.D0;
        daVar2.v = 0;
        daVar2.n = tL_help_appUpdate;
        daVar2.s = i10;
        TLRPC.Document document = tL_help_appUpdate.document;
        if (document instanceof TLRPC.TL_document) {
            daVar2.r = FileLoader.getAttachFileName(document);
        }
        if (daVar2.getVisibility() != 0) {
            daVar2.setVisibility(0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_help_appUpdate.text);
        MessageObject.addEntitiesToText(spannableStringBuilder, tL_help_appUpdate.entities, false, false, false, false);
        daVar2.a.setText(spannableStringBuilder);
        if (tL_help_appUpdate.document instanceof TLRPC.TL_document) {
            daVar2.b.setText(LocaleController.getString(R.string.Update) + String.format(Locale.US, " (%1$s)", AndroidUtilities.formatFileSize(tL_help_appUpdate.document.size)));
        } else {
            daVar2.b.setText(LocaleController.getString(R.string.Update));
        }
        NotificationCenter.getInstance(daVar2.s).addObserver(daVar2, NotificationCenter.fileLoaded);
        NotificationCenter.getInstance(daVar2.s).addObserver(daVar2, NotificationCenter.fileLoadFailed);
        NotificationCenter.getInstance(daVar2.s).addObserver(daVar2, NotificationCenter.fileLoadProgressChanged);
        if (z10 && ApplicationLoader.isStandaloneBuild()) {
            TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
            try {
                tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
            } catch (Exception unused) {
            }
            if (tL_help_getAppUpdate.source == null) {
                tL_help_getAppUpdate.source = "";
            }
            ConnectionsManager.getInstance(daVar2.s).sendRequest(tL_help_getAppUpdate, new org.telegram.ui.Components.y1(daVar2, i11));
        }
    }

    public final void N0(int i10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.d0.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        org.telegram.ui.ActionBar.n2 n2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
        if (n2Var instanceof pg0) {
            n2Var = ((pg0) n2Var).X();
        }
        UndoView undoView = null;
        if (n2Var instanceof sn) {
            sn snVar = (sn) n2Var;
            if (chat != null && snVar.a() == (-chat.id)) {
                chat = null;
            }
            snVar.T7();
            undoView = snVar.y3;
        } else if (n2Var instanceof ey) {
            undoView = ((ey) n2Var).W3();
        } else if (n2Var instanceof ProfileActivity) {
            undoView = ((ProfileActivity) n2Var).M;
        }
        if (undoView != null) {
            undoView.m(0L, chat, i10);
        }
        if (i10 != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    public final org.telegram.ui.ActionBar.d5 O() {
        ActionBarLayout actionBarLayout = this.q0;
        ArrayList arrayList = this.P;
        return !arrayList.isEmpty() ? (org.telegram.ui.ActionBar.d5) i0.a.h(1, arrayList) : actionBarLayout;
    }

    public final void O0(int i10) {
        P0(i10, new org.telegram.ui.Components.tg0(29));
    }

    public final org.telegram.ui.ActionBar.n3 P() {
        ActionBarLayout actionBarLayout = this.s0;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.s0.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.q0;
        if (actionBarLayout2 == null || actionBarLayout2.getBottomSheetTabs() == null) {
            return null;
        }
        return this.q0.getBottomSheetTabs();
    }

    public final void P0(int i10, GenericProvider genericProvider) {
        if (i10 == UserConfig.selectedAccount || !UserConfig.isValidAccount(i10)) {
            return;
        }
        this.l1 = true;
        ConnectionsManager.getInstance(this.O).setAppPaused(true, false);
        UserConfig.selectedAccount = i10;
        UserConfig.getInstance(0).saveConfig(false);
        A();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i10));
        if (AndroidUtilities.isTablet()) {
            this.r0.X();
            this.s0.X();
            if (!this.O0) {
                if (this.s0.getFragmentStack().isEmpty()) {
                    this.v0.setVisibility(0);
                }
                this.s0.getView().setVisibility(8);
            }
            this.r0.getView().setVisibility(8);
        }
        this.q0.X();
        this.q0.c(-3, (pg0) genericProvider.provide(null));
        this.q0.U(true, true);
        if (AndroidUtilities.isTablet()) {
            this.r0.U(true, true);
            this.s0.U(true, true);
        }
        if (!ApplicationLoader.mainInterfacePaused) {
            ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        }
        if (UserConfig.getInstance(i10).unacceptedTermsOfService != null) {
            L0(i10, UserConfig.getInstance(i10).unacceptedTermsOfService);
        }
        Q0();
        this.l1 = false;
    }

    public final org.telegram.ui.ActionBar.n2 Q() {
        return fg0.j1(this.O, false).getInt("currentViewNum", 0) != 0 ? new fg0() : new l70();
    }

    public final void Q0() {
        int i10;
        String str;
        if (this.q0 == null) {
            return;
        }
        int connectionState = ConnectionsManager.getInstance(this.O).getConnectionState();
        this.c0 = connectionState;
        if (connectionState == 2) {
            i10 = R.string.WaitingForNetwork;
            str = "WaitingForNetwork";
        } else if (connectionState == 5) {
            i10 = R.string.Updating;
            str = "Updating";
        } else if (connectionState == 4) {
            i10 = R.string.ConnectingToProxyWithDots;
            str = "ConnectingToProxyWithDots";
        } else if (connectionState == 1) {
            i10 = R.string.Connecting;
            str = "Connecting";
        } else {
            i10 = 0;
            str = null;
        }
        l80 l80Var = (connectionState == 1 || connectionState == 4) ? new l80(this, 5) : null;
        ActionBarLayout actionBarLayout = this.q0;
        actionBarLayout.G0 = str;
        actionBarLayout.H0 = i10;
        actionBarLayout.I0 = l80Var;
        for (int i11 = 0; i11 < actionBarLayout.O0.size(); i11++) {
            ((org.telegram.ui.ActionBar.n2) actionBarLayout.O0.get(i11)).setTitleOverlayText(actionBarLayout.G0, actionBarLayout.H0, l80Var);
        }
    }

    public final int S() {
        return this.d0.size();
    }

    public final qh.e T() {
        return this.g1;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    public final boolean X(android.content.Intent r121, boolean r122, boolean r123, boolean r124, pf.c r125, boolean r126, boolean r127) {
        /*
            Method dump skipped, instructions count: 16328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.X(android.content.Intent, boolean, boolean, boolean, pf.c, boolean, boolean):boolean");
    }

    public final void Y() {
        ActionMode actionMode = this.k0;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    public final void Z(int i10, TLRPC.User user, String str, pf.c cVar) {
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_contacts_importNoPaidMessagesToken tL_contacts_importNoPaidMessagesToken = new TLRPC.TL_contacts_importNoPaidMessagesToken();
        tL_contacts_importNoPaidMessagesToken.user_id = messagesController.getInputUser(user);
        tL_contacts_importNoPaidMessagesToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_contacts_importNoPaidMessagesToken, new org.telegram.messenger.a(), new ai.u2(this, cVar, messagesController, user, 2));
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final void a(float f7) {
        if (l4.I() && l4.x().V) {
            l4 x10 = l4.x();
            x10.S();
            l4.g0(x10);
            if (x10.f0 != null) {
                x10.u0[0].b.f1();
                x10.u0[1].b.f1();
                x10.f0.invalidate();
                x10.q0.invalidate();
                if (f7 == 1.0f) {
                    x10.u0[0].c.l();
                    x10.u0[1].c.l();
                }
            }
        }
        if (PhotoViewer.D1()) {
            PhotoViewer.t1().u3();
        }
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.r0) {
            this.s0.U(z10, z10);
            this.q0.U(z10, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        long j10;
        long j11;
        long j12;
        Boolean wasTablet = AndroidUtilities.getWasTablet();
        if (wasTablet == null) {
            return;
        }
        AndroidUtilities.resetWasTabletFlag();
        if (wasTablet.booleanValue() != AndroidUtilities.isTablet()) {
            boolean booleanValue = wasTablet.booleanValue();
            ArrayList arrayList = this.e0;
            ArrayList arrayList2 = this.f0;
            ArrayList arrayList3 = this.d0;
            if (booleanValue) {
                arrayList3.addAll(arrayList2);
                arrayList3.addAll(arrayList);
                arrayList2.clear();
                arrayList.clear();
                j11 = 0;
                j10 = 0;
            } else {
                ArrayList arrayList4 = new ArrayList(arrayList3);
                arrayList3.clear();
                arrayList2.clear();
                arrayList.clear();
                int size = arrayList4.size();
                long j13 = 0;
                j10 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList4.get(i10);
                    i10++;
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                    if (!(n2Var instanceof pg0)) {
                        if (n2Var instanceof ey) {
                            ey eyVar = (ey) n2Var;
                            if (eyVar.f4() && !eyVar.c4()) {
                                j12 = 0;
                                if (eyVar.Y2 != 0) {
                                    if (!(n2Var instanceof sn)) {
                                        sn snVar = (sn) n2Var;
                                        if (!snVar.c()) {
                                            arrayList2.add(n2Var);
                                            if (j13 == j12) {
                                                j13 = snVar.a();
                                                j10 = snVar.d();
                                            }
                                        }
                                    }
                                    arrayList.add(n2Var);
                                }
                            }
                        }
                        j12 = 0;
                        if (!(n2Var instanceof sn)) {
                        }
                        arrayList.add(n2Var);
                    }
                    arrayList3.add(n2Var);
                }
                j11 = j13;
            }
            E0();
            this.q0.U(true, true);
            if (AndroidUtilities.isTablet()) {
                this.s0.U(true, true);
                this.r0.U(true, true);
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList3.get(i11);
                    i11++;
                    Object obj3 = (org.telegram.ui.ActionBar.n2) obj2;
                    if (obj3 instanceof pg0) {
                        obj3 = ((pg0) obj3).J;
                    }
                    if (obj3 instanceof ey) {
                        ey eyVar2 = (ey) obj3;
                        if (eyVar2.f4()) {
                            MessagesStorage.TopicKey topicKey = eyVar2.p2;
                            topicKey.dialogId = j11;
                            topicKey.topicId = j10;
                            dy[] dyVarArr = eyVar2.e0;
                            if (dyVarArr != null) {
                                for (dy dyVar : dyVarArr) {
                                    if (dyVar.p() && AndroidUtilities.isTablet()) {
                                        dyVar.d.s = topicKey.dialogId;
                                    }
                                }
                                eyVar2.e5(MessagesController.UPDATE_MASK_SELECT_DIALOG, true);
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean d0(boolean z10) {
        boolean z11;
        ng.i iVar = w7.d0.a;
        if (iVar != null) {
            if (iVar.s) {
                if (z10) {
                    iVar.c(false);
                }
            }
            return false;
        }
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var == null || ne0Var.b.getVisibility() != 0) {
            org.telegram.ui.ActionBar.w3 w3Var = this.y0;
            if (w3Var == null || !(z11 = w3Var.U)) {
                org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.fo0.H;
                if (b2Var != null) {
                    if (z10) {
                        b2Var.dismiss();
                        org.telegram.ui.Components.fo0.H = null;
                        return false;
                    }
                } else if (gt.g0 == null || !gt.q().E) {
                    if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
                        if (z10) {
                            SecretMediaViewer.f().e(true, false);
                            return false;
                        }
                    } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                        if (z10) {
                            PhotoViewer.t1().G0(true, false);
                            return false;
                        }
                    } else {
                        if (!l4.I() || !l4.x().V) {
                            return true;
                        }
                        if (z10) {
                            l4.x().o(true, false);
                        }
                    }
                } else if (z10) {
                    gt.q().o();
                    return false;
                }
            } else if (z10 && z11) {
                w3Var.a(false);
                return false;
            }
        } else if (z10) {
            finish();
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:253:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0620  */
    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s50 s50Var;
        char c10;
        boolean z10;
        char c11;
        ActionBarLayout actionBarLayout;
        Runnable runnable;
        char c12;
        int i12 = 0;
        r8 = false;
        r8 = false;
        boolean z11 = false;
        r8 = false;
        boolean z12 = false;
        int i13 = 1;
        if (i10 == NotificationCenter.appDidLogout) {
            while (true) {
                if (i12 >= 4) {
                    i12 = -1;
                    break;
                } else if (UserConfig.getInstance(i12).isClientActivated()) {
                    break;
                } else {
                    i12++;
                }
            }
            org.telegram.ui.Components.c11 c11Var = this.C0;
            if (c11Var != null) {
                c11Var.setVisibility(8);
            }
            if (i12 != -1) {
                O0(i12);
                return;
            }
            t21.V(true);
            J();
            this.q0.W();
            if (AndroidUtilities.isTablet()) {
                this.r0.W();
                this.s0.W();
            }
            l70 l70Var = new l70();
            l70Var.N = true;
            t0(l70Var);
            return;
        }
        if (i10 == NotificationCenter.openBoostForUsersDialog) {
            Long l4 = (Long) objArr[0];
            l4.getClass();
            w0(l4, null, null, objArr.length > 1 ? (org.telegram.ui.Cells.u1) objArr[1] : null);
            return;
        }
        if (i10 == NotificationCenter.closeOtherAppActivities) {
            if (objArr[0] != this) {
                e0();
                finish();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didUpdateConnectionState) {
            int connectionState = ConnectionsManager.getInstance(i11).getConnectionState();
            if (this.c0 != connectionState) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("switch to state " + connectionState);
                }
                this.c0 = connectionState;
                Q0();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.mainUserInfoChanged || i10 == NotificationCenter.attachMenuBotsDidLoad) {
            return;
        }
        int i14 = 3;
        if (i10 == NotificationCenter.needShowAlert) {
            Integer num = (Integer) objArr[0];
            if (num.intValue() != 6) {
                if (num.intValue() != 3 || this.F0 == null) {
                    if (num.intValue() == 4) {
                        L0(i11, (TLRPC.TL_help_termsOfService) objArr[1]);
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = !this.d0.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0) : null;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                    if (n2Var != null) {
                        HashMap hashMap = new HashMap();
                        int i15 = org.telegram.ui.ActionBar.h6.L5;
                        hashMap.put("info1", Integer.valueOf(n2Var.getThemedColor(i15)));
                        hashMap.put("info2", Integer.valueOf(n2Var.getThemedColor(i15)));
                        alertDialog$Builder.m(R.raw.not_available, 52, n2Var.getThemedColor(i15), hashMap);
                        alertDialog$Builder.a.W = true;
                    }
                    if (num.intValue() != 2 && num.intValue() != 3) {
                        alertDialog$Builder.h(LocaleController.getString(R.string.MoreInfo), new i2.q(this, i11, 11));
                    }
                    if (num.intValue() == 5) {
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.NobodyLikesSpam3);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 0) {
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.NobodyLikesSpam1);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 1) {
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.NobodyLikesSpam2);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    } else if (num.intValue() == 2) {
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf((String) objArr[1]);
                        String str = (String) objArr[2];
                        if (str.startsWith("PREMIUM_GIFT_SELF_REQUIRED_")) {
                            String str2 = (String) objArr[1];
                            int indexOf = str2.indexOf(42);
                            int i16 = indexOf + 1;
                            int indexOf2 = str2.indexOf(42, i16);
                            if (indexOf != -1 && indexOf2 != -1 && indexOf != indexOf2) {
                                valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) str2.substring(i16, indexOf2));
                                valueOf.setSpan(new ei.kb(this, 7), indexOf, indexOf2 - 1, 33);
                            }
                        }
                        alertDialog$Builder.a.T = valueOf;
                        if (str.startsWith("AUTH_KEY_DROP_")) {
                            alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.h(LocaleController.getString(R.string.LogOut), new v90(this));
                        } else if (str.startsWith("PREMIUM_")) {
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.TelegramPremium);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        } else {
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        }
                    } else if (num.intValue() == 3) {
                        alertDialog$Builder.a.R = LocaleController.getString(R.string.Proxy);
                        alertDialog$Builder.a.T = LocaleController.getString(R.string.UseProxyTelegramError);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        this.F0 = F0(alertDialog$Builder);
                        return;
                    }
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.wasUnableToFindCurrentLocation) {
            HashMap hashMap2 = (HashMap) objArr[0];
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this);
            alertDialog$Builder2.l(LocaleController.getString(R.string.AppName));
            alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder2.h(LocaleController.getString(R.string.ShareYouLocationUnableManually), new hg.b2(this, hashMap2, i11, 12));
            alertDialog$Builder2.g(LocaleController.getString(R.string.ShareYouLocationUnable));
            if (this.d0.isEmpty()) {
                return;
            }
            ((org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0)).showDialog(alertDialog$Builder2.a());
            return;
        }
        if (i10 == NotificationCenter.didSetNewWallpapper) {
            ig.n1 n1Var = this.v0;
            if (n1Var != null) {
                n1Var.V(org.telegram.ui.ActionBar.h6.s0());
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.didSetPasscode) {
            this.e1.invalidate();
            return;
        }
        if (i10 == NotificationCenter.reloadInterface) {
            boolean z13 = this.d0.size() > 1 && (i0.a.h(1, this.d0) instanceof ProfileActivity);
            y0((!z13 || ((ProfileActivity) i0.a.h(1, this.d0)).h4()) ? z13 : false);
            return;
        }
        if (i10 == NotificationCenter.suggestedLangpack) {
            I0();
            return;
        }
        if (i10 == NotificationCenter.openArticle) {
            if (this.d0.isEmpty()) {
                return;
            }
            LaunchActivity launchActivity = H1;
            if (launchActivity == null || launchActivity.P() == null || H1.P().m((TLRPC.TL_webPage) objArr[0]) == null) {
                ((org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0)).createArticleViewer(false).N(null, (TLRPC.TL_webPage) objArr[0], (String) objArr[1], null);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.hasNewContactsToImport) {
            ActionBarLayout actionBarLayout2 = this.q0;
            if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                return;
            }
            ((Integer) objArr[0]).getClass();
            HashMap hashMap3 = (HashMap) objArr[1];
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            boolean booleanValue2 = ((Boolean) objArr[3]).booleanValue();
            org.telegram.ui.ActionBar.n2 n2Var2 = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this);
            alertDialog$Builder3.m(R.raw.permission_request_contacts, 72, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L5), null);
            alertDialog$Builder3.l(LocaleController.getString(R.string.UpdateContactsTitle));
            alertDialog$Builder3.g(LocaleController.getString(R.string.UpdateContactsMessage));
            alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new h80(i11, hashMap3, booleanValue, booleanValue2, 1));
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), new h80(i11, hashMap3, booleanValue, booleanValue2, 2));
            alertDialog$Builder3.a.w0 = new h80(i11, hashMap3, booleanValue, booleanValue2, 0);
            org.telegram.ui.ActionBar.b2 a2 = alertDialog$Builder3.a();
            n2Var2.showDialog(a2);
            a2.setCanceledOnTouchOutside(false);
            return;
        }
        if (i10 == NotificationCenter.didSetNewTheme) {
            if (!((Boolean) objArr[0]).booleanValue()) {
                try {
                    setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.s8) | (-16777216)));
                } catch (Exception unused) {
                }
            }
            boolean booleanValue3 = objArr.length > 1 ? ((Boolean) objArr[1]).booleanValue() : true;
            boolean z14 = objArr.length > 2 && ((Boolean) objArr[2]).booleanValue();
            if (booleanValue3 && !this.W0 && !this.q0.A()) {
                z11 = true;
            }
            H(z14, true, z11);
            return;
        }
        if (i10 != NotificationCenter.needSetDayNightTheme) {
            if (i10 == NotificationCenter.needShowPlayServicesAlert) {
                try {
                    ((Status) objArr[0]).c(this, 140);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (i10 == NotificationCenter.fileLoaded) {
                String str3 = (String) objArr[0];
                String str4 = this.P0;
                if (str4 == null) {
                    String str5 = this.Q0;
                    if (str5 == null || !str5.equals(str3)) {
                        return;
                    }
                    this.Q0 = null;
                    File file = (File) objArr[1];
                    if (!this.U0) {
                        Utilities.globalQueue.postRunnable(new lq(this, this.S0, file, 16));
                        return;
                    } else {
                        r0(this.T0, this.R0, this.S0);
                        i0();
                        return;
                    }
                }
                if (str4.equals(str3)) {
                    this.P0 = null;
                    File file2 = new File(ApplicationLoader.getFilesDirFixed(), a1.g.r(new StringBuilder("remote"), this.T0.id, ".attheme"));
                    TLRPC.TL_theme tL_theme = this.T0;
                    org.telegram.ui.ActionBar.g6 l02 = org.telegram.ui.ActionBar.h6.l0(file2, tL_theme.title, tL_theme);
                    if (l02 != null) {
                        if (l02.c != null && !new File(l02.c).exists()) {
                            TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                            TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                            tL_inputWallPaperSlug.slug = l02.e;
                            getwallpaper.wallpaper = tL_inputWallPaperSlug;
                            ConnectionsManager.getInstance(l02.E).sendRequest(getwallpaper, new z40(i14, this, l02));
                            return;
                        }
                        TLRPC.TL_theme tL_theme2 = this.T0;
                        org.telegram.ui.ActionBar.g6 u10 = org.telegram.ui.ActionBar.h6.u(file2, tL_theme2.title, tL_theme2, true);
                        if (u10 != null) {
                            t0(new mc1(u10, true, 0, false, false));
                        }
                    }
                    i0();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.fileLoadFailed) {
                String str6 = (String) objArr[0];
                if (str6.equals(this.P0) || str6.equals(this.Q0)) {
                    i0();
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.screenStateChanged) {
                if (ApplicationLoader.mainInterfacePaused) {
                    return;
                }
                if (ApplicationLoader.isScreenOn) {
                    h0();
                    return;
                } else {
                    g0();
                    return;
                }
            }
            if (i10 == NotificationCenter.needCheckSystemBarColors) {
                if (objArr.length > 0 && ((Boolean) objArr[0]).booleanValue()) {
                    z12 = true;
                }
                G(z12);
                return;
            }
            if (i10 == NotificationCenter.historyImportProgressChanged) {
                if (objArr.length <= 1 || this.d0.isEmpty()) {
                    return;
                }
                org.telegram.ui.Components.f5.e0(this.O, (TLRPC.TL_error) objArr[2], (org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0), (TLObject) objArr[1], new Object[0]);
                return;
            }
            if (i10 == NotificationCenter.billingConfirmPurchaseError) {
                org.telegram.ui.Components.f5.e0(this.O, (TLRPC.TL_error) objArr[1], (org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0), (TLObject) objArr[0], new Object[0]);
                return;
            }
            if (i10 == NotificationCenter.stickersImportComplete) {
                MediaDataController.getInstance(i11).toggleStickerSet(this, (TLObject) objArr[0], 2, !this.d0.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0) : null, false, true);
                return;
            }
            if (i10 == NotificationCenter.showBulletin) {
                if (this.d0.isEmpty()) {
                    return;
                }
                int intValue = ((Integer) objArr[0]).intValue();
                org.telegram.ui.ActionBar.d3 container = (!s50.E3 || (s50Var = s50.D3) == null) ? null : s50Var.getContainer();
                org.telegram.ui.ActionBar.n2 n2Var3 = container == null ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0) : null;
                switch (intValue) {
                    case 0:
                        TLRPC.Document document = (TLRPC.Document) objArr[1];
                        int intValue2 = ((Integer) objArr[2]).intValue();
                        org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(this, intValue2, document);
                        int i17 = (intValue2 == 6 || intValue2 == 7) ? 3500 : 1500;
                        if (n2Var3 == null) {
                            org.telegram.ui.Components.qc.f(container, tx0Var, i17).j();
                            break;
                        } else {
                            org.telegram.ui.Components.qc.g(n2Var3, tx0Var, i17).j();
                            break;
                        }
                        break;
                    case 1:
                        if (n2Var3 == null) {
                            org.telegram.ui.Components.xc.Z(container, null).t((String) objArr[1], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.xc.a0(n2Var3).t((String) objArr[1], null).j();
                            break;
                        }
                    case 2:
                        (container != null ? org.telegram.ui.Components.xc.Z(container, null) : org.telegram.ui.Components.xc.a0(n2Var3)).t(LocaleController.getString(((Long) objArr[1]).longValue() > 0 ? R.string.YourBioChanged : R.string.ChannelDescriptionChanged), null).j();
                        break;
                    case 3:
                        (container != null ? org.telegram.ui.Components.xc.Z(container, null) : org.telegram.ui.Components.xc.a0(n2Var3)).t(LocaleController.getString(((Long) objArr[1]).longValue() > 0 ? R.string.YourNameChanged : R.string.ChannelTitleChanged), null).j();
                        break;
                    case 4:
                        if (n2Var3 == null) {
                            org.telegram.ui.Components.xc.Z(container, null).u((String) objArr[1], (String) objArr[2], null).j();
                            break;
                        } else {
                            org.telegram.ui.Components.xc.a0(n2Var3).u((String) objArr[1], (String) objArr[2], n2Var3.getResourceProvider()).j();
                            break;
                        }
                    case 5:
                        org.telegram.ui.Components.u6 u6Var = new org.telegram.ui.Components.u6(this, (qa0) objArr[1]);
                        if (n2Var3 == null) {
                            org.telegram.ui.Components.qc.f(container, u6Var, 1500).j();
                            break;
                        } else {
                            org.telegram.ui.Components.qc.g(n2Var3, u6Var, 1500).j();
                            break;
                        }
                    case 6:
                        if (n2Var3 == null) {
                            org.telegram.ui.Components.xc.Z(container, null).T((String) objArr[1]).j();
                            break;
                        } else {
                            org.telegram.ui.Components.xc.a0(n2Var3).T((String) objArr[1]).j();
                            break;
                        }
                }
                return;
            }
            if (i10 == NotificationCenter.groupCallUpdated) {
                I(false);
                return;
            }
            if (i10 == NotificationCenter.currentUserShowLimitReachedDialog) {
                if (this.d0.isEmpty()) {
                    return;
                }
                org.telegram.ui.ActionBar.n2 n2Var4 = (org.telegram.ui.ActionBar.n2) i0.a.h(1, this.d0);
                if (n2Var4.getParentActivity() != null) {
                    n2Var4.showDialog(new sg.j0(((Integer) objArr[0]).intValue(), this.O, n2Var4.getParentActivity(), n2Var4, null));
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                MessagesController.getMainSettings(this.O).edit().remove("transcribeButtonPressed").apply();
                return;
            }
            if (i10 == NotificationCenter.requestPermissions) {
                int intValue3 = ((Integer) objArr[0]).intValue();
                String[] strArr = (intValue3 != 0 || Build.VERSION.SDK_INT < 31) ? null : new String[]{"android.permission.BLUETOOTH_CONNECT"};
                if (strArr != null) {
                    int i18 = this.c1 + 1;
                    this.c1 = i18;
                    this.b1.put(i18, intValue3);
                    e0.b.e(this, strArr, this.c1);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.chatSwitchedForum) {
                long longValue = ((Long) objArr[0]).longValue();
                if (((Boolean) objArr[1]).booleanValue()) {
                    og.d.q(longValue, this.q0);
                    return;
                }
                return;
            }
            if (i10 == NotificationCenter.tlSchemeParseException) {
                if (this.u1 == null) {
                    TLParseException tLParseException = (TLParseException) objArr[0];
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(tLParseException.getMessage());
                    sb2.append("\n\n");
                    sb2.append(AndroidUtilities.getBuildVersionInfo());
                    StringBuilder sb3 = new StringBuilder();
                    StringWriter stringWriter = new StringWriter();
                    tLParseException.printStackTrace(new PrintWriter(stringWriter));
                    sb3.append(AndroidUtilities.getBuildVersionInfo());
                    sb3.append("\n\n");
                    sb3.append(stringWriter);
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this, null);
                    alertDialog$Builder4.l("TL Error");
                    alertDialog$Builder4.g(sb2);
                    alertDialog$Builder4.h(LocaleController.getString(R.string.Copy), new wt(sb3, 14));
                    alertDialog$Builder4.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder4.j(new m80(this, i13));
                    org.telegram.ui.ActionBar.b2 o10 = alertDialog$Builder4.o();
                    this.u1 = o10;
                    o10.setCanceledOnTouchOutside(true);
                    return;
                }
                return;
            }
            if (i10 != NotificationCenter.memoryLeakFoundException) {
                if (i10 == NotificationCenter.guardBotDecisionResult) {
                    BotGuardHelper.GuardBotDecisionResultNotification guardBotDecisionResultNotification = (BotGuardHelper.GuardBotDecisionResultNotification) objArr[0];
                    org.telegram.ui.ActionBar.n2 R = R();
                    org.telegram.ui.Components.xc a02 = R instanceof sn ? org.telegram.ui.Components.xc.a0(R) : org.telegram.ui.Components.xc.X();
                    String shortName = DialogObject.getShortName(this.O, guardBotDecisionResultNotification.dialogId);
                    TLRPC.JoinChatBotResult joinChatBotResult = guardBotDecisionResultNotification.result;
                    AndroidUtilities.runOnUIThread(new b80(7, this, joinChatBotResult instanceof TLRPC.TL_joinChatBotResultApproved ? a02.H(R.raw.contact_check, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestApproved, shortName))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultDeclined ? a02.H(R.raw.e_hand_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestDeclined, shortName))) : joinChatBotResult instanceof TLRPC.TL_joinChatBotResultQueued ? a02.Q(R.raw.timer_toast, 24, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GuardBotJoinRequestQueued, shortName))) : null), 400L);
                    return;
                }
                return;
            }
            if (this.v1 == null) {
                Class cls = (Class) objArr[0];
                int intValue4 = ((Integer) objArr[1]).intValue();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.toString());
                sb4.append('\n');
                sb4.append(intValue4);
                sb4.append('\n');
                sb4.append(AndroidUtilities.getBuildVersionInfo());
                AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(this, null);
                alertDialog$Builder5.l("Memory Leak Found");
                alertDialog$Builder5.g(sb4);
                alertDialog$Builder5.k(LocaleController.getString(R.string.OK), null);
                alertDialog$Builder5.j(new m80(this, 2));
                org.telegram.ui.ActionBar.b2 o11 = alertDialog$Builder5.o();
                this.v1 = o11;
                o11.setCanceledOnTouchOutside(true);
                return;
            }
            return;
        }
        if (objArr[2] != null) {
            if (this.o0.getVisibility() == 0) {
                return;
            }
            try {
                int[] iArr = (int[]) objArr[2];
                boolean booleanValue4 = ((Boolean) objArr[4]).booleanValue();
                org.telegram.ui.Components.xj0 xj0Var = (org.telegram.ui.Components.xj0) objArr[5];
                char c13 = 3;
                try {
                    if (objArr.length > 8) {
                        ((Boolean) objArr[8]).getClass();
                    }
                    int measuredWidth = this.z0.getMeasuredWidth();
                    int measuredHeight = this.z0.getMeasuredHeight();
                    if (!booleanValue4 && xj0Var != null) {
                        xj0Var.setVisibility(4);
                    }
                    this.G0 = null;
                    if (objArr.length > 6) {
                        this.G0 = (View) objArr[6];
                    }
                    this.W0 = true;
                    a0(this.z0);
                    View view = this.G0;
                    if (view != null && view.getBackground() != null) {
                        this.G0.getBackground().setAlpha(0);
                    }
                    Bitmap bitmapFromWindow = Build.VERSION.SDK_INT >= 26 ? AndroidUtilities.getBitmapFromWindow(getWindow()) : null;
                    if (bitmapFromWindow == null) {
                        bitmapFromWindow = AndroidUtilities.snapshotView(this.z0);
                    }
                    View view2 = this.G0;
                    if (view2 != null && view2.getBackground() != null) {
                        this.G0.getBackground().setAlpha(255);
                    }
                    this.w0.removeView(this.o0);
                    this.o0 = new ImageView(this);
                    org.telegram.ui.Components.uj0 animatedDrawable = xj0Var != null ? xj0Var.getAnimatedDrawable() : null;
                    this.p0.setImageDrawable(animatedDrawable);
                    if (booleanValue4) {
                        this.w0.addView(this.o0, 0, w7.z5.d(-1.0f, -1));
                        this.p0.setVisibility(8);
                    } else {
                        this.w0.addView(this.o0, 1, w7.z5.d(-1.0f, -1));
                        this.p0.setTranslationX(iArr[0] - AndroidUtilities.dp(24.0f));
                        this.p0.setTranslationY(iArr[1] - AndroidUtilities.dp(24.0f));
                        this.p0.setVisibility(0);
                        this.p0.invalidate();
                    }
                    this.o0.setImageBitmap(bitmapFromWindow);
                    this.o0.setVisibility(0);
                    int i19 = measuredWidth - iArr[0];
                    int i20 = measuredHeight - iArr[1];
                    double sqrt = Math.sqrt((i20 * i20) + (i19 * i19));
                    int i21 = iArr[0];
                    int i22 = measuredHeight - iArr[1];
                    float max = (float) Math.max(sqrt, Math.sqrt((i22 * i22) + (i21 * i21)));
                    int i23 = measuredWidth - iArr[0];
                    int i24 = iArr[1];
                    double sqrt2 = Math.sqrt((i24 * i24) + (i23 * i23));
                    int i25 = iArr[0];
                    int i26 = iArr[1];
                    float max2 = Math.max(max, (float) Math.max(sqrt2, Math.sqrt((i26 * i26) + (i25 * i25))));
                    View view3 = booleanValue4 ? this.z0 : this.o0;
                    int i27 = iArr[0];
                    int i28 = iArr[1];
                    float f7 = booleanValue4 ? 0.0f : max2;
                    if (!booleanValue4) {
                        max2 = 0.0f;
                    }
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view3, i27, i28, f7, max2);
                    createCircularReveal.setDuration(400L);
                    createCircularReveal.setInterpolator(org.telegram.ui.Components.st.e);
                    createCircularReveal.addListener(new ha0(this, xj0Var, animatedDrawable, booleanValue4));
                    if (this.G0 != null) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.addUpdateListener(new k80(this, i12));
                        ofFloat.setDuration(createCircularReveal.getDuration());
                        ofFloat.start();
                    }
                    AndroidUtilities.runOnUIThread(new l80(this, i13), booleanValue4 ? (measuredHeight - iArr[1]) / AndroidUtilities.dp(2.25f) : 50L);
                    createCircularReveal.start();
                    z10 = true;
                    c11 = c13;
                } catch (Throwable th2) {
                    th = th2;
                    c12 = c13;
                    FileLog.e(th);
                    try {
                        this.o0.setImageDrawable(null);
                        this.w0.removeView(this.o0);
                        ey.x4 = false;
                        c10 = c12;
                    } catch (Exception e) {
                        FileLog.e(e);
                        c10 = c12;
                    }
                    z10 = false;
                    c11 = c10;
                    org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) objArr[0];
                    boolean booleanValue5 = ((Boolean) objArr[1]).booleanValue();
                    int intValue5 = ((Integer) objArr[c11]).intValue();
                    if (objArr.length > 7) {
                    }
                    actionBarLayout = this.q0;
                    if (actionBarLayout == null) {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                c12 = 3;
            }
            org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) objArr[0];
            boolean booleanValue52 = ((Boolean) objArr[1]).booleanValue();
            int intValue52 = ((Integer) objArr[c11]).intValue();
            Runnable runnable2 = objArr.length > 7 ? (Runnable) objArr[7] : null;
            actionBarLayout = this.q0;
            if (actionBarLayout == null) {
                return;
            }
            actionBarLayout.g(g6Var2, intValue52, booleanValue52, z10, runnable2);
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.r0;
                if (actionBarLayout3 != null) {
                    runnable = null;
                    actionBarLayout3.f(new org.telegram.ui.ActionBar.c5(g6Var2, intValue52, booleanValue52, z10), null);
                } else {
                    runnable = null;
                }
                ActionBarLayout actionBarLayout4 = this.s0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.f(new org.telegram.ui.ActionBar.c5(g6Var2, intValue52, booleanValue52, z10), runnable);
                    return;
                }
                return;
            }
            return;
        }
        c10 = 3;
        ey.x4 = false;
        z10 = false;
        c11 = c10;
        org.telegram.ui.ActionBar.g6 g6Var22 = (org.telegram.ui.ActionBar.g6) objArr[0];
        boolean booleanValue522 = ((Boolean) objArr[1]).booleanValue();
        int intValue522 = ((Integer) objArr[c11]).intValue();
        if (objArr.length > 7) {
        }
        actionBarLayout = this.q0;
        if (actionBarLayout == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if (((org.telegram.ui.sn) r0).R9() != false) goto L63;
     */
    @Override // e0.e, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.n2 R;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() != 24 && keyEvent.getKeyCode() != 25) || (R = R()) == null || R.getLastStoryViewer() == null) {
            if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
                if (VoIPService.getSharedInstance() == null) {
                    ArrayList arrayList = this.d0;
                    if (!arrayList.isEmpty() && ((!PhotoViewer.D1() || !PhotoViewer.t1().R1()) && keyEvent.getRepeatCount() == 0)) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList);
                        if (!(n2Var instanceof sn) || org.telegram.ui.ActionBar.n2.hasSheets(n2Var) || !((sn) n2Var).R9()) {
                            if (AndroidUtilities.isTablet()) {
                                ArrayList arrayList2 = this.f0;
                                if (!arrayList2.isEmpty()) {
                                    org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList2);
                                    if (n2Var2 instanceof sn) {
                                        if (!org.telegram.ui.ActionBar.n2.hasSheets(n2Var2)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (Build.VERSION.SDK_INT >= 32) {
                    boolean isSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
                    AudioManager audioManager = (AudioManager) getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    boolean z10 = audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25;
                    WebRtcAudioTrack.setSpeakerMute(z10);
                    if (isSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                        N0(z10 ? 42 : 43);
                    }
                }
            }
            try {
                return super.dispatchKeyEvent(keyEvent);
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
        ci.aa lastStoryViewer = R.getLastStoryViewer();
        lastStoryViewer.getClass();
        if (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) {
            lastStoryViewer.r(keyEvent);
            return true;
        }
        return true;
    }

    public final void e0() {
        a6 a6Var = this.Z0;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.Z0 = null;
        }
        if (this.Q) {
            return;
        }
        this.Q = true;
        NotificationCenter.ObserversGroup observersGroup = this.m1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.m1 = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.n1;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.n1 = null;
        }
        o90 o90Var = this.p1;
        if (o90Var != null) {
            LiteMode.removeOnPowerSaverAppliedListener(o90Var);
        }
    }

    public final void f0(Intent intent, pf.c cVar) {
        super.onNewIntent(intent);
        X(intent, true, false, false, cVar, true, false);
    }

    public final void g0() {
        if (this.Z0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.Z0);
            this.Z0 = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            a6 a6Var = new a6(this, 8);
            this.Z0 = a6Var;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(a6Var, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.Z0, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        if (AndroidUtilities.isTablet()) {
            boolean z10 = n2Var instanceof ey;
            if (z10 || (n2Var instanceof pg0)) {
                boolean z11 = actionBarLayout != this.q0;
                if (z11 && z10 && !((ey) n2Var).f4()) {
                    z11 = false;
                }
                if (z11) {
                    this.q0.X();
                    this.q0.c(-1, n2Var);
                    this.r0.X();
                    this.r0.getView().setVisibility(8);
                    if (!this.O0 && this.s0.getFragmentStack().isEmpty()) {
                        this.v0.setVisibility(0);
                    }
                    return false;
                }
            } else {
                if ((n2Var instanceof sn) && !((sn) n2Var).c()) {
                    boolean z12 = this.O0;
                    if (!z12 && actionBarLayout != (actionBarLayout3 = this.s0)) {
                        actionBarLayout3.getView().setVisibility(0);
                        this.v0.setVisibility(8);
                        this.s0.X();
                        this.s0.c(-1, n2Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout4 = this.r0;
                                actionBarLayout4.a0(actionBarLayout4.getFragmentStack().get(0), false);
                            }
                            this.r0.l(true, false);
                            return false;
                        }
                    } else if (z12 && actionBarLayout != (actionBarLayout2 = this.q0)) {
                        actionBarLayout2.c(-1, n2Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout5 = this.r0;
                                actionBarLayout5.a0(actionBarLayout5.getFragmentStack().get(0), false);
                            }
                            this.r0.l(true, false);
                            return false;
                        }
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout6 = this.r0;
                if (actionBarLayout != actionBarLayout6) {
                    actionBarLayout6.getView().setVisibility(0);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 4) {
                            i10 = -1;
                            break;
                        }
                        if (UserConfig.getInstance(i10).isClientActivated()) {
                            break;
                        }
                        i10++;
                    }
                    if ((n2Var instanceof fg0) && i10 == -1) {
                        this.v0.setVisibility(0);
                        this.u0.setBackgroundColor(0);
                    } else {
                        this.u0.setBackgroundColor(2130706432);
                    }
                    this.r0.c(-1, n2Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void h0() {
        if (this.Z0 != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.Z0);
            this.Z0 = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            K0(true, false, -1, -1, null);
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    public final void i0() {
        org.telegram.ui.ActionBar.b2 b2Var = this.V0;
        if (b2Var != null) {
            try {
                b2Var.dismiss();
            } finally {
                this.V0 = null;
            }
        }
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
        this.P0 = null;
        this.T0 = null;
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean j() {
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(true, false);
            return true;
        }
        if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(true, false);
            return true;
        }
        if (!l4.I() || !l4.x().V) {
            return false;
        }
        l4.x().o(true, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(boolean z10) {
        ArrayList arrayList;
        String str;
        Matcher matcher;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("canSelectTopics", true);
        bundle.putInt("dialogsType", 3);
        bundle.putBoolean("allowSwitchAccount", true);
        ArrayList arrayList2 = this.a0;
        if (arrayList2 == null) {
            bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
            bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendMessagesToGroupText));
        } else if (arrayList2.size() != 1) {
            bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
            bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
        }
        ey eyVar = new ey(bundle);
        eyVar.C2 = this;
        if (this.R != null || ((arrayList = this.U) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.U;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(sn.K7(this.U, false, null));
            }
            String str2 = this.R;
            if (str2 != null) {
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str2, 0, true, 0, 0, 0L));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.T)) {
                    ((MediaController.PhotoEntry) arrayList3.get(0)).caption = this.T;
                }
                CharSequence charSequence = this.T;
                if (arrayList3.isEmpty()) {
                    eyVar.D2 = null;
                } else {
                    eyVar.D2 = arrayList3;
                    eyVar.E2 = null;
                    eyVar.M2 = false;
                    if (eyVar.B1 != null) {
                        eyVar.i3(charSequence);
                    } else {
                        eyVar.V3 = charSequence;
                    }
                }
            }
        } else if (!TextUtils.isEmpty(this.T)) {
            CharSequence charSequence2 = this.T;
            int i10 = org.telegram.ui.Components.ir0.I;
            if (charSequence2 != null && charSequence2.length() != 0) {
                try {
                    matcher = AndroidUtilities.WEB_URL.matcher(charSequence2);
                } catch (Exception unused) {
                }
                if (matcher.find()) {
                    str = charSequence2.subSequence(matcher.start(), matcher.end()).toString();
                    if (str == null) {
                        eyVar.C4(this.T, str);
                    } else {
                        CharSequence charSequence3 = this.T;
                        if (charSequence3 == null || charSequence3.length() == 0) {
                            eyVar.F2 = null;
                        } else {
                            eyVar.F2 = charSequence3;
                            eyVar.E2 = null;
                            eyVar.D2 = null;
                            if (eyVar.B1 != null) {
                                eyVar.i3(charSequence3);
                            } else {
                                eyVar.V3 = charSequence3;
                            }
                        }
                    }
                }
            }
            str = null;
            if (str == null) {
            }
        }
        ((ActionBarLayout) O()).S(eyVar, !AndroidUtilities.isTablet() ? this.q0.getFragmentStack().size() <= 1 || !(this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1) instanceof pg0) : this.r0.getFragmentStack().isEmpty() || !(this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1) instanceof pg0), !z10);
        if (SecretMediaViewer.g() && SecretMediaViewer.f().s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (l4.I() && l4.x().V) {
            l4.x().o(false, true);
        }
        ei.vb.w();
        s50 s50Var = s50.D3;
        if (s50Var != null) {
            s50Var.dismiss();
        }
        if (z10 || !AndroidUtilities.isTablet()) {
            return;
        }
        this.q0.U(true, true);
        this.s0.U(true, true);
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.q0 && actionBarLayout.getFragmentStack().size() <= 1 && !this.l1) {
                e0();
                finish();
                return false;
            }
            if (actionBarLayout == this.s0) {
                if (!this.O0) {
                    this.v0.setVisibility(0);
                    return true;
                }
            } else if (actionBarLayout == this.r0 && this.q0.getFragmentStack().isEmpty() && this.r0.getFragmentStack().size() == 1) {
                e0();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            e0();
            finish();
            return false;
        }
        return true;
    }

    public final void k0(TL_account.Password password) {
        String str;
        fg0 fg0Var = new fg0();
        l80 l80Var = new l80(this, 0);
        fg0Var.F = 3;
        fg0Var.a = 12;
        fg0Var.d0 = l80Var;
        if (password == null || (str = password.login_email_pattern) == null) {
            t0(fg0Var);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
        int indexOf = password.login_email_pattern.indexOf(42);
        int lastIndexOf = password.login_email_pattern.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            org.telegram.ui.Components.l11 l11Var = new org.telegram.ui.Components.l11();
            l11Var.a |= 256;
            l11Var.b = indexOf;
            int i10 = lastIndexOf + 1;
            l11Var.c = i10;
            valueOf.setSpan(new org.telegram.ui.Components.m11(l11Var, 0), indexOf, i10, 0);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        alertDialog$Builder.a.R = valueOf;
        alertDialog$Builder.a.T = LocaleController.getString(R.string.EmailLoginChangeMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChangeEmail), new ov(11, this, fg0Var));
        i0.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x00ce, code lost:
    
        if (r3.getArguments().getLong("community_id", 0) != 0) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011c A[SYNTHETIC] */
    @Override // org.telegram.ui.ActionBar.a5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.b5 b5Var) {
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        int i10;
        ActionBarLayout actionBarLayout5;
        ActionBarLayout actionBarLayout6;
        org.telegram.ui.ActionBar.n2 n2Var = b5Var.a;
        boolean z10 = b5Var.b;
        boolean z11 = b5Var.c;
        if (l4.I() && l4.x().V) {
            l4.x().o(false, true);
        }
        if (AndroidUtilities.isTablet()) {
            if (n2Var instanceof pg0) {
                ActionBarLayout actionBarLayout7 = this.q0;
                if (actionBarLayout != actionBarLayout7) {
                    actionBarLayout7.X();
                    org.telegram.ui.ActionBar.d5 O = O();
                    b5Var.b = z10;
                    b5Var.c = z11;
                    b5Var.d = false;
                    ((ActionBarLayout) O).R(b5Var);
                    this.r0.X();
                    this.r0.getView().setVisibility(8);
                    if (!this.O0 && this.s0.getFragmentStack().isEmpty()) {
                        this.v0.setVisibility(0);
                        return false;
                    }
                    return false;
                }
                if ((!(n2Var instanceof sn) && !((sn) n2Var).c()) || b5Var.g || (actionBarLayout == (actionBarLayout3 = this.s0) && (actionBarLayout3.getFragmentStack().size() > 1 || !(this.s0.getLastFragment() instanceof sn)))) {
                    boolean z12 = this.O0;
                    if ((!z12 && actionBarLayout == this.s0) || (z12 && actionBarLayout == this.q0)) {
                        ActionBarLayout actionBarLayout8 = this.s0;
                        if (actionBarLayout == actionBarLayout8) {
                            if (actionBarLayout8.getView() != null) {
                                this.s0.getView().setVisibility(0);
                            }
                            this.v0.setVisibility(8);
                        }
                        boolean z13 = (this.O0 && actionBarLayout == (actionBarLayout6 = this.q0) && actionBarLayout6.getFragmentStack().size() == 1) ? false : true;
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout9 = this.r0;
                                actionBarLayout9.a0(actionBarLayout9.getFragmentStack().get(0), false);
                            }
                            this.r0.l(!z11, false);
                        }
                        if (!z13) {
                            org.telegram.ui.ActionBar.d5 O2 = O();
                            b5Var.c = z11;
                            b5Var.d = false;
                            ((ActionBarLayout) O2).R(b5Var);
                        }
                        return z13;
                    }
                    if (!z12 && actionBarLayout != (actionBarLayout5 = this.s0) && actionBarLayout5 != null) {
                        if (actionBarLayout5.getView() != null) {
                            this.s0.getView().setVisibility(0);
                        }
                        this.v0.setVisibility(8);
                        this.s0.X();
                        ActionBarLayout actionBarLayout10 = this.s0;
                        b5Var.c = true;
                        b5Var.b = z10;
                        b5Var.d = false;
                        actionBarLayout10.R(b5Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout11 = this.r0;
                                actionBarLayout11.a0(actionBarLayout11.getFragmentStack().get(0), false);
                            }
                            this.r0.l(!z11, false);
                            return false;
                        }
                    } else {
                        if (!z12 || actionBarLayout == this.q0) {
                            ActionBarLayout actionBarLayout12 = this.r0;
                            if (actionBarLayout12 != null && actionBarLayout12.getFragmentStack() != null && !this.r0.getFragmentStack().isEmpty()) {
                                while (this.r0.getFragmentStack().size() - 1 > 0) {
                                    ActionBarLayout actionBarLayout13 = this.r0;
                                    actionBarLayout13.a0(actionBarLayout13.getFragmentStack().get(0), false);
                                }
                                this.r0.l(!z11, false);
                            }
                            org.telegram.ui.ActionBar.d5 O3 = O();
                            b5Var.b = this.q0.getFragmentStack().size() > 1;
                            b5Var.c = z11;
                            b5Var.d = false;
                            ((ActionBarLayout) O3).R(b5Var);
                            return false;
                        }
                        org.telegram.ui.ActionBar.d5 O4 = O();
                        b5Var.b = this.q0.getFragmentStack().size() > 1;
                        b5Var.c = z11;
                        b5Var.d = false;
                        ((ActionBarLayout) O4).R(b5Var);
                        if (!this.r0.getFragmentStack().isEmpty()) {
                            while (this.r0.getFragmentStack().size() - 1 > 0) {
                                ActionBarLayout actionBarLayout14 = this.r0;
                                actionBarLayout14.a0(actionBarLayout14.getFragmentStack().get(0), false);
                            }
                            this.r0.l(!z11, false);
                        }
                    }
                    return false;
                }
                actionBarLayout4 = this.r0;
                if (actionBarLayout4 != null && actionBarLayout != actionBarLayout4) {
                    actionBarLayout4.getView().setVisibility(0);
                    i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            i10 = -1;
                            break;
                        }
                        if (UserConfig.getInstance(i10).isClientActivated()) {
                            break;
                        }
                        i10++;
                    }
                    if ((n2Var instanceof fg0) || i10 != -1) {
                        this.u0.setBackgroundColor(2130706432);
                    } else {
                        this.v0.setVisibility(0);
                        this.u0.setBackgroundColor(0);
                    }
                    ActionBarLayout actionBarLayout15 = this.r0;
                    b5Var.b = z10;
                    b5Var.c = z11;
                    b5Var.d = false;
                    actionBarLayout15.R(b5Var);
                    return false;
                }
            } else {
                if (n2Var instanceof ey) {
                    ey eyVar = (ey) n2Var;
                    if (eyVar.f4() && actionBarLayout != (actionBarLayout2 = this.q0)) {
                        actionBarLayout2.X();
                        org.telegram.ui.ActionBar.d5 O5 = O();
                        b5Var.b = z10;
                        b5Var.c = z11;
                        b5Var.d = false;
                        ((ActionBarLayout) O5).R(b5Var);
                        this.r0.X();
                        this.r0.getView().setVisibility(8);
                        if (!this.O0 && this.s0.getFragmentStack().isEmpty()) {
                            this.v0.setVisibility(0);
                            return false;
                        }
                        return false;
                    }
                    if (actionBarLayout == this.q0) {
                        if (eyVar.getArguments() != null) {
                            if (eyVar.getArguments().getInt("folderId", 0) != 1) {
                            }
                        }
                    }
                }
                if (!(n2Var instanceof sn)) {
                }
                actionBarLayout4 = this.r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.getView().setVisibility(0);
                    i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                        }
                        i10++;
                    }
                    if (n2Var instanceof fg0) {
                    }
                    this.u0.setBackgroundColor(2130706432);
                    ActionBarLayout actionBarLayout152 = this.r0;
                    b5Var.b = z10;
                    b5Var.c = z11;
                    b5Var.d = false;
                    actionBarLayout152.R(b5Var);
                    return false;
                }
            }
        }
        return true;
    }

    public final void l0(final long j10, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i10, final int i11) {
        if (num != null) {
            TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
            tL_channels_getMessages.channel = MessagesController.getInstance(this.O).getInputChannel(-j10);
            tL_channels_getMessages.id.add(num);
            ConnectionsManager.getInstance(this.O).sendRequest(tL_channels_getMessages, new RequestDelegate() { // from class: org.telegram.ui.f80
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    Pattern pattern = LaunchActivity.C1;
                    AndroidUtilities.runOnUIThread(new u80(LaunchActivity.this, tLObject, num, num2, bArr, j10, runnable, str, i10, i11));
                }
            });
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j10);
        t0(te1.F0(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void m0(TLRPC.TL_error tL_error, long j10) {
        sn snVar = new sn(z7.g5.a(j10, "user_id"));
        t0(snVar);
        AndroidUtilities.runOnUIThread(new lq(tL_error, snVar, MessagesController.getInstance(this.O).getUser(Long.valueOf(j10)), 13), 300L);
    }

    public final void n0(int i10, String str, String str2, pf.c cVar) {
        if (cVar != null) {
            cVar.d();
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLRPC.TL_contacts_importContactToken tL_contacts_importContactToken = new TLRPC.TL_contacts_importContactToken();
        tL_contacts_importContactToken.token = str;
        ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_importContactToken, new org.telegram.messenger.gi(this, cVar, str, messagesController, i10, str2));
    }

    public final void o0(int i10, String str, String str2, pf.c cVar) {
        if (cVar != null) {
            cVar.d();
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        messagesController.getUserNameResolver().resolve(str, null, new ai.c5(this, messagesController, cVar, i10, str2, 1));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.k0 == actionMode) {
            this.k0 = null;
        }
        if (actionMode.getType() == 1) {
            return;
        }
        ActionBarLayout actionBarLayout = this.q0;
        org.telegram.ui.ActionBar.k kVar = actionBarLayout.y;
        if (kVar != null) {
            kVar.setVisibility(0);
        }
        actionBarLayout.w0 = false;
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = this.s0;
            org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.y;
            if (kVar2 != null) {
                kVar2.setVisibility(0);
            }
            actionBarLayout2.w0 = false;
            ActionBarLayout actionBarLayout3 = this.r0;
            org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.y;
            if (kVar3 != null) {
                kVar3.setVisibility(0);
            }
            actionBarLayout3.w0 = false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.k0 = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.q0.s(menu) && AndroidUtilities.isTablet() && !this.s0.s(menu)) {
                this.r0.s(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (actionMode.getType() == 1) {
            return;
        }
        ActionBarLayout actionBarLayout = this.q0;
        org.telegram.ui.ActionBar.k kVar = actionBarLayout.y;
        if (kVar != null) {
            kVar.setVisibility(8);
        }
        actionBarLayout.w0 = true;
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = this.s0;
            org.telegram.ui.ActionBar.k kVar2 = actionBarLayout2.y;
            if (kVar2 != null) {
                kVar2.setVisibility(8);
            }
            actionBarLayout2.w0 = true;
            ActionBarLayout actionBarLayout3 = this.r0;
            org.telegram.ui.ActionBar.k kVar3 = actionBarLayout3.y;
            if (kVar3 != null) {
                kVar3.setVisibility(8);
            }
            actionBarLayout3.w0 = true;
        }
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        ci.q4 currentPeerView;
        org.telegram.ui.Components.j91 j91Var;
        VoIPService sharedInstance;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.O).saveConfig(false);
        }
        if (i10 == 105) {
            boolean canDrawOverlays = Settings.canDrawOverlays(this);
            ApplicationLoader.canDrawOverlays = canDrawOverlays;
            if (canDrawOverlays) {
                s50 s50Var = s50.D3;
                if (s50Var != null) {
                    s50Var.dismissInternal();
                }
                AndroidUtilities.runOnUIThread(new l80(this, 4), 200L);
                return;
            }
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 >= 22336 && i10 <= 22399) {
            org.telegram.ui.Wallet.w0 w0Var = w7.h6.b;
            if (w0Var != null && w0Var.e == this && w0Var.f && w0Var.g == i10) {
                w0Var.c(i11 != -1 ? "AUTH_CANCELED" : null);
                return;
            }
            return;
        }
        if (i10 == 520) {
            if (i11 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        if (i10 == 140) {
            LocationController.getInstance(this.O).startFusedLocationRequest(i11 == -1);
            return;
        }
        if (i10 == 521) {
            ig.l0 l0Var = this.q1;
            if (l0Var != null) {
                l0Var.run(Boolean.valueOf(i11 == -1));
                this.q1 = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null && (j91Var = themeEditorView.k) != null) {
            j91Var.a(i10, i11, intent);
        }
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            org.telegram.ui.ActionBar.n2 n2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
            n2Var.onActivityResultFragment(i10, i11, intent);
            if (n2Var.getLastStoryViewer() != null && (currentPeerView = n2Var.getLastStoryViewer().n0.getCurrentPeerView()) != null && i11 == -1) {
                if (i10 == 0 || i10 == 2) {
                    currentPeerView.t0();
                    ci.b3 b3Var = currentPeerView.I2;
                    if (b3Var != null) {
                        b3Var.j0.g0(i10, intent, null);
                    }
                } else if (i10 == 21) {
                    if (intent == null) {
                        currentPeerView.Z0();
                    } else {
                        if (intent.getData() != null) {
                            currentPeerView.S0(intent.getData());
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                currentPeerView.S0(clipData.getItemAt(i12).getUri());
                            }
                        } else {
                            currentPeerView.Z0();
                        }
                        ci.b3 b3Var2 = currentPeerView.I2;
                        if (b3Var2 != null) {
                            b3Var2.dismiss();
                        }
                        currentPeerView.k0(true);
                    }
                }
            }
        }
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = this.s0;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
            }
            ActionBarLayout actionBarLayout3 = this.r0;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onActivityResultFragment(i10, i11, intent);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i10), Integer.valueOf(i11), intent);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onBackPressed() {
        if (d0(true)) {
            if (!AndroidUtilities.isTablet()) {
                this.q0.G();
                return;
            }
            ActionBarLayout actionBarLayout = this.r0;
            if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                this.r0.G();
                return;
            }
            ActionBarLayout actionBarLayout2 = this.s0;
            if (actionBarLayout2 == null || actionBarLayout2.getView().getVisibility() != 0 || this.s0.getFragmentStack().isEmpty()) {
                this.q0.G();
                return;
            }
            org.telegram.ui.ActionBar.n2 n2Var = this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1);
            if (n2Var.onBackPressed(true)) {
                n2Var.finishFragment();
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        this.t1.a();
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.n0.getClass();
        Log.i("PIP_DEBUG", "[Activity] onConfigurationChanged");
        AndroidUtilities.resetTabletFlag();
        b0();
        F();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
        if (pipRoundVideoView != null) {
            int i10 = pipRoundVideoView.x.getInt("sidex", 1);
            int i11 = pipRoundVideoView.x.getInt("sidey", 0);
            float f7 = pipRoundVideoView.x.getFloat("px", 0.0f);
            float f10 = pipRoundVideoView.x.getFloat("py", 0.0f);
            pipRoundVideoView.v.x = PipRoundVideoView.b(f7, i10, pipRoundVideoView.h, true);
            pipRoundVideoView.v.y = PipRoundVideoView.b(f10, i11, pipRoundVideoView.n, false);
            pipRoundVideoView.w.updateViewLayout(pipRoundVideoView.a, pipRoundVideoView.v);
        }
        org.telegram.ui.Components.cv cvVar = org.telegram.ui.Components.cv.S;
        if (cvVar != null) {
            cvVar.onConfigurationChanged(configuration);
        }
        ug.l lVar = ug.l.e;
        if (lVar != null) {
            lVar.onConfigurationChanged(configuration);
        }
        Drawable[] drawableArr = PhotoViewer.U8;
        ThemeEditorView themeEditorView = ThemeEditorView.n;
        if (themeEditorView != null) {
            int i12 = themeEditorView.j.getInt("sidex", 1);
            int i13 = themeEditorView.j.getInt("sidey", 0);
            float f11 = themeEditorView.j.getFloat("px", 0.0f);
            float f12 = themeEditorView.j.getFloat("py", 0.0f);
            themeEditorView.g.x = ThemeEditorView.b(f11, i12, themeEditorView.e, true);
            themeEditorView.g.y = ThemeEditorView.b(f12, i13, themeEditorView.f, false);
            try {
                if (themeEditorView.a.getParent() != null) {
                    themeEditorView.h.updateViewLayout(themeEditorView.a, themeEditorView.g);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (org.telegram.ui.ActionBar.h6.o == 3) {
            org.telegram.ui.ActionBar.h6.E(false);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.fragment.app.v, androidx.activity.m, e0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ActionBarLayout actionBarLayout;
        Intent intent;
        Uri data;
        D1 = true;
        E1++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        H1 = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.O = UserConfig.selectedAccount;
        registerReceiver(this.f1, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.O).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                super.onCreate(bundle);
                finish();
                return;
            } else if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                String lowerCase = data.toString().toLowerCase();
                if (!lowerCase.startsWith("tg:proxy") && !lowerCase.startsWith("tg://proxy") && !lowerCase.startsWith("tg:webproxy") && !lowerCase.startsWith("tg://webproxy") && !lowerCase.startsWith("tg:socks")) {
                    lowerCase.startsWith("tg://socks");
                }
            }
        }
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        int i10 = 0;
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.s8, false) | (-16777216)));
        } catch (Throwable unused) {
        }
        int i11 = 2;
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        getWindow().setFormat(-1);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new org.telegram.ui.Components.tg0(28));
        this.e1 = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        org.telegram.ui.ActionBar.h6.O();
        org.telegram.ui.ActionBar.h6.S(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.q0 = new ActionBarLayout(this, true);
        m0 m0Var = new m0(this, this, 10);
        this.w0 = m0Var;
        m0Var.setClipToPadding(false);
        this.w0.setClipChildren(false);
        setContentView(this.w0);
        this.g1 = new qh.e(this.w0);
        ja0 ja0Var = new ja0(this);
        com.google.firebase.messaging.l lVar = this.m0;
        ((rf.b) lVar.b).a.add(ja0Var);
        ((ViewGroup) getWindow().getDecorView()).addView(lVar.v());
        lVar.v().bringToFront();
        ImageView imageView = new ImageView(this);
        this.o0 = imageView;
        imageView.setVisibility(8);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.z0 = y3Var;
        y3Var.setActionBarLayout(this.q0);
        this.z0.addOnLayoutChangeListener(new ka0());
        this.z0.setClipChildren(false);
        this.z0.setClipToPadding(false);
        this.w0.addView(this.z0, w7.z5.d(-1.0f, -1));
        ig.k kVar = new ig.k(this, 4);
        this.p0 = kVar;
        kVar.setScaleType(ImageView.ScaleType.CENTER);
        this.w0.addView(this.p0, w7.z5.d(48.0f, 48));
        this.p0.setVisibility(8);
        m0 m0Var2 = this.w0;
        org.telegram.ui.ActionBar.w3 w3Var = new org.telegram.ui.ActionBar.w3(this);
        this.y0 = w3Var;
        m0Var2.addView(w3Var);
        m0 m0Var3 = this.w0;
        la0 la0Var = new la0(this);
        la0Var.setVisibility(8);
        this.x0 = la0Var;
        m0Var3.addView(la0Var);
        E0();
        this.z0.setParentActionBarLayout(this.q0);
        this.q0.setDrawerLayoutContainer(this.z0);
        this.q0.setFragmentStack(this.d0);
        this.q0.setFragmentStackChangedListener(new l80(this, i11));
        this.q0.setDelegate(this);
        org.telegram.ui.ActionBar.h6.k1(true);
        A();
        Q0();
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i12 = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i12, this);
        this.c0 = ConnectionsManager.getInstance(this.O).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.n1;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.n1 = null;
        }
        this.n1 = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i12).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        o90 o90Var = new o90(this, i10);
        this.p1 = o90Var;
        LiteMode.addOnPowerSaverAppliedListener(o90Var);
        if (this.q0.getFragmentStack().isEmpty() && ((actionBarLayout = this.r0) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (UserConfig.getInstance(this.O).isClientActivated()) {
                this.q0.c(-1, new pg0());
            } else {
                this.q0.c(-1, Q());
            }
            if (bundle != null) {
                try {
                    String string = bundle.getString("fragment");
                    if (string != null) {
                        Bundle bundle2 = bundle.getBundle("args");
                        switch (string.hashCode()) {
                            case -1529105743:
                                if (string.equals("wallpapers")) {
                                    WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(0);
                                    this.q0.c(-1, wallpapersListActivity);
                                    wallpapersListActivity.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case -1349522494:
                                if (string.equals("chat_profile") && bundle2 != null) {
                                    ProfileActivity profileActivity = new ProfileActivity(bundle2, null);
                                    if (this.q0.c(-1, profileActivity)) {
                                        profileActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 3052376:
                                if (string.equals("chat") && bundle2 != null) {
                                    sn snVar = new sn(bundle2);
                                    if (this.q0.c(-1, snVar)) {
                                        snVar.V7 = bundle.getString("path");
                                        break;
                                    }
                                }
                                break;
                            case 98629247:
                                if (string.equals("group") && bundle2 != null) {
                                    u60 u60Var = new u60(bundle2);
                                    if (this.q0.c(-1, u60Var)) {
                                        u60Var.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 738950403:
                                if (string.equals("channel") && bundle2 != null) {
                                    od odVar = new od(bundle2);
                                    if (this.q0.c(-1, odVar)) {
                                        odVar.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case 1434631203:
                                if (string.equals("settings")) {
                                    bundle2.putLong("user_id", UserConfig.getInstance(this.O).clientUserId);
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2, null);
                                    this.q0.c(-1, profileActivity2);
                                    profileActivity2.restoreSelfArgs(bundle);
                                    break;
                                }
                                break;
                            case 1523894383:
                                if (string.equals("settings2")) {
                                    this.q0.c(-1, new z71(null));
                                    break;
                                }
                                break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        F();
        H(false, true, !this.W0);
        X(getIntent(), false, bundle != null, false, null, true, true);
        try {
            String str = Build.DISPLAY;
            String str2 = Build.USER;
            String lowerCase2 = str != null ? str.toLowerCase() : "";
            String lowerCase3 = str2 != null ? lowerCase2.toLowerCase() : "";
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("OS name " + lowerCase2 + " " + lowerCase3);
            }
            if ((lowerCase2.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                AndroidUtilities.incorrectDisplaySizeFix = true;
                View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                p90 p90Var = new p90(rootView, i10);
                this.g0 = p90Var;
                viewTreeObserver.addOnGlobalLayoutListener(p90Var);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i13 = Build.VERSION.SDK_INT;
        FingerprintController.checkKeyReady();
        if (i13 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000) {
            int i14 = 3;
            if (SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
                Pattern pattern = org.telegram.ui.Components.f5.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                String string2 = LocaleController.getString(R.string.AllowBackgroundActivity);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string2;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(OneUIUtilities.isOneUI() ? i13 >= 31 ? R.string.AllowBackgroundActivityInfoOneUIAboveS : R.string.AllowBackgroundActivityInfoOneUIBelowS : R.string.AllowBackgroundActivityInfo));
                alertDialog$Builder.m(R.raw.permission_request_apk, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new org.telegram.ui.Components.h1(this, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                b2Var.setOnDismissListener(new ei.e1(i14));
                b2Var.show();
                SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
            }
        }
        if (i13 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new ma0(this));
        }
        org.telegram.ui.Components.qc.a(this.w0, new ei.o8(10));
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        t21.V(false);
        if (i13 >= 34) {
            if (this.j1 == null) {
                this.j1 = new na0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.j1);
        } else if (i13 >= 33) {
            if (this.k1 == null) {
                this.k1 = new oa0(this);
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.k1);
        }
        B();
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onDestroy() {
        zf.x xVar;
        m0 m0Var;
        org.telegram.ui.Wallet.w0 w0Var = w7.h6.b;
        if (w0Var != null && w0Var.e == this) {
            w0Var.c("AUTH_CANCELED");
            w7.h6.b.e();
        }
        D1 = false;
        E1--;
        unregisterReceiver(this.f1);
        if (E1 == 0) {
            if (PhotoViewer.b9 != null) {
                PhotoViewer.b9.Q0();
            }
            if (PhotoViewer.D1()) {
                PhotoViewer.t1().Q0();
            }
            if (SecretMediaViewer.g()) {
                SecretMediaViewer f7 = SecretMediaViewer.f();
                Runnable runnable = f7.p1;
                if (runnable != null) {
                    runnable.run();
                    f7.p1 = null;
                }
                pa0 pa0Var = f7.l1;
                if (pa0Var != null) {
                    pa0Var.destroy();
                    f7.l1 = null;
                }
                NotificationCenter.getInstance(f7.a).removeObserver(f7, NotificationCenter.messagesDeleted);
                NotificationCenter.getInstance(f7.a).removeObserver(f7, NotificationCenter.updateMessageMedia);
                NotificationCenter.getInstance(f7.a).removeObserver(f7, NotificationCenter.didCreatedNewDeleteTask);
                f7.s = false;
                f7.N = null;
                ImageReceiver.BitmapHolder bitmapHolder = f7.i0;
                if (bitmapHolder != null) {
                    bitmapHolder.release();
                    f7.i0 = null;
                }
                f7.i();
                if (f7.b != null && (m0Var = f7.d) != null) {
                    try {
                        if (m0Var.getParent() != null) {
                            ((WindowManager) f7.b.getSystemService("window")).removeViewImmediate(f7.d);
                        }
                        f7.d = null;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                SecretMediaViewer.x1 = null;
            }
            if (l4.I()) {
                l4.x().t();
            }
            if (gt.g0 != null) {
                gt q6 = gt.q();
                q6.E = false;
                q6.l = null;
                q6.W = null;
                q6.Y = null;
                q6.a0 = null;
                if (q6.w != null && q6.y != null) {
                    Bitmap bitmap = q6.v;
                    if (bitmap != null) {
                        bitmap.recycle();
                        q6.v = null;
                    }
                    q6.M = 0.0f;
                    q6.K = false;
                    try {
                        if (q6.y.getParent() != null) {
                            ((WindowManager) q6.w.getSystemService("window")).removeViewImmediate(q6.y);
                        }
                        q6.y = null;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                    gt.g0 = null;
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 8);
                }
            }
            s50 s50Var = s50.D3;
            if (s50Var != null) {
                s50Var.dismissInternal();
            }
            PipRoundVideoView pipRoundVideoView = PipRoundVideoView.F;
            if (pipRoundVideoView != null) {
                pipRoundVideoView.a(false);
            }
            int i10 = org.telegram.ui.ActionBar.h6.a;
            org.telegram.ui.Components.cv cvVar = org.telegram.ui.Components.cv.S;
            if (cvVar != null) {
                cvVar.H();
            }
            ThemeEditorView themeEditorView = ThemeEditorView.n;
            if (themeEditorView != null) {
                themeEditorView.a();
            }
            ng.i iVar = w7.d0.a;
            if (iVar != null) {
                iVar.e.edit().putFloat("x", (float) iVar.c.u.i).putFloat("y", (float) iVar.d.u.i).commit();
            }
            w7.d0.a = null;
            SparseArray sparseArray = org.telegram.ui.Components.r5.q;
            if (sparseArray != null) {
                sparseArray.clear();
            }
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.s1, false);
        for (int i11 = 0; i11 < this.E0.size(); i11++) {
            try {
                if (((Dialog) this.E0.get(i11)).isShowing()) {
                    ((Dialog) this.E0.get(i11)).dismiss();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.E0.clear();
        try {
            if (this.g0 != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.g0);
            }
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            if (this.j1 != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.j1);
            }
        } else if (i12 >= 33 && this.j1 != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.k1);
        }
        org.telegram.ui.Components.qc.h(this.w0);
        VideoAds.dropCache();
        J();
        super.onDestroy();
        e0();
        FlagSecureReason flagSecureReason = this.e1;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i12 < 24 || (xVar = this.i1) == null) {
            return;
        }
        xVar.c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (l4.I() && l4.x().V) {
                return super.onKeyUp(i10, keyEvent);
            }
            if (!AndroidUtilities.isTablet()) {
                this.q0.getView().onKeyUp(i10, keyEvent);
            } else if (this.r0.getView().getVisibility() == 0 && !this.r0.getFragmentStack().isEmpty()) {
                this.r0.getView().onKeyUp(i10, keyEvent);
            } else if (this.s0.getView().getVisibility() != 0 || this.s0.getFragmentStack().isEmpty()) {
                this.q0.getView().onKeyUp(i10, keyEvent);
            } else {
                this.s0.getView().onKeyUp(i10, keyEvent);
            }
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null) {
            actionBarLayout.J();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.s0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.J();
                }
                ActionBarLayout actionBarLayout3 = this.r0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.J();
                }
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        AndroidUtilities.isInMultiwindow = z10;
        this.t1.a();
        F();
        super.onMultiWindowModeChanged(z10);
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        X(intent, true, false, false, null, true, true);
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onPause() {
        VoIPService sharedInstance;
        super.onPause();
        F1 = false;
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPause");
        if (AndroidUtilities.isInPictureInPictureMode(bVar.d) && bVar.e() && Build.VERSION.SDK_INT >= 31) {
            bVar.b();
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        Utilities.stageQueue.postRunnable(new gi.l2(this.O, 12));
        g0();
        this.q0.L();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.s0;
            if (actionBarLayout != null) {
                actionBarLayout.L();
            }
            ActionBarLayout actionBarLayout2 = this.r0;
            if (actionBarLayout2 != null) {
                actionBarLayout2.L();
            }
        }
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var != null) {
            ne0Var.b.j();
        }
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.Components.le0) obj).j();
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(!(ApplicationLoader.applicationLoaderInstance != null ? r1.onPause() : false), false);
        if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            if (t12.j2 != null) {
                t12.G0(false, false);
            } else {
                org.telegram.ui.Components.a81 a81Var = t12.F2;
                if (a81Var != null && t12.Z2) {
                    a81Var.N(AndroidUtilities.isInPictureInPictureMode(t12.y));
                }
            }
        }
        ei.vb vbVar = ei.vb.F2;
        if (vbVar != null) {
            vbVar.u(false);
            ei.lb lbVar = vbVar.c1;
            if (lbVar != null) {
                lbVar.f.r();
            }
            ei.jb jbVar = vbVar.X0;
            if (jbVar != null) {
                jbVar.x(0, true);
            }
        }
        jh1 jh1Var = jh1.n1;
        if (jh1Var != null) {
            boolean isInteractive = ((PowerManager) jh1Var.b.getSystemService("power")).isInteractive();
            int a2 = uf.b.a(jh1Var.b);
            boolean z10 = a2 > 0;
            if (jh1Var.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting() && a2 == 2) {
                int measuredHeight = jh1.n1.u0.getMeasuredHeight();
                jh1 jh1Var2 = jh1.n1;
                org.telegram.ui.Components.voip.k2.l(jh1Var2.b, jh1Var2.a, jh1Var2.u0.getMeasuredWidth(), measuredHeight, 0);
                WindowInsets windowInsets = jh1.n1.r0;
                if (windowInsets != null) {
                    org.telegram.ui.Components.voip.k2.X = windowInsets.getSystemWindowInsetTop();
                    jh1.n1.r0.getSystemWindowInsetBottom();
                }
            }
            if (jh1Var.n0 && ((!z10 || !isInteractive) && (sharedInstance = VoIPService.getSharedInstance()) != null)) {
                sharedInstance.setVideoState(false, 1);
            }
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                org.telegram.ui.Components.voip.k2 k10 = org.telegram.ui.Components.voip.k2.k();
                if (k10.d.type == 99) {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (k10.G) {
                        sharedInstance2.setVideoState(false, 1);
                    }
                }
            }
        }
        HashMap hashMap = wh.f.n;
        if (hashMap == null) {
            return;
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            wh.e eVar = ((wh.f) it.next()).f;
            if (eVar != null) {
                eVar.b = true;
            }
        }
    }

    @Override // androidx.activity.m, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        super.onPictureInPictureModeChanged(z10, configuration);
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureModeChanged " + z10);
        if (bVar.f) {
            if (z10) {
                bVar.d(1.0f);
                bVar.j.a();
                ArrayList arrayList = bVar.b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((sf.b) obj).getClass();
                }
                if (bVar.n) {
                    bVar.n = false;
                    bVar.l.removeFrameCallback(bVar.m);
                }
                ArrayList arrayList2 = bVar.a;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    ((sf.c) obj2).f();
                }
            } else if (bVar.e) {
                bVar.c(false);
            } else {
                bVar.a(true);
            }
        }
        if (z10 || this.r1) {
            return;
        }
        if (org.telegram.ui.Components.voip.h1.d0.V) {
            org.telegram.ui.Components.voip.h1.j();
        }
        if (ci.p1.Z.S) {
            ci.p1.j();
        }
        if (org.telegram.ui.Components.zg0.p0.P) {
            org.telegram.ui.Components.zg0.j(false);
        }
        s50.u1(this, null, false, true);
        if (PhotoViewer.b9 != null) {
            PhotoViewer.b9.Q0();
        }
        if (PhotoViewer.D1()) {
            PhotoViewer.t1().G0(false, false);
        }
    }

    @Override // android.app.Activity
    public final boolean onPictureInPictureRequested() {
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onPictureInPictureRequested");
        bVar.f();
        return super.onPictureInPictureRequested();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        this.n0.g(pictureInPictureUiState);
    }

    @Override // androidx.fragment.app.v, androidx.activity.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        ah.g gVar;
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (u(i10, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader == null || !applicationLoader.checkRequestPermissionResult(i10, strArr, iArr)) {
                if (this.q0.getFragmentStack().size() != 0) {
                    this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                }
                if (AndroidUtilities.isTablet()) {
                    if (this.s0.getFragmentStack().size() != 0) {
                        this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                    }
                    if (this.r0.getFragmentStack().size() != 0) {
                        this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i10, strArr, iArr);
                    }
                }
                jh1.p(i10, iArr);
                ei.vb vbVar = ei.vb.F2;
                int i11 = 3;
                int i12 = 2;
                int i13 = 0;
                if (vbVar != null) {
                    ci.b bVar = vbVar.a;
                    Activity activity = vbVar.b;
                    boolean z10 = iArr != null && iArr.length == 1 && iArr[0] == 0;
                    if (i10 == 111) {
                        vbVar.s2 = !z10;
                        if (z10 && vbVar.f0 == 0) {
                            vbVar.A0.setCameraThumb(null);
                            if (CameraController.getInstance().isCameraInitied()) {
                                vbVar.q();
                            } else {
                                CameraController.getInstance().initCamera(new ei.t9(vbVar, i13));
                            }
                        }
                    } else if (i10 == 114) {
                        if (z10) {
                            MediaController.loadGalleryPhotosAlbums(0);
                            vbVar.e(true);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionStorageWithHint));
                            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                            b2Var.T = replaceTags;
                            alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new ei.ca(vbVar, i12));
                            alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            b2Var.show();
                        }
                    } else if (i10 == 112) {
                        if (!z10) {
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder2.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraMicVideo));
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.a;
                            b2Var2.T = replaceTags2;
                            alertDialog$Builder2.k(LocaleController.getString(R.string.PermissionOpenSettings), new ei.ca(vbVar, i11));
                            alertDialog$Builder2.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            b2Var2.show();
                        }
                    } else if (i10 == 115) {
                        if (!z10) {
                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity, 0, bVar);
                            alertDialog$Builder3.m(R.raw.permission_request_folder, 72, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false), null);
                            SpannableStringBuilder replaceTags3 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoAudioStorageStory));
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.a;
                            b2Var3.T = replaceTags3;
                            alertDialog$Builder3.k(LocaleController.getString(R.string.PermissionOpenSettings), new ei.ca(vbVar, 5));
                            alertDialog$Builder3.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                            b2Var3.show();
                        }
                        if (z10 && (gVar = vbVar.y2) != null) {
                            gVar.run();
                        }
                        vbVar.y2 = null;
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i10), strArr, iArr);
                SparseIntArray sparseIntArray = this.b1;
                if (sparseIntArray.get(i10, -1) >= 0) {
                    int i14 = sparseIntArray.get(i10, -1);
                    sparseIntArray.delete(i10);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.permissionsGranted, Integer.valueOf(i14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i10), strArr, iArr);
            }
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onResume() {
        MessageObject playingMessageObject;
        qg.c1 c1Var;
        super.onResume();
        F1 = true;
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onResume");
        int i10 = 0;
        if (bVar.f) {
            bVar.a(false);
        }
        org.telegram.ui.Components.uu uuVar = G1;
        if (uuVar != null) {
            uuVar.run();
            G1 = null;
        }
        if (org.telegram.ui.ActionBar.h6.o == 3) {
            org.telegram.ui.ActionBar.h6.E(false);
        }
        I(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.q0.getView();
        this.s1 = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.O).sortDialogs(null);
        I0();
        Utilities.stageQueue.postRunnable(new org.telegram.ui.Components.rc(27));
        C(0);
        MediaController.checkGallery();
        h0();
        org.telegram.ui.Components.ne0 ne0Var = this.A0;
        if (ne0Var == null || ne0Var.b.getVisibility() != 0) {
            this.q0.M();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.s0;
                if (actionBarLayout != null) {
                    actionBarLayout.M();
                }
                ActionBarLayout actionBarLayout2 = this.r0;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.M();
                }
            }
        } else {
            this.q0.n();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.s0;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.n();
                }
                ActionBarLayout actionBarLayout4 = this.r0;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.n();
                }
            }
            this.A0.b.k();
            ArrayList arrayList = this.B0;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                ((org.telegram.ui.Components.le0) obj).k();
            }
        }
        ConnectionsManager.getInstance(this.O).setAppPaused(false, false);
        Q0();
        if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer t12 = PhotoViewer.t1();
            du0 du0Var = t12.e0;
            if (du0Var != null) {
                du0Var.invalidate();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(t12, i10, 24), 100L);
            }
            org.telegram.ui.Components.a81 a81Var = t12.F2;
            if (a81Var != null) {
                a81Var.K(a81Var.n() + 1);
                if (t12.Z2) {
                    t12.F2.N(true);
                }
            }
            it0 it0Var = t12.L1;
            if (it0Var != null && (c1Var = it0Var.W0.d) != null) {
                c1Var.postRunnable(c1Var.w);
            }
        }
        ei.vb vbVar = ei.vb.F2;
        if (vbVar != null) {
            vbVar.O();
        }
        if (PipRoundVideoView.F != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i12 = UserConfig.selectedAccount;
            L0(i12, UserConfig.getInstance(i12).unacceptedTermsOfService);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                M0(UserConfig.selectedAccount, tL_help_appUpdate, true);
            }
        }
        z(false);
        ApplicationLoader.canDrawOverlays = Settings.canDrawOverlays(this);
        jh1 jh1Var = jh1.n1;
        if (jh1Var != null) {
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                org.telegram.ui.Components.voip.k2.i();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null) {
                if (sharedInstance.getVideoState(false) == 1) {
                    sharedInstance.setVideoState(false, 2);
                }
                jh1Var.G();
            } else if (VoIPService.getSharedState() == null) {
                jh1Var.u0.b();
            }
            jh1Var.J0 = ((KeyguardManager) jh1Var.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (org.telegram.ui.Components.voip.k2.k() != null) {
                org.telegram.ui.Components.voip.k2.k().getClass();
                VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 1) {
                    sharedInstance2.setVideoState(false, 2);
                }
            }
        }
        b0();
        HashMap hashMap = wh.f.n;
        if (hashMap != null) {
            Iterator it = hashMap.values().iterator();
            while (it.hasNext()) {
                wh.e eVar = ((wh.f) it.next()).f;
                if (eVar != null) {
                    eVar.b = false;
                }
            }
        }
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        b0 b0Var = J1;
        if (b0Var != null) {
            b0Var.run();
            J1 = null;
        }
        if (MessagesController.getInstance(this.O).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.O).checkPromoInfo(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:2:0x0000, B:4:0x000a, B:6:0x000e, B:8:0x0018, B:10:0x00a5, B:14:0x00b3, B:15:0x011f, B:19:0x00bc, B:22:0x00c2, B:23:0x00cb, B:25:0x00cf, B:26:0x00d5, B:28:0x00d9, B:30:0x00e2, B:31:0x00e8, B:36:0x00f6, B:38:0x00ff, B:41:0x0105, B:43:0x010d, B:44:0x0116, B:46:0x011a, B:48:0x0034, B:50:0x0038, B:52:0x0042, B:53:0x005a, B:55:0x0066, B:57:0x007e, B:59:0x008a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.m, e0.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSaveInstanceState(Bundle bundle) {
        org.telegram.ui.ActionBar.n2 n2Var;
        try {
            super.onSaveInstanceState(bundle);
            boolean z10 = true;
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.r0;
                if (actionBarLayout == null || actionBarLayout.getFragmentStack().isEmpty()) {
                    ActionBarLayout actionBarLayout2 = this.s0;
                    if (actionBarLayout2 == null || actionBarLayout2.getFragmentStack().isEmpty()) {
                        if (!this.q0.getFragmentStack().isEmpty()) {
                            n2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                        }
                        n2Var = null;
                    } else {
                        n2Var = this.s0.getFragmentStack().get(this.s0.getFragmentStack().size() - 1);
                    }
                } else {
                    n2Var = this.r0.getFragmentStack().get(this.r0.getFragmentStack().size() - 1);
                }
                if (n2Var != null) {
                    Bundle arguments = n2Var.getArguments();
                    if ((n2Var instanceof sn) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "chat");
                    } else if ((n2Var instanceof u60) && arguments != null) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "group");
                    } else if (n2Var instanceof WallpapersListActivity) {
                        bundle.putString("fragment", "wallpapers");
                    } else if (n2Var instanceof ProfileActivity) {
                        ProfileActivity profileActivity = (ProfileActivity) n2Var;
                        if (profileActivity.h4()) {
                            bundle.putString("fragment", "settings");
                        } else {
                            if (profileActivity.g1 == 0) {
                                z10 = false;
                            }
                            if (z10 && arguments != null) {
                                bundle.putBundle("args", arguments);
                                bundle.putString("fragment", "chat_profile");
                            }
                        }
                    } else if ((n2Var instanceof od) && arguments != null && arguments.getInt("step") == 0) {
                        bundle.putBundle("args", arguments);
                        bundle.putString("fragment", "channel");
                    } else if (n2Var instanceof z71) {
                        bundle.putString("fragment", "settings2");
                    }
                    n2Var.saveSelfArgs(bundle);
                    return;
                }
                return;
            }
            if (!this.q0.getFragmentStack().isEmpty()) {
                n2Var = this.q0.getFragmentStack().get(this.q0.getFragmentStack().size() - 1);
                if (n2Var != null) {
                }
            }
            n2Var = null;
            if (n2Var != null) {
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.r1 = true;
        this.n0.h();
        WeakReference weakReference = pf.d.e;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (activity != null && activity != this) {
            pf.d.w(activity);
        }
        if (pf.d.b == null) {
            pf.d.e = new WeakReference(this);
            try {
                if (TextUtils.isEmpty(pf.d.d)) {
                    String a2 = w7.z8.a(this);
                    pf.d.d = a2;
                    if (a2 == null) {
                    }
                }
                pf.b bVar = new pf.b();
                a9.d dVar = new a9.d();
                dVar.b = new WeakReference(bVar);
                pf.d.c = dVar;
                String str = pf.d.d;
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(str)) {
                    intent.setPackage(str);
                }
                if (!bindService(intent, dVar, 33)) {
                    pf.d.c = null;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        ApplicationLoader.mainInterfaceStopped = false;
        org.telegram.ui.Components.i30.j(this);
        s50 s50Var = s50.D3;
        if (s50Var != null) {
            ArrayList arrayList = s50Var.Z1;
            s50.I3 = false;
            s50Var.P.l();
            f30 f30Var = s50Var.m2;
            if (f30Var.getVisibility() == 0) {
                s50Var.p2.G(f30Var, false);
            }
            if (s50.G3) {
                s50Var.o2.I(s50Var.n2, false);
            }
            arrayList.clear();
            arrayList.addAll(s50Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
            }
            w40 w40Var = s50Var.L;
            org.telegram.ui.Components.f91 f91Var = w40Var.v;
            if (f91Var != null) {
                f91Var.c(true);
            }
            w40Var.F = false;
            s50Var.H.s();
        }
    }

    @Override // androidx.fragment.app.v, android.app.Activity
    public final void onStop() {
        super.onStop();
        org.telegram.ui.Wallet.w0 w0Var = w7.h6.b;
        if (w0Var != null && w0Var.e == this && Build.VERSION.SDK_INT < 30) {
            org.telegram.ui.Wallet.w0 w0Var2 = w7.h6.b;
            if (!w0Var2.f) {
                w0Var2.c("AUTH_CANCELED");
                w7.h6.b.e();
            }
        }
        this.r1 = false;
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onStop");
        bVar.e = false;
        if (bVar.f) {
            bVar.c(true);
        }
        bVar.d.unregisterReceiver(bVar.o);
        pf.d.w(this);
        ApplicationLoader.mainInterfaceStopped = true;
        org.telegram.ui.Components.i30.j(this);
        s50 s50Var = s50.D3;
        if (s50Var != null) {
            s50.I3 = true;
            ArrayList arrayList = s50Var.Z1;
            arrayList.clear();
            arrayList.addAll(s50Var.Y1);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(false);
            }
            w40 w40Var = s50Var.L;
            org.telegram.ui.Components.f91 f91Var = w40Var.v;
            if (f91Var != null) {
                f91Var.c(false);
            }
            w40Var.F = true;
            s50Var.H.r();
        }
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        super.onUserInteraction();
        this.h1 = false;
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] onUserLeaveHint");
        bVar.f();
        ArrayList arrayList = this.a1;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Runnable) obj).run();
        }
        ActionBarLayout actionBarLayout = this.q0;
        if (actionBarLayout != null) {
            if (!actionBarLayout.O0.isEmpty()) {
                ((org.telegram.ui.ActionBar.n2) r.c.e(1, actionBarLayout.O0)).onUserLeaveHint();
            }
            org.telegram.ui.ActionBar.r rVar = actionBarLayout.G;
            if (rVar != null) {
                rVar.onUserLeaveHint();
            }
        }
    }

    public final void p0(long[] jArr, boolean z10) {
        boolean z11;
        ci.r7 a2;
        long[] jArr2 = jArr;
        int i10 = 0;
        while (true) {
            if (i10 >= jArr2.length) {
                z11 = true;
                break;
            }
            TLRPC.User user = MessagesController.getInstance(this.O).getUser(Long.valueOf(jArr2[i10]));
            if (user != null && !user.stories_hidden) {
                z11 = false;
                break;
            }
            i10++;
        }
        org.telegram.ui.ActionBar.n2 R = R();
        if (R == null) {
            return;
        }
        ci.i7 storiesController = MessagesController.getInstance(this.O).getStoriesController();
        ArrayList arrayList = new ArrayList(z11 ? storiesController.h : storiesController.g);
        boolean z12 = z11;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!z12) {
            ArrayList arrayList4 = new ArrayList();
            for (int i11 = 0; i11 < jArr2.length; i11++) {
                TLRPC.User user2 = MessagesController.getInstance(this.O).getUser(Long.valueOf(jArr2[i11]));
                if (user2 == null || !user2.stories_hidden) {
                    arrayList4.add(Long.valueOf(jArr2[i11]));
                }
            }
            Object[] array = arrayList4.toArray();
            int length = array.length;
            long[] jArr3 = new long[length];
            for (int i12 = 0; i12 < length; i12++) {
                Object obj = array[i12];
                obj.getClass();
                jArr3[i12] = ((Number) obj).longValue();
            }
            jArr2 = jArr3;
        }
        if (z10) {
            for (int i13 = 0; i13 < jArr2.length; i13 = com.google.android.gms.internal.cast.a6.h(jArr2[i13], arrayList3, i13, 1)) {
            }
        } else {
            for (int i14 = 0; i14 < jArr2.length; i14 = com.google.android.gms.internal.cast.a6.h(jArr2[i14], arrayList2, i14, 1)) {
            }
        }
        if (!arrayList3.isEmpty() && z10) {
            MessagesController messagesController = MessagesController.getInstance(this.O);
            int[] iArr = {arrayList3.size()};
            lq lqVar = new lq(this, iArr, jArr2, 17);
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                long longValue = ((Long) arrayList3.get(i15)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer inputPeer = messagesController.getInputPeer(longValue);
                tL_stories_getPeerStories.peer = inputPeer;
                if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else if (inputPeer == null) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getPeerStories, new ai.p9(messagesController, longValue, lqVar, 5));
                }
            }
            return;
        }
        long clientUserId = UserConfig.getInstance(this.O).getClientUserId();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i16)).peer);
            if (peerDialogId != clientUserId && !arrayList2.contains(Long.valueOf(peerDialogId)) && storiesController.J(peerDialogId)) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (R instanceof ey) {
            try {
                a2 = ci.r7.a(((ey) R).E0.h);
            } catch (Exception unused) {
            }
            ci.r7 r7Var = a2;
            R.getOrCreateStoryViewer().v();
            R.getOrCreateStoryViewer().G(this, null, arrayList2, 0, null, null, r7Var, false);
        }
        a2 = null;
        ci.r7 r7Var2 = a2;
        R.getOrCreateStoryViewer().v();
        R.getOrCreateStoryViewer().G(this, null, arrayList2, 0, null, null, r7Var2, false);
    }

    public final void q0(final int i10, final long j10, final boolean z10) {
        TL_stories.StoryItem storyItem;
        ci.a7 a7Var;
        ci.a7 A;
        MessageObject f7;
        MessageObject f10;
        TL_stories.StoryItem storyItem2;
        ci.i7 storiesController = MessagesController.getInstance(this.O).getStoriesController();
        TL_stories.PeerStories y3 = storiesController.y(j10);
        ci.r7 r7Var = null;
        if (y3 != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= y3.stories.size()) {
                    storyItem2 = null;
                    break;
                } else {
                    if (y3.stories.get(i11).id == i10) {
                        storyItem2 = y3.stories.get(i11);
                        break;
                    }
                    i11++;
                }
            }
            if (storyItem2 != null) {
                storyItem2.dialogId = j10;
                org.telegram.ui.ActionBar.n2 R = R();
                if (R == null) {
                    return;
                }
                if (R instanceof ey) {
                    try {
                        r7Var = ci.r7.a(((ey) R).E0.h);
                    } catch (Exception unused) {
                    }
                }
                R.getOrCreateStoryViewer().v();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem2.dialogId));
                if (z10) {
                    R.getOrCreateStoryViewer().w1 = true;
                }
                R.getOrCreateStoryViewer().G(this, storyItem2, arrayList, 0, null, y3, r7Var, false);
                return;
            }
            storyItem = storyItem2;
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            ci.a7 A2 = storiesController.A(j10, 0, -1, true);
            if (A2 == null || (f10 = A2.f(i10)) == null) {
                a7Var = null;
            } else {
                storyItem = f10.storyItem;
                a7Var = A2;
            }
            if (storyItem == null && (A = storiesController.A(j10, 1, -1, true)) != null && (f7 = A.f(i10)) != null) {
                storyItem = f7.storyItem;
                a7Var = A;
            }
            if (storyItem != null && a7Var != null) {
                storyItem.dialogId = j10;
                org.telegram.ui.ActionBar.n2 R2 = R();
                if (R2 == null) {
                    return;
                }
                if (R2 instanceof ey) {
                    try {
                        r7Var = ci.r7.a(((ey) R2).E0.h);
                    } catch (Exception unused2) {
                    }
                }
                ci.r7 r7Var2 = r7Var;
                R2.getOrCreateStoryViewer().v();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z10) {
                    R2.getOrCreateStoryViewer().w1 = true;
                }
                R2.getOrCreateStoryViewer().G(this, storyItem, arrayList2, 0, a7Var, null, r7Var2, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.O).getInputPeer(j10);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i10));
        ConnectionsManager.getInstance(this.O).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() { // from class: org.telegram.ui.u90
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.bg(LaunchActivity.this, tLObject, i10, j10, z10));
            }
        });
    }

    public final void r0(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10 = g6Var.f0;
        org.telegram.ui.ActionBar.f6 f7 = g6Var.f(tL_theme, this.O, 0);
        g6Var.Z = g6Var.Y;
        g6Var.u(f7.a);
        f7.s = tL_wallPaper;
        t0(new mc1(g6Var, i10 != g6Var.f0, 0, false, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(final int i10, int i11, final TLRPC.Chat chat, final int i12, TLRPC.TL_forumTopic tL_forumTopic, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i13, final ArrayList arrayList, final int i14) {
        final int i15;
        TLRPC.TL_forumTopic tL_forumTopic2;
        ArrayList arrayList2;
        if (tL_forumTopic == null) {
            i15 = i11;
            tL_forumTopic2 = MessagesController.getInstance(i10).getTopicsController().findTopic(chat.id, i15);
        } else {
            i15 = i11;
            tL_forumTopic2 = tL_forumTopic;
        }
        if (tL_forumTopic2 == null) {
            TL_forum.TL_messages_getForumTopicsByID tL_messages_getForumTopicsByID = new TL_forum.TL_messages_getForumTopicsByID();
            tL_messages_getForumTopicsByID.peer = MessagesController.getInstance(this.O).getInputPeer(-chat.id);
            tL_messages_getForumTopicsByID.topics.add(Integer.valueOf(i15));
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getForumTopicsByID, new RequestDelegate() { // from class: org.telegram.ui.j90
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    Pattern pattern = LaunchActivity.C1;
                    final LaunchActivity launchActivity = LaunchActivity.this;
                    final int i16 = i10;
                    final TLRPC.Chat chat2 = chat;
                    final int i17 = i15;
                    final int i18 = i12;
                    final Runnable runnable2 = runnable;
                    final String str2 = str;
                    final Integer num2 = num;
                    final byte[] bArr2 = bArr;
                    final int i19 = i13;
                    final ArrayList arrayList3 = arrayList;
                    final int i20 = i14;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.n90
                        @Override // java.lang.Runnable
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.C1;
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            launchActivity2.getClass();
                            if (tL_error == null) {
                                TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
                                a0.h hVar = new a0.h();
                                for (int i21 = 0; i21 < tL_messages_forumTopics.messages.size(); i21++) {
                                    hVar.k(tL_messages_forumTopics.messages.get(i21), tL_messages_forumTopics.messages.get(i21).id);
                                }
                                int i22 = i16;
                                MessagesController.getInstance(i22).putUsers(tL_messages_forumTopics.users, false);
                                MessagesController.getInstance(i22).putChats(tL_messages_forumTopics.chats, false);
                                TopicsController topicsController = MessagesController.getInstance(i22).getTopicsController();
                                TLRPC.Chat chat3 = chat2;
                                topicsController.processTopics(chat3.id, tL_messages_forumTopics.topics, hVar, false, 2, -1);
                                TopicsController topicsController2 = MessagesController.getInstance(i22).getTopicsController();
                                long j10 = chat3.id;
                                int i23 = i17;
                                launchActivity2.s0(i22, i23, chat3, i18, topicsController2.findTopic(j10, i23), runnable2, str2, num2, bArr2, i19, arrayList3, i20);
                            }
                        }
                    });
                }
            });
            return;
        }
        ArrayList arrayList3 = this.d0;
        org.telegram.ui.ActionBar.n2 n2Var = !arrayList3.isEmpty() ? (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList3) : null;
        if (n2Var instanceof sn) {
            sn snVar = (sn) n2Var;
            if (snVar.a() == (-chat.id) && snVar.h4 && snVar.d() == tL_forumTopic2.id) {
                if (str != null) {
                    snVar.qb(i12, i14, str);
                }
                snVar.Q7 = num;
                snVar.bb(i12, i13, true, 0, true, 0, null, null, null);
                if (runnable == null) {
                    runnable.run();
                    return;
                }
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", chat.id);
        if (i12 != tL_forumTopic2.id) {
            bundle.putInt("message_id", Math.max(1, i12));
        }
        if (num != null) {
            bundle.putInt("task_id", num.intValue());
        }
        sn snVar2 = new sn(bundle);
        if (arrayList.isEmpty()) {
            TLRPC.Message message = new TLRPC.Message();
            message.id = 1;
            message.action = new TLRPC.TL_messageActionChannelMigrateFrom();
            arrayList2 = arrayList;
            arrayList2.add(new MessageObject(i10, message, false, false));
        } else {
            arrayList2 = arrayList;
        }
        snVar2.tb(arrayList2, chat, i12, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
        if (i12 != tL_forumTopic2.id) {
            if (str != null) {
                snVar2.qb(i12, i14, str);
            } else {
                snVar2.Q7 = num;
                snVar2.L7 = i12;
            }
            snVar2.bb(i12, i13, true, 0, true, 0, null, null, null);
        }
        t0(snVar2);
        if (runnable == null) {
        }
    }

    @Override // android.app.Activity
    public final void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        rf.b bVar = this.n0;
        bVar.getClass();
        Log.i("PIP_DEBUG", "[Activity] setPictureInPictureParams");
        bVar.h = pictureInPictureParams;
    }

    public final void t0(org.telegram.ui.ActionBar.n2 n2Var) {
        ((ActionBarLayout) O()).P(n2Var);
    }

    public final boolean u0(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, boolean z11) {
        return ((ActionBarLayout) O()).S(n2Var, z10, z11);
    }

    public final void v0(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.E0;
            if (i10 >= arrayList.size()) {
                org.telegram.ui.ActionBar.n2 U = U();
                if (U != null && U.sheetsStack != null) {
                    for (int i11 = 0; i11 < U.sheetsStack.size(); i11++) {
                        if (U.sheetsStack.get(i11).isShown()) {
                            U.sheetsStack.get(i11);
                        }
                    }
                }
                ry w9 = this.q0.w();
                if (w9 != null && w9.sheetsStack != null) {
                    for (int i12 = 0; i12 < w9.sheetsStack.size(); i12++) {
                        if (w9.sheetsStack.get(i12).isShown()) {
                            w9.sheetsStack.get(i12);
                        }
                    }
                }
                o90 o90Var = new o90(this, 1);
                TLRPC.User user = MessagesController.getInstance(this.O).getUser(Long.valueOf(j10));
                if (user != null) {
                    o90Var.run(user);
                    return;
                } else {
                    MessagesStorage.getInstance(this.O).getStorageQueue().postRunnable(new a3.i0(this, j10, o90Var, 29));
                    return;
                }
            }
            if (arrayList.get(i10) instanceof gi.d3) {
                gi.d3 d3Var = (gi.d3) arrayList.get(i10);
                if (d3Var.isShowing() && d3Var.H == j10) {
                    return;
                }
            }
            i10++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x06ee A[LOOP:4: B:212:0x06e6->B:214:0x06ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0723 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04ca  */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v24, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v25 */
    @Override // org.telegram.ui.xx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(final ey eyVar, ArrayList arrayList, final CharSequence charSequence, final boolean z10, boolean z11, int i10, final int i11, te1 te1Var) {
        sn snVar;
        final sn snVar2;
        CharSequence charSequence2;
        boolean z12;
        boolean z13;
        MessageObject messageObject;
        sn snVar3;
        long j10;
        long j11;
        AccountInstance accountInstance;
        boolean z14;
        boolean z15;
        boolean z16;
        CharSequence charSequence3;
        CharSequence charSequence4;
        int size;
        ArrayList arrayList2;
        int i12;
        CharSequence charSequence5;
        LaunchActivity launchActivity;
        int i13;
        long j12;
        ArrayList arrayList3;
        LaunchActivity launchActivity2;
        CharSequence charSequence6;
        int i14;
        boolean z17;
        boolean z18;
        boolean z19;
        CharSequence charSequence7;
        boolean z20;
        ArrayList arrayList4;
        String str;
        LaunchActivity launchActivity3;
        ?? r10;
        final LaunchActivity launchActivity4 = this;
        final ArrayList arrayList5 = arrayList;
        final int currentAccount = eyVar != null ? eyVar.getCurrentAccount() : launchActivity4.O;
        final Uri uri = launchActivity4.X;
        boolean z21 = true;
        boolean z22 = false;
        if (uri != null) {
            final ArrayList arrayList6 = launchActivity4.W != null ? new ArrayList(launchActivity4.W) : null;
            final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(launchActivity4, 3, null);
            SendMessagesHelper.getInstance(currentAccount).prepareImportHistory(((MessagesStorage.TopicKey) arrayList5.get(0)).dialogId, launchActivity4.X, launchActivity4.W, new MessagesStorage.LongCallback() { // from class: org.telegram.ui.s90
                @Override // org.telegram.messenger.MessagesStorage.LongCallback
                public final void run(long j13) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                    LaunchActivity launchActivity5 = LaunchActivity.this;
                    if (j13 != 0) {
                        Pattern pattern = LaunchActivity.C1;
                        Bundle h = a1.g.h("scrollToTopOnResume", true);
                        if (!AndroidUtilities.isTablet()) {
                            NotificationCenter.getInstance(currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                        }
                        if (DialogObject.isUserDialog(j13)) {
                            h.putLong("user_id", j13);
                        } else {
                            h.putLong("chat_id", -j13);
                        }
                        sn snVar4 = new sn(h);
                        snVar4.r9 = true;
                        org.telegram.ui.ActionBar.d5 O = launchActivity5.O();
                        ey eyVar2 = eyVar;
                        ((ActionBarLayout) O).S(snVar4, eyVar2 != null || z10, eyVar2 == null);
                    } else {
                        ArrayList arrayList7 = arrayList6;
                        launchActivity5.W = arrayList7;
                        if (arrayList7 == null) {
                            launchActivity5.W = new ArrayList();
                        }
                        launchActivity5.W.add(0, uri);
                        launchActivity5.j0(true);
                    }
                    try {
                        b2Var2.dismiss();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            });
            try {
                b2Var.q(300L);
            } catch (Exception unused) {
            }
            launchActivity3 = launchActivity4;
            r10 = 0;
        } else {
            ey eyVar2 = eyVar;
            final boolean z23 = eyVar2 == null || eyVar2.J2 || z11;
            int i15 = i10 != 0 ? i10 : eyVar2 == null ? 0 : eyVar2.K2;
            boolean z24 = eyVar2 != null && eyVar2.M2;
            if (arrayList5.size() <= 1) {
                long j13 = ((MessagesStorage.TopicKey) arrayList5.get(0)).dialogId;
                Bundle h = a1.g.h("scrollToTopOnResume", true);
                if (!AndroidUtilities.isTablet()) {
                    NotificationCenter.getInstance(currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                }
                if (DialogObject.isEncryptedDialog(j13)) {
                    h.putInt("enc_id", DialogObject.getEncryptedChatId(j13));
                } else if (DialogObject.isUserDialog(j13)) {
                    h.putLong("user_id", j13);
                } else {
                    h.putLong("chat_id", -j13);
                }
                if (MessagesController.getInstance(currentAccount).checkCanOpenChat(h, eyVar2)) {
                    sn snVar4 = new sn(h);
                    og.d.a(snVar4, (MessagesStorage.TopicKey) arrayList5.get(0));
                    snVar = snVar4;
                }
                return false;
            }
            snVar = null;
            ArrayList arrayList7 = launchActivity4.a0;
            int size2 = arrayList7 != null ? arrayList7.size() : 0;
            if (launchActivity4.R != null) {
                size2++;
            }
            if (launchActivity4.S != null) {
                size2++;
            }
            ArrayList arrayList8 = launchActivity4.U;
            if (arrayList8 != null) {
                size2 += arrayList8.size();
            }
            ArrayList arrayList9 = launchActivity4.V;
            if (arrayList9 != null) {
                size2 += arrayList9.size();
            }
            ArrayList arrayList10 = launchActivity4.W;
            if (arrayList10 != null) {
                size2 += arrayList10.size();
            }
            if (launchActivity4.R == null && launchActivity4.S == null && launchActivity4.U == null && launchActivity4.V == null && launchActivity4.W == null && launchActivity4.T != null) {
                size2++;
            }
            for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                if (org.telegram.ui.Components.f5.g(launchActivity4, launchActivity4.O, ((MessagesStorage.TopicKey) arrayList5.get(i16)).dialogId, size2 > 1)) {
                    return false;
                }
            }
            if (te1Var != null) {
                te1Var.removeSelfFromStack();
            }
            ArrayList arrayList11 = launchActivity4.a0;
            if (arrayList11 != null && arrayList11.size() == 1) {
                ArrayList arrayList12 = launchActivity4.d0;
                if (!arrayList12.isEmpty()) {
                    org.telegram.ui.Components.if0 if0Var = new org.telegram.ui.Components.if0((org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList12), null, null, launchActivity4.b0, null, null, null, null, null);
                    snVar2 = snVar;
                    final int i17 = i15;
                    if0Var.K = new org.telegram.ui.Components.oj() { // from class: org.telegram.ui.t90
                        @Override // org.telegram.ui.Components.oj
                        public final void b(TLRPC.User user, boolean z25, int i18, long j14) {
                            MessageObject messageObject2;
                            TLRPC.TL_forumTopic findTopic;
                            Pattern pattern = LaunchActivity.C1;
                            sn snVar5 = snVar2;
                            if (snVar5 != null) {
                                ((ActionBarLayout) LaunchActivity.this.O()).S(snVar5, true, false);
                            }
                            AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                            int i19 = 0;
                            while (true) {
                                ArrayList arrayList13 = arrayList5;
                                if (i19 >= arrayList13.size()) {
                                    return;
                                }
                                long j15 = ((MessagesStorage.TopicKey) arrayList13.get(i19)).dialogId;
                                long j16 = ((MessagesStorage.TopicKey) arrayList13.get(i19)).topicId;
                                if (j16 == 0 || (findTopic = accountInstance2.getMessagesController().getTopicsController().findTopic(-j15, j16)) == null || findTopic.topicStartMessage == null) {
                                    messageObject2 = null;
                                } else {
                                    messageObject2 = new MessageObject(accountInstance2.getCurrentAccount(), findTopic.topicStartMessage, false, false);
                                    messageObject2.isTopicMainMessage = true;
                                }
                                MessageObject messageObject3 = messageObject2;
                                int i20 = i17;
                                int i21 = i18 != 0 ? i18 : i20;
                                int i22 = i11;
                                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, j15, messageObject3, messageObject3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z25, i21, i22);
                                int i23 = i20;
                                CharSequence charSequence8 = charSequence;
                                if (TextUtils.isEmpty(charSequence8)) {
                                    of2.effect_id = 0L;
                                }
                                of2.invert_media = false;
                                SendMessagesHelper.getInstance(currentAccount).sendMessage(of2);
                                if (!TextUtils.isEmpty(charSequence8)) {
                                    if (i18 != 0) {
                                        i23 = i18;
                                    }
                                    SendMessagesHelper.prepareSendingText(accountInstance2, charSequence8, j15, z23, i23, i22, 0L);
                                }
                                i19++;
                            }
                        }

                        @Override // org.telegram.ui.Components.oj
                        public final /* synthetic */ void c(ArrayList arrayList13, String str2, boolean z25, int i18, long j14, boolean z26) {
                        }
                    };
                    ((org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList12)).showDialog(if0Var);
                    launchActivity3 = launchActivity4;
                    sn snVar5 = snVar2;
                    if (eyVar != null && snVar5 == null && !z21) {
                        eyVar.finishFragment();
                    }
                    r10 = 0;
                }
            }
            snVar2 = snVar;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence2 = charSequence;
            } else {
                launchActivity4.T = charSequence;
                charSequence2 = null;
            }
            Object[] objArr = eyVar2 != null && eyVar2.Y3();
            if (objArr != false) {
                ArrayList arrayList13 = eyVar2.D2;
                ArrayList arrayList14 = new ArrayList();
                if (arrayList13 != null) {
                    int size3 = arrayList13.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj = arrayList13.get(i18);
                        i18++;
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                        boolean z25 = photoEntry.isVideo;
                        if (z25 || (str = photoEntry.imagePath) == null) {
                            String str2 = photoEntry.path;
                            if (str2 != null) {
                                sendingMediaInfo.path = str2;
                            }
                        } else {
                            sendingMediaInfo.path = str;
                        }
                        sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                        sendingMediaInfo.coverPath = photoEntry.coverPath;
                        sendingMediaInfo.isVideo = z25;
                        sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                        sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                        boolean z26 = z22;
                        sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                        sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                        CharSequence charSequence8 = photoEntry.caption;
                        sendingMediaInfo.caption = charSequence8 != null ? charSequence8.toString() : null;
                        sendingMediaInfo.entities = photoEntry.entities;
                        sendingMediaInfo.masks = photoEntry.stickers;
                        sendingMediaInfo.ttl = photoEntry.ttl;
                        sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                        sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                        sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                        arrayList14.add(sendingMediaInfo);
                        z22 = z26;
                    }
                }
                boolean z27 = z22;
                launchActivity4.U = arrayList14;
                if (!arrayList14.isEmpty()) {
                    CharSequence charSequence9 = launchActivity4.T;
                    if (charSequence9 == null) {
                        charSequence9 = "";
                    }
                    CharSequence[] charSequenceArr = new CharSequence[1];
                    charSequenceArr[z27 ? 1 : 0] = charSequence9;
                    ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(launchActivity4.O).getEntities(charSequenceArr, z27);
                    CharSequence charSequence10 = charSequenceArr[z27 ? 1 : 0];
                    String charSequence11 = charSequence10 == null ? null : charSequence10.toString();
                    for (int i19 = 0; i19 < launchActivity4.U.size(); i19++) {
                        SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) launchActivity4.U.get(i19);
                        if (i19 == 0) {
                            sendingMediaInfo2.caption = charSequence11;
                            sendingMediaInfo2.entities = entities;
                        } else {
                            sendingMediaInfo2.caption = null;
                            sendingMediaInfo2.entities = null;
                        }
                    }
                }
                launchActivity4.R = null;
                launchActivity4.T = null;
            }
            boolean z28 = false;
            CharSequence charSequence12 = null;
            int i20 = 0;
            while (i20 < arrayList5.size()) {
                long j14 = ((MessagesStorage.TopicKey) arrayList5.get(i20)).dialogId;
                long j15 = ((MessagesStorage.TopicKey) arrayList5.get(i20)).topicId;
                AccountInstance accountInstance2 = AccountInstance.getInstance(UserConfig.selectedAccount);
                if (j15 != 0) {
                    z13 = z28;
                    TLRPC.TL_forumTopic findTopic = accountInstance2.getMessagesController().getTopicsController().findTopic(-j14, j15);
                    if (findTopic == null || findTopic.topicStartMessage == null) {
                        z12 = z24;
                    } else {
                        z12 = z24;
                        MessageObject messageObject2 = new MessageObject(accountInstance2.getCurrentAccount(), findTopic.topicStartMessage, false, false);
                        messageObject2.isTopicMainMessage = true;
                        messageObject = messageObject2;
                        if (snVar2 == null) {
                            ((ActionBarLayout) launchActivity4.O()).S(snVar2, eyVar2 != null, eyVar2 == null || launchActivity4.R != null || ((arrayList4 = launchActivity4.U) != null && arrayList4.size() > 0));
                            boolean z29 = eyVar2 != null;
                            String str3 = launchActivity4.R;
                            if (str3 == null || j15 != 0 || objArr == true) {
                                ArrayList arrayList15 = launchActivity4.U;
                                if (arrayList15 == null || arrayList15.size() <= 0 || j15 != 0 || objArr == true) {
                                    z13 = z29;
                                    snVar3 = snVar2;
                                    j10 = j15;
                                    if (launchActivity4.R != null) {
                                        CharSequence charSequence13 = launchActivity4.T;
                                        if (charSequence13 != null && charSequence13.length() <= 1024) {
                                            charSequence12 = launchActivity4.T;
                                            launchActivity4.T = null;
                                        }
                                        CharSequence charSequence14 = charSequence12;
                                        ArrayList arrayList16 = new ArrayList();
                                        arrayList16.add(launchActivity4.R);
                                        int i21 = i15;
                                        j11 = j14;
                                        accountInstance = accountInstance2;
                                        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList16, (ArrayList<String>) arrayList16, (ArrayList<Uri>) null, charSequence14, (String) null, j11, messageObject, messageObject, (TL_stories.StoryItem) null, (in) null, (MessageObject) null, z23, i21, (t0.i) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                        z17 = z12;
                                        charSequence12 = charSequence14;
                                        i15 = i21;
                                    } else {
                                        j11 = j14;
                                        accountInstance = accountInstance2;
                                        ArrayList arrayList17 = launchActivity4.U;
                                        if (arrayList17 == null || arrayList17.size() <= 0) {
                                            z17 = z12;
                                        } else {
                                            CharSequence charSequence15 = launchActivity4.T;
                                            if (charSequence15 != null && charSequence15.length() <= 1024 && launchActivity4.U.size() == 1) {
                                                CharSequence[] charSequenceArr2 = {launchActivity4.T};
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity4.U.get(0)).entities = MediaDataController.getInstance(launchActivity4.O).getEntities(charSequenceArr2, false);
                                                ((SendMessagesHelper.SendingMediaInfo) launchActivity4.U.get(0)).caption = charSequenceArr2[0].toString();
                                                launchActivity4.T = null;
                                            }
                                            ArrayList arrayList18 = launchActivity4.U;
                                            MessageObject messageObject3 = messageObject;
                                            boolean z30 = z12;
                                            SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList18, j11, messageObject3, messageObject, null, null, z30, arrayList18.size() > 1, null, z23, i15, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                            j11 = j11;
                                            z17 = z30;
                                            messageObject = messageObject3;
                                        }
                                    }
                                    z18 = false;
                                    z19 = false;
                                } else {
                                    ArrayList arrayList19 = launchActivity4.U;
                                    CharSequence charSequence16 = (charSequence2 == null || charSequence2.length() == 0) ? launchActivity4.T : charSequence2;
                                    ArrayList K7 = sn.K7(arrayList19, snVar2.x(), charSequence16);
                                    if (K7.isEmpty()) {
                                        z13 = z29;
                                        charSequence7 = null;
                                        z20 = false;
                                        snVar3 = snVar2;
                                        j10 = j15;
                                    } else {
                                        if (snVar2.getParentActivity() != null) {
                                            boolean[] zArr = new boolean[K7.size()];
                                            Arrays.fill(zArr, true);
                                            z13 = z29;
                                            PhotoViewer.t1().K2(null, snVar2, snVar2.ea);
                                            PhotoViewer t12 = PhotoViewer.t1();
                                            ArrayList arrayList20 = new ArrayList(K7);
                                            int size4 = K7.size() - 1;
                                            ol olVar = new ol(snVar2, K7, zArr);
                                            sn snVar6 = snVar2;
                                            j10 = j15;
                                            t12.g2(arrayList20, size4, 0, false, olVar, snVar6);
                                            snVar3 = snVar6;
                                            charSequence7 = null;
                                        } else {
                                            z13 = z29;
                                            charSequence7 = null;
                                            snVar3 = snVar2;
                                            j10 = j15;
                                            snVar3.o8(charSequence16, null);
                                            snVar3.ib(K7, 0, false, false);
                                            snVar3.B6();
                                        }
                                        z20 = true;
                                    }
                                    if (z20) {
                                        launchActivity4.T = charSequence7;
                                    }
                                    z17 = z12;
                                    j11 = j14;
                                    accountInstance = accountInstance2;
                                    z19 = z20;
                                    z18 = false;
                                }
                            } else {
                                snVar2.ta(launchActivity4.T, str3);
                                launchActivity4.T = null;
                                z17 = z12;
                                z13 = z29;
                                j11 = j14;
                                z18 = true;
                                z19 = false;
                                snVar3 = snVar2;
                                accountInstance = accountInstance2;
                                j10 = j15;
                            }
                            z14 = z17;
                            z16 = z18;
                            z15 = z19;
                        } else {
                            snVar3 = snVar2;
                            j10 = j15;
                            boolean z31 = z12;
                            j11 = j14;
                            accountInstance = accountInstance2;
                            if (launchActivity4.R != null) {
                                CharSequence charSequence17 = launchActivity4.T;
                                if (charSequence17 != null && charSequence17.length() <= 1024) {
                                    charSequence12 = launchActivity4.T;
                                    launchActivity4.T = null;
                                }
                                CharSequence charSequence18 = charSequence12;
                                ArrayList arrayList21 = new ArrayList();
                                arrayList21.add(launchActivity4.R);
                                int i22 = i15;
                                SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList21, (ArrayList<String>) arrayList21, (ArrayList<Uri>) null, charSequence18, (String) null, j11, messageObject, messageObject, (TL_stories.StoryItem) null, (in) null, (MessageObject) null, z23, i22, (t0.i) null, (SendMessageChatArguments) null, 0L, false, 0L);
                                i15 = i22;
                                charSequence12 = charSequence18;
                            }
                            if (launchActivity4.U != null) {
                                CharSequence charSequence19 = launchActivity4.T;
                                if (charSequence19 != null && charSequence19.length() <= 1024 && launchActivity4.U.size() == 1) {
                                    CharSequence[] charSequenceArr3 = {launchActivity4.T};
                                    ((SendMessagesHelper.SendingMediaInfo) launchActivity4.U.get(0)).entities = MediaDataController.getInstance(launchActivity4.O).getEntities(charSequenceArr3, false);
                                    ((SendMessagesHelper.SendingMediaInfo) launchActivity4.U.get(0)).caption = charSequenceArr3[0].toString();
                                    launchActivity4.T = null;
                                }
                                ArrayList arrayList22 = launchActivity4.U;
                                MessageObject messageObject4 = messageObject;
                                SendMessagesHelper.prepareSendingMedia(accountInstance, arrayList22, j11, messageObject4, messageObject, null, null, z31, arrayList22.size() > 1, null, z23, i15, i11, 0, false, null, null, 0L, false, 0L, 0L, null);
                                j11 = j11;
                                z14 = z31;
                                messageObject = messageObject4;
                            } else {
                                z14 = z31;
                            }
                            z15 = false;
                            z16 = false;
                        }
                        boolean z32 = z13;
                        if (launchActivity4.V == null || launchActivity4.W != null) {
                            charSequence3 = launchActivity4.T;
                            if (charSequence3 != null && charSequence3.length() <= 1024) {
                                ArrayList arrayList23 = launchActivity4.V;
                                size = arrayList23 == null ? arrayList23.size() : 0;
                                arrayList2 = launchActivity4.W;
                                if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                                    charSequence12 = launchActivity4.T;
                                    launchActivity4.T = null;
                                }
                            }
                            CharSequence charSequence20 = charSequence12;
                            int i23 = i15;
                            SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) launchActivity4.V, (ArrayList<String>) launchActivity4.Z, (ArrayList<Uri>) launchActivity4.W, charSequence20, launchActivity4.Y, j11, messageObject, messageObject, (TL_stories.StoryItem) null, (in) null, (MessageObject) null, z23, i23, (t0.i) null, (SendMessageChatArguments) null, 0L, false, 0L);
                            i15 = i23;
                            charSequence4 = charSequence20;
                        } else {
                            charSequence4 = charSequence12;
                        }
                        AccountInstance accountInstance3 = accountInstance;
                        if (launchActivity4.S != null) {
                            File file = new File(launchActivity4.S);
                            if (file.exists()) {
                                TLRPC.TL_document tL_document = new TLRPC.TL_document();
                                tL_document.file_reference = new byte[0];
                                tL_document.dc_id = TLObject.FLAG_31;
                                tL_document.id = SharedConfig.getLastLocalId();
                                tL_document.user_id = accountInstance3.getUserConfig().getClientUserId();
                                tL_document.mime_type = "audio/ogg";
                                tL_document.date = accountInstance3.getConnectionsManager().getCurrentTime();
                                tL_document.size = (int) file.length();
                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                tL_documentAttributeAudio.voice = true;
                                byte[] waveform = MediaController.getWaveform(file.getAbsolutePath());
                                tL_documentAttributeAudio.waveform = waveform;
                                if (waveform != null) {
                                    tL_documentAttributeAudio.flags |= 4;
                                }
                                tL_document.attributes.add(tL_documentAttributeAudio);
                                i12 = 0;
                                CharSequence[] charSequenceArr4 = {launchActivity4.T};
                                ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(launchActivity4.O).getEntities(charSequenceArr4, false);
                                SendMessagesHelper sendMessagesHelper = accountInstance3.getSendMessagesHelper();
                                String absolutePath = file.getAbsolutePath();
                                CharSequence charSequence21 = charSequenceArr4[0];
                                long j16 = j11;
                                MessageObject messageObject5 = messageObject;
                                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tL_document, null, absolutePath, j16, messageObject5, messageObject, charSequence21 == null ? null : charSequence21.toString(), entities2, null, null, z23, i15, i11, 0, null, null, false);
                                j11 = j16;
                                messageObject = messageObject5;
                                sendMessagesHelper.sendMessage(of2);
                                if (launchActivity4.T != null) {
                                    launchActivity4.T = null;
                                }
                                long j17 = j10;
                                charSequence5 = launchActivity4.T;
                                if (charSequence5 != null) {
                                    launchActivity = launchActivity4;
                                    i13 = i12;
                                    j12 = j17;
                                    C0(accountInstance3, eyVar2, charSequence5, j11, messageObject, j12, z23, i15, i11);
                                } else {
                                    launchActivity = launchActivity4;
                                    i13 = i12;
                                    j12 = j17;
                                }
                                arrayList3 = launchActivity.a0;
                                if (arrayList3 != null && !arrayList3.isEmpty()) {
                                    i14 = i13;
                                    while (i14 < launchActivity.a0.size()) {
                                        TLRPC.User user = (TLRPC.User) launchActivity.a0.get(i14);
                                        SendMessagesHelper sendMessagesHelper2 = SendMessagesHelper.getInstance(currentAccount);
                                        long j18 = j11;
                                        MessageObject messageObject6 = messageObject;
                                        SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of(user, j18, messageObject6, messageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z23, i15, i11);
                                        j11 = j18;
                                        messageObject = messageObject6;
                                        sendMessagesHelper2.sendMessage(of3);
                                        i14++;
                                        launchActivity = this;
                                    }
                                }
                                if (!TextUtils.isEmpty(charSequence2) || z16 || z15) {
                                    launchActivity2 = this;
                                    charSequence6 = charSequence2;
                                } else {
                                    launchActivity2 = this;
                                    charSequence6 = charSequence2;
                                    C0(accountInstance3, eyVar, charSequence6, j11, messageObject, j12, z23, i15, i11);
                                }
                                i20++;
                                eyVar2 = eyVar;
                                arrayList5 = arrayList;
                                charSequence2 = charSequence6;
                                snVar2 = snVar3;
                                launchActivity4 = launchActivity2;
                                charSequence12 = charSequence4;
                                z24 = z14;
                                z28 = z32;
                            }
                        }
                        i12 = 0;
                        long j172 = j10;
                        charSequence5 = launchActivity4.T;
                        if (charSequence5 != null) {
                        }
                        arrayList3 = launchActivity.a0;
                        if (arrayList3 != null) {
                            i14 = i13;
                            while (i14 < launchActivity.a0.size()) {
                            }
                        }
                        if (TextUtils.isEmpty(charSequence2)) {
                        }
                        launchActivity2 = this;
                        charSequence6 = charSequence2;
                        i20++;
                        eyVar2 = eyVar;
                        arrayList5 = arrayList;
                        charSequence2 = charSequence6;
                        snVar2 = snVar3;
                        launchActivity4 = launchActivity2;
                        charSequence12 = charSequence4;
                        z24 = z14;
                        z28 = z32;
                    }
                } else {
                    z12 = z24;
                    z13 = z28;
                }
                messageObject = null;
                if (snVar2 == null) {
                }
                boolean z322 = z13;
                if (launchActivity4.V == null) {
                }
                charSequence3 = launchActivity4.T;
                if (charSequence3 != null) {
                    ArrayList arrayList232 = launchActivity4.V;
                    if (arrayList232 == null) {
                    }
                    arrayList2 = launchActivity4.W;
                    if (size + (arrayList2 == null ? arrayList2.size() : 0) == 1) {
                    }
                }
                CharSequence charSequence202 = charSequence12;
                int i232 = i15;
                SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) launchActivity4.V, (ArrayList<String>) launchActivity4.Z, (ArrayList<Uri>) launchActivity4.W, charSequence202, launchActivity4.Y, j11, messageObject, messageObject, (TL_stories.StoryItem) null, (in) null, (MessageObject) null, z23, i232, (t0.i) null, (SendMessageChatArguments) null, 0L, false, 0L);
                i15 = i232;
                charSequence4 = charSequence202;
                AccountInstance accountInstance32 = accountInstance;
                if (launchActivity4.S != null) {
                }
                i12 = 0;
                long j1722 = j10;
                charSequence5 = launchActivity4.T;
                if (charSequence5 != null) {
                }
                arrayList3 = launchActivity.a0;
                if (arrayList3 != null) {
                }
                if (TextUtils.isEmpty(charSequence2)) {
                }
                launchActivity2 = this;
                charSequence6 = charSequence2;
                i20++;
                eyVar2 = eyVar;
                arrayList5 = arrayList;
                charSequence2 = charSequence6;
                snVar2 = snVar3;
                launchActivity4 = launchActivity2;
                charSequence12 = charSequence4;
                z24 = z14;
                z28 = z322;
            }
            z21 = z28;
            launchActivity3 = launchActivity4;
            sn snVar52 = snVar2;
            if (eyVar != null) {
                eyVar.finishFragment();
            }
            r10 = 0;
        }
        launchActivity3.U = r10;
        launchActivity3.R = r10;
        launchActivity3.S = r10;
        launchActivity3.T = r10;
        launchActivity3.V = r10;
        launchActivity3.Z = r10;
        launchActivity3.a0 = r10;
        launchActivity3.b0 = r10;
        launchActivity3.X = r10;
        return true;
    }

    public final void w0(Long l4, b80 b80Var, pf.c cVar, org.telegram.ui.Cells.u1 u1Var) {
        ChannelBoostsController boostsController = MessagesController.getInstance(this.O).getBoostsController();
        if (cVar != null) {
            cVar.d();
        }
        boostsController.getBoostsStats(l4.longValue(), new n80(this, cVar, b80Var, boostsController, l4, u1Var));
    }

    public final void x0(final int i10, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z10, final Integer num, final Long l4, final Long l10, final Integer num2, final String str13, final HashMap hashMap, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z11, final String str22, final int i11, final int i12, final String str23, final String str24, final String str25, String str26, final String str27, final pf.c cVar, final boolean z12, final int i13, final int i14, final int i15, final boolean z13, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z14, final boolean z15, final boolean z16, final boolean z17, final boolean z18, final boolean z19, final boolean z20, final String str29, final boolean z21) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i10).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getBotApp, new RequestDelegate() { // from class: org.telegram.ui.a90
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.C1;
                final pf.c cVar2 = cVar;
                if (cVar2 != null) {
                    cVar2.b();
                }
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i16 = i10;
                final boolean z22 = z12;
                final boolean z23 = z16;
                final boolean z24 = z17;
                final boolean z25 = z18;
                if (tL_error == null) {
                    final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
                    final Runnable runnable2 = runnable;
                    final TLRPC.User user2 = user;
                    final String str30 = str27;
                    final boolean z26 = z15;
                    final boolean z27 = z14;
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.f90
                        @Override // java.lang.Runnable
                        public final void run() {
                            Pattern pattern2 = LaunchActivity.C1;
                            runnable2.run();
                            AtomicBoolean atomicBoolean = new AtomicBoolean();
                            LaunchActivity launchActivity2 = LaunchActivity.this;
                            ArrayList arrayList = launchActivity2.d0;
                            org.telegram.ui.ActionBar.n2 n2Var = (arrayList == null || arrayList.isEmpty()) ? null : (org.telegram.ui.ActionBar.n2) i0.a.h(1, arrayList);
                            int i17 = i16;
                            TLRPC.User user3 = user2;
                            TLRPC.TL_messages_botApp tL_messages_botApp2 = tL_messages_botApp;
                            String str31 = str30;
                            boolean z28 = z23;
                            boolean z29 = z24;
                            boolean z30 = z25;
                            boolean z31 = z22;
                            l90 l90Var = new l90(launchActivity2, n2Var, i17, user3, tL_messages_botApp2, atomicBoolean, str31, z28, z29, z30, z31);
                            if (z26) {
                                l90Var.run();
                                return;
                            }
                            if (tL_messages_botApp2.inactive && z27) {
                                v3 v3Var = new v3(l90Var, 8);
                                pf.c cVar3 = cVar2;
                                bi1.a(launchActivity2, v3Var, cVar3 != null ? new fz(cVar3, 15) : null);
                            } else if (tL_messages_botApp2.request_write_access || z31) {
                                org.telegram.ui.Components.f5.m(n2Var, atomicBoolean, user3, l90Var);
                            } else {
                                l90Var.run();
                            }
                        }
                    });
                    return;
                }
                final String str31 = str;
                final String str32 = str2;
                final String str33 = str3;
                final String str34 = str4;
                final String str35 = str5;
                final String str36 = str6;
                final String str37 = str7;
                final String str38 = str8;
                final String str39 = str9;
                final String str40 = str10;
                final String str41 = str11;
                final String str42 = str12;
                final boolean z28 = z10;
                final Integer num3 = num;
                final Long l11 = l4;
                final Long l12 = l10;
                final Integer num4 = num2;
                final String str43 = str13;
                final HashMap hashMap2 = hashMap;
                final String str44 = str14;
                final String str45 = str15;
                final String str46 = str16;
                final String str47 = str17;
                final TLRPC.TL_wallPaper tL_wallPaper2 = tL_wallPaper;
                final String str48 = str18;
                final String str49 = str19;
                final String str50 = str20;
                final String str51 = str21;
                final boolean z29 = z11;
                final String str52 = str22;
                final int i17 = i11;
                final int i18 = i12;
                final String str53 = str23;
                final String str54 = str24;
                final String str55 = str25;
                final int i19 = i13;
                final int i20 = i14;
                final int i21 = i15;
                final boolean z30 = z13;
                final String str56 = str28;
                final boolean z31 = z19;
                final boolean z32 = z20;
                final String str57 = str29;
                final boolean z33 = z21;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.e90
                    @Override // java.lang.Runnable
                    public final void run() {
                        Pattern pattern2 = LaunchActivity.C1;
                        LaunchActivity.this.B0(i16, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, z28, num3, l11, l12, num4, str43, hashMap2, str44, str45, str46, str47, tL_wallPaper2, str48, str49, str50, str51, z29, str52, i17, i18, str53, str54, str55, null, null, cVar2, z22, i19, false, i20, i21, null, null, z30, str56, z23, z24, z25, z31, z32, str57, null, z33, null);
                    }
                });
            }
        });
    }

    public final void y(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.z1 = null;
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i11 >= 26 ? getWindow().getNavigationBarColor() : 0, i10);
        this.z1 = ofArgb;
        ofArgb.addUpdateListener(new k80(this, 1));
        this.z1.addListener(new w0(this, i10, 3));
        this.z1.setInterpolator(org.telegram.ui.Components.bs.h);
        this.z1.setDuration(320L);
        this.z1.start();
    }

    public final void y0(boolean z10) {
        ActionBarLayout actionBarLayout = this.r0;
        if (actionBarLayout != null) {
            actionBarLayout.U(z10, z10);
        } else {
            this.q0.U(z10, z10);
        }
    }

    public final void z(boolean z10) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z10 || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    boolean z11 = this.o1;
                    this.o1 = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z10, new z70(this, z11, update, 2));
                    return;
                }
                if (z10 || Math.abs(System.currentTimeMillis() - SharedConfig.lastUpdateCheckTime) >= MessagesController.getInstance(0).updateCheckDelay * MediaDataController.MAX_STYLE_RUNS_COUNT) {
                    TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                    try {
                        tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                    } catch (Exception unused) {
                    }
                    if (tL_help_getAppUpdate.source == null) {
                        tL_help_getAppUpdate.source = "";
                    }
                    int i10 = this.O;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_help_getAppUpdate, new ai.m2(this, i10, 7));
                }
            }
        }
    }

    public final int z0(final int i10, final b80 b80Var, final Integer num, final Integer num2, final Long l4, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable, final String str, final int i11, final int i12) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l4.longValue();
        return ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() { // from class: org.telegram.ui.i80
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                Pattern pattern = LaunchActivity.C1;
                final LaunchActivity launchActivity = LaunchActivity.this;
                final int i13 = i10;
                final TLRPC.Chat chat2 = chat;
                final Long l10 = l4;
                final Integer num4 = num2;
                final Integer num5 = num;
                final Runnable runnable2 = runnable;
                final String str2 = str;
                final Integer num6 = num3;
                final byte[] bArr2 = bArr;
                final int i14 = i11;
                final int i15 = i12;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final Runnable runnable3 = b80Var;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.c90
                    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(5:3|(1:5)|6|7|(5:14|(3:16|(1:18)|19)(3:34|(1:(1:37)(1:(1:40)(1:41)))(1:(1:(1:44)(1:(1:46)(1:47))))|38)|20|(2:32|33)|(2:23|30)(1:31)))|48|49|(1:51)|20|(0)|(0)(0)|(1:(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:53:0x013f, code lost:
                    
                        r0 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x0140, code lost:
                    
                        org.telegram.messenger.FileLog.e(r0);
                     */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x014f A[Catch: Exception -> 0x014b, TRY_LEAVE, TryCatch #1 {Exception -> 0x014b, blocks: (B:33:0x0147, B:23:0x014f), top: B:32:0x0147 }] */
                    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:32:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        Runnable runnable4;
                        LaunchActivity launchActivity2 = LaunchActivity.this;
                        ArrayList arrayList = launchActivity2.d0;
                        TLObject tLObject2 = tLObject;
                        boolean z10 = tLObject2 instanceof TLRPC.TL_messages_discussionMessage;
                        Runnable runnable5 = runnable2;
                        if (z10) {
                            TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            int i16 = i13;
                            MessagesController.getInstance(i16).putUsers(tL_messages_discussionMessage.users, false);
                            MessagesController.getInstance(i16).putChats(tL_messages_discussionMessage.chats, false);
                            ArrayList arrayList2 = new ArrayList();
                            int size = tL_messages_discussionMessage.messages.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                arrayList2.add(new MessageObject(UserConfig.selectedAccount, tL_messages_discussionMessage.messages.get(i17), true, true));
                            }
                            boolean isEmpty = arrayList2.isEmpty();
                            TLRPC.Chat chat3 = chat2;
                            Long l11 = l10;
                            if (!isEmpty || (chat3.forum && l11 != null && l11.longValue() == 1)) {
                                boolean z11 = chat3.forum;
                                Integer num7 = num4;
                                Integer num8 = num5;
                                String str3 = str2;
                                Integer num9 = num6;
                                byte[] bArr3 = bArr2;
                                int i18 = i15;
                                if (z11) {
                                    int longValue = (int) l11.longValue();
                                    if (num7 == null) {
                                        num7 = num8;
                                    }
                                    launchActivity2.s0(i16, longValue, chat3, num7.intValue(), null, runnable5, str3, num9, bArr3, i14, arrayList2, i18);
                                } else {
                                    Bundle bundle = new Bundle();
                                    bundle.putLong("chat_id", -((MessageObject) arrayList2.get(0)).getDialogId());
                                    bundle.putInt("message_id", Math.max(1, num8.intValue()));
                                    sn snVar = new sn(bundle);
                                    snVar.tb(arrayList2, chat3, tL_messages_getDiscussionMessage2.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
                                    if (num7 != null) {
                                        if (bArr3 != null) {
                                            snVar.R7 = bArr3;
                                            snVar.L7 = num7.intValue();
                                        } else if (str3 != null) {
                                            snVar.qb(num7.intValue(), i18, str3);
                                        } else {
                                            snVar.Q7 = num9;
                                            snVar.L7 = num7.intValue();
                                        }
                                    } else if (l11 != null) {
                                        if (bArr3 != null) {
                                            snVar.R7 = bArr3;
                                            snVar.L7 = num8.intValue();
                                        } else if (str3 != null) {
                                            snVar.qb(num8.intValue(), i18, str3);
                                        } else {
                                            snVar.Q7 = num9;
                                            snVar.L7 = num8.intValue();
                                        }
                                    }
                                    launchActivity2.t0(snVar);
                                }
                                runnable4 = runnable3;
                                if (runnable4 != null) {
                                    try {
                                        runnable4.run();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                if (runnable5 == null) {
                                    runnable5.run();
                                    return;
                                }
                                return;
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.n2) arrayList.get(arrayList.size() - 1)).t(LocaleController.getString(R.string.ChannelPostDeleted), null).j();
                        }
                        runnable4 = runnable3;
                        if (runnable4 != null) {
                        }
                        if (runnable5 == null) {
                        }
                    }
                });
            }
        });
    }

    @Override // org.telegram.ui.ActionBar.a5
    public final /* synthetic */ void e(int[] iArr) {
    }
}
